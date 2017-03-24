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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Global'", "'{'", "'System'", "'='", "';'", "'}'", "'Hardware'", "'Software'", "'Restrictions'", "'Compartment'", "'Manufacturer'", "'PowerSupply'", "'Side'", "'Zone'", "'Properties'", "'Box'", "'Board'", "'Type'", "'DesignAssuranceLevel'", "'ESS'", "'RAM'", "'ROM'", "'Processor'", "'Core'", "'Capacity'", "'Architecture'", "'Adapter'", "'type'", "'count'", "'protection-level'", "'Network'", "'Bandwidth'", "'Connects'", "','", "'Group'", "'Application'", "'Core-utilization'", "'Required'", "'capacity'", "'Criticality'", "'level'", "'IO'", "'protection'", "'Identical'", "'parallel'", "'threads'", "'Developer'", "'Restrict'", "'deployment'", "'to'", "'Requires'", "'adapter'", "'exclusive'", "'shared'", "'dislocal'", "'up'", "'on'", "'same'", "'require'", "'bandwidth'", "'dissimilar'", "'based'", "'('", "')'", "'OR'", "'AND'", "'Compartment.'", "'Box.'", "'Board.'", "'Processor.'", "'.'", "'ProcessorType'", "'None'", "'QS'", "'D'", "'C'", "'B'", "'A'", "'L1'", "'L2'", "'L3'", "'L4'", "'L5'", "'L6'", "'L7'", "'L8'", "'Can'", "'Enhanced Local Bus'", "'Ethernet'", "'Analog'", "'Digital'", "'Serial'", "'CustomType0'", "'CustomType1'", "'CustomType2'", "'CustomType3'", "'CustomType4'", "'CustomType5'", "'CustomType6'", "'CustomType7'", "'CustomType8'", "'CustomType9'", "'CustomType10'", "'CustomType11'", "'CustomType12'", "'CustomType13'", "'CustomType14'", "'CustomType15'", "'CustomType16'", "'CustomType17'", "'CustomType18'", "'CustomType19'", "'CustomType20'", "'CustomType21'", "'CustomType22'", "'CustomType23'", "'CustomType24'", "'CustomType25'", "'CustomType26'", "'CustomType27'", "'CustomType28'", "'CustomType29'", "'CustomType30'", "'CustomType31'", "'CustomType32'", "'CustomType33'", "'CustomType34'", "'CustomType35'", "'CustomType36'", "'CustomType37'", "'CustomType38'", "'CustomType39'"
    };
    public static final int T__50=50;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
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
    public String getGrammarFileName() { return "InternalMappingDSL.g"; }



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
    // InternalMappingDSL.g:68:1: entryRuleAssistModel returns [EObject current=null] : iv_ruleAssistModel= ruleAssistModel EOF ;
    public final EObject entryRuleAssistModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssistModel = null;


        try {
            // InternalMappingDSL.g:69:2: (iv_ruleAssistModel= ruleAssistModel EOF )
            // InternalMappingDSL.g:70:2: iv_ruleAssistModel= ruleAssistModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssistModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssistModel=ruleAssistModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssistModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:77:1: ruleAssistModel returns [EObject current=null] : (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= 'Hardware' otherlv_8= '{' ( (lv_hardwareContainer_9_0= ruleHardwareElementContainer ) )+ ( (lv_networks_10_0= ruleNetwork ) )* otherlv_11= '}' otherlv_12= 'Software' otherlv_13= '{' ( (lv_applications_14_0= ruleApplication ) )+ ( (lv_applicationGroups_15_0= ruleApplicationGroup ) )* otherlv_16= '}' (otherlv_17= 'Restrictions' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* ( (lv_communicationRelations_22_0= ruleCommunicationRelation ) )* otherlv_23= '}' )? ) ;
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
            // InternalMappingDSL.g:80:28: ( (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= 'Hardware' otherlv_8= '{' ( (lv_hardwareContainer_9_0= ruleHardwareElementContainer ) )+ ( (lv_networks_10_0= ruleNetwork ) )* otherlv_11= '}' otherlv_12= 'Software' otherlv_13= '{' ( (lv_applications_14_0= ruleApplication ) )+ ( (lv_applicationGroups_15_0= ruleApplicationGroup ) )* otherlv_16= '}' (otherlv_17= 'Restrictions' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* ( (lv_communicationRelations_22_0= ruleCommunicationRelation ) )* otherlv_23= '}' )? ) )
            // InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= 'Hardware' otherlv_8= '{' ( (lv_hardwareContainer_9_0= ruleHardwareElementContainer ) )+ ( (lv_networks_10_0= ruleNetwork ) )* otherlv_11= '}' otherlv_12= 'Software' otherlv_13= '{' ( (lv_applications_14_0= ruleApplication ) )+ ( (lv_applicationGroups_15_0= ruleApplicationGroup ) )* otherlv_16= '}' (otherlv_17= 'Restrictions' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* ( (lv_communicationRelations_22_0= ruleCommunicationRelation ) )* otherlv_23= '}' )? )
            {
            // InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= 'Hardware' otherlv_8= '{' ( (lv_hardwareContainer_9_0= ruleHardwareElementContainer ) )+ ( (lv_networks_10_0= ruleNetwork ) )* otherlv_11= '}' otherlv_12= 'Software' otherlv_13= '{' ( (lv_applications_14_0= ruleApplication ) )+ ( (lv_applicationGroups_15_0= ruleApplicationGroup ) )* otherlv_16= '}' (otherlv_17= 'Restrictions' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* ( (lv_communicationRelations_22_0= ruleCommunicationRelation ) )* otherlv_23= '}' )? )
            // InternalMappingDSL.g:81:3: otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= 'Hardware' otherlv_8= '{' ( (lv_hardwareContainer_9_0= ruleHardwareElementContainer ) )+ ( (lv_networks_10_0= ruleNetwork ) )* otherlv_11= '}' otherlv_12= 'Software' otherlv_13= '{' ( (lv_applications_14_0= ruleApplication ) )+ ( (lv_applicationGroups_15_0= ruleApplicationGroup ) )* otherlv_16= '}' (otherlv_17= 'Restrictions' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* ( (lv_communicationRelations_22_0= ruleCommunicationRelation ) )* otherlv_23= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssistModelAccess().getGlobalKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssistModelAccess().getSystemKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAssistModelAccess().getEqualsSignKeyword_3());
                  
            }
            // InternalMappingDSL.g:97:1: ( (lv_systemName_4_0= RULE_STRING ) )
            // InternalMappingDSL.g:98:1: (lv_systemName_4_0= RULE_STRING )
            {
            // InternalMappingDSL.g:98:1: (lv_systemName_4_0= RULE_STRING )
            // InternalMappingDSL.g:99:3: lv_systemName_4_0= RULE_STRING
            {
            lv_systemName_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAssistModelAccess().getSemicolonKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getAssistModelAccess().getHardwareKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,12,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_8());
                  
            }
            // InternalMappingDSL.g:131:1: ( (lv_hardwareContainer_9_0= ruleHardwareElementContainer ) )+
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
            	    // InternalMappingDSL.g:132:1: (lv_hardwareContainer_9_0= ruleHardwareElementContainer )
            	    {
            	    // InternalMappingDSL.g:132:1: (lv_hardwareContainer_9_0= ruleHardwareElementContainer )
            	    // InternalMappingDSL.g:133:3: lv_hardwareContainer_9_0= ruleHardwareElementContainer
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssistModelAccess().getHardwareContainerHardwareElementContainerParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_11);
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
            	              		"ch.hilbri.assist.mappingdsl.MappingDSL.HardwareElementContainer");
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

            // InternalMappingDSL.g:149:3: ( (lv_networks_10_0= ruleNetwork ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==41) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMappingDSL.g:150:1: (lv_networks_10_0= ruleNetwork )
            	    {
            	    // InternalMappingDSL.g:150:1: (lv_networks_10_0= ruleNetwork )
            	    // InternalMappingDSL.g:151:3: lv_networks_10_0= ruleNetwork
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssistModelAccess().getNetworksNetworkParserRuleCall_10_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_12);
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
            	              		"ch.hilbri.assist.mappingdsl.MappingDSL.Network");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getAssistModelAccess().getSoftwareKeyword_12());
                  
            }
            otherlv_13=(Token)match(input,12,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_13());
                  
            }
            // InternalMappingDSL.g:179:1: ( (lv_applications_14_0= ruleApplication ) )+
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
            	    // InternalMappingDSL.g:180:1: (lv_applications_14_0= ruleApplication )
            	    {
            	    // InternalMappingDSL.g:180:1: (lv_applications_14_0= ruleApplication )
            	    // InternalMappingDSL.g:181:3: lv_applications_14_0= ruleApplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssistModelAccess().getApplicationsApplicationParserRuleCall_14_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_15);
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
            	              		"ch.hilbri.assist.mappingdsl.MappingDSL.Application");
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

            // InternalMappingDSL.g:197:3: ( (lv_applicationGroups_15_0= ruleApplicationGroup ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==45) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMappingDSL.g:198:1: (lv_applicationGroups_15_0= ruleApplicationGroup )
            	    {
            	    // InternalMappingDSL.g:198:1: (lv_applicationGroups_15_0= ruleApplicationGroup )
            	    // InternalMappingDSL.g:199:3: lv_applicationGroups_15_0= ruleApplicationGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssistModelAccess().getApplicationGroupsApplicationGroupParserRuleCall_15_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_16);
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
            	              		"ch.hilbri.assist.mappingdsl.MappingDSL.ApplicationGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_16=(Token)match(input,16,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_16());
                  
            }
            // InternalMappingDSL.g:219:1: (otherlv_17= 'Restrictions' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* ( (lv_communicationRelations_22_0= ruleCommunicationRelation ) )* otherlv_23= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMappingDSL.g:219:3: otherlv_17= 'Restrictions' otherlv_18= '{' ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )* ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )* ( (lv_proximityRelations_21_0= ruleProximityRelation ) )* ( (lv_communicationRelations_22_0= ruleCommunicationRelation ) )* otherlv_23= '}'
                    {
                    otherlv_17=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getAssistModelAccess().getRestrictionsKeyword_17_0());
                          
                    }
                    otherlv_18=(Token)match(input,12,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_17_1());
                          
                    }
                    // InternalMappingDSL.g:227:1: ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )*
                    loop5:
                    do {
                        int alt5=2;
                        alt5 = dfa5.predict(input);
                        switch (alt5) {
                    	case 1 :
                    	    // InternalMappingDSL.g:228:1: (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation )
                    	    {
                    	    // InternalMappingDSL.g:228:1: (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation )
                    	    // InternalMappingDSL.g:229:3: lv_dissimilarityRelations_19_0= ruleDissimilarityRelation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAssistModelAccess().getDissimilarityRelationsDissimilarityRelationParserRuleCall_17_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_18);
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
                    	              		"ch.hilbri.assist.mappingdsl.MappingDSL.DissimilarityRelation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // InternalMappingDSL.g:245:3: ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )*
                    loop6:
                    do {
                        int alt6=2;
                        alt6 = dfa6.predict(input);
                        switch (alt6) {
                    	case 1 :
                    	    // InternalMappingDSL.g:246:1: (lv_dislocalityRelations_20_0= ruleDislocalityRelation )
                    	    {
                    	    // InternalMappingDSL.g:246:1: (lv_dislocalityRelations_20_0= ruleDislocalityRelation )
                    	    // InternalMappingDSL.g:247:3: lv_dislocalityRelations_20_0= ruleDislocalityRelation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAssistModelAccess().getDislocalityRelationsDislocalityRelationParserRuleCall_17_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_18);
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
                    	              		"ch.hilbri.assist.mappingdsl.MappingDSL.DislocalityRelation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalMappingDSL.g:263:3: ( (lv_proximityRelations_21_0= ruleProximityRelation ) )*
                    loop7:
                    do {
                        int alt7=2;
                        alt7 = dfa7.predict(input);
                        switch (alt7) {
                    	case 1 :
                    	    // InternalMappingDSL.g:264:1: (lv_proximityRelations_21_0= ruleProximityRelation )
                    	    {
                    	    // InternalMappingDSL.g:264:1: (lv_proximityRelations_21_0= ruleProximityRelation )
                    	    // InternalMappingDSL.g:265:3: lv_proximityRelations_21_0= ruleProximityRelation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAssistModelAccess().getProximityRelationsProximityRelationParserRuleCall_17_4_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_18);
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
                    	              		"ch.hilbri.assist.mappingdsl.MappingDSL.ProximityRelation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // InternalMappingDSL.g:281:3: ( (lv_communicationRelations_22_0= ruleCommunicationRelation ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMappingDSL.g:282:1: (lv_communicationRelations_22_0= ruleCommunicationRelation )
                    	    {
                    	    // InternalMappingDSL.g:282:1: (lv_communicationRelations_22_0= ruleCommunicationRelation )
                    	    // InternalMappingDSL.g:283:3: lv_communicationRelations_22_0= ruleCommunicationRelation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAssistModelAccess().getCommunicationRelationsCommunicationRelationParserRuleCall_17_5_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_18);
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
                    	              		"ch.hilbri.assist.mappingdsl.MappingDSL.CommunicationRelation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:311:1: entryRuleHardwareElementContainer returns [EObject current=null] : iv_ruleHardwareElementContainer= ruleHardwareElementContainer EOF ;
    public final EObject entryRuleHardwareElementContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHardwareElementContainer = null;


        try {
            // InternalMappingDSL.g:312:2: (iv_ruleHardwareElementContainer= ruleHardwareElementContainer EOF )
            // InternalMappingDSL.g:313:2: iv_ruleHardwareElementContainer= ruleHardwareElementContainer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHardwareElementContainerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHardwareElementContainer=ruleHardwareElementContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHardwareElementContainer; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:320:1: ruleHardwareElementContainer returns [EObject current=null] : (this_Compartment_0= ruleCompartment | this_Box_1= ruleBox | this_Board_2= ruleBoard ) ;
    public final EObject ruleHardwareElementContainer() throws RecognitionException {
        EObject current = null;

        EObject this_Compartment_0 = null;

        EObject this_Box_1 = null;

        EObject this_Board_2 = null;


         enterRule(); 
            
        try {
            // InternalMappingDSL.g:323:28: ( (this_Compartment_0= ruleCompartment | this_Box_1= ruleBox | this_Board_2= ruleBoard ) )
            // InternalMappingDSL.g:324:1: (this_Compartment_0= ruleCompartment | this_Box_1= ruleBox | this_Board_2= ruleBoard )
            {
            // InternalMappingDSL.g:324:1: (this_Compartment_0= ruleCompartment | this_Box_1= ruleBox | this_Board_2= ruleBoard )
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
                    // InternalMappingDSL.g:325:5: this_Compartment_0= ruleCompartment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHardwareElementContainerAccess().getCompartmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalMappingDSL.g:335:5: this_Box_1= ruleBox
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHardwareElementContainerAccess().getBoxParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalMappingDSL.g:345:5: this_Board_2= ruleBoard
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHardwareElementContainerAccess().getBoardParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalMappingDSL.g:361:1: entryRuleCompartment returns [EObject current=null] : iv_ruleCompartment= ruleCompartment EOF ;
    public final EObject entryRuleCompartment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompartment = null;


        try {
            // InternalMappingDSL.g:362:2: (iv_ruleCompartment= ruleCompartment EOF )
            // InternalMappingDSL.g:363:2: iv_ruleCompartment= ruleCompartment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompartmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompartment=ruleCompartment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompartment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:370:1: ruleCompartment returns [EObject current=null] : (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_boxes_19_0= ruleBox ) )+ (otherlv_20= 'Properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
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
            // InternalMappingDSL.g:373:28: ( (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_boxes_19_0= ruleBox ) )+ (otherlv_20= 'Properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalMappingDSL.g:374:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_boxes_19_0= ruleBox ) )+ (otherlv_20= 'Properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalMappingDSL.g:374:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_boxes_19_0= ruleBox ) )+ (otherlv_20= 'Properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalMappingDSL.g:374:3: otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_boxes_19_0= ruleBox ) )+ (otherlv_20= 'Properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompartmentAccess().getCompartmentKeyword_0());
                  
            }
            // InternalMappingDSL.g:378:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalMappingDSL.g:379:1: (lv_name_1_0= RULE_ID )
            {
            // InternalMappingDSL.g:379:1: (lv_name_1_0= RULE_ID )
            // InternalMappingDSL.g:380:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalMappingDSL.g:400:1: (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMappingDSL.g:400:3: otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCompartmentAccess().getManufacturerKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_1());
                          
                    }
                    // InternalMappingDSL.g:408:1: ( (lv_manufacturer_5_0= RULE_STRING ) )
                    // InternalMappingDSL.g:409:1: (lv_manufacturer_5_0= RULE_STRING )
                    {
                    // InternalMappingDSL.g:409:1: (lv_manufacturer_5_0= RULE_STRING )
                    // InternalMappingDSL.g:410:3: lv_manufacturer_5_0= RULE_STRING
                    {
                    lv_manufacturer_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:430:3: (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMappingDSL.g:430:5: otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getCompartmentAccess().getPowerSupplyKeyword_4_0());
                          
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_4_1());
                          
                    }
                    // InternalMappingDSL.g:438:1: ( (lv_powerSupply_9_0= RULE_STRING ) )
                    // InternalMappingDSL.g:439:1: (lv_powerSupply_9_0= RULE_STRING )
                    {
                    // InternalMappingDSL.g:439:1: (lv_powerSupply_9_0= RULE_STRING )
                    // InternalMappingDSL.g:440:3: lv_powerSupply_9_0= RULE_STRING
                    {
                    lv_powerSupply_9_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getCompartmentAccess().getSemicolonKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:460:3: (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMappingDSL.g:460:5: otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getCompartmentAccess().getSideKeyword_5_0());
                          
                    }
                    otherlv_12=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_5_1());
                          
                    }
                    // InternalMappingDSL.g:468:1: ( (lv_side_13_0= RULE_STRING ) )
                    // InternalMappingDSL.g:469:1: (lv_side_13_0= RULE_STRING )
                    {
                    // InternalMappingDSL.g:469:1: (lv_side_13_0= RULE_STRING )
                    // InternalMappingDSL.g:470:3: lv_side_13_0= RULE_STRING
                    {
                    lv_side_13_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getCompartmentAccess().getSemicolonKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:490:3: (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMappingDSL.g:490:5: otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getCompartmentAccess().getZoneKeyword_6_0());
                          
                    }
                    otherlv_16=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_6_1());
                          
                    }
                    // InternalMappingDSL.g:498:1: ( (lv_zone_17_0= RULE_STRING ) )
                    // InternalMappingDSL.g:499:1: (lv_zone_17_0= RULE_STRING )
                    {
                    // InternalMappingDSL.g:499:1: (lv_zone_17_0= RULE_STRING )
                    // InternalMappingDSL.g:500:3: lv_zone_17_0= RULE_STRING
                    {
                    lv_zone_17_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,15,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getCompartmentAccess().getSemicolonKeyword_6_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:520:3: ( (lv_boxes_19_0= ruleBox ) )+
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
            	    // InternalMappingDSL.g:521:1: (lv_boxes_19_0= ruleBox )
            	    {
            	    // InternalMappingDSL.g:521:1: (lv_boxes_19_0= ruleBox )
            	    // InternalMappingDSL.g:522:3: lv_boxes_19_0= ruleBox
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompartmentAccess().getBoxesBoxParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_25);
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
            	              		"ch.hilbri.assist.mappingdsl.MappingDSL.Box");
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

            // InternalMappingDSL.g:538:3: (otherlv_20= 'Properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMappingDSL.g:538:5: otherlv_20= 'Properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}'
                    {
                    otherlv_20=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getCompartmentAccess().getPropertiesKeyword_8_0());
                          
                    }
                    otherlv_21=(Token)match(input,12,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_8_1());
                          
                    }
                    // InternalMappingDSL.g:546:1: ( (lv_metricParameters_22_0= ruleMetricParameter ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_STRING) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMappingDSL.g:547:1: (lv_metricParameters_22_0= ruleMetricParameter )
                    	    {
                    	    // InternalMappingDSL.g:547:1: (lv_metricParameters_22_0= ruleMetricParameter )
                    	    // InternalMappingDSL.g:548:3: lv_metricParameters_22_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompartmentAccess().getMetricParametersMetricParameterParserRuleCall_8_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_26);
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
                    	              		"ch.hilbri.assist.mappingdsl.MappingDSL.MetricParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_8_3());
                          
                    }

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:580:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalMappingDSL.g:581:2: (iv_ruleBox= ruleBox EOF )
            // InternalMappingDSL.g:582:2: iv_ruleBox= ruleBox EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoxRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBox=ruleBox();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBox; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:589:1: ruleBox returns [EObject current=null] : (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? ( (lv_boards_7_0= ruleBoard ) )+ (otherlv_8= 'Properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalMappingDSL.g:592:28: ( (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? ( (lv_boards_7_0= ruleBoard ) )+ (otherlv_8= 'Properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalMappingDSL.g:593:1: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? ( (lv_boards_7_0= ruleBoard ) )+ (otherlv_8= 'Properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalMappingDSL.g:593:1: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? ( (lv_boards_7_0= ruleBoard ) )+ (otherlv_8= 'Properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalMappingDSL.g:593:3: otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? ( (lv_boards_7_0= ruleBoard ) )+ (otherlv_8= 'Properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBoxAccess().getBoxKeyword_0());
                  
            }
            // InternalMappingDSL.g:597:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalMappingDSL.g:598:1: (lv_name_1_0= RULE_ID )
            {
            // InternalMappingDSL.g:598:1: (lv_name_1_0= RULE_ID )
            // InternalMappingDSL.g:599:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalMappingDSL.g:619:1: (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMappingDSL.g:619:3: otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBoxAccess().getManufacturerKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBoxAccess().getEqualsSignKeyword_3_1());
                          
                    }
                    // InternalMappingDSL.g:627:1: ( (lv_manufacturer_5_0= RULE_STRING ) )
                    // InternalMappingDSL.g:628:1: (lv_manufacturer_5_0= RULE_STRING )
                    {
                    // InternalMappingDSL.g:628:1: (lv_manufacturer_5_0= RULE_STRING )
                    // InternalMappingDSL.g:629:3: lv_manufacturer_5_0= RULE_STRING
                    {
                    lv_manufacturer_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getBoxAccess().getSemicolonKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:649:3: ( (lv_boards_7_0= ruleBoard ) )+
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
            	    // InternalMappingDSL.g:650:1: (lv_boards_7_0= ruleBoard )
            	    {
            	    // InternalMappingDSL.g:650:1: (lv_boards_7_0= ruleBoard )
            	    // InternalMappingDSL.g:651:3: lv_boards_7_0= ruleBoard
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBoxAccess().getBoardsBoardParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_28);
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
            	              		"ch.hilbri.assist.mappingdsl.MappingDSL.Board");
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

            // InternalMappingDSL.g:667:3: (otherlv_8= 'Properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMappingDSL.g:667:5: otherlv_8= 'Properties' otherlv_9= '{' ( (lv_metricParameters_10_0= ruleMetricParameter ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBoxAccess().getPropertiesKeyword_5_0());
                          
                    }
                    otherlv_9=(Token)match(input,12,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_5_1());
                          
                    }
                    // InternalMappingDSL.g:675:1: ( (lv_metricParameters_10_0= ruleMetricParameter ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_STRING) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMappingDSL.g:676:1: (lv_metricParameters_10_0= ruleMetricParameter )
                    	    {
                    	    // InternalMappingDSL.g:676:1: (lv_metricParameters_10_0= ruleMetricParameter )
                    	    // InternalMappingDSL.g:677:3: lv_metricParameters_10_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBoxAccess().getMetricParametersMetricParameterParserRuleCall_5_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_26);
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
                    	              		"ch.hilbri.assist.mappingdsl.MappingDSL.MetricParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:709:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalMappingDSL.g:710:2: (iv_ruleBoard= ruleBoard EOF )
            // InternalMappingDSL.g:711:2: iv_ruleBoard= ruleBoard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoard=ruleBoard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoard; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:718:1: ruleBoard returns [EObject current=null] : (otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'PowerSupply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'DesignAssuranceLevel' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Side' otherlv_20= '=' ( (lv_side_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'ESS' otherlv_24= '=' ( (lv_ess_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'RAM' otherlv_28= '=' ( (lv_ramCapacity_29_0= RULE_INT ) ) otherlv_30= ';' )? (otherlv_31= 'ROM' otherlv_32= '=' ( (lv_romCapacity_33_0= RULE_INT ) ) otherlv_34= ';' )? ( (lv_processors_35_0= ruleProcessor ) )+ ( (lv_ioAdapters_36_0= ruleIOAdapter ) )* (otherlv_37= 'Properties' otherlv_38= '{' ( (lv_metricParameters_39_0= ruleMetricParameter ) )* otherlv_40= '}' )? otherlv_41= '}' ) ;
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
            // InternalMappingDSL.g:721:28: ( (otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'PowerSupply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'DesignAssuranceLevel' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Side' otherlv_20= '=' ( (lv_side_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'ESS' otherlv_24= '=' ( (lv_ess_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'RAM' otherlv_28= '=' ( (lv_ramCapacity_29_0= RULE_INT ) ) otherlv_30= ';' )? (otherlv_31= 'ROM' otherlv_32= '=' ( (lv_romCapacity_33_0= RULE_INT ) ) otherlv_34= ';' )? ( (lv_processors_35_0= ruleProcessor ) )+ ( (lv_ioAdapters_36_0= ruleIOAdapter ) )* (otherlv_37= 'Properties' otherlv_38= '{' ( (lv_metricParameters_39_0= ruleMetricParameter ) )* otherlv_40= '}' )? otherlv_41= '}' ) )
            // InternalMappingDSL.g:722:1: (otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'PowerSupply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'DesignAssuranceLevel' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Side' otherlv_20= '=' ( (lv_side_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'ESS' otherlv_24= '=' ( (lv_ess_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'RAM' otherlv_28= '=' ( (lv_ramCapacity_29_0= RULE_INT ) ) otherlv_30= ';' )? (otherlv_31= 'ROM' otherlv_32= '=' ( (lv_romCapacity_33_0= RULE_INT ) ) otherlv_34= ';' )? ( (lv_processors_35_0= ruleProcessor ) )+ ( (lv_ioAdapters_36_0= ruleIOAdapter ) )* (otherlv_37= 'Properties' otherlv_38= '{' ( (lv_metricParameters_39_0= ruleMetricParameter ) )* otherlv_40= '}' )? otherlv_41= '}' )
            {
            // InternalMappingDSL.g:722:1: (otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'PowerSupply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'DesignAssuranceLevel' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Side' otherlv_20= '=' ( (lv_side_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'ESS' otherlv_24= '=' ( (lv_ess_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'RAM' otherlv_28= '=' ( (lv_ramCapacity_29_0= RULE_INT ) ) otherlv_30= ';' )? (otherlv_31= 'ROM' otherlv_32= '=' ( (lv_romCapacity_33_0= RULE_INT ) ) otherlv_34= ';' )? ( (lv_processors_35_0= ruleProcessor ) )+ ( (lv_ioAdapters_36_0= ruleIOAdapter ) )* (otherlv_37= 'Properties' otherlv_38= '{' ( (lv_metricParameters_39_0= ruleMetricParameter ) )* otherlv_40= '}' )? otherlv_41= '}' )
            // InternalMappingDSL.g:722:3: otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'PowerSupply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'DesignAssuranceLevel' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )? (otherlv_19= 'Side' otherlv_20= '=' ( (lv_side_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'ESS' otherlv_24= '=' ( (lv_ess_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'RAM' otherlv_28= '=' ( (lv_ramCapacity_29_0= RULE_INT ) ) otherlv_30= ';' )? (otherlv_31= 'ROM' otherlv_32= '=' ( (lv_romCapacity_33_0= RULE_INT ) ) otherlv_34= ';' )? ( (lv_processors_35_0= ruleProcessor ) )+ ( (lv_ioAdapters_36_0= ruleIOAdapter ) )* (otherlv_37= 'Properties' otherlv_38= '{' ( (lv_metricParameters_39_0= ruleMetricParameter ) )* otherlv_40= '}' )? otherlv_41= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBoardAccess().getBoardKeyword_0());
                  
            }
            // InternalMappingDSL.g:726:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalMappingDSL.g:727:1: (lv_name_1_0= RULE_ID )
            {
            // InternalMappingDSL.g:727:1: (lv_name_1_0= RULE_ID )
            // InternalMappingDSL.g:728:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalMappingDSL.g:748:1: (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMappingDSL.g:748:3: otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBoardAccess().getManufacturerKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBoardAccess().getEqualsSignKeyword_3_1());
                          
                    }
                    // InternalMappingDSL.g:756:1: ( (lv_manufacturer_5_0= RULE_STRING ) )
                    // InternalMappingDSL.g:757:1: (lv_manufacturer_5_0= RULE_STRING )
                    {
                    // InternalMappingDSL.g:757:1: (lv_manufacturer_5_0= RULE_STRING )
                    // InternalMappingDSL.g:758:3: lv_manufacturer_5_0= RULE_STRING
                    {
                    lv_manufacturer_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getBoardAccess().getSemicolonKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:778:3: (otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMappingDSL.g:778:5: otherlv_7= 'Type' otherlv_8= '=' ( (lv_boardType_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getBoardAccess().getTypeKeyword_4_0());
                          
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBoardAccess().getEqualsSignKeyword_4_1());
                          
                    }
                    // InternalMappingDSL.g:786:1: ( (lv_boardType_9_0= RULE_STRING ) )
                    // InternalMappingDSL.g:787:1: (lv_boardType_9_0= RULE_STRING )
                    {
                    // InternalMappingDSL.g:787:1: (lv_boardType_9_0= RULE_STRING )
                    // InternalMappingDSL.g:788:3: lv_boardType_9_0= RULE_STRING
                    {
                    lv_boardType_9_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getBoardAccess().getSemicolonKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:808:3: (otherlv_11= 'PowerSupply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMappingDSL.g:808:5: otherlv_11= 'PowerSupply' otherlv_12= '=' ( (lv_powerSupply_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getBoardAccess().getPowerSupplyKeyword_5_0());
                          
                    }
                    otherlv_12=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getBoardAccess().getEqualsSignKeyword_5_1());
                          
                    }
                    // InternalMappingDSL.g:816:1: ( (lv_powerSupply_13_0= RULE_STRING ) )
                    // InternalMappingDSL.g:817:1: (lv_powerSupply_13_0= RULE_STRING )
                    {
                    // InternalMappingDSL.g:817:1: (lv_powerSupply_13_0= RULE_STRING )
                    // InternalMappingDSL.g:818:3: lv_powerSupply_13_0= RULE_STRING
                    {
                    lv_powerSupply_13_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getBoardAccess().getSemicolonKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:838:3: (otherlv_15= 'DesignAssuranceLevel' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMappingDSL.g:838:5: otherlv_15= 'DesignAssuranceLevel' otherlv_16= '=' ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getBoardAccess().getDesignAssuranceLevelKeyword_6_0());
                          
                    }
                    otherlv_16=(Token)match(input,14,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getBoardAccess().getEqualsSignKeyword_6_1());
                          
                    }
                    // InternalMappingDSL.g:846:1: ( (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType ) )
                    // InternalMappingDSL.g:847:1: (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType )
                    {
                    // InternalMappingDSL.g:847:1: (lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType )
                    // InternalMappingDSL.g:848:3: lv_assuranceLevel_17_0= ruleDesignAssuranceLevelType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBoardAccess().getAssuranceLevelDesignAssuranceLevelTypeEnumRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
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
                              		"ch.hilbri.assist.mappingdsl.MappingDSL.DesignAssuranceLevelType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,15,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getBoardAccess().getSemicolonKeyword_6_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:868:3: (otherlv_19= 'Side' otherlv_20= '=' ( (lv_side_21_0= RULE_STRING ) ) otherlv_22= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMappingDSL.g:868:5: otherlv_19= 'Side' otherlv_20= '=' ( (lv_side_21_0= RULE_STRING ) ) otherlv_22= ';'
                    {
                    otherlv_19=(Token)match(input,23,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getBoardAccess().getSideKeyword_7_0());
                          
                    }
                    otherlv_20=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getBoardAccess().getEqualsSignKeyword_7_1());
                          
                    }
                    // InternalMappingDSL.g:876:1: ( (lv_side_21_0= RULE_STRING ) )
                    // InternalMappingDSL.g:877:1: (lv_side_21_0= RULE_STRING )
                    {
                    // InternalMappingDSL.g:877:1: (lv_side_21_0= RULE_STRING )
                    // InternalMappingDSL.g:878:3: lv_side_21_0= RULE_STRING
                    {
                    lv_side_21_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,15,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getBoardAccess().getSemicolonKeyword_7_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:898:3: (otherlv_23= 'ESS' otherlv_24= '=' ( (lv_ess_25_0= RULE_STRING ) ) otherlv_26= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMappingDSL.g:898:5: otherlv_23= 'ESS' otherlv_24= '=' ( (lv_ess_25_0= RULE_STRING ) ) otherlv_26= ';'
                    {
                    otherlv_23=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getBoardAccess().getESSKeyword_8_0());
                          
                    }
                    otherlv_24=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getBoardAccess().getEqualsSignKeyword_8_1());
                          
                    }
                    // InternalMappingDSL.g:906:1: ( (lv_ess_25_0= RULE_STRING ) )
                    // InternalMappingDSL.g:907:1: (lv_ess_25_0= RULE_STRING )
                    {
                    // InternalMappingDSL.g:907:1: (lv_ess_25_0= RULE_STRING )
                    // InternalMappingDSL.g:908:3: lv_ess_25_0= RULE_STRING
                    {
                    lv_ess_25_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    otherlv_26=(Token)match(input,15,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getBoardAccess().getSemicolonKeyword_8_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:928:3: (otherlv_27= 'RAM' otherlv_28= '=' ( (lv_ramCapacity_29_0= RULE_INT ) ) otherlv_30= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMappingDSL.g:928:5: otherlv_27= 'RAM' otherlv_28= '=' ( (lv_ramCapacity_29_0= RULE_INT ) ) otherlv_30= ';'
                    {
                    otherlv_27=(Token)match(input,31,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getBoardAccess().getRAMKeyword_9_0());
                          
                    }
                    otherlv_28=(Token)match(input,14,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getBoardAccess().getEqualsSignKeyword_9_1());
                          
                    }
                    // InternalMappingDSL.g:936:1: ( (lv_ramCapacity_29_0= RULE_INT ) )
                    // InternalMappingDSL.g:937:1: (lv_ramCapacity_29_0= RULE_INT )
                    {
                    // InternalMappingDSL.g:937:1: (lv_ramCapacity_29_0= RULE_INT )
                    // InternalMappingDSL.g:938:3: lv_ramCapacity_29_0= RULE_INT
                    {
                    lv_ramCapacity_29_0=(Token)match(input,RULE_INT,FOLLOW_7); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }

                    otherlv_30=(Token)match(input,15,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getBoardAccess().getSemicolonKeyword_9_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:958:3: (otherlv_31= 'ROM' otherlv_32= '=' ( (lv_romCapacity_33_0= RULE_INT ) ) otherlv_34= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMappingDSL.g:958:5: otherlv_31= 'ROM' otherlv_32= '=' ( (lv_romCapacity_33_0= RULE_INT ) ) otherlv_34= ';'
                    {
                    otherlv_31=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getBoardAccess().getROMKeyword_10_0());
                          
                    }
                    otherlv_32=(Token)match(input,14,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getBoardAccess().getEqualsSignKeyword_10_1());
                          
                    }
                    // InternalMappingDSL.g:966:1: ( (lv_romCapacity_33_0= RULE_INT ) )
                    // InternalMappingDSL.g:967:1: (lv_romCapacity_33_0= RULE_INT )
                    {
                    // InternalMappingDSL.g:967:1: (lv_romCapacity_33_0= RULE_INT )
                    // InternalMappingDSL.g:968:3: lv_romCapacity_33_0= RULE_INT
                    {
                    lv_romCapacity_33_0=(Token)match(input,RULE_INT,FOLLOW_7); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }

                    otherlv_34=(Token)match(input,15,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_34, grammarAccess.getBoardAccess().getSemicolonKeyword_10_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:988:3: ( (lv_processors_35_0= ruleProcessor ) )+
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
            	    // InternalMappingDSL.g:989:1: (lv_processors_35_0= ruleProcessor )
            	    {
            	    // InternalMappingDSL.g:989:1: (lv_processors_35_0= ruleProcessor )
            	    // InternalMappingDSL.g:990:3: lv_processors_35_0= ruleProcessor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBoardAccess().getProcessorsProcessorParserRuleCall_11_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_32);
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
            	              		"ch.hilbri.assist.mappingdsl.MappingDSL.Processor");
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

            // InternalMappingDSL.g:1006:3: ( (lv_ioAdapters_36_0= ruleIOAdapter ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==37) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMappingDSL.g:1007:1: (lv_ioAdapters_36_0= ruleIOAdapter )
            	    {
            	    // InternalMappingDSL.g:1007:1: (lv_ioAdapters_36_0= ruleIOAdapter )
            	    // InternalMappingDSL.g:1008:3: lv_ioAdapters_36_0= ruleIOAdapter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBoardAccess().getIoAdaptersIOAdapterParserRuleCall_12_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_33);
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
            	              		"ch.hilbri.assist.mappingdsl.MappingDSL.IOAdapter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalMappingDSL.g:1024:3: (otherlv_37= 'Properties' otherlv_38= '{' ( (lv_metricParameters_39_0= ruleMetricParameter ) )* otherlv_40= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMappingDSL.g:1024:5: otherlv_37= 'Properties' otherlv_38= '{' ( (lv_metricParameters_39_0= ruleMetricParameter ) )* otherlv_40= '}'
                    {
                    otherlv_37=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getBoardAccess().getPropertiesKeyword_13_0());
                          
                    }
                    otherlv_38=(Token)match(input,12,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_38, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_13_1());
                          
                    }
                    // InternalMappingDSL.g:1032:1: ( (lv_metricParameters_39_0= ruleMetricParameter ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_STRING) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalMappingDSL.g:1033:1: (lv_metricParameters_39_0= ruleMetricParameter )
                    	    {
                    	    // InternalMappingDSL.g:1033:1: (lv_metricParameters_39_0= ruleMetricParameter )
                    	    // InternalMappingDSL.g:1034:3: lv_metricParameters_39_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBoardAccess().getMetricParametersMetricParameterParserRuleCall_13_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_26);
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
                    	              		"ch.hilbri.assist.mappingdsl.MappingDSL.MetricParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_40=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_13_3());
                          
                    }

                    }
                    break;

            }

            otherlv_41=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:1066:1: entryRuleProcessor returns [EObject current=null] : iv_ruleProcessor= ruleProcessor EOF ;
    public final EObject entryRuleProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessor = null;


        try {
            // InternalMappingDSL.g:1067:2: (iv_ruleProcessor= ruleProcessor EOF )
            // InternalMappingDSL.g:1068:2: iv_ruleProcessor= ruleProcessor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcessorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcessor=ruleProcessor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcessor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:1075:1: ruleProcessor returns [EObject current=null] : (otherlv_0= 'Processor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )? ( (lv_cores_11_0= ruleCore ) )+ (otherlv_12= 'Properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalMappingDSL.g:1078:28: ( (otherlv_0= 'Processor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )? ( (lv_cores_11_0= ruleCore ) )+ (otherlv_12= 'Properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalMappingDSL.g:1079:1: (otherlv_0= 'Processor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )? ( (lv_cores_11_0= ruleCore ) )+ (otherlv_12= 'Properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalMappingDSL.g:1079:1: (otherlv_0= 'Processor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )? ( (lv_cores_11_0= ruleCore ) )+ (otherlv_12= 'Properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalMappingDSL.g:1079:3: otherlv_0= 'Processor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )? ( (lv_cores_11_0= ruleCore ) )+ (otherlv_12= 'Properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProcessorAccess().getProcessorKeyword_0());
                  
            }
            // InternalMappingDSL.g:1083:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalMappingDSL.g:1084:1: (lv_name_1_0= RULE_ID )
            {
            // InternalMappingDSL.g:1084:1: (lv_name_1_0= RULE_ID )
            // InternalMappingDSL.g:1085:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getProcessorAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalMappingDSL.g:1105:1: (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==21) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMappingDSL.g:1105:3: otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getProcessorAccess().getManufacturerKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getProcessorAccess().getEqualsSignKeyword_3_1());
                          
                    }
                    // InternalMappingDSL.g:1113:1: ( (lv_manufacturer_5_0= RULE_STRING ) )
                    // InternalMappingDSL.g:1114:1: (lv_manufacturer_5_0= RULE_STRING )
                    {
                    // InternalMappingDSL.g:1114:1: (lv_manufacturer_5_0= RULE_STRING )
                    // InternalMappingDSL.g:1115:3: lv_manufacturer_5_0= RULE_STRING
                    {
                    lv_manufacturer_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getProcessorAccess().getSemicolonKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:1135:3: (otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMappingDSL.g:1135:5: otherlv_7= 'Type' otherlv_8= '=' ( (lv_processorType_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getProcessorAccess().getTypeKeyword_4_0());
                          
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getProcessorAccess().getEqualsSignKeyword_4_1());
                          
                    }
                    // InternalMappingDSL.g:1143:1: ( (lv_processorType_9_0= RULE_STRING ) )
                    // InternalMappingDSL.g:1144:1: (lv_processorType_9_0= RULE_STRING )
                    {
                    // InternalMappingDSL.g:1144:1: (lv_processorType_9_0= RULE_STRING )
                    // InternalMappingDSL.g:1145:3: lv_processorType_9_0= RULE_STRING
                    {
                    lv_processorType_9_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getProcessorAccess().getSemicolonKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:1165:3: ( (lv_cores_11_0= ruleCore ) )+
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
            	    // InternalMappingDSL.g:1166:1: (lv_cores_11_0= ruleCore )
            	    {
            	    // InternalMappingDSL.g:1166:1: (lv_cores_11_0= ruleCore )
            	    // InternalMappingDSL.g:1167:3: lv_cores_11_0= ruleCore
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProcessorAccess().getCoresCoreParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_35);
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
            	              		"ch.hilbri.assist.mappingdsl.MappingDSL.Core");
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

            // InternalMappingDSL.g:1183:3: (otherlv_12= 'Properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==25) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMappingDSL.g:1183:5: otherlv_12= 'Properties' otherlv_13= '{' ( (lv_metricParameters_14_0= ruleMetricParameter ) )* otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getProcessorAccess().getPropertiesKeyword_6_0());
                          
                    }
                    otherlv_13=(Token)match(input,12,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getProcessorAccess().getLeftCurlyBracketKeyword_6_1());
                          
                    }
                    // InternalMappingDSL.g:1191:1: ( (lv_metricParameters_14_0= ruleMetricParameter ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_STRING) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalMappingDSL.g:1192:1: (lv_metricParameters_14_0= ruleMetricParameter )
                    	    {
                    	    // InternalMappingDSL.g:1192:1: (lv_metricParameters_14_0= ruleMetricParameter )
                    	    // InternalMappingDSL.g:1193:3: lv_metricParameters_14_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getProcessorAccess().getMetricParametersMetricParameterParserRuleCall_6_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_26);
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
                    	              		"ch.hilbri.assist.mappingdsl.MappingDSL.MetricParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getProcessorAccess().getRightCurlyBracketKeyword_6_3());
                          
                    }

                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:1225:1: entryRuleCore returns [EObject current=null] : iv_ruleCore= ruleCore EOF ;
    public final EObject entryRuleCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCore = null;


        try {
            // InternalMappingDSL.g:1226:2: (iv_ruleCore= ruleCore EOF )
            // InternalMappingDSL.g:1227:2: iv_ruleCore= ruleCore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoreRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCore=ruleCore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCore; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:1234:1: ruleCore returns [EObject current=null] : (otherlv_0= 'Core' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // InternalMappingDSL.g:1237:28: ( (otherlv_0= 'Core' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalMappingDSL.g:1238:1: (otherlv_0= 'Core' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalMappingDSL.g:1238:1: (otherlv_0= 'Core' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalMappingDSL.g:1238:3: otherlv_0= 'Core' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCoreAccess().getCoreKeyword_0());
                  
            }
            // InternalMappingDSL.g:1242:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalMappingDSL.g:1243:1: (lv_name_1_0= RULE_ID )
            {
            // InternalMappingDSL.g:1243:1: (lv_name_1_0= RULE_ID )
            // InternalMappingDSL.g:1244:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCoreAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalMappingDSL.g:1264:1: (otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMappingDSL.g:1264:3: otherlv_3= 'Capacity' otherlv_4= '=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCoreAccess().getCapacityKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,14,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCoreAccess().getEqualsSignKeyword_3_1());
                          
                    }
                    // InternalMappingDSL.g:1272:1: ( (lv_capacity_5_0= RULE_INT ) )
                    // InternalMappingDSL.g:1273:1: (lv_capacity_5_0= RULE_INT )
                    {
                    // InternalMappingDSL.g:1273:1: (lv_capacity_5_0= RULE_INT )
                    // InternalMappingDSL.g:1274:3: lv_capacity_5_0= RULE_INT
                    {
                    lv_capacity_5_0=(Token)match(input,RULE_INT,FOLLOW_7); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCoreAccess().getSemicolonKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:1294:3: (otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMappingDSL.g:1294:5: otherlv_7= 'Architecture' otherlv_8= '=' ( (lv_architecture_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getCoreAccess().getArchitectureKeyword_4_0());
                          
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getCoreAccess().getEqualsSignKeyword_4_1());
                          
                    }
                    // InternalMappingDSL.g:1302:1: ( (lv_architecture_9_0= RULE_STRING ) )
                    // InternalMappingDSL.g:1303:1: (lv_architecture_9_0= RULE_STRING )
                    {
                    // InternalMappingDSL.g:1303:1: (lv_architecture_9_0= RULE_STRING )
                    // InternalMappingDSL.g:1304:3: lv_architecture_9_0= RULE_STRING
                    {
                    lv_architecture_9_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getCoreAccess().getSemicolonKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:1324:3: (otherlv_11= 'Properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==25) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMappingDSL.g:1324:5: otherlv_11= 'Properties' otherlv_12= '{' ( (lv_metricParameters_13_0= ruleMetricParameter ) )* otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getCoreAccess().getPropertiesKeyword_5_0());
                          
                    }
                    otherlv_12=(Token)match(input,12,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getCoreAccess().getLeftCurlyBracketKeyword_5_1());
                          
                    }
                    // InternalMappingDSL.g:1332:1: ( (lv_metricParameters_13_0= ruleMetricParameter ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_STRING) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalMappingDSL.g:1333:1: (lv_metricParameters_13_0= ruleMetricParameter )
                    	    {
                    	    // InternalMappingDSL.g:1333:1: (lv_metricParameters_13_0= ruleMetricParameter )
                    	    // InternalMappingDSL.g:1334:3: lv_metricParameters_13_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCoreAccess().getMetricParametersMetricParameterParserRuleCall_5_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_26);
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
                    	              		"ch.hilbri.assist.mappingdsl.MappingDSL.MetricParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getCoreAccess().getRightCurlyBracketKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            otherlv_15=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:1366:1: entryRuleIOAdapter returns [EObject current=null] : iv_ruleIOAdapter= ruleIOAdapter EOF ;
    public final EObject entryRuleIOAdapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIOAdapter = null;


        try {
            // InternalMappingDSL.g:1367:2: (iv_ruleIOAdapter= ruleIOAdapter EOF )
            // InternalMappingDSL.g:1368:2: iv_ruleIOAdapter= ruleIOAdapter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIOAdapterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIOAdapter=ruleIOAdapter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIOAdapter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:1375:1: ruleIOAdapter returns [EObject current=null] : (otherlv_0= 'Adapter' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_adapterType_4_0= ruleIOAdapterType ) ) otherlv_5= ';' otherlv_6= 'count' otherlv_7= '=' ( (lv_totalCount_8_0= RULE_INT ) ) otherlv_9= ';' (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )? otherlv_14= '}' ) ;
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
            // InternalMappingDSL.g:1378:28: ( (otherlv_0= 'Adapter' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_adapterType_4_0= ruleIOAdapterType ) ) otherlv_5= ';' otherlv_6= 'count' otherlv_7= '=' ( (lv_totalCount_8_0= RULE_INT ) ) otherlv_9= ';' (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )? otherlv_14= '}' ) )
            // InternalMappingDSL.g:1379:1: (otherlv_0= 'Adapter' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_adapterType_4_0= ruleIOAdapterType ) ) otherlv_5= ';' otherlv_6= 'count' otherlv_7= '=' ( (lv_totalCount_8_0= RULE_INT ) ) otherlv_9= ';' (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )? otherlv_14= '}' )
            {
            // InternalMappingDSL.g:1379:1: (otherlv_0= 'Adapter' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_adapterType_4_0= ruleIOAdapterType ) ) otherlv_5= ';' otherlv_6= 'count' otherlv_7= '=' ( (lv_totalCount_8_0= RULE_INT ) ) otherlv_9= ';' (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )? otherlv_14= '}' )
            // InternalMappingDSL.g:1379:3: otherlv_0= 'Adapter' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_adapterType_4_0= ruleIOAdapterType ) ) otherlv_5= ';' otherlv_6= 'count' otherlv_7= '=' ( (lv_totalCount_8_0= RULE_INT ) ) otherlv_9= ';' (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIOAdapterAccess().getAdapterKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIOAdapterAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIOAdapterAccess().getTypeKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIOAdapterAccess().getEqualsSignKeyword_3());
                  
            }
            // InternalMappingDSL.g:1395:1: ( (lv_adapterType_4_0= ruleIOAdapterType ) )
            // InternalMappingDSL.g:1396:1: (lv_adapterType_4_0= ruleIOAdapterType )
            {
            // InternalMappingDSL.g:1396:1: (lv_adapterType_4_0= ruleIOAdapterType )
            // InternalMappingDSL.g:1397:3: lv_adapterType_4_0= ruleIOAdapterType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIOAdapterAccess().getAdapterTypeIOAdapterTypeEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
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
                      		"ch.hilbri.assist.mappingdsl.MappingDSL.IOAdapterType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getIOAdapterAccess().getSemicolonKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getIOAdapterAccess().getCountKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,14,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getIOAdapterAccess().getEqualsSignKeyword_7());
                  
            }
            // InternalMappingDSL.g:1425:1: ( (lv_totalCount_8_0= RULE_INT ) )
            // InternalMappingDSL.g:1426:1: (lv_totalCount_8_0= RULE_INT )
            {
            // InternalMappingDSL.g:1426:1: (lv_totalCount_8_0= RULE_INT )
            // InternalMappingDSL.g:1427:3: lv_totalCount_8_0= RULE_INT
            {
            lv_totalCount_8_0=(Token)match(input,RULE_INT,FOLLOW_7); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.INT");
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getIOAdapterAccess().getSemicolonKeyword_9());
                  
            }
            // InternalMappingDSL.g:1447:1: (otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==40) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMappingDSL.g:1447:3: otherlv_10= 'protection-level' otherlv_11= '=' ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getIOAdapterAccess().getProtectionLevelKeyword_10_0());
                          
                    }
                    otherlv_11=(Token)match(input,14,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getIOAdapterAccess().getEqualsSignKeyword_10_1());
                          
                    }
                    // InternalMappingDSL.g:1455:1: ( (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType ) )
                    // InternalMappingDSL.g:1456:1: (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType )
                    {
                    // InternalMappingDSL.g:1456:1: (lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType )
                    // InternalMappingDSL.g:1457:3: lv_protectionLevel_12_0= ruleIOAdapterProtectionLevelType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIOAdapterAccess().getProtectionLevelIOAdapterProtectionLevelTypeEnumRuleCall_10_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
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
                              		"ch.hilbri.assist.mappingdsl.MappingDSL.IOAdapterProtectionLevelType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getIOAdapterAccess().getSemicolonKeyword_10_3());
                          
                    }

                    }
                    break;

            }

            otherlv_14=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:1489:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalMappingDSL.g:1490:2: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalMappingDSL.g:1491:2: iv_ruleNetwork= ruleNetwork EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNetworkRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNetwork=ruleNetwork();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNetwork; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:1498:1: ruleNetwork returns [EObject current=null] : (otherlv_0= 'Network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Bandwidth' otherlv_4= '=' ( (lv_bandwidthCapacity_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'Connects' ( ( ruleQualifiedName ) ) otherlv_9= ',' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ';' (otherlv_14= 'Properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // InternalMappingDSL.g:1501:28: ( (otherlv_0= 'Network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Bandwidth' otherlv_4= '=' ( (lv_bandwidthCapacity_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'Connects' ( ( ruleQualifiedName ) ) otherlv_9= ',' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ';' (otherlv_14= 'Properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalMappingDSL.g:1502:1: (otherlv_0= 'Network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Bandwidth' otherlv_4= '=' ( (lv_bandwidthCapacity_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'Connects' ( ( ruleQualifiedName ) ) otherlv_9= ',' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ';' (otherlv_14= 'Properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalMappingDSL.g:1502:1: (otherlv_0= 'Network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Bandwidth' otherlv_4= '=' ( (lv_bandwidthCapacity_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'Connects' ( ( ruleQualifiedName ) ) otherlv_9= ',' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ';' (otherlv_14= 'Properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalMappingDSL.g:1502:3: otherlv_0= 'Network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Bandwidth' otherlv_4= '=' ( (lv_bandwidthCapacity_5_0= RULE_INT ) ) otherlv_6= ';' otherlv_7= 'Connects' ( ( ruleQualifiedName ) ) otherlv_9= ',' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ';' (otherlv_14= 'Properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNetworkAccess().getNetworkKeyword_0());
                  
            }
            // InternalMappingDSL.g:1506:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalMappingDSL.g:1507:1: (lv_name_1_0= RULE_ID )
            {
            // InternalMappingDSL.g:1507:1: (lv_name_1_0= RULE_ID )
            // InternalMappingDSL.g:1508:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,42,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getNetworkAccess().getBandwidthKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,14,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getNetworkAccess().getEqualsSignKeyword_4());
                  
            }
            // InternalMappingDSL.g:1536:1: ( (lv_bandwidthCapacity_5_0= RULE_INT ) )
            // InternalMappingDSL.g:1537:1: (lv_bandwidthCapacity_5_0= RULE_INT )
            {
            // InternalMappingDSL.g:1537:1: (lv_bandwidthCapacity_5_0= RULE_INT )
            // InternalMappingDSL.g:1538:3: lv_bandwidthCapacity_5_0= RULE_INT
            {
            lv_bandwidthCapacity_5_0=(Token)match(input,RULE_INT,FOLLOW_7); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.INT");
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getNetworkAccess().getSemicolonKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,43,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getNetworkAccess().getConnectsKeyword_7());
                  
            }
            // InternalMappingDSL.g:1562:1: ( ( ruleQualifiedName ) )
            // InternalMappingDSL.g:1563:1: ( ruleQualifiedName )
            {
            // InternalMappingDSL.g:1563:1: ( ruleQualifiedName )
            // InternalMappingDSL.g:1564:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNetworkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNetworkAccess().getBoardsBoardCrossReference_8_0()); 
              	    
            }
            pushFollow(FOLLOW_46);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,44,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getNetworkAccess().getCommaKeyword_9());
                  
            }
            // InternalMappingDSL.g:1581:1: ( ( ruleQualifiedName ) )
            // InternalMappingDSL.g:1582:1: ( ruleQualifiedName )
            {
            // InternalMappingDSL.g:1582:1: ( ruleQualifiedName )
            // InternalMappingDSL.g:1583:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNetworkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNetworkAccess().getBoardsBoardCrossReference_10_0()); 
              	    
            }
            pushFollow(FOLLOW_47);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalMappingDSL.g:1596:2: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==44) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMappingDSL.g:1596:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_11=(Token)match(input,44,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getNetworkAccess().getCommaKeyword_11_0());
            	          
            	    }
            	    // InternalMappingDSL.g:1600:1: ( ( ruleQualifiedName ) )
            	    // InternalMappingDSL.g:1601:1: ( ruleQualifiedName )
            	    {
            	    // InternalMappingDSL.g:1601:1: ( ruleQualifiedName )
            	    // InternalMappingDSL.g:1602:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getNetworkRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNetworkAccess().getBoardsBoardCrossReference_11_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_47);
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

            otherlv_13=(Token)match(input,15,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getNetworkAccess().getSemicolonKeyword_12());
                  
            }
            // InternalMappingDSL.g:1619:1: (otherlv_14= 'Properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==25) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMappingDSL.g:1619:3: otherlv_14= 'Properties' otherlv_15= '{' ( (lv_metricParameters_16_0= ruleMetricParameter ) )* otherlv_17= '}'
                    {
                    otherlv_14=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getNetworkAccess().getPropertiesKeyword_13_0());
                          
                    }
                    otherlv_15=(Token)match(input,12,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_13_1());
                          
                    }
                    // InternalMappingDSL.g:1627:1: ( (lv_metricParameters_16_0= ruleMetricParameter ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_STRING) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalMappingDSL.g:1628:1: (lv_metricParameters_16_0= ruleMetricParameter )
                    	    {
                    	    // InternalMappingDSL.g:1628:1: (lv_metricParameters_16_0= ruleMetricParameter )
                    	    // InternalMappingDSL.g:1629:3: lv_metricParameters_16_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNetworkAccess().getMetricParametersMetricParameterParserRuleCall_13_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_26);
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
                    	              		"ch.hilbri.assist.mappingdsl.MappingDSL.MetricParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_13_3());
                          
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:1661:1: entryRuleApplicationGroup returns [EObject current=null] : iv_ruleApplicationGroup= ruleApplicationGroup EOF ;
    public final EObject entryRuleApplicationGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationGroup = null;


        try {
            // InternalMappingDSL.g:1662:2: (iv_ruleApplicationGroup= ruleApplicationGroup EOF )
            // InternalMappingDSL.g:1663:2: iv_ruleApplicationGroup= ruleApplicationGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationGroupRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleApplicationGroup=ruleApplicationGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplicationGroup; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:1670:1: ruleApplicationGroup returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' ) ;
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
            // InternalMappingDSL.g:1673:28: ( (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' ) )
            // InternalMappingDSL.g:1674:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' )
            {
            // InternalMappingDSL.g:1674:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' )
            // InternalMappingDSL.g:1674:3: otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getApplicationGroupAccess().getGroupKeyword_0());
                  
            }
            // InternalMappingDSL.g:1678:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalMappingDSL.g:1679:1: (lv_name_1_0= RULE_ID )
            {
            // InternalMappingDSL.g:1679:1: (lv_name_1_0= RULE_ID )
            // InternalMappingDSL.g:1680:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getApplicationGroupAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalMappingDSL.g:1700:1: ( (otherlv_3= RULE_ID ) )
            // InternalMappingDSL.g:1701:1: (otherlv_3= RULE_ID )
            {
            // InternalMappingDSL.g:1701:1: (otherlv_3= RULE_ID )
            // InternalMappingDSL.g:1702:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getApplicationGroupRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getApplicationGroupAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_3_0()); 
              	
            }

            }


            }

            // InternalMappingDSL.g:1713:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+
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
            	    // InternalMappingDSL.g:1713:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,44,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getApplicationGroupAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalMappingDSL.g:1717:1: ( (otherlv_5= RULE_ID ) )
            	    // InternalMappingDSL.g:1718:1: (otherlv_5= RULE_ID )
            	    {
            	    // InternalMappingDSL.g:1718:1: (otherlv_5= RULE_ID )
            	    // InternalMappingDSL.g:1719:3: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getApplicationGroupRule());
            	      	        }
            	              
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:1742:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalMappingDSL.g:1743:2: (iv_ruleApplication= ruleApplication EOF )
            // InternalMappingDSL.g:1744:2: iv_ruleApplication= ruleApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:1751:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Required' otherlv_8= 'RAM' otherlv_9= 'capacity' otherlv_10= '=' ( (lv_ramUtilization_11_0= RULE_INT ) ) otherlv_12= ';' )? (otherlv_13= 'Required' otherlv_14= 'ROM' otherlv_15= 'capacity' otherlv_16= '=' ( (lv_romUtilization_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'Criticality' otherlv_20= 'level' otherlv_21= '=' ( (lv_criticalityLevel_22_0= ruleDesignAssuranceLevelType ) ) otherlv_23= ';' )? (otherlv_24= 'Required' otherlv_25= 'IO' otherlv_26= 'protection' otherlv_27= '=' ( (lv_ioAdapterProtectionLevel_28_0= ruleIOAdapterProtectionLevelType ) ) otherlv_29= ';' )? (otherlv_30= 'Identical' otherlv_31= 'parallel' otherlv_32= 'threads' otherlv_33= '=' ( (lv_parallelThreads_34_0= RULE_INT ) ) otherlv_35= ';' )? (otherlv_36= 'Developer' otherlv_37= '=' ( (lv_developedBy_38_0= RULE_STRING ) ) otherlv_39= ';' )? ( (lv_ioAdapterRequirements_40_0= ruleIOAdapterRequirement ) )* (otherlv_41= 'Restrict' otherlv_42= 'deployment' otherlv_43= 'to' otherlv_44= '{' ( ( ruleQualifiedName ) ) (otherlv_46= ',' ( ( ruleQualifiedName ) ) )* otherlv_48= '}' otherlv_49= ';' )? (otherlv_50= 'Properties' otherlv_51= '{' ( (lv_metricParameters_52_0= ruleMetricParameter ) )* otherlv_53= '}' )? otherlv_54= '}' ) ;
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
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_ramUtilization_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_romUtilization_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token lv_parallelThreads_34_0=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token lv_developedBy_38_0=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Enumerator lv_criticalityLevel_22_0 = null;

        Enumerator lv_ioAdapterProtectionLevel_28_0 = null;

        EObject lv_ioAdapterRequirements_40_0 = null;

        EObject lv_metricParameters_52_0 = null;


         enterRule(); 
            
        try {
            // InternalMappingDSL.g:1754:28: ( (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Required' otherlv_8= 'RAM' otherlv_9= 'capacity' otherlv_10= '=' ( (lv_ramUtilization_11_0= RULE_INT ) ) otherlv_12= ';' )? (otherlv_13= 'Required' otherlv_14= 'ROM' otherlv_15= 'capacity' otherlv_16= '=' ( (lv_romUtilization_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'Criticality' otherlv_20= 'level' otherlv_21= '=' ( (lv_criticalityLevel_22_0= ruleDesignAssuranceLevelType ) ) otherlv_23= ';' )? (otherlv_24= 'Required' otherlv_25= 'IO' otherlv_26= 'protection' otherlv_27= '=' ( (lv_ioAdapterProtectionLevel_28_0= ruleIOAdapterProtectionLevelType ) ) otherlv_29= ';' )? (otherlv_30= 'Identical' otherlv_31= 'parallel' otherlv_32= 'threads' otherlv_33= '=' ( (lv_parallelThreads_34_0= RULE_INT ) ) otherlv_35= ';' )? (otherlv_36= 'Developer' otherlv_37= '=' ( (lv_developedBy_38_0= RULE_STRING ) ) otherlv_39= ';' )? ( (lv_ioAdapterRequirements_40_0= ruleIOAdapterRequirement ) )* (otherlv_41= 'Restrict' otherlv_42= 'deployment' otherlv_43= 'to' otherlv_44= '{' ( ( ruleQualifiedName ) ) (otherlv_46= ',' ( ( ruleQualifiedName ) ) )* otherlv_48= '}' otherlv_49= ';' )? (otherlv_50= 'Properties' otherlv_51= '{' ( (lv_metricParameters_52_0= ruleMetricParameter ) )* otherlv_53= '}' )? otherlv_54= '}' ) )
            // InternalMappingDSL.g:1755:1: (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Required' otherlv_8= 'RAM' otherlv_9= 'capacity' otherlv_10= '=' ( (lv_ramUtilization_11_0= RULE_INT ) ) otherlv_12= ';' )? (otherlv_13= 'Required' otherlv_14= 'ROM' otherlv_15= 'capacity' otherlv_16= '=' ( (lv_romUtilization_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'Criticality' otherlv_20= 'level' otherlv_21= '=' ( (lv_criticalityLevel_22_0= ruleDesignAssuranceLevelType ) ) otherlv_23= ';' )? (otherlv_24= 'Required' otherlv_25= 'IO' otherlv_26= 'protection' otherlv_27= '=' ( (lv_ioAdapterProtectionLevel_28_0= ruleIOAdapterProtectionLevelType ) ) otherlv_29= ';' )? (otherlv_30= 'Identical' otherlv_31= 'parallel' otherlv_32= 'threads' otherlv_33= '=' ( (lv_parallelThreads_34_0= RULE_INT ) ) otherlv_35= ';' )? (otherlv_36= 'Developer' otherlv_37= '=' ( (lv_developedBy_38_0= RULE_STRING ) ) otherlv_39= ';' )? ( (lv_ioAdapterRequirements_40_0= ruleIOAdapterRequirement ) )* (otherlv_41= 'Restrict' otherlv_42= 'deployment' otherlv_43= 'to' otherlv_44= '{' ( ( ruleQualifiedName ) ) (otherlv_46= ',' ( ( ruleQualifiedName ) ) )* otherlv_48= '}' otherlv_49= ';' )? (otherlv_50= 'Properties' otherlv_51= '{' ( (lv_metricParameters_52_0= ruleMetricParameter ) )* otherlv_53= '}' )? otherlv_54= '}' )
            {
            // InternalMappingDSL.g:1755:1: (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Required' otherlv_8= 'RAM' otherlv_9= 'capacity' otherlv_10= '=' ( (lv_ramUtilization_11_0= RULE_INT ) ) otherlv_12= ';' )? (otherlv_13= 'Required' otherlv_14= 'ROM' otherlv_15= 'capacity' otherlv_16= '=' ( (lv_romUtilization_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'Criticality' otherlv_20= 'level' otherlv_21= '=' ( (lv_criticalityLevel_22_0= ruleDesignAssuranceLevelType ) ) otherlv_23= ';' )? (otherlv_24= 'Required' otherlv_25= 'IO' otherlv_26= 'protection' otherlv_27= '=' ( (lv_ioAdapterProtectionLevel_28_0= ruleIOAdapterProtectionLevelType ) ) otherlv_29= ';' )? (otherlv_30= 'Identical' otherlv_31= 'parallel' otherlv_32= 'threads' otherlv_33= '=' ( (lv_parallelThreads_34_0= RULE_INT ) ) otherlv_35= ';' )? (otherlv_36= 'Developer' otherlv_37= '=' ( (lv_developedBy_38_0= RULE_STRING ) ) otherlv_39= ';' )? ( (lv_ioAdapterRequirements_40_0= ruleIOAdapterRequirement ) )* (otherlv_41= 'Restrict' otherlv_42= 'deployment' otherlv_43= 'to' otherlv_44= '{' ( ( ruleQualifiedName ) ) (otherlv_46= ',' ( ( ruleQualifiedName ) ) )* otherlv_48= '}' otherlv_49= ';' )? (otherlv_50= 'Properties' otherlv_51= '{' ( (lv_metricParameters_52_0= ruleMetricParameter ) )* otherlv_53= '}' )? otherlv_54= '}' )
            // InternalMappingDSL.g:1755:3: otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';' )? (otherlv_7= 'Required' otherlv_8= 'RAM' otherlv_9= 'capacity' otherlv_10= '=' ( (lv_ramUtilization_11_0= RULE_INT ) ) otherlv_12= ';' )? (otherlv_13= 'Required' otherlv_14= 'ROM' otherlv_15= 'capacity' otherlv_16= '=' ( (lv_romUtilization_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'Criticality' otherlv_20= 'level' otherlv_21= '=' ( (lv_criticalityLevel_22_0= ruleDesignAssuranceLevelType ) ) otherlv_23= ';' )? (otherlv_24= 'Required' otherlv_25= 'IO' otherlv_26= 'protection' otherlv_27= '=' ( (lv_ioAdapterProtectionLevel_28_0= ruleIOAdapterProtectionLevelType ) ) otherlv_29= ';' )? (otherlv_30= 'Identical' otherlv_31= 'parallel' otherlv_32= 'threads' otherlv_33= '=' ( (lv_parallelThreads_34_0= RULE_INT ) ) otherlv_35= ';' )? (otherlv_36= 'Developer' otherlv_37= '=' ( (lv_developedBy_38_0= RULE_STRING ) ) otherlv_39= ';' )? ( (lv_ioAdapterRequirements_40_0= ruleIOAdapterRequirement ) )* (otherlv_41= 'Restrict' otherlv_42= 'deployment' otherlv_43= 'to' otherlv_44= '{' ( ( ruleQualifiedName ) ) (otherlv_46= ',' ( ( ruleQualifiedName ) ) )* otherlv_48= '}' otherlv_49= ';' )? (otherlv_50= 'Properties' otherlv_51= '{' ( (lv_metricParameters_52_0= ruleMetricParameter ) )* otherlv_53= '}' )? otherlv_54= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
                  
            }
            // InternalMappingDSL.g:1759:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalMappingDSL.g:1760:1: (lv_name_1_0= RULE_ID )
            {
            // InternalMappingDSL.g:1760:1: (lv_name_1_0= RULE_ID )
            // InternalMappingDSL.g:1761:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalMappingDSL.g:1781:1: (otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==47) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMappingDSL.g:1781:3: otherlv_3= 'Core-utilization' otherlv_4= '=' ( (lv_coreUtilization_5_0= RULE_INT ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getApplicationAccess().getCoreUtilizationKeyword_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,14,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getEqualsSignKeyword_3_1());
                          
                    }
                    // InternalMappingDSL.g:1789:1: ( (lv_coreUtilization_5_0= RULE_INT ) )
                    // InternalMappingDSL.g:1790:1: (lv_coreUtilization_5_0= RULE_INT )
                    {
                    // InternalMappingDSL.g:1790:1: (lv_coreUtilization_5_0= RULE_INT )
                    // InternalMappingDSL.g:1791:3: lv_coreUtilization_5_0= RULE_INT
                    {
                    lv_coreUtilization_5_0=(Token)match(input,RULE_INT,FOLLOW_7); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getSemicolonKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:1811:3: (otherlv_7= 'Required' otherlv_8= 'RAM' otherlv_9= 'capacity' otherlv_10= '=' ( (lv_ramUtilization_11_0= RULE_INT ) ) otherlv_12= ';' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==48) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==31) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // InternalMappingDSL.g:1811:5: otherlv_7= 'Required' otherlv_8= 'RAM' otherlv_9= 'capacity' otherlv_10= '=' ( (lv_ramUtilization_11_0= RULE_INT ) ) otherlv_12= ';'
                    {
                    otherlv_7=(Token)match(input,48,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getApplicationAccess().getRequiredKeyword_4_0());
                          
                    }
                    otherlv_8=(Token)match(input,31,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getApplicationAccess().getRAMKeyword_4_1());
                          
                    }
                    otherlv_9=(Token)match(input,49,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getApplicationAccess().getCapacityKeyword_4_2());
                          
                    }
                    otherlv_10=(Token)match(input,14,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getApplicationAccess().getEqualsSignKeyword_4_3());
                          
                    }
                    // InternalMappingDSL.g:1827:1: ( (lv_ramUtilization_11_0= RULE_INT ) )
                    // InternalMappingDSL.g:1828:1: (lv_ramUtilization_11_0= RULE_INT )
                    {
                    // InternalMappingDSL.g:1828:1: (lv_ramUtilization_11_0= RULE_INT )
                    // InternalMappingDSL.g:1829:3: lv_ramUtilization_11_0= RULE_INT
                    {
                    lv_ramUtilization_11_0=(Token)match(input,RULE_INT,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_ramUtilization_11_0, grammarAccess.getApplicationAccess().getRamUtilizationINTTerminalRuleCall_4_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getApplicationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"ramUtilization",
                              		lv_ramUtilization_11_0, 
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,15,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getApplicationAccess().getSemicolonKeyword_4_5());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:1849:3: (otherlv_13= 'Required' otherlv_14= 'ROM' otherlv_15= 'capacity' otherlv_16= '=' ( (lv_romUtilization_17_0= RULE_INT ) ) otherlv_18= ';' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==48) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==32) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // InternalMappingDSL.g:1849:5: otherlv_13= 'Required' otherlv_14= 'ROM' otherlv_15= 'capacity' otherlv_16= '=' ( (lv_romUtilization_17_0= RULE_INT ) ) otherlv_18= ';'
                    {
                    otherlv_13=(Token)match(input,48,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getApplicationAccess().getRequiredKeyword_5_0());
                          
                    }
                    otherlv_14=(Token)match(input,32,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getApplicationAccess().getROMKeyword_5_1());
                          
                    }
                    otherlv_15=(Token)match(input,49,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getApplicationAccess().getCapacityKeyword_5_2());
                          
                    }
                    otherlv_16=(Token)match(input,14,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getApplicationAccess().getEqualsSignKeyword_5_3());
                          
                    }
                    // InternalMappingDSL.g:1865:1: ( (lv_romUtilization_17_0= RULE_INT ) )
                    // InternalMappingDSL.g:1866:1: (lv_romUtilization_17_0= RULE_INT )
                    {
                    // InternalMappingDSL.g:1866:1: (lv_romUtilization_17_0= RULE_INT )
                    // InternalMappingDSL.g:1867:3: lv_romUtilization_17_0= RULE_INT
                    {
                    lv_romUtilization_17_0=(Token)match(input,RULE_INT,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_romUtilization_17_0, grammarAccess.getApplicationAccess().getRomUtilizationINTTerminalRuleCall_5_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getApplicationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"romUtilization",
                              		lv_romUtilization_17_0, 
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,15,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getApplicationAccess().getSemicolonKeyword_5_5());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:1887:3: (otherlv_19= 'Criticality' otherlv_20= 'level' otherlv_21= '=' ( (lv_criticalityLevel_22_0= ruleDesignAssuranceLevelType ) ) otherlv_23= ';' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==50) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMappingDSL.g:1887:5: otherlv_19= 'Criticality' otherlv_20= 'level' otherlv_21= '=' ( (lv_criticalityLevel_22_0= ruleDesignAssuranceLevelType ) ) otherlv_23= ';'
                    {
                    otherlv_19=(Token)match(input,50,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getApplicationAccess().getCriticalityKeyword_6_0());
                          
                    }
                    otherlv_20=(Token)match(input,51,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getApplicationAccess().getLevelKeyword_6_1());
                          
                    }
                    otherlv_21=(Token)match(input,14,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getApplicationAccess().getEqualsSignKeyword_6_2());
                          
                    }
                    // InternalMappingDSL.g:1899:1: ( (lv_criticalityLevel_22_0= ruleDesignAssuranceLevelType ) )
                    // InternalMappingDSL.g:1900:1: (lv_criticalityLevel_22_0= ruleDesignAssuranceLevelType )
                    {
                    // InternalMappingDSL.g:1900:1: (lv_criticalityLevel_22_0= ruleDesignAssuranceLevelType )
                    // InternalMappingDSL.g:1901:3: lv_criticalityLevel_22_0= ruleDesignAssuranceLevelType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getApplicationAccess().getCriticalityLevelDesignAssuranceLevelTypeEnumRuleCall_6_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
                    lv_criticalityLevel_22_0=ruleDesignAssuranceLevelType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getApplicationRule());
                      	        }
                             		set(
                             			current, 
                             			"criticalityLevel",
                              		lv_criticalityLevel_22_0, 
                              		"ch.hilbri.assist.mappingdsl.MappingDSL.DesignAssuranceLevelType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_23=(Token)match(input,15,FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getApplicationAccess().getSemicolonKeyword_6_4());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:1921:3: (otherlv_24= 'Required' otherlv_25= 'IO' otherlv_26= 'protection' otherlv_27= '=' ( (lv_ioAdapterProtectionLevel_28_0= ruleIOAdapterProtectionLevelType ) ) otherlv_29= ';' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==48) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMappingDSL.g:1921:5: otherlv_24= 'Required' otherlv_25= 'IO' otherlv_26= 'protection' otherlv_27= '=' ( (lv_ioAdapterProtectionLevel_28_0= ruleIOAdapterProtectionLevelType ) ) otherlv_29= ';'
                    {
                    otherlv_24=(Token)match(input,48,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getApplicationAccess().getRequiredKeyword_7_0());
                          
                    }
                    otherlv_25=(Token)match(input,52,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getApplicationAccess().getIOKeyword_7_1());
                          
                    }
                    otherlv_26=(Token)match(input,53,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getApplicationAccess().getProtectionKeyword_7_2());
                          
                    }
                    otherlv_27=(Token)match(input,14,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getApplicationAccess().getEqualsSignKeyword_7_3());
                          
                    }
                    // InternalMappingDSL.g:1937:1: ( (lv_ioAdapterProtectionLevel_28_0= ruleIOAdapterProtectionLevelType ) )
                    // InternalMappingDSL.g:1938:1: (lv_ioAdapterProtectionLevel_28_0= ruleIOAdapterProtectionLevelType )
                    {
                    // InternalMappingDSL.g:1938:1: (lv_ioAdapterProtectionLevel_28_0= ruleIOAdapterProtectionLevelType )
                    // InternalMappingDSL.g:1939:3: lv_ioAdapterProtectionLevel_28_0= ruleIOAdapterProtectionLevelType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getApplicationAccess().getIoAdapterProtectionLevelIOAdapterProtectionLevelTypeEnumRuleCall_7_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
                    lv_ioAdapterProtectionLevel_28_0=ruleIOAdapterProtectionLevelType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getApplicationRule());
                      	        }
                             		set(
                             			current, 
                             			"ioAdapterProtectionLevel",
                              		lv_ioAdapterProtectionLevel_28_0, 
                              		"ch.hilbri.assist.mappingdsl.MappingDSL.IOAdapterProtectionLevelType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_29=(Token)match(input,15,FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getApplicationAccess().getSemicolonKeyword_7_5());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:1959:3: (otherlv_30= 'Identical' otherlv_31= 'parallel' otherlv_32= 'threads' otherlv_33= '=' ( (lv_parallelThreads_34_0= RULE_INT ) ) otherlv_35= ';' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==54) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMappingDSL.g:1959:5: otherlv_30= 'Identical' otherlv_31= 'parallel' otherlv_32= 'threads' otherlv_33= '=' ( (lv_parallelThreads_34_0= RULE_INT ) ) otherlv_35= ';'
                    {
                    otherlv_30=(Token)match(input,54,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getApplicationAccess().getIdenticalKeyword_8_0());
                          
                    }
                    otherlv_31=(Token)match(input,55,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getApplicationAccess().getParallelKeyword_8_1());
                          
                    }
                    otherlv_32=(Token)match(input,56,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getApplicationAccess().getThreadsKeyword_8_2());
                          
                    }
                    otherlv_33=(Token)match(input,14,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_33, grammarAccess.getApplicationAccess().getEqualsSignKeyword_8_3());
                          
                    }
                    // InternalMappingDSL.g:1975:1: ( (lv_parallelThreads_34_0= RULE_INT ) )
                    // InternalMappingDSL.g:1976:1: (lv_parallelThreads_34_0= RULE_INT )
                    {
                    // InternalMappingDSL.g:1976:1: (lv_parallelThreads_34_0= RULE_INT )
                    // InternalMappingDSL.g:1977:3: lv_parallelThreads_34_0= RULE_INT
                    {
                    lv_parallelThreads_34_0=(Token)match(input,RULE_INT,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_parallelThreads_34_0, grammarAccess.getApplicationAccess().getParallelThreadsINTTerminalRuleCall_8_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getApplicationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"parallelThreads",
                              		lv_parallelThreads_34_0, 
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }

                    otherlv_35=(Token)match(input,15,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getApplicationAccess().getSemicolonKeyword_8_5());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:1997:3: (otherlv_36= 'Developer' otherlv_37= '=' ( (lv_developedBy_38_0= RULE_STRING ) ) otherlv_39= ';' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==57) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMappingDSL.g:1997:5: otherlv_36= 'Developer' otherlv_37= '=' ( (lv_developedBy_38_0= RULE_STRING ) ) otherlv_39= ';'
                    {
                    otherlv_36=(Token)match(input,57,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_36, grammarAccess.getApplicationAccess().getDeveloperKeyword_9_0());
                          
                    }
                    otherlv_37=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getApplicationAccess().getEqualsSignKeyword_9_1());
                          
                    }
                    // InternalMappingDSL.g:2005:1: ( (lv_developedBy_38_0= RULE_STRING ) )
                    // InternalMappingDSL.g:2006:1: (lv_developedBy_38_0= RULE_STRING )
                    {
                    // InternalMappingDSL.g:2006:1: (lv_developedBy_38_0= RULE_STRING )
                    // InternalMappingDSL.g:2007:3: lv_developedBy_38_0= RULE_STRING
                    {
                    lv_developedBy_38_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_developedBy_38_0, grammarAccess.getApplicationAccess().getDevelopedBySTRINGTerminalRuleCall_9_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getApplicationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"developedBy",
                              		lv_developedBy_38_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    otherlv_39=(Token)match(input,15,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_39, grammarAccess.getApplicationAccess().getSemicolonKeyword_9_3());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:2027:3: ( (lv_ioAdapterRequirements_40_0= ruleIOAdapterRequirement ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==61) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalMappingDSL.g:2028:1: (lv_ioAdapterRequirements_40_0= ruleIOAdapterRequirement )
            	    {
            	    // InternalMappingDSL.g:2028:1: (lv_ioAdapterRequirements_40_0= ruleIOAdapterRequirement )
            	    // InternalMappingDSL.g:2029:3: lv_ioAdapterRequirements_40_0= ruleIOAdapterRequirement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getApplicationAccess().getIoAdapterRequirementsIOAdapterRequirementParserRuleCall_10_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_62);
            	    lv_ioAdapterRequirements_40_0=ruleIOAdapterRequirement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getApplicationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ioAdapterRequirements",
            	              		lv_ioAdapterRequirements_40_0, 
            	              		"ch.hilbri.assist.mappingdsl.MappingDSL.IOAdapterRequirement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // InternalMappingDSL.g:2045:3: (otherlv_41= 'Restrict' otherlv_42= 'deployment' otherlv_43= 'to' otherlv_44= '{' ( ( ruleQualifiedName ) ) (otherlv_46= ',' ( ( ruleQualifiedName ) ) )* otherlv_48= '}' otherlv_49= ';' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==58) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMappingDSL.g:2045:5: otherlv_41= 'Restrict' otherlv_42= 'deployment' otherlv_43= 'to' otherlv_44= '{' ( ( ruleQualifiedName ) ) (otherlv_46= ',' ( ( ruleQualifiedName ) ) )* otherlv_48= '}' otherlv_49= ';'
                    {
                    otherlv_41=(Token)match(input,58,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_41, grammarAccess.getApplicationAccess().getRestrictKeyword_11_0());
                          
                    }
                    otherlv_42=(Token)match(input,59,FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getApplicationAccess().getDeploymentKeyword_11_1());
                          
                    }
                    otherlv_43=(Token)match(input,60,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_43, grammarAccess.getApplicationAccess().getToKeyword_11_2());
                          
                    }
                    otherlv_44=(Token)match(input,12,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_44, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_11_3());
                          
                    }
                    // InternalMappingDSL.g:2061:1: ( ( ruleQualifiedName ) )
                    // InternalMappingDSL.g:2062:1: ( ruleQualifiedName )
                    {
                    // InternalMappingDSL.g:2062:1: ( ruleQualifiedName )
                    // InternalMappingDSL.g:2063:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getApplicationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getApplicationAccess().getRestrictMappingToHardwareElementsHardwareElementCrossReference_11_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_48);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMappingDSL.g:2076:2: (otherlv_46= ',' ( ( ruleQualifiedName ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==44) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalMappingDSL.g:2076:4: otherlv_46= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_46=(Token)match(input,44,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_46, grammarAccess.getApplicationAccess().getCommaKeyword_11_5_0());
                    	          
                    	    }
                    	    // InternalMappingDSL.g:2080:1: ( ( ruleQualifiedName ) )
                    	    // InternalMappingDSL.g:2081:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalMappingDSL.g:2081:1: ( ruleQualifiedName )
                    	    // InternalMappingDSL.g:2082:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getApplicationRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getApplicationAccess().getRestrictMappingToHardwareElementsHardwareElementCrossReference_11_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_48);
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

                    otherlv_48=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_48, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_11_6());
                          
                    }
                    otherlv_49=(Token)match(input,15,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_49, grammarAccess.getApplicationAccess().getSemicolonKeyword_11_7());
                          
                    }

                    }
                    break;

            }

            // InternalMappingDSL.g:2103:3: (otherlv_50= 'Properties' otherlv_51= '{' ( (lv_metricParameters_52_0= ruleMetricParameter ) )* otherlv_53= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==25) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMappingDSL.g:2103:5: otherlv_50= 'Properties' otherlv_51= '{' ( (lv_metricParameters_52_0= ruleMetricParameter ) )* otherlv_53= '}'
                    {
                    otherlv_50=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_50, grammarAccess.getApplicationAccess().getPropertiesKeyword_12_0());
                          
                    }
                    otherlv_51=(Token)match(input,12,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_51, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_12_1());
                          
                    }
                    // InternalMappingDSL.g:2111:1: ( (lv_metricParameters_52_0= ruleMetricParameter ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==RULE_STRING) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalMappingDSL.g:2112:1: (lv_metricParameters_52_0= ruleMetricParameter )
                    	    {
                    	    // InternalMappingDSL.g:2112:1: (lv_metricParameters_52_0= ruleMetricParameter )
                    	    // InternalMappingDSL.g:2113:3: lv_metricParameters_52_0= ruleMetricParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getApplicationAccess().getMetricParametersMetricParameterParserRuleCall_12_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_26);
                    	    lv_metricParameters_52_0=ruleMetricParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getApplicationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"metricParameters",
                    	              		lv_metricParameters_52_0, 
                    	              		"ch.hilbri.assist.mappingdsl.MappingDSL.MetricParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_53=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_53, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_12_3());
                          
                    }

                    }
                    break;

            }

            otherlv_54=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_54, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_13());
                  
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
    // InternalMappingDSL.g:2145:1: entryRuleIOAdapterRequirement returns [EObject current=null] : iv_ruleIOAdapterRequirement= ruleIOAdapterRequirement EOF ;
    public final EObject entryRuleIOAdapterRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIOAdapterRequirement = null;


        try {
            // InternalMappingDSL.g:2146:2: (iv_ruleIOAdapterRequirement= ruleIOAdapterRequirement EOF )
            // InternalMappingDSL.g:2147:2: iv_ruleIOAdapterRequirement= ruleIOAdapterRequirement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIOAdapterRequirementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIOAdapterRequirement=ruleIOAdapterRequirement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIOAdapterRequirement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:2154:1: ruleIOAdapterRequirement returns [EObject current=null] : (otherlv_0= 'Requires' ( (lv_requiredAdapterCount_1_0= RULE_INT ) ) ( (lv_adapterType_2_0= ruleIOAdapterType ) ) otherlv_3= 'adapter' ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) ) otherlv_6= ';' ) ;
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
            // InternalMappingDSL.g:2157:28: ( (otherlv_0= 'Requires' ( (lv_requiredAdapterCount_1_0= RULE_INT ) ) ( (lv_adapterType_2_0= ruleIOAdapterType ) ) otherlv_3= 'adapter' ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) ) otherlv_6= ';' ) )
            // InternalMappingDSL.g:2158:1: (otherlv_0= 'Requires' ( (lv_requiredAdapterCount_1_0= RULE_INT ) ) ( (lv_adapterType_2_0= ruleIOAdapterType ) ) otherlv_3= 'adapter' ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) ) otherlv_6= ';' )
            {
            // InternalMappingDSL.g:2158:1: (otherlv_0= 'Requires' ( (lv_requiredAdapterCount_1_0= RULE_INT ) ) ( (lv_adapterType_2_0= ruleIOAdapterType ) ) otherlv_3= 'adapter' ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) ) otherlv_6= ';' )
            // InternalMappingDSL.g:2158:3: otherlv_0= 'Requires' ( (lv_requiredAdapterCount_1_0= RULE_INT ) ) ( (lv_adapterType_2_0= ruleIOAdapterType ) ) otherlv_3= 'adapter' ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIOAdapterRequirementAccess().getRequiresKeyword_0());
                  
            }
            // InternalMappingDSL.g:2162:1: ( (lv_requiredAdapterCount_1_0= RULE_INT ) )
            // InternalMappingDSL.g:2163:1: (lv_requiredAdapterCount_1_0= RULE_INT )
            {
            // InternalMappingDSL.g:2163:1: (lv_requiredAdapterCount_1_0= RULE_INT )
            // InternalMappingDSL.g:2164:3: lv_requiredAdapterCount_1_0= RULE_INT
            {
            lv_requiredAdapterCount_1_0=(Token)match(input,RULE_INT,FOLLOW_40); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.INT");
              	    
            }

            }


            }

            // InternalMappingDSL.g:2180:2: ( (lv_adapterType_2_0= ruleIOAdapterType ) )
            // InternalMappingDSL.g:2181:1: (lv_adapterType_2_0= ruleIOAdapterType )
            {
            // InternalMappingDSL.g:2181:1: (lv_adapterType_2_0= ruleIOAdapterType )
            // InternalMappingDSL.g:2182:3: lv_adapterType_2_0= ruleIOAdapterType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIOAdapterRequirementAccess().getAdapterTypeIOAdapterTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_65);
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
                      		"ch.hilbri.assist.mappingdsl.MappingDSL.IOAdapterType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,62,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIOAdapterRequirementAccess().getAdapterKeyword_3());
                  
            }
            // InternalMappingDSL.g:2202:1: ( ( (lv_isExclusiveOnly_4_0= 'exclusive' ) ) | ( (lv_isSharedAllowed_5_0= 'shared' ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==63) ) {
                alt60=1;
            }
            else if ( (LA60_0==64) ) {
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
                    // InternalMappingDSL.g:2202:2: ( (lv_isExclusiveOnly_4_0= 'exclusive' ) )
                    {
                    // InternalMappingDSL.g:2202:2: ( (lv_isExclusiveOnly_4_0= 'exclusive' ) )
                    // InternalMappingDSL.g:2203:1: (lv_isExclusiveOnly_4_0= 'exclusive' )
                    {
                    // InternalMappingDSL.g:2203:1: (lv_isExclusiveOnly_4_0= 'exclusive' )
                    // InternalMappingDSL.g:2204:3: lv_isExclusiveOnly_4_0= 'exclusive'
                    {
                    lv_isExclusiveOnly_4_0=(Token)match(input,63,FOLLOW_7); if (state.failed) return current;
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
                    // InternalMappingDSL.g:2218:6: ( (lv_isSharedAllowed_5_0= 'shared' ) )
                    {
                    // InternalMappingDSL.g:2218:6: ( (lv_isSharedAllowed_5_0= 'shared' ) )
                    // InternalMappingDSL.g:2219:1: (lv_isSharedAllowed_5_0= 'shared' )
                    {
                    // InternalMappingDSL.g:2219:1: (lv_isSharedAllowed_5_0= 'shared' )
                    // InternalMappingDSL.g:2220:3: lv_isSharedAllowed_5_0= 'shared'
                    {
                    lv_isSharedAllowed_5_0=(Token)match(input,64,FOLLOW_7); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:2245:1: entryRuleDislocalityRelation returns [EObject current=null] : iv_ruleDislocalityRelation= ruleDislocalityRelation EOF ;
    public final EObject entryRuleDislocalityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDislocalityRelation = null;


        try {
            // InternalMappingDSL.g:2246:2: (iv_ruleDislocalityRelation= ruleDislocalityRelation EOF )
            // InternalMappingDSL.g:2247:2: iv_ruleDislocalityRelation= ruleDislocalityRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDislocalityRelationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDislocalityRelation=ruleDislocalityRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDislocalityRelation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:2254:1: ruleDislocalityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal' otherlv_4= 'up' otherlv_5= 'to' ( (lv_hardwareLevel_6_0= ruleHardwareArchitectureLevelType ) ) otherlv_7= ';' ) ;
    public final EObject ruleDislocalityRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_hardwareLevel_6_0 = null;


         enterRule(); 
            
        try {
            // InternalMappingDSL.g:2257:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal' otherlv_4= 'up' otherlv_5= 'to' ( (lv_hardwareLevel_6_0= ruleHardwareArchitectureLevelType ) ) otherlv_7= ';' ) )
            // InternalMappingDSL.g:2258:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal' otherlv_4= 'up' otherlv_5= 'to' ( (lv_hardwareLevel_6_0= ruleHardwareArchitectureLevelType ) ) otherlv_7= ';' )
            {
            // InternalMappingDSL.g:2258:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal' otherlv_4= 'up' otherlv_5= 'to' ( (lv_hardwareLevel_6_0= ruleHardwareArchitectureLevelType ) ) otherlv_7= ';' )
            // InternalMappingDSL.g:2258:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal' otherlv_4= 'up' otherlv_5= 'to' ( (lv_hardwareLevel_6_0= ruleHardwareArchitectureLevelType ) ) otherlv_7= ';'
            {
            // InternalMappingDSL.g:2258:2: ( (otherlv_0= RULE_ID ) )
            // InternalMappingDSL.g:2259:1: (otherlv_0= RULE_ID )
            {
            // InternalMappingDSL.g:2259:1: (otherlv_0= RULE_ID )
            // InternalMappingDSL.g:2260:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDislocalityRelationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getDislocalityRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalMappingDSL.g:2271:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==44) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalMappingDSL.g:2271:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDislocalityRelationAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalMappingDSL.g:2275:1: ( (otherlv_2= RULE_ID ) )
            	    // InternalMappingDSL.g:2276:1: (otherlv_2= RULE_ID )
            	    {
            	    // InternalMappingDSL.g:2276:1: (otherlv_2= RULE_ID )
            	    // InternalMappingDSL.g:2277:3: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getDislocalityRelationRule());
            	      	        }
            	              
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,65,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDislocalityRelationAccess().getDislocalKeyword_2());
                  
            }
            otherlv_4=(Token)match(input,66,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDislocalityRelationAccess().getUpKeyword_3());
                  
            }
            otherlv_5=(Token)match(input,60,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDislocalityRelationAccess().getToKeyword_4());
                  
            }
            // InternalMappingDSL.g:2300:1: ( (lv_hardwareLevel_6_0= ruleHardwareArchitectureLevelType ) )
            // InternalMappingDSL.g:2301:1: (lv_hardwareLevel_6_0= ruleHardwareArchitectureLevelType )
            {
            // InternalMappingDSL.g:2301:1: (lv_hardwareLevel_6_0= ruleHardwareArchitectureLevelType )
            // InternalMappingDSL.g:2302:3: lv_hardwareLevel_6_0= ruleHardwareArchitectureLevelType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDislocalityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_hardwareLevel_6_0=ruleHardwareArchitectureLevelType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDislocalityRelationRule());
              	        }
                     		set(
                     			current, 
                     			"hardwareLevel",
                      		lv_hardwareLevel_6_0, 
                      		"ch.hilbri.assist.mappingdsl.MappingDSL.HardwareArchitectureLevelType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getDislocalityRelationAccess().getSemicolonKeyword_6());
                  
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
    // InternalMappingDSL.g:2330:1: entryRuleProximityRelation returns [EObject current=null] : iv_ruleProximityRelation= ruleProximityRelation EOF ;
    public final EObject entryRuleProximityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProximityRelation = null;


        try {
            // InternalMappingDSL.g:2331:2: (iv_ruleProximityRelation= ruleProximityRelation EOF )
            // InternalMappingDSL.g:2332:2: iv_ruleProximityRelation= ruleProximityRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProximityRelationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProximityRelation=ruleProximityRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProximityRelation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:2339:1: ruleProximityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on' otherlv_4= 'same' ( (lv_hardwareLevel_5_0= ruleHardwareArchitectureLevelType ) ) otherlv_6= ';' ) ;
    public final EObject ruleProximityRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_hardwareLevel_5_0 = null;


         enterRule(); 
            
        try {
            // InternalMappingDSL.g:2342:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on' otherlv_4= 'same' ( (lv_hardwareLevel_5_0= ruleHardwareArchitectureLevelType ) ) otherlv_6= ';' ) )
            // InternalMappingDSL.g:2343:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on' otherlv_4= 'same' ( (lv_hardwareLevel_5_0= ruleHardwareArchitectureLevelType ) ) otherlv_6= ';' )
            {
            // InternalMappingDSL.g:2343:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on' otherlv_4= 'same' ( (lv_hardwareLevel_5_0= ruleHardwareArchitectureLevelType ) ) otherlv_6= ';' )
            // InternalMappingDSL.g:2343:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on' otherlv_4= 'same' ( (lv_hardwareLevel_5_0= ruleHardwareArchitectureLevelType ) ) otherlv_6= ';'
            {
            // InternalMappingDSL.g:2343:2: ( (otherlv_0= RULE_ID ) )
            // InternalMappingDSL.g:2344:1: (otherlv_0= RULE_ID )
            {
            // InternalMappingDSL.g:2344:1: (otherlv_0= RULE_ID )
            // InternalMappingDSL.g:2345:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getProximityRelationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getProximityRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalMappingDSL.g:2356:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==44) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalMappingDSL.g:2356:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getProximityRelationAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalMappingDSL.g:2360:1: ( (otherlv_2= RULE_ID ) )
            	    // InternalMappingDSL.g:2361:1: (otherlv_2= RULE_ID )
            	    {
            	    // InternalMappingDSL.g:2361:1: (otherlv_2= RULE_ID )
            	    // InternalMappingDSL.g:2362:3: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getProximityRelationRule());
            	      	        }
            	              
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,67,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getProximityRelationAccess().getOnKeyword_2());
                  
            }
            otherlv_4=(Token)match(input,68,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getProximityRelationAccess().getSameKeyword_3());
                  
            }
            // InternalMappingDSL.g:2381:1: ( (lv_hardwareLevel_5_0= ruleHardwareArchitectureLevelType ) )
            // InternalMappingDSL.g:2382:1: (lv_hardwareLevel_5_0= ruleHardwareArchitectureLevelType )
            {
            // InternalMappingDSL.g:2382:1: (lv_hardwareLevel_5_0= ruleHardwareArchitectureLevelType )
            // InternalMappingDSL.g:2383:3: lv_hardwareLevel_5_0= ruleHardwareArchitectureLevelType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProximityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_hardwareLevel_5_0=ruleHardwareArchitectureLevelType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProximityRelationRule());
              	        }
                     		set(
                     			current, 
                     			"hardwareLevel",
                      		lv_hardwareLevel_5_0, 
                      		"ch.hilbri.assist.mappingdsl.MappingDSL.HardwareArchitectureLevelType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getProximityRelationAccess().getSemicolonKeyword_5());
                  
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
    // InternalMappingDSL.g:2411:1: entryRuleCommunicationRelation returns [EObject current=null] : iv_ruleCommunicationRelation= ruleCommunicationRelation EOF ;
    public final EObject entryRuleCommunicationRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationRelation = null;


        try {
            // InternalMappingDSL.g:2412:2: (iv_ruleCommunicationRelation= ruleCommunicationRelation EOF )
            // InternalMappingDSL.g:2413:2: iv_ruleCommunicationRelation= ruleCommunicationRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommunicationRelationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommunicationRelation=ruleCommunicationRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommunicationRelation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:2420:1: ruleCommunicationRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'require' ( (lv_bandwidthUtilization_4_0= RULE_INT ) ) otherlv_5= 'bandwidth' otherlv_6= ';' ) ;
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
            // InternalMappingDSL.g:2423:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'require' ( (lv_bandwidthUtilization_4_0= RULE_INT ) ) otherlv_5= 'bandwidth' otherlv_6= ';' ) )
            // InternalMappingDSL.g:2424:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'require' ( (lv_bandwidthUtilization_4_0= RULE_INT ) ) otherlv_5= 'bandwidth' otherlv_6= ';' )
            {
            // InternalMappingDSL.g:2424:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'require' ( (lv_bandwidthUtilization_4_0= RULE_INT ) ) otherlv_5= 'bandwidth' otherlv_6= ';' )
            // InternalMappingDSL.g:2424:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'require' ( (lv_bandwidthUtilization_4_0= RULE_INT ) ) otherlv_5= 'bandwidth' otherlv_6= ';'
            {
            // InternalMappingDSL.g:2424:2: ( (otherlv_0= RULE_ID ) )
            // InternalMappingDSL.g:2425:1: (otherlv_0= RULE_ID )
            {
            // InternalMappingDSL.g:2425:1: (otherlv_0= RULE_ID )
            // InternalMappingDSL.g:2426:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCommunicationRelationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getCommunicationRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalMappingDSL.g:2437:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==44) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalMappingDSL.g:2437:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getCommunicationRelationAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalMappingDSL.g:2441:1: ( (otherlv_2= RULE_ID ) )
            	    // InternalMappingDSL.g:2442:1: (otherlv_2= RULE_ID )
            	    {
            	    // InternalMappingDSL.g:2442:1: (otherlv_2= RULE_ID )
            	    // InternalMappingDSL.g:2443:3: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getCommunicationRelationRule());
            	      	        }
            	              
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_72); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,69,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCommunicationRelationAccess().getRequireKeyword_2());
                  
            }
            // InternalMappingDSL.g:2458:1: ( (lv_bandwidthUtilization_4_0= RULE_INT ) )
            // InternalMappingDSL.g:2459:1: (lv_bandwidthUtilization_4_0= RULE_INT )
            {
            // InternalMappingDSL.g:2459:1: (lv_bandwidthUtilization_4_0= RULE_INT )
            // InternalMappingDSL.g:2460:3: lv_bandwidthUtilization_4_0= RULE_INT
            {
            lv_bandwidthUtilization_4_0=(Token)match(input,RULE_INT,FOLLOW_73); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.INT");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,70,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCommunicationRelationAccess().getBandwidthKeyword_4());
                  
            }
            otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:2492:1: entryRuleDissimilarityRelation returns [EObject current=null] : iv_ruleDissimilarityRelation= ruleDissimilarityRelation EOF ;
    public final EObject entryRuleDissimilarityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDissimilarityRelation = null;


        try {
            // InternalMappingDSL.g:2493:2: (iv_ruleDissimilarityRelation= ruleDissimilarityRelation EOF )
            // InternalMappingDSL.g:2494:2: iv_ruleDissimilarityRelation= ruleDissimilarityRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDissimilarityRelationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDissimilarityRelation=ruleDissimilarityRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDissimilarityRelation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:2501:1: ruleDissimilarityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= 'dissimilar' otherlv_4= 'based' otherlv_5= 'on' ( (lv_dissimilarityClause_6_0= ruleDissimilarityClause ) ) otherlv_7= ';' ) ;
    public final EObject ruleDissimilarityRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_dissimilarityClause_6_0 = null;


         enterRule(); 
            
        try {
            // InternalMappingDSL.g:2504:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= 'dissimilar' otherlv_4= 'based' otherlv_5= 'on' ( (lv_dissimilarityClause_6_0= ruleDissimilarityClause ) ) otherlv_7= ';' ) )
            // InternalMappingDSL.g:2505:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= 'dissimilar' otherlv_4= 'based' otherlv_5= 'on' ( (lv_dissimilarityClause_6_0= ruleDissimilarityClause ) ) otherlv_7= ';' )
            {
            // InternalMappingDSL.g:2505:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= 'dissimilar' otherlv_4= 'based' otherlv_5= 'on' ( (lv_dissimilarityClause_6_0= ruleDissimilarityClause ) ) otherlv_7= ';' )
            // InternalMappingDSL.g:2505:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= 'dissimilar' otherlv_4= 'based' otherlv_5= 'on' ( (lv_dissimilarityClause_6_0= ruleDissimilarityClause ) ) otherlv_7= ';'
            {
            // InternalMappingDSL.g:2505:2: ( (otherlv_0= RULE_ID ) )
            // InternalMappingDSL.g:2506:1: (otherlv_0= RULE_ID )
            {
            // InternalMappingDSL.g:2506:1: (otherlv_0= RULE_ID )
            // InternalMappingDSL.g:2507:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDissimilarityRelationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getDissimilarityRelationAccess().getApplicationsOrGroupsApplicationOrApplicationGroupCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalMappingDSL.g:2518:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+
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
            	    // InternalMappingDSL.g:2518:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDissimilarityRelationAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalMappingDSL.g:2522:1: ( (otherlv_2= RULE_ID ) )
            	    // InternalMappingDSL.g:2523:1: (otherlv_2= RULE_ID )
            	    {
            	    // InternalMappingDSL.g:2523:1: (otherlv_2= RULE_ID )
            	    // InternalMappingDSL.g:2524:3: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getDissimilarityRelationRule());
            	      	        }
            	              
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_74); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,71,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDissimilarityRelationAccess().getDissimilarKeyword_2());
                  
            }
            otherlv_4=(Token)match(input,72,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDissimilarityRelationAccess().getBasedKeyword_3());
                  
            }
            otherlv_5=(Token)match(input,67,FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDissimilarityRelationAccess().getOnKeyword_4());
                  
            }
            // InternalMappingDSL.g:2547:1: ( (lv_dissimilarityClause_6_0= ruleDissimilarityClause ) )
            // InternalMappingDSL.g:2548:1: (lv_dissimilarityClause_6_0= ruleDissimilarityClause )
            {
            // InternalMappingDSL.g:2548:1: (lv_dissimilarityClause_6_0= ruleDissimilarityClause )
            // InternalMappingDSL.g:2549:3: lv_dissimilarityClause_6_0= ruleDissimilarityClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDissimilarityRelationAccess().getDissimilarityClauseDissimilarityClauseParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_dissimilarityClause_6_0=ruleDissimilarityClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDissimilarityRelationRule());
              	        }
                     		set(
                     			current, 
                     			"dissimilarityClause",
                      		lv_dissimilarityClause_6_0, 
                      		"ch.hilbri.assist.mappingdsl.MappingDSL.DissimilarityClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getDissimilarityRelationAccess().getSemicolonKeyword_6());
                  
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
    // InternalMappingDSL.g:2577:1: entryRuleDissimilarityClause returns [EObject current=null] : iv_ruleDissimilarityClause= ruleDissimilarityClause EOF ;
    public final EObject entryRuleDissimilarityClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDissimilarityClause = null;


        try {
            // InternalMappingDSL.g:2578:2: (iv_ruleDissimilarityClause= ruleDissimilarityClause EOF )
            // InternalMappingDSL.g:2579:2: iv_ruleDissimilarityClause= ruleDissimilarityClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDissimilarityClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDissimilarityClause=ruleDissimilarityClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDissimilarityClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:2586:1: ruleDissimilarityClause returns [EObject current=null] : (this_DissimilarityEntry_0= ruleDissimilarityEntry | (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' ) ) ;
    public final EObject ruleDissimilarityClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_DissimilarityEntry_0 = null;

        EObject this_DissimilarityDisjunction_2 = null;

        EObject this_DissimilarityConjunction_3 = null;


         enterRule(); 
            
        try {
            // InternalMappingDSL.g:2589:28: ( (this_DissimilarityEntry_0= ruleDissimilarityEntry | (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' ) ) )
            // InternalMappingDSL.g:2590:1: (this_DissimilarityEntry_0= ruleDissimilarityEntry | (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' ) )
            {
            // InternalMappingDSL.g:2590:1: (this_DissimilarityEntry_0= ruleDissimilarityEntry | (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=77 && LA66_0<=80)) ) {
                alt66=1;
            }
            else if ( (LA66_0==73) ) {
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
                    // InternalMappingDSL.g:2591:5: this_DissimilarityEntry_0= ruleDissimilarityEntry
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDissimilarityClauseAccess().getDissimilarityEntryParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalMappingDSL.g:2600:6: (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' )
                    {
                    // InternalMappingDSL.g:2600:6: (otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')' )
                    // InternalMappingDSL.g:2600:8: otherlv_1= '(' ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,73,FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDissimilarityClauseAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // InternalMappingDSL.g:2604:1: ( ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction ) | this_DissimilarityConjunction_3= ruleDissimilarityConjunction )
                    int alt65=2;
                    switch ( input.LA(1) ) {
                    case 77:
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
                    case 78:
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
                    case 79:
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
                    case 80:
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
                    case 73:
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
                            // InternalMappingDSL.g:2604:2: ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction )
                            {
                            // InternalMappingDSL.g:2604:2: ( ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction )
                            // InternalMappingDSL.g:2604:3: ( ruleDissimilarityDisjunction )=>this_DissimilarityDisjunction_2= ruleDissimilarityDisjunction
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getDissimilarityClauseAccess().getDissimilarityDisjunctionParserRuleCall_1_1_0()); 
                                  
                            }
                            pushFollow(FOLLOW_78);
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
                            // InternalMappingDSL.g:2615:5: this_DissimilarityConjunction_3= ruleDissimilarityConjunction
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getDissimilarityClauseAccess().getDissimilarityConjunctionParserRuleCall_1_1_1()); 
                                  
                            }
                            pushFollow(FOLLOW_78);
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

                    otherlv_4=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:2635:1: entryRuleDissimilarityDisjunction returns [EObject current=null] : iv_ruleDissimilarityDisjunction= ruleDissimilarityDisjunction EOF ;
    public final EObject entryRuleDissimilarityDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDissimilarityDisjunction = null;


        try {
            // InternalMappingDSL.g:2636:2: (iv_ruleDissimilarityDisjunction= ruleDissimilarityDisjunction EOF )
            // InternalMappingDSL.g:2637:2: iv_ruleDissimilarityDisjunction= ruleDissimilarityDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDissimilarityDisjunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDissimilarityDisjunction=ruleDissimilarityDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDissimilarityDisjunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:2644:1: ruleDissimilarityDisjunction returns [EObject current=null] : ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ ) ;
    public final EObject ruleDissimilarityDisjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_dissimilarityClauses_0_0 = null;

        EObject lv_dissimilarityClauses_2_0 = null;


         enterRule(); 
            
        try {
            // InternalMappingDSL.g:2647:28: ( ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ ) )
            // InternalMappingDSL.g:2648:1: ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ )
            {
            // InternalMappingDSL.g:2648:1: ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ )
            // InternalMappingDSL.g:2648:2: ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+
            {
            // InternalMappingDSL.g:2648:2: ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) )
            // InternalMappingDSL.g:2649:1: (lv_dissimilarityClauses_0_0= ruleDissimilarityClause )
            {
            // InternalMappingDSL.g:2649:1: (lv_dissimilarityClauses_0_0= ruleDissimilarityClause )
            // InternalMappingDSL.g:2650:3: lv_dissimilarityClauses_0_0= ruleDissimilarityClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDissimilarityDisjunctionAccess().getDissimilarityClausesDissimilarityClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_79);
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
                      		"ch.hilbri.assist.mappingdsl.MappingDSL.DissimilarityClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalMappingDSL.g:2666:2: (otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==75) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalMappingDSL.g:2666:4: otherlv_1= 'OR' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) )
            	    {
            	    otherlv_1=(Token)match(input,75,FOLLOW_77); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDissimilarityDisjunctionAccess().getORKeyword_1_0());
            	          
            	    }
            	    // InternalMappingDSL.g:2670:1: ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) )
            	    // InternalMappingDSL.g:2671:1: (lv_dissimilarityClauses_2_0= ruleDissimilarityClause )
            	    {
            	    // InternalMappingDSL.g:2671:1: (lv_dissimilarityClauses_2_0= ruleDissimilarityClause )
            	    // InternalMappingDSL.g:2672:3: lv_dissimilarityClauses_2_0= ruleDissimilarityClause
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDissimilarityDisjunctionAccess().getDissimilarityClausesDissimilarityClauseParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_80);
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
            	              		"ch.hilbri.assist.mappingdsl.MappingDSL.DissimilarityClause");
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
    // InternalMappingDSL.g:2696:1: entryRuleDissimilarityConjunction returns [EObject current=null] : iv_ruleDissimilarityConjunction= ruleDissimilarityConjunction EOF ;
    public final EObject entryRuleDissimilarityConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDissimilarityConjunction = null;


        try {
            // InternalMappingDSL.g:2697:2: (iv_ruleDissimilarityConjunction= ruleDissimilarityConjunction EOF )
            // InternalMappingDSL.g:2698:2: iv_ruleDissimilarityConjunction= ruleDissimilarityConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDissimilarityConjunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDissimilarityConjunction=ruleDissimilarityConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDissimilarityConjunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:2705:1: ruleDissimilarityConjunction returns [EObject current=null] : ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ ) ;
    public final EObject ruleDissimilarityConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_dissimilarityClauses_0_0 = null;

        EObject lv_dissimilarityClauses_2_0 = null;


         enterRule(); 
            
        try {
            // InternalMappingDSL.g:2708:28: ( ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ ) )
            // InternalMappingDSL.g:2709:1: ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ )
            {
            // InternalMappingDSL.g:2709:1: ( ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+ )
            // InternalMappingDSL.g:2709:2: ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) ) (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+
            {
            // InternalMappingDSL.g:2709:2: ( (lv_dissimilarityClauses_0_0= ruleDissimilarityClause ) )
            // InternalMappingDSL.g:2710:1: (lv_dissimilarityClauses_0_0= ruleDissimilarityClause )
            {
            // InternalMappingDSL.g:2710:1: (lv_dissimilarityClauses_0_0= ruleDissimilarityClause )
            // InternalMappingDSL.g:2711:3: lv_dissimilarityClauses_0_0= ruleDissimilarityClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDissimilarityConjunctionAccess().getDissimilarityClausesDissimilarityClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_81);
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
                      		"ch.hilbri.assist.mappingdsl.MappingDSL.DissimilarityClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalMappingDSL.g:2727:2: (otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) ) )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==76) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalMappingDSL.g:2727:4: otherlv_1= 'AND' ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) )
            	    {
            	    otherlv_1=(Token)match(input,76,FOLLOW_77); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDissimilarityConjunctionAccess().getANDKeyword_1_0());
            	          
            	    }
            	    // InternalMappingDSL.g:2731:1: ( (lv_dissimilarityClauses_2_0= ruleDissimilarityClause ) )
            	    // InternalMappingDSL.g:2732:1: (lv_dissimilarityClauses_2_0= ruleDissimilarityClause )
            	    {
            	    // InternalMappingDSL.g:2732:1: (lv_dissimilarityClauses_2_0= ruleDissimilarityClause )
            	    // InternalMappingDSL.g:2733:3: lv_dissimilarityClauses_2_0= ruleDissimilarityClause
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDissimilarityConjunctionAccess().getDissimilarityClausesDissimilarityClauseParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_82);
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
            	              		"ch.hilbri.assist.mappingdsl.MappingDSL.DissimilarityClause");
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
    // InternalMappingDSL.g:2757:1: entryRuleDissimilarityEntry returns [EObject current=null] : iv_ruleDissimilarityEntry= ruleDissimilarityEntry EOF ;
    public final EObject entryRuleDissimilarityEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDissimilarityEntry = null;


        try {
            // InternalMappingDSL.g:2758:2: (iv_ruleDissimilarityEntry= ruleDissimilarityEntry EOF )
            // InternalMappingDSL.g:2759:2: iv_ruleDissimilarityEntry= ruleDissimilarityEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDissimilarityEntryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDissimilarityEntry=ruleDissimilarityEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDissimilarityEntry; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:2766:1: ruleDissimilarityEntry returns [EObject current=null] : ( (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) ) | (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) ) | (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) ) | (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) ) ) ;
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
            // InternalMappingDSL.g:2769:28: ( ( (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) ) | (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) ) | (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) ) | (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) ) ) )
            // InternalMappingDSL.g:2770:1: ( (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) ) | (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) ) | (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) ) | (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) ) )
            {
            // InternalMappingDSL.g:2770:1: ( (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) ) | (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) ) | (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) ) | (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) ) )
            int alt69=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt69=1;
                }
                break;
            case 78:
                {
                alt69=2;
                }
                break;
            case 79:
                {
                alt69=3;
                }
                break;
            case 80:
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
                    // InternalMappingDSL.g:2770:2: (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) )
                    {
                    // InternalMappingDSL.g:2770:2: (otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) ) )
                    // InternalMappingDSL.g:2770:4: otherlv_0= 'Compartment.' ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) )
                    {
                    otherlv_0=(Token)match(input,77,FOLLOW_83); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getDissimilarityEntryAccess().getCompartmentKeyword_0_0());
                          
                    }
                    // InternalMappingDSL.g:2774:1: ( (lv_compartmentAttribute_1_0= ruleCompartmentAttributes ) )
                    // InternalMappingDSL.g:2775:1: (lv_compartmentAttribute_1_0= ruleCompartmentAttributes )
                    {
                    // InternalMappingDSL.g:2775:1: (lv_compartmentAttribute_1_0= ruleCompartmentAttributes )
                    // InternalMappingDSL.g:2776:3: lv_compartmentAttribute_1_0= ruleCompartmentAttributes
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDissimilarityEntryAccess().getCompartmentAttributeCompartmentAttributesEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"ch.hilbri.assist.mappingdsl.MappingDSL.CompartmentAttributes");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMappingDSL.g:2793:6: (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) )
                    {
                    // InternalMappingDSL.g:2793:6: (otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) ) )
                    // InternalMappingDSL.g:2793:8: otherlv_2= 'Box.' ( (lv_boxAttribute_3_0= ruleBoxAttributes ) )
                    {
                    otherlv_2=(Token)match(input,78,FOLLOW_84); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDissimilarityEntryAccess().getBoxKeyword_1_0());
                          
                    }
                    // InternalMappingDSL.g:2797:1: ( (lv_boxAttribute_3_0= ruleBoxAttributes ) )
                    // InternalMappingDSL.g:2798:1: (lv_boxAttribute_3_0= ruleBoxAttributes )
                    {
                    // InternalMappingDSL.g:2798:1: (lv_boxAttribute_3_0= ruleBoxAttributes )
                    // InternalMappingDSL.g:2799:3: lv_boxAttribute_3_0= ruleBoxAttributes
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDissimilarityEntryAccess().getBoxAttributeBoxAttributesEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"ch.hilbri.assist.mappingdsl.MappingDSL.BoxAttributes");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMappingDSL.g:2816:6: (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) )
                    {
                    // InternalMappingDSL.g:2816:6: (otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) ) )
                    // InternalMappingDSL.g:2816:8: otherlv_4= 'Board.' ( (lv_boardAttribute_5_0= ruleBoardAttributes ) )
                    {
                    otherlv_4=(Token)match(input,79,FOLLOW_85); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDissimilarityEntryAccess().getBoardKeyword_2_0());
                          
                    }
                    // InternalMappingDSL.g:2820:1: ( (lv_boardAttribute_5_0= ruleBoardAttributes ) )
                    // InternalMappingDSL.g:2821:1: (lv_boardAttribute_5_0= ruleBoardAttributes )
                    {
                    // InternalMappingDSL.g:2821:1: (lv_boardAttribute_5_0= ruleBoardAttributes )
                    // InternalMappingDSL.g:2822:3: lv_boardAttribute_5_0= ruleBoardAttributes
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDissimilarityEntryAccess().getBoardAttributeBoardAttributesEnumRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"ch.hilbri.assist.mappingdsl.MappingDSL.BoardAttributes");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMappingDSL.g:2839:6: (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) )
                    {
                    // InternalMappingDSL.g:2839:6: (otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) ) )
                    // InternalMappingDSL.g:2839:8: otherlv_6= 'Processor.' ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) )
                    {
                    otherlv_6=(Token)match(input,80,FOLLOW_86); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getDissimilarityEntryAccess().getProcessorKeyword_3_0());
                          
                    }
                    // InternalMappingDSL.g:2843:1: ( (lv_processorAttribute_7_0= ruleProcessorAttributes ) )
                    // InternalMappingDSL.g:2844:1: (lv_processorAttribute_7_0= ruleProcessorAttributes )
                    {
                    // InternalMappingDSL.g:2844:1: (lv_processorAttribute_7_0= ruleProcessorAttributes )
                    // InternalMappingDSL.g:2845:3: lv_processorAttribute_7_0= ruleProcessorAttributes
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDissimilarityEntryAccess().getProcessorAttributeProcessorAttributesEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"ch.hilbri.assist.mappingdsl.MappingDSL.ProcessorAttributes");
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
    // InternalMappingDSL.g:2869:1: entryRuleMetricParameter returns [EObject current=null] : iv_ruleMetricParameter= ruleMetricParameter EOF ;
    public final EObject entryRuleMetricParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricParameter = null;


        try {
            // InternalMappingDSL.g:2870:2: (iv_ruleMetricParameter= ruleMetricParameter EOF )
            // InternalMappingDSL.g:2871:2: iv_ruleMetricParameter= ruleMetricParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetricParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetricParameter=ruleMetricParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetricParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:2878:1: ruleMetricParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) ;
    public final EObject ruleMetricParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalMappingDSL.g:2881:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) )
            // InternalMappingDSL.g:2882:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            {
            // InternalMappingDSL.g:2882:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            // InternalMappingDSL.g:2882:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';'
            {
            // InternalMappingDSL.g:2882:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalMappingDSL.g:2883:1: (lv_name_0_0= RULE_STRING )
            {
            // InternalMappingDSL.g:2883:1: (lv_name_0_0= RULE_STRING )
            // InternalMappingDSL.g:2884:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_5); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMetricParameterAccess().getEqualsSignKeyword_1());
                  
            }
            // InternalMappingDSL.g:2904:1: ( (lv_value_2_0= RULE_INT ) )
            // InternalMappingDSL.g:2905:1: (lv_value_2_0= RULE_INT )
            {
            // InternalMappingDSL.g:2905:1: (lv_value_2_0= RULE_INT )
            // InternalMappingDSL.g:2906:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_7); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.INT");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:2934:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMappingDSL.g:2935:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMappingDSL.g:2936:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMappingDSL.g:2943:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalMappingDSL.g:2946:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMappingDSL.g:2947:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMappingDSL.g:2947:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMappingDSL.g:2947:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_87); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalMappingDSL.g:2954:1: (kw= '.' this_ID_2= RULE_ID )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==81) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalMappingDSL.g:2955:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,81,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_87); if (state.failed) return current;
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
    // InternalMappingDSL.g:2975:1: ruleCompartmentAttributes returns [Enumerator current=null] : ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'Side' ) | (enumLiteral_3= 'Zone' ) ) ;
    public final Enumerator ruleCompartmentAttributes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalMappingDSL.g:2977:28: ( ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'Side' ) | (enumLiteral_3= 'Zone' ) ) )
            // InternalMappingDSL.g:2978:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'Side' ) | (enumLiteral_3= 'Zone' ) )
            {
            // InternalMappingDSL.g:2978:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'Side' ) | (enumLiteral_3= 'Zone' ) )
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
                    // InternalMappingDSL.g:2978:2: (enumLiteral_0= 'Manufacturer' )
                    {
                    // InternalMappingDSL.g:2978:2: (enumLiteral_0= 'Manufacturer' )
                    // InternalMappingDSL.g:2978:4: enumLiteral_0= 'Manufacturer'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompartmentAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompartmentAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMappingDSL.g:2984:6: (enumLiteral_1= 'PowerSupply' )
                    {
                    // InternalMappingDSL.g:2984:6: (enumLiteral_1= 'PowerSupply' )
                    // InternalMappingDSL.g:2984:8: enumLiteral_1= 'PowerSupply'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompartmentAttributesAccess().getPOWERSUPPLYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompartmentAttributesAccess().getPOWERSUPPLYEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMappingDSL.g:2990:6: (enumLiteral_2= 'Side' )
                    {
                    // InternalMappingDSL.g:2990:6: (enumLiteral_2= 'Side' )
                    // InternalMappingDSL.g:2990:8: enumLiteral_2= 'Side'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompartmentAttributesAccess().getSIDEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompartmentAttributesAccess().getSIDEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMappingDSL.g:2996:6: (enumLiteral_3= 'Zone' )
                    {
                    // InternalMappingDSL.g:2996:6: (enumLiteral_3= 'Zone' )
                    // InternalMappingDSL.g:2996:8: enumLiteral_3= 'Zone'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:3006:1: ruleBoxAttributes returns [Enumerator current=null] : (enumLiteral_0= 'Manufacturer' ) ;
    public final Enumerator ruleBoxAttributes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalMappingDSL.g:3008:28: ( (enumLiteral_0= 'Manufacturer' ) )
            // InternalMappingDSL.g:3009:1: (enumLiteral_0= 'Manufacturer' )
            {
            // InternalMappingDSL.g:3009:1: (enumLiteral_0= 'Manufacturer' )
            // InternalMappingDSL.g:3009:3: enumLiteral_0= 'Manufacturer'
            {
            enumLiteral_0=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:3019:1: ruleBoardAttributes returns [Enumerator current=null] : ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'DesignAssuranceLevel' ) | (enumLiteral_3= 'Type' ) | (enumLiteral_4= 'ESS' ) | (enumLiteral_5= 'Side' ) ) ;
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
            // InternalMappingDSL.g:3021:28: ( ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'DesignAssuranceLevel' ) | (enumLiteral_3= 'Type' ) | (enumLiteral_4= 'ESS' ) | (enumLiteral_5= 'Side' ) ) )
            // InternalMappingDSL.g:3022:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'DesignAssuranceLevel' ) | (enumLiteral_3= 'Type' ) | (enumLiteral_4= 'ESS' ) | (enumLiteral_5= 'Side' ) )
            {
            // InternalMappingDSL.g:3022:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'PowerSupply' ) | (enumLiteral_2= 'DesignAssuranceLevel' ) | (enumLiteral_3= 'Type' ) | (enumLiteral_4= 'ESS' ) | (enumLiteral_5= 'Side' ) )
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
                    // InternalMappingDSL.g:3022:2: (enumLiteral_0= 'Manufacturer' )
                    {
                    // InternalMappingDSL.g:3022:2: (enumLiteral_0= 'Manufacturer' )
                    // InternalMappingDSL.g:3022:4: enumLiteral_0= 'Manufacturer'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoardAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBoardAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMappingDSL.g:3028:6: (enumLiteral_1= 'PowerSupply' )
                    {
                    // InternalMappingDSL.g:3028:6: (enumLiteral_1= 'PowerSupply' )
                    // InternalMappingDSL.g:3028:8: enumLiteral_1= 'PowerSupply'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoardAttributesAccess().getPOWERSUPPLYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBoardAttributesAccess().getPOWERSUPPLYEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMappingDSL.g:3034:6: (enumLiteral_2= 'DesignAssuranceLevel' )
                    {
                    // InternalMappingDSL.g:3034:6: (enumLiteral_2= 'DesignAssuranceLevel' )
                    // InternalMappingDSL.g:3034:8: enumLiteral_2= 'DesignAssuranceLevel'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoardAttributesAccess().getASSURANCELEVELEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getBoardAttributesAccess().getASSURANCELEVELEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMappingDSL.g:3040:6: (enumLiteral_3= 'Type' )
                    {
                    // InternalMappingDSL.g:3040:6: (enumLiteral_3= 'Type' )
                    // InternalMappingDSL.g:3040:8: enumLiteral_3= 'Type'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoardAttributesAccess().getBOARDTYPEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getBoardAttributesAccess().getBOARDTYPEEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMappingDSL.g:3046:6: (enumLiteral_4= 'ESS' )
                    {
                    // InternalMappingDSL.g:3046:6: (enumLiteral_4= 'ESS' )
                    // InternalMappingDSL.g:3046:8: enumLiteral_4= 'ESS'
                    {
                    enumLiteral_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBoardAttributesAccess().getESSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getBoardAttributesAccess().getESSEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMappingDSL.g:3052:6: (enumLiteral_5= 'Side' )
                    {
                    // InternalMappingDSL.g:3052:6: (enumLiteral_5= 'Side' )
                    // InternalMappingDSL.g:3052:8: enumLiteral_5= 'Side'
                    {
                    enumLiteral_5=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:3062:1: ruleProcessorAttributes returns [Enumerator current=null] : ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'ProcessorType' ) ) ;
    public final Enumerator ruleProcessorAttributes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalMappingDSL.g:3064:28: ( ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'ProcessorType' ) ) )
            // InternalMappingDSL.g:3065:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'ProcessorType' ) )
            {
            // InternalMappingDSL.g:3065:1: ( (enumLiteral_0= 'Manufacturer' ) | (enumLiteral_1= 'ProcessorType' ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==21) ) {
                alt73=1;
            }
            else if ( (LA73_0==82) ) {
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
                    // InternalMappingDSL.g:3065:2: (enumLiteral_0= 'Manufacturer' )
                    {
                    // InternalMappingDSL.g:3065:2: (enumLiteral_0= 'Manufacturer' )
                    // InternalMappingDSL.g:3065:4: enumLiteral_0= 'Manufacturer'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getProcessorAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getProcessorAttributesAccess().getMANUFACTUREREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMappingDSL.g:3071:6: (enumLiteral_1= 'ProcessorType' )
                    {
                    // InternalMappingDSL.g:3071:6: (enumLiteral_1= 'ProcessorType' )
                    // InternalMappingDSL.g:3071:8: enumLiteral_1= 'ProcessorType'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:3081:1: ruleHardwareArchitectureLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'Core' ) | (enumLiteral_1= 'Processor' ) | (enumLiteral_2= 'Board' ) | (enumLiteral_3= 'Box' ) | (enumLiteral_4= 'Compartment' ) ) ;
    public final Enumerator ruleHardwareArchitectureLevelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalMappingDSL.g:3083:28: ( ( (enumLiteral_0= 'Core' ) | (enumLiteral_1= 'Processor' ) | (enumLiteral_2= 'Board' ) | (enumLiteral_3= 'Box' ) | (enumLiteral_4= 'Compartment' ) ) )
            // InternalMappingDSL.g:3084:1: ( (enumLiteral_0= 'Core' ) | (enumLiteral_1= 'Processor' ) | (enumLiteral_2= 'Board' ) | (enumLiteral_3= 'Box' ) | (enumLiteral_4= 'Compartment' ) )
            {
            // InternalMappingDSL.g:3084:1: ( (enumLiteral_0= 'Core' ) | (enumLiteral_1= 'Processor' ) | (enumLiteral_2= 'Board' ) | (enumLiteral_3= 'Box' ) | (enumLiteral_4= 'Compartment' ) )
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
                    // InternalMappingDSL.g:3084:2: (enumLiteral_0= 'Core' )
                    {
                    // InternalMappingDSL.g:3084:2: (enumLiteral_0= 'Core' )
                    // InternalMappingDSL.g:3084:4: enumLiteral_0= 'Core'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMappingDSL.g:3090:6: (enumLiteral_1= 'Processor' )
                    {
                    // InternalMappingDSL.g:3090:6: (enumLiteral_1= 'Processor' )
                    // InternalMappingDSL.g:3090:8: enumLiteral_1= 'Processor'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getPROCESSOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getHardwareArchitectureLevelTypeAccess().getPROCESSOREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMappingDSL.g:3096:6: (enumLiteral_2= 'Board' )
                    {
                    // InternalMappingDSL.g:3096:6: (enumLiteral_2= 'Board' )
                    // InternalMappingDSL.g:3096:8: enumLiteral_2= 'Board'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getBOARDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getHardwareArchitectureLevelTypeAccess().getBOARDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMappingDSL.g:3102:6: (enumLiteral_3= 'Box' )
                    {
                    // InternalMappingDSL.g:3102:6: (enumLiteral_3= 'Box' )
                    // InternalMappingDSL.g:3102:8: enumLiteral_3= 'Box'
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getBOXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getHardwareArchitectureLevelTypeAccess().getBOXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMappingDSL.g:3108:6: (enumLiteral_4= 'Compartment' )
                    {
                    // InternalMappingDSL.g:3108:6: (enumLiteral_4= 'Compartment' )
                    // InternalMappingDSL.g:3108:8: enumLiteral_4= 'Compartment'
                    {
                    enumLiteral_4=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:3118:1: ruleDesignAssuranceLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'QS' ) | (enumLiteral_2= 'D' ) | (enumLiteral_3= 'C' ) | (enumLiteral_4= 'B' ) | (enumLiteral_5= 'A' ) ) ;
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
            // InternalMappingDSL.g:3120:28: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'QS' ) | (enumLiteral_2= 'D' ) | (enumLiteral_3= 'C' ) | (enumLiteral_4= 'B' ) | (enumLiteral_5= 'A' ) ) )
            // InternalMappingDSL.g:3121:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'QS' ) | (enumLiteral_2= 'D' ) | (enumLiteral_3= 'C' ) | (enumLiteral_4= 'B' ) | (enumLiteral_5= 'A' ) )
            {
            // InternalMappingDSL.g:3121:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'QS' ) | (enumLiteral_2= 'D' ) | (enumLiteral_3= 'C' ) | (enumLiteral_4= 'B' ) | (enumLiteral_5= 'A' ) )
            int alt75=6;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt75=1;
                }
                break;
            case 84:
                {
                alt75=2;
                }
                break;
            case 85:
                {
                alt75=3;
                }
                break;
            case 86:
                {
                alt75=4;
                }
                break;
            case 87:
                {
                alt75=5;
                }
                break;
            case 88:
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
                    // InternalMappingDSL.g:3121:2: (enumLiteral_0= 'None' )
                    {
                    // InternalMappingDSL.g:3121:2: (enumLiteral_0= 'None' )
                    // InternalMappingDSL.g:3121:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDesignAssuranceLevelTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDesignAssuranceLevelTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMappingDSL.g:3127:6: (enumLiteral_1= 'QS' )
                    {
                    // InternalMappingDSL.g:3127:6: (enumLiteral_1= 'QS' )
                    // InternalMappingDSL.g:3127:8: enumLiteral_1= 'QS'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDesignAssuranceLevelTypeAccess().getQSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDesignAssuranceLevelTypeAccess().getQSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMappingDSL.g:3133:6: (enumLiteral_2= 'D' )
                    {
                    // InternalMappingDSL.g:3133:6: (enumLiteral_2= 'D' )
                    // InternalMappingDSL.g:3133:8: enumLiteral_2= 'D'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDesignAssuranceLevelTypeAccess().getDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getDesignAssuranceLevelTypeAccess().getDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMappingDSL.g:3139:6: (enumLiteral_3= 'C' )
                    {
                    // InternalMappingDSL.g:3139:6: (enumLiteral_3= 'C' )
                    // InternalMappingDSL.g:3139:8: enumLiteral_3= 'C'
                    {
                    enumLiteral_3=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDesignAssuranceLevelTypeAccess().getCEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getDesignAssuranceLevelTypeAccess().getCEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMappingDSL.g:3145:6: (enumLiteral_4= 'B' )
                    {
                    // InternalMappingDSL.g:3145:6: (enumLiteral_4= 'B' )
                    // InternalMappingDSL.g:3145:8: enumLiteral_4= 'B'
                    {
                    enumLiteral_4=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDesignAssuranceLevelTypeAccess().getBEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getDesignAssuranceLevelTypeAccess().getBEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMappingDSL.g:3151:6: (enumLiteral_5= 'A' )
                    {
                    // InternalMappingDSL.g:3151:6: (enumLiteral_5= 'A' )
                    // InternalMappingDSL.g:3151:8: enumLiteral_5= 'A'
                    {
                    enumLiteral_5=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:3161:1: ruleIOAdapterProtectionLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) ) ;
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
            // InternalMappingDSL.g:3163:28: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) ) )
            // InternalMappingDSL.g:3164:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) )
            {
            // InternalMappingDSL.g:3164:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) )
            int alt76=9;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt76=1;
                }
                break;
            case 89:
                {
                alt76=2;
                }
                break;
            case 90:
                {
                alt76=3;
                }
                break;
            case 91:
                {
                alt76=4;
                }
                break;
            case 92:
                {
                alt76=5;
                }
                break;
            case 93:
                {
                alt76=6;
                }
                break;
            case 94:
                {
                alt76=7;
                }
                break;
            case 95:
                {
                alt76=8;
                }
                break;
            case 96:
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
                    // InternalMappingDSL.g:3164:2: (enumLiteral_0= 'None' )
                    {
                    // InternalMappingDSL.g:3164:2: (enumLiteral_0= 'None' )
                    // InternalMappingDSL.g:3164:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMappingDSL.g:3170:6: (enumLiteral_1= 'L1' )
                    {
                    // InternalMappingDSL.g:3170:6: (enumLiteral_1= 'L1' )
                    // InternalMappingDSL.g:3170:8: enumLiteral_1= 'L1'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_1EnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMappingDSL.g:3176:6: (enumLiteral_2= 'L2' )
                    {
                    // InternalMappingDSL.g:3176:6: (enumLiteral_2= 'L2' )
                    // InternalMappingDSL.g:3176:8: enumLiteral_2= 'L2'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_2EnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMappingDSL.g:3182:6: (enumLiteral_3= 'L3' )
                    {
                    // InternalMappingDSL.g:3182:6: (enumLiteral_3= 'L3' )
                    // InternalMappingDSL.g:3182:8: enumLiteral_3= 'L3'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_3EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_3EnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMappingDSL.g:3188:6: (enumLiteral_4= 'L4' )
                    {
                    // InternalMappingDSL.g:3188:6: (enumLiteral_4= 'L4' )
                    // InternalMappingDSL.g:3188:8: enumLiteral_4= 'L4'
                    {
                    enumLiteral_4=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_4EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_4EnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMappingDSL.g:3194:6: (enumLiteral_5= 'L5' )
                    {
                    // InternalMappingDSL.g:3194:6: (enumLiteral_5= 'L5' )
                    // InternalMappingDSL.g:3194:8: enumLiteral_5= 'L5'
                    {
                    enumLiteral_5=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_5EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_5EnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMappingDSL.g:3200:6: (enumLiteral_6= 'L6' )
                    {
                    // InternalMappingDSL.g:3200:6: (enumLiteral_6= 'L6' )
                    // InternalMappingDSL.g:3200:8: enumLiteral_6= 'L6'
                    {
                    enumLiteral_6=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_6EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_6EnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMappingDSL.g:3206:6: (enumLiteral_7= 'L7' )
                    {
                    // InternalMappingDSL.g:3206:6: (enumLiteral_7= 'L7' )
                    // InternalMappingDSL.g:3206:8: enumLiteral_7= 'L7'
                    {
                    enumLiteral_7=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_7EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getIOAdapterProtectionLevelTypeAccess().getLEVEL_7EnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMappingDSL.g:3212:6: (enumLiteral_8= 'L8' )
                    {
                    // InternalMappingDSL.g:3212:6: (enumLiteral_8= 'L8' )
                    // InternalMappingDSL.g:3212:8: enumLiteral_8= 'L8'
                    {
                    enumLiteral_8=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
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
    // InternalMappingDSL.g:3222:1: ruleIOAdapterType returns [Enumerator current=null] : ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'CustomType0' ) | (enumLiteral_7= 'CustomType1' ) | (enumLiteral_8= 'CustomType2' ) | (enumLiteral_9= 'CustomType3' ) | (enumLiteral_10= 'CustomType4' ) | (enumLiteral_11= 'CustomType5' ) | (enumLiteral_12= 'CustomType6' ) | (enumLiteral_13= 'CustomType7' ) | (enumLiteral_14= 'CustomType8' ) | (enumLiteral_15= 'CustomType9' ) | (enumLiteral_16= 'CustomType10' ) | (enumLiteral_17= 'CustomType11' ) | (enumLiteral_18= 'CustomType12' ) | (enumLiteral_19= 'CustomType13' ) | (enumLiteral_20= 'CustomType14' ) | (enumLiteral_21= 'CustomType15' ) | (enumLiteral_22= 'CustomType16' ) | (enumLiteral_23= 'CustomType17' ) | (enumLiteral_24= 'CustomType18' ) | (enumLiteral_25= 'CustomType19' ) | (enumLiteral_26= 'CustomType20' ) | (enumLiteral_27= 'CustomType21' ) | (enumLiteral_28= 'CustomType22' ) | (enumLiteral_29= 'CustomType23' ) | (enumLiteral_30= 'CustomType24' ) | (enumLiteral_31= 'CustomType25' ) | (enumLiteral_32= 'CustomType26' ) | (enumLiteral_33= 'CustomType27' ) | (enumLiteral_34= 'CustomType28' ) | (enumLiteral_35= 'CustomType29' ) | (enumLiteral_36= 'CustomType30' ) | (enumLiteral_37= 'CustomType31' ) | (enumLiteral_38= 'CustomType32' ) | (enumLiteral_39= 'CustomType33' ) | (enumLiteral_40= 'CustomType34' ) | (enumLiteral_41= 'CustomType35' ) | (enumLiteral_42= 'CustomType36' ) | (enumLiteral_43= 'CustomType37' ) | (enumLiteral_44= 'CustomType38' ) | (enumLiteral_45= 'CustomType39' ) ) ;
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
            // InternalMappingDSL.g:3224:28: ( ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'CustomType0' ) | (enumLiteral_7= 'CustomType1' ) | (enumLiteral_8= 'CustomType2' ) | (enumLiteral_9= 'CustomType3' ) | (enumLiteral_10= 'CustomType4' ) | (enumLiteral_11= 'CustomType5' ) | (enumLiteral_12= 'CustomType6' ) | (enumLiteral_13= 'CustomType7' ) | (enumLiteral_14= 'CustomType8' ) | (enumLiteral_15= 'CustomType9' ) | (enumLiteral_16= 'CustomType10' ) | (enumLiteral_17= 'CustomType11' ) | (enumLiteral_18= 'CustomType12' ) | (enumLiteral_19= 'CustomType13' ) | (enumLiteral_20= 'CustomType14' ) | (enumLiteral_21= 'CustomType15' ) | (enumLiteral_22= 'CustomType16' ) | (enumLiteral_23= 'CustomType17' ) | (enumLiteral_24= 'CustomType18' ) | (enumLiteral_25= 'CustomType19' ) | (enumLiteral_26= 'CustomType20' ) | (enumLiteral_27= 'CustomType21' ) | (enumLiteral_28= 'CustomType22' ) | (enumLiteral_29= 'CustomType23' ) | (enumLiteral_30= 'CustomType24' ) | (enumLiteral_31= 'CustomType25' ) | (enumLiteral_32= 'CustomType26' ) | (enumLiteral_33= 'CustomType27' ) | (enumLiteral_34= 'CustomType28' ) | (enumLiteral_35= 'CustomType29' ) | (enumLiteral_36= 'CustomType30' ) | (enumLiteral_37= 'CustomType31' ) | (enumLiteral_38= 'CustomType32' ) | (enumLiteral_39= 'CustomType33' ) | (enumLiteral_40= 'CustomType34' ) | (enumLiteral_41= 'CustomType35' ) | (enumLiteral_42= 'CustomType36' ) | (enumLiteral_43= 'CustomType37' ) | (enumLiteral_44= 'CustomType38' ) | (enumLiteral_45= 'CustomType39' ) ) )
            // InternalMappingDSL.g:3225:1: ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'CustomType0' ) | (enumLiteral_7= 'CustomType1' ) | (enumLiteral_8= 'CustomType2' ) | (enumLiteral_9= 'CustomType3' ) | (enumLiteral_10= 'CustomType4' ) | (enumLiteral_11= 'CustomType5' ) | (enumLiteral_12= 'CustomType6' ) | (enumLiteral_13= 'CustomType7' ) | (enumLiteral_14= 'CustomType8' ) | (enumLiteral_15= 'CustomType9' ) | (enumLiteral_16= 'CustomType10' ) | (enumLiteral_17= 'CustomType11' ) | (enumLiteral_18= 'CustomType12' ) | (enumLiteral_19= 'CustomType13' ) | (enumLiteral_20= 'CustomType14' ) | (enumLiteral_21= 'CustomType15' ) | (enumLiteral_22= 'CustomType16' ) | (enumLiteral_23= 'CustomType17' ) | (enumLiteral_24= 'CustomType18' ) | (enumLiteral_25= 'CustomType19' ) | (enumLiteral_26= 'CustomType20' ) | (enumLiteral_27= 'CustomType21' ) | (enumLiteral_28= 'CustomType22' ) | (enumLiteral_29= 'CustomType23' ) | (enumLiteral_30= 'CustomType24' ) | (enumLiteral_31= 'CustomType25' ) | (enumLiteral_32= 'CustomType26' ) | (enumLiteral_33= 'CustomType27' ) | (enumLiteral_34= 'CustomType28' ) | (enumLiteral_35= 'CustomType29' ) | (enumLiteral_36= 'CustomType30' ) | (enumLiteral_37= 'CustomType31' ) | (enumLiteral_38= 'CustomType32' ) | (enumLiteral_39= 'CustomType33' ) | (enumLiteral_40= 'CustomType34' ) | (enumLiteral_41= 'CustomType35' ) | (enumLiteral_42= 'CustomType36' ) | (enumLiteral_43= 'CustomType37' ) | (enumLiteral_44= 'CustomType38' ) | (enumLiteral_45= 'CustomType39' ) )
            {
            // InternalMappingDSL.g:3225:1: ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'CustomType0' ) | (enumLiteral_7= 'CustomType1' ) | (enumLiteral_8= 'CustomType2' ) | (enumLiteral_9= 'CustomType3' ) | (enumLiteral_10= 'CustomType4' ) | (enumLiteral_11= 'CustomType5' ) | (enumLiteral_12= 'CustomType6' ) | (enumLiteral_13= 'CustomType7' ) | (enumLiteral_14= 'CustomType8' ) | (enumLiteral_15= 'CustomType9' ) | (enumLiteral_16= 'CustomType10' ) | (enumLiteral_17= 'CustomType11' ) | (enumLiteral_18= 'CustomType12' ) | (enumLiteral_19= 'CustomType13' ) | (enumLiteral_20= 'CustomType14' ) | (enumLiteral_21= 'CustomType15' ) | (enumLiteral_22= 'CustomType16' ) | (enumLiteral_23= 'CustomType17' ) | (enumLiteral_24= 'CustomType18' ) | (enumLiteral_25= 'CustomType19' ) | (enumLiteral_26= 'CustomType20' ) | (enumLiteral_27= 'CustomType21' ) | (enumLiteral_28= 'CustomType22' ) | (enumLiteral_29= 'CustomType23' ) | (enumLiteral_30= 'CustomType24' ) | (enumLiteral_31= 'CustomType25' ) | (enumLiteral_32= 'CustomType26' ) | (enumLiteral_33= 'CustomType27' ) | (enumLiteral_34= 'CustomType28' ) | (enumLiteral_35= 'CustomType29' ) | (enumLiteral_36= 'CustomType30' ) | (enumLiteral_37= 'CustomType31' ) | (enumLiteral_38= 'CustomType32' ) | (enumLiteral_39= 'CustomType33' ) | (enumLiteral_40= 'CustomType34' ) | (enumLiteral_41= 'CustomType35' ) | (enumLiteral_42= 'CustomType36' ) | (enumLiteral_43= 'CustomType37' ) | (enumLiteral_44= 'CustomType38' ) | (enumLiteral_45= 'CustomType39' ) )
            int alt77=46;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt77=1;
                }
                break;
            case 98:
                {
                alt77=2;
                }
                break;
            case 99:
                {
                alt77=3;
                }
                break;
            case 100:
                {
                alt77=4;
                }
                break;
            case 101:
                {
                alt77=5;
                }
                break;
            case 102:
                {
                alt77=6;
                }
                break;
            case 103:
                {
                alt77=7;
                }
                break;
            case 104:
                {
                alt77=8;
                }
                break;
            case 105:
                {
                alt77=9;
                }
                break;
            case 106:
                {
                alt77=10;
                }
                break;
            case 107:
                {
                alt77=11;
                }
                break;
            case 108:
                {
                alt77=12;
                }
                break;
            case 109:
                {
                alt77=13;
                }
                break;
            case 110:
                {
                alt77=14;
                }
                break;
            case 111:
                {
                alt77=15;
                }
                break;
            case 112:
                {
                alt77=16;
                }
                break;
            case 113:
                {
                alt77=17;
                }
                break;
            case 114:
                {
                alt77=18;
                }
                break;
            case 115:
                {
                alt77=19;
                }
                break;
            case 116:
                {
                alt77=20;
                }
                break;
            case 117:
                {
                alt77=21;
                }
                break;
            case 118:
                {
                alt77=22;
                }
                break;
            case 119:
                {
                alt77=23;
                }
                break;
            case 120:
                {
                alt77=24;
                }
                break;
            case 121:
                {
                alt77=25;
                }
                break;
            case 122:
                {
                alt77=26;
                }
                break;
            case 123:
                {
                alt77=27;
                }
                break;
            case 124:
                {
                alt77=28;
                }
                break;
            case 125:
                {
                alt77=29;
                }
                break;
            case 126:
                {
                alt77=30;
                }
                break;
            case 127:
                {
                alt77=31;
                }
                break;
            case 128:
                {
                alt77=32;
                }
                break;
            case 129:
                {
                alt77=33;
                }
                break;
            case 130:
                {
                alt77=34;
                }
                break;
            case 131:
                {
                alt77=35;
                }
                break;
            case 132:
                {
                alt77=36;
                }
                break;
            case 133:
                {
                alt77=37;
                }
                break;
            case 134:
                {
                alt77=38;
                }
                break;
            case 135:
                {
                alt77=39;
                }
                break;
            case 136:
                {
                alt77=40;
                }
                break;
            case 137:
                {
                alt77=41;
                }
                break;
            case 138:
                {
                alt77=42;
                }
                break;
            case 139:
                {
                alt77=43;
                }
                break;
            case 140:
                {
                alt77=44;
                }
                break;
            case 141:
                {
                alt77=45;
                }
                break;
            case 142:
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
                    // InternalMappingDSL.g:3225:2: (enumLiteral_0= 'Can' )
                    {
                    // InternalMappingDSL.g:3225:2: (enumLiteral_0= 'Can' )
                    // InternalMappingDSL.g:3225:4: enumLiteral_0= 'Can'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getIOAdapterTypeAccess().getCANEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMappingDSL.g:3231:6: (enumLiteral_1= 'Enhanced Local Bus' )
                    {
                    // InternalMappingDSL.g:3231:6: (enumLiteral_1= 'Enhanced Local Bus' )
                    // InternalMappingDSL.g:3231:8: enumLiteral_1= 'Enhanced Local Bus'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getELBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getIOAdapterTypeAccess().getELBEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMappingDSL.g:3237:6: (enumLiteral_2= 'Ethernet' )
                    {
                    // InternalMappingDSL.g:3237:6: (enumLiteral_2= 'Ethernet' )
                    // InternalMappingDSL.g:3237:8: enumLiteral_2= 'Ethernet'
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getETHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getIOAdapterTypeAccess().getETHEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMappingDSL.g:3243:6: (enumLiteral_3= 'Analog' )
                    {
                    // InternalMappingDSL.g:3243:6: (enumLiteral_3= 'Analog' )
                    // InternalMappingDSL.g:3243:8: enumLiteral_3= 'Analog'
                    {
                    enumLiteral_3=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getANALOGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getIOAdapterTypeAccess().getANALOGEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMappingDSL.g:3249:6: (enumLiteral_4= 'Digital' )
                    {
                    // InternalMappingDSL.g:3249:6: (enumLiteral_4= 'Digital' )
                    // InternalMappingDSL.g:3249:8: enumLiteral_4= 'Digital'
                    {
                    enumLiteral_4=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getDIGITALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getIOAdapterTypeAccess().getDIGITALEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMappingDSL.g:3255:6: (enumLiteral_5= 'Serial' )
                    {
                    // InternalMappingDSL.g:3255:6: (enumLiteral_5= 'Serial' )
                    // InternalMappingDSL.g:3255:8: enumLiteral_5= 'Serial'
                    {
                    enumLiteral_5=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getSERIALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getIOAdapterTypeAccess().getSERIALEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMappingDSL.g:3261:6: (enumLiteral_6= 'CustomType0' )
                    {
                    // InternalMappingDSL.g:3261:6: (enumLiteral_6= 'CustomType0' )
                    // InternalMappingDSL.g:3261:8: enumLiteral_6= 'CustomType0'
                    {
                    enumLiteral_6=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM0EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getIOAdapterTypeAccess().getCUSTOM0EnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMappingDSL.g:3267:6: (enumLiteral_7= 'CustomType1' )
                    {
                    // InternalMappingDSL.g:3267:6: (enumLiteral_7= 'CustomType1' )
                    // InternalMappingDSL.g:3267:8: enumLiteral_7= 'CustomType1'
                    {
                    enumLiteral_7=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM1EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getIOAdapterTypeAccess().getCUSTOM1EnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMappingDSL.g:3273:6: (enumLiteral_8= 'CustomType2' )
                    {
                    // InternalMappingDSL.g:3273:6: (enumLiteral_8= 'CustomType2' )
                    // InternalMappingDSL.g:3273:8: enumLiteral_8= 'CustomType2'
                    {
                    enumLiteral_8=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM2EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getIOAdapterTypeAccess().getCUSTOM2EnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalMappingDSL.g:3279:6: (enumLiteral_9= 'CustomType3' )
                    {
                    // InternalMappingDSL.g:3279:6: (enumLiteral_9= 'CustomType3' )
                    // InternalMappingDSL.g:3279:8: enumLiteral_9= 'CustomType3'
                    {
                    enumLiteral_9=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM3EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getIOAdapterTypeAccess().getCUSTOM3EnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalMappingDSL.g:3285:6: (enumLiteral_10= 'CustomType4' )
                    {
                    // InternalMappingDSL.g:3285:6: (enumLiteral_10= 'CustomType4' )
                    // InternalMappingDSL.g:3285:8: enumLiteral_10= 'CustomType4'
                    {
                    enumLiteral_10=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM4EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getIOAdapterTypeAccess().getCUSTOM4EnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalMappingDSL.g:3291:6: (enumLiteral_11= 'CustomType5' )
                    {
                    // InternalMappingDSL.g:3291:6: (enumLiteral_11= 'CustomType5' )
                    // InternalMappingDSL.g:3291:8: enumLiteral_11= 'CustomType5'
                    {
                    enumLiteral_11=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM5EnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getIOAdapterTypeAccess().getCUSTOM5EnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalMappingDSL.g:3297:6: (enumLiteral_12= 'CustomType6' )
                    {
                    // InternalMappingDSL.g:3297:6: (enumLiteral_12= 'CustomType6' )
                    // InternalMappingDSL.g:3297:8: enumLiteral_12= 'CustomType6'
                    {
                    enumLiteral_12=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM6EnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getIOAdapterTypeAccess().getCUSTOM6EnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalMappingDSL.g:3303:6: (enumLiteral_13= 'CustomType7' )
                    {
                    // InternalMappingDSL.g:3303:6: (enumLiteral_13= 'CustomType7' )
                    // InternalMappingDSL.g:3303:8: enumLiteral_13= 'CustomType7'
                    {
                    enumLiteral_13=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM7EnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getIOAdapterTypeAccess().getCUSTOM7EnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalMappingDSL.g:3309:6: (enumLiteral_14= 'CustomType8' )
                    {
                    // InternalMappingDSL.g:3309:6: (enumLiteral_14= 'CustomType8' )
                    // InternalMappingDSL.g:3309:8: enumLiteral_14= 'CustomType8'
                    {
                    enumLiteral_14=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM8EnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getIOAdapterTypeAccess().getCUSTOM8EnumLiteralDeclaration_14()); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalMappingDSL.g:3315:6: (enumLiteral_15= 'CustomType9' )
                    {
                    // InternalMappingDSL.g:3315:6: (enumLiteral_15= 'CustomType9' )
                    // InternalMappingDSL.g:3315:8: enumLiteral_15= 'CustomType9'
                    {
                    enumLiteral_15=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM9EnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_15, grammarAccess.getIOAdapterTypeAccess().getCUSTOM9EnumLiteralDeclaration_15()); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalMappingDSL.g:3321:6: (enumLiteral_16= 'CustomType10' )
                    {
                    // InternalMappingDSL.g:3321:6: (enumLiteral_16= 'CustomType10' )
                    // InternalMappingDSL.g:3321:8: enumLiteral_16= 'CustomType10'
                    {
                    enumLiteral_16=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM10EnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_16, grammarAccess.getIOAdapterTypeAccess().getCUSTOM10EnumLiteralDeclaration_16()); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalMappingDSL.g:3327:6: (enumLiteral_17= 'CustomType11' )
                    {
                    // InternalMappingDSL.g:3327:6: (enumLiteral_17= 'CustomType11' )
                    // InternalMappingDSL.g:3327:8: enumLiteral_17= 'CustomType11'
                    {
                    enumLiteral_17=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM11EnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_17, grammarAccess.getIOAdapterTypeAccess().getCUSTOM11EnumLiteralDeclaration_17()); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalMappingDSL.g:3333:6: (enumLiteral_18= 'CustomType12' )
                    {
                    // InternalMappingDSL.g:3333:6: (enumLiteral_18= 'CustomType12' )
                    // InternalMappingDSL.g:3333:8: enumLiteral_18= 'CustomType12'
                    {
                    enumLiteral_18=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM12EnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_18, grammarAccess.getIOAdapterTypeAccess().getCUSTOM12EnumLiteralDeclaration_18()); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalMappingDSL.g:3339:6: (enumLiteral_19= 'CustomType13' )
                    {
                    // InternalMappingDSL.g:3339:6: (enumLiteral_19= 'CustomType13' )
                    // InternalMappingDSL.g:3339:8: enumLiteral_19= 'CustomType13'
                    {
                    enumLiteral_19=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM13EnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_19, grammarAccess.getIOAdapterTypeAccess().getCUSTOM13EnumLiteralDeclaration_19()); 
                          
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalMappingDSL.g:3345:6: (enumLiteral_20= 'CustomType14' )
                    {
                    // InternalMappingDSL.g:3345:6: (enumLiteral_20= 'CustomType14' )
                    // InternalMappingDSL.g:3345:8: enumLiteral_20= 'CustomType14'
                    {
                    enumLiteral_20=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM14EnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_20, grammarAccess.getIOAdapterTypeAccess().getCUSTOM14EnumLiteralDeclaration_20()); 
                          
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalMappingDSL.g:3351:6: (enumLiteral_21= 'CustomType15' )
                    {
                    // InternalMappingDSL.g:3351:6: (enumLiteral_21= 'CustomType15' )
                    // InternalMappingDSL.g:3351:8: enumLiteral_21= 'CustomType15'
                    {
                    enumLiteral_21=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM15EnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_21, grammarAccess.getIOAdapterTypeAccess().getCUSTOM15EnumLiteralDeclaration_21()); 
                          
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalMappingDSL.g:3357:6: (enumLiteral_22= 'CustomType16' )
                    {
                    // InternalMappingDSL.g:3357:6: (enumLiteral_22= 'CustomType16' )
                    // InternalMappingDSL.g:3357:8: enumLiteral_22= 'CustomType16'
                    {
                    enumLiteral_22=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM16EnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_22, grammarAccess.getIOAdapterTypeAccess().getCUSTOM16EnumLiteralDeclaration_22()); 
                          
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalMappingDSL.g:3363:6: (enumLiteral_23= 'CustomType17' )
                    {
                    // InternalMappingDSL.g:3363:6: (enumLiteral_23= 'CustomType17' )
                    // InternalMappingDSL.g:3363:8: enumLiteral_23= 'CustomType17'
                    {
                    enumLiteral_23=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM17EnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_23, grammarAccess.getIOAdapterTypeAccess().getCUSTOM17EnumLiteralDeclaration_23()); 
                          
                    }

                    }


                    }
                    break;
                case 25 :
                    // InternalMappingDSL.g:3369:6: (enumLiteral_24= 'CustomType18' )
                    {
                    // InternalMappingDSL.g:3369:6: (enumLiteral_24= 'CustomType18' )
                    // InternalMappingDSL.g:3369:8: enumLiteral_24= 'CustomType18'
                    {
                    enumLiteral_24=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM18EnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_24, grammarAccess.getIOAdapterTypeAccess().getCUSTOM18EnumLiteralDeclaration_24()); 
                          
                    }

                    }


                    }
                    break;
                case 26 :
                    // InternalMappingDSL.g:3375:6: (enumLiteral_25= 'CustomType19' )
                    {
                    // InternalMappingDSL.g:3375:6: (enumLiteral_25= 'CustomType19' )
                    // InternalMappingDSL.g:3375:8: enumLiteral_25= 'CustomType19'
                    {
                    enumLiteral_25=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM19EnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_25, grammarAccess.getIOAdapterTypeAccess().getCUSTOM19EnumLiteralDeclaration_25()); 
                          
                    }

                    }


                    }
                    break;
                case 27 :
                    // InternalMappingDSL.g:3381:6: (enumLiteral_26= 'CustomType20' )
                    {
                    // InternalMappingDSL.g:3381:6: (enumLiteral_26= 'CustomType20' )
                    // InternalMappingDSL.g:3381:8: enumLiteral_26= 'CustomType20'
                    {
                    enumLiteral_26=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM20EnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_26, grammarAccess.getIOAdapterTypeAccess().getCUSTOM20EnumLiteralDeclaration_26()); 
                          
                    }

                    }


                    }
                    break;
                case 28 :
                    // InternalMappingDSL.g:3387:6: (enumLiteral_27= 'CustomType21' )
                    {
                    // InternalMappingDSL.g:3387:6: (enumLiteral_27= 'CustomType21' )
                    // InternalMappingDSL.g:3387:8: enumLiteral_27= 'CustomType21'
                    {
                    enumLiteral_27=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM21EnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_27, grammarAccess.getIOAdapterTypeAccess().getCUSTOM21EnumLiteralDeclaration_27()); 
                          
                    }

                    }


                    }
                    break;
                case 29 :
                    // InternalMappingDSL.g:3393:6: (enumLiteral_28= 'CustomType22' )
                    {
                    // InternalMappingDSL.g:3393:6: (enumLiteral_28= 'CustomType22' )
                    // InternalMappingDSL.g:3393:8: enumLiteral_28= 'CustomType22'
                    {
                    enumLiteral_28=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM22EnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_28, grammarAccess.getIOAdapterTypeAccess().getCUSTOM22EnumLiteralDeclaration_28()); 
                          
                    }

                    }


                    }
                    break;
                case 30 :
                    // InternalMappingDSL.g:3399:6: (enumLiteral_29= 'CustomType23' )
                    {
                    // InternalMappingDSL.g:3399:6: (enumLiteral_29= 'CustomType23' )
                    // InternalMappingDSL.g:3399:8: enumLiteral_29= 'CustomType23'
                    {
                    enumLiteral_29=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM23EnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_29, grammarAccess.getIOAdapterTypeAccess().getCUSTOM23EnumLiteralDeclaration_29()); 
                          
                    }

                    }


                    }
                    break;
                case 31 :
                    // InternalMappingDSL.g:3405:6: (enumLiteral_30= 'CustomType24' )
                    {
                    // InternalMappingDSL.g:3405:6: (enumLiteral_30= 'CustomType24' )
                    // InternalMappingDSL.g:3405:8: enumLiteral_30= 'CustomType24'
                    {
                    enumLiteral_30=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM24EnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_30, grammarAccess.getIOAdapterTypeAccess().getCUSTOM24EnumLiteralDeclaration_30()); 
                          
                    }

                    }


                    }
                    break;
                case 32 :
                    // InternalMappingDSL.g:3411:6: (enumLiteral_31= 'CustomType25' )
                    {
                    // InternalMappingDSL.g:3411:6: (enumLiteral_31= 'CustomType25' )
                    // InternalMappingDSL.g:3411:8: enumLiteral_31= 'CustomType25'
                    {
                    enumLiteral_31=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM25EnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_31, grammarAccess.getIOAdapterTypeAccess().getCUSTOM25EnumLiteralDeclaration_31()); 
                          
                    }

                    }


                    }
                    break;
                case 33 :
                    // InternalMappingDSL.g:3417:6: (enumLiteral_32= 'CustomType26' )
                    {
                    // InternalMappingDSL.g:3417:6: (enumLiteral_32= 'CustomType26' )
                    // InternalMappingDSL.g:3417:8: enumLiteral_32= 'CustomType26'
                    {
                    enumLiteral_32=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM26EnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_32, grammarAccess.getIOAdapterTypeAccess().getCUSTOM26EnumLiteralDeclaration_32()); 
                          
                    }

                    }


                    }
                    break;
                case 34 :
                    // InternalMappingDSL.g:3423:6: (enumLiteral_33= 'CustomType27' )
                    {
                    // InternalMappingDSL.g:3423:6: (enumLiteral_33= 'CustomType27' )
                    // InternalMappingDSL.g:3423:8: enumLiteral_33= 'CustomType27'
                    {
                    enumLiteral_33=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM27EnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_33, grammarAccess.getIOAdapterTypeAccess().getCUSTOM27EnumLiteralDeclaration_33()); 
                          
                    }

                    }


                    }
                    break;
                case 35 :
                    // InternalMappingDSL.g:3429:6: (enumLiteral_34= 'CustomType28' )
                    {
                    // InternalMappingDSL.g:3429:6: (enumLiteral_34= 'CustomType28' )
                    // InternalMappingDSL.g:3429:8: enumLiteral_34= 'CustomType28'
                    {
                    enumLiteral_34=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM28EnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_34, grammarAccess.getIOAdapterTypeAccess().getCUSTOM28EnumLiteralDeclaration_34()); 
                          
                    }

                    }


                    }
                    break;
                case 36 :
                    // InternalMappingDSL.g:3435:6: (enumLiteral_35= 'CustomType29' )
                    {
                    // InternalMappingDSL.g:3435:6: (enumLiteral_35= 'CustomType29' )
                    // InternalMappingDSL.g:3435:8: enumLiteral_35= 'CustomType29'
                    {
                    enumLiteral_35=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM29EnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_35, grammarAccess.getIOAdapterTypeAccess().getCUSTOM29EnumLiteralDeclaration_35()); 
                          
                    }

                    }


                    }
                    break;
                case 37 :
                    // InternalMappingDSL.g:3441:6: (enumLiteral_36= 'CustomType30' )
                    {
                    // InternalMappingDSL.g:3441:6: (enumLiteral_36= 'CustomType30' )
                    // InternalMappingDSL.g:3441:8: enumLiteral_36= 'CustomType30'
                    {
                    enumLiteral_36=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM30EnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_36, grammarAccess.getIOAdapterTypeAccess().getCUSTOM30EnumLiteralDeclaration_36()); 
                          
                    }

                    }


                    }
                    break;
                case 38 :
                    // InternalMappingDSL.g:3447:6: (enumLiteral_37= 'CustomType31' )
                    {
                    // InternalMappingDSL.g:3447:6: (enumLiteral_37= 'CustomType31' )
                    // InternalMappingDSL.g:3447:8: enumLiteral_37= 'CustomType31'
                    {
                    enumLiteral_37=(Token)match(input,134,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM31EnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_37, grammarAccess.getIOAdapterTypeAccess().getCUSTOM31EnumLiteralDeclaration_37()); 
                          
                    }

                    }


                    }
                    break;
                case 39 :
                    // InternalMappingDSL.g:3453:6: (enumLiteral_38= 'CustomType32' )
                    {
                    // InternalMappingDSL.g:3453:6: (enumLiteral_38= 'CustomType32' )
                    // InternalMappingDSL.g:3453:8: enumLiteral_38= 'CustomType32'
                    {
                    enumLiteral_38=(Token)match(input,135,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM32EnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_38, grammarAccess.getIOAdapterTypeAccess().getCUSTOM32EnumLiteralDeclaration_38()); 
                          
                    }

                    }


                    }
                    break;
                case 40 :
                    // InternalMappingDSL.g:3459:6: (enumLiteral_39= 'CustomType33' )
                    {
                    // InternalMappingDSL.g:3459:6: (enumLiteral_39= 'CustomType33' )
                    // InternalMappingDSL.g:3459:8: enumLiteral_39= 'CustomType33'
                    {
                    enumLiteral_39=(Token)match(input,136,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM33EnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_39, grammarAccess.getIOAdapterTypeAccess().getCUSTOM33EnumLiteralDeclaration_39()); 
                          
                    }

                    }


                    }
                    break;
                case 41 :
                    // InternalMappingDSL.g:3465:6: (enumLiteral_40= 'CustomType34' )
                    {
                    // InternalMappingDSL.g:3465:6: (enumLiteral_40= 'CustomType34' )
                    // InternalMappingDSL.g:3465:8: enumLiteral_40= 'CustomType34'
                    {
                    enumLiteral_40=(Token)match(input,137,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM34EnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_40, grammarAccess.getIOAdapterTypeAccess().getCUSTOM34EnumLiteralDeclaration_40()); 
                          
                    }

                    }


                    }
                    break;
                case 42 :
                    // InternalMappingDSL.g:3471:6: (enumLiteral_41= 'CustomType35' )
                    {
                    // InternalMappingDSL.g:3471:6: (enumLiteral_41= 'CustomType35' )
                    // InternalMappingDSL.g:3471:8: enumLiteral_41= 'CustomType35'
                    {
                    enumLiteral_41=(Token)match(input,138,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM35EnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_41, grammarAccess.getIOAdapterTypeAccess().getCUSTOM35EnumLiteralDeclaration_41()); 
                          
                    }

                    }


                    }
                    break;
                case 43 :
                    // InternalMappingDSL.g:3477:6: (enumLiteral_42= 'CustomType36' )
                    {
                    // InternalMappingDSL.g:3477:6: (enumLiteral_42= 'CustomType36' )
                    // InternalMappingDSL.g:3477:8: enumLiteral_42= 'CustomType36'
                    {
                    enumLiteral_42=(Token)match(input,139,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM36EnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_42, grammarAccess.getIOAdapterTypeAccess().getCUSTOM36EnumLiteralDeclaration_42()); 
                          
                    }

                    }


                    }
                    break;
                case 44 :
                    // InternalMappingDSL.g:3483:6: (enumLiteral_43= 'CustomType37' )
                    {
                    // InternalMappingDSL.g:3483:6: (enumLiteral_43= 'CustomType37' )
                    // InternalMappingDSL.g:3483:8: enumLiteral_43= 'CustomType37'
                    {
                    enumLiteral_43=(Token)match(input,140,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM37EnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_43, grammarAccess.getIOAdapterTypeAccess().getCUSTOM37EnumLiteralDeclaration_43()); 
                          
                    }

                    }


                    }
                    break;
                case 45 :
                    // InternalMappingDSL.g:3489:6: (enumLiteral_44= 'CustomType38' )
                    {
                    // InternalMappingDSL.g:3489:6: (enumLiteral_44= 'CustomType38' )
                    // InternalMappingDSL.g:3489:8: enumLiteral_44= 'CustomType38'
                    {
                    enumLiteral_44=(Token)match(input,141,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIOAdapterTypeAccess().getCUSTOM38EnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_44, grammarAccess.getIOAdapterTypeAccess().getCUSTOM38EnumLiteralDeclaration_44()); 
                          
                    }

                    }


                    }
                    break;
                case 46 :
                    // InternalMappingDSL.g:3495:6: (enumLiteral_45= 'CustomType39' )
                    {
                    // InternalMappingDSL.g:3495:6: (enumLiteral_45= 'CustomType39' )
                    // InternalMappingDSL.g:3495:8: enumLiteral_45= 'CustomType39'
                    {
                    enumLiteral_45=(Token)match(input,142,FOLLOW_2); if (state.failed) return current;
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
        // InternalMappingDSL.g:2604:3: ( ruleDissimilarityDisjunction )
        // InternalMappingDSL.g:2604:5: ruleDissimilarityDisjunction
        {
        pushFollow(FOLLOW_2);
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
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\5\1\54\1\uffff\1\5\1\54\1\uffff";
    static final String dfa_3s = "\1\20\1\105\1\uffff\1\5\1\107\1\uffff";
    static final String dfa_4s = "\2\uffff\1\2\2\uffff\1\1";
    static final String dfa_5s = "\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\12\uffff\1\2",
            "\1\3\24\uffff\1\2\1\uffff\1\2\1\uffff\1\2",
            "",
            "\1\4",
            "\1\3\24\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\5",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 227:1: ( (lv_dissimilarityRelations_19_0= ruleDissimilarityRelation ) )*";
        }
    }
    static final String dfa_7s = "\1\5\1\54\1\uffff\1\5\1\uffff\1\54";
    static final String dfa_8s = "\1\20\1\105\1\uffff\1\5\1\uffff\1\105";
    static final String dfa_9s = "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String[] dfa_10s = {
            "\1\1\12\uffff\1\2",
            "\1\3\24\uffff\1\4\1\uffff\1\2\1\uffff\1\2",
            "",
            "\1\5",
            "",
            "\1\3\24\uffff\1\4\1\uffff\1\2\1\uffff\1\2"
    };
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_5;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "()* loopback of 245:3: ( (lv_dislocalityRelations_20_0= ruleDislocalityRelation ) )*";
        }
    }
    static final String[] dfa_11s = {
            "\1\1\12\uffff\1\2",
            "\1\3\26\uffff\1\4\1\uffff\1\2",
            "",
            "\1\5",
            "",
            "\1\3\26\uffff\1\4\1\uffff\1\2"
    };
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_5;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "()* loopback of 263:3: ( (lv_proximityRelations_21_0= ruleProximityRelation ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000C100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000002000C110000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000600000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000200000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000005E00000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000005C00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000005800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000006010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000C300000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000E110000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000003F0E00000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F80000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000023F2E10000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002002010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000410200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000412210000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001802010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001002010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0xFFFFFFFE00000000L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x00000001FE080000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000100000010000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x2645800002010000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x2645000002010000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x2641000002010000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x2640000002010000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2600000002010000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2400000002010000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x000000060C100000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E200L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000070E00000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000200000L,0x0000000000040000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});

}