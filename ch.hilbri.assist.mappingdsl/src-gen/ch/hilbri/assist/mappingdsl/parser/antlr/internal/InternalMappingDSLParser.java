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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Global'", "'{'", "'System name'", "'='", "';'", "'}'", "'Interfaces'", "'InterfaceGroups'", "'Restrictions'", "'Compartment'", "'Manufacturer'", "'PowerSupply'", "'Side'", "'Zone'", "'RDC'", "'Type'", "'ESS'", "'Generic properties'", "'Connector'", "'interface with type'", "'Group'", "','", "'Interface'", "'InterfaceSystem'", "'SubAta'", "'Resource'", "'LineName'", "'WiringLane'", "'GrpInfo'", "'Route'", "'PwSup1'", "'EmhZone1'", "'dislocal up to'", "'Can'", "'Enhanced Local Bus'", "'Ethernet'", "'Analog'", "'Digital'", "'Serial'", "'CustomType0'", "'CustomType1'", "'CustomType2'", "'CustomType3'", "'CustomType4'", "'CustomType5'", "'CustomType6'", "'CustomType7'", "'CustomType8'", "'CustomType9'", "'CustomType10'", "'CustomType11'", "'CustomType12'", "'CustomType13'", "'CustomType14'", "'CustomType15'", "'CustomType16'", "'CustomType17'", "'CustomType18'", "'CustomType19'", "'CustomType20'", "'CustomType21'", "'CustomType22'", "'CustomType23'", "'CustomType24'", "'CustomType25'", "'CustomType26'", "'CustomType27'", "'CustomType28'", "'CustomType29'", "'CustomType30'", "'CustomType31'", "'CustomType32'", "'CustomType33'", "'CustomType34'", "'CustomType35'", "'CustomType36'", "'CustomType37'", "'CustomType38'", "'CustomType39'"
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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:77:1: ruleAssistModel returns [EObject current=null] : (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )? (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) )+ otherlv_15= '}' )? (otherlv_16= 'Restrictions' otherlv_17= '{' ( (lv_dislocalityRelations_18_0= ruleDislocalityRelation ) )* otherlv_19= '}' )? ) ;
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
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_compartments_7_0 = null;

        EObject lv_eqInterfaces_10_0 = null;

        EObject lv_eqInterfaceGroups_14_0 = null;

        EObject lv_dislocalityRelations_18_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:80:28: ( (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )? (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) )+ otherlv_15= '}' )? (otherlv_16= 'Restrictions' otherlv_17= '{' ( (lv_dislocalityRelations_18_0= ruleDislocalityRelation ) )* otherlv_19= '}' )? ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )? (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) )+ otherlv_15= '}' )? (otherlv_16= 'Restrictions' otherlv_17= '{' ( (lv_dislocalityRelations_18_0= ruleDislocalityRelation ) )* otherlv_19= '}' )? )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:1: (otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )? (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) )+ otherlv_15= '}' )? (otherlv_16= 'Restrictions' otherlv_17= '{' ( (lv_dislocalityRelations_18_0= ruleDislocalityRelation ) )* otherlv_19= '}' )? )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:81:3: otherlv_0= 'Global' otherlv_1= '{' otherlv_2= 'System name' otherlv_3= '=' ( (lv_systemName_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ( (lv_compartments_7_0= ruleCompartment ) )? (otherlv_8= 'Interfaces' otherlv_9= '{' ( (lv_eqInterfaces_10_0= ruleEqInterface ) )+ otherlv_11= '}' )? (otherlv_12= 'InterfaceGroups' otherlv_13= '{' ( (lv_eqInterfaceGroups_14_0= ruleEqInterfaceGroup ) )+ otherlv_15= '}' )? (otherlv_16= 'Restrictions' otherlv_17= '{' ( (lv_dislocalityRelations_18_0= ruleDislocalityRelation ) )* otherlv_19= '}' )?
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

                        if ( (LA4_0==31) ) {
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:201:3: (otherlv_16= 'Restrictions' otherlv_17= '{' ( (lv_dislocalityRelations_18_0= ruleDislocalityRelation ) )* otherlv_19= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:201:5: otherlv_16= 'Restrictions' otherlv_17= '{' ( (lv_dislocalityRelations_18_0= ruleDislocalityRelation ) )* otherlv_19= '}'
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_19_in_ruleAssistModel361); 

                        	newLeafNode(otherlv_16, grammarAccess.getAssistModelAccess().getRestrictionsKeyword_10_0());
                        
                    otherlv_17=(Token)match(input,12,FOLLOW_12_in_ruleAssistModel373); 

                        	newLeafNode(otherlv_17, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:209:1: ( (lv_dislocalityRelations_18_0= ruleDislocalityRelation ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:210:1: (lv_dislocalityRelations_18_0= ruleDislocalityRelation )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:210:1: (lv_dislocalityRelations_18_0= ruleDislocalityRelation )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:211:3: lv_dislocalityRelations_18_0= ruleDislocalityRelation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssistModelAccess().getDislocalityRelationsDislocalityRelationParserRuleCall_10_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDislocalityRelation_in_ruleAssistModel394);
                    	    lv_dislocalityRelations_18_0=ruleDislocalityRelation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssistModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"dislocalityRelations",
                    	            		lv_dislocalityRelations_18_0, 
                    	            		"DislocalityRelation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleAssistModel407); 

                        	newLeafNode(otherlv_19, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_10_3());
                        

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:239:1: entryRuleCompartment returns [EObject current=null] : iv_ruleCompartment= ruleCompartment EOF ;
    public final EObject entryRuleCompartment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompartment = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:240:2: (iv_ruleCompartment= ruleCompartment EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:241:2: iv_ruleCompartment= ruleCompartment EOF
            {
             newCompositeNode(grammarAccess.getCompartmentRule()); 
            pushFollow(FOLLOW_ruleCompartment_in_entryRuleCompartment445);
            iv_ruleCompartment=ruleCompartment();

            state._fsp--;

             current =iv_ruleCompartment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartment455); 

            }

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:248:1: ruleCompartment returns [EObject current=null] : (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )* ) ) ) otherlv_21= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:251:28: ( (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )* ) ) ) otherlv_21= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:252:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )* ) ) ) otherlv_21= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:252:1: (otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )* ) ) ) otherlv_21= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:252:3: otherlv_0= 'Compartment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )* ) ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleCompartment492); 

                	newLeafNode(otherlv_0, grammarAccess.getCompartmentAccess().getCompartmentKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:256:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:257:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:257:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:258:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompartment509); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCompartment526); 

                	newLeafNode(otherlv_2, grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:278:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )* ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:280:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:280:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )* ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:281:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:284:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )* )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:285:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )*
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:285:3: ( ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) ) )*
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
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:287:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:287:4: ({...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:288:5: {...}? => ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:288:108: ( ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:289:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:292:6: ({...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:292:7: {...}? => (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:292:16: (otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:292:18: otherlv_4= 'Manufacturer' otherlv_5= '=' ( (lv_manufacturer_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleCompartment584); 

            	        	newLeafNode(otherlv_4, grammarAccess.getCompartmentAccess().getManufacturerKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCompartment596); 

            	        	newLeafNode(otherlv_5, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:300:1: ( (lv_manufacturer_6_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:301:1: (lv_manufacturer_6_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:301:1: (lv_manufacturer_6_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:302:3: lv_manufacturer_6_0= RULE_STRING
            	    {
            	    lv_manufacturer_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment613); 

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

            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCompartment630); 

            	        	newLeafNode(otherlv_7, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:329:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:329:4: ({...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:330:5: {...}? => ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:330:108: ( ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:331:6: ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:334:6: ({...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:334:7: {...}? => (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:334:16: (otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:334:18: otherlv_8= 'PowerSupply' otherlv_9= '=' ( (lv_powerSupply_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleCompartment698); 

            	        	newLeafNode(otherlv_8, grammarAccess.getCompartmentAccess().getPowerSupplyKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleCompartment710); 

            	        	newLeafNode(otherlv_9, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:342:1: ( (lv_powerSupply_10_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:343:1: (lv_powerSupply_10_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:343:1: (lv_powerSupply_10_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:344:3: lv_powerSupply_10_0= RULE_STRING
            	    {
            	    lv_powerSupply_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment727); 

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

            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleCompartment744); 

            	        	newLeafNode(otherlv_11, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:371:4: ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:371:4: ({...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:372:5: {...}? => ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:372:108: ( ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:373:6: ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:376:6: ({...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:376:7: {...}? => (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:376:16: (otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:376:18: otherlv_12= 'Side' otherlv_13= '=' ( (lv_side_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleCompartment812); 

            	        	newLeafNode(otherlv_12, grammarAccess.getCompartmentAccess().getSideKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleCompartment824); 

            	        	newLeafNode(otherlv_13, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:384:1: ( (lv_side_14_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:385:1: (lv_side_14_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:385:1: (lv_side_14_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:386:3: lv_side_14_0= RULE_STRING
            	    {
            	    lv_side_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment841); 

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

            	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleCompartment858); 

            	        	newLeafNode(otherlv_15, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:413:4: ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:413:4: ({...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:414:5: {...}? => ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:414:108: ( ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:415:6: ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:418:6: ({...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:418:7: {...}? => (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:418:16: (otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:418:18: otherlv_16= 'Zone' otherlv_17= '=' ( (lv_zone_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,24,FOLLOW_24_in_ruleCompartment926); 

            	        	newLeafNode(otherlv_16, grammarAccess.getCompartmentAccess().getZoneKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleCompartment938); 

            	        	newLeafNode(otherlv_17, grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:426:1: ( (lv_zone_18_0= RULE_STRING ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:427:1: (lv_zone_18_0= RULE_STRING )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:427:1: (lv_zone_18_0= RULE_STRING )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:428:3: lv_zone_18_0= RULE_STRING
            	    {
            	    lv_zone_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompartment955); 

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

            	    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleCompartment972); 

            	        	newLeafNode(otherlv_19, grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:455:4: ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:455:4: ({...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:456:5: {...}? => ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleCompartment", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:456:108: ( ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+ )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:457:6: ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:460:6: ({...}? => ( (lv_rdcs_20_0= ruleRDC ) ) )+
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
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:460:7: {...}? => ( (lv_rdcs_20_0= ruleRDC ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleCompartment", "true");
            	    	    }
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:460:16: ( (lv_rdcs_20_0= ruleRDC ) )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:461:1: (lv_rdcs_20_0= ruleRDC )
            	    	    {
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:461:1: (lv_rdcs_20_0= ruleRDC )
            	    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:462:3: lv_rdcs_20_0= ruleRDC
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getCompartmentAccess().getRdcsRDCParserRuleCall_3_4_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleRDC_in_ruleCompartment1048);
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
            	    break loop9;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	

            }

            otherlv_21=(Token)match(input,16,FOLLOW_16_in_ruleCompartment1101); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:504:1: entryRuleRDC returns [EObject current=null] : iv_ruleRDC= ruleRDC EOF ;
    public final EObject entryRuleRDC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDC = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:505:2: (iv_ruleRDC= ruleRDC EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:506:2: iv_ruleRDC= ruleRDC EOF
            {
             newCompositeNode(grammarAccess.getRDCRule()); 
            pushFollow(FOLLOW_ruleRDC_in_entryRuleRDC1137);
            iv_ruleRDC=ruleRDC();

            state._fsp--;

             current =iv_ruleRDC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDC1147); 

            }

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:513:1: ruleRDC returns [EObject current=null] : (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Type' otherlv_12= '=' ( (lv_rdcType_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'ESS' otherlv_16= '=' ( (lv_ess_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_connectors_19_0= ruleConnector ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:516:28: ( (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Type' otherlv_12= '=' ( (lv_rdcType_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'ESS' otherlv_16= '=' ( (lv_ess_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_connectors_19_0= ruleConnector ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:517:1: (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Type' otherlv_12= '=' ( (lv_rdcType_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'ESS' otherlv_16= '=' ( (lv_ess_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_connectors_19_0= ruleConnector ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:517:1: (otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Type' otherlv_12= '=' ( (lv_rdcType_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'ESS' otherlv_16= '=' ( (lv_ess_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_connectors_19_0= ruleConnector ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:517:3: otherlv_0= 'RDC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Type' otherlv_12= '=' ( (lv_rdcType_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'ESS' otherlv_16= '=' ( (lv_ess_17_0= RULE_STRING ) ) otherlv_18= ';' )? ( (lv_connectors_19_0= ruleConnector ) )+ (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleRDC1184); 

                	newLeafNode(otherlv_0, grammarAccess.getRDCAccess().getRDCKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:521:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:522:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:522:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:523:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRDC1201); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRDC1218); 

                	newLeafNode(otherlv_2, grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:543:1: (otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:543:3: otherlv_3= 'Manufacturer' otherlv_4= '=' ( (lv_manufacturer_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleRDC1231); 

                        	newLeafNode(otherlv_3, grammarAccess.getRDCAccess().getManufacturerKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleRDC1243); 

                        	newLeafNode(otherlv_4, grammarAccess.getRDCAccess().getEqualsSignKeyword_3_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:551:1: ( (lv_manufacturer_5_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:552:1: (lv_manufacturer_5_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:552:1: (lv_manufacturer_5_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:553:3: lv_manufacturer_5_0= RULE_STRING
                    {
                    lv_manufacturer_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1260); 

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

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleRDC1277); 

                        	newLeafNode(otherlv_6, grammarAccess.getRDCAccess().getSemicolonKeyword_3_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:573:3: (otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:573:5: otherlv_7= 'PowerSupply' otherlv_8= '=' ( (lv_powerSupply_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleRDC1292); 

                        	newLeafNode(otherlv_7, grammarAccess.getRDCAccess().getPowerSupplyKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleRDC1304); 

                        	newLeafNode(otherlv_8, grammarAccess.getRDCAccess().getEqualsSignKeyword_4_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:581:1: ( (lv_powerSupply_9_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:582:1: (lv_powerSupply_9_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:582:1: (lv_powerSupply_9_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:583:3: lv_powerSupply_9_0= RULE_STRING
                    {
                    lv_powerSupply_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1321); 

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

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleRDC1338); 

                        	newLeafNode(otherlv_10, grammarAccess.getRDCAccess().getSemicolonKeyword_4_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:603:3: (otherlv_11= 'Type' otherlv_12= '=' ( (lv_rdcType_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:603:5: otherlv_11= 'Type' otherlv_12= '=' ( (lv_rdcType_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_26_in_ruleRDC1353); 

                        	newLeafNode(otherlv_11, grammarAccess.getRDCAccess().getTypeKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleRDC1365); 

                        	newLeafNode(otherlv_12, grammarAccess.getRDCAccess().getEqualsSignKeyword_5_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:611:1: ( (lv_rdcType_13_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:612:1: (lv_rdcType_13_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:612:1: (lv_rdcType_13_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:613:3: lv_rdcType_13_0= RULE_STRING
                    {
                    lv_rdcType_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1382); 

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

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleRDC1399); 

                        	newLeafNode(otherlv_14, grammarAccess.getRDCAccess().getSemicolonKeyword_5_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:633:3: (otherlv_15= 'ESS' otherlv_16= '=' ( (lv_ess_17_0= RULE_STRING ) ) otherlv_18= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:633:5: otherlv_15= 'ESS' otherlv_16= '=' ( (lv_ess_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,27,FOLLOW_27_in_ruleRDC1414); 

                        	newLeafNode(otherlv_15, grammarAccess.getRDCAccess().getESSKeyword_6_0());
                        
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleRDC1426); 

                        	newLeafNode(otherlv_16, grammarAccess.getRDCAccess().getEqualsSignKeyword_6_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:641:1: ( (lv_ess_17_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:642:1: (lv_ess_17_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:642:1: (lv_ess_17_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:643:3: lv_ess_17_0= RULE_STRING
                    {
                    lv_ess_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRDC1443); 

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

                    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleRDC1460); 

                        	newLeafNode(otherlv_18, grammarAccess.getRDCAccess().getSemicolonKeyword_6_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:663:3: ( (lv_connectors_19_0= ruleConnector ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:664:1: (lv_connectors_19_0= ruleConnector )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:664:1: (lv_connectors_19_0= ruleConnector )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:665:3: lv_connectors_19_0= ruleConnector
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRDCAccess().getConnectorsConnectorParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnector_in_ruleRDC1483);
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

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:681:3: (otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:681:5: otherlv_20= 'Generic properties' otherlv_21= '{' ( (lv_metricParameters_22_0= ruleMetricParameter ) )* otherlv_23= '}'
                    {
                    otherlv_20=(Token)match(input,28,FOLLOW_28_in_ruleRDC1497); 

                        	newLeafNode(otherlv_20, grammarAccess.getRDCAccess().getGenericPropertiesKeyword_8_0());
                        
                    otherlv_21=(Token)match(input,12,FOLLOW_12_in_ruleRDC1509); 

                        	newLeafNode(otherlv_21, grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:689:1: ( (lv_metricParameters_22_0= ruleMetricParameter ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_STRING) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:690:1: (lv_metricParameters_22_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:690:1: (lv_metricParameters_22_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:691:3: lv_metricParameters_22_0= ruleMetricParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRDCAccess().getMetricParametersMetricParameterParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleRDC1530);
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

                    otherlv_23=(Token)match(input,16,FOLLOW_16_in_ruleRDC1543); 

                        	newLeafNode(otherlv_23, grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_8_3());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_16_in_ruleRDC1557); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:723:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:724:2: (iv_ruleConnector= ruleConnector EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:725:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector1593);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector1603); 

            }

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:732:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_availableEqInterfaces_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:735:28: ( (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:736:1: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:736:1: (otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:736:3: otherlv_0= 'Connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleConnector1640); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:740:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:741:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:741:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:742:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnector1657); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConnector1674); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:762:1: ( (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_INT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:763:1: (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:763:1: (lv_availableEqInterfaces_3_0= ruleAvailableEqInterface )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:764:3: lv_availableEqInterfaces_3_0= ruleAvailableEqInterface
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectorAccess().getAvailableEqInterfacesAvailableEqInterfaceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAvailableEqInterface_in_ruleConnector1695);
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
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleConnector1708); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:792:1: entryRuleAvailableEqInterface returns [EObject current=null] : iv_ruleAvailableEqInterface= ruleAvailableEqInterface EOF ;
    public final EObject entryRuleAvailableEqInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvailableEqInterface = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:793:2: (iv_ruleAvailableEqInterface= ruleAvailableEqInterface EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:794:2: iv_ruleAvailableEqInterface= ruleAvailableEqInterface EOF
            {
             newCompositeNode(grammarAccess.getAvailableEqInterfaceRule()); 
            pushFollow(FOLLOW_ruleAvailableEqInterface_in_entryRuleAvailableEqInterface1744);
            iv_ruleAvailableEqInterface=ruleAvailableEqInterface();

            state._fsp--;

             current =iv_ruleAvailableEqInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvailableEqInterface1754); 

            }

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:801:1: ruleAvailableEqInterface returns [EObject current=null] : ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'interface with type' ( (lv_eqInterfaceType_2_0= ruleEqInterfaceType ) ) otherlv_3= ';' ) ;
    public final EObject ruleAvailableEqInterface() throws RecognitionException {
        EObject current = null;

        Token lv_count_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_eqInterfaceType_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:804:28: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'interface with type' ( (lv_eqInterfaceType_2_0= ruleEqInterfaceType ) ) otherlv_3= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:805:1: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'interface with type' ( (lv_eqInterfaceType_2_0= ruleEqInterfaceType ) ) otherlv_3= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:805:1: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'interface with type' ( (lv_eqInterfaceType_2_0= ruleEqInterfaceType ) ) otherlv_3= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:805:2: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'interface with type' ( (lv_eqInterfaceType_2_0= ruleEqInterfaceType ) ) otherlv_3= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:805:2: ( (lv_count_0_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:806:1: (lv_count_0_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:806:1: (lv_count_0_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:807:3: lv_count_0_0= RULE_INT
            {
            lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAvailableEqInterface1796); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleAvailableEqInterface1813); 

                	newLeafNode(otherlv_1, grammarAccess.getAvailableEqInterfaceAccess().getInterfaceWithTypeKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:827:1: ( (lv_eqInterfaceType_2_0= ruleEqInterfaceType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:828:1: (lv_eqInterfaceType_2_0= ruleEqInterfaceType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:828:1: (lv_eqInterfaceType_2_0= ruleEqInterfaceType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:829:3: lv_eqInterfaceType_2_0= ruleEqInterfaceType
            {
             
            	        newCompositeNode(grammarAccess.getAvailableEqInterfaceAccess().getEqInterfaceTypeEqInterfaceTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEqInterfaceType_in_ruleAvailableEqInterface1834);
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleAvailableEqInterface1846); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:857:1: entryRuleEqInterfaceGroup returns [EObject current=null] : iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF ;
    public final EObject entryRuleEqInterfaceGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterfaceGroup = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:858:2: (iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:859:2: iv_ruleEqInterfaceGroup= ruleEqInterfaceGroup EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceGroupRule()); 
            pushFollow(FOLLOW_ruleEqInterfaceGroup_in_entryRuleEqInterfaceGroup1882);
            iv_ruleEqInterfaceGroup=ruleEqInterfaceGroup();

            state._fsp--;

             current =iv_ruleEqInterfaceGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterfaceGroup1892); 

            }

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:866:1: ruleEqInterfaceGroup returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:869:28: ( (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:870:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:870:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:870:3: otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleEqInterfaceGroup1929); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceGroupAccess().getGroupKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:874:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:875:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:875:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:876:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup1946); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEqInterfaceGroup1963); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceGroupAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:896:1: ( (otherlv_3= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:897:1: (otherlv_3= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:897:1: (otherlv_3= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:898:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup1983); 

            		newLeafNode(otherlv_3, grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_3_0()); 
            	

            }


            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:909:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:909:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleEqInterfaceGroup1996); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEqInterfaceGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:913:1: ( (otherlv_5= RULE_ID ) )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:914:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:914:1: (otherlv_5= RULE_ID )
            	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:915:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEqInterfaceGroupRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterfaceGroup2016); 

            	    		newLeafNode(otherlv_5, grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_4_1_0()); 
            	    	

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

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleEqInterfaceGroup2030); 

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:938:1: entryRuleEqInterface returns [EObject current=null] : iv_ruleEqInterface= ruleEqInterface EOF ;
    public final EObject entryRuleEqInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqInterface = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:939:2: (iv_ruleEqInterface= ruleEqInterface EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:940:2: iv_ruleEqInterface= ruleEqInterface EOF
            {
             newCompositeNode(grammarAccess.getEqInterfaceRule()); 
            pushFollow(FOLLOW_ruleEqInterface_in_entryRuleEqInterface2066);
            iv_ruleEqInterface=ruleEqInterface();

            state._fsp--;

             current =iv_ruleEqInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterface2076); 

            }

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:947:1: ruleEqInterface returns [EObject current=null] : (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InterfaceSystem' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleEqInterfaceType ) ) otherlv_42= ';' )? (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )? otherlv_47= '}' ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:950:28: ( (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InterfaceSystem' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleEqInterfaceType ) ) otherlv_42= ';' )? (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )? otherlv_47= '}' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:951:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InterfaceSystem' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleEqInterfaceType ) ) otherlv_42= ';' )? (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )? otherlv_47= '}' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:951:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InterfaceSystem' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleEqInterfaceType ) ) otherlv_42= ';' )? (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )? otherlv_47= '}' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:951:3: otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InterfaceSystem' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleEqInterfaceType ) ) otherlv_42= ';' )? (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )? otherlv_47= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleEqInterface2113); 

                	newLeafNode(otherlv_0, grammarAccess.getEqInterfaceAccess().getInterfaceKeyword_0());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:955:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:956:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:956:1: (lv_name_1_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:957:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEqInterface2130); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEqInterface2147); 

                	newLeafNode(otherlv_2, grammarAccess.getEqInterfaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:977:1: (otherlv_3= 'InterfaceSystem' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:977:3: otherlv_3= 'InterfaceSystem' otherlv_4= '=' ( (lv_system_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleEqInterface2160); 

                        	newLeafNode(otherlv_3, grammarAccess.getEqInterfaceAccess().getInterfaceSystemKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2172); 

                        	newLeafNode(otherlv_4, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:985:1: ( (lv_system_5_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:986:1: (lv_system_5_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:986:1: (lv_system_5_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:987:3: lv_system_5_0= RULE_STRING
                    {
                    lv_system_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface2189); 

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

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2206); 

                        	newLeafNode(otherlv_6, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1007:3: (otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1007:5: otherlv_7= 'SubAta' otherlv_8= '=' ( (lv_subAta_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleEqInterface2221); 

                        	newLeafNode(otherlv_7, grammarAccess.getEqInterfaceAccess().getSubAtaKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2233); 

                        	newLeafNode(otherlv_8, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_4_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1015:1: ( (lv_subAta_9_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1016:1: (lv_subAta_9_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1016:1: (lv_subAta_9_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1017:3: lv_subAta_9_0= RULE_STRING
                    {
                    lv_subAta_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface2250); 

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

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2267); 

                        	newLeafNode(otherlv_10, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_4_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1037:3: (otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1037:5: otherlv_11= 'Resource' otherlv_12= '=' ( (lv_resource_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,36,FOLLOW_36_in_ruleEqInterface2282); 

                        	newLeafNode(otherlv_11, grammarAccess.getEqInterfaceAccess().getResourceKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2294); 

                        	newLeafNode(otherlv_12, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_5_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1045:1: ( (lv_resource_13_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1046:1: (lv_resource_13_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1046:1: (lv_resource_13_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1047:3: lv_resource_13_0= RULE_STRING
                    {
                    lv_resource_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface2311); 

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

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2328); 

                        	newLeafNode(otherlv_14, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_5_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1067:3: (otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1067:5: otherlv_15= 'LineName' otherlv_16= '=' ( (lv_lineName_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,37,FOLLOW_37_in_ruleEqInterface2343); 

                        	newLeafNode(otherlv_15, grammarAccess.getEqInterfaceAccess().getLineNameKeyword_6_0());
                        
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2355); 

                        	newLeafNode(otherlv_16, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_6_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1075:1: ( (lv_lineName_17_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1076:1: (lv_lineName_17_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1076:1: (lv_lineName_17_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1077:3: lv_lineName_17_0= RULE_STRING
                    {
                    lv_lineName_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface2372); 

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

                    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2389); 

                        	newLeafNode(otherlv_18, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_6_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1097:3: (otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1097:5: otherlv_19= 'WiringLane' otherlv_20= '=' ( (lv_wiringLane_21_0= RULE_STRING ) ) otherlv_22= ';'
                    {
                    otherlv_19=(Token)match(input,38,FOLLOW_38_in_ruleEqInterface2404); 

                        	newLeafNode(otherlv_19, grammarAccess.getEqInterfaceAccess().getWiringLaneKeyword_7_0());
                        
                    otherlv_20=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2416); 

                        	newLeafNode(otherlv_20, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_7_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1105:1: ( (lv_wiringLane_21_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1106:1: (lv_wiringLane_21_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1106:1: (lv_wiringLane_21_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1107:3: lv_wiringLane_21_0= RULE_STRING
                    {
                    lv_wiringLane_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface2433); 

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

                    otherlv_22=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2450); 

                        	newLeafNode(otherlv_22, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_7_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1127:3: (otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1127:5: otherlv_23= 'GrpInfo' otherlv_24= '=' ( (lv_grpInfo_25_0= RULE_STRING ) ) otherlv_26= ';'
                    {
                    otherlv_23=(Token)match(input,39,FOLLOW_39_in_ruleEqInterface2465); 

                        	newLeafNode(otherlv_23, grammarAccess.getEqInterfaceAccess().getGrpInfoKeyword_8_0());
                        
                    otherlv_24=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2477); 

                        	newLeafNode(otherlv_24, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_8_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1135:1: ( (lv_grpInfo_25_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1136:1: (lv_grpInfo_25_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1136:1: (lv_grpInfo_25_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1137:3: lv_grpInfo_25_0= RULE_STRING
                    {
                    lv_grpInfo_25_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface2494); 

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

                    otherlv_26=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2511); 

                        	newLeafNode(otherlv_26, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_8_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1157:3: (otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1157:5: otherlv_27= 'Route' otherlv_28= '=' ( (lv_route_29_0= RULE_STRING ) ) otherlv_30= ';'
                    {
                    otherlv_27=(Token)match(input,40,FOLLOW_40_in_ruleEqInterface2526); 

                        	newLeafNode(otherlv_27, grammarAccess.getEqInterfaceAccess().getRouteKeyword_9_0());
                        
                    otherlv_28=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2538); 

                        	newLeafNode(otherlv_28, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_9_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1165:1: ( (lv_route_29_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1166:1: (lv_route_29_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1166:1: (lv_route_29_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1167:3: lv_route_29_0= RULE_STRING
                    {
                    lv_route_29_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface2555); 

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

                    otherlv_30=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2572); 

                        	newLeafNode(otherlv_30, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_9_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1187:3: (otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1187:5: otherlv_31= 'PwSup1' otherlv_32= '=' ( (lv_pwSup1_33_0= RULE_STRING ) ) otherlv_34= ';'
                    {
                    otherlv_31=(Token)match(input,41,FOLLOW_41_in_ruleEqInterface2587); 

                        	newLeafNode(otherlv_31, grammarAccess.getEqInterfaceAccess().getPwSup1Keyword_10_0());
                        
                    otherlv_32=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2599); 

                        	newLeafNode(otherlv_32, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_10_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1195:1: ( (lv_pwSup1_33_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1196:1: (lv_pwSup1_33_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1196:1: (lv_pwSup1_33_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1197:3: lv_pwSup1_33_0= RULE_STRING
                    {
                    lv_pwSup1_33_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface2616); 

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

                    otherlv_34=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2633); 

                        	newLeafNode(otherlv_34, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_10_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1217:3: (otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1217:5: otherlv_35= 'EmhZone1' otherlv_36= '=' ( (lv_emhZone1_37_0= RULE_STRING ) ) otherlv_38= ';'
                    {
                    otherlv_35=(Token)match(input,42,FOLLOW_42_in_ruleEqInterface2648); 

                        	newLeafNode(otherlv_35, grammarAccess.getEqInterfaceAccess().getEmhZone1Keyword_11_0());
                        
                    otherlv_36=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2660); 

                        	newLeafNode(otherlv_36, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_11_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1225:1: ( (lv_emhZone1_37_0= RULE_STRING ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1226:1: (lv_emhZone1_37_0= RULE_STRING )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1226:1: (lv_emhZone1_37_0= RULE_STRING )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1227:3: lv_emhZone1_37_0= RULE_STRING
                    {
                    lv_emhZone1_37_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqInterface2677); 

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

                    otherlv_38=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2694); 

                        	newLeafNode(otherlv_38, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_11_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1247:3: (otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleEqInterfaceType ) ) otherlv_42= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1247:5: otherlv_39= 'Type' otherlv_40= '=' ( (lv_ioType_41_0= ruleEqInterfaceType ) ) otherlv_42= ';'
                    {
                    otherlv_39=(Token)match(input,26,FOLLOW_26_in_ruleEqInterface2709); 

                        	newLeafNode(otherlv_39, grammarAccess.getEqInterfaceAccess().getTypeKeyword_12_0());
                        
                    otherlv_40=(Token)match(input,14,FOLLOW_14_in_ruleEqInterface2721); 

                        	newLeafNode(otherlv_40, grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_12_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1255:1: ( (lv_ioType_41_0= ruleEqInterfaceType ) )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1256:1: (lv_ioType_41_0= ruleEqInterfaceType )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1256:1: (lv_ioType_41_0= ruleEqInterfaceType )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1257:3: lv_ioType_41_0= ruleEqInterfaceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqInterfaceAccess().getIoTypeEqInterfaceTypeEnumRuleCall_12_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEqInterfaceType_in_ruleEqInterface2742);
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

                    otherlv_42=(Token)match(input,15,FOLLOW_15_in_ruleEqInterface2754); 

                        	newLeafNode(otherlv_42, grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_12_3());
                        

                    }
                    break;

            }

            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1277:3: (otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1277:5: otherlv_43= 'Generic properties' otherlv_44= '{' ( (lv_metricParameters_45_0= ruleMetricParameter ) )* otherlv_46= '}'
                    {
                    otherlv_43=(Token)match(input,28,FOLLOW_28_in_ruleEqInterface2769); 

                        	newLeafNode(otherlv_43, grammarAccess.getEqInterfaceAccess().getGenericPropertiesKeyword_13_0());
                        
                    otherlv_44=(Token)match(input,12,FOLLOW_12_in_ruleEqInterface2781); 

                        	newLeafNode(otherlv_44, grammarAccess.getEqInterfaceAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1285:1: ( (lv_metricParameters_45_0= ruleMetricParameter ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_STRING) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1286:1: (lv_metricParameters_45_0= ruleMetricParameter )
                    	    {
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1286:1: (lv_metricParameters_45_0= ruleMetricParameter )
                    	    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1287:3: lv_metricParameters_45_0= ruleMetricParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEqInterfaceAccess().getMetricParametersMetricParameterParserRuleCall_13_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMetricParameter_in_ruleEqInterface2802);
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
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_46=(Token)match(input,16,FOLLOW_16_in_ruleEqInterface2815); 

                        	newLeafNode(otherlv_46, grammarAccess.getEqInterfaceAccess().getRightCurlyBracketKeyword_13_3());
                        

                    }
                    break;

            }

            otherlv_47=(Token)match(input,16,FOLLOW_16_in_ruleEqInterface2829); 

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


    // $ANTLR start "entryRuleDislocalityRelation"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1319:1: entryRuleDislocalityRelation returns [EObject current=null] : iv_ruleDislocalityRelation= ruleDislocalityRelation EOF ;
    public final EObject entryRuleDislocalityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDislocalityRelation = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1320:2: (iv_ruleDislocalityRelation= ruleDislocalityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1321:2: iv_ruleDislocalityRelation= ruleDislocalityRelation EOF
            {
             newCompositeNode(grammarAccess.getDislocalityRelationRule()); 
            pushFollow(FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation2865);
            iv_ruleDislocalityRelation=ruleDislocalityRelation();

            state._fsp--;

             current =iv_ruleDislocalityRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDislocalityRelation2875); 

            }

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1328:1: ruleDislocalityRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'dislocal up to' ( (lv_hardwareLevel_2_0= ruleHardwareArchitectureLevelType ) ) otherlv_3= ';' ) ;
    public final EObject ruleDislocalityRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_hardwareLevel_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1331:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'dislocal up to' ( (lv_hardwareLevel_2_0= ruleHardwareArchitectureLevelType ) ) otherlv_3= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1332:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'dislocal up to' ( (lv_hardwareLevel_2_0= ruleHardwareArchitectureLevelType ) ) otherlv_3= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1332:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'dislocal up to' ( (lv_hardwareLevel_2_0= ruleHardwareArchitectureLevelType ) ) otherlv_3= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1332:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'dislocal up to' ( (lv_hardwareLevel_2_0= ruleHardwareArchitectureLevelType ) ) otherlv_3= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1332:2: ( (otherlv_0= RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1333:1: (otherlv_0= RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1333:1: (otherlv_0= RULE_ID )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1334:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDislocalityRelationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDislocalityRelation2920); 

            		newLeafNode(otherlv_0, grammarAccess.getDislocalityRelationAccess().getEqInterfaceGroupEqInterfaceGroupCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleDislocalityRelation2932); 

                	newLeafNode(otherlv_1, grammarAccess.getDislocalityRelationAccess().getDislocalUpToKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1349:1: ( (lv_hardwareLevel_2_0= ruleHardwareArchitectureLevelType ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1350:1: (lv_hardwareLevel_2_0= ruleHardwareArchitectureLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1350:1: (lv_hardwareLevel_2_0= ruleHardwareArchitectureLevelType )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1351:3: lv_hardwareLevel_2_0= ruleHardwareArchitectureLevelType
            {
             
            	        newCompositeNode(grammarAccess.getDislocalityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleHardwareArchitectureLevelType_in_ruleDislocalityRelation2953);
            lv_hardwareLevel_2_0=ruleHardwareArchitectureLevelType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDislocalityRelationRule());
            	        }
                   		set(
                   			current, 
                   			"hardwareLevel",
                    		lv_hardwareLevel_2_0, 
                    		"HardwareArchitectureLevelType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDislocalityRelation2965); 

                	newLeafNode(otherlv_3, grammarAccess.getDislocalityRelationAccess().getSemicolonKeyword_3());
                

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


    // $ANTLR start "entryRuleMetricParameter"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1379:1: entryRuleMetricParameter returns [EObject current=null] : iv_ruleMetricParameter= ruleMetricParameter EOF ;
    public final EObject entryRuleMetricParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricParameter = null;


        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1380:2: (iv_ruleMetricParameter= ruleMetricParameter EOF )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1381:2: iv_ruleMetricParameter= ruleMetricParameter EOF
            {
             newCompositeNode(grammarAccess.getMetricParameterRule()); 
            pushFollow(FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter3001);
            iv_ruleMetricParameter=ruleMetricParameter();

            state._fsp--;

             current =iv_ruleMetricParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricParameter3011); 

            }

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
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1388:1: ruleMetricParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) ;
    public final EObject ruleMetricParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1391:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1392:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1392:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1392:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';'
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1392:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1393:1: (lv_name_0_0= RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1393:1: (lv_name_0_0= RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1394:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetricParameter3053); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleMetricParameter3070); 

                	newLeafNode(otherlv_1, grammarAccess.getMetricParameterAccess().getEqualsSignKeyword_1());
                
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1414:1: ( (lv_value_2_0= RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1415:1: (lv_value_2_0= RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1415:1: (lv_value_2_0= RULE_INT )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1416:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMetricParameter3087); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleMetricParameter3104); 

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


    // $ANTLR start "ruleHardwareArchitectureLevelType"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1446:1: ruleHardwareArchitectureLevelType returns [Enumerator current=null] : ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) ) ;
    public final Enumerator ruleHardwareArchitectureLevelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1448:28: ( ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1449:1: ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1449:1: ( (enumLiteral_0= 'Compartment' ) | (enumLiteral_1= 'RDC' ) | (enumLiteral_2= 'Connector' ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt31=1;
                }
                break;
            case 25:
                {
                alt31=2;
                }
                break;
            case 29:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1449:2: (enumLiteral_0= 'Compartment' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1449:2: (enumLiteral_0= 'Compartment' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1449:4: enumLiteral_0= 'Compartment'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_20_in_ruleHardwareArchitectureLevelType3156); 

                            current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOMPARTMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOMPARTMENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1455:6: (enumLiteral_1= 'RDC' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1455:6: (enumLiteral_1= 'RDC' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1455:8: enumLiteral_1= 'RDC'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleHardwareArchitectureLevelType3173); 

                            current = grammarAccess.getHardwareArchitectureLevelTypeAccess().getRDCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getHardwareArchitectureLevelTypeAccess().getRDCEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1461:6: (enumLiteral_2= 'Connector' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1461:6: (enumLiteral_2= 'Connector' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1461:8: enumLiteral_2= 'Connector'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_29_in_ruleHardwareArchitectureLevelType3190); 

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


    // $ANTLR start "ruleEqInterfaceType"
    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1471:1: ruleEqInterfaceType returns [Enumerator current=null] : ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'CustomType0' ) | (enumLiteral_7= 'CustomType1' ) | (enumLiteral_8= 'CustomType2' ) | (enumLiteral_9= 'CustomType3' ) | (enumLiteral_10= 'CustomType4' ) | (enumLiteral_11= 'CustomType5' ) | (enumLiteral_12= 'CustomType6' ) | (enumLiteral_13= 'CustomType7' ) | (enumLiteral_14= 'CustomType8' ) | (enumLiteral_15= 'CustomType9' ) | (enumLiteral_16= 'CustomType10' ) | (enumLiteral_17= 'CustomType11' ) | (enumLiteral_18= 'CustomType12' ) | (enumLiteral_19= 'CustomType13' ) | (enumLiteral_20= 'CustomType14' ) | (enumLiteral_21= 'CustomType15' ) | (enumLiteral_22= 'CustomType16' ) | (enumLiteral_23= 'CustomType17' ) | (enumLiteral_24= 'CustomType18' ) | (enumLiteral_25= 'CustomType19' ) | (enumLiteral_26= 'CustomType20' ) | (enumLiteral_27= 'CustomType21' ) | (enumLiteral_28= 'CustomType22' ) | (enumLiteral_29= 'CustomType23' ) | (enumLiteral_30= 'CustomType24' ) | (enumLiteral_31= 'CustomType25' ) | (enumLiteral_32= 'CustomType26' ) | (enumLiteral_33= 'CustomType27' ) | (enumLiteral_34= 'CustomType28' ) | (enumLiteral_35= 'CustomType29' ) | (enumLiteral_36= 'CustomType30' ) | (enumLiteral_37= 'CustomType31' ) | (enumLiteral_38= 'CustomType32' ) | (enumLiteral_39= 'CustomType33' ) | (enumLiteral_40= 'CustomType34' ) | (enumLiteral_41= 'CustomType35' ) | (enumLiteral_42= 'CustomType36' ) | (enumLiteral_43= 'CustomType37' ) | (enumLiteral_44= 'CustomType38' ) | (enumLiteral_45= 'CustomType39' ) ) ;
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
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1473:28: ( ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'CustomType0' ) | (enumLiteral_7= 'CustomType1' ) | (enumLiteral_8= 'CustomType2' ) | (enumLiteral_9= 'CustomType3' ) | (enumLiteral_10= 'CustomType4' ) | (enumLiteral_11= 'CustomType5' ) | (enumLiteral_12= 'CustomType6' ) | (enumLiteral_13= 'CustomType7' ) | (enumLiteral_14= 'CustomType8' ) | (enumLiteral_15= 'CustomType9' ) | (enumLiteral_16= 'CustomType10' ) | (enumLiteral_17= 'CustomType11' ) | (enumLiteral_18= 'CustomType12' ) | (enumLiteral_19= 'CustomType13' ) | (enumLiteral_20= 'CustomType14' ) | (enumLiteral_21= 'CustomType15' ) | (enumLiteral_22= 'CustomType16' ) | (enumLiteral_23= 'CustomType17' ) | (enumLiteral_24= 'CustomType18' ) | (enumLiteral_25= 'CustomType19' ) | (enumLiteral_26= 'CustomType20' ) | (enumLiteral_27= 'CustomType21' ) | (enumLiteral_28= 'CustomType22' ) | (enumLiteral_29= 'CustomType23' ) | (enumLiteral_30= 'CustomType24' ) | (enumLiteral_31= 'CustomType25' ) | (enumLiteral_32= 'CustomType26' ) | (enumLiteral_33= 'CustomType27' ) | (enumLiteral_34= 'CustomType28' ) | (enumLiteral_35= 'CustomType29' ) | (enumLiteral_36= 'CustomType30' ) | (enumLiteral_37= 'CustomType31' ) | (enumLiteral_38= 'CustomType32' ) | (enumLiteral_39= 'CustomType33' ) | (enumLiteral_40= 'CustomType34' ) | (enumLiteral_41= 'CustomType35' ) | (enumLiteral_42= 'CustomType36' ) | (enumLiteral_43= 'CustomType37' ) | (enumLiteral_44= 'CustomType38' ) | (enumLiteral_45= 'CustomType39' ) ) )
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1474:1: ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'CustomType0' ) | (enumLiteral_7= 'CustomType1' ) | (enumLiteral_8= 'CustomType2' ) | (enumLiteral_9= 'CustomType3' ) | (enumLiteral_10= 'CustomType4' ) | (enumLiteral_11= 'CustomType5' ) | (enumLiteral_12= 'CustomType6' ) | (enumLiteral_13= 'CustomType7' ) | (enumLiteral_14= 'CustomType8' ) | (enumLiteral_15= 'CustomType9' ) | (enumLiteral_16= 'CustomType10' ) | (enumLiteral_17= 'CustomType11' ) | (enumLiteral_18= 'CustomType12' ) | (enumLiteral_19= 'CustomType13' ) | (enumLiteral_20= 'CustomType14' ) | (enumLiteral_21= 'CustomType15' ) | (enumLiteral_22= 'CustomType16' ) | (enumLiteral_23= 'CustomType17' ) | (enumLiteral_24= 'CustomType18' ) | (enumLiteral_25= 'CustomType19' ) | (enumLiteral_26= 'CustomType20' ) | (enumLiteral_27= 'CustomType21' ) | (enumLiteral_28= 'CustomType22' ) | (enumLiteral_29= 'CustomType23' ) | (enumLiteral_30= 'CustomType24' ) | (enumLiteral_31= 'CustomType25' ) | (enumLiteral_32= 'CustomType26' ) | (enumLiteral_33= 'CustomType27' ) | (enumLiteral_34= 'CustomType28' ) | (enumLiteral_35= 'CustomType29' ) | (enumLiteral_36= 'CustomType30' ) | (enumLiteral_37= 'CustomType31' ) | (enumLiteral_38= 'CustomType32' ) | (enumLiteral_39= 'CustomType33' ) | (enumLiteral_40= 'CustomType34' ) | (enumLiteral_41= 'CustomType35' ) | (enumLiteral_42= 'CustomType36' ) | (enumLiteral_43= 'CustomType37' ) | (enumLiteral_44= 'CustomType38' ) | (enumLiteral_45= 'CustomType39' ) )
            {
            // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1474:1: ( (enumLiteral_0= 'Can' ) | (enumLiteral_1= 'Enhanced Local Bus' ) | (enumLiteral_2= 'Ethernet' ) | (enumLiteral_3= 'Analog' ) | (enumLiteral_4= 'Digital' ) | (enumLiteral_5= 'Serial' ) | (enumLiteral_6= 'CustomType0' ) | (enumLiteral_7= 'CustomType1' ) | (enumLiteral_8= 'CustomType2' ) | (enumLiteral_9= 'CustomType3' ) | (enumLiteral_10= 'CustomType4' ) | (enumLiteral_11= 'CustomType5' ) | (enumLiteral_12= 'CustomType6' ) | (enumLiteral_13= 'CustomType7' ) | (enumLiteral_14= 'CustomType8' ) | (enumLiteral_15= 'CustomType9' ) | (enumLiteral_16= 'CustomType10' ) | (enumLiteral_17= 'CustomType11' ) | (enumLiteral_18= 'CustomType12' ) | (enumLiteral_19= 'CustomType13' ) | (enumLiteral_20= 'CustomType14' ) | (enumLiteral_21= 'CustomType15' ) | (enumLiteral_22= 'CustomType16' ) | (enumLiteral_23= 'CustomType17' ) | (enumLiteral_24= 'CustomType18' ) | (enumLiteral_25= 'CustomType19' ) | (enumLiteral_26= 'CustomType20' ) | (enumLiteral_27= 'CustomType21' ) | (enumLiteral_28= 'CustomType22' ) | (enumLiteral_29= 'CustomType23' ) | (enumLiteral_30= 'CustomType24' ) | (enumLiteral_31= 'CustomType25' ) | (enumLiteral_32= 'CustomType26' ) | (enumLiteral_33= 'CustomType27' ) | (enumLiteral_34= 'CustomType28' ) | (enumLiteral_35= 'CustomType29' ) | (enumLiteral_36= 'CustomType30' ) | (enumLiteral_37= 'CustomType31' ) | (enumLiteral_38= 'CustomType32' ) | (enumLiteral_39= 'CustomType33' ) | (enumLiteral_40= 'CustomType34' ) | (enumLiteral_41= 'CustomType35' ) | (enumLiteral_42= 'CustomType36' ) | (enumLiteral_43= 'CustomType37' ) | (enumLiteral_44= 'CustomType38' ) | (enumLiteral_45= 'CustomType39' ) )
            int alt32=46;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt32=1;
                }
                break;
            case 45:
                {
                alt32=2;
                }
                break;
            case 46:
                {
                alt32=3;
                }
                break;
            case 47:
                {
                alt32=4;
                }
                break;
            case 48:
                {
                alt32=5;
                }
                break;
            case 49:
                {
                alt32=6;
                }
                break;
            case 50:
                {
                alt32=7;
                }
                break;
            case 51:
                {
                alt32=8;
                }
                break;
            case 52:
                {
                alt32=9;
                }
                break;
            case 53:
                {
                alt32=10;
                }
                break;
            case 54:
                {
                alt32=11;
                }
                break;
            case 55:
                {
                alt32=12;
                }
                break;
            case 56:
                {
                alt32=13;
                }
                break;
            case 57:
                {
                alt32=14;
                }
                break;
            case 58:
                {
                alt32=15;
                }
                break;
            case 59:
                {
                alt32=16;
                }
                break;
            case 60:
                {
                alt32=17;
                }
                break;
            case 61:
                {
                alt32=18;
                }
                break;
            case 62:
                {
                alt32=19;
                }
                break;
            case 63:
                {
                alt32=20;
                }
                break;
            case 64:
                {
                alt32=21;
                }
                break;
            case 65:
                {
                alt32=22;
                }
                break;
            case 66:
                {
                alt32=23;
                }
                break;
            case 67:
                {
                alt32=24;
                }
                break;
            case 68:
                {
                alt32=25;
                }
                break;
            case 69:
                {
                alt32=26;
                }
                break;
            case 70:
                {
                alt32=27;
                }
                break;
            case 71:
                {
                alt32=28;
                }
                break;
            case 72:
                {
                alt32=29;
                }
                break;
            case 73:
                {
                alt32=30;
                }
                break;
            case 74:
                {
                alt32=31;
                }
                break;
            case 75:
                {
                alt32=32;
                }
                break;
            case 76:
                {
                alt32=33;
                }
                break;
            case 77:
                {
                alt32=34;
                }
                break;
            case 78:
                {
                alt32=35;
                }
                break;
            case 79:
                {
                alt32=36;
                }
                break;
            case 80:
                {
                alt32=37;
                }
                break;
            case 81:
                {
                alt32=38;
                }
                break;
            case 82:
                {
                alt32=39;
                }
                break;
            case 83:
                {
                alt32=40;
                }
                break;
            case 84:
                {
                alt32=41;
                }
                break;
            case 85:
                {
                alt32=42;
                }
                break;
            case 86:
                {
                alt32=43;
                }
                break;
            case 87:
                {
                alt32=44;
                }
                break;
            case 88:
                {
                alt32=45;
                }
                break;
            case 89:
                {
                alt32=46;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1474:2: (enumLiteral_0= 'Can' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1474:2: (enumLiteral_0= 'Can' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1474:4: enumLiteral_0= 'Can'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_44_in_ruleEqInterfaceType3235); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEqInterfaceTypeAccess().getCANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1480:6: (enumLiteral_1= 'Enhanced Local Bus' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1480:6: (enumLiteral_1= 'Enhanced Local Bus' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1480:8: enumLiteral_1= 'Enhanced Local Bus'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_45_in_ruleEqInterfaceType3252); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getELBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getEqInterfaceTypeAccess().getELBEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1486:6: (enumLiteral_2= 'Ethernet' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1486:6: (enumLiteral_2= 'Ethernet' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1486:8: enumLiteral_2= 'Ethernet'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_46_in_ruleEqInterfaceType3269); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getETHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getEqInterfaceTypeAccess().getETHEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1492:6: (enumLiteral_3= 'Analog' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1492:6: (enumLiteral_3= 'Analog' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1492:8: enumLiteral_3= 'Analog'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_47_in_ruleEqInterfaceType3286); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getANALOGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getEqInterfaceTypeAccess().getANALOGEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1498:6: (enumLiteral_4= 'Digital' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1498:6: (enumLiteral_4= 'Digital' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1498:8: enumLiteral_4= 'Digital'
                    {
                    enumLiteral_4=(Token)match(input,48,FOLLOW_48_in_ruleEqInterfaceType3303); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getDIGITALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getEqInterfaceTypeAccess().getDIGITALEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1504:6: (enumLiteral_5= 'Serial' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1504:6: (enumLiteral_5= 'Serial' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1504:8: enumLiteral_5= 'Serial'
                    {
                    enumLiteral_5=(Token)match(input,49,FOLLOW_49_in_ruleEqInterfaceType3320); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getSERIALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getEqInterfaceTypeAccess().getSERIALEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1510:6: (enumLiteral_6= 'CustomType0' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1510:6: (enumLiteral_6= 'CustomType0' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1510:8: enumLiteral_6= 'CustomType0'
                    {
                    enumLiteral_6=(Token)match(input,50,FOLLOW_50_in_ruleEqInterfaceType3337); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM0EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM0EnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1516:6: (enumLiteral_7= 'CustomType1' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1516:6: (enumLiteral_7= 'CustomType1' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1516:8: enumLiteral_7= 'CustomType1'
                    {
                    enumLiteral_7=(Token)match(input,51,FOLLOW_51_in_ruleEqInterfaceType3354); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM1EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM1EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1522:6: (enumLiteral_8= 'CustomType2' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1522:6: (enumLiteral_8= 'CustomType2' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1522:8: enumLiteral_8= 'CustomType2'
                    {
                    enumLiteral_8=(Token)match(input,52,FOLLOW_52_in_ruleEqInterfaceType3371); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM2EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM2EnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1528:6: (enumLiteral_9= 'CustomType3' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1528:6: (enumLiteral_9= 'CustomType3' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1528:8: enumLiteral_9= 'CustomType3'
                    {
                    enumLiteral_9=(Token)match(input,53,FOLLOW_53_in_ruleEqInterfaceType3388); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM3EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM3EnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1534:6: (enumLiteral_10= 'CustomType4' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1534:6: (enumLiteral_10= 'CustomType4' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1534:8: enumLiteral_10= 'CustomType4'
                    {
                    enumLiteral_10=(Token)match(input,54,FOLLOW_54_in_ruleEqInterfaceType3405); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM4EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM4EnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1540:6: (enumLiteral_11= 'CustomType5' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1540:6: (enumLiteral_11= 'CustomType5' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1540:8: enumLiteral_11= 'CustomType5'
                    {
                    enumLiteral_11=(Token)match(input,55,FOLLOW_55_in_ruleEqInterfaceType3422); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM5EnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM5EnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1546:6: (enumLiteral_12= 'CustomType6' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1546:6: (enumLiteral_12= 'CustomType6' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1546:8: enumLiteral_12= 'CustomType6'
                    {
                    enumLiteral_12=(Token)match(input,56,FOLLOW_56_in_ruleEqInterfaceType3439); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM6EnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM6EnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1552:6: (enumLiteral_13= 'CustomType7' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1552:6: (enumLiteral_13= 'CustomType7' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1552:8: enumLiteral_13= 'CustomType7'
                    {
                    enumLiteral_13=(Token)match(input,57,FOLLOW_57_in_ruleEqInterfaceType3456); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM7EnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM7EnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1558:6: (enumLiteral_14= 'CustomType8' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1558:6: (enumLiteral_14= 'CustomType8' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1558:8: enumLiteral_14= 'CustomType8'
                    {
                    enumLiteral_14=(Token)match(input,58,FOLLOW_58_in_ruleEqInterfaceType3473); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM8EnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM8EnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1564:6: (enumLiteral_15= 'CustomType9' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1564:6: (enumLiteral_15= 'CustomType9' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1564:8: enumLiteral_15= 'CustomType9'
                    {
                    enumLiteral_15=(Token)match(input,59,FOLLOW_59_in_ruleEqInterfaceType3490); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM9EnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM9EnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1570:6: (enumLiteral_16= 'CustomType10' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1570:6: (enumLiteral_16= 'CustomType10' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1570:8: enumLiteral_16= 'CustomType10'
                    {
                    enumLiteral_16=(Token)match(input,60,FOLLOW_60_in_ruleEqInterfaceType3507); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM10EnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_16, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM10EnumLiteralDeclaration_16()); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1576:6: (enumLiteral_17= 'CustomType11' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1576:6: (enumLiteral_17= 'CustomType11' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1576:8: enumLiteral_17= 'CustomType11'
                    {
                    enumLiteral_17=(Token)match(input,61,FOLLOW_61_in_ruleEqInterfaceType3524); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM11EnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_17, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM11EnumLiteralDeclaration_17()); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1582:6: (enumLiteral_18= 'CustomType12' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1582:6: (enumLiteral_18= 'CustomType12' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1582:8: enumLiteral_18= 'CustomType12'
                    {
                    enumLiteral_18=(Token)match(input,62,FOLLOW_62_in_ruleEqInterfaceType3541); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM12EnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_18, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM12EnumLiteralDeclaration_18()); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1588:6: (enumLiteral_19= 'CustomType13' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1588:6: (enumLiteral_19= 'CustomType13' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1588:8: enumLiteral_19= 'CustomType13'
                    {
                    enumLiteral_19=(Token)match(input,63,FOLLOW_63_in_ruleEqInterfaceType3558); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM13EnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_19, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM13EnumLiteralDeclaration_19()); 
                        

                    }


                    }
                    break;
                case 21 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1594:6: (enumLiteral_20= 'CustomType14' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1594:6: (enumLiteral_20= 'CustomType14' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1594:8: enumLiteral_20= 'CustomType14'
                    {
                    enumLiteral_20=(Token)match(input,64,FOLLOW_64_in_ruleEqInterfaceType3575); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM14EnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_20, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM14EnumLiteralDeclaration_20()); 
                        

                    }


                    }
                    break;
                case 22 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1600:6: (enumLiteral_21= 'CustomType15' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1600:6: (enumLiteral_21= 'CustomType15' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1600:8: enumLiteral_21= 'CustomType15'
                    {
                    enumLiteral_21=(Token)match(input,65,FOLLOW_65_in_ruleEqInterfaceType3592); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM15EnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_21, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM15EnumLiteralDeclaration_21()); 
                        

                    }


                    }
                    break;
                case 23 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1606:6: (enumLiteral_22= 'CustomType16' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1606:6: (enumLiteral_22= 'CustomType16' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1606:8: enumLiteral_22= 'CustomType16'
                    {
                    enumLiteral_22=(Token)match(input,66,FOLLOW_66_in_ruleEqInterfaceType3609); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM16EnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_22, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM16EnumLiteralDeclaration_22()); 
                        

                    }


                    }
                    break;
                case 24 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1612:6: (enumLiteral_23= 'CustomType17' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1612:6: (enumLiteral_23= 'CustomType17' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1612:8: enumLiteral_23= 'CustomType17'
                    {
                    enumLiteral_23=(Token)match(input,67,FOLLOW_67_in_ruleEqInterfaceType3626); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM17EnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_23, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM17EnumLiteralDeclaration_23()); 
                        

                    }


                    }
                    break;
                case 25 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1618:6: (enumLiteral_24= 'CustomType18' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1618:6: (enumLiteral_24= 'CustomType18' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1618:8: enumLiteral_24= 'CustomType18'
                    {
                    enumLiteral_24=(Token)match(input,68,FOLLOW_68_in_ruleEqInterfaceType3643); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM18EnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_24, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM18EnumLiteralDeclaration_24()); 
                        

                    }


                    }
                    break;
                case 26 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1624:6: (enumLiteral_25= 'CustomType19' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1624:6: (enumLiteral_25= 'CustomType19' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1624:8: enumLiteral_25= 'CustomType19'
                    {
                    enumLiteral_25=(Token)match(input,69,FOLLOW_69_in_ruleEqInterfaceType3660); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM19EnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_25, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM19EnumLiteralDeclaration_25()); 
                        

                    }


                    }
                    break;
                case 27 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1630:6: (enumLiteral_26= 'CustomType20' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1630:6: (enumLiteral_26= 'CustomType20' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1630:8: enumLiteral_26= 'CustomType20'
                    {
                    enumLiteral_26=(Token)match(input,70,FOLLOW_70_in_ruleEqInterfaceType3677); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM20EnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_26, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM20EnumLiteralDeclaration_26()); 
                        

                    }


                    }
                    break;
                case 28 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1636:6: (enumLiteral_27= 'CustomType21' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1636:6: (enumLiteral_27= 'CustomType21' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1636:8: enumLiteral_27= 'CustomType21'
                    {
                    enumLiteral_27=(Token)match(input,71,FOLLOW_71_in_ruleEqInterfaceType3694); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM21EnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_27, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM21EnumLiteralDeclaration_27()); 
                        

                    }


                    }
                    break;
                case 29 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1642:6: (enumLiteral_28= 'CustomType22' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1642:6: (enumLiteral_28= 'CustomType22' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1642:8: enumLiteral_28= 'CustomType22'
                    {
                    enumLiteral_28=(Token)match(input,72,FOLLOW_72_in_ruleEqInterfaceType3711); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM22EnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_28, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM22EnumLiteralDeclaration_28()); 
                        

                    }


                    }
                    break;
                case 30 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1648:6: (enumLiteral_29= 'CustomType23' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1648:6: (enumLiteral_29= 'CustomType23' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1648:8: enumLiteral_29= 'CustomType23'
                    {
                    enumLiteral_29=(Token)match(input,73,FOLLOW_73_in_ruleEqInterfaceType3728); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM23EnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_29, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM23EnumLiteralDeclaration_29()); 
                        

                    }


                    }
                    break;
                case 31 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1654:6: (enumLiteral_30= 'CustomType24' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1654:6: (enumLiteral_30= 'CustomType24' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1654:8: enumLiteral_30= 'CustomType24'
                    {
                    enumLiteral_30=(Token)match(input,74,FOLLOW_74_in_ruleEqInterfaceType3745); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM24EnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_30, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM24EnumLiteralDeclaration_30()); 
                        

                    }


                    }
                    break;
                case 32 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1660:6: (enumLiteral_31= 'CustomType25' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1660:6: (enumLiteral_31= 'CustomType25' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1660:8: enumLiteral_31= 'CustomType25'
                    {
                    enumLiteral_31=(Token)match(input,75,FOLLOW_75_in_ruleEqInterfaceType3762); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM25EnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_31, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM25EnumLiteralDeclaration_31()); 
                        

                    }


                    }
                    break;
                case 33 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1666:6: (enumLiteral_32= 'CustomType26' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1666:6: (enumLiteral_32= 'CustomType26' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1666:8: enumLiteral_32= 'CustomType26'
                    {
                    enumLiteral_32=(Token)match(input,76,FOLLOW_76_in_ruleEqInterfaceType3779); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM26EnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_32, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM26EnumLiteralDeclaration_32()); 
                        

                    }


                    }
                    break;
                case 34 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1672:6: (enumLiteral_33= 'CustomType27' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1672:6: (enumLiteral_33= 'CustomType27' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1672:8: enumLiteral_33= 'CustomType27'
                    {
                    enumLiteral_33=(Token)match(input,77,FOLLOW_77_in_ruleEqInterfaceType3796); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM27EnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_33, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM27EnumLiteralDeclaration_33()); 
                        

                    }


                    }
                    break;
                case 35 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1678:6: (enumLiteral_34= 'CustomType28' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1678:6: (enumLiteral_34= 'CustomType28' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1678:8: enumLiteral_34= 'CustomType28'
                    {
                    enumLiteral_34=(Token)match(input,78,FOLLOW_78_in_ruleEqInterfaceType3813); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM28EnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_34, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM28EnumLiteralDeclaration_34()); 
                        

                    }


                    }
                    break;
                case 36 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1684:6: (enumLiteral_35= 'CustomType29' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1684:6: (enumLiteral_35= 'CustomType29' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1684:8: enumLiteral_35= 'CustomType29'
                    {
                    enumLiteral_35=(Token)match(input,79,FOLLOW_79_in_ruleEqInterfaceType3830); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM29EnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_35, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM29EnumLiteralDeclaration_35()); 
                        

                    }


                    }
                    break;
                case 37 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1690:6: (enumLiteral_36= 'CustomType30' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1690:6: (enumLiteral_36= 'CustomType30' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1690:8: enumLiteral_36= 'CustomType30'
                    {
                    enumLiteral_36=(Token)match(input,80,FOLLOW_80_in_ruleEqInterfaceType3847); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM30EnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_36, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM30EnumLiteralDeclaration_36()); 
                        

                    }


                    }
                    break;
                case 38 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1696:6: (enumLiteral_37= 'CustomType31' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1696:6: (enumLiteral_37= 'CustomType31' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1696:8: enumLiteral_37= 'CustomType31'
                    {
                    enumLiteral_37=(Token)match(input,81,FOLLOW_81_in_ruleEqInterfaceType3864); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM31EnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_37, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM31EnumLiteralDeclaration_37()); 
                        

                    }


                    }
                    break;
                case 39 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1702:6: (enumLiteral_38= 'CustomType32' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1702:6: (enumLiteral_38= 'CustomType32' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1702:8: enumLiteral_38= 'CustomType32'
                    {
                    enumLiteral_38=(Token)match(input,82,FOLLOW_82_in_ruleEqInterfaceType3881); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM32EnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_38, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM32EnumLiteralDeclaration_38()); 
                        

                    }


                    }
                    break;
                case 40 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1708:6: (enumLiteral_39= 'CustomType33' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1708:6: (enumLiteral_39= 'CustomType33' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1708:8: enumLiteral_39= 'CustomType33'
                    {
                    enumLiteral_39=(Token)match(input,83,FOLLOW_83_in_ruleEqInterfaceType3898); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM33EnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_39, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM33EnumLiteralDeclaration_39()); 
                        

                    }


                    }
                    break;
                case 41 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1714:6: (enumLiteral_40= 'CustomType34' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1714:6: (enumLiteral_40= 'CustomType34' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1714:8: enumLiteral_40= 'CustomType34'
                    {
                    enumLiteral_40=(Token)match(input,84,FOLLOW_84_in_ruleEqInterfaceType3915); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM34EnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_40, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM34EnumLiteralDeclaration_40()); 
                        

                    }


                    }
                    break;
                case 42 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1720:6: (enumLiteral_41= 'CustomType35' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1720:6: (enumLiteral_41= 'CustomType35' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1720:8: enumLiteral_41= 'CustomType35'
                    {
                    enumLiteral_41=(Token)match(input,85,FOLLOW_85_in_ruleEqInterfaceType3932); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM35EnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_41, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM35EnumLiteralDeclaration_41()); 
                        

                    }


                    }
                    break;
                case 43 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1726:6: (enumLiteral_42= 'CustomType36' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1726:6: (enumLiteral_42= 'CustomType36' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1726:8: enumLiteral_42= 'CustomType36'
                    {
                    enumLiteral_42=(Token)match(input,86,FOLLOW_86_in_ruleEqInterfaceType3949); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM36EnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_42, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM36EnumLiteralDeclaration_42()); 
                        

                    }


                    }
                    break;
                case 44 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1732:6: (enumLiteral_43= 'CustomType37' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1732:6: (enumLiteral_43= 'CustomType37' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1732:8: enumLiteral_43= 'CustomType37'
                    {
                    enumLiteral_43=(Token)match(input,87,FOLLOW_87_in_ruleEqInterfaceType3966); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM37EnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_43, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM37EnumLiteralDeclaration_43()); 
                        

                    }


                    }
                    break;
                case 45 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1738:6: (enumLiteral_44= 'CustomType38' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1738:6: (enumLiteral_44= 'CustomType38' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1738:8: enumLiteral_44= 'CustomType38'
                    {
                    enumLiteral_44=(Token)match(input,88,FOLLOW_88_in_ruleEqInterfaceType3983); 

                            current = grammarAccess.getEqInterfaceTypeAccess().getCUSTOM38EnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_44, grammarAccess.getEqInterfaceTypeAccess().getCUSTOM38EnumLiteralDeclaration_44()); 
                        

                    }


                    }
                    break;
                case 46 :
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1744:6: (enumLiteral_45= 'CustomType39' )
                    {
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1744:6: (enumLiteral_45= 'CustomType39' )
                    // ../ch.hilbri.assist.mappingdsl/src-gen/ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.g:1744:8: enumLiteral_45= 'CustomType39'
                    {
                    enumLiteral_45=(Token)match(input,89,FOLLOW_89_in_ruleEqInterfaceType4000); 

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
    public static final BitSet FOLLOW_16_in_ruleAssistModel204 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_ruleCompartment_in_ruleAssistModel225 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_17_in_ruleAssistModel239 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel251 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleEqInterface_in_ruleAssistModel272 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel285 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_ruleAssistModel300 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel312 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroup_in_ruleAssistModel333 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel346 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAssistModel361 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssistModel373 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_ruleAssistModel394 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleAssistModel407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartment_in_entryRuleCompartment445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartment455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCompartment492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompartment509 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompartment526 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_21_in_ruleCompartment584 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment613 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment630 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_22_in_ruleCompartment698 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment710 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment727 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment744 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_23_in_ruleCompartment812 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment841 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment858 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_24_in_ruleCompartment926 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompartment938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompartment955 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompartment972 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_ruleRDC_in_ruleCompartment1048 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_16_in_ruleCompartment1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDC_in_entryRuleRDC1137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRDC1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRDC1184 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRDC1201 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRDC1218 = new BitSet(new long[]{0x000000002C600000L});
    public static final BitSet FOLLOW_21_in_ruleRDC1231 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1260 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1277 = new BitSet(new long[]{0x000000002C600000L});
    public static final BitSet FOLLOW_22_in_ruleRDC1292 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1321 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1338 = new BitSet(new long[]{0x000000002C600000L});
    public static final BitSet FOLLOW_26_in_ruleRDC1353 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1382 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1399 = new BitSet(new long[]{0x000000002C600000L});
    public static final BitSet FOLLOW_27_in_ruleRDC1414 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRDC1426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRDC1443 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRDC1460 = new BitSet(new long[]{0x000000002C600000L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleRDC1483 = new BitSet(new long[]{0x000000003C610000L});
    public static final BitSet FOLLOW_28_in_ruleRDC1497 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRDC1509 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleRDC1530 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleRDC1543 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRDC1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector1593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleConnector1640 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnector1657 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConnector1674 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_ruleAvailableEqInterface_in_ruleConnector1695 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_16_in_ruleConnector1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvailableEqInterface_in_entryRuleAvailableEqInterface1744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvailableEqInterface1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAvailableEqInterface1796 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAvailableEqInterface1813 = new BitSet(new long[]{0xFFFFF00000000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_ruleEqInterfaceType_in_ruleAvailableEqInterface1834 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAvailableEqInterface1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroup_in_entryRuleEqInterfaceGroup1882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterfaceGroup1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEqInterfaceGroup1929 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup1946 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterfaceGroup1963 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup1983 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEqInterfaceGroup1996 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterfaceGroup2016 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_16_in_ruleEqInterfaceGroup2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterface_in_entryRuleEqInterface2066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterface2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleEqInterface2113 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEqInterface2130 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterface2147 = new BitSet(new long[]{0x000007FC14010000L});
    public static final BitSet FOLLOW_34_in_ruleEqInterface2160 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface2189 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2206 = new BitSet(new long[]{0x000007F814010000L});
    public static final BitSet FOLLOW_35_in_ruleEqInterface2221 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface2250 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2267 = new BitSet(new long[]{0x000007F014010000L});
    public static final BitSet FOLLOW_36_in_ruleEqInterface2282 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface2311 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2328 = new BitSet(new long[]{0x000007E014010000L});
    public static final BitSet FOLLOW_37_in_ruleEqInterface2343 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface2372 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2389 = new BitSet(new long[]{0x000007C014010000L});
    public static final BitSet FOLLOW_38_in_ruleEqInterface2404 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface2433 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2450 = new BitSet(new long[]{0x0000078014010000L});
    public static final BitSet FOLLOW_39_in_ruleEqInterface2465 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface2494 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2511 = new BitSet(new long[]{0x0000070014010000L});
    public static final BitSet FOLLOW_40_in_ruleEqInterface2526 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface2555 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2572 = new BitSet(new long[]{0x0000060014010000L});
    public static final BitSet FOLLOW_41_in_ruleEqInterface2587 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface2616 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2633 = new BitSet(new long[]{0x0000040014010000L});
    public static final BitSet FOLLOW_42_in_ruleEqInterface2648 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqInterface2677 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2694 = new BitSet(new long[]{0x0000000014010000L});
    public static final BitSet FOLLOW_26_in_ruleEqInterface2709 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEqInterface2721 = new BitSet(new long[]{0xFFFFF00000000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_ruleEqInterfaceType_in_ruleEqInterface2742 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEqInterface2754 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_28_in_ruleEqInterface2769 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEqInterface2781 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_ruleEqInterface2802 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleEqInterface2815 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEqInterface2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation2865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDislocalityRelation2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDislocalityRelation2920 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleDislocalityRelation2932 = new BitSet(new long[]{0x0000000022100000L});
    public static final BitSet FOLLOW_ruleHardwareArchitectureLevelType_in_ruleDislocalityRelation2953 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDislocalityRelation2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter3001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricParameter3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetricParameter3053 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMetricParameter3070 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMetricParameter3087 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMetricParameter3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleHardwareArchitectureLevelType3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleHardwareArchitectureLevelType3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleHardwareArchitectureLevelType3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleEqInterfaceType3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleEqInterfaceType3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleEqInterfaceType3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleEqInterfaceType3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleEqInterfaceType3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEqInterfaceType3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleEqInterfaceType3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleEqInterfaceType3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleEqInterfaceType3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleEqInterfaceType3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleEqInterfaceType3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleEqInterfaceType3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleEqInterfaceType3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEqInterfaceType3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleEqInterfaceType3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleEqInterfaceType3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleEqInterfaceType3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleEqInterfaceType3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleEqInterfaceType3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleEqInterfaceType3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleEqInterfaceType3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleEqInterfaceType3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleEqInterfaceType3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleEqInterfaceType3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleEqInterfaceType3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleEqInterfaceType3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleEqInterfaceType3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleEqInterfaceType3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleEqInterfaceType3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleEqInterfaceType3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleEqInterfaceType3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleEqInterfaceType3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleEqInterfaceType3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleEqInterfaceType3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleEqInterfaceType3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleEqInterfaceType3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleEqInterfaceType3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleEqInterfaceType3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleEqInterfaceType3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleEqInterfaceType3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleEqInterfaceType3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleEqInterfaceType3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleEqInterfaceType3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleEqInterfaceType3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleEqInterfaceType3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleEqInterfaceType4000 = new BitSet(new long[]{0x0000000000000002L});

}
