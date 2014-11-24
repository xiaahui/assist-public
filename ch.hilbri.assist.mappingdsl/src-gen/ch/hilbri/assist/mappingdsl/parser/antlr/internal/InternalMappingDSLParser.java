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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Global'", "'{'", "'System name'", "'='", "';'", "'}'", "'Hardware'", "'Software'", "'Relations'", "'Communication'", "'Compartment'", "'Manufacturer'", "'Power supply'", "'Side'", "'Zone'", "'Generic properties'", "'Box'", "'Board'", "'Type'", "'Design assurance level'", "'RAM capacity'", "'ROM capacity'", "'Processor'", "'Core'", "'Capacity'", "'Architecture'", "'I/O adapter'", "'type'", "'count'", "'protection-level'", "'Network'", "'Bandwidth'", "'Connects'", "','", "'Group'", "'Application'", "'Core-utilization'", "'Required RAM capacity'", "'Required ROM capacity'", "'Criticality level'", "'Required IO protection'", "'Identical parallel threads'", "'Developed by'", "'Restrict deployment to'", "'Requires'", "'adapter'", "'exclusive'", "'shared'", "'dislocal up to'", "'on same'", "'require'", "'bandwidth'", "'dissimilar based on'", "'('", "')'", "'OR'", "'AND'", "'Compartment.'", "'Box.'", "'Board.'", "'Processor.'", "'.'", "'PowerSupply'", "'AssuranceLevel'", "'BoardType'", "'ProcessorType'", "'None'", "'QS'", "'D'", "'C'", "'B'", "'A'", "'L1'", "'L2'", "'L3'", "'L4'", "'L5'", "'L6'", "'L7'", "'L8'", "'Can'", "'Enhanced Local Bus'", "'Ethernet'", "'Analog'", "'Digital'", "'Serial'", "'Custom-Type-0'", "'Custom-Type-1'", "'Custom-Type-2'", "'Custom-Type-3'", "'Custom-Type-4'", "'Custom-Type-5'", "'Custom-Type-6'", "'Custom-Type-7'", "'Custom-Type-8'", "'Custom-Type-9'", "'Custom-Type-10'", "'Custom-Type-11'", "'Custom-Type-12'", "'Custom-Type-13'", "'Custom-Type-14'", "'Custom-Type-15'", "'Custom-Type-16'", "'Custom-Type-17'", "'Custom-Type-18'", "'Custom-Type-19'", "'Custom-Type-20'", "'Custom-Type-21'", "'Custom-Type-22'", "'Custom-Type-23'", "'Custom-Type-24'", "'Custom-Type-25'", "'Custom-Type-26'", "'Custom-Type-27'", "'Custom-Type-28'", "'Custom-Type-29'", "'Custom-Type-30'", "'Custom-Type-31'", "'Custom-Type-32'", "'Custom-Type-33'", "'Custom-Type-34'", "'Custom-Type-35'", "'Custom-Type-36'", "'Custom-Type-37'", "'Custom-Type-38'", "'Custom-Type-39'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=4;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=6;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:77:1: ruleAssistModel returns [EObject current=null] : (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= 'Hardware' otherlv_8= '{' ( (lv_hardwareContainer_9_0= ruleHardwareElementContainer ) )+ ( (lv_networks_10_0= ruleNetwork ) )* otherlv_11= '}' otherlv_12= 'Software' otherlv_13= '{' ( (lv_applications_14_0= ruleApplication ) )+ ( (lv_applicationGroups_15_0= ruleApplicationGroup ) )* otherlv_16= '}' (otherlv_17= 'Relations' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* otherlv_22= '}' )? (otherlv_23= 'Communication' otherlv_24= '{' ( (lv_communicationRelations_25_0= ruleCommunicationRelation ) )* otherlv_26= '}' )? ) ;
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
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        EObject lv_hardwareContainer_9_0 = null;

        EObject lv_networks_10_0 = null;

        EObject lv_applications_14_0 = null;

        EObject lv_applicationGroups_15_0 = null;

        EObject lv_dissimilarityRelations_19_0 = null;

        EObject lv_dislocalityRelations_20_0 = null;

        EObject lv_proximityRelations_21_0 = null;

        EObject lv_communicationRelations_25_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:80:28: ( (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= 'Hardware' otherlv_8= '{' ( (lv_hardwareContainer_9_0= ruleHardwareElementContainer ) )+ ( (lv_networks_10_0= ruleNetwork ) )* otherlv_11= '}' otherlv_12= 'Software' otherlv_13= '{' ( (lv_applications_14_0= ruleApplication ) )+ ( (lv_applicationGroups_15_0= ruleApplicationGroup ) )* otherlv_16= '}' (otherlv_17= 'Relations' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* otherlv_22= '}' )? (otherlv_23= 'Communication' otherlv_24= '{' ( (lv_communicationRelations_25_0= ruleCommunicationRelation ) )* otherlv_26= '}' )? ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= 'Hardware' otherlv_8= '{' ( (lv_hardwareContainer_9_0= ruleHardwareElementContainer ) )+ ( (lv_networks_10_0= ruleNetwork ) )* otherlv_11= '}' otherlv_12= 'Software' otherlv_13= '{' ( (lv_applications_14_0= ruleApplication ) )+ ( (lv_applicationGroups_15_0= ruleApplicationGroup ) )* otherlv_16= '}' (otherlv_17= 'Relations' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* otherlv_22= '}' )? (otherlv_23= 'Communication' otherlv_24= '{' ( (lv_communicationRelations_25_0= ruleCommunicationRelation ) )* otherlv_26= '}' )? )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= 'Hardware' otherlv_8= '{' ( (lv_hardwareContainer_9_0= ruleHardwareElementContainer ) )+ ( (lv_networks_10_0= ruleNetwork ) )* otherlv_11= '}' otherlv_12= 'Software' otherlv_13= '{' ( (lv_applications_14_0= ruleApplication ) )+ ( (lv_applicationGroups_15_0= ruleApplicationGroup ) )* otherlv_16= '}' (otherlv_17= 'Relations' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* otherlv_22= '}' )? (otherlv_23= 'Communication' otherlv_24= '{' ( (lv_communicationRelations_25_0= ruleCommunicationRelation ) )* otherlv_26= '}' )? )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:3: otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= 'Hardware' otherlv_8= '{' ( (lv_hardwareContainer_9_0= ruleHardwareElementContainer ) )+ ( (lv_networks_10_0= ruleNetwork ) )* otherlv_11= '}' otherlv_12= 'Software' otherlv_13= '{' ( (lv_applications_14_0= ruleApplication ) )+ ( (lv_applicationGroups_15_0= ruleApplicationGroup ) )* otherlv_16= '}' (otherlv_17= 'Relations' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* otherlv_22= '}' )? (otherlv_23= 'Communication' otherlv_24= '{' ( (lv_communicationRelations_25_0= ruleCommunicationRelation ) )* otherlv_26= '}' )?
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

                if ( (LA1_0==21||(LA1_0>=27 && LA1_0<=28)) ) {
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:219:1: (otherlv_17= 'Relations' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* otherlv_22= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:219:3: otherlv_17= 'Relations' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleAssistModel377); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getAssistModelAccess().getRelationsKeyword_17_0());
                          
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
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


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

                    otherlv_22=(Token)match(input,16,FOLLOW_16_in_ruleAssistModel467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_17_5());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:285:3: (otherlv_23= 'Communication' otherlv_24= '{' ( (lv_communicationRelations_25_0= ruleCommunicationRelation ) )* otherlv_26= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:285:5: otherlv_23= 'Communication' otherlv_24= '{' ( (lv_communicationRelations_25_0= ruleCommunicationRelation ) )* otherlv_26= '}'
                    {
                    otherlv_23=(Token)match(input,20,FOLLOW_20_in_ruleAssistModel482); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getAssistModelAccess().getCommunicationKeyword_18_0());
                          
                    }
                    otherlv_24=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_18_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:293:1: ( (lv_communicationRelations_25_0= ruleCommunicationRelation ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:294:1: (lv_communicationRelations_25_0= ruleCommunicationRelation )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:294:1: (lv_communicationRelations_25_0= ruleCommunicationRelation )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:295:3: lv_communicationRelations_25_0= ruleCommunicationRelation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAssistModelAccess().getCommunicationRelationsCommunicationRelationParserRuleCall_18_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCommunicationRelation_in_ruleAssistModel515);
                    	    lv_communicationRelations_25_0=ruleCommunicationRelation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"communicationRelations",
                    	              		lv_communicationRelations_25_0, 
                    	              		"CommunicationRelation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,16,FOLLOW_16_in_ruleAssistModel528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_18_3());
                          
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:323:1: entryRuleHardwareElementContainer returns [EObject current=null] : iv_ruleHardwareElementContainer= ruleHardwareElementContainer EOF ;
    public final EObject entryRuleHardwareElementContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHardwareElementContainer = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:324:2: (iv_ruleHardwareElementContainer= ruleHardwareElementContainer EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:325:2: iv_ruleHardwareElementContainer= ruleHardwareElementContainer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHardwareElementContainerRule()); 
            }
            pushFollow(FOLLOW_ruleHardwareElementContainer_in_entryRuleHardwareElementContainer566);
            iv_ruleHardwareElementContainer=ruleHardwareElementContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHardwareElementContainer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHardwareElementContainer576); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:332:1: ruleHardwareElementContainer returns [EObject current=null] : (this_Compartment_0= ruleCompartment | this_Box_1= ruleBox | this_Board_2= ruleBoard ) ;
    public final EObject ruleHardwareElementContainer() throws RecognitionException {
        EObject current = null;

        EObject this_Compartment_0 = null;

        EObject this_Box_1 = null;

        EObject this_Board_2 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:335:28: ( (this_Compartment_0= ruleCompartment | this_Box_1= ruleBox | this_Board_2= ruleBoard ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:336:1: (this_Compartment_0= ruleCompartment | this_Box_1= ruleBox | this_Board_2= ruleBoard )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:336:1: (this_Compartment_0= ruleCompartment | this_Box_1= ruleBox | this_Board_2= ruleBoard )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:337:5: this_Compartment_0= ruleCompartment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHardwareElementContainerAccess().getCompartmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompartment_in_ruleHardwareElementContainer623);
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
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:347:5: this_Box_1= ruleBox
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHardwareElementContainerAccess().getBoxParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBox_in_ruleHardwareElementContainer650);
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
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:357:5: this_Board_2= ruleBoard
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHardwareElementContainerAccess().getBoardParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoard_in_ruleHardwareElementContainer677);
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:373:1: entryRuleCompartment returns [EObject current=null] : iv_ruleCompartment= ruleCompartment EOF ;
    public final EObject entryRuleCompartment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompartment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:374:2: (iv_ruleCompartment= ruleCompartment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:375:2: iv_ruleCompartment= ruleCompartment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompartmentRule()); 
            }
            pushFollow(FOLLOW_ruleCompartment_in_entryRuleCompartment712);
            iv_ruleCompartment=ruleCompartment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompartment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartment722); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:382:1: ruleCompartment returns [EObject current=null] : (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Power supply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_boxes_19_0= ruleBox ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:385:28: ( (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Power supply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_boxes_19_0= ruleBox ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:386:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Power supply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_boxes_19_0= ruleBox ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:386:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Power supply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_boxes_19_0= ruleBox ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:386:3: otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Power supply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_boxes_19_0= ruleBox ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleCompartment759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompartmentAccess().getCompartmentKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:390:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:391:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:391:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:392:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompartment776); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCompartment793); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:412:1: (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:412:3: otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleCompartment806); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCompartmentAccess().getManufacturerKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleCompartment818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:420:1: ( (lv_manufacturer_5_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:421:1: (lv_manufacturer_5_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:421:1: (lv_manufacturer_5_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:422:3: lv_manufacturer_5_0= RULE_STRING
                    {
                    lv_manufacturer_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment835); if (state.failed) return current;
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

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleCompartment852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:442:3: (otherlv_7= 'Power supply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:442:5: otherlv_7= 'Power supply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleCompartment867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getCompartmentAccess().getPowerSupplyKeyword_4_0());
                          
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleCompartment879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_4_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:450:1: ( (lv_powerSupply_9_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:451:1: (lv_powerSupply_9_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:451:1: (lv_powerSupply_9_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:452:3: lv_powerSupply_9_0= RULE_STRING
                    {
                    lv_powerSupply_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment896); if (state.failed) return current;
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

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleCompartment913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getCompartmentAccess().getSemicolonKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:472:3: (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:472:5: otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleCompartment928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getCompartmentAccess().getSideKeyword_5_0());
                          
                    }
                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleCompartment940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_5_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:480:1: ( (lv_side_13_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:481:1: (lv_side_13_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:481:1: (lv_side_13_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:482:3: lv_side_13_0= RULE_STRING
                    {
                    lv_side_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment957); if (state.failed) return current;
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

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleCompartment974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getCompartmentAccess().getSemicolonKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:502:3: (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:502:5: otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,25,FOLLOW_25_in_ruleCompartment989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getCompartmentAccess().getZoneKeyword_6_0());
                          
                    }
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleCompartment1001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_6_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:510:1: ( (lv_zone_17_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:511:1: (lv_zone_17_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:511:1: (lv_zone_17_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:512:3: lv_zone_17_0= RULE_STRING
                    {
                    lv_zone_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment1018); if (state.failed) return current;
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

                    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleCompartment1035); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getCompartmentAccess().getSemicolonKeyword_6_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:532:3: ( (lv_boxes_19_0= ruleBox ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:533:1: (lv_boxes_19_0= ruleBox )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:533:1: (lv_boxes_19_0= ruleBox )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:534:3: lv_boxes_19_0= ruleBox
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompartmentAccess().getBoxesBoxParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBox_in_ruleCompartment1058);
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
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:550:3: (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:550:5: otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}'
                    {
                    otherlv_20=(Token)match(input,26,FOLLOW_26_in_ruleCompartment1072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getCompartmentAccess().getGenericPropertiesKeyword_8_0());
                          
                    }
                    otherlv_21=(Token)match(input,12,FOLLOW_12_in_ruleCompartment1084); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_8_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:558:1: ( (lv_metricParameters_22_0= ruleMetricParameter ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_STRING) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:559:1: (lv_metricParameters_22_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:559:1: (lv_metricParameters_22_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:560:3: lv_metricParameters_22_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompartmentAccess().getMetricParametersMetricParameterParserRuleCall_8_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleCompartment1105);
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
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_16_in_ruleCompartment1118); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_8_3());
                          
                    }

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_16_in_ruleCompartment1132); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:592:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:593:2: (iv_ruleBox= ruleBox EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:594:2: iv_ruleBox= ruleBox EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoxRule()); 
            }
            pushFollow(FOLLOW_ruleBox_in_entryRuleBox1168);
            iv_ruleBox=ruleBox();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBox; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBox1178); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:601:1: ruleBox returns [EObject current=null] : (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? ( (lv_boards_7_0= ruleBoard ) )+ (otherlv_8= 'Generic properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:604:28: ( (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? ( (lv_boards_7_0= ruleBoard ) )+ (otherlv_8= 'Generic properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:605:1: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? ( (lv_boards_7_0= ruleBoard ) )+ (otherlv_8= 'Generic properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:605:1: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? ( (lv_boards_7_0= ruleBoard ) )+ (otherlv_8= 'Generic properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:605:3: otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? ( (lv_boards_7_0= ruleBoard ) )+ (otherlv_8= 'Generic properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleBox1215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBoxAccess().getBoxKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:609:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:610:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:610:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:611:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBox1232); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleBox1249); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:631:1: (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:631:3: otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleBox1262); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBoxAccess().getManufacturerKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleBox1274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBoxAccess().getEqualsSignKeyword_3_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:639:1: ( (lv_manufacturer_5_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:640:1: (lv_manufacturer_5_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:640:1: (lv_manufacturer_5_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:641:3: lv_manufacturer_5_0= RULE_STRING
                    {
                    lv_manufacturer_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBox1291); if (state.failed) return current;
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

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleBox1308); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getBoxAccess().getSemicolonKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:661:3: ( (lv_boards_7_0= ruleBoard ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:662:1: (lv_boards_7_0= ruleBoard )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:662:1: (lv_boards_7_0= ruleBoard )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:663:3: lv_boards_7_0= ruleBoard
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBoxAccess().getBoardsBoardParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBoard_in_ruleBox1331);
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
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:679:3: (otherlv_8= 'Generic properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:679:5: otherlv_8= 'Generic properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleBox1345); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBoxAccess().getGenericPropertiesKeyword_5_0());
                          
                    }
                    otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleBox1357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_5_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:687:1: ( (lv_metricParameters_10_0= ruleMetricParameter ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_STRING) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:688:1: (lv_metricParameters_10_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:688:1: (lv_metricParameters_10_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:689:3: lv_metricParameters_10_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBoxAccess().getMetricParametersMetricParameterParserRuleCall_5_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleBox1378);
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
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleBox1391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleBox1405); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:721:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:722:2: (iv_ruleBoard= ruleBoard EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:723:2: iv_ruleBoard= ruleBoard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoardRule()); 
            }
            pushFollow(FOLLOW_ruleBoard_in_entryRuleBoard1441);
            iv_ruleBoard=ruleBoard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoard; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoard1451); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:730:1: ruleBoard returns [EObject current=null] : (otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Power supply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Design assurance level' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? ( (lv_processors_19_0= ruleProcessor ) )+ (otherlv_20= 'RAM capacity' otherlv_21= '=' ( (lv_ramCapacity_22_0= RULE_INT ) ) otherlv_23= ';' )? (otherlv_24= 'ROM capacity' otherlv_25= '=' ( (lv_romCapacity_26_0= RULE_INT ) ) otherlv_27= ';' )? ( (lv_ioAdapters_28_0= ruleIOAdapter ) )* (otherlv_29= 'Generic properties' otherlv_30= '{' ( (lv_metricParameters_31_0= ruleMetricParameter ) )* otherlv_32= '}' )? otherlv_33= '}' ) ;
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
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_ramCapacity_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_romCapacity_26_0=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Enumerator lv_assuranceLevel_17_0 = null;

        EObject lv_processors_19_0 = null;

        EObject lv_ioAdapters_28_0 = null;

        EObject lv_metricParameters_31_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:733:28: ( (otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Power supply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Design assurance level' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? ( (lv_processors_19_0= ruleProcessor ) )+ (otherlv_20= 'RAM capacity' otherlv_21= '=' ( (lv_ramCapacity_22_0= RULE_INT ) ) otherlv_23= ';' )? (otherlv_24= 'ROM capacity' otherlv_25= '=' ( (lv_romCapacity_26_0= RULE_INT ) ) otherlv_27= ';' )? ( (lv_ioAdapters_28_0= ruleIOAdapter ) )* (otherlv_29= 'Generic properties' otherlv_30= '{' ( (lv_metricParameters_31_0= ruleMetricParameter ) )* otherlv_32= '}' )? otherlv_33= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:734:1: (otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Power supply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Design assurance level' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? ( (lv_processors_19_0= ruleProcessor ) )+ (otherlv_20= 'RAM capacity' otherlv_21= '=' ( (lv_ramCapacity_22_0= RULE_INT ) ) otherlv_23= ';' )? (otherlv_24= 'ROM capacity' otherlv_25= '=' ( (lv_romCapacity_26_0= RULE_INT ) ) otherlv_27= ';' )? ( (lv_ioAdapters_28_0= ruleIOAdapter ) )* (otherlv_29= 'Generic properties' otherlv_30= '{' ( (lv_metricParameters_31_0= ruleMetricParameter ) )* otherlv_32= '}' )? otherlv_33= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:734:1: (otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Power supply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Design assurance level' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? ( (lv_processors_19_0= ruleProcessor ) )+ (otherlv_20= 'RAM capacity' otherlv_21= '=' ( (lv_ramCapacity_22_0= RULE_INT ) ) otherlv_23= ';' )? (otherlv_24= 'ROM capacity' otherlv_25= '=' ( (lv_romCapacity_26_0= RULE_INT ) ) otherlv_27= ';' )? ( (lv_ioAdapters_28_0= ruleIOAdapter ) )* (otherlv_29= 'Generic properties' otherlv_30= '{' ( (lv_metricParameters_31_0= ruleMetricParameter ) )* otherlv_32= '}' )? otherlv_33= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:734:3: otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Power supply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Design assurance level' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? ( (lv_processors_19_0= ruleProcessor ) )+ (otherlv_20= 'RAM capacity' otherlv_21= '=' ( (lv_ramCapacity_22_0= RULE_INT ) ) otherlv_23= ';' )? (otherlv_24= 'ROM capacity' otherlv_25= '=' ( (lv_romCapacity_26_0= RULE_INT ) ) otherlv_27= ';' )? ( (lv_ioAdapters_28_0= ruleIOAdapter ) )* (otherlv_29= 'Generic properties' otherlv_30= '{' ( (lv_metricParameters_31_0= ruleMetricParameter ) )* otherlv_32= '}' )? otherlv_33= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleBoard1488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBoardAccess().getBoardKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:738:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:739:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:739:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:740:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBoard1505); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleBoard1522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:760:1: (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:760:3: otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleBoard1535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBoardAccess().getManufacturerKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleBoard1547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBoardAccess().getEqualsSignKeyword_3_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:768:1: ( (lv_manufacturer_5_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:769:1: (lv_manufacturer_5_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:769:1: (lv_manufacturer_5_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:770:3: lv_manufacturer_5_0= RULE_STRING
                    {
                    lv_manufacturer_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBoard1564); if (state.failed) return current;
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

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleBoard1581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getBoardAccess().getSemicolonKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:790:3: (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:790:5: otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleBoard1596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getBoardAccess().getTypeKeyword_4_0());
                          
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleBoard1608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBoardAccess().getEqualsSignKeyword_4_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:798:1: ( (lv_boardType_9_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:799:1: (lv_boardType_9_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:799:1: (lv_boardType_9_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:800:3: lv_boardType_9_0= RULE_STRING
                    {
                    lv_boardType_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBoard1625); if (state.failed) return current;
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

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleBoard1642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getBoardAccess().getSemicolonKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:820:3: (otherlv_11= 'Power supply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:820:5: otherlv_11= 'Power supply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleBoard1657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getBoardAccess().getPowerSupplyKeyword_5_0());
                          
                    }
                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleBoard1669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getBoardAccess().getEqualsSignKeyword_5_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:828:1: ( (lv_powerSupply_13_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:829:1: (lv_powerSupply_13_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:829:1: (lv_powerSupply_13_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:830:3: lv_powerSupply_13_0= RULE_STRING
                    {
                    lv_powerSupply_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBoard1686); if (state.failed) return current;
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

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleBoard1703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getBoardAccess().getSemicolonKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:850:3: (otherlv_15= 'Design assurance level' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:850:5: otherlv_15= 'Design assurance level' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,30,FOLLOW_30_in_ruleBoard1718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getBoardAccess().getDesignAssuranceLevelKeyword_6_0());
                          
                    }
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleBoard1730); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getBoardAccess().getEqualsSignKeyword_6_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:858:1: ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:859:1: (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:859:1: (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:860:3: lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBoardAccess().getAssuranceLevelDesignAssuranceLevelTypeEnumRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDesignAssuranceLevelType_in_ruleBoard1751);
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

                    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleBoard1763); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getBoardAccess().getSemicolonKeyword_6_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:880:3: ( (lv_processors_19_0= ruleProcessor ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==33) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:881:1: (lv_processors_19_0= ruleProcessor )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:881:1: (lv_processors_19_0= ruleProcessor )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:882:3: lv_processors_19_0= ruleProcessor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBoardAccess().getProcessorsProcessorParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProcessor_in_ruleBoard1786);
            	    lv_processors_19_0=ruleProcessor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBoardRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"processors",
            	              		lv_processors_19_0, 
            	              		"Processor");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:898:3: (otherlv_20= 'RAM capacity' otherlv_21= '=' ( (lv_ramCapacity_22_0= RULE_INT ) ) otherlv_23= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:898:5: otherlv_20= 'RAM capacity' otherlv_21= '=' ( (lv_ramCapacity_22_0= RULE_INT ) ) otherlv_23= ';'
                    {
                    otherlv_20=(Token)match(input,31,FOLLOW_31_in_ruleBoard1800); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getBoardAccess().getRAMCapacityKeyword_8_0());
                          
                    }
                    otherlv_21=(Token)match(input,14,FOLLOW_14_in_ruleBoard1812); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getBoardAccess().getEqualsSignKeyword_8_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:906:1: ( (lv_ramCapacity_22_0= RULE_INT ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:907:1: (lv_ramCapacity_22_0= RULE_INT )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:907:1: (lv_ramCapacity_22_0= RULE_INT )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:908:3: lv_ramCapacity_22_0= RULE_INT
                    {
                    lv_ramCapacity_22_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBoard1829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_ramCapacity_22_0, grammarAccess.getBoardAccess().getRamCapacityINTTerminalRuleCall_8_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBoardRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"ramCapacity",
                              		lv_ramCapacity_22_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_23=(Token)match(input,15,FOLLOW_15_in_ruleBoard1846); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getBoardAccess().getSemicolonKeyword_8_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:928:3: (otherlv_24= 'ROM capacity' otherlv_25= '=' ( (lv_romCapacity_26_0= RULE_INT ) ) otherlv_27= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:928:5: otherlv_24= 'ROM capacity' otherlv_25= '=' ( (lv_romCapacity_26_0= RULE_INT ) ) otherlv_27= ';'
                    {
                    otherlv_24=(Token)match(input,32,FOLLOW_32_in_ruleBoard1861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getBoardAccess().getROMCapacityKeyword_9_0());
                          
                    }
                    otherlv_25=(Token)match(input,14,FOLLOW_14_in_ruleBoard1873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getBoardAccess().getEqualsSignKeyword_9_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:936:1: ( (lv_romCapacity_26_0= RULE_INT ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:937:1: (lv_romCapacity_26_0= RULE_INT )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:937:1: (lv_romCapacity_26_0= RULE_INT )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:938:3: lv_romCapacity_26_0= RULE_INT
                    {
                    lv_romCapacity_26_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBoard1890); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_romCapacity_26_0, grammarAccess.getBoardAccess().getRomCapacityINTTerminalRuleCall_9_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBoardRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"romCapacity",
                              		lv_romCapacity_26_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_27=(Token)match(input,15,FOLLOW_15_in_ruleBoard1907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getBoardAccess().getSemicolonKeyword_9_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:958:3: ( (lv_ioAdapters_28_0= ruleIOAdapter ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==37) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:959:1: (lv_ioAdapters_28_0= ruleIOAdapter )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:959:1: (lv_ioAdapters_28_0= ruleIOAdapter )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:960:3: lv_ioAdapters_28_0= ruleIOAdapter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBoardAccess().getIoAdaptersIOAdapterParserRuleCall_10_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIOAdapter_in_ruleBoard1930);
            	    lv_ioAdapters_28_0=ruleIOAdapter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBoardRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ioAdapters",
            	              		lv_ioAdapters_28_0, 
            	              		"IOAdapter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:976:3: (otherlv_29= 'Generic properties' otherlv_30= '{' ( (lv_metricParameters_31_0= ruleMetricParameter ) )* otherlv_32= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:976:5: otherlv_29= 'Generic properties' otherlv_30= '{' ( (lv_metricParameters_31_0= ruleMetricParameter ) )* otherlv_32= '}'
                    {
                    otherlv_29=(Token)match(input,26,FOLLOW_26_in_ruleBoard1944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getBoardAccess().getGenericPropertiesKeyword_11_0());
                          
                    }
                    otherlv_30=(Token)match(input,12,FOLLOW_12_in_ruleBoard1956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_11_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:984:1: ( (lv_metricParameters_31_0= ruleMetricParameter ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_STRING) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:985:1: (lv_metricParameters_31_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:985:1: (lv_metricParameters_31_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:986:3: lv_metricParameters_31_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBoardAccess().getMetricParametersMetricParameterParserRuleCall_11_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleBoard1977);
                    	    lv_metricParameters_31_0=ruleMetricParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBoardRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"metricParameters",
                    	              		lv_metricParameters_31_0, 
                    	              		"MetricParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,16,FOLLOW_16_in_ruleBoard1990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_11_3());
                          
                    }

                    }
                    break;

            }

            otherlv_33=(Token)match(input,16,FOLLOW_16_in_ruleBoard2004); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_33, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_12());
                  
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1018:1: entryRuleProcessor returns [EObject current=null] : iv_ruleProcessor= ruleProcessor EOF ;
    public final EObject entryRuleProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessor = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1019:2: (iv_ruleProcessor= ruleProcessor EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1020:2: iv_ruleProcessor= ruleProcessor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcessorRule()); 
            }
            pushFollow(FOLLOW_ruleProcessor_in_entryRuleProcessor2040);
            iv_ruleProcessor=ruleProcessor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcessor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessor2050); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1027:1: ruleProcessor returns [EObject current=null] : (otherlv_0= 'Processor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )? ( (lv_cores_11_0= ruleCore ) )+ (otherlv_12= 'Generic properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1030:28: ( (otherlv_0= 'Processor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )? ( (lv_cores_11_0= ruleCore ) )+ (otherlv_12= 'Generic properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1031:1: (otherlv_0= 'Processor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )? ( (lv_cores_11_0= ruleCore ) )+ (otherlv_12= 'Generic properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1031:1: (otherlv_0= 'Processor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )? ( (lv_cores_11_0= ruleCore ) )+ (otherlv_12= 'Generic properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1031:3: otherlv_0= 'Processor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )? ( (lv_cores_11_0= ruleCore ) )+ (otherlv_12= 'Generic properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleProcessor2087); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProcessorAccess().getProcessorKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1035:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1036:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1036:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1037:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessor2104); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProcessor2121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getProcessorAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1057:1: (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1057:3: otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleProcessor2134); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getProcessorAccess().getManufacturerKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleProcessor2146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getProcessorAccess().getEqualsSignKeyword_3_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1065:1: ( (lv_manufacturer_5_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1066:1: (lv_manufacturer_5_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1066:1: (lv_manufacturer_5_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1067:3: lv_manufacturer_5_0= RULE_STRING
                    {
                    lv_manufacturer_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProcessor2163); if (state.failed) return current;
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

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleProcessor2180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getProcessorAccess().getSemicolonKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1087:3: (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==29) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1087:5: otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleProcessor2195); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getProcessorAccess().getTypeKeyword_4_0());
                          
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleProcessor2207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getProcessorAccess().getEqualsSignKeyword_4_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1095:1: ( (lv_processorType_9_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1096:1: (lv_processorType_9_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1096:1: (lv_processorType_9_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1097:3: lv_processorType_9_0= RULE_STRING
                    {
                    lv_processorType_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProcessor2224); if (state.failed) return current;
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

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleProcessor2241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getProcessorAccess().getSemicolonKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1117:3: ( (lv_cores_11_0= ruleCore ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==34) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1118:1: (lv_cores_11_0= ruleCore )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1118:1: (lv_cores_11_0= ruleCore )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1119:3: lv_cores_11_0= ruleCore
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProcessorAccess().getCoresCoreParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCore_in_ruleProcessor2264);
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
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1135:3: (otherlv_12= 'Generic properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1135:5: otherlv_12= 'Generic properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_26_in_ruleProcessor2278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getProcessorAccess().getGenericPropertiesKeyword_6_0());
                          
                    }
                    otherlv_13=(Token)match(input,12,FOLLOW_12_in_ruleProcessor2290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getProcessorAccess().getLeftCurlyBracketKeyword_6_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1143:1: ( (lv_metricParameters_14_0= ruleMetricParameter ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_STRING) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1144:1: (lv_metricParameters_14_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1144:1: (lv_metricParameters_14_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1145:3: lv_metricParameters_14_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getProcessorAccess().getMetricParametersMetricParameterParserRuleCall_6_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleProcessor2311);
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
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleProcessor2324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getProcessorAccess().getRightCurlyBracketKeyword_6_3());
                          
                    }

                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleProcessor2338); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1177:1: entryRuleCore returns [EObject current=null] : iv_ruleCore= ruleCore EOF ;
    public final EObject entryRuleCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCore = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1178:2: (iv_ruleCore= ruleCore EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1179:2: iv_ruleCore= ruleCore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoreRule()); 
            }
            pushFollow(FOLLOW_ruleCore_in_entryRuleCore2374);
            iv_ruleCore=ruleCore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCore; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCore2384); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1186:1: ruleCore returns [EObject current=null] : (otherlv_0= 'Core' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';' (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Generic properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1189:28: ( (otherlv_0= 'Core' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';' (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Generic properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1190:1: (otherlv_0= 'Core' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';' (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Generic properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1190:1: (otherlv_0= 'Core' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';' (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Generic properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1190:3: otherlv_0= 'Core' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';' (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Generic properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleCore2421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCoreAccess().getCoreKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1194:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1195:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1195:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1196:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCore2438); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCore2455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCoreAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleCore2467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCoreAccess().getCapacityKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleCore2479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCoreAccess().getEqualsSignKeyword_4());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1224:1: ( (lv_capacity_5_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1225:1: (lv_capacity_5_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1225:1: (lv_capacity_5_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1226:3: lv_capacity_5_0= RULE_INT
            {
            lv_capacity_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCore2496); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_capacity_5_0, grammarAccess.getCoreAccess().getCapacityINTTerminalRuleCall_5_0()); 
              		
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleCore2513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCoreAccess().getSemicolonKeyword_6());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1246:1: (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1246:3: otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleCore2526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getCoreAccess().getArchitectureKeyword_7_0());
                          
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleCore2538); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getCoreAccess().getEqualsSignKeyword_7_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1254:1: ( (lv_architecture_9_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1255:1: (lv_architecture_9_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1255:1: (lv_architecture_9_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1256:3: lv_architecture_9_0= RULE_STRING
                    {
                    lv_architecture_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCore2555); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_architecture_9_0, grammarAccess.getCoreAccess().getArchitectureSTRINGTerminalRuleCall_7_2_0()); 
                      		
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

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleCore2572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getCoreAccess().getSemicolonKeyword_7_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1276:3: (otherlv_11= 'Generic properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==26) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1276:5: otherlv_11= 'Generic properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_26_in_ruleCore2587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getCoreAccess().getGenericPropertiesKeyword_8_0());
                          
                    }
                    otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleCore2599); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getCoreAccess().getLeftCurlyBracketKeyword_8_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1284:1: ( (lv_metricParameters_13_0= ruleMetricParameter ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_STRING) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1285:1: (lv_metricParameters_13_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1285:1: (lv_metricParameters_13_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1286:3: lv_metricParameters_13_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCoreAccess().getMetricParametersMetricParameterParserRuleCall_8_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleCore2620);
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
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_16_in_ruleCore2633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getCoreAccess().getRightCurlyBracketKeyword_8_3());
                          
                    }

                    }
                    break;

            }

            otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleCore2647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getCoreAccess().getRightCurlyBracketKeyword_9());
                  
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1318:1: entryRuleIOAdapter returns [EObject current=null] : iv_ruleIOAdapter= ruleIOAdapter EOF ;
    public final EObject entryRuleIOAdapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIOAdapter = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1319:2: (iv_ruleIOAdapter= ruleIOAdapter EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1320:2: iv_ruleIOAdapter= ruleIOAdapter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIOAdapterRule()); 
            }
            pushFollow(FOLLOW_ruleIOAdapter_in_entryRuleIOAdapter2683);
            iv_ruleIOAdapter=ruleIOAdapter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIOAdapter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIOAdapter2693); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1327:1: ruleIOAdapter returns [EObject current=null] : (otherlv_0= 'I/O adapter' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_adapterType_4_0= ruleIOAdapterType ) ) otherlv_5= ';' otherlv_6= 'count' otherlv_7= '=' ( (lv_totalCount_8_0= RULE_INT ) ) otherlv_9= ';' (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )? otherlv_14= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1330:28: ( (otherlv_0= 'I/O adapter' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_adapterType_4_0= ruleIOAdapterType ) ) otherlv_5= ';' otherlv_6= 'count' otherlv_7= '=' ( (lv_totalCount_8_0= RULE_INT ) ) otherlv_9= ';' (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )? otherlv_14= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1331:1: (otherlv_0= 'I/O adapter' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_adapterType_4_0= ruleIOAdapterType ) ) otherlv_5= ';' otherlv_6= 'count' otherlv_7= '=' ( (lv_totalCount_8_0= RULE_INT ) ) otherlv_9= ';' (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )? otherlv_14= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1331:1: (otherlv_0= 'I/O adapter' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_adapterType_4_0= ruleIOAdapterType ) ) otherlv_5= ';' otherlv_6= 'count' otherlv_7= '=' ( (lv_totalCount_8_0= RULE_INT ) ) otherlv_9= ';' (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )? otherlv_14= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1331:3: otherlv_0= 'I/O adapter' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_adapterType_4_0= ruleIOAdapterType ) ) otherlv_5= ';' otherlv_6= 'count' otherlv_7= '=' ( (lv_totalCount_8_0= RULE_INT ) ) otherlv_9= ';' (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleIOAdapter2730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIOAdapterAccess().getIOAdapterKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleIOAdapter2742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIOAdapterAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleIOAdapter2754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIOAdapterAccess().getTypeKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleIOAdapter2766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIOAdapterAccess().getEqualsSignKeyword_3());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1347:1: ( (lv_adapterType_4_0= ruleIOAdapterType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1348:1: (lv_adapterType_4_0= ruleIOAdapterType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1348:1: (lv_adapterType_4_0= ruleIOAdapterType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1349:3: lv_adapterType_4_0= ruleIOAdapterType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIOAdapterAccess().getAdapterTypeIOAdapterTypeEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIOAdapterType_in_ruleIOAdapter2787);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleIOAdapter2799); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getIOAdapterAccess().getSemicolonKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleIOAdapter2811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getIOAdapterAccess().getCountKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleIOAdapter2823); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getIOAdapterAccess().getEqualsSignKeyword_7());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1377:1: ( (lv_totalCount_8_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1378:1: (lv_totalCount_8_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1378:1: (lv_totalCount_8_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1379:3: lv_totalCount_8_0= RULE_INT
            {
            lv_totalCount_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIOAdapter2840); if (state.failed) return current;
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

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleIOAdapter2857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getIOAdapterAccess().getSemicolonKeyword_9());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1399:1: (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1399:3: otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,40,FOLLOW_40_in_ruleIOAdapter2870); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getIOAdapterAccess().getProtectionLevelKeyword_10_0());
                          
                    }
                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleIOAdapter2882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getIOAdapterAccess().getEqualsSignKeyword_10_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1407:1: ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1408:1: (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1408:1: (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1409:3: lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIOAdapterAccess().getProtectionLevelIOAdapterProtectionLevelTypeEnumRuleCall_10_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIOAdapterProtectionLevelType_in_ruleIOAdapter2903);
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

                    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleIOAdapter2915); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getIOAdapterAccess().getSemicolonKeyword_10_3());
                          
                    }

                    }
                    break;

            }

            otherlv_14=(Token)match(input,16,FOLLOW_16_in_ruleIOAdapter2929); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1441:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1442:2: (iv_ruleNetwork= ruleNetwork EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1443:2: iv_ruleNetwork= ruleNetwork EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNetworkRule()); 
            }
            pushFollow(FOLLOW_ruleNetwork_in_entryRuleNetwork2965);
            iv_ruleNetwork=ruleNetwork();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNetwork; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNetwork2975); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1450:1: ruleNetwork returns [EObject current=null] : (otherlv_0= 'Network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Bandwidth' otherlv_4= '=' ( (lv_bandwidthCapacity_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'Connects' ( ( ruleQualifiedName ) ) otherlv_9= ',' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ';' (otherlv_14= 'Generic properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1453:28: ( (otherlv_0= 'Network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Bandwidth' otherlv_4= '=' ( (lv_bandwidthCapacity_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'Connects' ( ( ruleQualifiedName ) ) otherlv_9= ',' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ';' (otherlv_14= 'Generic properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1454:1: (otherlv_0= 'Network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Bandwidth' otherlv_4= '=' ( (lv_bandwidthCapacity_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'Connects' ( ( ruleQualifiedName ) ) otherlv_9= ',' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ';' (otherlv_14= 'Generic properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1454:1: (otherlv_0= 'Network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Bandwidth' otherlv_4= '=' ( (lv_bandwidthCapacity_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'Connects' ( ( ruleQualifiedName ) ) otherlv_9= ',' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ';' (otherlv_14= 'Generic properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1454:3: otherlv_0= 'Network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Bandwidth' otherlv_4= '=' ( (lv_bandwidthCapacity_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'Connects' ( ( ruleQualifiedName ) ) otherlv_9= ',' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ';' (otherlv_14= 'Generic properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleNetwork3012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNetworkAccess().getNetworkKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1458:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1459:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1459:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1460:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNetwork3029); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleNetwork3046); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleNetwork3058); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getNetworkAccess().getBandwidthKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleNetwork3070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getNetworkAccess().getEqualsSignKeyword_4());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1488:1: ( (lv_bandwidthCapacity_5_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1489:1: (lv_bandwidthCapacity_5_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1489:1: (lv_bandwidthCapacity_5_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1490:3: lv_bandwidthCapacity_5_0= RULE_INT
            {
            lv_bandwidthCapacity_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNetwork3087); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleNetwork3104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getNetworkAccess().getSemicolonKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,43,FOLLOW_43_in_ruleNetwork3116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getNetworkAccess().getConnectsKeyword_7());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1514:1: ( ( ruleQualifiedName ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1515:1: ( ruleQualifiedName )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1515:1: ( ruleQualifiedName )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1516:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNetworkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNetworkAccess().getBoardsBoardCrossReference_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNetwork3139);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,44,FOLLOW_44_in_ruleNetwork3151); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getNetworkAccess().getCommaKeyword_9());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1533:1: ( ( ruleQualifiedName ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1534:1: ( ruleQualifiedName )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1534:1: ( ruleQualifiedName )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1535:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNetworkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNetworkAccess().getBoardsBoardCrossReference_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNetwork3174);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1548:2: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==44) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1548:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_11=(Token)match(input,44,FOLLOW_44_in_ruleNetwork3187); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getNetworkAccess().getCommaKeyword_11_0());
            	          
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1552:1: ( ( ruleQualifiedName ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1553:1: ( ruleQualifiedName )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1553:1: ( ruleQualifiedName )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1554:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getNetworkRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNetworkAccess().getBoardsBoardCrossReference_11_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleNetwork3210);
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
            	    break loop42;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleNetwork3224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getNetworkAccess().getSemicolonKeyword_12());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1571:1: (otherlv_14= 'Generic properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==26) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1571:3: otherlv_14= 'Generic properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}'
                    {
                    otherlv_14=(Token)match(input,26,FOLLOW_26_in_ruleNetwork3237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getNetworkAccess().getGenericPropertiesKeyword_13_0());
                          
                    }
                    otherlv_15=(Token)match(input,12,FOLLOW_12_in_ruleNetwork3249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_13_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1579:1: ( (lv_metricParameters_16_0= ruleMetricParameter ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_STRING) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1580:1: (lv_metricParameters_16_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1580:1: (lv_metricParameters_16_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1581:3: lv_metricParameters_16_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNetworkAccess().getMetricParametersMetricParameterParserRuleCall_13_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleNetwork3270);
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
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_16_in_ruleNetwork3283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_13_3());
                          
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FOLLOW_16_in_ruleNetwork3297); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1613:1: entryRuleApplicationGroup returns [EObject current=null] : iv_ruleApplicationGroup= ruleApplicationGroup EOF ;
    public final EObject entryRuleApplicationGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationGroup = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1614:2: (iv_ruleApplicationGroup= ruleApplicationGroup EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1615:2: iv_ruleApplicationGroup= ruleApplicationGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationGroupRule()); 
            }
            pushFollow(FOLLOW_ruleApplicationGroup_in_entryRuleApplicationGroup3333);
            iv_ruleApplicationGroup=ruleApplicationGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplicationGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationGroup3343); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1622:1: ruleApplicationGroup returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1625:28: ( (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1626:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1626:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1626:3: otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleApplicationGroup3380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getApplicationGroupAccess().getGroupKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1630:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1631:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1631:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1632:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationGroup3397); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleApplicationGroup3414); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getApplicationGroupAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1652:1: ( (otherlv_3= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1653:1: (otherlv_3= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1653:1: (otherlv_3= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1654:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getApplicationGroupRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationGroup3434); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getApplicationGroupAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_3_0()); 
              	
            }

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1665:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==44) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1665:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleApplicationGroup3447); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getApplicationGroupAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1669:1: ( (otherlv_5= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1670:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1670:1: (otherlv_5= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1671:3: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getApplicationGroupRule());
            	      	        }
            	              
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationGroup3467); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_5, grammarAccess.getApplicationGroupAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_4_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleApplicationGroup3481); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1694:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1695:2: (iv_ruleApplication= ruleApplication EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1696:2: iv_ruleApplication= ruleApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationRule()); 
            }
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication3517);
            iv_ruleApplication=ruleApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication3527); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1703:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';' (otherlv_7= 'Required RAM capacity' otherlv_8= '=' ( (lv_ramUtilization_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'Required ROM capacity' otherlv_12= '=' ( (lv_romUtilization_13_0= RULE_INT ) ) otherlv_14= ';' )? (otherlv_15= 'Criticality level' otherlv_16= '=' ( (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Required IO protection' otherlv_20= '=' ( (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType ) ) otherlv_22= ';' )? (otherlv_23= 'Identical parallel threads' otherlv_24= '=' ( (lv_parallelThreads_25_0= RULE_INT ) ) otherlv_26= ';' )? (otherlv_27= 'Developed by' otherlv_28= '=' ( (lv_developedBy_29_0= RULE_STRING ) ) otherlv_30= ';' )? ( (lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement ) )* (otherlv_32= 'Restrict deployment to' otherlv_33= '{' ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* otherlv_37= '}' otherlv_38= ';' )? (otherlv_39= 'Generic properties' otherlv_40= '{' ( (lv_metricParameters_41_0= ruleMetricParameter ) )* otherlv_42= '}' )? otherlv_43= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1706:28: ( (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';' (otherlv_7= 'Required RAM capacity' otherlv_8= '=' ( (lv_ramUtilization_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'Required ROM capacity' otherlv_12= '=' ( (lv_romUtilization_13_0= RULE_INT ) ) otherlv_14= ';' )? (otherlv_15= 'Criticality level' otherlv_16= '=' ( (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Required IO protection' otherlv_20= '=' ( (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType ) ) otherlv_22= ';' )? (otherlv_23= 'Identical parallel threads' otherlv_24= '=' ( (lv_parallelThreads_25_0= RULE_INT ) ) otherlv_26= ';' )? (otherlv_27= 'Developed by' otherlv_28= '=' ( (lv_developedBy_29_0= RULE_STRING ) ) otherlv_30= ';' )? ( (lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement ) )* (otherlv_32= 'Restrict deployment to' otherlv_33= '{' ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* otherlv_37= '}' otherlv_38= ';' )? (otherlv_39= 'Generic properties' otherlv_40= '{' ( (lv_metricParameters_41_0= ruleMetricParameter ) )* otherlv_42= '}' )? otherlv_43= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1707:1: (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';' (otherlv_7= 'Required RAM capacity' otherlv_8= '=' ( (lv_ramUtilization_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'Required ROM capacity' otherlv_12= '=' ( (lv_romUtilization_13_0= RULE_INT ) ) otherlv_14= ';' )? (otherlv_15= 'Criticality level' otherlv_16= '=' ( (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Required IO protection' otherlv_20= '=' ( (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType ) ) otherlv_22= ';' )? (otherlv_23= 'Identical parallel threads' otherlv_24= '=' ( (lv_parallelThreads_25_0= RULE_INT ) ) otherlv_26= ';' )? (otherlv_27= 'Developed by' otherlv_28= '=' ( (lv_developedBy_29_0= RULE_STRING ) ) otherlv_30= ';' )? ( (lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement ) )* (otherlv_32= 'Restrict deployment to' otherlv_33= '{' ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* otherlv_37= '}' otherlv_38= ';' )? (otherlv_39= 'Generic properties' otherlv_40= '{' ( (lv_metricParameters_41_0= ruleMetricParameter ) )* otherlv_42= '}' )? otherlv_43= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1707:1: (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';' (otherlv_7= 'Required RAM capacity' otherlv_8= '=' ( (lv_ramUtilization_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'Required ROM capacity' otherlv_12= '=' ( (lv_romUtilization_13_0= RULE_INT ) ) otherlv_14= ';' )? (otherlv_15= 'Criticality level' otherlv_16= '=' ( (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Required IO protection' otherlv_20= '=' ( (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType ) ) otherlv_22= ';' )? (otherlv_23= 'Identical parallel threads' otherlv_24= '=' ( (lv_parallelThreads_25_0= RULE_INT ) ) otherlv_26= ';' )? (otherlv_27= 'Developed by' otherlv_28= '=' ( (lv_developedBy_29_0= RULE_STRING ) ) otherlv_30= ';' )? ( (lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement ) )* (otherlv_32= 'Restrict deployment to' otherlv_33= '{' ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* otherlv_37= '}' otherlv_38= ';' )? (otherlv_39= 'Generic properties' otherlv_40= '{' ( (lv_metricParameters_41_0= ruleMetricParameter ) )* otherlv_42= '}' )? otherlv_43= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1707:3: otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';' (otherlv_7= 'Required RAM capacity' otherlv_8= '=' ( (lv_ramUtilization_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'Required ROM capacity' otherlv_12= '=' ( (lv_romUtilization_13_0= RULE_INT ) ) otherlv_14= ';' )? (otherlv_15= 'Criticality level' otherlv_16= '=' ( (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Required IO protection' otherlv_20= '=' ( (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType ) ) otherlv_22= ';' )? (otherlv_23= 'Identical parallel threads' otherlv_24= '=' ( (lv_parallelThreads_25_0= RULE_INT ) ) otherlv_26= ';' )? (otherlv_27= 'Developed by' otherlv_28= '=' ( (lv_developedBy_29_0= RULE_STRING ) ) otherlv_30= ';' )? ( (lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement ) )* (otherlv_32= 'Restrict deployment to' otherlv_33= '{' ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* otherlv_37= '}' otherlv_38= ';' )? (otherlv_39= 'Generic properties' otherlv_40= '{' ( (lv_metricParameters_41_0= ruleMetricParameter ) )* otherlv_42= '}' )? otherlv_43= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleApplication3564); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1711:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1712:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1712:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1713:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplication3581); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleApplication3598); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleApplication3610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getApplicationAccess().getCoreUtilizationKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleApplication3622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getEqualsSignKeyword_4());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1741:1: ( (lv_coreUtilization_5_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1742:1: (lv_coreUtilization_5_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1742:1: (lv_coreUtilization_5_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1743:3: lv_coreUtilization_5_0= RULE_INT
            {
            lv_coreUtilization_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplication3639); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_coreUtilization_5_0, grammarAccess.getApplicationAccess().getCoreUtilizationINTTerminalRuleCall_5_0()); 
              		
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleApplication3656); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getSemicolonKeyword_6());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1763:1: (otherlv_7= 'Required RAM capacity' otherlv_8= '=' ( (lv_ramUtilization_9_0= RULE_INT ) ) otherlv_10= ';' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==48) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1763:3: otherlv_7= 'Required RAM capacity' otherlv_8= '=' ( (lv_ramUtilization_9_0= RULE_INT ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleApplication3669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getApplicationAccess().getRequiredRAMCapacityKeyword_7_0());
                          
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleApplication3681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getApplicationAccess().getEqualsSignKeyword_7_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1771:1: ( (lv_ramUtilization_9_0= RULE_INT ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1772:1: (lv_ramUtilization_9_0= RULE_INT )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1772:1: (lv_ramUtilization_9_0= RULE_INT )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1773:3: lv_ramUtilization_9_0= RULE_INT
                    {
                    lv_ramUtilization_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplication3698); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_ramUtilization_9_0, grammarAccess.getApplicationAccess().getRamUtilizationINTTerminalRuleCall_7_2_0()); 
                      		
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

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleApplication3715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getApplicationAccess().getSemicolonKeyword_7_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1793:3: (otherlv_11= 'Required ROM capacity' otherlv_12= '=' ( (lv_romUtilization_13_0= RULE_INT ) ) otherlv_14= ';' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1793:5: otherlv_11= 'Required ROM capacity' otherlv_12= '=' ( (lv_romUtilization_13_0= RULE_INT ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,49,FOLLOW_49_in_ruleApplication3730); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getApplicationAccess().getRequiredROMCapacityKeyword_8_0());
                          
                    }
                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleApplication3742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getApplicationAccess().getEqualsSignKeyword_8_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1801:1: ( (lv_romUtilization_13_0= RULE_INT ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1802:1: (lv_romUtilization_13_0= RULE_INT )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1802:1: (lv_romUtilization_13_0= RULE_INT )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1803:3: lv_romUtilization_13_0= RULE_INT
                    {
                    lv_romUtilization_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplication3759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_romUtilization_13_0, grammarAccess.getApplicationAccess().getRomUtilizationINTTerminalRuleCall_8_2_0()); 
                      		
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

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleApplication3776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getApplicationAccess().getSemicolonKeyword_8_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1823:3: (otherlv_15= 'Criticality level' otherlv_16= '=' ( (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==50) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1823:5: otherlv_15= 'Criticality level' otherlv_16= '=' ( (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,50,FOLLOW_50_in_ruleApplication3791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getApplicationAccess().getCriticalityLevelKeyword_9_0());
                          
                    }
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleApplication3803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getApplicationAccess().getEqualsSignKeyword_9_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1831:1: ( (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1832:1: (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1832:1: (lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1833:3: lv_criticalityLevel_17_0= ruleDesignAssuranceLevelType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getApplicationAccess().getCriticalityLevelDesignAssuranceLevelTypeEnumRuleCall_9_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDesignAssuranceLevelType_in_ruleApplication3824);
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

                    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleApplication3836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getApplicationAccess().getSemicolonKeyword_9_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1853:3: (otherlv_19= 'Required IO protection' otherlv_20= '=' ( (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType ) ) otherlv_22= ';' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==51) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1853:5: otherlv_19= 'Required IO protection' otherlv_20= '=' ( (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType ) ) otherlv_22= ';'
                    {
                    otherlv_19=(Token)match(input,51,FOLLOW_51_in_ruleApplication3851); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getApplicationAccess().getRequiredIOProtectionKeyword_10_0());
                          
                    }
                    otherlv_20=(Token)match(input,14,FOLLOW_14_in_ruleApplication3863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getApplicationAccess().getEqualsSignKeyword_10_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1861:1: ( (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1862:1: (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1862:1: (lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1863:3: lv_ioAdapterProtectionLevel_21_0= ruleIOAdapterProtectionLevelType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getApplicationAccess().getIoAdapterProtectionLevelIOAdapterProtectionLevelTypeEnumRuleCall_10_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIOAdapterProtectionLevelType_in_ruleApplication3884);
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

                    otherlv_22=(Token)match(input,15,FOLLOW_15_in_ruleApplication3896); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getApplicationAccess().getSemicolonKeyword_10_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1883:3: (otherlv_23= 'Identical parallel threads' otherlv_24= '=' ( (lv_parallelThreads_25_0= RULE_INT ) ) otherlv_26= ';' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==52) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1883:5: otherlv_23= 'Identical parallel threads' otherlv_24= '=' ( (lv_parallelThreads_25_0= RULE_INT ) ) otherlv_26= ';'
                    {
                    otherlv_23=(Token)match(input,52,FOLLOW_52_in_ruleApplication3911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getApplicationAccess().getIdenticalParallelThreadsKeyword_11_0());
                          
                    }
                    otherlv_24=(Token)match(input,14,FOLLOW_14_in_ruleApplication3923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getApplicationAccess().getEqualsSignKeyword_11_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1891:1: ( (lv_parallelThreads_25_0= RULE_INT ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1892:1: (lv_parallelThreads_25_0= RULE_INT )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1892:1: (lv_parallelThreads_25_0= RULE_INT )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1893:3: lv_parallelThreads_25_0= RULE_INT
                    {
                    lv_parallelThreads_25_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplication3940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_parallelThreads_25_0, grammarAccess.getApplicationAccess().getParallelThreadsINTTerminalRuleCall_11_2_0()); 
                      		
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

                    otherlv_26=(Token)match(input,15,FOLLOW_15_in_ruleApplication3957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getApplicationAccess().getSemicolonKeyword_11_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1913:3: (otherlv_27= 'Developed by' otherlv_28= '=' ( (lv_developedBy_29_0= RULE_STRING ) ) otherlv_30= ';' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==53) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1913:5: otherlv_27= 'Developed by' otherlv_28= '=' ( (lv_developedBy_29_0= RULE_STRING ) ) otherlv_30= ';'
                    {
                    otherlv_27=(Token)match(input,53,FOLLOW_53_in_ruleApplication3972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getApplicationAccess().getDevelopedByKeyword_12_0());
                          
                    }
                    otherlv_28=(Token)match(input,14,FOLLOW_14_in_ruleApplication3984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getApplicationAccess().getEqualsSignKeyword_12_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1921:1: ( (lv_developedBy_29_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1922:1: (lv_developedBy_29_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1922:1: (lv_developedBy_29_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1923:3: lv_developedBy_29_0= RULE_STRING
                    {
                    lv_developedBy_29_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplication4001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_developedBy_29_0, grammarAccess.getApplicationAccess().getDevelopedBySTRINGTerminalRuleCall_12_2_0()); 
                      		
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

                    otherlv_30=(Token)match(input,15,FOLLOW_15_in_ruleApplication4018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getApplicationAccess().getSemicolonKeyword_12_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1943:3: ( (lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==55) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1944:1: (lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1944:1: (lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1945:3: lv_ioAdapterRequirements_31_0= ruleIOAdapterRequirement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getApplicationAccess().getIoAdapterRequirementsIOAdapterRequirementParserRuleCall_13_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIOAdapterRequirement_in_ruleApplication4041);
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
            	    break loop52;
                }
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1961:3: (otherlv_32= 'Restrict deployment to' otherlv_33= '{' ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* otherlv_37= '}' otherlv_38= ';' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==54) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1961:5: otherlv_32= 'Restrict deployment to' otherlv_33= '{' ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* otherlv_37= '}' otherlv_38= ';'
                    {
                    otherlv_32=(Token)match(input,54,FOLLOW_54_in_ruleApplication4055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getApplicationAccess().getRestrictDeploymentToKeyword_14_0());
                          
                    }
                    otherlv_33=(Token)match(input,12,FOLLOW_12_in_ruleApplication4067); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_33, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_14_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1969:1: ( ( ruleQualifiedName ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1970:1: ( ruleQualifiedName )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1970:1: ( ruleQualifiedName )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1971:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getApplicationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getApplicationAccess().getRestrictMappingToHardwareElementsHardwareElementCrossReference_14_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleApplication4090);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1984:2: (otherlv_35= ',' ( ( ruleQualifiedName ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==44) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1984:4: otherlv_35= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_35=(Token)match(input,44,FOLLOW_44_in_ruleApplication4103); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_35, grammarAccess.getApplicationAccess().getCommaKeyword_14_3_0());
                    	          
                    	    }
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1988:1: ( ( ruleQualifiedName ) )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1989:1: ( ruleQualifiedName )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1989:1: ( ruleQualifiedName )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1990:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getApplicationRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getApplicationAccess().getRestrictMappingToHardwareElementsHardwareElementCrossReference_14_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleApplication4126);
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
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,16,FOLLOW_16_in_ruleApplication4140); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_14_4());
                          
                    }
                    otherlv_38=(Token)match(input,15,FOLLOW_15_in_ruleApplication4152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_38, grammarAccess.getApplicationAccess().getSemicolonKeyword_14_5());
                          
                    }

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2011:3: (otherlv_39= 'Generic properties' otherlv_40= '{' ( (lv_metricParameters_41_0= ruleMetricParameter ) )* otherlv_42= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==26) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2011:5: otherlv_39= 'Generic properties' otherlv_40= '{' ( (lv_metricParameters_41_0= ruleMetricParameter ) )* otherlv_42= '}'
                    {
                    otherlv_39=(Token)match(input,26,FOLLOW_26_in_ruleApplication4167); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_39, grammarAccess.getApplicationAccess().getGenericPropertiesKeyword_15_0());
                          
                    }
                    otherlv_40=(Token)match(input,12,FOLLOW_12_in_ruleApplication4179); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_15_1());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2019:1: ( (lv_metricParameters_41_0= ruleMetricParameter ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==RULE_STRING) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2020:1: (lv_metricParameters_41_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2020:1: (lv_metricParameters_41_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2021:3: lv_metricParameters_41_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getApplicationAccess().getMetricParametersMetricParameterParserRuleCall_15_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleApplication4200);
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
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_42=(Token)match(input,16,FOLLOW_16_in_ruleApplication4213); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_15_3());
                          
                    }

                    }
                    break;

            }

            otherlv_43=(Token)match(input,16,FOLLOW_16_in_ruleApplication4227); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_43, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_16());
                  
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2053:1: entryRuleIOAdapterRequirement returns [EObject current=null] : iv_ruleIOAdapterRequirement= ruleIOAdapterRequirement EOF ;
    public final EObject entryRuleIOAdapterRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIOAdapterRequirement = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2054:2: (iv_ruleIOAdapterRequirement= ruleIOAdapterRequirement EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2055:2: iv_ruleIOAdapterRequirement= ruleIOAdapterRequirement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIOAdapterRequirementRule()); 
            }
            pushFollow(FOLLOW_ruleIOAdapterRequirement_in_entryRuleIOAdapterRequirement4263);
            iv_ruleIOAdapterRequirement=ruleIOAdapterRequirement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIOAdapterRequirement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIOAdapterRequirement4273); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2062:1: ruleIOAdapterRequirement returns [EObject current=null] : (otherlv_0= 'Requires' ( (lv_requiredAdapterCount_1_0= RULE_INT ) ) ( (lv_adapterType_2_0= ruleIOAdapterType ) ) otherlv_3= 'adapter' ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) ) otherlv_6= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2065:28: ( (otherlv_0= 'Requires' ( (lv_requiredAdapterCount_1_0= RULE_INT ) ) ( (lv_adapterType_2_0= ruleIOAdapterType ) ) otherlv_3= 'adapter' ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) ) otherlv_6= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2066:1: (otherlv_0= 'Requires' ( (lv_requiredAdapterCount_1_0= RULE_INT ) ) ( (lv_adapterType_2_0= ruleIOAdapterType ) ) otherlv_3= 'adapter' ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) ) otherlv_6= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2066:1: (otherlv_0= 'Requires' ( (lv_requiredAdapterCount_1_0= RULE_INT ) ) ( (lv_adapterType_2_0= ruleIOAdapterType ) ) otherlv_3= 'adapter' ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) ) otherlv_6= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2066:3: otherlv_0= 'Requires' ( (lv_requiredAdapterCount_1_0= RULE_INT ) ) ( (lv_adapterType_2_0= ruleIOAdapterType ) ) otherlv_3= 'adapter' ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleIOAdapterRequirement4310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIOAdapterRequirementAccess().getRequiresKeyword_0());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2070:1: ( (lv_requiredAdapterCount_1_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2071:1: (lv_requiredAdapterCount_1_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2071:1: (lv_requiredAdapterCount_1_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2072:3: lv_requiredAdapterCount_1_0= RULE_INT
            {
            lv_requiredAdapterCount_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIOAdapterRequirement4327); if (state.failed) return current;
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2088:2: ( (lv_adapterType_2_0= ruleIOAdapterType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2089:1: (lv_adapterType_2_0= ruleIOAdapterType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2089:1: (lv_adapterType_2_0= ruleIOAdapterType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2090:3: lv_adapterType_2_0= ruleIOAdapterType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIOAdapterRequirementAccess().getAdapterTypeIOAdapterTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIOAdapterType_in_ruleIOAdapterRequirement4353);
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

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleIOAdapterRequirement4365); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIOAdapterRequirementAccess().getAdapterKeyword_3());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2110:1: ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==57) ) {
                alt57=1;
            }
            else if ( (LA57_0==58) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2110:2: ( (lv_isExclusiveOnly_4_0= 'exclusive' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2110:2: ( (lv_isExclusiveOnly_4_0= 'exclusive' ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2111:1: (lv_isExclusiveOnly_4_0= 'exclusive' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2111:1: (lv_isExclusiveOnly_4_0= 'exclusive' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2112:3: lv_isExclusiveOnly_4_0= 'exclusive'
                    {
                    lv_isExclusiveOnly_4_0=(Token)match(input,57,FOLLOW_57_in_ruleIOAdapterRequirement4384); if (state.failed) return current;
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
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2126:6: ( (lv_isSharedAllowed_5_0= 'shared' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2126:6: ( (lv_isSharedAllowed_5_0= 'shared' ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2127:1: (lv_isSharedAllowed_5_0= 'shared' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2127:1: (lv_isSharedAllowed_5_0= 'shared' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2128:3: lv_isSharedAllowed_5_0= 'shared'
                    {
                    lv_isSharedAllowed_5_0=(Token)match(input,58,FOLLOW_58_in_ruleIOAdapterRequirement4421); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleIOAdapterRequirement4447); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2153:1: entryRuleDislocalityRelation returns [EObject current=null] : iv_ruleDislocalityRelation= ruleDislocalityRelation EOF ;
    public final EObject entryRuleDislocalityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDislocalityRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2154:2: (iv_ruleDislocalityRelation= ruleDislocalityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2155:2: iv_ruleDislocalityRelation= ruleDislocalityRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDislocalityRelationRule()); 
            }
            pushFollow(FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation4483);
            iv_ruleDislocalityRelation=ruleDislocalityRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDislocalityRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDislocalityRelation4493); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2162:1: ruleDislocalityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2165:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2166:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2166:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2166:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2166:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2167:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2167:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2168:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDislocalityRelationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDislocalityRelation4538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getDislocalityRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_0_0()); 
              	
            }

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2179:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==44) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2179:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleDislocalityRelation4551); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDislocalityRelationAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2183:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2184:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2184:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2185:3: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getDislocalityRelationRule());
            	      	        }
            	              
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDislocalityRelation4571); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_2, grammarAccess.getDislocalityRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_1_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleDislocalityRelation4585); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDislocalityRelationAccess().getDislocalUpToKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2200:1: ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2201:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2201:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2202:3: lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDislocalityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleHardwareArchitectureLevelType_in_ruleDislocalityRelation4606);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDislocalityRelation4618); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2230:1: entryRuleProximityRelation returns [EObject current=null] : iv_ruleProximityRelation= ruleProximityRelation EOF ;
    public final EObject entryRuleProximityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProximityRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2231:2: (iv_ruleProximityRelation= ruleProximityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2232:2: iv_ruleProximityRelation= ruleProximityRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProximityRelationRule()); 
            }
            pushFollow(FOLLOW_ruleProximityRelation_in_entryRuleProximityRelation4654);
            iv_ruleProximityRelation=ruleProximityRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProximityRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProximityRelation4664); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2239:1: ruleProximityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2242:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2243:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2243:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2243:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2243:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2244:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2244:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2245:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getProximityRelationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProximityRelation4709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getProximityRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_0_0()); 
              	
            }

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2256:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==44) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2256:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleProximityRelation4722); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getProximityRelationAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2260:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2261:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2261:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2262:3: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getProximityRelationRule());
            	      	        }
            	              
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProximityRelation4742); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_2, grammarAccess.getProximityRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_1_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleProximityRelation4756); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getProximityRelationAccess().getOnSameKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2277:1: ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2278:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2278:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2279:3: lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProximityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleHardwareArchitectureLevelType_in_ruleProximityRelation4777);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleProximityRelation4789); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2307:1: entryRuleCommunicationRelation returns [EObject current=null] : iv_ruleCommunicationRelation= ruleCommunicationRelation EOF ;
    public final EObject entryRuleCommunicationRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2308:2: (iv_ruleCommunicationRelation= ruleCommunicationRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2309:2: iv_ruleCommunicationRelation= ruleCommunicationRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommunicationRelationRule()); 
            }
            pushFollow(FOLLOW_ruleCommunicationRelation_in_entryRuleCommunicationRelation4825);
            iv_ruleCommunicationRelation=ruleCommunicationRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommunicationRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommunicationRelation4835); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2316:1: ruleCommunicationRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'require' ( (lv_bandwidthUtilization_4_0= RULE_INT ) ) otherlv_5= 'bandwidth' otherlv_6= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2319:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'require' ( (lv_bandwidthUtilization_4_0= RULE_INT ) ) otherlv_5= 'bandwidth' otherlv_6= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2320:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'require' ( (lv_bandwidthUtilization_4_0= RULE_INT ) ) otherlv_5= 'bandwidth' otherlv_6= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2320:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'require' ( (lv_bandwidthUtilization_4_0= RULE_INT ) ) otherlv_5= 'bandwidth' otherlv_6= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2320:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'require' ( (lv_bandwidthUtilization_4_0= RULE_INT ) ) otherlv_5= 'bandwidth' otherlv_6= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2320:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2321:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2321:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2322:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCommunicationRelationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommunicationRelation4880); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getCommunicationRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_0_0()); 
              	
            }

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2333:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==44) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2333:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleCommunicationRelation4893); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getCommunicationRelationAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2337:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2338:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2338:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2339:3: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getCommunicationRelationRule());
            	      	        }
            	              
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommunicationRelation4913); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_2, grammarAccess.getCommunicationRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_1_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_3=(Token)match(input,61,FOLLOW_61_in_ruleCommunicationRelation4927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCommunicationRelationAccess().getRequireKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2354:1: ( (lv_bandwidthUtilization_4_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2355:1: (lv_bandwidthUtilization_4_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2355:1: (lv_bandwidthUtilization_4_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2356:3: lv_bandwidthUtilization_4_0= RULE_INT
            {
            lv_bandwidthUtilization_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCommunicationRelation4944); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,62,FOLLOW_62_in_ruleCommunicationRelation4961); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCommunicationRelationAccess().getBandwidthKeyword_4());
                  
            }
            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleCommunicationRelation4973); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2388:1: entryRuleDissimilarityRelation returns [EObject current=null] : iv_ruleDissimilarityRelation= ruleDissimilarityRelation EOF ;
    public final EObject entryRuleDissimilarityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDissimilarityRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2389:2: (iv_ruleDissimilarityRelation= ruleDissimilarityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2390:2: iv_ruleDissimilarityRelation= ruleDissimilarityRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDissimilarityRelationRule()); 
            }
            pushFollow(FOLLOW_ruleDissimilarityRelation_in_entryRuleDissimilarityRelation5009);
            iv_ruleDissimilarityRelation=ruleDissimilarityRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDissimilarityRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDissimilarityRelation5019); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2397:1: ruleDissimilarityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= 'dissimilar based on' ( (lv_dissimilarityClause_4_0= ruleDissimilarityClause ) ) otherlv_5= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2400:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= 'dissimilar based on' ( (lv_dissimilarityClause_4_0= ruleDissimilarityClause ) ) otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2401:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= 'dissimilar based on' ( (lv_dissimilarityClause_4_0= ruleDissimilarityClause ) ) otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2401:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= 'dissimilar based on' ( (lv_dissimilarityClause_4_0= ruleDissimilarityClause ) ) otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2401:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= 'dissimilar based on' ( (lv_dissimilarityClause_4_0= ruleDissimilarityClause ) ) otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2401:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2402:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2402:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2403:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDissimilarityRelationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDissimilarityRelation5064); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getDissimilarityRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_0_0()); 
              	
            }

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2414:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==44) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2414:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleDissimilarityRelation5077); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDissimilarityRelationAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2418:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2419:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2419:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2420:3: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getDissimilarityRelationRule());
            	      	        }
            	              
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDissimilarityRelation5097); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_2, grammarAccess.getDissimilarityRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_1_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            otherlv_3=(Token)match(input,63,FOLLOW_63_in_ruleDissimilarityRelation5111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDissimilarityRelationAccess().getDissimilarBasedOnKeyword_2());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2435:1: ( (lv_dissimilarityClause_4_0= ruleDissimilarityClause ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2436:1: (lv_dissimilarityClause_4_0= ruleDissimilarityClause )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2436:1: (lv_dissimilarityClause_4_0= ruleDissimilarityClause )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2437:3: lv_dissimilarityClause_4_0= ruleDissimilarityClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDissimilarityRelationAccess().getDissimilarityClauseDissimilarityClauseParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityRelation5132);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDissimilarityRelation5144); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2465:1: entryRuleDissimilarityClause returns [EObject current=null] : iv_ruleDissimilarityClause= ruleDissimilarityClause EOF ;
    public final EObject entryRuleDissimilarityClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDissimilarityClause = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2466:2: (iv_ruleDissimilarityClause= ruleDissimilarityClause EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2467:2: iv_ruleDissimilarityClause= ruleDissimilarityClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDissimilarityClauseRule()); 
            }
            pushFollow(FOLLOW_ruleDissimilarityClause_in_entryRuleDissimilarityClause5180);
            iv_ruleDissimilarityClause=ruleDissimilarityClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDissimilarityClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDissimilarityClause5190); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2474:1: ruleDissimilarityClause returns [EObject current=null] : (this_DissimilarityEntry_0= ruleDissimilarityEntry | (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' ) ) ;
    public final EObject ruleDissimilarityClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_DissimilarityEntry_0 = null;

        EObject this_DissimilarityDisjunction_2 = null;

        EObject this_DissimilarityConjunction_3 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2477:28: ( (this_DissimilarityEntry_0= ruleDissimilarityEntry | (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2478:1: (this_DissimilarityEntry_0= ruleDissimilarityEntry | (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2478:1: (this_DissimilarityEntry_0= ruleDissimilarityEntry | (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=68 && LA63_0<=71)) ) {
                alt63=1;
            }
            else if ( (LA63_0==64) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2479:5: this_DissimilarityEntry_0= ruleDissimilarityEntry
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDissimilarityClauseAccess().getDissimilarityEntryParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDissimilarityEntry_in_ruleDissimilarityClause5237);
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
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2488:6: (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2488:6: (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2488:8: otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleDissimilarityClause5255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDissimilarityClauseAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2492:1: ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction )
                    int alt62=2;
                    switch ( input.LA(1) ) {
                    case 68:
                        {
                        int LA62_1 = input.LA(2);

                        if ( (synpred1_InternalMappingDSL()) ) {
                            alt62=1;
                        }
                        else if ( (true) ) {
                            alt62=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 62, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 69:
                        {
                        int LA62_2 = input.LA(2);

                        if ( (synpred1_InternalMappingDSL()) ) {
                            alt62=1;
                        }
                        else if ( (true) ) {
                            alt62=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 62, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 70:
                        {
                        int LA62_3 = input.LA(2);

                        if ( (synpred1_InternalMappingDSL()) ) {
                            alt62=1;
                        }
                        else if ( (true) ) {
                            alt62=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 62, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 71:
                        {
                        int LA62_4 = input.LA(2);

                        if ( (synpred1_InternalMappingDSL()) ) {
                            alt62=1;
                        }
                        else if ( (true) ) {
                            alt62=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 62, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                        {
                        int LA62_5 = input.LA(2);

                        if ( (synpred1_InternalMappingDSL()) ) {
                            alt62=1;
                        }
                        else if ( (true) ) {
                            alt62=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 62, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }

                    switch (alt62) {
                        case 1 :
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2492:2: ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction )
                            {
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2492:2: ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction )
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2492:3: ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getDissimilarityClauseAccess().getDissimilarityDisjunctionParserRuleCall_1_1_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleDissimilarityDisjunction_in_ruleDissimilarityClause5284);
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
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2503:5: this_DissimilarityConjunction_3= ruleDissimilarityConjunction
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getDissimilarityClauseAccess().getDissimilarityConjunctionParserRuleCall_1_1_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleDissimilarityConjunction_in_ruleDissimilarityClause5312);
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

                    otherlv_4=(Token)match(input,65,FOLLOW_65_in_ruleDissimilarityClause5324); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2523:1: entryRuleDissimilarityDisjunction returns [EObject current=null] : iv_ruleDissimilarityDisjunction= ruleDissimilarityDisjunction EOF ;
    public final EObject entryRuleDissimilarityDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDissimilarityDisjunction = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2524:2: (iv_ruleDissimilarityDisjunction= ruleDissimilarityDisjunction EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2525:2: iv_ruleDissimilarityDisjunction= ruleDissimilarityDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDissimilarityDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDissimilarityDisjunction_in_entryRuleDissimilarityDisjunction5361);
            iv_ruleDissimilarityDisjunction=ruleDissimilarityDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDissimilarityDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDissimilarityDisjunction5371); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2532:1: ruleDissimilarityDisjunction returns [EObject current=null] : ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ ) ;
    public final EObject ruleDissimilarityDisjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_dissimilarityClauses_0_0 = null;

        EObject lv_dissimilarityClauses_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2535:28: ( ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2536:1: ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2536:1: ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2536:2: ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2536:2: ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2537:1: (lv_dissimilarityClauses_0_0= ruleDissimilarityClause )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2537:1: (lv_dissimilarityClauses_0_0= ruleDissimilarityClause )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2538:3: lv_dissimilarityClauses_0_0= ruleDissimilarityClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDissimilarityDisjunctionAccess().getDissimilarityClausesDissimilarityClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityDisjunction5417);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2554:2: (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==66) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2554:4: otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) )
            	    {
            	    otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleDissimilarityDisjunction5430); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDissimilarityDisjunctionAccess().getORKeyword_1_0());
            	          
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2558:1: ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2559:1: (lv_dissimilarityClauses_2_0= ruleDissimilarityClause )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2559:1: (lv_dissimilarityClauses_2_0= ruleDissimilarityClause )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2560:3: lv_dissimilarityClauses_2_0= ruleDissimilarityClause
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDissimilarityDisjunctionAccess().getDissimilarityClausesDissimilarityClauseParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityDisjunction5451);
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
            	    if ( cnt64 >= 1 ) break loop64;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2584:1: entryRuleDissimilarityConjunction returns [EObject current=null] : iv_ruleDissimilarityConjunction= ruleDissimilarityConjunction EOF ;
    public final EObject entryRuleDissimilarityConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDissimilarityConjunction = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2585:2: (iv_ruleDissimilarityConjunction= ruleDissimilarityConjunction EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2586:2: iv_ruleDissimilarityConjunction= ruleDissimilarityConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDissimilarityConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDissimilarityConjunction_in_entryRuleDissimilarityConjunction5489);
            iv_ruleDissimilarityConjunction=ruleDissimilarityConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDissimilarityConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDissimilarityConjunction5499); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2593:1: ruleDissimilarityConjunction returns [EObject current=null] : ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ ) ;
    public final EObject ruleDissimilarityConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_dissimilarityClauses_0_0 = null;

        EObject lv_dissimilarityClauses_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2596:28: ( ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2597:1: ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2597:1: ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2597:2: ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2597:2: ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2598:1: (lv_dissimilarityClauses_0_0= ruleDissimilarityClause )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2598:1: (lv_dissimilarityClauses_0_0= ruleDissimilarityClause )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2599:3: lv_dissimilarityClauses_0_0= ruleDissimilarityClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDissimilarityConjunctionAccess().getDissimilarityClausesDissimilarityClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityConjunction5545);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2615:2: (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==67) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2615:4: otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) )
            	    {
            	    otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleDissimilarityConjunction5558); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDissimilarityConjunctionAccess().getANDKeyword_1_0());
            	          
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2619:1: ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2620:1: (lv_dissimilarityClauses_2_0= ruleDissimilarityClause )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2620:1: (lv_dissimilarityClauses_2_0= ruleDissimilarityClause )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2621:3: lv_dissimilarityClauses_2_0= ruleDissimilarityClause
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDissimilarityConjunctionAccess().getDissimilarityClausesDissimilarityClauseParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityConjunction5579);
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
            	    if ( cnt65 >= 1 ) break loop65;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2645:1: entryRuleDissimilarityEntry returns [EObject current=null] : iv_ruleDissimilarityEntry= ruleDissimilarityEntry EOF ;
    public final EObject entryRuleDissimilarityEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDissimilarityEntry = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2646:2: (iv_ruleDissimilarityEntry= ruleDissimilarityEntry EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2647:2: iv_ruleDissimilarityEntry= ruleDissimilarityEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDissimilarityEntryRule()); 
            }
            pushFollow(FOLLOW_ruleDissimilarityEntry_in_entryRuleDissimilarityEntry5617);
            iv_ruleDissimilarityEntry=ruleDissimilarityEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDissimilarityEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDissimilarityEntry5627); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2654:1: ruleDissimilarityEntry returns [EObject current=null] : ( (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) ) | (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) ) | (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) ) | (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) ) ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2657:28: ( ( (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) ) | (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) ) | (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) ) | (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2658:1: ( (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) ) | (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) ) | (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) ) | (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2658:1: ( (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) ) | (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) ) | (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) ) | (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) ) )
            int alt66=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt66=1;
                }
                break;
            case 69:
                {
                alt66=2;
                }
                break;
            case 70:
                {
                alt66=3;
                }
                break;
            case 71:
                {
                alt66=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2658:2: (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2658:2: (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2658:4: otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) )
                    {
                    otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleDissimilarityEntry5665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getDissimilarityEntryAccess().getCompartmentKeyword_0_0());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2662:1: ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2663:1: (lv_compartmentAttribute_1_0= ruleCompartmentAttributes )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2663:1: (lv_compartmentAttribute_1_0= ruleCompartmentAttributes )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2664:3: lv_compartmentAttribute_1_0= ruleCompartmentAttributes
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDissimilarityEntryAccess().getCompartmentAttributeCompartmentAttributesEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompartmentAttributes_in_ruleDissimilarityEntry5686);
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
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2681:6: (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2681:6: (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2681:8: otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) )
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleDissimilarityEntry5706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDissimilarityEntryAccess().getBoxKeyword_1_0());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2685:1: ( (lv_boxAttribute_3_0= ruleBoxAttributes ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2686:1: (lv_boxAttribute_3_0= ruleBoxAttributes )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2686:1: (lv_boxAttribute_3_0= ruleBoxAttributes )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2687:3: lv_boxAttribute_3_0= ruleBoxAttributes
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDissimilarityEntryAccess().getBoxAttributeBoxAttributesEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBoxAttributes_in_ruleDissimilarityEntry5727);
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
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2704:6: (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2704:6: (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2704:8: otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) )
                    {
                    otherlv_4=(Token)match(input,70,FOLLOW_70_in_ruleDissimilarityEntry5747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDissimilarityEntryAccess().getBoardKeyword_2_0());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2708:1: ( (lv_boardAttribute_5_0= ruleBoardAttributes ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2709:1: (lv_boardAttribute_5_0= ruleBoardAttributes )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2709:1: (lv_boardAttribute_5_0= ruleBoardAttributes )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2710:3: lv_boardAttribute_5_0= ruleBoardAttributes
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDissimilarityEntryAccess().getBoardAttributeBoardAttributesEnumRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBoardAttributes_in_ruleDissimilarityEntry5768);
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
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2727:6: (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2727:6: (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2727:8: otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) )
                    {
                    otherlv_6=(Token)match(input,71,FOLLOW_71_in_ruleDissimilarityEntry5788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getDissimilarityEntryAccess().getProcessorKeyword_3_0());
                          
                    }
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2731:1: ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2732:1: (lv_processorAttribute_7_0= ruleProcessorAttributes )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2732:1: (lv_processorAttribute_7_0= ruleProcessorAttributes )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2733:3: lv_processorAttribute_7_0= ruleProcessorAttributes
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDissimilarityEntryAccess().getProcessorAttributeProcessorAttributesEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleProcessorAttributes_in_ruleDissimilarityEntry5809);
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2757:1: entryRuleMetricParameter returns [EObject current=null] : iv_ruleMetricParameter= ruleMetricParameter EOF ;
    public final EObject entryRuleMetricParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricParameter = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2758:2: (iv_ruleMetricParameter= ruleMetricParameter EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2759:2: iv_ruleMetricParameter= ruleMetricParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetricParameterRule()); 
            }
            pushFollow(FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter5846);
            iv_ruleMetricParameter=ruleMetricParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetricParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricParameter5856); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2766:1: ruleMetricParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) ;
    public final EObject ruleMetricParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2769:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2770:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2770:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2770:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2770:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2771:1: (lv_name_0_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2771:1: (lv_name_0_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2772:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetricParameter5898); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleMetricParameter5915); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMetricParameterAccess().getEqualsSignKeyword_1());
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2792:1: ( (lv_value_2_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2793:1: (lv_value_2_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2793:1: (lv_value_2_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2794:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMetricParameter5932); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleMetricParameter5949); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2822:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2823:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2824:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5986);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName5997); if (state.failed) return current;

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2831:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2834:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2835:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2835:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2835:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName6037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2842:1: (kw= '.' this_ID_2= RULE_ID )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==72) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2843:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,72,FOLLOW_72_in_ruleQualifiedName6056); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName6071); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop67;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2863:1: ruleCompartmentAttributes returns [Enumerator current=null] : ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'Side' ) | (enumLiteral_3= 'Zone' ) ) ;
    public final Enumerator ruleCompartmentAttributes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2865:28: ( ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'Side' ) | (enumLiteral_3= 'Zone' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2866:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'Side' ) | (enumLiteral_3= 'Zone' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2866:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'Side' ) | (enumLiteral_3= 'Zone' ) )
            int alt68=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt68=1;
                }
                break;
            case 73:
                {
                alt68=2;
                }
                break;
            case 24:
                {
                alt68=3;
                }
                break;
            case 25:
                {
                alt68=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2866:2: (enumLiteral_0= 'Manufacturer' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2866:2: (enumLiteral_0= 'Manufacturer' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2866:4: enumLiteral_0= 'Manufacturer'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_22_in_ruleCompartmentAttributes6132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompartmentAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompartmentAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2872:6: (enumLiteral_1= 'PowerSupply' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2872:6: (enumLiteral_1= 'PowerSupply' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2872:8: enumLiteral_1= 'PowerSupply'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_73_in_ruleCompartmentAttributes6149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompartmentAttributesAccess().getPOWERSUPPLYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompartmentAttributesAccess().getPOWERSUPPLYEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2878:6: (enumLiteral_2= 'Side' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2878:6: (enumLiteral_2= 'Side' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2878:8: enumLiteral_2= 'Side'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_24_in_ruleCompartmentAttributes6166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompartmentAttributesAccess().getSIDEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompartmentAttributesAccess().getSIDEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2884:6: (enumLiteral_3= 'Zone' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2884:6: (enumLiteral_3= 'Zone' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2884:8: enumLiteral_3= 'Zone'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_25_in_ruleCompartmentAttributes6183); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2894:1: ruleBoxAttributes returns [Enumerator current=null] : (enumLiteral_0= 'Manufacturer' ) ;
    public final Enumerator ruleBoxAttributes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2896:28: ( (enumLiteral_0= 'Manufacturer' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2897:1: (enumLiteral_0= 'Manufacturer' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2897:1: (enumLiteral_0= 'Manufacturer' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2897:3: enumLiteral_0= 'Manufacturer'
            {
            enumLiteral_0=(Token)match(input,22,FOLLOW_22_in_ruleBoxAttributes6227); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2907:1: ruleBoardAttributes returns [Enumerator current=null] : ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'AssuranceLevel' ) | (enumLiteral_3= 'BoardType' ) ) ;
    public final Enumerator ruleBoardAttributes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2909:28: ( ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'AssuranceLevel' ) | (enumLiteral_3= 'BoardType' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2910:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'AssuranceLevel' ) | (enumLiteral_3= 'BoardType' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2910:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'AssuranceLevel' ) | (enumLiteral_3= 'BoardType' ) )
            int alt69=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt69=1;
                }
                break;
            case 73:
                {
                alt69=2;
                }
                break;
            case 74:
                {
                alt69=3;
                }
                break;
            case 75:
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
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2910:2: (enumLiteral_0= 'Manufacturer' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2910:2: (enumLiteral_0= 'Manufacturer' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2910:4: enumLiteral_0= 'Manufacturer'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_22_in_ruleBoardAttributes6271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoardAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBoardAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2916:6: (enumLiteral_1= 'PowerSupply' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2916:6: (enumLiteral_1= 'PowerSupply' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2916:8: enumLiteral_1= 'PowerSupply'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_73_in_ruleBoardAttributes6288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoardAttributesAccess().getPOWERSUPPLYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBoardAttributesAccess().getPOWERSUPPLYEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2922:6: (enumLiteral_2= 'AssuranceLevel' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2922:6: (enumLiteral_2= 'AssuranceLevel' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2922:8: enumLiteral_2= 'AssuranceLevel'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_74_in_ruleBoardAttributes6305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoardAttributesAccess().getASSURANCELEVELEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getBoardAttributesAccess().getASSURANCELEVELEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2928:6: (enumLiteral_3= 'BoardType' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2928:6: (enumLiteral_3= 'BoardType' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2928:8: enumLiteral_3= 'BoardType'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_75_in_ruleBoardAttributes6322); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoardAttributesAccess().getBOARDTYPEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getBoardAttributesAccess().getBOARDTYPEEnumLiteralDeclaration_3()); 
                          
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2938:1: ruleProcessorAttributes returns [Enumerator current=null] : ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'ProcessorType' ) ) ;
    public final Enumerator ruleProcessorAttributes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2940:28: ( ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'ProcessorType' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2941:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'ProcessorType' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2941:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'ProcessorType' ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==22) ) {
                alt70=1;
            }
            else if ( (LA70_0==76) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2941:2: (enumLiteral_0= 'Manufacturer' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2941:2: (enumLiteral_0= 'Manufacturer' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2941:4: enumLiteral_0= 'Manufacturer'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_22_in_ruleProcessorAttributes6367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getProcessorAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getProcessorAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2947:6: (enumLiteral_1= 'ProcessorType' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2947:6: (enumLiteral_1= 'ProcessorType' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2947:8: enumLiteral_1= 'ProcessorType'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_76_in_ruleProcessorAttributes6384); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2957:1: ruleHardwareArchitectureLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'Core' ) | (enumLiteral_1= 'Processor' ) | (enumLiteral_2= 'Board' ) | (enumLiteral_3= 'Box' ) | (enumLiteral_4= 'Compartment' ) ) ;
    public final Enumerator ruleHardwareArchitectureLevelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2959:28: ( ( (enumLiteral_0= 'Core' ) | (enumLiteral_1= 'Processor' ) | (enumLiteral_2= 'Board' ) | (enumLiteral_3= 'Box' ) | (enumLiteral_4= 'Compartment' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2960:1: ( (enumLiteral_0= 'Core' ) | (enumLiteral_1= 'Processor' ) | (enumLiteral_2= 'Board' ) | (enumLiteral_3= 'Box' ) | (enumLiteral_4= 'Compartment' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2960:1: ( (enumLiteral_0= 'Core' ) | (enumLiteral_1= 'Processor' ) | (enumLiteral_2= 'Board' ) | (enumLiteral_3= 'Box' ) | (enumLiteral_4= 'Compartment' ) )
            int alt71=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt71=1;
                }
                break;
            case 33:
                {
                alt71=2;
                }
                break;
            case 28:
                {
                alt71=3;
                }
                break;
            case 27:
                {
                alt71=4;
                }
                break;
            case 21:
                {
                alt71=5;
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
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2960:2: (enumLiteral_0= 'Core' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2960:2: (enumLiteral_0= 'Core' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2960:4: enumLiteral_0= 'Core'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_34_in_ruleHardwareArchitectureLevelType6429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2966:6: (enumLiteral_1= 'Processor' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2966:6: (enumLiteral_1= 'Processor' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2966:8: enumLiteral_1= 'Processor'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_33_in_ruleHardwareArchitectureLevelType6446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getPROCESSOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getHardwareArchitectureLevelTypeAccess().getPROCESSOREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2972:6: (enumLiteral_2= 'Board' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2972:6: (enumLiteral_2= 'Board' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2972:8: enumLiteral_2= 'Board'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_28_in_ruleHardwareArchitectureLevelType6463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getBOARDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getHardwareArchitectureLevelTypeAccess().getBOARDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2978:6: (enumLiteral_3= 'Box' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2978:6: (enumLiteral_3= 'Box' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2978:8: enumLiteral_3= 'Box'
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_27_in_ruleHardwareArchitectureLevelType6480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getBOXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getHardwareArchitectureLevelTypeAccess().getBOXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2984:6: (enumLiteral_4= 'Compartment' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2984:6: (enumLiteral_4= 'Compartment' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2984:8: enumLiteral_4= 'Compartment'
                    {
                    enumLiteral_4=(Token)match(input,21,FOLLOW_21_in_ruleHardwareArchitectureLevelType6497); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2994:1: ruleDesignAssuranceLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'QS' ) | (enumLiteral_2= 'D' ) | (enumLiteral_3= 'C' ) | (enumLiteral_4= 'B' ) | (enumLiteral_5= 'A' ) ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2996:28: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'QS' ) | (enumLiteral_2= 'D' ) | (enumLiteral_3= 'C' ) | (enumLiteral_4= 'B' ) | (enumLiteral_5= 'A' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2997:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'QS' ) | (enumLiteral_2= 'D' ) | (enumLiteral_3= 'C' ) | (enumLiteral_4= 'B' ) | (enumLiteral_5= 'A' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2997:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'QS' ) | (enumLiteral_2= 'D' ) | (enumLiteral_3= 'C' ) | (enumLiteral_4= 'B' ) | (enumLiteral_5= 'A' ) )
            int alt72=6;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt72=1;
                }
                break;
            case 78:
                {
                alt72=2;
                }
                break;
            case 79:
                {
                alt72=3;
                }
                break;
            case 80:
                {
                alt72=4;
                }
                break;
            case 81:
                {
                alt72=5;
                }
                break;
            case 82:
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
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2997:2: (enumLiteral_0= 'None' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2997:2: (enumLiteral_0= 'None' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2997:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_77_in_ruleDesignAssuranceLevelType6542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDesignAssuranceLevelTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDesignAssuranceLevelTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3003:6: (enumLiteral_1= 'QS' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3003:6: (enumLiteral_1= 'QS' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3003:8: enumLiteral_1= 'QS'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_78_in_ruleDesignAssuranceLevelType6559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDesignAssuranceLevelTypeAccess().getQSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDesignAssuranceLevelTypeAccess().getQSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3009:6: (enumLiteral_2= 'D' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3009:6: (enumLiteral_2= 'D' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3009:8: enumLiteral_2= 'D'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_79_in_ruleDesignAssuranceLevelType6576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDesignAssuranceLevelTypeAccess().getDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getDesignAssuranceLevelTypeAccess().getDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3015:6: (enumLiteral_3= 'C' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3015:6: (enumLiteral_3= 'C' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3015:8: enumLiteral_3= 'C'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_80_in_ruleDesignAssuranceLevelType6593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDesignAssuranceLevelTypeAccess().getCEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getDesignAssuranceLevelTypeAccess().getCEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3021:6: (enumLiteral_4= 'B' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3021:6: (enumLiteral_4= 'B' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3021:8: enumLiteral_4= 'B'
                    {
                    enumLiteral_4=(Token)match(input,81,FOLLOW_81_in_ruleDesignAssuranceLevelType6610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDesignAssuranceLevelTypeAccess().getBEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getDesignAssuranceLevelTypeAccess().getBEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3027:6: (enumLiteral_5= 'A' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3027:6: (enumLiteral_5= 'A' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3027:8: enumLiteral_5= 'A'
                    {
                    enumLiteral_5=(Token)match(input,82,FOLLOW_82_in_ruleDesignAssuranceLevelType6627); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3037:1: ruleIOAdapterProtectionLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3039:28: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3040:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3040:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) )
            int alt73=9;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt73=1;
                }
                break;
            case 83:
                {
                alt73=2;
                }
                break;
            case 84:
                {
                alt73=3;
                }
                break;
            case 85:
                {
                alt73=4;
                }
                break;
            case 86:
                {
                alt73=5;
                }
                break;
            case 87:
                {
                alt73=6;
                }
                break;
            case 88:
                {
                alt73=7;
                }
                break;
            case 89:
                {
                alt73=8;
                }
                break;
            case 90:
                {
                alt73=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3040:2: (enumLiteral_0= 'None' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3040:2: (enumLiteral_0= 'None' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3040:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_77_in_ruleIOAdapterProtectionLevelType6672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3046:6: (enumLiteral_1= 'L1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3046:6: (enumLiteral_1= 'L1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3046:8: enumLiteral_1= 'L1'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_83_in_ruleIOAdapterProtectionLevelType6689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_1EnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3052:6: (enumLiteral_2= 'L2' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3052:6: (enumLiteral_2= 'L2' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3052:8: enumLiteral_2= 'L2'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_84_in_ruleIOAdapterProtectionLevelType6706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_2EnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3058:6: (enumLiteral_3= 'L3' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3058:6: (enumLiteral_3= 'L3' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3058:8: enumLiteral_3= 'L3'
                    {
                    enumLiteral_3=(Token)match(input,85,FOLLOW_85_in_ruleIOAdapterProtectionLevelType6723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_3EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_3EnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3064:6: (enumLiteral_4= 'L4' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3064:6: (enumLiteral_4= 'L4' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3064:8: enumLiteral_4= 'L4'
                    {
                    enumLiteral_4=(Token)match(input,86,FOLLOW_86_in_ruleIOAdapterProtectionLevelType6740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_4EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_4EnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3070:6: (enumLiteral_5= 'L5' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3070:6: (enumLiteral_5= 'L5' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3070:8: enumLiteral_5= 'L5'
                    {
                    enumLiteral_5=(Token)match(input,87,FOLLOW_87_in_ruleIOAdapterProtectionLevelType6757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_5EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_5EnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3076:6: (enumLiteral_6= 'L6' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3076:6: (enumLiteral_6= 'L6' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3076:8: enumLiteral_6= 'L6'
                    {
                    enumLiteral_6=(Token)match(input,88,FOLLOW_88_in_ruleIOAdapterProtectionLevelType6774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_6EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_6EnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3082:6: (enumLiteral_7= 'L7' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3082:6: (enumLiteral_7= 'L7' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3082:8: enumLiteral_7= 'L7'
                    {
                    enumLiteral_7=(Token)match(input,89,FOLLOW_89_in_ruleIOAdapterProtectionLevelType6791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_7EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_7EnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3088:6: (enumLiteral_8= 'L8' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3088:6: (enumLiteral_8= 'L8' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3088:8: enumLiteral_8= 'L8'
                    {
                    enumLiteral_8=(Token)match(input,90,FOLLOW_90_in_ruleIOAdapterProtectionLevelType6808); if (state.failed) return current;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3098:1: ruleIOAdapterType returns [Enumerator current=null] : ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'Custom-Type-0' ) | (enumLiteral_7= 'Custom-Type-1' ) | (enumLiteral_8= 'Custom-Type-2' ) | (enumLiteral_9= 'Custom-Type-3' ) | (enumLiteral_10= 'Custom-Type-4' ) | (enumLiteral_11= 'Custom-Type-5' ) | (enumLiteral_12= 'Custom-Type-6' ) | (enumLiteral_13= 'Custom-Type-7' ) | (enumLiteral_14= 'Custom-Type-8' ) | (enumLiteral_15= 'Custom-Type-9' ) | (enumLiteral_16= 'Custom-Type-10' ) | (enumLiteral_17= 'Custom-Type-11' ) | (enumLiteral_18= 'Custom-Type-12' ) | (enumLiteral_19= 'Custom-Type-13' ) | (enumLiteral_20= 'Custom-Type-14' ) | (enumLiteral_21= 'Custom-Type-15' ) | (enumLiteral_22= 'Custom-Type-16' ) | (enumLiteral_23= 'Custom-Type-17' ) | (enumLiteral_24= 'Custom-Type-18' ) | (enumLiteral_25= 'Custom-Type-19' ) | (enumLiteral_26= 'Custom-Type-20' ) | (enumLiteral_27= 'Custom-Type-21' ) | (enumLiteral_28= 'Custom-Type-22' ) | (enumLiteral_29= 'Custom-Type-23' ) | (enumLiteral_30= 'Custom-Type-24' ) | (enumLiteral_31= 'Custom-Type-25' ) | (enumLiteral_32= 'Custom-Type-26' ) | (enumLiteral_33= 'Custom-Type-27' ) | (enumLiteral_34= 'Custom-Type-28' ) | (enumLiteral_35= 'Custom-Type-29' ) | (enumLiteral_36= 'Custom-Type-30' ) | (enumLiteral_37= 'Custom-Type-31' ) | (enumLiteral_38= 'Custom-Type-32' ) | (enumLiteral_39= 'Custom-Type-33' ) | (enumLiteral_40= 'Custom-Type-34' ) | (enumLiteral_41= 'Custom-Type-35' ) | (enumLiteral_42= 'Custom-Type-36' ) | (enumLiteral_43= 'Custom-Type-37' ) | (enumLiteral_44= 'Custom-Type-38' ) | (enumLiteral_45= 'Custom-Type-39' ) ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3100:28: ( ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'Custom-Type-0' ) | (enumLiteral_7= 'Custom-Type-1' ) | (enumLiteral_8= 'Custom-Type-2' ) | (enumLiteral_9= 'Custom-Type-3' ) | (enumLiteral_10= 'Custom-Type-4' ) | (enumLiteral_11= 'Custom-Type-5' ) | (enumLiteral_12= 'Custom-Type-6' ) | (enumLiteral_13= 'Custom-Type-7' ) | (enumLiteral_14= 'Custom-Type-8' ) | (enumLiteral_15= 'Custom-Type-9' ) | (enumLiteral_16= 'Custom-Type-10' ) | (enumLiteral_17= 'Custom-Type-11' ) | (enumLiteral_18= 'Custom-Type-12' ) | (enumLiteral_19= 'Custom-Type-13' ) | (enumLiteral_20= 'Custom-Type-14' ) | (enumLiteral_21= 'Custom-Type-15' ) | (enumLiteral_22= 'Custom-Type-16' ) | (enumLiteral_23= 'Custom-Type-17' ) | (enumLiteral_24= 'Custom-Type-18' ) | (enumLiteral_25= 'Custom-Type-19' ) | (enumLiteral_26= 'Custom-Type-20' ) | (enumLiteral_27= 'Custom-Type-21' ) | (enumLiteral_28= 'Custom-Type-22' ) | (enumLiteral_29= 'Custom-Type-23' ) | (enumLiteral_30= 'Custom-Type-24' ) | (enumLiteral_31= 'Custom-Type-25' ) | (enumLiteral_32= 'Custom-Type-26' ) | (enumLiteral_33= 'Custom-Type-27' ) | (enumLiteral_34= 'Custom-Type-28' ) | (enumLiteral_35= 'Custom-Type-29' ) | (enumLiteral_36= 'Custom-Type-30' ) | (enumLiteral_37= 'Custom-Type-31' ) | (enumLiteral_38= 'Custom-Type-32' ) | (enumLiteral_39= 'Custom-Type-33' ) | (enumLiteral_40= 'Custom-Type-34' ) | (enumLiteral_41= 'Custom-Type-35' ) | (enumLiteral_42= 'Custom-Type-36' ) | (enumLiteral_43= 'Custom-Type-37' ) | (enumLiteral_44= 'Custom-Type-38' ) | (enumLiteral_45= 'Custom-Type-39' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3101:1: ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'Custom-Type-0' ) | (enumLiteral_7= 'Custom-Type-1' ) | (enumLiteral_8= 'Custom-Type-2' ) | (enumLiteral_9= 'Custom-Type-3' ) | (enumLiteral_10= 'Custom-Type-4' ) | (enumLiteral_11= 'Custom-Type-5' ) | (enumLiteral_12= 'Custom-Type-6' ) | (enumLiteral_13= 'Custom-Type-7' ) | (enumLiteral_14= 'Custom-Type-8' ) | (enumLiteral_15= 'Custom-Type-9' ) | (enumLiteral_16= 'Custom-Type-10' ) | (enumLiteral_17= 'Custom-Type-11' ) | (enumLiteral_18= 'Custom-Type-12' ) | (enumLiteral_19= 'Custom-Type-13' ) | (enumLiteral_20= 'Custom-Type-14' ) | (enumLiteral_21= 'Custom-Type-15' ) | (enumLiteral_22= 'Custom-Type-16' ) | (enumLiteral_23= 'Custom-Type-17' ) | (enumLiteral_24= 'Custom-Type-18' ) | (enumLiteral_25= 'Custom-Type-19' ) | (enumLiteral_26= 'Custom-Type-20' ) | (enumLiteral_27= 'Custom-Type-21' ) | (enumLiteral_28= 'Custom-Type-22' ) | (enumLiteral_29= 'Custom-Type-23' ) | (enumLiteral_30= 'Custom-Type-24' ) | (enumLiteral_31= 'Custom-Type-25' ) | (enumLiteral_32= 'Custom-Type-26' ) | (enumLiteral_33= 'Custom-Type-27' ) | (enumLiteral_34= 'Custom-Type-28' ) | (enumLiteral_35= 'Custom-Type-29' ) | (enumLiteral_36= 'Custom-Type-30' ) | (enumLiteral_37= 'Custom-Type-31' ) | (enumLiteral_38= 'Custom-Type-32' ) | (enumLiteral_39= 'Custom-Type-33' ) | (enumLiteral_40= 'Custom-Type-34' ) | (enumLiteral_41= 'Custom-Type-35' ) | (enumLiteral_42= 'Custom-Type-36' ) | (enumLiteral_43= 'Custom-Type-37' ) | (enumLiteral_44= 'Custom-Type-38' ) | (enumLiteral_45= 'Custom-Type-39' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3101:1: ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'Custom-Type-0' ) | (enumLiteral_7= 'Custom-Type-1' ) | (enumLiteral_8= 'Custom-Type-2' ) | (enumLiteral_9= 'Custom-Type-3' ) | (enumLiteral_10= 'Custom-Type-4' ) | (enumLiteral_11= 'Custom-Type-5' ) | (enumLiteral_12= 'Custom-Type-6' ) | (enumLiteral_13= 'Custom-Type-7' ) | (enumLiteral_14= 'Custom-Type-8' ) | (enumLiteral_15= 'Custom-Type-9' ) | (enumLiteral_16= 'Custom-Type-10' ) | (enumLiteral_17= 'Custom-Type-11' ) | (enumLiteral_18= 'Custom-Type-12' ) | (enumLiteral_19= 'Custom-Type-13' ) | (enumLiteral_20= 'Custom-Type-14' ) | (enumLiteral_21= 'Custom-Type-15' ) | (enumLiteral_22= 'Custom-Type-16' ) | (enumLiteral_23= 'Custom-Type-17' ) | (enumLiteral_24= 'Custom-Type-18' ) | (enumLiteral_25= 'Custom-Type-19' ) | (enumLiteral_26= 'Custom-Type-20' ) | (enumLiteral_27= 'Custom-Type-21' ) | (enumLiteral_28= 'Custom-Type-22' ) | (enumLiteral_29= 'Custom-Type-23' ) | (enumLiteral_30= 'Custom-Type-24' ) | (enumLiteral_31= 'Custom-Type-25' ) | (enumLiteral_32= 'Custom-Type-26' ) | (enumLiteral_33= 'Custom-Type-27' ) | (enumLiteral_34= 'Custom-Type-28' ) | (enumLiteral_35= 'Custom-Type-29' ) | (enumLiteral_36= 'Custom-Type-30' ) | (enumLiteral_37= 'Custom-Type-31' ) | (enumLiteral_38= 'Custom-Type-32' ) | (enumLiteral_39= 'Custom-Type-33' ) | (enumLiteral_40= 'Custom-Type-34' ) | (enumLiteral_41= 'Custom-Type-35' ) | (enumLiteral_42= 'Custom-Type-36' ) | (enumLiteral_43= 'Custom-Type-37' ) | (enumLiteral_44= 'Custom-Type-38' ) | (enumLiteral_45= 'Custom-Type-39' ) )
            int alt74=46;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt74=1;
                }
                break;
            case 92:
                {
                alt74=2;
                }
                break;
            case 93:
                {
                alt74=3;
                }
                break;
            case 94:
                {
                alt74=4;
                }
                break;
            case 95:
                {
                alt74=5;
                }
                break;
            case 96:
                {
                alt74=6;
                }
                break;
            case 97:
                {
                alt74=7;
                }
                break;
            case 98:
                {
                alt74=8;
                }
                break;
            case 99:
                {
                alt74=9;
                }
                break;
            case 100:
                {
                alt74=10;
                }
                break;
            case 101:
                {
                alt74=11;
                }
                break;
            case 102:
                {
                alt74=12;
                }
                break;
            case 103:
                {
                alt74=13;
                }
                break;
            case 104:
                {
                alt74=14;
                }
                break;
            case 105:
                {
                alt74=15;
                }
                break;
            case 106:
                {
                alt74=16;
                }
                break;
            case 107:
                {
                alt74=17;
                }
                break;
            case 108:
                {
                alt74=18;
                }
                break;
            case 109:
                {
                alt74=19;
                }
                break;
            case 110:
                {
                alt74=20;
                }
                break;
            case 111:
                {
                alt74=21;
                }
                break;
            case 112:
                {
                alt74=22;
                }
                break;
            case 113:
                {
                alt74=23;
                }
                break;
            case 114:
                {
                alt74=24;
                }
                break;
            case 115:
                {
                alt74=25;
                }
                break;
            case 116:
                {
                alt74=26;
                }
                break;
            case 117:
                {
                alt74=27;
                }
                break;
            case 118:
                {
                alt74=28;
                }
                break;
            case 119:
                {
                alt74=29;
                }
                break;
            case 120:
                {
                alt74=30;
                }
                break;
            case 121:
                {
                alt74=31;
                }
                break;
            case 122:
                {
                alt74=32;
                }
                break;
            case 123:
                {
                alt74=33;
                }
                break;
            case 124:
                {
                alt74=34;
                }
                break;
            case 125:
                {
                alt74=35;
                }
                break;
            case 126:
                {
                alt74=36;
                }
                break;
            case 127:
                {
                alt74=37;
                }
                break;
            case 128:
                {
                alt74=38;
                }
                break;
            case 129:
                {
                alt74=39;
                }
                break;
            case 130:
                {
                alt74=40;
                }
                break;
            case 131:
                {
                alt74=41;
                }
                break;
            case 132:
                {
                alt74=42;
                }
                break;
            case 133:
                {
                alt74=43;
                }
                break;
            case 134:
                {
                alt74=44;
                }
                break;
            case 135:
                {
                alt74=45;
                }
                break;
            case 136:
                {
                alt74=46;
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
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3101:2: (enumLiteral_0= 'Can' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3101:2: (enumLiteral_0= 'Can' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3101:4: enumLiteral_0= 'Can'
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_91_in_ruleIOAdapterType6853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getIOAdapterTypeAccess().getCANEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3107:6: (enumLiteral_1= 'Enhanced Local Bus' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3107:6: (enumLiteral_1= 'Enhanced Local Bus' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3107:8: enumLiteral_1= 'Enhanced Local Bus'
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_92_in_ruleIOAdapterType6870); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getELBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getIOAdapterTypeAccess().getELBEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3113:6: (enumLiteral_2= 'Ethernet' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3113:6: (enumLiteral_2= 'Ethernet' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3113:8: enumLiteral_2= 'Ethernet'
                    {
                    enumLiteral_2=(Token)match(input,93,FOLLOW_93_in_ruleIOAdapterType6887); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getETHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getIOAdapterTypeAccess().getETHEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3119:6: (enumLiteral_3= 'Analog' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3119:6: (enumLiteral_3= 'Analog' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3119:8: enumLiteral_3= 'Analog'
                    {
                    enumLiteral_3=(Token)match(input,94,FOLLOW_94_in_ruleIOAdapterType6904); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getANALOGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getIOAdapterTypeAccess().getANALOGEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3125:6: (enumLiteral_4= 'Digital' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3125:6: (enumLiteral_4= 'Digital' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3125:8: enumLiteral_4= 'Digital'
                    {
                    enumLiteral_4=(Token)match(input,95,FOLLOW_95_in_ruleIOAdapterType6921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getDIGITALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getIOAdapterTypeAccess().getDIGITALEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3131:6: (enumLiteral_5= 'Serial' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3131:6: (enumLiteral_5= 'Serial' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3131:8: enumLiteral_5= 'Serial'
                    {
                    enumLiteral_5=(Token)match(input,96,FOLLOW_96_in_ruleIOAdapterType6938); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getSERIALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getIOAdapterTypeAccess().getSERIALEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3137:6: (enumLiteral_6= 'Custom-Type-0' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3137:6: (enumLiteral_6= 'Custom-Type-0' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3137:8: enumLiteral_6= 'Custom-Type-0'
                    {
                    enumLiteral_6=(Token)match(input,97,FOLLOW_97_in_ruleIOAdapterType6955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM0EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getIOAdapterTypeAccess().getCUSTOM0EnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3143:6: (enumLiteral_7= 'Custom-Type-1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3143:6: (enumLiteral_7= 'Custom-Type-1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3143:8: enumLiteral_7= 'Custom-Type-1'
                    {
                    enumLiteral_7=(Token)match(input,98,FOLLOW_98_in_ruleIOAdapterType6972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM1EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getIOAdapterTypeAccess().getCUSTOM1EnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3149:6: (enumLiteral_8= 'Custom-Type-2' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3149:6: (enumLiteral_8= 'Custom-Type-2' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3149:8: enumLiteral_8= 'Custom-Type-2'
                    {
                    enumLiteral_8=(Token)match(input,99,FOLLOW_99_in_ruleIOAdapterType6989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM2EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getIOAdapterTypeAccess().getCUSTOM2EnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3155:6: (enumLiteral_9= 'Custom-Type-3' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3155:6: (enumLiteral_9= 'Custom-Type-3' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3155:8: enumLiteral_9= 'Custom-Type-3'
                    {
                    enumLiteral_9=(Token)match(input,100,FOLLOW_100_in_ruleIOAdapterType7006); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM3EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getIOAdapterTypeAccess().getCUSTOM3EnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3161:6: (enumLiteral_10= 'Custom-Type-4' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3161:6: (enumLiteral_10= 'Custom-Type-4' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3161:8: enumLiteral_10= 'Custom-Type-4'
                    {
                    enumLiteral_10=(Token)match(input,101,FOLLOW_101_in_ruleIOAdapterType7023); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM4EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getIOAdapterTypeAccess().getCUSTOM4EnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3167:6: (enumLiteral_11= 'Custom-Type-5' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3167:6: (enumLiteral_11= 'Custom-Type-5' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3167:8: enumLiteral_11= 'Custom-Type-5'
                    {
                    enumLiteral_11=(Token)match(input,102,FOLLOW_102_in_ruleIOAdapterType7040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM5EnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getIOAdapterTypeAccess().getCUSTOM5EnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3173:6: (enumLiteral_12= 'Custom-Type-6' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3173:6: (enumLiteral_12= 'Custom-Type-6' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3173:8: enumLiteral_12= 'Custom-Type-6'
                    {
                    enumLiteral_12=(Token)match(input,103,FOLLOW_103_in_ruleIOAdapterType7057); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM6EnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getIOAdapterTypeAccess().getCUSTOM6EnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3179:6: (enumLiteral_13= 'Custom-Type-7' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3179:6: (enumLiteral_13= 'Custom-Type-7' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3179:8: enumLiteral_13= 'Custom-Type-7'
                    {
                    enumLiteral_13=(Token)match(input,104,FOLLOW_104_in_ruleIOAdapterType7074); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM7EnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getIOAdapterTypeAccess().getCUSTOM7EnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3185:6: (enumLiteral_14= 'Custom-Type-8' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3185:6: (enumLiteral_14= 'Custom-Type-8' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3185:8: enumLiteral_14= 'Custom-Type-8'
                    {
                    enumLiteral_14=(Token)match(input,105,FOLLOW_105_in_ruleIOAdapterType7091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM8EnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getIOAdapterTypeAccess().getCUSTOM8EnumLiteralDeclaration_14()); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3191:6: (enumLiteral_15= 'Custom-Type-9' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3191:6: (enumLiteral_15= 'Custom-Type-9' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3191:8: enumLiteral_15= 'Custom-Type-9'
                    {
                    enumLiteral_15=(Token)match(input,106,FOLLOW_106_in_ruleIOAdapterType7108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM9EnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_15, grammarAccess.getIOAdapterTypeAccess().getCUSTOM9EnumLiteralDeclaration_15()); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3197:6: (enumLiteral_16= 'Custom-Type-10' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3197:6: (enumLiteral_16= 'Custom-Type-10' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3197:8: enumLiteral_16= 'Custom-Type-10'
                    {
                    enumLiteral_16=(Token)match(input,107,FOLLOW_107_in_ruleIOAdapterType7125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM10EnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_16, grammarAccess.getIOAdapterTypeAccess().getCUSTOM10EnumLiteralDeclaration_16()); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3203:6: (enumLiteral_17= 'Custom-Type-11' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3203:6: (enumLiteral_17= 'Custom-Type-11' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3203:8: enumLiteral_17= 'Custom-Type-11'
                    {
                    enumLiteral_17=(Token)match(input,108,FOLLOW_108_in_ruleIOAdapterType7142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM11EnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_17, grammarAccess.getIOAdapterTypeAccess().getCUSTOM11EnumLiteralDeclaration_17()); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3209:6: (enumLiteral_18= 'Custom-Type-12' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3209:6: (enumLiteral_18= 'Custom-Type-12' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3209:8: enumLiteral_18= 'Custom-Type-12'
                    {
                    enumLiteral_18=(Token)match(input,109,FOLLOW_109_in_ruleIOAdapterType7159); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM12EnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_18, grammarAccess.getIOAdapterTypeAccess().getCUSTOM12EnumLiteralDeclaration_18()); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3215:6: (enumLiteral_19= 'Custom-Type-13' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3215:6: (enumLiteral_19= 'Custom-Type-13' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3215:8: enumLiteral_19= 'Custom-Type-13'
                    {
                    enumLiteral_19=(Token)match(input,110,FOLLOW_110_in_ruleIOAdapterType7176); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM13EnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_19, grammarAccess.getIOAdapterTypeAccess().getCUSTOM13EnumLiteralDeclaration_19()); 
                          
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3221:6: (enumLiteral_20= 'Custom-Type-14' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3221:6: (enumLiteral_20= 'Custom-Type-14' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3221:8: enumLiteral_20= 'Custom-Type-14'
                    {
                    enumLiteral_20=(Token)match(input,111,FOLLOW_111_in_ruleIOAdapterType7193); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM14EnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_20, grammarAccess.getIOAdapterTypeAccess().getCUSTOM14EnumLiteralDeclaration_20()); 
                          
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3227:6: (enumLiteral_21= 'Custom-Type-15' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3227:6: (enumLiteral_21= 'Custom-Type-15' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3227:8: enumLiteral_21= 'Custom-Type-15'
                    {
                    enumLiteral_21=(Token)match(input,112,FOLLOW_112_in_ruleIOAdapterType7210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM15EnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_21, grammarAccess.getIOAdapterTypeAccess().getCUSTOM15EnumLiteralDeclaration_21()); 
                          
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3233:6: (enumLiteral_22= 'Custom-Type-16' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3233:6: (enumLiteral_22= 'Custom-Type-16' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3233:8: enumLiteral_22= 'Custom-Type-16'
                    {
                    enumLiteral_22=(Token)match(input,113,FOLLOW_113_in_ruleIOAdapterType7227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM16EnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_22, grammarAccess.getIOAdapterTypeAccess().getCUSTOM16EnumLiteralDeclaration_22()); 
                          
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3239:6: (enumLiteral_23= 'Custom-Type-17' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3239:6: (enumLiteral_23= 'Custom-Type-17' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3239:8: enumLiteral_23= 'Custom-Type-17'
                    {
                    enumLiteral_23=(Token)match(input,114,FOLLOW_114_in_ruleIOAdapterType7244); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM17EnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_23, grammarAccess.getIOAdapterTypeAccess().getCUSTOM17EnumLiteralDeclaration_23()); 
                          
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3245:6: (enumLiteral_24= 'Custom-Type-18' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3245:6: (enumLiteral_24= 'Custom-Type-18' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3245:8: enumLiteral_24= 'Custom-Type-18'
                    {
                    enumLiteral_24=(Token)match(input,115,FOLLOW_115_in_ruleIOAdapterType7261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM18EnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_24, grammarAccess.getIOAdapterTypeAccess().getCUSTOM18EnumLiteralDeclaration_24()); 
                          
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3251:6: (enumLiteral_25= 'Custom-Type-19' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3251:6: (enumLiteral_25= 'Custom-Type-19' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3251:8: enumLiteral_25= 'Custom-Type-19'
                    {
                    enumLiteral_25=(Token)match(input,116,FOLLOW_116_in_ruleIOAdapterType7278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM19EnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_25, grammarAccess.getIOAdapterTypeAccess().getCUSTOM19EnumLiteralDeclaration_25()); 
                          
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3257:6: (enumLiteral_26= 'Custom-Type-20' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3257:6: (enumLiteral_26= 'Custom-Type-20' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3257:8: enumLiteral_26= 'Custom-Type-20'
                    {
                    enumLiteral_26=(Token)match(input,117,FOLLOW_117_in_ruleIOAdapterType7295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM20EnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_26, grammarAccess.getIOAdapterTypeAccess().getCUSTOM20EnumLiteralDeclaration_26()); 
                          
                    }

                    }


                    }
                    break;
                case 28 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3263:6: (enumLiteral_27= 'Custom-Type-21' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3263:6: (enumLiteral_27= 'Custom-Type-21' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3263:8: enumLiteral_27= 'Custom-Type-21'
                    {
                    enumLiteral_27=(Token)match(input,118,FOLLOW_118_in_ruleIOAdapterType7312); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM21EnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_27, grammarAccess.getIOAdapterTypeAccess().getCUSTOM21EnumLiteralDeclaration_27()); 
                          
                    }

                    }


                    }
                    break;
                case 29 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3269:6: (enumLiteral_28= 'Custom-Type-22' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3269:6: (enumLiteral_28= 'Custom-Type-22' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3269:8: enumLiteral_28= 'Custom-Type-22'
                    {
                    enumLiteral_28=(Token)match(input,119,FOLLOW_119_in_ruleIOAdapterType7329); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM22EnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_28, grammarAccess.getIOAdapterTypeAccess().getCUSTOM22EnumLiteralDeclaration_28()); 
                          
                    }

                    }


                    }
                    break;
                case 30 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3275:6: (enumLiteral_29= 'Custom-Type-23' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3275:6: (enumLiteral_29= 'Custom-Type-23' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3275:8: enumLiteral_29= 'Custom-Type-23'
                    {
                    enumLiteral_29=(Token)match(input,120,FOLLOW_120_in_ruleIOAdapterType7346); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM23EnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_29, grammarAccess.getIOAdapterTypeAccess().getCUSTOM23EnumLiteralDeclaration_29()); 
                          
                    }

                    }


                    }
                    break;
                case 31 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3281:6: (enumLiteral_30= 'Custom-Type-24' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3281:6: (enumLiteral_30= 'Custom-Type-24' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3281:8: enumLiteral_30= 'Custom-Type-24'
                    {
                    enumLiteral_30=(Token)match(input,121,FOLLOW_121_in_ruleIOAdapterType7363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM24EnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_30, grammarAccess.getIOAdapterTypeAccess().getCUSTOM24EnumLiteralDeclaration_30()); 
                          
                    }

                    }


                    }
                    break;
                case 32 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3287:6: (enumLiteral_31= 'Custom-Type-25' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3287:6: (enumLiteral_31= 'Custom-Type-25' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3287:8: enumLiteral_31= 'Custom-Type-25'
                    {
                    enumLiteral_31=(Token)match(input,122,FOLLOW_122_in_ruleIOAdapterType7380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM25EnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_31, grammarAccess.getIOAdapterTypeAccess().getCUSTOM25EnumLiteralDeclaration_31()); 
                          
                    }

                    }


                    }
                    break;
                case 33 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3293:6: (enumLiteral_32= 'Custom-Type-26' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3293:6: (enumLiteral_32= 'Custom-Type-26' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3293:8: enumLiteral_32= 'Custom-Type-26'
                    {
                    enumLiteral_32=(Token)match(input,123,FOLLOW_123_in_ruleIOAdapterType7397); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM26EnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_32, grammarAccess.getIOAdapterTypeAccess().getCUSTOM26EnumLiteralDeclaration_32()); 
                          
                    }

                    }


                    }
                    break;
                case 34 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3299:6: (enumLiteral_33= 'Custom-Type-27' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3299:6: (enumLiteral_33= 'Custom-Type-27' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3299:8: enumLiteral_33= 'Custom-Type-27'
                    {
                    enumLiteral_33=(Token)match(input,124,FOLLOW_124_in_ruleIOAdapterType7414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM27EnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_33, grammarAccess.getIOAdapterTypeAccess().getCUSTOM27EnumLiteralDeclaration_33()); 
                          
                    }

                    }


                    }
                    break;
                case 35 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3305:6: (enumLiteral_34= 'Custom-Type-28' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3305:6: (enumLiteral_34= 'Custom-Type-28' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3305:8: enumLiteral_34= 'Custom-Type-28'
                    {
                    enumLiteral_34=(Token)match(input,125,FOLLOW_125_in_ruleIOAdapterType7431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM28EnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_34, grammarAccess.getIOAdapterTypeAccess().getCUSTOM28EnumLiteralDeclaration_34()); 
                          
                    }

                    }


                    }
                    break;
                case 36 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3311:6: (enumLiteral_35= 'Custom-Type-29' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3311:6: (enumLiteral_35= 'Custom-Type-29' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3311:8: enumLiteral_35= 'Custom-Type-29'
                    {
                    enumLiteral_35=(Token)match(input,126,FOLLOW_126_in_ruleIOAdapterType7448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM29EnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_35, grammarAccess.getIOAdapterTypeAccess().getCUSTOM29EnumLiteralDeclaration_35()); 
                          
                    }

                    }


                    }
                    break;
                case 37 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3317:6: (enumLiteral_36= 'Custom-Type-30' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3317:6: (enumLiteral_36= 'Custom-Type-30' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3317:8: enumLiteral_36= 'Custom-Type-30'
                    {
                    enumLiteral_36=(Token)match(input,127,FOLLOW_127_in_ruleIOAdapterType7465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM30EnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_36, grammarAccess.getIOAdapterTypeAccess().getCUSTOM30EnumLiteralDeclaration_36()); 
                          
                    }

                    }


                    }
                    break;
                case 38 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3323:6: (enumLiteral_37= 'Custom-Type-31' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3323:6: (enumLiteral_37= 'Custom-Type-31' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3323:8: enumLiteral_37= 'Custom-Type-31'
                    {
                    enumLiteral_37=(Token)match(input,128,FOLLOW_128_in_ruleIOAdapterType7482); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM31EnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_37, grammarAccess.getIOAdapterTypeAccess().getCUSTOM31EnumLiteralDeclaration_37()); 
                          
                    }

                    }


                    }
                    break;
                case 39 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3329:6: (enumLiteral_38= 'Custom-Type-32' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3329:6: (enumLiteral_38= 'Custom-Type-32' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3329:8: enumLiteral_38= 'Custom-Type-32'
                    {
                    enumLiteral_38=(Token)match(input,129,FOLLOW_129_in_ruleIOAdapterType7499); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM32EnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_38, grammarAccess.getIOAdapterTypeAccess().getCUSTOM32EnumLiteralDeclaration_38()); 
                          
                    }

                    }


                    }
                    break;
                case 40 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3335:6: (enumLiteral_39= 'Custom-Type-33' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3335:6: (enumLiteral_39= 'Custom-Type-33' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3335:8: enumLiteral_39= 'Custom-Type-33'
                    {
                    enumLiteral_39=(Token)match(input,130,FOLLOW_130_in_ruleIOAdapterType7516); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM33EnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_39, grammarAccess.getIOAdapterTypeAccess().getCUSTOM33EnumLiteralDeclaration_39()); 
                          
                    }

                    }


                    }
                    break;
                case 41 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3341:6: (enumLiteral_40= 'Custom-Type-34' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3341:6: (enumLiteral_40= 'Custom-Type-34' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3341:8: enumLiteral_40= 'Custom-Type-34'
                    {
                    enumLiteral_40=(Token)match(input,131,FOLLOW_131_in_ruleIOAdapterType7533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM34EnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_40, grammarAccess.getIOAdapterTypeAccess().getCUSTOM34EnumLiteralDeclaration_40()); 
                          
                    }

                    }


                    }
                    break;
                case 42 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3347:6: (enumLiteral_41= 'Custom-Type-35' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3347:6: (enumLiteral_41= 'Custom-Type-35' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3347:8: enumLiteral_41= 'Custom-Type-35'
                    {
                    enumLiteral_41=(Token)match(input,132,FOLLOW_132_in_ruleIOAdapterType7550); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM35EnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_41, grammarAccess.getIOAdapterTypeAccess().getCUSTOM35EnumLiteralDeclaration_41()); 
                          
                    }

                    }


                    }
                    break;
                case 43 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3353:6: (enumLiteral_42= 'Custom-Type-36' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3353:6: (enumLiteral_42= 'Custom-Type-36' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3353:8: enumLiteral_42= 'Custom-Type-36'
                    {
                    enumLiteral_42=(Token)match(input,133,FOLLOW_133_in_ruleIOAdapterType7567); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM36EnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_42, grammarAccess.getIOAdapterTypeAccess().getCUSTOM36EnumLiteralDeclaration_42()); 
                          
                    }

                    }


                    }
                    break;
                case 44 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3359:6: (enumLiteral_43= 'Custom-Type-37' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3359:6: (enumLiteral_43= 'Custom-Type-37' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3359:8: enumLiteral_43= 'Custom-Type-37'
                    {
                    enumLiteral_43=(Token)match(input,134,FOLLOW_134_in_ruleIOAdapterType7584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM37EnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_43, grammarAccess.getIOAdapterTypeAccess().getCUSTOM37EnumLiteralDeclaration_43()); 
                          
                    }

                    }


                    }
                    break;
                case 45 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3365:6: (enumLiteral_44= 'Custom-Type-38' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3365:6: (enumLiteral_44= 'Custom-Type-38' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3365:8: enumLiteral_44= 'Custom-Type-38'
                    {
                    enumLiteral_44=(Token)match(input,135,FOLLOW_135_in_ruleIOAdapterType7601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM38EnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_44, grammarAccess.getIOAdapterTypeAccess().getCUSTOM38EnumLiteralDeclaration_44()); 
                          
                    }

                    }


                    }
                    break;
                case 46 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3371:6: (enumLiteral_45= 'Custom-Type-39' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3371:6: (enumLiteral_45= 'Custom-Type-39' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3371:8: enumLiteral_45= 'Custom-Type-39'
                    {
                    enumLiteral_45=(Token)match(input,136,FOLLOW_136_in_ruleIOAdapterType7618); if (state.failed) return current;
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
        // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2492:3: ( ruleDissimilarityDisjunction )
        // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2492:5: ruleDissimilarityDisjunction
        {
        pushFollow(FOLLOW_ruleDissimilarityDisjunction_in_synpred1_InternalMappingDSL5268);
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
    static final String DFA5_eotS =
        "\6\uffff";
    static final String DFA5_eofS =
        "\6\uffff";
    static final String DFA5_minS =
        "\1\5\1\54\1\uffff\1\5\1\54\1\uffff";
    static final String DFA5_maxS =
        "\1\20\1\74\1\uffff\1\5\1\77\1\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\2\uffff\1\1";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\12\uffff\1\2",
            "\1\3\16\uffff\2\2",
            "",
            "\1\4",
            "\1\3\16\uffff\2\2\2\uffff\1\5",
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
        "\1\20\1\74\1\uffff\1\5\1\uffff\1\74";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA6_specialS =
        "\6\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\12\uffff\1\2",
            "\1\3\16\uffff\1\4\1\2",
            "",
            "\1\5",
            "",
            "\1\3\16\uffff\1\4\1\2"
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
    public static final BitSet FOLLOW_12_in_ruleAssistModel228 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_ruleHardwareElementContainer_in_ruleAssistModel249 = new BitSet(new long[]{0x0000020018210000L});
    public static final BitSet FOLLOW_ruleNetwork_in_ruleAssistModel271 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel284 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssistModel296 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel308 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleAssistModel329 = new BitSet(new long[]{0x0000600000010000L});
    public static final BitSet FOLLOW_ruleApplicationGroup_in_ruleAssistModel351 = new BitSet(new long[]{0x0000200000010000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel364 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_ruleAssistModel377 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel389 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleDissimilarityRelation_in_ruleAssistModel410 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_ruleAssistModel432 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleProximityRelation_in_ruleAssistModel454 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel467 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleAssistModel482 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel494 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleCommunicationRelation_in_ruleAssistModel515 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHardwareElementContainer_in_entryRuleHardwareElementContainer566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHardwareElementContainer576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartment_in_ruleHardwareElementContainer623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBox_in_ruleHardwareElementContainer650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoard_in_ruleHardwareElementContainer677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartment_in_entryRuleCompartment712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartment722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCompartment759 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompartment776 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompartment793 = new BitSet(new long[]{0x000000000BC00000L});
    public static final BitSet FOLLOW_22_in_ruleCompartment806 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment835 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment852 = new BitSet(new long[]{0x000000000B800000L});
    public static final BitSet FOLLOW_23_in_ruleCompartment867 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment896 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment913 = new BitSet(new long[]{0x000000000B000000L});
    public static final BitSet FOLLOW_24_in_ruleCompartment928 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment957 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment974 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_25_in_ruleCompartment989 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment1001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment1018 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment1035 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleBox_in_ruleCompartment1058 = new BitSet(new long[]{0x000000000C010000L});
    public static final BitSet FOLLOW_26_in_ruleCompartment1072 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompartment1084 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleCompartment1105 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleCompartment1118 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCompartment1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBox_in_entryRuleBox1168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBox1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBox1215 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBox1232 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBox1249 = new BitSet(new long[]{0x0000000018600000L});
    public static final BitSet FOLLOW_22_in_ruleBox1262 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBox1274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBox1291 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBox1308 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_ruleBoard_in_ruleBox1331 = new BitSet(new long[]{0x000000001C210000L});
    public static final BitSet FOLLOW_26_in_ruleBox1345 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBox1357 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleBox1378 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleBox1391 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBox1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoard_in_entryRuleBoard1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoard1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBoard1488 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBoard1505 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBoard1522 = new BitSet(new long[]{0x0000000260C00000L});
    public static final BitSet FOLLOW_22_in_ruleBoard1535 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBoard1547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBoard1564 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBoard1581 = new BitSet(new long[]{0x0000000260C00000L});
    public static final BitSet FOLLOW_29_in_ruleBoard1596 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBoard1608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBoard1625 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBoard1642 = new BitSet(new long[]{0x0000000260C00000L});
    public static final BitSet FOLLOW_23_in_ruleBoard1657 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBoard1669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBoard1686 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBoard1703 = new BitSet(new long[]{0x0000000260C00000L});
    public static final BitSet FOLLOW_30_in_ruleBoard1718 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBoard1730 = new BitSet(new long[]{0x0000000000000000L,0x000000000007E000L});
    public static final BitSet FOLLOW_ruleDesignAssuranceLevelType_in_ruleBoard1751 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBoard1763 = new BitSet(new long[]{0x0000000260C00000L});
    public static final BitSet FOLLOW_ruleProcessor_in_ruleBoard1786 = new BitSet(new long[]{0x00000023E4C10000L});
    public static final BitSet FOLLOW_31_in_ruleBoard1800 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBoard1812 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBoard1829 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBoard1846 = new BitSet(new long[]{0x0000002104010000L});
    public static final BitSet FOLLOW_32_in_ruleBoard1861 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBoard1873 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBoard1890 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBoard1907 = new BitSet(new long[]{0x0000002004010000L});
    public static final BitSet FOLLOW_ruleIOAdapter_in_ruleBoard1930 = new BitSet(new long[]{0x0000002004010000L});
    public static final BitSet FOLLOW_26_in_ruleBoard1944 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBoard1956 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleBoard1977 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleBoard1990 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBoard2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessor_in_entryRuleProcessor2040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessor2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleProcessor2087 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessor2104 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProcessor2121 = new BitSet(new long[]{0x0000000420400000L});
    public static final BitSet FOLLOW_22_in_ruleProcessor2134 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProcessor2146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcessor2163 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProcessor2180 = new BitSet(new long[]{0x0000000420400000L});
    public static final BitSet FOLLOW_29_in_ruleProcessor2195 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProcessor2207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcessor2224 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProcessor2241 = new BitSet(new long[]{0x0000000420400000L});
    public static final BitSet FOLLOW_ruleCore_in_ruleProcessor2264 = new BitSet(new long[]{0x0000000424410000L});
    public static final BitSet FOLLOW_26_in_ruleProcessor2278 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProcessor2290 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleProcessor2311 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleProcessor2324 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProcessor2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCore_in_entryRuleCore2374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCore2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCore2421 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCore2438 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCore2455 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleCore2467 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCore2479 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCore2496 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCore2513 = new BitSet(new long[]{0x0000001004010000L});
    public static final BitSet FOLLOW_36_in_ruleCore2526 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCore2538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCore2555 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCore2572 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_ruleCore2587 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCore2599 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleCore2620 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleCore2633 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCore2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIOAdapter_in_entryRuleIOAdapter2683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIOAdapter2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleIOAdapter2730 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleIOAdapter2742 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleIOAdapter2754 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIOAdapter2766 = new BitSet(new long[]{0x0000000000000000L,0xFFFFFFFFF8000000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_ruleIOAdapterType_in_ruleIOAdapter2787 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIOAdapter2799 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleIOAdapter2811 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIOAdapter2823 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIOAdapter2840 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIOAdapter2857 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_40_in_ruleIOAdapter2870 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIOAdapter2882 = new BitSet(new long[]{0x0000000000000000L,0x0000000007F82000L});
    public static final BitSet FOLLOW_ruleIOAdapterProtectionLevelType_in_ruleIOAdapter2903 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIOAdapter2915 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleIOAdapter2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNetwork_in_entryRuleNetwork2965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNetwork2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNetwork3012 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNetwork3029 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNetwork3046 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleNetwork3058 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNetwork3070 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNetwork3087 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNetwork3104 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleNetwork3116 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNetwork3139 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleNetwork3151 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNetwork3174 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_44_in_ruleNetwork3187 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNetwork3210 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_15_in_ruleNetwork3224 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_ruleNetwork3237 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNetwork3249 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleNetwork3270 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleNetwork3283 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNetwork3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationGroup_in_entryRuleApplicationGroup3333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationGroup3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleApplicationGroup3380 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationGroup3397 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplicationGroup3414 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationGroup3434 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleApplicationGroup3447 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationGroup3467 = new BitSet(new long[]{0x0000100000010000L});
    public static final BitSet FOLLOW_16_in_ruleApplicationGroup3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication3517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleApplication3564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplication3581 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplication3598 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleApplication3610 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication3622 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplication3639 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication3656 = new BitSet(new long[]{0x00FF000004010000L});
    public static final BitSet FOLLOW_48_in_ruleApplication3669 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication3681 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplication3698 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication3715 = new BitSet(new long[]{0x00FE000004010000L});
    public static final BitSet FOLLOW_49_in_ruleApplication3730 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication3742 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplication3759 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication3776 = new BitSet(new long[]{0x00FC000004010000L});
    public static final BitSet FOLLOW_50_in_ruleApplication3791 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication3803 = new BitSet(new long[]{0x0000000000000000L,0x000000000007E000L});
    public static final BitSet FOLLOW_ruleDesignAssuranceLevelType_in_ruleApplication3824 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication3836 = new BitSet(new long[]{0x00F8000004010000L});
    public static final BitSet FOLLOW_51_in_ruleApplication3851 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication3863 = new BitSet(new long[]{0x0000000000000000L,0x0000000007F82000L});
    public static final BitSet FOLLOW_ruleIOAdapterProtectionLevelType_in_ruleApplication3884 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication3896 = new BitSet(new long[]{0x00F0000004010000L});
    public static final BitSet FOLLOW_52_in_ruleApplication3911 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication3923 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplication3940 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication3957 = new BitSet(new long[]{0x00E0000004010000L});
    public static final BitSet FOLLOW_53_in_ruleApplication3972 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication3984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplication4001 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication4018 = new BitSet(new long[]{0x00C0000004010000L});
    public static final BitSet FOLLOW_ruleIOAdapterRequirement_in_ruleApplication4041 = new BitSet(new long[]{0x00C0000004010000L});
    public static final BitSet FOLLOW_54_in_ruleApplication4055 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplication4067 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleApplication4090 = new BitSet(new long[]{0x0000100000010000L});
    public static final BitSet FOLLOW_44_in_ruleApplication4103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleApplication4126 = new BitSet(new long[]{0x0000100000010000L});
    public static final BitSet FOLLOW_16_in_ruleApplication4140 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication4152 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_ruleApplication4167 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplication4179 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleApplication4200 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleApplication4213 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleApplication4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIOAdapterRequirement_in_entryRuleIOAdapterRequirement4263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIOAdapterRequirement4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleIOAdapterRequirement4310 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIOAdapterRequirement4327 = new BitSet(new long[]{0x0000000000000000L,0xFFFFFFFFF8000000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_ruleIOAdapterType_in_ruleIOAdapterRequirement4353 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleIOAdapterRequirement4365 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_57_in_ruleIOAdapterRequirement4384 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_58_in_ruleIOAdapterRequirement4421 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIOAdapterRequirement4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation4483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDislocalityRelation4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDislocalityRelation4538 = new BitSet(new long[]{0x0800100000000000L});
    public static final BitSet FOLLOW_44_in_ruleDislocalityRelation4551 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDislocalityRelation4571 = new BitSet(new long[]{0x0800100000000000L});
    public static final BitSet FOLLOW_59_in_ruleDislocalityRelation4585 = new BitSet(new long[]{0x0000000618200000L});
    public static final BitSet FOLLOW_ruleHardwareArchitectureLevelType_in_ruleDislocalityRelation4606 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDislocalityRelation4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProximityRelation_in_entryRuleProximityRelation4654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProximityRelation4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProximityRelation4709 = new BitSet(new long[]{0x1000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleProximityRelation4722 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProximityRelation4742 = new BitSet(new long[]{0x1000100000000000L});
    public static final BitSet FOLLOW_60_in_ruleProximityRelation4756 = new BitSet(new long[]{0x0000000618200000L});
    public static final BitSet FOLLOW_ruleHardwareArchitectureLevelType_in_ruleProximityRelation4777 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProximityRelation4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommunicationRelation_in_entryRuleCommunicationRelation4825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommunicationRelation4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommunicationRelation4880 = new BitSet(new long[]{0x2000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleCommunicationRelation4893 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommunicationRelation4913 = new BitSet(new long[]{0x2000100000000000L});
    public static final BitSet FOLLOW_61_in_ruleCommunicationRelation4927 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCommunicationRelation4944 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleCommunicationRelation4961 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCommunicationRelation4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDissimilarityRelation_in_entryRuleDissimilarityRelation5009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDissimilarityRelation5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDissimilarityRelation5064 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleDissimilarityRelation5077 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDissimilarityRelation5097 = new BitSet(new long[]{0x8000100000000000L});
    public static final BitSet FOLLOW_63_in_ruleDissimilarityRelation5111 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityRelation5132 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDissimilarityRelation5144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDissimilarityClause_in_entryRuleDissimilarityClause5180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDissimilarityClause5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDissimilarityEntry_in_ruleDissimilarityClause5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDissimilarityClause5255 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_ruleDissimilarityDisjunction_in_ruleDissimilarityClause5284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDissimilarityConjunction_in_ruleDissimilarityClause5312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDissimilarityClause5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDissimilarityDisjunction_in_entryRuleDissimilarityDisjunction5361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDissimilarityDisjunction5371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityDisjunction5417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleDissimilarityDisjunction5430 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityDisjunction5451 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleDissimilarityConjunction_in_entryRuleDissimilarityConjunction5489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDissimilarityConjunction5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityConjunction5545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleDissimilarityConjunction5558 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_ruleDissimilarityClause_in_ruleDissimilarityConjunction5579 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDissimilarityEntry_in_entryRuleDissimilarityEntry5617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDissimilarityEntry5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleDissimilarityEntry5665 = new BitSet(new long[]{0x0000000003400000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleCompartmentAttributes_in_ruleDissimilarityEntry5686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleDissimilarityEntry5706 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleBoxAttributes_in_ruleDissimilarityEntry5727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleDissimilarityEntry5747 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_ruleBoardAttributes_in_ruleDissimilarityEntry5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleDissimilarityEntry5788 = new BitSet(new long[]{0x0000000000400000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleProcessorAttributes_in_ruleDissimilarityEntry5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter5846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricParameter5856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetricParameter5898 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMetricParameter5915 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMetricParameter5932 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMetricParameter5949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6037 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleQualifiedName6056 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6071 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_22_in_ruleCompartmentAttributes6132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleCompartmentAttributes6149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCompartmentAttributes6166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCompartmentAttributes6183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBoxAttributes6227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBoardAttributes6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleBoardAttributes6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleBoardAttributes6305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleBoardAttributes6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleProcessorAttributes6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleProcessorAttributes6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleHardwareArchitectureLevelType6429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleHardwareArchitectureLevelType6446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleHardwareArchitectureLevelType6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleHardwareArchitectureLevelType6480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleHardwareArchitectureLevelType6497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDesignAssuranceLevelType6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleDesignAssuranceLevelType6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDesignAssuranceLevelType6576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDesignAssuranceLevelType6593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleDesignAssuranceLevelType6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleDesignAssuranceLevelType6627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleIOAdapterProtectionLevelType6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleIOAdapterProtectionLevelType6689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleIOAdapterProtectionLevelType6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleIOAdapterProtectionLevelType6723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleIOAdapterProtectionLevelType6740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleIOAdapterProtectionLevelType6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleIOAdapterProtectionLevelType6774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleIOAdapterProtectionLevelType6791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleIOAdapterProtectionLevelType6808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleIOAdapterType6853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleIOAdapterType6870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleIOAdapterType6887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleIOAdapterType6904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleIOAdapterType6921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleIOAdapterType6938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleIOAdapterType6955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleIOAdapterType6972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleIOAdapterType6989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleIOAdapterType7006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleIOAdapterType7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleIOAdapterType7040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleIOAdapterType7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleIOAdapterType7074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleIOAdapterType7091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleIOAdapterType7108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleIOAdapterType7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleIOAdapterType7142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleIOAdapterType7159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleIOAdapterType7176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleIOAdapterType7193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleIOAdapterType7210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleIOAdapterType7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleIOAdapterType7244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleIOAdapterType7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleIOAdapterType7278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleIOAdapterType7295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleIOAdapterType7312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleIOAdapterType7329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleIOAdapterType7346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleIOAdapterType7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleIOAdapterType7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleIOAdapterType7397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleIOAdapterType7414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleIOAdapterType7431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleIOAdapterType7448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleIOAdapterType7465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleIOAdapterType7482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleIOAdapterType7499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleIOAdapterType7516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleIOAdapterType7533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleIOAdapterType7550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleIOAdapterType7567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleIOAdapterType7584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleIOAdapterType7601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleIOAdapterType7618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDissimilarityDisjunction_in_synpred1_InternalMappingDSL5268 = new BitSet(new long[]{0x0000000000000002L});

}