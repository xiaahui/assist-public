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
		return excelRawData.replaceAll("[[^a-z]&&[^A-Z]&&[^0-9]]", "_")   // replace everything which is not a-zA-Z0-9 with _
						   .replaceAll("^_*", "")						  // remove all _ at the beginning
						   .replaceAll("_*$", "")						  // remove all _ at the end
						   .replaceAll("^[0-9]*", "")                     // remove all leading numbers 
						   .replaceAll("__+", "_")						  // replace multiple _ with a single _
	}

	def static createMDSLFileInput(String filePath) {
		return
			createHeader(filePath) 
			+ createBoardsAndIOAdapters(filePath) 
			+ createApplicationsAndGroups(filePath) 
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

			// Dies ist der Zwischenspeicher fuer das "aktuelle" Board
			var String excelResName
			
			// Retrieve the data from all applications
			for (row : 1 ..< sheet.rows) {

				var isNewBoard = false

				// **** EINLESEN ALLER ORIGINAL DATEN AUS EXCEL *****
				
				// Ueberschreibe den alten Wert von resName nur, wenn ein neuer Wert in der Zelle steht (neues Board!)
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
				val excelEss		= clear(sheet.getCell(7, row).contents) 	// Spalte: H
				
				val excelResProtLvl	= clear(sheet.getCell(8, row).contents) 	// Spalte: I
				val excelCustomType	= new HashMap<String, String>
				
				for (i : 1..39) {
					val excelCustomEntry = sheet.getCell(8+i, row).contents
					if (excelCustomEntry.length > 0) 					// Die Zelle darf nicht leer sein ...
						if (Integer.parseInt(excelCustomEntry) > 0) 	// Die Anzahl muss groesser als Null sein ...
							excelCustomType.put("CustomType"+i, excelCustomEntry)
				}
				
				// ***** BOARDS ANLEGEN BZW. FUELLEN **********
				var Board currentBoard
				
				// wir haben ein neues Board gefunden ...
				if (isNewBoard) {
					
					// Erstelle ein neues Board
					currentBoard = new Board(excelResName, excelType, excelPowerSupply, excelSide, excelEss)
					if (excelResPosX.length > 0) 	currentBoard.genericParameters.put("RES_POSITION_X", excelResPosX)
					if (excelResPosY.length > 0) 	currentBoard.genericParameters.put("RES_POSITION_Y", excelResPosY)
					if (excelResWeight.length > 0) 	currentBoard.genericParameters.put("RES_WEIGHT", excelResWeight)
					
					// Fuege das Board zur Liste hinzu
					allBoards.add(currentBoard)
				}
				
				// wir haben eine Ergaenzung zu einem bestehenden Board gefunden
				else  {
					
					// finde das richtige Board
					for (otherBoard : allBoards)
						if (otherBoard.name.equals(excelResName))
							currentBoard = otherBoard	
				}
				
				// IO Adapter ergaenzen
				for (adapterType : excelCustomType.keySet.sort)
					currentBoard.ioAdapters.add(new IOAdapter(adapterType, excelResProtLvl, excelCustomType.get(adapterType)))
			}
		} catch (BiffException e) {	e.printStackTrace(); }

		

		return '''
Hardware {
	«FOR board : allBoards.sortBy[name]»
	Board «board.name» {
		«IF board.type.length > 0        »Type = "«         board.type»";«        ENDIF»
		«IF board.powersupply.length > 0 »PowerSupply = "«  board.powersupply»";« ENDIF»
		«IF board.side.length > 0        »Side = "«         board.side»";«        ENDIF»
		«IF board.ess.length > 0         »ESS = "«          board.ess»";«         ENDIF»
		Processor Processor0 { Core Core0 {}}
		«FOR adapt : board.ioAdapters.sort»
		I/O adapter { type = «adapt.type»;	count = «adapt.units»;	protection-level = «adapt.ioProtectionLevel»; }
		«ENDFOR»
		«IF !board.genericParameters.keySet.empty»
		Generic properties { 
			«FOR p : board.genericParameters.keySet»
			"«p»" = «board.genericParameters.get(p)»;
			«ENDFOR»
		}
		«ENDIF»
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
				val systemName 			= clear(sheet.getCell(0, row).contents)  // Spalte: A
				val subSystemName 		= clear(sheet.getCell(1, row).contents)  // Spalte: B
				val equipmentName 		= clear(sheet.getCell(11, row).contents) // Spalte: L
				val interfaceUnit 		= clear(sheet.getCell(8, row).contents)  // Spalte: I 	
				val interfaceType 		= clear(sheet.getCell(7, row).contents)  // Spalte: H
				val paramWeight		 	= clear(sheet.getCell(9, row).contents)  // Spalte: J
				val paramEqPower		= clear(sheet.getCell(10, row).contents) // Spalte: K
				val paramEqPosX 		= clear(sheet.getCell(13, row).contents) // Spalte: N
				val paramEqPosY 		= clear(sheet.getCell(14, row).contents) // Spalte: O
				val paramProtectionLvl 	= clear(sheet.getCell(15, row).contents) // Spalte: P

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
					// Pruefe, ob wir fuer diese App schon diesen IO Adapter Type hatten
					if (application.ioAdapterRequirements.containsKey(ioAdapterType))
						// Ja, diesen hatten wir schon - zaehle die Anzahl der benoetigten Adapter hoch
						application.ioAdapterRequirements.put(ioAdapterType, application.ioAdapterRequirements.get(ioAdapterType) + ioAdapterCount)
					else
						// Nein, diesen hatten wir noch nicht - fuege ihn einfach hinzu
						application.ioAdapterRequirements.put(ioAdapterType, ioAdapterCount)

					// ****** PARAMETER **************				
					if(paramWeight.length > 0) 	application.genericParameters.put("CABLE_WEIGHT", paramWeight)
					if(paramEqPosX.length > 0) 	application.genericParameters.put("EQ_POSITION_X", paramEqPosX)
					if(paramEqPosY.length > 0) 	application.genericParameters.put("EQ_POSITION_Y", paramEqPosY)
					if(paramEqPower.length > 0) application.genericParameters.put("EQ_POWER", paramEqPower)
					
					// EQ Protection Level wird als L1 ... L8 angegeben; bei den generischen Parametern sind allerdings
					// nur Integer Zahlen als gueltige Werte erlaubt.
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
		«IF application.protectionLevel.length > 0»Required IO protection = «application.protectionLevel»;«ENDIF»
		«FOR ioReq : application.ioAdapterRequirements.keySet.sortWith(new StringWithNumberPostFixComparator())»
		Requires «application.ioAdapterRequirements.get(ioReq)» «ioReq» adapter exclusive;
		«ENDFOR»
		«IF !application.genericParameters.keySet.empty»
		Generic properties { 
			«FOR p : application.genericParameters.keySet»
			"«p»" = «application.genericParameters.get(p)»;
			«ENDFOR»
		}
		«ENDIF»
	}
	
	«ENDFOR»
	«FOR groupName : allApplicationGroups.keySet.filter[allApplicationGroups.get(it).size > 1].sort»
	Group Group_«groupName» { «FOR app : allApplicationGroups.get(groupName)»«IF allApplicationGroups.get(groupName).indexOf(app) > 0», «ENDIF»«app.name»«ENDFOR» }
	«ENDFOR»
}
 
		''';
	}
}
