package ch.hilbri.assist.mapping.importers.excel

import ch.hilbri.assist.mapping.importers.excel.data.Application
import ch.hilbri.assist.mapping.importers.excel.data.Board
import ch.hilbri.assist.mapping.importers.excel.data.IOAdapter
import java.io.File
import java.util.ArrayList
import java.util.HashMap
import jxl.Sheet
import jxl.Workbook
import jxl.read.biff.BiffException

class ExcelInputTransformator {

	def static clear(String excelRawData) {
		return excelRawData.replace(" ", "_").replace("-", "").replace(".", "").replace(",", "").replace("/", "").
			replace("#", "_").replace("(", "_").replace(")", "_").replace("&", "_").replace("--", "-")
	}

	def static createMDSLFileInput(String filePath) {
		return
			createHeader(filePath) +
			createBoardsAndIOAdapters(filePath) +
			createApplicationsAndGroups(filePath) 
	}

	def static createHeader(String filePath) {
return '''
/* 
 * Generated from Excel file «filePath»
 */
 
Global {
	System name = "Generated System";
}
 
	'''
	}


	def static createBoardsAndIOAdapters(String filePath) {
		var File inputWorkbook = new File(filePath)
		var Workbook workbook
		
		// Where do we store all the boards we found?
		val allBoards = new ArrayList<Board>
		
		try {
			workbook = Workbook.getWorkbook(inputWorkbook);

			// Get the first sheet
			var Sheet sheet = workbook.getSheet("Hardware")

			// Dies ist der Zwischenspeicher fÃ¼r das "aktuelle" Board
			var String excelResName
			
			// Retrieve the data from all applications
			for (row : 1 ..< sheet.rows) {

				var isNewBoard = false

				// **** EINLESEN ALLER ORIGINAL DATEN AUS EXCEL *****
				
				// Ãœberschreibe den alten Wert von resName nur, wenn ein neuer Wert in der Zelle steht (neues Board!)
				if (sheet.getCell(0, row).contents.length > 0) {
					excelResName = clear(sheet.getCell(0, row).contents) 	// Spalte: A
					isNewBoard = true;
				}
				
				val excelType 		= clear(sheet.getCell(1, row).contents) 	// Spalte: B
				val excelResPosX 	= clear(sheet.getCell(2, row).contents) 	// Spalte: C
				val excelResPosY 	= clear(sheet.getCell(3, row).contents) 	// Spalte: D
				val excelResWeight 	= clear(sheet.getCell(4, row).contents) 	// Spalte: E
				val excelPowerSupply= clear(sheet.getCell(5, row).contents) 	// Spalte: F
				val excelSide		= clear(sheet.getCell(6, row).contents) 	// Spalte: G
				val excelRoute		= clear(sheet.getCell(7, row).contents) 	// Spalte: H
				
				val excelResProtLvl	= clear(sheet.getCell(8, row).contents) 	// Spalte: I
				val excelCustomType	= new HashMap<String, String>
				
				for (i : 1..39) {
					val excelCustomEntry = sheet.getCell(8+i, row).contents
					if (excelCustomEntry.length > 0) 					// Die Zelle darf nicht leer sein ...
						if (Integer.parseInt(excelCustomEntry) > 0) 	// Die Anzahl muss grÃ¶ÃŸer als Null sein ...
							excelCustomType.put("CustomType"+i, excelCustomEntry)
				}
				
				// ***** BOARDS ANLEGEN BZW. FUELLEN **********
				var Board currentBoard
				
				// wir haben ein neues Board gefunden ...
				if (isNewBoard) {
					
					// Erstelle ein neues Board
					currentBoard = new Board(excelResName, excelType, excelPowerSupply, excelSide, excelRoute)
					if (excelResPosX.length > 0) 	currentBoard.genericParameters.put("RES_POSITION_X", excelResPosX)
					if (excelResPosY.length > 0) 	currentBoard.genericParameters.put("RES_POSITION_Y", excelResPosY)
					if (excelResWeight.length > 0) 	currentBoard.genericParameters.put("RES_WEIGHT", excelResWeight)
					
					// Fuege das Board zur Liste hinzu
					allBoards.add(currentBoard)
					
				}
				
				// wir haben eine ErgÃ¤nzung zu einem bestehenden Board gefunden
				else  {
					
					// finde das richtige Board
					for (otherBoard : allBoards)
						if (otherBoard.name.equals(excelResName))
							currentBoard = otherBoard	
				}
				
				// IO Adapter ergÃ¤nzen
				for (adapterType : excelCustomType.keySet)
					currentBoard.ioAdapters.add(new IOAdapter("Adapter" + adapterType + excelResProtLvl, adapterType, excelResProtLvl, excelCustomType.get(adapterType)))
			}
		} catch (BiffException e) {	e.printStackTrace(); }

		return '''
Hardware {
	«FOR board : allBoards»
	Board «board.name» {
		Type = "«board.type»";
		Power supply = "«board.powersupply»";
		Side = "«board.side»";
		Route = "«board.route»";
		Processor Processor0 { Core Core0 {}}
		«FOR adapt : board.ioAdapters»
		I/O Adapter «adapt.name» {
			Type = «adapt.type»;
			IO Protection = «adapt.ioProtectionLevel»;
			Total units = «adapt.units»;
		}
		«ENDFOR»
		Generic properties { 
			«FOR p : board.genericParameters.keySet»
			"Â«p»" = Â«board.genericParameters.get(p)»;
			Â«ENDFOR»
		}
	}
	
	«ENDFOR»
}
 
'''
	}
	
