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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMappingDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Global'", "'{'", "'System name'", "'='", "';'", "'}'", "'Hardware'", "'Software'", "'Restrictions'", "'Compartment'", "'Manufacturer'", "'PowerSupply'", "'Side'", "'Zone'", "'Generic properties'", "'Box'", "'Board'", "'Type'", "'DesignAssuranceLevel'", "'ESS'", "'RAM capacity'", "'ROM capacity'", "'Processor'", "'Core'", "'Capacity'", "'Architecture'", "'I/O adapter'", "'type'", "'count'", "'protection-level'", "'Network'", "'Bandwidth'", "'Connects'", "','", "'Group'", "'Application'", "'Core-utilization'", "'Required RAM capacity'", "'Required ROM capacity'", "'Criticality level'", "'Required IO protection'", "'Identical parallel threads'", "'Developed by'", "'Restrict deployment to'", "'Requires'", "'adapter'", "'exclusive'", "'shared'", "'dislocal up to'", "'on same'", "'require'", "'bandwidth'", "'dissimilar based on'", "'('", "')'", "'OR'", "'AND'", "'Compartment.'", "'Box.'", "'Board.'", "'Processor.'", "'.'", "'ProcessorType'", "'None'", "'QS'", "'D'", "'C'", "'B'", "'A'", "'L1'", "'L2'", "'L3'", "'L4'", "'L5'", "'L6'", "'L7'", "'L8'", "'Can'", "'Enhanced Local Bus'", "'Ethernet'", "'Analog'", "'Digital'", "'Serial'", "'CustomType0'", "'CustomType1'", "'CustomType2'", "'CustomType3'", "'CustomType4'", "'CustomType5'", "'CustomType6'", "'CustomType7'", "'CustomType8'", "'CustomType9'", "'CustomType10'", "'CustomType11'", "'CustomType12'", "'CustomType13'", "'CustomType14'", "'CustomType15'", "'CustomType16'", "'CustomType17'", "'CustomType18'", "'CustomType19'", "'CustomType20'", "'CustomType21'", "'CustomType22'", "'CustomType23'", "'CustomType24'", "'CustomType25'", "'CustomType26'", "'CustomType27'", "'CustomType28'", "'CustomType29'", "'CustomType30'", "'CustomType31'", "'CustomType32'", "'CustomType33'", "'CustomType34'", "'CustomType35'", "'CustomType36'", "'CustomType37'", "'CustomType38'", "'CustomType39'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssistModelRule()); 
            }
            pushFollow(FOLLOW_ruleAssistModel_in_entryRuleAssistModel75);
            iv_ruleAssistModel=ruleAssistModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssistModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssistModel85); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:77:1: ruleAssistModel returns [EObject current=null] : (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= 'Hardware' otherlv_8= '{' ( (lv_hardwareContainer_9_0= ruleHardwareElementContainer ) )+ ( (lv_networks_10_0= ruleNetwork ) )* otherlv_11= '}' otherlv_12= 'Software' otherlv_13= '{' ( (lv_applications_14_0= ruleApplication ) )+ ( (lv_applicationGroups_15_0= ruleApplicationGroup ) )* otherlv_16= '}' (otherlv_17= 'Restrictions' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* ( (lv_communicationRelations_22_0= ruleCommunicationRelation ) )* otherlv_23= '}' )? ) ;
    public final EObject ruleAssistModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_systemName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_23=null;
        EObject lv_hardwareContainer_9_0 = null;

        EObject lv_networks_10_0 = null;

        EObject lv_applications_14_0 = null;

        EObject lv_applicationGroups_15_0 = null;

        EObject lv_dissimilarityRelations_19_0 = null;

        EObject lv_dislocalityRelations_20_0 = null;

        EObject lv_proximityRelations_21_0 = null;

        EObject lv_communicationRelations_22_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:80:28: ( (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= 'Hardware' otherlv_8= '{' ( (lv_hardwareContainer_9_0= ruleHardwareElementContainer ) )+ ( (lv_networks_10_0= ruleNetwork ) )* otherlv_11= '}' otherlv_12= 'Software' otherlv_13= '{' ( (lv_applications_14_0= ruleApplication ) )+ ( (lv_applicationGroups_15_0= ruleApplicationGroup ) )* otherlv_16= '}' (otherlv_17= 'Restrictions' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* ( (lv_communicationRelations_22_0= ruleCommunicationRelation ) )* otherlv_23= '}' )? ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= 'Hardware' otherlv_8= '{' ( (lv_hardwareContainer_9_0= ruleHardwareElementContainer ) )+ ( (lv_networks_10_0= ruleNetwork ) )* otherlv_11= '}' otherlv_12= 'Software' otherlv_13= '{' ( (lv_applications_14_0= ruleApplication ) )+ ( (lv_applicationGroups_15_0= ruleApplicationGroup ) )* otherlv_16= '}' (otherlv_17= 'Restrictions' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* ( (lv_communicationRelations_22_0= ruleCommunicationRelation ) )* otherlv_23= '}' )? )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= 'Hardware' otherlv_8= '{' ( (lv_hardwareContainer_9_0= ruleHardwareElementContainer ) )+ ( (lv_networks_10_0= ruleNetwork ) )* otherlv_11= '}' otherlv_12= 'Software' otherlv_13= '{' ( (lv_applications_14_0= ruleApplication ) )+ ( (lv_applicationGroups_15_0= ruleApplicationGroup ) )* otherlv_16= '}' (otherlv_17= 'Restrictions' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* ( (lv_communicationRelations_22_0= ruleCommunicationRelation ) )* otherlv_23= '}' )? )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:3: otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= 'Hardware' otherlv_8= '{' ( (lv_hardwareContainer_9_0= ruleHardwareElementContainer ) )+ ( (lv_networks_10_0= ruleNetwork ) )* otherlv_11= '}' otherlv_12= 'Software' otherlv_13= '{' ( (lv_applications_14_0= ruleApplication ) )+ ( (lv_applicationGroups_15_0= ruleApplicationGroup ) )* otherlv_16= '}' (otherlv_17= 'Restrictions' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* ( (lv_communicationRelations_22_0= ruleCommunicationRelation ) )* otherlv_23= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAssistModel122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssistModelAccess().getGlobalKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel134); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleAssistModel146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssistModelAccess().getSystemNameKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleAssistModel158); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAssistModelAccess().getEqualsSignKeyword_3());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:97:1: ( (lv_systemName_4_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:98:1: (lv_systemName_4_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:98:1: (lv_systemName_4_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:99:3: lv_systemName_4_0= RULE_STRING
            {
            lv_systemName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssistModel175); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_systemName_4_0, grammarAccess.getAssistModelAccess().getSystemNameSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleAssistModel192); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAssistModelAccess().getSemicolonKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleAssistModel204); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleAssistModel216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getAssistModelAccess().getHardwareKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_8());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:131:1: ( (lv_hardwareContainer_9_0= ruleHardwareElementContainer ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20||(LA1_0>=26 && LA1_0<=27)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:132:1: (lv_hardwareContainer_9_0= ruleHardwareElementContainer )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:132:1: (lv_hardwareContainer_9_0= ruleHardwareElementContainer )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:133:3: lv_hardwareContainer_9_0= ruleHardwareElementContainer
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssistModelAccess().getHardwareContainerHardwareElementContainerParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleHardwareElementContainer_in_ruleAssistModel249);
            	    lv_hardwareContainer_9_0=ruleHardwareElementContainer();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"hardwareContainer",
            	              		lv_hardwareContainer_9_0, 
            	              		"HardwareElementContainer");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:149:3: ( (lv_networks_10_0= ruleNetwork ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==41) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:150:1: (lv_networks_10_0= ruleNetwork )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:150:1: (lv_networks_10_0= ruleNetwork )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:151:3: lv_networks_10_0= ruleNetwork
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssistModelAccess().getNetworksNetworkParserRuleCall_10_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNetwork_in_ruleAssistModel271);
            	    lv_networks_10_0=ruleNetwork();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"networks",
            	              		lv_networks_10_0, 
            	              		"Network");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleAssistModel284); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleAssistModel296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getAssistModelAccess().getSoftwareKeyword_12());
                  
            }
            otherlv_13=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_13());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:179:1: ( (lv_applications_14_0= ruleApplication ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==46) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:180:1: (lv_applications_14_0= ruleApplication )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:180:1: (lv_applications_14_0= ruleApplication )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:181:3: lv_applications_14_0= ruleApplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssistModelAccess().getApplicationsApplicationParserRuleCall_14_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleApplication_in_ruleAssistModel329);
            	    lv_applications_14_0=ruleApplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"applications",
            	              		lv_applications_14_0, 
            	              		"Application");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:197:3: ( (lv_applicationGroups_15_0= ruleApplicationGroup ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==45) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:198:1: (lv_applicationGroups_15_0= ruleApplicationGroup )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:198:1: (lv_applicationGroups_15_0= ruleApplicationGroup )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:199:3: lv_applicationGroups_15_0= ruleApplicationGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssistModelAccess().getApplicationGroupsApplicationGroupParserRuleCall_15_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleApplicationGroup_in_ruleAssistModel351);
            	    lv_applicationGroups_15_0=ruleApplicationGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"applicationGroups",
            	              		lv_applicationGroups_15_0, 
            	              		"ApplicationGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleAssistModel364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_16());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:219:1: (otherlv_17= 'Restrictions' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* ( (lv_communicationRelations_22_0= ruleCommunicationRelation ) )* otherlv_23= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:219:3: otherlv_17= 'Restrictions' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* ( (lv_communicationRelations_22_0= ruleCommunicationRelation ) )* otherlv_23= '}'
                    {
                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleAssistModel377); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getAssistModelAccess().getRestrictionsKeyword_17_0());
                          
                    }
                    otherlv_18=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_17_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:227:1: ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )*
                    loop5:
                    do {
                        int alt5=2;
                        alt5 = dfa5.predict(input);
                        switch (alt5) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:228:1: (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:228:1: (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:229:3: lv_dissimilarityRelations_19_0= ruleDissimilarityRelation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAssistModelAccess().getDissimilarityRelationsDissimilarityRelationParserRuleCall_17_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDissimilarityRelation_in_ruleAssistModel410);
                    	    lv_dissimilarityRelations_19_0=ruleDissimilarityRelation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"dissimilarityRelations",
                    	              		lv_dissimilarityRelations_19_0, 
                    	              		"DissimilarityRelation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:245:3: ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )*
                    loop6:
                    do {
                        int alt6=2;
                        alt6 = dfa6.predict(input);
                        switch (alt6) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:246:1: (lv_dislocalityRelations_20_0= ruleDislocalityRelation )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:246:1: (lv_dislocalityRelations_20_0= ruleDislocalityRelation )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:247:3: lv_dislocalityRelations_20_0= ruleDislocalityRelation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAssistModelAccess().getDislocalityRelationsDislocalityRelationParserRuleCall_17_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDislocalityRelation_in_ruleAssistModel432);
                    	    lv_dislocalityRelations_20_0=ruleDislocalityRelation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"dislocalityRelations",
                    	              		lv_dislocalityRelations_20_0, 
                    	              		"DislocalityRelation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:263:3: ( (lv_proximityRelations_21_0= ruleProximityRelation ) )*
                    loop7:
                    do {
                        int alt7=2;
                        alt7 = dfa7.predict(input);
                        switch (alt7) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:264:1: (lv_proximityRelations_21_0= ruleProximityRelation )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:264:1: (lv_proximityRelations_21_0= ruleProximityRelation )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:265:3: lv_proximityRelations_21_0= ruleProximityRelation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAssistModelAccess().getProximityRelationsProximityRelationParserRuleCall_17_4_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleProximityRelation_in_ruleAssistModel454);
                    	    lv_proximityRelations_21_0=ruleProximityRelation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"proximityRelations",
                    	              		lv_proximityRelations_21_0, 
                    	              		"ProximityRelation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:281:3: ( (lv_communicationRelations_22_0= ruleCommunicationRelation ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:282:1: (lv_communicationRelations_22_0= ruleCommunicationRelation )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:282:1: (lv_communicationRelations_22_0= ruleCommunicationRelation )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:283:3: lv_communicationRelations_22_0= ruleCommunicationRelation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAssistModelAccess().getCommunicationRelationsCommunicationRelationParserRuleCall_17_5_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCommunicationRelation_in_ruleAssistModel476);
                    	    lv_communicationRelations_22_0=ruleCommunicationRelation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"communicationRelations",
                    	              		lv_communicationRelations_22_0, 
                    	              		"CommunicationRelation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_16_in_ruleAssistModel489); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_17_6());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssistModel"


    // $ANTLR start "entryRuleHardwareElementContainer"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:311:1: entryRuleHardwareElementContainer returns [EObject current=null] : iv_ruleHardwareElementContainer= ruleHardwareElementContainer EOF ;
    public final EObject entryRuleHardwareElementContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHardwareElementContainer = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:312:2: (iv_ruleHardwareElementContainer= ruleHardwareElementContainer EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:313:2: iv_ruleHardwareElementContainer= ruleHardwareElementContainer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHardwareElementContainerRule()); 
            }
            pushFollow(FOLLOW_ruleHardwareElementContainer_in_entryRuleHardwareElementContainer527);
            iv_ruleHardwareElementContainer=ruleHardwareElementContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHardwareElementContainer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHardwareElementContainer537); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHardwareElementContainer"


    // $ANTLR start "ruleHardwareElementContainer"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:320:1: ruleHardwareElementContainer returns [EObject current=null] : (this_Compartment_0= ruleCompartment | this_Box_1= ruleBox | this_Board_2= ruleBoard ) ;
    public final EObject ruleHardwareElementContainer() throws RecognitionException {
        EObject current = null;

        EObject this_Compartment_0 = null;

        EObject this_Box_1 = null;

        EObject this_Board_2 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:323:28: ( (this_Compartment_0= ruleCompartment | this_Box_1= ruleBox | this_Board_2= ruleBoard ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:324:1: (this_Compartment_0= ruleCompartment | this_Box_1= ruleBox | this_Board_2= ruleBoard )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:324:1: (this_Compartment_0= ruleCompartment | this_Box_1= ruleBox | this_Board_2= ruleBoard )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 27:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:325:5: this_Compartment_0= ruleCompartment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHardwareElementContainerAccess().getCompartmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompartment_in_ruleHardwareElementContainer584);
                    this_Compartment_0=ruleCompartment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Compartment_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:335:5: this_Box_1= ruleBox
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHardwareElementContainerAccess().getBoxParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBox_in_ruleHardwareElementContainer611);
                    this_Box_1=ruleBox();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Box_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:345:5: this_Board_2= ruleBoard
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHardwareElementContainerAccess().getBoardParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoard_in_ruleHardwareElementContainer638);
                    this_Board_2=ruleBoard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Board_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHardwareElementContainer"


    // $ANTLR start "entryRuleCompartment"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:361:1: entryRuleCompartment returns [EObject current=null] : iv_ruleCompartment= ruleCompartment EOF ;
    public final EObject entryRuleCompartment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompartment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:362:2: (iv_ruleCompartment= ruleCompartment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:363:2: iv_ruleCompartment= ruleCompartment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompartmentRule()); 
            }
            pushFollow(FOLLOW_ruleCompartment_in_entryRuleCompartment673);
            iv_ruleCompartment=ruleCompartment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompartment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartment683); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:370:1: ruleCompartment returns [EObject current=null] : (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_boxes_19_0= ruleBox ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
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
        EObject lv_boxes_19_0 = null;

        EObject lv_metricParameters_22_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:373:28: ( (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_boxes_19_0= ruleBox ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:374:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_boxes_19_0= ruleBox ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:374:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_boxes_19_0= ruleBox ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:374:3: otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_boxes_19_0= ruleBox ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleCompartment720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompartmentAccess().getCompartmentKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:378:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:379:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:379:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:380:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompartment737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getCompartmentAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCompartment754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:400:1: (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:400:3: otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleCompartment767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCompartmentAccess().getManufacturerKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleCompartment779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:408:1: ( (lv_manufacturer_5_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:409:1: (lv_manufacturer_5_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:409:1: (lv_manufacturer_5_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:410:3: lv_manufacturer_5_0= RULE_STRING
                    {
                    lv_manufacturer_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_manufacturer_5_0, grammarAccess.getCompartmentAccess().getManufacturerSTRINGTerminalRuleCall_3_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleCompartment813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:430:3: (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:430:5: otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleCompartment828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getCompartmentAccess().getPowerSupplyKeyword_4_0());
                          
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleCompartment840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_4_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:438:1: ( (lv_powerSupply_9_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:439:1: (lv_powerSupply_9_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:439:1: (lv_powerSupply_9_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:440:3: lv_powerSupply_9_0= RULE_STRING
                    {
                    lv_powerSupply_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_powerSupply_9_0, grammarAccess.getCompartmentAccess().getPowerSupplySTRINGTerminalRuleCall_4_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleCompartment874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getCompartmentAccess().getSemicolonKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:460:3: (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:460:5: otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleCompartment889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getCompartmentAccess().getSideKeyword_5_0());
                          
                    }
                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleCompartment901); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_5_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:468:1: ( (lv_side_13_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:469:1: (lv_side_13_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:469:1: (lv_side_13_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:470:3: lv_side_13_0= RULE_STRING
                    {
                    lv_side_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment918); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_side_13_0, grammarAccess.getCompartmentAccess().getSideSTRINGTerminalRuleCall_5_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleCompartment935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getCompartmentAccess().getSemicolonKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:490:3: (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:490:5: otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,24,FOLLOW_24_in_ruleCompartment950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getCompartmentAccess().getZoneKeyword_6_0());
                          
                    }
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleCompartment962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_6_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:498:1: ( (lv_zone_17_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:499:1: (lv_zone_17_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:499:1: (lv_zone_17_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:500:3: lv_zone_17_0= RULE_STRING
                    {
                    lv_zone_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_zone_17_0, grammarAccess.getCompartmentAccess().getZoneSTRINGTerminalRuleCall_6_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleCompartment996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getCompartmentAccess().getSemicolonKeyword_6_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:520:3: ( (lv_boxes_19_0= ruleBox ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:521:1: (lv_boxes_19_0= ruleBox )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:521:1: (lv_boxes_19_0= ruleBox )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:522:3: lv_boxes_19_0= ruleBox
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompartmentAccess().getBoxesBoxParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBox_in_ruleCompartment1019);
            	    lv_boxes_19_0=ruleBox();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompartmentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"boxes",
            	              		lv_boxes_19_0, 
            	              		"Box");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:538:3: (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:538:5: otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}'
                    {
                    otherlv_20=(Token)match(input,25,FOLLOW_25_in_ruleCompartment1033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getCompartmentAccess().getGenericPropertiesKeyword_8_0());
                          
                    }
                    otherlv_21=(Token)match(input,12,FOLLOW_12_in_ruleCompartment1045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_8_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:546:1: ( (lv_metricParameters_22_0= ruleMetricParameter ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_STRING) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:547:1: (lv_metricParameters_22_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:547:1: (lv_metricParameters_22_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:548:3: lv_metricParameters_22_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompartmentAccess().getMetricParametersMetricParameterParserRuleCall_8_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleCompartment1066);
                    	    lv_metricParameters_22_0=ruleMetricParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_16_in_ruleCompartment1079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_8_3());
                          
                    }

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_16_in_ruleCompartment1093); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_24, grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCompartment"


    // $ANTLR start "entryRuleBox"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:580:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:581:2: (iv_ruleBox= ruleBox EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:582:2: iv_ruleBox= ruleBox EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoxRule()); 
            }
            pushFollow(FOLLOW_ruleBox_in_entryRuleBox1129);
            iv_ruleBox=ruleBox();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBox; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBox1139); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:589:1: ruleBox returns [EObject current=null] : (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? ( (lv_boards_7_0= ruleBoard ) )+ (otherlv_8= 'Generic properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_manufacturer_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_boards_7_0 = null;

        EObject lv_metricParameters_10_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:592:28: ( (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? ( (lv_boards_7_0= ruleBoard ) )+ (otherlv_8= 'Generic properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:593:1: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? ( (lv_boards_7_0= ruleBoard ) )+ (otherlv_8= 'Generic properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:593:1: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? ( (lv_boards_7_0= ruleBoard ) )+ (otherlv_8= 'Generic properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:593:3: otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? ( (lv_boards_7_0= ruleBoard ) )+ (otherlv_8= 'Generic properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleBox1176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBoxAccess().getBoxKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:597:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:598:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:598:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:599:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBox1193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBoxRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleBox1210); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:619:1: (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:619:3: otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleBox1223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBoxAccess().getManufacturerKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleBox1235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBoxAccess().getEqualsSignKeyword_3_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:627:1: ( (lv_manufacturer_5_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:628:1: (lv_manufacturer_5_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:628:1: (lv_manufacturer_5_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:629:3: lv_manufacturer_5_0= RULE_STRING
                    {
                    lv_manufacturer_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBox1252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_manufacturer_5_0, grammarAccess.getBoxAccess().getManufacturerSTRINGTerminalRuleCall_3_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBoxRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"manufacturer",
                              		lv_manufacturer_5_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleBox1269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getBoxAccess().getSemicolonKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:649:3: ( (lv_boards_7_0= ruleBoard ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:650:1: (lv_boards_7_0= ruleBoard )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:650:1: (lv_boards_7_0= ruleBoard )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:651:3: lv_boards_7_0= ruleBoard
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBoxAccess().getBoardsBoardParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBoard_in_ruleBox1292);
            	    lv_boards_7_0=ruleBoard();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBoxRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"boards",
            	              		lv_boards_7_0, 
            	              		"Board");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:667:3: (otherlv_8= 'Generic properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:667:5: otherlv_8= 'Generic properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleBox1306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBoxAccess().getGenericPropertiesKeyword_5_0());
                          
                    }
                    otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleBox1318); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_5_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:675:1: ( (lv_metricParameters_10_0= ruleMetricParameter ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_STRING) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:676:1: (lv_metricParameters_10_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:676:1: (lv_metricParameters_10_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:677:3: lv_metricParameters_10_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBoxAccess().getMetricParametersMetricParameterParserRuleCall_5_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleBox1339);
                    	    lv_metricParameters_10_0=ruleMetricParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBoxRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"metricParameters",
                    	              		lv_metricParameters_10_0, 
                    	              		"MetricParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleBox1352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleBox1366); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleBoard"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:709:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:710:2: (iv_ruleBoard= ruleBoard EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:711:2: iv_ruleBoard= ruleBoard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoardRule()); 
            }
            pushFollow(FOLLOW_ruleBoard_in_entryRuleBoard1402);
            iv_ruleBoard=ruleBoard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoard; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoard1412); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:718:1: ruleBoard returns [EObject current=null] : (otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'PowerSupply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'DesignAssuranceLevel' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Side' otherlv_20= '=' ( (lv_side_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'ESS' otherlv_24= '=' ( (lv_ess_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'RAM capacity' otherlv_28= '=' ( (lv_ramCapacity_29_0= RULE_INT ) ) otherlv_30= ';' )? (otherlv_31= 'ROM capacity' otherlv_32= '=' ( (lv_romCapacity_33_0= RULE_INT ) ) otherlv_34= ';' )? ( (lv_processors_35_0= ruleProcessor ) )+ ( (lv_ioAdapters_36_0= ruleIOAdapter ) )* (otherlv_37= 'Generic properties' otherlv_38= '{' ( (lv_metricParameters_39_0= ruleMetricParameter ) )* otherlv_40= '}' )? otherlv_41= '}' ) ;
    public final EObject ruleBoard() throws RecognitionException {
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
        Token lv_boardType_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_powerSupply_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_side_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_ess_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_ramCapacity_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_romCapacity_33_0=null;
        Token otherlv_34=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Enumerator lv_assuranceLevel_17_0 = null;

        EObject lv_processors_35_0 = null;

        EObject lv_ioAdapters_36_0 = null;

        EObject lv_metricParameters_39_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:721:28: ( (otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'PowerSupply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'DesignAssuranceLevel' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Side' otherlv_20= '=' ( (lv_side_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'ESS' otherlv_24= '=' ( (lv_ess_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'RAM capacity' otherlv_28= '=' ( (lv_ramCapacity_29_0= RULE_INT ) ) otherlv_30= ';' )? (otherlv_31= 'ROM capacity' otherlv_32= '=' ( (lv_romCapacity_33_0= RULE_INT ) ) otherlv_34= ';' )? ( (lv_processors_35_0= ruleProcessor ) )+ ( (lv_ioAdapters_36_0= ruleIOAdapter ) )* (otherlv_37= 'Generic properties' otherlv_38= '{' ( (lv_metricParameters_39_0= ruleMetricParameter ) )* otherlv_40= '}' )? otherlv_41= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:722:1: (otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'PowerSupply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'DesignAssuranceLevel' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Side' otherlv_20= '=' ( (lv_side_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'ESS' otherlv_24= '=' ( (lv_ess_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'RAM capacity' otherlv_28= '=' ( (lv_ramCapacity_29_0= RULE_INT ) ) otherlv_30= ';' )? (otherlv_31= 'ROM capacity' otherlv_32= '=' ( (lv_romCapacity_33_0= RULE_INT ) ) otherlv_34= ';' )? ( (lv_processors_35_0= ruleProcessor ) )+ ( (lv_ioAdapters_36_0= ruleIOAdapter ) )* (otherlv_37= 'Generic properties' otherlv_38= '{' ( (lv_metricParameters_39_0= ruleMetricParameter ) )* otherlv_40= '}' )? otherlv_41= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:722:1: (otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'PowerSupply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'DesignAssuranceLevel' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Side' otherlv_20= '=' ( (lv_side_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'ESS' otherlv_24= '=' ( (lv_ess_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'RAM capacity' otherlv_28= '=' ( (lv_ramCapacity_29_0= RULE_INT ) ) otherlv_30= ';' )? (otherlv_31= 'ROM capacity' otherlv_32= '=' ( (lv_romCapacity_33_0= RULE_INT ) ) otherlv_34= ';' )? ( (lv_processors_35_0= ruleProcessor ) )+ ( (lv_ioAdapters_36_0= ruleIOAdapter ) )* (otherlv_37= 'Generic properties' otherlv_38= '{' ( (lv_metricParameters_39_0= ruleMetricParameter ) )* otherlv_40= '}' )? otherlv_41= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:722:3: otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'PowerSupply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'DesignAssuranceLevel' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Side' otherlv_20= '=' ( (lv_side_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'ESS' otherlv_24= '=' ( (lv_ess_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'RAM capacity' otherlv_28= '=' ( (lv_ramCapacity_29_0= RULE_INT ) ) otherlv_30= ';' )? (otherlv_31= 'ROM capacity' otherlv_32= '=' ( (lv_romCapacity_33_0= RULE_INT ) ) otherlv_34= ';' )? ( (lv_processors_35_0= ruleProcessor ) )+ ( (lv_ioAdapters_36_0= ruleIOAdapter ) )* (otherlv_37= 'Generic properties' otherlv_38= '{' ( (lv_metricParameters_39_0= ruleMetricParameter ) )* otherlv_40= '}' )? otherlv_41= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleBoard1449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBoardAccess().getBoardKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:726:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:727:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:727:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:728:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBoard1466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getBoardAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBoardRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleBoard1483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:748:1: (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:748:3: otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleBoard1496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBoardAccess().getManufacturerKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleBoard1508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBoardAccess().getEqualsSignKeyword_3_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:756:1: ( (lv_manufacturer_5_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:757:1: (lv_manufacturer_5_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:757:1: (lv_manufacturer_5_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:758:3: lv_manufacturer_5_0= RULE_STRING
                    {
                    lv_manufacturer_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBoard1525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_manufacturer_5_0, grammarAccess.getBoardAccess().getManufacturerSTRINGTerminalRuleCall_3_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBoardRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"manufacturer",
                              		lv_manufacturer_5_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleBoard1542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getBoardAccess().getSemicolonKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:778:3: (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:778:5: otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleBoard1557); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getBoardAccess().getTypeKeyword_4_0());
                          
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleBoard1569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBoardAccess().getEqualsSignKeyword_4_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:786:1: ( (lv_boardType_9_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:787:1: (lv_boardType_9_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:787:1: (lv_boardType_9_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:788:3: lv_boardType_9_0= RULE_STRING
                    {
                    lv_boardType_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBoard1586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_boardType_9_0, grammarAccess.getBoardAccess().getBoardTypeSTRINGTerminalRuleCall_4_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBoardRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"boardType",
                              		lv_boardType_9_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleBoard1603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getBoardAccess().getSemicolonKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:808:3: (otherlv_11= 'PowerSupply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:808:5: otherlv_11= 'PowerSupply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleBoard1618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getBoardAccess().getPowerSupplyKeyword_5_0());
                          
                    }
                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleBoard1630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getBoardAccess().getEqualsSignKeyword_5_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:816:1: ( (lv_powerSupply_13_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:817:1: (lv_powerSupply_13_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:817:1: (lv_powerSupply_13_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:818:3: lv_powerSupply_13_0= RULE_STRING
                    {
                    lv_powerSupply_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBoard1647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_powerSupply_13_0, grammarAccess.getBoardAccess().getPowerSupplySTRINGTerminalRuleCall_5_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBoardRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"powerSupply",
                              		lv_powerSupply_13_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleBoard1664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getBoardAccess().getSemicolonKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:838:3: (otherlv_15= 'DesignAssuranceLevel' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:838:5: otherlv_15= 'DesignAssuranceLevel' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_29_in_ruleBoard1679); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getBoardAccess().getDesignAssuranceLevelKeyword_6_0());
                          
                    }
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleBoard1691); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getBoardAccess().getEqualsSignKeyword_6_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:846:1: ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:847:1: (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:847:1: (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:848:3: lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBoardAccess().getAssuranceLevelDesignAssuranceLevelTypeEnumRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDesignAssuranceLevelType_in_ruleBoard1712);
                    lv_assuranceLevel_17_0=ruleDesignAssuranceLevelType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBoardRule());
                      	        }
                             		set(
                             			current, 
                             			"assuranceLevel",
                              		lv_assuranceLevel_17_0, 
                              		"DesignAssuranceLevelType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleBoard1724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getBoardAccess().getSemicolonKeyword_6_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:868:3: (otherlv_19= 'Side' otherlv_20= '=' ( (lv_side_21_0= RULE_STRING ) ) otherlv_22= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:868:5: otherlv_19= 'Side' otherlv_20= '=' ( (lv_side_21_0= RULE_STRING ) ) otherlv_22= ';'
                    {
                    otherlv_19=(Token)match(input,23,FOLLOW_23_in_ruleBoard1739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getBoardAccess().getSideKeyword_7_0());
                          
                    }
                    otherlv_20=(Token)match(input,14,FOLLOW_14_in_ruleBoard1751); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getBoardAccess().getEqualsSignKeyword_7_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:876:1: ( (lv_side_21_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:877:1: (lv_side_21_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:877:1: (lv_side_21_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:878:3: lv_side_21_0= RULE_STRING
                    {
                    lv_side_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBoard1768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_side_21_0, grammarAccess.getBoardAccess().getSideSTRINGTerminalRuleCall_7_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBoardRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"side",
                              		lv_side_21_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,15,FOLLOW_15_in_ruleBoard1785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getBoardAccess().getSemicolonKeyword_7_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:898:3: (otherlv_23= 'ESS' otherlv_24= '=' ( (lv_ess_25_0= RULE_STRING ) ) otherlv_26= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:898:5: otherlv_23= 'ESS' otherlv_24= '=' ( (lv_ess_25_0= RULE_STRING ) ) otherlv_26= ';'
                    {
                    otherlv_23=(Token)match(input,30,FOLLOW_30_in_ruleBoard1800); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getBoardAccess().getESSKeyword_8_0());
                          
                    }
                    otherlv_24=(Token)match(input,14,FOLLOW_14_in_ruleBoard1812); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getBoardAccess().getEqualsSignKeyword_8_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:906:1: ( (lv_ess_25_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:907:1: (lv_ess_25_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:907:1: (lv_ess_25_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:908:3: lv_ess_25_0= RULE_STRING
                    {
                    lv_ess_25_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBoard1829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_ess_25_0, grammarAccess.getBoardAccess().getEssSTRINGTerminalRuleCall_8_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBoardRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"ess",
                              		lv_ess_25_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    otherlv_26=(Token)match(input,15,FOLLOW_15_in_ruleBoard1846); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getBoardAccess().getSemicolonKeyword_8_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:928:3: (otherlv_27= 'RAM capacity' otherlv_28= '=' ( (lv_ramCapacity_29_0= RULE_INT ) ) otherlv_30= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:928:5: otherlv_27= 'RAM capacity' otherlv_28= '=' ( (lv_ramCapacity_29_0= RULE_INT ) ) otherlv_30= ';'
                    {
                    otherlv_27=(Token)match(input,31,FOLLOW_31_in_ruleBoard1861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getBoardAccess().getRAMCapacityKeyword_9_0());
                          
                    }
                    otherlv_28=(Token)match(input,14,FOLLOW_14_in_ruleBoard1873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getBoardAccess().getEqualsSignKeyword_9_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:936:1: ( (lv_ramCapacity_29_0= RULE_INT ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:937:1: (lv_ramCapacity_29_0= RULE_INT )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:937:1: (lv_ramCapacity_29_0= RULE_INT )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:938:3: lv_ramCapacity_29_0= RULE_INT
                    {
                    lv_ramCapacity_29_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBoard1890); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_ramCapacity_29_0, grammarAccess.getBoardAccess().getRamCapacityINTTerminalRuleCall_9_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBoardRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"ramCapacity",
                              		lv_ramCapacity_29_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_30=(Token)match(input,15,FOLLOW_15_in_ruleBoard1907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getBoardAccess().getSemicolonKeyword_9_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:958:3: (otherlv_31= 'ROM capacity' otherlv_32= '=' ( (lv_romCapacity_33_0= RULE_INT ) ) otherlv_34= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:958:5: otherlv_31= 'ROM capacity' otherlv_32= '=' ( (lv_romCapacity_33_0= RULE_INT ) ) otherlv_34= ';'
                    {
                    otherlv_31=(Token)match(input,32,FOLLOW_32_in_ruleBoard1922); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getBoardAccess().getROMCapacityKeyword_10_0());
                          
                    }
                    otherlv_32=(Token)match(input,14,FOLLOW_14_in_ruleBoard1934); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getBoardAccess().getEqualsSignKeyword_10_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:966:1: ( (lv_romCapacity_33_0= RULE_INT ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:967:1: (lv_romCapacity_33_0= RULE_INT )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:967:1: (lv_romCapacity_33_0= RULE_INT )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:968:3: lv_romCapacity_33_0= RULE_INT
                    {
                    lv_romCapacity_33_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBoard1951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_romCapacity_33_0, grammarAccess.getBoardAccess().getRomCapacityINTTerminalRuleCall_10_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBoardRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"romCapacity",
                              		lv_romCapacity_33_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_34=(Token)match(input,15,FOLLOW_15_in_ruleBoard1968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_34, grammarAccess.getBoardAccess().getSemicolonKeyword_10_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:988:3: ( (lv_processors_35_0= ruleProcessor ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==33) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:989:1: (lv_processors_35_0= ruleProcessor )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:989:1: (lv_processors_35_0= ruleProcessor )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:990:3: lv_processors_35_0= ruleProcessor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBoardAccess().getProcessorsProcessorParserRuleCall_11_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProcessor_in_ruleBoard1991);
            	    lv_processors_35_0=ruleProcessor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBoardRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"processors",
            	              		lv_processors_35_0, 
            	              		"Processor");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1006:3: ( (lv_ioAdapters_36_0= ruleIOAdapter ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==37) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1007:1: (lv_ioAdapters_36_0= ruleIOAdapter )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1007:1: (lv_ioAdapters_36_0= ruleIOAdapter )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1008:3: lv_ioAdapters_36_0= ruleIOAdapter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBoardAccess().getIoAdaptersIOAdapterParserRuleCall_12_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIOAdapter_in_ruleBoard2013);
            	    lv_ioAdapters_36_0=ruleIOAdapter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBoardRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ioAdapters",
            	              		lv_ioAdapters_36_0, 
            	              		"IOAdapter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1024:3: (otherlv_37= 'Generic properties' otherlv_38= '{' ( (lv_metricParameters_39_0= ruleMetricParameter ) )* otherlv_40= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1024:5: otherlv_37= 'Generic properties' otherlv_38= '{' ( (lv_metricParameters_39_0= ruleMetricParameter ) )* otherlv_40= '}'
                    {
                    otherlv_37=(Token)match(input,25,FOLLOW_25_in_ruleBoard2027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getBoardAccess().getGenericPropertiesKeyword_13_0());
                          
                    }
                    otherlv_38=(Token)match(input,12,FOLLOW_12_in_ruleBoard2039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_38, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_13_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1032:1: ( (lv_metricParameters_39_0= ruleMetricParameter ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_STRING) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1033:1: (lv_metricParameters_39_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1033:1: (lv_metricParameters_39_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1034:3: lv_metricParameters_39_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBoardAccess().getMetricParametersMetricParameterParserRuleCall_13_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleBoard2060);
                    	    lv_metricParameters_39_0=ruleMetricParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBoardRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"metricParameters",
                    	              		lv_metricParameters_39_0, 
                    	              		"MetricParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_40=(Token)match(input,16,FOLLOW_16_in_ruleBoard2073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_13_3());
                          
                    }

                    }
                    break;

            }

            otherlv_41=(Token)match(input,16,FOLLOW_16_in_ruleBoard2087); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_41, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_14());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleProcessor"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1066:1: entryRuleProcessor returns [EObject current=null] : iv_ruleProcessor= ruleProcessor EOF ;
    public final EObject entryRuleProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessor = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1067:2: (iv_ruleProcessor= ruleProcessor EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1068:2: iv_ruleProcessor= ruleProcessor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcessorRule()); 
            }
            pushFollow(FOLLOW_ruleProcessor_in_entryRuleProcessor2123);
            iv_ruleProcessor=ruleProcessor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcessor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessor2133); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProcessor"


    // $ANTLR start "ruleProcessor"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1075:1: ruleProcessor returns [EObject current=null] : (otherlv_0= 'Processor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )? ( (lv_cores_11_0= ruleCore ) )+ (otherlv_12= 'Generic properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleProcessor() throws RecognitionException {
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
        Token lv_processorType_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_cores_11_0 = null;

        EObject lv_metricParameters_14_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1078:28: ( (otherlv_0= 'Processor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )? ( (lv_cores_11_0= ruleCore ) )+ (otherlv_12= 'Generic properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1079:1: (otherlv_0= 'Processor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )? ( (lv_cores_11_0= ruleCore ) )+ (otherlv_12= 'Generic properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1079:1: (otherlv_0= 'Processor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )? ( (lv_cores_11_0= ruleCore ) )+ (otherlv_12= 'Generic properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1079:3: otherlv_0= 'Processor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )? ( (lv_cores_11_0= ruleCore ) )+ (otherlv_12= 'Generic properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleProcessor2170); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProcessorAccess().getProcessorKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1083:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1084:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1084:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1085:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessor2187); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getProcessorAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProcessorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProcessor2204); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getProcessorAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1105:1: (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==21) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1105:3: otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleProcessor2217); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getProcessorAccess().getManufacturerKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleProcessor2229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getProcessorAccess().getEqualsSignKeyword_3_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1113:1: ( (lv_manufacturer_5_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1114:1: (lv_manufacturer_5_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1114:1: (lv_manufacturer_5_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1115:3: lv_manufacturer_5_0= RULE_STRING
                    {
                    lv_manufacturer_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProcessor2246); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_manufacturer_5_0, grammarAccess.getProcessorAccess().getManufacturerSTRINGTerminalRuleCall_3_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getProcessorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"manufacturer",
                              		lv_manufacturer_5_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleProcessor2263); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getProcessorAccess().getSemicolonKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1135:3: (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1135:5: otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleProcessor2278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getProcessorAccess().getTypeKeyword_4_0());
                          
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleProcessor2290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getProcessorAccess().getEqualsSignKeyword_4_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1143:1: ( (lv_processorType_9_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1144:1: (lv_processorType_9_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1144:1: (lv_processorType_9_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1145:3: lv_processorType_9_0= RULE_STRING
                    {
                    lv_processorType_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProcessor2307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_processorType_9_0, grammarAccess.getProcessorAccess().getProcessorTypeSTRINGTerminalRuleCall_4_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getProcessorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"processorType",
                              		lv_processorType_9_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleProcessor2324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getProcessorAccess().getSemicolonKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1165:3: ( (lv_cores_11_0= ruleCore ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==34) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1166:1: (lv_cores_11_0= ruleCore )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1166:1: (lv_cores_11_0= ruleCore )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1167:3: lv_cores_11_0= ruleCore
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProcessorAccess().getCoresCoreParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCore_in_ruleProcessor2347);
            	    lv_cores_11_0=ruleCore();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProcessorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cores",
            	              		lv_cores_11_0, 
            	              		"Core");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1183:3: (otherlv_12= 'Generic properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==25) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1183:5: otherlv_12= 'Generic properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,25,FOLLOW_25_in_ruleProcessor2361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getProcessorAccess().getGenericPropertiesKeyword_6_0());
                          
                    }
                    otherlv_13=(Token)match(input,12,FOLLOW_12_in_ruleProcessor2373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getProcessorAccess().getLeftCurlyBracketKeyword_6_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1191:1: ( (lv_metricParameters_14_0= ruleMetricParameter ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_STRING) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1192:1: (lv_metricParameters_14_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1192:1: (lv_metricParameters_14_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1193:3: lv_metricParameters_14_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getProcessorAccess().getMetricParametersMetricParameterParserRuleCall_6_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleProcessor2394);
                    	    lv_metricParameters_14_0=ruleMetricParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getProcessorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"metricParameters",
                    	              		lv_metricParameters_14_0, 
                    	              		"MetricParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleProcessor2407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getProcessorAccess().getRightCurlyBracketKeyword_6_3());
                          
                    }

                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleProcessor2421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getProcessorAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleProcessor"


    // $ANTLR start "entryRuleCore"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1225:1: entryRuleCore returns [EObject current=null] : iv_ruleCore= ruleCore EOF ;
    public final EObject entryRuleCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCore = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1226:2: (iv_ruleCore= ruleCore EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1227:2: iv_ruleCore= ruleCore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoreRule()); 
            }
            pushFollow(FOLLOW_ruleCore_in_entryRuleCore2457);
            iv_ruleCore=ruleCore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCore; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCore2467); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCore"


    // $ANTLR start "ruleCore"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1234:1: ruleCore returns [EObject current=null] : (otherlv_0= 'Core' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Generic properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleCore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_capacity_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_architecture_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_metricParameters_13_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1237:28: ( (otherlv_0= 'Core' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Generic properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1238:1: (otherlv_0= 'Core' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Generic properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1238:1: (otherlv_0= 'Core' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Generic properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1238:3: otherlv_0= 'Core' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Generic properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleCore2504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCoreAccess().getCoreKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1242:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1243:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1243:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1244:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCore2521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getCoreAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCoreRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCore2538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCoreAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1264:1: (otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1264:3: otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleCore2551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCoreAccess().getCapacityKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleCore2563); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCoreAccess().getEqualsSignKeyword_3_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1272:1: ( (lv_capacity_5_0= RULE_INT ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1273:1: (lv_capacity_5_0= RULE_INT )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1273:1: (lv_capacity_5_0= RULE_INT )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1274:3: lv_capacity_5_0= RULE_INT
                    {
                    lv_capacity_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCore2580); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_capacity_5_0, grammarAccess.getCoreAccess().getCapacityINTTerminalRuleCall_3_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCoreRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"capacity",
                              		lv_capacity_5_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleCore2597); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCoreAccess().getSemicolonKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1294:3: (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1294:5: otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleCore2612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getCoreAccess().getArchitectureKeyword_4_0());
                          
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleCore2624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getCoreAccess().getEqualsSignKeyword_4_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1302:1: ( (lv_architecture_9_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1303:1: (lv_architecture_9_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1303:1: (lv_architecture_9_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1304:3: lv_architecture_9_0= RULE_STRING
                    {
                    lv_architecture_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCore2641); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_architecture_9_0, grammarAccess.getCoreAccess().getArchitectureSTRINGTerminalRuleCall_4_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCoreRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"architecture",
                              		lv_architecture_9_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleCore2658); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getCoreAccess().getSemicolonKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1324:3: (otherlv_11= 'Generic properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==25) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1324:5: otherlv_11= 'Generic properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleCore2673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getCoreAccess().getGenericPropertiesKeyword_5_0());
                          
                    }
                    otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleCore2685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getCoreAccess().getLeftCurlyBracketKeyword_5_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1332:1: ( (lv_metricParameters_13_0= ruleMetricParameter ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_STRING) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1333:1: (lv_metricParameters_13_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1333:1: (lv_metricParameters_13_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1334:3: lv_metricParameters_13_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCoreAccess().getMetricParametersMetricParameterParserRuleCall_5_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleCore2706);
                    	    lv_metricParameters_13_0=ruleMetricParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCoreRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"metricParameters",
                    	              		lv_metricParameters_13_0, 
                    	              		"MetricParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_16_in_ruleCore2719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getCoreAccess().getRightCurlyBracketKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleCore2733); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getCoreAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCore"


    // $ANTLR start "entryRuleIOAdapter"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1366:1: entryRuleIOAdapter returns [EObject current=null] : iv_ruleIOAdapter= ruleIOAdapter EOF ;
    public final EObject entryRuleIOAdapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIOAdapter = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1367:2: (iv_ruleIOAdapter= ruleIOAdapter EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1368:2: iv_ruleIOAdapter= ruleIOAdapter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIOAdapterRule()); 
            }
            pushFollow(FOLLOW_ruleIOAdapter_in_entryRuleIOAdapter2769);
            iv_ruleIOAdapter=ruleIOAdapter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIOAdapter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIOAdapter2779); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIOAdapter"


    // $ANTLR start "ruleIOAdapter"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1375:1: ruleIOAdapter returns [EObject current=null] : (otherlv_0= 'I/O adapter' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_adapterType_4_0= ruleIOAdapterType ) ) otherlv_5= ';' otherlv_6= 'count' otherlv_7= '=' ( (lv_totalCount_8_0= RULE_INT ) ) otherlv_9= ';' (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )? otherlv_14= '}' ) ;
    public final EObject ruleIOAdapter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_totalCount_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Enumerator lv_adapterType_4_0 = null;

        Enumerator lv_protectionLevel_12_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1378:28: ( (otherlv_0= 'I/O adapter' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_adapterType_4_0= ruleIOAdapterType ) ) otherlv_5= ';' otherlv_6= 'count' otherlv_7= '=' ( (lv_totalCount_8_0= RULE_INT ) ) otherlv_9= ';' (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )? otherlv_14= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1379:1: (otherlv_0= 'I/O adapter' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_adapterType_4_0= ruleIOAdapterType ) ) otherlv_5= ';' otherlv_6= 'count' otherlv_7= '=' ( (lv_totalCount_8_0= RULE_INT ) ) otherlv_9= ';' (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )? otherlv_14= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1379:1: (otherlv_0= 'I/O adapter' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_adapterType_4_0= ruleIOAdapterType ) ) otherlv_5= ';' otherlv_6= 'count' otherlv_7= '=' ( (lv_totalCount_8_0= RULE_INT ) ) otherlv_9= ';' (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )? otherlv_14= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1379:3: otherlv_0= 'I/O adapter' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_adapterType_4_0= ruleIOAdapterType ) ) otherlv_5= ';' otherlv_6= 'count' otherlv_7= '=' ( (lv_totalCount_8_0= RULE_INT ) ) otherlv_9= ';' (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleIOAdapter2816); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIOAdapterAccess().getIOAdapterKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleIOAdapter2828); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIOAdapterAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleIOAdapter2840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIOAdapterAccess().getTypeKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleIOAdapter2852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIOAdapterAccess().getEqualsSignKeyword_3());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1395:1: ( (lv_adapterType_4_0= ruleIOAdapterType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1396:1: (lv_adapterType_4_0= ruleIOAdapterType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1396:1: (lv_adapterType_4_0= ruleIOAdapterType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1397:3: lv_adapterType_4_0= ruleIOAdapterType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIOAdapterAccess().getAdapterTypeIOAdapterTypeEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIOAdapterType_in_ruleIOAdapter2873);
            lv_adapterType_4_0=ruleIOAdapterType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIOAdapterRule());
              	        }
                     		set(
                     			current, 
                     			"adapterType",
                      		lv_adapterType_4_0, 
                      		"IOAdapterType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleIOAdapter2885); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getIOAdapterAccess().getSemicolonKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleIOAdapter2897); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getIOAdapterAccess().getCountKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleIOAdapter2909); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getIOAdapterAccess().getEqualsSignKeyword_7());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1425:1: ( (lv_totalCount_8_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1426:1: (lv_totalCount_8_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1426:1: (lv_totalCount_8_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1427:3: lv_totalCount_8_0= RULE_INT
            {
            lv_totalCount_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIOAdapter2926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_totalCount_8_0, grammarAccess.getIOAdapterAccess().getTotalCountINTTerminalRuleCall_8_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIOAdapterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"totalCount",
                      		lv_totalCount_8_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleIOAdapter2943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getIOAdapterAccess().getSemicolonKeyword_9());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1447:1: (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==40) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1447:3: otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,40,FOLLOW_40_in_ruleIOAdapter2956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getIOAdapterAccess().getProtectionLevelKeyword_10_0());
                          
                    }
                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleIOAdapter2968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getIOAdapterAccess().getEqualsSignKeyword_10_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1455:1: ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1456:1: (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1456:1: (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1457:3: lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIOAdapterAccess().getProtectionLevelIOAdapterProtectionLevelTypeEnumRuleCall_10_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIOAdapterProtectionLevelType_in_ruleIOAdapter2989);
                    lv_protectionLevel_12_0=ruleIOAdapterProtectionLevelType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIOAdapterRule());
                      	        }
                             		set(
                             			current, 
                             			"protectionLevel",
                              		lv_protectionLevel_12_0, 
                              		"IOAdapterProtectionLevelType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleIOAdapter3001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getIOAdapterAccess().getSemicolonKeyword_10_3());
                          
                    }

                    }
                    break;

            }

            otherlv_14=(Token)match(input,16,FOLLOW_16_in_ruleIOAdapter3015); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getIOAdapterAccess().getRightCurlyBracketKeyword_11());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIOAdapter"


    // $ANTLR start "entryRuleNetwork"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1489:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1490:2: (iv_ruleNetwork= ruleNetwork EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1491:2: iv_ruleNetwork= ruleNetwork EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNetworkRule()); 
            }
            pushFollow(FOLLOW_ruleNetwork_in_entryRuleNetwork3051);
            iv_ruleNetwork=ruleNetwork();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNetwork; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNetwork3061); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1498:1: ruleNetwork returns [EObject current=null] : (otherlv_0= 'Network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Bandwidth' otherlv_4= '=' ( (lv_bandwidthCapacity_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'Connects' ( ( ruleQualifiedName ) ) otherlv_9= ',' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ';' (otherlv_14= 'Generic properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_bandwidthCapacity_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_metricParameters_16_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1501:28: ( (otherlv_0= 'Network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Bandwidth' otherlv_4= '=' ( (lv_bandwidthCapacity_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'Connects' ( ( ruleQualifiedName ) ) otherlv_9= ',' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ';' (otherlv_14= 'Generic properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1502:1: (otherlv_0= 'Network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Bandwidth' otherlv_4= '=' ( (lv_bandwidthCapacity_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'Connects' ( ( ruleQualifiedName ) ) otherlv_9= ',' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ';' (otherlv_14= 'Generic properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1502:1: (otherlv_0= 'Network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Bandwidth' otherlv_4= '=' ( (lv_bandwidthCapacity_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'Connects' ( ( ruleQualifiedName ) ) otherlv_9= ',' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ';' (otherlv_14= 'Generic properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1502:3: otherlv_0= 'Network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Bandwidth' otherlv_4= '=' ( (lv_bandwidthCapacity_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'Connects' ( ( ruleQualifiedName ) ) otherlv_9= ',' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ';' (otherlv_14= 'Generic properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleNetwork3098); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNetworkAccess().getNetworkKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1506:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1507:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1507:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1508:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNetwork3115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getNetworkAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNetworkRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleNetwork3132); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleNetwork3144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getNetworkAccess().getBandwidthKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleNetwork3156); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getNetworkAccess().getEqualsSignKeyword_4());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1536:1: ( (lv_bandwidthCapacity_5_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1537:1: (lv_bandwidthCapacity_5_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1537:1: (lv_bandwidthCapacity_5_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1538:3: lv_bandwidthCapacity_5_0= RULE_INT
            {
            lv_bandwidthCapacity_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNetwork3173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_bandwidthCapacity_5_0, grammarAccess.getNetworkAccess().getBandwidthCapacityINTTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNetworkRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"bandwidthCapacity",
                      		lv_bandwidthCapacity_5_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleNetwork3190); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getNetworkAccess().getSemicolonKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,43,FOLLOW_43_in_ruleNetwork3202); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getNetworkAccess().getConnectsKeyword_7());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1562:1: ( ( ruleQualifiedName ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1563:1: ( ruleQualifiedName )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1563:1: ( ruleQualifiedName )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1564:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNetworkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNetworkAccess().getBoardsBoardCrossReference_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNetwork3225);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,44,FOLLOW_44_in_ruleNetwork3237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getNetworkAccess().getCommaKeyword_9());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1581:1: ( ( ruleQualifiedName ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1582:1: ( ruleQualifiedName )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1582:1: ( ruleQualifiedName )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1583:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNetworkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNetworkAccess().getBoardsBoardCrossReference_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNetwork3260);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1596:2: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==44) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1596:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_11=(Token)match(input,44,FOLLOW_44_in_ruleNetwork3273); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getNetworkAccess().getCommaKeyword_11_0());
            	          
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1600:1: ( ( ruleQualifiedName ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1601:1: ( ruleQualifiedName )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1601:1: ( ruleQualifiedName )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1602:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getNetworkRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNetworkAccess().getBoardsBoardCrossReference_11_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleNetwork3296);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleNetwork3310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getNetworkAccess().getSemicolonKeyword_12());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1619:1: (otherlv_14= 'Generic properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==25) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1619:3: otherlv_14= 'Generic properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}'
                    {
                    otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleNetwork3323); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getNetworkAccess().getGenericPropertiesKeyword_13_0());
                          
                    }
                    otherlv_15=(Token)match(input,12,FOLLOW_12_in_ruleNetwork3335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_13_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1627:1: ( (lv_metricParameters_16_0= ruleMetricParameter ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_STRING) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1628:1: (lv_metricParameters_16_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1628:1: (lv_metricParameters_16_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1629:3: lv_metricParameters_16_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNetworkAccess().getMetricParametersMetricParameterParserRuleCall_13_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleNetwork3356);
                    	    lv_metricParameters_16_0=ruleMetricParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNetworkRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"metricParameters",
                    	              		lv_metricParameters_16_0, 
                    	              		"MetricParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_16_in_ruleNetwork3369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_13_3());
                          
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FOLLOW_16_in_ruleNetwork3383); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_14());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleApplicationGroup"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1661:1: entryRuleApplicationGroup returns [EObject current=null] : iv_ruleApplicationGroup= ruleApplicationGroup EOF ;
    public final EObject entryRuleApplicationGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationGroup = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1662:2: (iv_ruleApplicationGroup= ruleApplicationGroup EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1663:2: iv_ruleApplicationGroup= ruleApplicationGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationGroupRule()); 
            }
            pushFollow(FOLLOW_ruleApplicationGroup_in_entryRuleApplicationGroup3419);
            iv_ruleApplicationGroup=ruleApplicationGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplicationGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationGroup3429); if (state.failed) return current;

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
    // $ANTLR end "entryRuleApplicationGroup"


    // $ANTLR start "ruleApplicationGroup"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1670:1: ruleApplicationGroup returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' ) ;
    public final EObject ruleApplicationGroup() throws RecognitionException {
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1673:28: ( (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1674:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1674:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1674:3: otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleApplicationGroup3466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getApplicationGroupAccess().getGroupKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1678:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1679:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1679:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1680:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationGroup3483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getApplicationGroupAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getApplicationGroupRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleApplicationGroup3500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getApplicationGroupAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1700:1: ( (otherlv_3= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1701:1: (otherlv_3= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1701:1: (otherlv_3= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1702:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getApplicationGroupRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationGroup3520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getApplicationGroupAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_3_0()); 
              	
            }

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1713:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==44) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1713:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleApplicationGroup3533); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getApplicationGroupAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1717:1: ( (otherlv_5= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1718:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1718:1: (otherlv_5= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1719:3: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getApplicationGroupRule());
            	      	        }
            	              
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationGroup3553); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_5, grammarAccess.getApplicationGroupAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_4_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleApplicationGroup3567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getApplicationGroupAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleApplicationGroup"


    // $ANTLR start "entryRuleApplication"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1742:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1743:2: (iv_ruleApplication= ruleApplication EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1744:2: iv_ruleApplication= ruleApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationRule()); 
            }
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication3603);
            iv_ruleApplication=ruleApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication3613); if (state.failed) return current;

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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1751:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Required RAM capacity' otherlv_8= '=' ( (lv_ramUtilization_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'Required ROM capacity' otherlv_12= '=' ( (lv_romUtilization_13_0= RULE_INT ) ) otherlv_14= ';' )? (otherlv_15= 'Criticality level' otherlv_16= '=' ( (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Required IO protection' otherlv_20= '=' ( (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType ) ) otherlv_22= ';' )? (otherlv_23= 'Identical parallel threads' otherlv_24= '=' ( (lv_parallelThreads_25_0= RULE_INT ) ) otherlv_26= ';' )? (otherlv_27= 'Developed by' otherlv_28= '=' ( (lv_developedBy_29_0= RULE_STRING ) ) otherlv_30= ';' )? ( (lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement ) )* (otherlv_32= 'Restrict deployment to' otherlv_33= '{' ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* otherlv_37= '}' otherlv_38= ';' )? (otherlv_39= 'Generic properties' otherlv_40= '{' ( (lv_metricParameters_41_0= ruleMetricParameter ) )* otherlv_42= '}' )? otherlv_43= '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_coreUtilization_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_ramUtilization_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_romUtilization_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_parallelThreads_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_developedBy_29_0=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Enumerator lv_criticalityLevel_17_0 = null;

        Enumerator lv_ioAdapterProtectionLevel_21_0 = null;

        EObject lv_ioAdapterRequirements_31_0 = null;

        EObject lv_metricParameters_41_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1754:28: ( (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Required RAM capacity' otherlv_8= '=' ( (lv_ramUtilization_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'Required ROM capacity' otherlv_12= '=' ( (lv_romUtilization_13_0= RULE_INT ) ) otherlv_14= ';' )? (otherlv_15= 'Criticality level' otherlv_16= '=' ( (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Required IO protection' otherlv_20= '=' ( (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType ) ) otherlv_22= ';' )? (otherlv_23= 'Identical parallel threads' otherlv_24= '=' ( (lv_parallelThreads_25_0= RULE_INT ) ) otherlv_26= ';' )? (otherlv_27= 'Developed by' otherlv_28= '=' ( (lv_developedBy_29_0= RULE_STRING ) ) otherlv_30= ';' )? ( (lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement ) )* (otherlv_32= 'Restrict deployment to' otherlv_33= '{' ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* otherlv_37= '}' otherlv_38= ';' )? (otherlv_39= 'Generic properties' otherlv_40= '{' ( (lv_metricParameters_41_0= ruleMetricParameter ) )* otherlv_42= '}' )? otherlv_43= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1755:1: (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Required RAM capacity' otherlv_8= '=' ( (lv_ramUtilization_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'Required ROM capacity' otherlv_12= '=' ( (lv_romUtilization_13_0= RULE_INT ) ) otherlv_14= ';' )? (otherlv_15= 'Criticality level' otherlv_16= '=' ( (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Required IO protection' otherlv_20= '=' ( (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType ) ) otherlv_22= ';' )? (otherlv_23= 'Identical parallel threads' otherlv_24= '=' ( (lv_parallelThreads_25_0= RULE_INT ) ) otherlv_26= ';' )? (otherlv_27= 'Developed by' otherlv_28= '=' ( (lv_developedBy_29_0= RULE_STRING ) ) otherlv_30= ';' )? ( (lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement ) )* (otherlv_32= 'Restrict deployment to' otherlv_33= '{' ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* otherlv_37= '}' otherlv_38= ';' )? (otherlv_39= 'Generic properties' otherlv_40= '{' ( (lv_metricParameters_41_0= ruleMetricParameter ) )* otherlv_42= '}' )? otherlv_43= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1755:1: (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Required RAM capacity' otherlv_8= '=' ( (lv_ramUtilization_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'Required ROM capacity' otherlv_12= '=' ( (lv_romUtilization_13_0= RULE_INT ) ) otherlv_14= ';' )? (otherlv_15= 'Criticality level' otherlv_16= '=' ( (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Required IO protection' otherlv_20= '=' ( (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType ) ) otherlv_22= ';' )? (otherlv_23= 'Identical parallel threads' otherlv_24= '=' ( (lv_parallelThreads_25_0= RULE_INT ) ) otherlv_26= ';' )? (otherlv_27= 'Developed by' otherlv_28= '=' ( (lv_developedBy_29_0= RULE_STRING ) ) otherlv_30= ';' )? ( (lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement ) )* (otherlv_32= 'Restrict deployment to' otherlv_33= '{' ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* otherlv_37= '}' otherlv_38= ';' )? (otherlv_39= 'Generic properties' otherlv_40= '{' ( (lv_metricParameters_41_0= ruleMetricParameter ) )* otherlv_42= '}' )? otherlv_43= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1755:3: otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Required RAM capacity' otherlv_8= '=' ( (lv_ramUtilization_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'Required ROM capacity' otherlv_12= '=' ( (lv_romUtilization_13_0= RULE_INT ) ) otherlv_14= ';' )? (otherlv_15= 'Criticality level' otherlv_16= '=' ( (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Required IO protection' otherlv_20= '=' ( (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType ) ) otherlv_22= ';' )? (otherlv_23= 'Identical parallel threads' otherlv_24= '=' ( (lv_parallelThreads_25_0= RULE_INT ) ) otherlv_26= ';' )? (otherlv_27= 'Developed by' otherlv_28= '=' ( (lv_developedBy_29_0= RULE_STRING ) ) otherlv_30= ';' )? ( (lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement ) )* (otherlv_32= 'Restrict deployment to' otherlv_33= '{' ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* otherlv_37= '}' otherlv_38= ';' )? (otherlv_39= 'Generic properties' otherlv_40= '{' ( (lv_metricParameters_41_0= ruleMetricParameter ) )* otherlv_42= '}' )? otherlv_43= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleApplication3650); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1759:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1760:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1760:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1761:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplication3667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getApplicationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleApplication3684); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1781:1: (otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==47) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1781:3: otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleApplication3697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getApplicationAccess().getCoreUtilizationKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleApplication3709); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getEqualsSignKeyword_3_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1789:1: ( (lv_coreUtilization_5_0= RULE_INT ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1790:1: (lv_coreUtilization_5_0= RULE_INT )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1790:1: (lv_coreUtilization_5_0= RULE_INT )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1791:3: lv_coreUtilization_5_0= RULE_INT
                    {
                    lv_coreUtilization_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplication3726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_coreUtilization_5_0, grammarAccess.getApplicationAccess().getCoreUtilizationINTTerminalRuleCall_3_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getApplicationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"coreUtilization",
                              		lv_coreUtilization_5_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleApplication3743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getSemicolonKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1811:3: (otherlv_7= 'Required RAM capacity' otherlv_8= '=' ( (lv_ramUtilization_9_0= RULE_INT ) ) otherlv_10= ';' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==48) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1811:5: otherlv_7= 'Required RAM capacity' otherlv_8= '=' ( (lv_ramUtilization_9_0= RULE_INT ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleApplication3758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getApplicationAccess().getRequiredRAMCapacityKeyword_4_0());
                          
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleApplication3770); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getApplicationAccess().getEqualsSignKeyword_4_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1819:1: ( (lv_ramUtilization_9_0= RULE_INT ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1820:1: (lv_ramUtilization_9_0= RULE_INT )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1820:1: (lv_ramUtilization_9_0= RULE_INT )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1821:3: lv_ramUtilization_9_0= RULE_INT
                    {
                    lv_ramUtilization_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplication3787); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_ramUtilization_9_0, grammarAccess.getApplicationAccess().getRamUtilizationINTTerminalRuleCall_4_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getApplicationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"ramUtilization",
                              		lv_ramUtilization_9_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleApplication3804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getApplicationAccess().getSemicolonKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1841:3: (otherlv_11= 'Required ROM capacity' otherlv_12= '=' ( (lv_romUtilization_13_0= RULE_INT ) ) otherlv_14= ';' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==49) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1841:5: otherlv_11= 'Required ROM capacity' otherlv_12= '=' ( (lv_romUtilization_13_0= RULE_INT ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,49,FOLLOW_49_in_ruleApplication3819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getApplicationAccess().getRequiredROMCapacityKeyword_5_0());
                          
                    }
                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleApplication3831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getApplicationAccess().getEqualsSignKeyword_5_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1849:1: ( (lv_romUtilization_13_0= RULE_INT ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1850:1: (lv_romUtilization_13_0= RULE_INT )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1850:1: (lv_romUtilization_13_0= RULE_INT )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1851:3: lv_romUtilization_13_0= RULE_INT
                    {
                    lv_romUtilization_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplication3848); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_romUtilization_13_0, grammarAccess.getApplicationAccess().getRomUtilizationINTTerminalRuleCall_5_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getApplicationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"romUtilization",
                              		lv_romUtilization_13_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleApplication3865); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getApplicationAccess().getSemicolonKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1871:3: (otherlv_15= 'Criticality level' otherlv_16= '=' ( (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==50) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1871:5: otherlv_15= 'Criticality level' otherlv_16= '=' ( (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,50,FOLLOW_50_in_ruleApplication3880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getApplicationAccess().getCriticalityLevelKeyword_6_0());
                          
                    }
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleApplication3892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getApplicationAccess().getEqualsSignKeyword_6_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1879:1: ( (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1880:1: (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1880:1: (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1881:3: lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getApplicationAccess().getCriticalityLevelDesignAssuranceLevelTypeEnumRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDesignAssuranceLevelType_in_ruleApplication3913);
                    lv_criticalityLevel_17_0=ruleDesignAssuranceLevelType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getApplicationRule());
                      	        }
                             		set(
                             			current, 
                             			"criticalityLevel",
                              		lv_criticalityLevel_17_0, 
                              		"DesignAssuranceLevelType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleApplication3925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getApplicationAccess().getSemicolonKeyword_6_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1901:3: (otherlv_19= 'Required IO protection' otherlv_20= '=' ( (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType ) ) otherlv_22= ';' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==51) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1901:5: otherlv_19= 'Required IO protection' otherlv_20= '=' ( (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType ) ) otherlv_22= ';'
                    {
                    otherlv_19=(Token)match(input,51,FOLLOW_51_in_ruleApplication3940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getApplicationAccess().getRequiredIOProtectionKeyword_7_0());
                          
                    }
                    otherlv_20=(Token)match(input,14,FOLLOW_14_in_ruleApplication3952); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getApplicationAccess().getEqualsSignKeyword_7_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1909:1: ( (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1910:1: (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1910:1: (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1911:3: lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getApplicationAccess().getIoAdapterProtectionLevelIOAdapterProtectionLevelTypeEnumRuleCall_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIOAdapterProtectionLevelType_in_ruleApplication3973);
                    lv_ioAdapterProtectionLevel_21_0=ruleIOAdapterProtectionLevelType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getApplicationRule());
                      	        }
                             		set(
                             			current, 
                             			"ioAdapterProtectionLevel",
                              		lv_ioAdapterProtectionLevel_21_0, 
                              		"IOAdapterProtectionLevelType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,15,FOLLOW_15_in_ruleApplication3985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getApplicationAccess().getSemicolonKeyword_7_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1931:3: (otherlv_23= 'Identical parallel threads' otherlv_24= '=' ( (lv_parallelThreads_25_0= RULE_INT ) ) otherlv_26= ';' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==52) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1931:5: otherlv_23= 'Identical parallel threads' otherlv_24= '=' ( (lv_parallelThreads_25_0= RULE_INT ) ) otherlv_26= ';'
                    {
                    otherlv_23=(Token)match(input,52,FOLLOW_52_in_ruleApplication4000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getApplicationAccess().getIdenticalParallelThreadsKeyword_8_0());
                          
                    }
                    otherlv_24=(Token)match(input,14,FOLLOW_14_in_ruleApplication4012); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getApplicationAccess().getEqualsSignKeyword_8_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1939:1: ( (lv_parallelThreads_25_0= RULE_INT ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1940:1: (lv_parallelThreads_25_0= RULE_INT )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1940:1: (lv_parallelThreads_25_0= RULE_INT )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1941:3: lv_parallelThreads_25_0= RULE_INT
                    {
                    lv_parallelThreads_25_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplication4029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_parallelThreads_25_0, grammarAccess.getApplicationAccess().getParallelThreadsINTTerminalRuleCall_8_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getApplicationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"parallelThreads",
                              		lv_parallelThreads_25_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_26=(Token)match(input,15,FOLLOW_15_in_ruleApplication4046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getApplicationAccess().getSemicolonKeyword_8_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1961:3: (otherlv_27= 'Developed by' otherlv_28= '=' ( (lv_developedBy_29_0= RULE_STRING ) ) otherlv_30= ';' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==53) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1961:5: otherlv_27= 'Developed by' otherlv_28= '=' ( (lv_developedBy_29_0= RULE_STRING ) ) otherlv_30= ';'
                    {
                    otherlv_27=(Token)match(input,53,FOLLOW_53_in_ruleApplication4061); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getApplicationAccess().getDevelopedByKeyword_9_0());
                          
                    }
                    otherlv_28=(Token)match(input,14,FOLLOW_14_in_ruleApplication4073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getApplicationAccess().getEqualsSignKeyword_9_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1969:1: ( (lv_developedBy_29_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1970:1: (lv_developedBy_29_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1970:1: (lv_developedBy_29_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1971:3: lv_developedBy_29_0= RULE_STRING
                    {
                    lv_developedBy_29_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplication4090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_developedBy_29_0, grammarAccess.getApplicationAccess().getDevelopedBySTRINGTerminalRuleCall_9_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getApplicationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"developedBy",
                              		lv_developedBy_29_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    otherlv_30=(Token)match(input,15,FOLLOW_15_in_ruleApplication4107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getApplicationAccess().getSemicolonKeyword_9_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1991:3: ( (lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==55) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1992:1: (lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1992:1: (lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1993:3: lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getApplicationAccess().getIoAdapterRequirementsIOAdapterRequirementParserRuleCall_10_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIOAdapterRequirement_in_ruleApplication4130);
            	    lv_ioAdapterRequirements_31_0=ruleIOAdapterRequirement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getApplicationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ioAdapterRequirements",
            	              		lv_ioAdapterRequirements_31_0, 
            	              		"IOAdapterRequirement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2009:3: (otherlv_32= 'Restrict deployment to' otherlv_33= '{' ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* otherlv_37= '}' otherlv_38= ';' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==54) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2009:5: otherlv_32= 'Restrict deployment to' otherlv_33= '{' ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* otherlv_37= '}' otherlv_38= ';'
                    {
                    otherlv_32=(Token)match(input,54,FOLLOW_54_in_ruleApplication4144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getApplicationAccess().getRestrictDeploymentToKeyword_11_0());
                          
                    }
                    otherlv_33=(Token)match(input,12,FOLLOW_12_in_ruleApplication4156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_33, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_11_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2017:1: ( ( ruleQualifiedName ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2018:1: ( ruleQualifiedName )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2018:1: ( ruleQualifiedName )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2019:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getApplicationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getApplicationAccess().getRestrictMappingToHardwareElementsHardwareElementCrossReference_11_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleApplication4179);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2032:2: (otherlv_35= ',' ( ( ruleQualifiedName ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==44) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2032:4: otherlv_35= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_35=(Token)match(input,44,FOLLOW_44_in_ruleApplication4192); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_35, grammarAccess.getApplicationAccess().getCommaKeyword_11_3_0());
                    	          
                    	    }
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2036:1: ( ( ruleQualifiedName ) )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2037:1: ( ruleQualifiedName )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2037:1: ( ruleQualifiedName )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2038:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getApplicationRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getApplicationAccess().getRestrictMappingToHardwareElementsHardwareElementCrossReference_11_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleApplication4215);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,16,FOLLOW_16_in_ruleApplication4229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_11_4());
                          
                    }
                    otherlv_38=(Token)match(input,15,FOLLOW_15_in_ruleApplication4241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_38, grammarAccess.getApplicationAccess().getSemicolonKeyword_11_5());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2059:3: (otherlv_39= 'Generic properties' otherlv_40= '{' ( (lv_metricParameters_41_0= ruleMetricParameter ) )* otherlv_42= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==25) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2059:5: otherlv_39= 'Generic properties' otherlv_40= '{' ( (lv_metricParameters_41_0= ruleMetricParameter ) )* otherlv_42= '}'
                    {
                    otherlv_39=(Token)match(input,25,FOLLOW_25_in_ruleApplication4256); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_39, grammarAccess.getApplicationAccess().getGenericPropertiesKeyword_12_0());
                          
                    }
                    otherlv_40=(Token)match(input,12,FOLLOW_12_in_ruleApplication4268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_12_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2067:1: ( (lv_metricParameters_41_0= ruleMetricParameter ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==RULE_STRING) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2068:1: (lv_metricParameters_41_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2068:1: (lv_metricParameters_41_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2069:3: lv_metricParameters_41_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getApplicationAccess().getMetricParametersMetricParameterParserRuleCall_12_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleApplication4289);
                    	    lv_metricParameters_41_0=ruleMetricParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getApplicationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"metricParameters",
                    	              		lv_metricParameters_41_0, 
                    	              		"MetricParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_42=(Token)match(input,16,FOLLOW_16_in_ruleApplication4302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_12_3());
                          
                    }

                    }
                    break;

            }

            otherlv_43=(Token)match(input,16,FOLLOW_16_in_ruleApplication4316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_43, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_13());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleIOAdapterRequirement"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2101:1: entryRuleIOAdapterRequirement returns [EObject current=null] : iv_ruleIOAdapterRequirement= ruleIOAdapterRequirement EOF ;
    public final EObject entryRuleIOAdapterRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIOAdapterRequirement = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2102:2: (iv_ruleIOAdapterRequirement= ruleIOAdapterRequirement EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2103:2: iv_ruleIOAdapterRequirement= ruleIOAdapterRequirement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIOAdapterRequirementRule()); 
            }
            pushFollow(FOLLOW_ruleIOAdapterRequirement_in_entryRuleIOAdapterRequirement4352);
            iv_ruleIOAdapterRequirement=ruleIOAdapterRequirement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIOAdapterRequirement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIOAdapterRequirement4362); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIOAdapterRequirement"


    // $ANTLR start "ruleIOAdapterRequirement"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2110:1: ruleIOAdapterRequirement returns [EObject current=null] : (otherlv_0= 'Requires' ( (lv_requiredAdapterCount_1_0= RULE_INT ) ) ( (lv_adapterType_2_0= ruleIOAdapterType ) ) otherlv_3= 'adapter' ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) ) otherlv_6= ';' ) ;
    public final EObject ruleIOAdapterRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_requiredAdapterCount_1_0=null;
        Token otherlv_3=null;
        Token lv_isExclusiveOnly_4_0=null;
        Token lv_isSharedAllowed_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_adapterType_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2113:28: ( (otherlv_0= 'Requires' ( (lv_requiredAdapterCount_1_0= RULE_INT ) ) ( (lv_adapterType_2_0= ruleIOAdapterType ) ) otherlv_3= 'adapter' ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) ) otherlv_6= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2114:1: (otherlv_0= 'Requires' ( (lv_requiredAdapterCount_1_0= RULE_INT ) ) ( (lv_adapterType_2_0= ruleIOAdapterType ) ) otherlv_3= 'adapter' ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) ) otherlv_6= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2114:1: (otherlv_0= 'Requires' ( (lv_requiredAdapterCount_1_0= RULE_INT ) ) ( (lv_adapterType_2_0= ruleIOAdapterType ) ) otherlv_3= 'adapter' ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) ) otherlv_6= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2114:3: otherlv_0= 'Requires' ( (lv_requiredAdapterCount_1_0= RULE_INT ) ) ( (lv_adapterType_2_0= ruleIOAdapterType ) ) otherlv_3= 'adapter' ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleIOAdapterRequirement4399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIOAdapterRequirementAccess().getRequiresKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2118:1: ( (lv_requiredAdapterCount_1_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2119:1: (lv_requiredAdapterCount_1_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2119:1: (lv_requiredAdapterCount_1_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2120:3: lv_requiredAdapterCount_1_0= RULE_INT
            {
            lv_requiredAdapterCount_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIOAdapterRequirement4416); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_requiredAdapterCount_1_0, grammarAccess.getIOAdapterRequirementAccess().getRequiredAdapterCountINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIOAdapterRequirementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"requiredAdapterCount",
                      		lv_requiredAdapterCount_1_0, 
                      		"INT");
              	    
            }

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2136:2: ( (lv_adapterType_2_0= ruleIOAdapterType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2137:1: (lv_adapterType_2_0= ruleIOAdapterType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2137:1: (lv_adapterType_2_0= ruleIOAdapterType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2138:3: lv_adapterType_2_0= ruleIOAdapterType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIOAdapterRequirementAccess().getAdapterTypeIOAdapterTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIOAdapterType_in_ruleIOAdapterRequirement4442);
            lv_adapterType_2_0=ruleIOAdapterType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIOAdapterRequirementRule());
              	        }
                     		set(
                     			current, 
                     			"adapterType",
                      		lv_adapterType_2_0, 
                      		"IOAdapterType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleIOAdapterRequirement4454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIOAdapterRequirementAccess().getAdapterKeyword_3());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2158:1: ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==57) ) {
                alt60=1;
            }
            else if ( (LA60_0==58) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2158:2: ( (lv_isExclusiveOnly_4_0= 'exclusive' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2158:2: ( (lv_isExclusiveOnly_4_0= 'exclusive' ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2159:1: (lv_isExclusiveOnly_4_0= 'exclusive' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2159:1: (lv_isExclusiveOnly_4_0= 'exclusive' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2160:3: lv_isExclusiveOnly_4_0= 'exclusive'
                    {
                    lv_isExclusiveOnly_4_0=(Token)match(input,57,FOLLOW_57_in_ruleIOAdapterRequirement4473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isExclusiveOnly_4_0, grammarAccess.getIOAdapterRequirementAccess().getIsExclusiveOnlyExclusiveKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIOAdapterRequirementRule());
                      	        }
                             		setWithLastConsumed(current, "isExclusiveOnly", true, "exclusive");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2174:6: ( (lv_isSharedAllowed_5_0= 'shared' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2174:6: ( (lv_isSharedAllowed_5_0= 'shared' ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2175:1: (lv_isSharedAllowed_5_0= 'shared' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2175:1: (lv_isSharedAllowed_5_0= 'shared' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2176:3: lv_isSharedAllowed_5_0= 'shared'
                    {
                    lv_isSharedAllowed_5_0=(Token)match(input,58,FOLLOW_58_in_ruleIOAdapterRequirement4510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isSharedAllowed_5_0, grammarAccess.getIOAdapterRequirementAccess().getIsSharedAllowedSharedKeyword_4_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIOAdapterRequirementRule());
                      	        }
                             		setWithLastConsumed(current, "isSharedAllowed", true, "shared");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleIOAdapterRequirement4536); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getIOAdapterRequirementAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIOAdapterRequirement"


    // $ANTLR start "entryRuleDislocalityRelation"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2201:1: entryRuleDislocalityRelation returns [EObject current=null] : iv_ruleDislocalityRelation= ruleDislocalityRelation EOF ;
    public final EObject entryRuleDislocalityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDislocalityRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2202:2: (iv_ruleDislocalityRelation= ruleDislocalityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2203:2: iv_ruleDislocalityRelation= ruleDislocalityRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDislocalityRelationRule()); 
            }
            pushFollow(FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation4572);
            iv_ruleDislocalityRelation=ruleDislocalityRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDislocalityRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDislocalityRelation4582); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2210:1: ruleDislocalityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2213:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2214:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2214:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2214:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2214:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2215:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2215:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2216:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDislocalityRelationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDislocalityRelation4627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getDislocalityRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_0_0()); 
              	
            }

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2227:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==44) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2227:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleDislocalityRelation4640); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDislocalityRelationAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2231:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2232:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2232:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2233:3: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getDislocalityRelationRule());
            	      	        }
            	              
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDislocalityRelation4660); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_2, grammarAccess.getDislocalityRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_1_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleDislocalityRelation4674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDislocalityRelationAccess().getDislocalUpToKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2248:1: ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2249:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2249:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2250:3: lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDislocalityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleHardwareArchitectureLevelType_in_ruleDislocalityRelation4695);
            lv_hardwareLevel_4_0=ruleHardwareArchitectureLevelType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDislocalityRelation4707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDislocalityRelationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDislocalityRelation"


    // $ANTLR start "entryRuleProximityRelation"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2278:1: entryRuleProximityRelation returns [EObject current=null] : iv_ruleProximityRelation= ruleProximityRelation EOF ;
    public final EObject entryRuleProximityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProximityRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2279:2: (iv_ruleProximityRelation= ruleProximityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2280:2: iv_ruleProximityRelation= ruleProximityRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProximityRelationRule()); 
            }
            pushFollow(FOLLOW_ruleProximityRelation_in_entryRuleProximityRelation4743);
            iv_ruleProximityRelation=ruleProximityRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProximityRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProximityRelation4753); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProximityRelation"


    // $ANTLR start "ruleProximityRelation"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2287:1: ruleProximityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) ;
    public final EObject ruleProximityRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_hardwareLevel_4_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2290:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2291:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2291:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2291:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2291:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2292:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2292:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2293:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getProximityRelationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProximityRelation4798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getProximityRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_0_0()); 
              	
            }

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2304:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==44) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2304:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleProximityRelation4811); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getProximityRelationAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2308:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2309:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2309:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2310:3: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getProximityRelationRule());
            	      	        }
            	              
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProximityRelation4831); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_2, grammarAccess.getProximityRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_1_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleProximityRelation4845); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getProximityRelationAccess().getOnSameKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2325:1: ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2326:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2326:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2327:3: lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProximityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleHardwareArchitectureLevelType_in_ruleProximityRelation4866);
            lv_hardwareLevel_4_0=ruleHardwareArchitectureLevelType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProximityRelationRule());
              	        }
                     		set(
                     			current, 
                     			"hardwareLevel",
                      		lv_hardwareLevel_4_0, 
                      		"HardwareArchitectureLevelType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleProximityRelation4878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getProximityRelationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleProximityRelation"


    // $ANTLR start "entryRuleCommunicationRelation"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2355:1: entryRuleCommunicationRelation returns [EObject current=null] : iv_ruleCommunicationRelation= ruleCommunicationRelation EOF ;
    public final EObject entryRuleCommunicationRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2356:2: (iv_ruleCommunicationRelation= ruleCommunicationRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2357:2: iv_ruleCommunicationRelation= ruleCommunicationRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommunicationRelationRule()); 
            }
            pushFollow(FOLLOW_ruleCommunicationRelation_in_entryRuleCommunicationRelation4914);
            iv_ruleCommunicationRelation=ruleCommunicationRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommunicationRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommunicationRelation4924); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCommunicationRelation"


    // $ANTLR start "ruleCommunicationRelation"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2364:1: ruleCommunicationRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'require' ( (lv_bandwidthUtilization_4_0= RULE_INT ) ) otherlv_5= 'bandwidth' otherlv_6= ';' ) ;
    public final EObject ruleCommunicationRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_bandwidthUtilization_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2367:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'require' ( (lv_bandwidthUtilization_4_0= RULE_INT ) ) otherlv_5= 'bandwidth' otherlv_6= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2368:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'require' ( (lv_bandwidthUtilization_4_0= RULE_INT ) ) otherlv_5= 'bandwidth' otherlv_6= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2368:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'require' ( (lv_bandwidthUtilization_4_0= RULE_INT ) ) otherlv_5= 'bandwidth' otherlv_6= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2368:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'require' ( (lv_bandwidthUtilization_4_0= RULE_INT ) ) otherlv_5= 'bandwidth' otherlv_6= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2368:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2369:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2369:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2370:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCommunicationRelationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommunicationRelation4969); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getCommunicationRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_0_0()); 
              	
            }

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2381:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==44) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2381:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleCommunicationRelation4982); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getCommunicationRelationAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2385:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2386:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2386:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2387:3: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getCommunicationRelationRule());
            	      	        }
            	              
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommunicationRelation5002); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_2, grammarAccess.getCommunicationRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_1_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_3=(Token)match(input,61,FOLLOW_61_in_ruleCommunicationRelation5016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCommunicationRelationAccess().getRequireKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2402:1: ( (lv_bandwidthUtilization_4_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2403:1: (lv_bandwidthUtilization_4_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2403:1: (lv_bandwidthUtilization_4_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2404:3: lv_bandwidthUtilization_4_0= RULE_INT
            {
            lv_bandwidthUtilization_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCommunicationRelation5033); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_bandwidthUtilization_4_0, grammarAccess.getCommunicationRelationAccess().getBandwidthUtilizationINTTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCommunicationRelationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"bandwidthUtilization",
                      		lv_bandwidthUtilization_4_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,62,FOLLOW_62_in_ruleCommunicationRelation5050); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCommunicationRelationAccess().getBandwidthKeyword_4());
                  
            }
            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleCommunicationRelation5062); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCommunicationRelationAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCommunicationRelation"


    // $ANTLR start "entryRuleDissimilarityRelation"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2436:1: entryRuleDissimilarityRelation returns [EObject current=null] : iv_ruleDissimilarityRelation= ruleDissimilarityRelation EOF ;
    public final EObject entryRuleDissimilarityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDissimilarityRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2437:2: (iv_ruleDissimilarityRelation= ruleDissimilarityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2438:2: iv_ruleDissimilarityRelation= ruleDissimilarityRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDissimilarityRelationRule()); 
            }
            pushFollow(FOLLOW_ruleDissimilarityRelation_in_entryRuleDissimilarityRelation5098);
            iv_ruleDissimilarityRelation=ruleDissimilarityRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDissimilarityRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDissimilarityRelation5108); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDissimilarityRelation"


    // $ANTLR start "ruleDissimilarityRelation"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2445:1: ruleDissimilarityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= 'dissimilar based on' ( (lv_dissimilarityClause_4_0= ruleDissimilarityClause ) ) otherlv_5= ';' ) ;
    public final EObject ruleDissimilarityRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dissimilarityClause_4_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2448:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= 'dissimilar based on' ( (lv_dissimilarityClause_4_0= ruleDissimilarityClause ) ) otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2449:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= 'dissimilar based on' ( (lv_dissimilarityClause_4_0= ruleDissimilarityClause ) ) otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2449:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= 'dissimilar based on' ( (lv_dissimilarityClause_4_0= ruleDissimilarityClause ) ) otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2449:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= 'dissimilar based on' ( (lv_dissimilarityClause_4_0= ruleDissimilarityClause ) ) otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2449:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2450:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2450:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2451:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDissimilarityRelationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDissimilarityRelation5153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getDissimilarityRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_0_0()); 
              	
            }

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2462:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==44) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2462:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleDissimilarityRelation5166); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDissimilarityRelationAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2466:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2467:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2467:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2468:3: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getDissimilarityRelationRule());
            	      	        }
            	              
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDissimilarityRelation5186); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_2, grammarAccess.getDissimilarityRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_1_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
            } while (true);

            otherlv_3=(Token)match(input,63,FOLLOW_63_in_ruleDissimilarityRelation5200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDissimilarityRelationAccess().getDissimilarBasedOnKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2483:1: ( (lv_dissimilarityClause_4_0= ruleDissimilarityClause ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2484:1: (lv_dissimilarityClause_4_0= ruleDissimilarityClause )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2484:1: (lv_dissimilarityClause_4_0= ruleDissimilarityClause )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2485:3: lv_dissimilarityClause_4_0= ruleDissimilarityClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDissimilarityRelationAccess().getDissimilarityClauseDissimilarityClauseParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityRelation5221);
            lv_dissimilarityClause_4_0=ruleDissimilarityClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDissimilarityRelationRule());
              	        }
                     		set(
                     			current, 
                     			"dissimilarityClause",
                      		lv_dissimilarityClause_4_0, 
                      		"DissimilarityClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDissimilarityRelation5233); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDissimilarityRelationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDissimilarityRelation"


    // $ANTLR start "entryRuleDissimilarityClause"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2513:1: entryRuleDissimilarityClause returns [EObject current=null] : iv_ruleDissimilarityClause= ruleDissimilarityClause EOF ;
    public final EObject entryRuleDissimilarityClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDissimilarityClause = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2514:2: (iv_ruleDissimilarityClause= ruleDissimilarityClause EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2515:2: iv_ruleDissimilarityClause= ruleDissimilarityClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDissimilarityClauseRule()); 
            }
            pushFollow(FOLLOW_ruleDissimilarityClause_in_entryRuleDissimilarityClause5269);
            iv_ruleDissimilarityClause=ruleDissimilarityClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDissimilarityClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDissimilarityClause5279); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDissimilarityClause"


    // $ANTLR start "ruleDissimilarityClause"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2522:1: ruleDissimilarityClause returns [EObject current=null] : (this_DissimilarityEntry_0= ruleDissimilarityEntry | (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' ) ) ;
    public final EObject ruleDissimilarityClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_DissimilarityEntry_0 = null;

        EObject this_DissimilarityDisjunction_2 = null;

        EObject this_DissimilarityConjunction_3 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2525:28: ( (this_DissimilarityEntry_0= ruleDissimilarityEntry | (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2526:1: (this_DissimilarityEntry_0= ruleDissimilarityEntry | (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2526:1: (this_DissimilarityEntry_0= ruleDissimilarityEntry | (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=68 && LA66_0<=71)) ) {
                alt66=1;
            }
            else if ( (LA66_0==64) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2527:5: this_DissimilarityEntry_0= ruleDissimilarityEntry
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDissimilarityClauseAccess().getDissimilarityEntryParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDissimilarityEntry_in_ruleDissimilarityClause5326);
                    this_DissimilarityEntry_0=ruleDissimilarityEntry();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DissimilarityEntry_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2536:6: (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2536:6: (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2536:8: otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleDissimilarityClause5344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDissimilarityClauseAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2540:1: ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction )
                    int alt65=2;
                    switch ( input.LA(1) ) {
                    case 68:
                        {
                        int LA65_1 = input.LA(2);

                        if ( (synpred1_InternalMappingDSL()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 69:
                        {
                        int LA65_2 = input.LA(2);

                        if ( (synpred1_InternalMappingDSL()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 70:
                        {
                        int LA65_3 = input.LA(2);

                        if ( (synpred1_InternalMappingDSL()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 71:
                        {
                        int LA65_4 = input.LA(2);

                        if ( (synpred1_InternalMappingDSL()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                        {
                        int LA65_5 = input.LA(2);

                        if ( (synpred1_InternalMappingDSL()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }

                    switch (alt65) {
                        case 1 :
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2540:2: ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction )
                            {
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2540:2: ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction )
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2540:3: ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getDissimilarityClauseAccess().getDissimilarityDisjunctionParserRuleCall_1_1_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleDissimilarityDisjunction_in_ruleDissimilarityClause5373);
                            this_DissimilarityDisjunction_2=ruleDissimilarityDisjunction();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_DissimilarityDisjunction_2; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2551:5: this_DissimilarityConjunction_3= ruleDissimilarityConjunction
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getDissimilarityClauseAccess().getDissimilarityConjunctionParserRuleCall_1_1_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleDissimilarityConjunction_in_ruleDissimilarityClause5401);
                            this_DissimilarityConjunction_3=ruleDissimilarityConjunction();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_DissimilarityConjunction_3; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,65,FOLLOW_65_in_ruleDissimilarityClause5413); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDissimilarityClauseAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDissimilarityClause"


    // $ANTLR start "entryRuleDissimilarityDisjunction"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2571:1: entryRuleDissimilarityDisjunction returns [EObject current=null] : iv_ruleDissimilarityDisjunction= ruleDissimilarityDisjunction EOF ;
    public final EObject entryRuleDissimilarityDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDissimilarityDisjunction = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2572:2: (iv_ruleDissimilarityDisjunction= ruleDissimilarityDisjunction EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2573:2: iv_ruleDissimilarityDisjunction= ruleDissimilarityDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDissimilarityDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDissimilarityDisjunction_in_entryRuleDissimilarityDisjunction5450);
            iv_ruleDissimilarityDisjunction=ruleDissimilarityDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDissimilarityDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDissimilarityDisjunction5460); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDissimilarityDisjunction"


    // $ANTLR start "ruleDissimilarityDisjunction"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2580:1: ruleDissimilarityDisjunction returns [EObject current=null] : ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ ) ;
    public final EObject ruleDissimilarityDisjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_dissimilarityClauses_0_0 = null;

        EObject lv_dissimilarityClauses_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2583:28: ( ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2584:1: ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2584:1: ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2584:2: ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2584:2: ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2585:1: (lv_dissimilarityClauses_0_0= ruleDissimilarityClause )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2585:1: (lv_dissimilarityClauses_0_0= ruleDissimilarityClause )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2586:3: lv_dissimilarityClauses_0_0= ruleDissimilarityClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDissimilarityDisjunctionAccess().getDissimilarityClausesDissimilarityClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityDisjunction5506);
            lv_dissimilarityClauses_0_0=ruleDissimilarityClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDissimilarityDisjunctionRule());
              	        }
                     		add(
                     			current, 
                     			"dissimilarityClauses",
                      		lv_dissimilarityClauses_0_0, 
                      		"DissimilarityClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2602:2: (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==66) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2602:4: otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) )
            	    {
            	    otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleDissimilarityDisjunction5519); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDissimilarityDisjunctionAccess().getORKeyword_1_0());
            	          
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2606:1: ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2607:1: (lv_dissimilarityClauses_2_0= ruleDissimilarityClause )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2607:1: (lv_dissimilarityClauses_2_0= ruleDissimilarityClause )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2608:3: lv_dissimilarityClauses_2_0= ruleDissimilarityClause
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDissimilarityDisjunctionAccess().getDissimilarityClausesDissimilarityClauseParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityDisjunction5540);
            	    lv_dissimilarityClauses_2_0=ruleDissimilarityClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDissimilarityDisjunctionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dissimilarityClauses",
            	              		lv_dissimilarityClauses_2_0, 
            	              		"DissimilarityClause");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDissimilarityDisjunction"


    // $ANTLR start "entryRuleDissimilarityConjunction"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2632:1: entryRuleDissimilarityConjunction returns [EObject current=null] : iv_ruleDissimilarityConjunction= ruleDissimilarityConjunction EOF ;
    public final EObject entryRuleDissimilarityConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDissimilarityConjunction = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2633:2: (iv_ruleDissimilarityConjunction= ruleDissimilarityConjunction EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2634:2: iv_ruleDissimilarityConjunction= ruleDissimilarityConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDissimilarityConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDissimilarityConjunction_in_entryRuleDissimilarityConjunction5578);
            iv_ruleDissimilarityConjunction=ruleDissimilarityConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDissimilarityConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDissimilarityConjunction5588); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDissimilarityConjunction"


    // $ANTLR start "ruleDissimilarityConjunction"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2641:1: ruleDissimilarityConjunction returns [EObject current=null] : ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ ) ;
    public final EObject ruleDissimilarityConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_dissimilarityClauses_0_0 = null;

        EObject lv_dissimilarityClauses_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2644:28: ( ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2645:1: ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2645:1: ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2645:2: ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2645:2: ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2646:1: (lv_dissimilarityClauses_0_0= ruleDissimilarityClause )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2646:1: (lv_dissimilarityClauses_0_0= ruleDissimilarityClause )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2647:3: lv_dissimilarityClauses_0_0= ruleDissimilarityClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDissimilarityConjunctionAccess().getDissimilarityClausesDissimilarityClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityConjunction5634);
            lv_dissimilarityClauses_0_0=ruleDissimilarityClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDissimilarityConjunctionRule());
              	        }
                     		add(
                     			current, 
                     			"dissimilarityClauses",
                      		lv_dissimilarityClauses_0_0, 
                      		"DissimilarityClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2663:2: (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==67) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2663:4: otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) )
            	    {
            	    otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleDissimilarityConjunction5647); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDissimilarityConjunctionAccess().getANDKeyword_1_0());
            	          
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2667:1: ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2668:1: (lv_dissimilarityClauses_2_0= ruleDissimilarityClause )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2668:1: (lv_dissimilarityClauses_2_0= ruleDissimilarityClause )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2669:3: lv_dissimilarityClauses_2_0= ruleDissimilarityClause
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDissimilarityConjunctionAccess().getDissimilarityClausesDissimilarityClauseParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityConjunction5668);
            	    lv_dissimilarityClauses_2_0=ruleDissimilarityClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDissimilarityConjunctionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dissimilarityClauses",
            	              		lv_dissimilarityClauses_2_0, 
            	              		"DissimilarityClause");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDissimilarityConjunction"


    // $ANTLR start "entryRuleDissimilarityEntry"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2693:1: entryRuleDissimilarityEntry returns [EObject current=null] : iv_ruleDissimilarityEntry= ruleDissimilarityEntry EOF ;
    public final EObject entryRuleDissimilarityEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDissimilarityEntry = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2694:2: (iv_ruleDissimilarityEntry= ruleDissimilarityEntry EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2695:2: iv_ruleDissimilarityEntry= ruleDissimilarityEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDissimilarityEntryRule()); 
            }
            pushFollow(FOLLOW_ruleDissimilarityEntry_in_entryRuleDissimilarityEntry5706);
            iv_ruleDissimilarityEntry=ruleDissimilarityEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDissimilarityEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDissimilarityEntry5716); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDissimilarityEntry"


    // $ANTLR start "ruleDissimilarityEntry"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2702:1: ruleDissimilarityEntry returns [EObject current=null] : ( (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) ) | (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) ) | (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) ) | (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) ) ) ;
    public final EObject ruleDissimilarityEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_compartmentAttribute_1_0 = null;

        Enumerator lv_boxAttribute_3_0 = null;

        Enumerator lv_boardAttribute_5_0 = null;

        Enumerator lv_processorAttribute_7_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2705:28: ( ( (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) ) | (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) ) | (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) ) | (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2706:1: ( (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) ) | (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) ) | (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) ) | (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2706:1: ( (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) ) | (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) ) | (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) ) | (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) ) )
            int alt69=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt69=1;
                }
                break;
            case 69:
                {
                alt69=2;
                }
                break;
            case 70:
                {
                alt69=3;
                }
                break;
            case 71:
                {
                alt69=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2706:2: (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2706:2: (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2706:4: otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) )
                    {
                    otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleDissimilarityEntry5754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getDissimilarityEntryAccess().getCompartmentKeyword_0_0());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2710:1: ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2711:1: (lv_compartmentAttribute_1_0= ruleCompartmentAttributes )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2711:1: (lv_compartmentAttribute_1_0= ruleCompartmentAttributes )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2712:3: lv_compartmentAttribute_1_0= ruleCompartmentAttributes
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDissimilarityEntryAccess().getCompartmentAttributeCompartmentAttributesEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompartmentAttributes_in_ruleDissimilarityEntry5775);
                    lv_compartmentAttribute_1_0=ruleCompartmentAttributes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDissimilarityEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"compartmentAttribute",
                              		lv_compartmentAttribute_1_0, 
                              		"CompartmentAttributes");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2729:6: (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2729:6: (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2729:8: otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) )
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleDissimilarityEntry5795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDissimilarityEntryAccess().getBoxKeyword_1_0());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2733:1: ( (lv_boxAttribute_3_0= ruleBoxAttributes ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2734:1: (lv_boxAttribute_3_0= ruleBoxAttributes )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2734:1: (lv_boxAttribute_3_0= ruleBoxAttributes )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2735:3: lv_boxAttribute_3_0= ruleBoxAttributes
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDissimilarityEntryAccess().getBoxAttributeBoxAttributesEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBoxAttributes_in_ruleDissimilarityEntry5816);
                    lv_boxAttribute_3_0=ruleBoxAttributes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDissimilarityEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"boxAttribute",
                              		lv_boxAttribute_3_0, 
                              		"BoxAttributes");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2752:6: (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2752:6: (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2752:8: otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) )
                    {
                    otherlv_4=(Token)match(input,70,FOLLOW_70_in_ruleDissimilarityEntry5836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDissimilarityEntryAccess().getBoardKeyword_2_0());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2756:1: ( (lv_boardAttribute_5_0= ruleBoardAttributes ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2757:1: (lv_boardAttribute_5_0= ruleBoardAttributes )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2757:1: (lv_boardAttribute_5_0= ruleBoardAttributes )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2758:3: lv_boardAttribute_5_0= ruleBoardAttributes
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDissimilarityEntryAccess().getBoardAttributeBoardAttributesEnumRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBoardAttributes_in_ruleDissimilarityEntry5857);
                    lv_boardAttribute_5_0=ruleBoardAttributes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDissimilarityEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"boardAttribute",
                              		lv_boardAttribute_5_0, 
                              		"BoardAttributes");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2775:6: (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2775:6: (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2775:8: otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) )
                    {
                    otherlv_6=(Token)match(input,71,FOLLOW_71_in_ruleDissimilarityEntry5877); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getDissimilarityEntryAccess().getProcessorKeyword_3_0());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2779:1: ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2780:1: (lv_processorAttribute_7_0= ruleProcessorAttributes )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2780:1: (lv_processorAttribute_7_0= ruleProcessorAttributes )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2781:3: lv_processorAttribute_7_0= ruleProcessorAttributes
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDissimilarityEntryAccess().getProcessorAttributeProcessorAttributesEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleProcessorAttributes_in_ruleDissimilarityEntry5898);
                    lv_processorAttribute_7_0=ruleProcessorAttributes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDissimilarityEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"processorAttribute",
                              		lv_processorAttribute_7_0, 
                              		"ProcessorAttributes");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDissimilarityEntry"


    // $ANTLR start "entryRuleMetricParameter"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2805:1: entryRuleMetricParameter returns [EObject current=null] : iv_ruleMetricParameter= ruleMetricParameter EOF ;
    public final EObject entryRuleMetricParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricParameter = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2806:2: (iv_ruleMetricParameter= ruleMetricParameter EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2807:2: iv_ruleMetricParameter= ruleMetricParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetricParameterRule()); 
            }
            pushFollow(FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter5935);
            iv_ruleMetricParameter=ruleMetricParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetricParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricParameter5945); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2814:1: ruleMetricParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) ;
    public final EObject ruleMetricParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2817:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2818:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2818:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2818:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2818:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2819:1: (lv_name_0_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2819:1: (lv_name_0_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2820:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetricParameter5987); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getMetricParameterAccess().getNameSTRINGTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleMetricParameter6004); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMetricParameterAccess().getEqualsSignKeyword_1());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2840:1: ( (lv_value_2_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2841:1: (lv_value_2_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2841:1: (lv_value_2_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2842:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMetricParameter6021); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getMetricParameterAccess().getValueINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleMetricParameter6038); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMetricParameterAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMetricParameter"


    // $ANTLR start "entryRuleQualifiedName"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2870:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2871:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2872:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName6075);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName6086); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2879:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2882:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2883:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2883:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2883:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName6126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2890:1: (kw= '.' this_ID_2= RULE_ID )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==72) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2891:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,72,FOLLOW_72_in_ruleQualifiedName6145); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName6160); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleCompartmentAttributes"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2911:1: ruleCompartmentAttributes returns [Enumerator current=null] : ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'Side' ) | (enumLiteral_3= 'Zone' ) ) ;
    public final Enumerator ruleCompartmentAttributes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2913:28: ( ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'Side' ) | (enumLiteral_3= 'Zone' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2914:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'Side' ) | (enumLiteral_3= 'Zone' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2914:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'Side' ) | (enumLiteral_3= 'Zone' ) )
            int alt71=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt71=1;
                }
                break;
            case 22:
                {
                alt71=2;
                }
                break;
            case 23:
                {
                alt71=3;
                }
                break;
            case 24:
                {
                alt71=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2914:2: (enumLiteral_0= 'Manufacturer' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2914:2: (enumLiteral_0= 'Manufacturer' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2914:4: enumLiteral_0= 'Manufacturer'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleCompartmentAttributes6221); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompartmentAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompartmentAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2920:6: (enumLiteral_1= 'PowerSupply' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2920:6: (enumLiteral_1= 'PowerSupply' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2920:8: enumLiteral_1= 'PowerSupply'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleCompartmentAttributes6238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompartmentAttributesAccess().getPOWERSUPPLYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompartmentAttributesAccess().getPOWERSUPPLYEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2926:6: (enumLiteral_2= 'Side' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2926:6: (enumLiteral_2= 'Side' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2926:8: enumLiteral_2= 'Side'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_23_in_ruleCompartmentAttributes6255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompartmentAttributesAccess().getSIDEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompartmentAttributesAccess().getSIDEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2932:6: (enumLiteral_3= 'Zone' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2932:6: (enumLiteral_3= 'Zone' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2932:8: enumLiteral_3= 'Zone'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_24_in_ruleCompartmentAttributes6272); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompartmentAttributesAccess().getZONEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompartmentAttributesAccess().getZONEEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCompartmentAttributes"


    // $ANTLR start "ruleBoxAttributes"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2942:1: ruleBoxAttributes returns [Enumerator current=null] : (enumLiteral_0= 'Manufacturer' ) ;
    public final Enumerator ruleBoxAttributes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2944:28: ( (enumLiteral_0= 'Manufacturer' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2945:1: (enumLiteral_0= 'Manufacturer' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2945:1: (enumLiteral_0= 'Manufacturer' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2945:3: enumLiteral_0= 'Manufacturer'
            {
            enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleBoxAttributes6316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getBoxAttributesAccess().getMANUFACTUREREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getBoxAttributesAccess().getMANUFACTUREREnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBoxAttributes"


    // $ANTLR start "ruleBoardAttributes"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2955:1: ruleBoardAttributes returns [Enumerator current=null] : ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'DesignAssuranceLevel' ) | (enumLiteral_3= 'Type' ) | (enumLiteral_4= 'ESS' ) | (enumLiteral_5= 'Side' ) ) ;
    public final Enumerator ruleBoardAttributes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2957:28: ( ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'DesignAssuranceLevel' ) | (enumLiteral_3= 'Type' ) | (enumLiteral_4= 'ESS' ) | (enumLiteral_5= 'Side' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2958:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'DesignAssuranceLevel' ) | (enumLiteral_3= 'Type' ) | (enumLiteral_4= 'ESS' ) | (enumLiteral_5= 'Side' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2958:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'DesignAssuranceLevel' ) | (enumLiteral_3= 'Type' ) | (enumLiteral_4= 'ESS' ) | (enumLiteral_5= 'Side' ) )
            int alt72=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt72=1;
                }
                break;
            case 22:
                {
                alt72=2;
                }
                break;
            case 29:
                {
                alt72=3;
                }
                break;
            case 28:
                {
                alt72=4;
                }
                break;
            case 30:
                {
                alt72=5;
                }
                break;
            case 23:
                {
                alt72=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2958:2: (enumLiteral_0= 'Manufacturer' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2958:2: (enumLiteral_0= 'Manufacturer' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2958:4: enumLiteral_0= 'Manufacturer'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleBoardAttributes6360); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoardAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBoardAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2964:6: (enumLiteral_1= 'PowerSupply' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2964:6: (enumLiteral_1= 'PowerSupply' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2964:8: enumLiteral_1= 'PowerSupply'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleBoardAttributes6377); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoardAttributesAccess().getPOWERSUPPLYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBoardAttributesAccess().getPOWERSUPPLYEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2970:6: (enumLiteral_2= 'DesignAssuranceLevel' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2970:6: (enumLiteral_2= 'DesignAssuranceLevel' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2970:8: enumLiteral_2= 'DesignAssuranceLevel'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_29_in_ruleBoardAttributes6394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoardAttributesAccess().getASSURANCELEVELEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getBoardAttributesAccess().getASSURANCELEVELEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2976:6: (enumLiteral_3= 'Type' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2976:6: (enumLiteral_3= 'Type' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2976:8: enumLiteral_3= 'Type'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_28_in_ruleBoardAttributes6411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoardAttributesAccess().getBOARDTYPEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getBoardAttributesAccess().getBOARDTYPEEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2982:6: (enumLiteral_4= 'ESS' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2982:6: (enumLiteral_4= 'ESS' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2982:8: enumLiteral_4= 'ESS'
                    {
                    enumLiteral_4=(Token)match(input,30,FOLLOW_30_in_ruleBoardAttributes6428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoardAttributesAccess().getESSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getBoardAttributesAccess().getESSEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2988:6: (enumLiteral_5= 'Side' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2988:6: (enumLiteral_5= 'Side' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2988:8: enumLiteral_5= 'Side'
                    {
                    enumLiteral_5=(Token)match(input,23,FOLLOW_23_in_ruleBoardAttributes6445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoardAttributesAccess().getSIDEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getBoardAttributesAccess().getSIDEEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBoardAttributes"


    // $ANTLR start "ruleProcessorAttributes"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2998:1: ruleProcessorAttributes returns [Enumerator current=null] : ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'ProcessorType' ) ) ;
    public final Enumerator ruleProcessorAttributes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3000:28: ( ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'ProcessorType' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3001:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'ProcessorType' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3001:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'ProcessorType' ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==21) ) {
                alt73=1;
            }
            else if ( (LA73_0==73) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3001:2: (enumLiteral_0= 'Manufacturer' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3001:2: (enumLiteral_0= 'Manufacturer' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3001:4: enumLiteral_0= 'Manufacturer'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleProcessorAttributes6490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getProcessorAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getProcessorAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3007:6: (enumLiteral_1= 'ProcessorType' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3007:6: (enumLiteral_1= 'ProcessorType' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3007:8: enumLiteral_1= 'ProcessorType'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_73_in_ruleProcessorAttributes6507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getProcessorAttributesAccess().getPROCESSORTYPEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getProcessorAttributesAccess().getPROCESSORTYPEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleProcessorAttributes"


    // $ANTLR start "ruleHardwareArchitectureLevelType"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3017:1: ruleHardwareArchitectureLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'Core' ) | (enumLiteral_1= 'Processor' ) | (enumLiteral_2= 'Board' ) | (enumLiteral_3= 'Box' ) | (enumLiteral_4= 'Compartment' ) ) ;
    public final Enumerator ruleHardwareArchitectureLevelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3019:28: ( ( (enumLiteral_0= 'Core' ) | (enumLiteral_1= 'Processor' ) | (enumLiteral_2= 'Board' ) | (enumLiteral_3= 'Box' ) | (enumLiteral_4= 'Compartment' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3020:1: ( (enumLiteral_0= 'Core' ) | (enumLiteral_1= 'Processor' ) | (enumLiteral_2= 'Board' ) | (enumLiteral_3= 'Box' ) | (enumLiteral_4= 'Compartment' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3020:1: ( (enumLiteral_0= 'Core' ) | (enumLiteral_1= 'Processor' ) | (enumLiteral_2= 'Board' ) | (enumLiteral_3= 'Box' ) | (enumLiteral_4= 'Compartment' ) )
            int alt74=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt74=1;
                }
                break;
            case 33:
                {
                alt74=2;
                }
                break;
            case 27:
                {
                alt74=3;
                }
                break;
            case 26:
                {
                alt74=4;
                }
                break;
            case 20:
                {
                alt74=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3020:2: (enumLiteral_0= 'Core' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3020:2: (enumLiteral_0= 'Core' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3020:4: enumLiteral_0= 'Core'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_34_in_ruleHardwareArchitectureLevelType6552); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3026:6: (enumLiteral_1= 'Processor' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3026:6: (enumLiteral_1= 'Processor' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3026:8: enumLiteral_1= 'Processor'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_33_in_ruleHardwareArchitectureLevelType6569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getPROCESSOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getHardwareArchitectureLevelTypeAccess().getPROCESSOREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3032:6: (enumLiteral_2= 'Board' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3032:6: (enumLiteral_2= 'Board' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3032:8: enumLiteral_2= 'Board'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_27_in_ruleHardwareArchitectureLevelType6586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getBOARDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getHardwareArchitectureLevelTypeAccess().getBOARDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3038:6: (enumLiteral_3= 'Box' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3038:6: (enumLiteral_3= 'Box' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3038:8: enumLiteral_3= 'Box'
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_26_in_ruleHardwareArchitectureLevelType6603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getBOXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getHardwareArchitectureLevelTypeAccess().getBOXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3044:6: (enumLiteral_4= 'Compartment' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3044:6: (enumLiteral_4= 'Compartment' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3044:8: enumLiteral_4= 'Compartment'
                    {
                    enumLiteral_4=(Token)match(input,20,FOLLOW_20_in_ruleHardwareArchitectureLevelType6620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOMPARTMENTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOMPARTMENTEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHardwareArchitectureLevelType"


    // $ANTLR start "ruleDesignAssuranceLevelType"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3054:1: ruleDesignAssuranceLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'QS' ) | (enumLiteral_2= 'D' ) | (enumLiteral_3= 'C' ) | (enumLiteral_4= 'B' ) | (enumLiteral_5= 'A' ) ) ;
    public final Enumerator ruleDesignAssuranceLevelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3056:28: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'QS' ) | (enumLiteral_2= 'D' ) | (enumLiteral_3= 'C' ) | (enumLiteral_4= 'B' ) | (enumLiteral_5= 'A' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3057:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'QS' ) | (enumLiteral_2= 'D' ) | (enumLiteral_3= 'C' ) | (enumLiteral_4= 'B' ) | (enumLiteral_5= 'A' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3057:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'QS' ) | (enumLiteral_2= 'D' ) | (enumLiteral_3= 'C' ) | (enumLiteral_4= 'B' ) | (enumLiteral_5= 'A' ) )
            int alt75=6;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt75=1;
                }
                break;
            case 75:
                {
                alt75=2;
                }
                break;
            case 76:
                {
                alt75=3;
                }
                break;
            case 77:
                {
                alt75=4;
                }
                break;
            case 78:
                {
                alt75=5;
                }
                break;
            case 79:
                {
                alt75=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3057:2: (enumLiteral_0= 'None' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3057:2: (enumLiteral_0= 'None' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3057:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_74_in_ruleDesignAssuranceLevelType6665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDesignAssuranceLevelTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDesignAssuranceLevelTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3063:6: (enumLiteral_1= 'QS' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3063:6: (enumLiteral_1= 'QS' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3063:8: enumLiteral_1= 'QS'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleDesignAssuranceLevelType6682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDesignAssuranceLevelTypeAccess().getQSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDesignAssuranceLevelTypeAccess().getQSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3069:6: (enumLiteral_2= 'D' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3069:6: (enumLiteral_2= 'D' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3069:8: enumLiteral_2= 'D'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_76_in_ruleDesignAssuranceLevelType6699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDesignAssuranceLevelTypeAccess().getDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getDesignAssuranceLevelTypeAccess().getDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3075:6: (enumLiteral_3= 'C' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3075:6: (enumLiteral_3= 'C' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3075:8: enumLiteral_3= 'C'
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_77_in_ruleDesignAssuranceLevelType6716); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDesignAssuranceLevelTypeAccess().getCEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getDesignAssuranceLevelTypeAccess().getCEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3081:6: (enumLiteral_4= 'B' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3081:6: (enumLiteral_4= 'B' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3081:8: enumLiteral_4= 'B'
                    {
                    enumLiteral_4=(Token)match(input,78,FOLLOW_78_in_ruleDesignAssuranceLevelType6733); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDesignAssuranceLevelTypeAccess().getBEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getDesignAssuranceLevelTypeAccess().getBEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3087:6: (enumLiteral_5= 'A' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3087:6: (enumLiteral_5= 'A' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3087:8: enumLiteral_5= 'A'
                    {
                    enumLiteral_5=(Token)match(input,79,FOLLOW_79_in_ruleDesignAssuranceLevelType6750); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDesignAssuranceLevelTypeAccess().getAEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getDesignAssuranceLevelTypeAccess().getAEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDesignAssuranceLevelType"


    // $ANTLR start "ruleIOAdapterProtectionLevelType"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3097:1: ruleIOAdapterProtectionLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) ) ;
    public final Enumerator ruleIOAdapterProtectionLevelType() throws RecognitionException {
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

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3099:28: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3100:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3100:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) )
            int alt76=9;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt76=1;
                }
                break;
            case 80:
                {
                alt76=2;
                }
                break;
            case 81:
                {
                alt76=3;
                }
                break;
            case 82:
                {
                alt76=4;
                }
                break;
            case 83:
                {
                alt76=5;
                }
                break;
            case 84:
                {
                alt76=6;
                }
                break;
            case 85:
                {
                alt76=7;
                }
                break;
            case 86:
                {
                alt76=8;
                }
                break;
            case 87:
                {
                alt76=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3100:2: (enumLiteral_0= 'None' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3100:2: (enumLiteral_0= 'None' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3100:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_74_in_ruleIOAdapterProtectionLevelType6795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3106:6: (enumLiteral_1= 'L1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3106:6: (enumLiteral_1= 'L1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3106:8: enumLiteral_1= 'L1'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_80_in_ruleIOAdapterProtectionLevelType6812); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_1EnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3112:6: (enumLiteral_2= 'L2' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3112:6: (enumLiteral_2= 'L2' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3112:8: enumLiteral_2= 'L2'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_81_in_ruleIOAdapterProtectionLevelType6829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_2EnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3118:6: (enumLiteral_3= 'L3' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3118:6: (enumLiteral_3= 'L3' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3118:8: enumLiteral_3= 'L3'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_82_in_ruleIOAdapterProtectionLevelType6846); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_3EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_3EnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3124:6: (enumLiteral_4= 'L4' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3124:6: (enumLiteral_4= 'L4' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3124:8: enumLiteral_4= 'L4'
                    {
                    enumLiteral_4=(Token)match(input,83,FOLLOW_83_in_ruleIOAdapterProtectionLevelType6863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_4EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_4EnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3130:6: (enumLiteral_5= 'L5' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3130:6: (enumLiteral_5= 'L5' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3130:8: enumLiteral_5= 'L5'
                    {
                    enumLiteral_5=(Token)match(input,84,FOLLOW_84_in_ruleIOAdapterProtectionLevelType6880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_5EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_5EnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3136:6: (enumLiteral_6= 'L6' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3136:6: (enumLiteral_6= 'L6' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3136:8: enumLiteral_6= 'L6'
                    {
                    enumLiteral_6=(Token)match(input,85,FOLLOW_85_in_ruleIOAdapterProtectionLevelType6897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_6EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_6EnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3142:6: (enumLiteral_7= 'L7' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3142:6: (enumLiteral_7= 'L7' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3142:8: enumLiteral_7= 'L7'
                    {
                    enumLiteral_7=(Token)match(input,86,FOLLOW_86_in_ruleIOAdapterProtectionLevelType6914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_7EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_7EnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3148:6: (enumLiteral_8= 'L8' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3148:6: (enumLiteral_8= 'L8' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3148:8: enumLiteral_8= 'L8'
                    {
                    enumLiteral_8=(Token)match(input,87,FOLLOW_87_in_ruleIOAdapterProtectionLevelType6931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_8EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_8EnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIOAdapterProtectionLevelType"


    // $ANTLR start "ruleIOAdapterType"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3158:1: ruleIOAdapterType returns [Enumerator current=null] : ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'CustomType0' ) | (enumLiteral_7= 'CustomType1' ) | (enumLiteral_8= 'CustomType2' ) | (enumLiteral_9= 'CustomType3' ) | (enumLiteral_10= 'CustomType4' ) | (enumLiteral_11= 'CustomType5' ) | (enumLiteral_12= 'CustomType6' ) | (enumLiteral_13= 'CustomType7' ) | (enumLiteral_14= 'CustomType8' ) | (enumLiteral_15= 'CustomType9' ) | (enumLiteral_16= 'CustomType10' ) | (enumLiteral_17= 'CustomType11' ) | (enumLiteral_18= 'CustomType12' ) | (enumLiteral_19= 'CustomType13' ) | (enumLiteral_20= 'CustomType14' ) | (enumLiteral_21= 'CustomType15' ) | (enumLiteral_22= 'CustomType16' ) | (enumLiteral_23= 'CustomType17' ) | (enumLiteral_24= 'CustomType18' ) | (enumLiteral_25= 'CustomType19' ) | (enumLiteral_26= 'CustomType20' ) | (enumLiteral_27= 'CustomType21' ) | (enumLiteral_28= 'CustomType22' ) | (enumLiteral_29= 'CustomType23' ) | (enumLiteral_30= 'CustomType24' ) | (enumLiteral_31= 'CustomType25' ) | (enumLiteral_32= 'CustomType26' ) | (enumLiteral_33= 'CustomType27' ) | (enumLiteral_34= 'CustomType28' ) | (enumLiteral_35= 'CustomType29' ) | (enumLiteral_36= 'CustomType30' ) | (enumLiteral_37= 'CustomType31' ) | (enumLiteral_38= 'CustomType32' ) | (enumLiteral_39= 'CustomType33' ) | (enumLiteral_40= 'CustomType34' ) | (enumLiteral_41= 'CustomType35' ) | (enumLiteral_42= 'CustomType36' ) | (enumLiteral_43= 'CustomType37' ) | (enumLiteral_44= 'CustomType38' ) | (enumLiteral_45= 'CustomType39' ) ) ;
    public final Enumerator ruleIOAdapterType() throws RecognitionException {
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3160:28: ( ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'CustomType0' ) | (enumLiteral_7= 'CustomType1' ) | (enumLiteral_8= 'CustomType2' ) | (enumLiteral_9= 'CustomType3' ) | (enumLiteral_10= 'CustomType4' ) | (enumLiteral_11= 'CustomType5' ) | (enumLiteral_12= 'CustomType6' ) | (enumLiteral_13= 'CustomType7' ) | (enumLiteral_14= 'CustomType8' ) | (enumLiteral_15= 'CustomType9' ) | (enumLiteral_16= 'CustomType10' ) | (enumLiteral_17= 'CustomType11' ) | (enumLiteral_18= 'CustomType12' ) | (enumLiteral_19= 'CustomType13' ) | (enumLiteral_20= 'CustomType14' ) | (enumLiteral_21= 'CustomType15' ) | (enumLiteral_22= 'CustomType16' ) | (enumLiteral_23= 'CustomType17' ) | (enumLiteral_24= 'CustomType18' ) | (enumLiteral_25= 'CustomType19' ) | (enumLiteral_26= 'CustomType20' ) | (enumLiteral_27= 'CustomType21' ) | (enumLiteral_28= 'CustomType22' ) | (enumLiteral_29= 'CustomType23' ) | (enumLiteral_30= 'CustomType24' ) | (enumLiteral_31= 'CustomType25' ) | (enumLiteral_32= 'CustomType26' ) | (enumLiteral_33= 'CustomType27' ) | (enumLiteral_34= 'CustomType28' ) | (enumLiteral_35= 'CustomType29' ) | (enumLiteral_36= 'CustomType30' ) | (enumLiteral_37= 'CustomType31' ) | (enumLiteral_38= 'CustomType32' ) | (enumLiteral_39= 'CustomType33' ) | (enumLiteral_40= 'CustomType34' ) | (enumLiteral_41= 'CustomType35' ) | (enumLiteral_42= 'CustomType36' ) | (enumLiteral_43= 'CustomType37' ) | (enumLiteral_44= 'CustomType38' ) | (enumLiteral_45= 'CustomType39' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3161:1: ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'CustomType0' ) | (enumLiteral_7= 'CustomType1' ) | (enumLiteral_8= 'CustomType2' ) | (enumLiteral_9= 'CustomType3' ) | (enumLiteral_10= 'CustomType4' ) | (enumLiteral_11= 'CustomType5' ) | (enumLiteral_12= 'CustomType6' ) | (enumLiteral_13= 'CustomType7' ) | (enumLiteral_14= 'CustomType8' ) | (enumLiteral_15= 'CustomType9' ) | (enumLiteral_16= 'CustomType10' ) | (enumLiteral_17= 'CustomType11' ) | (enumLiteral_18= 'CustomType12' ) | (enumLiteral_19= 'CustomType13' ) | (enumLiteral_20= 'CustomType14' ) | (enumLiteral_21= 'CustomType15' ) | (enumLiteral_22= 'CustomType16' ) | (enumLiteral_23= 'CustomType17' ) | (enumLiteral_24= 'CustomType18' ) | (enumLiteral_25= 'CustomType19' ) | (enumLiteral_26= 'CustomType20' ) | (enumLiteral_27= 'CustomType21' ) | (enumLiteral_28= 'CustomType22' ) | (enumLiteral_29= 'CustomType23' ) | (enumLiteral_30= 'CustomType24' ) | (enumLiteral_31= 'CustomType25' ) | (enumLiteral_32= 'CustomType26' ) | (enumLiteral_33= 'CustomType27' ) | (enumLiteral_34= 'CustomType28' ) | (enumLiteral_35= 'CustomType29' ) | (enumLiteral_36= 'CustomType30' ) | (enumLiteral_37= 'CustomType31' ) | (enumLiteral_38= 'CustomType32' ) | (enumLiteral_39= 'CustomType33' ) | (enumLiteral_40= 'CustomType34' ) | (enumLiteral_41= 'CustomType35' ) | (enumLiteral_42= 'CustomType36' ) | (enumLiteral_43= 'CustomType37' ) | (enumLiteral_44= 'CustomType38' ) | (enumLiteral_45= 'CustomType39' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3161:1: ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'CustomType0' ) | (enumLiteral_7= 'CustomType1' ) | (enumLiteral_8= 'CustomType2' ) | (enumLiteral_9= 'CustomType3' ) | (enumLiteral_10= 'CustomType4' ) | (enumLiteral_11= 'CustomType5' ) | (enumLiteral_12= 'CustomType6' ) | (enumLiteral_13= 'CustomType7' ) | (enumLiteral_14= 'CustomType8' ) | (enumLiteral_15= 'CustomType9' ) | (enumLiteral_16= 'CustomType10' ) | (enumLiteral_17= 'CustomType11' ) | (enumLiteral_18= 'CustomType12' ) | (enumLiteral_19= 'CustomType13' ) | (enumLiteral_20= 'CustomType14' ) | (enumLiteral_21= 'CustomType15' ) | (enumLiteral_22= 'CustomType16' ) | (enumLiteral_23= 'CustomType17' ) | (enumLiteral_24= 'CustomType18' ) | (enumLiteral_25= 'CustomType19' ) | (enumLiteral_26= 'CustomType20' ) | (enumLiteral_27= 'CustomType21' ) | (enumLiteral_28= 'CustomType22' ) | (enumLiteral_29= 'CustomType23' ) | (enumLiteral_30= 'CustomType24' ) | (enumLiteral_31= 'CustomType25' ) | (enumLiteral_32= 'CustomType26' ) | (enumLiteral_33= 'CustomType27' ) | (enumLiteral_34= 'CustomType28' ) | (enumLiteral_35= 'CustomType29' ) | (enumLiteral_36= 'CustomType30' ) | (enumLiteral_37= 'CustomType31' ) | (enumLiteral_38= 'CustomType32' ) | (enumLiteral_39= 'CustomType33' ) | (enumLiteral_40= 'CustomType34' ) | (enumLiteral_41= 'CustomType35' ) | (enumLiteral_42= 'CustomType36' ) | (enumLiteral_43= 'CustomType37' ) | (enumLiteral_44= 'CustomType38' ) | (enumLiteral_45= 'CustomType39' ) )
            int alt77=46;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt77=1;
                }
                break;
            case 89:
                {
                alt77=2;
                }
                break;
            case 90:
                {
                alt77=3;
                }
                break;
            case 91:
                {
                alt77=4;
                }
                break;
            case 92:
                {
                alt77=5;
                }
                break;
            case 93:
                {
                alt77=6;
                }
                break;
            case 94:
                {
                alt77=7;
                }
                break;
            case 95:
                {
                alt77=8;
                }
                break;
            case 96:
                {
                alt77=9;
                }
                break;
            case 97:
                {
                alt77=10;
                }
                break;
            case 98:
                {
                alt77=11;
                }
                break;
            case 99:
                {
                alt77=12;
                }
                break;
            case 100:
                {
                alt77=13;
                }
                break;
            case 101:
                {
                alt77=14;
                }
                break;
            case 102:
                {
                alt77=15;
                }
                break;
            case 103:
                {
                alt77=16;
                }
                break;
            case 104:
                {
                alt77=17;
                }
                break;
            case 105:
                {
                alt77=18;
                }
                break;
            case 106:
                {
                alt77=19;
                }
                break;
            case 107:
                {
                alt77=20;
                }
                break;
            case 108:
                {
                alt77=21;
                }
                break;
            case 109:
                {
                alt77=22;
                }
                break;
            case 110:
                {
                alt77=23;
                }
                break;
            case 111:
                {
                alt77=24;
                }
                break;
            case 112:
                {
                alt77=25;
                }
                break;
            case 113:
                {
                alt77=26;
                }
                break;
            case 114:
                {
                alt77=27;
                }
                break;
            case 115:
                {
                alt77=28;
                }
                break;
            case 116:
                {
                alt77=29;
                }
                break;
            case 117:
                {
                alt77=30;
                }
                break;
            case 118:
                {
                alt77=31;
                }
                break;
            case 119:
                {
                alt77=32;
                }
                break;
            case 120:
                {
                alt77=33;
                }
                break;
            case 121:
                {
                alt77=34;
                }
                break;
            case 122:
                {
                alt77=35;
                }
                break;
            case 123:
                {
                alt77=36;
                }
                break;
            case 124:
                {
                alt77=37;
                }
                break;
            case 125:
                {
                alt77=38;
                }
                break;
            case 126:
                {
                alt77=39;
                }
                break;
            case 127:
                {
                alt77=40;
                }
                break;
            case 128:
                {
                alt77=41;
                }
                break;
            case 129:
                {
                alt77=42;
                }
                break;
            case 130:
                {
                alt77=43;
                }
                break;
            case 131:
                {
                alt77=44;
                }
                break;
            case 132:
                {
                alt77=45;
                }
                break;
            case 133:
                {
                alt77=46;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3161:2: (enumLiteral_0= 'Can' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3161:2: (enumLiteral_0= 'Can' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3161:4: enumLiteral_0= 'Can'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_88_in_ruleIOAdapterType6976); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getIOAdapterTypeAccess().getCANEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3167:6: (enumLiteral_1= 'Enhanced Local Bus' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3167:6: (enumLiteral_1= 'Enhanced Local Bus' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3167:8: enumLiteral_1= 'Enhanced Local Bus'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_89_in_ruleIOAdapterType6993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getELBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getIOAdapterTypeAccess().getELBEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3173:6: (enumLiteral_2= 'Ethernet' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3173:6: (enumLiteral_2= 'Ethernet' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3173:8: enumLiteral_2= 'Ethernet'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_90_in_ruleIOAdapterType7010); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getETHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getIOAdapterTypeAccess().getETHEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3179:6: (enumLiteral_3= 'Analog' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3179:6: (enumLiteral_3= 'Analog' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3179:8: enumLiteral_3= 'Analog'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_91_in_ruleIOAdapterType7027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getANALOGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getIOAdapterTypeAccess().getANALOGEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3185:6: (enumLiteral_4= 'Digital' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3185:6: (enumLiteral_4= 'Digital' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3185:8: enumLiteral_4= 'Digital'
                    {
                    enumLiteral_4=(Token)match(input,92,FOLLOW_92_in_ruleIOAdapterType7044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getDIGITALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getIOAdapterTypeAccess().getDIGITALEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3191:6: (enumLiteral_5= 'Serial' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3191:6: (enumLiteral_5= 'Serial' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3191:8: enumLiteral_5= 'Serial'
                    {
                    enumLiteral_5=(Token)match(input,93,FOLLOW_93_in_ruleIOAdapterType7061); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getSERIALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getIOAdapterTypeAccess().getSERIALEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3197:6: (enumLiteral_6= 'CustomType0' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3197:6: (enumLiteral_6= 'CustomType0' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3197:8: enumLiteral_6= 'CustomType0'
                    {
                    enumLiteral_6=(Token)match(input,94,FOLLOW_94_in_ruleIOAdapterType7078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM0EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getIOAdapterTypeAccess().getCUSTOM0EnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3203:6: (enumLiteral_7= 'CustomType1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3203:6: (enumLiteral_7= 'CustomType1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3203:8: enumLiteral_7= 'CustomType1'
                    {
                    enumLiteral_7=(Token)match(input,95,FOLLOW_95_in_ruleIOAdapterType7095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM1EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getIOAdapterTypeAccess().getCUSTOM1EnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3209:6: (enumLiteral_8= 'CustomType2' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3209:6: (enumLiteral_8= 'CustomType2' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3209:8: enumLiteral_8= 'CustomType2'
                    {
                    enumLiteral_8=(Token)match(input,96,FOLLOW_96_in_ruleIOAdapterType7112); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM2EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getIOAdapterTypeAccess().getCUSTOM2EnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3215:6: (enumLiteral_9= 'CustomType3' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3215:6: (enumLiteral_9= 'CustomType3' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3215:8: enumLiteral_9= 'CustomType3'
                    {
                    enumLiteral_9=(Token)match(input,97,FOLLOW_97_in_ruleIOAdapterType7129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM3EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getIOAdapterTypeAccess().getCUSTOM3EnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3221:6: (enumLiteral_10= 'CustomType4' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3221:6: (enumLiteral_10= 'CustomType4' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3221:8: enumLiteral_10= 'CustomType4'
                    {
                    enumLiteral_10=(Token)match(input,98,FOLLOW_98_in_ruleIOAdapterType7146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM4EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getIOAdapterTypeAccess().getCUSTOM4EnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3227:6: (enumLiteral_11= 'CustomType5' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3227:6: (enumLiteral_11= 'CustomType5' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3227:8: enumLiteral_11= 'CustomType5'
                    {
                    enumLiteral_11=(Token)match(input,99,FOLLOW_99_in_ruleIOAdapterType7163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM5EnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getIOAdapterTypeAccess().getCUSTOM5EnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3233:6: (enumLiteral_12= 'CustomType6' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3233:6: (enumLiteral_12= 'CustomType6' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3233:8: enumLiteral_12= 'CustomType6'
                    {
                    enumLiteral_12=(Token)match(input,100,FOLLOW_100_in_ruleIOAdapterType7180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM6EnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getIOAdapterTypeAccess().getCUSTOM6EnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3239:6: (enumLiteral_13= 'CustomType7' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3239:6: (enumLiteral_13= 'CustomType7' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3239:8: enumLiteral_13= 'CustomType7'
                    {
                    enumLiteral_13=(Token)match(input,101,FOLLOW_101_in_ruleIOAdapterType7197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM7EnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getIOAdapterTypeAccess().getCUSTOM7EnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3245:6: (enumLiteral_14= 'CustomType8' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3245:6: (enumLiteral_14= 'CustomType8' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3245:8: enumLiteral_14= 'CustomType8'
                    {
                    enumLiteral_14=(Token)match(input,102,FOLLOW_102_in_ruleIOAdapterType7214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM8EnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getIOAdapterTypeAccess().getCUSTOM8EnumLiteralDeclaration_14()); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3251:6: (enumLiteral_15= 'CustomType9' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3251:6: (enumLiteral_15= 'CustomType9' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3251:8: enumLiteral_15= 'CustomType9'
                    {
                    enumLiteral_15=(Token)match(input,103,FOLLOW_103_in_ruleIOAdapterType7231); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM9EnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_15, grammarAccess.getIOAdapterTypeAccess().getCUSTOM9EnumLiteralDeclaration_15()); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3257:6: (enumLiteral_16= 'CustomType10' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3257:6: (enumLiteral_16= 'CustomType10' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3257:8: enumLiteral_16= 'CustomType10'
                    {
                    enumLiteral_16=(Token)match(input,104,FOLLOW_104_in_ruleIOAdapterType7248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM10EnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_16, grammarAccess.getIOAdapterTypeAccess().getCUSTOM10EnumLiteralDeclaration_16()); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3263:6: (enumLiteral_17= 'CustomType11' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3263:6: (enumLiteral_17= 'CustomType11' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3263:8: enumLiteral_17= 'CustomType11'
                    {
                    enumLiteral_17=(Token)match(input,105,FOLLOW_105_in_ruleIOAdapterType7265); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM11EnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_17, grammarAccess.getIOAdapterTypeAccess().getCUSTOM11EnumLiteralDeclaration_17()); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3269:6: (enumLiteral_18= 'CustomType12' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3269:6: (enumLiteral_18= 'CustomType12' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3269:8: enumLiteral_18= 'CustomType12'
                    {
                    enumLiteral_18=(Token)match(input,106,FOLLOW_106_in_ruleIOAdapterType7282); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM12EnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_18, grammarAccess.getIOAdapterTypeAccess().getCUSTOM12EnumLiteralDeclaration_18()); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3275:6: (enumLiteral_19= 'CustomType13' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3275:6: (enumLiteral_19= 'CustomType13' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3275:8: enumLiteral_19= 'CustomType13'
                    {
                    enumLiteral_19=(Token)match(input,107,FOLLOW_107_in_ruleIOAdapterType7299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM13EnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_19, grammarAccess.getIOAdapterTypeAccess().getCUSTOM13EnumLiteralDeclaration_19()); 
                          
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3281:6: (enumLiteral_20= 'CustomType14' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3281:6: (enumLiteral_20= 'CustomType14' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3281:8: enumLiteral_20= 'CustomType14'
                    {
                    enumLiteral_20=(Token)match(input,108,FOLLOW_108_in_ruleIOAdapterType7316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM14EnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_20, grammarAccess.getIOAdapterTypeAccess().getCUSTOM14EnumLiteralDeclaration_20()); 
                          
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3287:6: (enumLiteral_21= 'CustomType15' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3287:6: (enumLiteral_21= 'CustomType15' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3287:8: enumLiteral_21= 'CustomType15'
                    {
                    enumLiteral_21=(Token)match(input,109,FOLLOW_109_in_ruleIOAdapterType7333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM15EnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_21, grammarAccess.getIOAdapterTypeAccess().getCUSTOM15EnumLiteralDeclaration_21()); 
                          
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3293:6: (enumLiteral_22= 'CustomType16' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3293:6: (enumLiteral_22= 'CustomType16' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3293:8: enumLiteral_22= 'CustomType16'
                    {
                    enumLiteral_22=(Token)match(input,110,FOLLOW_110_in_ruleIOAdapterType7350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM16EnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_22, grammarAccess.getIOAdapterTypeAccess().getCUSTOM16EnumLiteralDeclaration_22()); 
                          
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3299:6: (enumLiteral_23= 'CustomType17' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3299:6: (enumLiteral_23= 'CustomType17' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3299:8: enumLiteral_23= 'CustomType17'
                    {
                    enumLiteral_23=(Token)match(input,111,FOLLOW_111_in_ruleIOAdapterType7367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM17EnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_23, grammarAccess.getIOAdapterTypeAccess().getCUSTOM17EnumLiteralDeclaration_23()); 
                          
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3305:6: (enumLiteral_24= 'CustomType18' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3305:6: (enumLiteral_24= 'CustomType18' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3305:8: enumLiteral_24= 'CustomType18'
                    {
                    enumLiteral_24=(Token)match(input,112,FOLLOW_112_in_ruleIOAdapterType7384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM18EnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_24, grammarAccess.getIOAdapterTypeAccess().getCUSTOM18EnumLiteralDeclaration_24()); 
                          
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3311:6: (enumLiteral_25= 'CustomType19' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3311:6: (enumLiteral_25= 'CustomType19' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3311:8: enumLiteral_25= 'CustomType19'
                    {
                    enumLiteral_25=(Token)match(input,113,FOLLOW_113_in_ruleIOAdapterType7401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM19EnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_25, grammarAccess.getIOAdapterTypeAccess().getCUSTOM19EnumLiteralDeclaration_25()); 
                          
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3317:6: (enumLiteral_26= 'CustomType20' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3317:6: (enumLiteral_26= 'CustomType20' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3317:8: enumLiteral_26= 'CustomType20'
                    {
                    enumLiteral_26=(Token)match(input,114,FOLLOW_114_in_ruleIOAdapterType7418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM20EnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_26, grammarAccess.getIOAdapterTypeAccess().getCUSTOM20EnumLiteralDeclaration_26()); 
                          
                    }

                    }


                    }
                    break;
                case 28 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3323:6: (enumLiteral_27= 'CustomType21' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3323:6: (enumLiteral_27= 'CustomType21' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3323:8: enumLiteral_27= 'CustomType21'
                    {
                    enumLiteral_27=(Token)match(input,115,FOLLOW_115_in_ruleIOAdapterType7435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM21EnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_27, grammarAccess.getIOAdapterTypeAccess().getCUSTOM21EnumLiteralDeclaration_27()); 
                          
                    }

                    }


                    }
                    break;
                case 29 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3329:6: (enumLiteral_28= 'CustomType22' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3329:6: (enumLiteral_28= 'CustomType22' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3329:8: enumLiteral_28= 'CustomType22'
                    {
                    enumLiteral_28=(Token)match(input,116,FOLLOW_116_in_ruleIOAdapterType7452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM22EnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_28, grammarAccess.getIOAdapterTypeAccess().getCUSTOM22EnumLiteralDeclaration_28()); 
                          
                    }

                    }


                    }
                    break;
                case 30 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3335:6: (enumLiteral_29= 'CustomType23' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3335:6: (enumLiteral_29= 'CustomType23' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3335:8: enumLiteral_29= 'CustomType23'
                    {
                    enumLiteral_29=(Token)match(input,117,FOLLOW_117_in_ruleIOAdapterType7469); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM23EnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_29, grammarAccess.getIOAdapterTypeAccess().getCUSTOM23EnumLiteralDeclaration_29()); 
                          
                    }

                    }


                    }
                    break;
                case 31 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3341:6: (enumLiteral_30= 'CustomType24' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3341:6: (enumLiteral_30= 'CustomType24' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3341:8: enumLiteral_30= 'CustomType24'
                    {
                    enumLiteral_30=(Token)match(input,118,FOLLOW_118_in_ruleIOAdapterType7486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM24EnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_30, grammarAccess.getIOAdapterTypeAccess().getCUSTOM24EnumLiteralDeclaration_30()); 
                          
                    }

                    }


                    }
                    break;
                case 32 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3347:6: (enumLiteral_31= 'CustomType25' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3347:6: (enumLiteral_31= 'CustomType25' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3347:8: enumLiteral_31= 'CustomType25'
                    {
                    enumLiteral_31=(Token)match(input,119,FOLLOW_119_in_ruleIOAdapterType7503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM25EnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_31, grammarAccess.getIOAdapterTypeAccess().getCUSTOM25EnumLiteralDeclaration_31()); 
                          
                    }

                    }


                    }
                    break;
                case 33 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3353:6: (enumLiteral_32= 'CustomType26' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3353:6: (enumLiteral_32= 'CustomType26' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3353:8: enumLiteral_32= 'CustomType26'
                    {
                    enumLiteral_32=(Token)match(input,120,FOLLOW_120_in_ruleIOAdapterType7520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM26EnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_32, grammarAccess.getIOAdapterTypeAccess().getCUSTOM26EnumLiteralDeclaration_32()); 
                          
                    }

                    }


                    }
                    break;
                case 34 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3359:6: (enumLiteral_33= 'CustomType27' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3359:6: (enumLiteral_33= 'CustomType27' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3359:8: enumLiteral_33= 'CustomType27'
                    {
                    enumLiteral_33=(Token)match(input,121,FOLLOW_121_in_ruleIOAdapterType7537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM27EnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_33, grammarAccess.getIOAdapterTypeAccess().getCUSTOM27EnumLiteralDeclaration_33()); 
                          
                    }

                    }


                    }
                    break;
                case 35 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3365:6: (enumLiteral_34= 'CustomType28' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3365:6: (enumLiteral_34= 'CustomType28' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3365:8: enumLiteral_34= 'CustomType28'
                    {
                    enumLiteral_34=(Token)match(input,122,FOLLOW_122_in_ruleIOAdapterType7554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM28EnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_34, grammarAccess.getIOAdapterTypeAccess().getCUSTOM28EnumLiteralDeclaration_34()); 
                          
                    }

                    }


                    }
                    break;
                case 36 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3371:6: (enumLiteral_35= 'CustomType29' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3371:6: (enumLiteral_35= 'CustomType29' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3371:8: enumLiteral_35= 'CustomType29'
                    {
                    enumLiteral_35=(Token)match(input,123,FOLLOW_123_in_ruleIOAdapterType7571); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM29EnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_35, grammarAccess.getIOAdapterTypeAccess().getCUSTOM29EnumLiteralDeclaration_35()); 
                          
                    }

                    }


                    }
                    break;
                case 37 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3377:6: (enumLiteral_36= 'CustomType30' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3377:6: (enumLiteral_36= 'CustomType30' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3377:8: enumLiteral_36= 'CustomType30'
                    {
                    enumLiteral_36=(Token)match(input,124,FOLLOW_124_in_ruleIOAdapterType7588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM30EnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_36, grammarAccess.getIOAdapterTypeAccess().getCUSTOM30EnumLiteralDeclaration_36()); 
                          
                    }

                    }


                    }
                    break;
                case 38 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3383:6: (enumLiteral_37= 'CustomType31' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3383:6: (enumLiteral_37= 'CustomType31' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3383:8: enumLiteral_37= 'CustomType31'
                    {
                    enumLiteral_37=(Token)match(input,125,FOLLOW_125_in_ruleIOAdapterType7605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM31EnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_37, grammarAccess.getIOAdapterTypeAccess().getCUSTOM31EnumLiteralDeclaration_37()); 
                          
                    }

                    }


                    }
                    break;
                case 39 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3389:6: (enumLiteral_38= 'CustomType32' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3389:6: (enumLiteral_38= 'CustomType32' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3389:8: enumLiteral_38= 'CustomType32'
                    {
                    enumLiteral_38=(Token)match(input,126,FOLLOW_126_in_ruleIOAdapterType7622); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM32EnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_38, grammarAccess.getIOAdapterTypeAccess().getCUSTOM32EnumLiteralDeclaration_38()); 
                          
                    }

                    }


                    }
                    break;
                case 40 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3395:6: (enumLiteral_39= 'CustomType33' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3395:6: (enumLiteral_39= 'CustomType33' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3395:8: enumLiteral_39= 'CustomType33'
                    {
                    enumLiteral_39=(Token)match(input,127,FOLLOW_127_in_ruleIOAdapterType7639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM33EnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_39, grammarAccess.getIOAdapterTypeAccess().getCUSTOM33EnumLiteralDeclaration_39()); 
                          
                    }

                    }


                    }
                    break;
                case 41 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3401:6: (enumLiteral_40= 'CustomType34' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3401:6: (enumLiteral_40= 'CustomType34' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3401:8: enumLiteral_40= 'CustomType34'
                    {
                    enumLiteral_40=(Token)match(input,128,FOLLOW_128_in_ruleIOAdapterType7656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM34EnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_40, grammarAccess.getIOAdapterTypeAccess().getCUSTOM34EnumLiteralDeclaration_40()); 
                          
                    }

                    }


                    }
                    break;
                case 42 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3407:6: (enumLiteral_41= 'CustomType35' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3407:6: (enumLiteral_41= 'CustomType35' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3407:8: enumLiteral_41= 'CustomType35'
                    {
                    enumLiteral_41=(Token)match(input,129,FOLLOW_129_in_ruleIOAdapterType7673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM35EnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_41, grammarAccess.getIOAdapterTypeAccess().getCUSTOM35EnumLiteralDeclaration_41()); 
                          
                    }

                    }


                    }
                    break;
                case 43 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3413:6: (enumLiteral_42= 'CustomType36' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3413:6: (enumLiteral_42= 'CustomType36' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3413:8: enumLiteral_42= 'CustomType36'
                    {
                    enumLiteral_42=(Token)match(input,130,FOLLOW_130_in_ruleIOAdapterType7690); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM36EnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_42, grammarAccess.getIOAdapterTypeAccess().getCUSTOM36EnumLiteralDeclaration_42()); 
                          
                    }

                    }


                    }
                    break;
                case 44 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3419:6: (enumLiteral_43= 'CustomType37' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3419:6: (enumLiteral_43= 'CustomType37' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3419:8: enumLiteral_43= 'CustomType37'
                    {
                    enumLiteral_43=(Token)match(input,131,FOLLOW_131_in_ruleIOAdapterType7707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM37EnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_43, grammarAccess.getIOAdapterTypeAccess().getCUSTOM37EnumLiteralDeclaration_43()); 
                          
                    }

                    }


                    }
                    break;
                case 45 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3425:6: (enumLiteral_44= 'CustomType38' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3425:6: (enumLiteral_44= 'CustomType38' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3425:8: enumLiteral_44= 'CustomType38'
                    {
                    enumLiteral_44=(Token)match(input,132,FOLLOW_132_in_ruleIOAdapterType7724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM38EnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_44, grammarAccess.getIOAdapterTypeAccess().getCUSTOM38EnumLiteralDeclaration_44()); 
                          
                    }

                    }


                    }
                    break;
                case 46 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3431:6: (enumLiteral_45= 'CustomType39' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3431:6: (enumLiteral_45= 'CustomType39' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3431:8: enumLiteral_45= 'CustomType39'
                    {
                    enumLiteral_45=(Token)match(input,133,FOLLOW_133_in_ruleIOAdapterType7741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM39EnumLiteralDeclaration_45().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_45, grammarAccess.getIOAdapterTypeAccess().getCUSTOM39EnumLiteralDeclaration_45()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIOAdapterType"

    // $ANTLR start synpred1_InternalMappingDSL
    public final void synpred1_InternalMappingDSL_fragment() throws RecognitionException {   
        // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2540:3: ( ruleDissimilarityDisjunction )
        // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2540:5: ruleDissimilarityDisjunction
        {
        pushFollow(FOLLOW_ruleDissimilarityDisjunction_in_synpred1_InternalMappingDSL5357);
        ruleDissimilarityDisjunction();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMappingDSL

    // Delegated rules

    public final boolean synpred1_InternalMappingDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMappingDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA5_eotS =
        "\6\uffff";
    static final String DFA5_eofS =
        "\6\uffff";
    static final String DFA5_minS =
        "\1\5\1\54\1\uffff\1\5\1\54\1\uffff";
    static final String DFA5_maxS =
        "\1\20\1\75\1\uffff\1\5\1\77\1\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\2\uffff\1\1";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\12\uffff\1\2",
            "\1\3\16\uffff\3\2",
            "",
            "\1\4",
            "\1\3\16\uffff\3\2\1\uffff\1\5",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "()* loopback of 227:1: ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )*";
        }
    }
    static final String DFA6_eotS =
        "\6\uffff";
    static final String DFA6_eofS =
        "\6\uffff";
    static final String DFA6_minS =
        "\1\5\1\54\1\uffff\1\5\1\uffff\1\54";
    static final String DFA6_maxS =
        "\1\20\1\75\1\uffff\1\5\1\uffff\1\75";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA6_specialS =
        "\6\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\12\uffff\1\2",
            "\1\3\16\uffff\1\4\2\2",
            "",
            "\1\5",
            "",
            "\1\3\16\uffff\1\4\2\2"
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
            return "()* loopback of 245:3: ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )*";
        }
    }
    static final String DFA7_eotS =
        "\6\uffff";
    static final String DFA7_eofS =
        "\6\uffff";
    static final String DFA7_minS =
        "\1\5\1\54\1\uffff\1\5\1\uffff\1\54";
    static final String DFA7_maxS =
        "\1\20\1\75\1\uffff\1\5\1\uffff\1\75";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA7_specialS =
        "\6\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\12\uffff\1\2",
            "\1\3\17\uffff\1\4\1\2",
            "",
            "\1\5",
            "",
            "\1\3\17\uffff\1\4\1\2"
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
            return "()* loopback of 263:3: ( (lv_proximityRelations_21_0= ruleProximityRelation ) )*";
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
    public static final BitSet FOLLOW_16_in_ruleAssistModel204 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAssistModel216 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel228 = new BitSet(new long[]{0x000000000C100000L});
    public static final BitSet FOLLOW_ruleHardwareElementContainer_in_ruleAssistModel249 = new BitSet(new long[]{0x000002000C110000L});
    public static final BitSet FOLLOW_ruleNetwork_in_ruleAssistModel271 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel284 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssistModel296 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel308 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleAssistModel329 = new BitSet(new long[]{0x0000600000010000L});
    public static final BitSet FOLLOW_ruleApplicationGroup_in_ruleAssistModel351 = new BitSet(new long[]{0x0000200000010000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel364 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAssistModel377 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel389 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleDissimilarityRelation_in_ruleAssistModel410 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_ruleAssistModel432 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleProximityRelation_in_ruleAssistModel454 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleCommunicationRelation_in_ruleAssistModel476 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHardwareElementContainer_in_entryRuleHardwareElementContainer527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHardwareElementContainer537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartment_in_ruleHardwareElementContainer584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBox_in_ruleHardwareElementContainer611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoard_in_ruleHardwareElementContainer638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartment_in_entryRuleCompartment673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartment683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCompartment720 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompartment737 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompartment754 = new BitSet(new long[]{0x0000000005E00000L});
    public static final BitSet FOLLOW_21_in_ruleCompartment767 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment796 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment813 = new BitSet(new long[]{0x0000000005C00000L});
    public static final BitSet FOLLOW_22_in_ruleCompartment828 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment857 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment874 = new BitSet(new long[]{0x0000000005800000L});
    public static final BitSet FOLLOW_23_in_ruleCompartment889 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment901 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment918 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment935 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_24_in_ruleCompartment950 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment979 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment996 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleBox_in_ruleCompartment1019 = new BitSet(new long[]{0x0000000006010000L});
    public static final BitSet FOLLOW_25_in_ruleCompartment1033 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompartment1045 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleCompartment1066 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleCompartment1079 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCompartment1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBox_in_entryRuleBox1129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBox1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBox1176 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBox1193 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBox1210 = new BitSet(new long[]{0x000000000C300000L});
    public static final BitSet FOLLOW_21_in_ruleBox1223 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBox1235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBox1252 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBox1269 = new BitSet(new long[]{0x000000000C100000L});
    public static final BitSet FOLLOW_ruleBoard_in_ruleBox1292 = new BitSet(new long[]{0x000000000E110000L});
    public static final BitSet FOLLOW_25_in_ruleBox1306 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBox1318 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleBox1339 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleBox1352 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBox1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoard_in_entryRuleBoard1402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoard1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBoard1449 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBoard1466 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBoard1483 = new BitSet(new long[]{0x00000003F0E00000L});
    public static final BitSet FOLLOW_21_in_ruleBoard1496 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBoard1508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBoard1525 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBoard1542 = new BitSet(new long[]{0x00000003F0E00000L});
    public static final BitSet FOLLOW_28_in_ruleBoard1557 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBoard1569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBoard1586 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBoard1603 = new BitSet(new long[]{0x00000003F0E00000L});
    public static final BitSet FOLLOW_22_in_ruleBoard1618 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBoard1630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBoard1647 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBoard1664 = new BitSet(new long[]{0x00000003F0E00000L});
    public static final BitSet FOLLOW_29_in_ruleBoard1679 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBoard1691 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FC00L});
    public static final BitSet FOLLOW_ruleDesignAssuranceLevelType_in_ruleBoard1712 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBoard1724 = new BitSet(new long[]{0x00000003F0E00000L});
    public static final BitSet FOLLOW_23_in_ruleBoard1739 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBoard1751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBoard1768 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBoard1785 = new BitSet(new long[]{0x00000003F0E00000L});
    public static final BitSet FOLLOW_30_in_ruleBoard1800 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBoard1812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBoard1829 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBoard1846 = new BitSet(new long[]{0x00000003F0E00000L});
    public static final BitSet FOLLOW_31_in_ruleBoard1861 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBoard1873 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBoard1890 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBoard1907 = new BitSet(new long[]{0x00000003F0E00000L});
    public static final BitSet FOLLOW_32_in_ruleBoard1922 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBoard1934 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBoard1951 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBoard1968 = new BitSet(new long[]{0x00000003F0E00000L});
    public static final BitSet FOLLOW_ruleProcessor_in_ruleBoard1991 = new BitSet(new long[]{0x00000023F2E10000L});
    public static final BitSet FOLLOW_ruleIOAdapter_in_ruleBoard2013 = new BitSet(new long[]{0x0000002002010000L});
    public static final BitSet FOLLOW_25_in_ruleBoard2027 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBoard2039 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleBoard2060 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleBoard2073 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBoard2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessor_in_entryRuleProcessor2123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessor2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleProcessor2170 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessor2187 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProcessor2204 = new BitSet(new long[]{0x0000000410200000L});
    public static final BitSet FOLLOW_21_in_ruleProcessor2217 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProcessor2229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcessor2246 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProcessor2263 = new BitSet(new long[]{0x0000000410200000L});
    public static final BitSet FOLLOW_28_in_ruleProcessor2278 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProcessor2290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcessor2307 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProcessor2324 = new BitSet(new long[]{0x0000000410200000L});
    public static final BitSet FOLLOW_ruleCore_in_ruleProcessor2347 = new BitSet(new long[]{0x0000000412210000L});
    public static final BitSet FOLLOW_25_in_ruleProcessor2361 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProcessor2373 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleProcessor2394 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleProcessor2407 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProcessor2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCore_in_entryRuleCore2457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCore2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCore2504 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCore2521 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCore2538 = new BitSet(new long[]{0x0000001802010000L});
    public static final BitSet FOLLOW_35_in_ruleCore2551 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCore2563 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCore2580 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCore2597 = new BitSet(new long[]{0x0000001002010000L});
    public static final BitSet FOLLOW_36_in_ruleCore2612 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCore2624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCore2641 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCore2658 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_25_in_ruleCore2673 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCore2685 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleCore2706 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleCore2719 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCore2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIOAdapter_in_entryRuleIOAdapter2769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIOAdapter2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleIOAdapter2816 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleIOAdapter2828 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleIOAdapter2840 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIOAdapter2852 = new BitSet(new long[]{0x0000000000000000L,0xFFFFFFFFFF000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleIOAdapterType_in_ruleIOAdapter2873 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIOAdapter2885 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleIOAdapter2897 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIOAdapter2909 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIOAdapter2926 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIOAdapter2943 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_40_in_ruleIOAdapter2956 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIOAdapter2968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000FF0400L});
    public static final BitSet FOLLOW_ruleIOAdapterProtectionLevelType_in_ruleIOAdapter2989 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIOAdapter3001 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleIOAdapter3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNetwork_in_entryRuleNetwork3051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNetwork3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNetwork3098 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNetwork3115 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNetwork3132 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleNetwork3144 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNetwork3156 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNetwork3173 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNetwork3190 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleNetwork3202 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNetwork3225 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleNetwork3237 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNetwork3260 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_44_in_ruleNetwork3273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNetwork3296 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_15_in_ruleNetwork3310 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_25_in_ruleNetwork3323 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNetwork3335 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleNetwork3356 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleNetwork3369 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNetwork3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationGroup_in_entryRuleApplicationGroup3419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationGroup3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleApplicationGroup3466 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationGroup3483 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplicationGroup3500 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationGroup3520 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleApplicationGroup3533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationGroup3553 = new BitSet(new long[]{0x0000100000010000L});
    public static final BitSet FOLLOW_16_in_ruleApplicationGroup3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication3603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleApplication3650 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplication3667 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplication3684 = new BitSet(new long[]{0x00FF800002010000L});
    public static final BitSet FOLLOW_47_in_ruleApplication3697 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication3709 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplication3726 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication3743 = new BitSet(new long[]{0x00FF000002010000L});
    public static final BitSet FOLLOW_48_in_ruleApplication3758 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication3770 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplication3787 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication3804 = new BitSet(new long[]{0x00FE000002010000L});
    public static final BitSet FOLLOW_49_in_ruleApplication3819 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication3831 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplication3848 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication3865 = new BitSet(new long[]{0x00FC000002010000L});
    public static final BitSet FOLLOW_50_in_ruleApplication3880 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication3892 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FC00L});
    public static final BitSet FOLLOW_ruleDesignAssuranceLevelType_in_ruleApplication3913 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication3925 = new BitSet(new long[]{0x00F8000002010000L});
    public static final BitSet FOLLOW_51_in_ruleApplication3940 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication3952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000FF0400L});
    public static final BitSet FOLLOW_ruleIOAdapterProtectionLevelType_in_ruleApplication3973 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication3985 = new BitSet(new long[]{0x00F0000002010000L});
    public static final BitSet FOLLOW_52_in_ruleApplication4000 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication4012 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplication4029 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication4046 = new BitSet(new long[]{0x00E0000002010000L});
    public static final BitSet FOLLOW_53_in_ruleApplication4061 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication4073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplication4090 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication4107 = new BitSet(new long[]{0x00C0000002010000L});
    public static final BitSet FOLLOW_ruleIOAdapterRequirement_in_ruleApplication4130 = new BitSet(new long[]{0x00C0000002010000L});
    public static final BitSet FOLLOW_54_in_ruleApplication4144 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplication4156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleApplication4179 = new BitSet(new long[]{0x0000100000010000L});
    public static final BitSet FOLLOW_44_in_ruleApplication4192 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleApplication4215 = new BitSet(new long[]{0x0000100000010000L});
    public static final BitSet FOLLOW_16_in_ruleApplication4229 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication4241 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_25_in_ruleApplication4256 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplication4268 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleApplication4289 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleApplication4302 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleApplication4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIOAdapterRequirement_in_entryRuleIOAdapterRequirement4352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIOAdapterRequirement4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleIOAdapterRequirement4399 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIOAdapterRequirement4416 = new BitSet(new long[]{0x0000000000000000L,0xFFFFFFFFFF000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleIOAdapterType_in_ruleIOAdapterRequirement4442 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleIOAdapterRequirement4454 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_57_in_ruleIOAdapterRequirement4473 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_58_in_ruleIOAdapterRequirement4510 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIOAdapterRequirement4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation4572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDislocalityRelation4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDislocalityRelation4627 = new BitSet(new long[]{0x0800100000000000L});
    public static final BitSet FOLLOW_44_in_ruleDislocalityRelation4640 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDislocalityRelation4660 = new BitSet(new long[]{0x0800100000000000L});
    public static final BitSet FOLLOW_59_in_ruleDislocalityRelation4674 = new BitSet(new long[]{0x000000060C100000L});
    public static final BitSet FOLLOW_ruleHardwareArchitectureLevelType_in_ruleDislocalityRelation4695 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDislocalityRelation4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProximityRelation_in_entryRuleProximityRelation4743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProximityRelation4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProximityRelation4798 = new BitSet(new long[]{0x1000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleProximityRelation4811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProximityRelation4831 = new BitSet(new long[]{0x1000100000000000L});
    public static final BitSet FOLLOW_60_in_ruleProximityRelation4845 = new BitSet(new long[]{0x000000060C100000L});
    public static final BitSet FOLLOW_ruleHardwareArchitectureLevelType_in_ruleProximityRelation4866 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProximityRelation4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommunicationRelation_in_entryRuleCommunicationRelation4914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommunicationRelation4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommunicationRelation4969 = new BitSet(new long[]{0x2000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleCommunicationRelation4982 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommunicationRelation5002 = new BitSet(new long[]{0x2000100000000000L});
    public static final BitSet FOLLOW_61_in_ruleCommunicationRelation5016 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCommunicationRelation5033 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleCommunicationRelation5050 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCommunicationRelation5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDissimilarityRelation_in_entryRuleDissimilarityRelation5098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDissimilarityRelation5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDissimilarityRelation5153 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleDissimilarityRelation5166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDissimilarityRelation5186 = new BitSet(new long[]{0x8000100000000000L});
    public static final BitSet FOLLOW_63_in_ruleDissimilarityRelation5200 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityRelation5221 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDissimilarityRelation5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDissimilarityClause_in_entryRuleDissimilarityClause5269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDissimilarityClause5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDissimilarityEntry_in_ruleDissimilarityClause5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDissimilarityClause5344 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_ruleDissimilarityDisjunction_in_ruleDissimilarityClause5373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDissimilarityConjunction_in_ruleDissimilarityClause5401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDissimilarityClause5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDissimilarityDisjunction_in_entryRuleDissimilarityDisjunction5450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDissimilarityDisjunction5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityDisjunction5506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleDissimilarityDisjunction5519 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityDisjunction5540 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleDissimilarityConjunction_in_entryRuleDissimilarityConjunction5578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDissimilarityConjunction5588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityConjunction5634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleDissimilarityConjunction5647 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityConjunction5668 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDissimilarityEntry_in_entryRuleDissimilarityEntry5706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDissimilarityEntry5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleDissimilarityEntry5754 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_ruleCompartmentAttributes_in_ruleDissimilarityEntry5775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleDissimilarityEntry5795 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleBoxAttributes_in_ruleDissimilarityEntry5816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleDissimilarityEntry5836 = new BitSet(new long[]{0x0000000070E00000L});
    public static final BitSet FOLLOW_ruleBoardAttributes_in_ruleDissimilarityEntry5857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleDissimilarityEntry5877 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleProcessorAttributes_in_ruleDissimilarityEntry5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter5935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricParameter5945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetricParameter5987 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMetricParameter6004 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMetricParameter6021 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMetricParameter6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName6075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName6086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6126 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleQualifiedName6145 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6160 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_21_in_ruleCompartmentAttributes6221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCompartmentAttributes6238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCompartmentAttributes6255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCompartmentAttributes6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBoxAttributes6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBoardAttributes6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBoardAttributes6377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBoardAttributes6394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBoardAttributes6411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBoardAttributes6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBoardAttributes6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleProcessorAttributes6490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleProcessorAttributes6507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleHardwareArchitectureLevelType6552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleHardwareArchitectureLevelType6569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleHardwareArchitectureLevelType6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleHardwareArchitectureLevelType6603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleHardwareArchitectureLevelType6620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleDesignAssuranceLevelType6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleDesignAssuranceLevelType6682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleDesignAssuranceLevelType6699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDesignAssuranceLevelType6716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleDesignAssuranceLevelType6733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDesignAssuranceLevelType6750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleIOAdapterProtectionLevelType6795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleIOAdapterProtectionLevelType6812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleIOAdapterProtectionLevelType6829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleIOAdapterProtectionLevelType6846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleIOAdapterProtectionLevelType6863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleIOAdapterProtectionLevelType6880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleIOAdapterProtectionLevelType6897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleIOAdapterProtectionLevelType6914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleIOAdapterProtectionLevelType6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleIOAdapterType6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleIOAdapterType6993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleIOAdapterType7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleIOAdapterType7027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleIOAdapterType7044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleIOAdapterType7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleIOAdapterType7078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleIOAdapterType7095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleIOAdapterType7112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleIOAdapterType7129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleIOAdapterType7146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleIOAdapterType7163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleIOAdapterType7180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleIOAdapterType7197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleIOAdapterType7214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleIOAdapterType7231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleIOAdapterType7248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleIOAdapterType7265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleIOAdapterType7282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleIOAdapterType7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleIOAdapterType7316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleIOAdapterType7333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleIOAdapterType7350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleIOAdapterType7367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleIOAdapterType7384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleIOAdapterType7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleIOAdapterType7418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleIOAdapterType7435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleIOAdapterType7452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleIOAdapterType7469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleIOAdapterType7486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleIOAdapterType7503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleIOAdapterType7520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleIOAdapterType7537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleIOAdapterType7554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleIOAdapterType7571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleIOAdapterType7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleIOAdapterType7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleIOAdapterType7622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleIOAdapterType7639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleIOAdapterType7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleIOAdapterType7673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleIOAdapterType7690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleIOAdapterType7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleIOAdapterType7724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleIOAdapterType7741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDissimilarityDisjunction_in_synpred1_InternalMappingDSL5357 = new BitSet(new long[]{0x0000000000000002L});

}