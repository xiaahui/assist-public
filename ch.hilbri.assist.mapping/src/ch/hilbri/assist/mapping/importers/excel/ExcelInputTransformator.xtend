package ch.hilbri.assist.mapping.importers.excel

import ch.hilbri.assist.mapping.importers.excel.data.ImportInterface
import java.io.File
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Calendar
import jxl.Sheet
import jxl.Workbook
import jxl.read.biff.BiffException

class ExcelInputTransformator {

	def static clear(String excelRawData) {
		return excelRawData.replaceAll("[[^a-z]&&[^A-Z]&&[^0-9]]", "_")   // replace everything which is not a-zA-Z0-9 with _
						   .replaceAll("^_*", "")						  // remove all _ at the beginning
						   .replaceAll("_*$", "")						  // remove all _ at the end
						   .replaceAll("^[0-9]*", "")                     // remove all leading numbers 
						   .replaceAll("__+", "_")						  // replace multiple _ with a single _
	}

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
 *         from file: �filePath�
 *                at: �new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime())�
 */
 
Global {
	Name = "Generated System";
}
 
	'''
	}


	def static createCompartmentsRDCsAndConnectors(String filePath) {
//		var File inputWorkbook = new File(filePath)
//		var Workbook workbook
//		
//		// Where do we store all the boards we found?
//		val allBoards = new ArrayList<Board>
//		
//		try {
//			workbook = Workbook.getWorkbook(inputWorkbook);
//
//			// Get the first sheet
//			var Sheet sheet = workbook.getSheet("Hardware")
//
//			// Dies ist der Zwischenspeicher fuer das "aktuelle" Board
//			var String excelResName
//			
//			// Retrieve the data from all applications
//			for (row : 1 ..< sheet.rows) {
//
//				var isNewBoard = false
//
//				// **** EINLESEN ALLER ORIGINAL DATEN AUS EXCEL *****
//				
//				// Ueberschreibe den alten Wert von resName nur, wenn ein neuer Wert in der Zelle steht (neues Board!)
//				if (sheet.getCell(0, row).contents.length > 0) {
//					excelResName = clear(sheet.getCell(0, row).contents) 	// Spalte: A
//					isNewBoard = true;
//				}
//				
//				val excelType 		= clear(sheet.getCell(1, row).contents) 	// Spalte: B
//				val excelResPosX 	= clear(sheet.getCell(2, row).contents) 	// Spalte: C
//				val excelResPosY 	= clear(sheet.getCell(3, row).contents) 	// Spalte: D
//				val excelResWeight 	= clear(sheet.getCell(4, row).contents) 	// Spalte: E
//				val excelPowerSupply= clear(sheet.getCell(5, row).contents) 	// Spalte: F
//				val excelSide		= clear(sheet.getCell(6, row).contents) 	// Spalte: G
//				val excelEss		= clear(sheet.getCell(7, row).contents) 	// Spalte: H
//				
//				val excelResProtLvl	= clear(sheet.getCell(8, row).contents) 	// Spalte: I
//				val excelCustomType	= new HashMap<String, String>
//				
//				for (i : 1..39) {
//					val excelCustomEntry = sheet.getCell(8+i, row).contents
//					if (excelCustomEntry.length > 0) 					// Die Zelle darf nicht leer sein ...
//						if (Integer.parseInt(excelCustomEntry) > 0) 	// Die Anzahl muss groesser als Null sein ...
//							excelCustomType.put("CustomType"+i, excelCustomEntry)
//				}
//				
//				// ***** BOARDS ANLEGEN BZW. FUELLEN **********
//				var Board currentBoard
//				
//				// wir haben ein neues Board gefunden ...
//				if (isNewBoard) {
//					
//					// Erstelle ein neues Board
//					currentBoard = new Board(excelResName, excelType, excelPowerSupply, excelSide, excelEss)
//					if (excelResPosX.length > 0) 	currentBoard.genericParameters.put("RES_POSITION_X", excelResPosX)
//					if (excelResPosY.length > 0) 	currentBoard.genericParameters.put("RES_POSITION_Y", excelResPosY)
//					if (excelResWeight.length > 0) 	currentBoard.genericParameters.put("RES_WEIGHT", excelResWeight)
//					
//					// Fuege das Board zur Liste hinzu
//					allBoards.add(currentBoard)
//				}
//				
//				// wir haben eine Ergaenzung zu einem bestehenden Board gefunden
//				else  {
//					
//					// finde das richtige Board
//					for (otherBoard : allBoards)
//						if (otherBoard.name.equals(excelResName))
//							currentBoard = otherBoard	
//				}
//				
//				// IO Adapter ergaenzen
//				for (adapterType : excelCustomType.keySet.sort)
//					currentBoard.ioAdapters.add(new IOAdapter(adapterType, excelResProtLvl, excelCustomType.get(adapterType)))
//			}
//		} catch (BiffException e) {	e.printStackTrace(); }
//
//		
//
//		return '''
//Hardware {
//	�FOR board : allBoards.sortBy[name]�
//	Board �board.name� {
//		�IF board.type.length > 0        �Type = "�         board.type�";�        ENDIF�
//		�IF board.powersupply.length > 0 �PowerSupply = "�  board.powersupply�";� ENDIF�
//		�IF board.side.length > 0        �Side = "�         board.side�";�        ENDIF�
//		�IF board.ess.length > 0         �ESS = "�          board.ess�";�         ENDIF�
//		Processor Processor0 { Core Core0 {}}
//		�FOR adapt : board.ioAdapters.sort�
//		I/O adapter { type = �adapt.type�;	count = �adapt.units�;	protection-level = �adapt.ioProtectionLevel�; }
//		�ENDFOR�
//		�IF !board.genericParameters.keySet.empty�
//		Generic properties { 
//			�FOR p : board.genericParameters.keySet�
//			"�p�" = �board.genericParameters.get(p)�;
//			�ENDFOR�
//		}
//		�ENDIF�
//	}
//	
//	�ENDFOR�
//}
// 
//'''
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
		ResourceX    = "";
		ResourceY    = "";
		ResourceZ    = "";
		
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

		try {
			workbook = Workbook.getWorkbook(inputWorkbook);

			// Get the first sheet
			var Sheet sheet = workbook.getSheet("Wiring part V2")

			// Retrieve the data from all applications
			for (row : 4 ..< sheet.rows) {

				// Retrieve raw data from excel and clean it
				val subAta				= sheet.getCell(1, row).contents		// Spalte: B
				val system 				= sheet.getCell(2, row).contents  		// Spalte: C
				val ioType				= sheet.getCell(5, row).contents		// Spalte: F
				val emhZone1			= sheet.getCell(6, row).contents		// Spalte: G
				val route				= sheet.getCell(8, row).contents		// Spalte: I
				val pwSup1				= sheet.getCell(9, row).contents		// Spalte: J
				val lineName			= sheet.getCell(12, row).contents		// Spalte: M
				val wiringLane			= sheet.getCell(13, row).contents		// Spalte: N
				val grpInfo				= sheet.getCell(14, row).contents		// Spalte: O
				val resource			= sheet.getCell(19, row).contents		// Spalte: T
				val resourceX			= sheet.getCell(21, row).contents		// Spalte: V
				val resourceY			= sheet.getCell(22, row).contents		// Spalte: W
				val resourceZ			= sheet.getCell(23, row).contents		// Spalte: X

//				val restricDeploymentTo = sheet.getCell(3, row).contents		// Spalte: D


				if (!lineName.nullOrEmpty && !wiringLane.nullOrEmpty) {
	
					val interfacename = clear(lineName) + "__" + clear(wiringLane)
				
					val iface = new ImportInterface(interfacename, system, subAta, resource, lineName, wiringLane, grpInfo, route, pwSup1, ioType, emhZone1, resourceX, resourceY, resourceZ)				

//					 ****** GRUPPEN ****************
//					 Create the Group-entry for SubSystem Groups
//					 Did we already encounter this group? If not, create a new list ...
//					if (!allApplicationGroups.containsKey(subSystemName))
//						allApplicationGroups.put(subSystemName, new ArrayList<Application>)
//
//					 	Add this application to the group only if it is not already in there
//					if (!allApplicationGroups.get(subSystemName).contains(application))			
//						allApplicationGroups.get(subSystemName).add(application)
			
					allInterfaces.add(iface)
				}				
			}

		} catch (BiffException e) {
			e.printStackTrace();
		}
		
