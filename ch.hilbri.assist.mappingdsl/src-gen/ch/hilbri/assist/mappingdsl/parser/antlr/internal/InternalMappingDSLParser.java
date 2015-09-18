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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Global'", "'{'", "'Name'", "'='", "';'", "'}'", "'Compatible Interface Types'", "'->'", "','", "'Cable Weights'", "'default'", "'Protection Level Restrictions'", "'RDC.Location'", "'And'", "'Equipment.EmhZone1'", "'Compartments'", "'Compartment'", "'Manufacturer'", "'PowerSupply'", "'Side'", "'Zone'", "'RDC'", "'PowerSupply1'", "'PowerSupply2'", "'Type'", "'ESS'", "'Location'", "'ResourceX'", "'ResourceY'", "'ResourceZ'", "'Connected Pins'", "'are connected'", "'Connector'", "':'", "'protection level'", "'Metric Parameters'", "'Interfaces'", "'Interface'", "'System'", "'SubAta'", "'Resource'", "'LineName'", "'WiringLane'", "'GrpInfo'", "'Route'", "'PwSup1'", "'EmhZone1'", "'InterfaceGroups'", "'Group'", "'without'", "'interfaces with'", "'and'", "'combines'", "'Restrictions'", "'dislocal up to'", "'on same'", "'Valid for'", "'are'", "'Invalid for'", "'connectors with'", "'.'", "'-'", "'None'", "'L1'", "'L2'", "'L3'", "'L4'", "'L5'", "'L6'", "'L7'", "'L8'", "'Compartment.Name'", "'Compartment.Manufacturer'", "'Compartment.PowerSupply'", "'Compartment.Side'", "'Compartment.Zone'", "'RDC.Name'", "'RDC.Manufacturer'", "'RDC.PowerSupply1'", "'RDC.PowerSupply2'", "'RDC.Side'", "'RDC.Type'", "'RDC.ESS'", "'RDC.ResourceX'", "'RDC.ResourceY'", "'RDC.ResourceZ'", "'Connector.Name'"
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
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
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
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:77:1: ruleAssistModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalBlock_1_0= ruleGlobalBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleAssistModel() throws RecognitionException {
        EObject current = null;

        EObject lv_globalBlock_1_0 = null;

        EObject lv_compartmentsBlock_2_0 = null;

        EObject lv_interfacesBlock_3_0 = null;

        EObject lv_interfaceGroupsBlock_4_0 = null;

        EObject lv_restrictionsBlock_5_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:80:28: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalBlock_1_0= ruleGlobalBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) ) ) ) ) )+ {...}?) ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalBlock_1_0= ruleGlobalBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) ) ) ) ) )+ {...}?) ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalBlock_1_0= ruleGlobalBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) ) ) ) ) )+ {...}?) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:83:1: ( ( ( ({...}? => ( ({...}? => ( (lv_globalBlock_1_0= ruleGlobalBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) ) ) ) ) )+ {...}?) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:83:1: ( ( ( ({...}? => ( ({...}? => ( (lv_globalBlock_1_0= ruleGlobalBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) ) ) ) ) )+ {...}?) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:84:2: ( ( ({...}? => ( ({...}? => ( (lv_globalBlock_1_0= ruleGlobalBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getAssistModelAccess().getUnorderedGroup());
            	
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:87:2: ( ( ({...}? => ( ({...}? => ( (lv_globalBlock_1_0= ruleGlobalBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) ) ) ) ) )+ {...}?)
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:88:3: ( ({...}? => ( ({...}? => ( (lv_globalBlock_1_0= ruleGlobalBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) ) ) ) ) )+ {...}?
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:88:3: ( ({...}? => ( ({...}? => ( (lv_globalBlock_1_0= ruleGlobalBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=6;
                int LA1_0 = input.LA(1);

                if ( LA1_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 2) ) {
                    alt1=3;
                }
                else if ( LA1_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 3) ) {
                    alt1=4;
                }
                else if ( LA1_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 4) ) {
                    alt1=5;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:90:4: ({...}? => ( ({...}? => ( (lv_globalBlock_1_0= ruleGlobalBlock ) ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:90:4: ({...}? => ( ({...}? => ( (lv_globalBlock_1_0= ruleGlobalBlock ) ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:91:5: {...}? => ( ({...}? => ( (lv_globalBlock_1_0= ruleGlobalBlock ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:91:106: ( ({...}? => ( (lv_globalBlock_1_0= ruleGlobalBlock ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:92:6: ({...}? => ( (lv_globalBlock_1_0= ruleGlobalBlock ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:95:6: ({...}? => ( (lv_globalBlock_1_0= ruleGlobalBlock ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:95:7: {...}? => ( (lv_globalBlock_1_0= ruleGlobalBlock ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:95:16: ( (lv_globalBlock_1_0= ruleGlobalBlock ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:96:1: (lv_globalBlock_1_0= ruleGlobalBlock )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:96:1: (lv_globalBlock_1_0= ruleGlobalBlock )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:97:3: lv_globalBlock_1_0= ruleGlobalBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getGlobalBlockGlobalBlockParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGlobalBlock_in_ruleAssistModel175);
            	    lv_globalBlock_1_0=ruleGlobalBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"globalBlock",
            	            		lv_globalBlock_1_0, 
            	            		"GlobalBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssistModelAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:120:4: ({...}? => ( ({...}? => ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:120:4: ({...}? => ( ({...}? => ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:121:5: {...}? => ( ({...}? => ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:121:106: ( ({...}? => ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:122:6: ({...}? => ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:125:6: ({...}? => ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:125:7: {...}? => ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:125:16: ( (lv_compartmentsBlock_2_0= ruleCompartmentsBlock ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:126:1: (lv_compartmentsBlock_2_0= ruleCompartmentsBlock )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:126:1: (lv_compartmentsBlock_2_0= ruleCompartmentsBlock )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:127:3: lv_compartmentsBlock_2_0= ruleCompartmentsBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getCompartmentsBlockCompartmentsBlockParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompartmentsBlock_in_ruleAssistModel250);
            	    lv_compartmentsBlock_2_0=ruleCompartmentsBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"compartmentsBlock",
            	            		lv_compartmentsBlock_2_0, 
            	            		"CompartmentsBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssistModelAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:150:4: ({...}? => ( ({...}? => ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:150:4: ({...}? => ( ({...}? => ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:151:5: {...}? => ( ({...}? => ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:151:106: ( ({...}? => ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:152:6: ({...}? => ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:155:6: ({...}? => ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:155:7: {...}? => ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:155:16: ( (lv_interfacesBlock_3_0= ruleInterfacesBlock ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:156:1: (lv_interfacesBlock_3_0= ruleInterfacesBlock )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:156:1: (lv_interfacesBlock_3_0= ruleInterfacesBlock )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:157:3: lv_interfacesBlock_3_0= ruleInterfacesBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getInterfacesBlockInterfacesBlockParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterfacesBlock_in_ruleAssistModel325);
            	    lv_interfacesBlock_3_0=ruleInterfacesBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"interfacesBlock",
            	            		lv_interfacesBlock_3_0, 
            	            		"InterfacesBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssistModelAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:180:4: ({...}? => ( ({...}? => ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:180:4: ({...}? => ( ({...}? => ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:181:5: {...}? => ( ({...}? => ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 3)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:181:106: ( ({...}? => ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:182:6: ({...}? => ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:185:6: ({...}? => ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:185:7: {...}? => ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:185:16: ( (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:186:1: (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:186:1: (lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:187:3: lv_interfaceGroupsBlock_4_0= ruleInterfaceGroupsBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getInterfaceGroupsBlockInterfaceGroupsBlockParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterfaceGroupsBlock_in_ruleAssistModel400);
            	    lv_interfaceGroupsBlock_4_0=ruleInterfaceGroupsBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"interfaceGroupsBlock",
            	            		lv_interfaceGroupsBlock_4_0, 
            	            		"InterfaceGroupsBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssistModelAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:210:4: ({...}? => ( ({...}? => ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:210:4: ({...}? => ( ({...}? => ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:211:5: {...}? => ( ({...}? => ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 4)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:211:106: ( ({...}? => ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:212:6: ({...}? => ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssistModelAccess().getUnorderedGroup(), 4);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:215:6: ({...}? => ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:215:7: {...}? => ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssistModel", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:215:16: ( (lv_restrictionsBlock_5_0= ruleRestrictionsBlock ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:216:1: (lv_restrictionsBlock_5_0= ruleRestrictionsBlock )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:216:1: (lv_restrictionsBlock_5_0= ruleRestrictionsBlock )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:217:3: lv_restrictionsBlock_5_0= ruleRestrictionsBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getRestrictionsBlockRestrictionsBlockParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRestrictionsBlock_in_ruleAssistModel475);
            	    lv_restrictionsBlock_5_0=ruleRestrictionsBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"restrictionsBlock",
            	            		lv_restrictionsBlock_5_0, 
            	            		"RestrictionsBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssistModelAccess().getUnorderedGroup());
            	    	 				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAssistModelAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleAssistModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getAssistModelAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getAssistModelAccess().getUnorderedGroup());
            	

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


    // $ANTLR start "entryRuleGlobalBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:256:1: entryRuleGlobalBlock returns [EObject current=null] : iv_ruleGlobalBlock= ruleGlobalBlock EOF ;
    public final EObject entryRuleGlobalBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalBlock = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:257:2: (iv_ruleGlobalBlock= ruleGlobalBlock EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:258:2: iv_ruleGlobalBlock= ruleGlobalBlock EOF
            {
             newCompositeNode(grammarAccess.getGlobalBlockRule()); 
            pushFollow(FOLLOW_ruleGlobalBlock_in_entryRuleGlobalBlock556);
            iv_ruleGlobalBlock=ruleGlobalBlock();

            state._fsp--;

             current =iv_ruleGlobalBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalBlock566); 

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
    // $ANTLR end "entryRuleGlobalBlock"


    // $ANTLR start "ruleGlobalBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:265:1: ruleGlobalBlock returns [EObject current=null] : ( () otherlv_1= 'Global' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
    public final EObject ruleGlobalBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_systemName_6_0=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        EObject lv_compatibleIoTypesBlock_8_0 = null;

        EObject lv_cableWeightDataBlock_9_0 = null;

        EObject lv_protectionLevelDataBlock_10_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:268:28: ( ( () otherlv_1= 'Global' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:269:1: ( () otherlv_1= 'Global' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:269:1: ( () otherlv_1= 'Global' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:269:2: () otherlv_1= 'Global' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:269:2: ()
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:270:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGlobalBlockAccess().getGlobalBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleGlobalBlock612); 

                	newLeafNode(otherlv_1, grammarAccess.getGlobalBlockAccess().getGlobalKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGlobalBlock624); 

                	newLeafNode(otherlv_2, grammarAccess.getGlobalBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:283:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) ) ) ) )* ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:285:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) ) ) ) )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:285:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) ) ) ) )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:286:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3());
            	
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:289:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) ) ) ) )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:290:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) ) ) ) )*
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:290:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) ) ) ) )*
            loop2:
            do {
                int alt2=5;
                int LA2_0 = input.LA(1);

                if ( LA2_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3(), 1) ) {
                    alt2=2;
                }
                else if ( LA2_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3(), 2) ) {
                    alt2=3;
                }
                else if ( LA2_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3(), 3) ) {
                    alt2=4;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:292:4: ({...}? => ( ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:292:4: ({...}? => ( ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:293:5: {...}? => ( ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGlobalBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:293:108: ( ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:294:6: ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:297:6: ({...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:297:7: {...}? => (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGlobalBlock", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:297:16: (otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:297:18: otherlv_4= 'Name' otherlv_5= '=' ( (lv_systemName_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleGlobalBlock682); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGlobalBlockAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleGlobalBlock694); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGlobalBlockAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:305:1: ( (lv_systemName_6_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:306:1: (lv_systemName_6_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:306:1: (lv_systemName_6_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:307:3: lv_systemName_6_0= RULE_STRING
            	    {
            	    lv_systemName_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlobalBlock711); 

            	    			newLeafNode(lv_systemName_6_0, grammarAccess.getGlobalBlockAccess().getSystemNameSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGlobalBlockRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"systemName",
            	            		lv_systemName_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleGlobalBlock728); 

            	        	newLeafNode(otherlv_7, grammarAccess.getGlobalBlockAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:334:4: ({...}? => ( ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:334:4: ({...}? => ( ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:335:5: {...}? => ( ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGlobalBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:335:108: ( ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:336:6: ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:339:6: ({...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:339:7: {...}? => ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGlobalBlock", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:339:16: ( (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:340:1: (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:340:1: (lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:341:3: lv_compatibleIoTypesBlock_8_0= ruleCompatibleIoTypesBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGlobalBlockAccess().getCompatibleIoTypesBlockCompatibleIoTypesBlockParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompatibleIoTypesBlock_in_ruleGlobalBlock804);
            	    lv_compatibleIoTypesBlock_8_0=ruleCompatibleIoTypesBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGlobalBlockRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"compatibleIoTypesBlock",
            	            		lv_compatibleIoTypesBlock_8_0, 
            	            		"CompatibleIoTypesBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:364:4: ({...}? => ( ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:364:4: ({...}? => ( ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:365:5: {...}? => ( ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGlobalBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:365:108: ( ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:366:6: ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:369:6: ({...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:369:7: {...}? => ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGlobalBlock", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:369:16: ( (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:370:1: (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:370:1: (lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:371:3: lv_cableWeightDataBlock_9_0= ruleCableWeightDataBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGlobalBlockAccess().getCableWeightDataBlockCableWeightDataBlockParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCableWeightDataBlock_in_ruleGlobalBlock879);
            	    lv_cableWeightDataBlock_9_0=ruleCableWeightDataBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGlobalBlockRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"cableWeightDataBlock",
            	            		lv_cableWeightDataBlock_9_0, 
            	            		"CableWeightDataBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:394:4: ({...}? => ( ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:394:4: ({...}? => ( ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:395:5: {...}? => ( ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGlobalBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:395:108: ( ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:396:6: ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:399:6: ({...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:399:7: {...}? => ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGlobalBlock", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:399:16: ( (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:400:1: (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:400:1: (lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:401:3: lv_protectionLevelDataBlock_10_0= ruleProtectionLevelDataBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGlobalBlockAccess().getProtectionLevelDataBlockProtectionLevelDataBlockParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProtectionLevelDataBlock_in_ruleGlobalBlock954);
            	    lv_protectionLevelDataBlock_10_0=ruleProtectionLevelDataBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGlobalBlockRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"protectionLevelDataBlock",
            	            		lv_protectionLevelDataBlock_10_0, 
            	            		"ProtectionLevelDataBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3());
            	

            }

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleGlobalBlock1006); 

                	newLeafNode(otherlv_11, grammarAccess.getGlobalBlockAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleGlobalBlock"


    // $ANTLR start "entryRuleCompatibleIoTypesBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:443:1: entryRuleCompatibleIoTypesBlock returns [EObject current=null] : iv_ruleCompatibleIoTypesBlock= ruleCompatibleIoTypesBlock EOF ;
    public final EObject entryRuleCompatibleIoTypesBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompatibleIoTypesBlock = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:444:2: (iv_ruleCompatibleIoTypesBlock= ruleCompatibleIoTypesBlock EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:445:2: iv_ruleCompatibleIoTypesBlock= ruleCompatibleIoTypesBlock EOF
            {
             newCompositeNode(grammarAccess.getCompatibleIoTypesBlockRule()); 
            pushFollow(FOLLOW_ruleCompatibleIoTypesBlock_in_entryRuleCompatibleIoTypesBlock1042);
            iv_ruleCompatibleIoTypesBlock=ruleCompatibleIoTypesBlock();

            state._fsp--;

             current =iv_ruleCompatibleIoTypesBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompatibleIoTypesBlock1052); 

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
    // $ANTLR end "entryRuleCompatibleIoTypesBlock"


    // $ANTLR start "ruleCompatibleIoTypesBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:452:1: ruleCompatibleIoTypesBlock returns [EObject current=null] : (otherlv_0= 'Compatible Interface Types' otherlv_1= '{' ( (lv_compatibleIoTypes_2_0= ruleCompatibleIoTypeEntry ) )+ otherlv_3= '}' ) ;
    public final EObject ruleCompatibleIoTypesBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_compatibleIoTypes_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:455:28: ( (otherlv_0= 'Compatible Interface Types' otherlv_1= '{' ( (lv_compatibleIoTypes_2_0= ruleCompatibleIoTypeEntry ) )+ otherlv_3= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:456:1: (otherlv_0= 'Compatible Interface Types' otherlv_1= '{' ( (lv_compatibleIoTypes_2_0= ruleCompatibleIoTypeEntry ) )+ otherlv_3= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:456:1: (otherlv_0= 'Compatible Interface Types' otherlv_1= '{' ( (lv_compatibleIoTypes_2_0= ruleCompatibleIoTypeEntry ) )+ otherlv_3= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:456:3: otherlv_0= 'Compatible Interface Types' otherlv_1= '{' ( (lv_compatibleIoTypes_2_0= ruleCompatibleIoTypeEntry ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleCompatibleIoTypesBlock1089); 

                	newLeafNode(otherlv_0, grammarAccess.getCompatibleIoTypesBlockAccess().getCompatibleInterfaceTypesKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleCompatibleIoTypesBlock1101); 

                	newLeafNode(otherlv_1, grammarAccess.getCompatibleIoTypesBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:464:1: ( (lv_compatibleIoTypes_2_0= ruleCompatibleIoTypeEntry ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:465:1: (lv_compatibleIoTypes_2_0= ruleCompatibleIoTypeEntry )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:465:1: (lv_compatibleIoTypes_2_0= ruleCompatibleIoTypeEntry )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:466:3: lv_compatibleIoTypes_2_0= ruleCompatibleIoTypeEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompatibleIoTypesBlockAccess().getCompatibleIoTypesCompatibleIoTypeEntryParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompatibleIoTypeEntry_in_ruleCompatibleIoTypesBlock1122);
            	    lv_compatibleIoTypes_2_0=ruleCompatibleIoTypeEntry();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompatibleIoTypesBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"compatibleIoTypes",
            	            		lv_compatibleIoTypes_2_0, 
            	            		"CompatibleIoTypeEntry");
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleCompatibleIoTypesBlock1135); 

                	newLeafNode(otherlv_3, grammarAccess.getCompatibleIoTypesBlockAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleCompatibleIoTypesBlock"


    // $ANTLR start "entryRuleCompatibleIoTypeEntry"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:494:1: entryRuleCompatibleIoTypeEntry returns [EObject current=null] : iv_ruleCompatibleIoTypeEntry= ruleCompatibleIoTypeEntry EOF ;
    public final EObject entryRuleCompatibleIoTypeEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompatibleIoTypeEntry = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:495:2: (iv_ruleCompatibleIoTypeEntry= ruleCompatibleIoTypeEntry EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:496:2: iv_ruleCompatibleIoTypeEntry= ruleCompatibleIoTypeEntry EOF
            {
             newCompositeNode(grammarAccess.getCompatibleIoTypeEntryRule()); 
            pushFollow(FOLLOW_ruleCompatibleIoTypeEntry_in_entryRuleCompatibleIoTypeEntry1171);
            iv_ruleCompatibleIoTypeEntry=ruleCompatibleIoTypeEntry();

            state._fsp--;

             current =iv_ruleCompatibleIoTypeEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompatibleIoTypeEntry1181); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:503:1: ruleCompatibleIoTypeEntry returns [EObject current=null] : ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) otherlv_1= '->' ( (lv_pinInterfaceIoTypes_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_pinInterfaceIoTypes_4_0= RULE_STRING ) ) )* otherlv_5= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:506:28: ( ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) otherlv_1= '->' ( (lv_pinInterfaceIoTypes_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_pinInterfaceIoTypes_4_0= RULE_STRING ) ) )* otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:507:1: ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) otherlv_1= '->' ( (lv_pinInterfaceIoTypes_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_pinInterfaceIoTypes_4_0= RULE_STRING ) ) )* otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:507:1: ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) otherlv_1= '->' ( (lv_pinInterfaceIoTypes_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_pinInterfaceIoTypes_4_0= RULE_STRING ) ) )* otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:507:2: ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) otherlv_1= '->' ( (lv_pinInterfaceIoTypes_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_pinInterfaceIoTypes_4_0= RULE_STRING ) ) )* otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:507:2: ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:508:1: (lv_eqInterfaceIoType_0_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:508:1: (lv_eqInterfaceIoType_0_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:509:3: lv_eqInterfaceIoType_0_0= RULE_STRING
            {
            lv_eqInterfaceIoType_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompatibleIoTypeEntry1223); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleCompatibleIoTypeEntry1240); 

                	newLeafNode(otherlv_1, grammarAccess.getCompatibleIoTypeEntryAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:529:1: ( (lv_pinInterfaceIoTypes_2_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:530:1: (lv_pinInterfaceIoTypes_2_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:530:1: (lv_pinInterfaceIoTypes_2_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:531:3: lv_pinInterfaceIoTypes_2_0= RULE_STRING
            {
            lv_pinInterfaceIoTypes_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompatibleIoTypeEntry1257); 

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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:547:2: (otherlv_3= ',' ( (lv_pinInterfaceIoTypes_4_0= RULE_STRING ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:547:4: otherlv_3= ',' ( (lv_pinInterfaceIoTypes_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleCompatibleIoTypeEntry1275); 

            	        	newLeafNode(otherlv_3, grammarAccess.getCompatibleIoTypeEntryAccess().getCommaKeyword_3_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:551:1: ( (lv_pinInterfaceIoTypes_4_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:552:1: (lv_pinInterfaceIoTypes_4_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:552:1: (lv_pinInterfaceIoTypes_4_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:553:3: lv_pinInterfaceIoTypes_4_0= RULE_STRING
            	    {
            	    lv_pinInterfaceIoTypes_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompatibleIoTypeEntry1292); 

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
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleCompatibleIoTypeEntry1311); 

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


    // $ANTLR start "entryRuleCableWeightDataBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:581:1: entryRuleCableWeightDataBlock returns [EObject current=null] : iv_ruleCableWeightDataBlock= ruleCableWeightDataBlock EOF ;
    public final EObject entryRuleCableWeightDataBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCableWeightDataBlock = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:582:2: (iv_ruleCableWeightDataBlock= ruleCableWeightDataBlock EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:583:2: iv_ruleCableWeightDataBlock= ruleCableWeightDataBlock EOF
            {
             newCompositeNode(grammarAccess.getCableWeightDataBlockRule()); 
            pushFollow(FOLLOW_ruleCableWeightDataBlock_in_entryRuleCableWeightDataBlock1347);
            iv_ruleCableWeightDataBlock=ruleCableWeightDataBlock();

            state._fsp--;

             current =iv_ruleCableWeightDataBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCableWeightDataBlock1357); 

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
    // $ANTLR end "entryRuleCableWeightDataBlock"


    // $ANTLR start "ruleCableWeightDataBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:590:1: ruleCableWeightDataBlock returns [EObject current=null] : (otherlv_0= 'Cable Weights' otherlv_1= '{' ( (lv_cableWeightEntries_2_0= ruleCableWeightEntry ) )+ otherlv_3= '}' ) ;
    public final EObject ruleCableWeightDataBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cableWeightEntries_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:593:28: ( (otherlv_0= 'Cable Weights' otherlv_1= '{' ( (lv_cableWeightEntries_2_0= ruleCableWeightEntry ) )+ otherlv_3= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:594:1: (otherlv_0= 'Cable Weights' otherlv_1= '{' ( (lv_cableWeightEntries_2_0= ruleCableWeightEntry ) )+ otherlv_3= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:594:1: (otherlv_0= 'Cable Weights' otherlv_1= '{' ( (lv_cableWeightEntries_2_0= ruleCableWeightEntry ) )+ otherlv_3= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:594:3: otherlv_0= 'Cable Weights' otherlv_1= '{' ( (lv_cableWeightEntries_2_0= ruleCableWeightEntry ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleCableWeightDataBlock1394); 

                	newLeafNode(otherlv_0, grammarAccess.getCableWeightDataBlockAccess().getCableWeightsKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleCableWeightDataBlock1406); 

                	newLeafNode(otherlv_1, grammarAccess.getCableWeightDataBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:602:1: ( (lv_cableWeightEntries_2_0= ruleCableWeightEntry ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:603:1: (lv_cableWeightEntries_2_0= ruleCableWeightEntry )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:603:1: (lv_cableWeightEntries_2_0= ruleCableWeightEntry )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:604:3: lv_cableWeightEntries_2_0= ruleCableWeightEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCableWeightDataBlockAccess().getCableWeightEntriesCableWeightEntryParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCableWeightEntry_in_ruleCableWeightDataBlock1427);
            	    lv_cableWeightEntries_2_0=ruleCableWeightEntry();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCableWeightDataBlockRule());
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleCableWeightDataBlock1440); 

                	newLeafNode(otherlv_3, grammarAccess.getCableWeightDataBlockAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleCableWeightDataBlock"


    // $ANTLR start "entryRuleCableWeightEntry"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:632:1: entryRuleCableWeightEntry returns [EObject current=null] : iv_ruleCableWeightEntry= ruleCableWeightEntry EOF ;
    public final EObject entryRuleCableWeightEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCableWeightEntry = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:633:2: (iv_ruleCableWeightEntry= ruleCableWeightEntry EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:634:2: iv_ruleCableWeightEntry= ruleCableWeightEntry EOF
            {
             newCompositeNode(grammarAccess.getCableWeightEntryRule()); 
            pushFollow(FOLLOW_ruleCableWeightEntry_in_entryRuleCableWeightEntry1476);
            iv_ruleCableWeightEntry=ruleCableWeightEntry();

            state._fsp--;

             current =iv_ruleCableWeightEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCableWeightEntry1486); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:641:1: ruleCableWeightEntry returns [EObject current=null] : ( ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) | ( (lv_defaultEntry_1_0= 'default' ) ) ) otherlv_2= '=' ( (lv_weight_3_0= ruleDouble ) ) otherlv_4= ';' ) ;
    public final EObject ruleCableWeightEntry() throws RecognitionException {
        EObject current = null;

        Token lv_eqInterfaceIoType_0_0=null;
        Token lv_defaultEntry_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_weight_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:644:28: ( ( ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) | ( (lv_defaultEntry_1_0= 'default' ) ) ) otherlv_2= '=' ( (lv_weight_3_0= ruleDouble ) ) otherlv_4= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:645:1: ( ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) | ( (lv_defaultEntry_1_0= 'default' ) ) ) otherlv_2= '=' ( (lv_weight_3_0= ruleDouble ) ) otherlv_4= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:645:1: ( ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) | ( (lv_defaultEntry_1_0= 'default' ) ) ) otherlv_2= '=' ( (lv_weight_3_0= ruleDouble ) ) otherlv_4= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:645:2: ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) | ( (lv_defaultEntry_1_0= 'default' ) ) ) otherlv_2= '=' ( (lv_weight_3_0= ruleDouble ) ) otherlv_4= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:645:2: ( ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) ) | ( (lv_defaultEntry_1_0= 'default' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:645:3: ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:645:3: ( (lv_eqInterfaceIoType_0_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:646:1: (lv_eqInterfaceIoType_0_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:646:1: (lv_eqInterfaceIoType_0_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:647:3: lv_eqInterfaceIoType_0_0= RULE_STRING
                    {
                    lv_eqInterfaceIoType_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCableWeightEntry1529); 

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
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:664:6: ( (lv_defaultEntry_1_0= 'default' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:664:6: ( (lv_defaultEntry_1_0= 'default' ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:665:1: (lv_defaultEntry_1_0= 'default' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:665:1: (lv_defaultEntry_1_0= 'default' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:666:3: lv_defaultEntry_1_0= 'default'
                    {
                    lv_defaultEntry_1_0=(Token)match(input,21,FOLLOW_21_in_ruleCableWeightEntry1558); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleCableWeightEntry1584); 

                	newLeafNode(otherlv_2, grammarAccess.getCableWeightEntryAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:683:1: ( (lv_weight_3_0= ruleDouble ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:684:1: (lv_weight_3_0= ruleDouble )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:684:1: (lv_weight_3_0= ruleDouble )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:685:3: lv_weight_3_0= ruleDouble
            {
             
            	        newCompositeNode(grammarAccess.getCableWeightEntryAccess().getWeightDoubleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDouble_in_ruleCableWeightEntry1605);
            lv_weight_3_0=ruleDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCableWeightEntryRule());
            	        }
                   		set(
                   			current, 
                   			"weight",
                    		lv_weight_3_0, 
                    		"Double");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleCableWeightEntry1617); 

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


    // $ANTLR start "entryRuleProtectionLevelDataBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:713:1: entryRuleProtectionLevelDataBlock returns [EObject current=null] : iv_ruleProtectionLevelDataBlock= ruleProtectionLevelDataBlock EOF ;
    public final EObject entryRuleProtectionLevelDataBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtectionLevelDataBlock = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:714:2: (iv_ruleProtectionLevelDataBlock= ruleProtectionLevelDataBlock EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:715:2: iv_ruleProtectionLevelDataBlock= ruleProtectionLevelDataBlock EOF
            {
             newCompositeNode(grammarAccess.getProtectionLevelDataBlockRule()); 
            pushFollow(FOLLOW_ruleProtectionLevelDataBlock_in_entryRuleProtectionLevelDataBlock1653);
            iv_ruleProtectionLevelDataBlock=ruleProtectionLevelDataBlock();

            state._fsp--;

             current =iv_ruleProtectionLevelDataBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtectionLevelDataBlock1663); 

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
    // $ANTLR end "entryRuleProtectionLevelDataBlock"


    // $ANTLR start "ruleProtectionLevelDataBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:722:1: ruleProtectionLevelDataBlock returns [EObject current=null] : (otherlv_0= 'Protection Level Restrictions' otherlv_1= '{' ( (lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry ) )+ otherlv_3= '}' ) ;
    public final EObject ruleProtectionLevelDataBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_protectionLevelEntries_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:725:28: ( (otherlv_0= 'Protection Level Restrictions' otherlv_1= '{' ( (lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry ) )+ otherlv_3= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:726:1: (otherlv_0= 'Protection Level Restrictions' otherlv_1= '{' ( (lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry ) )+ otherlv_3= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:726:1: (otherlv_0= 'Protection Level Restrictions' otherlv_1= '{' ( (lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry ) )+ otherlv_3= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:726:3: otherlv_0= 'Protection Level Restrictions' otherlv_1= '{' ( (lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleProtectionLevelDataBlock1700); 

                	newLeafNode(otherlv_0, grammarAccess.getProtectionLevelDataBlockAccess().getProtectionLevelRestrictionsKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleProtectionLevelDataBlock1712); 

                	newLeafNode(otherlv_1, grammarAccess.getProtectionLevelDataBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:734:1: ( (lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:735:1: (lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:735:1: (lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:736:3: lv_protectionLevelEntries_2_0= ruleProtectionLevelEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProtectionLevelDataBlockAccess().getProtectionLevelEntriesProtectionLevelEntryParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProtectionLevelEntry_in_ruleProtectionLevelDataBlock1733);
            	    lv_protectionLevelEntries_2_0=ruleProtectionLevelEntry();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProtectionLevelDataBlockRule());
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleProtectionLevelDataBlock1746); 

                	newLeafNode(otherlv_3, grammarAccess.getProtectionLevelDataBlockAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleProtectionLevelDataBlock"


    // $ANTLR start "entryRuleProtectionLevelEntry"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:764:1: entryRuleProtectionLevelEntry returns [EObject current=null] : iv_ruleProtectionLevelEntry= ruleProtectionLevelEntry EOF ;
    public final EObject entryRuleProtectionLevelEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtectionLevelEntry = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:765:2: (iv_ruleProtectionLevelEntry= ruleProtectionLevelEntry EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:766:2: iv_ruleProtectionLevelEntry= ruleProtectionLevelEntry EOF
            {
             newCompositeNode(grammarAccess.getProtectionLevelEntryRule()); 
            pushFollow(FOLLOW_ruleProtectionLevelEntry_in_entryRuleProtectionLevelEntry1782);
            iv_ruleProtectionLevelEntry=ruleProtectionLevelEntry();

            state._fsp--;

             current =iv_ruleProtectionLevelEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtectionLevelEntry1792); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:773:1: ruleProtectionLevelEntry returns [EObject current=null] : (otherlv_0= 'RDC.Location' otherlv_1= '=' ( (lv_rdcLocation_2_0= RULE_STRING ) ) otherlv_3= 'And' otherlv_4= 'Equipment.EmhZone1' otherlv_5= '=' ( (lv_emhZone1_6_0= RULE_STRING ) ) otherlv_7= '->' ( (lv_protectionLevel_8_0= ruleProtectionLevelType ) ) (otherlv_9= ',' ( (lv_protectionLevel_10_0= ruleProtectionLevelType ) ) )* otherlv_11= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:776:28: ( (otherlv_0= 'RDC.Location' otherlv_1= '=' ( (lv_rdcLocation_2_0= RULE_STRING ) ) otherlv_3= 'And' otherlv_4= 'Equipment.EmhZone1' otherlv_5= '=' ( (lv_emhZone1_6_0= RULE_STRING ) ) otherlv_7= '->' ( (lv_protectionLevel_8_0= ruleProtectionLevelType ) ) (otherlv_9= ',' ( (lv_protectionLevel_10_0= ruleProtectionLevelType ) ) )* otherlv_11= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:777:1: (otherlv_0= 'RDC.Location' otherlv_1= '=' ( (lv_rdcLocation_2_0= RULE_STRING ) ) otherlv_3= 'And' otherlv_4= 'Equipment.EmhZone1' otherlv_5= '=' ( (lv_emhZone1_6_0= RULE_STRING ) ) otherlv_7= '->' ( (lv_protectionLevel_8_0= ruleProtectionLevelType ) ) (otherlv_9= ',' ( (lv_protectionLevel_10_0= ruleProtectionLevelType ) ) )* otherlv_11= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:777:1: (otherlv_0= 'RDC.Location' otherlv_1= '=' ( (lv_rdcLocation_2_0= RULE_STRING ) ) otherlv_3= 'And' otherlv_4= 'Equipment.EmhZone1' otherlv_5= '=' ( (lv_emhZone1_6_0= RULE_STRING ) ) otherlv_7= '->' ( (lv_protectionLevel_8_0= ruleProtectionLevelType ) ) (otherlv_9= ',' ( (lv_protectionLevel_10_0= ruleProtectionLevelType ) ) )* otherlv_11= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:777:3: otherlv_0= 'RDC.Location' otherlv_1= '=' ( (lv_rdcLocation_2_0= RULE_STRING ) ) otherlv_3= 'And' otherlv_4= 'Equipment.EmhZone1' otherlv_5= '=' ( (lv_emhZone1_6_0= RULE_STRING ) ) otherlv_7= '->' ( (lv_protectionLevel_8_0= ruleProtectionLevelType ) ) (otherlv_9= ',' ( (lv_protectionLevel_10_0= ruleProtectionLevelType ) ) )* otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleProtectionLevelEntry1829); 

                	newLeafNode(otherlv_0, grammarAccess.getProtectionLevelEntryAccess().getRDCLocationKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleProtectionLevelEntry1841); 

                	newLeafNode(otherlv_1, grammarAccess.getProtectionLevelEntryAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:785:1: ( (lv_rdcLocation_2_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:786:1: (lv_rdcLocation_2_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:786:1: (lv_rdcLocation_2_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:787:3: lv_rdcLocation_2_0= RULE_STRING
            {
            lv_rdcLocation_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProtectionLevelEntry1858); 

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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleProtectionLevelEntry1875); 

                	newLeafNode(otherlv_3, grammarAccess.getProtectionLevelEntryAccess().getAndKeyword_3());
                
            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleProtectionLevelEntry1887); 

                	newLeafNode(otherlv_4, grammarAccess.getProtectionLevelEntryAccess().getEquipmentEmhZone1Keyword_4());
                
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleProtectionLevelEntry1899); 

                	newLeafNode(otherlv_5, grammarAccess.getProtectionLevelEntryAccess().getEqualsSignKeyword_5());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:815:1: ( (lv_emhZone1_6_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:816:1: (lv_emhZone1_6_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:816:1: (lv_emhZone1_6_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:817:3: lv_emhZone1_6_0= RULE_STRING
            {
            lv_emhZone1_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProtectionLevelEntry1916); 

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

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleProtectionLevelEntry1933); 

                	newLeafNode(otherlv_7, grammarAccess.getProtectionLevelEntryAccess().getHyphenMinusGreaterThanSignKeyword_7());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:837:1: ( (lv_protectionLevel_8_0= ruleProtectionLevelType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:838:1: (lv_protectionLevel_8_0= ruleProtectionLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:838:1: (lv_protectionLevel_8_0= ruleProtectionLevelType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:839:3: lv_protectionLevel_8_0= ruleProtectionLevelType
            {
             
            	        newCompositeNode(grammarAccess.getProtectionLevelEntryAccess().getProtectionLevelProtectionLevelTypeEnumRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleProtectionLevelType_in_ruleProtectionLevelEntry1954);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:855:2: (otherlv_9= ',' ( (lv_protectionLevel_10_0= ruleProtectionLevelType ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:855:4: otherlv_9= ',' ( (lv_protectionLevel_10_0= ruleProtectionLevelType ) )
            	    {
            	    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleProtectionLevelEntry1967); 

            	        	newLeafNode(otherlv_9, grammarAccess.getProtectionLevelEntryAccess().getCommaKeyword_9_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:859:1: ( (lv_protectionLevel_10_0= ruleProtectionLevelType ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:860:1: (lv_protectionLevel_10_0= ruleProtectionLevelType )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:860:1: (lv_protectionLevel_10_0= ruleProtectionLevelType )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:861:3: lv_protectionLevel_10_0= ruleProtectionLevelType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProtectionLevelEntryAccess().getProtectionLevelProtectionLevelTypeEnumRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProtectionLevelType_in_ruleProtectionLevelEntry1988);
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
            	    break loop8;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleProtectionLevelEntry2002); 

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


    // $ANTLR start "entryRuleCompartmentsBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:889:1: entryRuleCompartmentsBlock returns [EObject current=null] : iv_ruleCompartmentsBlock= ruleCompartmentsBlock EOF ;
    public final EObject entryRuleCompartmentsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompartmentsBlock = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:890:2: (iv_ruleCompartmentsBlock= ruleCompartmentsBlock EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:891:2: iv_ruleCompartmentsBlock= ruleCompartmentsBlock EOF
            {
             newCompositeNode(grammarAccess.getCompartmentsBlockRule()); 
            pushFollow(FOLLOW_ruleCompartmentsBlock_in_entryRuleCompartmentsBlock2038);
            iv_ruleCompartmentsBlock=ruleCompartmentsBlock();

            state._fsp--;

             current =iv_ruleCompartmentsBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartmentsBlock2048); 

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
    // $ANTLR end "entryRuleCompartmentsBlock"


    // $ANTLR start "ruleCompartmentsBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:898:1: ruleCompartmentsBlock returns [EObject current=null] : ( () otherlv_1= 'Compartments' otherlv_2= '{' ( (lv_compartments_3_0= ruleCompartment ) )+ otherlv_4= '}' ) ;
    public final EObject ruleCompartmentsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_compartments_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:901:28: ( ( () otherlv_1= 'Compartments' otherlv_2= '{' ( (lv_compartments_3_0= ruleCompartment ) )+ otherlv_4= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:902:1: ( () otherlv_1= 'Compartments' otherlv_2= '{' ( (lv_compartments_3_0= ruleCompartment ) )+ otherlv_4= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:902:1: ( () otherlv_1= 'Compartments' otherlv_2= '{' ( (lv_compartments_3_0= ruleCompartment ) )+ otherlv_4= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:902:2: () otherlv_1= 'Compartments' otherlv_2= '{' ( (lv_compartments_3_0= ruleCompartment ) )+ otherlv_4= '}'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:902:2: ()
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:903:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCompartmentsBlockAccess().getCompartmentsBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleCompartmentsBlock2094); 

                	newLeafNode(otherlv_1, grammarAccess.getCompartmentsBlockAccess().getCompartmentsKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCompartmentsBlock2106); 

                	newLeafNode(otherlv_2, grammarAccess.getCompartmentsBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:916:1: ( (lv_compartments_3_0= ruleCompartment ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:917:1: (lv_compartments_3_0= ruleCompartment )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:917:1: (lv_compartments_3_0= ruleCompartment )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:918:3: lv_compartments_3_0= ruleCompartment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompartmentsBlockAccess().getCompartmentsCompartmentParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompartment_in_ruleCompartmentsBlock2127);
            	    lv_compartments_3_0=ruleCompartment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompartmentsBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"compartments",
            	            		lv_compartments_3_0, 
            	            		"Compartment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleCompartmentsBlock2140); 

                	newLeafNode(otherlv_4, grammarAccess.getCompartmentsBlockAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleCompartmentsBlock"


    // $ANTLR start "entryRuleCompartment"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:946:1: entryRuleCompartment returns [EObject current=null] : iv_ruleCompartment= ruleCompartment EOF ;
    public final EObject entryRuleCompartment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompartment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:947:2: (iv_ruleCompartment= ruleCompartment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:948:2: iv_ruleCompartment= ruleCompartment EOF
            {
             newCompositeNode(grammarAccess.getCompartmentRule()); 
            pushFollow(FOLLOW_ruleCompartment_in_entryRuleCompartment2176);
            iv_ruleCompartment=ruleCompartment();

            state._fsp--;

             current =iv_ruleCompartment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartment2186); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:955:1: ruleCompartment returns [EObject current=null] : (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) ( (lv_metricParametersBlock_21_0= ruleMetricParametersBlock ) )? otherlv_22= '}' ) ;
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
        Token otherlv_22=null;
        EObject lv_rdcs_20_0 = null;

        EObject lv_metricParametersBlock_21_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:958:28: ( (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) ( (lv_metricParametersBlock_21_0= ruleMetricParametersBlock ) )? otherlv_22= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:959:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) ( (lv_metricParametersBlock_21_0= ruleMetricParametersBlock ) )? otherlv_22= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:959:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) ( (lv_metricParametersBlock_21_0= ruleMetricParametersBlock ) )? otherlv_22= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:959:3: otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) ) ( (lv_metricParametersBlock_21_0= ruleMetricParametersBlock ) )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleCompartment2223); 

                	newLeafNode(otherlv_0, grammarAccess.getCompartmentAccess().getCompartmentKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:963:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:964:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:964:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:965:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompartment2240); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCompartment2257); 

                	newLeafNode(otherlv_2, grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:985:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:987:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:987:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:988:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:991:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?)
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:992:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+ {...}?
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:992:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=6;
                int LA11_0 = input.LA(1);

                if ( LA11_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3) ) {
                    alt11=4;
                }
                else if ( LA11_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4) ) {
                    alt11=5;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:994:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:994:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:995:5: {...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:995:108: ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:996:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:999:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:999:7: {...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:999:16: (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:999:18: otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleCompartment2315); 

            	        	newLeafNode(otherlv_4, grammarAccess.getCompartmentAccess().getManufacturerKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCompartment2327); 

            	        	newLeafNode(otherlv_5, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1007:1: ( (lv_manufacturer_6_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1008:1: (lv_manufacturer_6_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1008:1: (lv_manufacturer_6_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1009:3: lv_manufacturer_6_0= RULE_STRING
            	    {
            	    lv_manufacturer_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment2344); 

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

            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCompartment2361); 

            	        	newLeafNode(otherlv_7, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1036:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1036:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1037:5: {...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1037:108: ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1038:6: ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1041:6: ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1041:7: {...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1041:16: (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1041:18: otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleCompartment2429); 

            	        	newLeafNode(otherlv_8, grammarAccess.getCompartmentAccess().getPowerSupplyKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleCompartment2441); 

            	        	newLeafNode(otherlv_9, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1049:1: ( (lv_powerSupply_10_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1050:1: (lv_powerSupply_10_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1050:1: (lv_powerSupply_10_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1051:3: lv_powerSupply_10_0= RULE_STRING
            	    {
            	    lv_powerSupply_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment2458); 

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

            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleCompartment2475); 

            	        	newLeafNode(otherlv_11, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1078:4: ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1078:4: ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1079:5: {...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1079:108: ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1080:6: ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1083:6: ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1083:7: {...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1083:16: (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1083:18: otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleCompartment2543); 

            	        	newLeafNode(otherlv_12, grammarAccess.getCompartmentAccess().getSideKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleCompartment2555); 

            	        	newLeafNode(otherlv_13, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1091:1: ( (lv_side_14_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1092:1: (lv_side_14_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1092:1: (lv_side_14_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1093:3: lv_side_14_0= RULE_STRING
            	    {
            	    lv_side_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment2572); 

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

            	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleCompartment2589); 

            	        	newLeafNode(otherlv_15, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1120:4: ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1120:4: ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1121:5: {...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1121:108: ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1122:6: ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1125:6: ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1125:7: {...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1125:16: (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1125:18: otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,31,FOLLOW_31_in_ruleCompartment2657); 

            	        	newLeafNode(otherlv_16, grammarAccess.getCompartmentAccess().getZoneKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleCompartment2669); 

            	        	newLeafNode(otherlv_17, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1133:1: ( (lv_zone_18_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1134:1: (lv_zone_18_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1134:1: (lv_zone_18_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1135:3: lv_zone_18_0= RULE_STRING
            	    {
            	    lv_zone_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment2686); 

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

            	    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleCompartment2703); 

            	        	newLeafNode(otherlv_19, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1162:4: ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1162:4: ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1163:5: {...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1163:108: ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1164:6: ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1167:6: ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==32) ) {
            	            int LA10_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt10=1;
            	            }


            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1167:7: {...}? => ( (lv_rdcs_20_0= ruleRDC ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    	    }
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1167:16: ( (lv_rdcs_20_0= ruleRDC ) )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1168:1: (lv_rdcs_20_0= ruleRDC )
            	    	    {
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1168:1: (lv_rdcs_20_0= ruleRDC )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1169:3: lv_rdcs_20_0= ruleRDC
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getCompartmentAccess().getRdcsRDCParserRuleCall_3_4_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleRDC_in_ruleCompartment2779);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1200:2: ( (lv_metricParametersBlock_21_0= ruleMetricParametersBlock ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==46) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1201:1: (lv_metricParametersBlock_21_0= ruleMetricParametersBlock )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1201:1: (lv_metricParametersBlock_21_0= ruleMetricParametersBlock )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1202:3: lv_metricParametersBlock_21_0= ruleMetricParametersBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompartmentAccess().getMetricParametersBlockMetricParametersBlockParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMetricParametersBlock_in_ruleCompartment2847);
                    lv_metricParametersBlock_21_0=ruleMetricParametersBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompartmentRule());
                    	        }
                           		set(
                           			current, 
                           			"metricParametersBlock",
                            		lv_metricParametersBlock_21_0, 
                            		"MetricParametersBlock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,16,FOLLOW_16_in_ruleCompartment2860); 

                	newLeafNode(otherlv_22, grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1230:1: entryRuleRDC returns [EObject current=null] : iv_ruleRDC= ruleRDC EOF ;
    public final EObject entryRuleRDC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDC = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1231:2: (iv_ruleRDC= ruleRDC EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1232:2: iv_ruleRDC= ruleRDC EOF
            {
             newCompositeNode(grammarAccess.getRDCRule()); 
            pushFollow(FOLLOW_ruleRDC_in_entryRuleRDC2896);
            iv_ruleRDC=ruleRDC();

            state._fsp--;

             current =iv_ruleRDC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDC2906); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1239:1: ruleRDC returns [EObject current=null] : (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) ( (lv_metricParametersBlock_42_0= ruleMetricParametersBlock ) )? otherlv_43= '}' ) ;
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
        Token lv_powerSupply1_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_powerSupply2_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_rdcType_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_ess_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_location_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_43=null;
        AntlrDatatypeRuleToken lv_resourceX_30_0 = null;

        AntlrDatatypeRuleToken lv_resourceY_34_0 = null;

        AntlrDatatypeRuleToken lv_resourceZ_38_0 = null;

        EObject lv_internalConnectedPinBlock_40_0 = null;

        EObject lv_connectors_41_0 = null;

        EObject lv_metricParametersBlock_42_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1242:28: ( (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) ( (lv_metricParametersBlock_42_0= ruleMetricParametersBlock ) )? otherlv_43= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1243:1: (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) ( (lv_metricParametersBlock_42_0= ruleMetricParametersBlock ) )? otherlv_43= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1243:1: (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) ( (lv_metricParametersBlock_42_0= ruleMetricParametersBlock ) )? otherlv_43= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1243:3: otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) ) ( (lv_metricParametersBlock_42_0= ruleMetricParametersBlock ) )? otherlv_43= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleRDC2943); 

                	newLeafNode(otherlv_0, grammarAccess.getRDCAccess().getRDCKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1247:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1248:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1248:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1249:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRDC2960); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRDC2977); 

                	newLeafNode(otherlv_2, grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1269:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+ ) ) )+ {...}?) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1271:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+ ) ) )+ {...}?) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1271:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+ ) ) )+ {...}?) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1272:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1275:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+ ) ) )+ {...}?)
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1276:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+ ) ) )+ {...}?
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1276:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+ ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=12;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1278:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1278:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1279:5: {...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1279:100: ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1280:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1283:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1283:7: {...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1283:16: (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1283:18: otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleRDC3035); 

            	        	newLeafNode(otherlv_4, grammarAccess.getRDCAccess().getManufacturerKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleRDC3047); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1291:1: ( (lv_manufacturer_6_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1292:1: (lv_manufacturer_6_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1292:1: (lv_manufacturer_6_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1293:3: lv_manufacturer_6_0= RULE_STRING
            	    {
            	    lv_manufacturer_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC3064); 

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

            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleRDC3081); 

            	        	newLeafNode(otherlv_7, grammarAccess.getRDCAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1320:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1320:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1321:5: {...}? => ( ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1321:100: ( ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1322:6: ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1325:6: ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1325:7: {...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1325:16: (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1325:18: otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleRDC3149); 

            	        	newLeafNode(otherlv_8, grammarAccess.getRDCAccess().getPowerSupply1Keyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleRDC3161); 

            	        	newLeafNode(otherlv_9, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1333:1: ( (lv_powerSupply1_10_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1334:1: (lv_powerSupply1_10_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1334:1: (lv_powerSupply1_10_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1335:3: lv_powerSupply1_10_0= RULE_STRING
            	    {
            	    lv_powerSupply1_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC3178); 

            	    			newLeafNode(lv_powerSupply1_10_0, grammarAccess.getRDCAccess().getPowerSupply1STRINGTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRDCRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"powerSupply1",
            	            		lv_powerSupply1_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleRDC3195); 

            	        	newLeafNode(otherlv_11, grammarAccess.getRDCAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1362:4: ({...}? => ( ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1362:4: ({...}? => ( ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1363:5: {...}? => ( ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1363:100: ( ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1364:6: ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1367:6: ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1367:7: {...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1367:16: (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1367:18: otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,34,FOLLOW_34_in_ruleRDC3263); 

            	        	newLeafNode(otherlv_12, grammarAccess.getRDCAccess().getPowerSupply2Keyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleRDC3275); 

            	        	newLeafNode(otherlv_13, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1375:1: ( (lv_powerSupply2_14_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1376:1: (lv_powerSupply2_14_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1376:1: (lv_powerSupply2_14_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1377:3: lv_powerSupply2_14_0= RULE_STRING
            	    {
            	    lv_powerSupply2_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC3292); 

            	    			newLeafNode(lv_powerSupply2_14_0, grammarAccess.getRDCAccess().getPowerSupply2STRINGTerminalRuleCall_3_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRDCRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"powerSupply2",
            	            		lv_powerSupply2_14_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleRDC3309); 

            	        	newLeafNode(otherlv_15, grammarAccess.getRDCAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1404:4: ({...}? => ( ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1404:4: ({...}? => ( ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1405:5: {...}? => ( ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1405:100: ( ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1406:6: ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1409:6: ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1409:7: {...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1409:16: (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1409:18: otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,35,FOLLOW_35_in_ruleRDC3377); 

            	        	newLeafNode(otherlv_16, grammarAccess.getRDCAccess().getTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleRDC3389); 

            	        	newLeafNode(otherlv_17, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1417:1: ( (lv_rdcType_18_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1418:1: (lv_rdcType_18_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1418:1: (lv_rdcType_18_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1419:3: lv_rdcType_18_0= RULE_STRING
            	    {
            	    lv_rdcType_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC3406); 

            	    			newLeafNode(lv_rdcType_18_0, grammarAccess.getRDCAccess().getRdcTypeSTRINGTerminalRuleCall_3_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRDCRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"rdcType",
            	            		lv_rdcType_18_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleRDC3423); 

            	        	newLeafNode(otherlv_19, grammarAccess.getRDCAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1446:4: ({...}? => ( ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1446:4: ({...}? => ( ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1447:5: {...}? => ( ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1447:100: ( ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1448:6: ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1451:6: ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1451:7: {...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1451:16: (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1451:18: otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,36,FOLLOW_36_in_ruleRDC3491); 

            	        	newLeafNode(otherlv_20, grammarAccess.getRDCAccess().getESSKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,14,FOLLOW_14_in_ruleRDC3503); 

            	        	newLeafNode(otherlv_21, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1459:1: ( (lv_ess_22_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1460:1: (lv_ess_22_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1460:1: (lv_ess_22_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1461:3: lv_ess_22_0= RULE_STRING
            	    {
            	    lv_ess_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC3520); 

            	    			newLeafNode(lv_ess_22_0, grammarAccess.getRDCAccess().getEssSTRINGTerminalRuleCall_3_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRDCRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"ess",
            	            		lv_ess_22_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_23=(Token)match(input,15,FOLLOW_15_in_ruleRDC3537); 

            	        	newLeafNode(otherlv_23, grammarAccess.getRDCAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1488:4: ({...}? => ( ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1488:4: ({...}? => ( ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1489:5: {...}? => ( ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1489:100: ( ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1490:6: ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1493:6: ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1493:7: {...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1493:16: (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1493:18: otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,37,FOLLOW_37_in_ruleRDC3605); 

            	        	newLeafNode(otherlv_24, grammarAccess.getRDCAccess().getLocationKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,14,FOLLOW_14_in_ruleRDC3617); 

            	        	newLeafNode(otherlv_25, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1501:1: ( (lv_location_26_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1502:1: (lv_location_26_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1502:1: (lv_location_26_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1503:3: lv_location_26_0= RULE_STRING
            	    {
            	    lv_location_26_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC3634); 

            	    			newLeafNode(lv_location_26_0, grammarAccess.getRDCAccess().getLocationSTRINGTerminalRuleCall_3_5_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRDCRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"location",
            	            		lv_location_26_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_27=(Token)match(input,15,FOLLOW_15_in_ruleRDC3651); 

            	        	newLeafNode(otherlv_27, grammarAccess.getRDCAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1530:4: ({...}? => ( ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1530:4: ({...}? => ( ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1531:5: {...}? => ( ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1531:100: ( ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1532:6: ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1535:6: ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1535:7: {...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1535:16: (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1535:18: otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';'
            	    {
            	    otherlv_28=(Token)match(input,38,FOLLOW_38_in_ruleRDC3719); 

            	        	newLeafNode(otherlv_28, grammarAccess.getRDCAccess().getResourceXKeyword_3_6_0());
            	        
            	    otherlv_29=(Token)match(input,14,FOLLOW_14_in_ruleRDC3731); 

            	        	newLeafNode(otherlv_29, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_6_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1543:1: ( (lv_resourceX_30_0= ruleSIGNEDINT ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1544:1: (lv_resourceX_30_0= ruleSIGNEDINT )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1544:1: (lv_resourceX_30_0= ruleSIGNEDINT )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1545:3: lv_resourceX_30_0= ruleSIGNEDINT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRDCAccess().getResourceXSIGNEDINTParserRuleCall_3_6_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSIGNEDINT_in_ruleRDC3752);
            	    lv_resourceX_30_0=ruleSIGNEDINT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRDCRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"resourceX",
            	            		lv_resourceX_30_0, 
            	            		"SIGNEDINT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_31=(Token)match(input,15,FOLLOW_15_in_ruleRDC3764); 

            	        	newLeafNode(otherlv_31, grammarAccess.getRDCAccess().getSemicolonKeyword_3_6_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1572:4: ({...}? => ( ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1572:4: ({...}? => ( ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1573:5: {...}? => ( ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1573:100: ( ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1574:6: ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1577:6: ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1577:7: {...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1577:16: (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1577:18: otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';'
            	    {
            	    otherlv_32=(Token)match(input,39,FOLLOW_39_in_ruleRDC3832); 

            	        	newLeafNode(otherlv_32, grammarAccess.getRDCAccess().getResourceYKeyword_3_7_0());
            	        
            	    otherlv_33=(Token)match(input,14,FOLLOW_14_in_ruleRDC3844); 

            	        	newLeafNode(otherlv_33, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_7_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1585:1: ( (lv_resourceY_34_0= ruleSIGNEDINT ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1586:1: (lv_resourceY_34_0= ruleSIGNEDINT )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1586:1: (lv_resourceY_34_0= ruleSIGNEDINT )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1587:3: lv_resourceY_34_0= ruleSIGNEDINT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRDCAccess().getResourceYSIGNEDINTParserRuleCall_3_7_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSIGNEDINT_in_ruleRDC3865);
            	    lv_resourceY_34_0=ruleSIGNEDINT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRDCRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"resourceY",
            	            		lv_resourceY_34_0, 
            	            		"SIGNEDINT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_35=(Token)match(input,15,FOLLOW_15_in_ruleRDC3877); 

            	        	newLeafNode(otherlv_35, grammarAccess.getRDCAccess().getSemicolonKeyword_3_7_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1614:4: ({...}? => ( ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1614:4: ({...}? => ( ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1615:5: {...}? => ( ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1615:100: ( ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1616:6: ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 8);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1619:6: ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1619:7: {...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1619:16: (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1619:18: otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';'
            	    {
            	    otherlv_36=(Token)match(input,40,FOLLOW_40_in_ruleRDC3945); 

            	        	newLeafNode(otherlv_36, grammarAccess.getRDCAccess().getResourceZKeyword_3_8_0());
            	        
            	    otherlv_37=(Token)match(input,14,FOLLOW_14_in_ruleRDC3957); 

            	        	newLeafNode(otherlv_37, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_8_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1627:1: ( (lv_resourceZ_38_0= ruleSIGNEDINT ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1628:1: (lv_resourceZ_38_0= ruleSIGNEDINT )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1628:1: (lv_resourceZ_38_0= ruleSIGNEDINT )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1629:3: lv_resourceZ_38_0= ruleSIGNEDINT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRDCAccess().getResourceZSIGNEDINTParserRuleCall_3_8_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSIGNEDINT_in_ruleRDC3978);
            	    lv_resourceZ_38_0=ruleSIGNEDINT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRDCRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"resourceZ",
            	            		lv_resourceZ_38_0, 
            	            		"SIGNEDINT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_39=(Token)match(input,15,FOLLOW_15_in_ruleRDC3990); 

            	        	newLeafNode(otherlv_39, grammarAccess.getRDCAccess().getSemicolonKeyword_3_8_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1656:4: ({...}? => ( ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1656:4: ({...}? => ( ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1657:5: {...}? => ( ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1657:100: ( ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1658:6: ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 9);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1661:6: ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1661:7: {...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1661:16: ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1662:1: (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1662:1: (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1663:3: lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRDCAccess().getInternalConnectedPinBlockInternalConnectedPinBlockParserRuleCall_3_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInternalConnectedPinBlock_in_ruleRDC4066);
            	    lv_internalConnectedPinBlock_40_0=ruleInternalConnectedPinBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRDCRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"internalConnectedPinBlock",
            	            		lv_internalConnectedPinBlock_40_0, 
            	            		"InternalConnectedPinBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1686:4: ({...}? => ( ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+ ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1686:4: ({...}? => ( ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+ ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1687:5: {...}? => ( ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1687:101: ( ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+ )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1688:6: ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 10);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1691:6: ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+
            	    int cnt13=0;
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==43) ) {
            	            int LA13_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt13=1;
            	            }


            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1691:7: {...}? => ( (lv_connectors_41_0= ruleConnector ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleRDC", "true");
            	    	    }
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1691:16: ( (lv_connectors_41_0= ruleConnector ) )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1692:1: (lv_connectors_41_0= ruleConnector )
            	    	    {
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1692:1: (lv_connectors_41_0= ruleConnector )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1693:3: lv_connectors_41_0= ruleConnector
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRDCAccess().getConnectorsConnectorParserRuleCall_3_10_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleConnector_in_ruleRDC4141);
            	    	    lv_connectors_41_0=ruleConnector();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getRDCRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"connectors",
            	    	            		lv_connectors_41_0, 
            	    	            		"Connector");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	    	 				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRDCAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleRDC", "getUnorderedGroupHelper().canLeave(grammarAccess.getRDCAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getRDCAccess().getUnorderedGroup_3());
            	

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1724:2: ( (lv_metricParametersBlock_42_0= ruleMetricParametersBlock ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==46) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1725:1: (lv_metricParametersBlock_42_0= ruleMetricParametersBlock )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1725:1: (lv_metricParametersBlock_42_0= ruleMetricParametersBlock )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1726:3: lv_metricParametersBlock_42_0= ruleMetricParametersBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getRDCAccess().getMetricParametersBlockMetricParametersBlockParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMetricParametersBlock_in_ruleRDC4209);
                    lv_metricParametersBlock_42_0=ruleMetricParametersBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRDCRule());
                    	        }
                           		set(
                           			current, 
                           			"metricParametersBlock",
                            		lv_metricParametersBlock_42_0, 
                            		"MetricParametersBlock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_43=(Token)match(input,16,FOLLOW_16_in_ruleRDC4222); 

                	newLeafNode(otherlv_43, grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleInternalConnectedPinBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1754:1: entryRuleInternalConnectedPinBlock returns [EObject current=null] : iv_ruleInternalConnectedPinBlock= ruleInternalConnectedPinBlock EOF ;
    public final EObject entryRuleInternalConnectedPinBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalConnectedPinBlock = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1755:2: (iv_ruleInternalConnectedPinBlock= ruleInternalConnectedPinBlock EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1756:2: iv_ruleInternalConnectedPinBlock= ruleInternalConnectedPinBlock EOF
            {
             newCompositeNode(grammarAccess.getInternalConnectedPinBlockRule()); 
            pushFollow(FOLLOW_ruleInternalConnectedPinBlock_in_entryRuleInternalConnectedPinBlock4258);
            iv_ruleInternalConnectedPinBlock=ruleInternalConnectedPinBlock();

            state._fsp--;

             current =iv_ruleInternalConnectedPinBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalConnectedPinBlock4268); 

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
    // $ANTLR end "entryRuleInternalConnectedPinBlock"


    // $ANTLR start "ruleInternalConnectedPinBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1763:1: ruleInternalConnectedPinBlock returns [EObject current=null] : ( () otherlv_1= 'Connected Pins' otherlv_2= '{' ( (lv_connectedPins_3_0= ruleConnectedPinEntry ) )* otherlv_4= '}' ) ;
    public final EObject ruleInternalConnectedPinBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_connectedPins_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1766:28: ( ( () otherlv_1= 'Connected Pins' otherlv_2= '{' ( (lv_connectedPins_3_0= ruleConnectedPinEntry ) )* otherlv_4= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1767:1: ( () otherlv_1= 'Connected Pins' otherlv_2= '{' ( (lv_connectedPins_3_0= ruleConnectedPinEntry ) )* otherlv_4= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1767:1: ( () otherlv_1= 'Connected Pins' otherlv_2= '{' ( (lv_connectedPins_3_0= ruleConnectedPinEntry ) )* otherlv_4= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1767:2: () otherlv_1= 'Connected Pins' otherlv_2= '{' ( (lv_connectedPins_3_0= ruleConnectedPinEntry ) )* otherlv_4= '}'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1767:2: ()
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1768:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInternalConnectedPinBlockAccess().getInternalConnectedPinBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleInternalConnectedPinBlock4314); 

                	newLeafNode(otherlv_1, grammarAccess.getInternalConnectedPinBlockAccess().getConnectedPinsKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInternalConnectedPinBlock4326); 

                	newLeafNode(otherlv_2, grammarAccess.getInternalConnectedPinBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1781:1: ( (lv_connectedPins_3_0= ruleConnectedPinEntry ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1782:1: (lv_connectedPins_3_0= ruleConnectedPinEntry )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1782:1: (lv_connectedPins_3_0= ruleConnectedPinEntry )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1783:3: lv_connectedPins_3_0= ruleConnectedPinEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInternalConnectedPinBlockAccess().getConnectedPinsConnectedPinEntryParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnectedPinEntry_in_ruleInternalConnectedPinBlock4347);
            	    lv_connectedPins_3_0=ruleConnectedPinEntry();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInternalConnectedPinBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"connectedPins",
            	            		lv_connectedPins_3_0, 
            	            		"ConnectedPinEntry");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleInternalConnectedPinBlock4360); 

                	newLeafNode(otherlv_4, grammarAccess.getInternalConnectedPinBlockAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleInternalConnectedPinBlock"


    // $ANTLR start "entryRuleConnectedPinEntry"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1811:1: entryRuleConnectedPinEntry returns [EObject current=null] : iv_ruleConnectedPinEntry= ruleConnectedPinEntry EOF ;
    public final EObject entryRuleConnectedPinEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectedPinEntry = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1812:2: (iv_ruleConnectedPinEntry= ruleConnectedPinEntry EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1813:2: iv_ruleConnectedPinEntry= ruleConnectedPinEntry EOF
            {
             newCompositeNode(grammarAccess.getConnectedPinEntryRule()); 
            pushFollow(FOLLOW_ruleConnectedPinEntry_in_entryRuleConnectedPinEntry4396);
            iv_ruleConnectedPinEntry=ruleConnectedPinEntry();

            state._fsp--;

             current =iv_ruleConnectedPinEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectedPinEntry4406); 

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
    // $ANTLR end "entryRuleConnectedPinEntry"


    // $ANTLR start "ruleConnectedPinEntry"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1820:1: ruleConnectedPinEntry returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= ',' ( ( ruleQualifiedName ) ) )+ otherlv_3= 'are connected' otherlv_4= ';' ) ;
    public final EObject ruleConnectedPinEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1823:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= ',' ( ( ruleQualifiedName ) ) )+ otherlv_3= 'are connected' otherlv_4= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1824:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= ',' ( ( ruleQualifiedName ) ) )+ otherlv_3= 'are connected' otherlv_4= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1824:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= ',' ( ( ruleQualifiedName ) ) )+ otherlv_3= 'are connected' otherlv_4= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1824:2: ( ( ruleQualifiedName ) ) (otherlv_1= ',' ( ( ruleQualifiedName ) ) )+ otherlv_3= 'are connected' otherlv_4= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1824:2: ( ( ruleQualifiedName ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1825:1: ( ruleQualifiedName )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1825:1: ( ruleQualifiedName )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1826:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectedPinEntryRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConnectedPinEntryAccess().getPinsPinCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleConnectedPinEntry4454);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1839:2: (otherlv_1= ',' ( ( ruleQualifiedName ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1839:4: otherlv_1= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleConnectedPinEntry4467); 

            	        	newLeafNode(otherlv_1, grammarAccess.getConnectedPinEntryAccess().getCommaKeyword_1_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1843:1: ( ( ruleQualifiedName ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1844:1: ( ruleQualifiedName )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1844:1: ( ruleQualifiedName )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1845:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getConnectedPinEntryRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getConnectedPinEntryAccess().getPinsPinCrossReference_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleConnectedPinEntry4490);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
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

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleConnectedPinEntry4504); 

                	newLeafNode(otherlv_3, grammarAccess.getConnectedPinEntryAccess().getAreConnectedKeyword_2());
                
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleConnectedPinEntry4516); 

                	newLeafNode(otherlv_4, grammarAccess.getConnectedPinEntryAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleConnectedPinEntry"


    // $ANTLR start "entryRuleConnector"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1874:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1875:2: (iv_ruleConnector= ruleConnector EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1876:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector4552);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector4562); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1883:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pins_3_0= rulePin ) )* ( (lv_metricParametersBlock_4_0= ruleMetricParametersBlock ) )? otherlv_5= '}' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_pins_3_0 = null;

        EObject lv_metricParametersBlock_4_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1886:28: ( (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pins_3_0= rulePin ) )* ( (lv_metricParametersBlock_4_0= ruleMetricParametersBlock ) )? otherlv_5= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1887:1: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pins_3_0= rulePin ) )* ( (lv_metricParametersBlock_4_0= ruleMetricParametersBlock ) )? otherlv_5= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1887:1: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pins_3_0= rulePin ) )* ( (lv_metricParametersBlock_4_0= ruleMetricParametersBlock ) )? otherlv_5= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1887:3: otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pins_3_0= rulePin ) )* ( (lv_metricParametersBlock_4_0= ruleMetricParametersBlock ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleConnector4599); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1891:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1892:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1892:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1893:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnector4616); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConnector4633); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1913:1: ( (lv_pins_3_0= rulePin ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1914:1: (lv_pins_3_0= rulePin )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1914:1: (lv_pins_3_0= rulePin )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1915:3: lv_pins_3_0= rulePin
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectorAccess().getPinsPinParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePin_in_ruleConnector4654);
            	    lv_pins_3_0=rulePin();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConnectorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pins",
            	            		lv_pins_3_0, 
            	            		"Pin");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1931:3: ( (lv_metricParametersBlock_4_0= ruleMetricParametersBlock ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1932:1: (lv_metricParametersBlock_4_0= ruleMetricParametersBlock )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1932:1: (lv_metricParametersBlock_4_0= ruleMetricParametersBlock )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1933:3: lv_metricParametersBlock_4_0= ruleMetricParametersBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectorAccess().getMetricParametersBlockMetricParametersBlockParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMetricParametersBlock_in_ruleConnector4676);
                    lv_metricParametersBlock_4_0=ruleMetricParametersBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectorRule());
                    	        }
                           		set(
                           			current, 
                           			"metricParametersBlock",
                            		lv_metricParametersBlock_4_0, 
                            		"MetricParametersBlock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleConnector4689); 

                	newLeafNode(otherlv_5, grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRulePin"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1961:1: entryRulePin returns [EObject current=null] : iv_rulePin= rulePin EOF ;
    public final EObject entryRulePin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePin = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1962:2: (iv_rulePin= rulePin EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1963:2: iv_rulePin= rulePin EOF
            {
             newCompositeNode(grammarAccess.getPinRule()); 
            pushFollow(FOLLOW_rulePin_in_entryRulePin4725);
            iv_rulePin=rulePin();

            state._fsp--;

             current =iv_rulePin; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePin4735); 

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
    // $ANTLR end "entryRulePin"


    // $ANTLR start "rulePin"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1970:1: rulePin returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_eqInterfaceType_2_0= RULE_STRING ) ) (otherlv_3= 'protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )? otherlv_5= ';' ) ;
    public final EObject rulePin() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_eqInterfaceType_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_protectionLevel_4_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1973:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_eqInterfaceType_2_0= RULE_STRING ) ) (otherlv_3= 'protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )? otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1974:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_eqInterfaceType_2_0= RULE_STRING ) ) (otherlv_3= 'protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )? otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1974:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_eqInterfaceType_2_0= RULE_STRING ) ) (otherlv_3= 'protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )? otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1974:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_eqInterfaceType_2_0= RULE_STRING ) ) (otherlv_3= 'protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )? otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1974:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1975:1: (lv_name_0_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1975:1: (lv_name_0_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1976:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePin4777); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPinAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPinRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_rulePin4794); 

                	newLeafNode(otherlv_1, grammarAccess.getPinAccess().getColonKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1996:1: ( (lv_eqInterfaceType_2_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1997:1: (lv_eqInterfaceType_2_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1997:1: (lv_eqInterfaceType_2_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1998:3: lv_eqInterfaceType_2_0= RULE_STRING
            {
            lv_eqInterfaceType_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePin4811); 

            			newLeafNode(lv_eqInterfaceType_2_0, grammarAccess.getPinAccess().getEqInterfaceTypeSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPinRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"eqInterfaceType",
                    		lv_eqInterfaceType_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2014:2: (otherlv_3= 'protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2014:4: otherlv_3= 'protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_45_in_rulePin4829); 

                        	newLeafNode(otherlv_3, grammarAccess.getPinAccess().getProtectionLevelKeyword_3_0());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2018:1: ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2019:1: (lv_protectionLevel_4_0= ruleProtectionLevelType )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2019:1: (lv_protectionLevel_4_0= ruleProtectionLevelType )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2020:3: lv_protectionLevel_4_0= ruleProtectionLevelType
                    {
                     
                    	        newCompositeNode(grammarAccess.getPinAccess().getProtectionLevelProtectionLevelTypeEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProtectionLevelType_in_rulePin4850);
                    lv_protectionLevel_4_0=ruleProtectionLevelType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPinRule());
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_rulePin4864); 

                	newLeafNode(otherlv_5, grammarAccess.getPinAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "rulePin"


    // $ANTLR start "entryRuleMetricParametersBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2048:1: entryRuleMetricParametersBlock returns [EObject current=null] : iv_ruleMetricParametersBlock= ruleMetricParametersBlock EOF ;
    public final EObject entryRuleMetricParametersBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricParametersBlock = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2049:2: (iv_ruleMetricParametersBlock= ruleMetricParametersBlock EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2050:2: iv_ruleMetricParametersBlock= ruleMetricParametersBlock EOF
            {
             newCompositeNode(grammarAccess.getMetricParametersBlockRule()); 
            pushFollow(FOLLOW_ruleMetricParametersBlock_in_entryRuleMetricParametersBlock4900);
            iv_ruleMetricParametersBlock=ruleMetricParametersBlock();

            state._fsp--;

             current =iv_ruleMetricParametersBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricParametersBlock4910); 

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
    // $ANTLR end "entryRuleMetricParametersBlock"


    // $ANTLR start "ruleMetricParametersBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2057:1: ruleMetricParametersBlock returns [EObject current=null] : (otherlv_0= 'Metric Parameters' otherlv_1= '{' ( (lv_metricParameters_2_0= ruleMetricParameter ) ) otherlv_3= '}' ) ;
    public final EObject ruleMetricParametersBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_metricParameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2060:28: ( (otherlv_0= 'Metric Parameters' otherlv_1= '{' ( (lv_metricParameters_2_0= ruleMetricParameter ) ) otherlv_3= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2061:1: (otherlv_0= 'Metric Parameters' otherlv_1= '{' ( (lv_metricParameters_2_0= ruleMetricParameter ) ) otherlv_3= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2061:1: (otherlv_0= 'Metric Parameters' otherlv_1= '{' ( (lv_metricParameters_2_0= ruleMetricParameter ) ) otherlv_3= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2061:3: otherlv_0= 'Metric Parameters' otherlv_1= '{' ( (lv_metricParameters_2_0= ruleMetricParameter ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleMetricParametersBlock4947); 

                	newLeafNode(otherlv_0, grammarAccess.getMetricParametersBlockAccess().getMetricParametersKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleMetricParametersBlock4959); 

                	newLeafNode(otherlv_1, grammarAccess.getMetricParametersBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2069:1: ( (lv_metricParameters_2_0= ruleMetricParameter ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2070:1: (lv_metricParameters_2_0= ruleMetricParameter )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2070:1: (lv_metricParameters_2_0= ruleMetricParameter )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2071:3: lv_metricParameters_2_0= ruleMetricParameter
            {
             
            	        newCompositeNode(grammarAccess.getMetricParametersBlockAccess().getMetricParametersMetricParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMetricParameter_in_ruleMetricParametersBlock4980);
            lv_metricParameters_2_0=ruleMetricParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetricParametersBlockRule());
            	        }
                   		add(
                   			current, 
                   			"metricParameters",
                    		lv_metricParameters_2_0, 
                    		"MetricParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleMetricParametersBlock4992); 

                	newLeafNode(otherlv_3, grammarAccess.getMetricParametersBlockAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleMetricParametersBlock"


    // $ANTLR start "entryRuleMetricParameter"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2099:1: entryRuleMetricParameter returns [EObject current=null] : iv_ruleMetricParameter= ruleMetricParameter EOF ;
    public final EObject entryRuleMetricParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricParameter = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2100:2: (iv_ruleMetricParameter= ruleMetricParameter EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2101:2: iv_ruleMetricParameter= ruleMetricParameter EOF
            {
             newCompositeNode(grammarAccess.getMetricParameterRule()); 
            pushFollow(FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter5028);
            iv_ruleMetricParameter=ruleMetricParameter();

            state._fsp--;

             current =iv_ruleMetricParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricParameter5038); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2108:1: ruleMetricParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) ;
    public final EObject ruleMetricParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2111:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2112:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2112:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2112:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2112:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2113:1: (lv_name_0_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2113:1: (lv_name_0_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2114:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetricParameter5080); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleMetricParameter5097); 

                	newLeafNode(otherlv_1, grammarAccess.getMetricParameterAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2134:1: ( (lv_value_2_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2135:1: (lv_value_2_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2135:1: (lv_value_2_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2136:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMetricParameter5114); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleMetricParameter5131); 

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


    // $ANTLR start "entryRuleInterfacesBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2164:1: entryRuleInterfacesBlock returns [EObject current=null] : iv_ruleInterfacesBlock= ruleInterfacesBlock EOF ;
    public final EObject entryRuleInterfacesBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfacesBlock = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2165:2: (iv_ruleInterfacesBlock= ruleInterfacesBlock EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2166:2: iv_ruleInterfacesBlock= ruleInterfacesBlock EOF
            {
             newCompositeNode(grammarAccess.getInterfacesBlockRule()); 
            pushFollow(FOLLOW_ruleInterfacesBlock_in_entryRuleInterfacesBlock5167);
            iv_ruleInterfacesBlock=ruleInterfacesBlock();

            state._fsp--;

             current =iv_ruleInterfacesBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfacesBlock5177); 

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
    // $ANTLR end "entryRuleInterfacesBlock"


    // $ANTLR start "ruleInterfacesBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2173:1: ruleInterfacesBlock returns [EObject current=null] : (otherlv_0= 'Interfaces' otherlv_1= '{' ( (lv_eqInterfaces_2_0= ruleEqInterface ) )+ otherlv_3= '}' ) ;
    public final EObject ruleInterfacesBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_eqInterfaces_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2176:28: ( (otherlv_0= 'Interfaces' otherlv_1= '{' ( (lv_eqInterfaces_2_0= ruleEqInterface ) )+ otherlv_3= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2177:1: (otherlv_0= 'Interfaces' otherlv_1= '{' ( (lv_eqInterfaces_2_0= ruleEqInterface ) )+ otherlv_3= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2177:1: (otherlv_0= 'Interfaces' otherlv_1= '{' ( (lv_eqInterfaces_2_0= ruleEqInterface ) )+ otherlv_3= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2177:3: otherlv_0= 'Interfaces' otherlv_1= '{' ( (lv_eqInterfaces_2_0= ruleEqInterface ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleInterfacesBlock5214); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfacesBlockAccess().getInterfacesKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleInterfacesBlock5226); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfacesBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2185:1: ( (lv_eqInterfaces_2_0= ruleEqInterface ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==48) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2186:1: (lv_eqInterfaces_2_0= ruleEqInterface )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2186:1: (lv_eqInterfaces_2_0= ruleEqInterface )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2187:3: lv_eqInterfaces_2_0= ruleEqInterface
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfacesBlockAccess().getEqInterfacesEqInterfaceParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqInterface_in_ruleInterfacesBlock5247);
            	    lv_eqInterfaces_2_0=ruleEqInterface();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfacesBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"eqInterfaces",
            	            		lv_eqInterfaces_2_0, 
            	            		"EqInterface");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleInterfacesBlock5260); 

                	newLeafNode(otherlv_3, grammarAccess.getInterfacesBlockAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleInterfacesBlock"


    // $ANTLR start "entryRuleEqInterface"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2215:1: entryRuleEqInterface returns [EObject current=null] : iv_ruleEqInterface= ruleEqInterface EOF ;
    public final EObject entryRuleEqInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterface = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2216:2: (iv_ruleEqInterface= ruleEqInterface EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2217:2: iv_ruleEqInterface= ruleEqInterface EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceRule()); 
            pushFollow(FOLLOW_ruleEqInterface_in_entryRuleEqInterface5296);
            iv_ruleEqInterface=ruleEqInterface();

            state._fsp--;

             current =iv_ruleEqInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterface5306); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2224:1: ruleEqInterface returns [EObject current=null] : (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2227:28: ( (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2228:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2228:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2228:3: otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleEqInterface5343); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceAccess().getInterfaceKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2232:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2233:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2233:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2234:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterface5360); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEqInterface5377); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2254:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2256:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2256:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2257:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2260:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2261:3: ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )*
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2261:3: ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )*
            loop22:
            do {
                int alt22=14;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2263:4: ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2263:4: ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2264:5: {...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2264:108: ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2265:6: ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2268:6: ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2268:7: {...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2268:16: (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2268:18: otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleEqInterface5435); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEqInterfaceAccess().getSystemKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5447); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2276:1: ( (lv_system_6_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2277:1: (lv_system_6_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2277:1: (lv_system_6_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2278:3: lv_system_6_0= RULE_STRING
            	    {
            	    lv_system_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5464); 

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

            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5481); 

            	        	newLeafNode(otherlv_7, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2305:4: ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2305:4: ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2306:5: {...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2306:108: ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2307:6: ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2310:6: ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2310:7: {...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2310:16: (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2310:18: otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,50,FOLLOW_50_in_ruleEqInterface5549); 

            	        	newLeafNode(otherlv_8, grammarAccess.getEqInterfaceAccess().getSubAtaKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5561); 

            	        	newLeafNode(otherlv_9, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2318:1: ( (lv_subAta_10_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2319:1: (lv_subAta_10_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2319:1: (lv_subAta_10_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2320:3: lv_subAta_10_0= RULE_STRING
            	    {
            	    lv_subAta_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5578); 

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

            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5595); 

            	        	newLeafNode(otherlv_11, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2347:4: ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2347:4: ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2348:5: {...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2348:108: ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2349:6: ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2352:6: ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2352:7: {...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2352:16: (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2352:18: otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,51,FOLLOW_51_in_ruleEqInterface5663); 

            	        	newLeafNode(otherlv_12, grammarAccess.getEqInterfaceAccess().getResourceKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5675); 

            	        	newLeafNode(otherlv_13, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2360:1: ( (lv_resource_14_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2361:1: (lv_resource_14_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2361:1: (lv_resource_14_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2362:3: lv_resource_14_0= RULE_STRING
            	    {
            	    lv_resource_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5692); 

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

            	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5709); 

            	        	newLeafNode(otherlv_15, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2389:4: ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2389:4: ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2390:5: {...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2390:108: ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2391:6: ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2394:6: ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2394:7: {...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2394:16: (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2394:18: otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,52,FOLLOW_52_in_ruleEqInterface5777); 

            	        	newLeafNode(otherlv_16, grammarAccess.getEqInterfaceAccess().getLineNameKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5789); 

            	        	newLeafNode(otherlv_17, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2402:1: ( (lv_lineName_18_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2403:1: (lv_lineName_18_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2403:1: (lv_lineName_18_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2404:3: lv_lineName_18_0= RULE_STRING
            	    {
            	    lv_lineName_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5806); 

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

            	    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5823); 

            	        	newLeafNode(otherlv_19, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2431:4: ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2431:4: ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2432:5: {...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2432:108: ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2433:6: ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2436:6: ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2436:7: {...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2436:16: (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2436:18: otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,53,FOLLOW_53_in_ruleEqInterface5891); 

            	        	newLeafNode(otherlv_20, grammarAccess.getEqInterfaceAccess().getWiringLaneKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5903); 

            	        	newLeafNode(otherlv_21, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2444:1: ( (lv_wiringLane_22_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2445:1: (lv_wiringLane_22_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2445:1: (lv_wiringLane_22_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2446:3: lv_wiringLane_22_0= RULE_STRING
            	    {
            	    lv_wiringLane_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5920); 

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

            	    otherlv_23=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5937); 

            	        	newLeafNode(otherlv_23, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2473:4: ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2473:4: ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2474:5: {...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2474:108: ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2475:6: ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2478:6: ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2478:7: {...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2478:16: (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2478:18: otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,54,FOLLOW_54_in_ruleEqInterface6005); 

            	        	newLeafNode(otherlv_24, grammarAccess.getEqInterfaceAccess().getGrpInfoKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6017); 

            	        	newLeafNode(otherlv_25, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2486:1: ( (lv_grpInfo_26_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2487:1: (lv_grpInfo_26_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2487:1: (lv_grpInfo_26_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2488:3: lv_grpInfo_26_0= RULE_STRING
            	    {
            	    lv_grpInfo_26_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface6034); 

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

            	    otherlv_27=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6051); 

            	        	newLeafNode(otherlv_27, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2515:4: ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2515:4: ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2516:5: {...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2516:108: ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2517:6: ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2520:6: ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2520:7: {...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2520:16: (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2520:18: otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';'
            	    {
            	    otherlv_28=(Token)match(input,55,FOLLOW_55_in_ruleEqInterface6119); 

            	        	newLeafNode(otherlv_28, grammarAccess.getEqInterfaceAccess().getRouteKeyword_3_6_0());
            	        
            	    otherlv_29=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6131); 

            	        	newLeafNode(otherlv_29, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_6_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2528:1: ( (lv_route_30_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2529:1: (lv_route_30_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2529:1: (lv_route_30_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2530:3: lv_route_30_0= RULE_STRING
            	    {
            	    lv_route_30_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface6148); 

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

            	    otherlv_31=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6165); 

            	        	newLeafNode(otherlv_31, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_6_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2557:4: ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2557:4: ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2558:5: {...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2558:108: ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2559:6: ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2562:6: ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2562:7: {...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2562:16: (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2562:18: otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';'
            	    {
            	    otherlv_32=(Token)match(input,56,FOLLOW_56_in_ruleEqInterface6233); 

            	        	newLeafNode(otherlv_32, grammarAccess.getEqInterfaceAccess().getPwSup1Keyword_3_7_0());
            	        
            	    otherlv_33=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6245); 

            	        	newLeafNode(otherlv_33, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_7_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2570:1: ( (lv_pwSup1_34_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2571:1: (lv_pwSup1_34_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2571:1: (lv_pwSup1_34_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2572:3: lv_pwSup1_34_0= RULE_STRING
            	    {
            	    lv_pwSup1_34_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface6262); 

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

            	    otherlv_35=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6279); 

            	        	newLeafNode(otherlv_35, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_7_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2599:4: ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2599:4: ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2600:5: {...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2600:108: ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2601:6: ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2604:6: ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2604:7: {...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2604:16: (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2604:18: otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';'
            	    {
            	    otherlv_36=(Token)match(input,57,FOLLOW_57_in_ruleEqInterface6347); 

            	        	newLeafNode(otherlv_36, grammarAccess.getEqInterfaceAccess().getEmhZone1Keyword_3_8_0());
            	        
            	    otherlv_37=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6359); 

            	        	newLeafNode(otherlv_37, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_8_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2612:1: ( (lv_emhZone1_38_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2613:1: (lv_emhZone1_38_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2613:1: (lv_emhZone1_38_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2614:3: lv_emhZone1_38_0= RULE_STRING
            	    {
            	    lv_emhZone1_38_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface6376); 

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

            	    otherlv_39=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6393); 

            	        	newLeafNode(otherlv_39, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_8_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2641:4: ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2641:4: ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2642:5: {...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2642:108: ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2643:6: ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2646:6: ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2646:7: {...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2646:16: (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2646:18: otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';'
            	    {
            	    otherlv_40=(Token)match(input,35,FOLLOW_35_in_ruleEqInterface6461); 

            	        	newLeafNode(otherlv_40, grammarAccess.getEqInterfaceAccess().getTypeKeyword_3_9_0());
            	        
            	    otherlv_41=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6473); 

            	        	newLeafNode(otherlv_41, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_9_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2654:1: ( (lv_ioType_42_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2655:1: (lv_ioType_42_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2655:1: (lv_ioType_42_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2656:3: lv_ioType_42_0= RULE_STRING
            	    {
            	    lv_ioType_42_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface6490); 

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

            	    otherlv_43=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6507); 

            	        	newLeafNode(otherlv_43, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_9_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2683:4: ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2683:4: ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2684:5: {...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2684:109: ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2685:6: ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 10);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2688:6: ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2688:7: {...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2688:16: (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2688:18: otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';'
            	    {
            	    otherlv_44=(Token)match(input,38,FOLLOW_38_in_ruleEqInterface6575); 

            	        	newLeafNode(otherlv_44, grammarAccess.getEqInterfaceAccess().getResourceXKeyword_3_10_0());
            	        
            	    otherlv_45=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6587); 

            	        	newLeafNode(otherlv_45, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_10_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2696:1: ( (lv_resourceX_46_0= ruleSIGNEDINT ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2697:1: (lv_resourceX_46_0= ruleSIGNEDINT )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2697:1: (lv_resourceX_46_0= ruleSIGNEDINT )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2698:3: lv_resourceX_46_0= ruleSIGNEDINT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqInterfaceAccess().getResourceXSIGNEDINTParserRuleCall_3_10_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6608);
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

            	    otherlv_47=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6620); 

            	        	newLeafNode(otherlv_47, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_10_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2725:4: ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2725:4: ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2726:5: {...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2726:109: ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2727:6: ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 11);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2730:6: ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2730:7: {...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2730:16: (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2730:18: otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';'
            	    {
            	    otherlv_48=(Token)match(input,39,FOLLOW_39_in_ruleEqInterface6688); 

            	        	newLeafNode(otherlv_48, grammarAccess.getEqInterfaceAccess().getResourceYKeyword_3_11_0());
            	        
            	    otherlv_49=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6700); 

            	        	newLeafNode(otherlv_49, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_11_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2738:1: ( (lv_resourceY_50_0= ruleSIGNEDINT ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2739:1: (lv_resourceY_50_0= ruleSIGNEDINT )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2739:1: (lv_resourceY_50_0= ruleSIGNEDINT )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2740:3: lv_resourceY_50_0= ruleSIGNEDINT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqInterfaceAccess().getResourceYSIGNEDINTParserRuleCall_3_11_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6721);
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

            	    otherlv_51=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6733); 

            	        	newLeafNode(otherlv_51, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_11_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2767:4: ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2767:4: ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2768:5: {...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 12)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2768:109: ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2769:6: ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 12);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2772:6: ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2772:7: {...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2772:16: (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2772:18: otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';'
            	    {
            	    otherlv_52=(Token)match(input,40,FOLLOW_40_in_ruleEqInterface6801); 

            	        	newLeafNode(otherlv_52, grammarAccess.getEqInterfaceAccess().getResourceZKeyword_3_12_0());
            	        
            	    otherlv_53=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6813); 

            	        	newLeafNode(otherlv_53, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_12_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2780:1: ( (lv_resourceZ_54_0= ruleSIGNEDINT ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2781:1: (lv_resourceZ_54_0= ruleSIGNEDINT )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2781:1: (lv_resourceZ_54_0= ruleSIGNEDINT )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2782:3: lv_resourceZ_54_0= ruleSIGNEDINT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqInterfaceAccess().getResourceZSIGNEDINTParserRuleCall_3_12_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6834);
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

            	    otherlv_55=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6846); 

            	        	newLeafNode(otherlv_55, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_12_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	

            }

            otherlv_56=(Token)match(input,16,FOLLOW_16_in_ruleEqInterface6899); 

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


    // $ANTLR start "entryRuleInterfaceGroupsBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2828:1: entryRuleInterfaceGroupsBlock returns [EObject current=null] : iv_ruleInterfaceGroupsBlock= ruleInterfaceGroupsBlock EOF ;
    public final EObject entryRuleInterfaceGroupsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceGroupsBlock = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2829:2: (iv_ruleInterfaceGroupsBlock= ruleInterfaceGroupsBlock EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2830:2: iv_ruleInterfaceGroupsBlock= ruleInterfaceGroupsBlock EOF
            {
             newCompositeNode(grammarAccess.getInterfaceGroupsBlockRule()); 
            pushFollow(FOLLOW_ruleInterfaceGroupsBlock_in_entryRuleInterfaceGroupsBlock6935);
            iv_ruleInterfaceGroupsBlock=ruleInterfaceGroupsBlock();

            state._fsp--;

             current =iv_ruleInterfaceGroupsBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceGroupsBlock6945); 

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
    // $ANTLR end "entryRuleInterfaceGroupsBlock"


    // $ANTLR start "ruleInterfaceGroupsBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2837:1: ruleInterfaceGroupsBlock returns [EObject current=null] : ( () otherlv_1= 'InterfaceGroups' otherlv_2= '{' ( ( (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleInterfaceGroupsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_eqInterfaceGroups_3_0 = null;

        EObject lv_eqInterfaceGroups_4_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2840:28: ( ( () otherlv_1= 'InterfaceGroups' otherlv_2= '{' ( ( (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_5= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2841:1: ( () otherlv_1= 'InterfaceGroups' otherlv_2= '{' ( ( (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_5= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2841:1: ( () otherlv_1= 'InterfaceGroups' otherlv_2= '{' ( ( (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_5= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2841:2: () otherlv_1= 'InterfaceGroups' otherlv_2= '{' ( ( (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_5= '}'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2841:2: ()
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2842:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfaceGroupsBlockAccess().getInterfaceGroupsBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleInterfaceGroupsBlock6991); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfaceGroupsBlockAccess().getInterfaceGroupsKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInterfaceGroupsBlock7003); 

                	newLeafNode(otherlv_2, grammarAccess.getInterfaceGroupsBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2855:1: ( ( (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==59) ) {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==RULE_ID) ) {
                        int LA23_3 = input.LA(3);

                        if ( (LA23_3==12) ) {
                            alt23=1;
                        }
                        else if ( (LA23_3==63) ) {
                            alt23=2;
                        }


                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2855:2: ( (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2855:2: ( (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2856:1: (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2856:1: (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2857:3: lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceGroupsBlockAccess().getEqInterfaceGroupsEqInterfaceGroupParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqInterfaceGroup_in_ruleInterfaceGroupsBlock7025);
            	    lv_eqInterfaceGroups_3_0=ruleEqInterfaceGroup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceGroupsBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"eqInterfaceGroups",
            	            		lv_eqInterfaceGroups_3_0, 
            	            		"EqInterfaceGroup");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2874:6: ( (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2874:6: ( (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2875:1: (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2875:1: (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2876:3: lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceGroupsBlockAccess().getEqInterfaceGroupsEqInterfaceGroupWithCombinedDefinitionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqInterfaceGroupWithCombinedDefinition_in_ruleInterfaceGroupsBlock7052);
            	    lv_eqInterfaceGroups_4_0=ruleEqInterfaceGroupWithCombinedDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceGroupsBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"eqInterfaceGroups",
            	            		lv_eqInterfaceGroups_4_0, 
            	            		"EqInterfaceGroupWithCombinedDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleInterfaceGroupsBlock7066); 

                	newLeafNode(otherlv_5, grammarAccess.getInterfaceGroupsBlockAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleInterfaceGroupsBlock"


    // $ANTLR start "entryRuleEqInterfaceGroup"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2904:1: entryRuleEqInterfaceGroup returns [EObject current=null] : iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF ;
    public final EObject entryRuleEqInterfaceGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterfaceGroup = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2905:2: (iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2906:2: iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceGroupRule()); 
            pushFollow(FOLLOW_ruleEqInterfaceGroup_in_entryRuleEqInterfaceGroup7102);
            iv_ruleEqInterfaceGroup=ruleEqInterfaceGroup();

            state._fsp--;

             current =iv_ruleEqInterfaceGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterfaceGroup7112); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2913:1: ruleEqInterfaceGroup returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )? otherlv_17= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2916:28: ( (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )? otherlv_17= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2917:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )? otherlv_17= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2917:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )? otherlv_17= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2917:3: otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )? otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleEqInterfaceGroup7149); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceGroupAccess().getGroupKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2921:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2922:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2922:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2923:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7166); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEqInterfaceGroup7183); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceGroupAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2943:1: ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==61) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2943:2: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2943:2: ( (otherlv_3= RULE_ID ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2944:1: (otherlv_3= RULE_ID )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2944:1: (otherlv_3= RULE_ID )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2945:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7204); 

                    		newLeafNode(otherlv_3, grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_3_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2957:6: ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2957:6: ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2958:1: (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2958:1: (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2959:3: lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqInterfaceGroupAccess().getImplicitMemberDefinitionsImplicitEqInterfaceMemberDefinitionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup7231);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2975:3: (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==19) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2975:5: otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEqInterfaceGroup7245); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEqInterfaceGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2979:1: ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==RULE_ID) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==61) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2979:2: ( (otherlv_6= RULE_ID ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2979:2: ( (otherlv_6= RULE_ID ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2980:1: (otherlv_6= RULE_ID )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2980:1: (otherlv_6= RULE_ID )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2981:3: otherlv_6= RULE_ID
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
            	            	        }
            	                    
            	            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7266); 

            	            		newLeafNode(otherlv_6, grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_4_1_0_0()); 
            	            	

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2993:6: ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2993:6: ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2994:1: (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2994:1: (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2995:3: lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getEqInterfaceGroupAccess().getImplicitMemberDefinitionsImplicitEqInterfaceMemberDefinitionParserRuleCall_4_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup7293);
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
            	    break loop26;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleEqInterfaceGroup7308); 

                	newLeafNode(otherlv_8, grammarAccess.getEqInterfaceGroupAccess().getRightCurlyBracketKeyword_5());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3015:1: (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==60) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3015:3: otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}'
                    {
                    otherlv_9=(Token)match(input,60,FOLLOW_60_in_ruleEqInterfaceGroup7321); 

                        	newLeafNode(otherlv_9, grammarAccess.getEqInterfaceGroupAccess().getWithoutKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleEqInterfaceGroup7333); 

                        	newLeafNode(otherlv_10, grammarAccess.getEqInterfaceGroupAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3023:1: ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_ID) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==61) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3023:2: ( (otherlv_11= RULE_ID ) )
                            {
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3023:2: ( (otherlv_11= RULE_ID ) )
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3024:1: (otherlv_11= RULE_ID )
                            {
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3024:1: (otherlv_11= RULE_ID )
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3025:3: otherlv_11= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
                            	        }
                                    
                            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7354); 

                            		newLeafNode(otherlv_11, grammarAccess.getEqInterfaceGroupAccess().getWithoutEqInterfacesEqInterfaceCrossReference_6_2_0_0()); 
                            	

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3037:6: ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) )
                            {
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3037:6: ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) )
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3038:1: (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition )
                            {
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3038:1: (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition )
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3039:3: lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition
                            {
                             
                            	        newCompositeNode(grammarAccess.getEqInterfaceGroupAccess().getWithoutImplicitMemberDefinitionsImplicitEqInterfaceMemberDefinitionParserRuleCall_6_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup7381);
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

                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3055:3: (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==19) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3055:5: otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
                    	    {
                    	    otherlv_13=(Token)match(input,19,FOLLOW_19_in_ruleEqInterfaceGroup7395); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getEqInterfaceGroupAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3059:1: ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
                    	    int alt28=2;
                    	    int LA28_0 = input.LA(1);

                    	    if ( (LA28_0==RULE_ID) ) {
                    	        alt28=1;
                    	    }
                    	    else if ( (LA28_0==61) ) {
                    	        alt28=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 28, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt28) {
                    	        case 1 :
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3059:2: ( (otherlv_14= RULE_ID ) )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3059:2: ( (otherlv_14= RULE_ID ) )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3060:1: (otherlv_14= RULE_ID )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3060:1: (otherlv_14= RULE_ID )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3061:3: otherlv_14= RULE_ID
                    	            {

                    	            			if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
                    	            	        }
                    	                    
                    	            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7416); 

                    	            		newLeafNode(otherlv_14, grammarAccess.getEqInterfaceGroupAccess().getWithoutEqInterfacesEqInterfaceCrossReference_6_3_1_0_0()); 
                    	            	

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3073:6: ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3073:6: ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3074:1: (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3074:1: (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3075:3: lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getEqInterfaceGroupAccess().getWithoutImplicitMemberDefinitionsImplicitEqInterfaceMemberDefinitionParserRuleCall_6_3_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup7443);
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
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleEqInterfaceGroup7458); 

                        	newLeafNode(otherlv_16, grammarAccess.getEqInterfaceGroupAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleEqInterfaceGroup7472); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3107:1: entryRuleImplicitEqInterfaceMemberDefinition returns [EObject current=null] : iv_ruleImplicitEqInterfaceMemberDefinition= ruleImplicitEqInterfaceMemberDefinition EOF ;
    public final EObject entryRuleImplicitEqInterfaceMemberDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitEqInterfaceMemberDefinition = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3108:2: (iv_ruleImplicitEqInterfaceMemberDefinition= ruleImplicitEqInterfaceMemberDefinition EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3109:2: iv_ruleImplicitEqInterfaceMemberDefinition= ruleImplicitEqInterfaceMemberDefinition EOF
            {
             newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionRule()); 
            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_entryRuleImplicitEqInterfaceMemberDefinition7508);
            iv_ruleImplicitEqInterfaceMemberDefinition=ruleImplicitEqInterfaceMemberDefinition();

            state._fsp--;

             current =iv_ruleImplicitEqInterfaceMemberDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitEqInterfaceMemberDefinition7518); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3116:1: ruleImplicitEqInterfaceMemberDefinition returns [EObject current=null] : (otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )* ) ;
    public final EObject ruleImplicitEqInterfaceMemberDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3119:28: ( (otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3120:1: (otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )* )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3120:1: (otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3120:3: otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )*
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleImplicitEqInterfaceMemberDefinition7555); 

                	newLeafNode(otherlv_0, grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getInterfacesWithKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3124:1: ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3125:1: (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3125:1: (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3126:3: lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues
            {
             
            	        newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getEntriesImplicitEqInterfaceMemberDefinitionAttributesAndValuesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_ruleImplicitEqInterfaceMemberDefinition7576);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3142:2: (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==62) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3142:4: otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) )
            	    {
            	    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleImplicitEqInterfaceMemberDefinition7589); 

            	        	newLeafNode(otherlv_2, grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getAndKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3146:1: ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3147:1: (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3147:1: (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3148:3: lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getEntriesImplicitEqInterfaceMemberDefinitionAttributesAndValuesParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_ruleImplicitEqInterfaceMemberDefinition7610);
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
    // $ANTLR end "ruleImplicitEqInterfaceMemberDefinition"


    // $ANTLR start "entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3172:1: entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues returns [EObject current=null] : iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues EOF ;
    public final EObject entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3173:2: (iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3174:2: iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues EOF
            {
             newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesRule()); 
            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues7648);
            iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues=ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues();

            state._fsp--;

             current =iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues7658); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3181:1: ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_attribute_0_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3184:28: ( ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3185:1: ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3185:1: ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3185:2: ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3185:2: ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3186:1: (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3186:1: (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3187:3: lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute
            {
             
            	        newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesAccess().getAttributeImplicitEqInterfaceMemberDefinitionAttributeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttribute_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues7704);
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues7716); 

                	newLeafNode(otherlv_1, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3207:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3208:1: (lv_value_2_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3208:1: (lv_value_2_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3209:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues7733); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3233:1: entryRuleEqInterfaceGroupWithCombinedDefinition returns [EObject current=null] : iv_ruleEqInterfaceGroupWithCombinedDefinition= ruleEqInterfaceGroupWithCombinedDefinition EOF ;
    public final EObject entryRuleEqInterfaceGroupWithCombinedDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterfaceGroupWithCombinedDefinition = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3234:2: (iv_ruleEqInterfaceGroupWithCombinedDefinition= ruleEqInterfaceGroupWithCombinedDefinition EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3235:2: iv_ruleEqInterfaceGroupWithCombinedDefinition= ruleEqInterfaceGroupWithCombinedDefinition EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionRule()); 
            pushFollow(FOLLOW_ruleEqInterfaceGroupWithCombinedDefinition_in_entryRuleEqInterfaceGroupWithCombinedDefinition7774);
            iv_ruleEqInterfaceGroupWithCombinedDefinition=ruleEqInterfaceGroupWithCombinedDefinition();

            state._fsp--;

             current =iv_ruleEqInterfaceGroupWithCombinedDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterfaceGroupWithCombinedDefinition7784); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3242:1: ruleEqInterfaceGroupWithCombinedDefinition returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3245:28: ( (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3246:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3246:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3246:3: otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleEqInterfaceGroupWithCombinedDefinition7821); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getGroupKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3250:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3251:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3251:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3252:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition7838); 

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

            otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleEqInterfaceGroupWithCombinedDefinition7855); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getCombinesKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3272:1: ( (otherlv_3= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3273:1: (otherlv_3= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3273:1: (otherlv_3= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3274:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition7875); 

            		newLeafNode(otherlv_3, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getCombinedGroupsEqInterfaceGroupCrossReference_3_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3285:2: (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==62) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3285:4: otherlv_4= 'and' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,62,FOLLOW_62_in_ruleEqInterfaceGroupWithCombinedDefinition7888); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getAndKeyword_4_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3289:1: ( (otherlv_5= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3290:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3290:1: (otherlv_5= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3291:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition7908); 

            	    		newLeafNode(otherlv_5, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getCombinedGroupsEqInterfaceGroupCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleEqInterfaceGroupWithCombinedDefinition7922); 

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


    // $ANTLR start "entryRuleRestrictionsBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3314:1: entryRuleRestrictionsBlock returns [EObject current=null] : iv_ruleRestrictionsBlock= ruleRestrictionsBlock EOF ;
    public final EObject entryRuleRestrictionsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictionsBlock = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3315:2: (iv_ruleRestrictionsBlock= ruleRestrictionsBlock EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3316:2: iv_ruleRestrictionsBlock= ruleRestrictionsBlock EOF
            {
             newCompositeNode(grammarAccess.getRestrictionsBlockRule()); 
            pushFollow(FOLLOW_ruleRestrictionsBlock_in_entryRuleRestrictionsBlock7958);
            iv_ruleRestrictionsBlock=ruleRestrictionsBlock();

            state._fsp--;

             current =iv_ruleRestrictionsBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictionsBlock7968); 

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
    // $ANTLR end "entryRuleRestrictionsBlock"


    // $ANTLR start "ruleRestrictionsBlock"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3323:1: ruleRestrictionsBlock returns [EObject current=null] : ( () otherlv_1= 'Restrictions' otherlv_2= '{' ( ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_5_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleRestrictionsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_dislocalityRelations_3_0 = null;

        EObject lv_colocalityRelations_4_0 = null;

        EObject lv_validDeployments_5_0 = null;

        EObject lv_invalidDeployments_6_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3326:28: ( ( () otherlv_1= 'Restrictions' otherlv_2= '{' ( ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_5_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) ) )* otherlv_7= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3327:1: ( () otherlv_1= 'Restrictions' otherlv_2= '{' ( ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_5_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) ) )* otherlv_7= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3327:1: ( () otherlv_1= 'Restrictions' otherlv_2= '{' ( ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_5_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) ) )* otherlv_7= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3327:2: () otherlv_1= 'Restrictions' otherlv_2= '{' ( ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_5_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) ) )* otherlv_7= '}'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3327:2: ()
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3328:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRestrictionsBlockAccess().getRestrictionsBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleRestrictionsBlock8014); 

                	newLeafNode(otherlv_1, grammarAccess.getRestrictionsBlockAccess().getRestrictionsKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRestrictionsBlock8026); 

                	newLeafNode(otherlv_2, grammarAccess.getRestrictionsBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3341:1: ( ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_5_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) ) )*
            loop33:
            do {
                int alt33=5;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3341:2: ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3341:2: ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3342:1: (lv_dislocalityRelations_3_0= ruleDislocalityRelation )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3342:1: (lv_dislocalityRelations_3_0= ruleDislocalityRelation )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3343:3: lv_dislocalityRelations_3_0= ruleDislocalityRelation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestrictionsBlockAccess().getDislocalityRelationsDislocalityRelationParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDislocalityRelation_in_ruleRestrictionsBlock8048);
            	    lv_dislocalityRelations_3_0=ruleDislocalityRelation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestrictionsBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dislocalityRelations",
            	            		lv_dislocalityRelations_3_0, 
            	            		"DislocalityRelation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3360:6: ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3360:6: ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3361:1: (lv_colocalityRelations_4_0= ruleColocalityRelation )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3361:1: (lv_colocalityRelations_4_0= ruleColocalityRelation )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3362:3: lv_colocalityRelations_4_0= ruleColocalityRelation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestrictionsBlockAccess().getColocalityRelationsColocalityRelationParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColocalityRelation_in_ruleRestrictionsBlock8075);
            	    lv_colocalityRelations_4_0=ruleColocalityRelation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestrictionsBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"colocalityRelations",
            	            		lv_colocalityRelations_4_0, 
            	            		"ColocalityRelation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3379:6: ( (lv_validDeployments_5_0= ruleValidDeployment ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3379:6: ( (lv_validDeployments_5_0= ruleValidDeployment ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3380:1: (lv_validDeployments_5_0= ruleValidDeployment )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3380:1: (lv_validDeployments_5_0= ruleValidDeployment )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3381:3: lv_validDeployments_5_0= ruleValidDeployment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestrictionsBlockAccess().getValidDeploymentsValidDeploymentParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValidDeployment_in_ruleRestrictionsBlock8102);
            	    lv_validDeployments_5_0=ruleValidDeployment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestrictionsBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"validDeployments",
            	            		lv_validDeployments_5_0, 
            	            		"ValidDeployment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3398:6: ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3398:6: ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3399:1: (lv_invalidDeployments_6_0= ruleInvalidDeployment )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3399:1: (lv_invalidDeployments_6_0= ruleInvalidDeployment )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3400:3: lv_invalidDeployments_6_0= ruleInvalidDeployment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestrictionsBlockAccess().getInvalidDeploymentsInvalidDeploymentParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInvalidDeployment_in_ruleRestrictionsBlock8129);
            	    lv_invalidDeployments_6_0=ruleInvalidDeployment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestrictionsBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"invalidDeployments",
            	            		lv_invalidDeployments_6_0, 
            	            		"InvalidDeployment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleRestrictionsBlock8143); 

                	newLeafNode(otherlv_7, grammarAccess.getRestrictionsBlockAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleRestrictionsBlock"


    // $ANTLR start "entryRuleDislocalityRelation"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3428:1: entryRuleDislocalityRelation returns [EObject current=null] : iv_ruleDislocalityRelation= ruleDislocalityRelation EOF ;
    public final EObject entryRuleDislocalityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDislocalityRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3429:2: (iv_ruleDislocalityRelation= ruleDislocalityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3430:2: iv_ruleDislocalityRelation= ruleDislocalityRelation EOF
            {
             newCompositeNode(grammarAccess.getDislocalityRelationRule()); 
            pushFollow(FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation8179);
            iv_ruleDislocalityRelation=ruleDislocalityRelation();

            state._fsp--;

             current =iv_ruleDislocalityRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDislocalityRelation8189); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3437:1: ruleDislocalityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3440:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3441:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3441:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3441:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3441:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3442:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3442:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3443:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDislocalityRelationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDislocalityRelation8234); 

            		newLeafNode(otherlv_0, grammarAccess.getDislocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_0_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3454:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==19) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3454:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleDislocalityRelation8247); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDislocalityRelationAccess().getCommaKeyword_1_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3458:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3459:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3459:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3460:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDislocalityRelationRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDislocalityRelation8267); 

            	    		newLeafNode(otherlv_2, grammarAccess.getDislocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_3=(Token)match(input,65,FOLLOW_65_in_ruleDislocalityRelation8281); 

                	newLeafNode(otherlv_3, grammarAccess.getDislocalityRelationAccess().getDislocalUpToKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3475:1: ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3476:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3476:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3477:3: lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType
            {
             
            	        newCompositeNode(grammarAccess.getDislocalityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleHardwareArchitectureLevelType_in_ruleDislocalityRelation8302);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDislocalityRelation8314); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3505:1: entryRuleColocalityRelation returns [EObject current=null] : iv_ruleColocalityRelation= ruleColocalityRelation EOF ;
    public final EObject entryRuleColocalityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColocalityRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3506:2: (iv_ruleColocalityRelation= ruleColocalityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3507:2: iv_ruleColocalityRelation= ruleColocalityRelation EOF
            {
             newCompositeNode(grammarAccess.getColocalityRelationRule()); 
            pushFollow(FOLLOW_ruleColocalityRelation_in_entryRuleColocalityRelation8350);
            iv_ruleColocalityRelation=ruleColocalityRelation();

            state._fsp--;

             current =iv_ruleColocalityRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColocalityRelation8360); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3514:1: ruleColocalityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3517:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3518:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3518:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3518:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3518:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3519:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3519:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3520:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getColocalityRelationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColocalityRelation8405); 

            		newLeafNode(otherlv_0, grammarAccess.getColocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_0_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3531:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==19) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3531:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleColocalityRelation8418); 

            	        	newLeafNode(otherlv_1, grammarAccess.getColocalityRelationAccess().getCommaKeyword_1_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3535:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3536:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3536:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3537:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getColocalityRelationRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColocalityRelation8438); 

            	    		newLeafNode(otherlv_2, grammarAccess.getColocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleColocalityRelation8452); 

                	newLeafNode(otherlv_3, grammarAccess.getColocalityRelationAccess().getOnSameKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3552:1: ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3553:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3553:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3554:3: lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType
            {
             
            	        newCompositeNode(grammarAccess.getColocalityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleHardwareArchitectureLevelType_in_ruleColocalityRelation8473);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleColocalityRelation8485); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3582:1: entryRuleValidDeployment returns [EObject current=null] : iv_ruleValidDeployment= ruleValidDeployment EOF ;
    public final EObject entryRuleValidDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidDeployment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3583:2: (iv_ruleValidDeployment= ruleValidDeployment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3584:2: iv_ruleValidDeployment= ruleValidDeployment EOF
            {
             newCompositeNode(grammarAccess.getValidDeploymentRule()); 
            pushFollow(FOLLOW_ruleValidDeployment_in_entryRuleValidDeployment8521);
            iv_ruleValidDeployment=ruleValidDeployment();

            state._fsp--;

             current =iv_ruleValidDeployment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidDeployment8531); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3591:1: ruleValidDeployment returns [EObject current=null] : (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';' ) ;
    public final EObject ruleValidDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_implicitHardwareElements_7_0 = null;

        EObject lv_implicitHardwareElements_10_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3594:28: ( (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3595:1: (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3595:1: (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3595:3: otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleValidDeployment8568); 

                	newLeafNode(otherlv_0, grammarAccess.getValidDeploymentAccess().getValidForKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3599:1: ( (otherlv_1= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3600:1: (otherlv_1= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3600:1: (otherlv_1= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3601:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getValidDeploymentRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidDeployment8588); 

            		newLeafNode(otherlv_1, grammarAccess.getValidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3612:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==19) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3612:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleValidDeployment8601); 

            	        	newLeafNode(otherlv_2, grammarAccess.getValidDeploymentAccess().getCommaKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3616:1: ( (otherlv_3= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3617:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3617:1: (otherlv_3= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3618:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getValidDeploymentRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidDeployment8621); 

            	    		newLeafNode(otherlv_3, grammarAccess.getValidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleValidDeployment8635); 

                	newLeafNode(otherlv_4, grammarAccess.getValidDeploymentAccess().getAreKeyword_3());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleValidDeployment8647); 

                	newLeafNode(otherlv_5, grammarAccess.getValidDeploymentAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3637:1: ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            else if ( (LA37_0==70) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3637:2: ( ( ruleQualifiedName ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3637:2: ( ( ruleQualifiedName ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3638:1: ( ruleQualifiedName )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3638:1: ( ruleQualifiedName )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3639:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getValidDeploymentRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleValidDeployment8671);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3653:6: ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3653:6: ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3654:1: (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3654:1: (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3655:3: lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getImplicitHardwareElementsDeploymentImplicitDefinitionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeployment8698);
                    lv_implicitHardwareElements_7_0=ruleDeploymentImplicitDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValidDeploymentRule());
                    	        }
                           		add(
                           			current, 
                           			"implicitHardwareElements",
                            		lv_implicitHardwareElements_7_0, 
                            		"DeploymentImplicitDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3671:3: (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==19) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3671:5: otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) )
            	    {
            	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleValidDeployment8712); 

            	        	newLeafNode(otherlv_8, grammarAccess.getValidDeploymentAccess().getCommaKeyword_6_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3675:1: ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==RULE_ID) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==70) ) {
            	        alt38=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3675:2: ( ( ruleQualifiedName ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3675:2: ( ( ruleQualifiedName ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3676:1: ( ruleQualifiedName )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3676:1: ( ruleQualifiedName )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3677:3: ruleQualifiedName
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getValidDeploymentRule());
            	            	        }
            	                    
            	             
            	            	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_6_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleValidDeployment8736);
            	            ruleQualifiedName();

            	            state._fsp--;

            	             
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3691:6: ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3691:6: ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3692:1: (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3692:1: (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3693:3: lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getImplicitHardwareElementsDeploymentImplicitDefinitionParserRuleCall_6_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeployment8763);
            	            lv_implicitHardwareElements_10_0=ruleDeploymentImplicitDefinition();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getValidDeploymentRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"implicitHardwareElements",
            	                    		lv_implicitHardwareElements_10_0, 
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
            	    break loop39;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleValidDeployment8778); 

                	newLeafNode(otherlv_11, grammarAccess.getValidDeploymentAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleValidDeployment8790); 

                	newLeafNode(otherlv_12, grammarAccess.getValidDeploymentAccess().getSemicolonKeyword_8());
                

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3725:1: entryRuleInvalidDeployment returns [EObject current=null] : iv_ruleInvalidDeployment= ruleInvalidDeployment EOF ;
    public final EObject entryRuleInvalidDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidDeployment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3726:2: (iv_ruleInvalidDeployment= ruleInvalidDeployment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3727:2: iv_ruleInvalidDeployment= ruleInvalidDeployment EOF
            {
             newCompositeNode(grammarAccess.getInvalidDeploymentRule()); 
            pushFollow(FOLLOW_ruleInvalidDeployment_in_entryRuleInvalidDeployment8826);
            iv_ruleInvalidDeployment=ruleInvalidDeployment();

            state._fsp--;

             current =iv_ruleInvalidDeployment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvalidDeployment8836); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3734:1: ruleInvalidDeployment returns [EObject current=null] : (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';' ) ;
    public final EObject ruleInvalidDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_implicitHardwareElements_7_0 = null;

        EObject lv_implicitHardwareElements_10_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3737:28: ( (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3738:1: (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3738:1: (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3738:3: otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleInvalidDeployment8873); 

                	newLeafNode(otherlv_0, grammarAccess.getInvalidDeploymentAccess().getInvalidForKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3742:1: ( (otherlv_1= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3743:1: (otherlv_1= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3743:1: (otherlv_1= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3744:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvalidDeployment8893); 

            		newLeafNode(otherlv_1, grammarAccess.getInvalidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3755:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==19) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3755:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleInvalidDeployment8906); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInvalidDeploymentAccess().getCommaKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3759:1: ( (otherlv_3= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3760:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3760:1: (otherlv_3= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3761:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvalidDeployment8926); 

            	    		newLeafNode(otherlv_3, grammarAccess.getInvalidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleInvalidDeployment8940); 

                	newLeafNode(otherlv_4, grammarAccess.getInvalidDeploymentAccess().getAreKeyword_3());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleInvalidDeployment8952); 

                	newLeafNode(otherlv_5, grammarAccess.getInvalidDeploymentAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3780:1: ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            else if ( (LA41_0==70) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3780:2: ( ( ruleQualifiedName ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3780:2: ( ( ruleQualifiedName ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3781:1: ( ruleQualifiedName )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3781:1: ( ruleQualifiedName )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3782:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment8976);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3796:6: ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3796:6: ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3797:1: (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3797:1: (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3798:3: lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getImplicitHardwareElementsDeploymentImplicitDefinitionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeployment9003);
                    lv_implicitHardwareElements_7_0=ruleDeploymentImplicitDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInvalidDeploymentRule());
                    	        }
                           		add(
                           			current, 
                           			"implicitHardwareElements",
                            		lv_implicitHardwareElements_7_0, 
                            		"DeploymentImplicitDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3814:3: (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==19) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3814:5: otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) )
            	    {
            	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleInvalidDeployment9017); 

            	        	newLeafNode(otherlv_8, grammarAccess.getInvalidDeploymentAccess().getCommaKeyword_6_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3818:1: ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==RULE_ID) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==70) ) {
            	        alt42=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3818:2: ( ( ruleQualifiedName ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3818:2: ( ( ruleQualifiedName ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3819:1: ( ruleQualifiedName )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3819:1: ( ruleQualifiedName )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3820:3: ruleQualifiedName
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
            	            	        }
            	                    
            	             
            	            	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_6_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment9041);
            	            ruleQualifiedName();

            	            state._fsp--;

            	             
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3834:6: ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3834:6: ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3835:1: (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3835:1: (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3836:3: lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getImplicitHardwareElementsDeploymentImplicitDefinitionParserRuleCall_6_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeployment9068);
            	            lv_implicitHardwareElements_10_0=ruleDeploymentImplicitDefinition();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getInvalidDeploymentRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"implicitHardwareElements",
            	                    		lv_implicitHardwareElements_10_0, 
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
            	    break loop43;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleInvalidDeployment9083); 

                	newLeafNode(otherlv_11, grammarAccess.getInvalidDeploymentAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleInvalidDeployment9095); 

                	newLeafNode(otherlv_12, grammarAccess.getInvalidDeploymentAccess().getSemicolonKeyword_8());
                

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3868:1: entryRuleDeploymentImplicitDefinition returns [EObject current=null] : iv_ruleDeploymentImplicitDefinition= ruleDeploymentImplicitDefinition EOF ;
    public final EObject entryRuleDeploymentImplicitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentImplicitDefinition = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3869:2: (iv_ruleDeploymentImplicitDefinition= ruleDeploymentImplicitDefinition EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3870:2: iv_ruleDeploymentImplicitDefinition= ruleDeploymentImplicitDefinition EOF
            {
             newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionRule()); 
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_entryRuleDeploymentImplicitDefinition9131);
            iv_ruleDeploymentImplicitDefinition=ruleDeploymentImplicitDefinition();

            state._fsp--;

             current =iv_ruleDeploymentImplicitDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinition9141); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3877:1: ruleDeploymentImplicitDefinition returns [EObject current=null] : (otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )* ) ;
    public final EObject ruleDeploymentImplicitDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3880:28: ( (otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3881:1: (otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )* )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3881:1: (otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3881:3: otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )*
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleDeploymentImplicitDefinition9178); 

                	newLeafNode(otherlv_0, grammarAccess.getDeploymentImplicitDefinitionAccess().getConnectorsWithKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3885:1: ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3886:1: (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3886:1: (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3887:3: lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionAccess().getEntriesDeploymentImplicitDefinitionAttributeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_ruleDeploymentImplicitDefinition9199);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3903:2: (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==62) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3903:4: otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) )
            	    {
            	    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleDeploymentImplicitDefinition9212); 

            	        	newLeafNode(otherlv_2, grammarAccess.getDeploymentImplicitDefinitionAccess().getAndKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3907:1: ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3908:1: (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3908:1: (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3909:3: lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionAccess().getEntriesDeploymentImplicitDefinitionAttributeAndValueParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_ruleDeploymentImplicitDefinition9233);
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
    // $ANTLR end "ruleDeploymentImplicitDefinition"


    // $ANTLR start "entryRuleDeploymentImplicitDefinitionAttributeAndValue"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3933:1: entryRuleDeploymentImplicitDefinitionAttributeAndValue returns [EObject current=null] : iv_ruleDeploymentImplicitDefinitionAttributeAndValue= ruleDeploymentImplicitDefinitionAttributeAndValue EOF ;
    public final EObject entryRuleDeploymentImplicitDefinitionAttributeAndValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentImplicitDefinitionAttributeAndValue = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3934:2: (iv_ruleDeploymentImplicitDefinitionAttributeAndValue= ruleDeploymentImplicitDefinitionAttributeAndValue EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3935:2: iv_ruleDeploymentImplicitDefinitionAttributeAndValue= ruleDeploymentImplicitDefinitionAttributeAndValue EOF
            {
             newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueRule()); 
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_entryRuleDeploymentImplicitDefinitionAttributeAndValue9271);
            iv_ruleDeploymentImplicitDefinitionAttributeAndValue=ruleDeploymentImplicitDefinitionAttributeAndValue();

            state._fsp--;

             current =iv_ruleDeploymentImplicitDefinitionAttributeAndValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinitionAttributeAndValue9281); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3942:1: ruleDeploymentImplicitDefinitionAttributeAndValue returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDeploymentImplicitDefinitionAttributeAndValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_attribute_0_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3945:28: ( ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3946:1: ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3946:1: ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3946:2: ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3946:2: ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3947:1: (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3947:1: (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3948:3: lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute
            {
             
            	        newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueAccess().getAttributeDeploymentImplicitDefinitionAttributeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinitionAttribute_in_ruleDeploymentImplicitDefinitionAttributeAndValue9327);
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDeploymentImplicitDefinitionAttributeAndValue9339); 

                	newLeafNode(otherlv_1, grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3968:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3969:1: (lv_value_2_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3969:1: (lv_value_2_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3970:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeploymentImplicitDefinitionAttributeAndValue9356); 

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


    // $ANTLR start "entryRuleDouble"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3994:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3995:2: (iv_ruleDouble= ruleDouble EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3996:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble9398);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble9409); 

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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4003:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4006:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4007:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4007:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4007:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble9449); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,71,FOLLOW_71_in_ruleDouble9467); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble9482); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleQualifiedName"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4035:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4036:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4037:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9528);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9539); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4044:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4047:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4048:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4048:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4048:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9579); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4055:1: (kw= '.' this_ID_2= RULE_ID )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==71) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4056:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,71,FOLLOW_71_in_ruleQualifiedName9598); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9613); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4076:1: entryRuleSIGNEDINT returns [String current=null] : iv_ruleSIGNEDINT= ruleSIGNEDINT EOF ;
    public final String entryRuleSIGNEDINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNEDINT = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4077:2: (iv_ruleSIGNEDINT= ruleSIGNEDINT EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4078:2: iv_ruleSIGNEDINT= ruleSIGNEDINT EOF
            {
             newCompositeNode(grammarAccess.getSIGNEDINTRule()); 
            pushFollow(FOLLOW_ruleSIGNEDINT_in_entryRuleSIGNEDINT9661);
            iv_ruleSIGNEDINT=ruleSIGNEDINT();

            state._fsp--;

             current =iv_ruleSIGNEDINT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSIGNEDINT9672); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4085:1: ruleSIGNEDINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSIGNEDINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4088:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4089:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4089:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4089:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4089:2: (kw= '-' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==72) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4090:2: kw= '-'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleSIGNEDINT9711); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSIGNEDINTAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSIGNEDINT9728); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4110:1: ruleProtectionLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4112:28: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4113:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4113:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) )
            int alt47=9;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt47=1;
                }
                break;
            case 74:
                {
                alt47=2;
                }
                break;
            case 75:
                {
                alt47=3;
                }
                break;
            case 76:
                {
                alt47=4;
                }
                break;
            case 77:
                {
                alt47=5;
                }
                break;
            case 78:
                {
                alt47=6;
                }
                break;
            case 79:
                {
                alt47=7;
                }
                break;
            case 80:
                {
                alt47=8;
                }
                break;
            case 81:
                {
                alt47=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4113:2: (enumLiteral_0= 'None' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4113:2: (enumLiteral_0= 'None' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4113:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_73_in_ruleProtectionLevelType9787); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getProtectionLevelTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4119:6: (enumLiteral_1= 'L1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4119:6: (enumLiteral_1= 'L1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4119:8: enumLiteral_1= 'L1'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_74_in_ruleProtectionLevelType9804); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getProtectionLevelTypeAccess().getL1EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4125:6: (enumLiteral_2= 'L2' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4125:6: (enumLiteral_2= 'L2' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4125:8: enumLiteral_2= 'L2'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_75_in_ruleProtectionLevelType9821); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getProtectionLevelTypeAccess().getL2EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4131:6: (enumLiteral_3= 'L3' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4131:6: (enumLiteral_3= 'L3' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4131:8: enumLiteral_3= 'L3'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_76_in_ruleProtectionLevelType9838); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL3EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getProtectionLevelTypeAccess().getL3EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4137:6: (enumLiteral_4= 'L4' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4137:6: (enumLiteral_4= 'L4' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4137:8: enumLiteral_4= 'L4'
                    {
                    enumLiteral_4=(Token)match(input,77,FOLLOW_77_in_ruleProtectionLevelType9855); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL4EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getProtectionLevelTypeAccess().getL4EnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4143:6: (enumLiteral_5= 'L5' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4143:6: (enumLiteral_5= 'L5' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4143:8: enumLiteral_5= 'L5'
                    {
                    enumLiteral_5=(Token)match(input,78,FOLLOW_78_in_ruleProtectionLevelType9872); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL5EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getProtectionLevelTypeAccess().getL5EnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4149:6: (enumLiteral_6= 'L6' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4149:6: (enumLiteral_6= 'L6' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4149:8: enumLiteral_6= 'L6'
                    {
                    enumLiteral_6=(Token)match(input,79,FOLLOW_79_in_ruleProtectionLevelType9889); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL6EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getProtectionLevelTypeAccess().getL6EnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4155:6: (enumLiteral_7= 'L7' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4155:6: (enumLiteral_7= 'L7' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4155:8: enumLiteral_7= 'L7'
                    {
                    enumLiteral_7=(Token)match(input,80,FOLLOW_80_in_ruleProtectionLevelType9906); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL7EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getProtectionLevelTypeAccess().getL7EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4161:6: (enumLiteral_8= 'L8' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4161:6: (enumLiteral_8= 'L8' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4161:8: enumLiteral_8= 'L8'
                    {
                    enumLiteral_8=(Token)match(input,81,FOLLOW_81_in_ruleProtectionLevelType9923); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4171:1: ruleImplicitEqInterfaceMemberDefinitionAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'Name' ) | (enumLiteral_1= 'System' ) | (enumLiteral_2= 'SubAta' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) | (enumLiteral_10= 'Resource' ) | (enumLiteral_11= 'ResourceX' ) | (enumLiteral_12= 'ResourceY' ) | (enumLiteral_13= 'ResourceZ' ) ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4173:28: ( ( (enumLiteral_0= 'Name' ) | (enumLiteral_1= 'System' ) | (enumLiteral_2= 'SubAta' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) | (enumLiteral_10= 'Resource' ) | (enumLiteral_11= 'ResourceX' ) | (enumLiteral_12= 'ResourceY' ) | (enumLiteral_13= 'ResourceZ' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4174:1: ( (enumLiteral_0= 'Name' ) | (enumLiteral_1= 'System' ) | (enumLiteral_2= 'SubAta' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) | (enumLiteral_10= 'Resource' ) | (enumLiteral_11= 'ResourceX' ) | (enumLiteral_12= 'ResourceY' ) | (enumLiteral_13= 'ResourceZ' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4174:1: ( (enumLiteral_0= 'Name' ) | (enumLiteral_1= 'System' ) | (enumLiteral_2= 'SubAta' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) | (enumLiteral_10= 'Resource' ) | (enumLiteral_11= 'ResourceX' ) | (enumLiteral_12= 'ResourceY' ) | (enumLiteral_13= 'ResourceZ' ) )
            int alt48=14;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt48=1;
                }
                break;
            case 49:
                {
                alt48=2;
                }
                break;
            case 50:
                {
                alt48=3;
                }
                break;
            case 52:
                {
                alt48=4;
                }
                break;
            case 53:
                {
                alt48=5;
                }
                break;
            case 54:
                {
                alt48=6;
                }
                break;
            case 55:
                {
                alt48=7;
                }
                break;
            case 56:
                {
                alt48=8;
                }
                break;
            case 57:
                {
                alt48=9;
                }
                break;
            case 35:
                {
                alt48=10;
                }
                break;
            case 51:
                {
                alt48=11;
                }
                break;
            case 38:
                {
                alt48=12;
                }
                break;
            case 39:
                {
                alt48=13;
                }
                break;
            case 40:
                {
                alt48=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4174:2: (enumLiteral_0= 'Name' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4174:2: (enumLiteral_0= 'Name' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4174:4: enumLiteral_0= 'Name'
                    {
                    enumLiteral_0=(Token)match(input,13,FOLLOW_13_in_ruleImplicitEqInterfaceMemberDefinitionAttribute9968); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getNAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getNAMEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4180:6: (enumLiteral_1= 'System' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4180:6: (enumLiteral_1= 'System' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4180:8: enumLiteral_1= 'System'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleImplicitEqInterfaceMemberDefinitionAttribute9985); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getSYSTEMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getSYSTEMEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4186:6: (enumLiteral_2= 'SubAta' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4186:6: (enumLiteral_2= 'SubAta' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4186:8: enumLiteral_2= 'SubAta'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_50_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10002); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getSUBATAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getSUBATAEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4192:6: (enumLiteral_3= 'LineName' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4192:6: (enumLiteral_3= 'LineName' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4192:8: enumLiteral_3= 'LineName'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_52_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10019); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getLINENAMEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getLINENAMEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4198:6: (enumLiteral_4= 'WiringLane' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4198:6: (enumLiteral_4= 'WiringLane' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4198:8: enumLiteral_4= 'WiringLane'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_53_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10036); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getWIRINGLANEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getWIRINGLANEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4204:6: (enumLiteral_5= 'GrpInfo' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4204:6: (enumLiteral_5= 'GrpInfo' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4204:8: enumLiteral_5= 'GrpInfo'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_54_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10053); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getGRPINFOEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getGRPINFOEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4210:6: (enumLiteral_6= 'Route' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4210:6: (enumLiteral_6= 'Route' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4210:8: enumLiteral_6= 'Route'
                    {
                    enumLiteral_6=(Token)match(input,55,FOLLOW_55_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10070); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getROUTEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getROUTEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4216:6: (enumLiteral_7= 'PwSup1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4216:6: (enumLiteral_7= 'PwSup1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4216:8: enumLiteral_7= 'PwSup1'
                    {
                    enumLiteral_7=(Token)match(input,56,FOLLOW_56_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10087); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getPWSUP1EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getPWSUP1EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4222:6: (enumLiteral_8= 'EmhZone1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4222:6: (enumLiteral_8= 'EmhZone1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4222:8: enumLiteral_8= 'EmhZone1'
                    {
                    enumLiteral_8=(Token)match(input,57,FOLLOW_57_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10104); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getEMHZONE1EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getEMHZONE1EnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4228:6: (enumLiteral_9= 'Type' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4228:6: (enumLiteral_9= 'Type' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4228:8: enumLiteral_9= 'Type'
                    {
                    enumLiteral_9=(Token)match(input,35,FOLLOW_35_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10121); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getIOTYPEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getIOTYPEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4234:6: (enumLiteral_10= 'Resource' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4234:6: (enumLiteral_10= 'Resource' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4234:8: enumLiteral_10= 'Resource'
                    {
                    enumLiteral_10=(Token)match(input,51,FOLLOW_51_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10138); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCEEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4240:6: (enumLiteral_11= 'ResourceX' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4240:6: (enumLiteral_11= 'ResourceX' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4240:8: enumLiteral_11= 'ResourceX'
                    {
                    enumLiteral_11=(Token)match(input,38,FOLLOW_38_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10155); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_XEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_XEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4246:6: (enumLiteral_12= 'ResourceY' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4246:6: (enumLiteral_12= 'ResourceY' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4246:8: enumLiteral_12= 'ResourceY'
                    {
                    enumLiteral_12=(Token)match(input,39,FOLLOW_39_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10172); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_YEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_YEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4252:6: (enumLiteral_13= 'ResourceZ' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4252:6: (enumLiteral_13= 'ResourceZ' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4252:8: enumLiteral_13= 'ResourceZ'
                    {
                    enumLiteral_13=(Token)match(input,40,FOLLOW_40_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10189); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4262:1: ruleHardwareArchitectureLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) ) ;
    public final Enumerator ruleHardwareArchitectureLevelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4264:28: ( ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4265:1: ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4265:1: ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt49=1;
                }
                break;
            case 32:
                {
                alt49=2;
                }
                break;
            case 43:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4265:2: (enumLiteral_0= 'Compartment' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4265:2: (enumLiteral_0= 'Compartment' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4265:4: enumLiteral_0= 'Compartment'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_27_in_ruleHardwareArchitectureLevelType10234); 

                            current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOMPARTMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOMPARTMENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4271:6: (enumLiteral_1= 'RDC' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4271:6: (enumLiteral_1= 'RDC' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4271:8: enumLiteral_1= 'RDC'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_32_in_ruleHardwareArchitectureLevelType10251); 

                            current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getRDCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getHardwareArchitectureLevelTypeAccess().getRDCEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4277:6: (enumLiteral_2= 'Connector' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4277:6: (enumLiteral_2= 'Connector' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4277:8: enumLiteral_2= 'Connector'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_43_in_ruleHardwareArchitectureLevelType10268); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4287:1: ruleDeploymentImplicitDefinitionAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'Compartment.Name' ) | (enumLiteral_1= 'Compartment.Manufacturer' ) | (enumLiteral_2= 'Compartment.PowerSupply' ) | (enumLiteral_3= 'Compartment.Side' ) | (enumLiteral_4= 'Compartment.Zone' ) | (enumLiteral_5= 'RDC.Name' ) | (enumLiteral_6= 'RDC.Manufacturer' ) | (enumLiteral_7= 'RDC.PowerSupply1' ) | (enumLiteral_8= 'RDC.PowerSupply2' ) | (enumLiteral_9= 'RDC.Side' ) | (enumLiteral_10= 'RDC.Type' ) | (enumLiteral_11= 'RDC.ESS' ) | (enumLiteral_12= 'RDC.ResourceX' ) | (enumLiteral_13= 'RDC.ResourceY' ) | (enumLiteral_14= 'RDC.ResourceZ' ) | (enumLiteral_15= 'Connector.Name' ) ) ;
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
        Token enumLiteral_15=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4289:28: ( ( (enumLiteral_0= 'Compartment.Name' ) | (enumLiteral_1= 'Compartment.Manufacturer' ) | (enumLiteral_2= 'Compartment.PowerSupply' ) | (enumLiteral_3= 'Compartment.Side' ) | (enumLiteral_4= 'Compartment.Zone' ) | (enumLiteral_5= 'RDC.Name' ) | (enumLiteral_6= 'RDC.Manufacturer' ) | (enumLiteral_7= 'RDC.PowerSupply1' ) | (enumLiteral_8= 'RDC.PowerSupply2' ) | (enumLiteral_9= 'RDC.Side' ) | (enumLiteral_10= 'RDC.Type' ) | (enumLiteral_11= 'RDC.ESS' ) | (enumLiteral_12= 'RDC.ResourceX' ) | (enumLiteral_13= 'RDC.ResourceY' ) | (enumLiteral_14= 'RDC.ResourceZ' ) | (enumLiteral_15= 'Connector.Name' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4290:1: ( (enumLiteral_0= 'Compartment.Name' ) | (enumLiteral_1= 'Compartment.Manufacturer' ) | (enumLiteral_2= 'Compartment.PowerSupply' ) | (enumLiteral_3= 'Compartment.Side' ) | (enumLiteral_4= 'Compartment.Zone' ) | (enumLiteral_5= 'RDC.Name' ) | (enumLiteral_6= 'RDC.Manufacturer' ) | (enumLiteral_7= 'RDC.PowerSupply1' ) | (enumLiteral_8= 'RDC.PowerSupply2' ) | (enumLiteral_9= 'RDC.Side' ) | (enumLiteral_10= 'RDC.Type' ) | (enumLiteral_11= 'RDC.ESS' ) | (enumLiteral_12= 'RDC.ResourceX' ) | (enumLiteral_13= 'RDC.ResourceY' ) | (enumLiteral_14= 'RDC.ResourceZ' ) | (enumLiteral_15= 'Connector.Name' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4290:1: ( (enumLiteral_0= 'Compartment.Name' ) | (enumLiteral_1= 'Compartment.Manufacturer' ) | (enumLiteral_2= 'Compartment.PowerSupply' ) | (enumLiteral_3= 'Compartment.Side' ) | (enumLiteral_4= 'Compartment.Zone' ) | (enumLiteral_5= 'RDC.Name' ) | (enumLiteral_6= 'RDC.Manufacturer' ) | (enumLiteral_7= 'RDC.PowerSupply1' ) | (enumLiteral_8= 'RDC.PowerSupply2' ) | (enumLiteral_9= 'RDC.Side' ) | (enumLiteral_10= 'RDC.Type' ) | (enumLiteral_11= 'RDC.ESS' ) | (enumLiteral_12= 'RDC.ResourceX' ) | (enumLiteral_13= 'RDC.ResourceY' ) | (enumLiteral_14= 'RDC.ResourceZ' ) | (enumLiteral_15= 'Connector.Name' ) )
            int alt50=16;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt50=1;
                }
                break;
            case 83:
                {
                alt50=2;
                }
                break;
            case 84:
                {
                alt50=3;
                }
                break;
            case 85:
                {
                alt50=4;
                }
                break;
            case 86:
                {
                alt50=5;
                }
                break;
            case 87:
                {
                alt50=6;
                }
                break;
            case 88:
                {
                alt50=7;
                }
                break;
            case 89:
                {
                alt50=8;
                }
                break;
            case 90:
                {
                alt50=9;
                }
                break;
            case 91:
                {
                alt50=10;
                }
                break;
            case 92:
                {
                alt50=11;
                }
                break;
            case 93:
                {
                alt50=12;
                }
                break;
            case 94:
                {
                alt50=13;
                }
                break;
            case 95:
                {
                alt50=14;
                }
                break;
            case 96:
                {
                alt50=15;
                }
                break;
            case 97:
                {
                alt50=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4290:2: (enumLiteral_0= 'Compartment.Name' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4290:2: (enumLiteral_0= 'Compartment.Name' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4290:4: enumLiteral_0= 'Compartment.Name'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_82_in_ruleDeploymentImplicitDefinitionAttribute10313); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_NAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_NAMEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4296:6: (enumLiteral_1= 'Compartment.Manufacturer' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4296:6: (enumLiteral_1= 'Compartment.Manufacturer' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4296:8: enumLiteral_1= 'Compartment.Manufacturer'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_83_in_ruleDeploymentImplicitDefinitionAttribute10330); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_MANUFACTUREREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_MANUFACTUREREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4302:6: (enumLiteral_2= 'Compartment.PowerSupply' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4302:6: (enumLiteral_2= 'Compartment.PowerSupply' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4302:8: enumLiteral_2= 'Compartment.PowerSupply'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_84_in_ruleDeploymentImplicitDefinitionAttribute10347); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_POWERSUPPLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_POWERSUPPLYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4308:6: (enumLiteral_3= 'Compartment.Side' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4308:6: (enumLiteral_3= 'Compartment.Side' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4308:8: enumLiteral_3= 'Compartment.Side'
                    {
                    enumLiteral_3=(Token)match(input,85,FOLLOW_85_in_ruleDeploymentImplicitDefinitionAttribute10364); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_SIDEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_SIDEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4314:6: (enumLiteral_4= 'Compartment.Zone' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4314:6: (enumLiteral_4= 'Compartment.Zone' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4314:8: enumLiteral_4= 'Compartment.Zone'
                    {
                    enumLiteral_4=(Token)match(input,86,FOLLOW_86_in_ruleDeploymentImplicitDefinitionAttribute10381); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_ZONEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_ZONEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4320:6: (enumLiteral_5= 'RDC.Name' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4320:6: (enumLiteral_5= 'RDC.Name' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4320:8: enumLiteral_5= 'RDC.Name'
                    {
                    enumLiteral_5=(Token)match(input,87,FOLLOW_87_in_ruleDeploymentImplicitDefinitionAttribute10398); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_NAMEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_NAMEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4326:6: (enumLiteral_6= 'RDC.Manufacturer' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4326:6: (enumLiteral_6= 'RDC.Manufacturer' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4326:8: enumLiteral_6= 'RDC.Manufacturer'
                    {
                    enumLiteral_6=(Token)match(input,88,FOLLOW_88_in_ruleDeploymentImplicitDefinitionAttribute10415); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_MANUFACTUREREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_MANUFACTUREREnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4332:6: (enumLiteral_7= 'RDC.PowerSupply1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4332:6: (enumLiteral_7= 'RDC.PowerSupply1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4332:8: enumLiteral_7= 'RDC.PowerSupply1'
                    {
                    enumLiteral_7=(Token)match(input,89,FOLLOW_89_in_ruleDeploymentImplicitDefinitionAttribute10432); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_POWERSUPPLY1EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_POWERSUPPLY1EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4338:6: (enumLiteral_8= 'RDC.PowerSupply2' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4338:6: (enumLiteral_8= 'RDC.PowerSupply2' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4338:8: enumLiteral_8= 'RDC.PowerSupply2'
                    {
                    enumLiteral_8=(Token)match(input,90,FOLLOW_90_in_ruleDeploymentImplicitDefinitionAttribute10449); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_POWERSUPPLY2EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_POWERSUPPLY2EnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4344:6: (enumLiteral_9= 'RDC.Side' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4344:6: (enumLiteral_9= 'RDC.Side' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4344:8: enumLiteral_9= 'RDC.Side'
                    {
                    enumLiteral_9=(Token)match(input,91,FOLLOW_91_in_ruleDeploymentImplicitDefinitionAttribute10466); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_SIDEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_SIDEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4350:6: (enumLiteral_10= 'RDC.Type' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4350:6: (enumLiteral_10= 'RDC.Type' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4350:8: enumLiteral_10= 'RDC.Type'
                    {
                    enumLiteral_10=(Token)match(input,92,FOLLOW_92_in_ruleDeploymentImplicitDefinitionAttribute10483); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_TYPEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_TYPEEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4356:6: (enumLiteral_11= 'RDC.ESS' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4356:6: (enumLiteral_11= 'RDC.ESS' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4356:8: enumLiteral_11= 'RDC.ESS'
                    {
                    enumLiteral_11=(Token)match(input,93,FOLLOW_93_in_ruleDeploymentImplicitDefinitionAttribute10500); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_ESSEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_ESSEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4362:6: (enumLiteral_12= 'RDC.ResourceX' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4362:6: (enumLiteral_12= 'RDC.ResourceX' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4362:8: enumLiteral_12= 'RDC.ResourceX'
                    {
                    enumLiteral_12=(Token)match(input,94,FOLLOW_94_in_ruleDeploymentImplicitDefinitionAttribute10517); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_XEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_XEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4368:6: (enumLiteral_13= 'RDC.ResourceY' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4368:6: (enumLiteral_13= 'RDC.ResourceY' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4368:8: enumLiteral_13= 'RDC.ResourceY'
                    {
                    enumLiteral_13=(Token)match(input,95,FOLLOW_95_in_ruleDeploymentImplicitDefinitionAttribute10534); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_YEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_YEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4374:6: (enumLiteral_14= 'RDC.ResourceZ' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4374:6: (enumLiteral_14= 'RDC.ResourceZ' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4374:8: enumLiteral_14= 'RDC.ResourceZ'
                    {
                    enumLiteral_14=(Token)match(input,96,FOLLOW_96_in_ruleDeploymentImplicitDefinitionAttribute10551); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_ZEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_ZEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4380:6: (enumLiteral_15= 'Connector.Name' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4380:6: (enumLiteral_15= 'Connector.Name' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4380:8: enumLiteral_15= 'Connector.Name'
                    {
                    enumLiteral_15=(Token)match(input,97,FOLLOW_97_in_ruleDeploymentImplicitDefinitionAttribute10568); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCONNECTOR_NAMEEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCONNECTOR_NAMEEnumLiteralDeclaration_15()); 
                        

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


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA14_eotS =
        "\15\uffff";
    static final String DFA14_eofS =
        "\15\uffff";
    static final String DFA14_minS =
        "\1\20\14\uffff";
    static final String DFA14_maxS =
        "\1\56\14\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA14_specialS =
        "\1\0\14\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\13\uffff\1\2\4\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
            "\1\13\1\uffff\1\14\2\uffff\1\1",
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1276:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply1' otherlv_9= '=' ( (lv_powerSupply1_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'PowerSupply2' otherlv_13= '=' ( (lv_powerSupply2_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Type' otherlv_17= '=' ( (lv_rdcType_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'ESS' otherlv_21= '=' ( (lv_ess_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'Location' otherlv_25= '=' ( (lv_location_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'ResourceX' otherlv_29= '=' ( (lv_resourceX_30_0= ruleSIGNEDINT ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'ResourceY' otherlv_33= '=' ( (lv_resourceY_34_0= ruleSIGNEDINT ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'ResourceZ' otherlv_37= '=' ( (lv_resourceZ_38_0= ruleSIGNEDINT ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_internalConnectedPinBlock_40_0= ruleInternalConnectedPinBlock ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connectors_41_0= ruleConnector ) ) )+ ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                         
                        int index14_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_0==16||LA14_0==46) ) {s = 1;}

                        else if ( LA14_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA14_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA14_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA14_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA14_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA14_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA14_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA14_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA14_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA14_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                        else if ( LA14_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getRDCAccess().getUnorderedGroup_3(), 10) ) {s = 12;}

                         
                        input.seek(index14_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\17\uffff";
    static final String DFA22_eofS =
        "\17\uffff";
    static final String DFA22_minS =
        "\1\20\16\uffff";
    static final String DFA22_maxS =
        "\1\71\16\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\16\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15";
    static final String DFA22_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\22\uffff\1\13\2\uffff\1\14\1\15\1\16\10\uffff\1\2\1\3"+
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

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "()* loopback of 2261:3: ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                         
                        int index22_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_0==16) ) {s = 1;}

                        else if ( LA22_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA22_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA22_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA22_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA22_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA22_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA22_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA22_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA22_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA22_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                        else if ( LA22_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 10) ) {s = 12;}

                        else if ( LA22_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 11) ) {s = 13;}

                        else if ( LA22_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 12) ) {s = 14;}

                         
                        input.seek(index22_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\11\uffff";
    static final String DFA33_eofS =
        "\11\uffff";
    static final String DFA33_minS =
        "\1\5\1\uffff\1\23\2\uffff\1\5\2\uffff\1\23";
    static final String DFA33_maxS =
        "\1\105\1\uffff\1\102\2\uffff\1\5\2\uffff\1\102";
    static final String DFA33_acceptS =
        "\1\uffff\1\5\1\uffff\1\3\1\4\1\uffff\1\2\1\1\1\uffff";
    static final String DFA33_specialS =
        "\11\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\2\12\uffff\1\1\62\uffff\1\3\1\uffff\1\4",
            "",
            "\1\5\55\uffff\1\7\1\6",
            "",
            "",
            "\1\10",
            "",
            "",
            "\1\5\55\uffff\1\7\1\6"
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "()* loopback of 3341:1: ( ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_5_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleAssistModel_in_entryRuleAssistModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssistModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalBlock_in_ruleAssistModel175 = new BitSet(new long[]{0x0400800004000802L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleCompartmentsBlock_in_ruleAssistModel250 = new BitSet(new long[]{0x0400800004000802L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleInterfacesBlock_in_ruleAssistModel325 = new BitSet(new long[]{0x0400800004000802L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleInterfaceGroupsBlock_in_ruleAssistModel400 = new BitSet(new long[]{0x0400800004000802L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleRestrictionsBlock_in_ruleAssistModel475 = new BitSet(new long[]{0x0400800004000802L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleGlobalBlock_in_entryRuleGlobalBlock556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalBlock566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleGlobalBlock612 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGlobalBlock624 = new BitSet(new long[]{0x0000000000532000L});
    public static final BitSet FOLLOW_13_in_ruleGlobalBlock682 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGlobalBlock694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlobalBlock711 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGlobalBlock728 = new BitSet(new long[]{0x0000000000532000L});
    public static final BitSet FOLLOW_ruleCompatibleIoTypesBlock_in_ruleGlobalBlock804 = new BitSet(new long[]{0x0000000000532000L});
    public static final BitSet FOLLOW_ruleCableWeightDataBlock_in_ruleGlobalBlock879 = new BitSet(new long[]{0x0000000000532000L});
    public static final BitSet FOLLOW_ruleProtectionLevelDataBlock_in_ruleGlobalBlock954 = new BitSet(new long[]{0x0000000000532000L});
    public static final BitSet FOLLOW_16_in_ruleGlobalBlock1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompatibleIoTypesBlock_in_entryRuleCompatibleIoTypesBlock1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompatibleIoTypesBlock1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleCompatibleIoTypesBlock1089 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompatibleIoTypesBlock1101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompatibleIoTypeEntry_in_ruleCompatibleIoTypesBlock1122 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleCompatibleIoTypesBlock1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompatibleIoTypeEntry_in_entryRuleCompatibleIoTypeEntry1171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompatibleIoTypeEntry1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompatibleIoTypeEntry1223 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCompatibleIoTypeEntry1240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompatibleIoTypeEntry1257 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleCompatibleIoTypeEntry1275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompatibleIoTypeEntry1292 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleCompatibleIoTypeEntry1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCableWeightDataBlock_in_entryRuleCableWeightDataBlock1347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCableWeightDataBlock1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCableWeightDataBlock1394 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCableWeightDataBlock1406 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleCableWeightEntry_in_ruleCableWeightDataBlock1427 = new BitSet(new long[]{0x0000000000210010L});
    public static final BitSet FOLLOW_16_in_ruleCableWeightDataBlock1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCableWeightEntry_in_entryRuleCableWeightEntry1476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCableWeightEntry1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCableWeightEntry1529 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_21_in_ruleCableWeightEntry1558 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCableWeightEntry1584 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleCableWeightEntry1605 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCableWeightEntry1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtectionLevelDataBlock_in_entryRuleProtectionLevelDataBlock1653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtectionLevelDataBlock1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleProtectionLevelDataBlock1700 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProtectionLevelDataBlock1712 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleProtectionLevelEntry_in_ruleProtectionLevelDataBlock1733 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_16_in_ruleProtectionLevelDataBlock1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtectionLevelEntry_in_entryRuleProtectionLevelEntry1782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtectionLevelEntry1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleProtectionLevelEntry1829 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProtectionLevelEntry1841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProtectionLevelEntry1858 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleProtectionLevelEntry1875 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleProtectionLevelEntry1887 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProtectionLevelEntry1899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProtectionLevelEntry1916 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProtectionLevelEntry1933 = new BitSet(new long[]{0x0000000000000000L,0x000000000003FE00L});
    public static final BitSet FOLLOW_ruleProtectionLevelType_in_ruleProtectionLevelEntry1954 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleProtectionLevelEntry1967 = new BitSet(new long[]{0x0000000000000000L,0x000000000003FE00L});
    public static final BitSet FOLLOW_ruleProtectionLevelType_in_ruleProtectionLevelEntry1988 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleProtectionLevelEntry2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartmentsBlock_in_entryRuleCompartmentsBlock2038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartmentsBlock2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCompartmentsBlock2094 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompartmentsBlock2106 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleCompartment_in_ruleCompartmentsBlock2127 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_16_in_ruleCompartmentsBlock2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartment_in_entryRuleCompartment2176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartment2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCompartment2223 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompartment2240 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompartment2257 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_28_in_ruleCompartment2315 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment2327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment2344 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment2361 = new BitSet(new long[]{0x00004001F0010000L});
    public static final BitSet FOLLOW_29_in_ruleCompartment2429 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment2441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment2458 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment2475 = new BitSet(new long[]{0x00004001F0010000L});
    public static final BitSet FOLLOW_30_in_ruleCompartment2543 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment2555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment2572 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment2589 = new BitSet(new long[]{0x00004001F0010000L});
    public static final BitSet FOLLOW_31_in_ruleCompartment2657 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment2669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment2686 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment2703 = new BitSet(new long[]{0x00004001F0010000L});
    public static final BitSet FOLLOW_ruleRDC_in_ruleCompartment2779 = new BitSet(new long[]{0x00004001F0010000L});
    public static final BitSet FOLLOW_ruleMetricParametersBlock_in_ruleCompartment2847 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCompartment2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDC_in_entryRuleRDC2896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRDC2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleRDC2943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRDC2960 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRDC2977 = new BitSet(new long[]{0x00000BFE10000000L});
    public static final BitSet FOLLOW_28_in_ruleRDC3035 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC3047 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC3064 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC3081 = new BitSet(new long[]{0x00004BFE10010000L});
    public static final BitSet FOLLOW_33_in_ruleRDC3149 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC3161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC3178 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC3195 = new BitSet(new long[]{0x00004BFE10010000L});
    public static final BitSet FOLLOW_34_in_ruleRDC3263 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC3275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC3292 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC3309 = new BitSet(new long[]{0x00004BFE10010000L});
    public static final BitSet FOLLOW_35_in_ruleRDC3377 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC3389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC3406 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC3423 = new BitSet(new long[]{0x00004BFE10010000L});
    public static final BitSet FOLLOW_36_in_ruleRDC3491 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC3503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC3520 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC3537 = new BitSet(new long[]{0x00004BFE10010000L});
    public static final BitSet FOLLOW_37_in_ruleRDC3605 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC3617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC3634 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC3651 = new BitSet(new long[]{0x00004BFE10010000L});
    public static final BitSet FOLLOW_38_in_ruleRDC3719 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC3731 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_ruleRDC3752 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC3764 = new BitSet(new long[]{0x00004BFE10010000L});
    public static final BitSet FOLLOW_39_in_ruleRDC3832 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC3844 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_ruleRDC3865 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC3877 = new BitSet(new long[]{0x00004BFE10010000L});
    public static final BitSet FOLLOW_40_in_ruleRDC3945 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC3957 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_ruleRDC3978 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC3990 = new BitSet(new long[]{0x00004BFE10010000L});
    public static final BitSet FOLLOW_ruleInternalConnectedPinBlock_in_ruleRDC4066 = new BitSet(new long[]{0x00004BFE10010000L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleRDC4141 = new BitSet(new long[]{0x00004BFE10010000L});
    public static final BitSet FOLLOW_ruleMetricParametersBlock_in_ruleRDC4209 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRDC4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalConnectedPinBlock_in_entryRuleInternalConnectedPinBlock4258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalConnectedPinBlock4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleInternalConnectedPinBlock4314 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInternalConnectedPinBlock4326 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleConnectedPinEntry_in_ruleInternalConnectedPinBlock4347 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleInternalConnectedPinBlock4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectedPinEntry_in_entryRuleConnectedPinEntry4396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectedPinEntry4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConnectedPinEntry4454 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConnectedPinEntry4467 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConnectedPinEntry4490 = new BitSet(new long[]{0x0000040000080000L});
    public static final BitSet FOLLOW_42_in_ruleConnectedPinEntry4504 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConnectedPinEntry4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector4552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleConnector4599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnector4616 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConnector4633 = new BitSet(new long[]{0x0000400000010020L});
    public static final BitSet FOLLOW_rulePin_in_ruleConnector4654 = new BitSet(new long[]{0x0000400000010020L});
    public static final BitSet FOLLOW_ruleMetricParametersBlock_in_ruleConnector4676 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConnector4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePin_in_entryRulePin4725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePin4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePin4777 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_rulePin4794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePin4811 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_45_in_rulePin4829 = new BitSet(new long[]{0x0000000000000000L,0x000000000003FE00L});
    public static final BitSet FOLLOW_ruleProtectionLevelType_in_rulePin4850 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePin4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParametersBlock_in_entryRuleMetricParametersBlock4900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricParametersBlock4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMetricParametersBlock4947 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMetricParametersBlock4959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleMetricParametersBlock4980 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMetricParametersBlock4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter5028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricParameter5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetricParameter5080 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMetricParameter5097 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMetricParameter5114 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMetricParameter5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfacesBlock_in_entryRuleInterfacesBlock5167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfacesBlock5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleInterfacesBlock5214 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterfacesBlock5226 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleEqInterface_in_ruleInterfacesBlock5247 = new BitSet(new long[]{0x0001000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInterfacesBlock5260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterface_in_entryRuleEqInterface5296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterface5306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleEqInterface5343 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterface5360 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterface5377 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_49_in_ruleEqInterface5435 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5464 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5481 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_50_in_ruleEqInterface5549 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5578 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5595 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_51_in_ruleEqInterface5663 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5692 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5709 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_52_in_ruleEqInterface5777 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5806 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5823 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_53_in_ruleEqInterface5891 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5920 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5937 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_54_in_ruleEqInterface6005 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface6034 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6051 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_55_in_ruleEqInterface6119 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface6148 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6165 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_56_in_ruleEqInterface6233 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface6262 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6279 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_57_in_ruleEqInterface6347 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface6376 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6393 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_35_in_ruleEqInterface6461 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface6490 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6507 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_38_in_ruleEqInterface6575 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6587 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6608 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6620 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_39_in_ruleEqInterface6688 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6700 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6721 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6733 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_40_in_ruleEqInterface6801 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6813 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6834 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6846 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_16_in_ruleEqInterface6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceGroupsBlock_in_entryRuleInterfaceGroupsBlock6935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceGroupsBlock6945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleInterfaceGroupsBlock6991 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterfaceGroupsBlock7003 = new BitSet(new long[]{0x0800000000010000L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroup_in_ruleInterfaceGroupsBlock7025 = new BitSet(new long[]{0x0800000000010000L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroupWithCombinedDefinition_in_ruleInterfaceGroupsBlock7052 = new BitSet(new long[]{0x0800000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInterfaceGroupsBlock7066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroup_in_entryRuleEqInterfaceGroup7102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterfaceGroup7112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleEqInterfaceGroup7149 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7166 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterfaceGroup7183 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7204 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup7231 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleEqInterfaceGroup7245 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7266 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup7293 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleEqInterfaceGroup7308 = new BitSet(new long[]{0x1000000000008000L});
    public static final BitSet FOLLOW_60_in_ruleEqInterfaceGroup7321 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterfaceGroup7333 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7354 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup7381 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleEqInterfaceGroup7395 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7416 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup7443 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleEqInterfaceGroup7458 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterfaceGroup7472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_entryRuleImplicitEqInterfaceMemberDefinition7508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitEqInterfaceMemberDefinition7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleImplicitEqInterfaceMemberDefinition7555 = new BitSet(new long[]{0x03FE01C800002000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_ruleImplicitEqInterfaceMemberDefinition7576 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleImplicitEqInterfaceMemberDefinition7589 = new BitSet(new long[]{0x03FE01C800002000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_ruleImplicitEqInterfaceMemberDefinition7610 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues7648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues7658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttribute_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues7704 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues7716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues7733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroupWithCombinedDefinition_in_entryRuleEqInterfaceGroupWithCombinedDefinition7774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterfaceGroupWithCombinedDefinition7784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleEqInterfaceGroupWithCombinedDefinition7821 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition7838 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleEqInterfaceGroupWithCombinedDefinition7855 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition7875 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleEqInterfaceGroupWithCombinedDefinition7888 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition7908 = new BitSet(new long[]{0x4000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterfaceGroupWithCombinedDefinition7922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionsBlock_in_entryRuleRestrictionsBlock7958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionsBlock7968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleRestrictionsBlock8014 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRestrictionsBlock8026 = new BitSet(new long[]{0x0000000000010020L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_ruleRestrictionsBlock8048 = new BitSet(new long[]{0x0000000000010020L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleColocalityRelation_in_ruleRestrictionsBlock8075 = new BitSet(new long[]{0x0000000000010020L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleValidDeployment_in_ruleRestrictionsBlock8102 = new BitSet(new long[]{0x0000000000010020L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleInvalidDeployment_in_ruleRestrictionsBlock8129 = new BitSet(new long[]{0x0000000000010020L,0x0000000000000028L});
    public static final BitSet FOLLOW_16_in_ruleRestrictionsBlock8143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation8179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDislocalityRelation8189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDislocalityRelation8234 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDislocalityRelation8247 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDislocalityRelation8267 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDislocalityRelation8281 = new BitSet(new long[]{0x0000080108000000L});
    public static final BitSet FOLLOW_ruleHardwareArchitectureLevelType_in_ruleDislocalityRelation8302 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDislocalityRelation8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColocalityRelation_in_entryRuleColocalityRelation8350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColocalityRelation8360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColocalityRelation8405 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_19_in_ruleColocalityRelation8418 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColocalityRelation8438 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleColocalityRelation8452 = new BitSet(new long[]{0x0000080108000000L});
    public static final BitSet FOLLOW_ruleHardwareArchitectureLevelType_in_ruleColocalityRelation8473 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleColocalityRelation8485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidDeployment_in_entryRuleValidDeployment8521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidDeployment8531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleValidDeployment8568 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidDeployment8588 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_19_in_ruleValidDeployment8601 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidDeployment8621 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleValidDeployment8635 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleValidDeployment8647 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleValidDeployment8671 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeployment8698 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleValidDeployment8712 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleValidDeployment8736 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeployment8763 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleValidDeployment8778 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleValidDeployment8790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvalidDeployment_in_entryRuleInvalidDeployment8826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvalidDeployment8836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleInvalidDeployment8873 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvalidDeployment8893 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_19_in_ruleInvalidDeployment8906 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvalidDeployment8926 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleInvalidDeployment8940 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInvalidDeployment8952 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment8976 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeployment9003 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleInvalidDeployment9017 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment9041 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeployment9068 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleInvalidDeployment9083 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInvalidDeployment9095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_entryRuleDeploymentImplicitDefinition9131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinition9141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleDeploymentImplicitDefinition9178 = new BitSet(new long[]{0x0000000000000000L,0x00000003FFFC0000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_ruleDeploymentImplicitDefinition9199 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDeploymentImplicitDefinition9212 = new BitSet(new long[]{0x0000000000000000L,0x00000003FFFC0000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_ruleDeploymentImplicitDefinition9233 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_entryRuleDeploymentImplicitDefinitionAttributeAndValue9271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinitionAttributeAndValue9281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinitionAttribute_in_ruleDeploymentImplicitDefinitionAttributeAndValue9327 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeploymentImplicitDefinitionAttributeAndValue9339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeploymentImplicitDefinitionAttributeAndValue9356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble9398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble9409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble9449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleDouble9467 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble9482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9579 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleQualifiedName9598 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9613 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_entryRuleSIGNEDINT9661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSIGNEDINT9672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleSIGNEDINT9711 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSIGNEDINT9728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleProtectionLevelType9787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleProtectionLevelType9804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleProtectionLevelType9821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleProtectionLevelType9838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleProtectionLevelType9855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleProtectionLevelType9872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleProtectionLevelType9889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleProtectionLevelType9906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleProtectionLevelType9923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImplicitEqInterfaceMemberDefinitionAttribute9968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleImplicitEqInterfaceMemberDefinitionAttribute9985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleHardwareArchitectureLevelType10234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleHardwareArchitectureLevelType10251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleHardwareArchitectureLevelType10268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleDeploymentImplicitDefinitionAttribute10313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleDeploymentImplicitDefinitionAttribute10330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleDeploymentImplicitDefinitionAttribute10347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleDeploymentImplicitDefinitionAttribute10364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleDeploymentImplicitDefinitionAttribute10381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleDeploymentImplicitDefinitionAttribute10398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleDeploymentImplicitDefinitionAttribute10415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleDeploymentImplicitDefinitionAttribute10432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleDeploymentImplicitDefinitionAttribute10449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleDeploymentImplicitDefinitionAttribute10466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleDeploymentImplicitDefinitionAttribute10483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleDeploymentImplicitDefinitionAttribute10500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleDeploymentImplicitDefinitionAttribute10517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleDeploymentImplicitDefinitionAttribute10534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleDeploymentImplicitDefinitionAttribute10551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleDeploymentImplicitDefinitionAttribute10568 = new BitSet(new long[]{0x0000000000000002L});

}
