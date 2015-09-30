package ch.hilbri.assist.mapping.importers.excel

import ch.hilbri.assist.mapping.importers.excel.data.ImportInterface
import java.io.File
import java.io.FileInputStream
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Calendar
import java.util.HashMap
import java.util.Map
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.ss.usermodel.Row
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ExcelInputTransformator {

	// Stores the restricted deployment entries which are read when all interfaces are read	
	private static Map<ImportInterface, String> interfaceDeploymentRestrictions

	private static Logger logger = LoggerFactory.getLogger(ExcelInputTransformator)

	def static createMDSLFileInput(String filePath) {
		return
			createHeader(filePath) 
			+ createCompartmentsRDCsAndConnectors(filePath) 
			+ createInterfacesAndGroups(filePath) 
			+ createRestrictions()
	}
	

	def static createHeader(String filePath) {
return '''
/* 
 * Automatically generated input file for ASSIST
 * 
 *         from file: «filePath»
 *                at: «new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime())»
 */
 
Global {
	Name = "Generated System";
}
 
	'''
	}


	def static createCompartmentsRDCsAndConnectors(String filePath) {
		return '''
 
/* **************************************** *
 * COMPARTMENTS, RDCs, CONNECTORS and PINS  *
 * **************************************** */

Compartments { 
	Compartment CompartmentName1 {
		Manufacturer = "";
		PowerSupply  = "";
		Side         = "";
		Zone         = "";
	
		RDC RDC1 {
			Manufacturer	= "ManufacturerName";
			PowerSupply1	= "PowerSupply1Name";
			PowerSupply2	= "PowerSupply2Name";
			Type			= "RDCTypeName";
			ESS				= "ESSName";
			Location		= "RDCLocatioName";
			ResourceX		= -120;
			ResourceY		= 150;
			ResourceZ		= -1200;
			
			Connector Connector1{
				// Available protection levels:
				// None, L1, L2, L3, L4, L5, L6, L7, L8

				Pin1: "PinType0"; // = protection level None
				Pin2: "PinType0" protection level L5;
				Pin3: "PinType1" protection level L8;
				
			}
			
			Connector Connector2{
				Pin1: "PinType3";
				Pin2: "PinType1" protection level L8;
				Pin3: "PinType1" protection level L8;
			}
		}
	}
}		
'''
	}
	
	def static createInterfacesAndGroups(String filePath) {

		// 	Where to store the information about all applications?
		val allInterfaces = new ArrayList<ImportInterface>

		// Store the information about valid deployment restrictions
		interfaceDeploymentRestrictions = new HashMap<ImportInterface, String>

		try {
			
			val excelFile = new FileInputStream(new File(filePath))
			val workbook = new HSSFWorkbook(excelFile)
			val sheet = workbook.getSheet("Wiring part V2")
			
			val rowIterator = sheet.iterator
			while (rowIterator.hasNext) {
				val row = rowIterator.next
				
				// We skip the header 
				if (row.rowNum >= 4)  {
					
					// How do we test if a line is empty?
					// -> "system" cannot be empty
					if (row.getCell(2, Row.CREATE_NULL_AS_BLANK).stringCellValue.length > 0) {
					
						val subAta				 = row.getCell(1).numericCellValue				// Spalte: B
						val system 				 = row.getCell(2).stringCellValue  				// Spalte: C
						val ioType				 = row.getCell(5).stringCellValue				// Spalte: F
						val emhZone1			 = row.getCell(6).stringCellValue				// Spalte: G
						val route				 = row.getCell(8).stringCellValue				// Spalte: I
						val pwSup1				 = row.getCell(9).stringCellValue				// Spalte: J
						val lineName			 = row.getCell(12).stringCellValue				// Spalte: M
						val wiringLane			 = row.getCell(13).stringCellValue				// Spalte: N
						val grpInfo				 = row.getCell(14).stringCellValue				// Spalte: O
						val resource			 = row.getCell(19).stringCellValue				// Spalte: T
						val resourceX			 = row.getCell(21).numericCellValue				// Spalte: V
						val resourceY			 = row.getCell(22).numericCellValue				// Spalte: W
						val resourceZ			 = row.getCell(23).numericCellValue				// Spalte: X
						val restrictDeploymentTo = row.getCell(3).stringCellValue				// Spalte: D	

						if (!lineName.nullOrEmpty) {
		
							var interfacename = clear(lineName) 
						
							if (!wiringLane.nullOrEmpty) 
								interfacename += "__" + clear(wiringLane)
					
							// We need to make the doubles we read into proper strings
							val subAtaStr = subAta.intValue.toString
							val resXStr = resourceX.intValue.toString
							val resYStr = resourceY.intValue.toString
							val resZStr = resourceZ.intValue.toString
					
							val iface = new ImportInterface(interfacename, system, subAtaStr, resource, lineName, wiringLane, grpInfo, route, pwSup1, ioType, emhZone1, resXStr, resYStr, resZStr)				
							allInterfaces.add(iface)
						
							if (!restrictDeploymentTo.isNullOrEmpty) 
								interfaceDeploymentRestrictions.put(iface, restrictDeploymentTo.trim)
							
						}
					
					}				
				}
			}
			
			excelFile.close
			
			logger.info('''Successfully imported «allInterfaces.length» interfaces from excel file '«filePath»' ''')
		
			return '''
 
/* **********************************
 * INTERFACES
 * ********************************** */

Interfaces {
	«FOR iface : allInterfaces.sortBy[name]»
	Interface «iface.name» {
		«IF !iface.system.isNullOrEmpty		»System     = "«iface.system.trim»";«	ENDIF»
		«IF !iface.subAta.isNullOrEmpty		»SubAta     = "«iface.subAta.trim»";«	ENDIF»
		«IF !iface.resource.isNullOrEmpty	»Resource   = "«iface.resource.trim»";«	ENDIF»
		«IF !iface.lineName.isNullOrEmpty	»LineName   = "«iface.lineName.trim»";«	ENDIF»
		«IF !iface.wiringLane.isNullOrEmpty	»WiringLane = "«iface.wiringLane.trim»";«ENDIF»
		«IF !iface.grpInfo.isNullOrEmpty	»GrpInfo    = "«iface.grpInfo.trim»";«	ENDIF»
		«IF !iface.route.isNullOrEmpty		»Route      = "«iface.route.trim»";«	ENDIF»
		«IF !iface.pwSup1.isNullOrEmpty		»PwSup1     = "«iface.pwSup1.trim»";«	ENDIF»
		«IF !iface.emhZone1.isNullOrEmpty	»EmhZone1   = "«iface.emhZone1.trim»";«	ENDIF»
		«IF !iface.ioType.isNullOrEmpty		»Type       = "«iface.ioType.trim»";«	ENDIF»
		«IF !iface.resourceX.isNullOrEmpty	»ResourceX  =  «iface.resourceX.trim»;«	ENDIF»
		«IF !iface.resourceY.isNullOrEmpty	»ResourceY  =  «iface.resourceY.trim»;«	ENDIF»
		«IF !iface.resourceZ.isNullOrEmpty	»ResourceZ  =  «iface.resourceZ.trim»;« ENDIF»
	}
	
	«ENDFOR»
}

 
/* **********************************
 * INTERFACE GROUPS
 * ********************************** */
 
InterfaceGroups {

	
	«IF !allInterfaces.map[system].toSet.toList.isNullOrEmpty»
	/* 
	 * Groups for SYSTEM and WIRING_LANE 
	 */
	«ENDIF»
	«FOR system : allInterfaces.map[system].toSet.toList.sort»
	
	// System: «system»
	«FOR wiringLane : allInterfaces.filter[it.system == system].map[wiringLane].filter[!empty].toSet.toList.sort»
	Group «(clear(system) + "__" + clear(wiringLane))» { interfaces with System = "«system»" and WiringLane = "«wiringLane»" };
	«ENDFOR»
	
	«ENDFOR»
 
	«IF !allInterfaces.map[grpInfo].toSet.toList.isNullOrEmpty»
	/* 
	 * Groups for GRPINFO and WIRING_LANE 
	 */
	«ENDIF»
	«FOR grpInfo : allInterfaces.map[grpInfo].toSet.toList.filter[!isNullOrEmpty].sort»
	«FOR wiringLane : allInterfaces.filter[it.grpInfo == grpInfo].map[wiringLane].filter[!empty].toSet.toList.sort»
	Group «(clear(grpInfo) + "__" + clear(wiringLane))» { interfaces with GrpInfo = "«grpInfo»" and WiringLane = "«wiringLane»" };
	«ENDFOR»
	«ENDFOR»
}
''';	

		} /* try block */
		 
		catch (Exception e) {
		
			logger.info('''Importer encountered an error: «e.class.simpleName»«IF !e.message.nullOrEmpty»: >>«e.message»<<«ENDIF»''')
		}
		return "";
		
	}
	
	def static createRestrictions() {
return '''
 
/* *************************************************
 * RESTRICTIONS (DISLOCALITIES, COLOCALITIES, ...) 
 * ************************************************* */
  
Restrictions {
	
	// Generated restrictions for valid deployments ("restrict deployment to")
	«FOR iface : interfaceDeploymentRestrictions.keySet»
	Valid for «iface.name» is { pins with RDC.Name = "«
		IF !interfaceDeploymentRestrictions.get(iface).contains("__")»«interfaceDeploymentRestrictions.get(iface)»"«
		ELSE»«IF interfaceDeploymentRestrictions.get(iface).split("__").length == 2
			»«interfaceDeploymentRestrictions.get(iface).split("__").get(0)»" and Connector.Name = "«interfaceDeploymentRestrictions.get(iface).split("__").get(1)»"«
			ENDIF
			»«IF interfaceDeploymentRestrictions.get(iface).split("__").length == 3
			»«interfaceDeploymentRestrictions.get(iface).split("__").get(0)»" and Connector.Name = "«interfaceDeploymentRestrictions.get(iface).split("__").get(1)»" and Pin.Name = "«interfaceDeploymentRestrictions.get(iface).split("__").get(2)»"«
			ENDIF
		»«ENDIF» };
	«ENDFOR»
	
}
'''}


	def static clear(String excelRawData) {
		return excelRawData.replaceAll("[[^a-z]&&[^A-Z]&&[^0-9]]", "_")   // replace everything which is not a-zA-Z0-9 with _
						   .replaceAll("^_*", "")						  // remove all _ at the beginning
						   .replaceAll("_*$", "")						  // remove all _ at the end
						   .replaceAll("^[0-9]*", "")                     // remove all leading numbers 
						   .replaceAll("__+", "_")						  // replace multiple _ with a single _
	}
}