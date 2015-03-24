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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Global'", "'{'", "'Name'", "'='", "';'", "'}'", "'Interfaces'", "'InterfaceGroups'", "'Restrictions'", "'Compartment'", "'Manufacturer'", "'PowerSupply'", "'Side'", "'Zone'", "'RDC'", "'Type'", "'ESS'", "'ResourceX'", "'ResourceY'", "'ResourceZ'", "'Connector'", "'Group'", "','", "'interfaces with'", "'and'", "'combines'", "'Interface'", "'System'", "'SubAta'", "'Resource'", "'LineName'", "'WiringLane'", "'GrpInfo'", "'Route'", "'PwSup1'", "'EmhZone1'", "'dislocal up to'", "'on same'", "'Valid for'", "'is'", "'are'", "'Invalid for'", "'connectors with'", "'.'", "'Compartment.Name'", "'Compartment.Manufacturer'", "'Compartment.PowerSupply'", "'Compartment.Side'", "'Compartment.Zone'", "'RDC.Name'", "'RDC.Manufacturer'", "'RDC.PowerSupply'", "'RDC.Side'", "'RDC.Type'", "'RDC.ESS'", "'RDC.ResourceX'", "'RDC.ResourceY'", "'RDC.ResourceZ'", "'Connector.Name'"
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:77:1: ruleAssistModel returns [EObject current=null] : (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )+ (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_16= '}' )? (otherlv_17= 'Restrictions' otherlv_18= '{' ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_22_0= ruleInvalidDeployment ) ) )* otherlv_23= '}' )? ) ;
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
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_23=null;
        EObject lv_compartments_7_0 = null;

        EObject lv_eqInterfaces_10_0 = null;

        EObject lv_eqInterfaceGroups_14_0 = null;

        EObject lv_eqInterfaceGroups_15_0 = null;

        EObject lv_dislocalityRelations_19_0 = null;

        EObject lv_colocalityRelations_20_0 = null;

        EObject lv_validDeployments_21_0 = null;

        EObject lv_invalidDeployments_22_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:80:28: ( (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )+ (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_16= '}' )? (otherlv_17= 'Restrictions' otherlv_18= '{' ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_22_0= ruleInvalidDeployment ) ) )* otherlv_23= '}' )? ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )+ (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_16= '}' )? (otherlv_17= 'Restrictions' otherlv_18= '{' ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_22_0= ruleInvalidDeployment ) ) )* otherlv_23= '}' )? )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )+ (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_16= '}' )? (otherlv_17= 'Restrictions' otherlv_18= '{' ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_22_0= ruleInvalidDeployment ) ) )* otherlv_23= '}' )? )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:3: otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )+ (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_16= '}' )? (otherlv_17= 'Restrictions' otherlv_18= '{' ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_22_0= ruleInvalidDeployment ) ) )* otherlv_23= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAssistModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getAssistModelAccess().getGlobalKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel134); 

                	newLeafNode(otherlv_1, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleAssistModel146); 

                	newLeafNode(otherlv_2, grammarAccess.getAssistModelAccess().getNameKeyword_2());
                
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

                if ( (LA1_0==20) ) {
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:141:3: (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:141:5: otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleAssistModel239); 

                        	newLeafNode(otherlv_8, grammarAccess.getAssistModelAccess().getInterfacesKeyword_8_0());
                        
                    otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel251); 

                        	newLeafNode(otherlv_9, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:149:1: ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==37) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:150:1: (lv_eqInterfaces_10_0= ruleEqInterface )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:150:1: (lv_eqInterfaces_10_0= ruleEqInterface )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:151:3: lv_eqInterfaces_10_0= ruleEqInterface
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getEqInterfacesEqInterfaceParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEqInterface_in_ruleAssistModel272);
                    	    lv_eqInterfaces_10_0=ruleEqInterface();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eqInterfaces",
                    	            		lv_eqInterfaces_10_0, 
                    	            		"EqInterface");
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

                    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleAssistModel285); 

                        	newLeafNode(otherlv_11, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_8_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:171:3: (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_16= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:171:5: otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_16= '}'
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleAssistModel300); 

                        	newLeafNode(otherlv_12, grammarAccess.getAssistModelAccess().getInterfaceGroupsKeyword_9_0());
                        
                    otherlv_13=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel312); 

                        	newLeafNode(otherlv_13, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:179:1: ( ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==32) ) {
                            int LA4_2 = input.LA(2);

                            if ( (LA4_2==RULE_ID) ) {
                                int LA4_3 = input.LA(3);

                                if ( (LA4_3==12) ) {
                                    alt4=1;
                                }
                                else if ( (LA4_3==36) ) {
                                    alt4=2;
                                }


                            }


                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:179:2: ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:179:2: ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:180:1: (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:180:1: (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:181:3: lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsEqInterfaceGroupParserRuleCall_9_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEqInterfaceGroup_in_ruleAssistModel334);
                    	    lv_eqInterfaceGroups_14_0=ruleEqInterfaceGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eqInterfaceGroups",
                    	            		lv_eqInterfaceGroups_14_0, 
                    	            		"EqInterfaceGroup");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:198:6: ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithCombinedDefinition ) )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:198:6: ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithCombinedDefinition ) )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:199:1: (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithCombinedDefinition )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:199:1: (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithCombinedDefinition )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:200:3: lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithCombinedDefinition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsEqInterfaceGroupWithCombinedDefinitionParserRuleCall_9_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEqInterfaceGroupWithCombinedDefinition_in_ruleAssistModel361);
                    	    lv_eqInterfaceGroups_15_0=ruleEqInterfaceGroupWithCombinedDefinition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eqInterfaceGroups",
                    	            		lv_eqInterfaceGroups_15_0, 
                    	            		"EqInterfaceGroupWithCombinedDefinition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleAssistModel375); 

                        	newLeafNode(otherlv_16, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_9_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:220:3: (otherlv_17= 'Restrictions' otherlv_18= '{' ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_22_0= ruleInvalidDeployment ) ) )* otherlv_23= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:220:5: otherlv_17= 'Restrictions' otherlv_18= '{' ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_22_0= ruleInvalidDeployment ) ) )* otherlv_23= '}'
                    {
                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleAssistModel390); 

                        	newLeafNode(otherlv_17, grammarAccess.getAssistModelAccess().getRestrictionsKeyword_10_0());
                        
                    otherlv_18=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel402); 

                        	newLeafNode(otherlv_18, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:228:1: ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_22_0= ruleInvalidDeployment ) ) )*
                    loop6:
                    do {
                        int alt6=5;
                        alt6 = dfa6.predict(input);
                        switch (alt6) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:228:2: ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:228:2: ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:229:1: (lv_dislocalityRelations_19_0= ruleDislocalityRelation )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:229:1: (lv_dislocalityRelations_19_0= ruleDislocalityRelation )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:230:3: lv_dislocalityRelations_19_0= ruleDislocalityRelation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getDislocalityRelationsDislocalityRelationParserRuleCall_10_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDislocalityRelation_in_ruleAssistModel424);
                    	    lv_dislocalityRelations_19_0=ruleDislocalityRelation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"dislocalityRelations",
                    	            		lv_dislocalityRelations_19_0, 
                    	            		"DislocalityRelation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:247:6: ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:247:6: ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:248:1: (lv_colocalityRelations_20_0= ruleColocalityRelation )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:248:1: (lv_colocalityRelations_20_0= ruleColocalityRelation )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:249:3: lv_colocalityRelations_20_0= ruleColocalityRelation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getColocalityRelationsColocalityRelationParserRuleCall_10_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleColocalityRelation_in_ruleAssistModel451);
                    	    lv_colocalityRelations_20_0=ruleColocalityRelation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"colocalityRelations",
                    	            		lv_colocalityRelations_20_0, 
                    	            		"ColocalityRelation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:266:6: ( (lv_validDeployments_21_0= ruleValidDeployment ) )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:266:6: ( (lv_validDeployments_21_0= ruleValidDeployment ) )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:267:1: (lv_validDeployments_21_0= ruleValidDeployment )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:267:1: (lv_validDeployments_21_0= ruleValidDeployment )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:268:3: lv_validDeployments_21_0= ruleValidDeployment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getValidDeploymentsValidDeploymentParserRuleCall_10_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValidDeployment_in_ruleAssistModel478);
                    	    lv_validDeployments_21_0=ruleValidDeployment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"validDeployments",
                    	            		lv_validDeployments_21_0, 
                    	            		"ValidDeployment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:285:6: ( (lv_invalidDeployments_22_0= ruleInvalidDeployment ) )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:285:6: ( (lv_invalidDeployments_22_0= ruleInvalidDeployment ) )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:286:1: (lv_invalidDeployments_22_0= ruleInvalidDeployment )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:286:1: (lv_invalidDeployments_22_0= ruleInvalidDeployment )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:287:3: lv_invalidDeployments_22_0= ruleInvalidDeployment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getInvalidDeploymentsInvalidDeploymentParserRuleCall_10_2_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInvalidDeployment_in_ruleAssistModel505);
                    	    lv_invalidDeployments_22_0=ruleInvalidDeployment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"invalidDeployments",
                    	            		lv_invalidDeployments_22_0, 
                    	            		"InvalidDeployment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_16_in_ruleAssistModel519); 

                        	newLeafNode(otherlv_23, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_10_3());
                        

                    }
                    break;

            }


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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:315:1: entryRuleCompartment returns [EObject current=null] : iv_ruleCompartment= ruleCompartment EOF ;
    public final EObject entryRuleCompartment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompartment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:316:2: (iv_ruleCompartment= ruleCompartment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:317:2: iv_ruleCompartment= ruleCompartment EOF
            {
             newCompositeNode(grammarAccess.getCompartmentRule()); 
            pushFollow(FOLLOW_ruleCompartment_in_entryRuleCompartment557);
            iv_ruleCompartment=ruleCompartment();

            state._fsp--;

             current =iv_ruleCompartment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartment567); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:324:1: ruleCompartment returns [EObject current=null] : (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' ) ;
    public final EObject ruleCompartment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_manufacturer_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_powerSupply_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_side_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_zone_18_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_rdcs_20_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:327:28: ( (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:328:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:328:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:328:3: otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleCompartment604); 

                	newLeafNode(otherlv_0, grammarAccess.getCompartmentAccess().getCompartmentKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:332:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:333:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:333:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:334:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompartment621); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCompartment638); 

                	newLeafNode(otherlv_2, grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:354:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:356:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:356:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:357:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:360:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?)
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:361:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:361:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=6;
                int LA9_0 = input.LA(1);

                if ( LA9_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1) ) {
                    alt9=2;
                }
                else if ( LA9_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2) ) {
                    alt9=3;
                }
                else if ( LA9_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3) ) {
                    alt9=4;
                }
                else if ( LA9_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4) ) {
                    alt9=5;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:363:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:363:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:364:5: {...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:364:108: ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:365:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:368:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:368:7: {...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:368:16: (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:368:18: otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleCompartment696); 

            	        	newLeafNode(otherlv_4, grammarAccess.getCompartmentAccess().getManufacturerKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCompartment708); 

            	        	newLeafNode(otherlv_5, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:376:1: ( (lv_manufacturer_6_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:377:1: (lv_manufacturer_6_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:377:1: (lv_manufacturer_6_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:378:3: lv_manufacturer_6_0= RULE_STRING
            	    {
            	    lv_manufacturer_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment725); 

            	    			newLeafNode(lv_manufacturer_6_0, grammarAccess.getCompartmentAccess().getManufacturerSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCompartmentRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"manufacturer",
            	            		lv_manufacturer_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCompartment742); 

            	        	newLeafNode(otherlv_7, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:405:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:405:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:406:5: {...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:406:108: ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:407:6: ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:410:6: ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:410:7: {...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:410:16: (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:410:18: otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleCompartment810); 

            	        	newLeafNode(otherlv_8, grammarAccess.getCompartmentAccess().getPowerSupplyKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleCompartment822); 

            	        	newLeafNode(otherlv_9, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:418:1: ( (lv_powerSupply_10_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:419:1: (lv_powerSupply_10_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:419:1: (lv_powerSupply_10_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:420:3: lv_powerSupply_10_0= RULE_STRING
            	    {
            	    lv_powerSupply_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment839); 

            	    			newLeafNode(lv_powerSupply_10_0, grammarAccess.getCompartmentAccess().getPowerSupplySTRINGTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCompartmentRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"powerSupply",
            	            		lv_powerSupply_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleCompartment856); 

            	        	newLeafNode(otherlv_11, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:447:4: ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:447:4: ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:448:5: {...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:448:108: ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:449:6: ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:452:6: ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:452:7: {...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:452:16: (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:452:18: otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleCompartment924); 

            	        	newLeafNode(otherlv_12, grammarAccess.getCompartmentAccess().getSideKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleCompartment936); 

            	        	newLeafNode(otherlv_13, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:460:1: ( (lv_side_14_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:461:1: (lv_side_14_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:461:1: (lv_side_14_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:462:3: lv_side_14_0= RULE_STRING
            	    {
            	    lv_side_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment953); 

            	    			newLeafNode(lv_side_14_0, grammarAccess.getCompartmentAccess().getSideSTRINGTerminalRuleCall_3_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCompartmentRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"side",
            	            		lv_side_14_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleCompartment970); 

            	        	newLeafNode(otherlv_15, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:489:4: ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:489:4: ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:490:5: {...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:490:108: ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:491:6: ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:494:6: ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:494:7: {...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:494:16: (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:494:18: otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,24,FOLLOW_24_in_ruleCompartment1038); 

            	        	newLeafNode(otherlv_16, grammarAccess.getCompartmentAccess().getZoneKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleCompartment1050); 

            	        	newLeafNode(otherlv_17, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:502:1: ( (lv_zone_18_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:503:1: (lv_zone_18_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:503:1: (lv_zone_18_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:504:3: lv_zone_18_0= RULE_STRING
            	    {
            	    lv_zone_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment1067); 

            	    			newLeafNode(lv_zone_18_0, grammarAccess.getCompartmentAccess().getZoneSTRINGTerminalRuleCall_3_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCompartmentRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"zone",
            	            		lv_zone_18_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleCompartment1084); 

            	        	newLeafNode(otherlv_19, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:531:4: ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:531:4: ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:532:5: {...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:532:108: ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:533:6: ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:536:6: ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==25) ) {
            	            int LA8_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt8=1;
            	            }


            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:536:7: {...}? => ( (lv_rdcs_20_0= ruleRDC ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    	    }
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:536:16: ( (lv_rdcs_20_0= ruleRDC ) )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:537:1: (lv_rdcs_20_0= ruleRDC )
            	    	    {
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:537:1: (lv_rdcs_20_0= ruleRDC )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:538:3: lv_rdcs_20_0= ruleRDC
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getCompartmentAccess().getRdcsRDCParserRuleCall_3_4_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleRDC_in_ruleCompartment1160);
            	    	    lv_rdcs_20_0=ruleRDC();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getCompartmentRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"rdcs",
            	    	            		lv_rdcs_20_0, 
            	    	            		"RDC");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCompartmentAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canLeave(grammarAccess.getCompartmentAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	

            }

            otherlv_21=(Token)match(input,16,FOLLOW_16_in_ruleCompartment1219); 

                	newLeafNode(otherlv_21, grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:581:1: entryRuleRDC returns [EObject current=null] : iv_ruleRDC= ruleRDC EOF ;
    public final EObject entryRuleRDC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDC = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:582:2: (iv_ruleRDC= ruleRDC EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:583:2: iv_ruleRDC= ruleRDC EOF
            {
             newCompositeNode(grammarAccess.getRDCRule()); 
            pushFollow(FOLLOW_ruleRDC_in_entryRuleRDC1255);
            iv_ruleRDC=ruleRDC();

            state._fsp--;

             current =iv_ruleRDC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDC1265); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:590:1: ruleRDC returns [EObject current=null] : (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) otherlv_33= '}' ) ;
    public final EObject ruleRDC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_manufacturer_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_powerSupply_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_rdcType_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_ess_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_resourceX_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_resourceY_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token lv_resourceZ_30_0=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        EObject lv_connectors_32_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:593:28: ( (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) otherlv_33= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:594:1: (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) otherlv_33= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:594:1: (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) otherlv_33= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:594:3: otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) otherlv_33= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleRDC1302); 

                	newLeafNode(otherlv_0, grammarAccess.getRDCAccess().getRDCKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:598:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:599:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:599:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:600:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRDC1319); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRDC1336); 

                	newLeafNode(otherlv_2, grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:620:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:622:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+ ) ) )+ {...}?) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:622:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+ ) ) )+ {...}?) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:623:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:626:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+ ) ) )+ {...}?)
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:627:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+ ) ) )+ {...}?
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:627:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+ ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=9;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:629:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:629:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:630:5: {...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:630:100: ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:631:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:634:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:634:7: {...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:634:16: (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:634:18: otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleRDC1394); 

            	        	newLeafNode(otherlv_4, grammarAccess.getRDCAccess().getManufacturerKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleRDC1406); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:642:1: ( (lv_manufacturer_6_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:643:1: (lv_manufacturer_6_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:643:1: (lv_manufacturer_6_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:644:3: lv_manufacturer_6_0= RULE_STRING
            	    {
            	    lv_manufacturer_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1423); 

            	    			newLeafNode(lv_manufacturer_6_0, grammarAccess.getRDCAccess().getManufacturerSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRDCRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"manufacturer",
            	            		lv_manufacturer_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleRDC1440); 

            	        	newLeafNode(otherlv_7, grammarAccess.getRDCAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:671:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:671:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:672:5: {...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:672:100: ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:673:6: ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:676:6: ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:676:7: {...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:676:16: (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:676:18: otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleRDC1508); 

            	        	newLeafNode(otherlv_8, grammarAccess.getRDCAccess().getPowerSupplyKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleRDC1520); 

            	        	newLeafNode(otherlv_9, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:684:1: ( (lv_powerSupply_10_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:685:1: (lv_powerSupply_10_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:685:1: (lv_powerSupply_10_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:686:3: lv_powerSupply_10_0= RULE_STRING
            	    {
            	    lv_powerSupply_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1537); 

            	    			newLeafNode(lv_powerSupply_10_0, grammarAccess.getRDCAccess().getPowerSupplySTRINGTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRDCRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"powerSupply",
            	            		lv_powerSupply_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleRDC1554); 

            	        	newLeafNode(otherlv_11, grammarAccess.getRDCAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:713:4: ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:713:4: ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:714:5: {...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:714:100: ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:715:6: ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:718:6: ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:718:7: {...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:718:16: (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:718:18: otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,26,FOLLOW_26_in_ruleRDC1622); 

            	        	newLeafNode(otherlv_12, grammarAccess.getRDCAccess().getTypeKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleRDC1634); 

            	        	newLeafNode(otherlv_13, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:726:1: ( (lv_rdcType_14_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:727:1: (lv_rdcType_14_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:727:1: (lv_rdcType_14_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:728:3: lv_rdcType_14_0= RULE_STRING
            	    {
            	    lv_rdcType_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1651); 

            	    			newLeafNode(lv_rdcType_14_0, grammarAccess.getRDCAccess().getRdcTypeSTRINGTerminalRuleCall_3_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRDCRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"rdcType",
            	            		lv_rdcType_14_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleRDC1668); 

            	        	newLeafNode(otherlv_15, grammarAccess.getRDCAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:755:4: ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:755:4: ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:756:5: {...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:756:100: ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:757:6: ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:760:6: ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:760:7: {...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:760:16: (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:760:18: otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,27,FOLLOW_27_in_ruleRDC1736); 

            	        	newLeafNode(otherlv_16, grammarAccess.getRDCAccess().getESSKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleRDC1748); 

            	        	newLeafNode(otherlv_17, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:768:1: ( (lv_ess_18_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:769:1: (lv_ess_18_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:769:1: (lv_ess_18_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:770:3: lv_ess_18_0= RULE_STRING
            	    {
            	    lv_ess_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1765); 

            	    			newLeafNode(lv_ess_18_0, grammarAccess.getRDCAccess().getEssSTRINGTerminalRuleCall_3_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRDCRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"ess",
            	            		lv_ess_18_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleRDC1782); 

            	        	newLeafNode(otherlv_19, grammarAccess.getRDCAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:797:4: ({...}? => ( ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:797:4: ({...}? => ( ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:798:5: {...}? => ( ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:798:100: ( ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:799:6: ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:802:6: ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:802:7: {...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:802:16: (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:802:18: otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,28,FOLLOW_28_in_ruleRDC1850); 

            	        	newLeafNode(otherlv_20, grammarAccess.getRDCAccess().getResourceXKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,14,FOLLOW_14_in_ruleRDC1862); 

            	        	newLeafNode(otherlv_21, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:810:1: ( (lv_resourceX_22_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:811:1: (lv_resourceX_22_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:811:1: (lv_resourceX_22_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:812:3: lv_resourceX_22_0= RULE_STRING
            	    {
            	    lv_resourceX_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1879); 

            	    			newLeafNode(lv_resourceX_22_0, grammarAccess.getRDCAccess().getResourceXSTRINGTerminalRuleCall_3_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRDCRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"resourceX",
            	            		lv_resourceX_22_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_23=(Token)match(input,15,FOLLOW_15_in_ruleRDC1896); 

            	        	newLeafNode(otherlv_23, grammarAccess.getRDCAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:839:4: ({...}? => ( ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:839:4: ({...}? => ( ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:840:5: {...}? => ( ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:840:100: ( ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:841:6: ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:844:6: ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:844:7: {...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:844:16: (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:844:18: otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,29,FOLLOW_29_in_ruleRDC1964); 

            	        	newLeafNode(otherlv_24, grammarAccess.getRDCAccess().getResourceYKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,14,FOLLOW_14_in_ruleRDC1976); 

            	        	newLeafNode(otherlv_25, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:852:1: ( (lv_resourceY_26_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:853:1: (lv_resourceY_26_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:853:1: (lv_resourceY_26_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:854:3: lv_resourceY_26_0= RULE_STRING
            	    {
            	    lv_resourceY_26_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1993); 

            	    			newLeafNode(lv_resourceY_26_0, grammarAccess.getRDCAccess().getResourceYSTRINGTerminalRuleCall_3_5_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRDCRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"resourceY",
            	            		lv_resourceY_26_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_27=(Token)match(input,15,FOLLOW_15_in_ruleRDC2010); 

            	        	newLeafNode(otherlv_27, grammarAccess.getRDCAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:881:4: ({...}? => ( ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:881:4: ({...}? => ( ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:882:5: {...}? => ( ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:882:100: ( ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:883:6: ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:886:6: ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:886:7: {...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:886:16: (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:886:18: otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';'
            	    {
            	    otherlv_28=(Token)match(input,30,FOLLOW_30_in_ruleRDC2078); 

            	        	newLeafNode(otherlv_28, grammarAccess.getRDCAccess().getResourceZKeyword_3_6_0());
            	        
            	    otherlv_29=(Token)match(input,14,FOLLOW_14_in_ruleRDC2090); 

            	        	newLeafNode(otherlv_29, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_6_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:894:1: ( (lv_resourceZ_30_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:895:1: (lv_resourceZ_30_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:895:1: (lv_resourceZ_30_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:896:3: lv_resourceZ_30_0= RULE_STRING
            	    {
            	    lv_resourceZ_30_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC2107); 

            	    			newLeafNode(lv_resourceZ_30_0, grammarAccess.getRDCAccess().getResourceZSTRINGTerminalRuleCall_3_6_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRDCRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"resourceZ",
            	            		lv_resourceZ_30_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_31=(Token)match(input,15,FOLLOW_15_in_ruleRDC2124); 

            	        	newLeafNode(otherlv_31, grammarAccess.getRDCAccess().getSemicolonKeyword_3_6_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:923:4: ({...}? => ( ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+ ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:923:4: ({...}? => ( ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+ ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:924:5: {...}? => ( ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:924:100: ( ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+ )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:925:6: ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:928:6: ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==31) ) {
            	            int LA10_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt10=1;
            	            }


            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:928:7: {...}? => ( (lv_connectors_32_0= ruleConnector ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    	    }
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:928:16: ( (lv_connectors_32_0= ruleConnector ) )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:929:1: (lv_connectors_32_0= ruleConnector )
            	    	    {
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:929:1: (lv_connectors_32_0= ruleConnector )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:930:3: lv_connectors_32_0= ruleConnector
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRDCAccess().getConnectorsConnectorParserRuleCall_3_7_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleConnector_in_ruleRDC2200);
            	    	    lv_connectors_32_0=ruleConnector();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getRDCRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"connectors",
            	    	            		lv_connectors_32_0, 
            	    	            		"Connector");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt10 >= 1 ) break loop10;
            	                EarlyExitException eee =
            	                    new EarlyExitException(10, input);
            	                throw eee;
            	        }
            	        cnt10++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRDCAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canLeave(grammarAccess.getRDCAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	

            }

            otherlv_33=(Token)match(input,16,FOLLOW_16_in_ruleRDC2259); 

                	newLeafNode(otherlv_33, grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:973:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:974:2: (iv_ruleConnector= ruleConnector EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:975:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector2295);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector2305); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:982:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_availableEqInterfaces_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:985:28: ( (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:986:1: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:986:1: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:986:3: otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleConnector2342); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:990:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:991:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:991:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:992:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnector2359); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConnector2376); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1012:1: ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1013:1: (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1013:1: (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1014:3: lv_availableEqInterfaces_3_0= ruleAvailableEqInterface
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectorAccess().getAvailableEqInterfacesAvailableEqInterfaceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAvailableEqInterface_in_ruleConnector2397);
            	    lv_availableEqInterfaces_3_0=ruleAvailableEqInterface();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConnectorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"availableEqInterfaces",
            	            		lv_availableEqInterfaces_3_0, 
            	            		"AvailableEqInterface");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleConnector2410); 

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


    // $ANTLR start "entryRuleAvailableEqInterface"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1042:1: entryRuleAvailableEqInterface returns [EObject current=null] : iv_ruleAvailableEqInterface= ruleAvailableEqInterface EOF ;
    public final EObject entryRuleAvailableEqInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvailableEqInterface = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1043:2: (iv_ruleAvailableEqInterface= ruleAvailableEqInterface EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1044:2: iv_ruleAvailableEqInterface= ruleAvailableEqInterface EOF
            {
             newCompositeNode(grammarAccess.getAvailableEqInterfaceRule()); 
            pushFollow(FOLLOW_ruleAvailableEqInterface_in_entryRuleAvailableEqInterface2446);
            iv_ruleAvailableEqInterface=ruleAvailableEqInterface();

            state._fsp--;

             current =iv_ruleAvailableEqInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvailableEqInterface2456); 

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
    // $ANTLR end "entryRuleAvailableEqInterface"


    // $ANTLR start "ruleAvailableEqInterface"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1051:1: ruleAvailableEqInterface returns [EObject current=null] : ( ( (lv_eqInterfaceType_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_count_2_0= RULE_INT ) ) otherlv_3= ';' ) ;
    public final EObject ruleAvailableEqInterface() throws RecognitionException {
        EObject current = null;

        Token lv_eqInterfaceType_0_0=null;
        Token otherlv_1=null;
        Token lv_count_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1054:28: ( ( ( (lv_eqInterfaceType_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_count_2_0= RULE_INT ) ) otherlv_3= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1055:1: ( ( (lv_eqInterfaceType_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_count_2_0= RULE_INT ) ) otherlv_3= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1055:1: ( ( (lv_eqInterfaceType_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_count_2_0= RULE_INT ) ) otherlv_3= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1055:2: ( (lv_eqInterfaceType_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_count_2_0= RULE_INT ) ) otherlv_3= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1055:2: ( (lv_eqInterfaceType_0_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1056:1: (lv_eqInterfaceType_0_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1056:1: (lv_eqInterfaceType_0_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1057:3: lv_eqInterfaceType_0_0= RULE_STRING
            {
            lv_eqInterfaceType_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAvailableEqInterface2498); 

            			newLeafNode(lv_eqInterfaceType_0_0, grammarAccess.getAvailableEqInterfaceAccess().getEqInterfaceTypeSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAvailableEqInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"eqInterfaceType",
                    		lv_eqInterfaceType_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleAvailableEqInterface2515); 

                	newLeafNode(otherlv_1, grammarAccess.getAvailableEqInterfaceAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1077:1: ( (lv_count_2_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1078:1: (lv_count_2_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1078:1: (lv_count_2_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1079:3: lv_count_2_0= RULE_INT
            {
            lv_count_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAvailableEqInterface2532); 

            			newLeafNode(lv_count_2_0, grammarAccess.getAvailableEqInterfaceAccess().getCountINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAvailableEqInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"count",
                    		lv_count_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleAvailableEqInterface2549); 

                	newLeafNode(otherlv_3, grammarAccess.getAvailableEqInterfaceAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleAvailableEqInterface"


    // $ANTLR start "entryRuleEqInterfaceGroup"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1107:1: entryRuleEqInterfaceGroup returns [EObject current=null] : iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF ;
    public final EObject entryRuleEqInterfaceGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterfaceGroup = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1108:2: (iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1109:2: iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceGroupRule()); 
            pushFollow(FOLLOW_ruleEqInterfaceGroup_in_entryRuleEqInterfaceGroup2585);
            iv_ruleEqInterfaceGroup=ruleEqInterfaceGroup();

            state._fsp--;

             current =iv_ruleEqInterfaceGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterfaceGroup2595); 

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
    // $ANTLR end "entryRuleEqInterfaceGroup"


    // $ANTLR start "ruleEqInterfaceGroup"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1116:1: ruleEqInterfaceGroup returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' otherlv_9= ';' ) ;
    public final EObject ruleEqInterfaceGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_implicitMemberDefinitions_4_0 = null;

        EObject lv_implicitMemberDefinitions_7_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1119:28: ( (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' otherlv_9= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1120:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' otherlv_9= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1120:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' otherlv_9= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1120:3: otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleEqInterfaceGroup2632); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceGroupAccess().getGroupKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1124:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1125:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1125:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1126:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup2649); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEqInterfaceGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEqInterfaceGroup2666); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceGroupAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1146:1: ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==34) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1146:2: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1146:2: ( (otherlv_3= RULE_ID ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1147:1: (otherlv_3= RULE_ID )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1147:1: (otherlv_3= RULE_ID )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1148:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup2687); 

                    		newLeafNode(otherlv_3, grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_3_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1160:6: ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1160:6: ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1161:1: (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1161:1: (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1162:3: lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqInterfaceGroupAccess().getImplicitMemberDefinitionsImplicitEqInterfaceMemberDefinitionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup2714);
                    lv_implicitMemberDefinitions_4_0=ruleImplicitEqInterfaceMemberDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEqInterfaceGroupRule());
                    	        }
                           		add(
                           			current, 
                           			"implicitMemberDefinitions",
                            		lv_implicitMemberDefinitions_4_0, 
                            		"ImplicitEqInterfaceMemberDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1178:3: (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1178:5: otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
            	    {
            	    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleEqInterfaceGroup2728); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEqInterfaceGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1182:1: ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==RULE_ID) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==34) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1182:2: ( (otherlv_6= RULE_ID ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1182:2: ( (otherlv_6= RULE_ID ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1183:1: (otherlv_6= RULE_ID )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1183:1: (otherlv_6= RULE_ID )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1184:3: otherlv_6= RULE_ID
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
            	            	        }
            	                    
            	            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup2749); 

            	            		newLeafNode(otherlv_6, grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_4_1_0_0()); 
            	            	

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1196:6: ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1196:6: ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1197:1: (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1197:1: (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1198:3: lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getEqInterfaceGroupAccess().getImplicitMemberDefinitionsImplicitEqInterfaceMemberDefinitionParserRuleCall_4_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup2776);
            	            lv_implicitMemberDefinitions_7_0=ruleImplicitEqInterfaceMemberDefinition();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getEqInterfaceGroupRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"implicitMemberDefinitions",
            	                    		lv_implicitMemberDefinitions_7_0, 
            	                    		"ImplicitEqInterfaceMemberDefinition");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleEqInterfaceGroup2791); 

                	newLeafNode(otherlv_8, grammarAccess.getEqInterfaceGroupAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleEqInterfaceGroup2803); 

                	newLeafNode(otherlv_9, grammarAccess.getEqInterfaceGroupAccess().getSemicolonKeyword_6());
                

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
    // $ANTLR end "ruleEqInterfaceGroup"


    // $ANTLR start "entryRuleImplicitEqInterfaceMemberDefinition"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1230:1: entryRuleImplicitEqInterfaceMemberDefinition returns [EObject current=null] : iv_ruleImplicitEqInterfaceMemberDefinition= ruleImplicitEqInterfaceMemberDefinition EOF ;
    public final EObject entryRuleImplicitEqInterfaceMemberDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitEqInterfaceMemberDefinition = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1231:2: (iv_ruleImplicitEqInterfaceMemberDefinition= ruleImplicitEqInterfaceMemberDefinition EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1232:2: iv_ruleImplicitEqInterfaceMemberDefinition= ruleImplicitEqInterfaceMemberDefinition EOF
            {
             newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionRule()); 
            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_entryRuleImplicitEqInterfaceMemberDefinition2839);
            iv_ruleImplicitEqInterfaceMemberDefinition=ruleImplicitEqInterfaceMemberDefinition();

            state._fsp--;

             current =iv_ruleImplicitEqInterfaceMemberDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitEqInterfaceMemberDefinition2849); 

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
    // $ANTLR end "entryRuleImplicitEqInterfaceMemberDefinition"


    // $ANTLR start "ruleImplicitEqInterfaceMemberDefinition"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1239:1: ruleImplicitEqInterfaceMemberDefinition returns [EObject current=null] : (otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )* ) ;
    public final EObject ruleImplicitEqInterfaceMemberDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1242:28: ( (otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1243:1: (otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )* )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1243:1: (otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1243:3: otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleImplicitEqInterfaceMemberDefinition2886); 

                	newLeafNode(otherlv_0, grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getInterfacesWithKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1247:1: ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1248:1: (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1248:1: (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1249:3: lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues
            {
             
            	        newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getEntriesImplicitEqInterfaceMemberDefinitionAttributesAndValuesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_ruleImplicitEqInterfaceMemberDefinition2907);
            lv_entries_1_0=ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImplicitEqInterfaceMemberDefinitionRule());
            	        }
                   		add(
                   			current, 
                   			"entries",
                    		lv_entries_1_0, 
                    		"ImplicitEqInterfaceMemberDefinitionAttributesAndValues");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1265:2: (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1265:4: otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleImplicitEqInterfaceMemberDefinition2920); 

            	        	newLeafNode(otherlv_2, grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getAndKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1269:1: ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1270:1: (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1270:1: (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1271:3: lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getEntriesImplicitEqInterfaceMemberDefinitionAttributesAndValuesParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_ruleImplicitEqInterfaceMemberDefinition2941);
            	    lv_entries_3_0=ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImplicitEqInterfaceMemberDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entries",
            	            		lv_entries_3_0, 
            	            		"ImplicitEqInterfaceMemberDefinitionAttributesAndValues");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


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
    // $ANTLR end "ruleImplicitEqInterfaceMemberDefinition"


    // $ANTLR start "entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1295:1: entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues returns [EObject current=null] : iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues EOF ;
    public final EObject entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1296:2: (iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1297:2: iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues EOF
            {
             newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesRule()); 
            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues2979);
            iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues=ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues();

            state._fsp--;

             current =iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues2989); 

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
    // $ANTLR end "entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues"


    // $ANTLR start "ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1304:1: ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_attribute_0_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1307:28: ( ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1308:1: ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1308:1: ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1308:2: ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1308:2: ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1309:1: (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1309:1: (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1310:3: lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute
            {
             
            	        newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesAccess().getAttributeImplicitEqInterfaceMemberDefinitionAttributeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttribute_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues3035);
            lv_attribute_0_0=ruleImplicitEqInterfaceMemberDefinitionAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesRule());
            	        }
                   		set(
                   			current, 
                   			"attribute",
                    		lv_attribute_0_0, 
                    		"ImplicitEqInterfaceMemberDefinitionAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues3047); 

                	newLeafNode(otherlv_1, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1330:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1331:1: (lv_value_2_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1331:1: (lv_value_2_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1332:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues3064); 

            			newLeafNode(lv_value_2_0, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


            }


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
    // $ANTLR end "ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues"


    // $ANTLR start "entryRuleEqInterfaceGroupWithCombinedDefinition"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1356:1: entryRuleEqInterfaceGroupWithCombinedDefinition returns [EObject current=null] : iv_ruleEqInterfaceGroupWithCombinedDefinition= ruleEqInterfaceGroupWithCombinedDefinition EOF ;
    public final EObject entryRuleEqInterfaceGroupWithCombinedDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterfaceGroupWithCombinedDefinition = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1357:2: (iv_ruleEqInterfaceGroupWithCombinedDefinition= ruleEqInterfaceGroupWithCombinedDefinition EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1358:2: iv_ruleEqInterfaceGroupWithCombinedDefinition= ruleEqInterfaceGroupWithCombinedDefinition EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionRule()); 
            pushFollow(FOLLOW_ruleEqInterfaceGroupWithCombinedDefinition_in_entryRuleEqInterfaceGroupWithCombinedDefinition3105);
            iv_ruleEqInterfaceGroupWithCombinedDefinition=ruleEqInterfaceGroupWithCombinedDefinition();

            state._fsp--;

             current =iv_ruleEqInterfaceGroupWithCombinedDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterfaceGroupWithCombinedDefinition3115); 

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
    // $ANTLR end "entryRuleEqInterfaceGroupWithCombinedDefinition"


    // $ANTLR start "ruleEqInterfaceGroupWithCombinedDefinition"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1365:1: ruleEqInterfaceGroupWithCombinedDefinition returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleEqInterfaceGroupWithCombinedDefinition() throws RecognitionException {
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1368:28: ( (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1369:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1369:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1369:3: otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleEqInterfaceGroupWithCombinedDefinition3152); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getGroupKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1373:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1374:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1374:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1375:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition3169); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleEqInterfaceGroupWithCombinedDefinition3186); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getCombinesKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1395:1: ( (otherlv_3= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1396:1: (otherlv_3= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1396:1: (otherlv_3= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1397:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition3206); 

            		newLeafNode(otherlv_3, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getCombinedGroupsEqInterfaceGroupCrossReference_3_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1408:2: (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1408:4: otherlv_4= 'and' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleEqInterfaceGroupWithCombinedDefinition3219); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getAndKeyword_4_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1412:1: ( (otherlv_5= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1413:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1413:1: (otherlv_5= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1414:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition3239); 

            	    		newLeafNode(otherlv_5, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getCombinedGroupsEqInterfaceGroupCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleEqInterfaceGroupWithCombinedDefinition3253); 

                	newLeafNode(otherlv_6, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleEqInterfaceGroupWithCombinedDefinition"


    // $ANTLR start "entryRuleEqInterface"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1437:1: entryRuleEqInterface returns [EObject current=null] : iv_ruleEqInterface= ruleEqInterface EOF ;
    public final EObject entryRuleEqInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterface = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1438:2: (iv_ruleEqInterface= ruleEqInterface EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1439:2: iv_ruleEqInterface= ruleEqInterface EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceRule()); 
            pushFollow(FOLLOW_ruleEqInterface_in_entryRuleEqInterface3289);
            iv_ruleEqInterface=ruleEqInterface();

            state._fsp--;

             current =iv_ruleEqInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterface3299); 

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
    // $ANTLR end "entryRuleEqInterface"


    // $ANTLR start "ruleEqInterface"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1446:1: ruleEqInterface returns [EObject current=null] : (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}' ) ;
    public final EObject ruleEqInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_system_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_subAta_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_resource_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_lineName_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_wiringLane_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_grpInfo_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token lv_route_30_0=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token lv_pwSup1_34_0=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token lv_emhZone1_38_0=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token lv_ioType_42_0=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token lv_resourceX_46_0=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token lv_resourceY_50_0=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token lv_resourceZ_54_0=null;
        Token otherlv_55=null;
        Token otherlv_56=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1449:28: ( (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1450:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1450:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1450:3: otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleEqInterface3336); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceAccess().getInterfaceKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1454:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1455:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1455:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1456:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterface3353); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEqInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEqInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEqInterface3370); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1476:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) ) ) ) )* ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1478:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) ) ) ) )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1478:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) ) ) ) )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1479:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1482:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) ) ) ) )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1483:3: ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) ) ) ) )*
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1483:3: ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) ) ) ) )*
            loop18:
            do {
                int alt18=14;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1485:4: ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1485:4: ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1486:5: {...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1486:108: ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1487:6: ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1490:6: ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1490:7: {...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1490:16: (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1490:18: otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleEqInterface3428); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEqInterfaceAccess().getSystemKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface3440); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1498:1: ( (lv_system_6_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1499:1: (lv_system_6_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1499:1: (lv_system_6_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1500:3: lv_system_6_0= RULE_STRING
            	    {
            	    lv_system_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface3457); 

            	    			newLeafNode(lv_system_6_0, grammarAccess.getEqInterfaceAccess().getSystemSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"system",
            	            		lv_system_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface3474); 

            	        	newLeafNode(otherlv_7, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1527:4: ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1527:4: ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1528:5: {...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1528:108: ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1529:6: ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1532:6: ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1532:7: {...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1532:16: (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1532:18: otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,39,FOLLOW_39_in_ruleEqInterface3542); 

            	        	newLeafNode(otherlv_8, grammarAccess.getEqInterfaceAccess().getSubAtaKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface3554); 

            	        	newLeafNode(otherlv_9, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1540:1: ( (lv_subAta_10_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1541:1: (lv_subAta_10_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1541:1: (lv_subAta_10_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1542:3: lv_subAta_10_0= RULE_STRING
            	    {
            	    lv_subAta_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface3571); 

            	    			newLeafNode(lv_subAta_10_0, grammarAccess.getEqInterfaceAccess().getSubAtaSTRINGTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"subAta",
            	            		lv_subAta_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface3588); 

            	        	newLeafNode(otherlv_11, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1569:4: ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1569:4: ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1570:5: {...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1570:108: ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1571:6: ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1574:6: ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1574:7: {...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1574:16: (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1574:18: otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,40,FOLLOW_40_in_ruleEqInterface3656); 

            	        	newLeafNode(otherlv_12, grammarAccess.getEqInterfaceAccess().getResourceKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface3668); 

            	        	newLeafNode(otherlv_13, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1582:1: ( (lv_resource_14_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1583:1: (lv_resource_14_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1583:1: (lv_resource_14_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1584:3: lv_resource_14_0= RULE_STRING
            	    {
            	    lv_resource_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface3685); 

            	    			newLeafNode(lv_resource_14_0, grammarAccess.getEqInterfaceAccess().getResourceSTRINGTerminalRuleCall_3_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"resource",
            	            		lv_resource_14_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface3702); 

            	        	newLeafNode(otherlv_15, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1611:4: ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1611:4: ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1612:5: {...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1612:108: ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1613:6: ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1616:6: ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1616:7: {...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1616:16: (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1616:18: otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,41,FOLLOW_41_in_ruleEqInterface3770); 

            	        	newLeafNode(otherlv_16, grammarAccess.getEqInterfaceAccess().getLineNameKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface3782); 

            	        	newLeafNode(otherlv_17, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1624:1: ( (lv_lineName_18_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1625:1: (lv_lineName_18_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1625:1: (lv_lineName_18_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1626:3: lv_lineName_18_0= RULE_STRING
            	    {
            	    lv_lineName_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface3799); 

            	    			newLeafNode(lv_lineName_18_0, grammarAccess.getEqInterfaceAccess().getLineNameSTRINGTerminalRuleCall_3_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"lineName",
            	            		lv_lineName_18_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface3816); 

            	        	newLeafNode(otherlv_19, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1653:4: ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1653:4: ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1654:5: {...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1654:108: ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1655:6: ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1658:6: ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1658:7: {...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1658:16: (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1658:18: otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,42,FOLLOW_42_in_ruleEqInterface3884); 

            	        	newLeafNode(otherlv_20, grammarAccess.getEqInterfaceAccess().getWiringLaneKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface3896); 

            	        	newLeafNode(otherlv_21, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1666:1: ( (lv_wiringLane_22_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1667:1: (lv_wiringLane_22_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1667:1: (lv_wiringLane_22_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1668:3: lv_wiringLane_22_0= RULE_STRING
            	    {
            	    lv_wiringLane_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface3913); 

            	    			newLeafNode(lv_wiringLane_22_0, grammarAccess.getEqInterfaceAccess().getWiringLaneSTRINGTerminalRuleCall_3_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"wiringLane",
            	            		lv_wiringLane_22_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_23=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface3930); 

            	        	newLeafNode(otherlv_23, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1695:4: ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1695:4: ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1696:5: {...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1696:108: ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1697:6: ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1700:6: ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1700:7: {...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1700:16: (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1700:18: otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,43,FOLLOW_43_in_ruleEqInterface3998); 

            	        	newLeafNode(otherlv_24, grammarAccess.getEqInterfaceAccess().getGrpInfoKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface4010); 

            	        	newLeafNode(otherlv_25, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1708:1: ( (lv_grpInfo_26_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1709:1: (lv_grpInfo_26_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1709:1: (lv_grpInfo_26_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1710:3: lv_grpInfo_26_0= RULE_STRING
            	    {
            	    lv_grpInfo_26_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface4027); 

            	    			newLeafNode(lv_grpInfo_26_0, grammarAccess.getEqInterfaceAccess().getGrpInfoSTRINGTerminalRuleCall_3_5_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"grpInfo",
            	            		lv_grpInfo_26_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_27=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface4044); 

            	        	newLeafNode(otherlv_27, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1737:4: ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1737:4: ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1738:5: {...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1738:108: ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1739:6: ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1742:6: ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1742:7: {...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1742:16: (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1742:18: otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';'
            	    {
            	    otherlv_28=(Token)match(input,44,FOLLOW_44_in_ruleEqInterface4112); 

            	        	newLeafNode(otherlv_28, grammarAccess.getEqInterfaceAccess().getRouteKeyword_3_6_0());
            	        
            	    otherlv_29=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface4124); 

            	        	newLeafNode(otherlv_29, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_6_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1750:1: ( (lv_route_30_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1751:1: (lv_route_30_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1751:1: (lv_route_30_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1752:3: lv_route_30_0= RULE_STRING
            	    {
            	    lv_route_30_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface4141); 

            	    			newLeafNode(lv_route_30_0, grammarAccess.getEqInterfaceAccess().getRouteSTRINGTerminalRuleCall_3_6_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"route",
            	            		lv_route_30_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_31=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface4158); 

            	        	newLeafNode(otherlv_31, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_6_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1779:4: ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1779:4: ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1780:5: {...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1780:108: ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1781:6: ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1784:6: ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1784:7: {...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1784:16: (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1784:18: otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';'
            	    {
            	    otherlv_32=(Token)match(input,45,FOLLOW_45_in_ruleEqInterface4226); 

            	        	newLeafNode(otherlv_32, grammarAccess.getEqInterfaceAccess().getPwSup1Keyword_3_7_0());
            	        
            	    otherlv_33=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface4238); 

            	        	newLeafNode(otherlv_33, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_7_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1792:1: ( (lv_pwSup1_34_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1793:1: (lv_pwSup1_34_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1793:1: (lv_pwSup1_34_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1794:3: lv_pwSup1_34_0= RULE_STRING
            	    {
            	    lv_pwSup1_34_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface4255); 

            	    			newLeafNode(lv_pwSup1_34_0, grammarAccess.getEqInterfaceAccess().getPwSup1STRINGTerminalRuleCall_3_7_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"pwSup1",
            	            		lv_pwSup1_34_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_35=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface4272); 

            	        	newLeafNode(otherlv_35, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_7_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1821:4: ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1821:4: ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1822:5: {...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1822:108: ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1823:6: ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1826:6: ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1826:7: {...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1826:16: (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1826:18: otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';'
            	    {
            	    otherlv_36=(Token)match(input,46,FOLLOW_46_in_ruleEqInterface4340); 

            	        	newLeafNode(otherlv_36, grammarAccess.getEqInterfaceAccess().getEmhZone1Keyword_3_8_0());
            	        
            	    otherlv_37=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface4352); 

            	        	newLeafNode(otherlv_37, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_8_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1834:1: ( (lv_emhZone1_38_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1835:1: (lv_emhZone1_38_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1835:1: (lv_emhZone1_38_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1836:3: lv_emhZone1_38_0= RULE_STRING
            	    {
            	    lv_emhZone1_38_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface4369); 

            	    			newLeafNode(lv_emhZone1_38_0, grammarAccess.getEqInterfaceAccess().getEmhZone1STRINGTerminalRuleCall_3_8_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"emhZone1",
            	            		lv_emhZone1_38_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_39=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface4386); 

            	        	newLeafNode(otherlv_39, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_8_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1863:4: ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1863:4: ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1864:5: {...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1864:108: ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1865:6: ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1868:6: ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1868:7: {...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1868:16: (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1868:18: otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';'
            	    {
            	    otherlv_40=(Token)match(input,26,FOLLOW_26_in_ruleEqInterface4454); 

            	        	newLeafNode(otherlv_40, grammarAccess.getEqInterfaceAccess().getTypeKeyword_3_9_0());
            	        
            	    otherlv_41=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface4466); 

            	        	newLeafNode(otherlv_41, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_9_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1876:1: ( (lv_ioType_42_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1877:1: (lv_ioType_42_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1877:1: (lv_ioType_42_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1878:3: lv_ioType_42_0= RULE_STRING
            	    {
            	    lv_ioType_42_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface4483); 

            	    			newLeafNode(lv_ioType_42_0, grammarAccess.getEqInterfaceAccess().getIoTypeSTRINGTerminalRuleCall_3_9_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"ioType",
            	            		lv_ioType_42_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_43=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface4500); 

            	        	newLeafNode(otherlv_43, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_9_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1905:4: ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1905:4: ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1906:5: {...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1906:109: ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1907:6: ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 10);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1910:6: ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1910:7: {...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1910:16: (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1910:18: otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';'
            	    {
            	    otherlv_44=(Token)match(input,28,FOLLOW_28_in_ruleEqInterface4568); 

            	        	newLeafNode(otherlv_44, grammarAccess.getEqInterfaceAccess().getResourceXKeyword_3_10_0());
            	        
            	    otherlv_45=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface4580); 

            	        	newLeafNode(otherlv_45, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_10_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1918:1: ( (lv_resourceX_46_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1919:1: (lv_resourceX_46_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1919:1: (lv_resourceX_46_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1920:3: lv_resourceX_46_0= RULE_STRING
            	    {
            	    lv_resourceX_46_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface4597); 

            	    			newLeafNode(lv_resourceX_46_0, grammarAccess.getEqInterfaceAccess().getResourceXSTRINGTerminalRuleCall_3_10_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"resourceX",
            	            		lv_resourceX_46_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_47=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface4614); 

            	        	newLeafNode(otherlv_47, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_10_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1947:4: ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1947:4: ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1948:5: {...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1948:109: ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1949:6: ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 11);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1952:6: ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1952:7: {...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1952:16: (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1952:18: otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';'
            	    {
            	    otherlv_48=(Token)match(input,29,FOLLOW_29_in_ruleEqInterface4682); 

            	        	newLeafNode(otherlv_48, grammarAccess.getEqInterfaceAccess().getResourceYKeyword_3_11_0());
            	        
            	    otherlv_49=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface4694); 

            	        	newLeafNode(otherlv_49, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_11_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1960:1: ( (lv_resourceY_50_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1961:1: (lv_resourceY_50_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1961:1: (lv_resourceY_50_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1962:3: lv_resourceY_50_0= RULE_STRING
            	    {
            	    lv_resourceY_50_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface4711); 

            	    			newLeafNode(lv_resourceY_50_0, grammarAccess.getEqInterfaceAccess().getResourceYSTRINGTerminalRuleCall_3_11_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"resourceY",
            	            		lv_resourceY_50_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_51=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface4728); 

            	        	newLeafNode(otherlv_51, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_11_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1989:4: ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1989:4: ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1990:5: {...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 12)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1990:109: ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1991:6: ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 12);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1994:6: ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1994:7: {...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1994:16: (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1994:18: otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';'
            	    {
            	    otherlv_52=(Token)match(input,30,FOLLOW_30_in_ruleEqInterface4796); 

            	        	newLeafNode(otherlv_52, grammarAccess.getEqInterfaceAccess().getResourceZKeyword_3_12_0());
            	        
            	    otherlv_53=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface4808); 

            	        	newLeafNode(otherlv_53, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_12_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2002:1: ( (lv_resourceZ_54_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2003:1: (lv_resourceZ_54_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2003:1: (lv_resourceZ_54_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2004:3: lv_resourceZ_54_0= RULE_STRING
            	    {
            	    lv_resourceZ_54_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface4825); 

            	    			newLeafNode(lv_resourceZ_54_0, grammarAccess.getEqInterfaceAccess().getResourceZSTRINGTerminalRuleCall_3_12_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"resourceZ",
            	            		lv_resourceZ_54_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_55=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface4842); 

            	        	newLeafNode(otherlv_55, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_12_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	

            }

            otherlv_56=(Token)match(input,16,FOLLOW_16_in_ruleEqInterface4895); 

                	newLeafNode(otherlv_56, grammarAccess.getEqInterfaceAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleEqInterface"


    // $ANTLR start "entryRuleDislocalityRelation"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2050:1: entryRuleDislocalityRelation returns [EObject current=null] : iv_ruleDislocalityRelation= ruleDislocalityRelation EOF ;
    public final EObject entryRuleDislocalityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDislocalityRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2051:2: (iv_ruleDislocalityRelation= ruleDislocalityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2052:2: iv_ruleDislocalityRelation= ruleDislocalityRelation EOF
            {
             newCompositeNode(grammarAccess.getDislocalityRelationRule()); 
            pushFollow(FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation4931);
            iv_ruleDislocalityRelation=ruleDislocalityRelation();

            state._fsp--;

             current =iv_ruleDislocalityRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDislocalityRelation4941); 

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
    // $ANTLR end "entryRuleDislocalityRelation"


    // $ANTLR start "ruleDislocalityRelation"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2059:1: ruleDislocalityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) ;
    public final EObject ruleDislocalityRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_hardwareLevel_4_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2062:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2063:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2063:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2063:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2063:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2064:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2064:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2065:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDislocalityRelationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDislocalityRelation4986); 

            		newLeafNode(otherlv_0, grammarAccess.getDislocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_0_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2076:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2076:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleDislocalityRelation4999); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDislocalityRelationAccess().getCommaKeyword_1_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2080:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2081:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2081:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2082:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDislocalityRelationRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDislocalityRelation5019); 

            	    		newLeafNode(otherlv_2, grammarAccess.getDislocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleDislocalityRelation5033); 

                	newLeafNode(otherlv_3, grammarAccess.getDislocalityRelationAccess().getDislocalUpToKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2097:1: ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2098:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2098:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2099:3: lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType
            {
             
            	        newCompositeNode(grammarAccess.getDislocalityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleHardwareArchitectureLevelType_in_ruleDislocalityRelation5054);
            lv_hardwareLevel_4_0=ruleHardwareArchitectureLevelType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDislocalityRelationRule());
            	        }
                   		set(
                   			current, 
                   			"hardwareLevel",
                    		lv_hardwareLevel_4_0, 
                    		"HardwareArchitectureLevelType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDislocalityRelation5066); 

                	newLeafNode(otherlv_5, grammarAccess.getDislocalityRelationAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleDislocalityRelation"


    // $ANTLR start "entryRuleColocalityRelation"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2127:1: entryRuleColocalityRelation returns [EObject current=null] : iv_ruleColocalityRelation= ruleColocalityRelation EOF ;
    public final EObject entryRuleColocalityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColocalityRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2128:2: (iv_ruleColocalityRelation= ruleColocalityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2129:2: iv_ruleColocalityRelation= ruleColocalityRelation EOF
            {
             newCompositeNode(grammarAccess.getColocalityRelationRule()); 
            pushFollow(FOLLOW_ruleColocalityRelation_in_entryRuleColocalityRelation5102);
            iv_ruleColocalityRelation=ruleColocalityRelation();

            state._fsp--;

             current =iv_ruleColocalityRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColocalityRelation5112); 

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
    // $ANTLR end "entryRuleColocalityRelation"


    // $ANTLR start "ruleColocalityRelation"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2136:1: ruleColocalityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) ;
    public final EObject ruleColocalityRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_hardwareLevel_4_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2139:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2140:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2140:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2140:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2140:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2141:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2141:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2142:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getColocalityRelationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColocalityRelation5157); 

            		newLeafNode(otherlv_0, grammarAccess.getColocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_0_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2153:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2153:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleColocalityRelation5170); 

            	        	newLeafNode(otherlv_1, grammarAccess.getColocalityRelationAccess().getCommaKeyword_1_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2157:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2158:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2158:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2159:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getColocalityRelationRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColocalityRelation5190); 

            	    		newLeafNode(otherlv_2, grammarAccess.getColocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleColocalityRelation5204); 

                	newLeafNode(otherlv_3, grammarAccess.getColocalityRelationAccess().getOnSameKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2174:1: ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2175:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2175:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2176:3: lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType
            {
             
            	        newCompositeNode(grammarAccess.getColocalityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleHardwareArchitectureLevelType_in_ruleColocalityRelation5225);
            lv_hardwareLevel_4_0=ruleHardwareArchitectureLevelType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColocalityRelationRule());
            	        }
                   		set(
                   			current, 
                   			"hardwareLevel",
                    		lv_hardwareLevel_4_0, 
                    		"HardwareArchitectureLevelType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleColocalityRelation5237); 

                	newLeafNode(otherlv_5, grammarAccess.getColocalityRelationAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleColocalityRelation"


    // $ANTLR start "entryRuleValidDeployment"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2204:1: entryRuleValidDeployment returns [EObject current=null] : iv_ruleValidDeployment= ruleValidDeployment EOF ;
    public final EObject entryRuleValidDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidDeployment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2205:2: (iv_ruleValidDeployment= ruleValidDeployment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2206:2: iv_ruleValidDeployment= ruleValidDeployment EOF
            {
             newCompositeNode(grammarAccess.getValidDeploymentRule()); 
            pushFollow(FOLLOW_ruleValidDeployment_in_entryRuleValidDeployment5273);
            iv_ruleValidDeployment=ruleValidDeployment();

            state._fsp--;

             current =iv_ruleValidDeployment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidDeployment5283); 

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
    // $ANTLR end "entryRuleValidDeployment"


    // $ANTLR start "ruleValidDeployment"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2213:1: ruleValidDeployment returns [EObject current=null] : (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';' ) ;
    public final EObject ruleValidDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_implicitHardwareElements_8_0 = null;

        EObject lv_implicitHardwareElements_11_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2216:28: ( (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2217:1: (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2217:1: (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2217:3: otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleValidDeployment5320); 

                	newLeafNode(otherlv_0, grammarAccess.getValidDeploymentAccess().getValidForKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2221:1: ( (otherlv_1= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2222:1: (otherlv_1= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2222:1: (otherlv_1= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2223:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getValidDeploymentRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidDeployment5340); 

            		newLeafNode(otherlv_1, grammarAccess.getValidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2234:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2234:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleValidDeployment5353); 

            	        	newLeafNode(otherlv_2, grammarAccess.getValidDeploymentAccess().getCommaKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2238:1: ( (otherlv_3= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2239:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2239:1: (otherlv_3= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2240:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getValidDeploymentRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidDeployment5373); 

            	    		newLeafNode(otherlv_3, grammarAccess.getValidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2251:4: (otherlv_4= 'is' | otherlv_5= 'are' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==50) ) {
                alt22=1;
            }
            else if ( (LA22_0==51) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2251:6: otherlv_4= 'is'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleValidDeployment5388); 

                        	newLeafNode(otherlv_4, grammarAccess.getValidDeploymentAccess().getIsKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2256:7: otherlv_5= 'are'
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleValidDeployment5406); 

                        	newLeafNode(otherlv_5, grammarAccess.getValidDeploymentAccess().getAreKeyword_3_1());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleValidDeployment5419); 

                	newLeafNode(otherlv_6, grammarAccess.getValidDeploymentAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2264:1: ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==53) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2264:2: ( ( ruleQualifiedName ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2264:2: ( ( ruleQualifiedName ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2265:1: ( ruleQualifiedName )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2265:1: ( ruleQualifiedName )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2266:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getValidDeploymentRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleValidDeployment5443);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2280:6: ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2280:6: ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2281:1: (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2281:1: (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2282:3: lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getImplicitHardwareElementsDeploymentImplicitDefinitionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeployment5470);
                    lv_implicitHardwareElements_8_0=ruleDeploymentImplicitDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValidDeploymentRule());
                    	        }
                           		add(
                           			current, 
                           			"implicitHardwareElements",
                            		lv_implicitHardwareElements_8_0, 
                            		"DeploymentImplicitDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2298:3: (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2298:5: otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) )
            	    {
            	    otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleValidDeployment5484); 

            	        	newLeafNode(otherlv_9, grammarAccess.getValidDeploymentAccess().getCommaKeyword_6_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2302:1: ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==RULE_ID) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==53) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2302:2: ( ( ruleQualifiedName ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2302:2: ( ( ruleQualifiedName ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2303:1: ( ruleQualifiedName )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2303:1: ( ruleQualifiedName )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2304:3: ruleQualifiedName
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getValidDeploymentRule());
            	            	        }
            	                    
            	             
            	            	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_6_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleValidDeployment5508);
            	            ruleQualifiedName();

            	            state._fsp--;

            	             
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2318:6: ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2318:6: ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2319:1: (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2319:1: (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2320:3: lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getImplicitHardwareElementsDeploymentImplicitDefinitionParserRuleCall_6_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeployment5535);
            	            lv_implicitHardwareElements_11_0=ruleDeploymentImplicitDefinition();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getValidDeploymentRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"implicitHardwareElements",
            	                    		lv_implicitHardwareElements_11_0, 
            	                    		"DeploymentImplicitDefinition");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleValidDeployment5550); 

                	newLeafNode(otherlv_12, grammarAccess.getValidDeploymentAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleValidDeployment5562); 

                	newLeafNode(otherlv_13, grammarAccess.getValidDeploymentAccess().getSemicolonKeyword_8());
                

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
    // $ANTLR end "ruleValidDeployment"


    // $ANTLR start "entryRuleInvalidDeployment"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2352:1: entryRuleInvalidDeployment returns [EObject current=null] : iv_ruleInvalidDeployment= ruleInvalidDeployment EOF ;
    public final EObject entryRuleInvalidDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidDeployment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2353:2: (iv_ruleInvalidDeployment= ruleInvalidDeployment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2354:2: iv_ruleInvalidDeployment= ruleInvalidDeployment EOF
            {
             newCompositeNode(grammarAccess.getInvalidDeploymentRule()); 
            pushFollow(FOLLOW_ruleInvalidDeployment_in_entryRuleInvalidDeployment5598);
            iv_ruleInvalidDeployment=ruleInvalidDeployment();

            state._fsp--;

             current =iv_ruleInvalidDeployment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvalidDeployment5608); 

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
    // $ANTLR end "entryRuleInvalidDeployment"


    // $ANTLR start "ruleInvalidDeployment"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2361:1: ruleInvalidDeployment returns [EObject current=null] : (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';' ) ;
    public final EObject ruleInvalidDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_implicitHardwareElements_8_0 = null;

        EObject lv_implicitHardwareElements_11_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2364:28: ( (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2365:1: (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2365:1: (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2365:3: otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleInvalidDeployment5645); 

                	newLeafNode(otherlv_0, grammarAccess.getInvalidDeploymentAccess().getInvalidForKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2369:1: ( (otherlv_1= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2370:1: (otherlv_1= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2370:1: (otherlv_1= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2371:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvalidDeployment5665); 

            		newLeafNode(otherlv_1, grammarAccess.getInvalidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2382:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==33) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2382:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleInvalidDeployment5678); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInvalidDeploymentAccess().getCommaKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2386:1: ( (otherlv_3= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2387:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2387:1: (otherlv_3= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2388:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvalidDeployment5698); 

            	    		newLeafNode(otherlv_3, grammarAccess.getInvalidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2399:4: (otherlv_4= 'is' | otherlv_5= 'are' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            else if ( (LA27_0==51) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2399:6: otherlv_4= 'is'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleInvalidDeployment5713); 

                        	newLeafNode(otherlv_4, grammarAccess.getInvalidDeploymentAccess().getIsKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2404:7: otherlv_5= 'are'
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleInvalidDeployment5731); 

                        	newLeafNode(otherlv_5, grammarAccess.getInvalidDeploymentAccess().getAreKeyword_3_1());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleInvalidDeployment5744); 

                	newLeafNode(otherlv_6, grammarAccess.getInvalidDeploymentAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2412:1: ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==53) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2412:2: ( ( ruleQualifiedName ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2412:2: ( ( ruleQualifiedName ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2413:1: ( ruleQualifiedName )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2413:1: ( ruleQualifiedName )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2414:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment5768);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2428:6: ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2428:6: ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2429:1: (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2429:1: (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2430:3: lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getImplicitHardwareElementsDeploymentImplicitDefinitionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeployment5795);
                    lv_implicitHardwareElements_8_0=ruleDeploymentImplicitDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInvalidDeploymentRule());
                    	        }
                           		add(
                           			current, 
                           			"implicitHardwareElements",
                            		lv_implicitHardwareElements_8_0, 
                            		"DeploymentImplicitDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2446:3: (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==33) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2446:5: otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) )
            	    {
            	    otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleInvalidDeployment5809); 

            	        	newLeafNode(otherlv_9, grammarAccess.getInvalidDeploymentAccess().getCommaKeyword_6_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2450:1: ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==RULE_ID) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==53) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2450:2: ( ( ruleQualifiedName ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2450:2: ( ( ruleQualifiedName ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2451:1: ( ruleQualifiedName )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2451:1: ( ruleQualifiedName )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2452:3: ruleQualifiedName
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
            	            	        }
            	                    
            	             
            	            	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_6_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment5833);
            	            ruleQualifiedName();

            	            state._fsp--;

            	             
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2466:6: ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2466:6: ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2467:1: (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2467:1: (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2468:3: lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getImplicitHardwareElementsDeploymentImplicitDefinitionParserRuleCall_6_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeployment5860);
            	            lv_implicitHardwareElements_11_0=ruleDeploymentImplicitDefinition();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getInvalidDeploymentRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"implicitHardwareElements",
            	                    		lv_implicitHardwareElements_11_0, 
            	                    		"DeploymentImplicitDefinition");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleInvalidDeployment5875); 

                	newLeafNode(otherlv_12, grammarAccess.getInvalidDeploymentAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleInvalidDeployment5887); 

                	newLeafNode(otherlv_13, grammarAccess.getInvalidDeploymentAccess().getSemicolonKeyword_8());
                

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
    // $ANTLR end "ruleInvalidDeployment"


    // $ANTLR start "entryRuleDeploymentImplicitDefinition"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2500:1: entryRuleDeploymentImplicitDefinition returns [EObject current=null] : iv_ruleDeploymentImplicitDefinition= ruleDeploymentImplicitDefinition EOF ;
    public final EObject entryRuleDeploymentImplicitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentImplicitDefinition = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2501:2: (iv_ruleDeploymentImplicitDefinition= ruleDeploymentImplicitDefinition EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2502:2: iv_ruleDeploymentImplicitDefinition= ruleDeploymentImplicitDefinition EOF
            {
             newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionRule()); 
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_entryRuleDeploymentImplicitDefinition5923);
            iv_ruleDeploymentImplicitDefinition=ruleDeploymentImplicitDefinition();

            state._fsp--;

             current =iv_ruleDeploymentImplicitDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinition5933); 

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
    // $ANTLR end "entryRuleDeploymentImplicitDefinition"


    // $ANTLR start "ruleDeploymentImplicitDefinition"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2509:1: ruleDeploymentImplicitDefinition returns [EObject current=null] : (otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )* ) ;
    public final EObject ruleDeploymentImplicitDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2512:28: ( (otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2513:1: (otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )* )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2513:1: (otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2513:3: otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )*
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleDeploymentImplicitDefinition5970); 

                	newLeafNode(otherlv_0, grammarAccess.getDeploymentImplicitDefinitionAccess().getConnectorsWithKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2517:1: ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2518:1: (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2518:1: (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2519:3: lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionAccess().getEntriesDeploymentImplicitDefinitionAttributeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_ruleDeploymentImplicitDefinition5991);
            lv_entries_1_0=ruleDeploymentImplicitDefinitionAttributeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeploymentImplicitDefinitionRule());
            	        }
                   		add(
                   			current, 
                   			"entries",
                    		lv_entries_1_0, 
                    		"DeploymentImplicitDefinitionAttributeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2535:2: (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==35) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2535:4: otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleDeploymentImplicitDefinition6004); 

            	        	newLeafNode(otherlv_2, grammarAccess.getDeploymentImplicitDefinitionAccess().getAndKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2539:1: ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2540:1: (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2540:1: (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2541:3: lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionAccess().getEntriesDeploymentImplicitDefinitionAttributeAndValueParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_ruleDeploymentImplicitDefinition6025);
            	    lv_entries_3_0=ruleDeploymentImplicitDefinitionAttributeAndValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeploymentImplicitDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entries",
            	            		lv_entries_3_0, 
            	            		"DeploymentImplicitDefinitionAttributeAndValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


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
    // $ANTLR end "ruleDeploymentImplicitDefinition"


    // $ANTLR start "entryRuleDeploymentImplicitDefinitionAttributeAndValue"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2565:1: entryRuleDeploymentImplicitDefinitionAttributeAndValue returns [EObject current=null] : iv_ruleDeploymentImplicitDefinitionAttributeAndValue= ruleDeploymentImplicitDefinitionAttributeAndValue EOF ;
    public final EObject entryRuleDeploymentImplicitDefinitionAttributeAndValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentImplicitDefinitionAttributeAndValue = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2566:2: (iv_ruleDeploymentImplicitDefinitionAttributeAndValue= ruleDeploymentImplicitDefinitionAttributeAndValue EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2567:2: iv_ruleDeploymentImplicitDefinitionAttributeAndValue= ruleDeploymentImplicitDefinitionAttributeAndValue EOF
            {
             newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueRule()); 
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_entryRuleDeploymentImplicitDefinitionAttributeAndValue6063);
            iv_ruleDeploymentImplicitDefinitionAttributeAndValue=ruleDeploymentImplicitDefinitionAttributeAndValue();

            state._fsp--;

             current =iv_ruleDeploymentImplicitDefinitionAttributeAndValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinitionAttributeAndValue6073); 

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
    // $ANTLR end "entryRuleDeploymentImplicitDefinitionAttributeAndValue"


    // $ANTLR start "ruleDeploymentImplicitDefinitionAttributeAndValue"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2574:1: ruleDeploymentImplicitDefinitionAttributeAndValue returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDeploymentImplicitDefinitionAttributeAndValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_attribute_0_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2577:28: ( ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2578:1: ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2578:1: ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2578:2: ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2578:2: ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2579:1: (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2579:1: (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2580:3: lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute
            {
             
            	        newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueAccess().getAttributeDeploymentImplicitDefinitionAttributeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinitionAttribute_in_ruleDeploymentImplicitDefinitionAttributeAndValue6119);
            lv_attribute_0_0=ruleDeploymentImplicitDefinitionAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueRule());
            	        }
                   		set(
                   			current, 
                   			"attribute",
                    		lv_attribute_0_0, 
                    		"DeploymentImplicitDefinitionAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDeploymentImplicitDefinitionAttributeAndValue6131); 

                	newLeafNode(otherlv_1, grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2600:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2601:1: (lv_value_2_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2601:1: (lv_value_2_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2602:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeploymentImplicitDefinitionAttributeAndValue6148); 

            			newLeafNode(lv_value_2_0, grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


            }


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
    // $ANTLR end "ruleDeploymentImplicitDefinitionAttributeAndValue"


    // $ANTLR start "entryRuleQualifiedName"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2628:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2629:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2630:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName6192);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName6203); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2637:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2640:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2641:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2641:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2641:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName6243); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2648:1: (kw= '.' this_ID_2= RULE_ID )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==54) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2649:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,54,FOLLOW_54_in_ruleQualifiedName6262); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName6277); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleImplicitEqInterfaceMemberDefinitionAttribute"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2669:1: ruleImplicitEqInterfaceMemberDefinitionAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'Name' ) | (enumLiteral_1= 'System' ) | (enumLiteral_2= 'SubAta' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) | (enumLiteral_10= 'Resource' ) | (enumLiteral_11= 'ResourceX' ) | (enumLiteral_12= 'ResourceY' ) | (enumLiteral_13= 'ResourceZ' ) ) ;
    public final Enumerator ruleImplicitEqInterfaceMemberDefinitionAttribute() throws RecognitionException {
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

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2671:28: ( ( (enumLiteral_0= 'Name' ) | (enumLiteral_1= 'System' ) | (enumLiteral_2= 'SubAta' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) | (enumLiteral_10= 'Resource' ) | (enumLiteral_11= 'ResourceX' ) | (enumLiteral_12= 'ResourceY' ) | (enumLiteral_13= 'ResourceZ' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2672:1: ( (enumLiteral_0= 'Name' ) | (enumLiteral_1= 'System' ) | (enumLiteral_2= 'SubAta' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) | (enumLiteral_10= 'Resource' ) | (enumLiteral_11= 'ResourceX' ) | (enumLiteral_12= 'ResourceY' ) | (enumLiteral_13= 'ResourceZ' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2672:1: ( (enumLiteral_0= 'Name' ) | (enumLiteral_1= 'System' ) | (enumLiteral_2= 'SubAta' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) | (enumLiteral_10= 'Resource' ) | (enumLiteral_11= 'ResourceX' ) | (enumLiteral_12= 'ResourceY' ) | (enumLiteral_13= 'ResourceZ' ) )
            int alt33=14;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt33=1;
                }
                break;
            case 38:
                {
                alt33=2;
                }
                break;
            case 39:
                {
                alt33=3;
                }
                break;
            case 41:
                {
                alt33=4;
                }
                break;
            case 42:
                {
                alt33=5;
                }
                break;
            case 43:
                {
                alt33=6;
                }
                break;
            case 44:
                {
                alt33=7;
                }
                break;
            case 45:
                {
                alt33=8;
                }
                break;
            case 46:
                {
                alt33=9;
                }
                break;
            case 26:
                {
                alt33=10;
                }
                break;
            case 40:
                {
                alt33=11;
                }
                break;
            case 28:
                {
                alt33=12;
                }
                break;
            case 29:
                {
                alt33=13;
                }
                break;
            case 30:
                {
                alt33=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2672:2: (enumLiteral_0= 'Name' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2672:2: (enumLiteral_0= 'Name' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2672:4: enumLiteral_0= 'Name'
                    {
                    enumLiteral_0=(Token)match(input,13,FOLLOW_13_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6338); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getNAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getNAMEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2678:6: (enumLiteral_1= 'System' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2678:6: (enumLiteral_1= 'System' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2678:8: enumLiteral_1= 'System'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_38_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6355); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getSYSTEMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getSYSTEMEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2684:6: (enumLiteral_2= 'SubAta' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2684:6: (enumLiteral_2= 'SubAta' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2684:8: enumLiteral_2= 'SubAta'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6372); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getSUBATAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getSUBATAEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2690:6: (enumLiteral_3= 'LineName' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2690:6: (enumLiteral_3= 'LineName' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2690:8: enumLiteral_3= 'LineName'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_41_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6389); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getLINENAMEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getLINENAMEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2696:6: (enumLiteral_4= 'WiringLane' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2696:6: (enumLiteral_4= 'WiringLane' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2696:8: enumLiteral_4= 'WiringLane'
                    {
                    enumLiteral_4=(Token)match(input,42,FOLLOW_42_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6406); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getWIRINGLANEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getWIRINGLANEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2702:6: (enumLiteral_5= 'GrpInfo' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2702:6: (enumLiteral_5= 'GrpInfo' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2702:8: enumLiteral_5= 'GrpInfo'
                    {
                    enumLiteral_5=(Token)match(input,43,FOLLOW_43_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6423); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getGRPINFOEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getGRPINFOEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2708:6: (enumLiteral_6= 'Route' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2708:6: (enumLiteral_6= 'Route' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2708:8: enumLiteral_6= 'Route'
                    {
                    enumLiteral_6=(Token)match(input,44,FOLLOW_44_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6440); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getROUTEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getROUTEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2714:6: (enumLiteral_7= 'PwSup1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2714:6: (enumLiteral_7= 'PwSup1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2714:8: enumLiteral_7= 'PwSup1'
                    {
                    enumLiteral_7=(Token)match(input,45,FOLLOW_45_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6457); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getPWSUP1EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getPWSUP1EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2720:6: (enumLiteral_8= 'EmhZone1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2720:6: (enumLiteral_8= 'EmhZone1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2720:8: enumLiteral_8= 'EmhZone1'
                    {
                    enumLiteral_8=(Token)match(input,46,FOLLOW_46_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6474); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getEMHZONE1EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getEMHZONE1EnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2726:6: (enumLiteral_9= 'Type' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2726:6: (enumLiteral_9= 'Type' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2726:8: enumLiteral_9= 'Type'
                    {
                    enumLiteral_9=(Token)match(input,26,FOLLOW_26_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6491); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getIOTYPEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getIOTYPEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2732:6: (enumLiteral_10= 'Resource' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2732:6: (enumLiteral_10= 'Resource' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2732:8: enumLiteral_10= 'Resource'
                    {
                    enumLiteral_10=(Token)match(input,40,FOLLOW_40_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6508); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCEEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2738:6: (enumLiteral_11= 'ResourceX' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2738:6: (enumLiteral_11= 'ResourceX' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2738:8: enumLiteral_11= 'ResourceX'
                    {
                    enumLiteral_11=(Token)match(input,28,FOLLOW_28_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6525); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_XEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_XEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2744:6: (enumLiteral_12= 'ResourceY' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2744:6: (enumLiteral_12= 'ResourceY' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2744:8: enumLiteral_12= 'ResourceY'
                    {
                    enumLiteral_12=(Token)match(input,29,FOLLOW_29_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6542); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_YEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_YEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2750:6: (enumLiteral_13= 'ResourceZ' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2750:6: (enumLiteral_13= 'ResourceZ' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2750:8: enumLiteral_13= 'ResourceZ'
                    {
                    enumLiteral_13=(Token)match(input,30,FOLLOW_30_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6559); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_ZEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_ZEnumLiteralDeclaration_13()); 
                        

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
    // $ANTLR end "ruleImplicitEqInterfaceMemberDefinitionAttribute"


    // $ANTLR start "ruleHardwareArchitectureLevelType"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2760:1: ruleHardwareArchitectureLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) ) ;
    public final Enumerator ruleHardwareArchitectureLevelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2762:28: ( ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2763:1: ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2763:1: ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt34=1;
                }
                break;
            case 25:
                {
                alt34=2;
                }
                break;
            case 31:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2763:2: (enumLiteral_0= 'Compartment' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2763:2: (enumLiteral_0= 'Compartment' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2763:4: enumLiteral_0= 'Compartment'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_20_in_ruleHardwareArchitectureLevelType6604); 

                            current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOMPARTMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOMPARTMENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2769:6: (enumLiteral_1= 'RDC' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2769:6: (enumLiteral_1= 'RDC' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2769:8: enumLiteral_1= 'RDC'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleHardwareArchitectureLevelType6621); 

                            current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getRDCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getHardwareArchitectureLevelTypeAccess().getRDCEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2775:6: (enumLiteral_2= 'Connector' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2775:6: (enumLiteral_2= 'Connector' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2775:8: enumLiteral_2= 'Connector'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_31_in_ruleHardwareArchitectureLevelType6638); 

                            current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getCONNECTOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getHardwareArchitectureLevelTypeAccess().getCONNECTOREnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleHardwareArchitectureLevelType"


    // $ANTLR start "ruleDeploymentImplicitDefinitionAttribute"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2785:1: ruleDeploymentImplicitDefinitionAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'Compartment.Name' ) | (enumLiteral_1= 'Compartment.Manufacturer' ) | (enumLiteral_2= 'Compartment.PowerSupply' ) | (enumLiteral_3= 'Compartment.Side' ) | (enumLiteral_4= 'Compartment.Zone' ) | (enumLiteral_5= 'RDC.Name' ) | (enumLiteral_6= 'RDC.Manufacturer' ) | (enumLiteral_7= 'RDC.PowerSupply' ) | (enumLiteral_8= 'RDC.Side' ) | (enumLiteral_9= 'RDC.Type' ) | (enumLiteral_10= 'RDC.ESS' ) | (enumLiteral_11= 'RDC.ResourceX' ) | (enumLiteral_12= 'RDC.ResourceY' ) | (enumLiteral_13= 'RDC.ResourceZ' ) | (enumLiteral_14= 'Connector.Name' ) ) ;
    public final Enumerator ruleDeploymentImplicitDefinitionAttribute() throws RecognitionException {
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

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2787:28: ( ( (enumLiteral_0= 'Compartment.Name' ) | (enumLiteral_1= 'Compartment.Manufacturer' ) | (enumLiteral_2= 'Compartment.PowerSupply' ) | (enumLiteral_3= 'Compartment.Side' ) | (enumLiteral_4= 'Compartment.Zone' ) | (enumLiteral_5= 'RDC.Name' ) | (enumLiteral_6= 'RDC.Manufacturer' ) | (enumLiteral_7= 'RDC.PowerSupply' ) | (enumLiteral_8= 'RDC.Side' ) | (enumLiteral_9= 'RDC.Type' ) | (enumLiteral_10= 'RDC.ESS' ) | (enumLiteral_11= 'RDC.ResourceX' ) | (enumLiteral_12= 'RDC.ResourceY' ) | (enumLiteral_13= 'RDC.ResourceZ' ) | (enumLiteral_14= 'Connector.Name' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2788:1: ( (enumLiteral_0= 'Compartment.Name' ) | (enumLiteral_1= 'Compartment.Manufacturer' ) | (enumLiteral_2= 'Compartment.PowerSupply' ) | (enumLiteral_3= 'Compartment.Side' ) | (enumLiteral_4= 'Compartment.Zone' ) | (enumLiteral_5= 'RDC.Name' ) | (enumLiteral_6= 'RDC.Manufacturer' ) | (enumLiteral_7= 'RDC.PowerSupply' ) | (enumLiteral_8= 'RDC.Side' ) | (enumLiteral_9= 'RDC.Type' ) | (enumLiteral_10= 'RDC.ESS' ) | (enumLiteral_11= 'RDC.ResourceX' ) | (enumLiteral_12= 'RDC.ResourceY' ) | (enumLiteral_13= 'RDC.ResourceZ' ) | (enumLiteral_14= 'Connector.Name' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2788:1: ( (enumLiteral_0= 'Compartment.Name' ) | (enumLiteral_1= 'Compartment.Manufacturer' ) | (enumLiteral_2= 'Compartment.PowerSupply' ) | (enumLiteral_3= 'Compartment.Side' ) | (enumLiteral_4= 'Compartment.Zone' ) | (enumLiteral_5= 'RDC.Name' ) | (enumLiteral_6= 'RDC.Manufacturer' ) | (enumLiteral_7= 'RDC.PowerSupply' ) | (enumLiteral_8= 'RDC.Side' ) | (enumLiteral_9= 'RDC.Type' ) | (enumLiteral_10= 'RDC.ESS' ) | (enumLiteral_11= 'RDC.ResourceX' ) | (enumLiteral_12= 'RDC.ResourceY' ) | (enumLiteral_13= 'RDC.ResourceZ' ) | (enumLiteral_14= 'Connector.Name' ) )
            int alt35=15;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt35=1;
                }
                break;
            case 56:
                {
                alt35=2;
                }
                break;
            case 57:
                {
                alt35=3;
                }
                break;
            case 58:
                {
                alt35=4;
                }
                break;
            case 59:
                {
                alt35=5;
                }
                break;
            case 60:
                {
                alt35=6;
                }
                break;
            case 61:
                {
                alt35=7;
                }
                break;
            case 62:
                {
                alt35=8;
                }
                break;
            case 63:
                {
                alt35=9;
                }
                break;
            case 64:
                {
                alt35=10;
                }
                break;
            case 65:
                {
                alt35=11;
                }
                break;
            case 66:
                {
                alt35=12;
                }
                break;
            case 67:
                {
                alt35=13;
                }
                break;
            case 68:
                {
                alt35=14;
                }
                break;
            case 69:
                {
                alt35=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2788:2: (enumLiteral_0= 'Compartment.Name' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2788:2: (enumLiteral_0= 'Compartment.Name' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2788:4: enumLiteral_0= 'Compartment.Name'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleDeploymentImplicitDefinitionAttribute6683); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_NAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_NAMEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2794:6: (enumLiteral_1= 'Compartment.Manufacturer' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2794:6: (enumLiteral_1= 'Compartment.Manufacturer' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2794:8: enumLiteral_1= 'Compartment.Manufacturer'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_56_in_ruleDeploymentImplicitDefinitionAttribute6700); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_MANUFACTUREREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_MANUFACTUREREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2800:6: (enumLiteral_2= 'Compartment.PowerSupply' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2800:6: (enumLiteral_2= 'Compartment.PowerSupply' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2800:8: enumLiteral_2= 'Compartment.PowerSupply'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_57_in_ruleDeploymentImplicitDefinitionAttribute6717); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_POWERSUPPLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_POWERSUPPLYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2806:6: (enumLiteral_3= 'Compartment.Side' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2806:6: (enumLiteral_3= 'Compartment.Side' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2806:8: enumLiteral_3= 'Compartment.Side'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_58_in_ruleDeploymentImplicitDefinitionAttribute6734); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_SIDEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_SIDEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2812:6: (enumLiteral_4= 'Compartment.Zone' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2812:6: (enumLiteral_4= 'Compartment.Zone' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2812:8: enumLiteral_4= 'Compartment.Zone'
                    {
                    enumLiteral_4=(Token)match(input,59,FOLLOW_59_in_ruleDeploymentImplicitDefinitionAttribute6751); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_ZONEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_ZONEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2818:6: (enumLiteral_5= 'RDC.Name' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2818:6: (enumLiteral_5= 'RDC.Name' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2818:8: enumLiteral_5= 'RDC.Name'
                    {
                    enumLiteral_5=(Token)match(input,60,FOLLOW_60_in_ruleDeploymentImplicitDefinitionAttribute6768); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_NAMEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_NAMEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2824:6: (enumLiteral_6= 'RDC.Manufacturer' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2824:6: (enumLiteral_6= 'RDC.Manufacturer' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2824:8: enumLiteral_6= 'RDC.Manufacturer'
                    {
                    enumLiteral_6=(Token)match(input,61,FOLLOW_61_in_ruleDeploymentImplicitDefinitionAttribute6785); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_MANUFACTUREREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_MANUFACTUREREnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2830:6: (enumLiteral_7= 'RDC.PowerSupply' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2830:6: (enumLiteral_7= 'RDC.PowerSupply' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2830:8: enumLiteral_7= 'RDC.PowerSupply'
                    {
                    enumLiteral_7=(Token)match(input,62,FOLLOW_62_in_ruleDeploymentImplicitDefinitionAttribute6802); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_POWERSUPPLYEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_POWERSUPPLYEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2836:6: (enumLiteral_8= 'RDC.Side' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2836:6: (enumLiteral_8= 'RDC.Side' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2836:8: enumLiteral_8= 'RDC.Side'
                    {
                    enumLiteral_8=(Token)match(input,63,FOLLOW_63_in_ruleDeploymentImplicitDefinitionAttribute6819); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_SIDEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_SIDEEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2842:6: (enumLiteral_9= 'RDC.Type' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2842:6: (enumLiteral_9= 'RDC.Type' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2842:8: enumLiteral_9= 'RDC.Type'
                    {
                    enumLiteral_9=(Token)match(input,64,FOLLOW_64_in_ruleDeploymentImplicitDefinitionAttribute6836); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_TYPEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_TYPEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2848:6: (enumLiteral_10= 'RDC.ESS' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2848:6: (enumLiteral_10= 'RDC.ESS' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2848:8: enumLiteral_10= 'RDC.ESS'
                    {
                    enumLiteral_10=(Token)match(input,65,FOLLOW_65_in_ruleDeploymentImplicitDefinitionAttribute6853); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_ESSEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_ESSEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2854:6: (enumLiteral_11= 'RDC.ResourceX' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2854:6: (enumLiteral_11= 'RDC.ResourceX' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2854:8: enumLiteral_11= 'RDC.ResourceX'
                    {
                    enumLiteral_11=(Token)match(input,66,FOLLOW_66_in_ruleDeploymentImplicitDefinitionAttribute6870); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_XEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_XEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2860:6: (enumLiteral_12= 'RDC.ResourceY' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2860:6: (enumLiteral_12= 'RDC.ResourceY' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2860:8: enumLiteral_12= 'RDC.ResourceY'
                    {
                    enumLiteral_12=(Token)match(input,67,FOLLOW_67_in_ruleDeploymentImplicitDefinitionAttribute6887); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_YEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_YEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2866:6: (enumLiteral_13= 'RDC.ResourceZ' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2866:6: (enumLiteral_13= 'RDC.ResourceZ' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2866:8: enumLiteral_13= 'RDC.ResourceZ'
                    {
                    enumLiteral_13=(Token)match(input,68,FOLLOW_68_in_ruleDeploymentImplicitDefinitionAttribute6904); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_ZEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_ZEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2872:6: (enumLiteral_14= 'Connector.Name' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2872:6: (enumLiteral_14= 'Connector.Name' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2872:8: enumLiteral_14= 'Connector.Name'
                    {
                    enumLiteral_14=(Token)match(input,69,FOLLOW_69_in_ruleDeploymentImplicitDefinitionAttribute6921); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCONNECTOR_NAMEEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCONNECTOR_NAMEEnumLiteralDeclaration_14()); 
                        

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
    // $ANTLR end "ruleDeploymentImplicitDefinitionAttribute"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA6_eotS =
        "\11\uffff";
    static final String DFA6_eofS =
        "\11\uffff";
    static final String DFA6_minS =
        "\1\5\1\uffff\1\41\2\uffff\1\5\2\uffff\1\41";
    static final String DFA6_maxS =
        "\1\64\1\uffff\1\60\2\uffff\1\5\2\uffff\1\60";
    static final String DFA6_acceptS =
        "\1\uffff\1\5\1\uffff\1\3\1\4\1\uffff\1\1\1\2\1\uffff";
    static final String DFA6_specialS =
        "\11\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\12\uffff\1\1\40\uffff\1\3\2\uffff\1\4",
            "",
            "\1\5\15\uffff\1\6\1\7",
            "",
            "",
            "\1\10",
            "",
            "",
            "\1\5\15\uffff\1\6\1\7"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 228:1: ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_22_0= ruleInvalidDeployment ) ) )*";
        }
    }
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\20\11\uffff";
    static final String DFA11_maxS =
        "\1\37\11\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA11_specialS =
        "\1\0\11\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\4\uffff\1\2\1\3\3\uffff\1\4\1\5\1\6\1\7\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()+ loopback of 627:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ResourceX' otherlv_21= '=' ( (lv_resourceX_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceY' otherlv_25= '=' ( (lv_resourceY_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceZ' otherlv_29= '=' ( (lv_resourceZ_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_32_0= ruleConnector ) ) )+ ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                         
                        int index11_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_0==16) ) {s = 1;}

                        else if ( LA11_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA11_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA11_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA11_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA11_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA11_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA11_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA11_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                         
                        input.seek(index11_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\17\uffff";
    static final String DFA18_eofS =
        "\17\uffff";
    static final String DFA18_minS =
        "\1\20\16\uffff";
    static final String DFA18_maxS =
        "\1\56\16\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\16\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15";
    static final String DFA18_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\11\uffff\1\13\1\uffff\1\14\1\15\1\16\7\uffff\1\2\1\3\1"+
            "\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 1483:3: ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= RULE_STRING ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= RULE_STRING ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= RULE_STRING ) ) otherlv_55= ';' ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                         
                        int index18_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_0==16) ) {s = 1;}

                        else if ( LA18_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA18_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA18_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA18_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA18_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA18_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA18_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA18_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA18_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA18_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                        else if ( LA18_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 10) ) {s = 12;}

                        else if ( LA18_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 11) ) {s = 13;}

                        else if ( LA18_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 12) ) {s = 14;}

                         
                        input.seek(index18_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleAssistModel_in_entryRuleAssistModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssistModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAssistModel122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel134 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssistModel146 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAssistModel158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssistModel175 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAssistModel192 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel204 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleCompartment_in_ruleAssistModel225 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_17_in_ruleAssistModel239 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel251 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleEqInterface_in_ruleAssistModel272 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel285 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_ruleAssistModel300 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel312 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroup_in_ruleAssistModel334 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroupWithCombinedDefinition_in_ruleAssistModel361 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel375 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAssistModel390 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel402 = new BitSet(new long[]{0x0012000000010020L});
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_ruleAssistModel424 = new BitSet(new long[]{0x0012000000010020L});
    public static final BitSet FOLLOW_ruleColocalityRelation_in_ruleAssistModel451 = new BitSet(new long[]{0x0012000000010020L});
    public static final BitSet FOLLOW_ruleValidDeployment_in_ruleAssistModel478 = new BitSet(new long[]{0x0012000000010020L});
    public static final BitSet FOLLOW_ruleInvalidDeployment_in_ruleAssistModel505 = new BitSet(new long[]{0x0012000000010020L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartment_in_entryRuleCompartment557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartment567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCompartment604 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompartment621 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompartment638 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_21_in_ruleCompartment696 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment725 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment742 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_22_in_ruleCompartment810 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment839 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment856 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_23_in_ruleCompartment924 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment936 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment953 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment970 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_24_in_ruleCompartment1038 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment1050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment1067 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment1084 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_ruleRDC_in_ruleCompartment1160 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_16_in_ruleCompartment1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDC_in_entryRuleRDC1255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRDC1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRDC1302 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRDC1319 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRDC1336 = new BitSet(new long[]{0x00000000FC600000L});
    public static final BitSet FOLLOW_21_in_ruleRDC1394 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1423 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1440 = new BitSet(new long[]{0x00000000FC610000L});
    public static final BitSet FOLLOW_22_in_ruleRDC1508 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1537 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1554 = new BitSet(new long[]{0x00000000FC610000L});
    public static final BitSet FOLLOW_26_in_ruleRDC1622 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1651 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1668 = new BitSet(new long[]{0x00000000FC610000L});
    public static final BitSet FOLLOW_27_in_ruleRDC1736 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1765 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1782 = new BitSet(new long[]{0x00000000FC610000L});
    public static final BitSet FOLLOW_28_in_ruleRDC1850 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1879 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1896 = new BitSet(new long[]{0x00000000FC610000L});
    public static final BitSet FOLLOW_29_in_ruleRDC1964 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1993 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC2010 = new BitSet(new long[]{0x00000000FC610000L});
    public static final BitSet FOLLOW_30_in_ruleRDC2078 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC2090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC2107 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC2124 = new BitSet(new long[]{0x00000000FC610000L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleRDC2200 = new BitSet(new long[]{0x00000000FC610000L});
    public static final BitSet FOLLOW_16_in_ruleRDC2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector2295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleConnector2342 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnector2359 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConnector2376 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAvailableEqInterface_in_ruleConnector2397 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleConnector2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvailableEqInterface_in_entryRuleAvailableEqInterface2446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvailableEqInterface2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAvailableEqInterface2498 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAvailableEqInterface2515 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAvailableEqInterface2532 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAvailableEqInterface2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroup_in_entryRuleEqInterfaceGroup2585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterfaceGroup2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEqInterfaceGroup2632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup2649 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterfaceGroup2666 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup2687 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup2714 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_33_in_ruleEqInterfaceGroup2728 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup2749 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup2776 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_16_in_ruleEqInterfaceGroup2791 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterfaceGroup2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_entryRuleImplicitEqInterfaceMemberDefinition2839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitEqInterfaceMemberDefinition2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleImplicitEqInterfaceMemberDefinition2886 = new BitSet(new long[]{0x00007FC074002000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_ruleImplicitEqInterfaceMemberDefinition2907 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleImplicitEqInterfaceMemberDefinition2920 = new BitSet(new long[]{0x00007FC074002000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_ruleImplicitEqInterfaceMemberDefinition2941 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues2979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttribute_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues3035 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues3047 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroupWithCombinedDefinition_in_entryRuleEqInterfaceGroupWithCombinedDefinition3105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterfaceGroupWithCombinedDefinition3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEqInterfaceGroupWithCombinedDefinition3152 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition3169 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleEqInterfaceGroupWithCombinedDefinition3186 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition3206 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_35_in_ruleEqInterfaceGroupWithCombinedDefinition3219 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition3239 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterfaceGroupWithCombinedDefinition3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterface_in_entryRuleEqInterface3289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterface3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleEqInterface3336 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterface3353 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterface3370 = new BitSet(new long[]{0x00007FC074010000L});
    public static final BitSet FOLLOW_38_in_ruleEqInterface3428 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface3440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface3457 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface3474 = new BitSet(new long[]{0x00007FC074010000L});
    public static final BitSet FOLLOW_39_in_ruleEqInterface3542 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface3554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface3571 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface3588 = new BitSet(new long[]{0x00007FC074010000L});
    public static final BitSet FOLLOW_40_in_ruleEqInterface3656 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface3668 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface3685 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface3702 = new BitSet(new long[]{0x00007FC074010000L});
    public static final BitSet FOLLOW_41_in_ruleEqInterface3770 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface3782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface3799 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface3816 = new BitSet(new long[]{0x00007FC074010000L});
    public static final BitSet FOLLOW_42_in_ruleEqInterface3884 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface3896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface3913 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface3930 = new BitSet(new long[]{0x00007FC074010000L});
    public static final BitSet FOLLOW_43_in_ruleEqInterface3998 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface4010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface4027 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface4044 = new BitSet(new long[]{0x00007FC074010000L});
    public static final BitSet FOLLOW_44_in_ruleEqInterface4112 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface4124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface4141 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface4158 = new BitSet(new long[]{0x00007FC074010000L});
    public static final BitSet FOLLOW_45_in_ruleEqInterface4226 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface4238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface4255 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface4272 = new BitSet(new long[]{0x00007FC074010000L});
    public static final BitSet FOLLOW_46_in_ruleEqInterface4340 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface4352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface4369 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface4386 = new BitSet(new long[]{0x00007FC074010000L});
    public static final BitSet FOLLOW_26_in_ruleEqInterface4454 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface4466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface4483 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface4500 = new BitSet(new long[]{0x00007FC074010000L});
    public static final BitSet FOLLOW_28_in_ruleEqInterface4568 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface4580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface4597 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface4614 = new BitSet(new long[]{0x00007FC074010000L});
    public static final BitSet FOLLOW_29_in_ruleEqInterface4682 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface4694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface4711 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface4728 = new BitSet(new long[]{0x00007FC074010000L});
    public static final BitSet FOLLOW_30_in_ruleEqInterface4796 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface4808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface4825 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface4842 = new BitSet(new long[]{0x00007FC074010000L});
    public static final BitSet FOLLOW_16_in_ruleEqInterface4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation4931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDislocalityRelation4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDislocalityRelation4986 = new BitSet(new long[]{0x0000800200000000L});
    public static final BitSet FOLLOW_33_in_ruleDislocalityRelation4999 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDislocalityRelation5019 = new BitSet(new long[]{0x0000800200000000L});
    public static final BitSet FOLLOW_47_in_ruleDislocalityRelation5033 = new BitSet(new long[]{0x0000000082100000L});
    public static final BitSet FOLLOW_ruleHardwareArchitectureLevelType_in_ruleDislocalityRelation5054 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDislocalityRelation5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColocalityRelation_in_entryRuleColocalityRelation5102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColocalityRelation5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColocalityRelation5157 = new BitSet(new long[]{0x0001000200000000L});
    public static final BitSet FOLLOW_33_in_ruleColocalityRelation5170 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColocalityRelation5190 = new BitSet(new long[]{0x0001000200000000L});
    public static final BitSet FOLLOW_48_in_ruleColocalityRelation5204 = new BitSet(new long[]{0x0000000082100000L});
    public static final BitSet FOLLOW_ruleHardwareArchitectureLevelType_in_ruleColocalityRelation5225 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleColocalityRelation5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidDeployment_in_entryRuleValidDeployment5273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidDeployment5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleValidDeployment5320 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidDeployment5340 = new BitSet(new long[]{0x000C000200000000L});
    public static final BitSet FOLLOW_33_in_ruleValidDeployment5353 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidDeployment5373 = new BitSet(new long[]{0x000C000200000000L});
    public static final BitSet FOLLOW_50_in_ruleValidDeployment5388 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_51_in_ruleValidDeployment5406 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleValidDeployment5419 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleValidDeployment5443 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeployment5470 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_33_in_ruleValidDeployment5484 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleValidDeployment5508 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeployment5535 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_16_in_ruleValidDeployment5550 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleValidDeployment5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvalidDeployment_in_entryRuleInvalidDeployment5598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvalidDeployment5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleInvalidDeployment5645 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvalidDeployment5665 = new BitSet(new long[]{0x000C000200000000L});
    public static final BitSet FOLLOW_33_in_ruleInvalidDeployment5678 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvalidDeployment5698 = new BitSet(new long[]{0x000C000200000000L});
    public static final BitSet FOLLOW_50_in_ruleInvalidDeployment5713 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_51_in_ruleInvalidDeployment5731 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInvalidDeployment5744 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment5768 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeployment5795 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_33_in_ruleInvalidDeployment5809 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment5833 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeployment5860 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_16_in_ruleInvalidDeployment5875 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInvalidDeployment5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_entryRuleDeploymentImplicitDefinition5923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinition5933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDeploymentImplicitDefinition5970 = new BitSet(new long[]{0xFF80000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_ruleDeploymentImplicitDefinition5991 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleDeploymentImplicitDefinition6004 = new BitSet(new long[]{0xFF80000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_ruleDeploymentImplicitDefinition6025 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_entryRuleDeploymentImplicitDefinitionAttributeAndValue6063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinitionAttributeAndValue6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinitionAttribute_in_ruleDeploymentImplicitDefinitionAttributeAndValue6119 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeploymentImplicitDefinitionAttributeAndValue6131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeploymentImplicitDefinitionAttributeAndValue6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName6192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName6203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6243 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleQualifiedName6262 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6277 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleImplicitEqInterfaceMemberDefinitionAttribute6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleHardwareArchitectureLevelType6604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleHardwareArchitectureLevelType6621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleHardwareArchitectureLevelType6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleDeploymentImplicitDefinitionAttribute6683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDeploymentImplicitDefinitionAttribute6700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleDeploymentImplicitDefinitionAttribute6717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleDeploymentImplicitDefinitionAttribute6734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleDeploymentImplicitDefinitionAttribute6751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDeploymentImplicitDefinitionAttribute6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDeploymentImplicitDefinitionAttribute6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDeploymentImplicitDefinitionAttribute6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDeploymentImplicitDefinitionAttribute6819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDeploymentImplicitDefinitionAttribute6836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDeploymentImplicitDefinitionAttribute6853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleDeploymentImplicitDefinitionAttribute6870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDeploymentImplicitDefinitionAttribute6887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleDeploymentImplicitDefinitionAttribute6904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleDeploymentImplicitDefinitionAttribute6921 = new BitSet(new long[]{0x0000000000000002L});

}
