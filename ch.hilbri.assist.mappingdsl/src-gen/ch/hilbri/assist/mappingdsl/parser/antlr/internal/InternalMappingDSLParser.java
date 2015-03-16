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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Global'", "'{'", "'System name'", "'='", "';'", "'}'", "'Interfaces'", "'InterfaceGroups'", "'Restrictions'", "'Compartment'", "'Manufacturer'", "'PowerSupply'", "'Side'", "'Zone'", "'RDC'", "'Type'", "'ESS'", "'Connector'", "'Group'", "','", "'based on'", "'and'", "'Interface'", "'InterfaceSystem'", "'SubAta'", "'Resource'", "'LineName'", "'WiringLane'", "'GrpInfo'", "'Route'", "'PwSup1'", "'EmhZone1'", "'dislocal up to'", "'on same'", "'Valid for'", "'is'", "'are'", "'are RDCs with'", "'Invalid for'", "'.'", "'System'", "'RDC.Manufacturer'", "'RDC.PowerSupply'", "'RDC.Side'", "'RDC.Type'", "'RDC.ESS'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:77:1: ruleAssistModel returns [EObject current=null] : (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )+ (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithImplicitDefinition ) ) )* otherlv_16= '}' )? (otherlv_17= 'Restrictions' otherlv_18= '{' ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_validDeployments_22_0= ruleValidDeploymentImplicit ) ) ) | ( ( (lv_invalidDeployments_23_0= ruleInvalidDeployment ) ) | ( (lv_invalidDeployments_24_0= ruleInvalidDeploymentImplicit ) ) ) )* otherlv_25= '}' )? ) ;
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
        Token otherlv_25=null;
        EObject lv_compartments_7_0 = null;

        EObject lv_eqInterfaces_10_0 = null;

        EObject lv_eqInterfaceGroups_14_0 = null;

        EObject lv_eqInterfaceGroups_15_0 = null;

        EObject lv_dislocalityRelations_19_0 = null;

        EObject lv_colocalityRelations_20_0 = null;

        EObject lv_validDeployments_21_0 = null;

        EObject lv_validDeployments_22_0 = null;

        EObject lv_invalidDeployments_23_0 = null;

        EObject lv_invalidDeployments_24_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:80:28: ( (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )+ (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithImplicitDefinition ) ) )* otherlv_16= '}' )? (otherlv_17= 'Restrictions' otherlv_18= '{' ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_validDeployments_22_0= ruleValidDeploymentImplicit ) ) ) | ( ( (lv_invalidDeployments_23_0= ruleInvalidDeployment ) ) | ( (lv_invalidDeployments_24_0= ruleInvalidDeploymentImplicit ) ) ) )* otherlv_25= '}' )? ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )+ (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithImplicitDefinition ) ) )* otherlv_16= '}' )? (otherlv_17= 'Restrictions' otherlv_18= '{' ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_validDeployments_22_0= ruleValidDeploymentImplicit ) ) ) | ( ( (lv_invalidDeployments_23_0= ruleInvalidDeployment ) ) | ( (lv_invalidDeployments_24_0= ruleInvalidDeploymentImplicit ) ) ) )* otherlv_25= '}' )? )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )+ (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithImplicitDefinition ) ) )* otherlv_16= '}' )? (otherlv_17= 'Restrictions' otherlv_18= '{' ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_validDeployments_22_0= ruleValidDeploymentImplicit ) ) ) | ( ( (lv_invalidDeployments_23_0= ruleInvalidDeployment ) ) | ( (lv_invalidDeployments_24_0= ruleInvalidDeploymentImplicit ) ) ) )* otherlv_25= '}' )? )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:3: otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )+ (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithImplicitDefinition ) ) )* otherlv_16= '}' )? (otherlv_17= 'Restrictions' otherlv_18= '{' ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_validDeployments_22_0= ruleValidDeploymentImplicit ) ) ) | ( ( (lv_invalidDeployments_23_0= ruleInvalidDeployment ) ) | ( (lv_invalidDeployments_24_0= ruleInvalidDeploymentImplicit ) ) ) )* otherlv_25= '}' )?
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

                        if ( (LA2_0==33) ) {
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:171:3: (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithImplicitDefinition ) ) )* otherlv_16= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:171:5: otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithImplicitDefinition ) ) )* otherlv_16= '}'
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleAssistModel300); 

                        	newLeafNode(otherlv_12, grammarAccess.getAssistModelAccess().getInterfaceGroupsKeyword_9_0());
                        
                    otherlv_13=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel312); 

                        	newLeafNode(otherlv_13, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:179:1: ( ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithImplicitDefinition ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==29) ) {
                            int LA4_2 = input.LA(2);

                            if ( (LA4_2==RULE_ID) ) {
                                int LA4_3 = input.LA(3);

                                if ( (LA4_3==12) ) {
                                    alt4=1;
                                }
                                else if ( (LA4_3==31) ) {
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
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:198:6: ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithImplicitDefinition ) )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:198:6: ( (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithImplicitDefinition ) )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:199:1: (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithImplicitDefinition )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:199:1: (lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithImplicitDefinition )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:200:3: lv_eqInterfaceGroups_15_0= ruleEqInterfaceGroupWithImplicitDefinition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsEqInterfaceGroupWithImplicitDefinitionParserRuleCall_9_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEqInterfaceGroupWithImplicitDefinition_in_ruleAssistModel361);
                    	    lv_eqInterfaceGroups_15_0=ruleEqInterfaceGroupWithImplicitDefinition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eqInterfaceGroups",
                    	            		lv_eqInterfaceGroups_15_0, 
                    	            		"EqInterfaceGroupWithImplicitDefinition");
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:220:3: (otherlv_17= 'Restrictions' otherlv_18= '{' ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_validDeployments_22_0= ruleValidDeploymentImplicit ) ) ) | ( ( (lv_invalidDeployments_23_0= ruleInvalidDeployment ) ) | ( (lv_invalidDeployments_24_0= ruleInvalidDeploymentImplicit ) ) ) )* otherlv_25= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:220:5: otherlv_17= 'Restrictions' otherlv_18= '{' ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_validDeployments_22_0= ruleValidDeploymentImplicit ) ) ) | ( ( (lv_invalidDeployments_23_0= ruleInvalidDeployment ) ) | ( (lv_invalidDeployments_24_0= ruleInvalidDeploymentImplicit ) ) ) )* otherlv_25= '}'
                    {
                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleAssistModel390); 

                        	newLeafNode(otherlv_17, grammarAccess.getAssistModelAccess().getRestrictionsKeyword_10_0());
                        
                    otherlv_18=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel402); 

                        	newLeafNode(otherlv_18, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:228:1: ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_validDeployments_22_0= ruleValidDeploymentImplicit ) ) ) | ( ( (lv_invalidDeployments_23_0= ruleInvalidDeployment ) ) | ( (lv_invalidDeployments_24_0= ruleInvalidDeploymentImplicit ) ) ) )*
                    loop8:
                    do {
                        int alt8=5;
                        alt8 = dfa8.predict(input);
                        switch (alt8) {
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
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:266:6: ( ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_validDeployments_22_0= ruleValidDeploymentImplicit ) ) )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:266:6: ( ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_validDeployments_22_0= ruleValidDeploymentImplicit ) ) )
                    	    int alt6=2;
                    	    alt6 = dfa6.predict(input);
                    	    switch (alt6) {
                    	        case 1 :
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:266:7: ( (lv_validDeployments_21_0= ruleValidDeployment ) )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:266:7: ( (lv_validDeployments_21_0= ruleValidDeployment ) )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:267:1: (lv_validDeployments_21_0= ruleValidDeployment )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:267:1: (lv_validDeployments_21_0= ruleValidDeployment )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:268:3: lv_validDeployments_21_0= ruleValidDeployment
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getAssistModelAccess().getValidDeploymentsValidDeploymentParserRuleCall_10_2_2_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleValidDeployment_in_ruleAssistModel479);
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
                    	        case 2 :
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:285:6: ( (lv_validDeployments_22_0= ruleValidDeploymentImplicit ) )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:285:6: ( (lv_validDeployments_22_0= ruleValidDeploymentImplicit ) )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:286:1: (lv_validDeployments_22_0= ruleValidDeploymentImplicit )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:286:1: (lv_validDeployments_22_0= ruleValidDeploymentImplicit )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:287:3: lv_validDeployments_22_0= ruleValidDeploymentImplicit
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getAssistModelAccess().getValidDeploymentsValidDeploymentImplicitParserRuleCall_10_2_2_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleValidDeploymentImplicit_in_ruleAssistModel506);
                    	            lv_validDeployments_22_0=ruleValidDeploymentImplicit();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"validDeployments",
                    	                    		lv_validDeployments_22_0, 
                    	                    		"ValidDeploymentImplicit");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:304:6: ( ( (lv_invalidDeployments_23_0= ruleInvalidDeployment ) ) | ( (lv_invalidDeployments_24_0= ruleInvalidDeploymentImplicit ) ) )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:304:6: ( ( (lv_invalidDeployments_23_0= ruleInvalidDeployment ) ) | ( (lv_invalidDeployments_24_0= ruleInvalidDeploymentImplicit ) ) )
                    	    int alt7=2;
                    	    alt7 = dfa7.predict(input);
                    	    switch (alt7) {
                    	        case 1 :
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:304:7: ( (lv_invalidDeployments_23_0= ruleInvalidDeployment ) )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:304:7: ( (lv_invalidDeployments_23_0= ruleInvalidDeployment ) )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:305:1: (lv_invalidDeployments_23_0= ruleInvalidDeployment )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:305:1: (lv_invalidDeployments_23_0= ruleInvalidDeployment )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:306:3: lv_invalidDeployments_23_0= ruleInvalidDeployment
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getAssistModelAccess().getInvalidDeploymentsInvalidDeploymentParserRuleCall_10_2_3_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleInvalidDeployment_in_ruleAssistModel535);
                    	            lv_invalidDeployments_23_0=ruleInvalidDeployment();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"invalidDeployments",
                    	                    		lv_invalidDeployments_23_0, 
                    	                    		"InvalidDeployment");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:323:6: ( (lv_invalidDeployments_24_0= ruleInvalidDeploymentImplicit ) )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:323:6: ( (lv_invalidDeployments_24_0= ruleInvalidDeploymentImplicit ) )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:324:1: (lv_invalidDeployments_24_0= ruleInvalidDeploymentImplicit )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:324:1: (lv_invalidDeployments_24_0= ruleInvalidDeploymentImplicit )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:325:3: lv_invalidDeployments_24_0= ruleInvalidDeploymentImplicit
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getAssistModelAccess().getInvalidDeploymentsInvalidDeploymentImplicitParserRuleCall_10_2_3_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleInvalidDeploymentImplicit_in_ruleAssistModel562);
                    	            lv_invalidDeployments_24_0=ruleInvalidDeploymentImplicit();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"invalidDeployments",
                    	                    		lv_invalidDeployments_24_0, 
                    	                    		"InvalidDeploymentImplicit");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,16,FOLLOW_16_in_ruleAssistModel577); 

                        	newLeafNode(otherlv_25, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_10_3());
                        

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:353:1: entryRuleCompartment returns [EObject current=null] : iv_ruleCompartment= ruleCompartment EOF ;
    public final EObject entryRuleCompartment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompartment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:354:2: (iv_ruleCompartment= ruleCompartment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:355:2: iv_ruleCompartment= ruleCompartment EOF
            {
             newCompositeNode(grammarAccess.getCompartmentRule()); 
            pushFollow(FOLLOW_ruleCompartment_in_entryRuleCompartment615);
            iv_ruleCompartment=ruleCompartment();

            state._fsp--;

             current =iv_ruleCompartment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartment625); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:362:1: ruleCompartment returns [EObject current=null] : (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:365:28: ( (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:366:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:366:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:366:3: otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleCompartment662); 

                	newLeafNode(otherlv_0, grammarAccess.getCompartmentAccess().getCompartmentKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:370:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:371:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:371:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:372:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompartment679); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCompartment696); 

                	newLeafNode(otherlv_2, grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:392:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:394:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:394:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:395:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:398:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?)
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:399:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:399:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=6;
                int LA11_0 = input.LA(1);

                if ( LA11_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3) ) {
                    alt11=4;
                }
                else if ( LA11_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4) ) {
                    alt11=5;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:401:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:401:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:402:5: {...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:402:108: ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:403:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:406:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:406:7: {...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:406:16: (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:406:18: otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleCompartment754); 

            	        	newLeafNode(otherlv_4, grammarAccess.getCompartmentAccess().getManufacturerKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCompartment766); 

            	        	newLeafNode(otherlv_5, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:414:1: ( (lv_manufacturer_6_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:415:1: (lv_manufacturer_6_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:415:1: (lv_manufacturer_6_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:416:3: lv_manufacturer_6_0= RULE_STRING
            	    {
            	    lv_manufacturer_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment783); 

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

            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCompartment800); 

            	        	newLeafNode(otherlv_7, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:443:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:443:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:444:5: {...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:444:108: ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:445:6: ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:448:6: ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:448:7: {...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:448:16: (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:448:18: otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleCompartment868); 

            	        	newLeafNode(otherlv_8, grammarAccess.getCompartmentAccess().getPowerSupplyKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleCompartment880); 

            	        	newLeafNode(otherlv_9, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:456:1: ( (lv_powerSupply_10_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:457:1: (lv_powerSupply_10_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:457:1: (lv_powerSupply_10_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:458:3: lv_powerSupply_10_0= RULE_STRING
            	    {
            	    lv_powerSupply_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment897); 

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

            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleCompartment914); 

            	        	newLeafNode(otherlv_11, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:485:4: ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:485:4: ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:486:5: {...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:486:108: ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:487:6: ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:490:6: ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:490:7: {...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:490:16: (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:490:18: otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleCompartment982); 

            	        	newLeafNode(otherlv_12, grammarAccess.getCompartmentAccess().getSideKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleCompartment994); 

            	        	newLeafNode(otherlv_13, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:498:1: ( (lv_side_14_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:499:1: (lv_side_14_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:499:1: (lv_side_14_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:500:3: lv_side_14_0= RULE_STRING
            	    {
            	    lv_side_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment1011); 

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

            	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleCompartment1028); 

            	        	newLeafNode(otherlv_15, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:527:4: ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:527:4: ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:528:5: {...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:528:108: ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:529:6: ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:532:6: ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:532:7: {...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:532:16: (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:532:18: otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,24,FOLLOW_24_in_ruleCompartment1096); 

            	        	newLeafNode(otherlv_16, grammarAccess.getCompartmentAccess().getZoneKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleCompartment1108); 

            	        	newLeafNode(otherlv_17, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:540:1: ( (lv_zone_18_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:541:1: (lv_zone_18_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:541:1: (lv_zone_18_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:542:3: lv_zone_18_0= RULE_STRING
            	    {
            	    lv_zone_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment1125); 

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

            	    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleCompartment1142); 

            	        	newLeafNode(otherlv_19, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:569:4: ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:569:4: ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:570:5: {...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:570:108: ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:571:6: ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:574:6: ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==25) ) {
            	            int LA10_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt10=1;
            	            }


            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:574:7: {...}? => ( (lv_rdcs_20_0= ruleRDC ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    	    }
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:574:16: ( (lv_rdcs_20_0= ruleRDC ) )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:575:1: (lv_rdcs_20_0= ruleRDC )
            	    	    {
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:575:1: (lv_rdcs_20_0= ruleRDC )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:576:3: lv_rdcs_20_0= ruleRDC
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getCompartmentAccess().getRdcsRDCParserRuleCall_3_4_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleRDC_in_ruleCompartment1218);
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
            	    	    if ( cnt10 >= 1 ) break loop10;
            	                EarlyExitException eee =
            	                    new EarlyExitException(10, input);
            	                throw eee;
            	        }
            	        cnt10++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCompartmentAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canLeave(grammarAccess.getCompartmentAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	

            }

            otherlv_21=(Token)match(input,16,FOLLOW_16_in_ruleCompartment1277); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:619:1: entryRuleRDC returns [EObject current=null] : iv_ruleRDC= ruleRDC EOF ;
    public final EObject entryRuleRDC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDC = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:620:2: (iv_ruleRDC= ruleRDC EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:621:2: iv_ruleRDC= ruleRDC EOF
            {
             newCompositeNode(grammarAccess.getRDCRule()); 
            pushFollow(FOLLOW_ruleRDC_in_entryRuleRDC1313);
            iv_ruleRDC=ruleRDC();

            state._fsp--;

             current =iv_ruleRDC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDC1323); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:628:1: ruleRDC returns [EObject current=null] : (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' ) ;
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
        Token otherlv_21=null;
        EObject lv_connectors_20_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:631:28: ( (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:632:1: (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:632:1: (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:632:3: otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleRDC1360); 

                	newLeafNode(otherlv_0, grammarAccess.getRDCAccess().getRDCKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:636:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:637:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:637:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:638:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRDC1377); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRDC1394); 

                	newLeafNode(otherlv_2, grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:658:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:660:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+ ) ) )+ {...}?) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:660:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+ ) ) )+ {...}?) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:661:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:664:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+ ) ) )+ {...}?)
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:665:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+ ) ) )+ {...}?
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:665:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+ ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=6;
                int LA13_0 = input.LA(1);

                if ( LA13_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 2) ) {
                    alt13=3;
                }
                else if ( LA13_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 3) ) {
                    alt13=4;
                }
                else if ( LA13_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 4) ) {
                    alt13=5;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:667:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:667:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:668:5: {...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:668:100: ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:669:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:672:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:672:7: {...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:672:16: (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:672:18: otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleRDC1452); 

            	        	newLeafNode(otherlv_4, grammarAccess.getRDCAccess().getManufacturerKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleRDC1464); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:680:1: ( (lv_manufacturer_6_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:681:1: (lv_manufacturer_6_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:681:1: (lv_manufacturer_6_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:682:3: lv_manufacturer_6_0= RULE_STRING
            	    {
            	    lv_manufacturer_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1481); 

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

            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleRDC1498); 

            	        	newLeafNode(otherlv_7, grammarAccess.getRDCAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:709:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:709:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:710:5: {...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:710:100: ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:711:6: ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:714:6: ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:714:7: {...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:714:16: (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:714:18: otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleRDC1566); 

            	        	newLeafNode(otherlv_8, grammarAccess.getRDCAccess().getPowerSupplyKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleRDC1578); 

            	        	newLeafNode(otherlv_9, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:722:1: ( (lv_powerSupply_10_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:723:1: (lv_powerSupply_10_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:723:1: (lv_powerSupply_10_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:724:3: lv_powerSupply_10_0= RULE_STRING
            	    {
            	    lv_powerSupply_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1595); 

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

            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleRDC1612); 

            	        	newLeafNode(otherlv_11, grammarAccess.getRDCAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:751:4: ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:751:4: ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:752:5: {...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:752:100: ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:753:6: ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:756:6: ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:756:7: {...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:756:16: (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:756:18: otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,26,FOLLOW_26_in_ruleRDC1680); 

            	        	newLeafNode(otherlv_12, grammarAccess.getRDCAccess().getTypeKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleRDC1692); 

            	        	newLeafNode(otherlv_13, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:764:1: ( (lv_rdcType_14_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:765:1: (lv_rdcType_14_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:765:1: (lv_rdcType_14_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:766:3: lv_rdcType_14_0= RULE_STRING
            	    {
            	    lv_rdcType_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1709); 

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

            	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleRDC1726); 

            	        	newLeafNode(otherlv_15, grammarAccess.getRDCAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:793:4: ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:793:4: ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:794:5: {...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:794:100: ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:795:6: ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:798:6: ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:798:7: {...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:798:16: (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:798:18: otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,27,FOLLOW_27_in_ruleRDC1794); 

            	        	newLeafNode(otherlv_16, grammarAccess.getRDCAccess().getESSKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleRDC1806); 

            	        	newLeafNode(otherlv_17, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:806:1: ( (lv_ess_18_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:807:1: (lv_ess_18_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:807:1: (lv_ess_18_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:808:3: lv_ess_18_0= RULE_STRING
            	    {
            	    lv_ess_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1823); 

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

            	    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleRDC1840); 

            	        	newLeafNode(otherlv_19, grammarAccess.getRDCAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:835:4: ({...}? => ( ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+ ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:835:4: ({...}? => ( ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+ ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:836:5: {...}? => ( ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:836:100: ( ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+ )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:837:6: ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:840:6: ({...}? => ( (lv_connectors_20_0= ruleConnector ) ) )+
            	    int cnt12=0;
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==28) ) {
            	            int LA12_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt12=1;
            	            }


            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:840:7: {...}? => ( (lv_connectors_20_0= ruleConnector ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    	    }
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:840:16: ( (lv_connectors_20_0= ruleConnector ) )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:841:1: (lv_connectors_20_0= ruleConnector )
            	    	    {
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:841:1: (lv_connectors_20_0= ruleConnector )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:842:3: lv_connectors_20_0= ruleConnector
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRDCAccess().getConnectorsConnectorParserRuleCall_3_4_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleConnector_in_ruleRDC1916);
            	    	    lv_connectors_20_0=ruleConnector();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getRDCRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"connectors",
            	    	            		lv_connectors_20_0, 
            	    	            		"Connector");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt12 >= 1 ) break loop12;
            	                EarlyExitException eee =
            	                    new EarlyExitException(12, input);
            	                throw eee;
            	        }
            	        cnt12++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRDCAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canLeave(grammarAccess.getRDCAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	

            }

            otherlv_21=(Token)match(input,16,FOLLOW_16_in_ruleRDC1975); 

                	newLeafNode(otherlv_21, grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:885:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:886:2: (iv_ruleConnector= ruleConnector EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:887:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector2011);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector2021); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:894:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_availableEqInterfaces_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:897:28: ( (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:898:1: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:898:1: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:898:3: otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleConnector2058); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:902:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:903:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:903:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:904:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnector2075); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConnector2092); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:924:1: ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:925:1: (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:925:1: (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:926:3: lv_availableEqInterfaces_3_0= ruleAvailableEqInterface
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectorAccess().getAvailableEqInterfacesAvailableEqInterfaceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAvailableEqInterface_in_ruleConnector2113);
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
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleConnector2126); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:954:1: entryRuleAvailableEqInterface returns [EObject current=null] : iv_ruleAvailableEqInterface= ruleAvailableEqInterface EOF ;
    public final EObject entryRuleAvailableEqInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvailableEqInterface = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:955:2: (iv_ruleAvailableEqInterface= ruleAvailableEqInterface EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:956:2: iv_ruleAvailableEqInterface= ruleAvailableEqInterface EOF
            {
             newCompositeNode(grammarAccess.getAvailableEqInterfaceRule()); 
            pushFollow(FOLLOW_ruleAvailableEqInterface_in_entryRuleAvailableEqInterface2162);
            iv_ruleAvailableEqInterface=ruleAvailableEqInterface();

            state._fsp--;

             current =iv_ruleAvailableEqInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvailableEqInterface2172); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:963:1: ruleAvailableEqInterface returns [EObject current=null] : ( ( (lv_eqInterfaceType_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_count_2_0= RULE_INT ) ) otherlv_3= ';' ) ;
    public final EObject ruleAvailableEqInterface() throws RecognitionException {
        EObject current = null;

        Token lv_eqInterfaceType_0_0=null;
        Token otherlv_1=null;
        Token lv_count_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:966:28: ( ( ( (lv_eqInterfaceType_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_count_2_0= RULE_INT ) ) otherlv_3= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:967:1: ( ( (lv_eqInterfaceType_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_count_2_0= RULE_INT ) ) otherlv_3= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:967:1: ( ( (lv_eqInterfaceType_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_count_2_0= RULE_INT ) ) otherlv_3= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:967:2: ( (lv_eqInterfaceType_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_count_2_0= RULE_INT ) ) otherlv_3= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:967:2: ( (lv_eqInterfaceType_0_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:968:1: (lv_eqInterfaceType_0_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:968:1: (lv_eqInterfaceType_0_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:969:3: lv_eqInterfaceType_0_0= RULE_STRING
            {
            lv_eqInterfaceType_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAvailableEqInterface2214); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleAvailableEqInterface2231); 

                	newLeafNode(otherlv_1, grammarAccess.getAvailableEqInterfaceAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:989:1: ( (lv_count_2_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:990:1: (lv_count_2_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:990:1: (lv_count_2_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:991:3: lv_count_2_0= RULE_INT
            {
            lv_count_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAvailableEqInterface2248); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleAvailableEqInterface2265); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1019:1: entryRuleEqInterfaceGroup returns [EObject current=null] : iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF ;
    public final EObject entryRuleEqInterfaceGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterfaceGroup = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1020:2: (iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1021:2: iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceGroupRule()); 
            pushFollow(FOLLOW_ruleEqInterfaceGroup_in_entryRuleEqInterfaceGroup2301);
            iv_ruleEqInterfaceGroup=ruleEqInterfaceGroup();

            state._fsp--;

             current =iv_ruleEqInterfaceGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterfaceGroup2311); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1028:1: ruleEqInterfaceGroup returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleEqInterfaceGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1031:28: ( (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1032:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1032:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1032:3: otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleEqInterfaceGroup2348); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceGroupAccess().getGroupKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1036:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1037:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1037:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1038:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup2365); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEqInterfaceGroup2382); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceGroupAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1058:1: ( (otherlv_3= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1059:1: (otherlv_3= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1059:1: (otherlv_3= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1060:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup2402); 

            		newLeafNode(otherlv_3, grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_3_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1071:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1071:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleEqInterfaceGroup2415); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEqInterfaceGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1075:1: ( (otherlv_5= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1076:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1076:1: (otherlv_5= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1077:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup2435); 

            	    		newLeafNode(otherlv_5, grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleEqInterfaceGroup2449); 

                	newLeafNode(otherlv_6, grammarAccess.getEqInterfaceGroupAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleEqInterfaceGroup2461); 

                	newLeafNode(otherlv_7, grammarAccess.getEqInterfaceGroupAccess().getSemicolonKeyword_6());
                

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


    // $ANTLR start "entryRuleEqInterfaceGroupWithImplicitDefinition"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1104:1: entryRuleEqInterfaceGroupWithImplicitDefinition returns [EObject current=null] : iv_ruleEqInterfaceGroupWithImplicitDefinition= ruleEqInterfaceGroupWithImplicitDefinition EOF ;
    public final EObject entryRuleEqInterfaceGroupWithImplicitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterfaceGroupWithImplicitDefinition = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1105:2: (iv_ruleEqInterfaceGroupWithImplicitDefinition= ruleEqInterfaceGroupWithImplicitDefinition EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1106:2: iv_ruleEqInterfaceGroupWithImplicitDefinition= ruleEqInterfaceGroupWithImplicitDefinition EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceGroupWithImplicitDefinitionRule()); 
            pushFollow(FOLLOW_ruleEqInterfaceGroupWithImplicitDefinition_in_entryRuleEqInterfaceGroupWithImplicitDefinition2497);
            iv_ruleEqInterfaceGroupWithImplicitDefinition=ruleEqInterfaceGroupWithImplicitDefinition();

            state._fsp--;

             current =iv_ruleEqInterfaceGroupWithImplicitDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterfaceGroupWithImplicitDefinition2507); 

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
    // $ANTLR end "entryRuleEqInterfaceGroupWithImplicitDefinition"


    // $ANTLR start "ruleEqInterfaceGroupWithImplicitDefinition"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1113:1: ruleEqInterfaceGroupWithImplicitDefinition returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'based on' ( (lv_definitions_3_0= ruleImplicitEqInterfaceGroupDefinition ) ) (otherlv_4= 'and' ( (lv_definitions_5_0= ruleImplicitEqInterfaceGroupDefinition ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleEqInterfaceGroupWithImplicitDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_definitions_3_0 = null;

        EObject lv_definitions_5_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1116:28: ( (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'based on' ( (lv_definitions_3_0= ruleImplicitEqInterfaceGroupDefinition ) ) (otherlv_4= 'and' ( (lv_definitions_5_0= ruleImplicitEqInterfaceGroupDefinition ) ) )* otherlv_6= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1117:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'based on' ( (lv_definitions_3_0= ruleImplicitEqInterfaceGroupDefinition ) ) (otherlv_4= 'and' ( (lv_definitions_5_0= ruleImplicitEqInterfaceGroupDefinition ) ) )* otherlv_6= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1117:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'based on' ( (lv_definitions_3_0= ruleImplicitEqInterfaceGroupDefinition ) ) (otherlv_4= 'and' ( (lv_definitions_5_0= ruleImplicitEqInterfaceGroupDefinition ) ) )* otherlv_6= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1117:3: otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'based on' ( (lv_definitions_3_0= ruleImplicitEqInterfaceGroupDefinition ) ) (otherlv_4= 'and' ( (lv_definitions_5_0= ruleImplicitEqInterfaceGroupDefinition ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleEqInterfaceGroupWithImplicitDefinition2544); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceGroupWithImplicitDefinitionAccess().getGroupKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1121:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1122:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1122:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1123:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithImplicitDefinition2561); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEqInterfaceGroupWithImplicitDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEqInterfaceGroupWithImplicitDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleEqInterfaceGroupWithImplicitDefinition2578); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceGroupWithImplicitDefinitionAccess().getBasedOnKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1143:1: ( (lv_definitions_3_0= ruleImplicitEqInterfaceGroupDefinition ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1144:1: (lv_definitions_3_0= ruleImplicitEqInterfaceGroupDefinition )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1144:1: (lv_definitions_3_0= ruleImplicitEqInterfaceGroupDefinition )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1145:3: lv_definitions_3_0= ruleImplicitEqInterfaceGroupDefinition
            {
             
            	        newCompositeNode(grammarAccess.getEqInterfaceGroupWithImplicitDefinitionAccess().getDefinitionsImplicitEqInterfaceGroupDefinitionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleImplicitEqInterfaceGroupDefinition_in_ruleEqInterfaceGroupWithImplicitDefinition2599);
            lv_definitions_3_0=ruleImplicitEqInterfaceGroupDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEqInterfaceGroupWithImplicitDefinitionRule());
            	        }
                   		add(
                   			current, 
                   			"definitions",
                    		lv_definitions_3_0, 
                    		"ImplicitEqInterfaceGroupDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1161:2: (otherlv_4= 'and' ( (lv_definitions_5_0= ruleImplicitEqInterfaceGroupDefinition ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1161:4: otherlv_4= 'and' ( (lv_definitions_5_0= ruleImplicitEqInterfaceGroupDefinition ) )
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleEqInterfaceGroupWithImplicitDefinition2612); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEqInterfaceGroupWithImplicitDefinitionAccess().getAndKeyword_4_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1165:1: ( (lv_definitions_5_0= ruleImplicitEqInterfaceGroupDefinition ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1166:1: (lv_definitions_5_0= ruleImplicitEqInterfaceGroupDefinition )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1166:1: (lv_definitions_5_0= ruleImplicitEqInterfaceGroupDefinition )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1167:3: lv_definitions_5_0= ruleImplicitEqInterfaceGroupDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqInterfaceGroupWithImplicitDefinitionAccess().getDefinitionsImplicitEqInterfaceGroupDefinitionParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImplicitEqInterfaceGroupDefinition_in_ruleEqInterfaceGroupWithImplicitDefinition2633);
            	    lv_definitions_5_0=ruleImplicitEqInterfaceGroupDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqInterfaceGroupWithImplicitDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"definitions",
            	            		lv_definitions_5_0, 
            	            		"ImplicitEqInterfaceGroupDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleEqInterfaceGroupWithImplicitDefinition2647); 

                	newLeafNode(otherlv_6, grammarAccess.getEqInterfaceGroupWithImplicitDefinitionAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleEqInterfaceGroupWithImplicitDefinition"


    // $ANTLR start "entryRuleImplicitEqInterfaceGroupDefinition"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1195:1: entryRuleImplicitEqInterfaceGroupDefinition returns [EObject current=null] : iv_ruleImplicitEqInterfaceGroupDefinition= ruleImplicitEqInterfaceGroupDefinition EOF ;
    public final EObject entryRuleImplicitEqInterfaceGroupDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitEqInterfaceGroupDefinition = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1196:2: (iv_ruleImplicitEqInterfaceGroupDefinition= ruleImplicitEqInterfaceGroupDefinition EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1197:2: iv_ruleImplicitEqInterfaceGroupDefinition= ruleImplicitEqInterfaceGroupDefinition EOF
            {
             newCompositeNode(grammarAccess.getImplicitEqInterfaceGroupDefinitionRule()); 
            pushFollow(FOLLOW_ruleImplicitEqInterfaceGroupDefinition_in_entryRuleImplicitEqInterfaceGroupDefinition2683);
            iv_ruleImplicitEqInterfaceGroupDefinition=ruleImplicitEqInterfaceGroupDefinition();

            state._fsp--;

             current =iv_ruleImplicitEqInterfaceGroupDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitEqInterfaceGroupDefinition2693); 

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
    // $ANTLR end "entryRuleImplicitEqInterfaceGroupDefinition"


    // $ANTLR start "ruleImplicitEqInterfaceGroupDefinition"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1204:1: ruleImplicitEqInterfaceGroupDefinition returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceGroupDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleImplicitEqInterfaceGroupDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_attribute_0_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1207:28: ( ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceGroupDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1208:1: ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceGroupDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1208:1: ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceGroupDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1208:2: ( (lv_attribute_0_0= ruleImplicitEqInterfaceGroupDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1208:2: ( (lv_attribute_0_0= ruleImplicitEqInterfaceGroupDefinitionAttribute ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1209:1: (lv_attribute_0_0= ruleImplicitEqInterfaceGroupDefinitionAttribute )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1209:1: (lv_attribute_0_0= ruleImplicitEqInterfaceGroupDefinitionAttribute )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1210:3: lv_attribute_0_0= ruleImplicitEqInterfaceGroupDefinitionAttribute
            {
             
            	        newCompositeNode(grammarAccess.getImplicitEqInterfaceGroupDefinitionAccess().getAttributeImplicitEqInterfaceGroupDefinitionAttributeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleImplicitEqInterfaceGroupDefinitionAttribute_in_ruleImplicitEqInterfaceGroupDefinition2739);
            lv_attribute_0_0=ruleImplicitEqInterfaceGroupDefinitionAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImplicitEqInterfaceGroupDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"attribute",
                    		lv_attribute_0_0, 
                    		"ImplicitEqInterfaceGroupDefinitionAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleImplicitEqInterfaceGroupDefinition2751); 

                	newLeafNode(otherlv_1, grammarAccess.getImplicitEqInterfaceGroupDefinitionAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1230:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1231:1: (lv_value_2_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1231:1: (lv_value_2_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1232:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImplicitEqInterfaceGroupDefinition2768); 

            			newLeafNode(lv_value_2_0, grammarAccess.getImplicitEqInterfaceGroupDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImplicitEqInterfaceGroupDefinitionRule());
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
    // $ANTLR end "ruleImplicitEqInterfaceGroupDefinition"


    // $ANTLR start "entryRuleEqInterface"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1256:1: entryRuleEqInterface returns [EObject current=null] : iv_ruleEqInterface= ruleEqInterface EOF ;
    public final EObject entryRuleEqInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterface = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1257:2: (iv_ruleEqInterface= ruleEqInterface EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1258:2: iv_ruleEqInterface= ruleEqInterface EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceRule()); 
            pushFollow(FOLLOW_ruleEqInterface_in_entryRuleEqInterface2809);
            iv_ruleEqInterface=ruleEqInterface();

            state._fsp--;

             current =iv_ruleEqInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterface2819); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1265:1: ruleEqInterface returns [EObject current=null] : (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) )* ) ) ) otherlv_44= '}' ) ;
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

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1268:28: ( (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) )* ) ) ) otherlv_44= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1269:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) )* ) ) ) otherlv_44= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1269:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) )* ) ) ) otherlv_44= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1269:3: otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) )* ) ) ) otherlv_44= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleEqInterface2856); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceAccess().getInterfaceKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1273:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1274:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1274:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1275:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterface2873); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEqInterface2890); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1295:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) )* ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1297:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1297:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1298:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1301:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1302:3: ( ({...}? => ( ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) )*
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1302:3: ( ({...}? => ( ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) )*
            loop17:
            do {
                int alt17=11;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1304:4: ({...}? => ( ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1304:4: ({...}? => ( ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1305:5: {...}? => ( ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1305:108: ( ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1306:6: ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1309:6: ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1309:7: {...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1309:16: (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1309:18: otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleEqInterface2948); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEqInterfaceAccess().getInterfaceSystemKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2960); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1317:1: ( (lv_system_6_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1318:1: (lv_system_6_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1318:1: (lv_system_6_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1319:3: lv_system_6_0= RULE_STRING
            	    {
            	    lv_system_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface2977); 

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

            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2994); 

            	        	newLeafNode(otherlv_7, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1346:4: ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1346:4: ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1347:5: {...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1347:108: ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1348:6: ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1351:6: ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1351:7: {...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1351:16: (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1351:18: otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,35,FOLLOW_35_in_ruleEqInterface3062); 

            	        	newLeafNode(otherlv_8, grammarAccess.getEqInterfaceAccess().getSubAtaKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface3074); 

            	        	newLeafNode(otherlv_9, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1359:1: ( (lv_subAta_10_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1360:1: (lv_subAta_10_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1360:1: (lv_subAta_10_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1361:3: lv_subAta_10_0= RULE_STRING
            	    {
            	    lv_subAta_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface3091); 

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

            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface3108); 

            	        	newLeafNode(otherlv_11, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1388:4: ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1388:4: ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1389:5: {...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1389:108: ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1390:6: ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1393:6: ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1393:7: {...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1393:16: (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1393:18: otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,36,FOLLOW_36_in_ruleEqInterface3176); 

            	        	newLeafNode(otherlv_12, grammarAccess.getEqInterfaceAccess().getResourceKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface3188); 

            	        	newLeafNode(otherlv_13, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1401:1: ( (lv_resource_14_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1402:1: (lv_resource_14_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1402:1: (lv_resource_14_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1403:3: lv_resource_14_0= RULE_STRING
            	    {
            	    lv_resource_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface3205); 

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

            	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface3222); 

            	        	newLeafNode(otherlv_15, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1430:4: ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1430:4: ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1431:5: {...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1431:108: ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1432:6: ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1435:6: ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1435:7: {...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1435:16: (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1435:18: otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,37,FOLLOW_37_in_ruleEqInterface3290); 

            	        	newLeafNode(otherlv_16, grammarAccess.getEqInterfaceAccess().getLineNameKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface3302); 

            	        	newLeafNode(otherlv_17, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1443:1: ( (lv_lineName_18_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1444:1: (lv_lineName_18_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1444:1: (lv_lineName_18_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1445:3: lv_lineName_18_0= RULE_STRING
            	    {
            	    lv_lineName_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface3319); 

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

            	    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface3336); 

            	        	newLeafNode(otherlv_19, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1472:4: ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1472:4: ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1473:5: {...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1473:108: ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1474:6: ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1477:6: ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1477:7: {...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1477:16: (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1477:18: otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,38,FOLLOW_38_in_ruleEqInterface3404); 

            	        	newLeafNode(otherlv_20, grammarAccess.getEqInterfaceAccess().getWiringLaneKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface3416); 

            	        	newLeafNode(otherlv_21, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1485:1: ( (lv_wiringLane_22_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1486:1: (lv_wiringLane_22_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1486:1: (lv_wiringLane_22_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1487:3: lv_wiringLane_22_0= RULE_STRING
            	    {
            	    lv_wiringLane_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface3433); 

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

            	    otherlv_23=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface3450); 

            	        	newLeafNode(otherlv_23, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1514:4: ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1514:4: ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1515:5: {...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1515:108: ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1516:6: ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1519:6: ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1519:7: {...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1519:16: (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1519:18: otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,39,FOLLOW_39_in_ruleEqInterface3518); 

            	        	newLeafNode(otherlv_24, grammarAccess.getEqInterfaceAccess().getGrpInfoKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface3530); 

            	        	newLeafNode(otherlv_25, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1527:1: ( (lv_grpInfo_26_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1528:1: (lv_grpInfo_26_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1528:1: (lv_grpInfo_26_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1529:3: lv_grpInfo_26_0= RULE_STRING
            	    {
            	    lv_grpInfo_26_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface3547); 

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

            	    otherlv_27=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface3564); 

            	        	newLeafNode(otherlv_27, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1556:4: ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1556:4: ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1557:5: {...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1557:108: ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1558:6: ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1561:6: ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1561:7: {...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1561:16: (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1561:18: otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';'
            	    {
            	    otherlv_28=(Token)match(input,40,FOLLOW_40_in_ruleEqInterface3632); 

            	        	newLeafNode(otherlv_28, grammarAccess.getEqInterfaceAccess().getRouteKeyword_3_6_0());
            	        
            	    otherlv_29=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface3644); 

            	        	newLeafNode(otherlv_29, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_6_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1569:1: ( (lv_route_30_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1570:1: (lv_route_30_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1570:1: (lv_route_30_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1571:3: lv_route_30_0= RULE_STRING
            	    {
            	    lv_route_30_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface3661); 

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

            	    otherlv_31=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface3678); 

            	        	newLeafNode(otherlv_31, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_6_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1598:4: ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1598:4: ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1599:5: {...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1599:108: ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1600:6: ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1603:6: ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1603:7: {...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1603:16: (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1603:18: otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';'
            	    {
            	    otherlv_32=(Token)match(input,41,FOLLOW_41_in_ruleEqInterface3746); 

            	        	newLeafNode(otherlv_32, grammarAccess.getEqInterfaceAccess().getPwSup1Keyword_3_7_0());
            	        
            	    otherlv_33=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface3758); 

            	        	newLeafNode(otherlv_33, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_7_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1611:1: ( (lv_pwSup1_34_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1612:1: (lv_pwSup1_34_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1612:1: (lv_pwSup1_34_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1613:3: lv_pwSup1_34_0= RULE_STRING
            	    {
            	    lv_pwSup1_34_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface3775); 

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

            	    otherlv_35=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface3792); 

            	        	newLeafNode(otherlv_35, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_7_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1640:4: ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1640:4: ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1641:5: {...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1641:108: ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1642:6: ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1645:6: ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1645:7: {...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1645:16: (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1645:18: otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';'
            	    {
            	    otherlv_36=(Token)match(input,42,FOLLOW_42_in_ruleEqInterface3860); 

            	        	newLeafNode(otherlv_36, grammarAccess.getEqInterfaceAccess().getEmhZone1Keyword_3_8_0());
            	        
            	    otherlv_37=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface3872); 

            	        	newLeafNode(otherlv_37, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_8_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1653:1: ( (lv_emhZone1_38_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1654:1: (lv_emhZone1_38_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1654:1: (lv_emhZone1_38_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1655:3: lv_emhZone1_38_0= RULE_STRING
            	    {
            	    lv_emhZone1_38_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface3889); 

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

            	    otherlv_39=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface3906); 

            	        	newLeafNode(otherlv_39, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_8_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1682:4: ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1682:4: ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1683:5: {...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1683:108: ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1684:6: ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1687:6: ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1687:7: {...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1687:16: (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1687:18: otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';'
            	    {
            	    otherlv_40=(Token)match(input,26,FOLLOW_26_in_ruleEqInterface3974); 

            	        	newLeafNode(otherlv_40, grammarAccess.getEqInterfaceAccess().getTypeKeyword_3_9_0());
            	        
            	    otherlv_41=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface3986); 

            	        	newLeafNode(otherlv_41, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_9_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1695:1: ( (lv_ioType_42_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1696:1: (lv_ioType_42_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1696:1: (lv_ioType_42_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1697:3: lv_ioType_42_0= RULE_STRING
            	    {
            	    lv_ioType_42_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface4003); 

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

            	    otherlv_43=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface4020); 

            	        	newLeafNode(otherlv_43, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_9_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	

            }

            otherlv_44=(Token)match(input,16,FOLLOW_16_in_ruleEqInterface4073); 

                	newLeafNode(otherlv_44, grammarAccess.getEqInterfaceAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1743:1: entryRuleDislocalityRelation returns [EObject current=null] : iv_ruleDislocalityRelation= ruleDislocalityRelation EOF ;
    public final EObject entryRuleDislocalityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDislocalityRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1744:2: (iv_ruleDislocalityRelation= ruleDislocalityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1745:2: iv_ruleDislocalityRelation= ruleDislocalityRelation EOF
            {
             newCompositeNode(grammarAccess.getDislocalityRelationRule()); 
            pushFollow(FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation4109);
            iv_ruleDislocalityRelation=ruleDislocalityRelation();

            state._fsp--;

             current =iv_ruleDislocalityRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDislocalityRelation4119); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1752:1: ruleDislocalityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1755:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1756:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1756:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1756:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1756:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1757:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1757:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1758:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDislocalityRelationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDislocalityRelation4164); 

            		newLeafNode(otherlv_0, grammarAccess.getDislocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_0_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1769:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1769:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleDislocalityRelation4177); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDislocalityRelationAccess().getCommaKeyword_1_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1773:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1774:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1774:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1775:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDislocalityRelationRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDislocalityRelation4197); 

            	    		newLeafNode(otherlv_2, grammarAccess.getDislocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleDislocalityRelation4211); 

                	newLeafNode(otherlv_3, grammarAccess.getDislocalityRelationAccess().getDislocalUpToKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1790:1: ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1791:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1791:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1792:3: lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType
            {
             
            	        newCompositeNode(grammarAccess.getDislocalityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleHardwareArchitectureLevelType_in_ruleDislocalityRelation4232);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDislocalityRelation4244); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1820:1: entryRuleColocalityRelation returns [EObject current=null] : iv_ruleColocalityRelation= ruleColocalityRelation EOF ;
    public final EObject entryRuleColocalityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColocalityRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1821:2: (iv_ruleColocalityRelation= ruleColocalityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1822:2: iv_ruleColocalityRelation= ruleColocalityRelation EOF
            {
             newCompositeNode(grammarAccess.getColocalityRelationRule()); 
            pushFollow(FOLLOW_ruleColocalityRelation_in_entryRuleColocalityRelation4280);
            iv_ruleColocalityRelation=ruleColocalityRelation();

            state._fsp--;

             current =iv_ruleColocalityRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColocalityRelation4290); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1829:1: ruleColocalityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1832:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1833:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1833:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1833:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1833:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1834:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1834:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1835:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getColocalityRelationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColocalityRelation4335); 

            		newLeafNode(otherlv_0, grammarAccess.getColocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_0_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1846:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1846:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleColocalityRelation4348); 

            	        	newLeafNode(otherlv_1, grammarAccess.getColocalityRelationAccess().getCommaKeyword_1_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1850:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1851:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1851:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1852:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getColocalityRelationRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColocalityRelation4368); 

            	    		newLeafNode(otherlv_2, grammarAccess.getColocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleColocalityRelation4382); 

                	newLeafNode(otherlv_3, grammarAccess.getColocalityRelationAccess().getOnSameKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1867:1: ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1868:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1868:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1869:3: lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType
            {
             
            	        newCompositeNode(grammarAccess.getColocalityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleHardwareArchitectureLevelType_in_ruleColocalityRelation4403);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleColocalityRelation4415); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1897:1: entryRuleValidDeployment returns [EObject current=null] : iv_ruleValidDeployment= ruleValidDeployment EOF ;
    public final EObject entryRuleValidDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidDeployment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1898:2: (iv_ruleValidDeployment= ruleValidDeployment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1899:2: iv_ruleValidDeployment= ruleValidDeployment EOF
            {
             newCompositeNode(grammarAccess.getValidDeploymentRule()); 
            pushFollow(FOLLOW_ruleValidDeployment_in_entryRuleValidDeployment4451);
            iv_ruleValidDeployment=ruleValidDeployment();

            state._fsp--;

             current =iv_ruleValidDeployment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidDeployment4461); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1906:1: ruleValidDeployment returns [EObject current=null] : (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleValidDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1909:28: ( (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= '}' otherlv_11= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1910:1: (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= '}' otherlv_11= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1910:1: (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= '}' otherlv_11= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1910:3: otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleValidDeployment4498); 

                	newLeafNode(otherlv_0, grammarAccess.getValidDeploymentAccess().getValidForKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1914:1: ( (otherlv_1= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1915:1: (otherlv_1= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1915:1: (otherlv_1= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1916:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getValidDeploymentRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidDeployment4518); 

            		newLeafNode(otherlv_1, grammarAccess.getValidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1927:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1927:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleValidDeployment4531); 

            	        	newLeafNode(otherlv_2, grammarAccess.getValidDeploymentAccess().getCommaKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1931:1: ( (otherlv_3= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1932:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1932:1: (otherlv_3= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1933:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getValidDeploymentRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidDeployment4551); 

            	    		newLeafNode(otherlv_3, grammarAccess.getValidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1944:4: (otherlv_4= 'is' | otherlv_5= 'are' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            else if ( (LA21_0==47) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1944:6: otherlv_4= 'is'
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleValidDeployment4566); 

                        	newLeafNode(otherlv_4, grammarAccess.getValidDeploymentAccess().getIsKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1949:7: otherlv_5= 'are'
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleValidDeployment4584); 

                        	newLeafNode(otherlv_5, grammarAccess.getValidDeploymentAccess().getAreKeyword_3_1());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleValidDeployment4597); 

                	newLeafNode(otherlv_6, grammarAccess.getValidDeploymentAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1957:1: ( ( ruleQualifiedName ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1958:1: ( ruleQualifiedName )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1958:1: ( ruleQualifiedName )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1959:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getValidDeploymentRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleValidDeployment4620);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1972:2: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1972:4: otherlv_8= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleValidDeployment4633); 

            	        	newLeafNode(otherlv_8, grammarAccess.getValidDeploymentAccess().getCommaKeyword_6_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1976:1: ( ( ruleQualifiedName ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1977:1: ( ruleQualifiedName )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1977:1: ( ruleQualifiedName )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1978:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getValidDeploymentRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleValidDeployment4656);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleValidDeployment4670); 

                	newLeafNode(otherlv_10, grammarAccess.getValidDeploymentAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleValidDeployment4682); 

                	newLeafNode(otherlv_11, grammarAccess.getValidDeploymentAccess().getSemicolonKeyword_8());
                

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


    // $ANTLR start "entryRuleValidDeploymentImplicit"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2007:1: entryRuleValidDeploymentImplicit returns [EObject current=null] : iv_ruleValidDeploymentImplicit= ruleValidDeploymentImplicit EOF ;
    public final EObject entryRuleValidDeploymentImplicit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidDeploymentImplicit = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2008:2: (iv_ruleValidDeploymentImplicit= ruleValidDeploymentImplicit EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2009:2: iv_ruleValidDeploymentImplicit= ruleValidDeploymentImplicit EOF
            {
             newCompositeNode(grammarAccess.getValidDeploymentImplicitRule()); 
            pushFollow(FOLLOW_ruleValidDeploymentImplicit_in_entryRuleValidDeploymentImplicit4718);
            iv_ruleValidDeploymentImplicit=ruleValidDeploymentImplicit();

            state._fsp--;

             current =iv_ruleValidDeploymentImplicit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidDeploymentImplicit4728); 

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
    // $ANTLR end "entryRuleValidDeploymentImplicit"


    // $ANTLR start "ruleValidDeploymentImplicit"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2016:1: ruleValidDeploymentImplicit returns [EObject current=null] : (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are RDCs with' ( (lv_definitions_5_0= ruleDeploymentImplicitDefinition ) ) (otherlv_6= 'and' ( (lv_definitions_7_0= ruleDeploymentImplicitDefinition ) ) )* otherlv_8= ';' ) ;
    public final EObject ruleValidDeploymentImplicit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_definitions_5_0 = null;

        EObject lv_definitions_7_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2019:28: ( (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are RDCs with' ( (lv_definitions_5_0= ruleDeploymentImplicitDefinition ) ) (otherlv_6= 'and' ( (lv_definitions_7_0= ruleDeploymentImplicitDefinition ) ) )* otherlv_8= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2020:1: (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are RDCs with' ( (lv_definitions_5_0= ruleDeploymentImplicitDefinition ) ) (otherlv_6= 'and' ( (lv_definitions_7_0= ruleDeploymentImplicitDefinition ) ) )* otherlv_8= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2020:1: (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are RDCs with' ( (lv_definitions_5_0= ruleDeploymentImplicitDefinition ) ) (otherlv_6= 'and' ( (lv_definitions_7_0= ruleDeploymentImplicitDefinition ) ) )* otherlv_8= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2020:3: otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are RDCs with' ( (lv_definitions_5_0= ruleDeploymentImplicitDefinition ) ) (otherlv_6= 'and' ( (lv_definitions_7_0= ruleDeploymentImplicitDefinition ) ) )* otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleValidDeploymentImplicit4765); 

                	newLeafNode(otherlv_0, grammarAccess.getValidDeploymentImplicitAccess().getValidForKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2024:1: ( (otherlv_1= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2025:1: (otherlv_1= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2025:1: (otherlv_1= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2026:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getValidDeploymentImplicitRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidDeploymentImplicit4785); 

            		newLeafNode(otherlv_1, grammarAccess.getValidDeploymentImplicitAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2037:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==30) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2037:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleValidDeploymentImplicit4798); 

            	        	newLeafNode(otherlv_2, grammarAccess.getValidDeploymentImplicitAccess().getCommaKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2041:1: ( (otherlv_3= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2042:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2042:1: (otherlv_3= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2043:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getValidDeploymentImplicitRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidDeploymentImplicit4818); 

            	    		newLeafNode(otherlv_3, grammarAccess.getValidDeploymentImplicitAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleValidDeploymentImplicit4832); 

                	newLeafNode(otherlv_4, grammarAccess.getValidDeploymentImplicitAccess().getAreRDCsWithKeyword_3());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2058:1: ( (lv_definitions_5_0= ruleDeploymentImplicitDefinition ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2059:1: (lv_definitions_5_0= ruleDeploymentImplicitDefinition )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2059:1: (lv_definitions_5_0= ruleDeploymentImplicitDefinition )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2060:3: lv_definitions_5_0= ruleDeploymentImplicitDefinition
            {
             
            	        newCompositeNode(grammarAccess.getValidDeploymentImplicitAccess().getDefinitionsDeploymentImplicitDefinitionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeploymentImplicit4853);
            lv_definitions_5_0=ruleDeploymentImplicitDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValidDeploymentImplicitRule());
            	        }
                   		add(
                   			current, 
                   			"definitions",
                    		lv_definitions_5_0, 
                    		"DeploymentImplicitDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2076:2: (otherlv_6= 'and' ( (lv_definitions_7_0= ruleDeploymentImplicitDefinition ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==32) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2076:4: otherlv_6= 'and' ( (lv_definitions_7_0= ruleDeploymentImplicitDefinition ) )
            	    {
            	    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleValidDeploymentImplicit4866); 

            	        	newLeafNode(otherlv_6, grammarAccess.getValidDeploymentImplicitAccess().getAndKeyword_5_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2080:1: ( (lv_definitions_7_0= ruleDeploymentImplicitDefinition ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2081:1: (lv_definitions_7_0= ruleDeploymentImplicitDefinition )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2081:1: (lv_definitions_7_0= ruleDeploymentImplicitDefinition )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2082:3: lv_definitions_7_0= ruleDeploymentImplicitDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValidDeploymentImplicitAccess().getDefinitionsDeploymentImplicitDefinitionParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeploymentImplicit4887);
            	    lv_definitions_7_0=ruleDeploymentImplicitDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValidDeploymentImplicitRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"definitions",
            	            		lv_definitions_7_0, 
            	            		"DeploymentImplicitDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleValidDeploymentImplicit4901); 

                	newLeafNode(otherlv_8, grammarAccess.getValidDeploymentImplicitAccess().getSemicolonKeyword_6());
                

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
    // $ANTLR end "ruleValidDeploymentImplicit"


    // $ANTLR start "entryRuleInvalidDeployment"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2110:1: entryRuleInvalidDeployment returns [EObject current=null] : iv_ruleInvalidDeployment= ruleInvalidDeployment EOF ;
    public final EObject entryRuleInvalidDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidDeployment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2111:2: (iv_ruleInvalidDeployment= ruleInvalidDeployment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2112:2: iv_ruleInvalidDeployment= ruleInvalidDeployment EOF
            {
             newCompositeNode(grammarAccess.getInvalidDeploymentRule()); 
            pushFollow(FOLLOW_ruleInvalidDeployment_in_entryRuleInvalidDeployment4937);
            iv_ruleInvalidDeployment=ruleInvalidDeployment();

            state._fsp--;

             current =iv_ruleInvalidDeployment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvalidDeployment4947); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2119:1: ruleInvalidDeployment returns [EObject current=null] : (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleInvalidDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2122:28: ( (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= '}' otherlv_11= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2123:1: (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= '}' otherlv_11= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2123:1: (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= '}' otherlv_11= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2123:3: otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleInvalidDeployment4984); 

                	newLeafNode(otherlv_0, grammarAccess.getInvalidDeploymentAccess().getInvalidForKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2127:1: ( (otherlv_1= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2128:1: (otherlv_1= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2128:1: (otherlv_1= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2129:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvalidDeployment5004); 

            		newLeafNode(otherlv_1, grammarAccess.getInvalidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2140:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==30) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2140:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleInvalidDeployment5017); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInvalidDeploymentAccess().getCommaKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2144:1: ( (otherlv_3= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2145:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2145:1: (otherlv_3= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2146:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvalidDeployment5037); 

            	    		newLeafNode(otherlv_3, grammarAccess.getInvalidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2157:4: (otherlv_4= 'is' | otherlv_5= 'are' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            else if ( (LA26_0==47) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2157:6: otherlv_4= 'is'
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleInvalidDeployment5052); 

                        	newLeafNode(otherlv_4, grammarAccess.getInvalidDeploymentAccess().getIsKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2162:7: otherlv_5= 'are'
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleInvalidDeployment5070); 

                        	newLeafNode(otherlv_5, grammarAccess.getInvalidDeploymentAccess().getAreKeyword_3_1());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleInvalidDeployment5083); 

                	newLeafNode(otherlv_6, grammarAccess.getInvalidDeploymentAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2170:1: ( ( ruleQualifiedName ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2171:1: ( ruleQualifiedName )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2171:1: ( ruleQualifiedName )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2172:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment5106);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2185:2: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2185:4: otherlv_8= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleInvalidDeployment5119); 

            	        	newLeafNode(otherlv_8, grammarAccess.getInvalidDeploymentAccess().getCommaKeyword_6_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2189:1: ( ( ruleQualifiedName ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2190:1: ( ruleQualifiedName )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2190:1: ( ruleQualifiedName )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2191:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment5142);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleInvalidDeployment5156); 

                	newLeafNode(otherlv_10, grammarAccess.getInvalidDeploymentAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleInvalidDeployment5168); 

                	newLeafNode(otherlv_11, grammarAccess.getInvalidDeploymentAccess().getSemicolonKeyword_8());
                

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


    // $ANTLR start "entryRuleInvalidDeploymentImplicit"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2220:1: entryRuleInvalidDeploymentImplicit returns [EObject current=null] : iv_ruleInvalidDeploymentImplicit= ruleInvalidDeploymentImplicit EOF ;
    public final EObject entryRuleInvalidDeploymentImplicit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidDeploymentImplicit = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2221:2: (iv_ruleInvalidDeploymentImplicit= ruleInvalidDeploymentImplicit EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2222:2: iv_ruleInvalidDeploymentImplicit= ruleInvalidDeploymentImplicit EOF
            {
             newCompositeNode(grammarAccess.getInvalidDeploymentImplicitRule()); 
            pushFollow(FOLLOW_ruleInvalidDeploymentImplicit_in_entryRuleInvalidDeploymentImplicit5204);
            iv_ruleInvalidDeploymentImplicit=ruleInvalidDeploymentImplicit();

            state._fsp--;

             current =iv_ruleInvalidDeploymentImplicit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvalidDeploymentImplicit5214); 

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
    // $ANTLR end "entryRuleInvalidDeploymentImplicit"


    // $ANTLR start "ruleInvalidDeploymentImplicit"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2229:1: ruleInvalidDeploymentImplicit returns [EObject current=null] : (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are RDCs with' ( (lv_definitions_5_0= ruleDeploymentImplicitDefinition ) ) (otherlv_6= 'and' ( (lv_definitions_7_0= ruleDeploymentImplicitDefinition ) ) )* otherlv_8= ';' ) ;
    public final EObject ruleInvalidDeploymentImplicit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_definitions_5_0 = null;

        EObject lv_definitions_7_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2232:28: ( (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are RDCs with' ( (lv_definitions_5_0= ruleDeploymentImplicitDefinition ) ) (otherlv_6= 'and' ( (lv_definitions_7_0= ruleDeploymentImplicitDefinition ) ) )* otherlv_8= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2233:1: (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are RDCs with' ( (lv_definitions_5_0= ruleDeploymentImplicitDefinition ) ) (otherlv_6= 'and' ( (lv_definitions_7_0= ruleDeploymentImplicitDefinition ) ) )* otherlv_8= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2233:1: (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are RDCs with' ( (lv_definitions_5_0= ruleDeploymentImplicitDefinition ) ) (otherlv_6= 'and' ( (lv_definitions_7_0= ruleDeploymentImplicitDefinition ) ) )* otherlv_8= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2233:3: otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are RDCs with' ( (lv_definitions_5_0= ruleDeploymentImplicitDefinition ) ) (otherlv_6= 'and' ( (lv_definitions_7_0= ruleDeploymentImplicitDefinition ) ) )* otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleInvalidDeploymentImplicit5251); 

                	newLeafNode(otherlv_0, grammarAccess.getInvalidDeploymentImplicitAccess().getInvalidForKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2237:1: ( (otherlv_1= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2238:1: (otherlv_1= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2238:1: (otherlv_1= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2239:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInvalidDeploymentImplicitRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvalidDeploymentImplicit5271); 

            		newLeafNode(otherlv_1, grammarAccess.getInvalidDeploymentImplicitAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2250:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==30) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2250:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleInvalidDeploymentImplicit5284); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInvalidDeploymentImplicitAccess().getCommaKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2254:1: ( (otherlv_3= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2255:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2255:1: (otherlv_3= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2256:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInvalidDeploymentImplicitRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvalidDeploymentImplicit5304); 

            	    		newLeafNode(otherlv_3, grammarAccess.getInvalidDeploymentImplicitAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleInvalidDeploymentImplicit5318); 

                	newLeafNode(otherlv_4, grammarAccess.getInvalidDeploymentImplicitAccess().getAreRDCsWithKeyword_3());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2271:1: ( (lv_definitions_5_0= ruleDeploymentImplicitDefinition ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2272:1: (lv_definitions_5_0= ruleDeploymentImplicitDefinition )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2272:1: (lv_definitions_5_0= ruleDeploymentImplicitDefinition )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2273:3: lv_definitions_5_0= ruleDeploymentImplicitDefinition
            {
             
            	        newCompositeNode(grammarAccess.getInvalidDeploymentImplicitAccess().getDefinitionsDeploymentImplicitDefinitionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeploymentImplicit5339);
            lv_definitions_5_0=ruleDeploymentImplicitDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvalidDeploymentImplicitRule());
            	        }
                   		add(
                   			current, 
                   			"definitions",
                    		lv_definitions_5_0, 
                    		"DeploymentImplicitDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2289:2: (otherlv_6= 'and' ( (lv_definitions_7_0= ruleDeploymentImplicitDefinition ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==32) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2289:4: otherlv_6= 'and' ( (lv_definitions_7_0= ruleDeploymentImplicitDefinition ) )
            	    {
            	    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleInvalidDeploymentImplicit5352); 

            	        	newLeafNode(otherlv_6, grammarAccess.getInvalidDeploymentImplicitAccess().getAndKeyword_5_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2293:1: ( (lv_definitions_7_0= ruleDeploymentImplicitDefinition ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2294:1: (lv_definitions_7_0= ruleDeploymentImplicitDefinition )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2294:1: (lv_definitions_7_0= ruleDeploymentImplicitDefinition )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2295:3: lv_definitions_7_0= ruleDeploymentImplicitDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInvalidDeploymentImplicitAccess().getDefinitionsDeploymentImplicitDefinitionParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeploymentImplicit5373);
            	    lv_definitions_7_0=ruleDeploymentImplicitDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInvalidDeploymentImplicitRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"definitions",
            	            		lv_definitions_7_0, 
            	            		"DeploymentImplicitDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleInvalidDeploymentImplicit5387); 

                	newLeafNode(otherlv_8, grammarAccess.getInvalidDeploymentImplicitAccess().getSemicolonKeyword_6());
                

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
    // $ANTLR end "ruleInvalidDeploymentImplicit"


    // $ANTLR start "entryRuleDeploymentImplicitDefinition"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2323:1: entryRuleDeploymentImplicitDefinition returns [EObject current=null] : iv_ruleDeploymentImplicitDefinition= ruleDeploymentImplicitDefinition EOF ;
    public final EObject entryRuleDeploymentImplicitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentImplicitDefinition = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2324:2: (iv_ruleDeploymentImplicitDefinition= ruleDeploymentImplicitDefinition EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2325:2: iv_ruleDeploymentImplicitDefinition= ruleDeploymentImplicitDefinition EOF
            {
             newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionRule()); 
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_entryRuleDeploymentImplicitDefinition5423);
            iv_ruleDeploymentImplicitDefinition=ruleDeploymentImplicitDefinition();

            state._fsp--;

             current =iv_ruleDeploymentImplicitDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinition5433); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2332:1: ruleDeploymentImplicitDefinition returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDeploymentImplicitDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_attribute_0_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2335:28: ( ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2336:1: ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2336:1: ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2336:2: ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2336:2: ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2337:1: (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2337:1: (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2338:3: lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute
            {
             
            	        newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionAccess().getAttributeDeploymentImplicitDefinitionAttributeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinitionAttribute_in_ruleDeploymentImplicitDefinition5479);
            lv_attribute_0_0=ruleDeploymentImplicitDefinitionAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeploymentImplicitDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"attribute",
                    		lv_attribute_0_0, 
                    		"DeploymentImplicitDefinitionAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDeploymentImplicitDefinition5491); 

                	newLeafNode(otherlv_1, grammarAccess.getDeploymentImplicitDefinitionAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2358:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2359:1: (lv_value_2_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2359:1: (lv_value_2_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2360:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeploymentImplicitDefinition5508); 

            			newLeafNode(lv_value_2_0, grammarAccess.getDeploymentImplicitDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeploymentImplicitDefinitionRule());
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
    // $ANTLR end "ruleDeploymentImplicitDefinition"


    // $ANTLR start "entryRuleQualifiedName"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2386:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2387:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2388:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5552);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName5563); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2395:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2398:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2399:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2399:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2399:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5603); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2406:1: (kw= '.' this_ID_2= RULE_ID )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==50) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2407:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,50,FOLLOW_50_in_ruleQualifiedName5622); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5637); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop30;
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


    // $ANTLR start "ruleImplicitEqInterfaceGroupDefinitionAttribute"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2427:1: ruleImplicitEqInterfaceGroupDefinitionAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'System' ) | (enumLiteral_1= 'SubAta' ) | (enumLiteral_2= 'Resource' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) ) ;
    public final Enumerator ruleImplicitEqInterfaceGroupDefinitionAttribute() throws RecognitionException {
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

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2429:28: ( ( (enumLiteral_0= 'System' ) | (enumLiteral_1= 'SubAta' ) | (enumLiteral_2= 'Resource' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2430:1: ( (enumLiteral_0= 'System' ) | (enumLiteral_1= 'SubAta' ) | (enumLiteral_2= 'Resource' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2430:1: ( (enumLiteral_0= 'System' ) | (enumLiteral_1= 'SubAta' ) | (enumLiteral_2= 'Resource' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) )
            int alt31=10;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt31=1;
                }
                break;
            case 35:
                {
                alt31=2;
                }
                break;
            case 36:
                {
                alt31=3;
                }
                break;
            case 37:
                {
                alt31=4;
                }
                break;
            case 38:
                {
                alt31=5;
                }
                break;
            case 39:
                {
                alt31=6;
                }
                break;
            case 40:
                {
                alt31=7;
                }
                break;
            case 41:
                {
                alt31=8;
                }
                break;
            case 42:
                {
                alt31=9;
                }
                break;
            case 26:
                {
                alt31=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2430:2: (enumLiteral_0= 'System' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2430:2: (enumLiteral_0= 'System' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2430:4: enumLiteral_0= 'System'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5698); 

                            current = grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getSYSTEMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getSYSTEMEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2436:6: (enumLiteral_1= 'SubAta' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2436:6: (enumLiteral_1= 'SubAta' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2436:8: enumLiteral_1= 'SubAta'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_35_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5715); 

                            current = grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getSUBATAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getSUBATAEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2442:6: (enumLiteral_2= 'Resource' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2442:6: (enumLiteral_2= 'Resource' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2442:8: enumLiteral_2= 'Resource'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_36_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5732); 

                            current = grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getRESOURCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getRESOURCEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2448:6: (enumLiteral_3= 'LineName' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2448:6: (enumLiteral_3= 'LineName' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2448:8: enumLiteral_3= 'LineName'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_37_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5749); 

                            current = grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getLINENAMEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getLINENAMEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2454:6: (enumLiteral_4= 'WiringLane' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2454:6: (enumLiteral_4= 'WiringLane' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2454:8: enumLiteral_4= 'WiringLane'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_38_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5766); 

                            current = grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getWIRINGLANEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getWIRINGLANEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2460:6: (enumLiteral_5= 'GrpInfo' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2460:6: (enumLiteral_5= 'GrpInfo' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2460:8: enumLiteral_5= 'GrpInfo'
                    {
                    enumLiteral_5=(Token)match(input,39,FOLLOW_39_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5783); 

                            current = grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getGRPINFOEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getGRPINFOEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2466:6: (enumLiteral_6= 'Route' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2466:6: (enumLiteral_6= 'Route' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2466:8: enumLiteral_6= 'Route'
                    {
                    enumLiteral_6=(Token)match(input,40,FOLLOW_40_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5800); 

                            current = grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getROUTEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getROUTEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2472:6: (enumLiteral_7= 'PwSup1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2472:6: (enumLiteral_7= 'PwSup1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2472:8: enumLiteral_7= 'PwSup1'
                    {
                    enumLiteral_7=(Token)match(input,41,FOLLOW_41_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5817); 

                            current = grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getPWSUP1EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getPWSUP1EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2478:6: (enumLiteral_8= 'EmhZone1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2478:6: (enumLiteral_8= 'EmhZone1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2478:8: enumLiteral_8= 'EmhZone1'
                    {
                    enumLiteral_8=(Token)match(input,42,FOLLOW_42_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5834); 

                            current = grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getEMHZONE1EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getEMHZONE1EnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2484:6: (enumLiteral_9= 'Type' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2484:6: (enumLiteral_9= 'Type' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2484:8: enumLiteral_9= 'Type'
                    {
                    enumLiteral_9=(Token)match(input,26,FOLLOW_26_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5851); 

                            current = grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getIOTYPEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getImplicitEqInterfaceGroupDefinitionAttributeAccess().getIOTYPEEnumLiteralDeclaration_9()); 
                        

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
    // $ANTLR end "ruleImplicitEqInterfaceGroupDefinitionAttribute"


    // $ANTLR start "ruleHardwareArchitectureLevelType"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2494:1: ruleHardwareArchitectureLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) ) ;
    public final Enumerator ruleHardwareArchitectureLevelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2496:28: ( ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2497:1: ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2497:1: ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt32=1;
                }
                break;
            case 25:
                {
                alt32=2;
                }
                break;
            case 28:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2497:2: (enumLiteral_0= 'Compartment' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2497:2: (enumLiteral_0= 'Compartment' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2497:4: enumLiteral_0= 'Compartment'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_20_in_ruleHardwareArchitectureLevelType5896); 

                            current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOMPARTMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOMPARTMENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2503:6: (enumLiteral_1= 'RDC' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2503:6: (enumLiteral_1= 'RDC' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2503:8: enumLiteral_1= 'RDC'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleHardwareArchitectureLevelType5913); 

                            current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getRDCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getHardwareArchitectureLevelTypeAccess().getRDCEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2509:6: (enumLiteral_2= 'Connector' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2509:6: (enumLiteral_2= 'Connector' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2509:8: enumLiteral_2= 'Connector'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_28_in_ruleHardwareArchitectureLevelType5930); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2519:1: ruleDeploymentImplicitDefinitionAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'RDC.Manufacturer' ) | (enumLiteral_1= 'RDC.PowerSupply' ) | (enumLiteral_2= 'RDC.Side' ) | (enumLiteral_3= 'RDC.Type' ) | (enumLiteral_4= 'RDC.ESS' ) ) ;
    public final Enumerator ruleDeploymentImplicitDefinitionAttribute() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2521:28: ( ( (enumLiteral_0= 'RDC.Manufacturer' ) | (enumLiteral_1= 'RDC.PowerSupply' ) | (enumLiteral_2= 'RDC.Side' ) | (enumLiteral_3= 'RDC.Type' ) | (enumLiteral_4= 'RDC.ESS' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2522:1: ( (enumLiteral_0= 'RDC.Manufacturer' ) | (enumLiteral_1= 'RDC.PowerSupply' ) | (enumLiteral_2= 'RDC.Side' ) | (enumLiteral_3= 'RDC.Type' ) | (enumLiteral_4= 'RDC.ESS' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2522:1: ( (enumLiteral_0= 'RDC.Manufacturer' ) | (enumLiteral_1= 'RDC.PowerSupply' ) | (enumLiteral_2= 'RDC.Side' ) | (enumLiteral_3= 'RDC.Type' ) | (enumLiteral_4= 'RDC.ESS' ) )
            int alt33=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt33=1;
                }
                break;
            case 53:
                {
                alt33=2;
                }
                break;
            case 54:
                {
                alt33=3;
                }
                break;
            case 55:
                {
                alt33=4;
                }
                break;
            case 56:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2522:2: (enumLiteral_0= 'RDC.Manufacturer' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2522:2: (enumLiteral_0= 'RDC.Manufacturer' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2522:4: enumLiteral_0= 'RDC.Manufacturer'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleDeploymentImplicitDefinitionAttribute5975); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_MANUFACTUREREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_MANUFACTUREREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2528:6: (enumLiteral_1= 'RDC.PowerSupply' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2528:6: (enumLiteral_1= 'RDC.PowerSupply' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2528:8: enumLiteral_1= 'RDC.PowerSupply'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_53_in_ruleDeploymentImplicitDefinitionAttribute5992); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_POWERSUPPLYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_POWERSUPPLYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2534:6: (enumLiteral_2= 'RDC.Side' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2534:6: (enumLiteral_2= 'RDC.Side' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2534:8: enumLiteral_2= 'RDC.Side'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_54_in_ruleDeploymentImplicitDefinitionAttribute6009); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_SIDEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_SIDEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2540:6: (enumLiteral_3= 'RDC.Type' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2540:6: (enumLiteral_3= 'RDC.Type' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2540:8: enumLiteral_3= 'RDC.Type'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_55_in_ruleDeploymentImplicitDefinitionAttribute6026); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_TYPEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_TYPEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2546:6: (enumLiteral_4= 'RDC.ESS' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2546:6: (enumLiteral_4= 'RDC.ESS' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2546:8: enumLiteral_4= 'RDC.ESS'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_56_in_ruleDeploymentImplicitDefinitionAttribute6043); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_ESSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_ESSEnumLiteralDeclaration_4()); 
                        

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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA8_eotS =
        "\11\uffff";
    static final String DFA8_eofS =
        "\11\uffff";
    static final String DFA8_minS =
        "\1\5\1\uffff\1\36\2\uffff\1\5\2\uffff\1\36";
    static final String DFA8_maxS =
        "\1\61\1\uffff\1\54\2\uffff\1\5\2\uffff\1\54";
    static final String DFA8_acceptS =
        "\1\uffff\1\5\1\uffff\1\3\1\4\1\uffff\1\1\1\2\1\uffff";
    static final String DFA8_specialS =
        "\11\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\12\uffff\1\1\34\uffff\1\3\3\uffff\1\4",
            "",
            "\1\5\14\uffff\1\6\1\7",
            "",
            "",
            "\1\10",
            "",
            "",
            "\1\5\14\uffff\1\6\1\7"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "()* loopback of 228:1: ( ( (lv_dislocalityRelations_19_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_20_0= ruleColocalityRelation ) ) | ( ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_validDeployments_22_0= ruleValidDeploymentImplicit ) ) ) | ( ( (lv_invalidDeployments_23_0= ruleInvalidDeployment ) ) | ( (lv_invalidDeployments_24_0= ruleInvalidDeploymentImplicit ) ) ) )*";
        }
    }
    static final String DFA6_eotS =
        "\7\uffff";
    static final String DFA6_eofS =
        "\7\uffff";
    static final String DFA6_minS =
        "\1\55\1\5\1\36\1\5\2\uffff\1\36";
    static final String DFA6_maxS =
        "\1\55\1\5\1\60\1\5\2\uffff\1\60";
    static final String DFA6_acceptS =
        "\4\uffff\1\2\1\1\1\uffff";
    static final String DFA6_specialS =
        "\7\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\17\uffff\2\5\1\4",
            "\1\6",
            "",
            "",
            "\1\3\17\uffff\2\5\1\4"
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
            return "266:6: ( ( (lv_validDeployments_21_0= ruleValidDeployment ) ) | ( (lv_validDeployments_22_0= ruleValidDeploymentImplicit ) ) )";
        }
    }
    static final String DFA7_eotS =
        "\7\uffff";
    static final String DFA7_eofS =
        "\7\uffff";
    static final String DFA7_minS =
        "\1\61\1\5\1\36\1\5\2\uffff\1\36";
    static final String DFA7_maxS =
        "\1\61\1\5\1\60\1\5\2\uffff\1\60";
    static final String DFA7_acceptS =
        "\4\uffff\1\1\1\2\1\uffff";
    static final String DFA7_specialS =
        "\7\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\17\uffff\2\4\1\5",
            "\1\6",
            "",
            "",
            "\1\3\17\uffff\2\4\1\5"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "304:6: ( ( (lv_invalidDeployments_23_0= ruleInvalidDeployment ) ) | ( (lv_invalidDeployments_24_0= ruleInvalidDeploymentImplicit ) ) )";
        }
    }
    static final String DFA17_eotS =
        "\14\uffff";
    static final String DFA17_eofS =
        "\14\uffff";
    static final String DFA17_minS =
        "\1\20\13\uffff";
    static final String DFA17_maxS =
        "\1\52\13\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\13\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA17_specialS =
        "\1\0\13\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\11\uffff\1\13\7\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
            "\1\12",
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 1302:3: ( ({...}? => ( ({...}? => (otherlv_4= 'InterfaceSystem' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                         
                        int index17_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_0==16) ) {s = 1;}

                        else if ( LA17_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA17_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA17_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA17_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA17_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA17_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA17_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA17_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA17_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA17_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                         
                        input.seek(index17_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
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
    public static final BitSet FOLLOW_12_in_ruleAssistModel251 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleEqInterface_in_ruleAssistModel272 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel285 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_ruleAssistModel300 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel312 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroup_in_ruleAssistModel334 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroupWithImplicitDefinition_in_ruleAssistModel361 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel375 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAssistModel390 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel402 = new BitSet(new long[]{0x0002200000010020L});
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_ruleAssistModel424 = new BitSet(new long[]{0x0002200000010020L});
    public static final BitSet FOLLOW_ruleColocalityRelation_in_ruleAssistModel451 = new BitSet(new long[]{0x0002200000010020L});
    public static final BitSet FOLLOW_ruleValidDeployment_in_ruleAssistModel479 = new BitSet(new long[]{0x0002200000010020L});
    public static final BitSet FOLLOW_ruleValidDeploymentImplicit_in_ruleAssistModel506 = new BitSet(new long[]{0x0002200000010020L});
    public static final BitSet FOLLOW_ruleInvalidDeployment_in_ruleAssistModel535 = new BitSet(new long[]{0x0002200000010020L});
    public static final BitSet FOLLOW_ruleInvalidDeploymentImplicit_in_ruleAssistModel562 = new BitSet(new long[]{0x0002200000010020L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartment_in_entryRuleCompartment615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartment625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCompartment662 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompartment679 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompartment696 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_21_in_ruleCompartment754 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment783 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment800 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_22_in_ruleCompartment868 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment897 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment914 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_23_in_ruleCompartment982 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment1011 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment1028 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_24_in_ruleCompartment1096 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment1108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment1125 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment1142 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_ruleRDC_in_ruleCompartment1218 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_16_in_ruleCompartment1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDC_in_entryRuleRDC1313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRDC1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRDC1360 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRDC1377 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRDC1394 = new BitSet(new long[]{0x000000001C600000L});
    public static final BitSet FOLLOW_21_in_ruleRDC1452 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1481 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1498 = new BitSet(new long[]{0x000000001C610000L});
    public static final BitSet FOLLOW_22_in_ruleRDC1566 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1595 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1612 = new BitSet(new long[]{0x000000001C610000L});
    public static final BitSet FOLLOW_26_in_ruleRDC1680 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1709 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1726 = new BitSet(new long[]{0x000000001C610000L});
    public static final BitSet FOLLOW_27_in_ruleRDC1794 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1823 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1840 = new BitSet(new long[]{0x000000001C610000L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleRDC1916 = new BitSet(new long[]{0x000000001C610000L});
    public static final BitSet FOLLOW_16_in_ruleRDC1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector2011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleConnector2058 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnector2075 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConnector2092 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAvailableEqInterface_in_ruleConnector2113 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleConnector2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvailableEqInterface_in_entryRuleAvailableEqInterface2162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvailableEqInterface2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAvailableEqInterface2214 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAvailableEqInterface2231 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAvailableEqInterface2248 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAvailableEqInterface2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroup_in_entryRuleEqInterfaceGroup2301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterfaceGroup2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleEqInterfaceGroup2348 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup2365 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterfaceGroup2382 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup2402 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleEqInterfaceGroup2415 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup2435 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleEqInterfaceGroup2449 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterfaceGroup2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroupWithImplicitDefinition_in_entryRuleEqInterfaceGroupWithImplicitDefinition2497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterfaceGroupWithImplicitDefinition2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleEqInterfaceGroupWithImplicitDefinition2544 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithImplicitDefinition2561 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEqInterfaceGroupWithImplicitDefinition2578 = new BitSet(new long[]{0x000807F804000000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceGroupDefinition_in_ruleEqInterfaceGroupWithImplicitDefinition2599 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_32_in_ruleEqInterfaceGroupWithImplicitDefinition2612 = new BitSet(new long[]{0x000807F804000000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceGroupDefinition_in_ruleEqInterfaceGroupWithImplicitDefinition2633 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterfaceGroupWithImplicitDefinition2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceGroupDefinition_in_entryRuleImplicitEqInterfaceGroupDefinition2683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitEqInterfaceGroupDefinition2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceGroupDefinitionAttribute_in_ruleImplicitEqInterfaceGroupDefinition2739 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImplicitEqInterfaceGroupDefinition2751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImplicitEqInterfaceGroupDefinition2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterface_in_entryRuleEqInterface2809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterface2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleEqInterface2856 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterface2873 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterface2890 = new BitSet(new long[]{0x000007FC04010000L});
    public static final BitSet FOLLOW_34_in_ruleEqInterface2948 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface2977 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2994 = new BitSet(new long[]{0x000007FC04010000L});
    public static final BitSet FOLLOW_35_in_ruleEqInterface3062 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface3074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface3091 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface3108 = new BitSet(new long[]{0x000007FC04010000L});
    public static final BitSet FOLLOW_36_in_ruleEqInterface3176 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface3188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface3205 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface3222 = new BitSet(new long[]{0x000007FC04010000L});
    public static final BitSet FOLLOW_37_in_ruleEqInterface3290 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface3302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface3319 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface3336 = new BitSet(new long[]{0x000007FC04010000L});
    public static final BitSet FOLLOW_38_in_ruleEqInterface3404 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface3416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface3433 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface3450 = new BitSet(new long[]{0x000007FC04010000L});
    public static final BitSet FOLLOW_39_in_ruleEqInterface3518 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface3530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface3547 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface3564 = new BitSet(new long[]{0x000007FC04010000L});
    public static final BitSet FOLLOW_40_in_ruleEqInterface3632 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface3644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface3661 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface3678 = new BitSet(new long[]{0x000007FC04010000L});
    public static final BitSet FOLLOW_41_in_ruleEqInterface3746 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface3758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface3775 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface3792 = new BitSet(new long[]{0x000007FC04010000L});
    public static final BitSet FOLLOW_42_in_ruleEqInterface3860 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface3872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface3889 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface3906 = new BitSet(new long[]{0x000007FC04010000L});
    public static final BitSet FOLLOW_26_in_ruleEqInterface3974 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface3986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface4003 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface4020 = new BitSet(new long[]{0x000007FC04010000L});
    public static final BitSet FOLLOW_16_in_ruleEqInterface4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation4109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDislocalityRelation4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDislocalityRelation4164 = new BitSet(new long[]{0x0000080040000000L});
    public static final BitSet FOLLOW_30_in_ruleDislocalityRelation4177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDislocalityRelation4197 = new BitSet(new long[]{0x0000080040000000L});
    public static final BitSet FOLLOW_43_in_ruleDislocalityRelation4211 = new BitSet(new long[]{0x0000000012100000L});
    public static final BitSet FOLLOW_ruleHardwareArchitectureLevelType_in_ruleDislocalityRelation4232 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDislocalityRelation4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColocalityRelation_in_entryRuleColocalityRelation4280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColocalityRelation4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColocalityRelation4335 = new BitSet(new long[]{0x0000100040000000L});
    public static final BitSet FOLLOW_30_in_ruleColocalityRelation4348 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColocalityRelation4368 = new BitSet(new long[]{0x0000100040000000L});
    public static final BitSet FOLLOW_44_in_ruleColocalityRelation4382 = new BitSet(new long[]{0x0000000012100000L});
    public static final BitSet FOLLOW_ruleHardwareArchitectureLevelType_in_ruleColocalityRelation4403 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleColocalityRelation4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidDeployment_in_entryRuleValidDeployment4451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidDeployment4461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleValidDeployment4498 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidDeployment4518 = new BitSet(new long[]{0x0000C00040000000L});
    public static final BitSet FOLLOW_30_in_ruleValidDeployment4531 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidDeployment4551 = new BitSet(new long[]{0x0000C00040000000L});
    public static final BitSet FOLLOW_46_in_ruleValidDeployment4566 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_47_in_ruleValidDeployment4584 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleValidDeployment4597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleValidDeployment4620 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleValidDeployment4633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleValidDeployment4656 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleValidDeployment4670 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleValidDeployment4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidDeploymentImplicit_in_entryRuleValidDeploymentImplicit4718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidDeploymentImplicit4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleValidDeploymentImplicit4765 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidDeploymentImplicit4785 = new BitSet(new long[]{0x0001000040000000L});
    public static final BitSet FOLLOW_30_in_ruleValidDeploymentImplicit4798 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidDeploymentImplicit4818 = new BitSet(new long[]{0x0001000040000000L});
    public static final BitSet FOLLOW_48_in_ruleValidDeploymentImplicit4832 = new BitSet(new long[]{0x01F0000000000000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeploymentImplicit4853 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_32_in_ruleValidDeploymentImplicit4866 = new BitSet(new long[]{0x01F0000000000000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeploymentImplicit4887 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_15_in_ruleValidDeploymentImplicit4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvalidDeployment_in_entryRuleInvalidDeployment4937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvalidDeployment4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleInvalidDeployment4984 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvalidDeployment5004 = new BitSet(new long[]{0x0000C00040000000L});
    public static final BitSet FOLLOW_30_in_ruleInvalidDeployment5017 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvalidDeployment5037 = new BitSet(new long[]{0x0000C00040000000L});
    public static final BitSet FOLLOW_46_in_ruleInvalidDeployment5052 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_47_in_ruleInvalidDeployment5070 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInvalidDeployment5083 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment5106 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleInvalidDeployment5119 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment5142 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleInvalidDeployment5156 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInvalidDeployment5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvalidDeploymentImplicit_in_entryRuleInvalidDeploymentImplicit5204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvalidDeploymentImplicit5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleInvalidDeploymentImplicit5251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvalidDeploymentImplicit5271 = new BitSet(new long[]{0x0001000040000000L});
    public static final BitSet FOLLOW_30_in_ruleInvalidDeploymentImplicit5284 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvalidDeploymentImplicit5304 = new BitSet(new long[]{0x0001000040000000L});
    public static final BitSet FOLLOW_48_in_ruleInvalidDeploymentImplicit5318 = new BitSet(new long[]{0x01F0000000000000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeploymentImplicit5339 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_32_in_ruleInvalidDeploymentImplicit5352 = new BitSet(new long[]{0x01F0000000000000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeploymentImplicit5373 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_15_in_ruleInvalidDeploymentImplicit5387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_entryRuleDeploymentImplicitDefinition5423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinition5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinitionAttribute_in_ruleDeploymentImplicitDefinition5479 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeploymentImplicitDefinition5491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeploymentImplicitDefinition5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5603 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleQualifiedName5622 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5637 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_51_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleImplicitEqInterfaceGroupDefinitionAttribute5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleHardwareArchitectureLevelType5896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleHardwareArchitectureLevelType5913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleHardwareArchitectureLevelType5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDeploymentImplicitDefinitionAttribute5975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDeploymentImplicitDefinitionAttribute5992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleDeploymentImplicitDefinitionAttribute6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleDeploymentImplicitDefinitionAttribute6026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDeploymentImplicitDefinitionAttribute6043 = new BitSet(new long[]{0x0000000000000002L});

}
