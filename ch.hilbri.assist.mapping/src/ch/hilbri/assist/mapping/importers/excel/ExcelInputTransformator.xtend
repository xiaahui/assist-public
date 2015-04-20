package ch.hilbri.assist.mapping.importers.excel

import ch.hilbri.assist.mapping.importers.excel.data.ImportInterface
import java.io.File
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Calendar
import java.util.HashMap
import java.util.Map
import jxl.Sheet
import jxl.Workbook
import jxl.WorkbookSettings
import jxl.read.biff.BiffException
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
 
/* **********************************
 * COMPARTMENTS, RDCs, CONNECTORS
 * ********************************** */
 
Compartment CompartmentName1 {
	Manufacturer = "";
	PowerSupply  = "";
	Side         = "";
	Zone         = "";
	
	RDC RDCName1 {
		Manufacturer = "";
		PowerSupply  = "";
		Type         = "";
		ESS          = "";
		ResourceX    = 0;
		ResourceY    = 0;
		ResourceZ    = 0;
		
		Connector ConnectorName1 {
			"ExampleIOType" 	= 10;
			"ExampleIOType2"	= 5;
		}
	}
}		
'''
	}
	
	def static createInterfacesAndGroups(String filePath) {
		var File inputWorkbook = new File(filePath)
		var Workbook workbook
		
		// Where to store the information about all applications?
		val allInterfaces = new ArrayList<ImportInterface>

		// Store the information about valid deployment restrictions
		interfaceDeploymentRestrictions = new HashMap<ImportInterface, String>

		try {
			val workbookSettings = new WorkbookSettings()
			workbookSettings.suppressWarnings = true
			
			workbook = Workbook.getWorkbook(inputWorkbook, workbookSettings);

			// Get the first sheet
			var Sheet sheet = workbook.getSheet("Wiring part V2")

			// Retrieve the data from all applications
			for (row : 4 ..< sheet.rows) {

				// Retrieve raw data from excel and clean it
				val subAta				 = sheet.getCell(1, row).contents		// Spalte: B
				val system 				 = sheet.getCell(2, row).contents  		// Spalte: C
				val ioType				 = sheet.getCell(5, row).contents		// Spalte: F
				val emhZone1			 = sheet.getCell(6, row).contents		// Spalte: G
				val route				 = sheet.getCell(8, row).contents		// Spalte: I
				val pwSup1				 = sheet.getCell(9, row).contents		// Spalte: J
				val lineName			 = sheet.getCell(12, row).contents		// Spalte: M
				val wiringLane			 = sheet.getCell(13, row).contents		// Spalte: N
				val grpInfo				 = sheet.getCell(14, row).contents		// Spalte: O
				val resource			 = sheet.getCell(19, row).contents		// Spalte: T
				val resourceX			 = sheet.getCell(21, row).contents		// Spalte: V
				val resourceY			 = sheet.getCell(22, row).contents		// Spalte: W
				val resourceZ			 = sheet.getCell(23, row).contents		// Spalte: X
				val restrictDeploymentTo = sheet.getCell(3, row).contents		// Spalte: D


				if (!lineName.nullOrEmpty && !wiringLane.nullOrEmpty) {
	
					val interfacename = clear(lineName) + "__" + clear(wiringLane)
				
					val iface = new ImportInterface(interfacename, system, subAta, resource, lineName, wiringLane, grpInfo, route, pwSup1, ioType, emhZone1, resourceX, resourceY, resourceZ)				
					allInterfaces.add(iface)
					
					if (!restrictDeploymentTo.isNullOrEmpty) {
						interfaceDeploymentRestrictions.put(iface, restrictDeploymentTo.trim)
					}
				}				
			}

		} catch (BiffException e) {
			e.printStackTrace();
		}
		
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
		«IF !iface.resourceZ.isNullOrEmpty	»ResourceZ  =  «iface.resourceZ.trim»;«	ENDIF»
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
	«FOR wiringLane : allInterfaces.filter[it.system == system].map[wiringLane].toSet.toList.sort»
	Group «(clear(system) + "__" + clear(wiringLane))» { interfaces with System = "«system»" and WiringLane = "«wiringLane»" };
	«ENDFOR»
	
	«ENDFOR»
 
	«IF !allInterfaces.map[grpInfo].toSet.toList.isNullOrEmpty»
	/* 
	 * Groups for GRPINFO and WIRING_LANE 
	 */
	«ENDIF»
	«FOR grpInfo : allInterfaces.map[grpInfo].toSet.toList.filter[!isNullOrEmpty].sort»
	«FOR wiringLane : allInterfaces.filter[it.grpInfo == grpInfo].map[wiringLane].toSet.toList.sort»
	Group «(clear(grpInfo) + "__" + clear(wiringLane))» { interfaces with GrpInfo = "«grpInfo»" and WiringLane = "«wiringLane»" };
	«ENDFOR»
	«ENDFOR»
}
''';	
	}
	
	def static createRestrictions() {
return '''
 
/* *************************************************
 * RESTRICTIONS (DISLOCALITIES, COLOCALITIES, ...) 
 * ************************************************* */
  
Restrictions {
	
	// Generated restrictions for valid deployments ("restrict deployment to")
	«FOR iface : interfaceDeploymentRestrictions.keySet»
	Valid for «iface.name» is { connectors with RDC.Name = "«interfaceDeploymentRestrictions.get(iface)»" };
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