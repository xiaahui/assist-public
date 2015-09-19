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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1820:1: ruleConnectedPinEntry returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= ',' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )? otherlv_5= 'are connected' otherlv_6= ';' ) ;
    public final EObject ruleConnectedPinEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1823:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ',' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )? otherlv_5= 'are connected' otherlv_6= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1824:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ',' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )? otherlv_5= 'are connected' otherlv_6= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1824:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ',' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )? otherlv_5= 'are connected' otherlv_6= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1824:2: ( ( ruleQualifiedName ) ) otherlv_1= ',' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )? otherlv_5= 'are connected' otherlv_6= ';'
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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleConnectedPinEntry4466); 

                	newLeafNode(otherlv_1, grammarAccess.getConnectedPinEntryAccess().getCommaKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1843:1: ( ( ruleQualifiedName ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1844:1: ( ruleQualifiedName )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1844:1: ( ruleQualifiedName )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1845:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectedPinEntryRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConnectedPinEntryAccess().getPinsPinCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleConnectedPinEntry4489);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1858:2: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1858:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleConnectedPinEntry4502); 

                        	newLeafNode(otherlv_3, grammarAccess.getConnectedPinEntryAccess().getCommaKeyword_3_0());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1862:1: ( ( ruleQualifiedName ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1863:1: ( ruleQualifiedName )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1863:1: ( ruleQualifiedName )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1864:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConnectedPinEntryRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getConnectedPinEntryAccess().getPinsPinCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleConnectedPinEntry4525);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleConnectedPinEntry4539); 

                	newLeafNode(otherlv_5, grammarAccess.getConnectedPinEntryAccess().getAreConnectedKeyword_4());
                
            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleConnectedPinEntry4551); 

                	newLeafNode(otherlv_6, grammarAccess.getConnectedPinEntryAccess().getSemicolonKeyword_5());
                

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1893:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1894:2: (iv_ruleConnector= ruleConnector EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1895:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector4587);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector4597); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1902:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pins_3_0= rulePin ) )* ( (lv_metricParametersBlock_4_0= ruleMetricParametersBlock ) )? otherlv_5= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1905:28: ( (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pins_3_0= rulePin ) )* ( (lv_metricParametersBlock_4_0= ruleMetricParametersBlock ) )? otherlv_5= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1906:1: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pins_3_0= rulePin ) )* ( (lv_metricParametersBlock_4_0= ruleMetricParametersBlock ) )? otherlv_5= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1906:1: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pins_3_0= rulePin ) )* ( (lv_metricParametersBlock_4_0= ruleMetricParametersBlock ) )? otherlv_5= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1906:3: otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pins_3_0= rulePin ) )* ( (lv_metricParametersBlock_4_0= ruleMetricParametersBlock ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleConnector4634); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1910:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1911:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1911:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1912:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnector4651); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConnector4668); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1932:1: ( (lv_pins_3_0= rulePin ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1933:1: (lv_pins_3_0= rulePin )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1933:1: (lv_pins_3_0= rulePin )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1934:3: lv_pins_3_0= rulePin
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectorAccess().getPinsPinParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePin_in_ruleConnector4689);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1950:3: ( (lv_metricParametersBlock_4_0= ruleMetricParametersBlock ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1951:1: (lv_metricParametersBlock_4_0= ruleMetricParametersBlock )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1951:1: (lv_metricParametersBlock_4_0= ruleMetricParametersBlock )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1952:3: lv_metricParametersBlock_4_0= ruleMetricParametersBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectorAccess().getMetricParametersBlockMetricParametersBlockParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMetricParametersBlock_in_ruleConnector4711);
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

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleConnector4724); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1980:1: entryRulePin returns [EObject current=null] : iv_rulePin= rulePin EOF ;
    public final EObject entryRulePin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePin = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1981:2: (iv_rulePin= rulePin EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1982:2: iv_rulePin= rulePin EOF
            {
             newCompositeNode(grammarAccess.getPinRule()); 
            pushFollow(FOLLOW_rulePin_in_entryRulePin4760);
            iv_rulePin=rulePin();

            state._fsp--;

             current =iv_rulePin; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePin4770); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1989:1: rulePin returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_eqInterfaceType_2_0= RULE_STRING ) ) (otherlv_3= 'protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )? otherlv_5= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1992:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_eqInterfaceType_2_0= RULE_STRING ) ) (otherlv_3= 'protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )? otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1993:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_eqInterfaceType_2_0= RULE_STRING ) ) (otherlv_3= 'protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )? otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1993:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_eqInterfaceType_2_0= RULE_STRING ) ) (otherlv_3= 'protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )? otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1993:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_eqInterfaceType_2_0= RULE_STRING ) ) (otherlv_3= 'protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )? otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1993:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1994:1: (lv_name_0_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1994:1: (lv_name_0_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1995:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePin4812); 

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

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_rulePin4829); 

                	newLeafNode(otherlv_1, grammarAccess.getPinAccess().getColonKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2015:1: ( (lv_eqInterfaceType_2_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2016:1: (lv_eqInterfaceType_2_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2016:1: (lv_eqInterfaceType_2_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2017:3: lv_eqInterfaceType_2_0= RULE_STRING
            {
            lv_eqInterfaceType_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePin4846); 

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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2033:2: (otherlv_3= 'protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2033:4: otherlv_3= 'protection level' ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_45_in_rulePin4864); 

                        	newLeafNode(otherlv_3, grammarAccess.getPinAccess().getProtectionLevelKeyword_3_0());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2037:1: ( (lv_protectionLevel_4_0= ruleProtectionLevelType ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2038:1: (lv_protectionLevel_4_0= ruleProtectionLevelType )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2038:1: (lv_protectionLevel_4_0= ruleProtectionLevelType )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2039:3: lv_protectionLevel_4_0= ruleProtectionLevelType
                    {
                     
                    	        newCompositeNode(grammarAccess.getPinAccess().getProtectionLevelProtectionLevelTypeEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProtectionLevelType_in_rulePin4885);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_rulePin4899); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2067:1: entryRuleMetricParametersBlock returns [EObject current=null] : iv_ruleMetricParametersBlock= ruleMetricParametersBlock EOF ;
    public final EObject entryRuleMetricParametersBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricParametersBlock = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2068:2: (iv_ruleMetricParametersBlock= ruleMetricParametersBlock EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2069:2: iv_ruleMetricParametersBlock= ruleMetricParametersBlock EOF
            {
             newCompositeNode(grammarAccess.getMetricParametersBlockRule()); 
            pushFollow(FOLLOW_ruleMetricParametersBlock_in_entryRuleMetricParametersBlock4935);
            iv_ruleMetricParametersBlock=ruleMetricParametersBlock();

            state._fsp--;

             current =iv_ruleMetricParametersBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricParametersBlock4945); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2076:1: ruleMetricParametersBlock returns [EObject current=null] : ( () otherlv_1= 'Metric Parameters' otherlv_2= '{' ( (lv_metricParameters_3_0= ruleMetricParameter ) )* otherlv_4= '}' ) ;
    public final EObject ruleMetricParametersBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_metricParameters_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2079:28: ( ( () otherlv_1= 'Metric Parameters' otherlv_2= '{' ( (lv_metricParameters_3_0= ruleMetricParameter ) )* otherlv_4= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2080:1: ( () otherlv_1= 'Metric Parameters' otherlv_2= '{' ( (lv_metricParameters_3_0= ruleMetricParameter ) )* otherlv_4= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2080:1: ( () otherlv_1= 'Metric Parameters' otherlv_2= '{' ( (lv_metricParameters_3_0= ruleMetricParameter ) )* otherlv_4= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2080:2: () otherlv_1= 'Metric Parameters' otherlv_2= '{' ( (lv_metricParameters_3_0= ruleMetricParameter ) )* otherlv_4= '}'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2080:2: ()
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2081:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMetricParametersBlockAccess().getMetricParametersBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleMetricParametersBlock4991); 

                	newLeafNode(otherlv_1, grammarAccess.getMetricParametersBlockAccess().getMetricParametersKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMetricParametersBlock5003); 

                	newLeafNode(otherlv_2, grammarAccess.getMetricParametersBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2094:1: ( (lv_metricParameters_3_0= ruleMetricParameter ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2095:1: (lv_metricParameters_3_0= ruleMetricParameter )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2095:1: (lv_metricParameters_3_0= ruleMetricParameter )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2096:3: lv_metricParameters_3_0= ruleMetricParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMetricParametersBlockAccess().getMetricParametersMetricParameterParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleMetricParametersBlock5024);
            	    lv_metricParameters_3_0=ruleMetricParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMetricParametersBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metricParameters",
            	            		lv_metricParameters_3_0, 
            	            		"MetricParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleMetricParametersBlock5037); 

                	newLeafNode(otherlv_4, grammarAccess.getMetricParametersBlockAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2124:1: entryRuleMetricParameter returns [EObject current=null] : iv_ruleMetricParameter= ruleMetricParameter EOF ;
    public final EObject entryRuleMetricParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricParameter = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2125:2: (iv_ruleMetricParameter= ruleMetricParameter EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2126:2: iv_ruleMetricParameter= ruleMetricParameter EOF
            {
             newCompositeNode(grammarAccess.getMetricParameterRule()); 
            pushFollow(FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter5073);
            iv_ruleMetricParameter=ruleMetricParameter();

            state._fsp--;

             current =iv_ruleMetricParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricParameter5083); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2133:1: ruleMetricParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) ;
    public final EObject ruleMetricParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2136:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2137:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2137:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2137:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2137:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2138:1: (lv_name_0_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2138:1: (lv_name_0_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2139:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetricParameter5125); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleMetricParameter5142); 

                	newLeafNode(otherlv_1, grammarAccess.getMetricParameterAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2159:1: ( (lv_value_2_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2160:1: (lv_value_2_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2160:1: (lv_value_2_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2161:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMetricParameter5159); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleMetricParameter5176); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2189:1: entryRuleInterfacesBlock returns [EObject current=null] : iv_ruleInterfacesBlock= ruleInterfacesBlock EOF ;
    public final EObject entryRuleInterfacesBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfacesBlock = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2190:2: (iv_ruleInterfacesBlock= ruleInterfacesBlock EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2191:2: iv_ruleInterfacesBlock= ruleInterfacesBlock EOF
            {
             newCompositeNode(grammarAccess.getInterfacesBlockRule()); 
            pushFollow(FOLLOW_ruleInterfacesBlock_in_entryRuleInterfacesBlock5212);
            iv_ruleInterfacesBlock=ruleInterfacesBlock();

            state._fsp--;

             current =iv_ruleInterfacesBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfacesBlock5222); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2198:1: ruleInterfacesBlock returns [EObject current=null] : (otherlv_0= 'Interfaces' otherlv_1= '{' ( (lv_eqInterfaces_2_0= ruleEqInterface ) )+ otherlv_3= '}' ) ;
    public final EObject ruleInterfacesBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_eqInterfaces_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2201:28: ( (otherlv_0= 'Interfaces' otherlv_1= '{' ( (lv_eqInterfaces_2_0= ruleEqInterface ) )+ otherlv_3= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2202:1: (otherlv_0= 'Interfaces' otherlv_1= '{' ( (lv_eqInterfaces_2_0= ruleEqInterface ) )+ otherlv_3= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2202:1: (otherlv_0= 'Interfaces' otherlv_1= '{' ( (lv_eqInterfaces_2_0= ruleEqInterface ) )+ otherlv_3= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2202:3: otherlv_0= 'Interfaces' otherlv_1= '{' ( (lv_eqInterfaces_2_0= ruleEqInterface ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleInterfacesBlock5259); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfacesBlockAccess().getInterfacesKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleInterfacesBlock5271); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfacesBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2210:1: ( (lv_eqInterfaces_2_0= ruleEqInterface ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==48) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2211:1: (lv_eqInterfaces_2_0= ruleEqInterface )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2211:1: (lv_eqInterfaces_2_0= ruleEqInterface )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2212:3: lv_eqInterfaces_2_0= ruleEqInterface
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfacesBlockAccess().getEqInterfacesEqInterfaceParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqInterface_in_ruleInterfacesBlock5292);
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleInterfacesBlock5305); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2240:1: entryRuleEqInterface returns [EObject current=null] : iv_ruleEqInterface= ruleEqInterface EOF ;
    public final EObject entryRuleEqInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterface = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2241:2: (iv_ruleEqInterface= ruleEqInterface EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2242:2: iv_ruleEqInterface= ruleEqInterface EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceRule()); 
            pushFollow(FOLLOW_ruleEqInterface_in_entryRuleEqInterface5341);
            iv_ruleEqInterface=ruleEqInterface();

            state._fsp--;

             current =iv_ruleEqInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterface5351); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2249:1: ruleEqInterface returns [EObject current=null] : (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2252:28: ( (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2253:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2253:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2253:3: otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) ) otherlv_56= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleEqInterface5388); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceAccess().getInterfaceKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2257:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2258:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2258:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2259:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterface5405); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEqInterface5422); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2279:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2281:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2281:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2282:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2285:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2286:3: ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )*
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2286:3: ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )*
            loop23:
            do {
                int alt23=14;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2288:4: ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2288:4: ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2289:5: {...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2289:108: ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2290:6: ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2293:6: ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2293:7: {...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2293:16: (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2293:18: otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleEqInterface5480); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEqInterfaceAccess().getSystemKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5492); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2301:1: ( (lv_system_6_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2302:1: (lv_system_6_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2302:1: (lv_system_6_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2303:3: lv_system_6_0= RULE_STRING
            	    {
            	    lv_system_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5509); 

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

            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5526); 

            	        	newLeafNode(otherlv_7, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2330:4: ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2330:4: ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2331:5: {...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2331:108: ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2332:6: ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2335:6: ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2335:7: {...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2335:16: (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2335:18: otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,50,FOLLOW_50_in_ruleEqInterface5594); 

            	        	newLeafNode(otherlv_8, grammarAccess.getEqInterfaceAccess().getSubAtaKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5606); 

            	        	newLeafNode(otherlv_9, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2343:1: ( (lv_subAta_10_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2344:1: (lv_subAta_10_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2344:1: (lv_subAta_10_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2345:3: lv_subAta_10_0= RULE_STRING
            	    {
            	    lv_subAta_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5623); 

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

            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5640); 

            	        	newLeafNode(otherlv_11, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2372:4: ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2372:4: ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2373:5: {...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2373:108: ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2374:6: ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2377:6: ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2377:7: {...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2377:16: (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2377:18: otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,51,FOLLOW_51_in_ruleEqInterface5708); 

            	        	newLeafNode(otherlv_12, grammarAccess.getEqInterfaceAccess().getResourceKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5720); 

            	        	newLeafNode(otherlv_13, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2385:1: ( (lv_resource_14_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2386:1: (lv_resource_14_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2386:1: (lv_resource_14_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2387:3: lv_resource_14_0= RULE_STRING
            	    {
            	    lv_resource_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5737); 

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

            	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5754); 

            	        	newLeafNode(otherlv_15, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2414:4: ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2414:4: ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2415:5: {...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2415:108: ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2416:6: ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2419:6: ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2419:7: {...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2419:16: (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2419:18: otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,52,FOLLOW_52_in_ruleEqInterface5822); 

            	        	newLeafNode(otherlv_16, grammarAccess.getEqInterfaceAccess().getLineNameKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5834); 

            	        	newLeafNode(otherlv_17, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2427:1: ( (lv_lineName_18_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2428:1: (lv_lineName_18_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2428:1: (lv_lineName_18_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2429:3: lv_lineName_18_0= RULE_STRING
            	    {
            	    lv_lineName_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5851); 

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

            	    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5868); 

            	        	newLeafNode(otherlv_19, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2456:4: ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2456:4: ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2457:5: {...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2457:108: ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2458:6: ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2461:6: ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2461:7: {...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2461:16: (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2461:18: otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,53,FOLLOW_53_in_ruleEqInterface5936); 

            	        	newLeafNode(otherlv_20, grammarAccess.getEqInterfaceAccess().getWiringLaneKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface5948); 

            	        	newLeafNode(otherlv_21, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2469:1: ( (lv_wiringLane_22_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2470:1: (lv_wiringLane_22_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2470:1: (lv_wiringLane_22_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2471:3: lv_wiringLane_22_0= RULE_STRING
            	    {
            	    lv_wiringLane_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface5965); 

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

            	    otherlv_23=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface5982); 

            	        	newLeafNode(otherlv_23, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2498:4: ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2498:4: ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2499:5: {...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2499:108: ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2500:6: ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2503:6: ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2503:7: {...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2503:16: (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2503:18: otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,54,FOLLOW_54_in_ruleEqInterface6050); 

            	        	newLeafNode(otherlv_24, grammarAccess.getEqInterfaceAccess().getGrpInfoKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6062); 

            	        	newLeafNode(otherlv_25, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2511:1: ( (lv_grpInfo_26_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2512:1: (lv_grpInfo_26_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2512:1: (lv_grpInfo_26_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2513:3: lv_grpInfo_26_0= RULE_STRING
            	    {
            	    lv_grpInfo_26_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface6079); 

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

            	    otherlv_27=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6096); 

            	        	newLeafNode(otherlv_27, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2540:4: ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2540:4: ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2541:5: {...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2541:108: ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2542:6: ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2545:6: ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2545:7: {...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2545:16: (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2545:18: otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';'
            	    {
            	    otherlv_28=(Token)match(input,55,FOLLOW_55_in_ruleEqInterface6164); 

            	        	newLeafNode(otherlv_28, grammarAccess.getEqInterfaceAccess().getRouteKeyword_3_6_0());
            	        
            	    otherlv_29=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6176); 

            	        	newLeafNode(otherlv_29, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_6_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2553:1: ( (lv_route_30_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2554:1: (lv_route_30_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2554:1: (lv_route_30_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2555:3: lv_route_30_0= RULE_STRING
            	    {
            	    lv_route_30_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface6193); 

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

            	    otherlv_31=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6210); 

            	        	newLeafNode(otherlv_31, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_6_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2582:4: ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2582:4: ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2583:5: {...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2583:108: ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2584:6: ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2587:6: ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2587:7: {...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2587:16: (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2587:18: otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';'
            	    {
            	    otherlv_32=(Token)match(input,56,FOLLOW_56_in_ruleEqInterface6278); 

            	        	newLeafNode(otherlv_32, grammarAccess.getEqInterfaceAccess().getPwSup1Keyword_3_7_0());
            	        
            	    otherlv_33=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6290); 

            	        	newLeafNode(otherlv_33, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_7_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2595:1: ( (lv_pwSup1_34_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2596:1: (lv_pwSup1_34_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2596:1: (lv_pwSup1_34_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2597:3: lv_pwSup1_34_0= RULE_STRING
            	    {
            	    lv_pwSup1_34_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface6307); 

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

            	    otherlv_35=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6324); 

            	        	newLeafNode(otherlv_35, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_7_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2624:4: ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2624:4: ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2625:5: {...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2625:108: ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2626:6: ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2629:6: ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2629:7: {...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2629:16: (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2629:18: otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';'
            	    {
            	    otherlv_36=(Token)match(input,57,FOLLOW_57_in_ruleEqInterface6392); 

            	        	newLeafNode(otherlv_36, grammarAccess.getEqInterfaceAccess().getEmhZone1Keyword_3_8_0());
            	        
            	    otherlv_37=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6404); 

            	        	newLeafNode(otherlv_37, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_8_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2637:1: ( (lv_emhZone1_38_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2638:1: (lv_emhZone1_38_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2638:1: (lv_emhZone1_38_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2639:3: lv_emhZone1_38_0= RULE_STRING
            	    {
            	    lv_emhZone1_38_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface6421); 

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

            	    otherlv_39=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6438); 

            	        	newLeafNode(otherlv_39, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_8_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2666:4: ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2666:4: ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2667:5: {...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2667:108: ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2668:6: ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2671:6: ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2671:7: {...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2671:16: (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2671:18: otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';'
            	    {
            	    otherlv_40=(Token)match(input,35,FOLLOW_35_in_ruleEqInterface6506); 

            	        	newLeafNode(otherlv_40, grammarAccess.getEqInterfaceAccess().getTypeKeyword_3_9_0());
            	        
            	    otherlv_41=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6518); 

            	        	newLeafNode(otherlv_41, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_9_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2679:1: ( (lv_ioType_42_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2680:1: (lv_ioType_42_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2680:1: (lv_ioType_42_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2681:3: lv_ioType_42_0= RULE_STRING
            	    {
            	    lv_ioType_42_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface6535); 

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

            	    otherlv_43=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6552); 

            	        	newLeafNode(otherlv_43, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_9_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2708:4: ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2708:4: ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2709:5: {...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2709:109: ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2710:6: ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 10);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2713:6: ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2713:7: {...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2713:16: (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2713:18: otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';'
            	    {
            	    otherlv_44=(Token)match(input,38,FOLLOW_38_in_ruleEqInterface6620); 

            	        	newLeafNode(otherlv_44, grammarAccess.getEqInterfaceAccess().getResourceXKeyword_3_10_0());
            	        
            	    otherlv_45=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6632); 

            	        	newLeafNode(otherlv_45, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_10_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2721:1: ( (lv_resourceX_46_0= ruleSIGNEDINT ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2722:1: (lv_resourceX_46_0= ruleSIGNEDINT )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2722:1: (lv_resourceX_46_0= ruleSIGNEDINT )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2723:3: lv_resourceX_46_0= ruleSIGNEDINT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqInterfaceAccess().getResourceXSIGNEDINTParserRuleCall_3_10_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6653);
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

            	    otherlv_47=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6665); 

            	        	newLeafNode(otherlv_47, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_10_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2750:4: ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2750:4: ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2751:5: {...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2751:109: ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2752:6: ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 11);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2755:6: ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2755:7: {...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2755:16: (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2755:18: otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';'
            	    {
            	    otherlv_48=(Token)match(input,39,FOLLOW_39_in_ruleEqInterface6733); 

            	        	newLeafNode(otherlv_48, grammarAccess.getEqInterfaceAccess().getResourceYKeyword_3_11_0());
            	        
            	    otherlv_49=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6745); 

            	        	newLeafNode(otherlv_49, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_11_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2763:1: ( (lv_resourceY_50_0= ruleSIGNEDINT ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2764:1: (lv_resourceY_50_0= ruleSIGNEDINT )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2764:1: (lv_resourceY_50_0= ruleSIGNEDINT )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2765:3: lv_resourceY_50_0= ruleSIGNEDINT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqInterfaceAccess().getResourceYSIGNEDINTParserRuleCall_3_11_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6766);
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

            	    otherlv_51=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6778); 

            	        	newLeafNode(otherlv_51, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_11_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2792:4: ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2792:4: ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2793:5: {...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 12)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2793:109: ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2794:6: ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 12);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2797:6: ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2797:7: {...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEqInterface", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2797:16: (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2797:18: otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';'
            	    {
            	    otherlv_52=(Token)match(input,40,FOLLOW_40_in_ruleEqInterface6846); 

            	        	newLeafNode(otherlv_52, grammarAccess.getEqInterfaceAccess().getResourceZKeyword_3_12_0());
            	        
            	    otherlv_53=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface6858); 

            	        	newLeafNode(otherlv_53, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_12_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2805:1: ( (lv_resourceZ_54_0= ruleSIGNEDINT ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2806:1: (lv_resourceZ_54_0= ruleSIGNEDINT )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2806:1: (lv_resourceZ_54_0= ruleSIGNEDINT )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2807:3: lv_resourceZ_54_0= ruleSIGNEDINT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqInterfaceAccess().getResourceZSIGNEDINTParserRuleCall_3_12_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6879);
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

            	    otherlv_55=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface6891); 

            	        	newLeafNode(otherlv_55, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_12_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3());
            	

            }

            otherlv_56=(Token)match(input,16,FOLLOW_16_in_ruleEqInterface6944); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2853:1: entryRuleInterfaceGroupsBlock returns [EObject current=null] : iv_ruleInterfaceGroupsBlock= ruleInterfaceGroupsBlock EOF ;
    public final EObject entryRuleInterfaceGroupsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceGroupsBlock = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2854:2: (iv_ruleInterfaceGroupsBlock= ruleInterfaceGroupsBlock EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2855:2: iv_ruleInterfaceGroupsBlock= ruleInterfaceGroupsBlock EOF
            {
             newCompositeNode(grammarAccess.getInterfaceGroupsBlockRule()); 
            pushFollow(FOLLOW_ruleInterfaceGroupsBlock_in_entryRuleInterfaceGroupsBlock6980);
            iv_ruleInterfaceGroupsBlock=ruleInterfaceGroupsBlock();

            state._fsp--;

             current =iv_ruleInterfaceGroupsBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceGroupsBlock6990); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2862:1: ruleInterfaceGroupsBlock returns [EObject current=null] : ( () otherlv_1= 'InterfaceGroups' otherlv_2= '{' ( ( (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleInterfaceGroupsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_eqInterfaceGroups_3_0 = null;

        EObject lv_eqInterfaceGroups_4_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2865:28: ( ( () otherlv_1= 'InterfaceGroups' otherlv_2= '{' ( ( (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_5= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2866:1: ( () otherlv_1= 'InterfaceGroups' otherlv_2= '{' ( ( (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_5= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2866:1: ( () otherlv_1= 'InterfaceGroups' otherlv_2= '{' ( ( (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_5= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2866:2: () otherlv_1= 'InterfaceGroups' otherlv_2= '{' ( ( (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )* otherlv_5= '}'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2866:2: ()
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2867:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfaceGroupsBlockAccess().getInterfaceGroupsBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleInterfaceGroupsBlock7036); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfaceGroupsBlockAccess().getInterfaceGroupsKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInterfaceGroupsBlock7048); 

                	newLeafNode(otherlv_2, grammarAccess.getInterfaceGroupsBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2880:1: ( ( (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup ) ) | ( (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition ) ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==59) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==RULE_ID) ) {
                        int LA24_3 = input.LA(3);

                        if ( (LA24_3==12) ) {
                            alt24=1;
                        }
                        else if ( (LA24_3==63) ) {
                            alt24=2;
                        }


                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2880:2: ( (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2880:2: ( (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2881:1: (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2881:1: (lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2882:3: lv_eqInterfaceGroups_3_0= ruleEqInterfaceGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceGroupsBlockAccess().getEqInterfaceGroupsEqInterfaceGroupParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqInterfaceGroup_in_ruleInterfaceGroupsBlock7070);
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
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2899:6: ( (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2899:6: ( (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2900:1: (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2900:1: (lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2901:3: lv_eqInterfaceGroups_4_0= ruleEqInterfaceGroupWithCombinedDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceGroupsBlockAccess().getEqInterfaceGroupsEqInterfaceGroupWithCombinedDefinitionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqInterfaceGroupWithCombinedDefinition_in_ruleInterfaceGroupsBlock7097);
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
            	    break loop24;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleInterfaceGroupsBlock7111); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2929:1: entryRuleEqInterfaceGroup returns [EObject current=null] : iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF ;
    public final EObject entryRuleEqInterfaceGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterfaceGroup = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2930:2: (iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2931:2: iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceGroupRule()); 
            pushFollow(FOLLOW_ruleEqInterfaceGroup_in_entryRuleEqInterfaceGroup7147);
            iv_ruleEqInterfaceGroup=ruleEqInterfaceGroup();

            state._fsp--;

             current =iv_ruleEqInterfaceGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterfaceGroup7157); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2938:1: ruleEqInterfaceGroup returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )? otherlv_17= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2941:28: ( (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )? otherlv_17= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2942:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )? otherlv_17= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2942:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )? otherlv_17= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2942:3: otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_8= '}' (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )? otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleEqInterfaceGroup7194); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceGroupAccess().getGroupKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2946:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2947:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2947:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2948:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7211); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEqInterfaceGroup7228); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceGroupAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2968:1: ( ( (otherlv_3= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
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
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2968:2: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2968:2: ( (otherlv_3= RULE_ID ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2969:1: (otherlv_3= RULE_ID )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2969:1: (otherlv_3= RULE_ID )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2970:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7249); 

                    		newLeafNode(otherlv_3, grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_3_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2982:6: ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2982:6: ( (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2983:1: (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2983:1: (lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:2984:3: lv_implicitMemberDefinitions_4_0= ruleImplicitEqInterfaceMemberDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqInterfaceGroupAccess().getImplicitMemberDefinitionsImplicitEqInterfaceMemberDefinitionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup7276);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3000:3: (otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==19) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3000:5: otherlv_5= ',' ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEqInterfaceGroup7290); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEqInterfaceGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3004:1: ( ( (otherlv_6= RULE_ID ) ) | ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==RULE_ID) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==61) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3004:2: ( (otherlv_6= RULE_ID ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3004:2: ( (otherlv_6= RULE_ID ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3005:1: (otherlv_6= RULE_ID )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3005:1: (otherlv_6= RULE_ID )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3006:3: otherlv_6= RULE_ID
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
            	            	        }
            	                    
            	            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7311); 

            	            		newLeafNode(otherlv_6, grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_4_1_0_0()); 
            	            	

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3018:6: ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3018:6: ( (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3019:1: (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3019:1: (lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3020:3: lv_implicitMemberDefinitions_7_0= ruleImplicitEqInterfaceMemberDefinition
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getEqInterfaceGroupAccess().getImplicitMemberDefinitionsImplicitEqInterfaceMemberDefinitionParserRuleCall_4_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup7338);
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
            	    break loop27;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleEqInterfaceGroup7353); 

                	newLeafNode(otherlv_8, grammarAccess.getEqInterfaceGroupAccess().getRightCurlyBracketKeyword_5());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3040:1: (otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==60) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3040:3: otherlv_9= 'without' otherlv_10= '{' ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )* otherlv_16= '}'
                    {
                    otherlv_9=(Token)match(input,60,FOLLOW_60_in_ruleEqInterfaceGroup7366); 

                        	newLeafNode(otherlv_9, grammarAccess.getEqInterfaceGroupAccess().getWithoutKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleEqInterfaceGroup7378); 

                        	newLeafNode(otherlv_10, grammarAccess.getEqInterfaceGroupAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3048:1: ( ( (otherlv_11= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
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
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3048:2: ( (otherlv_11= RULE_ID ) )
                            {
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3048:2: ( (otherlv_11= RULE_ID ) )
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3049:1: (otherlv_11= RULE_ID )
                            {
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3049:1: (otherlv_11= RULE_ID )
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3050:3: otherlv_11= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
                            	        }
                                    
                            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7399); 

                            		newLeafNode(otherlv_11, grammarAccess.getEqInterfaceGroupAccess().getWithoutEqInterfacesEqInterfaceCrossReference_6_2_0_0()); 
                            	

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3062:6: ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) )
                            {
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3062:6: ( (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition ) )
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3063:1: (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition )
                            {
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3063:1: (lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition )
                            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3064:3: lv_withoutImplicitMemberDefinitions_12_0= ruleImplicitEqInterfaceMemberDefinition
                            {
                             
                            	        newCompositeNode(grammarAccess.getEqInterfaceGroupAccess().getWithoutImplicitMemberDefinitionsImplicitEqInterfaceMemberDefinitionParserRuleCall_6_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup7426);
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

                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3080:3: (otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==19) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3080:5: otherlv_13= ',' ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
                    	    {
                    	    otherlv_13=(Token)match(input,19,FOLLOW_19_in_ruleEqInterfaceGroup7440); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getEqInterfaceGroupAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3084:1: ( ( (otherlv_14= RULE_ID ) ) | ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) ) )
                    	    int alt29=2;
                    	    int LA29_0 = input.LA(1);

                    	    if ( (LA29_0==RULE_ID) ) {
                    	        alt29=1;
                    	    }
                    	    else if ( (LA29_0==61) ) {
                    	        alt29=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 29, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt29) {
                    	        case 1 :
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3084:2: ( (otherlv_14= RULE_ID ) )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3084:2: ( (otherlv_14= RULE_ID ) )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3085:1: (otherlv_14= RULE_ID )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3085:1: (otherlv_14= RULE_ID )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3086:3: otherlv_14= RULE_ID
                    	            {

                    	            			if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
                    	            	        }
                    	                    
                    	            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7461); 

                    	            		newLeafNode(otherlv_14, grammarAccess.getEqInterfaceGroupAccess().getWithoutEqInterfacesEqInterfaceCrossReference_6_3_1_0_0()); 
                    	            	

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3098:6: ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3098:6: ( (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition ) )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3099:1: (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition )
                    	            {
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3099:1: (lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition )
                    	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3100:3: lv_withoutImplicitMemberDefinitions_15_0= ruleImplicitEqInterfaceMemberDefinition
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getEqInterfaceGroupAccess().getWithoutImplicitMemberDefinitionsImplicitEqInterfaceMemberDefinitionParserRuleCall_6_3_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup7488);
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
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleEqInterfaceGroup7503); 

                        	newLeafNode(otherlv_16, grammarAccess.getEqInterfaceGroupAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleEqInterfaceGroup7517); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3132:1: entryRuleImplicitEqInterfaceMemberDefinition returns [EObject current=null] : iv_ruleImplicitEqInterfaceMemberDefinition= ruleImplicitEqInterfaceMemberDefinition EOF ;
    public final EObject entryRuleImplicitEqInterfaceMemberDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitEqInterfaceMemberDefinition = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3133:2: (iv_ruleImplicitEqInterfaceMemberDefinition= ruleImplicitEqInterfaceMemberDefinition EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3134:2: iv_ruleImplicitEqInterfaceMemberDefinition= ruleImplicitEqInterfaceMemberDefinition EOF
            {
             newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionRule()); 
            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_entryRuleImplicitEqInterfaceMemberDefinition7553);
            iv_ruleImplicitEqInterfaceMemberDefinition=ruleImplicitEqInterfaceMemberDefinition();

            state._fsp--;

             current =iv_ruleImplicitEqInterfaceMemberDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitEqInterfaceMemberDefinition7563); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3141:1: ruleImplicitEqInterfaceMemberDefinition returns [EObject current=null] : (otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )* ) ;
    public final EObject ruleImplicitEqInterfaceMemberDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3144:28: ( (otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3145:1: (otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )* )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3145:1: (otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3145:3: otherlv_0= 'interfaces with' ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )*
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleImplicitEqInterfaceMemberDefinition7600); 

                	newLeafNode(otherlv_0, grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getInterfacesWithKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3149:1: ( (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3150:1: (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3150:1: (lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3151:3: lv_entries_1_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues
            {
             
            	        newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getEntriesImplicitEqInterfaceMemberDefinitionAttributesAndValuesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_ruleImplicitEqInterfaceMemberDefinition7621);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3167:2: (otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==62) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3167:4: otherlv_2= 'and' ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) )
            	    {
            	    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleImplicitEqInterfaceMemberDefinition7634); 

            	        	newLeafNode(otherlv_2, grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getAndKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3171:1: ( (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3172:1: (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3172:1: (lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3173:3: lv_entries_3_0= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getEntriesImplicitEqInterfaceMemberDefinitionAttributesAndValuesParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_ruleImplicitEqInterfaceMemberDefinition7655);
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
    // $ANTLR end "ruleImplicitEqInterfaceMemberDefinition"


    // $ANTLR start "entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3197:1: entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues returns [EObject current=null] : iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues EOF ;
    public final EObject entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3198:2: (iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3199:2: iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues= ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues EOF
            {
             newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesRule()); 
            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues7693);
            iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues=ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues();

            state._fsp--;

             current =iv_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues7703); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3206:1: ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_attribute_0_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3209:28: ( ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3210:1: ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3210:1: ( ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3210:2: ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3210:2: ( (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3211:1: (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3211:1: (lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3212:3: lv_attribute_0_0= ruleImplicitEqInterfaceMemberDefinitionAttribute
            {
             
            	        newCompositeNode(grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesAccess().getAttributeImplicitEqInterfaceMemberDefinitionAttributeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttribute_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues7749);
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues7761); 

                	newLeafNode(otherlv_1, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3232:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3233:1: (lv_value_2_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3233:1: (lv_value_2_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3234:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues7778); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3258:1: entryRuleEqInterfaceGroupWithCombinedDefinition returns [EObject current=null] : iv_ruleEqInterfaceGroupWithCombinedDefinition= ruleEqInterfaceGroupWithCombinedDefinition EOF ;
    public final EObject entryRuleEqInterfaceGroupWithCombinedDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterfaceGroupWithCombinedDefinition = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3259:2: (iv_ruleEqInterfaceGroupWithCombinedDefinition= ruleEqInterfaceGroupWithCombinedDefinition EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3260:2: iv_ruleEqInterfaceGroupWithCombinedDefinition= ruleEqInterfaceGroupWithCombinedDefinition EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionRule()); 
            pushFollow(FOLLOW_ruleEqInterfaceGroupWithCombinedDefinition_in_entryRuleEqInterfaceGroupWithCombinedDefinition7819);
            iv_ruleEqInterfaceGroupWithCombinedDefinition=ruleEqInterfaceGroupWithCombinedDefinition();

            state._fsp--;

             current =iv_ruleEqInterfaceGroupWithCombinedDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterfaceGroupWithCombinedDefinition7829); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3267:1: ruleEqInterfaceGroupWithCombinedDefinition returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3270:28: ( (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3271:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3271:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3271:3: otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'combines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleEqInterfaceGroupWithCombinedDefinition7866); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getGroupKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3275:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3276:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3276:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3277:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition7883); 

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

            otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleEqInterfaceGroupWithCombinedDefinition7900); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getCombinesKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3297:1: ( (otherlv_3= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3298:1: (otherlv_3= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3298:1: (otherlv_3= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3299:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition7920); 

            		newLeafNode(otherlv_3, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getCombinedGroupsEqInterfaceGroupCrossReference_3_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3310:2: (otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==62) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3310:4: otherlv_4= 'and' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,62,FOLLOW_62_in_ruleEqInterfaceGroupWithCombinedDefinition7933); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getAndKeyword_4_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3314:1: ( (otherlv_5= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3315:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3315:1: (otherlv_5= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3316:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition7953); 

            	    		newLeafNode(otherlv_5, grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getCombinedGroupsEqInterfaceGroupCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleEqInterfaceGroupWithCombinedDefinition7967); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3339:1: entryRuleRestrictionsBlock returns [EObject current=null] : iv_ruleRestrictionsBlock= ruleRestrictionsBlock EOF ;
    public final EObject entryRuleRestrictionsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictionsBlock = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3340:2: (iv_ruleRestrictionsBlock= ruleRestrictionsBlock EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3341:2: iv_ruleRestrictionsBlock= ruleRestrictionsBlock EOF
            {
             newCompositeNode(grammarAccess.getRestrictionsBlockRule()); 
            pushFollow(FOLLOW_ruleRestrictionsBlock_in_entryRuleRestrictionsBlock8003);
            iv_ruleRestrictionsBlock=ruleRestrictionsBlock();

            state._fsp--;

             current =iv_ruleRestrictionsBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictionsBlock8013); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3348:1: ruleRestrictionsBlock returns [EObject current=null] : ( () otherlv_1= 'Restrictions' otherlv_2= '{' ( ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_5_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) ) )* otherlv_7= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3351:28: ( ( () otherlv_1= 'Restrictions' otherlv_2= '{' ( ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_5_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) ) )* otherlv_7= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3352:1: ( () otherlv_1= 'Restrictions' otherlv_2= '{' ( ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_5_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) ) )* otherlv_7= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3352:1: ( () otherlv_1= 'Restrictions' otherlv_2= '{' ( ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_5_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) ) )* otherlv_7= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3352:2: () otherlv_1= 'Restrictions' otherlv_2= '{' ( ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_5_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) ) )* otherlv_7= '}'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3352:2: ()
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3353:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRestrictionsBlockAccess().getRestrictionsBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleRestrictionsBlock8059); 

                	newLeafNode(otherlv_1, grammarAccess.getRestrictionsBlockAccess().getRestrictionsKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRestrictionsBlock8071); 

                	newLeafNode(otherlv_2, grammarAccess.getRestrictionsBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3366:1: ( ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_5_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) ) )*
            loop34:
            do {
                int alt34=5;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3366:2: ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3366:2: ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3367:1: (lv_dislocalityRelations_3_0= ruleDislocalityRelation )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3367:1: (lv_dislocalityRelations_3_0= ruleDislocalityRelation )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3368:3: lv_dislocalityRelations_3_0= ruleDislocalityRelation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestrictionsBlockAccess().getDislocalityRelationsDislocalityRelationParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDislocalityRelation_in_ruleRestrictionsBlock8093);
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
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3385:6: ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3385:6: ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3386:1: (lv_colocalityRelations_4_0= ruleColocalityRelation )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3386:1: (lv_colocalityRelations_4_0= ruleColocalityRelation )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3387:3: lv_colocalityRelations_4_0= ruleColocalityRelation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestrictionsBlockAccess().getColocalityRelationsColocalityRelationParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColocalityRelation_in_ruleRestrictionsBlock8120);
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
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3404:6: ( (lv_validDeployments_5_0= ruleValidDeployment ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3404:6: ( (lv_validDeployments_5_0= ruleValidDeployment ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3405:1: (lv_validDeployments_5_0= ruleValidDeployment )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3405:1: (lv_validDeployments_5_0= ruleValidDeployment )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3406:3: lv_validDeployments_5_0= ruleValidDeployment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestrictionsBlockAccess().getValidDeploymentsValidDeploymentParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValidDeployment_in_ruleRestrictionsBlock8147);
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
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3423:6: ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3423:6: ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3424:1: (lv_invalidDeployments_6_0= ruleInvalidDeployment )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3424:1: (lv_invalidDeployments_6_0= ruleInvalidDeployment )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3425:3: lv_invalidDeployments_6_0= ruleInvalidDeployment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestrictionsBlockAccess().getInvalidDeploymentsInvalidDeploymentParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInvalidDeployment_in_ruleRestrictionsBlock8174);
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
            	    break loop34;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleRestrictionsBlock8188); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3453:1: entryRuleDislocalityRelation returns [EObject current=null] : iv_ruleDislocalityRelation= ruleDislocalityRelation EOF ;
    public final EObject entryRuleDislocalityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDislocalityRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3454:2: (iv_ruleDislocalityRelation= ruleDislocalityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3455:2: iv_ruleDislocalityRelation= ruleDislocalityRelation EOF
            {
             newCompositeNode(grammarAccess.getDislocalityRelationRule()); 
            pushFollow(FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation8224);
            iv_ruleDislocalityRelation=ruleDislocalityRelation();

            state._fsp--;

             current =iv_ruleDislocalityRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDislocalityRelation8234); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3462:1: ruleDislocalityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3465:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3466:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3466:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3466:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'dislocal up to' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3466:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3467:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3467:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3468:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDislocalityRelationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDislocalityRelation8279); 

            		newLeafNode(otherlv_0, grammarAccess.getDislocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_0_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3479:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==19) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3479:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleDislocalityRelation8292); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDislocalityRelationAccess().getCommaKeyword_1_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3483:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3484:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3484:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3485:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDislocalityRelationRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDislocalityRelation8312); 

            	    		newLeafNode(otherlv_2, grammarAccess.getDislocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_3=(Token)match(input,65,FOLLOW_65_in_ruleDislocalityRelation8326); 

                	newLeafNode(otherlv_3, grammarAccess.getDislocalityRelationAccess().getDislocalUpToKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3500:1: ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3501:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3501:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3502:3: lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType
            {
             
            	        newCompositeNode(grammarAccess.getDislocalityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleHardwareArchitectureLevelType_in_ruleDislocalityRelation8347);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDislocalityRelation8359); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3530:1: entryRuleColocalityRelation returns [EObject current=null] : iv_ruleColocalityRelation= ruleColocalityRelation EOF ;
    public final EObject entryRuleColocalityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColocalityRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3531:2: (iv_ruleColocalityRelation= ruleColocalityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3532:2: iv_ruleColocalityRelation= ruleColocalityRelation EOF
            {
             newCompositeNode(grammarAccess.getColocalityRelationRule()); 
            pushFollow(FOLLOW_ruleColocalityRelation_in_entryRuleColocalityRelation8395);
            iv_ruleColocalityRelation=ruleColocalityRelation();

            state._fsp--;

             current =iv_ruleColocalityRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColocalityRelation8405); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3539:1: ruleColocalityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3542:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3543:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3543:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3543:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'on same' ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) ) otherlv_5= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3543:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3544:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3544:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3545:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getColocalityRelationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColocalityRelation8450); 

            		newLeafNode(otherlv_0, grammarAccess.getColocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_0_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3556:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==19) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3556:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleColocalityRelation8463); 

            	        	newLeafNode(otherlv_1, grammarAccess.getColocalityRelationAccess().getCommaKeyword_1_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3560:1: ( (otherlv_2= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3561:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3561:1: (otherlv_2= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3562:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getColocalityRelationRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColocalityRelation8483); 

            	    		newLeafNode(otherlv_2, grammarAccess.getColocalityRelationAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleColocalityRelation8497); 

                	newLeafNode(otherlv_3, grammarAccess.getColocalityRelationAccess().getOnSameKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3577:1: ( (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3578:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3578:1: (lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3579:3: lv_hardwareLevel_4_0= ruleHardwareArchitectureLevelType
            {
             
            	        newCompositeNode(grammarAccess.getColocalityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleHardwareArchitectureLevelType_in_ruleColocalityRelation8518);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleColocalityRelation8530); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3607:1: entryRuleValidDeployment returns [EObject current=null] : iv_ruleValidDeployment= ruleValidDeployment EOF ;
    public final EObject entryRuleValidDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidDeployment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3608:2: (iv_ruleValidDeployment= ruleValidDeployment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3609:2: iv_ruleValidDeployment= ruleValidDeployment EOF
            {
             newCompositeNode(grammarAccess.getValidDeploymentRule()); 
            pushFollow(FOLLOW_ruleValidDeployment_in_entryRuleValidDeployment8566);
            iv_ruleValidDeployment=ruleValidDeployment();

            state._fsp--;

             current =iv_ruleValidDeployment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidDeployment8576); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3616:1: ruleValidDeployment returns [EObject current=null] : (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3619:28: ( (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3620:1: (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3620:1: (otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3620:3: otherlv_0= 'Valid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleValidDeployment8613); 

                	newLeafNode(otherlv_0, grammarAccess.getValidDeploymentAccess().getValidForKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3624:1: ( (otherlv_1= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3625:1: (otherlv_1= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3625:1: (otherlv_1= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3626:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getValidDeploymentRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidDeployment8633); 

            		newLeafNode(otherlv_1, grammarAccess.getValidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3637:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==19) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3637:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleValidDeployment8646); 

            	        	newLeafNode(otherlv_2, grammarAccess.getValidDeploymentAccess().getCommaKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3641:1: ( (otherlv_3= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3642:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3642:1: (otherlv_3= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3643:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getValidDeploymentRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidDeployment8666); 

            	    		newLeafNode(otherlv_3, grammarAccess.getValidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleValidDeployment8680); 

                	newLeafNode(otherlv_4, grammarAccess.getValidDeploymentAccess().getAreKeyword_3());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleValidDeployment8692); 

                	newLeafNode(otherlv_5, grammarAccess.getValidDeploymentAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3662:1: ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) )
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
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3662:2: ( ( ruleQualifiedName ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3662:2: ( ( ruleQualifiedName ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3663:1: ( ruleQualifiedName )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3663:1: ( ruleQualifiedName )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3664:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getValidDeploymentRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleValidDeployment8716);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3678:6: ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3678:6: ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3679:1: (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3679:1: (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3680:3: lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getImplicitHardwareElementsDeploymentImplicitDefinitionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeployment8743);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3696:3: (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==19) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3696:5: otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) )
            	    {
            	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleValidDeployment8757); 

            	        	newLeafNode(otherlv_8, grammarAccess.getValidDeploymentAccess().getCommaKeyword_6_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3700:1: ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) )
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==RULE_ID) ) {
            	        alt39=1;
            	    }
            	    else if ( (LA39_0==70) ) {
            	        alt39=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3700:2: ( ( ruleQualifiedName ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3700:2: ( ( ruleQualifiedName ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3701:1: ( ruleQualifiedName )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3701:1: ( ruleQualifiedName )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3702:3: ruleQualifiedName
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getValidDeploymentRule());
            	            	        }
            	                    
            	             
            	            	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_6_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleValidDeployment8781);
            	            ruleQualifiedName();

            	            state._fsp--;

            	             
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3716:6: ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3716:6: ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3717:1: (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3717:1: (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3718:3: lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getValidDeploymentAccess().getImplicitHardwareElementsDeploymentImplicitDefinitionParserRuleCall_6_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeployment8808);
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
            	    break loop40;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleValidDeployment8823); 

                	newLeafNode(otherlv_11, grammarAccess.getValidDeploymentAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleValidDeployment8835); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3750:1: entryRuleInvalidDeployment returns [EObject current=null] : iv_ruleInvalidDeployment= ruleInvalidDeployment EOF ;
    public final EObject entryRuleInvalidDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidDeployment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3751:2: (iv_ruleInvalidDeployment= ruleInvalidDeployment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3752:2: iv_ruleInvalidDeployment= ruleInvalidDeployment EOF
            {
             newCompositeNode(grammarAccess.getInvalidDeploymentRule()); 
            pushFollow(FOLLOW_ruleInvalidDeployment_in_entryRuleInvalidDeployment8871);
            iv_ruleInvalidDeployment=ruleInvalidDeployment();

            state._fsp--;

             current =iv_ruleInvalidDeployment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvalidDeployment8881); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3759:1: ruleInvalidDeployment returns [EObject current=null] : (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3762:28: ( (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3763:1: (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3763:1: (otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3763:3: otherlv_0= 'Invalid for' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'are' otherlv_5= '{' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) ) (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )* otherlv_11= '}' otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleInvalidDeployment8918); 

                	newLeafNode(otherlv_0, grammarAccess.getInvalidDeploymentAccess().getInvalidForKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3767:1: ( (otherlv_1= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3768:1: (otherlv_1= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3768:1: (otherlv_1= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3769:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvalidDeployment8938); 

            		newLeafNode(otherlv_1, grammarAccess.getInvalidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_1_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3780:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==19) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3780:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleInvalidDeployment8951); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInvalidDeploymentAccess().getCommaKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3784:1: ( (otherlv_3= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3785:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3785:1: (otherlv_3= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3786:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvalidDeployment8971); 

            	    		newLeafNode(otherlv_3, grammarAccess.getInvalidDeploymentAccess().getEqInterfaceOrGroupsEqInterfaceOrGroupCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleInvalidDeployment8985); 

                	newLeafNode(otherlv_4, grammarAccess.getInvalidDeploymentAccess().getAreKeyword_3());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleInvalidDeployment8997); 

                	newLeafNode(otherlv_5, grammarAccess.getInvalidDeploymentAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3805:1: ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) ) )
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
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3805:2: ( ( ruleQualifiedName ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3805:2: ( ( ruleQualifiedName ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3806:1: ( ruleQualifiedName )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3806:1: ( ruleQualifiedName )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3807:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment9021);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3821:6: ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3821:6: ( (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3822:1: (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3822:1: (lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3823:3: lv_implicitHardwareElements_7_0= ruleDeploymentImplicitDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getImplicitHardwareElementsDeploymentImplicitDefinitionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeployment9048);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3839:3: (otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==19) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3839:5: otherlv_8= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) )
            	    {
            	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleInvalidDeployment9062); 

            	        	newLeafNode(otherlv_8, grammarAccess.getInvalidDeploymentAccess().getCommaKeyword_6_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3843:1: ( ( ( ruleQualifiedName ) ) | ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) ) )
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==RULE_ID) ) {
            	        alt43=1;
            	    }
            	    else if ( (LA43_0==70) ) {
            	        alt43=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 43, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3843:2: ( ( ruleQualifiedName ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3843:2: ( ( ruleQualifiedName ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3844:1: ( ruleQualifiedName )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3844:1: ( ruleQualifiedName )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3845:3: ruleQualifiedName
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getInvalidDeploymentRule());
            	            	        }
            	                    
            	             
            	            	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getHardwareElementsHardwareElementCrossReference_6_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment9086);
            	            ruleQualifiedName();

            	            state._fsp--;

            	             
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3859:6: ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3859:6: ( (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition ) )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3860:1: (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition )
            	            {
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3860:1: (lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition )
            	            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3861:3: lv_implicitHardwareElements_10_0= ruleDeploymentImplicitDefinition
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getInvalidDeploymentAccess().getImplicitHardwareElementsDeploymentImplicitDefinitionParserRuleCall_6_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeployment9113);
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
            	    break loop44;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleInvalidDeployment9128); 

                	newLeafNode(otherlv_11, grammarAccess.getInvalidDeploymentAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleInvalidDeployment9140); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3893:1: entryRuleDeploymentImplicitDefinition returns [EObject current=null] : iv_ruleDeploymentImplicitDefinition= ruleDeploymentImplicitDefinition EOF ;
    public final EObject entryRuleDeploymentImplicitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentImplicitDefinition = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3894:2: (iv_ruleDeploymentImplicitDefinition= ruleDeploymentImplicitDefinition EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3895:2: iv_ruleDeploymentImplicitDefinition= ruleDeploymentImplicitDefinition EOF
            {
             newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionRule()); 
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinition_in_entryRuleDeploymentImplicitDefinition9176);
            iv_ruleDeploymentImplicitDefinition=ruleDeploymentImplicitDefinition();

            state._fsp--;

             current =iv_ruleDeploymentImplicitDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinition9186); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3902:1: ruleDeploymentImplicitDefinition returns [EObject current=null] : (otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )* ) ;
    public final EObject ruleDeploymentImplicitDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3905:28: ( (otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3906:1: (otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )* )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3906:1: (otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3906:3: otherlv_0= 'connectors with' ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )*
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleDeploymentImplicitDefinition9223); 

                	newLeafNode(otherlv_0, grammarAccess.getDeploymentImplicitDefinitionAccess().getConnectorsWithKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3910:1: ( (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3911:1: (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3911:1: (lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3912:3: lv_entries_1_0= ruleDeploymentImplicitDefinitionAttributeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionAccess().getEntriesDeploymentImplicitDefinitionAttributeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_ruleDeploymentImplicitDefinition9244);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3928:2: (otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==62) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3928:4: otherlv_2= 'and' ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) )
            	    {
            	    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleDeploymentImplicitDefinition9257); 

            	        	newLeafNode(otherlv_2, grammarAccess.getDeploymentImplicitDefinitionAccess().getAndKeyword_2_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3932:1: ( (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3933:1: (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3933:1: (lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3934:3: lv_entries_3_0= ruleDeploymentImplicitDefinitionAttributeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionAccess().getEntriesDeploymentImplicitDefinitionAttributeAndValueParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_ruleDeploymentImplicitDefinition9278);
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
    // $ANTLR end "ruleDeploymentImplicitDefinition"


    // $ANTLR start "entryRuleDeploymentImplicitDefinitionAttributeAndValue"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3958:1: entryRuleDeploymentImplicitDefinitionAttributeAndValue returns [EObject current=null] : iv_ruleDeploymentImplicitDefinitionAttributeAndValue= ruleDeploymentImplicitDefinitionAttributeAndValue EOF ;
    public final EObject entryRuleDeploymentImplicitDefinitionAttributeAndValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentImplicitDefinitionAttributeAndValue = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3959:2: (iv_ruleDeploymentImplicitDefinitionAttributeAndValue= ruleDeploymentImplicitDefinitionAttributeAndValue EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3960:2: iv_ruleDeploymentImplicitDefinitionAttributeAndValue= ruleDeploymentImplicitDefinitionAttributeAndValue EOF
            {
             newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueRule()); 
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_entryRuleDeploymentImplicitDefinitionAttributeAndValue9316);
            iv_ruleDeploymentImplicitDefinitionAttributeAndValue=ruleDeploymentImplicitDefinitionAttributeAndValue();

            state._fsp--;

             current =iv_ruleDeploymentImplicitDefinitionAttributeAndValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinitionAttributeAndValue9326); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3967:1: ruleDeploymentImplicitDefinitionAttributeAndValue returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDeploymentImplicitDefinitionAttributeAndValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_attribute_0_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3970:28: ( ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3971:1: ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3971:1: ( ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3971:2: ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3971:2: ( (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3972:1: (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3972:1: (lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3973:3: lv_attribute_0_0= ruleDeploymentImplicitDefinitionAttribute
            {
             
            	        newCompositeNode(grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueAccess().getAttributeDeploymentImplicitDefinitionAttributeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDeploymentImplicitDefinitionAttribute_in_ruleDeploymentImplicitDefinitionAttributeAndValue9372);
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDeploymentImplicitDefinitionAttributeAndValue9384); 

                	newLeafNode(otherlv_1, grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3993:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3994:1: (lv_value_2_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3994:1: (lv_value_2_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:3995:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeploymentImplicitDefinitionAttributeAndValue9401); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4019:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4020:2: (iv_ruleDouble= ruleDouble EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4021:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble9443);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble9454); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4028:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4031:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4032:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4032:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4032:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble9494); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,71,FOLLOW_71_in_ruleDouble9512); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble9527); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4060:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4061:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4062:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9573);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9584); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4069:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4072:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4073:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4073:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4073:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9624); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4080:1: (kw= '.' this_ID_2= RULE_ID )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==71) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4081:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,71,FOLLOW_71_in_ruleQualifiedName9643); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9658); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4101:1: entryRuleSIGNEDINT returns [String current=null] : iv_ruleSIGNEDINT= ruleSIGNEDINT EOF ;
    public final String entryRuleSIGNEDINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNEDINT = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4102:2: (iv_ruleSIGNEDINT= ruleSIGNEDINT EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4103:2: iv_ruleSIGNEDINT= ruleSIGNEDINT EOF
            {
             newCompositeNode(grammarAccess.getSIGNEDINTRule()); 
            pushFollow(FOLLOW_ruleSIGNEDINT_in_entryRuleSIGNEDINT9706);
            iv_ruleSIGNEDINT=ruleSIGNEDINT();

            state._fsp--;

             current =iv_ruleSIGNEDINT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSIGNEDINT9717); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4110:1: ruleSIGNEDINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSIGNEDINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4113:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4114:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4114:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4114:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4114:2: (kw= '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==72) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4115:2: kw= '-'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleSIGNEDINT9756); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSIGNEDINTAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSIGNEDINT9773); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4135:1: ruleProtectionLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4137:28: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4138:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4138:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'L1' ) | (enumLiteral_2= 'L2' ) | (enumLiteral_3= 'L3' ) | (enumLiteral_4= 'L4' ) | (enumLiteral_5= 'L5' ) | (enumLiteral_6= 'L6' ) | (enumLiteral_7= 'L7' ) | (enumLiteral_8= 'L8' ) )
            int alt48=9;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt48=1;
                }
                break;
            case 74:
                {
                alt48=2;
                }
                break;
            case 75:
                {
                alt48=3;
                }
                break;
            case 76:
                {
                alt48=4;
                }
                break;
            case 77:
                {
                alt48=5;
                }
                break;
            case 78:
                {
                alt48=6;
                }
                break;
            case 79:
                {
                alt48=7;
                }
                break;
            case 80:
                {
                alt48=8;
                }
                break;
            case 81:
                {
                alt48=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4138:2: (enumLiteral_0= 'None' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4138:2: (enumLiteral_0= 'None' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4138:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_73_in_ruleProtectionLevelType9832); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getProtectionLevelTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4144:6: (enumLiteral_1= 'L1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4144:6: (enumLiteral_1= 'L1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4144:8: enumLiteral_1= 'L1'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_74_in_ruleProtectionLevelType9849); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getProtectionLevelTypeAccess().getL1EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4150:6: (enumLiteral_2= 'L2' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4150:6: (enumLiteral_2= 'L2' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4150:8: enumLiteral_2= 'L2'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_75_in_ruleProtectionLevelType9866); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getProtectionLevelTypeAccess().getL2EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4156:6: (enumLiteral_3= 'L3' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4156:6: (enumLiteral_3= 'L3' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4156:8: enumLiteral_3= 'L3'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_76_in_ruleProtectionLevelType9883); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL3EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getProtectionLevelTypeAccess().getL3EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4162:6: (enumLiteral_4= 'L4' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4162:6: (enumLiteral_4= 'L4' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4162:8: enumLiteral_4= 'L4'
                    {
                    enumLiteral_4=(Token)match(input,77,FOLLOW_77_in_ruleProtectionLevelType9900); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL4EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getProtectionLevelTypeAccess().getL4EnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4168:6: (enumLiteral_5= 'L5' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4168:6: (enumLiteral_5= 'L5' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4168:8: enumLiteral_5= 'L5'
                    {
                    enumLiteral_5=(Token)match(input,78,FOLLOW_78_in_ruleProtectionLevelType9917); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL5EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getProtectionLevelTypeAccess().getL5EnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4174:6: (enumLiteral_6= 'L6' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4174:6: (enumLiteral_6= 'L6' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4174:8: enumLiteral_6= 'L6'
                    {
                    enumLiteral_6=(Token)match(input,79,FOLLOW_79_in_ruleProtectionLevelType9934); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL6EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getProtectionLevelTypeAccess().getL6EnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4180:6: (enumLiteral_7= 'L7' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4180:6: (enumLiteral_7= 'L7' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4180:8: enumLiteral_7= 'L7'
                    {
                    enumLiteral_7=(Token)match(input,80,FOLLOW_80_in_ruleProtectionLevelType9951); 

                            current = grammarAccess.getProtectionLevelTypeAccess().getL7EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getProtectionLevelTypeAccess().getL7EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4186:6: (enumLiteral_8= 'L8' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4186:6: (enumLiteral_8= 'L8' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4186:8: enumLiteral_8= 'L8'
                    {
                    enumLiteral_8=(Token)match(input,81,FOLLOW_81_in_ruleProtectionLevelType9968); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4196:1: ruleImplicitEqInterfaceMemberDefinitionAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'Name' ) | (enumLiteral_1= 'System' ) | (enumLiteral_2= 'SubAta' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) | (enumLiteral_10= 'Resource' ) | (enumLiteral_11= 'ResourceX' ) | (enumLiteral_12= 'ResourceY' ) | (enumLiteral_13= 'ResourceZ' ) ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4198:28: ( ( (enumLiteral_0= 'Name' ) | (enumLiteral_1= 'System' ) | (enumLiteral_2= 'SubAta' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) | (enumLiteral_10= 'Resource' ) | (enumLiteral_11= 'ResourceX' ) | (enumLiteral_12= 'ResourceY' ) | (enumLiteral_13= 'ResourceZ' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4199:1: ( (enumLiteral_0= 'Name' ) | (enumLiteral_1= 'System' ) | (enumLiteral_2= 'SubAta' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) | (enumLiteral_10= 'Resource' ) | (enumLiteral_11= 'ResourceX' ) | (enumLiteral_12= 'ResourceY' ) | (enumLiteral_13= 'ResourceZ' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4199:1: ( (enumLiteral_0= 'Name' ) | (enumLiteral_1= 'System' ) | (enumLiteral_2= 'SubAta' ) | (enumLiteral_3= 'LineName' ) | (enumLiteral_4= 'WiringLane' ) | (enumLiteral_5= 'GrpInfo' ) | (enumLiteral_6= 'Route' ) | (enumLiteral_7= 'PwSup1' ) | (enumLiteral_8= 'EmhZone1' ) | (enumLiteral_9= 'Type' ) | (enumLiteral_10= 'Resource' ) | (enumLiteral_11= 'ResourceX' ) | (enumLiteral_12= 'ResourceY' ) | (enumLiteral_13= 'ResourceZ' ) )
            int alt49=14;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt49=1;
                }
                break;
            case 49:
                {
                alt49=2;
                }
                break;
            case 50:
                {
                alt49=3;
                }
                break;
            case 52:
                {
                alt49=4;
                }
                break;
            case 53:
                {
                alt49=5;
                }
                break;
            case 54:
                {
                alt49=6;
                }
                break;
            case 55:
                {
                alt49=7;
                }
                break;
            case 56:
                {
                alt49=8;
                }
                break;
            case 57:
                {
                alt49=9;
                }
                break;
            case 35:
                {
                alt49=10;
                }
                break;
            case 51:
                {
                alt49=11;
                }
                break;
            case 38:
                {
                alt49=12;
                }
                break;
            case 39:
                {
                alt49=13;
                }
                break;
            case 40:
                {
                alt49=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4199:2: (enumLiteral_0= 'Name' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4199:2: (enumLiteral_0= 'Name' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4199:4: enumLiteral_0= 'Name'
                    {
                    enumLiteral_0=(Token)match(input,13,FOLLOW_13_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10013); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getNAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getNAMEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4205:6: (enumLiteral_1= 'System' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4205:6: (enumLiteral_1= 'System' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4205:8: enumLiteral_1= 'System'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10030); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getSYSTEMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getSYSTEMEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4211:6: (enumLiteral_2= 'SubAta' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4211:6: (enumLiteral_2= 'SubAta' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4211:8: enumLiteral_2= 'SubAta'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_50_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10047); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getSUBATAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getSUBATAEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4217:6: (enumLiteral_3= 'LineName' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4217:6: (enumLiteral_3= 'LineName' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4217:8: enumLiteral_3= 'LineName'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_52_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10064); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getLINENAMEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getLINENAMEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4223:6: (enumLiteral_4= 'WiringLane' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4223:6: (enumLiteral_4= 'WiringLane' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4223:8: enumLiteral_4= 'WiringLane'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_53_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10081); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getWIRINGLANEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getWIRINGLANEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4229:6: (enumLiteral_5= 'GrpInfo' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4229:6: (enumLiteral_5= 'GrpInfo' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4229:8: enumLiteral_5= 'GrpInfo'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_54_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10098); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getGRPINFOEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getGRPINFOEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4235:6: (enumLiteral_6= 'Route' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4235:6: (enumLiteral_6= 'Route' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4235:8: enumLiteral_6= 'Route'
                    {
                    enumLiteral_6=(Token)match(input,55,FOLLOW_55_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10115); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getROUTEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getROUTEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4241:6: (enumLiteral_7= 'PwSup1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4241:6: (enumLiteral_7= 'PwSup1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4241:8: enumLiteral_7= 'PwSup1'
                    {
                    enumLiteral_7=(Token)match(input,56,FOLLOW_56_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10132); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getPWSUP1EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getPWSUP1EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4247:6: (enumLiteral_8= 'EmhZone1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4247:6: (enumLiteral_8= 'EmhZone1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4247:8: enumLiteral_8= 'EmhZone1'
                    {
                    enumLiteral_8=(Token)match(input,57,FOLLOW_57_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10149); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getEMHZONE1EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getEMHZONE1EnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4253:6: (enumLiteral_9= 'Type' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4253:6: (enumLiteral_9= 'Type' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4253:8: enumLiteral_9= 'Type'
                    {
                    enumLiteral_9=(Token)match(input,35,FOLLOW_35_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10166); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getIOTYPEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getIOTYPEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4259:6: (enumLiteral_10= 'Resource' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4259:6: (enumLiteral_10= 'Resource' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4259:8: enumLiteral_10= 'Resource'
                    {
                    enumLiteral_10=(Token)match(input,51,FOLLOW_51_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10183); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCEEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4265:6: (enumLiteral_11= 'ResourceX' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4265:6: (enumLiteral_11= 'ResourceX' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4265:8: enumLiteral_11= 'ResourceX'
                    {
                    enumLiteral_11=(Token)match(input,38,FOLLOW_38_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10200); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_XEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_XEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4271:6: (enumLiteral_12= 'ResourceY' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4271:6: (enumLiteral_12= 'ResourceY' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4271:8: enumLiteral_12= 'ResourceY'
                    {
                    enumLiteral_12=(Token)match(input,39,FOLLOW_39_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10217); 

                            current = grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_YEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getRESOURCE_YEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4277:6: (enumLiteral_13= 'ResourceZ' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4277:6: (enumLiteral_13= 'ResourceZ' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4277:8: enumLiteral_13= 'ResourceZ'
                    {
                    enumLiteral_13=(Token)match(input,40,FOLLOW_40_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10234); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4287:1: ruleHardwareArchitectureLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) ) ;
    public final Enumerator ruleHardwareArchitectureLevelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4289:28: ( ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4290:1: ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4290:1: ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt50=1;
                }
                break;
            case 32:
                {
                alt50=2;
                }
                break;
            case 43:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4290:2: (enumLiteral_0= 'Compartment' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4290:2: (enumLiteral_0= 'Compartment' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4290:4: enumLiteral_0= 'Compartment'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_27_in_ruleHardwareArchitectureLevelType10279); 

                            current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOMPARTMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOMPARTMENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4296:6: (enumLiteral_1= 'RDC' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4296:6: (enumLiteral_1= 'RDC' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4296:8: enumLiteral_1= 'RDC'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_32_in_ruleHardwareArchitectureLevelType10296); 

                            current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getRDCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getHardwareArchitectureLevelTypeAccess().getRDCEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4302:6: (enumLiteral_2= 'Connector' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4302:6: (enumLiteral_2= 'Connector' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4302:8: enumLiteral_2= 'Connector'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_43_in_ruleHardwareArchitectureLevelType10313); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4312:1: ruleDeploymentImplicitDefinitionAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'Compartment.Name' ) | (enumLiteral_1= 'Compartment.Manufacturer' ) | (enumLiteral_2= 'Compartment.PowerSupply' ) | (enumLiteral_3= 'Compartment.Side' ) | (enumLiteral_4= 'Compartment.Zone' ) | (enumLiteral_5= 'RDC.Name' ) | (enumLiteral_6= 'RDC.Manufacturer' ) | (enumLiteral_7= 'RDC.PowerSupply1' ) | (enumLiteral_8= 'RDC.PowerSupply2' ) | (enumLiteral_9= 'RDC.Side' ) | (enumLiteral_10= 'RDC.Type' ) | (enumLiteral_11= 'RDC.ESS' ) | (enumLiteral_12= 'RDC.ResourceX' ) | (enumLiteral_13= 'RDC.ResourceY' ) | (enumLiteral_14= 'RDC.ResourceZ' ) | (enumLiteral_15= 'Connector.Name' ) ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4314:28: ( ( (enumLiteral_0= 'Compartment.Name' ) | (enumLiteral_1= 'Compartment.Manufacturer' ) | (enumLiteral_2= 'Compartment.PowerSupply' ) | (enumLiteral_3= 'Compartment.Side' ) | (enumLiteral_4= 'Compartment.Zone' ) | (enumLiteral_5= 'RDC.Name' ) | (enumLiteral_6= 'RDC.Manufacturer' ) | (enumLiteral_7= 'RDC.PowerSupply1' ) | (enumLiteral_8= 'RDC.PowerSupply2' ) | (enumLiteral_9= 'RDC.Side' ) | (enumLiteral_10= 'RDC.Type' ) | (enumLiteral_11= 'RDC.ESS' ) | (enumLiteral_12= 'RDC.ResourceX' ) | (enumLiteral_13= 'RDC.ResourceY' ) | (enumLiteral_14= 'RDC.ResourceZ' ) | (enumLiteral_15= 'Connector.Name' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4315:1: ( (enumLiteral_0= 'Compartment.Name' ) | (enumLiteral_1= 'Compartment.Manufacturer' ) | (enumLiteral_2= 'Compartment.PowerSupply' ) | (enumLiteral_3= 'Compartment.Side' ) | (enumLiteral_4= 'Compartment.Zone' ) | (enumLiteral_5= 'RDC.Name' ) | (enumLiteral_6= 'RDC.Manufacturer' ) | (enumLiteral_7= 'RDC.PowerSupply1' ) | (enumLiteral_8= 'RDC.PowerSupply2' ) | (enumLiteral_9= 'RDC.Side' ) | (enumLiteral_10= 'RDC.Type' ) | (enumLiteral_11= 'RDC.ESS' ) | (enumLiteral_12= 'RDC.ResourceX' ) | (enumLiteral_13= 'RDC.ResourceY' ) | (enumLiteral_14= 'RDC.ResourceZ' ) | (enumLiteral_15= 'Connector.Name' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4315:1: ( (enumLiteral_0= 'Compartment.Name' ) | (enumLiteral_1= 'Compartment.Manufacturer' ) | (enumLiteral_2= 'Compartment.PowerSupply' ) | (enumLiteral_3= 'Compartment.Side' ) | (enumLiteral_4= 'Compartment.Zone' ) | (enumLiteral_5= 'RDC.Name' ) | (enumLiteral_6= 'RDC.Manufacturer' ) | (enumLiteral_7= 'RDC.PowerSupply1' ) | (enumLiteral_8= 'RDC.PowerSupply2' ) | (enumLiteral_9= 'RDC.Side' ) | (enumLiteral_10= 'RDC.Type' ) | (enumLiteral_11= 'RDC.ESS' ) | (enumLiteral_12= 'RDC.ResourceX' ) | (enumLiteral_13= 'RDC.ResourceY' ) | (enumLiteral_14= 'RDC.ResourceZ' ) | (enumLiteral_15= 'Connector.Name' ) )
            int alt51=16;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt51=1;
                }
                break;
            case 83:
                {
                alt51=2;
                }
                break;
            case 84:
                {
                alt51=3;
                }
                break;
            case 85:
                {
                alt51=4;
                }
                break;
            case 86:
                {
                alt51=5;
                }
                break;
            case 87:
                {
                alt51=6;
                }
                break;
            case 88:
                {
                alt51=7;
                }
                break;
            case 89:
                {
                alt51=8;
                }
                break;
            case 90:
                {
                alt51=9;
                }
                break;
            case 91:
                {
                alt51=10;
                }
                break;
            case 92:
                {
                alt51=11;
                }
                break;
            case 93:
                {
                alt51=12;
                }
                break;
            case 94:
                {
                alt51=13;
                }
                break;
            case 95:
                {
                alt51=14;
                }
                break;
            case 96:
                {
                alt51=15;
                }
                break;
            case 97:
                {
                alt51=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4315:2: (enumLiteral_0= 'Compartment.Name' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4315:2: (enumLiteral_0= 'Compartment.Name' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4315:4: enumLiteral_0= 'Compartment.Name'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_82_in_ruleDeploymentImplicitDefinitionAttribute10358); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_NAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_NAMEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4321:6: (enumLiteral_1= 'Compartment.Manufacturer' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4321:6: (enumLiteral_1= 'Compartment.Manufacturer' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4321:8: enumLiteral_1= 'Compartment.Manufacturer'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_83_in_ruleDeploymentImplicitDefinitionAttribute10375); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_MANUFACTUREREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_MANUFACTUREREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4327:6: (enumLiteral_2= 'Compartment.PowerSupply' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4327:6: (enumLiteral_2= 'Compartment.PowerSupply' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4327:8: enumLiteral_2= 'Compartment.PowerSupply'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_84_in_ruleDeploymentImplicitDefinitionAttribute10392); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_POWERSUPPLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_POWERSUPPLYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4333:6: (enumLiteral_3= 'Compartment.Side' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4333:6: (enumLiteral_3= 'Compartment.Side' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4333:8: enumLiteral_3= 'Compartment.Side'
                    {
                    enumLiteral_3=(Token)match(input,85,FOLLOW_85_in_ruleDeploymentImplicitDefinitionAttribute10409); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_SIDEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_SIDEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4339:6: (enumLiteral_4= 'Compartment.Zone' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4339:6: (enumLiteral_4= 'Compartment.Zone' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4339:8: enumLiteral_4= 'Compartment.Zone'
                    {
                    enumLiteral_4=(Token)match(input,86,FOLLOW_86_in_ruleDeploymentImplicitDefinitionAttribute10426); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_ZONEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getCOMPARTMENT_ZONEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4345:6: (enumLiteral_5= 'RDC.Name' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4345:6: (enumLiteral_5= 'RDC.Name' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4345:8: enumLiteral_5= 'RDC.Name'
                    {
                    enumLiteral_5=(Token)match(input,87,FOLLOW_87_in_ruleDeploymentImplicitDefinitionAttribute10443); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_NAMEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_NAMEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4351:6: (enumLiteral_6= 'RDC.Manufacturer' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4351:6: (enumLiteral_6= 'RDC.Manufacturer' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4351:8: enumLiteral_6= 'RDC.Manufacturer'
                    {
                    enumLiteral_6=(Token)match(input,88,FOLLOW_88_in_ruleDeploymentImplicitDefinitionAttribute10460); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_MANUFACTUREREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_MANUFACTUREREnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4357:6: (enumLiteral_7= 'RDC.PowerSupply1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4357:6: (enumLiteral_7= 'RDC.PowerSupply1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4357:8: enumLiteral_7= 'RDC.PowerSupply1'
                    {
                    enumLiteral_7=(Token)match(input,89,FOLLOW_89_in_ruleDeploymentImplicitDefinitionAttribute10477); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_POWERSUPPLY1EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_POWERSUPPLY1EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4363:6: (enumLiteral_8= 'RDC.PowerSupply2' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4363:6: (enumLiteral_8= 'RDC.PowerSupply2' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4363:8: enumLiteral_8= 'RDC.PowerSupply2'
                    {
                    enumLiteral_8=(Token)match(input,90,FOLLOW_90_in_ruleDeploymentImplicitDefinitionAttribute10494); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_POWERSUPPLY2EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_POWERSUPPLY2EnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4369:6: (enumLiteral_9= 'RDC.Side' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4369:6: (enumLiteral_9= 'RDC.Side' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4369:8: enumLiteral_9= 'RDC.Side'
                    {
                    enumLiteral_9=(Token)match(input,91,FOLLOW_91_in_ruleDeploymentImplicitDefinitionAttribute10511); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_SIDEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_SIDEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4375:6: (enumLiteral_10= 'RDC.Type' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4375:6: (enumLiteral_10= 'RDC.Type' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4375:8: enumLiteral_10= 'RDC.Type'
                    {
                    enumLiteral_10=(Token)match(input,92,FOLLOW_92_in_ruleDeploymentImplicitDefinitionAttribute10528); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_TYPEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_TYPEEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4381:6: (enumLiteral_11= 'RDC.ESS' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4381:6: (enumLiteral_11= 'RDC.ESS' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4381:8: enumLiteral_11= 'RDC.ESS'
                    {
                    enumLiteral_11=(Token)match(input,93,FOLLOW_93_in_ruleDeploymentImplicitDefinitionAttribute10545); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_ESSEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_ESSEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4387:6: (enumLiteral_12= 'RDC.ResourceX' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4387:6: (enumLiteral_12= 'RDC.ResourceX' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4387:8: enumLiteral_12= 'RDC.ResourceX'
                    {
                    enumLiteral_12=(Token)match(input,94,FOLLOW_94_in_ruleDeploymentImplicitDefinitionAttribute10562); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_XEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_XEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4393:6: (enumLiteral_13= 'RDC.ResourceY' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4393:6: (enumLiteral_13= 'RDC.ResourceY' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4393:8: enumLiteral_13= 'RDC.ResourceY'
                    {
                    enumLiteral_13=(Token)match(input,95,FOLLOW_95_in_ruleDeploymentImplicitDefinitionAttribute10579); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_YEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_YEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4399:6: (enumLiteral_14= 'RDC.ResourceZ' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4399:6: (enumLiteral_14= 'RDC.ResourceZ' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4399:8: enumLiteral_14= 'RDC.ResourceZ'
                    {
                    enumLiteral_14=(Token)match(input,96,FOLLOW_96_in_ruleDeploymentImplicitDefinitionAttribute10596); 

                            current = grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_ZEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getRDC_RESOURCE_ZEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4405:6: (enumLiteral_15= 'Connector.Name' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4405:6: (enumLiteral_15= 'Connector.Name' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:4405:8: enumLiteral_15= 'Connector.Name'
                    {
                    enumLiteral_15=(Token)match(input,97,FOLLOW_97_in_ruleDeploymentImplicitDefinitionAttribute10613); 

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
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA34 dfa34 = new DFA34(this);
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
    static final String DFA23_eotS =
        "\17\uffff";
    static final String DFA23_eofS =
        "\17\uffff";
    static final String DFA23_minS =
        "\1\20\16\uffff";
    static final String DFA23_maxS =
        "\1\71\16\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\16\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15";
    static final String DFA23_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA23_transitionS = {
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

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "()* loopback of 2286:3: ( ({...}? => ( ({...}? => (otherlv_4= 'System' otherlv_5= '=' ( (lv_system_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'SubAta' otherlv_9= '=' ( (lv_subAta_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Resource' otherlv_13= '=' ( (lv_resource_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'LineName' otherlv_17= '=' ( (lv_lineName_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'WiringLane' otherlv_21= '=' ( (lv_wiringLane_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'GrpInfo' otherlv_25= '=' ( (lv_grpInfo_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'Route' otherlv_29= '=' ( (lv_route_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'PwSup1' otherlv_33= '=' ( (lv_pwSup1_34_0= RULE_STRING ) ) otherlv_35= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'EmhZone1' otherlv_37= '=' ( (lv_emhZone1_38_0= RULE_STRING ) ) otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'Type' otherlv_41= '=' ( (lv_ioType_42_0= RULE_STRING ) ) otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'ResourceX' otherlv_45= '=' ( (lv_resourceX_46_0= ruleSIGNEDINT ) ) otherlv_47= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ResourceY' otherlv_49= '=' ( (lv_resourceY_50_0= ruleSIGNEDINT ) ) otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'ResourceZ' otherlv_53= '=' ( (lv_resourceZ_54_0= ruleSIGNEDINT ) ) otherlv_55= ';' ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA23_0==16) ) {s = 1;}

                        else if ( LA23_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA23_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA23_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA23_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA23_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA23_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA23_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA23_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA23_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA23_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                        else if ( LA23_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 10) ) {s = 12;}

                        else if ( LA23_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 11) ) {s = 13;}

                        else if ( LA23_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), 12) ) {s = 14;}

                         
                        input.seek(index23_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\11\uffff";
    static final String DFA34_eofS =
        "\11\uffff";
    static final String DFA34_minS =
        "\1\5\1\uffff\1\23\2\uffff\1\5\2\uffff\1\23";
    static final String DFA34_maxS =
        "\1\105\1\uffff\1\102\2\uffff\1\5\2\uffff\1\102";
    static final String DFA34_acceptS =
        "\1\uffff\1\5\1\uffff\1\3\1\4\1\uffff\1\2\1\1\1\uffff";
    static final String DFA34_specialS =
        "\11\uffff}>";
    static final String[] DFA34_transitionS = {
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "()* loopback of 3366:1: ( ( (lv_dislocalityRelations_3_0= ruleDislocalityRelation ) ) | ( (lv_colocalityRelations_4_0= ruleColocalityRelation ) ) | ( (lv_validDeployments_5_0= ruleValidDeployment ) ) | ( (lv_invalidDeployments_6_0= ruleInvalidDeployment ) ) )*";
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
    public static final BitSet FOLLOW_19_in_ruleConnectedPinEntry4466 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConnectedPinEntry4489 = new BitSet(new long[]{0x0000040000080000L});
    public static final BitSet FOLLOW_19_in_ruleConnectedPinEntry4502 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConnectedPinEntry4525 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleConnectedPinEntry4539 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConnectedPinEntry4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector4587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleConnector4634 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnector4651 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConnector4668 = new BitSet(new long[]{0x0000400000010020L});
    public static final BitSet FOLLOW_rulePin_in_ruleConnector4689 = new BitSet(new long[]{0x0000400000010020L});
    public static final BitSet FOLLOW_ruleMetricParametersBlock_in_ruleConnector4711 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConnector4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePin_in_entryRulePin4760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePin4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePin4812 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_rulePin4829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePin4846 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_45_in_rulePin4864 = new BitSet(new long[]{0x0000000000000000L,0x000000000003FE00L});
    public static final BitSet FOLLOW_ruleProtectionLevelType_in_rulePin4885 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePin4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParametersBlock_in_entryRuleMetricParametersBlock4935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricParametersBlock4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMetricParametersBlock4991 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMetricParametersBlock5003 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleMetricParametersBlock5024 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleMetricParametersBlock5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter5073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricParameter5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetricParameter5125 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMetricParameter5142 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMetricParameter5159 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMetricParameter5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfacesBlock_in_entryRuleInterfacesBlock5212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfacesBlock5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleInterfacesBlock5259 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterfacesBlock5271 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleEqInterface_in_ruleInterfacesBlock5292 = new BitSet(new long[]{0x0001000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInterfacesBlock5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterface_in_entryRuleEqInterface5341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterface5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleEqInterface5388 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterface5405 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterface5422 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_49_in_ruleEqInterface5480 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5509 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5526 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_50_in_ruleEqInterface5594 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5623 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5640 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_51_in_ruleEqInterface5708 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5737 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5754 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_52_in_ruleEqInterface5822 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5834 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5851 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5868 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_53_in_ruleEqInterface5936 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface5948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface5965 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface5982 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_54_in_ruleEqInterface6050 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface6079 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6096 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_55_in_ruleEqInterface6164 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface6193 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6210 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_56_in_ruleEqInterface6278 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface6307 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6324 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_57_in_ruleEqInterface6392 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface6421 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6438 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_35_in_ruleEqInterface6506 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface6535 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6552 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_38_in_ruleEqInterface6620 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6632 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6653 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6665 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_39_in_ruleEqInterface6733 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6745 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6766 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6778 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_40_in_ruleEqInterface6846 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface6858 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_ruleEqInterface6879 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface6891 = new BitSet(new long[]{0x03FE01C800010000L});
    public static final BitSet FOLLOW_16_in_ruleEqInterface6944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceGroupsBlock_in_entryRuleInterfaceGroupsBlock6980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceGroupsBlock6990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleInterfaceGroupsBlock7036 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterfaceGroupsBlock7048 = new BitSet(new long[]{0x0800000000010000L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroup_in_ruleInterfaceGroupsBlock7070 = new BitSet(new long[]{0x0800000000010000L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroupWithCombinedDefinition_in_ruleInterfaceGroupsBlock7097 = new BitSet(new long[]{0x0800000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInterfaceGroupsBlock7111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroup_in_entryRuleEqInterfaceGroup7147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterfaceGroup7157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleEqInterfaceGroup7194 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7211 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterfaceGroup7228 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7249 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup7276 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleEqInterfaceGroup7290 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7311 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup7338 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleEqInterfaceGroup7353 = new BitSet(new long[]{0x1000000000008000L});
    public static final BitSet FOLLOW_60_in_ruleEqInterfaceGroup7366 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterfaceGroup7378 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7399 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup7426 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleEqInterfaceGroup7440 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup7461 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_ruleEqInterfaceGroup7488 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleEqInterfaceGroup7503 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterfaceGroup7517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinition_in_entryRuleImplicitEqInterfaceMemberDefinition7553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitEqInterfaceMemberDefinition7563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleImplicitEqInterfaceMemberDefinition7600 = new BitSet(new long[]{0x03FE01C800002000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_ruleImplicitEqInterfaceMemberDefinition7621 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleImplicitEqInterfaceMemberDefinition7634 = new BitSet(new long[]{0x03FE01C800002000L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_ruleImplicitEqInterfaceMemberDefinition7655 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues_in_entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues7693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitEqInterfaceMemberDefinitionAttributesAndValues7703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitEqInterfaceMemberDefinitionAttribute_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues7749 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues7761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImplicitEqInterfaceMemberDefinitionAttributesAndValues7778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroupWithCombinedDefinition_in_entryRuleEqInterfaceGroupWithCombinedDefinition7819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterfaceGroupWithCombinedDefinition7829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleEqInterfaceGroupWithCombinedDefinition7866 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition7883 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleEqInterfaceGroupWithCombinedDefinition7900 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition7920 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleEqInterfaceGroupWithCombinedDefinition7933 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroupWithCombinedDefinition7953 = new BitSet(new long[]{0x4000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterfaceGroupWithCombinedDefinition7967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionsBlock_in_entryRuleRestrictionsBlock8003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionsBlock8013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleRestrictionsBlock8059 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRestrictionsBlock8071 = new BitSet(new long[]{0x0000000000010020L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_ruleRestrictionsBlock8093 = new BitSet(new long[]{0x0000000000010020L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleColocalityRelation_in_ruleRestrictionsBlock8120 = new BitSet(new long[]{0x0000000000010020L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleValidDeployment_in_ruleRestrictionsBlock8147 = new BitSet(new long[]{0x0000000000010020L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleInvalidDeployment_in_ruleRestrictionsBlock8174 = new BitSet(new long[]{0x0000000000010020L,0x0000000000000028L});
    public static final BitSet FOLLOW_16_in_ruleRestrictionsBlock8188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation8224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDislocalityRelation8234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDislocalityRelation8279 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDislocalityRelation8292 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDislocalityRelation8312 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDislocalityRelation8326 = new BitSet(new long[]{0x0000080108000000L});
    public static final BitSet FOLLOW_ruleHardwareArchitectureLevelType_in_ruleDislocalityRelation8347 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDislocalityRelation8359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColocalityRelation_in_entryRuleColocalityRelation8395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColocalityRelation8405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColocalityRelation8450 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_19_in_ruleColocalityRelation8463 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColocalityRelation8483 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleColocalityRelation8497 = new BitSet(new long[]{0x0000080108000000L});
    public static final BitSet FOLLOW_ruleHardwareArchitectureLevelType_in_ruleColocalityRelation8518 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleColocalityRelation8530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidDeployment_in_entryRuleValidDeployment8566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidDeployment8576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleValidDeployment8613 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidDeployment8633 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_19_in_ruleValidDeployment8646 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidDeployment8666 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleValidDeployment8680 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleValidDeployment8692 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleValidDeployment8716 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeployment8743 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleValidDeployment8757 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleValidDeployment8781 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleValidDeployment8808 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleValidDeployment8823 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleValidDeployment8835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvalidDeployment_in_entryRuleInvalidDeployment8871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvalidDeployment8881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleInvalidDeployment8918 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvalidDeployment8938 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_19_in_ruleInvalidDeployment8951 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvalidDeployment8971 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleInvalidDeployment8985 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInvalidDeployment8997 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment9021 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeployment9048 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleInvalidDeployment9062 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInvalidDeployment9086 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_ruleInvalidDeployment9113 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleInvalidDeployment9128 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInvalidDeployment9140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinition_in_entryRuleDeploymentImplicitDefinition9176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinition9186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleDeploymentImplicitDefinition9223 = new BitSet(new long[]{0x0000000000000000L,0x00000003FFFC0000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_ruleDeploymentImplicitDefinition9244 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDeploymentImplicitDefinition9257 = new BitSet(new long[]{0x0000000000000000L,0x00000003FFFC0000L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_ruleDeploymentImplicitDefinition9278 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinitionAttributeAndValue_in_entryRuleDeploymentImplicitDefinitionAttributeAndValue9316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeploymentImplicitDefinitionAttributeAndValue9326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeploymentImplicitDefinitionAttribute_in_ruleDeploymentImplicitDefinitionAttributeAndValue9372 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeploymentImplicitDefinitionAttributeAndValue9384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeploymentImplicitDefinitionAttributeAndValue9401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble9443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble9454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble9494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleDouble9512 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble9527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9624 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleQualifiedName9643 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9658 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleSIGNEDINT_in_entryRuleSIGNEDINT9706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSIGNEDINT9717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleSIGNEDINT9756 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSIGNEDINT9773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleProtectionLevelType9832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleProtectionLevelType9849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleProtectionLevelType9866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleProtectionLevelType9883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleProtectionLevelType9900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleProtectionLevelType9917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleProtectionLevelType9934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleProtectionLevelType9951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleProtectionLevelType9968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleImplicitEqInterfaceMemberDefinitionAttribute10234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleHardwareArchitectureLevelType10279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleHardwareArchitectureLevelType10296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleHardwareArchitectureLevelType10313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleDeploymentImplicitDefinitionAttribute10358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleDeploymentImplicitDefinitionAttribute10375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleDeploymentImplicitDefinitionAttribute10392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleDeploymentImplicitDefinitionAttribute10409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleDeploymentImplicitDefinitionAttribute10426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleDeploymentImplicitDefinitionAttribute10443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleDeploymentImplicitDefinitionAttribute10460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleDeploymentImplicitDefinitionAttribute10477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleDeploymentImplicitDefinitionAttribute10494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleDeploymentImplicitDefinitionAttribute10511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleDeploymentImplicitDefinitionAttribute10528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleDeploymentImplicitDefinitionAttribute10545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleDeploymentImplicitDefinitionAttribute10562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleDeploymentImplicitDefinitionAttribute10579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleDeploymentImplicitDefinitionAttribute10596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleDeploymentImplicitDefinitionAttribute10613 = new BitSet(new long[]{0x0000000000000002L});

}