//		val allGrpInfoEntries 		= allInterfaces.map[grpInfo].toSet.toList
//		val allWiringLaneEntries	= allInterfaces.map[wiringLane].toSet.toList
//		val allSystemEntries 		= allInterfaces.map[system].toSet.toList
//		val allResourceEntries		= allInterfaces.map[resource].toSet.toList
		
		return '''
 
/* **********************************
 * INTERFACES
 * ********************************** */

Interfaces {
	�FOR iface : allInterfaces.sortBy[name]�
	Interface �iface.name� {
		�IF !iface.system.isNullOrEmpty		�System     = "�iface.system�";�	ENDIF�
		�IF !iface.subAta.isNullOrEmpty		�SubAta     = "�iface.subAta�";�	ENDIF�
		�IF !iface.resource.isNullOrEmpty	�Resource   = "�iface.resource�";�	ENDIF�
		�IF !iface.lineName.isNullOrEmpty	�LineName   = "�iface.lineName�";�	ENDIF�
		�IF !iface.wiringLane.isNullOrEmpty	�WiringLane = "�iface.wiringLane�";�ENDIF�
		�IF !iface.grpInfo.isNullOrEmpty	�GrpInfo    = "�iface.grpInfo�";�	ENDIF�
		�IF !iface.route.isNullOrEmpty		�Route      = "�iface.route�";�		ENDIF�
		�IF !iface.pwSup1.isNullOrEmpty		�PwSup1     = "�iface.pwSup1�";�	ENDIF�
		�IF !iface.emhZone1.isNullOrEmpty	�EmhZone1   = "�iface.emhZone1�";�	ENDIF�
		�IF !iface.ioType.isNullOrEmpty		�Type       = "�iface.ioType�";�	ENDIF�
	}
	
	�ENDFOR�
}

 
/* **********************************
 * INTERFACE GROUPS
 * ********************************** */
 
InterfaceGroups {

	// put groups here

}
''';	
//	�IF !allGrpInfoEntries.isNullOrEmpty && !allWiringLaneEntries.isNullOrEmpty�// GrpInfo and Wiring Lane Groups�ENDIF�
//	�FOR grpInfo : allGrpInfoEntries�
//	�FOR wiringLane : allWiringLaneEntries�
//	Group �grpInfo + "_" + wiringLane�	{ interfaces with GrpInfo = "�grpInfo�" and WiringLane = "�wiringLane�" };
//	�ENDFOR�
//	�ENDFOR�
//	
//	�IF !allSystemEntries.isNullOrEmpty && !allWiringLaneEntries.isNullOrEmpty && !allResourceEntries.isNullOrEmpty�// System and Wiring Lane and Resource Groups�ENDIF�
//	�FOR system : allSystemEntries�
//	�FOR wiringLane : allWiringLaneEntries�
//	�FOR resource : allResourceEntries�
//	Group �system + "_" + wiringLane + "_" + resource� { interfaces with System = "�system�" and WiringLane = "�wiringLane�" and Resource = "�resource�" };
//	�ENDFOR�
//	�ENDFOR�
//	�ENDFOR�
	
	}
	
	def static createRestrictions() {
return '''
 
/* *************************************************
 * RESTRICTIONS (DISLOCALITIES, COLOCALITIES, ...) 
 * ************************************************* */
  
Restrictions {
	
	// put restrictions here
	
}
'''}

}