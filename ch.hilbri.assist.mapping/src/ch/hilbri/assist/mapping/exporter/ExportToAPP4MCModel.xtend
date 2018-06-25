package ch.hilbri.assist.mapping.exporter

import ch.hilbri.assist.model.MappingResult
import org.eclipse.app4mc.amalthea.model.Amalthea

class ExportToAPP4MCModel {

    /**
     * @param result a mapping result to be converted to amalthea
     * @param template an amalthea model which should be "enhanced" with the mapping information - 
     *                 it could also be "null" for a clean and empty amalthea model 
     */
    static def Amalthea createModel(MappingResult result, Amalthea template) {
        return null
    }
}