	def static createApplicationsAndGroups(String filePath) {
		var File inputWorkbook = new File(filePath)
		var Workbook workbook

		// Where to store the information about all applications?
		val allApplications = new ArrayList<Application>
		val allApplicationGroups = new HashMap<String, ArrayList<Application>>

		try {
			workbook = Workbook.getWorkbook(inputWorkbook);

			// Get the first sheet
			var Sheet sheet = workbook.getSheet("Software")

			// Retrieve the data from all applications
			for (row : 1 ..< sheet.rows) {

				// Retrieve raw data from excel and clean it
				val systemName = clear(sheet.getCell(0, row).contents) // Spalte: A
				val subSystemName = clear(sheet.getCell(1, row).contents) // Spalte: B
				val equipmentName = clear(sheet.getCell(11, row).contents) // Spalte: L
				val interfaceUnit = clear(sheet.getCell(8, row).contents) // Spalte: I 	
				val interfaceType = clear(sheet.getCell(7, row).contents) // Spalte: H
				val paramCableWeight = clear(sheet.getCell(9, row).contents) // Spalte: J
				val paramPower = clear(sheet.getCell(10, row).contents) // Spalte: K
				val paramEqPosX = clear(sheet.getCell(13, row).contents) // Spalte: N
				val paramEqPosY = clear(sheet.getCell(14, row).contents) // Spalte: O
				val paramProtectionLvl = clear(sheet.getCell(15, row).contents) // Spalte: P

				// Is this line empty?
				if (systemName.length > 0) {

					// Create PRECISION PRO values
					val applicationName = subSystemName + "__" + equipmentName
					val applicationProtectionLevel = paramProtectionLvl
					val ioAdapterType = interfaceType
					var int ioAdapterCount
					if(interfaceUnit.length > 0) ioAdapterCount = Integer.parseInt(interfaceUnit) else ioAdapterCount = 1

					// Iterator-Variable
					var Application application = null

					// Hatten wir diese Applikation schon?				
					for (app : allApplications)
						if(app.name.equals(applicationName)) application = app

					// Falls application immer noch null ist, dann erstelle eine neue Applikation
					if (application == null) {					
						application = new Application(applicationName, applicationProtectionLevel)
						allApplications.add(application)
					}

					// ****** IO Adapter Type **************
					// PrÃ¼fe, ob wir fÃ¼r diese App schon diesen IO Adapter Type hatten
					if (application.ioAdapterRequirements.containsKey(ioAdapterType))
						// Ja, diesen hatten wir schon - zÃ¤hle die Anzahl der benÃ¶tigten Adapter hoch
						application.ioAdapterRequirements.put(ioAdapterType,
							application.ioAdapterRequirements.get(ioAdapterType) + ioAdapterCount)
					else
						// Nein, diesen hatten wir noch nicht - fÃ¼ge ihn einfach hinzu
						application.ioAdapterRequirements.put(ioAdapterType, ioAdapterCount)

					// ****** PARAMETER **************				
					if(paramCableWeight.length > 0) application.genericParameters.put("CABLE_WEIGHT", paramCableWeight)
					if(paramEqPosX.length > 0) application.genericParameters.put("EQ_POSITION_X", paramEqPosX)
					if(paramEqPosY.length > 0) application.genericParameters.put("EQ_POSITION_Y", paramEqPosY)
					if(paramPower.length > 0) application.genericParameters.put("POWER", paramPower)
					
					// EQ Protection Level wird als L1 ... L8 angegeben; bei den generischen Parametern sind allerdings
					// nur Integer Zahlen als gÃ¼ltige Werte erlaubt.
					// Daher schneiden wir den ersten Buchstaben ab.
					val genParmProtectionLevel = paramProtectionLvl.substring(1)
					if(paramProtectionLvl.length > 0) application.genericParameters.put("EQ_PROTECTION_LEVEL", genParmProtectionLevel)

					// ****** GRUPPEN ****************
					// Create the Group-entry for SubSystem Groups
					// Did we already encounter this group? If not, create a new list ...
					if (!allApplicationGroups.containsKey(subSystemName))
						allApplicationGroups.put(subSystemName, new ArrayList<Application>)

					// 	Add this application to the group only if it is not already in there
					if (!allApplicationGroups.get(subSystemName).contains(application))			
						allApplicationGroups.get(subSystemName).add(application)
				}
			}

		} catch (BiffException e) {
			e.printStackTrace();
		}

		return '''
Software {
	«FOR application : allApplications»
	Application «application.name» {
		Core-utilization = 0;
		«IF application.protectionLevel.length > 0»Required IO protection = «application.protectionLevel»;«ENDIF»
		«FOR ioReq : application.ioAdapterRequirements.keySet»
		«FOR i : {1..application.ioAdapterRequirements.get(ioReq)}»
		Requires 1 «ioReq» adapter (exclusive access);
		«ENDFOR»
		
		«ENDFOR»
		Generic properties { 
			«FOR p : application.genericParameters.keySet»
			"«p»" = «application.genericParameters.get(p)»;
			«ENDFOR»
		}
	}
	
	«ENDFOR»
	«FOR groupName : allApplicationGroups.keySet.filter[allApplicationGroups.get(it).size > 1]»
	Group Group_«groupName» { «FOR app : allApplicationGroups.get(groupName)»«IF allApplicationGroups.get(groupName).indexOf(app) > 0», «ENDIF»«app.name»«ENDFOR» }
	«ENDFOR»
}
 
		''';
	}
}
