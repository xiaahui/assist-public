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
                

«««             /* HARDWARE BESCHREIBUNG */
«««             /* ===================== */
                <ECUC-MODULE-CONFIGURATION-VALUES>
                    <SHORT-NAME>EcuC</SHORT-NAME>
                    <DEFINITION-REF DEST="ECUC-MODULE-DEF">/AUTOSAR/EcuC</DEFINITION-REF>
                    <CONTAINERS>

«««                     /* Beschreibung EINES Mikrocontrollers als Processor aus ASSIST */
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

«««                /* SOFTWARE BESCHREIBUNG */
«««                /* ===================== */
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

«««                         /* Diese Parameter sind immer so dabei */
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
                            
«««                         /* Einfach die Werte unverändert rausschreiben */
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
                        
«««                        /* Counter werden einfach rausgeschrieben, wenn ich Alarme mitschreiben möchte */
«««                         <ECUC-CONTAINER-VALUE>
«««                            <SHORT-NAME>cnt1</SHORT-NAME>
«««                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsCounter</DEFINITION-REF>
«««                            <PARAMETER-VALUES>
«««                                <ECUC-NUMERICAL-PARAM-VALUE>
«««                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsCounter/OsCounterMaxAllowedValue</DEFINITION-REF>
«««                                    <VALUE>100000</VALUE>
«««                                </ECUC-NUMERICAL-PARAM-VALUE>
«««                                <ECUC-NUMERICAL-PARAM-VALUE>
«««                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsCounter/OsCounterMinCycle</DEFINITION-REF>
«««                                    <VALUE>1</VALUE>
«««                                </ECUC-NUMERICAL-PARAM-VALUE>
«««                                <ECUC-NUMERICAL-PARAM-VALUE>
«««                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsCounter/OsCounterTicksPerBase</DEFINITION-REF>
«««                                    <VALUE>1</VALUE>
«««                                </ECUC-NUMERICAL-PARAM-VALUE>
«««                            </PARAMETER-VALUES>
«««                        </ECUC-CONTAINER-VALUE> 
                        
«««                        /* Noch ein Counter wie oben */»
«««                        <ECUC-CONTAINER-VALUE>
«««                            <SHORT-NAME>cnt2</SHORT-NAME>
«««                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsCounter</DEFINITION-REF>
«««                            <PARAMETER-VALUES>
«««                                <ECUC-NUMERICAL-PARAM-VALUE>
«««                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsCounter/OsCounterMaxAllowedValue</DEFINITION-REF>
«««                                    <VALUE>100000</VALUE>
«««                                </ECUC-NUMERICAL-PARAM-VALUE>
«««                                <ECUC-NUMERICAL-PARAM-VALUE>
«««                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsCounter/OsCounterMinCycle</DEFINITION-REF>
«««                                    <VALUE>1</VALUE>
«««                                </ECUC-NUMERICAL-PARAM-VALUE>
«««                                <ECUC-NUMERICAL-PARAM-VALUE>
«««                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsCounter/OsCounterTicksPerBase</DEFINITION-REF>
«««                                    <VALUE>1</VALUE>
«««                                </ECUC-NUMERICAL-PARAM-VALUE>
«««                            </PARAMETER-VALUES>
«««                        </ECUC-CONTAINER-VALUE>    

«««                     /* Beispiel für eine Ressource, könnte bei einem leeren File auch weggelassen werden */
«««                        <ECUC-CONTAINER-VALUE>
«««                            <SHORT-NAME>R1</SHORT-NAME>
«««                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsResource</DEFINITION-REF>
«««                            <PARAMETER-VALUES>
«««                                <ECUC-TEXTUAL-PARAM-VALUE>
«««                                    <DEFINITION-REF DEST="ECUC-ENUMERATION-PARAM-DEF">/AUTOSAR/Os/OsResource/OsResourceProperty</DEFINITION-REF>
«««                                    <VALUE>STANDARD</VALUE>
«««                                </ECUC-TEXTUAL-PARAM-VALUE>
«««                            </PARAMETER-VALUES>
«««                        </ECUC-CONTAINER-VALUE>

«««                        /* Zweite Ressource wie oben */
«««                        <ECUC-CONTAINER-VALUE>
«««                            <SHORT-NAME>R2</SHORT-NAME>
«««                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsResource</DEFINITION-REF>
«««                            <PARAMETER-VALUES>
«««                                <ECUC-TEXTUAL-PARAM-VALUE>
«««                                    <DEFINITION-REF DEST="ECUC-ENUMERATION-PARAM-DEF">/AUTOSAR/Os/OsResource/OsResourceProperty</DEFINITION-REF>
«««                                    <VALUE>STANDARD</VALUE>
«««                                </ECUC-TEXTUAL-PARAM-VALUE>
«««                            </PARAMETER-VALUES>
«««                        </ECUC-CONTAINER-VALUE>


