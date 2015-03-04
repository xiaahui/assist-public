package ch.hilbri.assist.mappingdsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ch.hilbri.assist.mappingdsl.services.MappingDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMappingDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Global'", "'{'", "'System name'", "'='", "';'", "'}'", "'Interfaces'", "'InterfaceGroups'", "'Compartment'", "'Manufacturer'", "'PowerSupply'", "'Side'", "'Zone'", "'Generic properties'", "'RDC'", "'Type'", "'ESS'", "'Connector'", "'interface with type'", "'Group'", "','", "'Interface'", "'System'", "'SubAta'", "'Resource'", "'LineName'", "'WiringLane'", "'GrpInfo'", "'Route'", "'PwSup1'", "'EmhZone1'", "'Can'", "'Enhanced Local Bus'", "'Ethernet'", "'Analog'", "'Digital'", "'Serial'", "'CustomType0'", "'CustomType1'", "'CustomType2'", "'CustomType3'", "'CustomType4'", "'CustomType5'", "'CustomType6'", "'CustomType7'", "'CustomType8'", "'CustomType9'", "'CustomType10'", "'CustomType11'", "'CustomType12'", "'CustomType13'", "'CustomType14'", "'CustomType15'", "'CustomType16'", "'CustomType17'", "'CustomType18'", "'CustomType19'", "'CustomType20'", "'CustomType21'", "'CustomType22'", "'CustomType23'", "'CustomType24'", "'CustomType25'", "'CustomType26'", "'CustomType27'", "'CustomType28'", "'CustomType29'", "'CustomType30'", "'CustomType31'", "'CustomType32'", "'CustomType33'", "'CustomType34'", "'CustomType35'", "'CustomType36'", "'CustomType37'", "'CustomType38'", "'CustomType39'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalMappingDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMappingDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMappingDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g"; }



     	private MappingDSLGrammarAccess grammarAccess;
     	
        public InternalMappingDSLParser(TokenStream input, MappingDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AssistModel";	
       	}
       	
       	@Override
       	protected MappingDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAssistModel"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:68:1: entryRuleAssistModel returns [EObject current=null] : iv_ruleAssistModel= ruleAssistModel EOF ;
    public final EObject entryRuleAssistModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssistModel = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:69:2: (iv_ruleAssistModel= ruleAssistModel EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:70:2: iv_ruleAssistModel= ruleAssistModel EOF
            {
             newCompositeNode(grammarAccess.getAssistModelRule()); 
            pushFollow(FOLLOW_ruleAssistModel_in_entryRuleAssistModel75);
            iv_ruleAssistModel=ruleAssistModel();

            state._fsp--;

             current =iv_ruleAssistModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssistModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssistModel"


    // $ANTLR start "ruleAssistModel"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:77:1: ruleAssistModel returns [EObject current=null] : (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )+ otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_interfaces_10_0= ruleInterface ) )+ otherlv_11= '}' otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( (lv_interfaceGroups_14_0= ruleInterfaceGroup ) ) otherlv_15= '}' ) ;
    public final EObject ruleAssistModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_systemName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_compartments_7_0 = null;

        EObject lv_interfaces_10_0 = null;

        EObject lv_interfaceGroups_14_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:80:28: ( (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )+ otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_interfaces_10_0= ruleInterface ) )+ otherlv_11= '}' otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( (lv_interfaceGroups_14_0= ruleInterfaceGroup ) ) otherlv_15= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )+ otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_interfaces_10_0= ruleInterface ) )+ otherlv_11= '}' otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( (lv_interfaceGroups_14_0= ruleInterfaceGroup ) ) otherlv_15= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )+ otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_interfaces_10_0= ruleInterface ) )+ otherlv_11= '}' otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( (lv_interfaceGroups_14_0= ruleInterfaceGroup ) ) otherlv_15= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:3: otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )+ otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_interfaces_10_0= ruleInterface ) )+ otherlv_11= '}' otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( (lv_interfaceGroups_14_0= ruleInterfaceGroup ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAssistModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getAssistModelAccess().getGlobalKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel134); 

                	newLeafNode(otherlv_1, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleAssistModel146); 

                	newLeafNode(otherlv_2, grammarAccess.getAssistModelAccess().getSystemNameKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleAssistModel158); 

                	newLeafNode(otherlv_3, grammarAccess.getAssistModelAccess().getEqualsSignKeyword_3());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:97:1: ( (lv_systemName_4_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:98:1: (lv_systemName_4_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:98:1: (lv_systemName_4_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:99:3: lv_systemName_4_0= RULE_STRING
            {
            lv_systemName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssistModel175); 

            			newLeafNode(lv_systemName_4_0, grammarAccess.getAssistModelAccess().getSystemNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssistModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"systemName",
                    		lv_systemName_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleAssistModel192); 

                	newLeafNode(otherlv_5, grammarAccess.getAssistModelAccess().getSemicolonKeyword_5());
                
            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleAssistModel204); 

                	newLeafNode(otherlv_6, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_6());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:123:1: ( (lv_compartments_7_0= ruleCompartment ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:124:1: (lv_compartments_7_0= ruleCompartment )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:124:1: (lv_compartments_7_0= ruleCompartment )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:125:3: lv_compartments_7_0= ruleCompartment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getCompartmentsCompartmentParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompartment_in_ruleAssistModel225);
            	    lv_compartments_7_0=ruleCompartment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"compartments",
            	            		lv_compartments_7_0, 
            	            		"Compartment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleAssistModel238); 

                	newLeafNode(otherlv_8, grammarAccess.getAssistModelAccess().getInterfacesKeyword_8());
                
            otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel250); 

                	newLeafNode(otherlv_9, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_9());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:149:1: ( (lv_interfaces_10_0= ruleInterface ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==32) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:150:1: (lv_interfaces_10_0= ruleInterface )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:150:1: (lv_interfaces_10_0= ruleInterface )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:151:3: lv_interfaces_10_0= ruleInterface
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getInterfacesInterfaceParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterface_in_ruleAssistModel271);
            	    lv_interfaces_10_0=ruleInterface();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"interfaces",
            	            		lv_interfaces_10_0, 
            	            		"Interface");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleAssistModel284); 

                	newLeafNode(otherlv_11, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_11());
                
            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleAssistModel296); 

                	newLeafNode(otherlv_12, grammarAccess.getAssistModelAccess().getInterfaceGroupsKeyword_12());
                
            otherlv_13=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel308); 

                	newLeafNode(otherlv_13, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_13());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:179:1: ( (lv_interfaceGroups_14_0= ruleInterfaceGroup ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:180:1: (lv_interfaceGroups_14_0= ruleInterfaceGroup )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:180:1: (lv_interfaceGroups_14_0= ruleInterfaceGroup )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:181:3: lv_interfaceGroups_14_0= ruleInterfaceGroup
            {
             
            	        newCompositeNode(grammarAccess.getAssistModelAccess().getInterfaceGroupsInterfaceGroupParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleInterfaceGroup_in_ruleAssistModel329);
            lv_interfaceGroups_14_0=ruleInterfaceGroup();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
            	        }
                   		add(
                   			current, 
                   			"interfaceGroups",
                    		lv_interfaceGroups_14_0, 
                    		"InterfaceGroup");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleAssistModel341); 

                	newLeafNode(otherlv_15, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_15());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssistModel"


    // $ANTLR start "entryRuleCompartment"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:209:1: entryRuleCompartment returns [EObject current=null] : iv_ruleCompartment= ruleCompartment EOF ;
    public final EObject entryRuleCompartment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompartment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:210:2: (iv_ruleCompartment= ruleCompartment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:211:2: iv_ruleCompartment= ruleCompartment EOF
            {
             newCompositeNode(grammarAccess.getCompartmentRule()); 
            pushFollow(FOLLOW_ruleCompartment_in_entryRuleCompartment377);
            iv_ruleCompartment=ruleCompartment();

            state._fsp--;

             current =iv_ruleCompartment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartment387); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompartment"


    // $ANTLR start "ruleCompartment"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:218:1: ruleCompartment returns [EObject current=null] : (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_rdcs_19_0= ruleRDC ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleCompartment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_manufacturer_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_powerSupply_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_side_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_zone_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_rdcs_19_0 = null;

        EObject lv_metricParameters_22_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:221:28: ( (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_rdcs_19_0= ruleRDC ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:222:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_rdcs_19_0= ruleRDC ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:222:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_rdcs_19_0= ruleRDC ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:222:3: otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_rdcs_19_0= ruleRDC ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleCompartment424); 

                	newLeafNode(otherlv_0, grammarAccess.getCompartmentAccess().getCompartmentKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:226:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:227:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:227:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:228:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompartment441); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCompartmentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCompartmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCompartment458); 

                	newLeafNode(otherlv_2, grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:248:1: (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:248:3: otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleCompartment471); 

                        	newLeafNode(otherlv_3, grammarAccess.getCompartmentAccess().getManufacturerKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleCompartment483); 

                        	newLeafNode(otherlv_4, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:256:1: ( (lv_manufacturer_5_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:257:1: (lv_manufacturer_5_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:257:1: (lv_manufacturer_5_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:258:3: lv_manufacturer_5_0= RULE_STRING
                    {
                    lv_manufacturer_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment500); 

                    			newLeafNode(lv_manufacturer_5_0, grammarAccess.getCompartmentAccess().getManufacturerSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompartmentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"manufacturer",
                            		lv_manufacturer_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleCompartment517); 

                        	newLeafNode(otherlv_6, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:278:3: (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:278:5: otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleCompartment532); 

                        	newLeafNode(otherlv_7, grammarAccess.getCompartmentAccess().getPowerSupplyKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleCompartment544); 

                        	newLeafNode(otherlv_8, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_4_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:286:1: ( (lv_powerSupply_9_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:287:1: (lv_powerSupply_9_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:287:1: (lv_powerSupply_9_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:288:3: lv_powerSupply_9_0= RULE_STRING
                    {
                    lv_powerSupply_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment561); 

                    			newLeafNode(lv_powerSupply_9_0, grammarAccess.getCompartmentAccess().getPowerSupplySTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompartmentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"powerSupply",
                            		lv_powerSupply_9_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleCompartment578); 

                        	newLeafNode(otherlv_10, grammarAccess.getCompartmentAccess().getSemicolonKeyword_4_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:308:3: (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:308:5: otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleCompartment593); 

                        	newLeafNode(otherlv_11, grammarAccess.getCompartmentAccess().getSideKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleCompartment605); 

                        	newLeafNode(otherlv_12, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_5_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:316:1: ( (lv_side_13_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:317:1: (lv_side_13_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:317:1: (lv_side_13_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:318:3: lv_side_13_0= RULE_STRING
                    {
                    lv_side_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment622); 

                    			newLeafNode(lv_side_13_0, grammarAccess.getCompartmentAccess().getSideSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompartmentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"side",
                            		lv_side_13_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleCompartment639); 

                        	newLeafNode(otherlv_14, grammarAccess.getCompartmentAccess().getSemicolonKeyword_5_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:338:3: (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:338:5: otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_23_in_ruleCompartment654); 

                        	newLeafNode(otherlv_15, grammarAccess.getCompartmentAccess().getZoneKeyword_6_0());
                        
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleCompartment666); 

                        	newLeafNode(otherlv_16, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_6_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:346:1: ( (lv_zone_17_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:347:1: (lv_zone_17_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:347:1: (lv_zone_17_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:348:3: lv_zone_17_0= RULE_STRING
                    {
                    lv_zone_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment683); 

                    			newLeafNode(lv_zone_17_0, grammarAccess.getCompartmentAccess().getZoneSTRINGTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompartmentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"zone",
                            		lv_zone_17_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleCompartment700); 

                        	newLeafNode(otherlv_18, grammarAccess.getCompartmentAccess().getSemicolonKeyword_6_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:368:3: ( (lv_rdcs_19_0= ruleRDC ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:369:1: (lv_rdcs_19_0= ruleRDC )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:369:1: (lv_rdcs_19_0= ruleRDC )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:370:3: lv_rdcs_19_0= ruleRDC
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompartmentAccess().getRdcsRDCParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRDC_in_ruleCompartment723);
            	    lv_rdcs_19_0=ruleRDC();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompartmentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rdcs",
            	            		lv_rdcs_19_0, 
            	            		"RDC");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:386:3: (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:386:5: otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}'
                    {
                    otherlv_20=(Token)match(input,24,FOLLOW_24_in_ruleCompartment737); 

                        	newLeafNode(otherlv_20, grammarAccess.getCompartmentAccess().getGenericPropertiesKeyword_8_0());
                        
                    otherlv_21=(Token)match(input,12,FOLLOW_12_in_ruleCompartment749); 

                        	newLeafNode(otherlv_21, grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:394:1: ( (lv_metricParameters_22_0= ruleMetricParameter ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_STRING) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:395:1: (lv_metricParameters_22_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:395:1: (lv_metricParameters_22_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:396:3: lv_metricParameters_22_0= ruleMetricParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCompartmentAccess().getMetricParametersMetricParameterParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleCompartment770);
                    	    lv_metricParameters_22_0=ruleMetricParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCompartmentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"metricParameters",
                    	            		lv_metricParameters_22_0, 
                    	            		"MetricParameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_16_in_ruleCompartment783); 

                        	newLeafNode(otherlv_23, grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_8_3());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_16_in_ruleCompartment797); 

                	newLeafNode(otherlv_24, grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompartment"


    // $ANTLR start "entryRuleRDC"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:428:1: entryRuleRDC returns [EObject current=null] : iv_ruleRDC= ruleRDC EOF ;
    public final EObject entryRuleRDC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDC = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:429:2: (iv_ruleRDC= ruleRDC EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:430:2: iv_ruleRDC= ruleRDC EOF
            {
             newCompositeNode(grammarAccess.getRDCRule()); 
            pushFollow(FOLLOW_ruleRDC_in_entryRuleRDC833);
            iv_ruleRDC=ruleRDC();

            state._fsp--;

             current =iv_ruleRDC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDC843); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRDC"


    // $ANTLR start "ruleRDC"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:437:1: ruleRDC returns [EObject current=null] : (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Type' otherlv_12= '=' ( (lv_rdcType_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'ESS' otherlv_16= '=' ( (lv_ess_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_connectors_19_0= ruleConnector ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleRDC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_manufacturer_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_powerSupply_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_rdcType_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_ess_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_connectors_19_0 = null;

        EObject lv_metricParameters_22_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:440:28: ( (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Type' otherlv_12= '=' ( (lv_rdcType_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'ESS' otherlv_16= '=' ( (lv_ess_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_connectors_19_0= ruleConnector ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:441:1: (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Type' otherlv_12= '=' ( (lv_rdcType_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'ESS' otherlv_16= '=' ( (lv_ess_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_connectors_19_0= ruleConnector ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:441:1: (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Type' otherlv_12= '=' ( (lv_rdcType_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'ESS' otherlv_16= '=' ( (lv_ess_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_connectors_19_0= ruleConnector ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:441:3: otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Type' otherlv_12= '=' ( (lv_rdcType_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'ESS' otherlv_16= '=' ( (lv_ess_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_connectors_19_0= ruleConnector ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleRDC880); 

                	newLeafNode(otherlv_0, grammarAccess.getRDCAccess().getRDCKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:445:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:446:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:446:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:447:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRDC897); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRDCAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRDCRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRDC914); 

                	newLeafNode(otherlv_2, grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:467:1: (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:467:3: otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleRDC927); 

                        	newLeafNode(otherlv_3, grammarAccess.getRDCAccess().getManufacturerKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleRDC939); 

                        	newLeafNode(otherlv_4, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:475:1: ( (lv_manufacturer_5_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:476:1: (lv_manufacturer_5_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:476:1: (lv_manufacturer_5_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:477:3: lv_manufacturer_5_0= RULE_STRING
                    {
                    lv_manufacturer_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC956); 

                    			newLeafNode(lv_manufacturer_5_0, grammarAccess.getRDCAccess().getManufacturerSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRDCRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"manufacturer",
                            		lv_manufacturer_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleRDC973); 

                        	newLeafNode(otherlv_6, grammarAccess.getRDCAccess().getSemicolonKeyword_3_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:497:3: (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:497:5: otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleRDC988); 

                        	newLeafNode(otherlv_7, grammarAccess.getRDCAccess().getPowerSupplyKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleRDC1000); 

                        	newLeafNode(otherlv_8, grammarAccess.getRDCAccess().getEqualsSignKeyword_4_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:505:1: ( (lv_powerSupply_9_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:506:1: (lv_powerSupply_9_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:506:1: (lv_powerSupply_9_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:507:3: lv_powerSupply_9_0= RULE_STRING
                    {
                    lv_powerSupply_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1017); 

                    			newLeafNode(lv_powerSupply_9_0, grammarAccess.getRDCAccess().getPowerSupplySTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRDCRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"powerSupply",
                            		lv_powerSupply_9_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleRDC1034); 

                        	newLeafNode(otherlv_10, grammarAccess.getRDCAccess().getSemicolonKeyword_4_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:527:3: (otherlv_11= 'Type' otherlv_12= '=' ( (lv_rdcType_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:527:5: otherlv_11= 'Type' otherlv_12= '=' ( (lv_rdcType_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_26_in_ruleRDC1049); 

                        	newLeafNode(otherlv_11, grammarAccess.getRDCAccess().getTypeKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleRDC1061); 

                        	newLeafNode(otherlv_12, grammarAccess.getRDCAccess().getEqualsSignKeyword_5_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:535:1: ( (lv_rdcType_13_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:536:1: (lv_rdcType_13_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:536:1: (lv_rdcType_13_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:537:3: lv_rdcType_13_0= RULE_STRING
                    {
                    lv_rdcType_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1078); 

                    			newLeafNode(lv_rdcType_13_0, grammarAccess.getRDCAccess().getRdcTypeSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRDCRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rdcType",
                            		lv_rdcType_13_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleRDC1095); 

                        	newLeafNode(otherlv_14, grammarAccess.getRDCAccess().getSemicolonKeyword_5_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:557:3: (otherlv_15= 'ESS' otherlv_16= '=' ( (lv_ess_17_0= RULE_STRING ) ) otherlv_18= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:557:5: otherlv_15= 'ESS' otherlv_16= '=' ( (lv_ess_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,27,FOLLOW_27_in_ruleRDC1110); 

                        	newLeafNode(otherlv_15, grammarAccess.getRDCAccess().getESSKeyword_6_0());
                        
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleRDC1122); 

                        	newLeafNode(otherlv_16, grammarAccess.getRDCAccess().getEqualsSignKeyword_6_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:565:1: ( (lv_ess_17_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:566:1: (lv_ess_17_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:566:1: (lv_ess_17_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:567:3: lv_ess_17_0= RULE_STRING
                    {
                    lv_ess_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1139); 

                    			newLeafNode(lv_ess_17_0, grammarAccess.getRDCAccess().getEssSTRINGTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRDCRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ess",
                            		lv_ess_17_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleRDC1156); 

                        	newLeafNode(otherlv_18, grammarAccess.getRDCAccess().getSemicolonKeyword_6_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:587:3: ( (lv_connectors_19_0= ruleConnector ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:588:1: (lv_connectors_19_0= ruleConnector )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:588:1: (lv_connectors_19_0= ruleConnector )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:589:3: lv_connectors_19_0= ruleConnector
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRDCAccess().getConnectorsConnectorParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnector_in_ruleRDC1179);
            	    lv_connectors_19_0=ruleConnector();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRDCRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"connectors",
            	            		lv_connectors_19_0, 
            	            		"Connector");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:605:3: (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:605:5: otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}'
                    {
                    otherlv_20=(Token)match(input,24,FOLLOW_24_in_ruleRDC1193); 

                        	newLeafNode(otherlv_20, grammarAccess.getRDCAccess().getGenericPropertiesKeyword_8_0());
                        
                    otherlv_21=(Token)match(input,12,FOLLOW_12_in_ruleRDC1205); 

                        	newLeafNode(otherlv_21, grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:613:1: ( (lv_metricParameters_22_0= ruleMetricParameter ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_STRING) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:614:1: (lv_metricParameters_22_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:614:1: (lv_metricParameters_22_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:615:3: lv_metricParameters_22_0= ruleMetricParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRDCAccess().getMetricParametersMetricParameterParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleRDC1226);
                    	    lv_metricParameters_22_0=ruleMetricParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRDCRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"metricParameters",
                    	            		lv_metricParameters_22_0, 
                    	            		"MetricParameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_16_in_ruleRDC1239); 

                        	newLeafNode(otherlv_23, grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_8_3());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_16_in_ruleRDC1253); 

                	newLeafNode(otherlv_24, grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRDC"


    // $ANTLR start "entryRuleConnector"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:647:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:648:2: (iv_ruleConnector= ruleConnector EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:649:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector1289);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector1299); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:656:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableInterfaces_3_0= ruleAvailableInterface ) )* otherlv_4= '}' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_availableInterfaces_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:659:28: ( (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableInterfaces_3_0= ruleAvailableInterface ) )* otherlv_4= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:660:1: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableInterfaces_3_0= ruleAvailableInterface ) )* otherlv_4= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:660:1: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableInterfaces_3_0= ruleAvailableInterface ) )* otherlv_4= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:660:3: otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableInterfaces_3_0= ruleAvailableInterface ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleConnector1336); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:664:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:665:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:665:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:666:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnector1353); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConnector1370); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:686:1: ( (lv_availableInterfaces_3_0= ruleAvailableInterface ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_INT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:687:1: (lv_availableInterfaces_3_0= ruleAvailableInterface )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:687:1: (lv_availableInterfaces_3_0= ruleAvailableInterface )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:688:3: lv_availableInterfaces_3_0= ruleAvailableInterface
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectorAccess().getAvailableInterfacesAvailableInterfaceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAvailableInterface_in_ruleConnector1391);
            	    lv_availableInterfaces_3_0=ruleAvailableInterface();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConnectorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"availableInterfaces",
            	            		lv_availableInterfaces_3_0, 
            	            		"AvailableInterface");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleConnector1404); 

                	newLeafNode(otherlv_4, grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleAvailableInterface"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:716:1: entryRuleAvailableInterface returns [EObject current=null] : iv_ruleAvailableInterface= ruleAvailableInterface EOF ;
    public final EObject entryRuleAvailableInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvailableInterface = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:717:2: (iv_ruleAvailableInterface= ruleAvailableInterface EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:718:2: iv_ruleAvailableInterface= ruleAvailableInterface EOF
            {
             newCompositeNode(grammarAccess.getAvailableInterfaceRule()); 
            pushFollow(FOLLOW_ruleAvailableInterface_in_entryRuleAvailableInterface1440);
            iv_ruleAvailableInterface=ruleAvailableInterface();

            state._fsp--;

             current =iv_ruleAvailableInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvailableInterface1450); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAvailableInterface"


    // $ANTLR start "ruleAvailableInterface"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:725:1: ruleAvailableInterface returns [EObject current=null] : ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'interface with type' ( (lv_interfaceType_2_0= ruleInterfaceType ) ) otherlv_3= ';' ) ;
    public final EObject ruleAvailableInterface() throws RecognitionException {
        EObject current = null;

        Token lv_count_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_interfaceType_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:728:28: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'interface with type' ( (lv_interfaceType_2_0= ruleInterfaceType ) ) otherlv_3= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:729:1: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'interface with type' ( (lv_interfaceType_2_0= ruleInterfaceType ) ) otherlv_3= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:729:1: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'interface with type' ( (lv_interfaceType_2_0= ruleInterfaceType ) ) otherlv_3= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:729:2: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'interface with type' ( (lv_interfaceType_2_0= ruleInterfaceType ) ) otherlv_3= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:729:2: ( (lv_count_0_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:730:1: (lv_count_0_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:730:1: (lv_count_0_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:731:3: lv_count_0_0= RULE_INT
            {
            lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAvailableInterface1492); 

            			newLeafNode(lv_count_0_0, grammarAccess.getAvailableInterfaceAccess().getCountINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAvailableInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"count",
                    		lv_count_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleAvailableInterface1509); 

                	newLeafNode(otherlv_1, grammarAccess.getAvailableInterfaceAccess().getInterfaceWithTypeKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:751:1: ( (lv_interfaceType_2_0= ruleInterfaceType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:752:1: (lv_interfaceType_2_0= ruleInterfaceType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:752:1: (lv_interfaceType_2_0= ruleInterfaceType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:753:3: lv_interfaceType_2_0= ruleInterfaceType
            {
             
            	        newCompositeNode(grammarAccess.getAvailableInterfaceAccess().getInterfaceTypeInterfaceTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInterfaceType_in_ruleAvailableInterface1530);
            lv_interfaceType_2_0=ruleInterfaceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAvailableInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"interfaceType",
                    		lv_interfaceType_2_0, 
                    		"InterfaceType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleAvailableInterface1542); 

                	newLeafNode(otherlv_3, grammarAccess.getAvailableInterfaceAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAvailableInterface"


    // $ANTLR start "entryRuleInterfaceGroup"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:781:1: entryRuleInterfaceGroup returns [EObject current=null] : iv_ruleInterfaceGroup= ruleInterfaceGroup EOF ;
    public final EObject entryRuleInterfaceGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceGroup = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:782:2: (iv_ruleInterfaceGroup= ruleInterfaceGroup EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:783:2: iv_ruleInterfaceGroup= ruleInterfaceGroup EOF
            {
             newCompositeNode(grammarAccess.getInterfaceGroupRule()); 
            pushFollow(FOLLOW_ruleInterfaceGroup_in_entryRuleInterfaceGroup1578);
            iv_ruleInterfaceGroup=ruleInterfaceGroup();

            state._fsp--;

             current =iv_ruleInterfaceGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceGroup1588); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceGroup"


    // $ANTLR start "ruleInterfaceGroup"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:790:1: ruleInterfaceGroup returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' ) ;
    public final EObject ruleInterfaceGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:793:28: ( (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:794:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:794:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:794:3: otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleInterfaceGroup1625); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceGroupAccess().getGroupKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:798:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:799:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:799:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:800:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceGroup1642); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInterfaceGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInterfaceGroup1659); 

                	newLeafNode(otherlv_2, grammarAccess.getInterfaceGroupAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:820:1: ( (otherlv_3= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:821:1: (otherlv_3= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:821:1: (otherlv_3= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:822:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceGroupRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceGroup1679); 

            		newLeafNode(otherlv_3, grammarAccess.getInterfaceGroupAccess().getInterfacesInterfaceCrossReference_3_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:833:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:833:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleInterfaceGroup1692); 

            	        	newLeafNode(otherlv_4, grammarAccess.getInterfaceGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:837:1: ( (otherlv_5= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:838:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:838:1: (otherlv_5= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:839:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInterfaceGroupRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceGroup1712); 

            	    		newLeafNode(otherlv_5, grammarAccess.getInterfaceGroupAccess().getInterfacesInterfaceCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleInterfaceGroup1726); 

                	newLeafNode(otherlv_6, grammarAccess.getInterfaceGroupAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceGroup"


    // $ANTLR start "entryRuleInterface"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:862:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:863:2: (iv_ruleInterface= ruleInterface EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:864:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface1762);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface1772); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:871:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'System' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleInterfaceType ) ) otherlv_42= ';' )? (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )? otherlv_47= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_system_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_subAta_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_resource_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_lineName_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_wiringLane_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_grpInfo_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_route_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_pwSup1_33_0=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token lv_emhZone1_37_0=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Enumerator lv_ioType_41_0 = null;

        EObject lv_metricParameters_45_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:874:28: ( (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'System' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleInterfaceType ) ) otherlv_42= ';' )? (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )? otherlv_47= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:875:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'System' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleInterfaceType ) ) otherlv_42= ';' )? (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )? otherlv_47= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:875:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'System' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleInterfaceType ) ) otherlv_42= ';' )? (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )? otherlv_47= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:875:3: otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'System' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleInterfaceType ) ) otherlv_42= ';' )? (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )? otherlv_47= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleInterface1809); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:879:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:880:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:880:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:881:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface1826); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInterface1843); 

                	newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:901:1: (otherlv_3= 'System' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:901:3: otherlv_3= 'System' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleInterface1856); 

                        	newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getSystemKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleInterface1868); 

                        	newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getEqualsSignKeyword_3_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:909:1: ( (lv_system_5_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:910:1: (lv_system_5_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:910:1: (lv_system_5_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:911:3: lv_system_5_0= RULE_STRING
                    {
                    lv_system_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterface1885); 

                    			newLeafNode(lv_system_5_0, grammarAccess.getInterfaceAccess().getSystemSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"system",
                            		lv_system_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleInterface1902); 

                        	newLeafNode(otherlv_6, grammarAccess.getInterfaceAccess().getSemicolonKeyword_3_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:931:3: (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:931:5: otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleInterface1917); 

                        	newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getSubAtaKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleInterface1929); 

                        	newLeafNode(otherlv_8, grammarAccess.getInterfaceAccess().getEqualsSignKeyword_4_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:939:1: ( (lv_subAta_9_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:940:1: (lv_subAta_9_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:940:1: (lv_subAta_9_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:941:3: lv_subAta_9_0= RULE_STRING
                    {
                    lv_subAta_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterface1946); 

                    			newLeafNode(lv_subAta_9_0, grammarAccess.getInterfaceAccess().getSubAtaSTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"subAta",
                            		lv_subAta_9_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleInterface1963); 

                        	newLeafNode(otherlv_10, grammarAccess.getInterfaceAccess().getSemicolonKeyword_4_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:961:3: (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:961:5: otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,35,FOLLOW_35_in_ruleInterface1978); 

                        	newLeafNode(otherlv_11, grammarAccess.getInterfaceAccess().getResourceKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleInterface1990); 

                        	newLeafNode(otherlv_12, grammarAccess.getInterfaceAccess().getEqualsSignKeyword_5_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:969:1: ( (lv_resource_13_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:970:1: (lv_resource_13_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:970:1: (lv_resource_13_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:971:3: lv_resource_13_0= RULE_STRING
                    {
                    lv_resource_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterface2007); 

                    			newLeafNode(lv_resource_13_0, grammarAccess.getInterfaceAccess().getResourceSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"resource",
                            		lv_resource_13_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleInterface2024); 

                        	newLeafNode(otherlv_14, grammarAccess.getInterfaceAccess().getSemicolonKeyword_5_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:991:3: (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:991:5: otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,36,FOLLOW_36_in_ruleInterface2039); 

                        	newLeafNode(otherlv_15, grammarAccess.getInterfaceAccess().getLineNameKeyword_6_0());
                        
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleInterface2051); 

                        	newLeafNode(otherlv_16, grammarAccess.getInterfaceAccess().getEqualsSignKeyword_6_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:999:1: ( (lv_lineName_17_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1000:1: (lv_lineName_17_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1000:1: (lv_lineName_17_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1001:3: lv_lineName_17_0= RULE_STRING
                    {
                    lv_lineName_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterface2068); 

                    			newLeafNode(lv_lineName_17_0, grammarAccess.getInterfaceAccess().getLineNameSTRINGTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lineName",
                            		lv_lineName_17_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleInterface2085); 

                        	newLeafNode(otherlv_18, grammarAccess.getInterfaceAccess().getSemicolonKeyword_6_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1021:3: (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1021:5: otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';'
                    {
                    otherlv_19=(Token)match(input,37,FOLLOW_37_in_ruleInterface2100); 

                        	newLeafNode(otherlv_19, grammarAccess.getInterfaceAccess().getWiringLaneKeyword_7_0());
                        
                    otherlv_20=(Token)match(input,14,FOLLOW_14_in_ruleInterface2112); 

                        	newLeafNode(otherlv_20, grammarAccess.getInterfaceAccess().getEqualsSignKeyword_7_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1029:1: ( (lv_wiringLane_21_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1030:1: (lv_wiringLane_21_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1030:1: (lv_wiringLane_21_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1031:3: lv_wiringLane_21_0= RULE_STRING
                    {
                    lv_wiringLane_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterface2129); 

                    			newLeafNode(lv_wiringLane_21_0, grammarAccess.getInterfaceAccess().getWiringLaneSTRINGTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"wiringLane",
                            		lv_wiringLane_21_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_22=(Token)match(input,15,FOLLOW_15_in_ruleInterface2146); 

                        	newLeafNode(otherlv_22, grammarAccess.getInterfaceAccess().getSemicolonKeyword_7_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1051:3: (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1051:5: otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';'
                    {
                    otherlv_23=(Token)match(input,38,FOLLOW_38_in_ruleInterface2161); 

                        	newLeafNode(otherlv_23, grammarAccess.getInterfaceAccess().getGrpInfoKeyword_8_0());
                        
                    otherlv_24=(Token)match(input,14,FOLLOW_14_in_ruleInterface2173); 

                        	newLeafNode(otherlv_24, grammarAccess.getInterfaceAccess().getEqualsSignKeyword_8_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1059:1: ( (lv_grpInfo_25_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1060:1: (lv_grpInfo_25_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1060:1: (lv_grpInfo_25_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1061:3: lv_grpInfo_25_0= RULE_STRING
                    {
                    lv_grpInfo_25_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterface2190); 

                    			newLeafNode(lv_grpInfo_25_0, grammarAccess.getInterfaceAccess().getGrpInfoSTRINGTerminalRuleCall_8_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"grpInfo",
                            		lv_grpInfo_25_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_26=(Token)match(input,15,FOLLOW_15_in_ruleInterface2207); 

                        	newLeafNode(otherlv_26, grammarAccess.getInterfaceAccess().getSemicolonKeyword_8_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1081:3: (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1081:5: otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';'
                    {
                    otherlv_27=(Token)match(input,39,FOLLOW_39_in_ruleInterface2222); 

                        	newLeafNode(otherlv_27, grammarAccess.getInterfaceAccess().getRouteKeyword_9_0());
                        
                    otherlv_28=(Token)match(input,14,FOLLOW_14_in_ruleInterface2234); 

                        	newLeafNode(otherlv_28, grammarAccess.getInterfaceAccess().getEqualsSignKeyword_9_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1089:1: ( (lv_route_29_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1090:1: (lv_route_29_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1090:1: (lv_route_29_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1091:3: lv_route_29_0= RULE_STRING
                    {
                    lv_route_29_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterface2251); 

                    			newLeafNode(lv_route_29_0, grammarAccess.getInterfaceAccess().getRouteSTRINGTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"route",
                            		lv_route_29_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_30=(Token)match(input,15,FOLLOW_15_in_ruleInterface2268); 

                        	newLeafNode(otherlv_30, grammarAccess.getInterfaceAccess().getSemicolonKeyword_9_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1111:3: (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1111:5: otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';'
                    {
                    otherlv_31=(Token)match(input,40,FOLLOW_40_in_ruleInterface2283); 

                        	newLeafNode(otherlv_31, grammarAccess.getInterfaceAccess().getPwSup1Keyword_10_0());
                        
                    otherlv_32=(Token)match(input,14,FOLLOW_14_in_ruleInterface2295); 

                        	newLeafNode(otherlv_32, grammarAccess.getInterfaceAccess().getEqualsSignKeyword_10_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1119:1: ( (lv_pwSup1_33_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1120:1: (lv_pwSup1_33_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1120:1: (lv_pwSup1_33_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1121:3: lv_pwSup1_33_0= RULE_STRING
                    {
                    lv_pwSup1_33_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterface2312); 

                    			newLeafNode(lv_pwSup1_33_0, grammarAccess.getInterfaceAccess().getPwSup1STRINGTerminalRuleCall_10_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"pwSup1",
                            		lv_pwSup1_33_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_34=(Token)match(input,15,FOLLOW_15_in_ruleInterface2329); 

                        	newLeafNode(otherlv_34, grammarAccess.getInterfaceAccess().getSemicolonKeyword_10_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1141:3: (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1141:5: otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';'
                    {
                    otherlv_35=(Token)match(input,41,FOLLOW_41_in_ruleInterface2344); 

                        	newLeafNode(otherlv_35, grammarAccess.getInterfaceAccess().getEmhZone1Keyword_11_0());
                        
                    otherlv_36=(Token)match(input,14,FOLLOW_14_in_ruleInterface2356); 

                        	newLeafNode(otherlv_36, grammarAccess.getInterfaceAccess().getEqualsSignKeyword_11_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1149:1: ( (lv_emhZone1_37_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1150:1: (lv_emhZone1_37_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1150:1: (lv_emhZone1_37_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1151:3: lv_emhZone1_37_0= RULE_STRING
                    {
                    lv_emhZone1_37_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterface2373); 

                    			newLeafNode(lv_emhZone1_37_0, grammarAccess.getInterfaceAccess().getEmhZone1STRINGTerminalRuleCall_11_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"emhZone1",
                            		lv_emhZone1_37_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_38=(Token)match(input,15,FOLLOW_15_in_ruleInterface2390); 

                        	newLeafNode(otherlv_38, grammarAccess.getInterfaceAccess().getSemicolonKeyword_11_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1171:3: (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleInterfaceType ) ) otherlv_42= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1171:5: otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleInterfaceType ) ) otherlv_42= ';'
                    {
                    otherlv_39=(Token)match(input,26,FOLLOW_26_in_ruleInterface2405); 

                        	newLeafNode(otherlv_39, grammarAccess.getInterfaceAccess().getTypeKeyword_12_0());
                        
                    otherlv_40=(Token)match(input,14,FOLLOW_14_in_ruleInterface2417); 

                        	newLeafNode(otherlv_40, grammarAccess.getInterfaceAccess().getEqualsSignKeyword_12_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1179:1: ( (lv_ioType_41_0= ruleInterfaceType ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1180:1: (lv_ioType_41_0= ruleInterfaceType )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1180:1: (lv_ioType_41_0= ruleInterfaceType )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1181:3: lv_ioType_41_0= ruleInterfaceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getInterfaceAccess().getIoTypeInterfaceTypeEnumRuleCall_12_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterfaceType_in_ruleInterface2438);
                    lv_ioType_41_0=ruleInterfaceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	        }
                           		set(
                           			current, 
                           			"ioType",
                            		lv_ioType_41_0, 
                            		"InterfaceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_42=(Token)match(input,15,FOLLOW_15_in_ruleInterface2450); 

                        	newLeafNode(otherlv_42, grammarAccess.getInterfaceAccess().getSemicolonKeyword_12_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1201:3: (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1201:5: otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}'
                    {
                    otherlv_43=(Token)match(input,24,FOLLOW_24_in_ruleInterface2465); 

                        	newLeafNode(otherlv_43, grammarAccess.getInterfaceAccess().getGenericPropertiesKeyword_13_0());
                        
                    otherlv_44=(Token)match(input,12,FOLLOW_12_in_ruleInterface2477); 

                        	newLeafNode(otherlv_44, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1209:1: ( (lv_metricParameters_45_0= ruleMetricParameter ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_STRING) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1210:1: (lv_metricParameters_45_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1210:1: (lv_metricParameters_45_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1211:3: lv_metricParameters_45_0= ruleMetricParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInterfaceAccess().getMetricParametersMetricParameterParserRuleCall_13_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleInterface2498);
                    	    lv_metricParameters_45_0=ruleMetricParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"metricParameters",
                    	            		lv_metricParameters_45_0, 
                    	            		"MetricParameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_46=(Token)match(input,16,FOLLOW_16_in_ruleInterface2511); 

                        	newLeafNode(otherlv_46, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_13_3());
                        

                    }
                    break;

            }

            otherlv_47=(Token)match(input,16,FOLLOW_16_in_ruleInterface2525); 

                	newLeafNode(otherlv_47, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleMetricParameter"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1243:1: entryRuleMetricParameter returns [EObject current=null] : iv_ruleMetricParameter= ruleMetricParameter EOF ;
    public final EObject entryRuleMetricParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricParameter = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1244:2: (iv_ruleMetricParameter= ruleMetricParameter EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1245:2: iv_ruleMetricParameter= ruleMetricParameter EOF
            {
             newCompositeNode(grammarAccess.getMetricParameterRule()); 
            pushFollow(FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter2561);
            iv_ruleMetricParameter=ruleMetricParameter();

            state._fsp--;

             current =iv_ruleMetricParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricParameter2571); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetricParameter"


    // $ANTLR start "ruleMetricParameter"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1252:1: ruleMetricParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) ;
    public final EObject ruleMetricParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1255:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1256:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1256:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1256:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1256:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1257:1: (lv_name_0_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1257:1: (lv_name_0_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1258:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetricParameter2613); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMetricParameterAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetricParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleMetricParameter2630); 

                	newLeafNode(otherlv_1, grammarAccess.getMetricParameterAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1278:1: ( (lv_value_2_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1279:1: (lv_value_2_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1279:1: (lv_value_2_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1280:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMetricParameter2647); 

            			newLeafNode(lv_value_2_0, grammarAccess.getMetricParameterAccess().getValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetricParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleMetricParameter2664); 

                	newLeafNode(otherlv_3, grammarAccess.getMetricParameterAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetricParameter"


    // $ANTLR start "ruleInterfaceType"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1310:1: ruleInterfaceType returns [Enumerator current=null] : ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'CustomType0' ) | (enumLiteral_7= 'CustomType1' ) | (enumLiteral_8= 'CustomType2' ) | (enumLiteral_9= 'CustomType3' ) | (enumLiteral_10= 'CustomType4' ) | (enumLiteral_11= 'CustomType5' ) | (enumLiteral_12= 'CustomType6' ) | (enumLiteral_13= 'CustomType7' ) | (enumLiteral_14= 'CustomType8' ) | (enumLiteral_15= 'CustomType9' ) | (enumLiteral_16= 'CustomType10' ) | (enumLiteral_17= 'CustomType11' ) | (enumLiteral_18= 'CustomType12' ) | (enumLiteral_19= 'CustomType13' ) | (enumLiteral_20= 'CustomType14' ) | (enumLiteral_21= 'CustomType15' ) | (enumLiteral_22= 'CustomType16' ) | (enumLiteral_23= 'CustomType17' ) | (enumLiteral_24= 'CustomType18' ) | (enumLiteral_25= 'CustomType19' ) | (enumLiteral_26= 'CustomType20' ) | (enumLiteral_27= 'CustomType21' ) | (enumLiteral_28= 'CustomType22' ) | (enumLiteral_29= 'CustomType23' ) | (enumLiteral_30= 'CustomType24' ) | (enumLiteral_31= 'CustomType25' ) | (enumLiteral_32= 'CustomType26' ) | (enumLiteral_33= 'CustomType27' ) | (enumLiteral_34= 'CustomType28' ) | (enumLiteral_35= 'CustomType29' ) | (enumLiteral_36= 'CustomType30' ) | (enumLiteral_37= 'CustomType31' ) | (enumLiteral_38= 'CustomType32' ) | (enumLiteral_39= 'CustomType33' ) | (enumLiteral_40= 'CustomType34' ) | (enumLiteral_41= 'CustomType35' ) | (enumLiteral_42= 'CustomType36' ) | (enumLiteral_43= 'CustomType37' ) | (enumLiteral_44= 'CustomType38' ) | (enumLiteral_45= 'CustomType39' ) ) ;
    public final Enumerator ruleInterfaceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;
        Token enumLiteral_23=null;
        Token enumLiteral_24=null;
        Token enumLiteral_25=null;
        Token enumLiteral_26=null;
        Token enumLiteral_27=null;
        Token enumLiteral_28=null;
        Token enumLiteral_29=null;
        Token enumLiteral_30=null;
        Token enumLiteral_31=null;
        Token enumLiteral_32=null;
        Token enumLiteral_33=null;
        Token enumLiteral_34=null;
        Token enumLiteral_35=null;
        Token enumLiteral_36=null;
        Token enumLiteral_37=null;
        Token enumLiteral_38=null;
        Token enumLiteral_39=null;
        Token enumLiteral_40=null;
        Token enumLiteral_41=null;
        Token enumLiteral_42=null;
        Token enumLiteral_43=null;
        Token enumLiteral_44=null;
        Token enumLiteral_45=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1312:28: ( ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'CustomType0' ) | (enumLiteral_7= 'CustomType1' ) | (enumLiteral_8= 'CustomType2' ) | (enumLiteral_9= 'CustomType3' ) | (enumLiteral_10= 'CustomType4' ) | (enumLiteral_11= 'CustomType5' ) | (enumLiteral_12= 'CustomType6' ) | (enumLiteral_13= 'CustomType7' ) | (enumLiteral_14= 'CustomType8' ) | (enumLiteral_15= 'CustomType9' ) | (enumLiteral_16= 'CustomType10' ) | (enumLiteral_17= 'CustomType11' ) | (enumLiteral_18= 'CustomType12' ) | (enumLiteral_19= 'CustomType13' ) | (enumLiteral_20= 'CustomType14' ) | (enumLiteral_21= 'CustomType15' ) | (enumLiteral_22= 'CustomType16' ) | (enumLiteral_23= 'CustomType17' ) | (enumLiteral_24= 'CustomType18' ) | (enumLiteral_25= 'CustomType19' ) | (enumLiteral_26= 'CustomType20' ) | (enumLiteral_27= 'CustomType21' ) | (enumLiteral_28= 'CustomType22' ) | (enumLiteral_29= 'CustomType23' ) | (enumLiteral_30= 'CustomType24' ) | (enumLiteral_31= 'CustomType25' ) | (enumLiteral_32= 'CustomType26' ) | (enumLiteral_33= 'CustomType27' ) | (enumLiteral_34= 'CustomType28' ) | (enumLiteral_35= 'CustomType29' ) | (enumLiteral_36= 'CustomType30' ) | (enumLiteral_37= 'CustomType31' ) | (enumLiteral_38= 'CustomType32' ) | (enumLiteral_39= 'CustomType33' ) | (enumLiteral_40= 'CustomType34' ) | (enumLiteral_41= 'CustomType35' ) | (enumLiteral_42= 'CustomType36' ) | (enumLiteral_43= 'CustomType37' ) | (enumLiteral_44= 'CustomType38' ) | (enumLiteral_45= 'CustomType39' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1313:1: ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'CustomType0' ) | (enumLiteral_7= 'CustomType1' ) | (enumLiteral_8= 'CustomType2' ) | (enumLiteral_9= 'CustomType3' ) | (enumLiteral_10= 'CustomType4' ) | (enumLiteral_11= 'CustomType5' ) | (enumLiteral_12= 'CustomType6' ) | (enumLiteral_13= 'CustomType7' ) | (enumLiteral_14= 'CustomType8' ) | (enumLiteral_15= 'CustomType9' ) | (enumLiteral_16= 'CustomType10' ) | (enumLiteral_17= 'CustomType11' ) | (enumLiteral_18= 'CustomType12' ) | (enumLiteral_19= 'CustomType13' ) | (enumLiteral_20= 'CustomType14' ) | (enumLiteral_21= 'CustomType15' ) | (enumLiteral_22= 'CustomType16' ) | (enumLiteral_23= 'CustomType17' ) | (enumLiteral_24= 'CustomType18' ) | (enumLiteral_25= 'CustomType19' ) | (enumLiteral_26= 'CustomType20' ) | (enumLiteral_27= 'CustomType21' ) | (enumLiteral_28= 'CustomType22' ) | (enumLiteral_29= 'CustomType23' ) | (enumLiteral_30= 'CustomType24' ) | (enumLiteral_31= 'CustomType25' ) | (enumLiteral_32= 'CustomType26' ) | (enumLiteral_33= 'CustomType27' ) | (enumLiteral_34= 'CustomType28' ) | (enumLiteral_35= 'CustomType29' ) | (enumLiteral_36= 'CustomType30' ) | (enumLiteral_37= 'CustomType31' ) | (enumLiteral_38= 'CustomType32' ) | (enumLiteral_39= 'CustomType33' ) | (enumLiteral_40= 'CustomType34' ) | (enumLiteral_41= 'CustomType35' ) | (enumLiteral_42= 'CustomType36' ) | (enumLiteral_43= 'CustomType37' ) | (enumLiteral_44= 'CustomType38' ) | (enumLiteral_45= 'CustomType39' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1313:1: ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'CustomType0' ) | (enumLiteral_7= 'CustomType1' ) | (enumLiteral_8= 'CustomType2' ) | (enumLiteral_9= 'CustomType3' ) | (enumLiteral_10= 'CustomType4' ) | (enumLiteral_11= 'CustomType5' ) | (enumLiteral_12= 'CustomType6' ) | (enumLiteral_13= 'CustomType7' ) | (enumLiteral_14= 'CustomType8' ) | (enumLiteral_15= 'CustomType9' ) | (enumLiteral_16= 'CustomType10' ) | (enumLiteral_17= 'CustomType11' ) | (enumLiteral_18= 'CustomType12' ) | (enumLiteral_19= 'CustomType13' ) | (enumLiteral_20= 'CustomType14' ) | (enumLiteral_21= 'CustomType15' ) | (enumLiteral_22= 'CustomType16' ) | (enumLiteral_23= 'CustomType17' ) | (enumLiteral_24= 'CustomType18' ) | (enumLiteral_25= 'CustomType19' ) | (enumLiteral_26= 'CustomType20' ) | (enumLiteral_27= 'CustomType21' ) | (enumLiteral_28= 'CustomType22' ) | (enumLiteral_29= 'CustomType23' ) | (enumLiteral_30= 'CustomType24' ) | (enumLiteral_31= 'CustomType25' ) | (enumLiteral_32= 'CustomType26' ) | (enumLiteral_33= 'CustomType27' ) | (enumLiteral_34= 'CustomType28' ) | (enumLiteral_35= 'CustomType29' ) | (enumLiteral_36= 'CustomType30' ) | (enumLiteral_37= 'CustomType31' ) | (enumLiteral_38= 'CustomType32' ) | (enumLiteral_39= 'CustomType33' ) | (enumLiteral_40= 'CustomType34' ) | (enumLiteral_41= 'CustomType35' ) | (enumLiteral_42= 'CustomType36' ) | (enumLiteral_43= 'CustomType37' ) | (enumLiteral_44= 'CustomType38' ) | (enumLiteral_45= 'CustomType39' ) )
            int alt31=46;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt31=1;
                }
                break;
            case 43:
                {
                alt31=2;
                }
                break;
            case 44:
                {
                alt31=3;
                }
                break;
            case 45:
                {
                alt31=4;
                }
                break;
            case 46:
                {
                alt31=5;
                }
                break;
            case 47:
                {
                alt31=6;
                }
                break;
            case 48:
                {
                alt31=7;
                }
                break;
            case 49:
                {
                alt31=8;
                }
                break;
            case 50:
                {
                alt31=9;
                }
                break;
            case 51:
                {
                alt31=10;
                }
                break;
            case 52:
                {
                alt31=11;
                }
                break;
            case 53:
                {
                alt31=12;
                }
                break;
            case 54:
                {
                alt31=13;
                }
                break;
            case 55:
                {
                alt31=14;
                }
                break;
            case 56:
                {
                alt31=15;
                }
                break;
            case 57:
                {
                alt31=16;
                }
                break;
            case 58:
                {
                alt31=17;
                }
                break;
            case 59:
                {
                alt31=18;
                }
                break;
            case 60:
                {
                alt31=19;
                }
                break;
            case 61:
                {
                alt31=20;
                }
                break;
            case 62:
                {
                alt31=21;
                }
                break;
            case 63:
                {
                alt31=22;
                }
                break;
            case 64:
                {
                alt31=23;
                }
                break;
            case 65:
                {
                alt31=24;
                }
                break;
            case 66:
                {
                alt31=25;
                }
                break;
            case 67:
                {
                alt31=26;
                }
                break;
            case 68:
                {
                alt31=27;
                }
                break;
            case 69:
                {
                alt31=28;
                }
                break;
            case 70:
                {
                alt31=29;
                }
                break;
            case 71:
                {
                alt31=30;
                }
                break;
            case 72:
                {
                alt31=31;
                }
                break;
            case 73:
                {
                alt31=32;
                }
                break;
            case 74:
                {
                alt31=33;
                }
                break;
            case 75:
                {
                alt31=34;
                }
                break;
            case 76:
                {
                alt31=35;
                }
                break;
            case 77:
                {
                alt31=36;
                }
                break;
            case 78:
                {
                alt31=37;
                }
                break;
            case 79:
                {
                alt31=38;
                }
                break;
            case 80:
                {
                alt31=39;
                }
                break;
            case 81:
                {
                alt31=40;
                }
                break;
            case 82:
                {
                alt31=41;
                }
                break;
            case 83:
                {
                alt31=42;
                }
                break;
            case 84:
                {
                alt31=43;
                }
                break;
            case 85:
                {
                alt31=44;
                }
                break;
            case 86:
                {
                alt31=45;
                }
                break;
            case 87:
                {
                alt31=46;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1313:2: (enumLiteral_0= 'Can' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1313:2: (enumLiteral_0= 'Can' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1313:4: enumLiteral_0= 'Can'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleInterfaceType2716); 

                            current = grammarAccess.getInterfaceTypeAccess().getCANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getInterfaceTypeAccess().getCANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1319:6: (enumLiteral_1= 'Enhanced Local Bus' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1319:6: (enumLiteral_1= 'Enhanced Local Bus' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1319:8: enumLiteral_1= 'Enhanced Local Bus'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleInterfaceType2733); 

                            current = grammarAccess.getInterfaceTypeAccess().getELBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getInterfaceTypeAccess().getELBEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1325:6: (enumLiteral_2= 'Ethernet' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1325:6: (enumLiteral_2= 'Ethernet' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1325:8: enumLiteral_2= 'Ethernet'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_44_in_ruleInterfaceType2750); 

                            current = grammarAccess.getInterfaceTypeAccess().getETHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getInterfaceTypeAccess().getETHEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1331:6: (enumLiteral_3= 'Analog' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1331:6: (enumLiteral_3= 'Analog' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1331:8: enumLiteral_3= 'Analog'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_45_in_ruleInterfaceType2767); 

                            current = grammarAccess.getInterfaceTypeAccess().getANALOGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getInterfaceTypeAccess().getANALOGEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1337:6: (enumLiteral_4= 'Digital' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1337:6: (enumLiteral_4= 'Digital' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1337:8: enumLiteral_4= 'Digital'
                    {
                    enumLiteral_4=(Token)match(input,46,FOLLOW_46_in_ruleInterfaceType2784); 

                            current = grammarAccess.getInterfaceTypeAccess().getDIGITALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getInterfaceTypeAccess().getDIGITALEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1343:6: (enumLiteral_5= 'Serial' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1343:6: (enumLiteral_5= 'Serial' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1343:8: enumLiteral_5= 'Serial'
                    {
                    enumLiteral_5=(Token)match(input,47,FOLLOW_47_in_ruleInterfaceType2801); 

                            current = grammarAccess.getInterfaceTypeAccess().getSERIALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getInterfaceTypeAccess().getSERIALEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1349:6: (enumLiteral_6= 'CustomType0' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1349:6: (enumLiteral_6= 'CustomType0' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1349:8: enumLiteral_6= 'CustomType0'
                    {
                    enumLiteral_6=(Token)match(input,48,FOLLOW_48_in_ruleInterfaceType2818); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM0EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getInterfaceTypeAccess().getCUSTOM0EnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1355:6: (enumLiteral_7= 'CustomType1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1355:6: (enumLiteral_7= 'CustomType1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1355:8: enumLiteral_7= 'CustomType1'
                    {
                    enumLiteral_7=(Token)match(input,49,FOLLOW_49_in_ruleInterfaceType2835); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM1EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getInterfaceTypeAccess().getCUSTOM1EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1361:6: (enumLiteral_8= 'CustomType2' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1361:6: (enumLiteral_8= 'CustomType2' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1361:8: enumLiteral_8= 'CustomType2'
                    {
                    enumLiteral_8=(Token)match(input,50,FOLLOW_50_in_ruleInterfaceType2852); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM2EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getInterfaceTypeAccess().getCUSTOM2EnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1367:6: (enumLiteral_9= 'CustomType3' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1367:6: (enumLiteral_9= 'CustomType3' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1367:8: enumLiteral_9= 'CustomType3'
                    {
                    enumLiteral_9=(Token)match(input,51,FOLLOW_51_in_ruleInterfaceType2869); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM3EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getInterfaceTypeAccess().getCUSTOM3EnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1373:6: (enumLiteral_10= 'CustomType4' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1373:6: (enumLiteral_10= 'CustomType4' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1373:8: enumLiteral_10= 'CustomType4'
                    {
                    enumLiteral_10=(Token)match(input,52,FOLLOW_52_in_ruleInterfaceType2886); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM4EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getInterfaceTypeAccess().getCUSTOM4EnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1379:6: (enumLiteral_11= 'CustomType5' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1379:6: (enumLiteral_11= 'CustomType5' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1379:8: enumLiteral_11= 'CustomType5'
                    {
                    enumLiteral_11=(Token)match(input,53,FOLLOW_53_in_ruleInterfaceType2903); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM5EnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getInterfaceTypeAccess().getCUSTOM5EnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1385:6: (enumLiteral_12= 'CustomType6' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1385:6: (enumLiteral_12= 'CustomType6' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1385:8: enumLiteral_12= 'CustomType6'
                    {
                    enumLiteral_12=(Token)match(input,54,FOLLOW_54_in_ruleInterfaceType2920); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM6EnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getInterfaceTypeAccess().getCUSTOM6EnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1391:6: (enumLiteral_13= 'CustomType7' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1391:6: (enumLiteral_13= 'CustomType7' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1391:8: enumLiteral_13= 'CustomType7'
                    {
                    enumLiteral_13=(Token)match(input,55,FOLLOW_55_in_ruleInterfaceType2937); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM7EnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getInterfaceTypeAccess().getCUSTOM7EnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1397:6: (enumLiteral_14= 'CustomType8' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1397:6: (enumLiteral_14= 'CustomType8' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1397:8: enumLiteral_14= 'CustomType8'
                    {
                    enumLiteral_14=(Token)match(input,56,FOLLOW_56_in_ruleInterfaceType2954); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM8EnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getInterfaceTypeAccess().getCUSTOM8EnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1403:6: (enumLiteral_15= 'CustomType9' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1403:6: (enumLiteral_15= 'CustomType9' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1403:8: enumLiteral_15= 'CustomType9'
                    {
                    enumLiteral_15=(Token)match(input,57,FOLLOW_57_in_ruleInterfaceType2971); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM9EnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getInterfaceTypeAccess().getCUSTOM9EnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1409:6: (enumLiteral_16= 'CustomType10' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1409:6: (enumLiteral_16= 'CustomType10' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1409:8: enumLiteral_16= 'CustomType10'
                    {
                    enumLiteral_16=(Token)match(input,58,FOLLOW_58_in_ruleInterfaceType2988); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM10EnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_16, grammarAccess.getInterfaceTypeAccess().getCUSTOM10EnumLiteralDeclaration_16()); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1415:6: (enumLiteral_17= 'CustomType11' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1415:6: (enumLiteral_17= 'CustomType11' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1415:8: enumLiteral_17= 'CustomType11'
                    {
                    enumLiteral_17=(Token)match(input,59,FOLLOW_59_in_ruleInterfaceType3005); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM11EnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_17, grammarAccess.getInterfaceTypeAccess().getCUSTOM11EnumLiteralDeclaration_17()); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1421:6: (enumLiteral_18= 'CustomType12' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1421:6: (enumLiteral_18= 'CustomType12' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1421:8: enumLiteral_18= 'CustomType12'
                    {
                    enumLiteral_18=(Token)match(input,60,FOLLOW_60_in_ruleInterfaceType3022); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM12EnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_18, grammarAccess.getInterfaceTypeAccess().getCUSTOM12EnumLiteralDeclaration_18()); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1427:6: (enumLiteral_19= 'CustomType13' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1427:6: (enumLiteral_19= 'CustomType13' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1427:8: enumLiteral_19= 'CustomType13'
                    {
                    enumLiteral_19=(Token)match(input,61,FOLLOW_61_in_ruleInterfaceType3039); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM13EnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_19, grammarAccess.getInterfaceTypeAccess().getCUSTOM13EnumLiteralDeclaration_19()); 
                        

                    }


                    }
                    break;
                case 21 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1433:6: (enumLiteral_20= 'CustomType14' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1433:6: (enumLiteral_20= 'CustomType14' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1433:8: enumLiteral_20= 'CustomType14'
                    {
                    enumLiteral_20=(Token)match(input,62,FOLLOW_62_in_ruleInterfaceType3056); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM14EnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_20, grammarAccess.getInterfaceTypeAccess().getCUSTOM14EnumLiteralDeclaration_20()); 
                        

                    }


                    }
                    break;
                case 22 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1439:6: (enumLiteral_21= 'CustomType15' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1439:6: (enumLiteral_21= 'CustomType15' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1439:8: enumLiteral_21= 'CustomType15'
                    {
                    enumLiteral_21=(Token)match(input,63,FOLLOW_63_in_ruleInterfaceType3073); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM15EnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_21, grammarAccess.getInterfaceTypeAccess().getCUSTOM15EnumLiteralDeclaration_21()); 
                        

                    }


                    }
                    break;
                case 23 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1445:6: (enumLiteral_22= 'CustomType16' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1445:6: (enumLiteral_22= 'CustomType16' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1445:8: enumLiteral_22= 'CustomType16'
                    {
                    enumLiteral_22=(Token)match(input,64,FOLLOW_64_in_ruleInterfaceType3090); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM16EnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_22, grammarAccess.getInterfaceTypeAccess().getCUSTOM16EnumLiteralDeclaration_22()); 
                        

                    }


                    }
                    break;
                case 24 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1451:6: (enumLiteral_23= 'CustomType17' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1451:6: (enumLiteral_23= 'CustomType17' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1451:8: enumLiteral_23= 'CustomType17'
                    {
                    enumLiteral_23=(Token)match(input,65,FOLLOW_65_in_ruleInterfaceType3107); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM17EnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_23, grammarAccess.getInterfaceTypeAccess().getCUSTOM17EnumLiteralDeclaration_23()); 
                        

                    }


                    }
                    break;
                case 25 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1457:6: (enumLiteral_24= 'CustomType18' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1457:6: (enumLiteral_24= 'CustomType18' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1457:8: enumLiteral_24= 'CustomType18'
                    {
                    enumLiteral_24=(Token)match(input,66,FOLLOW_66_in_ruleInterfaceType3124); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM18EnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_24, grammarAccess.getInterfaceTypeAccess().getCUSTOM18EnumLiteralDeclaration_24()); 
                        

                    }


                    }
                    break;
                case 26 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1463:6: (enumLiteral_25= 'CustomType19' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1463:6: (enumLiteral_25= 'CustomType19' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1463:8: enumLiteral_25= 'CustomType19'
                    {
                    enumLiteral_25=(Token)match(input,67,FOLLOW_67_in_ruleInterfaceType3141); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM19EnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_25, grammarAccess.getInterfaceTypeAccess().getCUSTOM19EnumLiteralDeclaration_25()); 
                        

                    }


                    }
                    break;
                case 27 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1469:6: (enumLiteral_26= 'CustomType20' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1469:6: (enumLiteral_26= 'CustomType20' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1469:8: enumLiteral_26= 'CustomType20'
                    {
                    enumLiteral_26=(Token)match(input,68,FOLLOW_68_in_ruleInterfaceType3158); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM20EnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_26, grammarAccess.getInterfaceTypeAccess().getCUSTOM20EnumLiteralDeclaration_26()); 
                        

                    }


                    }
                    break;
                case 28 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1475:6: (enumLiteral_27= 'CustomType21' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1475:6: (enumLiteral_27= 'CustomType21' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1475:8: enumLiteral_27= 'CustomType21'
                    {
                    enumLiteral_27=(Token)match(input,69,FOLLOW_69_in_ruleInterfaceType3175); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM21EnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_27, grammarAccess.getInterfaceTypeAccess().getCUSTOM21EnumLiteralDeclaration_27()); 
                        

                    }


                    }
                    break;
                case 29 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1481:6: (enumLiteral_28= 'CustomType22' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1481:6: (enumLiteral_28= 'CustomType22' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1481:8: enumLiteral_28= 'CustomType22'
                    {
                    enumLiteral_28=(Token)match(input,70,FOLLOW_70_in_ruleInterfaceType3192); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM22EnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_28, grammarAccess.getInterfaceTypeAccess().getCUSTOM22EnumLiteralDeclaration_28()); 
                        

                    }


                    }
                    break;
                case 30 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1487:6: (enumLiteral_29= 'CustomType23' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1487:6: (enumLiteral_29= 'CustomType23' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1487:8: enumLiteral_29= 'CustomType23'
                    {
                    enumLiteral_29=(Token)match(input,71,FOLLOW_71_in_ruleInterfaceType3209); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM23EnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_29, grammarAccess.getInterfaceTypeAccess().getCUSTOM23EnumLiteralDeclaration_29()); 
                        

                    }


                    }
                    break;
                case 31 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1493:6: (enumLiteral_30= 'CustomType24' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1493:6: (enumLiteral_30= 'CustomType24' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1493:8: enumLiteral_30= 'CustomType24'
                    {
                    enumLiteral_30=(Token)match(input,72,FOLLOW_72_in_ruleInterfaceType3226); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM24EnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_30, grammarAccess.getInterfaceTypeAccess().getCUSTOM24EnumLiteralDeclaration_30()); 
                        

                    }


                    }
                    break;
                case 32 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1499:6: (enumLiteral_31= 'CustomType25' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1499:6: (enumLiteral_31= 'CustomType25' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1499:8: enumLiteral_31= 'CustomType25'
                    {
                    enumLiteral_31=(Token)match(input,73,FOLLOW_73_in_ruleInterfaceType3243); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM25EnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_31, grammarAccess.getInterfaceTypeAccess().getCUSTOM25EnumLiteralDeclaration_31()); 
                        

                    }


                    }
                    break;
                case 33 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1505:6: (enumLiteral_32= 'CustomType26' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1505:6: (enumLiteral_32= 'CustomType26' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1505:8: enumLiteral_32= 'CustomType26'
                    {
                    enumLiteral_32=(Token)match(input,74,FOLLOW_74_in_ruleInterfaceType3260); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM26EnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_32, grammarAccess.getInterfaceTypeAccess().getCUSTOM26EnumLiteralDeclaration_32()); 
                        

                    }


                    }
                    break;
                case 34 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1511:6: (enumLiteral_33= 'CustomType27' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1511:6: (enumLiteral_33= 'CustomType27' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1511:8: enumLiteral_33= 'CustomType27'
                    {
                    enumLiteral_33=(Token)match(input,75,FOLLOW_75_in_ruleInterfaceType3277); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM27EnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_33, grammarAccess.getInterfaceTypeAccess().getCUSTOM27EnumLiteralDeclaration_33()); 
                        

                    }


                    }
                    break;
                case 35 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1517:6: (enumLiteral_34= 'CustomType28' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1517:6: (enumLiteral_34= 'CustomType28' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1517:8: enumLiteral_34= 'CustomType28'
                    {
                    enumLiteral_34=(Token)match(input,76,FOLLOW_76_in_ruleInterfaceType3294); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM28EnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_34, grammarAccess.getInterfaceTypeAccess().getCUSTOM28EnumLiteralDeclaration_34()); 
                        

                    }


                    }
                    break;
                case 36 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1523:6: (enumLiteral_35= 'CustomType29' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1523:6: (enumLiteral_35= 'CustomType29' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1523:8: enumLiteral_35= 'CustomType29'
                    {
                    enumLiteral_35=(Token)match(input,77,FOLLOW_77_in_ruleInterfaceType3311); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM29EnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_35, grammarAccess.getInterfaceTypeAccess().getCUSTOM29EnumLiteralDeclaration_35()); 
                        

                    }


                    }
                    break;
                case 37 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1529:6: (enumLiteral_36= 'CustomType30' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1529:6: (enumLiteral_36= 'CustomType30' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1529:8: enumLiteral_36= 'CustomType30'
                    {
                    enumLiteral_36=(Token)match(input,78,FOLLOW_78_in_ruleInterfaceType3328); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM30EnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_36, grammarAccess.getInterfaceTypeAccess().getCUSTOM30EnumLiteralDeclaration_36()); 
                        

                    }


                    }
                    break;
                case 38 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1535:6: (enumLiteral_37= 'CustomType31' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1535:6: (enumLiteral_37= 'CustomType31' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1535:8: enumLiteral_37= 'CustomType31'
                    {
                    enumLiteral_37=(Token)match(input,79,FOLLOW_79_in_ruleInterfaceType3345); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM31EnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_37, grammarAccess.getInterfaceTypeAccess().getCUSTOM31EnumLiteralDeclaration_37()); 
                        

                    }


                    }
                    break;
                case 39 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1541:6: (enumLiteral_38= 'CustomType32' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1541:6: (enumLiteral_38= 'CustomType32' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1541:8: enumLiteral_38= 'CustomType32'
                    {
                    enumLiteral_38=(Token)match(input,80,FOLLOW_80_in_ruleInterfaceType3362); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM32EnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_38, grammarAccess.getInterfaceTypeAccess().getCUSTOM32EnumLiteralDeclaration_38()); 
                        

                    }


                    }
                    break;
                case 40 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1547:6: (enumLiteral_39= 'CustomType33' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1547:6: (enumLiteral_39= 'CustomType33' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1547:8: enumLiteral_39= 'CustomType33'
                    {
                    enumLiteral_39=(Token)match(input,81,FOLLOW_81_in_ruleInterfaceType3379); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM33EnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_39, grammarAccess.getInterfaceTypeAccess().getCUSTOM33EnumLiteralDeclaration_39()); 
                        

                    }


                    }
                    break;
                case 41 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1553:6: (enumLiteral_40= 'CustomType34' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1553:6: (enumLiteral_40= 'CustomType34' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1553:8: enumLiteral_40= 'CustomType34'
                    {
                    enumLiteral_40=(Token)match(input,82,FOLLOW_82_in_ruleInterfaceType3396); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM34EnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_40, grammarAccess.getInterfaceTypeAccess().getCUSTOM34EnumLiteralDeclaration_40()); 
                        

                    }


                    }
                    break;
                case 42 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1559:6: (enumLiteral_41= 'CustomType35' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1559:6: (enumLiteral_41= 'CustomType35' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1559:8: enumLiteral_41= 'CustomType35'
                    {
                    enumLiteral_41=(Token)match(input,83,FOLLOW_83_in_ruleInterfaceType3413); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM35EnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_41, grammarAccess.getInterfaceTypeAccess().getCUSTOM35EnumLiteralDeclaration_41()); 
                        

                    }


                    }
                    break;
                case 43 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1565:6: (enumLiteral_42= 'CustomType36' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1565:6: (enumLiteral_42= 'CustomType36' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1565:8: enumLiteral_42= 'CustomType36'
                    {
                    enumLiteral_42=(Token)match(input,84,FOLLOW_84_in_ruleInterfaceType3430); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM36EnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_42, grammarAccess.getInterfaceTypeAccess().getCUSTOM36EnumLiteralDeclaration_42()); 
                        

                    }


                    }
                    break;
                case 44 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1571:6: (enumLiteral_43= 'CustomType37' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1571:6: (enumLiteral_43= 'CustomType37' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1571:8: enumLiteral_43= 'CustomType37'
                    {
                    enumLiteral_43=(Token)match(input,85,FOLLOW_85_in_ruleInterfaceType3447); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM37EnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_43, grammarAccess.getInterfaceTypeAccess().getCUSTOM37EnumLiteralDeclaration_43()); 
                        

                    }


                    }
                    break;
                case 45 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1577:6: (enumLiteral_44= 'CustomType38' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1577:6: (enumLiteral_44= 'CustomType38' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1577:8: enumLiteral_44= 'CustomType38'
                    {
                    enumLiteral_44=(Token)match(input,86,FOLLOW_86_in_ruleInterfaceType3464); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM38EnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_44, grammarAccess.getInterfaceTypeAccess().getCUSTOM38EnumLiteralDeclaration_44()); 
                        

                    }


                    }
                    break;
                case 46 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1583:6: (enumLiteral_45= 'CustomType39' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1583:6: (enumLiteral_45= 'CustomType39' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1583:8: enumLiteral_45= 'CustomType39'
                    {
                    enumLiteral_45=(Token)match(input,87,FOLLOW_87_in_ruleInterfaceType3481); 

                            current = grammarAccess.getInterfaceTypeAccess().getCUSTOM39EnumLiteralDeclaration_45().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_45, grammarAccess.getInterfaceTypeAccess().getCUSTOM39EnumLiteralDeclaration_45()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAssistModel_in_entryRuleAssistModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssistModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAssistModel122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel134 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssistModel146 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAssistModel158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssistModel175 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAssistModel192 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel204 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleCompartment_in_ruleAssistModel225 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_17_in_ruleAssistModel238 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel250 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleAssistModel271 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel284 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssistModel296 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel308 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleInterfaceGroup_in_ruleAssistModel329 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartment_in_entryRuleCompartment377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartment387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCompartment424 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompartment441 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompartment458 = new BitSet(new long[]{0x0000000002F00000L});
    public static final BitSet FOLLOW_20_in_ruleCompartment471 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment500 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment517 = new BitSet(new long[]{0x0000000002F00000L});
    public static final BitSet FOLLOW_21_in_ruleCompartment532 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment561 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment578 = new BitSet(new long[]{0x0000000002F00000L});
    public static final BitSet FOLLOW_22_in_ruleCompartment593 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment622 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment639 = new BitSet(new long[]{0x0000000002F00000L});
    public static final BitSet FOLLOW_23_in_ruleCompartment654 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment683 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment700 = new BitSet(new long[]{0x0000000002F00000L});
    public static final BitSet FOLLOW_ruleRDC_in_ruleCompartment723 = new BitSet(new long[]{0x0000000003F10000L});
    public static final BitSet FOLLOW_24_in_ruleCompartment737 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompartment749 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleCompartment770 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleCompartment783 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCompartment797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDC_in_entryRuleRDC833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRDC843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRDC880 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRDC897 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRDC914 = new BitSet(new long[]{0x000000001C300000L});
    public static final BitSet FOLLOW_20_in_ruleRDC927 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC956 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC973 = new BitSet(new long[]{0x000000001C300000L});
    public static final BitSet FOLLOW_21_in_ruleRDC988 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1017 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1034 = new BitSet(new long[]{0x000000001C300000L});
    public static final BitSet FOLLOW_26_in_ruleRDC1049 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1078 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1095 = new BitSet(new long[]{0x000000001C300000L});
    public static final BitSet FOLLOW_27_in_ruleRDC1110 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1139 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1156 = new BitSet(new long[]{0x000000001C300000L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleRDC1179 = new BitSet(new long[]{0x000000001D310000L});
    public static final BitSet FOLLOW_24_in_ruleRDC1193 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRDC1205 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleRDC1226 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleRDC1239 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRDC1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector1289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleConnector1336 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnector1353 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConnector1370 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_ruleAvailableInterface_in_ruleConnector1391 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_16_in_ruleConnector1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvailableInterface_in_entryRuleAvailableInterface1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvailableInterface1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAvailableInterface1492 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAvailableInterface1509 = new BitSet(new long[]{0xFFFFFC0000000000L,0x0000000000FFFFFFL});
    public static final BitSet FOLLOW_ruleInterfaceType_in_ruleAvailableInterface1530 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAvailableInterface1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceGroup_in_entryRuleInterfaceGroup1578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceGroup1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleInterfaceGroup1625 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceGroup1642 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterfaceGroup1659 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceGroup1679 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleInterfaceGroup1692 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceGroup1712 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_16_in_ruleInterfaceGroup1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface1762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleInterface1809 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface1826 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterface1843 = new BitSet(new long[]{0x000003FE05010000L});
    public static final BitSet FOLLOW_33_in_ruleInterface1856 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInterface1868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterface1885 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterface1902 = new BitSet(new long[]{0x000003FC05010000L});
    public static final BitSet FOLLOW_34_in_ruleInterface1917 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInterface1929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterface1946 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterface1963 = new BitSet(new long[]{0x000003F805010000L});
    public static final BitSet FOLLOW_35_in_ruleInterface1978 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInterface1990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterface2007 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterface2024 = new BitSet(new long[]{0x000003F005010000L});
    public static final BitSet FOLLOW_36_in_ruleInterface2039 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInterface2051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterface2068 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterface2085 = new BitSet(new long[]{0x000003E005010000L});
    public static final BitSet FOLLOW_37_in_ruleInterface2100 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInterface2112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterface2129 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterface2146 = new BitSet(new long[]{0x000003C005010000L});
    public static final BitSet FOLLOW_38_in_ruleInterface2161 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInterface2173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterface2190 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterface2207 = new BitSet(new long[]{0x0000038005010000L});
    public static final BitSet FOLLOW_39_in_ruleInterface2222 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInterface2234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterface2251 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterface2268 = new BitSet(new long[]{0x0000030005010000L});
    public static final BitSet FOLLOW_40_in_ruleInterface2283 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInterface2295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterface2312 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterface2329 = new BitSet(new long[]{0x0000020005010000L});
    public static final BitSet FOLLOW_41_in_ruleInterface2344 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInterface2356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterface2373 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterface2390 = new BitSet(new long[]{0x0000000005010000L});
    public static final BitSet FOLLOW_26_in_ruleInterface2405 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInterface2417 = new BitSet(new long[]{0xFFFFFC0000000000L,0x0000000000FFFFFFL});
    public static final BitSet FOLLOW_ruleInterfaceType_in_ruleInterface2438 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterface2450 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_24_in_ruleInterface2465 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterface2477 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleInterface2498 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleInterface2511 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInterface2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter2561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricParameter2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetricParameter2613 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMetricParameter2630 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMetricParameter2647 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMetricParameter2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleInterfaceType2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleInterfaceType2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleInterfaceType2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleInterfaceType2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleInterfaceType2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleInterfaceType2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleInterfaceType2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleInterfaceType2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleInterfaceType2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleInterfaceType2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleInterfaceType2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleInterfaceType2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleInterfaceType2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleInterfaceType2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleInterfaceType2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleInterfaceType2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleInterfaceType2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleInterfaceType3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleInterfaceType3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleInterfaceType3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleInterfaceType3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleInterfaceType3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleInterfaceType3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleInterfaceType3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleInterfaceType3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleInterfaceType3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleInterfaceType3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleInterfaceType3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleInterfaceType3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleInterfaceType3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleInterfaceType3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleInterfaceType3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleInterfaceType3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleInterfaceType3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleInterfaceType3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleInterfaceType3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleInterfaceType3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleInterfaceType3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleInterfaceType3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleInterfaceType3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleInterfaceType3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleInterfaceType3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleInterfaceType3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleInterfaceType3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleInterfaceType3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleInterfaceType3481 = new BitSet(new long[]{0x0000000000000002L});

}