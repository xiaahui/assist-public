package ch.hilbri.assist.mapping.exporter

import ch.hilbri.assist.model.MappingResult

class DeploymentAsARXML {
   def static String generate(MappingResult result) {
    '''
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<AUTOSAR>
    <AR-PACKAGES>
        <AR-PACKAGE>
            <SHORT-NAME>...</SHORT-NAME>
            <ELEMENTS>
                <ECUC-MODULE-CONFIGURATION-VALUES>
                    <SHORT-NAME>Os</SHORT-NAME>
                    <CONTAINERS>
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>...</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsAppMode</DEFINITION-REF>
                        </ECUC-CONTAINER-VALUE>
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>OsOS</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsOS</DEFINITION-REF>
                            <PARAMETER-VALUES>
                                <ECUC-TEXTUAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-ENUMERATION-PARAM-DEF">.../OsStatus</DEFINITION-REF>
                                    <VALUE>...</VALUE>
                                </ECUC-TEXTUAL-PARAM-VALUE>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">.../OsUseGetServiceId</DEFINITION-REF>
                                    <VALUE>...</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">.../OsUseParameterAccess</DEFINITION-REF>
                                    <VALUE>...</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">.../OsUseResScheduler</DEFINITION-REF>
                                    <VALUE>...</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                            </PARAMETER-VALUES>
                            <SUB-CONTAINERS>
                                <ECUC-CONTAINER-VALUE>
                                    <SHORT-NAME>OsHooks</SHORT-NAME>
                                    <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsHooks</DEFINITION-REF>
                                    <PARAMETER-VALUES>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">.../OsErrorHook</DEFINITION-REF>
                                            <VALUE>...</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">.../OsShutdownHook</DEFINITION-REF>
                                            <VALUE>...</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">.../OsStartupHook</DEFINITION-REF>
                                            <VALUE>...</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                    </PARAMETER-VALUES>
                                </ECUC-CONTAINER-VALUE>
                            </SUB-CONTAINERS>
                        </ECUC-CONTAINER-VALUE>
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>...</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsCounter</DEFINITION-REF>
                            <PARAMETER-VALUES>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">.../OsCounterMaxAllowedValue</DEFINITION-REF>
                                    <VALUE>...</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">.../OsCounterMinCycle</DEFINITION-REF>
                                    <VALUE>...</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">.../OsCounterTicksPerBase</DEFINITION-REF>
                                    <VALUE>...</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                            </PARAMETER-VALUES>
                        </ECUC-CONTAINER-VALUE>
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>...</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsIsr</DEFINITION-REF>
                            <PARAMETER-VALUES>
                                <ECUC-TEXTUAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-ENUMERATION-PARAM-DEF">.../OsIsrCategory</DEFINITION-REF>
                                    <VALUE>...</VALUE>
                                </ECUC-TEXTUAL-PARAM-VALUE>
                            </PARAMETER-VALUES>
                        </ECUC-CONTAINER-VALUE>
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>...</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsResource</DEFINITION-REF>
                            <PARAMETER-VALUES>
                                <ECUC-TEXTUAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-ENUMERATION-PARAM-DEF">.../OsResourceProperty</DEFINITION-REF>
                                    <VALUE>...</VALUE>
                                </ECUC-TEXTUAL-PARAM-VALUE>
                            </PARAMETER-VALUES>
                        </ECUC-CONTAINER-VALUE>
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>...</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsCore</DEFINITION-REF>
                            <REFERENCE-VALUES>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-SYMBOLIC-NAME-REFERENCE-DEF">.../OsCoreEcucCoreRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">...</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                            </REFERENCE-VALUES>
                        </ECUC-CONTAINER-VALUE>
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>...</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsTask</DEFINITION-REF>
                            <PARAMETER-VALUES>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">.../OsTaskActivation</DEFINITION-REF>
                                    <VALUE>...</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">.../OsTaskPriority</DEFINITION-REF>
                                    <VALUE>...</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                            </PARAMETER-VALUES>
                            <REFERENCE-VALUES>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">.../OsTaskResourceRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">...</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                            </REFERENCE-VALUES>
                            <SUB-CONTAINERS>
                                <ECUC-CONTAINER-VALUE>
                                    <SHORT-NAME>OsTaskAutostart</SHORT-NAME>
                                    <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsTaskAutostart</DEFINITION-REF>
                                </ECUC-CONTAINER-VALUE>
                            </SUB-CONTAINERS>
                        </ECUC-CONTAINER-VALUE>
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>...</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsApplication</DEFINITION-REF>
                            <REFERENCE-VALUES>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">.../OsAppTaskRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">...</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-SYMBOLIC-NAME-REFERENCE-DEF">.../OsApplicationCoreRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">...</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">.../OsAppIsrRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">...</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">.../OsAppCounterRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">...</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">.../OsAppIsrRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">...</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">.../OsAppAlarmRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">...</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                            </REFERENCE-VALUES>
                            <SUB-CONTAINERS>
                                <ECUC-CONTAINER-VALUE>
                                    <SHORT-NAME>OsApplicationHooks</SHORT-NAME>
                                    <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsApplicationHooks</DEFINITION-REF>
                                    <PARAMETER-VALUES>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">.../OsAppErrorHook</DEFINITION-REF>
                                            <VALUE>...</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">.../OsAppShutdownHook</DEFINITION-REF>
                                            <VALUE>...</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">.../OsAppStartupHook</DEFINITION-REF>
                                            <VALUE>...</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                    </PARAMETER-VALUES>
                                </ECUC-CONTAINER-VALUE>
                            </SUB-CONTAINERS>
                        </ECUC-CONTAINER-VALUE>
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>...</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsAlarm</DEFINITION-REF>
                            <REFERENCE-VALUES>
                                <ECUC-REFERENCE-VALUE>
                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">.../OsAlarmCounterRef</DEFINITION-REF>
                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">...</VALUE-REF>
                                </ECUC-REFERENCE-VALUE>
                            </REFERENCE-VALUES>
                            <SUB-CONTAINERS>
                                <ECUC-CONTAINER-VALUE>
                                    <SUB-CONTAINERS>
                                        <ECUC-CONTAINER-VALUE>
                                            <SHORT-NAME>OsAlarmSetEvent</SHORT-NAME>
                                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsAlarmSetEvent</DEFINITION-REF>
                                            <REFERENCE-VALUES>
                                                <ECUC-REFERENCE-VALUE>
                                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">.../OsAlarmSetEventRef</DEFINITION-REF>
                                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">...</VALUE-REF>
                                                </ECUC-REFERENCE-VALUE>
                                                <ECUC-REFERENCE-VALUE>
                                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">.../OsAlarmSetEventTaskRef</DEFINITION-REF>
                                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">...</VALUE-REF>
                                                </ECUC-REFERENCE-VALUE>
                                            </REFERENCE-VALUES>
                                        </ECUC-CONTAINER-VALUE>
                                        <ECUC-CONTAINER-VALUE>
                                            <SHORT-NAME>OsAlarmActivateTask</SHORT-NAME>
                                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsAlarmActivateTask</DEFINITION-REF>
                                            <REFERENCE-VALUES>
                                                <ECUC-REFERENCE-VALUE>
                                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">.../OsAlarmActivateTaskRef</DEFINITION-REF>
                                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">...</VALUE-REF>
                                                </ECUC-REFERENCE-VALUE>
                                            </REFERENCE-VALUES>
                                        </ECUC-CONTAINER-VALUE>
                                    </SUB-CONTAINERS>
                                </ECUC-CONTAINER-VALUE>
                            </SUB-CONTAINERS>
                        </ECUC-CONTAINER-VALUE>
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>...</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsEvent</DEFINITION-REF>
                        </ECUC-CONTAINER-VALUE>
                        <ECUC-CONTAINER-VALUE>
                            <SHORT-NAME>...</SHORT-NAME>
                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsScheduleTable</DEFINITION-REF>
                            <PARAMETER-VALUES>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">.../OsScheduleTableDuration</DEFINITION-REF>
                                    <VALUE>...</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                                <ECUC-NUMERICAL-PARAM-VALUE>
                                    <DEFINITION-REF DEST="ECUC-BOOLEAN-PARAM-DEF">.../OsScheduleTableRepeating</DEFINITION-REF>
                                    <VALUE>...</VALUE>
                                </ECUC-NUMERICAL-PARAM-VALUE>
                            </PARAMETER-VALUES>
                            <SUB-CONTAINERS>
                                <ECUC-CONTAINER-VALUE>
                                    <SHORT-NAME>OsScheduleTableSync</SHORT-NAME>
                                    <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsScheduleTableSync</DEFINITION-REF>
                                    <PARAMETER-VALUES>
                                        <ECUC-TEXTUAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-ENUMERATION-PARAM-DEF">.../OsScheduleTblSyncStrategy</DEFINITION-REF>
                                            <VALUE>...</VALUE>
                                        </ECUC-TEXTUAL-PARAM-VALUE>
                                    </PARAMETER-VALUES>
                                </ECUC-CONTAINER-VALUE>
                                <ECUC-CONTAINER-VALUE>
                                    <SHORT-NAME>...</SHORT-NAME>
                                    <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsScheduleTableExpiryPoint</DEFINITION-REF>
                                    <PARAMETER-VALUES>
                                        <ECUC-NUMERICAL-PARAM-VALUE>
                                            <DEFINITION-REF DEST="ECUC-INTEGER-PARAM-DEF">.../OsScheduleTblExpPointOffset</DEFINITION-REF>
                                            <VALUE>...</VALUE>
                                        </ECUC-NUMERICAL-PARAM-VALUE>
                                    </PARAMETER-VALUES>
                                    <SUB-CONTAINERS>
                                        <ECUC-CONTAINER-VALUE>
                                            <SHORT-NAME>OsScheduleTableTaskActivation</SHORT-NAME>
                                            <DEFINITION-REF DEST="ECUC-PARAM-CONF-CONTAINER-DEF">.../OsScheduleTableTaskActivation</DEFINITION-REF>
                                            <REFERENCE-VALUES>
                                                <ECUC-REFERENCE-VALUE>
                                                    <DEFINITION-REF DEST="ECUC-REFERENCE-DEF">.../OsScheduleTableActivateTaskRef</DEFINITION-REF>
                                                    <VALUE-REF DEST="ECUC-CONTAINER-VALUE">...</VALUE-REF>
                                                </ECUC-REFERENCE-VALUE>
                                            </REFERENCE-VALUES>
                                        </ECUC-CONTAINER-VALUE>
                                    </SUB-CONTAINERS>
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