«««                        /* Dritte Ressource wie oben */
«««                        <ECUC-CONTAINER-VALUE>
«««                            <SHORT-NAME>R3</SHORT-NAME>
«««                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsResource</DEFINITION-REF>
«««                            <PARAMETER-VALUES>
«««                                <ECUC-TEXTUAL-PARAM-VALUE>
«««                                    <DEFINITION-REF DEST="ECUC-ENUMERATION-PARAM-DEF">/AUTOSAR/Os/OsResource/OsResourceProperty</DEFINITION-REF>
«««                                    <VALUE>STANDARD</VALUE>
«««                                </ECUC-TEXTUAL-PARAM-VALUE>
«««                            </PARAMETER-VALUES>
«««                        </ECUC-CONTAINER-VALUE>      

«««                     /* Beschreibung der Tasks in ASSIST, die keine ISRs darstellen 
						«FOR task : result.model.allTasks.filter[customProperties.filter[name.toUpperCase == "TYPE" && stringValue.toUpperCase == "ISR"].isNullOrEmpty]»
						<ECUC-CONTAINER-VALUE>
							<SHORT-NAME>«task.name»</SHORT-NAME>
							<DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsTask</DEFINITION-REF>

«««							/* Konfiguration der Eigenschaften eines Tasks - für Scheduling relevant? (Default Werte) */
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
							
«««							/* Erzwingt automatischen Start des Tasks in jedem Mode - guter Default Wert */
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
«««								 	// Optionale Referencen auf zwei Ressourcen, die vom Task benutzt werden 
«««                                <ECUC-REFERENCE-VALUE>
«««                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsTask/OsTaskResourceRef</DEFINITION-REF>
«««                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/R1</VALUE-REF>
«««                                </ECUC-REFERENCE-VALUE>
«««                                <ECUC-REFERENCE-VALUE>
«««                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsTask/OsTaskResourceRef</DEFINITION-REF>
«««                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/R2</VALUE-REF>
«««                                </ECUC-REFERENCE-VALUE>  
							</REFERENCE-VALUES>
						</ECUC-CONTAINER-VALUE>
						«ENDFOR»

                        
                       	«/* ISR Definition: ist in ASSIST eigentlich ein Task, 
                       	 * muss aber besonderes Property kriegen, 
                       	 * damit er hier als ISR rausgeschrieben wird
                       	 */»
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
«««                       				// Ressource usage 
«««                       				<DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsIsr/OsIsrResourceRef</DEFINITION-REF>
«««                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/R2</VALUE-REF>
                       	        </ECUC-REFERENCE-VALUE>
                       	    </REFERENCE-VALUES>
                       	</ECUC-CONTAINER-VALUE>
                       	«ENDFOR»

