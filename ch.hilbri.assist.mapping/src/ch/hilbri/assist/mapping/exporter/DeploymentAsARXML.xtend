package ch.hilbri.assist.mapping.exporter

import ch.hilbri.assist.model.MappingResult

class DeploymentAsARXML {
   def static String generate(MappingResult result) {
    '''
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<AUTOSAR xmlns="http://autosar.org/schema/r4.0">
    <AR-PACKAGES>
        <AR-PACKAGE>
            <SHORT-NAME>MulticoreExample</SHORT-NAME>
            <ELEMENTS>
                
                «/* Modul gibt es einmal für die Hardware */»
                <ECUC-MODULE-CONFIGURATION-VALUES>
                    <SHORT-NAME>EcuC</SHORT-NAME>
                    <DEFINITION-REF DEST="ECUC-MODULE-DEF">/AUTOSAR/EcuC</DEFINITION-REF>
                    <CONTAINERS>
                        
                        «/* Beschreibung EINES Mikrocontrollers */»
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>EcucHardware</SHORT-NAME>
                            «/* Typ dieses Containers ist das letzte Element im Pfad */»
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/EcuC/EcucHardware</DEFINITION-REF>
                            <SUB-CONTAINERS>
                            
                            	«/* Hier wird EIN Core mit der ID 0 definiert, 0 ist der Master-Core */»
                                <ECUC-CONTAINER-VALUE>
                                    <SHORT-NAME>EcucCoreDefinition_0</SHORT-NAME>
                                    <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/EcuC/EcucHardware/EcucCoreDefinition</DEFINITION-REF>
                                    <PARAMETER-VALUES>
                                        <ECUC-NUMERICAL-PARAM-VALUE> «/* Hier muss unbedingt eine Zahl rein! */»
                                            <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/EcuC/EcucHardware/EcucCoreDefinition/EcucCoreId</DEFINITION-REF>
                                            <VALUE>0</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                    </PARAMETER-VALUES>
                                </ECUC-CONTAINER-VALUE>
                            
                                <ECUC-CONTAINER-VALUE>
                                    <SHORT-NAME>EcucCoreDefinition_9</SHORT-NAME>
                                    <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/EcuC/EcucHardware/EcucCoreDefinition</DEFINITION-REF>
                                    <PARAMETER-VALUES>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/EcuC/EcucHardware/EcucCoreDefinition/EcucCoreId</DEFINITION-REF>
                                            <VALUE>9</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                    </PARAMETER-VALUES>
                                </ECUC-CONTAINER-VALUE>
                            
                            </SUB-CONTAINERS>
                        </ECUC-CONTAINER-VALUE>
                        
                    </CONTAINERS>
                </ECUC-MODULE-CONFIGURATION-VALUES>
                
                «/* Hier beginnt die Beschreibung der Software */»
                <ECUC-MODULE-CONFIGURATION-VALUES>
                    <SHORT-NAME>Os</SHORT-NAME>
                    <CONTAINERS>
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>appmode1</SHORT-NAME> «/* Name ist egal */»
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsAppMode</DEFINITION-REF>
                        </ECUC-CONTAINER-VALUE>
                        
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>OsOS</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsOS</DEFINITION-REF>

                            «/* Diese Parameter sind immer so dabei */»
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
                            
                            «/* Einfach die Werte unverändert rausschreiben */»
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
                        
                        «/* Counter werden einfach rausgeschrieben, wenn ich Alarme mitschreiben möchte */»
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>cnt1</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsCounter</DEFINITION-REF>
                            <PARAMETER-VALUES>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsCounter/OsCounterMaxAllowedValue</DEFINITION-REF>
                                    <VALUE>100000</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsCounter/OsCounterMinCycle</DEFINITION-REF>
                                    <VALUE>1</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsCounter/OsCounterTicksPerBase</DEFINITION-REF>
                                    <VALUE>1</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                            </PARAMETER-VALUES>
                        </ECUC-CONTAINER-VALUE>
                        
                        «/* Noch ein Counter wie oben */»
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>cnt2</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsCounter</DEFINITION-REF>
                            <PARAMETER-VALUES>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsCounter/OsCounterMaxAllowedValue</DEFINITION-REF>
                                    <VALUE>100000</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsCounter/OsCounterMinCycle</DEFINITION-REF>
                                    <VALUE>1</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsCounter/OsCounterTicksPerBase</DEFINITION-REF>
                                    <VALUE>1</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                            </PARAMETER-VALUES>
                        </ECUC-CONTAINER-VALUE>    
                        
                        «/* Beispiel für eine Ressource, könnte bei einem leeren File auch weggelassen werden */»                  
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>R1</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsResource</DEFINITION-REF>
                            <PARAMETER-VALUES>
                                <ECUC-TEXTUAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-ENUMERATION-PARAM-DEF">/AUTOSAR/Os/OsResource/OsResourceProperty</DEFINITION-REF>
                                    <VALUE>STANDARD</VALUE>
                                </ECUC-TEXTUAL-PARAM-VALUE>
                            </PARAMETER-VALUES>
                        </ECUC-CONTAINER-VALUE>
                        
                        « /* Zweite Ressource wie oben */»
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>R2</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsResource</DEFINITION-REF>
                            <PARAMETER-VALUES>
                                <ECUC-TEXTUAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-ENUMERATION-PARAM-DEF">/AUTOSAR/Os/OsResource/OsResourceProperty</DEFINITION-REF>
                                    <VALUE>STANDARD</VALUE>
                                </ECUC-TEXTUAL-PARAM-VALUE>
                            </PARAMETER-VALUES>
                        </ECUC-CONTAINER-VALUE>
                        
                        « /* Dritte Ressource wie oben */»
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>R3</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsResource</DEFINITION-REF>
                            <PARAMETER-VALUES>
                                <ECUC-TEXTUAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-ENUMERATION-PARAM-DEF">/AUTOSAR/Os/OsResource/OsResourceProperty</DEFINITION-REF>
                                    <VALUE>STANDARD</VALUE>
                                </ECUC-TEXTUAL-PARAM-VALUE>
                            </PARAMETER-VALUES>
                        </ECUC-CONTAINER-VALUE>      
                        
                        «/* Ein einzelner Task T1 */»                 
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>T1</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsTask</DEFINITION-REF>
                            
                            «/* Konfiguration der Eigenschaften eines Tasks - für Scheduling relevant? (Default Werte) */»
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
                            
                            « /* Erzwingt automatischen Start des Tasks in jedem Mode - guter Default Wert */»
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
	                            « /* Optionale Referencen auf zwei Ressourcen, die vom Task benutzt werden */»
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsTask/OsTaskResourceRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/R1</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsTask/OsTaskResourceRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/R2</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                            </REFERENCE-VALUES>
                        </ECUC-CONTAINER-VALUE>
                        
                        
                        « /* Zweiter Task  */»
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>T2</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsTask</DEFINITION-REF>
                            
                            <PARAMETER-VALUES>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsTask/OsTaskActivation</DEFINITION-REF>
                                    <VALUE>1</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsTask/OsTaskPriority</DEFINITION-REF>
                                    <VALUE>2</VALUE>
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
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsTask/OsTaskResourceRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/R1</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsTask/OsTaskResourceRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/R2</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                            </REFERENCE-VALUES>
                        </ECUC-CONTAINER-VALUE>
                        
                        «/* Dritter Task */»
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>T3</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsTask</DEFINITION-REF>
                            
                            <PARAMETER-VALUES>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsTask/OsTaskActivation</DEFINITION-REF>
                                    <VALUE>1</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsTask/OsTaskPriority</DEFINITION-REF>
                                    <VALUE>3</VALUE>
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
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsTask/OsTaskResourceRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/R3</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                            </REFERENCE-VALUES>
                        </ECUC-CONTAINER-VALUE>
                         
                        «/* Task 4 */»                        
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>T4</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsTask</DEFINITION-REF>
                            
                            <PARAMETER-VALUES>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsTask/OsTaskActivation</DEFINITION-REF>
                                    <VALUE>1</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsTask/OsTaskPriority</DEFINITION-REF>
                                    <VALUE>3</VALUE>
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
                        </ECUC-CONTAINER-VALUE>
                        
                       	«/* ISR Definition: ist in ASSIST eigentlich ein Task, 
                       	 * muss aber besonderes Property kriegen, 
                       	 * damit er hier als ISR rausgeschrieben wird
                       	 */»
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>irq1</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsIsr</DEFINITION-REF>
                            <PARAMETER-VALUES>
                                <ECUC-TEXTUAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-ENUMERATION-PARAM-DEF">/AUTOSAR/Os/OsIsr/OsIsrCategory</DEFINITION-REF>
                                    <VALUE>CATEGORY_2</VALUE>
                                </ECUC-TEXTUAL-PARAM-VALUE>
                            </PARAMETER-VALUES>
                            <REFERENCE-VALUES>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsIsr/OsIsrResourceRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/R2</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                            </REFERENCE-VALUES>
                        </ECUC-CONTAINER-VALUE>
                        
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>irq2</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsIsr</DEFINITION-REF>
                            <PARAMETER-VALUES>
                                <ECUC-TEXTUAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-ENUMERATION-PARAM-DEF">/AUTOSAR/Os/OsIsr/OsIsrCategory</DEFINITION-REF>
                                    <VALUE>CATEGORY_2</VALUE>
                                </ECUC-TEXTUAL-PARAM-VALUE>
                            </PARAMETER-VALUES>
                        </ECUC-CONTAINER-VALUE>
                        
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>irq3</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsIsr</DEFINITION-REF>
                            <PARAMETER-VALUES>
                                <ECUC-TEXTUAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-ENUMERATION-PARAM-DEF">/AUTOSAR/Os/OsIsr/OsIsrCategory</DEFINITION-REF>
                                    <VALUE>CATEGORY_2</VALUE>
                                </ECUC-TEXTUAL-PARAM-VALUE>
                            </PARAMETER-VALUES>
                        </ECUC-CONTAINER-VALUE>
                        
                        «/* ALARM!  Alarme sind eine Möglichkeit, um Tasks zu starten, wenn ich genauere Informationen über das Scheduling habe. Alternativ geht auch erstmal Autostart. Alarme sind auch erstmal optional*/»
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>alarm1</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm</DEFINITION-REF>
                            <REFERENCE-VALUES>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmCounterRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/cnt1</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                            </REFERENCE-VALUES>
                            <SUB-CONTAINERS>
                                
                                <ECUC-CONTAINER-VALUE>
                                    <SHORT-NAME>OsAlarmAction</SHORT-NAME>
                                    <DEFINITION-REF DEST="ECUC-CHOICE-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction</DEFINITION-REF>
                                    <SUB-CONTAINERS>
                                        <ECUC-CONTAINER-VALUE>
                                            <SHORT-NAME>OsAlarmActivateTask</SHORT-NAME>
                                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction/OsAlarmActivateTask</DEFINITION-REF>
                                            <REFERENCE-VALUES>
                                                <ECUC-REFERENCE-VALUE>
                                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction/OsAlarmActivateTask/OsAlarmActivateTaskRef</DEFINITION-REF>
                                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/T1</VALUE-REF>
                                                </ECUC-REFERENCE-VALUE>
                                            </REFERENCE-VALUES>
                                        </ECUC-CONTAINER-VALUE>
                                    </SUB-CONTAINERS>
                                </ECUC-CONTAINER-VALUE>
                                                               
                                <ECUC-CONTAINER-VALUE>
                                    <SHORT-NAME>OsAlarmAutostart</SHORT-NAME>
                                    <DEFINITION-REF DEST="ECUC-CHOICE-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart</DEFINITION-REF>
                                    <PARAMETER-VALUES>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmAlarmTime</DEFINITION-REF>
                                            <VALUE>3000</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmCycleTime</DEFINITION-REF>
                                            <VALUE>10000</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                    </PARAMETER-VALUES>
                                    <REFERENCE-VALUES>
                                        <ECUC-REFERENCE-VALUE>
                                            <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmAppModeRef</DEFINITION-REF>
                                            <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/appmode1</VALUE-REF>
                                        </ECUC-REFERENCE-VALUE>
                                    </REFERENCE-VALUES>
                                </ECUC-CONTAINER-VALUE>
                            </SUB-CONTAINERS>
                        </ECUC-CONTAINER-VALUE>
                        
                        «/* Noch ein Alarm */»
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>alarm2</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm</DEFINITION-REF>
                            <REFERENCE-VALUES>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmCounterRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/cnt1</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                            </REFERENCE-VALUES>
                            <SUB-CONTAINERS>
                                <ECUC-CONTAINER-VALUE>
                                    <SHORT-NAME>OsAlarmAction</SHORT-NAME>
                                    <DEFINITION-REF DEST="ECUC-CHOICE-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction</DEFINITION-REF>
                                    <SUB-CONTAINERS>
                                        <ECUC-CONTAINER-VALUE>
                                            <SHORT-NAME>OsAlarmActivateTask</SHORT-NAME>
                                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction/OsAlarmActivateTask</DEFINITION-REF>
                                            <REFERENCE-VALUES>
                                                <ECUC-REFERENCE-VALUE>
                                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction/OsAlarmActivateTask/OsAlarmActivateTaskRef</DEFINITION-REF>
                                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/T2</VALUE-REF>
                                                </ECUC-REFERENCE-VALUE>
                                            </REFERENCE-VALUES>
                                        </ECUC-CONTAINER-VALUE>
                                    </SUB-CONTAINERS>
                                </ECUC-CONTAINER-VALUE>                               
                                <ECUC-CONTAINER-VALUE>
                                    <SHORT-NAME>OsAlarmAutostart</SHORT-NAME>
                                    <DEFINITION-REF DEST="ECUC-CHOICE-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart</DEFINITION-REF>
                                    <PARAMETER-VALUES>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmAlarmTime</DEFINITION-REF>
                                            <VALUE>3000</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmCycleTime</DEFINITION-REF>
                                            <VALUE>10000</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                    </PARAMETER-VALUES>
                                    <REFERENCE-VALUES>
                                        <ECUC-REFERENCE-VALUE>
                                            <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmAppModeRef</DEFINITION-REF>
                                            <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/appmode1</VALUE-REF>
                                        </ECUC-REFERENCE-VALUE>
                                    </REFERENCE-VALUES>
                                </ECUC-CONTAINER-VALUE>
                            </SUB-CONTAINERS>
                        </ECUC-CONTAINER-VALUE>
                        
                        
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>alarm3</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm</DEFINITION-REF>
                            <REFERENCE-VALUES>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmCounterRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/cnt2</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                            </REFERENCE-VALUES>
                            <SUB-CONTAINERS>
                                <ECUC-CONTAINER-VALUE>
                                    <SHORT-NAME>OsAlarmAction</SHORT-NAME>
                                    <DEFINITION-REF DEST="ECUC-CHOICE-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction</DEFINITION-REF>
                                    <SUB-CONTAINERS>
                                        <ECUC-CONTAINER-VALUE>
                                            <SHORT-NAME>OsAlarmActivateTask</SHORT-NAME>
                                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction/OsAlarmActivateTask</DEFINITION-REF>
                                            <REFERENCE-VALUES>
                                                <ECUC-REFERENCE-VALUE>
                                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAction/OsAlarmActivateTask/OsAlarmActivateTaskRef</DEFINITION-REF>
                                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/T3</VALUE-REF>
                                                </ECUC-REFERENCE-VALUE>
                                            </REFERENCE-VALUES>
                                        </ECUC-CONTAINER-VALUE>
                                    </SUB-CONTAINERS>
                                </ECUC-CONTAINER-VALUE>                               
                                <ECUC-CONTAINER-VALUE>
                                    <SHORT-NAME>OsAlarmAutostart</SHORT-NAME>
                                    <DEFINITION-REF DEST="ECUC-CHOICE-CONTAINER-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart</DEFINITION-REF>
                                    <PARAMETER-VALUES>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmAlarmTime</DEFINITION-REF>
                                            <VALUE>3000</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmCycleTime</DEFINITION-REF>
                                            <VALUE>10000</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                    </PARAMETER-VALUES>
                                    <REFERENCE-VALUES>
                                        <ECUC-REFERENCE-VALUE>
                                            <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsAlarm/OsAlarmAutostart/OsAlarmAppModeRef</DEFINITION-REF>
                                            <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/appmode1</VALUE-REF>
                                        </ECUC-REFERENCE-VALUE>
                                    </REFERENCE-VALUES>
                                </ECUC-CONTAINER-VALUE>
                            </SUB-CONTAINERS>
                        </ECUC-CONTAINER-VALUE>
                        
                        «/* Optionale Eigenschaft eines Tasks / Spinlocks */»
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>slock</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsSpinlock</DEFINITION-REF>
                        </ECUC-CONTAINER-VALUE>
                        
                        «/* Applikation = Container für alle OS Objekte (Tasks, ISRs, ...) */»
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>app1</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsApplication</DEFINITION-REF>
                            <REFERENCE-VALUES>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsAppTaskRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/T1</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsAppTaskRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/T2</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsAppAlarmRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/alarm1</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsAppAlarmRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/alarm2</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsAppCounterRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/cnt1</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsAppIsrRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/irq1</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-SYMBOLIC-NAME-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsApplicationCoreRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/EcuC/EcucHardware/EcucCoreDefinition_0</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                            </REFERENCE-VALUES>
                            
                            «/* Default Werte */»
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

                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>app2</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsApplication</DEFINITION-REF>
                            <REFERENCE-VALUES>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsAppTaskRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/T3</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsAppAlarmRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/alarm3</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsAppCounterRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/cnt2</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsAppIsrRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/irq2</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                
                                «/* Hier steht das eigentliche Deployment drin */»
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-SYMBOLIC-NAME-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsApplicationCoreRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/EcuC/EcucHardware/EcucCoreDefinition_9</VALUE-REF>
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

                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>app3</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">/AUTOSAR/Os/OsApplication</DEFINITION-REF>
                            <REFERENCE-VALUES>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsAppTaskRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/T4</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsAppIsrRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/Os/irq3</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-SYMBOLIC-NAME-REFERENCE-DEF">/AUTOSAR/Os/OsApplication/OsApplicationCoreRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">/MulticoreExample/EcuC/EcucHardware/EcucCoreDefinition_9</VALUE-REF>
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


                    </CONTAINERS>
                </ECUC-MODULE-CONFIGURATION-VALUES>
            </ELEMENTS>
        </AR-PACKAGE>
    </AR-PACKAGES>
</AUTOSAR>

    '''
   } 
}