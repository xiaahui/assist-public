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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Global'", "'{'", "'System name'", "'='", "';'", "'}'", "'Interfaces'", "'InterfaceGroups'", "'Compartment'", "'Manufacturer'", "'PowerSupply'", "'Side'", "'Zone'", "'Generic properties'", "'RDC'", "'Type'", "'ESS'", "'Connector'", "'interface with type'", "'Group'", "','", "'Interface'", "'InterfaceSystem'", "'SubAta'", "'Resource'", "'LineName'", "'WiringLane'", "'GrpInfo'", "'Route'", "'PwSup1'", "'EmhZone1'", "'Can'", "'Enhanced Local Bus'", "'Ethernet'", "'Analog'", "'Digital'", "'Serial'", "'CustomType0'", "'CustomType1'", "'CustomType2'", "'CustomType3'", "'CustomType4'", "'CustomType5'", "'CustomType6'", "'CustomType7'", "'CustomType8'", "'CustomType9'", "'CustomType10'", "'CustomType11'", "'CustomType12'", "'CustomType13'", "'CustomType14'", "'CustomType15'", "'CustomType16'", "'CustomType17'", "'CustomType18'", "'CustomType19'", "'CustomType20'", "'CustomType21'", "'CustomType22'", "'CustomType23'", "'CustomType24'", "'CustomType25'", "'CustomType26'", "'CustomType27'", "'CustomType28'", "'CustomType29'", "'CustomType30'", "'CustomType31'", "'CustomType32'", "'CustomType33'", "'CustomType34'", "'CustomType35'", "'CustomType36'", "'CustomType37'", "'CustomType38'", "'CustomType39'"
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:77:1: ruleAssistModel returns [EObject current=null] : (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )? (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) )+ otherlv_15= '}' )? ) ;
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

        EObject lv_eqInterfaces_10_0 = null;

        EObject lv_eqInterfaceGroups_14_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:80:28: ( (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )? (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) )+ otherlv_15= '}' )? ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )? (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) )+ otherlv_15= '}' )? )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )? (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) )+ otherlv_15= '}' )? )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:3: otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )? (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) )+ otherlv_15= '}' )?
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
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:123:1: ( (lv_compartments_7_0= ruleCompartment ) )?
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

            }

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

                        if ( (LA2_0==32) ) {
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:171:3: (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) )+ otherlv_15= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:171:5: otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) )+ otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleAssistModel300); 

                        	newLeafNode(otherlv_12, grammarAccess.getAssistModelAccess().getInterfaceGroupsKeyword_9_0());
                        
                    otherlv_13=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel312); 

                        	newLeafNode(otherlv_13, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:179:1: ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==30) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:180:1: (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:180:1: (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:181:3: lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsEqInterfaceGroupParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEqInterfaceGroup_in_ruleAssistModel333);
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
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleAssistModel346); 

                        	newLeafNode(otherlv_15, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_9_3());
                        

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:209:1: entryRuleCompartment returns [EObject current=null] : iv_ruleCompartment= ruleCompartment EOF ;
    public final EObject entryRuleCompartment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompartment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:210:2: (iv_ruleCompartment= ruleCompartment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:211:2: iv_ruleCompartment= ruleCompartment EOF
            {
             newCompositeNode(grammarAccess.getCompartmentRule()); 
            pushFollow(FOLLOW_ruleCompartment_in_entryRuleCompartment384);
            iv_ruleCompartment=ruleCompartment();

            state._fsp--;

             current =iv_ruleCompartment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartment394); 

            }

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
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleCompartment431); 

                	newLeafNode(otherlv_0, grammarAccess.getCompartmentAccess().getCompartmentKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:226:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:227:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:227:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:228:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompartment448); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCompartment465); 

                	newLeafNode(otherlv_2, grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:248:1: (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:248:3: otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleCompartment478); 

                        	newLeafNode(otherlv_3, grammarAccess.getCompartmentAccess().getManufacturerKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleCompartment490); 

                        	newLeafNode(otherlv_4, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:256:1: ( (lv_manufacturer_5_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:257:1: (lv_manufacturer_5_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:257:1: (lv_manufacturer_5_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:258:3: lv_manufacturer_5_0= RULE_STRING
                    {
                    lv_manufacturer_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment507); 

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

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleCompartment524); 

                        	newLeafNode(otherlv_6, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:278:3: (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:278:5: otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleCompartment539); 

                        	newLeafNode(otherlv_7, grammarAccess.getCompartmentAccess().getPowerSupplyKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleCompartment551); 

                        	newLeafNode(otherlv_8, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_4_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:286:1: ( (lv_powerSupply_9_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:287:1: (lv_powerSupply_9_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:287:1: (lv_powerSupply_9_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:288:3: lv_powerSupply_9_0= RULE_STRING
                    {
                    lv_powerSupply_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment568); 

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

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleCompartment585); 

                        	newLeafNode(otherlv_10, grammarAccess.getCompartmentAccess().getSemicolonKeyword_4_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:308:3: (otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:308:5: otherlv_11= 'Side' otherlv_12= '=' ( (lv_side_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleCompartment600); 

                        	newLeafNode(otherlv_11, grammarAccess.getCompartmentAccess().getSideKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleCompartment612); 

                        	newLeafNode(otherlv_12, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_5_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:316:1: ( (lv_side_13_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:317:1: (lv_side_13_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:317:1: (lv_side_13_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:318:3: lv_side_13_0= RULE_STRING
                    {
                    lv_side_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment629); 

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

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleCompartment646); 

                        	newLeafNode(otherlv_14, grammarAccess.getCompartmentAccess().getSemicolonKeyword_5_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:338:3: (otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:338:5: otherlv_15= 'Zone' otherlv_16= '=' ( (lv_zone_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_23_in_ruleCompartment661); 

                        	newLeafNode(otherlv_15, grammarAccess.getCompartmentAccess().getZoneKeyword_6_0());
                        
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleCompartment673); 

                        	newLeafNode(otherlv_16, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_6_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:346:1: ( (lv_zone_17_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:347:1: (lv_zone_17_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:347:1: (lv_zone_17_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:348:3: lv_zone_17_0= RULE_STRING
                    {
                    lv_zone_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment690); 

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

                    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleCompartment707); 

                        	newLeafNode(otherlv_18, grammarAccess.getCompartmentAccess().getSemicolonKeyword_6_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:368:3: ( (lv_rdcs_19_0= ruleRDC ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:369:1: (lv_rdcs_19_0= ruleRDC )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:369:1: (lv_rdcs_19_0= ruleRDC )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:370:3: lv_rdcs_19_0= ruleRDC
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompartmentAccess().getRdcsRDCParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRDC_in_ruleCompartment730);
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:386:3: (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:386:5: otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}'
                    {
                    otherlv_20=(Token)match(input,24,FOLLOW_24_in_ruleCompartment744); 

                        	newLeafNode(otherlv_20, grammarAccess.getCompartmentAccess().getGenericPropertiesKeyword_8_0());
                        
                    otherlv_21=(Token)match(input,12,FOLLOW_12_in_ruleCompartment756); 

                        	newLeafNode(otherlv_21, grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:394:1: ( (lv_metricParameters_22_0= ruleMetricParameter ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_STRING) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:395:1: (lv_metricParameters_22_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:395:1: (lv_metricParameters_22_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:396:3: lv_metricParameters_22_0= ruleMetricParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCompartmentAccess().getMetricParametersMetricParameterParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleCompartment777);
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
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_16_in_ruleCompartment790); 

                        	newLeafNode(otherlv_23, grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_8_3());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_16_in_ruleCompartment804); 

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
            pushFollow(FOLLOW_ruleRDC_in_entryRuleRDC840);
            iv_ruleRDC=ruleRDC();

            state._fsp--;

             current =iv_ruleRDC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDC850); 

            }

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
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleRDC887); 

                	newLeafNode(otherlv_0, grammarAccess.getRDCAccess().getRDCKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:445:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:446:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:446:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:447:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRDC904); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRDC921); 

                	newLeafNode(otherlv_2, grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:467:1: (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:467:3: otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleRDC934); 

                        	newLeafNode(otherlv_3, grammarAccess.getRDCAccess().getManufacturerKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleRDC946); 

                        	newLeafNode(otherlv_4, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:475:1: ( (lv_manufacturer_5_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:476:1: (lv_manufacturer_5_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:476:1: (lv_manufacturer_5_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:477:3: lv_manufacturer_5_0= RULE_STRING
                    {
                    lv_manufacturer_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC963); 

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

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleRDC980); 

                        	newLeafNode(otherlv_6, grammarAccess.getRDCAccess().getSemicolonKeyword_3_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:497:3: (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:497:5: otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleRDC995); 

                        	newLeafNode(otherlv_7, grammarAccess.getRDCAccess().getPowerSupplyKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleRDC1007); 

                        	newLeafNode(otherlv_8, grammarAccess.getRDCAccess().getEqualsSignKeyword_4_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:505:1: ( (lv_powerSupply_9_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:506:1: (lv_powerSupply_9_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:506:1: (lv_powerSupply_9_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:507:3: lv_powerSupply_9_0= RULE_STRING
                    {
                    lv_powerSupply_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1024); 

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

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleRDC1041); 

                        	newLeafNode(otherlv_10, grammarAccess.getRDCAccess().getSemicolonKeyword_4_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:527:3: (otherlv_11= 'Type' otherlv_12= '=' ( (lv_rdcType_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:527:5: otherlv_11= 'Type' otherlv_12= '=' ( (lv_rdcType_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_26_in_ruleRDC1056); 

                        	newLeafNode(otherlv_11, grammarAccess.getRDCAccess().getTypeKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleRDC1068); 

                        	newLeafNode(otherlv_12, grammarAccess.getRDCAccess().getEqualsSignKeyword_5_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:535:1: ( (lv_rdcType_13_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:536:1: (lv_rdcType_13_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:536:1: (lv_rdcType_13_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:537:3: lv_rdcType_13_0= RULE_STRING
                    {
                    lv_rdcType_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1085); 

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

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleRDC1102); 

                        	newLeafNode(otherlv_14, grammarAccess.getRDCAccess().getSemicolonKeyword_5_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:557:3: (otherlv_15= 'ESS' otherlv_16= '=' ( (lv_ess_17_0= RULE_STRING ) ) otherlv_18= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:557:5: otherlv_15= 'ESS' otherlv_16= '=' ( (lv_ess_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,27,FOLLOW_27_in_ruleRDC1117); 

                        	newLeafNode(otherlv_15, grammarAccess.getRDCAccess().getESSKeyword_6_0());
                        
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleRDC1129); 

                        	newLeafNode(otherlv_16, grammarAccess.getRDCAccess().getEqualsSignKeyword_6_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:565:1: ( (lv_ess_17_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:566:1: (lv_ess_17_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:566:1: (lv_ess_17_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:567:3: lv_ess_17_0= RULE_STRING
                    {
                    lv_ess_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1146); 

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

                    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleRDC1163); 

                        	newLeafNode(otherlv_18, grammarAccess.getRDCAccess().getSemicolonKeyword_6_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:587:3: ( (lv_connectors_19_0= ruleConnector ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:588:1: (lv_connectors_19_0= ruleConnector )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:588:1: (lv_connectors_19_0= ruleConnector )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:589:3: lv_connectors_19_0= ruleConnector
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRDCAccess().getConnectorsConnectorParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnector_in_ruleRDC1186);
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:605:3: (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:605:5: otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}'
                    {
                    otherlv_20=(Token)match(input,24,FOLLOW_24_in_ruleRDC1200); 

                        	newLeafNode(otherlv_20, grammarAccess.getRDCAccess().getGenericPropertiesKeyword_8_0());
                        
                    otherlv_21=(Token)match(input,12,FOLLOW_12_in_ruleRDC1212); 

                        	newLeafNode(otherlv_21, grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:613:1: ( (lv_metricParameters_22_0= ruleMetricParameter ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_STRING) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:614:1: (lv_metricParameters_22_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:614:1: (lv_metricParameters_22_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:615:3: lv_metricParameters_22_0= ruleMetricParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRDCAccess().getMetricParametersMetricParameterParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleRDC1233);
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
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_16_in_ruleRDC1246); 

                        	newLeafNode(otherlv_23, grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_8_3());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_16_in_ruleRDC1260); 

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
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector1296);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector1306); 

            }

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:656:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_availableEqInterfaces_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:659:28: ( (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:660:1: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:660:1: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:660:3: otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleConnector1343); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:664:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:665:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:665:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:666:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnector1360); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConnector1377); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:686:1: ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_INT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:687:1: (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:687:1: (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:688:3: lv_availableEqInterfaces_3_0= ruleAvailableEqInterface
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectorAccess().getAvailableEqInterfacesAvailableEqInterfaceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAvailableEqInterface_in_ruleConnector1398);
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
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleConnector1411); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:716:1: entryRuleAvailableEqInterface returns [EObject current=null] : iv_ruleAvailableEqInterface= ruleAvailableEqInterface EOF ;
    public final EObject entryRuleAvailableEqInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvailableEqInterface = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:717:2: (iv_ruleAvailableEqInterface= ruleAvailableEqInterface EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:718:2: iv_ruleAvailableEqInterface= ruleAvailableEqInterface EOF
            {
             newCompositeNode(grammarAccess.getAvailableEqInterfaceRule()); 
            pushFollow(FOLLOW_ruleAvailableEqInterface_in_entryRuleAvailableEqInterface1447);
            iv_ruleAvailableEqInterface=ruleAvailableEqInterface();

            state._fsp--;

             current =iv_ruleAvailableEqInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvailableEqInterface1457); 

            }

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:725:1: ruleAvailableEqInterface returns [EObject current=null] : ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'interface with type' ( (lv_eqInterfaceType_2_0= ruleEqInterfaceType ) ) otherlv_3= ';' ) ;
    public final EObject ruleAvailableEqInterface() throws RecognitionException {
        EObject current = null;

        Token lv_count_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_eqInterfaceType_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:728:28: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'interface with type' ( (lv_eqInterfaceType_2_0= ruleEqInterfaceType ) ) otherlv_3= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:729:1: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'interface with type' ( (lv_eqInterfaceType_2_0= ruleEqInterfaceType ) ) otherlv_3= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:729:1: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'interface with type' ( (lv_eqInterfaceType_2_0= ruleEqInterfaceType ) ) otherlv_3= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:729:2: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'interface with type' ( (lv_eqInterfaceType_2_0= ruleEqInterfaceType ) ) otherlv_3= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:729:2: ( (lv_count_0_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:730:1: (lv_count_0_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:730:1: (lv_count_0_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:731:3: lv_count_0_0= RULE_INT
            {
            lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAvailableEqInterface1499); 

            			newLeafNode(lv_count_0_0, grammarAccess.getAvailableEqInterfaceAccess().getCountINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAvailableEqInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"count",
                    		lv_count_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleAvailableEqInterface1516); 

                	newLeafNode(otherlv_1, grammarAccess.getAvailableEqInterfaceAccess().getInterfaceWithTypeKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:751:1: ( (lv_eqInterfaceType_2_0= ruleEqInterfaceType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:752:1: (lv_eqInterfaceType_2_0= ruleEqInterfaceType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:752:1: (lv_eqInterfaceType_2_0= ruleEqInterfaceType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:753:3: lv_eqInterfaceType_2_0= ruleEqInterfaceType
            {
             
            	        newCompositeNode(grammarAccess.getAvailableEqInterfaceAccess().getEqInterfaceTypeEqInterfaceTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEqInterfaceType_in_ruleAvailableEqInterface1537);
            lv_eqInterfaceType_2_0=ruleEqInterfaceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAvailableEqInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"eqInterfaceType",
                    		lv_eqInterfaceType_2_0, 
                    		"EqInterfaceType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleAvailableEqInterface1549); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:781:1: entryRuleEqInterfaceGroup returns [EObject current=null] : iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF ;
    public final EObject entryRuleEqInterfaceGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterfaceGroup = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:782:2: (iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:783:2: iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceGroupRule()); 
            pushFollow(FOLLOW_ruleEqInterfaceGroup_in_entryRuleEqInterfaceGroup1585);
            iv_ruleEqInterfaceGroup=ruleEqInterfaceGroup();

            state._fsp--;

             current =iv_ruleEqInterfaceGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterfaceGroup1595); 

            }

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:790:1: ruleEqInterfaceGroup returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' ) ;
    public final EObject ruleEqInterfaceGroup() throws RecognitionException {
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
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleEqInterfaceGroup1632); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceGroupAccess().getGroupKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:798:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:799:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:799:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:800:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup1649); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEqInterfaceGroup1666); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceGroupAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:820:1: ( (otherlv_3= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:821:1: (otherlv_3= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:821:1: (otherlv_3= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:822:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup1686); 

            		newLeafNode(otherlv_3, grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_3_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:833:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:833:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleEqInterfaceGroup1699); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEqInterfaceGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:837:1: ( (otherlv_5= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:838:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:838:1: (otherlv_5= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:839:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup1719); 

            	    		newLeafNode(otherlv_5, grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_4_1_0()); 
            	    	

            	    }


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

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleEqInterfaceGroup1733); 

                	newLeafNode(otherlv_6, grammarAccess.getEqInterfaceGroupAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleEqInterface"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:862:1: entryRuleEqInterface returns [EObject current=null] : iv_ruleEqInterface= ruleEqInterface EOF ;
    public final EObject entryRuleEqInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterface = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:863:2: (iv_ruleEqInterface= ruleEqInterface EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:864:2: iv_ruleEqInterface= ruleEqInterface EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceRule()); 
            pushFollow(FOLLOW_ruleEqInterface_in_entryRuleEqInterface1769);
            iv_ruleEqInterface=ruleEqInterface();

            state._fsp--;

             current =iv_ruleEqInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterface1779); 

            }

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:871:1: ruleEqInterface returns [EObject current=null] : (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InterfaceSystem' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleEqInterfaceType ) ) otherlv_42= ';' )? (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )? otherlv_47= '}' ) ;
    public final EObject ruleEqInterface() throws RecognitionException {
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:874:28: ( (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InterfaceSystem' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleEqInterfaceType ) ) otherlv_42= ';' )? (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )? otherlv_47= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:875:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InterfaceSystem' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleEqInterfaceType ) ) otherlv_42= ';' )? (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )? otherlv_47= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:875:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InterfaceSystem' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleEqInterfaceType ) ) otherlv_42= ';' )? (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )? otherlv_47= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:875:3: otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InterfaceSystem' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleEqInterfaceType ) ) otherlv_42= ';' )? (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )? otherlv_47= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleEqInterface1816); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceAccess().getInterfaceKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:879:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:880:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:880:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:881:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterface1833); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEqInterface1850); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:901:1: (otherlv_3= 'InterfaceSystem' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:901:3: otherlv_3= 'InterfaceSystem' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleEqInterface1863); 

                        	newLeafNode(otherlv_3, grammarAccess.getEqInterfaceAccess().getInterfaceSystemKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface1875); 

                        	newLeafNode(otherlv_4, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:909:1: ( (lv_system_5_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:910:1: (lv_system_5_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:910:1: (lv_system_5_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:911:3: lv_system_5_0= RULE_STRING
                    {
                    lv_system_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface1892); 

                    			newLeafNode(lv_system_5_0, grammarAccess.getEqInterfaceAccess().getSystemSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"system",
                            		lv_system_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface1909); 

                        	newLeafNode(otherlv_6, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:931:3: (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:931:5: otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleEqInterface1924); 

                        	newLeafNode(otherlv_7, grammarAccess.getEqInterfaceAccess().getSubAtaKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface1936); 

                        	newLeafNode(otherlv_8, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_4_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:939:1: ( (lv_subAta_9_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:940:1: (lv_subAta_9_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:940:1: (lv_subAta_9_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:941:3: lv_subAta_9_0= RULE_STRING
                    {
                    lv_subAta_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface1953); 

                    			newLeafNode(lv_subAta_9_0, grammarAccess.getEqInterfaceAccess().getSubAtaSTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"subAta",
                            		lv_subAta_9_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface1970); 

                        	newLeafNode(otherlv_10, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_4_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:961:3: (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:961:5: otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,35,FOLLOW_35_in_ruleEqInterface1985); 

                        	newLeafNode(otherlv_11, grammarAccess.getEqInterfaceAccess().getResourceKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface1997); 

                        	newLeafNode(otherlv_12, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_5_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:969:1: ( (lv_resource_13_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:970:1: (lv_resource_13_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:970:1: (lv_resource_13_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:971:3: lv_resource_13_0= RULE_STRING
                    {
                    lv_resource_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface2014); 

                    			newLeafNode(lv_resource_13_0, grammarAccess.getEqInterfaceAccess().getResourceSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"resource",
                            		lv_resource_13_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2031); 

                        	newLeafNode(otherlv_14, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_5_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:991:3: (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:991:5: otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,36,FOLLOW_36_in_ruleEqInterface2046); 

                        	newLeafNode(otherlv_15, grammarAccess.getEqInterfaceAccess().getLineNameKeyword_6_0());
                        
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2058); 

                        	newLeafNode(otherlv_16, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_6_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:999:1: ( (lv_lineName_17_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1000:1: (lv_lineName_17_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1000:1: (lv_lineName_17_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1001:3: lv_lineName_17_0= RULE_STRING
                    {
                    lv_lineName_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface2075); 

                    			newLeafNode(lv_lineName_17_0, grammarAccess.getEqInterfaceAccess().getLineNameSTRINGTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lineName",
                            		lv_lineName_17_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2092); 

                        	newLeafNode(otherlv_18, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_6_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1021:3: (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1021:5: otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';'
                    {
                    otherlv_19=(Token)match(input,37,FOLLOW_37_in_ruleEqInterface2107); 

                        	newLeafNode(otherlv_19, grammarAccess.getEqInterfaceAccess().getWiringLaneKeyword_7_0());
                        
                    otherlv_20=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2119); 

                        	newLeafNode(otherlv_20, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_7_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1029:1: ( (lv_wiringLane_21_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1030:1: (lv_wiringLane_21_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1030:1: (lv_wiringLane_21_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1031:3: lv_wiringLane_21_0= RULE_STRING
                    {
                    lv_wiringLane_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface2136); 

                    			newLeafNode(lv_wiringLane_21_0, grammarAccess.getEqInterfaceAccess().getWiringLaneSTRINGTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"wiringLane",
                            		lv_wiringLane_21_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_22=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2153); 

                        	newLeafNode(otherlv_22, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_7_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1051:3: (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1051:5: otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';'
                    {
                    otherlv_23=(Token)match(input,38,FOLLOW_38_in_ruleEqInterface2168); 

                        	newLeafNode(otherlv_23, grammarAccess.getEqInterfaceAccess().getGrpInfoKeyword_8_0());
                        
                    otherlv_24=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2180); 

                        	newLeafNode(otherlv_24, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_8_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1059:1: ( (lv_grpInfo_25_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1060:1: (lv_grpInfo_25_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1060:1: (lv_grpInfo_25_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1061:3: lv_grpInfo_25_0= RULE_STRING
                    {
                    lv_grpInfo_25_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface2197); 

                    			newLeafNode(lv_grpInfo_25_0, grammarAccess.getEqInterfaceAccess().getGrpInfoSTRINGTerminalRuleCall_8_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"grpInfo",
                            		lv_grpInfo_25_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_26=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2214); 

                        	newLeafNode(otherlv_26, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_8_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1081:3: (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1081:5: otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';'
                    {
                    otherlv_27=(Token)match(input,39,FOLLOW_39_in_ruleEqInterface2229); 

                        	newLeafNode(otherlv_27, grammarAccess.getEqInterfaceAccess().getRouteKeyword_9_0());
                        
                    otherlv_28=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2241); 

                        	newLeafNode(otherlv_28, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_9_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1089:1: ( (lv_route_29_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1090:1: (lv_route_29_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1090:1: (lv_route_29_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1091:3: lv_route_29_0= RULE_STRING
                    {
                    lv_route_29_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface2258); 

                    			newLeafNode(lv_route_29_0, grammarAccess.getEqInterfaceAccess().getRouteSTRINGTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"route",
                            		lv_route_29_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_30=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2275); 

                        	newLeafNode(otherlv_30, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_9_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1111:3: (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1111:5: otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';'
                    {
                    otherlv_31=(Token)match(input,40,FOLLOW_40_in_ruleEqInterface2290); 

                        	newLeafNode(otherlv_31, grammarAccess.getEqInterfaceAccess().getPwSup1Keyword_10_0());
                        
                    otherlv_32=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2302); 

                        	newLeafNode(otherlv_32, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_10_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1119:1: ( (lv_pwSup1_33_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1120:1: (lv_pwSup1_33_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1120:1: (lv_pwSup1_33_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1121:3: lv_pwSup1_33_0= RULE_STRING
                    {
                    lv_pwSup1_33_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface2319); 

                    			newLeafNode(lv_pwSup1_33_0, grammarAccess.getEqInterfaceAccess().getPwSup1STRINGTerminalRuleCall_10_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"pwSup1",
                            		lv_pwSup1_33_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_34=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2336); 

                        	newLeafNode(otherlv_34, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_10_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1141:3: (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1141:5: otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';'
                    {
                    otherlv_35=(Token)match(input,41,FOLLOW_41_in_ruleEqInterface2351); 

                        	newLeafNode(otherlv_35, grammarAccess.getEqInterfaceAccess().getEmhZone1Keyword_11_0());
                        
                    otherlv_36=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2363); 

                        	newLeafNode(otherlv_36, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_11_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1149:1: ( (lv_emhZone1_37_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1150:1: (lv_emhZone1_37_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1150:1: (lv_emhZone1_37_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1151:3: lv_emhZone1_37_0= RULE_STRING
                    {
                    lv_emhZone1_37_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface2380); 

                    			newLeafNode(lv_emhZone1_37_0, grammarAccess.getEqInterfaceAccess().getEmhZone1STRINGTerminalRuleCall_11_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"emhZone1",
                            		lv_emhZone1_37_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_38=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2397); 

                        	newLeafNode(otherlv_38, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_11_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1171:3: (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleEqInterfaceType ) ) otherlv_42= ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1171:5: otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleEqInterfaceType ) ) otherlv_42= ';'
                    {
                    otherlv_39=(Token)match(input,26,FOLLOW_26_in_ruleEqInterface2412); 

                        	newLeafNode(otherlv_39, grammarAccess.getEqInterfaceAccess().getTypeKeyword_12_0());
                        
                    otherlv_40=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2424); 

                        	newLeafNode(otherlv_40, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_12_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1179:1: ( (lv_ioType_41_0= ruleEqInterfaceType ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1180:1: (lv_ioType_41_0= ruleEqInterfaceType )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1180:1: (lv_ioType_41_0= ruleEqInterfaceType )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1181:3: lv_ioType_41_0= ruleEqInterfaceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqInterfaceAccess().getIoTypeEqInterfaceTypeEnumRuleCall_12_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEqInterfaceType_in_ruleEqInterface2445);
                    lv_ioType_41_0=ruleEqInterfaceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEqInterfaceRule());
                    	        }
                           		set(
                           			current, 
                           			"ioType",
                            		lv_ioType_41_0, 
                            		"EqInterfaceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_42=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2457); 

                        	newLeafNode(otherlv_42, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_12_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1201:3: (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==24) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1201:5: otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}'
                    {
                    otherlv_43=(Token)match(input,24,FOLLOW_24_in_ruleEqInterface2472); 

                        	newLeafNode(otherlv_43, grammarAccess.getEqInterfaceAccess().getGenericPropertiesKeyword_13_0());
                        
                    otherlv_44=(Token)match(input,12,FOLLOW_12_in_ruleEqInterface2484); 

                        	newLeafNode(otherlv_44, grammarAccess.getEqInterfaceAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1209:1: ( (lv_metricParameters_45_0= ruleMetricParameter ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_STRING) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1210:1: (lv_metricParameters_45_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1210:1: (lv_metricParameters_45_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1211:3: lv_metricParameters_45_0= ruleMetricParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEqInterfaceAccess().getMetricParametersMetricParameterParserRuleCall_13_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleEqInterface2505);
                    	    lv_metricParameters_45_0=ruleMetricParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEqInterfaceRule());
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
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_46=(Token)match(input,16,FOLLOW_16_in_ruleEqInterface2518); 

                        	newLeafNode(otherlv_46, grammarAccess.getEqInterfaceAccess().getRightCurlyBracketKeyword_13_3());
                        

                    }
                    break;

            }

            otherlv_47=(Token)match(input,16,FOLLOW_16_in_ruleEqInterface2532); 

                	newLeafNode(otherlv_47, grammarAccess.getEqInterfaceAccess().getRightCurlyBracketKeyword_14());
                

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
            pushFollow(FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter2568);
            iv_ruleMetricParameter=ruleMetricParameter();

            state._fsp--;

             current =iv_ruleMetricParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricParameter2578); 

            }

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
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetricParameter2620); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleMetricParameter2637); 

                	newLeafNode(otherlv_1, grammarAccess.getMetricParameterAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1278:1: ( (lv_value_2_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1279:1: (lv_value_2_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1279:1: (lv_value_2_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1280:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMetricParameter2654); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleMetricParameter2671); 

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


    // $ANTLR start "ruleEqInterfaceType"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1310:1: ruleEqInterfaceType returns [Enumerator current=null] : ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'CustomType0' ) | (enumLiteral_7= 'CustomType1' ) | (enumLiteral_8= 'CustomType2' ) | (enumLiteral_9= 'CustomType3' ) | (enumLiteral_10= 'CustomType4' ) | (enumLiteral_11= 'CustomType5' ) | (enumLiteral_12= 'CustomType6' ) | (enumLiteral_13= 'CustomType7' ) | (enumLiteral_14= 'CustomType8' ) | (enumLiteral_15= 'CustomType9' ) | (enumLiteral_16= 'CustomType10' ) | (enumLiteral_17= 'CustomType11' ) | (enumLiteral_18= 'CustomType12' ) | (enumLiteral_19= 'CustomType13' ) | (enumLiteral_20= 'CustomType14' ) | (enumLiteral_21= 'CustomType15' ) | (enumLiteral_22= 'CustomType16' ) | (enumLiteral_23= 'CustomType17' ) | (enumLiteral_24= 'CustomType18' ) | (enumLiteral_25= 'CustomType19' ) | (enumLiteral_26= 'CustomType20' ) | (enumLiteral_27= 'CustomType21' ) | (enumLiteral_28= 'CustomType22' ) | (enumLiteral_29= 'CustomType23' ) | (enumLiteral_30= 'CustomType24' ) | (enumLiteral_31= 'CustomType25' ) | (enumLiteral_32= 'CustomType26' ) | (enumLiteral_33= 'CustomType27' ) | (enumLiteral_34= 'CustomType28' ) | (enumLiteral_35= 'CustomType29' ) | (enumLiteral_36= 'CustomType30' ) | (enumLiteral_37= 'CustomType31' ) | (enumLiteral_38= 'CustomType32' ) | (enumLiteral_39= 'CustomType33' ) | (enumLiteral_40= 'CustomType34' ) | (enumLiteral_41= 'CustomType35' ) | (enumLiteral_42= 'CustomType36' ) | (enumLiteral_43= 'CustomType37' ) | (enumLiteral_44= 'CustomType38' ) | (enumLiteral_45= 'CustomType39' ) ) ;
    public final Enumerator ruleEqInterfaceType() throws RecognitionException {
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
            int alt34=46;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt34=1;
                }
                break;
            case 43:
                {
                alt34=2;
                }
                break;
            case 44:
                {
                alt34=3;
                }
                break;
            case 45:
                {
                alt34=4;
                }
                break;
            case 46:
                {
                alt34=5;
                }
                break;
            case 47:
                {
                alt34=6;
                }
                break;
            case 48:
                {
                alt34=7;
                }
                break;
            case 49:
                {
                alt34=8;
                }
                break;
            case 50:
                {
                alt34=9;
                }
                break;
            case 51:
                {
                alt34=10;
                }
                break;
            case 52:
                {
                alt34=11;
                }
                break;
            case 53:
                {
                alt34=12;
                }
                break;
            case 54:
                {
                alt34=13;
                }
                break;
            case 55:
                {
                alt34=14;
                }
                break;
            case 56:
                {
                alt34=15;
                }
                break;
            case 57:
                {
                alt34=16;
                }
                break;
            case 58:
                {
                alt34=17;
                }
                break;
            case 59:
                {
                alt34=18;
                }
                break;
            case 60:
                {
                alt34=19;
                }
                break;
            case 61:
                {
                alt34=20;
                }
                break;
            case 62:
                {
                alt34=21;
                }
                break;
            case 63:
                {
                alt34=22;
                }
                break;
            case 64:
                {
                alt34=23;
                }
                break;
            case 65:
                {
                alt34=24;
                }
                break;
            case 66:
                {
                alt34=25;
                }
                break;
            case 67:
                {
                alt34=26;
                }
                break;
            case 68:
                {
                alt34=27;
                }
                break;
            case 69:
                {
                alt34=28;
                }
                break;
            case 70:
                {
                alt34=29;
                }
                break;
            case 71:
                {
                alt34=30;
                }
                break;
            case 72:
                {
                alt34=31;
                }
                break;
            case 73:
                {
                alt34=32;
                }
                break;
            case 74:
                {
                alt34=33;
                }
                break;
            case 75:
                {
                alt34=34;
                }
                break;
            case 76:
                {
                alt34=35;
                }
                break;
            case 77:
                {
                alt34=36;
                }
                break;
            case 78:
                {
                alt34=37;
                }
                break;
            case 79:
                {
                alt34=38;
                }
                break;
            case 80:
                {
                alt34=39;
                }
                break;
            case 81:
                {
                alt34=40;
                }
                break;
            case 82:
                {
                alt34=41;
                }
                break;
            case 83:
                {
                alt34=42;
                }
                break;
            case 84:
                {
                alt34=43;
                }
                break;
            case 85:
                {
                alt34=44;
                }
                break;
            case 86:
                {
                alt34=45;
                }
                break;
            case 87:
                {
                alt34=46;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1313:2: (enumLiteral_0= 'Can' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1313:2: (enumLiteral_0= 'Can' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1313:4: enumLiteral_0= 'Can'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleEqInterfaceType2723); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEqInterfaceTypeAccess().getCANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1319:6: (enumLiteral_1= 'Enhanced Local Bus' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1319:6: (enumLiteral_1= 'Enhanced Local Bus' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1319:8: enumLiteral_1= 'Enhanced Local Bus'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleEqInterfaceType2740); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getELBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getEqInterfaceTypeAccess().getELBEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1325:6: (enumLiteral_2= 'Ethernet' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1325:6: (enumLiteral_2= 'Ethernet' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1325:8: enumLiteral_2= 'Ethernet'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_44_in_ruleEqInterfaceType2757); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getETHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getEqInterfaceTypeAccess().getETHEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1331:6: (enumLiteral_3= 'Analog' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1331:6: (enumLiteral_3= 'Analog' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1331:8: enumLiteral_3= 'Analog'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_45_in_ruleEqInterfaceType2774); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getANALOGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getEqInterfaceTypeAccess().getANALOGEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1337:6: (enumLiteral_4= 'Digital' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1337:6: (enumLiteral_4= 'Digital' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1337:8: enumLiteral_4= 'Digital'
                    {
                    enumLiteral_4=(Token)match(input,46,FOLLOW_46_in_ruleEqInterfaceType2791); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getDIGITALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getEqInterfaceTypeAccess().getDIGITALEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1343:6: (enumLiteral_5= 'Serial' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1343:6: (enumLiteral_5= 'Serial' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1343:8: enumLiteral_5= 'Serial'
                    {
                    enumLiteral_5=(Token)match(input,47,FOLLOW_47_in_ruleEqInterfaceType2808); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getSERIALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getEqInterfaceTypeAccess().getSERIALEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1349:6: (enumLiteral_6= 'CustomType0' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1349:6: (enumLiteral_6= 'CustomType0' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1349:8: enumLiteral_6= 'CustomType0'
                    {
                    enumLiteral_6=(Token)match(input,48,FOLLOW_48_in_ruleEqInterfaceType2825); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM0EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM0EnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1355:6: (enumLiteral_7= 'CustomType1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1355:6: (enumLiteral_7= 'CustomType1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1355:8: enumLiteral_7= 'CustomType1'
                    {
                    enumLiteral_7=(Token)match(input,49,FOLLOW_49_in_ruleEqInterfaceType2842); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM1EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM1EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1361:6: (enumLiteral_8= 'CustomType2' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1361:6: (enumLiteral_8= 'CustomType2' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1361:8: enumLiteral_8= 'CustomType2'
                    {
                    enumLiteral_8=(Token)match(input,50,FOLLOW_50_in_ruleEqInterfaceType2859); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM2EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM2EnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1367:6: (enumLiteral_9= 'CustomType3' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1367:6: (enumLiteral_9= 'CustomType3' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1367:8: enumLiteral_9= 'CustomType3'
                    {
                    enumLiteral_9=(Token)match(input,51,FOLLOW_51_in_ruleEqInterfaceType2876); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM3EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM3EnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1373:6: (enumLiteral_10= 'CustomType4' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1373:6: (enumLiteral_10= 'CustomType4' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1373:8: enumLiteral_10= 'CustomType4'
                    {
                    enumLiteral_10=(Token)match(input,52,FOLLOW_52_in_ruleEqInterfaceType2893); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM4EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM4EnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1379:6: (enumLiteral_11= 'CustomType5' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1379:6: (enumLiteral_11= 'CustomType5' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1379:8: enumLiteral_11= 'CustomType5'
                    {
                    enumLiteral_11=(Token)match(input,53,FOLLOW_53_in_ruleEqInterfaceType2910); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM5EnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM5EnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1385:6: (enumLiteral_12= 'CustomType6' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1385:6: (enumLiteral_12= 'CustomType6' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1385:8: enumLiteral_12= 'CustomType6'
                    {
                    enumLiteral_12=(Token)match(input,54,FOLLOW_54_in_ruleEqInterfaceType2927); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM6EnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM6EnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1391:6: (enumLiteral_13= 'CustomType7' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1391:6: (enumLiteral_13= 'CustomType7' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1391:8: enumLiteral_13= 'CustomType7'
                    {
                    enumLiteral_13=(Token)match(input,55,FOLLOW_55_in_ruleEqInterfaceType2944); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM7EnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM7EnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1397:6: (enumLiteral_14= 'CustomType8' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1397:6: (enumLiteral_14= 'CustomType8' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1397:8: enumLiteral_14= 'CustomType8'
                    {
                    enumLiteral_14=(Token)match(input,56,FOLLOW_56_in_ruleEqInterfaceType2961); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM8EnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM8EnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1403:6: (enumLiteral_15= 'CustomType9' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1403:6: (enumLiteral_15= 'CustomType9' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1403:8: enumLiteral_15= 'CustomType9'
                    {
                    enumLiteral_15=(Token)match(input,57,FOLLOW_57_in_ruleEqInterfaceType2978); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM9EnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM9EnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1409:6: (enumLiteral_16= 'CustomType10' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1409:6: (enumLiteral_16= 'CustomType10' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1409:8: enumLiteral_16= 'CustomType10'
                    {
                    enumLiteral_16=(Token)match(input,58,FOLLOW_58_in_ruleEqInterfaceType2995); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM10EnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_16, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM10EnumLiteralDeclaration_16()); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1415:6: (enumLiteral_17= 'CustomType11' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1415:6: (enumLiteral_17= 'CustomType11' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1415:8: enumLiteral_17= 'CustomType11'
                    {
                    enumLiteral_17=(Token)match(input,59,FOLLOW_59_in_ruleEqInterfaceType3012); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM11EnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_17, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM11EnumLiteralDeclaration_17()); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1421:6: (enumLiteral_18= 'CustomType12' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1421:6: (enumLiteral_18= 'CustomType12' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1421:8: enumLiteral_18= 'CustomType12'
                    {
                    enumLiteral_18=(Token)match(input,60,FOLLOW_60_in_ruleEqInterfaceType3029); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM12EnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_18, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM12EnumLiteralDeclaration_18()); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1427:6: (enumLiteral_19= 'CustomType13' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1427:6: (enumLiteral_19= 'CustomType13' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1427:8: enumLiteral_19= 'CustomType13'
                    {
                    enumLiteral_19=(Token)match(input,61,FOLLOW_61_in_ruleEqInterfaceType3046); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM13EnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_19, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM13EnumLiteralDeclaration_19()); 
                        

                    }


                    }
                    break;
                case 21 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1433:6: (enumLiteral_20= 'CustomType14' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1433:6: (enumLiteral_20= 'CustomType14' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1433:8: enumLiteral_20= 'CustomType14'
                    {
                    enumLiteral_20=(Token)match(input,62,FOLLOW_62_in_ruleEqInterfaceType3063); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM14EnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_20, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM14EnumLiteralDeclaration_20()); 
                        

                    }


                    }
                    break;
                case 22 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1439:6: (enumLiteral_21= 'CustomType15' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1439:6: (enumLiteral_21= 'CustomType15' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1439:8: enumLiteral_21= 'CustomType15'
                    {
                    enumLiteral_21=(Token)match(input,63,FOLLOW_63_in_ruleEqInterfaceType3080); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM15EnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_21, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM15EnumLiteralDeclaration_21()); 
                        

                    }


                    }
                    break;
                case 23 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1445:6: (enumLiteral_22= 'CustomType16' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1445:6: (enumLiteral_22= 'CustomType16' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1445:8: enumLiteral_22= 'CustomType16'
                    {
                    enumLiteral_22=(Token)match(input,64,FOLLOW_64_in_ruleEqInterfaceType3097); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM16EnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_22, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM16EnumLiteralDeclaration_22()); 
                        

                    }


                    }
                    break;
                case 24 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1451:6: (enumLiteral_23= 'CustomType17' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1451:6: (enumLiteral_23= 'CustomType17' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1451:8: enumLiteral_23= 'CustomType17'
                    {
                    enumLiteral_23=(Token)match(input,65,FOLLOW_65_in_ruleEqInterfaceType3114); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM17EnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_23, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM17EnumLiteralDeclaration_23()); 
                        

                    }


                    }
                    break;
                case 25 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1457:6: (enumLiteral_24= 'CustomType18' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1457:6: (enumLiteral_24= 'CustomType18' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1457:8: enumLiteral_24= 'CustomType18'
                    {
                    enumLiteral_24=(Token)match(input,66,FOLLOW_66_in_ruleEqInterfaceType3131); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM18EnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_24, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM18EnumLiteralDeclaration_24()); 
                        

                    }


                    }
                    break;
                case 26 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1463:6: (enumLiteral_25= 'CustomType19' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1463:6: (enumLiteral_25= 'CustomType19' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1463:8: enumLiteral_25= 'CustomType19'
                    {
                    enumLiteral_25=(Token)match(input,67,FOLLOW_67_in_ruleEqInterfaceType3148); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM19EnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_25, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM19EnumLiteralDeclaration_25()); 
                        

                    }


                    }
                    break;
                case 27 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1469:6: (enumLiteral_26= 'CustomType20' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1469:6: (enumLiteral_26= 'CustomType20' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1469:8: enumLiteral_26= 'CustomType20'
                    {
                    enumLiteral_26=(Token)match(input,68,FOLLOW_68_in_ruleEqInterfaceType3165); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM20EnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_26, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM20EnumLiteralDeclaration_26()); 
                        

                    }


                    }
                    break;
                case 28 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1475:6: (enumLiteral_27= 'CustomType21' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1475:6: (enumLiteral_27= 'CustomType21' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1475:8: enumLiteral_27= 'CustomType21'
                    {
                    enumLiteral_27=(Token)match(input,69,FOLLOW_69_in_ruleEqInterfaceType3182); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM21EnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_27, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM21EnumLiteralDeclaration_27()); 
                        

                    }


                    }
                    break;
                case 29 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1481:6: (enumLiteral_28= 'CustomType22' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1481:6: (enumLiteral_28= 'CustomType22' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1481:8: enumLiteral_28= 'CustomType22'
                    {
                    enumLiteral_28=(Token)match(input,70,FOLLOW_70_in_ruleEqInterfaceType3199); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM22EnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_28, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM22EnumLiteralDeclaration_28()); 
                        

                    }


                    }
                    break;
                case 30 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1487:6: (enumLiteral_29= 'CustomType23' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1487:6: (enumLiteral_29= 'CustomType23' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1487:8: enumLiteral_29= 'CustomType23'
                    {
                    enumLiteral_29=(Token)match(input,71,FOLLOW_71_in_ruleEqInterfaceType3216); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM23EnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_29, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM23EnumLiteralDeclaration_29()); 
                        

                    }


                    }
                    break;
                case 31 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1493:6: (enumLiteral_30= 'CustomType24' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1493:6: (enumLiteral_30= 'CustomType24' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1493:8: enumLiteral_30= 'CustomType24'
                    {
                    enumLiteral_30=(Token)match(input,72,FOLLOW_72_in_ruleEqInterfaceType3233); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM24EnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_30, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM24EnumLiteralDeclaration_30()); 
                        

                    }


                    }
                    break;
                case 32 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1499:6: (enumLiteral_31= 'CustomType25' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1499:6: (enumLiteral_31= 'CustomType25' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1499:8: enumLiteral_31= 'CustomType25'
                    {
                    enumLiteral_31=(Token)match(input,73,FOLLOW_73_in_ruleEqInterfaceType3250); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM25EnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_31, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM25EnumLiteralDeclaration_31()); 
                        

                    }


                    }
                    break;
                case 33 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1505:6: (enumLiteral_32= 'CustomType26' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1505:6: (enumLiteral_32= 'CustomType26' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1505:8: enumLiteral_32= 'CustomType26'
                    {
                    enumLiteral_32=(Token)match(input,74,FOLLOW_74_in_ruleEqInterfaceType3267); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM26EnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_32, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM26EnumLiteralDeclaration_32()); 
                        

                    }


                    }
                    break;
                case 34 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1511:6: (enumLiteral_33= 'CustomType27' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1511:6: (enumLiteral_33= 'CustomType27' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1511:8: enumLiteral_33= 'CustomType27'
                    {
                    enumLiteral_33=(Token)match(input,75,FOLLOW_75_in_ruleEqInterfaceType3284); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM27EnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_33, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM27EnumLiteralDeclaration_33()); 
                        

                    }


                    }
                    break;
                case 35 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1517:6: (enumLiteral_34= 'CustomType28' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1517:6: (enumLiteral_34= 'CustomType28' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1517:8: enumLiteral_34= 'CustomType28'
                    {
                    enumLiteral_34=(Token)match(input,76,FOLLOW_76_in_ruleEqInterfaceType3301); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM28EnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_34, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM28EnumLiteralDeclaration_34()); 
                        

                    }


                    }
                    break;
                case 36 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1523:6: (enumLiteral_35= 'CustomType29' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1523:6: (enumLiteral_35= 'CustomType29' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1523:8: enumLiteral_35= 'CustomType29'
                    {
                    enumLiteral_35=(Token)match(input,77,FOLLOW_77_in_ruleEqInterfaceType3318); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM29EnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_35, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM29EnumLiteralDeclaration_35()); 
                        

                    }


                    }
                    break;
                case 37 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1529:6: (enumLiteral_36= 'CustomType30' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1529:6: (enumLiteral_36= 'CustomType30' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1529:8: enumLiteral_36= 'CustomType30'
                    {
                    enumLiteral_36=(Token)match(input,78,FOLLOW_78_in_ruleEqInterfaceType3335); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM30EnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_36, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM30EnumLiteralDeclaration_36()); 
                        

                    }


                    }
                    break;
                case 38 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1535:6: (enumLiteral_37= 'CustomType31' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1535:6: (enumLiteral_37= 'CustomType31' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1535:8: enumLiteral_37= 'CustomType31'
                    {
                    enumLiteral_37=(Token)match(input,79,FOLLOW_79_in_ruleEqInterfaceType3352); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM31EnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_37, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM31EnumLiteralDeclaration_37()); 
                        

                    }


                    }
                    break;
                case 39 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1541:6: (enumLiteral_38= 'CustomType32' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1541:6: (enumLiteral_38= 'CustomType32' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1541:8: enumLiteral_38= 'CustomType32'
                    {
                    enumLiteral_38=(Token)match(input,80,FOLLOW_80_in_ruleEqInterfaceType3369); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM32EnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_38, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM32EnumLiteralDeclaration_38()); 
                        

                    }


                    }
                    break;
                case 40 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1547:6: (enumLiteral_39= 'CustomType33' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1547:6: (enumLiteral_39= 'CustomType33' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1547:8: enumLiteral_39= 'CustomType33'
                    {
                    enumLiteral_39=(Token)match(input,81,FOLLOW_81_in_ruleEqInterfaceType3386); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM33EnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_39, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM33EnumLiteralDeclaration_39()); 
                        

                    }


                    }
                    break;
                case 41 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1553:6: (enumLiteral_40= 'CustomType34' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1553:6: (enumLiteral_40= 'CustomType34' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1553:8: enumLiteral_40= 'CustomType34'
                    {
                    enumLiteral_40=(Token)match(input,82,FOLLOW_82_in_ruleEqInterfaceType3403); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM34EnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_40, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM34EnumLiteralDeclaration_40()); 
                        

                    }


                    }
                    break;
                case 42 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1559:6: (enumLiteral_41= 'CustomType35' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1559:6: (enumLiteral_41= 'CustomType35' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1559:8: enumLiteral_41= 'CustomType35'
                    {
                    enumLiteral_41=(Token)match(input,83,FOLLOW_83_in_ruleEqInterfaceType3420); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM35EnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_41, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM35EnumLiteralDeclaration_41()); 
                        

                    }


                    }
                    break;
                case 43 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1565:6: (enumLiteral_42= 'CustomType36' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1565:6: (enumLiteral_42= 'CustomType36' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1565:8: enumLiteral_42= 'CustomType36'
                    {
                    enumLiteral_42=(Token)match(input,84,FOLLOW_84_in_ruleEqInterfaceType3437); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM36EnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_42, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM36EnumLiteralDeclaration_42()); 
                        

                    }


                    }
                    break;
                case 44 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1571:6: (enumLiteral_43= 'CustomType37' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1571:6: (enumLiteral_43= 'CustomType37' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1571:8: enumLiteral_43= 'CustomType37'
                    {
                    enumLiteral_43=(Token)match(input,85,FOLLOW_85_in_ruleEqInterfaceType3454); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM37EnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_43, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM37EnumLiteralDeclaration_43()); 
                        

                    }


                    }
                    break;
                case 45 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1577:6: (enumLiteral_44= 'CustomType38' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1577:6: (enumLiteral_44= 'CustomType38' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1577:8: enumLiteral_44= 'CustomType38'
                    {
                    enumLiteral_44=(Token)match(input,86,FOLLOW_86_in_ruleEqInterfaceType3471); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM38EnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_44, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM38EnumLiteralDeclaration_44()); 
                        

                    }


                    }
                    break;
                case 46 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1583:6: (enumLiteral_45= 'CustomType39' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1583:6: (enumLiteral_45= 'CustomType39' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1583:8: enumLiteral_45= 'CustomType39'
                    {
                    enumLiteral_45=(Token)match(input,87,FOLLOW_87_in_ruleEqInterfaceType3488); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM39EnumLiteralDeclaration_45().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_45, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM39EnumLiteralDeclaration_45()); 
                        

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
    // $ANTLR end "ruleEqInterfaceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAssistModel_in_entryRuleAssistModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssistModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAssistModel122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel134 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssistModel146 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAssistModel158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssistModel175 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAssistModel192 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel204 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_ruleCompartment_in_ruleAssistModel225 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_17_in_ruleAssistModel239 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel251 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleEqInterface_in_ruleAssistModel272 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel285 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleAssistModel300 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel312 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroup_in_ruleAssistModel333 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartment_in_entryRuleCompartment384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartment394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCompartment431 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompartment448 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompartment465 = new BitSet(new long[]{0x0000000002F00000L});
    public static final BitSet FOLLOW_20_in_ruleCompartment478 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment507 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment524 = new BitSet(new long[]{0x0000000002F00000L});
    public static final BitSet FOLLOW_21_in_ruleCompartment539 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment568 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment585 = new BitSet(new long[]{0x0000000002F00000L});
    public static final BitSet FOLLOW_22_in_ruleCompartment600 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment629 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment646 = new BitSet(new long[]{0x0000000002F00000L});
    public static final BitSet FOLLOW_23_in_ruleCompartment661 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment690 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment707 = new BitSet(new long[]{0x0000000002F00000L});
    public static final BitSet FOLLOW_ruleRDC_in_ruleCompartment730 = new BitSet(new long[]{0x0000000003F10000L});
    public static final BitSet FOLLOW_24_in_ruleCompartment744 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompartment756 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleCompartment777 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleCompartment790 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCompartment804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDC_in_entryRuleRDC840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRDC850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRDC887 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRDC904 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRDC921 = new BitSet(new long[]{0x000000001C300000L});
    public static final BitSet FOLLOW_20_in_ruleRDC934 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC963 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC980 = new BitSet(new long[]{0x000000001C300000L});
    public static final BitSet FOLLOW_21_in_ruleRDC995 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1024 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1041 = new BitSet(new long[]{0x000000001C300000L});
    public static final BitSet FOLLOW_26_in_ruleRDC1056 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1085 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1102 = new BitSet(new long[]{0x000000001C300000L});
    public static final BitSet FOLLOW_27_in_ruleRDC1117 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1146 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1163 = new BitSet(new long[]{0x000000001C300000L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleRDC1186 = new BitSet(new long[]{0x000000001D310000L});
    public static final BitSet FOLLOW_24_in_ruleRDC1200 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRDC1212 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleRDC1233 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleRDC1246 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRDC1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector1296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleConnector1343 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnector1360 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConnector1377 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_ruleAvailableEqInterface_in_ruleConnector1398 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_16_in_ruleConnector1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvailableEqInterface_in_entryRuleAvailableEqInterface1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvailableEqInterface1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAvailableEqInterface1499 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAvailableEqInterface1516 = new BitSet(new long[]{0xFFFFFC0000000000L,0x0000000000FFFFFFL});
    public static final BitSet FOLLOW_ruleEqInterfaceType_in_ruleAvailableEqInterface1537 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAvailableEqInterface1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroup_in_entryRuleEqInterfaceGroup1585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterfaceGroup1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleEqInterfaceGroup1632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup1649 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterfaceGroup1666 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup1686 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEqInterfaceGroup1699 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup1719 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_16_in_ruleEqInterfaceGroup1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterface_in_entryRuleEqInterface1769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterface1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEqInterface1816 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterface1833 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterface1850 = new BitSet(new long[]{0x000003FE05010000L});
    public static final BitSet FOLLOW_33_in_ruleEqInterface1863 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface1875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface1892 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface1909 = new BitSet(new long[]{0x000003FC05010000L});
    public static final BitSet FOLLOW_34_in_ruleEqInterface1924 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface1936 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface1953 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface1970 = new BitSet(new long[]{0x000003F805010000L});
    public static final BitSet FOLLOW_35_in_ruleEqInterface1985 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface1997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface2014 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2031 = new BitSet(new long[]{0x000003F005010000L});
    public static final BitSet FOLLOW_36_in_ruleEqInterface2046 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface2075 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2092 = new BitSet(new long[]{0x000003E005010000L});
    public static final BitSet FOLLOW_37_in_ruleEqInterface2107 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface2136 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2153 = new BitSet(new long[]{0x000003C005010000L});
    public static final BitSet FOLLOW_38_in_ruleEqInterface2168 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface2197 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2214 = new BitSet(new long[]{0x0000038005010000L});
    public static final BitSet FOLLOW_39_in_ruleEqInterface2229 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface2258 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2275 = new BitSet(new long[]{0x0000030005010000L});
    public static final BitSet FOLLOW_40_in_ruleEqInterface2290 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface2319 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2336 = new BitSet(new long[]{0x0000020005010000L});
    public static final BitSet FOLLOW_41_in_ruleEqInterface2351 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface2380 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2397 = new BitSet(new long[]{0x0000000005010000L});
    public static final BitSet FOLLOW_26_in_ruleEqInterface2412 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2424 = new BitSet(new long[]{0xFFFFFC0000000000L,0x0000000000FFFFFFL});
    public static final BitSet FOLLOW_ruleEqInterfaceType_in_ruleEqInterface2445 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2457 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_24_in_ruleEqInterface2472 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterface2484 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleEqInterface2505 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleEqInterface2518 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEqInterface2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter2568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricParameter2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetricParameter2620 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMetricParameter2637 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMetricParameter2654 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMetricParameter2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEqInterfaceType2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEqInterfaceType2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleEqInterfaceType2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleEqInterfaceType2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleEqInterfaceType2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleEqInterfaceType2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleEqInterfaceType2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEqInterfaceType2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleEqInterfaceType2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleEqInterfaceType2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleEqInterfaceType2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleEqInterfaceType2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleEqInterfaceType2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleEqInterfaceType2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleEqInterfaceType2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEqInterfaceType2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleEqInterfaceType2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleEqInterfaceType3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleEqInterfaceType3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleEqInterfaceType3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleEqInterfaceType3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleEqInterfaceType3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleEqInterfaceType3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleEqInterfaceType3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleEqInterfaceType3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleEqInterfaceType3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleEqInterfaceType3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleEqInterfaceType3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleEqInterfaceType3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleEqInterfaceType3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleEqInterfaceType3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleEqInterfaceType3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleEqInterfaceType3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleEqInterfaceType3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleEqInterfaceType3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleEqInterfaceType3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleEqInterfaceType3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleEqInterfaceType3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleEqInterfaceType3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleEqInterfaceType3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleEqInterfaceType3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleEqInterfaceType3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleEqInterfaceType3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleEqInterfaceType3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleEqInterfaceType3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleEqInterfaceType3488 = new BitSet(new long[]{0x0000000000000002L});

}