«««                     // Alarme sind eine Möglichkeit, um Tasks zu starten, 
«««						// wenn ich genauere Informationen über das Scheduling habe. Alternativ geht auch erstmal Autostart. Alarme sind auch erstmal optional
«««						<ECUC-CONTAINER-VALUE>
«««                            <SHORT-NAME>alarm1</SHORT-NAME>
«««                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm</DEFINITION-REF>
«««                            <REFERENCE-VALUES>
«««                                <ECUC-REFERENCE-VALUE>
«««                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmCounterRef</DEFINITION-REF>
«««                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/cnt1</VALUE-REF>
«««                                </ECUC-REFERENCE-VALUE>
«««                            </REFERENCE-VALUES>
«««                            <SUB-CONTAINERS>
«««                                
«««                                <ECUC-CONTAINER-VALUE>
«««                                    <SHORT-NAME>OsAlarmAction</SHORT-NAME>
«««                                    <DEFINITION-REF DEST="ECUC-CHOICE-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction</DEFINITION-REF>
«««                                    <SUB-CONTAINERS>
«««                                        <ECUC-CONTAINER-VALUE>
«««                                            <SHORT-NAME>OsAlarmActivateTask</SHORT-NAME>
«««                                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction/OsAlarmActivateTask</DEFINITION-REF>
«««                                            <REFERENCE-VALUES>
«««                                                <ECUC-REFERENCE-VALUE>
«««                                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction/OsAlarmActivateTask/OsAlarmActivateTaskRef</DEFINITION-REF>
«««                                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/T1</VALUE-REF>
«««                                                </ECUC-REFERENCE-VALUE>
«««                                            </REFERENCE-VALUES>
«««                                        </ECUC-CONTAINER-VALUE>
«««                                    </SUB-CONTAINERS>
«««                                </ECUC-CONTAINER-VALUE>
«««                                                               
«««                                <ECUC-CONTAINER-VALUE>
«««                                    <SHORT-NAME>OsAlarmAutostart</SHORT-NAME>
«««                                    <DEFINITION-REF DEST="ECUC-CHOICE-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart</DEFINITION-REF>
«««                                    <PARAMETER-VALUES>
«««                                        <ECUC-NUMERICAL-PARAM-VALUE>
«««                                            <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmAlarmTime</DEFINITION-REF>
«««                                            <VALUE>3000</VALUE>
«««                                        </ECUC-NUMERICAL-PARAM-VALUE>
«««                                        <ECUC-NUMERICAL-PARAM-VALUE>
«««                                            <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmCycleTime</DEFINITION-REF>
«««                                            <VALUE>10000</VALUE>
«««                                        </ECUC-NUMERICAL-PARAM-VALUE>
«««                                    </PARAMETER-VALUES>
«««                                    <REFERENCE-VALUES>
«««                                        <ECUC-REFERENCE-VALUE>
«««                                            <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmAppModeRef</DEFINITION-REF>
«««                                            <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/appmode1</VALUE-REF>
«««                                        </ECUC-REFERENCE-VALUE>
«««                                    </REFERENCE-VALUES>
«««                                </ECUC-CONTAINER-VALUE>
«««                            </SUB-CONTAINERS>
«««                        </ECUC-CONTAINER-VALUE>

«««			
«««                        <ECUC-CONTAINER-VALUE>
«««                            <SHORT-NAME>alarm2</SHORT-NAME>
«««                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm</DEFINITION-REF>
«««                            <REFERENCE-VALUES>
«««                                <ECUC-REFERENCE-VALUE>
«««                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmCounterRef</DEFINITION-REF>
«««                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/cnt1</VALUE-REF>
«««                                </ECUC-REFERENCE-VALUE>
«««                            </REFERENCE-VALUES>
«««                            <SUB-CONTAINERS>
«««                                <ECUC-CONTAINER-VALUE>
«««                                    <SHORT-NAME>OsAlarmAction</SHORT-NAME>
«««                                    <DEFINITION-REF DEST="ECUC-CHOICE-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction</DEFINITION-REF>
«««                                    <SUB-CONTAINERS>
«««                                        <ECUC-CONTAINER-VALUE>
«««                                            <SHORT-NAME>OsAlarmActivateTask</SHORT-NAME>
«««                                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction/OsAlarmActivateTask</DEFINITION-REF>
«««                                            <REFERENCE-VALUES>
«««                                                <ECUC-REFERENCE-VALUE>
«««                                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction/OsAlarmActivateTask/OsAlarmActivateTaskRef</DEFINITION-REF>
«««                                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/T2</VALUE-REF>
«««                                                </ECUC-REFERENCE-VALUE>
«««                                            </REFERENCE-VALUES>
«««                                        </ECUC-CONTAINER-VALUE>
«««                                    </SUB-CONTAINERS>
«««                                </ECUC-CONTAINER-VALUE>                               
«««                                <ECUC-CONTAINER-VALUE>
«««                                    <SHORT-NAME>OsAlarmAutostart</SHORT-NAME>
«««                                    <DEFINITION-REF DEST="ECUC-CHOICE-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart</DEFINITION-REF>
«««                                    <PARAMETER-VALUES>
«««                                        <ECUC-NUMERICAL-PARAM-VALUE>
«««                                            <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmAlarmTime</DEFINITION-REF>
«««                                            <VALUE>3000</VALUE>
«««                                        </ECUC-NUMERICAL-PARAM-VALUE>
«««                                        <ECUC-NUMERICAL-PARAM-VALUE>
«««                                            <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmCycleTime</DEFINITION-REF>
«««                                            <VALUE>10000</VALUE>
«««                                        </ECUC-NUMERICAL-PARAM-VALUE>
«««                                    </PARAMETER-VALUES>
«««                                    <REFERENCE-VALUES>
«««                                        <ECUC-REFERENCE-VALUE>
«««                                            <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmAppModeRef</DEFINITION-REF>
«««                                            <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/appmode1</VALUE-REF>
«««                                        </ECUC-REFERENCE-VALUE>
«««                                    </REFERENCE-VALUES>
«««                                </ECUC-CONTAINER-VALUE>
«««                            </SUB-CONTAINERS>
«««                        </ECUC-CONTAINER-VALUE>

