package ch.hilbri.assist.mapping.exporters.excel

import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.result.mapping.Result
import java.io.File
import java.io.FileNotFoundException
import java.util.HashMap
import jxl.Workbook
import jxl.WorkbookSettings
import jxl.read.biff.BiffException
import jxl.write.Label
import jxl.write.WritableWorkbook
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.PlatformUI
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ExcelOutputTransformator {
	
	private static Logger logger = LoggerFactory.getLogger(ExcelOutputTransformator)
	
	def static String createExcelOutput(String file, Result result) {
		val inputExcelFile = new File(file)
		val outputExcelFileName = file.substring(0, file.length - 4) + " -- ASSIST " + result.name + ".xls"
		val outputExcelFile = new File(outputExcelFileName)
		
		var exportedInterfaceCount = 0 // how many interfaces where exported?
		val exportedInterfaceMap = new HashMap<EqInterface, Boolean>  // which interfaces where exported?
		for (iface : result.model.eqInterfaces)
			exportedInterfaceMap.put(iface, false)
		var exportedNotFoundInterfaceCount = 0
		
		
		var WritableWorkbook wWorkbook
		var Workbook rWorkbook
		
		try {
			val workbookSettings = new WorkbookSettings()
			workbookSettings.suppressWarnings = true
			
			rWorkbook = Workbook.getWorkbook(inputExcelFile, workbookSettings)
			wWorkbook = Workbook.createWorkbook(outputExcelFile, rWorkbook, workbookSettings)
			
			val sheet = wWorkbook.getSheet("Wiring part V2")
	
			for (row : 4 ..< sheet.rows) {
				// Retrieve raw data from excel and clean it
				val lineName			 = sheet.getCell(12, row).contents		// Spalte: M
				val wiringLane			 = sheet.getCell(13, row).contents		// Spalte: N
				val restrictDeploymentTo = sheet.getCell(3, row).contents		// Spalte: D
			
				// We need to have a line with an interface in it and an empty "result field"
				if (!lineName.nullOrEmpty && restrictDeploymentTo.nullOrEmpty) {
	
					var ifacename = clear(lineName) 
					if (!wiringLane.nullOrEmpty) ifacename += "__" + clear(wiringLane)
				
					val interfacename = ifacename // needs to be final
				
					// Try to locate that interface in our model
					if (result.model.eqInterfaces.filter[it.name.equals(interfacename)].length == 1) {
						val eqInterface = result.model.eqInterfaces.filter[it.name.equals(interfacename)].get(0)
						
						if (result.mapping.get(eqInterface) != null) {

							val mappedRDCName = result.getPinForEqInterface(eqInterface).connector.rdc.name + "__" + result.mapping.get(eqInterface).name
							val label = new Label(3,row, mappedRDCName)
							sheet.addCell(label)
							
							exportedInterfaceCount++
							exportedInterfaceMap.put(eqInterface, true)
						}
					} else {
						exportedNotFoundInterfaceCount++
					}
				}
			}	// for (rows)
			
			wWorkbook.write
			
		} catch(FileNotFoundException e) {
			Display.getDefault().asyncExec(new Runnable() {
				override run() {MessageDialog.openError(PlatformUI.workbench.activeWorkbenchWindow.shell, "Export error", "Error while accessing the file: " + e.message)}
			});
		} catch (BiffException e) {
			e.printStackTrace() 
		}
		finally {
			rWorkbook?.close
			wWorkbook?.close
		}
		
		logger.info('''Exported «exportedInterfaceCount» interfaces to '«outputExcelFileName»'. ''')
		if (exportedInterfaceMap.values.filter[it == false].size > 0 || exportedNotFoundInterfaceCount > 0) {
			logger.info('''Please note: ''')
			
			if (exportedInterfaceMap.values.filter[it == false].size > 0) 
				logger.info('''    - There are «exportedInterfaceMap.values.filter[it == false].size» interfaces in the ASSIST specification which are NOT part of the excel file '«outputExcelFileName»' ''')
			
			if (exportedNotFoundInterfaceCount > 0)
				logger.info('''    - There are «exportedNotFoundInterfaceCount» interfaces in the excel file '«outputExcelFileName»' which are not part of the ASSIST specification''')
		}
		return outputExcelFileName
	}
	
	def static clear(String excelRawData) {
		return excelRawData.replaceAll("[[^a-z]&&[^A-Z]&&[^0-9]]", "_")   // replace everything which is not a-zA-Z0-9 with _
						   .replaceAll("^_*", "")						  // remove all _ at the beginning
						   .replaceAll("_*$", "")						  // remove all _ at the end
						   .replaceAll("^[0-9]*", "")                     // remove all leading numbers 
						   .replaceAll("__+", "_")						  // replace multiple _ with a single _
	}
}