package ch.hilbri.assist.mapping.exporters.excel

import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.result.mapping.Result
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.util.HashMap
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.ss.usermodel.Row

import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.PlatformUI
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import static ch.hilbri.assist.mapping.exporters.excel.ExcelOutputTransformator.*

class ExcelOutputTransformator {
	
	private static Logger logger = LoggerFactory.getLogger(ExcelOutputTransformator)
	
	def static String createExcelOutput(String file, Result result) {
		
		val inputExcelFile = new FileInputStream(new File(file))
		val outputExcelFileName = file.substring(0, file.length - 5) + " -- ASSIST " + result.name + ".xlsx"
		val outputExcelFile = new FileOutputStream(new File(outputExcelFileName))
		
		logger.debug('''Exporter: using excel file «file» and creating a new excel file «outputExcelFileName»''')
		
		var exportedInterfaceCount = 0 // how many interfaces where exported?
		val exportedInterfaceMap = new HashMap<EqInterface, Boolean>  // which interfaces where exported?
		for (iface : result.model.eqInterfaces)
			exportedInterfaceMap.put(iface, false)
		var exportedNotFoundInterfaceCount = 0
		
		try {
			
			val workbook = new XSSFWorkbook(inputExcelFile)
			val sheet = workbook.getSheet("Wiring part V2")
			
			val rowIterator = sheet.iterator
			while (rowIterator.hasNext) {
				val row = rowIterator.next
				
				// We skip the header 
				if (row.rowNum >= 4)  {
					
					// How do we test if a line is empty?
					// -> "system" cannot be empty
					if (row.getCell(2, Row.CREATE_NULL_AS_BLANK).stringCellValue.length > 0) {
						
						// Retrieve raw data from excel and clean it
						val lineName			 = row.getCell(12).stringCellValue				// Spalte: M
						val wiringLane			 = row.getCell(13).stringCellValue				// Spalte: N
						val restrictDeploymentTo = row.getCell(3).stringCellValue				// Spalte: D
					
						// We need to have a line with an interface in it and an empty "result field"
						if (!lineName.nullOrEmpty && restrictDeploymentTo.nullOrEmpty) {
		
							var ifacename = clear(lineName) 
							if (!wiringLane.nullOrEmpty) ifacename += "__" + clear(wiringLane)
				
							val interfacename = ifacename // needs to be final
				
							// Try to locate that interface in our model
							if (result.model.eqInterfaces.filter[name.equals(interfacename)].length == 1) {
						
								val eqInterface = result.model.eqInterfaces.filter[name.equals(interfacename)].get(0)
						
								if (result.mapping.get(eqInterface) != null) {
							
									// Here we try to build the string that gets exported to Excel
									val pin = result.getPinForEqInterface(eqInterface)
									val mappedRDCName = pin.connector.rdc.name + "__" + pin.connector.name + "__" + pin.name
								
									val cell = row.getCell(3)
									cell.cellValue = mappedRDCName					

									exportedInterfaceCount++
									exportedInterfaceMap.put(eqInterface, true)
								}
						
							}	 

							// The interface was not found
							else {	
								exportedNotFoundInterfaceCount++   
							}

						} // we need to have a line for an interface

					} // row is not empty

				} // if row > 4			

			} // while rowIter
			
			inputExcelFile.close
			
			workbook.write(outputExcelFile)
			outputExcelFile.close
			
			
		} catch(FileNotFoundException e) {
			Display.getDefault().asyncExec(new Runnable() {
				override run() {MessageDialog.openError(PlatformUI.workbench.activeWorkbenchWindow.shell, "Export error", "Error while accessing the file: " + e.message)}
			});
		} catch (Exception e) {
			logger.debug('''Exporter: encountered an exception: «e.class.simpleName»«IF !e.message.nullOrEmpty»: >>«e.message»<<«ENDIF»''')	
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