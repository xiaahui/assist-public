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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Global'", "'{'", "'Name'", "'='", "';'", "'Compatible Interface Types'", "'}'", "'Interfaces'", "'InterfaceGroups'", "'Restrictions'", "'Protection Level Restrictions'", "'RDC.Location'", "'And'", "'Equipment.EmhZone1'", "'->'", "','", "'Cable Weights'", "'default'", "'Compartment'", "'Manufacturer'", "'PowerSupply'", "'Side'", "'Zone'", "'RDC'", "'Type'", "'ESS'", "'Location'", "'ResourceX'", "'ResourceY'", "'ResourceZ'", "'Connector'", "'with protection level'", "'Group'", "'without'", "'interfaces with'", "'and'", "'combines'", "'Interface'", "'System'", "'SubAta'", "'Resource'", "'LineName'", "'WiringLane'", "'GrpInfo'", "'Route'", "'PwSup1'", "'EmhZone1'", "'dislocal up to'", "'on same'", "'Valid for'", "'is'", "'are'", "'Invalid for'", "'connectors with'", "'.'", "'-'", "'None'", "'L1'", "'L2'", "'L3'", "'L4'", "'L5'", "'L6'", "'L7'", "'L8'", "'Compartment.Name'", "'Compartment.Manufacturer'", "'Compartment.PowerSupply'", "'Compartment.Side'", "'Compartment.Zone'", "'RDC.Name'", "'RDC.Manufacturer'", "'RDC.PowerSupply'", "'RDC.Side'", "'RDC.Type'", "'RDC.ESS'", "'RDC.ResourceX'", "'RDC.ResourceY'", "'RDC.ResourceZ'", "'Connector.Name'"
    };
    public static final int T__50=50;
    public static final int T__90=90;
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:77:1: ruleAssistModel returns [EObject current=null] : (otherlv_0= 'Global' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) ) ) ) )* ) ) ) otherlv_13= '}' ( (lv_compartments_14_0= ruleCompartment ) )+ (otherlv_15= 'Interfaces' otherlv_16= '{' ( (lv_eqInterfaces_17_0= ruleEqInterface ) )+ otherlv_18= '}' )? (otherlv_19= 'InterfaceGroups' otherlv_20= '{' ( ( (lv_eqInterfaceGroups_21_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_22_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_23= '}' )? (otherlv_24= 'Restrictions' otherlv_25= '{' ( ( (lv_dislocalityRelations_26_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_27_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_28_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_29_0= ruleInvalidDeployment ) ) )* otherlv_30= '}' )? ) ;
    public final EObject ruleAssistModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_systemName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_30=null;
        EObject lv_compatibleIoTypes_9_0 = null;

        EObject lv_cableWeightData_11_0 = null;

        EObject lv_protectionLevelData_12_0 = null;

        EObject lv_compartments_14_0 = null;

        EObject lv_eqInterfaces_17_0 = null;

        EObject lv_eqInterfaceGroups_21_0 = null;

        EObject lv_eqInterfaceGroups_22_0 = null;

        EObject lv_dislocalityRelations_26_0 = null;

        EObject lv_colocalityRelations_27_0 = null;

        EObject lv_validDeployments_28_0 = null;

        EObject lv_invalidDeployments_29_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:80:28: ( (otherlv_0= 'Global' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) ) ) ) )* ) ) ) otherlv_13= '}' ( (lv_compartments_14_0= ruleCompartment ) )+ (otherlv_15= 'Interfaces' otherlv_16= '{' ( (lv_eqInterfaces_17_0= ruleEqInterface ) )+ otherlv_18= '}' )? (otherlv_19= 'InterfaceGroups' otherlv_20= '{' ( ( (lv_eqInterfaceGroups_21_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_22_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_23= '}' )? (otherlv_24= 'Restrictions' otherlv_25= '{' ( ( (lv_dislocalityRelations_26_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_27_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_28_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_29_0= ruleInvalidDeployment ) ) )* otherlv_30= '}' )? ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) ) ) ) )* ) ) ) otherlv_13= '}' ( (lv_compartments_14_0= ruleCompartment ) )+ (otherlv_15= 'Interfaces' otherlv_16= '{' ( (lv_eqInterfaces_17_0= ruleEqInterface ) )+ otherlv_18= '}' )? (otherlv_19= 'InterfaceGroups' otherlv_20= '{' ( ( (lv_eqInterfaceGroups_21_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_22_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_23= '}' )? (otherlv_24= 'Restrictions' otherlv_25= '{' ( ( (lv_dislocalityRelations_26_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_27_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_28_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_29_0= ruleInvalidDeployment ) ) )* otherlv_30= '}' )? )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) ) ) ) )* ) ) ) otherlv_13= '}' ( (lv_compartments_14_0= ruleCompartment ) )+ (otherlv_15= 'Interfaces' otherlv_16= '{' ( (lv_eqInterfaces_17_0= ruleEqInterface ) )+ otherlv_18= '}' )? (otherlv_19= 'InterfaceGroups' otherlv_20= '{' ( ( (lv_eqInterfaceGroups_21_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_22_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_23= '}' )? (otherlv_24= 'Restrictions' otherlv_25= '{' ( ( (lv_dislocalityRelations_26_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_27_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_28_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_29_0= ruleInvalidDeployment ) ) )* otherlv_30= '}' )? )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:3: otherlv_0= 'Global' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) ) ) ) )* ) ) ) otherlv_13= '}' ( (lv_compartments_14_0= ruleCompartment ) )+ (otherlv_15= 'Interfaces' otherlv_16= '{' ( (lv_eqInterfaces_17_0= ruleEqInterface ) )+ otherlv_18= '}' )? (otherlv_19= 'InterfaceGroups' otherlv_20= '{' ( ( (lv_eqInterfaceGroups_21_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_22_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_23= '}' )? (otherlv_24= 'Restrictions' otherlv_25= '{' ( ( (lv_dislocalityRelations_26_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_27_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_28_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_29_0= ruleInvalidDeployment ) ) )* otherlv_30= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAssistModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getAssistModelAccess().getGlobalKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel134); 

                	newLeafNode(otherlv_1, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:89:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) ) ) ) )* ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:91:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) ) ) ) )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:91:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) ) ) ) )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:92:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getAssistModelAccess().getUnorderedGroup_2());
            	
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:95:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) ) ) ) )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:96:3: ( ({...}? => ( ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) ) ) ) )*
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:96:3: ( ({...}? => ( ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) ) ) ) )*
            loop2:
            do {
                int alt2=5;
                int LA2_0 = input.LA(1);

                if ( LA2_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup_2(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup_2(), 1) ) {
                    alt2=2;
                }
                else if ( LA2_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup_2(), 2) ) {
                    alt2=3;
                }
                else if ( LA2_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup_2(), 3) ) {
                    alt2=4;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:98:4: ({...}? => ( ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:98:4: ({...}? => ( ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:99:5: {...}? => ( ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:99:108: ( ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:100:6: ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssistModelAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:103:6: ({...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:103:7: {...}? => (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:103:16: (otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:103:18: otherlv_3= 'Name' otherlv_4= '=' ( (lv_systemName_5_0= RULE_STRING ) ) otherlv_6= ';'
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleAssistModel192); 

            	        	newLeafNode(otherlv_3, grammarAccess.getAssistModelAccess().getNameKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleAssistModel204); 

            	        	newLeafNode(otherlv_4, grammarAccess.getAssistModelAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:111:1: ( (lv_systemName_5_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:112:1: (lv_systemName_5_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:112:1: (lv_systemName_5_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:113:3: lv_systemName_5_0= RULE_STRING
            	    {
            	    lv_systemName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssistModel221); 

            	    			newLeafNode(lv_systemName_5_0, grammarAccess.getAssistModelAccess().getSystemNameSTRINGTerminalRuleCall_2_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAssistModelRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"systemName",
            	            		lv_systemName_5_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleAssistModel238); 

            	        	newLeafNode(otherlv_6, grammarAccess.getAssistModelAccess().getSemicolonKeyword_2_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssistModelAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:140:4: ({...}? => ( ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:140:4: ({...}? => ( ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:141:5: {...}? => ( ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:141:108: ( ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:142:6: ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssistModelAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:145:6: ({...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:145:7: {...}? => (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:145:16: (otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:145:18: otherlv_7= 'Compatible Interface Types' otherlv_8= '{' ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )* otherlv_10= '}'
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleAssistModel306); 

            	        	newLeafNode(otherlv_7, grammarAccess.getAssistModelAccess().getCompatibleInterfaceTypesKeyword_2_1_0());
            	        
            	    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel318); 

            	        	newLeafNode(otherlv_8, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_1_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:153:1: ( (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==RULE_STRING) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:154:1: (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry )
            	    	    {
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:154:1: (lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:155:3: lv_compatibleIoTypes_9_0= ruleCompatibleIoTypeEntry
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getCompatibleIoTypesCompatibleIoTypeEntryParserRuleCall_2_1_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleCompatibleIoTypeEntry_in_ruleAssistModel339);
            	    	    lv_compatibleIoTypes_9_0=ruleCompatibleIoTypeEntry();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"compatibleIoTypes",
            	    	            		lv_compatibleIoTypes_9_0, 
            	    	            		"CompatibleIoTypeEntry");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleAssistModel352); 

            	        	newLeafNode(otherlv_10, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssistModelAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:182:4: ({...}? => ( ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:182:4: ({...}? => ( ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:183:5: {...}? => ( ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:183:108: ( ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:184:6: ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssistModelAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:187:6: ({...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:187:7: {...}? => ( (lv_cableWeightData_11_0= ruleCableWeightData ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:187:16: ( (lv_cableWeightData_11_0= ruleCableWeightData ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:188:1: (lv_cableWeightData_11_0= ruleCableWeightData )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:188:1: (lv_cableWeightData_11_0= ruleCableWeightData )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:189:3: lv_cableWeightData_11_0= ruleCableWeightData
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getCableWeightDataCableWeightDataParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCableWeightData_in_ruleAssistModel428);
            	    lv_cableWeightData_11_0=ruleCableWeightData();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"cableWeightData",
            	            		lv_cableWeightData_11_0, 
            	            		"CableWeightData");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssistModelAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:212:4: ({...}? => ( ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:212:4: ({...}? => ( ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:213:5: {...}? => ( ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:213:108: ( ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:214:6: ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssistModelAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:217:6: ({...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:217:7: {...}? => ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:217:16: ( (lv_protectionLevelData_12_0= ruleProtectionLevelData ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:218:1: (lv_protectionLevelData_12_0= ruleProtectionLevelData )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:218:1: (lv_protectionLevelData_12_0= ruleProtectionLevelData )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:219:3: lv_protectionLevelData_12_0= ruleProtectionLevelData
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getProtectionLevelDataProtectionLevelDataParserRuleCall_2_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProtectionLevelData_in_ruleAssistModel503);
            	    lv_protectionLevelData_12_0=ruleProtectionLevelData();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"protectionLevelData",
            	            		lv_protectionLevelData_12_0, 
            	            		"ProtectionLevelData");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssistModelAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getAssistModelAccess().getUnorderedGroup_2());
            	

            }

            otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleAssistModel555); 

                	newLeafNode(otherlv_13, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_3());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:253:1: ( (lv_compartments_14_0= ruleCompartment ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:254:1: (lv_compartments_14_0= ruleCompartment )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:254:1: (lv_compartments_14_0= ruleCompartment )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:255:3: lv_compartments_14_0= ruleCompartment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getCompartmentsCompartmentParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompartment_in_ruleAssistModel576);
            	    lv_compartments_14_0=ruleCompartment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"compartments",
            	            		lv_compartments_14_0, 
            	            		"Compartment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:271:3: (otherlv_15= 'Interfaces' otherlv_16= '{' ( (lv_eqInterfaces_17_0= ruleEqInterface ) )+ otherlv_18= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:271:5: otherlv_15= 'Interfaces' otherlv_16= '{' ( (lv_eqInterfaces_17_0= ruleEqInterface ) )+ otherlv_18= '}'
                    {
                    otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleAssistModel590); 

                        	newLeafNode(otherlv_15, grammarAccess.getAssistModelAccess().getInterfacesKeyword_5_0());
                        
                    otherlv_16=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel602); 

                        	newLeafNode(otherlv_16, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:279:1: ( (lv_eqInterfaces_17_0= ruleEqInterface ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==48) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:280:1: (lv_eqInterfaces_17_0= ruleEqInterface )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:280:1: (lv_eqInterfaces_17_0= ruleEqInterface )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:281:3: lv_eqInterfaces_17_0= ruleEqInterface
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getEqInterfacesEqInterfaceParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEqInterface_in_ruleAssistModel623);
                    	    lv_eqInterfaces_17_0=ruleEqInterface();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eqInterfaces",
                    	            		lv_eqInterfaces_17_0, 
                    	            		"EqInterface");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    otherlv_18=(Token)match(input,17,FOLLOW_17_in_ruleAssistModel636); 

                        	newLeafNode(otherlv_18, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:301:3: (otherlv_19= 'InterfaceGroups' otherlv_20= '{' ( ( (lv_eqInterfaceGroups_21_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_22_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_23= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:301:5: otherlv_19= 'InterfaceGroups' otherlv_20= '{' ( ( (lv_eqInterfaceGroups_21_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_22_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_23= '}'
                    {
                    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleAssistModel651); 

                        	newLeafNode(otherlv_19, grammarAccess.getAssistModelAccess().getInterfaceGroupsKeyword_6_0());
                        
                    otherlv_20=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel663); 

                        	newLeafNode(otherlv_20, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:309:1: ( ( (lv_eqInterfaceGroups_21_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_22_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==43) ) {
                            int LA6_2 = input.LA(2);

                            if ( (LA6_2==RULE_ID) ) {
                                int LA6_3 = input.LA(3);

                                if ( (LA6_3==12) ) {
                                    alt6=1;
                                }
                                else if ( (LA6_3==47) ) {
                                    alt6=2;
                                }


                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:309:2: ( (lv_eqInterfaceGroups_21_0= ruleEqInterfaceGroup ) )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:309:2: ( (lv_eqInterfaceGroups_21_0= ruleEqInterfaceGroup ) )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:310:1: (lv_eqInterfaceGroups_21_0= ruleEqInterfaceGroup )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:310:1: (lv_eqInterfaceGroups_21_0= ruleEqInterfaceGroup )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:311:3: lv_eqInterfaceGroups_21_0= ruleEqInterfaceGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsEqInterfaceGroupParserRuleCall_6_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEqInterfaceGroup_in_ruleAssistModel685);
                    	    lv_eqInterfaceGroups_21_0=ruleEqInterfaceGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eqInterfaceGroups",
                    	            		lv_eqInterfaceGroups_21_0, 
                    	            		"EqInterfaceGroup");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:328:6: ( (lv_eqInterfaceGroups_22_0= ruleEqInterfaceGroupWithCombinedDefinition ) )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:328:6: ( (lv_eqInterfaceGroups_22_0= ruleEqInterfaceGroupWithCombinedDefinition ) )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:329:1: (lv_eqInterfaceGroups_22_0= ruleEqInterfaceGroupWithCombinedDefinition )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:329:1: (lv_eqInterfaceGroups_22_0= ruleEqInterfaceGroupWithCombinedDefinition )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:330:3: lv_eqInterfaceGroups_22_0= ruleEqInterfaceGroupWithCombinedDefinition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsEqInterfaceGroupWithCombinedDefinitionParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEqInterfaceGroupWithCombinedDefinition_in_ruleAssistModel712);
                    	    lv_eqInterfaceGroups_22_0=ruleEqInterfaceGroupWithCombinedDefinition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eqInterfaceGroups",
                    	            		lv_eqInterfaceGroups_22_0, 
                    	            		"EqInterfaceGroupWithCombinedDefinition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,17,FOLLOW_17_in_ruleAssistModel726); 

                        	newLeafNode(otherlv_23, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:350:3: (otherlv_24= 'Restrictions' otherlv_25= '{' ( ( (lv_dislocalityRelations_26_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_27_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_28_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_29_0= ruleInvalidDeployment ) ) )* otherlv_30= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:350:5: otherlv_24= 'Restrictions' otherlv_25= '{' ( ( (lv_dislocalityRelations_26_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_27_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_28_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_29_0= ruleInvalidDeployment ) ) )* otherlv_30= '}'
                    {
                    otherlv_24=(Token)match(input,20,FOLLOW_20_in_ruleAssistModel741); 

                        	newLeafNode(otherlv_24, grammarAccess.getAssistModelAccess().getRestrictionsKeyword_7_0());
                        
                    otherlv_25=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel753); 

                        	newLeafNode(otherlv_25, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:358:1: ( ( (lv_dislocalityRelations_26_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_27_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_28_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_29_0= ruleInvalidDeployment ) ) )*
                    loop8:
                    do {
                        int alt8=5;
                        alt8 = dfa8.predict(input);
                        switch (alt8) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:358:2: ( (lv_dislocalityRelations_26_0= ruleDislocalityRelation ) )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:358:2: ( (lv_dislocalityRelations_26_0= ruleDislocalityRelation ) )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:359:1: (lv_dislocalityRelations_26_0= ruleDislocalityRelation )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:359:1: (lv_dislocalityRelations_26_0= ruleDislocalityRelation )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:360:3: lv_dislocalityRelations_26_0= ruleDislocalityRelation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getDislocalityRelationsDislocalityRelationParserRuleCall_7_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDislocalityRelation_in_ruleAssistModel775);
                    	    lv_dislocalityRelations_26_0=ruleDislocalityRelation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"dislocalityRelations",
                    	            		lv_dislocalityRelations_26_0, 
                    	            		"DislocalityRelation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:377:6: ( (lv_colocalityRelations_27_0= ruleColocalityRelation ) )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:377:6: ( (lv_colocalityRelations_27_0= ruleColocalityRelation ) )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:378:1: (lv_colocalityRelations_27_0= ruleColocalityRelation )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:378:1: (lv_colocalityRelations_27_0= ruleColocalityRelation )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:379:3: lv_colocalityRelations_27_0= ruleColocalityRelation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getColocalityRelationsColocalityRelationParserRuleCall_7_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleColocalityRelation_in_ruleAssistModel802);
                    	    lv_colocalityRelations_27_0=ruleColocalityRelation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"colocalityRelations",
                    	            		lv_colocalityRelations_27_0, 
                    	            		"ColocalityRelation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:396:6: ( (lv_validDeployments_28_0= ruleValidDeployment ) )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:396:6: ( (lv_validDeployments_28_0= ruleValidDeployment ) )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:397:1: (lv_validDeployments_28_0= ruleValidDeployment )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:397:1: (lv_validDeployments_28_0= ruleValidDeployment )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:398:3: lv_validDeployments_28_0= ruleValidDeployment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getValidDeploymentsValidDeploymentParserRuleCall_7_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValidDeployment_in_ruleAssistModel829);
                    	    lv_validDeployments_28_0=ruleValidDeployment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"validDeployments",
                    	            		lv_validDeployments_28_0, 
                    	            		"ValidDeployment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:415:6: ( (lv_invalidDeployments_29_0= ruleInvalidDeployment ) )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:415:6: ( (lv_invalidDeployments_29_0= ruleInvalidDeployment ) )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:416:1: (lv_invalidDeployments_29_0= ruleInvalidDeployment )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:416:1: (lv_invalidDeployments_29_0= ruleInvalidDeployment )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:417:3: lv_invalidDeployments_29_0= ruleInvalidDeployment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getInvalidDeploymentsInvalidDeploymentParserRuleCall_7_2_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInvalidDeployment_in_ruleAssistModel856);
                    	    lv_invalidDeployments_29_0=ruleInvalidDeployment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"invalidDeployments",
                    	            		lv_invalidDeployments_29_0, 
                    	            		"InvalidDeployment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,17,FOLLOW_17_in_ruleAssistModel870); 

                        	newLeafNode(otherlv_30, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_7_3());
                        

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


    // $ANTLR start "entryRuleProtectionLevelData"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:445:1: entryRuleProtectionLevelData returns [EObject current=null] : iv_ruleProtectionLevelData= ruleProtectionLevelData EOF ;
    public final EObject entryRuleProtectionLevelData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtectionLevelData = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:446:2: (iv_ruleProtectionLevelData= ruleProtectionLevelData EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:447:2: iv_ruleProtectionLevelData= ruleProtectionLevelData EOF
            {
             newCompositeNode(grammarAccess.getProtectionLevelDataRule()); 
            pushFollow(FOLLOW_ruleProtectionLevelData_in_entryRuleProtectionLevelData908);
            iv_ruleProtectionLevelData=ruleProtectionLevelData();

            state._fsp--;

             current =iv_ruleProtectionLevelData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtectionLevelData918); 

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
    // $ANTLR end "entryRuleProtectionLevelData"


    // $ANTLR start "ruleProtectionLevelData"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:454:1: ruleProtectionLevelData returns [EObject current=null] : (otherlv_0= 'Protection Level Restrictions' otherlv_1= '{' ( (lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry ) )+ otherlv_3= '}' ) ;
    public final EObject ruleProtectionLevelData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_protectionLevelEntries_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:457:28: ( (otherlv_0= 'Protection Level Restrictions' otherlv_1= '{' ( (lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry ) )+ otherlv_3= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:458:1: (otherlv_0= 'Protection Level Restrictions' otherlv_1= '{' ( (lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry ) )+ otherlv_3= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:458:1: (otherlv_0= 'Protection Level Restrictions' otherlv_1= '{' ( (lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry ) )+ otherlv_3= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:458:3: otherlv_0= 'Protection Level Restrictions' otherlv_1= '{' ( (lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleProtectionLevelData955); 

                	newLeafNode(otherlv_0, grammarAccess.getProtectionLevelDataAccess().getProtectionLevelRestrictionsKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleProtectionLevelData967); 

                	newLeafNode(otherlv_1, grammarAccess.getProtectionLevelDataAccess().getLeftCurlyBracketKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:466:1: ( (lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:467:1: (lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:467:1: (lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:468:3: lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProtectionLevelDataAccess().getProtectionLevelEntriesProtectionLevelEntryParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProtectionLevelEntry_in_ruleProtectionLevelData988);
            	    lv_protectionLevelEntries_2_0=ruleProtectionLevelEntry();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProtectionLevelDataRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"protectionLevelEntries",
            	            		lv_protectionLevelEntries_2_0, 
            	            		"ProtectionLevelEntry");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleProtectionLevelData1001); 

                	newLeafNode(otherlv_3, grammarAccess.getProtectionLevelDataAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleProtectionLevelData"


    // $ANTLR start "entryRuleProtectionLevelEntry"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:496:1: entryRuleProtectionLevelEntry returns [EObject current=null] : iv_ruleProtectionLevelEntry= ruleProtectionLevelEntry EOF ;
    public final EObject entryRuleProtectionLevelEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtectionLevelEntry = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:497:2: (iv_ruleProtectionLevelEntry= ruleProtectionLevelEntry EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:498:2: iv_ruleProtectionLevelEntry= ruleProtectionLevelEntry EOF
            {
             newCompositeNode(grammarAccess.getProtectionLevelEntryRule()); 
            pushFollow(FOLLOW_ruleProtectionLevelEntry_in_entryRuleProtectionLevelEntry1037);
            iv_ruleProtectionLevelEntry=ruleProtectionLevelEntry();

            state._fsp--;

             current =iv_ruleProtectionLevelEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtectionLevelEntry1047); 

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
    // $ANTLR end "entryRuleProtectionLevelEntry"


    // $ANTLR start "ruleProtectionLevelEntry"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:505:1: ruleProtectionLevelEntry returns [EObject current=null] : (otherlv_0= 'RDC.Location' otherlv_1= '=' ( (lv_rdcLocation_2_0= RULE_STRING ) ) otherlv_3= 'And' otherlv_4= 'Equipment.EmhZone1' otherlv_5= '=' ( (lv_emhZone1_6_0= RULE_STRING ) ) otherlv_7= '->' ( (lv_protectionLevel_8_0= ruleProtectionLevelType ) ) (otherlv_9= ',' ( (lv_protectionLevel_10_0= ruleProtectionLevelType ) ) )* otherlv_11= ';' ) ;
    public final EObject ruleProtectionLevelEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_rdcLocation_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_emhZone1_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_protectionLevel_8_0 = null;

        Enumerator lv_protectionLevel_10_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:508:28: ( (otherlv_0= 'RDC.Location' otherlv_1= '=' ( (lv_rdcLocation_2_0= RULE_STRING ) ) otherlv_3= 'And' otherlv_4= 'Equipment.EmhZone1' otherlv_5= '=' ( (lv_emhZone1_6_0= RULE_STRING ) ) otherlv_7= '->' ( (lv_protectionLevel_8_0= ruleProtectionLevelType ) ) (otherlv_9= ',' ( (lv_protectionLevel_10_0= ruleProtectionLevelType ) ) )* otherlv_11= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:509:1: (otherlv_0= 'RDC.Location' otherlv_1= '=' ( (lv_rdcLocation_2_0= RULE_STRING ) ) otherlv_3= 'And' otherlv_4= 'Equipment.EmhZone1' otherlv_5= '=' ( (lv_emhZone1_6_0= RULE_STRING ) ) otherlv_7= '->' ( (lv_protectionLevel_8_0= ruleProtectionLevelType ) ) (otherlv_9= ',' ( (lv_protectionLevel_10_0= ruleProtectionLevelType ) ) )* otherlv_11= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:509:1: (otherlv_0= 'RDC.Location' otherlv_1= '=' ( (lv_rdcLocation_2_0= RULE_STRING ) ) otherlv_3= 'And' otherlv_4= 'Equipment.EmhZone1' otherlv_5= '=' ( (lv_emhZone1_6_0= RULE_STRING ) ) otherlv_7= '->' ( (lv_protectionLevel_8_0= ruleProtectionLevelType ) ) (otherlv_9= ',' ( (lv_protectionLevel_10_0= ruleProtectionLevelType ) ) )* otherlv_11= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:509:3: otherlv_0= 'RDC.Location' otherlv_1= '=' ( (lv_rdcLocation_2_0= RULE_STRING ) ) otherlv_3= 'And' otherlv_4= 'Equipment.EmhZone1' otherlv_5= '=' ( (lv_emhZone1_6_0= RULE_STRING ) ) otherlv_7= '->' ( (lv_protectionLevel_8_0= ruleProtectionLevelType ) ) (otherlv_9= ',' ( (lv_protectionLevel_10_0= ruleProtectionLevelType ) ) )* otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleProtectionLevelEntry1084); 

                	newLeafNode(otherlv_0, grammarAccess.getProtectionLevelEntryAccess().getRDCLocationKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleProtectionLevelEntry1096); 

                	newLeafNode(otherlv_1, grammarAccess.getProtectionLevelEntryAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:517:1: ( (lv_rdcLocation_2_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:518:1: (lv_rdcLocation_2_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:518:1: (lv_rdcLocation_2_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:519:3: lv_rdcLocation_2_0= RULE_STRING
            {
            lv_rdcLocation_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProtectionLevelEntry1113); 

            			newLeafNode(lv_rdcLocation_2_0, grammarAccess.getProtectionLevelEntryAccess().getRdcLocationSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProtectionLevelEntryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"rdcLocation",
                    		lv_rdcLocation_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleProtectionLevelEntry1130); 

                	newLeafNode(otherlv_3, grammarAccess.getProtectionLevelEntryAccess().getAndKeyword_3());
                
            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleProtectionLevelEntry1142); 

                	newLeafNode(otherlv_4, grammarAccess.getProtectionLevelEntryAccess().getEquipmentEmhZone1Keyword_4());
                
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleProtectionLevelEntry1154); 

                	newLeafNode(otherlv_5, grammarAccess.getProtectionLevelEntryAccess().getEqualsSignKeyword_5());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:547:1: ( (lv_emhZone1_6_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:548:1: (lv_emhZone1_6_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:548:1: (lv_emhZone1_6_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:549:3: lv_emhZone1_6_0= RULE_STRING
            {
            lv_emhZone1_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProtectionLevelEntry1171); 

            			newLeafNode(lv_emhZone1_6_0, grammarAccess.getProtectionLevelEntryAccess().getEmhZone1STRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProtectionLevelEntryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"emhZone1",
                    		lv_emhZone1_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleProtectionLevelEntry1188); 

                	newLeafNode(otherlv_7, grammarAccess.getProtectionLevelEntryAccess().getHyphenMinusGreaterThanSignKeyword_7());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:569:1: ( (lv_protectionLevel_8_0= ruleProtectionLevelType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:570:1: (lv_protectionLevel_8_0= ruleProtectionLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:570:1: (lv_protectionLevel_8_0= ruleProtectionLevelType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:571:3: lv_protectionLevel_8_0= ruleProtectionLevelType
            {
             
            	        newCompositeNode(grammarAccess.getProtectionLevelEntryAccess().getProtectionLevelProtectionLevelTypeEnumRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleProtectionLevelType_in_ruleProtectionLevelEntry1209);
            lv_protectionLevel_8_0=ruleProtectionLevelType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProtectionLevelEntryRule());
            	        }
                   		add(
                   			current, 
                   			"protectionLevel",
                    		lv_protectionLevel_8_0, 
                    		"ProtectionLevelType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:587:2: (otherlv_9= ',' ( (lv_protectionLevel_10_0= ruleProtectionLevelType ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:587:4: otherlv_9= ',' ( (lv_protectionLevel_10_0= ruleProtectionLevelType ) )
            	    {
            	    otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleProtectionLevelEntry1222); 

            	        	newLeafNode(otherlv_9, grammarAccess.getProtectionLevelEntryAccess().getCommaKeyword_9_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:591:1: ( (lv_protectionLevel_10_0= ruleProtectionLevelType ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:592:1: (lv_protectionLevel_10_0= ruleProtectionLevelType )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:592:1: (lv_protectionLevel_10_0= ruleProtectionLevelType )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:593:3: lv_protectionLevel_10_0= ruleProtectionLevelType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProtectionLevelEntryAccess().getProtectionLevelProtectionLevelTypeEnumRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProtectionLevelType_in_ruleProtectionLevelEntry1243);
            	    lv_protectionLevel_10_0=ruleProtectionLevelType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProtectionLevelEntryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"protectionLevel",
            	            		lv_protectionLevel_10_0, 
            	            		"ProtectionLevelType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleProtectionLevelEntry1257); 

                	newLeafNode(otherlv_11, grammarAccess.getProtectionLevelEntryAccess().getSemicolonKeyword_10());
                

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
    // $ANTLR end "ruleProtectionLevelEntry"


    // $ANTLR start "entryRuleCompatibleIoTypeEntry"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:621:1: entryRuleCompatibleIoTypeEntry returns [EObject current=null] : iv_ruleCompatibleIoTypeEntry= ruleCompatibleIoTypeEntry EOF ;
    public final EObject entryRuleCompatibleIoTypeEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompatibleIoTypeEntry = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:622:2: (iv_ruleCompatibleIoTypeEntry= ruleCompatibleIoTypeEntry EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:623:2: iv_ruleCompatibleIoTypeEntry= ruleCompatibleIoTypeEntry EOF
            {
             newCompositeNode(grammarAccess.getCompatibleIoTypeEntryRule()); 
            pushFollow(FOLLOW_ruleCompatibleIoTypeEntry_in_entryRuleCompatibleIoTypeEntry1293);
            iv_ruleCompatibleIoTypeEntry=ruleCompatibleIoTypeEntry();

            state._fsp--;

             current =iv_ruleCompatibleIoTypeEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompatibleIoTypeEntry1303); 

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
    // $ANTLR end "entryRuleCompatibleIoTypeEntry"


    // $ANTLR start "ruleCompatibleIoTypeEntry"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:630:1: ruleCompatibleIoTypeEntry returns [EObject current=null] : ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) otherlv_1= '->' ( (lv_pinInterfaceIoTypes_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_pinInterfaceIoTypes_4_0= RULE_STRING ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleCompatibleIoTypeEntry() throws RecognitionException {
        EObject current = null;

        Token lv_eqInterfaceIoType_0_0=null;
        Token otherlv_1=null;
        Token lv_pinInterfaceIoTypes_2_0=null;
        Token otherlv_3=null;
        Token lv_pinInterfaceIoTypes_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:633:28: ( ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) otherlv_1= '->' ( (lv_pinInterfaceIoTypes_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_pinInterfaceIoTypes_4_0= RULE_STRING ) ) )* otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:634:1: ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) otherlv_1= '->' ( (lv_pinInterfaceIoTypes_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_pinInterfaceIoTypes_4_0= RULE_STRING ) ) )* otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:634:1: ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) otherlv_1= '->' ( (lv_pinInterfaceIoTypes_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_pinInterfaceIoTypes_4_0= RULE_STRING ) ) )* otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:634:2: ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) otherlv_1= '->' ( (lv_pinInterfaceIoTypes_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_pinInterfaceIoTypes_4_0= RULE_STRING ) ) )* otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:634:2: ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:635:1: (lv_eqInterfaceIoType_0_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:635:1: (lv_eqInterfaceIoType_0_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:636:3: lv_eqInterfaceIoType_0_0= RULE_STRING
            {
            lv_eqInterfaceIoType_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompatibleIoTypeEntry1345); 

            			newLeafNode(lv_eqInterfaceIoType_0_0, grammarAccess.getCompatibleIoTypeEntryAccess().getEqInterfaceIoTypeSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCompatibleIoTypeEntryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"eqInterfaceIoType",
                    		lv_eqInterfaceIoType_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleCompatibleIoTypeEntry1362); 

                	newLeafNode(otherlv_1, grammarAccess.getCompatibleIoTypeEntryAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:656:1: ( (lv_pinInterfaceIoTypes_2_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:657:1: (lv_pinInterfaceIoTypes_2_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:657:1: (lv_pinInterfaceIoTypes_2_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:658:3: lv_pinInterfaceIoTypes_2_0= RULE_STRING
            {
            lv_pinInterfaceIoTypes_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompatibleIoTypeEntry1379); 

            			newLeafNode(lv_pinInterfaceIoTypes_2_0, grammarAccess.getCompatibleIoTypeEntryAccess().getPinInterfaceIoTypesSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCompatibleIoTypeEntryRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"pinInterfaceIoTypes",
                    		lv_pinInterfaceIoTypes_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:674:2: (otherlv_3= ',' ( (lv_pinInterfaceIoTypes_4_0= RULE_STRING ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:674:4: otherlv_3= ',' ( (lv_pinInterfaceIoTypes_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleCompatibleIoTypeEntry1397); 

            	        	newLeafNode(otherlv_3, grammarAccess.getCompatibleIoTypeEntryAccess().getCommaKeyword_3_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:678:1: ( (lv_pinInterfaceIoTypes_4_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:679:1: (lv_pinInterfaceIoTypes_4_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:679:1: (lv_pinInterfaceIoTypes_4_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:680:3: lv_pinInterfaceIoTypes_4_0= RULE_STRING
            	    {
            	    lv_pinInterfaceIoTypes_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompatibleIoTypeEntry1414); 

            	    			newLeafNode(lv_pinInterfaceIoTypes_4_0, grammarAccess.getCompatibleIoTypeEntryAccess().getPinInterfaceIoTypesSTRINGTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCompatibleIoTypeEntryRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"pinInterfaceIoTypes",
            	            		lv_pinInterfaceIoTypes_4_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleCompatibleIoTypeEntry1433); 

                	newLeafNode(otherlv_5, grammarAccess.getCompatibleIoTypeEntryAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleCompatibleIoTypeEntry"


    // $ANTLR start "entryRuleCableWeightData"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:708:1: entryRuleCableWeightData returns [EObject current=null] : iv_ruleCableWeightData= ruleCableWeightData EOF ;
    public final EObject entryRuleCableWeightData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCableWeightData = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:709:2: (iv_ruleCableWeightData= ruleCableWeightData EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:710:2: iv_ruleCableWeightData= ruleCableWeightData EOF
            {
             newCompositeNode(grammarAccess.getCableWeightDataRule()); 
            pushFollow(FOLLOW_ruleCableWeightData_in_entryRuleCableWeightData1469);
            iv_ruleCableWeightData=ruleCableWeightData();

            state._fsp--;

             current =iv_ruleCableWeightData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCableWeightData1479); 

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
    // $ANTLR end "entryRuleCableWeightData"


    // $ANTLR start "ruleCableWeightData"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:717:1: ruleCableWeightData returns [EObject current=null] : (otherlv_0= 'Cable Weights' otherlv_1= '{' ( (lv_cableWeightEntries_2_0= ruleCableWeightEntry ) )+ otherlv_3= '}' ) ;
    public final EObject ruleCableWeightData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cableWeightEntries_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:720:28: ( (otherlv_0= 'Cable Weights' otherlv_1= '{' ( (lv_cableWeightEntries_2_0= ruleCableWeightEntry ) )+ otherlv_3= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:721:1: (otherlv_0= 'Cable Weights' otherlv_1= '{' ( (lv_cableWeightEntries_2_0= ruleCableWeightEntry ) )+ otherlv_3= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:721:1: (otherlv_0= 'Cable Weights' otherlv_1= '{' ( (lv_cableWeightEntries_2_0= ruleCableWeightEntry ) )+ otherlv_3= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:721:3: otherlv_0= 'Cable Weights' otherlv_1= '{' ( (lv_cableWeightEntries_2_0= ruleCableWeightEntry ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleCableWeightData1516); 

                	newLeafNode(otherlv_0, grammarAccess.getCableWeightDataAccess().getCableWeightsKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleCableWeightData1528); 

                	newLeafNode(otherlv_1, grammarAccess.getCableWeightDataAccess().getLeftCurlyBracketKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:729:1: ( (lv_cableWeightEntries_2_0= ruleCableWeightEntry ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING||LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:730:1: (lv_cableWeightEntries_2_0= ruleCableWeightEntry )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:730:1: (lv_cableWeightEntries_2_0= ruleCableWeightEntry )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:731:3: lv_cableWeightEntries_2_0= ruleCableWeightEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCableWeightDataAccess().getCableWeightEntriesCableWeightEntryParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCableWeightEntry_in_ruleCableWeightData1549);
            	    lv_cableWeightEntries_2_0=ruleCableWeightEntry();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCableWeightDataRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cableWeightEntries",
            	            		lv_cableWeightEntries_2_0, 
            	            		"CableWeightEntry");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleCableWeightData1562); 

                	newLeafNode(otherlv_3, grammarAccess.getCableWeightDataAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleCableWeightData"


    // $ANTLR start "entryRuleCableWeightEntry"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:759:1: entryRuleCableWeightEntry returns [EObject current=null] : iv_ruleCableWeightEntry= ruleCableWeightEntry EOF ;
    public final EObject entryRuleCableWeightEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCableWeightEntry = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:760:2: (iv_ruleCableWeightEntry= ruleCableWeightEntry EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:761:2: iv_ruleCableWeightEntry= ruleCableWeightEntry EOF
            {
             newCompositeNode(grammarAccess.getCableWeightEntryRule()); 
            pushFollow(FOLLOW_ruleCableWeightEntry_in_entryRuleCableWeightEntry1598);
            iv_ruleCableWeightEntry=ruleCableWeightEntry();

            state._fsp--;

             current =iv_ruleCableWeightEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCableWeightEntry1608); 

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
    // $ANTLR end "entryRuleCableWeightEntry"


    // $ANTLR start "ruleCableWeightEntry"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:768:1: ruleCableWeightEntry returns [EObject current=null] : ( ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) | ( (lv_defaultEntry_1_0= 'default' ) ) ) otherlv_2= '=' ( (lv_weight_3_0= RULE_INT ) ) otherlv_4= ';' ) ;
    public final EObject ruleCableWeightEntry() throws RecognitionException {
        EObject current = null;

        Token lv_eqInterfaceIoType_0_0=null;
        Token lv_defaultEntry_1_0=null;
        Token otherlv_2=null;
        Token lv_weight_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:771:28: ( ( ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) | ( (lv_defaultEntry_1_0= 'default' ) ) ) otherlv_2= '=' ( (lv_weight_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:772:1: ( ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) | ( (lv_defaultEntry_1_0= 'default' ) ) ) otherlv_2= '=' ( (lv_weight_3_0= RULE_INT ) ) otherlv_4= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:772:1: ( ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) | ( (lv_defaultEntry_1_0= 'default' ) ) ) otherlv_2= '=' ( (lv_weight_3_0= RULE_INT ) ) otherlv_4= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:772:2: ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) | ( (lv_defaultEntry_1_0= 'default' ) ) ) otherlv_2= '=' ( (lv_weight_3_0= RULE_INT ) ) otherlv_4= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:772:2: ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) | ( (lv_defaultEntry_1_0= 'default' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==28) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:772:3: ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:772:3: ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:773:1: (lv_eqInterfaceIoType_0_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:773:1: (lv_eqInterfaceIoType_0_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:774:3: lv_eqInterfaceIoType_0_0= RULE_STRING
                    {
                    lv_eqInterfaceIoType_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCableWeightEntry1651); 

                    			newLeafNode(lv_eqInterfaceIoType_0_0, grammarAccess.getCableWeightEntryAccess().getEqInterfaceIoTypeSTRINGTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCableWeightEntryRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"eqInterfaceIoType",
                            		lv_eqInterfaceIoType_0_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:791:6: ( (lv_defaultEntry_1_0= 'default' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:791:6: ( (lv_defaultEntry_1_0= 'default' ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:792:1: (lv_defaultEntry_1_0= 'default' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:792:1: (lv_defaultEntry_1_0= 'default' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:793:3: lv_defaultEntry_1_0= 'default'
                    {
                    lv_defaultEntry_1_0=(Token)match(input,28,FOLLOW_28_in_ruleCableWeightEntry1680); 

                            newLeafNode(lv_defaultEntry_1_0, grammarAccess.getCableWeightEntryAccess().getDefaultEntryDefaultKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCableWeightEntryRule());
                    	        }
                           		setWithLastConsumed(current, "defaultEntry", true, "default");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleCableWeightEntry1706); 

                	newLeafNode(otherlv_2, grammarAccess.getCableWeightEntryAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:810:1: ( (lv_weight_3_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:811:1: (lv_weight_3_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:811:1: (lv_weight_3_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:812:3: lv_weight_3_0= RULE_INT
            {
            lv_weight_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCableWeightEntry1723); 

            			newLeafNode(lv_weight_3_0, grammarAccess.getCableWeightEntryAccess().getWeightINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCableWeightEntryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"weight",
                    		lv_weight_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleCableWeightEntry1740); 

                	newLeafNode(otherlv_4, grammarAccess.getCableWeightEntryAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleCableWeightEntry"


    // $ANTLR start "entryRuleCompartment"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:840:1: entryRuleCompartment returns [EObject current=null] : iv_ruleCompartment= ruleCompartment EOF ;
    public final EObject entryRuleCompartment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompartment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:841:2: (iv_ruleCompartment= ruleCompartment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:842:2: iv_ruleCompartment= ruleCompartment EOF
            {
             newCompositeNode(grammarAccess.getCompartmentRule()); 
            pushFollow(FOLLOW_ruleCompartment_in_entryRuleCompartment1776);
            iv_ruleCompartment=ruleCompartment();

            state._fsp--;

             current =iv_ruleCompartment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartment1786); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:849:1: ruleCompartment returns [EObject current=null] : (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:852:28: ( (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:853:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:853:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:853:3: otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleCompartment1823); 

                	newLeafNode(otherlv_0, grammarAccess.getCompartmentAccess().getCompartmentKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:857:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:858:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:858:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:859:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompartment1840); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCompartment1857); 

                	newLeafNode(otherlv_2, grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:879:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:881:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:881:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:882:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:885:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?)
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:886:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:886:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=6;
                int LA16_0 = input.LA(1);

                if ( LA16_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1) ) {
                    alt16=2;
                }
                else if ( LA16_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2) ) {
                    alt16=3;
                }
                else if ( LA16_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3) ) {
                    alt16=4;
                }
                else if ( LA16_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4) ) {
                    alt16=5;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:888:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:888:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:889:5: {...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:889:108: ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:890:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:893:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:893:7: {...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:893:16: (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:893:18: otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleCompartment1915); 

            	        	newLeafNode(otherlv_4, grammarAccess.getCompartmentAccess().getManufacturerKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCompartment1927); 

            	        	newLeafNode(otherlv_5, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:901:1: ( (lv_manufacturer_6_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:902:1: (lv_manufacturer_6_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:902:1: (lv_manufacturer_6_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:903:3: lv_manufacturer_6_0= RULE_STRING
            	    {
            	    lv_manufacturer_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment1944); 

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

            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCompartment1961); 

            	        	newLeafNode(otherlv_7, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:930:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:930:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:931:5: {...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:931:108: ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:932:6: ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:935:6: ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:935:7: {...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:935:16: (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:935:18: otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleCompartment2029); 

            	        	newLeafNode(otherlv_8, grammarAccess.getCompartmentAccess().getPowerSupplyKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleCompartment2041); 

            	        	newLeafNode(otherlv_9, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:943:1: ( (lv_powerSupply_10_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:944:1: (lv_powerSupply_10_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:944:1: (lv_powerSupply_10_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:945:3: lv_powerSupply_10_0= RULE_STRING
            	    {
            	    lv_powerSupply_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment2058); 

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

            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleCompartment2075); 

            	        	newLeafNode(otherlv_11, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:972:4: ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:972:4: ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:973:5: {...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:973:108: ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:974:6: ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:977:6: ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:977:7: {...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:977:16: (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:977:18: otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,32,FOLLOW_32_in_ruleCompartment2143); 

            	        	newLeafNode(otherlv_12, grammarAccess.getCompartmentAccess().getSideKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleCompartment2155); 

            	        	newLeafNode(otherlv_13, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:985:1: ( (lv_side_14_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:986:1: (lv_side_14_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:986:1: (lv_side_14_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:987:3: lv_side_14_0= RULE_STRING
            	    {
            	    lv_side_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment2172); 

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

            	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleCompartment2189); 

            	        	newLeafNode(otherlv_15, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1014:4: ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1014:4: ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1015:5: {...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1015:108: ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1016:6: ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1019:6: ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1019:7: {...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1019:16: (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1019:18: otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,33,FOLLOW_33_in_ruleCompartment2257); 

            	        	newLeafNode(otherlv_16, grammarAccess.getCompartmentAccess().getZoneKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleCompartment2269); 

            	        	newLeafNode(otherlv_17, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1027:1: ( (lv_zone_18_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1028:1: (lv_zone_18_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1028:1: (lv_zone_18_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1029:3: lv_zone_18_0= RULE_STRING
            	    {
            	    lv_zone_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment2286); 

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

            	    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleCompartment2303); 

            	        	newLeafNode(otherlv_19, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1056:4: ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1056:4: ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1057:5: {...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1057:108: ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1058:6: ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1061:6: ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+
            	    int cnt15=0;
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==34) ) {
            	            int LA15_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt15=1;
            	            }


            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1061:7: {...}? => ( (lv_rdcs_20_0= ruleRDC ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    	    }
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1061:16: ( (lv_rdcs_20_0= ruleRDC ) )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1062:1: (lv_rdcs_20_0= ruleRDC )
            	    	    {
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1062:1: (lv_rdcs_20_0= ruleRDC )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1063:3: lv_rdcs_20_0= ruleRDC
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getCompartmentAccess().getRdcsRDCParserRuleCall_3_4_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleRDC_in_ruleCompartment2379);
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
            	    	    if ( cnt15 >= 1 ) break loop15;
            	                EarlyExitException eee =
            	                    new EarlyExitException(15, input);
            	                throw eee;
            	        }
            	        cnt15++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCompartmentAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canLeave(grammarAccess.getCompartmentAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	

            }

            otherlv_21=(Token)match(input,17,FOLLOW_17_in_ruleCompartment2438); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1106:1: entryRuleRDC returns [EObject current=null] : iv_ruleRDC= ruleRDC EOF ;
    public final EObject entryRuleRDC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDC = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1107:2: (iv_ruleRDC= ruleRDC EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1108:2: iv_ruleRDC= ruleRDC EOF
            {
             newCompositeNode(grammarAccess.getRDCRule()); 
            pushFollow(FOLLOW_ruleRDC_in_entryRuleRDC2474);
            iv_ruleRDC=ruleRDC();

            state._fsp--;

             current =iv_ruleRDC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDC2484); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1115:1: ruleRDC returns [EObject current=null] : (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) otherlv_37= '}' ) ;
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
        Token lv_location_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        AntlrDatatypeRuleToken lv_resourceX_26_0 = null;

        AntlrDatatypeRuleToken lv_resourceY_30_0 = null;

        AntlrDatatypeRuleToken lv_resourceZ_34_0 = null;

        EObject lv_connectors_36_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1118:28: ( (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) otherlv_37= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1119:1: (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) otherlv_37= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1119:1: (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) otherlv_37= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1119:3: otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) otherlv_37= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleRDC2521); 

                	newLeafNode(otherlv_0, grammarAccess.getRDCAccess().getRDCKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1124:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1124:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRDC2538); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRDC2555); 

                	newLeafNode(otherlv_2, grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1145:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1147:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+ ) ) )+ {...}?) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1147:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+ ) ) )+ {...}?) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1148:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1151:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+ ) ) )+ {...}?)
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1152:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+ ) ) )+ {...}?
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1152:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+ ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=10;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1154:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1154:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1155:5: {...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1155:100: ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1156:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1159:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1159:7: {...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1159:16: (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1159:18: otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleRDC2613); 

            	        	newLeafNode(otherlv_4, grammarAccess.getRDCAccess().getManufacturerKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleRDC2625); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1167:1: ( (lv_manufacturer_6_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1168:1: (lv_manufacturer_6_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1168:1: (lv_manufacturer_6_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1169:3: lv_manufacturer_6_0= RULE_STRING
            	    {
            	    lv_manufacturer_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC2642); 

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

            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleRDC2659); 

            	        	newLeafNode(otherlv_7, grammarAccess.getRDCAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1196:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1196:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1197:5: {...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1197:100: ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1198:6: ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1201:6: ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1201:7: {...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1201:16: (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1201:18: otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleRDC2727); 

            	        	newLeafNode(otherlv_8, grammarAccess.getRDCAccess().getPowerSupplyKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleRDC2739); 

            	        	newLeafNode(otherlv_9, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1209:1: ( (lv_powerSupply_10_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1210:1: (lv_powerSupply_10_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1210:1: (lv_powerSupply_10_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1211:3: lv_powerSupply_10_0= RULE_STRING
            	    {
            	    lv_powerSupply_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC2756); 

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

            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleRDC2773); 

            	        	newLeafNode(otherlv_11, grammarAccess.getRDCAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1238:4: ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1238:4: ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1239:5: {...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1239:100: ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1240:6: ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1243:6: ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1243:7: {...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1243:16: (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1243:18: otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,35,FOLLOW_35_in_ruleRDC2841); 

            	        	newLeafNode(otherlv_12, grammarAccess.getRDCAccess().getTypeKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleRDC2853); 

            	        	newLeafNode(otherlv_13, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1251:1: ( (lv_rdcType_14_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1252:1: (lv_rdcType_14_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1252:1: (lv_rdcType_14_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1253:3: lv_rdcType_14_0= RULE_STRING
            	    {
            	    lv_rdcType_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC2870); 

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

            	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleRDC2887); 

            	        	newLeafNode(otherlv_15, grammarAccess.getRDCAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1280:4: ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1280:4: ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1281:5: {...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1281:100: ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1282:6: ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1285:6: ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1285:7: {...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1285:16: (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1285:18: otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,36,FOLLOW_36_in_ruleRDC2955); 

            	        	newLeafNode(otherlv_16, grammarAccess.getRDCAccess().getESSKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleRDC2967); 

            	        	newLeafNode(otherlv_17, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1293:1: ( (lv_ess_18_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1294:1: (lv_ess_18_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1294:1: (lv_ess_18_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1295:3: lv_ess_18_0= RULE_STRING
            	    {
            	    lv_ess_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC2984); 

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

            	    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleRDC3001); 

            	        	newLeafNode(otherlv_19, grammarAccess.getRDCAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1322:4: ({...}? => ( ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1322:4: ({...}? => ( ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1323:5: {...}? => ( ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1323:100: ( ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1324:6: ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1327:6: ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1327:7: {...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1327:16: (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1327:18: otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,37,FOLLOW_37_in_ruleRDC3069); 

            	        	newLeafNode(otherlv_20, grammarAccess.getRDCAccess().getLocationKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,14,FOLLOW_14_in_ruleRDC3081); 

            	        	newLeafNode(otherlv_21, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1335:1: ( (lv_location_22_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1336:1: (lv_location_22_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1336:1: (lv_location_22_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1337:3: lv_location_22_0= RULE_STRING
            	    {
            	    lv_location_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC3098); 

            	    			newLeafNode(lv_location_22_0, grammarAccess.getRDCAccess().getLocationSTRINGTerminalRuleCall_3_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRDCRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"location",
            	            		lv_location_22_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_23=(Token)match(input,15,FOLLOW_15_in_ruleRDC3115); 

            	        	newLeafNode(otherlv_23, grammarAccess.getRDCAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1364:4: ({...}? => ( ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1364:4: ({...}? => ( ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1365:5: {...}? => ( ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1365:100: ( ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1366:6: ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1369:6: ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1369:7: {...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1369:16: (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1369:18: otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,38,FOLLOW_38_in_ruleRDC3183); 

            	        	newLeafNode(otherlv_24, grammarAccess.getRDCAccess().getResourceXKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,14,FOLLOW_14_in_ruleRDC3195); 

            	        	newLeafNode(otherlv_25, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1377:1: ( (lv_resourceX_26_0= ruleSIGNEDINT ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1378:1: (lv_resourceX_26_0= ruleSIGNEDINT )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1378:1: (lv_resourceX_26_0= ruleSIGNEDINT )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1379:3: lv_resourceX_26_0= ruleSIGNEDINT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRDCAccess().getResourceXSIGNEDINTParserRuleCall_3_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSIGNEDINT_in_ruleRDC3216);
            	    lv_resourceX_26_0=ruleSIGNEDINT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRDCRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"resourceX",
            	            		lv_resourceX_26_0, 
            	            		"SIGNEDINT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_27=(Token)match(input,15,FOLLOW_15_in_ruleRDC3228); 

            	        	newLeafNode(otherlv_27, grammarAccess.getRDCAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1406:4: ({...}? => ( ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1406:4: ({...}? => ( ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1407:5: {...}? => ( ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1407:100: ( ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1408:6: ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1411:6: ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1411:7: {...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1411:16: (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1411:18: otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';'
            	    {
            	    otherlv_28=(Token)match(input,39,FOLLOW_39_in_ruleRDC3296); 

            	        	newLeafNode(otherlv_28, grammarAccess.getRDCAccess().getResourceYKeyword_3_6_0());
            	        
            	    otherlv_29=(Token)match(input,14,FOLLOW_14_in_ruleRDC3308); 

            	        	newLeafNode(otherlv_29, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_6_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1419:1: ( (lv_resourceY_30_0= ruleSIGNEDINT ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1420:1: (lv_resourceY_30_0= ruleSIGNEDINT )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1420:1: (lv_resourceY_30_0= ruleSIGNEDINT )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1421:3: lv_resourceY_30_0= ruleSIGNEDINT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRDCAccess().getResourceYSIGNEDINTParserRuleCall_3_6_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSIGNEDINT_in_ruleRDC3329);
            	    lv_resourceY_30_0=ruleSIGNEDINT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRDCRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"resourceY",
            	            		lv_resourceY_30_0, 
            	            		"SIGNEDINT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_31=(Token)match(input,15,FOLLOW_15_in_ruleRDC3341); 

            	        	newLeafNode(otherlv_31, grammarAccess.getRDCAccess().getSemicolonKeyword_3_6_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1448:4: ({...}? => ( ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1448:4: ({...}? => ( ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1449:5: {...}? => ( ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1449:100: ( ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1450:6: ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1453:6: ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1453:7: {...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1453:16: (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1453:18: otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';'
            	    {
            	    otherlv_32=(Token)match(input,40,FOLLOW_40_in_ruleRDC3409); 

            	        	newLeafNode(otherlv_32, grammarAccess.getRDCAccess().getResourceZKeyword_3_7_0());
            	        
            	    otherlv_33=(Token)match(input,14,FOLLOW_14_in_ruleRDC3421); 

            	        	newLeafNode(otherlv_33, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_7_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1461:1: ( (lv_resourceZ_34_0= ruleSIGNEDINT ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1462:1: (lv_resourceZ_34_0= ruleSIGNEDINT )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1462:1: (lv_resourceZ_34_0= ruleSIGNEDINT )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1463:3: lv_resourceZ_34_0= ruleSIGNEDINT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRDCAccess().getResourceZSIGNEDINTParserRuleCall_3_7_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSIGNEDINT_in_ruleRDC3442);
            	    lv_resourceZ_34_0=ruleSIGNEDINT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRDCRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"resourceZ",
            	            		lv_resourceZ_34_0, 
            	            		"SIGNEDINT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_35=(Token)match(input,15,FOLLOW_15_in_ruleRDC3454); 

            	        	newLeafNode(otherlv_35, grammarAccess.getRDCAccess().getSemicolonKeyword_3_7_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1490:4: ({...}? => ( ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+ ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1490:4: ({...}? => ( ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+ ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1491:5: {...}? => ( ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1491:100: ( ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+ )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1492:6: ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 8);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1495:6: ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==41) ) {
            	            int LA17_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt17=1;
            	            }


            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1495:7: {...}? => ( (lv_connectors_36_0= ruleConnector ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    	    }
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1495:16: ( (lv_connectors_36_0= ruleConnector ) )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1496:1: (lv_connectors_36_0= ruleConnector )
            	    	    {
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1496:1: (lv_connectors_36_0= ruleConnector )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1497:3: lv_connectors_36_0= ruleConnector
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRDCAccess().getConnectorsConnectorParserRuleCall_3_8_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleConnector_in_ruleRDC3530);
            	    	    lv_connectors_36_0=ruleConnector();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getRDCRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"connectors",
            	    	            		lv_connectors_36_0, 
            	    	            		"Connector");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt17 >= 1 ) break loop17;
            	                EarlyExitException eee =
            	                    new EarlyExitException(17, input);
            	                throw eee;
            	        }
            	        cnt17++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRDCAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canLeave(grammarAccess.getRDCAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	

            }

            otherlv_37=(Token)match(input,17,FOLLOW_17_in_ruleRDC3589); 

                	newLeafNode(otherlv_37, grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1540:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1541:2: (iv_ruleConnector= ruleConnector EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1542:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector3625);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector3635); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1549:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_availableEqInterfaces_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1552:28: ( (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1553:1: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1553:1: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1553:3: otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleConnector3672); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1557:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1558:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1558:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1559:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnector3689); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConnector3706); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1579:1: ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1580:1: (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1580:1: (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1581:3: lv_availableEqInterfaces_3_0= ruleAvailableEqInterface
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectorAccess().getAvailableEqInterfacesAvailableEqInterfaceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAvailableEqInterface_in_ruleConnector3727);
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
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleConnector3740); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1609:1: entryRuleAvailableEqInterface returns [EObject current=null] : iv_ruleAvailableEqInterface= ruleAvailableEqInterface EOF ;
    public final EObject entryRuleAvailableEqInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvailableEqInterface = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1610:2: (iv_ruleAvailableEqInterface= ruleAvailableEqInterface EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1611:2: iv_ruleAvailableEqInterface= ruleAvailableEqInterface EOF
            {
             newCompositeNode(grammarAccess.getAvailableEqInterfaceRule()); 
            pushFollow(FOLLOW_ruleAvailableEqInterface_in_entryRuleAvailableEqInterface3776);
            iv_ruleAvailableEqInterface=ruleAvailableEqInterface();

            state._fsp--;

             current =iv_ruleAvailableEqInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvailableEqInterface3786); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1618:1: ruleAvailableEqInterface returns [EObject current=null] : ( ( (lv_eqInterfaceType_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_count_2_0= RULE_INT ) ) (otherlv_3= 'with protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleAvailableEqInterface() throws RecognitionException {
        EObject current = null;

        Token lv_eqInterfaceType_0_0=null;
        Token otherlv_1=null;
        Token lv_count_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_protectionLevel_4_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1621:28: ( ( ( (lv_eqInterfaceType_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_count_2_0= RULE_INT ) ) (otherlv_3= 'with protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )? otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1622:1: ( ( (lv_eqInterfaceType_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_count_2_0= RULE_INT ) ) (otherlv_3= 'with protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )? otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1622:1: ( ( (lv_eqInterfaceType_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_count_2_0= RULE_INT ) ) (otherlv_3= 'with protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )? otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1622:2: ( (lv_eqInterfaceType_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_count_2_0= RULE_INT ) ) (otherlv_3= 'with protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )? otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1622:2: ( (lv_eqInterfaceType_0_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1623:1: (lv_eqInterfaceType_0_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1623:1: (lv_eqInterfaceType_0_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1624:3: lv_eqInterfaceType_0_0= RULE_STRING
            {
            lv_eqInterfaceType_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAvailableEqInterface3828); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleAvailableEqInterface3845); 

                	newLeafNode(otherlv_1, grammarAccess.getAvailableEqInterfaceAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1644:1: ( (lv_count_2_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1645:1: (lv_count_2_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1645:1: (lv_count_2_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1646:3: lv_count_2_0= RULE_INT
            {
            lv_count_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAvailableEqInterface3862); 

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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1662:2: (otherlv_3= 'with protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1662:4: otherlv_3= 'with protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleAvailableEqInterface3880); 

                        	newLeafNode(otherlv_3, grammarAccess.getAvailableEqInterfaceAccess().getWithProtectionLevelKeyword_3_0());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1666:1: ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1667:1: (lv_protectionLevel_4_0= ruleProtectionLevelType )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1667:1: (lv_protectionLevel_4_0= ruleProtectionLevelType )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1668:3: lv_protectionLevel_4_0= ruleProtectionLevelType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAvailableEqInterfaceAccess().getProtectionLevelProtectionLevelTypeEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProtectionLevelType_in_ruleAvailableEqInterface3901);
                    lv_protectionLevel_4_0=ruleProtectionLevelType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAvailableEqInterfaceRule());
                    	        }
                           		set(
                           			current, 
                           			"protectionLevel",
                            		lv_protectionLevel_4_0, 
                            		"ProtectionLevelType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleAvailableEqInterface3915); 

                	newLeafNode(otherlv_5, grammarAccess.getAvailableEqInterfaceAccess().getSemicolonKeyword_4());
                

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1696:1: entryRuleEqInterfaceGroup returns [EObject current=null] : iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF ;
    public final EObject entryRuleEqInterfaceGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterfaceGroup = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1697:2: (iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1698:2: iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceGroupRule()); 
            pushFollow(FOLLOW_ruleEqInterfaceGroup_in_entryRuleEqInterfaceGroup3951);
            iv_ruleEqInterfaceGroup=ruleEqInterfaceGroup();

            state._fsp--;

             current =iv_ruleEqInterfaceGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterfaceGroup3961); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1705:1: ruleEqInterfaceGroup returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )? otherlv_17= ';' ) ;
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
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_implicitMemberDefinitions_4_0 = null;

        EObject lv_implicitMemberDefinitions_7_0 = null;

        EObject lv_withoutImplicitMemberDefinitions_12_0 = null;

        EObject lv_withoutImplicitMemberDefinitions_15_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1708:28: ( (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )? otherlv_17= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1709:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )? otherlv_17= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1709:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )? otherlv_17= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1709:3: otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )? otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleEqInterfaceGroup3998); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceGroupAccess().getGroupKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1713:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1714:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1714:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1715:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup4015); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEqInterfaceGroup4032); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceGroupAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1735:1: ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==45) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1735:2: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1735:2: ( (otherlv_3= RULE_ID ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1736:1: (otherlv_3= RULE_ID )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1736:1: (otherlv_3= RULE_ID )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1737:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup4053); 

                    		newLeafNode(otherlv_3, grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_3_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1749:6: ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1749:6: ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1750:1: (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1750:1: (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1751:3: lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqInterfaceGroupAccess().getImplicitMemberDefinitionsImplicitEqInterfaceMemberDefinitionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup4080);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1767:3: (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1767:5: otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
            	    {
            	    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleEqInterfaceGroup4094); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEqInterfaceGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1771:1: ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==RULE_ID) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==45) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1771:2: ( (otherlv_6= RULE_ID ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1771:2: ( (otherlv_6= RULE_ID ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1772:1: (otherlv_6= RULE_ID )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1772:1: (otherlv_6= RULE_ID )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1773:3: otherlv_6= RULE_ID
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
            	            	        }
            	                    
            	            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup4115); 

            	            		newLeafNode(otherlv_6, grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_4_1_0_0()); 
            	            	

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1785:6: ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1785:6: ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1786:1: (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1786:1: (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1787:3: lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getEqInterfaceGroupAccess().getImplicitMemberDefinitionsImplicitEqInterfaceMemberDefinitionParserRuleCall_4_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup4142);
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
            	    break loop23;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleEqInterfaceGroup4157); 

                	newLeafNode(otherlv_8, grammarAccess.getEqInterfaceGroupAccess().getRightCurlyBracketKeyword_5());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1807:1: (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1807:3: otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}'
                    {
                    otherlv_9=(Token)match(input,44,FOLLOW_44_in_ruleEqInterfaceGroup4170); 

                        	newLeafNode(otherlv_9, grammarAccess.getEqInterfaceGroupAccess().getWithoutKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleEqInterfaceGroup4182); 

                        	newLeafNode(otherlv_10, grammarAccess.getEqInterfaceGroupAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1815:1: ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_ID) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==45) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1815:2: ( (otherlv_11= RULE_ID ) )
                            {
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1815:2: ( (otherlv_11= RULE_ID ) )
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1816:1: (otherlv_11= RULE_ID )
                            {
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1816:1: (otherlv_11= RULE_ID )
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1817:3: otherlv_11= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
                            	        }
                                    
                            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup4203); 

                            		newLeafNode(otherlv_11, grammarAccess.getEqInterfaceGroupAccess().getWithoutEqInterfacesEqInterfaceCrossReference_6_2_0_0()); 
                            	

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1829:6: ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) )
                            {
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1829:6: ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) )
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1830:1: (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition )
                            {
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1830:1: (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition )
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1831:3: lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition
                            {
                             
                            	        newCompositeNode(grammarAccess.getEqInterfaceGroupAccess().getWithoutImplicitMemberDefinitionsImplicitEqInterfaceMemberDefinitionParserRuleCall_6_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup4230);
                            lv_withoutImplicitMemberDefinitions_12_0=ruleImplicitEqInterfaceMemberDefinition();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getEqInterfaceGroupRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"withoutImplicitMemberDefinitions",
                                    		lv_withoutImplicitMemberDefinitions_12_0, 
                                    		"ImplicitEqInterfaceMemberDefinition");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1847:3: (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==26) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1847:5: otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
                    	    {
                    	    otherlv_13=(Token)match(input,26,FOLLOW_26_in_ruleEqInterfaceGroup4244); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getEqInterfaceGroupAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1851:1: ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
                    	    int alt25=2;
                    	    int LA25_0 = input.LA(1);

                    	    if ( (LA25_0==RULE_ID) ) {
                    	        alt25=1;
                    	    }
                    	    else if ( (LA25_0==45) ) {
                    	        alt25=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 25, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt25) {
                    	        case 1 :
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1851:2: ( (otherlv_14= RULE_ID ) )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1851:2: ( (otherlv_14= RULE_ID ) )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1852:1: (otherlv_14= RULE_ID )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1852:1: (otherlv_14= RULE_ID )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1853:3: otherlv_14= RULE_ID
                    	            {

                    	            			if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
                    	            	        }
                    	                    
                    	            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup4265); 

                    	            		newLeafNode(otherlv_14, grammarAccess.getEqInterfaceGroupAccess().getWithoutEqInterfacesEqInterfaceCrossReference_6_3_1_0_0()); 
                    	            	

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1865:6: ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1865:6: ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1866:1: (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1866:1: (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1867:3: lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getEqInterfaceGroupAccess().getWithoutImplicitMemberDefinitionsImplicitEqInterfaceMemberDefinitionParserRuleCall_6_3_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup4292);
                    	            lv_withoutImplicitMemberDefinitions_15_0=ruleImplicitEqInterfaceMemberDefinition();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getEqInterfaceGroupRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"withoutImplicitMemberDefinitions",
                    	                    		lv_withoutImplicitMemberDefinitions_15_0, 
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
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleEqInterfaceGroup4307); 

                        	newLeafNode(otherlv_16, grammarAccess.getEqInterfaceGroupAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleEqInterfaceGroup4321); 

                	newLeafNode(otherlv_17, grammarAccess.getEqInterfaceGroupAccess().getSemicolonKeyword_7());
                

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1899:1: entryRuleImplicitEqInterfaceMemberDefinition returns [EObject current=null] : iv_ruleImplicitEqInterfaceMemberDefinition= ruleImplicitEqInterfaceMemberDefinition EOF ;
    public final EObject entryRuleImplicitEqInterfaceMemberDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitEqInterfaceMemberDefinition = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1900:2: (iv_ruleImplicitEqInterfaceMemberDefinition= ruleImplicitEqInterfaceMemberDefinition EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1901:2: iv_ruleImplicitEqInterfaceMemberDefinition= ruleImplicitEqInterfaceMemberDefinition EOF
            {
             newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionRule()); 
            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_entryRuleImplicitEqInterfaceMemberDefinition4357);
            iv_ruleImplicitEqInterfaceMemberDefinition=ruleImplicitEqInterfaceMemberDefinition();

            state._fsp--;

             current =iv_ruleImplicitEqInterfaceMemberDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitEqInterfaceMemberDefinition4367); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1908:1: ruleImplicitEqInterfaceMemberDefinition returns [EObject current=null] : (otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )* ) ;
    public final EObject ruleImplicitEqInterfaceMemberDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1911:28: ( (otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1912:1: (otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )* )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1912:1: (otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1912:3: otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )*
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleImplicitEqInterfaceMemberDefinition4404); 

                	newLeafNode(otherlv_0, grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getInterfacesWithKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1916:1: ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1917:1: (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1917:1: (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1918:3: lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues
            {
             
            	        newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getEntriesImplicitEqInterfaceMemberDefinitionAttributesAndValuesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_ruleImplicitEqInterfaceMemberDefinition4425);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1934:2: (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==46) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1934:4: otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleImplicitEqInterfaceMemberDefinition4438); 

            	        	newLeafNode(otherlv_2, grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getAndKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1938:1: ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1939:1: (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1939:1: (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1940:3: lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getEntriesImplicitEqInterfaceMemberDefinitionAttributesAndValuesParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_ruleImplicitEqInterfaceMemberDefinition4459);
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
            	    break loop28;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1964:1: entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues returns [EObject current=null] : iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues EOF ;
    public final EObject entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1965:2: (iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1966:2: iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues EOF
            {
             newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesRule()); 
            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues4497);
            iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues=ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues();

            state._fsp--;

             current =iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues4507); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1973:1: ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_attribute_0_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1976:28: ( ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1977:1: ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1977:1: ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1977:2: ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1977:2: ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1978:1: (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1978:1: (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1979:3: lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute
            {
             
            	        newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesAccess().getAttributeImplicitEqInterfaceMemberDefinitionAttributeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttribute_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues4553);
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues4565); 

                	newLeafNode(otherlv_1, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1999:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2000:1: (lv_value_2_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2000:1: (lv_value_2_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2001:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues4582); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2025:1: entryRuleEqInterfaceGroupWithCombinedDefinition returns [EObject current=null] : iv_ruleEqInterfaceGroupWithCombinedDefinition= ruleEqInterfaceGroupWithCombinedDefinition EOF ;
    public final EObject entryRuleEqInterfaceGroupWithCombinedDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterfaceGroupWithCombinedDefinition = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2026:2: (iv_ruleEqInterfaceGroupWithCombinedDefinition= ruleEqInterfaceGroupWithCombinedDefinition EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2027:2: iv_ruleEqInterfaceGroupWithCombinedDefinition= ruleEqInterfaceGroupWithCombinedDefinition EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionRule()); 
            pushFollow(FOLLOW_ruleEqInterfaceGroupWithCombinedDefinition_in_entryRuleEqInterfaceGroupWithCombinedDefinition4623);
            iv_ruleEqInterfaceGroupWithCombinedDefinition=ruleEqInterfaceGroupWithCombinedDefinition();

            state._fsp--;

             current =iv_ruleEqInterfaceGroupWithCombinedDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterfaceGroupWithCombinedDefinition4633); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2034:1: ruleEqInterfaceGroupWithCombinedDefinition returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2037:28: ( (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2038:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2038:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2038:3: otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleEqInterfaceGroupWithCombinedDefinition4670); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getGroupKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2042:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2043:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2043:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2044:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition4687); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleEqInterfaceGroupWithCombinedDefinition4704); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getCombinesKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2064:1: ( (otherlv_3= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2065:1: (otherlv_3= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2065:1: (otherlv_3= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2066:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition4724); 

            		newLeafNode(otherlv_3, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getCombinedGroupsEqInterfaceGroupCrossReference_3_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2077:2: (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==46) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2077:4: otherlv_4= 'and' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleEqInterfaceGroupWithCombinedDefinition4737); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getAndKeyword_4_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2081:1: ( (otherlv_5= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2082:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2082:1: (otherlv_5= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2083:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition4757); 

            	    		newLeafNode(otherlv_5, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getCombinedGroupsEqInterfaceGroupCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleEqInterfaceGroupWithCombinedDefinition4771); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2106:1: entryRuleEqInterface returns [EObject current=null] : iv_ruleEqInterface= ruleEqInterface EOF ;
    public final EObject entryRuleEqInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterface = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2107:2: (iv_ruleEqInterface= ruleEqInterface EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2108:2: iv_ruleEqInterface= ruleEqInterface EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceRule()); 
            pushFollow(FOLLOW_ruleEqInterface_in_entryRuleEqInterface4807);
            iv_ruleEqInterface=ruleEqInterface();

            state._fsp--;

             current =iv_ruleEqInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterface4817); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2115:1: ruleEqInterface returns [EObject current=null] : (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}' ) ;
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
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        AntlrDatatypeRuleToken lv_resourceX_46_0 = null;

        AntlrDatatypeRuleToken lv_resourceY_50_0 = null;

        AntlrDatatypeRuleToken lv_resourceZ_54_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2118:28: ( (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2119:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2119:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2119:3: otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleEqInterface4854); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceAccess().getInterfaceKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2124:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2124:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterface4871); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEqInterface4888); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2145:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2147:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2147:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2148:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2151:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2152:3: ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )*
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2152:3: ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )*
            loop30:
            do {
                int alt30=14;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2154:4: ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2154:4: ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2155:5: {...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2155:108: ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2156:6: ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2159:6: ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2159:7: {...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2159:16: (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2159:18: otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleEqInterface4946); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEqInterfaceAccess().getSystemKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface4958); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2167:1: ( (lv_system_6_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2168:1: (lv_system_6_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2168:1: (lv_system_6_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2169:3: lv_system_6_0= RULE_STRING
            	    {
            	    lv_system_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface4975); 

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

            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface4992); 

            	        	newLeafNode(otherlv_7, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2196:4: ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2196:4: ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2197:5: {...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2197:108: ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2198:6: ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2201:6: ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2201:7: {...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2201:16: (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2201:18: otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,50,FOLLOW_50_in_ruleEqInterface5060); 

            	        	newLeafNode(otherlv_8, grammarAccess.getEqInterfaceAccess().getSubAtaKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5072); 

            	        	newLeafNode(otherlv_9, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2209:1: ( (lv_subAta_10_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2210:1: (lv_subAta_10_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2210:1: (lv_subAta_10_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2211:3: lv_subAta_10_0= RULE_STRING
            	    {
            	    lv_subAta_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5089); 

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

            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5106); 

            	        	newLeafNode(otherlv_11, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2238:4: ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2238:4: ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2239:5: {...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2239:108: ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2240:6: ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2243:6: ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2243:7: {...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2243:16: (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2243:18: otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,51,FOLLOW_51_in_ruleEqInterface5174); 

            	        	newLeafNode(otherlv_12, grammarAccess.getEqInterfaceAccess().getResourceKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5186); 

            	        	newLeafNode(otherlv_13, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2251:1: ( (lv_resource_14_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2252:1: (lv_resource_14_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2252:1: (lv_resource_14_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2253:3: lv_resource_14_0= RULE_STRING
            	    {
            	    lv_resource_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5203); 

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

            	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5220); 

            	        	newLeafNode(otherlv_15, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2280:4: ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2280:4: ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2281:5: {...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2281:108: ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2282:6: ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2285:6: ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2285:7: {...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2285:16: (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2285:18: otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,52,FOLLOW_52_in_ruleEqInterface5288); 

            	        	newLeafNode(otherlv_16, grammarAccess.getEqInterfaceAccess().getLineNameKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5300); 

            	        	newLeafNode(otherlv_17, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2293:1: ( (lv_lineName_18_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2294:1: (lv_lineName_18_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2294:1: (lv_lineName_18_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2295:3: lv_lineName_18_0= RULE_STRING
            	    {
            	    lv_lineName_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5317); 

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

            	    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5334); 

            	        	newLeafNode(otherlv_19, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2322:4: ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2322:4: ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2323:5: {...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2323:108: ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2324:6: ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2327:6: ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2327:7: {...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2327:16: (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2327:18: otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,53,FOLLOW_53_in_ruleEqInterface5402); 

            	        	newLeafNode(otherlv_20, grammarAccess.getEqInterfaceAccess().getWiringLaneKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5414); 

            	        	newLeafNode(otherlv_21, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2335:1: ( (lv_wiringLane_22_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2336:1: (lv_wiringLane_22_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2336:1: (lv_wiringLane_22_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2337:3: lv_wiringLane_22_0= RULE_STRING
            	    {
            	    lv_wiringLane_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5431); 

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

            	    otherlv_23=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5448); 

            	        	newLeafNode(otherlv_23, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2364:4: ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2364:4: ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2365:5: {...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2365:108: ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2366:6: ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2369:6: ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2369:7: {...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2369:16: (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2369:18: otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,54,FOLLOW_54_in_ruleEqInterface5516); 

            	        	newLeafNode(otherlv_24, grammarAccess.getEqInterfaceAccess().getGrpInfoKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5528); 

            	        	newLeafNode(otherlv_25, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2377:1: ( (lv_grpInfo_26_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2378:1: (lv_grpInfo_26_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2378:1: (lv_grpInfo_26_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2379:3: lv_grpInfo_26_0= RULE_STRING
            	    {
            	    lv_grpInfo_26_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5545); 

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

            	    otherlv_27=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5562); 

            	        	newLeafNode(otherlv_27, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2406:4: ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2406:4: ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2407:5: {...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2407:108: ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2408:6: ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2411:6: ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2411:7: {...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2411:16: (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2411:18: otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';'
            	    {
            	    otherlv_28=(Token)match(input,55,FOLLOW_55_in_ruleEqInterface5630); 

            	        	newLeafNode(otherlv_28, grammarAccess.getEqInterfaceAccess().getRouteKeyword_3_6_0());
            	        
            	    otherlv_29=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5642); 

            	        	newLeafNode(otherlv_29, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_6_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2419:1: ( (lv_route_30_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2420:1: (lv_route_30_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2420:1: (lv_route_30_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2421:3: lv_route_30_0= RULE_STRING
            	    {
            	    lv_route_30_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5659); 

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

            	    otherlv_31=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5676); 

            	        	newLeafNode(otherlv_31, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_6_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2448:4: ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2448:4: ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2449:5: {...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2449:108: ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2450:6: ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2453:6: ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2453:7: {...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2453:16: (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2453:18: otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';'
            	    {
            	    otherlv_32=(Token)match(input,56,FOLLOW_56_in_ruleEqInterface5744); 

            	        	newLeafNode(otherlv_32, grammarAccess.getEqInterfaceAccess().getPwSup1Keyword_3_7_0());
            	        
            	    otherlv_33=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5756); 

            	        	newLeafNode(otherlv_33, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_7_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2461:1: ( (lv_pwSup1_34_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2462:1: (lv_pwSup1_34_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2462:1: (lv_pwSup1_34_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2463:3: lv_pwSup1_34_0= RULE_STRING
            	    {
            	    lv_pwSup1_34_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5773); 

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

            	    otherlv_35=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5790); 

            	        	newLeafNode(otherlv_35, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_7_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2490:4: ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2490:4: ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2491:5: {...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2491:108: ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2492:6: ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2495:6: ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2495:7: {...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2495:16: (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2495:18: otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';'
            	    {
            	    otherlv_36=(Token)match(input,57,FOLLOW_57_in_ruleEqInterface5858); 

            	        	newLeafNode(otherlv_36, grammarAccess.getEqInterfaceAccess().getEmhZone1Keyword_3_8_0());
            	        
            	    otherlv_37=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5870); 

            	        	newLeafNode(otherlv_37, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_8_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2503:1: ( (lv_emhZone1_38_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2504:1: (lv_emhZone1_38_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2504:1: (lv_emhZone1_38_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2505:3: lv_emhZone1_38_0= RULE_STRING
            	    {
            	    lv_emhZone1_38_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5887); 

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

            	    otherlv_39=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5904); 

            	        	newLeafNode(otherlv_39, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_8_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2532:4: ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2532:4: ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2533:5: {...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2533:108: ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2534:6: ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2537:6: ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2537:7: {...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2537:16: (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2537:18: otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';'
            	    {
            	    otherlv_40=(Token)match(input,35,FOLLOW_35_in_ruleEqInterface5972); 

            	        	newLeafNode(otherlv_40, grammarAccess.getEqInterfaceAccess().getTypeKeyword_3_9_0());
            	        
            	    otherlv_41=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5984); 

            	        	newLeafNode(otherlv_41, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_9_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2545:1: ( (lv_ioType_42_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2546:1: (lv_ioType_42_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2546:1: (lv_ioType_42_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2547:3: lv_ioType_42_0= RULE_STRING
            	    {
            	    lv_ioType_42_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface6001); 

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

            	    otherlv_43=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6018); 

            	        	newLeafNode(otherlv_43, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_9_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2574:4: ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2574:4: ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2575:5: {...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2575:109: ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2576:6: ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 10);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2579:6: ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2579:7: {...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2579:16: (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2579:18: otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';'
            	    {
            	    otherlv_44=(Token)match(input,38,FOLLOW_38_in_ruleEqInterface6086); 

            	        	newLeafNode(otherlv_44, grammarAccess.getEqInterfaceAccess().getResourceXKeyword_3_10_0());
            	        
            	    otherlv_45=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6098); 

            	        	newLeafNode(otherlv_45, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_10_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2587:1: ( (lv_resourceX_46_0= ruleSIGNEDINT ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2588:1: (lv_resourceX_46_0= ruleSIGNEDINT )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2588:1: (lv_resourceX_46_0= ruleSIGNEDINT )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2589:3: lv_resourceX_46_0= ruleSIGNEDINT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqInterfaceAccess().getResourceXSIGNEDINTParserRuleCall_3_10_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6119);
            	    lv_resourceX_46_0=ruleSIGNEDINT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqInterfaceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"resourceX",
            	            		lv_resourceX_46_0, 
            	            		"SIGNEDINT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_47=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6131); 

            	        	newLeafNode(otherlv_47, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_10_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2616:4: ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2616:4: ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2617:5: {...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2617:109: ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2618:6: ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 11);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2621:6: ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2621:7: {...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2621:16: (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2621:18: otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';'
            	    {
            	    otherlv_48=(Token)match(input,39,FOLLOW_39_in_ruleEqInterface6199); 

            	        	newLeafNode(otherlv_48, grammarAccess.getEqInterfaceAccess().getResourceYKeyword_3_11_0());
            	        
            	    otherlv_49=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6211); 

            	        	newLeafNode(otherlv_49, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_11_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2629:1: ( (lv_resourceY_50_0= ruleSIGNEDINT ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2630:1: (lv_resourceY_50_0= ruleSIGNEDINT )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2630:1: (lv_resourceY_50_0= ruleSIGNEDINT )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2631:3: lv_resourceY_50_0= ruleSIGNEDINT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqInterfaceAccess().getResourceYSIGNEDINTParserRuleCall_3_11_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6232);
            	    lv_resourceY_50_0=ruleSIGNEDINT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqInterfaceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"resourceY",
            	            		lv_resourceY_50_0, 
            	            		"SIGNEDINT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_51=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6244); 

            	        	newLeafNode(otherlv_51, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_11_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2658:4: ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2658:4: ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2659:5: {...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 12)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2659:109: ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2660:6: ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 12);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2663:6: ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2663:7: {...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2663:16: (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2663:18: otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';'
            	    {
            	    otherlv_52=(Token)match(input,40,FOLLOW_40_in_ruleEqInterface6312); 

            	        	newLeafNode(otherlv_52, grammarAccess.getEqInterfaceAccess().getResourceZKeyword_3_12_0());
            	        
            	    otherlv_53=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6324); 

            	        	newLeafNode(otherlv_53, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_12_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2671:1: ( (lv_resourceZ_54_0= ruleSIGNEDINT ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2672:1: (lv_resourceZ_54_0= ruleSIGNEDINT )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2672:1: (lv_resourceZ_54_0= ruleSIGNEDINT )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2673:3: lv_resourceZ_54_0= ruleSIGNEDINT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqInterfaceAccess().getResourceZSIGNEDINTParserRuleCall_3_12_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6345);
            	    lv_resourceZ_54_0=ruleSIGNEDINT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqInterfaceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"resourceZ",
            	            		lv_resourceZ_54_0, 
            	            		"SIGNEDINT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_55=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6357); 

            	        	newLeafNode(otherlv_55, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_12_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	

            }

            otherlv_56=(Token)match(input,17,FOLLOW_17_in_ruleEqInterface6410); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2719:1: entryRuleDislocalityRelation returns [EObject current=null] : iv_ruleDislocalityRelation= ruleDislocalityRelation EOF ;
    public final EObject entryRuleDislocalityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDislocalityRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2720:2: (iv_ruleDislocalityRelation= ruleDislocalityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2721:2: iv_ruleDislocalityRelation= ruleDislocalityRelation EOF
            {
             newCompositeNode(grammarAccess.getDislocalityRelationRule()); 
            pushFollow(FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation6446);
            iv_ruleDislocalityRelation=ruleDislocalityRelation();

            state._fsp--;

             current =iv_ruleDislocalityRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDislocalityRelation6456); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2728:1: ruleDislocalityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2731:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2732:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2732:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2732:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2732:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2733:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2733:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2734:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDislocalityRelationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDislocalityRelation6501); 

            		newLeafNode(otherlv_0, grammarAccess.getDislocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_0_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2745:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==26) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2745:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleDislocalityRelation6514); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDislocalityRelationAccess().getCommaKeyword_1_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2749:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2750:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2750:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2751:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDislocalityRelationRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDislocalityRelation6534); 

            	    		newLeafNode(otherlv_2, grammarAccess.getDislocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleDislocalityRelation6548); 

                	newLeafNode(otherlv_3, grammarAccess.getDislocalityRelationAccess().getDislocalUpToKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2766:1: ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2767:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2767:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2768:3: lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType
            {
             
            	        newCompositeNode(grammarAccess.getDislocalityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleHardwareArchitectureLevelType_in_ruleDislocalityRelation6569);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDislocalityRelation6581); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2796:1: entryRuleColocalityRelation returns [EObject current=null] : iv_ruleColocalityRelation= ruleColocalityRelation EOF ;
    public final EObject entryRuleColocalityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColocalityRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2797:2: (iv_ruleColocalityRelation= ruleColocalityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2798:2: iv_ruleColocalityRelation= ruleColocalityRelation EOF
            {
             newCompositeNode(grammarAccess.getColocalityRelationRule()); 
            pushFollow(FOLLOW_ruleColocalityRelation_in_entryRuleColocalityRelation6617);
            iv_ruleColocalityRelation=ruleColocalityRelation();

            state._fsp--;

             current =iv_ruleColocalityRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColocalityRelation6627); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2805:1: ruleColocalityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2808:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2809:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2809:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2809:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2809:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2810:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2810:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2811:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getColocalityRelationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColocalityRelation6672); 

            		newLeafNode(otherlv_0, grammarAccess.getColocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_0_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2822:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==26) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2822:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleColocalityRelation6685); 

            	        	newLeafNode(otherlv_1, grammarAccess.getColocalityRelationAccess().getCommaKeyword_1_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2826:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2827:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2827:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2828:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getColocalityRelationRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColocalityRelation6705); 

            	    		newLeafNode(otherlv_2, grammarAccess.getColocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleColocalityRelation6719); 

                	newLeafNode(otherlv_3, grammarAccess.getColocalityRelationAccess().getOnSameKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2843:1: ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2844:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2844:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2845:3: lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType
            {
             
            	        newCompositeNode(grammarAccess.getColocalityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleHardwareArchitectureLevelType_in_ruleColocalityRelation6740);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleColocalityRelation6752); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2873:1: entryRuleValidDeployment returns [EObject current=null] : iv_ruleValidDeployment= ruleValidDeployment EOF ;
    public final EObject entryRuleValidDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidDeployment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2874:2: (iv_ruleValidDeployment= ruleValidDeployment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2875:2: iv_ruleValidDeployment= ruleValidDeployment EOF
            {
             newCompositeNode(grammarAccess.getValidDeploymentRule()); 
            pushFollow(FOLLOW_ruleValidDeployment_in_entryRuleValidDeployment6788);
            iv_ruleValidDeployment=ruleValidDeployment();

            state._fsp--;

             current =iv_ruleValidDeployment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidDeployment6798); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2882:1: ruleValidDeployment returns [EObject current=null] : (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2885:28: ( (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2886:1: (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2886:1: (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2886:3: otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleValidDeployment6835); 

                	newLeafNode(otherlv_0, grammarAccess.getValidDeploymentAccess().getValidForKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2890:1: ( (otherlv_1= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2891:1: (otherlv_1= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2891:1: (otherlv_1= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2892:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getValidDeploymentRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidDeployment6855); 

            		newLeafNode(otherlv_1, grammarAccess.getValidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2903:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==26) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2903:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleValidDeployment6868); 

            	        	newLeafNode(otherlv_2, grammarAccess.getValidDeploymentAccess().getCommaKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2907:1: ( (otherlv_3= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2908:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2908:1: (otherlv_3= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2909:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getValidDeploymentRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidDeployment6888); 

            	    		newLeafNode(otherlv_3, grammarAccess.getValidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2920:4: (otherlv_4= 'is' | otherlv_5= 'are' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==61) ) {
                alt34=1;
            }
            else if ( (LA34_0==62) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2920:6: otherlv_4= 'is'
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_61_in_ruleValidDeployment6903); 

                        	newLeafNode(otherlv_4, grammarAccess.getValidDeploymentAccess().getIsKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2925:7: otherlv_5= 'are'
                    {
                    otherlv_5=(Token)match(input,62,FOLLOW_62_in_ruleValidDeployment6921); 

                        	newLeafNode(otherlv_5, grammarAccess.getValidDeploymentAccess().getAreKeyword_3_1());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleValidDeployment6934); 

                	newLeafNode(otherlv_6, grammarAccess.getValidDeploymentAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2933:1: ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            else if ( (LA35_0==64) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2933:2: ( ( ruleQualifiedName ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2933:2: ( ( ruleQualifiedName ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2934:1: ( ruleQualifiedName )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2934:1: ( ruleQualifiedName )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2935:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getValidDeploymentRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleValidDeployment6958);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2949:6: ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2949:6: ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2950:1: (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2950:1: (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2951:3: lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getImplicitHardwareElementsDeploymentImplicitDefinitionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeployment6985);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2967:3: (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==26) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2967:5: otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) )
            	    {
            	    otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleValidDeployment6999); 

            	        	newLeafNode(otherlv_9, grammarAccess.getValidDeploymentAccess().getCommaKeyword_6_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2971:1: ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==RULE_ID) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==64) ) {
            	        alt36=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2971:2: ( ( ruleQualifiedName ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2971:2: ( ( ruleQualifiedName ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2972:1: ( ruleQualifiedName )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2972:1: ( ruleQualifiedName )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2973:3: ruleQualifiedName
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getValidDeploymentRule());
            	            	        }
            	                    
            	             
            	            	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_6_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleValidDeployment7023);
            	            ruleQualifiedName();

            	            state._fsp--;

            	             
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2987:6: ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2987:6: ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2988:1: (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2988:1: (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2989:3: lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getImplicitHardwareElementsDeploymentImplicitDefinitionParserRuleCall_6_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeployment7050);
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
            	    break loop37;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleValidDeployment7065); 

                	newLeafNode(otherlv_12, grammarAccess.getValidDeploymentAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleValidDeployment7077); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3021:1: entryRuleInvalidDeployment returns [EObject current=null] : iv_ruleInvalidDeployment= ruleInvalidDeployment EOF ;
    public final EObject entryRuleInvalidDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidDeployment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3022:2: (iv_ruleInvalidDeployment= ruleInvalidDeployment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3023:2: iv_ruleInvalidDeployment= ruleInvalidDeployment EOF
            {
             newCompositeNode(grammarAccess.getInvalidDeploymentRule()); 
            pushFollow(FOLLOW_ruleInvalidDeployment_in_entryRuleInvalidDeployment7113);
            iv_ruleInvalidDeployment=ruleInvalidDeployment();

            state._fsp--;

             current =iv_ruleInvalidDeployment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvalidDeployment7123); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3030:1: ruleInvalidDeployment returns [EObject current=null] : (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3033:28: ( (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3034:1: (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3034:1: (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3034:3: otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'is' | otherlv_5= 'are' ) otherlv_6= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_12= '}' otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleInvalidDeployment7160); 

                	newLeafNode(otherlv_0, grammarAccess.getInvalidDeploymentAccess().getInvalidForKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3038:1: ( (otherlv_1= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3039:1: (otherlv_1= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3039:1: (otherlv_1= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3040:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvalidDeployment7180); 

            		newLeafNode(otherlv_1, grammarAccess.getInvalidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3051:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==26) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3051:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleInvalidDeployment7193); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInvalidDeploymentAccess().getCommaKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3055:1: ( (otherlv_3= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3056:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3056:1: (otherlv_3= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3057:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvalidDeployment7213); 

            	    		newLeafNode(otherlv_3, grammarAccess.getInvalidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3068:4: (otherlv_4= 'is' | otherlv_5= 'are' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==61) ) {
                alt39=1;
            }
            else if ( (LA39_0==62) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3068:6: otherlv_4= 'is'
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_61_in_ruleInvalidDeployment7228); 

                        	newLeafNode(otherlv_4, grammarAccess.getInvalidDeploymentAccess().getIsKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3073:7: otherlv_5= 'are'
                    {
                    otherlv_5=(Token)match(input,62,FOLLOW_62_in_ruleInvalidDeployment7246); 

                        	newLeafNode(otherlv_5, grammarAccess.getInvalidDeploymentAccess().getAreKeyword_3_1());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleInvalidDeployment7259); 

                	newLeafNode(otherlv_6, grammarAccess.getInvalidDeploymentAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3081:1: ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            else if ( (LA40_0==64) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3081:2: ( ( ruleQualifiedName ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3081:2: ( ( ruleQualifiedName ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3082:1: ( ruleQualifiedName )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3082:1: ( ruleQualifiedName )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3083:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment7283);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3097:6: ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3097:6: ( (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3098:1: (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3098:1: (lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3099:3: lv_implicitHardwareElements_8_0= ruleDeploymentImplicitDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getImplicitHardwareElementsDeploymentImplicitDefinitionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeployment7310);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3115:3: (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==26) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3115:5: otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) )
            	    {
            	    otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleInvalidDeployment7324); 

            	        	newLeafNode(otherlv_9, grammarAccess.getInvalidDeploymentAccess().getCommaKeyword_6_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3119:1: ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) ) )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==RULE_ID) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==64) ) {
            	        alt41=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3119:2: ( ( ruleQualifiedName ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3119:2: ( ( ruleQualifiedName ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3120:1: ( ruleQualifiedName )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3120:1: ( ruleQualifiedName )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3121:3: ruleQualifiedName
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
            	            	        }
            	                    
            	             
            	            	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_6_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment7348);
            	            ruleQualifiedName();

            	            state._fsp--;

            	             
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3135:6: ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3135:6: ( (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3136:1: (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3136:1: (lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3137:3: lv_implicitHardwareElements_11_0= ruleDeploymentImplicitDefinition
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getImplicitHardwareElementsDeploymentImplicitDefinitionParserRuleCall_6_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeployment7375);
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
            	    break loop42;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleInvalidDeployment7390); 

                	newLeafNode(otherlv_12, grammarAccess.getInvalidDeploymentAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleInvalidDeployment7402); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3169:1: entryRuleDeploymentImplicitDefinition returns [EObject current=null] : iv_ruleDeploymentImplicitDefinition= ruleDeploymentImplicitDefinition EOF ;
    public final EObject entryRuleDeploymentImplicitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentImplicitDefinition = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3170:2: (iv_ruleDeploymentImplicitDefinition= ruleDeploymentImplicitDefinition EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3171:2: iv_ruleDeploymentImplicitDefinition= ruleDeploymentImplicitDefinition EOF
            {
             newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionRule()); 
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_entryRuleDeploymentImplicitDefinition7438);
            iv_ruleDeploymentImplicitDefinition=ruleDeploymentImplicitDefinition();

            state._fsp--;

             current =iv_ruleDeploymentImplicitDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinition7448); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3178:1: ruleDeploymentImplicitDefinition returns [EObject current=null] : (otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )* ) ;
    public final EObject ruleDeploymentImplicitDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3181:28: ( (otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3182:1: (otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )* )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3182:1: (otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3182:3: otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )*
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleDeploymentImplicitDefinition7485); 

                	newLeafNode(otherlv_0, grammarAccess.getDeploymentImplicitDefinitionAccess().getConnectorsWithKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3186:1: ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3187:1: (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3187:1: (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3188:3: lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionAccess().getEntriesDeploymentImplicitDefinitionAttributeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_ruleDeploymentImplicitDefinition7506);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3204:2: (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==46) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3204:4: otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleDeploymentImplicitDefinition7519); 

            	        	newLeafNode(otherlv_2, grammarAccess.getDeploymentImplicitDefinitionAccess().getAndKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3208:1: ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3209:1: (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3209:1: (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3210:3: lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionAccess().getEntriesDeploymentImplicitDefinitionAttributeAndValueParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_ruleDeploymentImplicitDefinition7540);
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
            	    break loop43;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3234:1: entryRuleDeploymentImplicitDefinitionAttributeAndValue returns [EObject current=null] : iv_ruleDeploymentImplicitDefinitionAttributeAndValue= ruleDeploymentImplicitDefinitionAttributeAndValue EOF ;
    public final EObject entryRuleDeploymentImplicitDefinitionAttributeAndValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentImplicitDefinitionAttributeAndValue = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3235:2: (iv_ruleDeploymentImplicitDefinitionAttributeAndValue= ruleDeploymentImplicitDefinitionAttributeAndValue EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3236:2: iv_ruleDeploymentImplicitDefinitionAttributeAndValue= ruleDeploymentImplicitDefinitionAttributeAndValue EOF
            {
             newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueRule()); 
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_entryRuleDeploymentImplicitDefinitionAttributeAndValue7578);
            iv_ruleDeploymentImplicitDefinitionAttributeAndValue=ruleDeploymentImplicitDefinitionAttributeAndValue();

            state._fsp--;

             current =iv_ruleDeploymentImplicitDefinitionAttributeAndValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinitionAttributeAndValue7588); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3243:1: ruleDeploymentImplicitDefinitionAttributeAndValue returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDeploymentImplicitDefinitionAttributeAndValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_attribute_0_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3246:28: ( ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3247:1: ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3247:1: ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3247:2: ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3247:2: ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3248:1: (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3248:1: (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3249:3: lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute
            {
             
            	        newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueAccess().getAttributeDeploymentImplicitDefinitionAttributeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinitionAttribute_in_ruleDeploymentImplicitDefinitionAttributeAndValue7634);
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDeploymentImplicitDefinitionAttributeAndValue7646); 

                	newLeafNode(otherlv_1, grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3269:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3270:1: (lv_value_2_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3270:1: (lv_value_2_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3271:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeploymentImplicitDefinitionAttributeAndValue7663); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3297:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3298:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3299:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName7707);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName7718); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3306:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3309:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3310:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3310:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3310:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName7758); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3317:1: (kw= '.' this_ID_2= RULE_ID )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==65) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3318:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,65,FOLLOW_65_in_ruleQualifiedName7777); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName7792); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop44;
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


    // $ANTLR start "entryRuleSIGNEDINT"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3338:1: entryRuleSIGNEDINT returns [String current=null] : iv_ruleSIGNEDINT= ruleSIGNEDINT EOF ;
    public final String entryRuleSIGNEDINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNEDINT = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3339:2: (iv_ruleSIGNEDINT= ruleSIGNEDINT EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3340:2: iv_ruleSIGNEDINT= ruleSIGNEDINT EOF
            {
             newCompositeNode(grammarAccess.getSIGNEDINTRule()); 
            pushFollow(FOLLOW_ruleSIGNEDINT_in_entryRuleSIGNEDINT7840);
            iv_ruleSIGNEDINT=ruleSIGNEDINT();

            state._fsp--;

             current =iv_ruleSIGNEDINT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSIGNEDINT7851); 

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
    // $ANTLR end "entryRuleSIGNEDINT"


    // $ANTLR start "ruleSIGNEDINT"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3347:1: ruleSIGNEDINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSIGNEDINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3350:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3351:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3351:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3351:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3351:2: (kw= '-' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==66) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3352:2: kw= '-'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleSIGNEDINT7890); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSIGNEDINTAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSIGNEDINT7907); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getSIGNEDINTAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleSIGNEDINT"


    // $ANTLR start "ruleProtectionLevelType"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3372:1: ruleProtectionLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) ) ;
    public final Enumerator ruleProtectionLevelType() throws RecognitionException {
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3374:28: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3375:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3375:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) )
            int alt46=9;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt46=1;
                }
                break;
            case 68:
                {
                alt46=2;
                }
                break;
            case 69:
                {
                alt46=3;
                }
                break;
            case 70:
                {
                alt46=4;
                }
                break;
            case 71:
                {
                alt46=5;
                }
                break;
            case 72:
                {
                alt46=6;
                }
                break;
            case 73:
                {
                alt46=7;
                }
                break;
            case 74:
                {
                alt46=8;
                }
                break;
            case 75:
                {
                alt46=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3375:2: (enumLiteral_0= 'None' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3375:2: (enumLiteral_0= 'None' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3375:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_67_in_ruleProtectionLevelType7966); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getProtectionLevelTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3381:6: (enumLiteral_1= 'L1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3381:6: (enumLiteral_1= 'L1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3381:8: enumLiteral_1= 'L1'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_68_in_ruleProtectionLevelType7983); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getProtectionLevelTypeAccess().getL1EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3387:6: (enumLiteral_2= 'L2' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3387:6: (enumLiteral_2= 'L2' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3387:8: enumLiteral_2= 'L2'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_69_in_ruleProtectionLevelType8000); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getProtectionLevelTypeAccess().getL2EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3393:6: (enumLiteral_3= 'L3' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3393:6: (enumLiteral_3= 'L3' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3393:8: enumLiteral_3= 'L3'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_70_in_ruleProtectionLevelType8017); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL3EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getProtectionLevelTypeAccess().getL3EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3399:6: (enumLiteral_4= 'L4' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3399:6: (enumLiteral_4= 'L4' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3399:8: enumLiteral_4= 'L4'
                    {
                    enumLiteral_4=(Token)match(input,71,FOLLOW_71_in_ruleProtectionLevelType8034); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL4EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getProtectionLevelTypeAccess().getL4EnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3405:6: (enumLiteral_5= 'L5' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3405:6: (enumLiteral_5= 'L5' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3405:8: enumLiteral_5= 'L5'
                    {
                    enumLiteral_5=(Token)match(input,72,FOLLOW_72_in_ruleProtectionLevelType8051); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL5EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getProtectionLevelTypeAccess().getL5EnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3411:6: (enumLiteral_6= 'L6' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3411:6: (enumLiteral_6= 'L6' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3411:8: enumLiteral_6= 'L6'
                    {
                    enumLiteral_6=(Token)match(input,73,FOLLOW_73_in_ruleProtectionLevelType8068); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL6EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getProtectionLevelTypeAccess().getL6EnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3417:6: (enumLiteral_7= 'L7' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3417:6: (enumLiteral_7= 'L7' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3417:8: enumLiteral_7= 'L7'
                    {
                    enumLiteral_7=(Token)match(input,74,FOLLOW_74_in_ruleProtectionLevelType8085); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL7EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getProtectionLevelTypeAccess().getL7EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3423:6: (enumLiteral_8= 'L8' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3423:6: (enumLiteral_8= 'L8' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3423:8: enumLiteral_8= 'L8'
                    {
                    enumLiteral_8=(Token)match(input,75,FOLLOW_75_in_ruleProtectionLevelType8102); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL8EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getProtectionLevelTypeAccess().getL8EnumLiteralDeclaration_8()); 
                        

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
    // $ANTLR end "ruleProtectionLevelType"


    // $ANTLR start "ruleImplicitEqInterfaceMemberDefinitionAttribute"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3433:1: ruleImplicitEqInterfaceMemberDefinitionAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'Name' ) | (enumLiteral_1= 'System' ) | (enumLiteral_2= 'SubAta' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) | (enumLiteral_10= 'Resource' ) | (enumLiteral_11= 'ResourceX' ) | (enumLiteral_12= 'ResourceY' ) | (enumLiteral_13= 'ResourceZ' ) ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3435:28: ( ( (enumLiteral_0= 'Name' ) | (enumLiteral_1= 'System' ) | (enumLiteral_2= 'SubAta' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) | (enumLiteral_10= 'Resource' ) | (enumLiteral_11= 'ResourceX' ) | (enumLiteral_12= 'ResourceY' ) | (enumLiteral_13= 'ResourceZ' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3436:1: ( (enumLiteral_0= 'Name' ) | (enumLiteral_1= 'System' ) | (enumLiteral_2= 'SubAta' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) | (enumLiteral_10= 'Resource' ) | (enumLiteral_11= 'ResourceX' ) | (enumLiteral_12= 'ResourceY' ) | (enumLiteral_13= 'ResourceZ' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3436:1: ( (enumLiteral_0= 'Name' ) | (enumLiteral_1= 'System' ) | (enumLiteral_2= 'SubAta' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) | (enumLiteral_10= 'Resource' ) | (enumLiteral_11= 'ResourceX' ) | (enumLiteral_12= 'ResourceY' ) | (enumLiteral_13= 'ResourceZ' ) )
            int alt47=14;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt47=1;
                }
                break;
            case 49:
                {
                alt47=2;
                }
                break;
            case 50:
                {
                alt47=3;
                }
                break;
            case 52:
                {
                alt47=4;
                }
                break;
            case 53:
                {
                alt47=5;
                }
                break;
            case 54:
                {
                alt47=6;
                }
                break;
            case 55:
                {
                alt47=7;
                }
                break;
            case 56:
                {
                alt47=8;
                }
                break;
            case 57:
                {
                alt47=9;
                }
                break;
            case 35:
                {
                alt47=10;
                }
                break;
            case 51:
                {
                alt47=11;
                }
                break;
            case 38:
                {
                alt47=12;
                }
                break;
            case 39:
                {
                alt47=13;
                }
                break;
            case 40:
                {
                alt47=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3436:2: (enumLiteral_0= 'Name' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3436:2: (enumLiteral_0= 'Name' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3436:4: enumLiteral_0= 'Name'
                    {
                    enumLiteral_0=(Token)match(input,13,FOLLOW_13_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8147); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getNAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getNAMEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3442:6: (enumLiteral_1= 'System' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3442:6: (enumLiteral_1= 'System' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3442:8: enumLiteral_1= 'System'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8164); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getSYSTEMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getSYSTEMEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3448:6: (enumLiteral_2= 'SubAta' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3448:6: (enumLiteral_2= 'SubAta' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3448:8: enumLiteral_2= 'SubAta'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_50_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8181); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getSUBATAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getSUBATAEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3454:6: (enumLiteral_3= 'LineName' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3454:6: (enumLiteral_3= 'LineName' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3454:8: enumLiteral_3= 'LineName'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_52_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8198); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getLINENAMEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getLINENAMEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3460:6: (enumLiteral_4= 'WiringLane' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3460:6: (enumLiteral_4= 'WiringLane' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3460:8: enumLiteral_4= 'WiringLane'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_53_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8215); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getWIRINGLANEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getWIRINGLANEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3466:6: (enumLiteral_5= 'GrpInfo' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3466:6: (enumLiteral_5= 'GrpInfo' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3466:8: enumLiteral_5= 'GrpInfo'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_54_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8232); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getGRPINFOEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getGRPINFOEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3472:6: (enumLiteral_6= 'Route' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3472:6: (enumLiteral_6= 'Route' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3472:8: enumLiteral_6= 'Route'
                    {
                    enumLiteral_6=(Token)match(input,55,FOLLOW_55_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8249); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getROUTEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getROUTEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3478:6: (enumLiteral_7= 'PwSup1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3478:6: (enumLiteral_7= 'PwSup1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3478:8: enumLiteral_7= 'PwSup1'
                    {
                    enumLiteral_7=(Token)match(input,56,FOLLOW_56_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8266); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getPWSUP1EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getPWSUP1EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3484:6: (enumLiteral_8= 'EmhZone1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3484:6: (enumLiteral_8= 'EmhZone1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3484:8: enumLiteral_8= 'EmhZone1'
                    {
                    enumLiteral_8=(Token)match(input,57,FOLLOW_57_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8283); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getEMHZONE1EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getEMHZONE1EnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3490:6: (enumLiteral_9= 'Type' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3490:6: (enumLiteral_9= 'Type' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3490:8: enumLiteral_9= 'Type'
                    {
                    enumLiteral_9=(Token)match(input,35,FOLLOW_35_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8300); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getIOTYPEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getIOTYPEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3496:6: (enumLiteral_10= 'Resource' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3496:6: (enumLiteral_10= 'Resource' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3496:8: enumLiteral_10= 'Resource'
                    {
                    enumLiteral_10=(Token)match(input,51,FOLLOW_51_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8317); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCEEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3502:6: (enumLiteral_11= 'ResourceX' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3502:6: (enumLiteral_11= 'ResourceX' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3502:8: enumLiteral_11= 'ResourceX'
                    {
                    enumLiteral_11=(Token)match(input,38,FOLLOW_38_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8334); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_XEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_XEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3508:6: (enumLiteral_12= 'ResourceY' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3508:6: (enumLiteral_12= 'ResourceY' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3508:8: enumLiteral_12= 'ResourceY'
                    {
                    enumLiteral_12=(Token)match(input,39,FOLLOW_39_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8351); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_YEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_YEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3514:6: (enumLiteral_13= 'ResourceZ' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3514:6: (enumLiteral_13= 'ResourceZ' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3514:8: enumLiteral_13= 'ResourceZ'
                    {
                    enumLiteral_13=(Token)match(input,40,FOLLOW_40_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8368); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3524:1: ruleHardwareArchitectureLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) ) ;
    public final Enumerator ruleHardwareArchitectureLevelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3526:28: ( ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3527:1: ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3527:1: ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt48=1;
                }
                break;
            case 34:
                {
                alt48=2;
                }
                break;
            case 41:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3527:2: (enumLiteral_0= 'Compartment' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3527:2: (enumLiteral_0= 'Compartment' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3527:4: enumLiteral_0= 'Compartment'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_29_in_ruleHardwareArchitectureLevelType8413); 

                            current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOMPARTMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOMPARTMENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3533:6: (enumLiteral_1= 'RDC' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3533:6: (enumLiteral_1= 'RDC' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3533:8: enumLiteral_1= 'RDC'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_34_in_ruleHardwareArchitectureLevelType8430); 

                            current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getRDCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getHardwareArchitectureLevelTypeAccess().getRDCEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3539:6: (enumLiteral_2= 'Connector' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3539:6: (enumLiteral_2= 'Connector' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3539:8: enumLiteral_2= 'Connector'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_41_in_ruleHardwareArchitectureLevelType8447); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3549:1: ruleDeploymentImplicitDefinitionAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'Compartment.Name' ) | (enumLiteral_1= 'Compartment.Manufacturer' ) | (enumLiteral_2= 'Compartment.PowerSupply' ) | (enumLiteral_3= 'Compartment.Side' ) | (enumLiteral_4= 'Compartment.Zone' ) | (enumLiteral_5= 'RDC.Name' ) | (enumLiteral_6= 'RDC.Manufacturer' ) | (enumLiteral_7= 'RDC.PowerSupply' ) | (enumLiteral_8= 'RDC.Side' ) | (enumLiteral_9= 'RDC.Type' ) | (enumLiteral_10= 'RDC.ESS' ) | (enumLiteral_11= 'RDC.ResourceX' ) | (enumLiteral_12= 'RDC.ResourceY' ) | (enumLiteral_13= 'RDC.ResourceZ' ) | (enumLiteral_14= 'Connector.Name' ) ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3551:28: ( ( (enumLiteral_0= 'Compartment.Name' ) | (enumLiteral_1= 'Compartment.Manufacturer' ) | (enumLiteral_2= 'Compartment.PowerSupply' ) | (enumLiteral_3= 'Compartment.Side' ) | (enumLiteral_4= 'Compartment.Zone' ) | (enumLiteral_5= 'RDC.Name' ) | (enumLiteral_6= 'RDC.Manufacturer' ) | (enumLiteral_7= 'RDC.PowerSupply' ) | (enumLiteral_8= 'RDC.Side' ) | (enumLiteral_9= 'RDC.Type' ) | (enumLiteral_10= 'RDC.ESS' ) | (enumLiteral_11= 'RDC.ResourceX' ) | (enumLiteral_12= 'RDC.ResourceY' ) | (enumLiteral_13= 'RDC.ResourceZ' ) | (enumLiteral_14= 'Connector.Name' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3552:1: ( (enumLiteral_0= 'Compartment.Name' ) | (enumLiteral_1= 'Compartment.Manufacturer' ) | (enumLiteral_2= 'Compartment.PowerSupply' ) | (enumLiteral_3= 'Compartment.Side' ) | (enumLiteral_4= 'Compartment.Zone' ) | (enumLiteral_5= 'RDC.Name' ) | (enumLiteral_6= 'RDC.Manufacturer' ) | (enumLiteral_7= 'RDC.PowerSupply' ) | (enumLiteral_8= 'RDC.Side' ) | (enumLiteral_9= 'RDC.Type' ) | (enumLiteral_10= 'RDC.ESS' ) | (enumLiteral_11= 'RDC.ResourceX' ) | (enumLiteral_12= 'RDC.ResourceY' ) | (enumLiteral_13= 'RDC.ResourceZ' ) | (enumLiteral_14= 'Connector.Name' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3552:1: ( (enumLiteral_0= 'Compartment.Name' ) | (enumLiteral_1= 'Compartment.Manufacturer' ) | (enumLiteral_2= 'Compartment.PowerSupply' ) | (enumLiteral_3= 'Compartment.Side' ) | (enumLiteral_4= 'Compartment.Zone' ) | (enumLiteral_5= 'RDC.Name' ) | (enumLiteral_6= 'RDC.Manufacturer' ) | (enumLiteral_7= 'RDC.PowerSupply' ) | (enumLiteral_8= 'RDC.Side' ) | (enumLiteral_9= 'RDC.Type' ) | (enumLiteral_10= 'RDC.ESS' ) | (enumLiteral_11= 'RDC.ResourceX' ) | (enumLiteral_12= 'RDC.ResourceY' ) | (enumLiteral_13= 'RDC.ResourceZ' ) | (enumLiteral_14= 'Connector.Name' ) )
            int alt49=15;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt49=1;
                }
                break;
            case 77:
                {
                alt49=2;
                }
                break;
            case 78:
                {
                alt49=3;
                }
                break;
            case 79:
                {
                alt49=4;
                }
                break;
            case 80:
                {
                alt49=5;
                }
                break;
            case 81:
                {
                alt49=6;
                }
                break;
            case 82:
                {
                alt49=7;
                }
                break;
            case 83:
                {
                alt49=8;
                }
                break;
            case 84:
                {
                alt49=9;
                }
                break;
            case 85:
                {
                alt49=10;
                }
                break;
            case 86:
                {
                alt49=11;
                }
                break;
            case 87:
                {
                alt49=12;
                }
                break;
            case 88:
                {
                alt49=13;
                }
                break;
            case 89:
                {
                alt49=14;
                }
                break;
            case 90:
                {
                alt49=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3552:2: (enumLiteral_0= 'Compartment.Name' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3552:2: (enumLiteral_0= 'Compartment.Name' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3552:4: enumLiteral_0= 'Compartment.Name'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_76_in_ruleDeploymentImplicitDefinitionAttribute8492); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_NAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_NAMEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3558:6: (enumLiteral_1= 'Compartment.Manufacturer' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3558:6: (enumLiteral_1= 'Compartment.Manufacturer' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3558:8: enumLiteral_1= 'Compartment.Manufacturer'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_77_in_ruleDeploymentImplicitDefinitionAttribute8509); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_MANUFACTUREREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_MANUFACTUREREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3564:6: (enumLiteral_2= 'Compartment.PowerSupply' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3564:6: (enumLiteral_2= 'Compartment.PowerSupply' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3564:8: enumLiteral_2= 'Compartment.PowerSupply'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_78_in_ruleDeploymentImplicitDefinitionAttribute8526); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_POWERSUPPLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_POWERSUPPLYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3570:6: (enumLiteral_3= 'Compartment.Side' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3570:6: (enumLiteral_3= 'Compartment.Side' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3570:8: enumLiteral_3= 'Compartment.Side'
                    {
                    enumLiteral_3=(Token)match(input,79,FOLLOW_79_in_ruleDeploymentImplicitDefinitionAttribute8543); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_SIDEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_SIDEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3576:6: (enumLiteral_4= 'Compartment.Zone' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3576:6: (enumLiteral_4= 'Compartment.Zone' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3576:8: enumLiteral_4= 'Compartment.Zone'
                    {
                    enumLiteral_4=(Token)match(input,80,FOLLOW_80_in_ruleDeploymentImplicitDefinitionAttribute8560); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_ZONEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_ZONEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3582:6: (enumLiteral_5= 'RDC.Name' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3582:6: (enumLiteral_5= 'RDC.Name' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3582:8: enumLiteral_5= 'RDC.Name'
                    {
                    enumLiteral_5=(Token)match(input,81,FOLLOW_81_in_ruleDeploymentImplicitDefinitionAttribute8577); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_NAMEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_NAMEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3588:6: (enumLiteral_6= 'RDC.Manufacturer' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3588:6: (enumLiteral_6= 'RDC.Manufacturer' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3588:8: enumLiteral_6= 'RDC.Manufacturer'
                    {
                    enumLiteral_6=(Token)match(input,82,FOLLOW_82_in_ruleDeploymentImplicitDefinitionAttribute8594); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_MANUFACTUREREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_MANUFACTUREREnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3594:6: (enumLiteral_7= 'RDC.PowerSupply' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3594:6: (enumLiteral_7= 'RDC.PowerSupply' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3594:8: enumLiteral_7= 'RDC.PowerSupply'
                    {
                    enumLiteral_7=(Token)match(input,83,FOLLOW_83_in_ruleDeploymentImplicitDefinitionAttribute8611); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_POWERSUPPLYEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_POWERSUPPLYEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3600:6: (enumLiteral_8= 'RDC.Side' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3600:6: (enumLiteral_8= 'RDC.Side' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3600:8: enumLiteral_8= 'RDC.Side'
                    {
                    enumLiteral_8=(Token)match(input,84,FOLLOW_84_in_ruleDeploymentImplicitDefinitionAttribute8628); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_SIDEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_SIDEEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3606:6: (enumLiteral_9= 'RDC.Type' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3606:6: (enumLiteral_9= 'RDC.Type' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3606:8: enumLiteral_9= 'RDC.Type'
                    {
                    enumLiteral_9=(Token)match(input,85,FOLLOW_85_in_ruleDeploymentImplicitDefinitionAttribute8645); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_TYPEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_TYPEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3612:6: (enumLiteral_10= 'RDC.ESS' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3612:6: (enumLiteral_10= 'RDC.ESS' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3612:8: enumLiteral_10= 'RDC.ESS'
                    {
                    enumLiteral_10=(Token)match(input,86,FOLLOW_86_in_ruleDeploymentImplicitDefinitionAttribute8662); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_ESSEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_ESSEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3618:6: (enumLiteral_11= 'RDC.ResourceX' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3618:6: (enumLiteral_11= 'RDC.ResourceX' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3618:8: enumLiteral_11= 'RDC.ResourceX'
                    {
                    enumLiteral_11=(Token)match(input,87,FOLLOW_87_in_ruleDeploymentImplicitDefinitionAttribute8679); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_XEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_XEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3624:6: (enumLiteral_12= 'RDC.ResourceY' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3624:6: (enumLiteral_12= 'RDC.ResourceY' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3624:8: enumLiteral_12= 'RDC.ResourceY'
                    {
                    enumLiteral_12=(Token)match(input,88,FOLLOW_88_in_ruleDeploymentImplicitDefinitionAttribute8696); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_YEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_YEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3630:6: (enumLiteral_13= 'RDC.ResourceZ' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3630:6: (enumLiteral_13= 'RDC.ResourceZ' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3630:8: enumLiteral_13= 'RDC.ResourceZ'
                    {
                    enumLiteral_13=(Token)match(input,89,FOLLOW_89_in_ruleDeploymentImplicitDefinitionAttribute8713); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_ZEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_ZEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3636:6: (enumLiteral_14= 'Connector.Name' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3636:6: (enumLiteral_14= 'Connector.Name' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3636:8: enumLiteral_14= 'Connector.Name'
                    {
                    enumLiteral_14=(Token)match(input,90,FOLLOW_90_in_ruleDeploymentImplicitDefinitionAttribute8730); 

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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA8_eotS =
        "\11\uffff";
    static final String DFA8_eofS =
        "\11\uffff";
    static final String DFA8_minS =
        "\1\6\1\uffff\1\32\2\uffff\1\6\2\uffff\1\32";
    static final String DFA8_maxS =
        "\1\77\1\uffff\1\73\2\uffff\1\6\2\uffff\1\73";
    static final String DFA8_acceptS =
        "\1\uffff\1\5\1\uffff\1\3\1\4\1\uffff\1\2\1\1\1\uffff";
    static final String DFA8_specialS =
        "\11\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\12\uffff\1\1\52\uffff\1\3\2\uffff\1\4",
            "",
            "\1\5\37\uffff\1\7\1\6",
            "",
            "",
            "\1\10",
            "",
            "",
            "\1\5\37\uffff\1\7\1\6"
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
            return "()* loopback of 358:1: ( ( (lv_dislocalityRelations_26_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_27_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_28_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_29_0= ruleInvalidDeployment ) ) )*";
        }
    }
    static final String DFA18_eotS =
        "\13\uffff";
    static final String DFA18_eofS =
        "\13\uffff";
    static final String DFA18_minS =
        "\1\21\12\uffff";
    static final String DFA18_maxS =
        "\1\51\12\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA18_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\14\uffff\1\2\1\3\3\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
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
            return "()+ loopback of 1152:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Type' otherlv_13= '=' ( (lv_rdcType_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'ESS' otherlv_17= '=' ( (lv_ess_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ResourceX' otherlv_25= '=' ( (lv_resourceX_26_0= ruleSIGNEDINT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceY' otherlv_29= '=' ( (lv_resourceY_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceZ' otherlv_33= '=' ( (lv_resourceZ_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_36_0= ruleConnector ) ) )+ ) ) )+";
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
                        if ( (LA18_0==17) ) {s = 1;}

                        else if ( LA18_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA18_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA18_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA18_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA18_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA18_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA18_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA18_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA18_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                         
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
    static final String DFA30_eotS =
        "\17\uffff";
    static final String DFA30_eofS =
        "\17\uffff";
    static final String DFA30_minS =
        "\1\21\16\uffff";
    static final String DFA30_maxS =
        "\1\71\16\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\16\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15";
    static final String DFA30_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1\21\uffff\1\13\2\uffff\1\14\1\15\1\16\10\uffff\1\2\1\3"+
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
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

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "()* loopback of 2152:3: ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_0==17) ) {s = 1;}

                        else if ( LA30_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA30_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA30_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA30_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA30_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA30_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA30_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA30_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA30_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA30_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                        else if ( LA30_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 10) ) {s = 12;}

                        else if ( LA30_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 11) ) {s = 13;}

                        else if ( LA30_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 12) ) {s = 14;}

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleAssistModel_in_entryRuleAssistModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssistModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAssistModel122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel134 = new BitSet(new long[]{0x0000000008232000L});
    public static final BitSet FOLLOW_13_in_ruleAssistModel192 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAssistModel204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssistModel221 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAssistModel238 = new BitSet(new long[]{0x0000000008232000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel306 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel318 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleCompatibleIoTypeEntry_in_ruleAssistModel339 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleAssistModel352 = new BitSet(new long[]{0x0000000008232000L});
    public static final BitSet FOLLOW_ruleCableWeightData_in_ruleAssistModel428 = new BitSet(new long[]{0x0000000008232000L});
    public static final BitSet FOLLOW_ruleProtectionLevelData_in_ruleAssistModel503 = new BitSet(new long[]{0x0000000008232000L});
    public static final BitSet FOLLOW_17_in_ruleAssistModel555 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleCompartment_in_ruleAssistModel576 = new BitSet(new long[]{0x00000000201C0002L});
    public static final BitSet FOLLOW_18_in_ruleAssistModel590 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel602 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleEqInterface_in_ruleAssistModel623 = new BitSet(new long[]{0x0001000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAssistModel636 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_ruleAssistModel651 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel663 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroup_in_ruleAssistModel685 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroupWithCombinedDefinition_in_ruleAssistModel712 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_17_in_ruleAssistModel726 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleAssistModel741 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel753 = new BitSet(new long[]{0x9000000000020040L});
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_ruleAssistModel775 = new BitSet(new long[]{0x9000000000020040L});
    public static final BitSet FOLLOW_ruleColocalityRelation_in_ruleAssistModel802 = new BitSet(new long[]{0x9000000000020040L});
    public static final BitSet FOLLOW_ruleValidDeployment_in_ruleAssistModel829 = new BitSet(new long[]{0x9000000000020040L});
    public static final BitSet FOLLOW_ruleInvalidDeployment_in_ruleAssistModel856 = new BitSet(new long[]{0x9000000000020040L});
    public static final BitSet FOLLOW_17_in_ruleAssistModel870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtectionLevelData_in_entryRuleProtectionLevelData908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtectionLevelData918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleProtectionLevelData955 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProtectionLevelData967 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleProtectionLevelEntry_in_ruleProtectionLevelData988 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_17_in_ruleProtectionLevelData1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtectionLevelEntry_in_entryRuleProtectionLevelEntry1037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtectionLevelEntry1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleProtectionLevelEntry1084 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProtectionLevelEntry1096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProtectionLevelEntry1113 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleProtectionLevelEntry1130 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleProtectionLevelEntry1142 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProtectionLevelEntry1154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProtectionLevelEntry1171 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleProtectionLevelEntry1188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000FF8L});
    public static final BitSet FOLLOW_ruleProtectionLevelType_in_ruleProtectionLevelEntry1209 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_ruleProtectionLevelEntry1222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000FF8L});
    public static final BitSet FOLLOW_ruleProtectionLevelType_in_ruleProtectionLevelEntry1243 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_15_in_ruleProtectionLevelEntry1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompatibleIoTypeEntry_in_entryRuleCompatibleIoTypeEntry1293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompatibleIoTypeEntry1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompatibleIoTypeEntry1345 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCompatibleIoTypeEntry1362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompatibleIoTypeEntry1379 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_ruleCompatibleIoTypeEntry1397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompatibleIoTypeEntry1414 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_15_in_ruleCompatibleIoTypeEntry1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCableWeightData_in_entryRuleCableWeightData1469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCableWeightData1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCableWeightData1516 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCableWeightData1528 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleCableWeightEntry_in_ruleCableWeightData1549 = new BitSet(new long[]{0x0000000010020010L});
    public static final BitSet FOLLOW_17_in_ruleCableWeightData1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCableWeightEntry_in_entryRuleCableWeightEntry1598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCableWeightEntry1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCableWeightEntry1651 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_28_in_ruleCableWeightEntry1680 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCableWeightEntry1706 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCableWeightEntry1723 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCableWeightEntry1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartment_in_entryRuleCompartment1776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartment1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCompartment1823 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompartment1840 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompartment1857 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_30_in_ruleCompartment1915 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment1927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment1944 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment1961 = new BitSet(new long[]{0x00000007C0020000L});
    public static final BitSet FOLLOW_31_in_ruleCompartment2029 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment2041 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment2058 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment2075 = new BitSet(new long[]{0x00000007C0020000L});
    public static final BitSet FOLLOW_32_in_ruleCompartment2143 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment2155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment2172 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment2189 = new BitSet(new long[]{0x00000007C0020000L});
    public static final BitSet FOLLOW_33_in_ruleCompartment2257 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment2269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment2286 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment2303 = new BitSet(new long[]{0x00000007C0020000L});
    public static final BitSet FOLLOW_ruleRDC_in_ruleCompartment2379 = new BitSet(new long[]{0x00000007C0020000L});
    public static final BitSet FOLLOW_17_in_ruleCompartment2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDC_in_entryRuleRDC2474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRDC2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRDC2521 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRDC2538 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRDC2555 = new BitSet(new long[]{0x000003F8C0000000L});
    public static final BitSet FOLLOW_30_in_ruleRDC2613 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC2625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC2642 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC2659 = new BitSet(new long[]{0x000003F8C0020000L});
    public static final BitSet FOLLOW_31_in_ruleRDC2727 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC2739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC2756 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC2773 = new BitSet(new long[]{0x000003F8C0020000L});
    public static final BitSet FOLLOW_35_in_ruleRDC2841 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC2853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC2870 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC2887 = new BitSet(new long[]{0x000003F8C0020000L});
    public static final BitSet FOLLOW_36_in_ruleRDC2955 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC2967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC2984 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC3001 = new BitSet(new long[]{0x000003F8C0020000L});
    public static final BitSet FOLLOW_37_in_ruleRDC3069 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC3081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC3098 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC3115 = new BitSet(new long[]{0x000003F8C0020000L});
    public static final BitSet FOLLOW_38_in_ruleRDC3183 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC3195 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_ruleRDC3216 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC3228 = new BitSet(new long[]{0x000003F8C0020000L});
    public static final BitSet FOLLOW_39_in_ruleRDC3296 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC3308 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_ruleRDC3329 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC3341 = new BitSet(new long[]{0x000003F8C0020000L});
    public static final BitSet FOLLOW_40_in_ruleRDC3409 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC3421 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_ruleRDC3442 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC3454 = new BitSet(new long[]{0x000003F8C0020000L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleRDC3530 = new BitSet(new long[]{0x000003F8C0020000L});
    public static final BitSet FOLLOW_17_in_ruleRDC3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector3625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleConnector3672 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnector3689 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConnector3706 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleAvailableEqInterface_in_ruleConnector3727 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleConnector3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvailableEqInterface_in_entryRuleAvailableEqInterface3776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvailableEqInterface3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAvailableEqInterface3828 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAvailableEqInterface3845 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAvailableEqInterface3862 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_42_in_ruleAvailableEqInterface3880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000FF8L});
    public static final BitSet FOLLOW_ruleProtectionLevelType_in_ruleAvailableEqInterface3901 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAvailableEqInterface3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroup_in_entryRuleEqInterfaceGroup3951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterfaceGroup3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEqInterfaceGroup3998 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup4015 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterfaceGroup4032 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup4053 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup4080 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_26_in_ruleEqInterfaceGroup4094 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup4115 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup4142 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_17_in_ruleEqInterfaceGroup4157 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_44_in_ruleEqInterfaceGroup4170 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterfaceGroup4182 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup4203 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup4230 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_26_in_ruleEqInterfaceGroup4244 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup4265 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup4292 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_17_in_ruleEqInterfaceGroup4307 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterfaceGroup4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_entryRuleImplicitEqInterfaceMemberDefinition4357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitEqInterfaceMemberDefinition4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleImplicitEqInterfaceMemberDefinition4404 = new BitSet(new long[]{0x03FE01C800002000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_ruleImplicitEqInterfaceMemberDefinition4425 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleImplicitEqInterfaceMemberDefinition4438 = new BitSet(new long[]{0x03FE01C800002000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_ruleImplicitEqInterfaceMemberDefinition4459 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues4497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttribute_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues4553 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues4565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroupWithCombinedDefinition_in_entryRuleEqInterfaceGroupWithCombinedDefinition4623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterfaceGroupWithCombinedDefinition4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEqInterfaceGroupWithCombinedDefinition4670 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition4687 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleEqInterfaceGroupWithCombinedDefinition4704 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition4724 = new BitSet(new long[]{0x0000400000008000L});
    public static final BitSet FOLLOW_46_in_ruleEqInterfaceGroupWithCombinedDefinition4737 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition4757 = new BitSet(new long[]{0x0000400000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterfaceGroupWithCombinedDefinition4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterface_in_entryRuleEqInterface4807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterface4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleEqInterface4854 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterface4871 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterface4888 = new BitSet(new long[]{0x03FE01C800020000L});
    public static final BitSet FOLLOW_49_in_ruleEqInterface4946 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface4958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface4975 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface4992 = new BitSet(new long[]{0x03FE01C800020000L});
    public static final BitSet FOLLOW_50_in_ruleEqInterface5060 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5089 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5106 = new BitSet(new long[]{0x03FE01C800020000L});
    public static final BitSet FOLLOW_51_in_ruleEqInterface5174 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5203 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5220 = new BitSet(new long[]{0x03FE01C800020000L});
    public static final BitSet FOLLOW_52_in_ruleEqInterface5288 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5317 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5334 = new BitSet(new long[]{0x03FE01C800020000L});
    public static final BitSet FOLLOW_53_in_ruleEqInterface5402 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5431 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5448 = new BitSet(new long[]{0x03FE01C800020000L});
    public static final BitSet FOLLOW_54_in_ruleEqInterface5516 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5545 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5562 = new BitSet(new long[]{0x03FE01C800020000L});
    public static final BitSet FOLLOW_55_in_ruleEqInterface5630 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5659 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5676 = new BitSet(new long[]{0x03FE01C800020000L});
    public static final BitSet FOLLOW_56_in_ruleEqInterface5744 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5773 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5790 = new BitSet(new long[]{0x03FE01C800020000L});
    public static final BitSet FOLLOW_57_in_ruleEqInterface5858 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5870 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5887 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5904 = new BitSet(new long[]{0x03FE01C800020000L});
    public static final BitSet FOLLOW_35_in_ruleEqInterface5972 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface6001 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6018 = new BitSet(new long[]{0x03FE01C800020000L});
    public static final BitSet FOLLOW_38_in_ruleEqInterface6086 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6098 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6119 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6131 = new BitSet(new long[]{0x03FE01C800020000L});
    public static final BitSet FOLLOW_39_in_ruleEqInterface6199 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6211 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6232 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6244 = new BitSet(new long[]{0x03FE01C800020000L});
    public static final BitSet FOLLOW_40_in_ruleEqInterface6312 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6324 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6345 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6357 = new BitSet(new long[]{0x03FE01C800020000L});
    public static final BitSet FOLLOW_17_in_ruleEqInterface6410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation6446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDislocalityRelation6456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDislocalityRelation6501 = new BitSet(new long[]{0x0400000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDislocalityRelation6514 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDislocalityRelation6534 = new BitSet(new long[]{0x0400000004000000L});
    public static final BitSet FOLLOW_58_in_ruleDislocalityRelation6548 = new BitSet(new long[]{0x0000020420000000L});
    public static final BitSet FOLLOW_ruleHardwareArchitectureLevelType_in_ruleDislocalityRelation6569 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDislocalityRelation6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColocalityRelation_in_entryRuleColocalityRelation6617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColocalityRelation6627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColocalityRelation6672 = new BitSet(new long[]{0x0800000004000000L});
    public static final BitSet FOLLOW_26_in_ruleColocalityRelation6685 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColocalityRelation6705 = new BitSet(new long[]{0x0800000004000000L});
    public static final BitSet FOLLOW_59_in_ruleColocalityRelation6719 = new BitSet(new long[]{0x0000020420000000L});
    public static final BitSet FOLLOW_ruleHardwareArchitectureLevelType_in_ruleColocalityRelation6740 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleColocalityRelation6752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidDeployment_in_entryRuleValidDeployment6788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidDeployment6798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleValidDeployment6835 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidDeployment6855 = new BitSet(new long[]{0x6000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleValidDeployment6868 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidDeployment6888 = new BitSet(new long[]{0x6000000004000000L});
    public static final BitSet FOLLOW_61_in_ruleValidDeployment6903 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_62_in_ruleValidDeployment6921 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleValidDeployment6934 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleValidDeployment6958 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeployment6985 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_26_in_ruleValidDeployment6999 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleValidDeployment7023 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeployment7050 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_17_in_ruleValidDeployment7065 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleValidDeployment7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvalidDeployment_in_entryRuleInvalidDeployment7113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvalidDeployment7123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleInvalidDeployment7160 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvalidDeployment7180 = new BitSet(new long[]{0x6000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleInvalidDeployment7193 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvalidDeployment7213 = new BitSet(new long[]{0x6000000004000000L});
    public static final BitSet FOLLOW_61_in_ruleInvalidDeployment7228 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_62_in_ruleInvalidDeployment7246 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInvalidDeployment7259 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment7283 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeployment7310 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_26_in_ruleInvalidDeployment7324 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment7348 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeployment7375 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_17_in_ruleInvalidDeployment7390 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInvalidDeployment7402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_entryRuleDeploymentImplicitDefinition7438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinition7448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDeploymentImplicitDefinition7485 = new BitSet(new long[]{0x0000000000000000L,0x0000000007FFF000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_ruleDeploymentImplicitDefinition7506 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleDeploymentImplicitDefinition7519 = new BitSet(new long[]{0x0000000000000000L,0x0000000007FFF000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_ruleDeploymentImplicitDefinition7540 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_entryRuleDeploymentImplicitDefinitionAttributeAndValue7578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinitionAttributeAndValue7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinitionAttribute_in_ruleDeploymentImplicitDefinitionAttributeAndValue7634 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeploymentImplicitDefinitionAttributeAndValue7646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeploymentImplicitDefinitionAttributeAndValue7663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName7707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName7758 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleQualifiedName7777 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName7792 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_entryRuleSIGNEDINT7840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSIGNEDINT7851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleSIGNEDINT7890 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSIGNEDINT7907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleProtectionLevelType7966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleProtectionLevelType7983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleProtectionLevelType8000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleProtectionLevelType8017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleProtectionLevelType8034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleProtectionLevelType8051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleProtectionLevelType8068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleProtectionLevelType8085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleProtectionLevelType8102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleImplicitEqInterfaceMemberDefinitionAttribute8368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleHardwareArchitectureLevelType8413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleHardwareArchitectureLevelType8430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleHardwareArchitectureLevelType8447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleDeploymentImplicitDefinitionAttribute8492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDeploymentImplicitDefinitionAttribute8509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleDeploymentImplicitDefinitionAttribute8526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDeploymentImplicitDefinitionAttribute8543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDeploymentImplicitDefinitionAttribute8560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleDeploymentImplicitDefinitionAttribute8577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleDeploymentImplicitDefinitionAttribute8594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleDeploymentImplicitDefinitionAttribute8611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleDeploymentImplicitDefinitionAttribute8628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleDeploymentImplicitDefinitionAttribute8645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleDeploymentImplicitDefinitionAttribute8662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleDeploymentImplicitDefinitionAttribute8679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleDeploymentImplicitDefinitionAttribute8696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleDeploymentImplicitDefinitionAttribute8713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleDeploymentImplicitDefinitionAttribute8730 = new BitSet(new long[]{0x0000000000000002L});

}
