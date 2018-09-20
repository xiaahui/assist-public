package ch.hilbri.assist.mapping.exporter

import ch.hilbri.assist.model.MappingResult

class DeploymentAsARXML {
   def static String generate(MappingResult result) {
    '''
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<AUTOSAR xmlns="http://autosar.org/schema/r4.0">
    <AR-PACKAGES>
        <AR-PACKAGE>
            <SHORT-NAME>«result.model.systemName»</SHORT-NAME>
            <ELEMENTS>
                

                <ECUC-MODULE-CONFIGURATION-VALUES>
                    <SHORT-NAME>EcuC</SHORT-NAME>
                    <DEFINITION-REF DEST="ECUC-MODULE-DEF">/AUTOSAR/EcuC</DEFINITION-REF>
                    <CONTAINERS>

                        «FOR processor : result.model.allProcessors»
                        <ECUC-CONTAINER-VALUE>
                        	<SHORT-NAME>«processor.name»</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/EcuC/EcucHardware</DEFINITION-REF>
                            <SUB-CONTAINERS>

                                «FOR core : processor.cores»
                                <ECUC-CONTAINER-VALUE>
                                     <SHORT-NAME>EcucCoreDefinition_«processor.cores.indexOf(core)»</SHORT-NAME>
                                     <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/EcuC/EcucHardware/EcucCoreDefinition</DEFINITION-REF>
                                     <PARAMETER-VALUES>
                                     	<ECUC-NUMERICAL-PARAM-VALUE>
                                     		<DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/EcuC/EcucHardware/EcucCoreDefinition/EcucCoreId</DEFINITION-REF>
                                     		<VALUE>«processor.cores.indexOf(core)»</VALUE>
                                     	</ECUC-NUMERICAL-PARAM-VALUE>
                                     </PARAMETER-VALUES>
                                </ECUC-CONTAINER-VALUE>
                                «ENDFOR»

                            </SUB-CONTAINERS>
                        </ECUC-CONTAINER-VALUE>
                        «ENDFOR»

                    </CONTAINERS>
                </ECUC-MODULE-CONFIGURATION-VALUES>

                <ECUC-MODULE-CONFIGURATION-VALUES>
                    <SHORT-NAME>Os</SHORT-NAME>
                    <CONTAINERS>
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>appmode1</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsAppMode</DEFINITION-REF>
                        </ECUC-CONTAINER-VALUE>
                        
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>OsOS</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsOS</DEFINITION-REF>

                            <PARAMETER-VALUES>
                                <ECUC-TEXTUAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-ENUMERATION-PARAM-DEF">/AUTOSAR/Os/OsOS/OsStatus</DEFINITION-REF>
                                    <VALUE>EXTENDED</VALUE>
                                </ECUC-TEXTUAL-PARAM-VALUE>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">/AUTOSAR/Os/OsOS/OsUseGetServiceId</DEFINITION-REF>
                                    <VALUE>false</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">/AUTOSAR/Os/OsOS/OsUseParameterAccess</DEFINITION-REF>
                                    <VALUE>false</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">/AUTOSAR/Os/OsOS/OsUseResScheduler</DEFINITION-REF>
                                    <VALUE>false</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                            </PARAMETER-VALUES>

                            <SUB-CONTAINERS>
                                <ECUC-CONTAINER-VALUE>
                                    <SHORT-NAME>OsHooks</SHORT-NAME>
                                    <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsOS/OsHooks</DEFINITION-REF>
                                    <PARAMETER-VALUES>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">/AUTOSAR/Os/OsOS/OsHooks/OsErrorHook</DEFINITION-REF>
                                            <VALUE>false</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">/AUTOSAR/Os/OsOS/OsHooks/OsShutdownHook</DEFINITION-REF>
                                            <VALUE>false</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">/AUTOSAR/Os/OsOS/OsHooks/OsStartupHook</DEFINITION-REF>
                                            <VALUE>false</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">/AUTOSAR/Os/OsOS/OsHooks/OsPreTaskHook</DEFINITION-REF>
                                            <VALUE>false</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">/AUTOSAR/Os/OsOS/OsHooks/OsPostTaskHook</DEFINITION-REF>
                                            <VALUE>false</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                    </PARAMETER-VALUES>
                                </ECUC-CONTAINER-VALUE>
                            </SUB-CONTAINERS>
                        </ECUC-CONTAINER-VALUE>
                        
                        «FOR core : result.model.allCores»
                        <ECUC-CONTAINER-VALUE>
                        	<SHORT-NAME>«core.processor.name»_«core.name»</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsCore</DEFINITION-REF>
                            <REFERENCE-VALUES>
                            	<ECUC-REFERENCE-VALUE>
                            		<DEFINITION-REF DEST="ECUC-SYMBOLIC-NAME-REFERENCE-DEF">/AUTOSAR/Os/OsCore/OsCoreEcucCoreRef</DEFINITION-REF>
                                	<VALUE-REF DEST="ECUC-CONTAINER-VALUE">/«result.model.systemName»/EcuC/«core.processor.name»/EcucCoreDefinition_«core.processor.cores.indexOf(core)»</VALUE-REF>
                            	</ECUC-REFERENCE-VALUE>
                            </REFERENCE-VALUES>
                        </ECUC-CONTAINER-VALUE>
                        «ENDFOR»

						«FOR task : result.model.allTasks.filter[customProperties.filter[name.toUpperCase == "TYPE" && stringValue.toUpperCase == "ISR"].isNullOrEmpty]»
						<ECUC-CONTAINER-VALUE>
							<SHORT-NAME>«task.name»</SHORT-NAME>
							<DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsTask</DEFINITION-REF>

							<PARAMETER-VALUES>
								<ECUC-NUMERICAL-PARAM-VALUE>
									<DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsTask/OsTaskActivation</DEFINITION-REF>
									<VALUE>1</VALUE>
								</ECUC-NUMERICAL-PARAM-VALUE>
								<ECUC-NUMERICAL-PARAM-VALUE>
									<DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsTask/OsTaskPriority</DEFINITION-REF>
									<VALUE>1</VALUE>
								</ECUC-NUMERICAL-PARAM-VALUE>
								<ECUC-TEXTUAL-PARAM-VALUE>
									<DEFINITION-REF DEST="ECUC-ENUMERATION-PARAM-DEF">/AUTOSAR/Os/OsTask/OsTaskSchedule</DEFINITION-REF>
									<VALUE>FULL</VALUE>
								</ECUC-TEXTUAL-PARAM-VALUE>
							</PARAMETER-VALUES>
							

							<SUB-CONTAINERS>
								<ECUC-CONTAINER-VALUE>
									<SHORT-NAME>OsTaskAutostart</SHORT-NAME>
									<DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsTask/OsTaskAutostart</DEFINITION-REF>
									<REFERENCE-VALUES>
										<ECUC-REFERENCE-VALUE>
											<DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsTask/OsTaskAutostart/OsTaskAppModeRef</DEFINITION-REF>
											<VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/OS_APPMODE_ANY</VALUE-REF>
										</ECUC-REFERENCE-VALUE>
									</REFERENCE-VALUES>
								</ECUC-CONTAINER-VALUE>
							</SUB-CONTAINERS>
							
							<REFERENCE-VALUES>
							</REFERENCE-VALUES>
						</ECUC-CONTAINER-VALUE>
						«ENDFOR»

                       	«FOR task : result.model.allTasks.filter[customProperties.filter[name.toUpperCase == "TYPE" && stringValue.toUpperCase == "ISR"].size > 0]»
                       	<ECUC-CONTAINER-VALUE>
                       		<SHORT-NAME>«task.name»</SHORT-NAME>
                       		<DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsIsr</DEFINITION-REF>
                       		<PARAMETER-VALUES>
                       			<ECUC-TEXTUAL-PARAM-VALUE>
                       				<DEFINITION-REF DEST="ECUC-ENUMERATION-PARAM-DEF">/AUTOSAR/Os/OsIsr/OsIsrCategory</DEFINITION-REF>
                       				<VALUE>CATEGORY_2</VALUE>
                       			</ECUC-TEXTUAL-PARAM-VALUE>
                       		</PARAMETER-VALUES>
                       		<REFERENCE-VALUES>
                       			<ECUC-REFERENCE-VALUE>
                       	        </ECUC-REFERENCE-VALUE>
                       	    </REFERENCE-VALUES>
                       	</ECUC-CONTAINER-VALUE>
                       	«ENDFOR»

                        «FOR application : result.model.applications»
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>«application.name»</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsApplication</DEFINITION-REF>
                            <REFERENCE-VALUES>

                                «FOR task : application.tasks.filter[customProperties.filter[name.toUpperCase == "TYPE" && stringValue.toUpperCase == "ISR"].isNullOrEmpty]»
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsAppTaskRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/«result.model.systemName»/Os/«task.name»</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                «ENDFOR»

                                «FOR task : application.tasks.filter[customProperties.filter[name.toUpperCase == "TYPE" && stringValue.toUpperCase == "ISR"].size > 0]»
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsAppIsrRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/«result.model.systemName»/Os/«task.name»</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                «ENDFOR»

                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-SYMBOLIC-NAME-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsApplicationCoreRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/«result.model.systemName»/EcuC/«result.task2CoreMap.get(application.tasks.head).processor.name»/EcucCoreDefinition_«result.task2CoreMap.get(application.tasks.head).processor.cores.indexOf(result.task2CoreMap.get(application.tasks.head))»</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>

                            </REFERENCE-VALUES>

                            <SUB-CONTAINERS>
                                <ECUC-CONTAINER-VALUE>
                                    <SHORT-NAME>OsApplicationHooks</SHORT-NAME>
                                    <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsApplication/OsApplicationHooks/OsApplicationHooks</DEFINITION-REF>
                                    <PARAMETER-VALUES>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">/AUTOSAR/Os/OsApplication/OsApplicationHooks/OsAppErrorHook</DEFINITION-REF>
                                            <VALUE>false</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">/AUTOSAR/Os/OsApplication/OsApplicationHooks/OsAppShutdownHook</DEFINITION-REF>
                                            <VALUE>false</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">/AUTOSAR/Os/OsApplication/OsApplicationHooks/OsAppStartupHook</DEFINITION-REF>
                                            <VALUE>false</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                    </PARAMETER-VALUES>
                                </ECUC-CONTAINER-VALUE>
                            </SUB-CONTAINERS>
                        </ECUC-CONTAINER-VALUE>

						«ENDFOR»
                    </CONTAINERS>
                </ECUC-MODULE-CONFIGURATION-VALUES>
            </ELEMENTS>
        </AR-PACKAGE>
    </AR-PACKAGES>
</AUTOSAR>
'''
   } 
}