«««                        <ECUC-CONTAINER-VALUE>
«««                            <SHORT-NAME>alarm3</SHORT-NAME>
«««                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm</DEFINITION-REF>
«««                            <REFERENCE-VALUES>
«««                                <ECUC-REFERENCE-VALUE>
«««                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmCounterRef</DEFINITION-REF>
«««                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/cnt2</VALUE-REF>
«««                                </ECUC-REFERENCE-VALUE>
«««                            </REFERENCE-VALUES>
«««                            <SUB-CONTAINERS>
«««                                <ECUC-CONTAINER-VALUE>
«««                                    <SHORT-NAME>OsAlarmAction</SHORT-NAME>
«««                                    <DEFINITION-REF DEST="ECUC-CHOICE-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction</DEFINITION-REF>
«««                                    <SUB-CONTAINERS>
«««                                        <ECUC-CONTAINER-VALUE>
«««                                            <SHORT-NAME>OsAlarmActivateTask</SHORT-NAME>
«««                                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction/OsAlarmActivateTask</DEFINITION-REF>
«««                                            <REFERENCE-VALUES>
«««                                                <ECUC-REFERENCE-VALUE>
«««                                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction/OsAlarmActivateTask/OsAlarmActivateTaskRef</DEFINITION-REF>
«««                                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/T3</VALUE-REF>
«««                                                </ECUC-REFERENCE-VALUE>
«««                                            </REFERENCE-VALUES>
«««                                        </ECUC-CONTAINER-VALUE>
«««                                    </SUB-CONTAINERS>
«««                                </ECUC-CONTAINER-VALUE>                               
«««                                <ECUC-CONTAINER-VALUE>
«««                                    <SHORT-NAME>OsAlarmAutostart</SHORT-NAME>
«««                                    <DEFINITION-REF DEST="ECUC-CHOICE-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart</DEFINITION-REF>
«««                                    <PARAMETER-VALUES>
«««                                        <ECUC-NUMERICAL-PARAM-VALUE>
«««                                            <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmAlarmTime</DEFINITION-REF>
«««                                            <VALUE>3000</VALUE>
«««                                        </ECUC-NUMERICAL-PARAM-VALUE>
«««                                        <ECUC-NUMERICAL-PARAM-VALUE>
«««                                            <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmCycleTime</DEFINITION-REF>
«««                                            <VALUE>10000</VALUE>
«««                                        </ECUC-NUMERICAL-PARAM-VALUE>
«««                                    </PARAMETER-VALUES>
«««                                    <REFERENCE-VALUES>
«««                                        <ECUC-REFERENCE-VALUE>
«««                                            <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmAppModeRef</DEFINITION-REF>
«««                                            <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/appmode1</VALUE-REF>
«««                                        </ECUC-REFERENCE-VALUE>
«««                                    </REFERENCE-VALUES>
«««                                </ECUC-CONTAINER-VALUE>
«««                            </SUB-CONTAINERS>
«««                        </ECUC-CONTAINER-VALUE>
                        
«««                        // Optionale Eigenschaft eines Tasks / Spinlocks 
«««                        <ECUC-CONTAINER-VALUE>
«««                            <SHORT-NAME>slock</SHORT-NAME>
«««                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsSpinlock</DEFINITION-REF>
«««                        </ECUC-CONTAINER-VALUE>
«««                        
                         
                        «/* Applikation = Container für alle OS Objekte (Tasks, ISRs, ...) */»
                        «FOR application : result.model.applications»
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>«application.name»</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsApplication</DEFINITION-REF>
                            <REFERENCE-VALUES>

«««								Handle regular tasks
                                «FOR task : application.tasks.filter[customProperties.filter[name.toUpperCase == "TYPE" && stringValue.toUpperCase == "ISR"].isNullOrEmpty]»
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsAppTaskRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/«result.model.systemName»/Os/«task.name»</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                «ENDFOR»

«««								Handle ISR tasks
                                «FOR task : application.tasks.filter[customProperties.filter[name.toUpperCase == "TYPE" && stringValue.toUpperCase == "ISR"].size > 0]»
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsAppIsrRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/«result.model.systemName»/Os/«task.name»</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                «ENDFOR»
                                
«««                             Write the deployment, we assume, that all tasks of this application are deployed to the same core, so we just retrieve the deployment for this core
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