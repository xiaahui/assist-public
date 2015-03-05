package ch.hilbri.assist.mappingdsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import ch.hilbri.assist.mappingdsl.services.MappingDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMappingDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Can'", "'Enhanced Local Bus'", "'Ethernet'", "'Analog'", "'Digital'", "'Serial'", "'CustomType0'", "'CustomType1'", "'CustomType2'", "'CustomType3'", "'CustomType4'", "'CustomType5'", "'CustomType6'", "'CustomType7'", "'CustomType8'", "'CustomType9'", "'CustomType10'", "'CustomType11'", "'CustomType12'", "'CustomType13'", "'CustomType14'", "'CustomType15'", "'CustomType16'", "'CustomType17'", "'CustomType18'", "'CustomType19'", "'CustomType20'", "'CustomType21'", "'CustomType22'", "'CustomType23'", "'CustomType24'", "'CustomType25'", "'CustomType26'", "'CustomType27'", "'CustomType28'", "'CustomType29'", "'CustomType30'", "'CustomType31'", "'CustomType32'", "'CustomType33'", "'CustomType34'", "'CustomType35'", "'CustomType36'", "'CustomType37'", "'CustomType38'", "'CustomType39'", "'Global'", "'{'", "'System name'", "'='", "';'", "'}'", "'Interfaces'", "'InterfaceGroups'", "'Compartment'", "'Manufacturer'", "'PowerSupply'", "'Side'", "'Zone'", "'Generic properties'", "'RDC'", "'Type'", "'ESS'", "'Connector'", "'interface with type'", "'Group'", "','", "'Interface'", "'InterfaceSystem'", "'SubAta'", "'Resource'", "'LineName'", "'WiringLane'", "'GrpInfo'", "'Route'", "'PwSup1'", "'EmhZone1'"
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
    public String getGrammarFileName() { return "../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g"; }


     
     	private MappingDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MappingDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleAssistModel"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:60:1: entryRuleAssistModel : ruleAssistModel EOF ;
    public final void entryRuleAssistModel() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:61:1: ( ruleAssistModel EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:62:1: ruleAssistModel EOF
            {
             before(grammarAccess.getAssistModelRule()); 
            pushFollow(FOLLOW_ruleAssistModel_in_entryRuleAssistModel61);
            ruleAssistModel();

            state._fsp--;

             after(grammarAccess.getAssistModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssistModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssistModel"


    // $ANTLR start "ruleAssistModel"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:69:1: ruleAssistModel : ( ( rule__AssistModel__Group__0 ) ) ;
    public final void ruleAssistModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:73:2: ( ( ( rule__AssistModel__Group__0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:74:1: ( ( rule__AssistModel__Group__0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:74:1: ( ( rule__AssistModel__Group__0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:75:1: ( rule__AssistModel__Group__0 )
            {
             before(grammarAccess.getAssistModelAccess().getGroup()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:76:1: ( rule__AssistModel__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:76:2: rule__AssistModel__Group__0
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__0_in_ruleAssistModel94);
            rule__AssistModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssistModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssistModel"


    // $ANTLR start "entryRuleCompartment"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:88:1: entryRuleCompartment : ruleCompartment EOF ;
    public final void entryRuleCompartment() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:89:1: ( ruleCompartment EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:90:1: ruleCompartment EOF
            {
             before(grammarAccess.getCompartmentRule()); 
            pushFollow(FOLLOW_ruleCompartment_in_entryRuleCompartment121);
            ruleCompartment();

            state._fsp--;

             after(grammarAccess.getCompartmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartment128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompartment"


    // $ANTLR start "ruleCompartment"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:97:1: ruleCompartment : ( ( rule__Compartment__Group__0 ) ) ;
    public final void ruleCompartment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:101:2: ( ( ( rule__Compartment__Group__0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:102:1: ( ( rule__Compartment__Group__0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:102:1: ( ( rule__Compartment__Group__0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:103:1: ( rule__Compartment__Group__0 )
            {
             before(grammarAccess.getCompartmentAccess().getGroup()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:104:1: ( rule__Compartment__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:104:2: rule__Compartment__Group__0
            {
            pushFollow(FOLLOW_rule__Compartment__Group__0_in_ruleCompartment154);
            rule__Compartment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompartmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompartment"


    // $ANTLR start "entryRuleRDC"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:116:1: entryRuleRDC : ruleRDC EOF ;
    public final void entryRuleRDC() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:117:1: ( ruleRDC EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:118:1: ruleRDC EOF
            {
             before(grammarAccess.getRDCRule()); 
            pushFollow(FOLLOW_ruleRDC_in_entryRuleRDC181);
            ruleRDC();

            state._fsp--;

             after(grammarAccess.getRDCRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDC188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRDC"


    // $ANTLR start "ruleRDC"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:125:1: ruleRDC : ( ( rule__RDC__Group__0 ) ) ;
    public final void ruleRDC() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:129:2: ( ( ( rule__RDC__Group__0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:130:1: ( ( rule__RDC__Group__0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:130:1: ( ( rule__RDC__Group__0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:131:1: ( rule__RDC__Group__0 )
            {
             before(grammarAccess.getRDCAccess().getGroup()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:132:1: ( rule__RDC__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:132:2: rule__RDC__Group__0
            {
            pushFollow(FOLLOW_rule__RDC__Group__0_in_ruleRDC214);
            rule__RDC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRDCAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRDC"


    // $ANTLR start "entryRuleConnector"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:144:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:145:1: ( ruleConnector EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:146:1: ruleConnector EOF
            {
             before(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector241);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConnectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:153:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:157:2: ( ( ( rule__Connector__Group__0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:158:1: ( ( rule__Connector__Group__0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:158:1: ( ( rule__Connector__Group__0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:159:1: ( rule__Connector__Group__0 )
            {
             before(grammarAccess.getConnectorAccess().getGroup()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:160:1: ( rule__Connector__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:160:2: rule__Connector__Group__0
            {
            pushFollow(FOLLOW_rule__Connector__Group__0_in_ruleConnector274);
            rule__Connector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleAvailableEqInterface"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:172:1: entryRuleAvailableEqInterface : ruleAvailableEqInterface EOF ;
    public final void entryRuleAvailableEqInterface() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:173:1: ( ruleAvailableEqInterface EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:174:1: ruleAvailableEqInterface EOF
            {
             before(grammarAccess.getAvailableEqInterfaceRule()); 
            pushFollow(FOLLOW_ruleAvailableEqInterface_in_entryRuleAvailableEqInterface301);
            ruleAvailableEqInterface();

            state._fsp--;

             after(grammarAccess.getAvailableEqInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvailableEqInterface308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAvailableEqInterface"


    // $ANTLR start "ruleAvailableEqInterface"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:181:1: ruleAvailableEqInterface : ( ( rule__AvailableEqInterface__Group__0 ) ) ;
    public final void ruleAvailableEqInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:185:2: ( ( ( rule__AvailableEqInterface__Group__0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:186:1: ( ( rule__AvailableEqInterface__Group__0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:186:1: ( ( rule__AvailableEqInterface__Group__0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:187:1: ( rule__AvailableEqInterface__Group__0 )
            {
             before(grammarAccess.getAvailableEqInterfaceAccess().getGroup()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:188:1: ( rule__AvailableEqInterface__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:188:2: rule__AvailableEqInterface__Group__0
            {
            pushFollow(FOLLOW_rule__AvailableEqInterface__Group__0_in_ruleAvailableEqInterface334);
            rule__AvailableEqInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAvailableEqInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAvailableEqInterface"


    // $ANTLR start "entryRuleEqInterfaceGroup"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:200:1: entryRuleEqInterfaceGroup : ruleEqInterfaceGroup EOF ;
    public final void entryRuleEqInterfaceGroup() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:201:1: ( ruleEqInterfaceGroup EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:202:1: ruleEqInterfaceGroup EOF
            {
             before(grammarAccess.getEqInterfaceGroupRule()); 
            pushFollow(FOLLOW_ruleEqInterfaceGroup_in_entryRuleEqInterfaceGroup361);
            ruleEqInterfaceGroup();

            state._fsp--;

             after(grammarAccess.getEqInterfaceGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterfaceGroup368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqInterfaceGroup"


    // $ANTLR start "ruleEqInterfaceGroup"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:209:1: ruleEqInterfaceGroup : ( ( rule__EqInterfaceGroup__Group__0 ) ) ;
    public final void ruleEqInterfaceGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:213:2: ( ( ( rule__EqInterfaceGroup__Group__0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:214:1: ( ( rule__EqInterfaceGroup__Group__0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:214:1: ( ( rule__EqInterfaceGroup__Group__0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:215:1: ( rule__EqInterfaceGroup__Group__0 )
            {
             before(grammarAccess.getEqInterfaceGroupAccess().getGroup()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:216:1: ( rule__EqInterfaceGroup__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:216:2: rule__EqInterfaceGroup__Group__0
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__0_in_ruleEqInterfaceGroup394);
            rule__EqInterfaceGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqInterfaceGroup"


    // $ANTLR start "entryRuleEqInterface"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:228:1: entryRuleEqInterface : ruleEqInterface EOF ;
    public final void entryRuleEqInterface() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:229:1: ( ruleEqInterface EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:230:1: ruleEqInterface EOF
            {
             before(grammarAccess.getEqInterfaceRule()); 
            pushFollow(FOLLOW_ruleEqInterface_in_entryRuleEqInterface421);
            ruleEqInterface();

            state._fsp--;

             after(grammarAccess.getEqInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterface428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqInterface"


    // $ANTLR start "ruleEqInterface"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:237:1: ruleEqInterface : ( ( rule__EqInterface__Group__0 ) ) ;
    public final void ruleEqInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:241:2: ( ( ( rule__EqInterface__Group__0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:242:1: ( ( rule__EqInterface__Group__0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:242:1: ( ( rule__EqInterface__Group__0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:243:1: ( rule__EqInterface__Group__0 )
            {
             before(grammarAccess.getEqInterfaceAccess().getGroup()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:244:1: ( rule__EqInterface__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:244:2: rule__EqInterface__Group__0
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__0_in_ruleEqInterface454);
            rule__EqInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqInterface"


    // $ANTLR start "entryRuleMetricParameter"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:256:1: entryRuleMetricParameter : ruleMetricParameter EOF ;
    public final void entryRuleMetricParameter() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:257:1: ( ruleMetricParameter EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:258:1: ruleMetricParameter EOF
            {
             before(grammarAccess.getMetricParameterRule()); 
            pushFollow(FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter481);
            ruleMetricParameter();

            state._fsp--;

             after(grammarAccess.getMetricParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricParameter488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetricParameter"


    // $ANTLR start "ruleMetricParameter"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:265:1: ruleMetricParameter : ( ( rule__MetricParameter__Group__0 ) ) ;
    public final void ruleMetricParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:269:2: ( ( ( rule__MetricParameter__Group__0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:270:1: ( ( rule__MetricParameter__Group__0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:270:1: ( ( rule__MetricParameter__Group__0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:271:1: ( rule__MetricParameter__Group__0 )
            {
             before(grammarAccess.getMetricParameterAccess().getGroup()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:272:1: ( rule__MetricParameter__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:272:2: rule__MetricParameter__Group__0
            {
            pushFollow(FOLLOW_rule__MetricParameter__Group__0_in_ruleMetricParameter514);
            rule__MetricParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetricParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetricParameter"


    // $ANTLR start "ruleEqInterfaceType"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:287:1: ruleEqInterfaceType : ( ( rule__EqInterfaceType__Alternatives ) ) ;
    public final void ruleEqInterfaceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:291:1: ( ( ( rule__EqInterfaceType__Alternatives ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:292:1: ( ( rule__EqInterfaceType__Alternatives ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:292:1: ( ( rule__EqInterfaceType__Alternatives ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:293:1: ( rule__EqInterfaceType__Alternatives )
            {
             before(grammarAccess.getEqInterfaceTypeAccess().getAlternatives()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:294:1: ( rule__EqInterfaceType__Alternatives )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:294:2: rule__EqInterfaceType__Alternatives
            {
            pushFollow(FOLLOW_rule__EqInterfaceType__Alternatives_in_ruleEqInterfaceType553);
            rule__EqInterfaceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqInterfaceType"


    // $ANTLR start "rule__EqInterfaceType__Alternatives"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:305:1: rule__EqInterfaceType__Alternatives : ( ( ( 'Can' ) ) | ( ( 'Enhanced Local Bus' ) ) | ( ( 'Ethernet' ) ) | ( ( 'Analog' ) ) | ( ( 'Digital' ) ) | ( ( 'Serial' ) ) | ( ( 'CustomType0' ) ) | ( ( 'CustomType1' ) ) | ( ( 'CustomType2' ) ) | ( ( 'CustomType3' ) ) | ( ( 'CustomType4' ) ) | ( ( 'CustomType5' ) ) | ( ( 'CustomType6' ) ) | ( ( 'CustomType7' ) ) | ( ( 'CustomType8' ) ) | ( ( 'CustomType9' ) ) | ( ( 'CustomType10' ) ) | ( ( 'CustomType11' ) ) | ( ( 'CustomType12' ) ) | ( ( 'CustomType13' ) ) | ( ( 'CustomType14' ) ) | ( ( 'CustomType15' ) ) | ( ( 'CustomType16' ) ) | ( ( 'CustomType17' ) ) | ( ( 'CustomType18' ) ) | ( ( 'CustomType19' ) ) | ( ( 'CustomType20' ) ) | ( ( 'CustomType21' ) ) | ( ( 'CustomType22' ) ) | ( ( 'CustomType23' ) ) | ( ( 'CustomType24' ) ) | ( ( 'CustomType25' ) ) | ( ( 'CustomType26' ) ) | ( ( 'CustomType27' ) ) | ( ( 'CustomType28' ) ) | ( ( 'CustomType29' ) ) | ( ( 'CustomType30' ) ) | ( ( 'CustomType31' ) ) | ( ( 'CustomType32' ) ) | ( ( 'CustomType33' ) ) | ( ( 'CustomType34' ) ) | ( ( 'CustomType35' ) ) | ( ( 'CustomType36' ) ) | ( ( 'CustomType37' ) ) | ( ( 'CustomType38' ) ) | ( ( 'CustomType39' ) ) );
    public final void rule__EqInterfaceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:309:1: ( ( ( 'Can' ) ) | ( ( 'Enhanced Local Bus' ) ) | ( ( 'Ethernet' ) ) | ( ( 'Analog' ) ) | ( ( 'Digital' ) ) | ( ( 'Serial' ) ) | ( ( 'CustomType0' ) ) | ( ( 'CustomType1' ) ) | ( ( 'CustomType2' ) ) | ( ( 'CustomType3' ) ) | ( ( 'CustomType4' ) ) | ( ( 'CustomType5' ) ) | ( ( 'CustomType6' ) ) | ( ( 'CustomType7' ) ) | ( ( 'CustomType8' ) ) | ( ( 'CustomType9' ) ) | ( ( 'CustomType10' ) ) | ( ( 'CustomType11' ) ) | ( ( 'CustomType12' ) ) | ( ( 'CustomType13' ) ) | ( ( 'CustomType14' ) ) | ( ( 'CustomType15' ) ) | ( ( 'CustomType16' ) ) | ( ( 'CustomType17' ) ) | ( ( 'CustomType18' ) ) | ( ( 'CustomType19' ) ) | ( ( 'CustomType20' ) ) | ( ( 'CustomType21' ) ) | ( ( 'CustomType22' ) ) | ( ( 'CustomType23' ) ) | ( ( 'CustomType24' ) ) | ( ( 'CustomType25' ) ) | ( ( 'CustomType26' ) ) | ( ( 'CustomType27' ) ) | ( ( 'CustomType28' ) ) | ( ( 'CustomType29' ) ) | ( ( 'CustomType30' ) ) | ( ( 'CustomType31' ) ) | ( ( 'CustomType32' ) ) | ( ( 'CustomType33' ) ) | ( ( 'CustomType34' ) ) | ( ( 'CustomType35' ) ) | ( ( 'CustomType36' ) ) | ( ( 'CustomType37' ) ) | ( ( 'CustomType38' ) ) | ( ( 'CustomType39' ) ) )
            int alt1=46;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            case 16:
                {
                alt1=6;
                }
                break;
            case 17:
                {
                alt1=7;
                }
                break;
            case 18:
                {
                alt1=8;
                }
                break;
            case 19:
                {
                alt1=9;
                }
                break;
            case 20:
                {
                alt1=10;
                }
                break;
            case 21:
                {
                alt1=11;
                }
                break;
            case 22:
                {
                alt1=12;
                }
                break;
            case 23:
                {
                alt1=13;
                }
                break;
            case 24:
                {
                alt1=14;
                }
                break;
            case 25:
                {
                alt1=15;
                }
                break;
            case 26:
                {
                alt1=16;
                }
                break;
            case 27:
                {
                alt1=17;
                }
                break;
            case 28:
                {
                alt1=18;
                }
                break;
            case 29:
                {
                alt1=19;
                }
                break;
            case 30:
                {
                alt1=20;
                }
                break;
            case 31:
                {
                alt1=21;
                }
                break;
            case 32:
                {
                alt1=22;
                }
                break;
            case 33:
                {
                alt1=23;
                }
                break;
            case 34:
                {
                alt1=24;
                }
                break;
            case 35:
                {
                alt1=25;
                }
                break;
            case 36:
                {
                alt1=26;
                }
                break;
            case 37:
                {
                alt1=27;
                }
                break;
            case 38:
                {
                alt1=28;
                }
                break;
            case 39:
                {
                alt1=29;
                }
                break;
            case 40:
                {
                alt1=30;
                }
                break;
            case 41:
                {
                alt1=31;
                }
                break;
            case 42:
                {
                alt1=32;
                }
                break;
            case 43:
                {
                alt1=33;
                }
                break;
            case 44:
                {
                alt1=34;
                }
                break;
            case 45:
                {
                alt1=35;
                }
                break;
            case 46:
                {
                alt1=36;
                }
                break;
            case 47:
                {
                alt1=37;
                }
                break;
            case 48:
                {
                alt1=38;
                }
                break;
            case 49:
                {
                alt1=39;
                }
                break;
            case 50:
                {
                alt1=40;
                }
                break;
            case 51:
                {
                alt1=41;
                }
                break;
            case 52:
                {
                alt1=42;
                }
                break;
            case 53:
                {
                alt1=43;
                }
                break;
            case 54:
                {
                alt1=44;
                }
                break;
            case 55:
                {
                alt1=45;
                }
                break;
            case 56:
                {
                alt1=46;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:310:1: ( ( 'Can' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:310:1: ( ( 'Can' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:311:1: ( 'Can' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCANEnumLiteralDeclaration_0()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:312:1: ( 'Can' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:312:3: 'Can'
                    {
                    match(input,11,FOLLOW_11_in_rule__EqInterfaceType__Alternatives589); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:317:6: ( ( 'Enhanced Local Bus' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:317:6: ( ( 'Enhanced Local Bus' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:318:1: ( 'Enhanced Local Bus' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getELBEnumLiteralDeclaration_1()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:319:1: ( 'Enhanced Local Bus' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:319:3: 'Enhanced Local Bus'
                    {
                    match(input,12,FOLLOW_12_in_rule__EqInterfaceType__Alternatives610); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getELBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:324:6: ( ( 'Ethernet' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:324:6: ( ( 'Ethernet' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:325:1: ( 'Ethernet' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getETHEnumLiteralDeclaration_2()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:326:1: ( 'Ethernet' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:326:3: 'Ethernet'
                    {
                    match(input,13,FOLLOW_13_in_rule__EqInterfaceType__Alternatives631); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getETHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:331:6: ( ( 'Analog' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:331:6: ( ( 'Analog' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:332:1: ( 'Analog' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getANALOGEnumLiteralDeclaration_3()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:333:1: ( 'Analog' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:333:3: 'Analog'
                    {
                    match(input,14,FOLLOW_14_in_rule__EqInterfaceType__Alternatives652); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getANALOGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:338:6: ( ( 'Digital' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:338:6: ( ( 'Digital' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:339:1: ( 'Digital' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getDIGITALEnumLiteralDeclaration_4()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:340:1: ( 'Digital' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:340:3: 'Digital'
                    {
                    match(input,15,FOLLOW_15_in_rule__EqInterfaceType__Alternatives673); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getDIGITALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:345:6: ( ( 'Serial' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:345:6: ( ( 'Serial' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:346:1: ( 'Serial' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getSERIALEnumLiteralDeclaration_5()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:347:1: ( 'Serial' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:347:3: 'Serial'
                    {
                    match(input,16,FOLLOW_16_in_rule__EqInterfaceType__Alternatives694); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getSERIALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:352:6: ( ( 'CustomType0' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:352:6: ( ( 'CustomType0' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:353:1: ( 'CustomType0' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM0EnumLiteralDeclaration_6()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:354:1: ( 'CustomType0' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:354:3: 'CustomType0'
                    {
                    match(input,17,FOLLOW_17_in_rule__EqInterfaceType__Alternatives715); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM0EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:359:6: ( ( 'CustomType1' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:359:6: ( ( 'CustomType1' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:360:1: ( 'CustomType1' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM1EnumLiteralDeclaration_7()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:361:1: ( 'CustomType1' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:361:3: 'CustomType1'
                    {
                    match(input,18,FOLLOW_18_in_rule__EqInterfaceType__Alternatives736); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM1EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:366:6: ( ( 'CustomType2' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:366:6: ( ( 'CustomType2' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:367:1: ( 'CustomType2' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM2EnumLiteralDeclaration_8()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:368:1: ( 'CustomType2' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:368:3: 'CustomType2'
                    {
                    match(input,19,FOLLOW_19_in_rule__EqInterfaceType__Alternatives757); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM2EnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:373:6: ( ( 'CustomType3' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:373:6: ( ( 'CustomType3' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:374:1: ( 'CustomType3' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM3EnumLiteralDeclaration_9()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:375:1: ( 'CustomType3' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:375:3: 'CustomType3'
                    {
                    match(input,20,FOLLOW_20_in_rule__EqInterfaceType__Alternatives778); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM3EnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:380:6: ( ( 'CustomType4' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:380:6: ( ( 'CustomType4' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:381:1: ( 'CustomType4' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM4EnumLiteralDeclaration_10()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:382:1: ( 'CustomType4' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:382:3: 'CustomType4'
                    {
                    match(input,21,FOLLOW_21_in_rule__EqInterfaceType__Alternatives799); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM4EnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:387:6: ( ( 'CustomType5' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:387:6: ( ( 'CustomType5' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:388:1: ( 'CustomType5' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM5EnumLiteralDeclaration_11()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:389:1: ( 'CustomType5' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:389:3: 'CustomType5'
                    {
                    match(input,22,FOLLOW_22_in_rule__EqInterfaceType__Alternatives820); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM5EnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:394:6: ( ( 'CustomType6' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:394:6: ( ( 'CustomType6' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:395:1: ( 'CustomType6' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM6EnumLiteralDeclaration_12()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:396:1: ( 'CustomType6' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:396:3: 'CustomType6'
                    {
                    match(input,23,FOLLOW_23_in_rule__EqInterfaceType__Alternatives841); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM6EnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:401:6: ( ( 'CustomType7' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:401:6: ( ( 'CustomType7' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:402:1: ( 'CustomType7' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM7EnumLiteralDeclaration_13()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:403:1: ( 'CustomType7' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:403:3: 'CustomType7'
                    {
                    match(input,24,FOLLOW_24_in_rule__EqInterfaceType__Alternatives862); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM7EnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:408:6: ( ( 'CustomType8' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:408:6: ( ( 'CustomType8' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:409:1: ( 'CustomType8' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM8EnumLiteralDeclaration_14()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:410:1: ( 'CustomType8' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:410:3: 'CustomType8'
                    {
                    match(input,25,FOLLOW_25_in_rule__EqInterfaceType__Alternatives883); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM8EnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:415:6: ( ( 'CustomType9' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:415:6: ( ( 'CustomType9' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:416:1: ( 'CustomType9' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM9EnumLiteralDeclaration_15()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:417:1: ( 'CustomType9' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:417:3: 'CustomType9'
                    {
                    match(input,26,FOLLOW_26_in_rule__EqInterfaceType__Alternatives904); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM9EnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:422:6: ( ( 'CustomType10' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:422:6: ( ( 'CustomType10' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:423:1: ( 'CustomType10' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM10EnumLiteralDeclaration_16()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:424:1: ( 'CustomType10' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:424:3: 'CustomType10'
                    {
                    match(input,27,FOLLOW_27_in_rule__EqInterfaceType__Alternatives925); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM10EnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:429:6: ( ( 'CustomType11' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:429:6: ( ( 'CustomType11' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:430:1: ( 'CustomType11' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM11EnumLiteralDeclaration_17()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:431:1: ( 'CustomType11' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:431:3: 'CustomType11'
                    {
                    match(input,28,FOLLOW_28_in_rule__EqInterfaceType__Alternatives946); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM11EnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:436:6: ( ( 'CustomType12' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:436:6: ( ( 'CustomType12' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:437:1: ( 'CustomType12' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM12EnumLiteralDeclaration_18()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:438:1: ( 'CustomType12' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:438:3: 'CustomType12'
                    {
                    match(input,29,FOLLOW_29_in_rule__EqInterfaceType__Alternatives967); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM12EnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:443:6: ( ( 'CustomType13' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:443:6: ( ( 'CustomType13' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:444:1: ( 'CustomType13' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM13EnumLiteralDeclaration_19()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:445:1: ( 'CustomType13' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:445:3: 'CustomType13'
                    {
                    match(input,30,FOLLOW_30_in_rule__EqInterfaceType__Alternatives988); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM13EnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:450:6: ( ( 'CustomType14' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:450:6: ( ( 'CustomType14' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:451:1: ( 'CustomType14' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM14EnumLiteralDeclaration_20()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:452:1: ( 'CustomType14' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:452:3: 'CustomType14'
                    {
                    match(input,31,FOLLOW_31_in_rule__EqInterfaceType__Alternatives1009); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM14EnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:457:6: ( ( 'CustomType15' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:457:6: ( ( 'CustomType15' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:458:1: ( 'CustomType15' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM15EnumLiteralDeclaration_21()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:459:1: ( 'CustomType15' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:459:3: 'CustomType15'
                    {
                    match(input,32,FOLLOW_32_in_rule__EqInterfaceType__Alternatives1030); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM15EnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:464:6: ( ( 'CustomType16' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:464:6: ( ( 'CustomType16' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:465:1: ( 'CustomType16' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM16EnumLiteralDeclaration_22()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:466:1: ( 'CustomType16' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:466:3: 'CustomType16'
                    {
                    match(input,33,FOLLOW_33_in_rule__EqInterfaceType__Alternatives1051); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM16EnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:471:6: ( ( 'CustomType17' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:471:6: ( ( 'CustomType17' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:472:1: ( 'CustomType17' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM17EnumLiteralDeclaration_23()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:473:1: ( 'CustomType17' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:473:3: 'CustomType17'
                    {
                    match(input,34,FOLLOW_34_in_rule__EqInterfaceType__Alternatives1072); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM17EnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:478:6: ( ( 'CustomType18' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:478:6: ( ( 'CustomType18' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:479:1: ( 'CustomType18' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM18EnumLiteralDeclaration_24()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:480:1: ( 'CustomType18' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:480:3: 'CustomType18'
                    {
                    match(input,35,FOLLOW_35_in_rule__EqInterfaceType__Alternatives1093); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM18EnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:485:6: ( ( 'CustomType19' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:485:6: ( ( 'CustomType19' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:486:1: ( 'CustomType19' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM19EnumLiteralDeclaration_25()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:487:1: ( 'CustomType19' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:487:3: 'CustomType19'
                    {
                    match(input,36,FOLLOW_36_in_rule__EqInterfaceType__Alternatives1114); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM19EnumLiteralDeclaration_25()); 

                    }


                    }
                    break;
                case 27 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:492:6: ( ( 'CustomType20' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:492:6: ( ( 'CustomType20' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:493:1: ( 'CustomType20' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM20EnumLiteralDeclaration_26()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:494:1: ( 'CustomType20' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:494:3: 'CustomType20'
                    {
                    match(input,37,FOLLOW_37_in_rule__EqInterfaceType__Alternatives1135); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM20EnumLiteralDeclaration_26()); 

                    }


                    }
                    break;
                case 28 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:499:6: ( ( 'CustomType21' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:499:6: ( ( 'CustomType21' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:500:1: ( 'CustomType21' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM21EnumLiteralDeclaration_27()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:501:1: ( 'CustomType21' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:501:3: 'CustomType21'
                    {
                    match(input,38,FOLLOW_38_in_rule__EqInterfaceType__Alternatives1156); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM21EnumLiteralDeclaration_27()); 

                    }


                    }
                    break;
                case 29 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:506:6: ( ( 'CustomType22' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:506:6: ( ( 'CustomType22' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:507:1: ( 'CustomType22' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM22EnumLiteralDeclaration_28()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:508:1: ( 'CustomType22' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:508:3: 'CustomType22'
                    {
                    match(input,39,FOLLOW_39_in_rule__EqInterfaceType__Alternatives1177); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM22EnumLiteralDeclaration_28()); 

                    }


                    }
                    break;
                case 30 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:513:6: ( ( 'CustomType23' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:513:6: ( ( 'CustomType23' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:514:1: ( 'CustomType23' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM23EnumLiteralDeclaration_29()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:515:1: ( 'CustomType23' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:515:3: 'CustomType23'
                    {
                    match(input,40,FOLLOW_40_in_rule__EqInterfaceType__Alternatives1198); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM23EnumLiteralDeclaration_29()); 

                    }


                    }
                    break;
                case 31 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:520:6: ( ( 'CustomType24' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:520:6: ( ( 'CustomType24' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:521:1: ( 'CustomType24' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM24EnumLiteralDeclaration_30()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:522:1: ( 'CustomType24' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:522:3: 'CustomType24'
                    {
                    match(input,41,FOLLOW_41_in_rule__EqInterfaceType__Alternatives1219); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM24EnumLiteralDeclaration_30()); 

                    }


                    }
                    break;
                case 32 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:527:6: ( ( 'CustomType25' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:527:6: ( ( 'CustomType25' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:528:1: ( 'CustomType25' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM25EnumLiteralDeclaration_31()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:529:1: ( 'CustomType25' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:529:3: 'CustomType25'
                    {
                    match(input,42,FOLLOW_42_in_rule__EqInterfaceType__Alternatives1240); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM25EnumLiteralDeclaration_31()); 

                    }


                    }
                    break;
                case 33 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:534:6: ( ( 'CustomType26' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:534:6: ( ( 'CustomType26' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:535:1: ( 'CustomType26' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM26EnumLiteralDeclaration_32()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:536:1: ( 'CustomType26' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:536:3: 'CustomType26'
                    {
                    match(input,43,FOLLOW_43_in_rule__EqInterfaceType__Alternatives1261); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM26EnumLiteralDeclaration_32()); 

                    }


                    }
                    break;
                case 34 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:541:6: ( ( 'CustomType27' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:541:6: ( ( 'CustomType27' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:542:1: ( 'CustomType27' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM27EnumLiteralDeclaration_33()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:543:1: ( 'CustomType27' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:543:3: 'CustomType27'
                    {
                    match(input,44,FOLLOW_44_in_rule__EqInterfaceType__Alternatives1282); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM27EnumLiteralDeclaration_33()); 

                    }


                    }
                    break;
                case 35 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:548:6: ( ( 'CustomType28' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:548:6: ( ( 'CustomType28' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:549:1: ( 'CustomType28' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM28EnumLiteralDeclaration_34()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:550:1: ( 'CustomType28' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:550:3: 'CustomType28'
                    {
                    match(input,45,FOLLOW_45_in_rule__EqInterfaceType__Alternatives1303); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM28EnumLiteralDeclaration_34()); 

                    }


                    }
                    break;
                case 36 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:555:6: ( ( 'CustomType29' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:555:6: ( ( 'CustomType29' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:556:1: ( 'CustomType29' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM29EnumLiteralDeclaration_35()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:557:1: ( 'CustomType29' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:557:3: 'CustomType29'
                    {
                    match(input,46,FOLLOW_46_in_rule__EqInterfaceType__Alternatives1324); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM29EnumLiteralDeclaration_35()); 

                    }


                    }
                    break;
                case 37 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:562:6: ( ( 'CustomType30' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:562:6: ( ( 'CustomType30' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:563:1: ( 'CustomType30' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM30EnumLiteralDeclaration_36()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:564:1: ( 'CustomType30' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:564:3: 'CustomType30'
                    {
                    match(input,47,FOLLOW_47_in_rule__EqInterfaceType__Alternatives1345); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM30EnumLiteralDeclaration_36()); 

                    }


                    }
                    break;
                case 38 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:569:6: ( ( 'CustomType31' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:569:6: ( ( 'CustomType31' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:570:1: ( 'CustomType31' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM31EnumLiteralDeclaration_37()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:571:1: ( 'CustomType31' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:571:3: 'CustomType31'
                    {
                    match(input,48,FOLLOW_48_in_rule__EqInterfaceType__Alternatives1366); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM31EnumLiteralDeclaration_37()); 

                    }


                    }
                    break;
                case 39 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:576:6: ( ( 'CustomType32' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:576:6: ( ( 'CustomType32' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:577:1: ( 'CustomType32' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM32EnumLiteralDeclaration_38()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:578:1: ( 'CustomType32' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:578:3: 'CustomType32'
                    {
                    match(input,49,FOLLOW_49_in_rule__EqInterfaceType__Alternatives1387); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM32EnumLiteralDeclaration_38()); 

                    }


                    }
                    break;
                case 40 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:583:6: ( ( 'CustomType33' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:583:6: ( ( 'CustomType33' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:584:1: ( 'CustomType33' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM33EnumLiteralDeclaration_39()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:585:1: ( 'CustomType33' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:585:3: 'CustomType33'
                    {
                    match(input,50,FOLLOW_50_in_rule__EqInterfaceType__Alternatives1408); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM33EnumLiteralDeclaration_39()); 

                    }


                    }
                    break;
                case 41 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:590:6: ( ( 'CustomType34' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:590:6: ( ( 'CustomType34' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:591:1: ( 'CustomType34' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM34EnumLiteralDeclaration_40()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:592:1: ( 'CustomType34' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:592:3: 'CustomType34'
                    {
                    match(input,51,FOLLOW_51_in_rule__EqInterfaceType__Alternatives1429); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM34EnumLiteralDeclaration_40()); 

                    }


                    }
                    break;
                case 42 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:597:6: ( ( 'CustomType35' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:597:6: ( ( 'CustomType35' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:598:1: ( 'CustomType35' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM35EnumLiteralDeclaration_41()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:599:1: ( 'CustomType35' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:599:3: 'CustomType35'
                    {
                    match(input,52,FOLLOW_52_in_rule__EqInterfaceType__Alternatives1450); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM35EnumLiteralDeclaration_41()); 

                    }


                    }
                    break;
                case 43 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:604:6: ( ( 'CustomType36' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:604:6: ( ( 'CustomType36' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:605:1: ( 'CustomType36' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM36EnumLiteralDeclaration_42()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:606:1: ( 'CustomType36' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:606:3: 'CustomType36'
                    {
                    match(input,53,FOLLOW_53_in_rule__EqInterfaceType__Alternatives1471); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM36EnumLiteralDeclaration_42()); 

                    }


                    }
                    break;
                case 44 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:611:6: ( ( 'CustomType37' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:611:6: ( ( 'CustomType37' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:612:1: ( 'CustomType37' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM37EnumLiteralDeclaration_43()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:613:1: ( 'CustomType37' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:613:3: 'CustomType37'
                    {
                    match(input,54,FOLLOW_54_in_rule__EqInterfaceType__Alternatives1492); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM37EnumLiteralDeclaration_43()); 

                    }


                    }
                    break;
                case 45 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:618:6: ( ( 'CustomType38' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:618:6: ( ( 'CustomType38' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:619:1: ( 'CustomType38' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM38EnumLiteralDeclaration_44()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:620:1: ( 'CustomType38' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:620:3: 'CustomType38'
                    {
                    match(input,55,FOLLOW_55_in_rule__EqInterfaceType__Alternatives1513); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM38EnumLiteralDeclaration_44()); 

                    }


                    }
                    break;
                case 46 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:625:6: ( ( 'CustomType39' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:625:6: ( ( 'CustomType39' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:626:1: ( 'CustomType39' )
                    {
                     before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM39EnumLiteralDeclaration_45()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:627:1: ( 'CustomType39' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:627:3: 'CustomType39'
                    {
                    match(input,56,FOLLOW_56_in_rule__EqInterfaceType__Alternatives1534); 

                    }

                     after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM39EnumLiteralDeclaration_45()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceType__Alternatives"


    // $ANTLR start "rule__AssistModel__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:639:1: rule__AssistModel__Group__0 : rule__AssistModel__Group__0__Impl rule__AssistModel__Group__1 ;
    public final void rule__AssistModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:643:1: ( rule__AssistModel__Group__0__Impl rule__AssistModel__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:644:2: rule__AssistModel__Group__0__Impl rule__AssistModel__Group__1
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__0__Impl_in_rule__AssistModel__Group__01567);
            rule__AssistModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group__1_in_rule__AssistModel__Group__01570);
            rule__AssistModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__0"


    // $ANTLR start "rule__AssistModel__Group__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:651:1: rule__AssistModel__Group__0__Impl : ( 'Global' ) ;
    public final void rule__AssistModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:655:1: ( ( 'Global' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:656:1: ( 'Global' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:656:1: ( 'Global' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:657:1: 'Global'
            {
             before(grammarAccess.getAssistModelAccess().getGlobalKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__AssistModel__Group__0__Impl1598); 
             after(grammarAccess.getAssistModelAccess().getGlobalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__0__Impl"


    // $ANTLR start "rule__AssistModel__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:670:1: rule__AssistModel__Group__1 : rule__AssistModel__Group__1__Impl rule__AssistModel__Group__2 ;
    public final void rule__AssistModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:674:1: ( rule__AssistModel__Group__1__Impl rule__AssistModel__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:675:2: rule__AssistModel__Group__1__Impl rule__AssistModel__Group__2
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__1__Impl_in_rule__AssistModel__Group__11629);
            rule__AssistModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group__2_in_rule__AssistModel__Group__11632);
            rule__AssistModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__1"


    // $ANTLR start "rule__AssistModel__Group__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:682:1: rule__AssistModel__Group__1__Impl : ( '{' ) ;
    public final void rule__AssistModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:686:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:687:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:687:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:688:1: '{'
            {
             before(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,58,FOLLOW_58_in_rule__AssistModel__Group__1__Impl1660); 
             after(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__1__Impl"


    // $ANTLR start "rule__AssistModel__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:701:1: rule__AssistModel__Group__2 : rule__AssistModel__Group__2__Impl rule__AssistModel__Group__3 ;
    public final void rule__AssistModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:705:1: ( rule__AssistModel__Group__2__Impl rule__AssistModel__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:706:2: rule__AssistModel__Group__2__Impl rule__AssistModel__Group__3
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__2__Impl_in_rule__AssistModel__Group__21691);
            rule__AssistModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group__3_in_rule__AssistModel__Group__21694);
            rule__AssistModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__2"


    // $ANTLR start "rule__AssistModel__Group__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:713:1: rule__AssistModel__Group__2__Impl : ( 'System name' ) ;
    public final void rule__AssistModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:717:1: ( ( 'System name' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:718:1: ( 'System name' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:718:1: ( 'System name' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:719:1: 'System name'
            {
             before(grammarAccess.getAssistModelAccess().getSystemNameKeyword_2()); 
            match(input,59,FOLLOW_59_in_rule__AssistModel__Group__2__Impl1722); 
             after(grammarAccess.getAssistModelAccess().getSystemNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__2__Impl"


    // $ANTLR start "rule__AssistModel__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:732:1: rule__AssistModel__Group__3 : rule__AssistModel__Group__3__Impl rule__AssistModel__Group__4 ;
    public final void rule__AssistModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:736:1: ( rule__AssistModel__Group__3__Impl rule__AssistModel__Group__4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:737:2: rule__AssistModel__Group__3__Impl rule__AssistModel__Group__4
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__3__Impl_in_rule__AssistModel__Group__31753);
            rule__AssistModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group__4_in_rule__AssistModel__Group__31756);
            rule__AssistModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__3"


    // $ANTLR start "rule__AssistModel__Group__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:744:1: rule__AssistModel__Group__3__Impl : ( '=' ) ;
    public final void rule__AssistModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:748:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:749:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:749:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:750:1: '='
            {
             before(grammarAccess.getAssistModelAccess().getEqualsSignKeyword_3()); 
            match(input,60,FOLLOW_60_in_rule__AssistModel__Group__3__Impl1784); 
             after(grammarAccess.getAssistModelAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__3__Impl"


    // $ANTLR start "rule__AssistModel__Group__4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:763:1: rule__AssistModel__Group__4 : rule__AssistModel__Group__4__Impl rule__AssistModel__Group__5 ;
    public final void rule__AssistModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:767:1: ( rule__AssistModel__Group__4__Impl rule__AssistModel__Group__5 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:768:2: rule__AssistModel__Group__4__Impl rule__AssistModel__Group__5
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__4__Impl_in_rule__AssistModel__Group__41815);
            rule__AssistModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group__5_in_rule__AssistModel__Group__41818);
            rule__AssistModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__4"


    // $ANTLR start "rule__AssistModel__Group__4__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:775:1: rule__AssistModel__Group__4__Impl : ( ( rule__AssistModel__SystemNameAssignment_4 ) ) ;
    public final void rule__AssistModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:779:1: ( ( ( rule__AssistModel__SystemNameAssignment_4 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:780:1: ( ( rule__AssistModel__SystemNameAssignment_4 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:780:1: ( ( rule__AssistModel__SystemNameAssignment_4 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:781:1: ( rule__AssistModel__SystemNameAssignment_4 )
            {
             before(grammarAccess.getAssistModelAccess().getSystemNameAssignment_4()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:782:1: ( rule__AssistModel__SystemNameAssignment_4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:782:2: rule__AssistModel__SystemNameAssignment_4
            {
            pushFollow(FOLLOW_rule__AssistModel__SystemNameAssignment_4_in_rule__AssistModel__Group__4__Impl1845);
            rule__AssistModel__SystemNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssistModelAccess().getSystemNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__4__Impl"


    // $ANTLR start "rule__AssistModel__Group__5"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:792:1: rule__AssistModel__Group__5 : rule__AssistModel__Group__5__Impl rule__AssistModel__Group__6 ;
    public final void rule__AssistModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:796:1: ( rule__AssistModel__Group__5__Impl rule__AssistModel__Group__6 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:797:2: rule__AssistModel__Group__5__Impl rule__AssistModel__Group__6
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__5__Impl_in_rule__AssistModel__Group__51875);
            rule__AssistModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group__6_in_rule__AssistModel__Group__51878);
            rule__AssistModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__5"


    // $ANTLR start "rule__AssistModel__Group__5__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:804:1: rule__AssistModel__Group__5__Impl : ( ';' ) ;
    public final void rule__AssistModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:808:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:809:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:809:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:810:1: ';'
            {
             before(grammarAccess.getAssistModelAccess().getSemicolonKeyword_5()); 
            match(input,61,FOLLOW_61_in_rule__AssistModel__Group__5__Impl1906); 
             after(grammarAccess.getAssistModelAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__5__Impl"


    // $ANTLR start "rule__AssistModel__Group__6"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:823:1: rule__AssistModel__Group__6 : rule__AssistModel__Group__6__Impl rule__AssistModel__Group__7 ;
    public final void rule__AssistModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:827:1: ( rule__AssistModel__Group__6__Impl rule__AssistModel__Group__7 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:828:2: rule__AssistModel__Group__6__Impl rule__AssistModel__Group__7
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__6__Impl_in_rule__AssistModel__Group__61937);
            rule__AssistModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group__7_in_rule__AssistModel__Group__61940);
            rule__AssistModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__6"


    // $ANTLR start "rule__AssistModel__Group__6__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:835:1: rule__AssistModel__Group__6__Impl : ( '}' ) ;
    public final void rule__AssistModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:839:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:840:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:840:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:841:1: '}'
            {
             before(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,62,FOLLOW_62_in_rule__AssistModel__Group__6__Impl1968); 
             after(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__6__Impl"


    // $ANTLR start "rule__AssistModel__Group__7"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:854:1: rule__AssistModel__Group__7 : rule__AssistModel__Group__7__Impl rule__AssistModel__Group__8 ;
    public final void rule__AssistModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:858:1: ( rule__AssistModel__Group__7__Impl rule__AssistModel__Group__8 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:859:2: rule__AssistModel__Group__7__Impl rule__AssistModel__Group__8
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__7__Impl_in_rule__AssistModel__Group__71999);
            rule__AssistModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group__8_in_rule__AssistModel__Group__72002);
            rule__AssistModel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__7"


    // $ANTLR start "rule__AssistModel__Group__7__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:866:1: rule__AssistModel__Group__7__Impl : ( ( rule__AssistModel__CompartmentsAssignment_7 )? ) ;
    public final void rule__AssistModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:870:1: ( ( ( rule__AssistModel__CompartmentsAssignment_7 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:871:1: ( ( rule__AssistModel__CompartmentsAssignment_7 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:871:1: ( ( rule__AssistModel__CompartmentsAssignment_7 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:872:1: ( rule__AssistModel__CompartmentsAssignment_7 )?
            {
             before(grammarAccess.getAssistModelAccess().getCompartmentsAssignment_7()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:873:1: ( rule__AssistModel__CompartmentsAssignment_7 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==65) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:873:2: rule__AssistModel__CompartmentsAssignment_7
                    {
                    pushFollow(FOLLOW_rule__AssistModel__CompartmentsAssignment_7_in_rule__AssistModel__Group__7__Impl2029);
                    rule__AssistModel__CompartmentsAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssistModelAccess().getCompartmentsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__7__Impl"


    // $ANTLR start "rule__AssistModel__Group__8"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:883:1: rule__AssistModel__Group__8 : rule__AssistModel__Group__8__Impl rule__AssistModel__Group__9 ;
    public final void rule__AssistModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:887:1: ( rule__AssistModel__Group__8__Impl rule__AssistModel__Group__9 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:888:2: rule__AssistModel__Group__8__Impl rule__AssistModel__Group__9
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__8__Impl_in_rule__AssistModel__Group__82060);
            rule__AssistModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group__9_in_rule__AssistModel__Group__82063);
            rule__AssistModel__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__8"


    // $ANTLR start "rule__AssistModel__Group__8__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:895:1: rule__AssistModel__Group__8__Impl : ( ( rule__AssistModel__Group_8__0 )? ) ;
    public final void rule__AssistModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:899:1: ( ( ( rule__AssistModel__Group_8__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:900:1: ( ( rule__AssistModel__Group_8__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:900:1: ( ( rule__AssistModel__Group_8__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:901:1: ( rule__AssistModel__Group_8__0 )?
            {
             before(grammarAccess.getAssistModelAccess().getGroup_8()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:902:1: ( rule__AssistModel__Group_8__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==63) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:902:2: rule__AssistModel__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__AssistModel__Group_8__0_in_rule__AssistModel__Group__8__Impl2090);
                    rule__AssistModel__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssistModelAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__8__Impl"


    // $ANTLR start "rule__AssistModel__Group__9"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:912:1: rule__AssistModel__Group__9 : rule__AssistModel__Group__9__Impl ;
    public final void rule__AssistModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:916:1: ( rule__AssistModel__Group__9__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:917:2: rule__AssistModel__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__9__Impl_in_rule__AssistModel__Group__92121);
            rule__AssistModel__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__9"


    // $ANTLR start "rule__AssistModel__Group__9__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:923:1: rule__AssistModel__Group__9__Impl : ( ( rule__AssistModel__Group_9__0 )? ) ;
    public final void rule__AssistModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:927:1: ( ( ( rule__AssistModel__Group_9__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:928:1: ( ( rule__AssistModel__Group_9__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:928:1: ( ( rule__AssistModel__Group_9__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:929:1: ( rule__AssistModel__Group_9__0 )?
            {
             before(grammarAccess.getAssistModelAccess().getGroup_9()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:930:1: ( rule__AssistModel__Group_9__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==64) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:930:2: rule__AssistModel__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__AssistModel__Group_9__0_in_rule__AssistModel__Group__9__Impl2148);
                    rule__AssistModel__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssistModelAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__9__Impl"


    // $ANTLR start "rule__AssistModel__Group_8__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:960:1: rule__AssistModel__Group_8__0 : rule__AssistModel__Group_8__0__Impl rule__AssistModel__Group_8__1 ;
    public final void rule__AssistModel__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:964:1: ( rule__AssistModel__Group_8__0__Impl rule__AssistModel__Group_8__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:965:2: rule__AssistModel__Group_8__0__Impl rule__AssistModel__Group_8__1
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_8__0__Impl_in_rule__AssistModel__Group_8__02199);
            rule__AssistModel__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group_8__1_in_rule__AssistModel__Group_8__02202);
            rule__AssistModel__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_8__0"


    // $ANTLR start "rule__AssistModel__Group_8__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:972:1: rule__AssistModel__Group_8__0__Impl : ( 'Interfaces' ) ;
    public final void rule__AssistModel__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:976:1: ( ( 'Interfaces' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:977:1: ( 'Interfaces' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:977:1: ( 'Interfaces' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:978:1: 'Interfaces'
            {
             before(grammarAccess.getAssistModelAccess().getInterfacesKeyword_8_0()); 
            match(input,63,FOLLOW_63_in_rule__AssistModel__Group_8__0__Impl2230); 
             after(grammarAccess.getAssistModelAccess().getInterfacesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_8__0__Impl"


    // $ANTLR start "rule__AssistModel__Group_8__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:991:1: rule__AssistModel__Group_8__1 : rule__AssistModel__Group_8__1__Impl rule__AssistModel__Group_8__2 ;
    public final void rule__AssistModel__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:995:1: ( rule__AssistModel__Group_8__1__Impl rule__AssistModel__Group_8__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:996:2: rule__AssistModel__Group_8__1__Impl rule__AssistModel__Group_8__2
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_8__1__Impl_in_rule__AssistModel__Group_8__12261);
            rule__AssistModel__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group_8__2_in_rule__AssistModel__Group_8__12264);
            rule__AssistModel__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_8__1"


    // $ANTLR start "rule__AssistModel__Group_8__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1003:1: rule__AssistModel__Group_8__1__Impl : ( '{' ) ;
    public final void rule__AssistModel__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1007:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1008:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1008:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1009:1: '{'
            {
             before(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,58,FOLLOW_58_in_rule__AssistModel__Group_8__1__Impl2292); 
             after(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_8__1__Impl"


    // $ANTLR start "rule__AssistModel__Group_8__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1022:1: rule__AssistModel__Group_8__2 : rule__AssistModel__Group_8__2__Impl rule__AssistModel__Group_8__3 ;
    public final void rule__AssistModel__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1026:1: ( rule__AssistModel__Group_8__2__Impl rule__AssistModel__Group_8__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1027:2: rule__AssistModel__Group_8__2__Impl rule__AssistModel__Group_8__3
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_8__2__Impl_in_rule__AssistModel__Group_8__22323);
            rule__AssistModel__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group_8__3_in_rule__AssistModel__Group_8__22326);
            rule__AssistModel__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_8__2"


    // $ANTLR start "rule__AssistModel__Group_8__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1034:1: rule__AssistModel__Group_8__2__Impl : ( ( ( rule__AssistModel__EqInterfacesAssignment_8_2 ) ) ( ( rule__AssistModel__EqInterfacesAssignment_8_2 )* ) ) ;
    public final void rule__AssistModel__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1038:1: ( ( ( ( rule__AssistModel__EqInterfacesAssignment_8_2 ) ) ( ( rule__AssistModel__EqInterfacesAssignment_8_2 )* ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1039:1: ( ( ( rule__AssistModel__EqInterfacesAssignment_8_2 ) ) ( ( rule__AssistModel__EqInterfacesAssignment_8_2 )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1039:1: ( ( ( rule__AssistModel__EqInterfacesAssignment_8_2 ) ) ( ( rule__AssistModel__EqInterfacesAssignment_8_2 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1040:1: ( ( rule__AssistModel__EqInterfacesAssignment_8_2 ) ) ( ( rule__AssistModel__EqInterfacesAssignment_8_2 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1040:1: ( ( rule__AssistModel__EqInterfacesAssignment_8_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1041:1: ( rule__AssistModel__EqInterfacesAssignment_8_2 )
            {
             before(grammarAccess.getAssistModelAccess().getEqInterfacesAssignment_8_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1042:1: ( rule__AssistModel__EqInterfacesAssignment_8_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1042:2: rule__AssistModel__EqInterfacesAssignment_8_2
            {
            pushFollow(FOLLOW_rule__AssistModel__EqInterfacesAssignment_8_2_in_rule__AssistModel__Group_8__2__Impl2355);
            rule__AssistModel__EqInterfacesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getAssistModelAccess().getEqInterfacesAssignment_8_2()); 

            }

            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1045:1: ( ( rule__AssistModel__EqInterfacesAssignment_8_2 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1046:1: ( rule__AssistModel__EqInterfacesAssignment_8_2 )*
            {
             before(grammarAccess.getAssistModelAccess().getEqInterfacesAssignment_8_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1047:1: ( rule__AssistModel__EqInterfacesAssignment_8_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==78) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1047:2: rule__AssistModel__EqInterfacesAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__AssistModel__EqInterfacesAssignment_8_2_in_rule__AssistModel__Group_8__2__Impl2367);
            	    rule__AssistModel__EqInterfacesAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAssistModelAccess().getEqInterfacesAssignment_8_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_8__2__Impl"


    // $ANTLR start "rule__AssistModel__Group_8__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1058:1: rule__AssistModel__Group_8__3 : rule__AssistModel__Group_8__3__Impl ;
    public final void rule__AssistModel__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1062:1: ( rule__AssistModel__Group_8__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1063:2: rule__AssistModel__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_8__3__Impl_in_rule__AssistModel__Group_8__32400);
            rule__AssistModel__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_8__3"


    // $ANTLR start "rule__AssistModel__Group_8__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1069:1: rule__AssistModel__Group_8__3__Impl : ( '}' ) ;
    public final void rule__AssistModel__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1073:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1074:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1074:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1075:1: '}'
            {
             before(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_8_3()); 
            match(input,62,FOLLOW_62_in_rule__AssistModel__Group_8__3__Impl2428); 
             after(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_8__3__Impl"


    // $ANTLR start "rule__AssistModel__Group_9__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1096:1: rule__AssistModel__Group_9__0 : rule__AssistModel__Group_9__0__Impl rule__AssistModel__Group_9__1 ;
    public final void rule__AssistModel__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1100:1: ( rule__AssistModel__Group_9__0__Impl rule__AssistModel__Group_9__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1101:2: rule__AssistModel__Group_9__0__Impl rule__AssistModel__Group_9__1
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_9__0__Impl_in_rule__AssistModel__Group_9__02467);
            rule__AssistModel__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group_9__1_in_rule__AssistModel__Group_9__02470);
            rule__AssistModel__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_9__0"


    // $ANTLR start "rule__AssistModel__Group_9__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1108:1: rule__AssistModel__Group_9__0__Impl : ( 'InterfaceGroups' ) ;
    public final void rule__AssistModel__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1112:1: ( ( 'InterfaceGroups' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1113:1: ( 'InterfaceGroups' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1113:1: ( 'InterfaceGroups' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1114:1: 'InterfaceGroups'
            {
             before(grammarAccess.getAssistModelAccess().getInterfaceGroupsKeyword_9_0()); 
            match(input,64,FOLLOW_64_in_rule__AssistModel__Group_9__0__Impl2498); 
             after(grammarAccess.getAssistModelAccess().getInterfaceGroupsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_9__0__Impl"


    // $ANTLR start "rule__AssistModel__Group_9__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1127:1: rule__AssistModel__Group_9__1 : rule__AssistModel__Group_9__1__Impl rule__AssistModel__Group_9__2 ;
    public final void rule__AssistModel__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1131:1: ( rule__AssistModel__Group_9__1__Impl rule__AssistModel__Group_9__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1132:2: rule__AssistModel__Group_9__1__Impl rule__AssistModel__Group_9__2
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_9__1__Impl_in_rule__AssistModel__Group_9__12529);
            rule__AssistModel__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group_9__2_in_rule__AssistModel__Group_9__12532);
            rule__AssistModel__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_9__1"


    // $ANTLR start "rule__AssistModel__Group_9__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1139:1: rule__AssistModel__Group_9__1__Impl : ( '{' ) ;
    public final void rule__AssistModel__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1143:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1144:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1144:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1145:1: '{'
            {
             before(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,58,FOLLOW_58_in_rule__AssistModel__Group_9__1__Impl2560); 
             after(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_9__1__Impl"


    // $ANTLR start "rule__AssistModel__Group_9__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1158:1: rule__AssistModel__Group_9__2 : rule__AssistModel__Group_9__2__Impl rule__AssistModel__Group_9__3 ;
    public final void rule__AssistModel__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1162:1: ( rule__AssistModel__Group_9__2__Impl rule__AssistModel__Group_9__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1163:2: rule__AssistModel__Group_9__2__Impl rule__AssistModel__Group_9__3
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_9__2__Impl_in_rule__AssistModel__Group_9__22591);
            rule__AssistModel__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group_9__3_in_rule__AssistModel__Group_9__22594);
            rule__AssistModel__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_9__2"


    // $ANTLR start "rule__AssistModel__Group_9__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1170:1: rule__AssistModel__Group_9__2__Impl : ( ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 ) ) ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )* ) ) ;
    public final void rule__AssistModel__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1174:1: ( ( ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 ) ) ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )* ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1175:1: ( ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 ) ) ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1175:1: ( ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 ) ) ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1176:1: ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 ) ) ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1176:1: ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1177:1: ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )
            {
             before(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsAssignment_9_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1178:1: ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1178:2: rule__AssistModel__EqInterfaceGroupsAssignment_9_2
            {
            pushFollow(FOLLOW_rule__AssistModel__EqInterfaceGroupsAssignment_9_2_in_rule__AssistModel__Group_9__2__Impl2623);
            rule__AssistModel__EqInterfaceGroupsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsAssignment_9_2()); 

            }

            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1181:1: ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1182:1: ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )*
            {
             before(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsAssignment_9_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1183:1: ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==76) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1183:2: rule__AssistModel__EqInterfaceGroupsAssignment_9_2
            	    {
            	    pushFollow(FOLLOW_rule__AssistModel__EqInterfaceGroupsAssignment_9_2_in_rule__AssistModel__Group_9__2__Impl2635);
            	    rule__AssistModel__EqInterfaceGroupsAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsAssignment_9_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_9__2__Impl"


    // $ANTLR start "rule__AssistModel__Group_9__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1194:1: rule__AssistModel__Group_9__3 : rule__AssistModel__Group_9__3__Impl ;
    public final void rule__AssistModel__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1198:1: ( rule__AssistModel__Group_9__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1199:2: rule__AssistModel__Group_9__3__Impl
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_9__3__Impl_in_rule__AssistModel__Group_9__32668);
            rule__AssistModel__Group_9__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_9__3"


    // $ANTLR start "rule__AssistModel__Group_9__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1205:1: rule__AssistModel__Group_9__3__Impl : ( '}' ) ;
    public final void rule__AssistModel__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1209:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1210:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1210:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1211:1: '}'
            {
             before(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_9_3()); 
            match(input,62,FOLLOW_62_in_rule__AssistModel__Group_9__3__Impl2696); 
             after(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_9__3__Impl"


    // $ANTLR start "rule__Compartment__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1232:1: rule__Compartment__Group__0 : rule__Compartment__Group__0__Impl rule__Compartment__Group__1 ;
    public final void rule__Compartment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1236:1: ( rule__Compartment__Group__0__Impl rule__Compartment__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1237:2: rule__Compartment__Group__0__Impl rule__Compartment__Group__1
            {
            pushFollow(FOLLOW_rule__Compartment__Group__0__Impl_in_rule__Compartment__Group__02735);
            rule__Compartment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__1_in_rule__Compartment__Group__02738);
            rule__Compartment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__0"


    // $ANTLR start "rule__Compartment__Group__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1244:1: rule__Compartment__Group__0__Impl : ( 'Compartment' ) ;
    public final void rule__Compartment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1248:1: ( ( 'Compartment' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1249:1: ( 'Compartment' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1249:1: ( 'Compartment' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1250:1: 'Compartment'
            {
             before(grammarAccess.getCompartmentAccess().getCompartmentKeyword_0()); 
            match(input,65,FOLLOW_65_in_rule__Compartment__Group__0__Impl2766); 
             after(grammarAccess.getCompartmentAccess().getCompartmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__0__Impl"


    // $ANTLR start "rule__Compartment__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1263:1: rule__Compartment__Group__1 : rule__Compartment__Group__1__Impl rule__Compartment__Group__2 ;
    public final void rule__Compartment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1267:1: ( rule__Compartment__Group__1__Impl rule__Compartment__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1268:2: rule__Compartment__Group__1__Impl rule__Compartment__Group__2
            {
            pushFollow(FOLLOW_rule__Compartment__Group__1__Impl_in_rule__Compartment__Group__12797);
            rule__Compartment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__2_in_rule__Compartment__Group__12800);
            rule__Compartment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__1"


    // $ANTLR start "rule__Compartment__Group__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1275:1: rule__Compartment__Group__1__Impl : ( ( rule__Compartment__NameAssignment_1 ) ) ;
    public final void rule__Compartment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1279:1: ( ( ( rule__Compartment__NameAssignment_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1280:1: ( ( rule__Compartment__NameAssignment_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1280:1: ( ( rule__Compartment__NameAssignment_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1281:1: ( rule__Compartment__NameAssignment_1 )
            {
             before(grammarAccess.getCompartmentAccess().getNameAssignment_1()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1282:1: ( rule__Compartment__NameAssignment_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1282:2: rule__Compartment__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Compartment__NameAssignment_1_in_rule__Compartment__Group__1__Impl2827);
            rule__Compartment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompartmentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__1__Impl"


    // $ANTLR start "rule__Compartment__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1292:1: rule__Compartment__Group__2 : rule__Compartment__Group__2__Impl rule__Compartment__Group__3 ;
    public final void rule__Compartment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1296:1: ( rule__Compartment__Group__2__Impl rule__Compartment__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1297:2: rule__Compartment__Group__2__Impl rule__Compartment__Group__3
            {
            pushFollow(FOLLOW_rule__Compartment__Group__2__Impl_in_rule__Compartment__Group__22857);
            rule__Compartment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__3_in_rule__Compartment__Group__22860);
            rule__Compartment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__2"


    // $ANTLR start "rule__Compartment__Group__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1304:1: rule__Compartment__Group__2__Impl : ( '{' ) ;
    public final void rule__Compartment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1308:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1309:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1309:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1310:1: '{'
            {
             before(grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_58_in_rule__Compartment__Group__2__Impl2888); 
             after(grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__2__Impl"


    // $ANTLR start "rule__Compartment__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1323:1: rule__Compartment__Group__3 : rule__Compartment__Group__3__Impl rule__Compartment__Group__4 ;
    public final void rule__Compartment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1327:1: ( rule__Compartment__Group__3__Impl rule__Compartment__Group__4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1328:2: rule__Compartment__Group__3__Impl rule__Compartment__Group__4
            {
            pushFollow(FOLLOW_rule__Compartment__Group__3__Impl_in_rule__Compartment__Group__32919);
            rule__Compartment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__4_in_rule__Compartment__Group__32922);
            rule__Compartment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__3"


    // $ANTLR start "rule__Compartment__Group__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1335:1: rule__Compartment__Group__3__Impl : ( ( rule__Compartment__Group_3__0 )? ) ;
    public final void rule__Compartment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1339:1: ( ( ( rule__Compartment__Group_3__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1340:1: ( ( rule__Compartment__Group_3__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1340:1: ( ( rule__Compartment__Group_3__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1341:1: ( rule__Compartment__Group_3__0 )?
            {
             before(grammarAccess.getCompartmentAccess().getGroup_3()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1342:1: ( rule__Compartment__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==66) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1342:2: rule__Compartment__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Compartment__Group_3__0_in_rule__Compartment__Group__3__Impl2949);
                    rule__Compartment__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompartmentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__3__Impl"


    // $ANTLR start "rule__Compartment__Group__4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1352:1: rule__Compartment__Group__4 : rule__Compartment__Group__4__Impl rule__Compartment__Group__5 ;
    public final void rule__Compartment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1356:1: ( rule__Compartment__Group__4__Impl rule__Compartment__Group__5 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1357:2: rule__Compartment__Group__4__Impl rule__Compartment__Group__5
            {
            pushFollow(FOLLOW_rule__Compartment__Group__4__Impl_in_rule__Compartment__Group__42980);
            rule__Compartment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__5_in_rule__Compartment__Group__42983);
            rule__Compartment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__4"


    // $ANTLR start "rule__Compartment__Group__4__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1364:1: rule__Compartment__Group__4__Impl : ( ( rule__Compartment__Group_4__0 )? ) ;
    public final void rule__Compartment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1368:1: ( ( ( rule__Compartment__Group_4__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1369:1: ( ( rule__Compartment__Group_4__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1369:1: ( ( rule__Compartment__Group_4__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1370:1: ( rule__Compartment__Group_4__0 )?
            {
             before(grammarAccess.getCompartmentAccess().getGroup_4()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1371:1: ( rule__Compartment__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==67) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1371:2: rule__Compartment__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Compartment__Group_4__0_in_rule__Compartment__Group__4__Impl3010);
                    rule__Compartment__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompartmentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__4__Impl"


    // $ANTLR start "rule__Compartment__Group__5"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1381:1: rule__Compartment__Group__5 : rule__Compartment__Group__5__Impl rule__Compartment__Group__6 ;
    public final void rule__Compartment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1385:1: ( rule__Compartment__Group__5__Impl rule__Compartment__Group__6 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1386:2: rule__Compartment__Group__5__Impl rule__Compartment__Group__6
            {
            pushFollow(FOLLOW_rule__Compartment__Group__5__Impl_in_rule__Compartment__Group__53041);
            rule__Compartment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__6_in_rule__Compartment__Group__53044);
            rule__Compartment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__5"


    // $ANTLR start "rule__Compartment__Group__5__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1393:1: rule__Compartment__Group__5__Impl : ( ( rule__Compartment__Group_5__0 )? ) ;
    public final void rule__Compartment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1397:1: ( ( ( rule__Compartment__Group_5__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1398:1: ( ( rule__Compartment__Group_5__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1398:1: ( ( rule__Compartment__Group_5__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1399:1: ( rule__Compartment__Group_5__0 )?
            {
             before(grammarAccess.getCompartmentAccess().getGroup_5()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1400:1: ( rule__Compartment__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==68) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1400:2: rule__Compartment__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Compartment__Group_5__0_in_rule__Compartment__Group__5__Impl3071);
                    rule__Compartment__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompartmentAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__5__Impl"


    // $ANTLR start "rule__Compartment__Group__6"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1410:1: rule__Compartment__Group__6 : rule__Compartment__Group__6__Impl rule__Compartment__Group__7 ;
    public final void rule__Compartment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1414:1: ( rule__Compartment__Group__6__Impl rule__Compartment__Group__7 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1415:2: rule__Compartment__Group__6__Impl rule__Compartment__Group__7
            {
            pushFollow(FOLLOW_rule__Compartment__Group__6__Impl_in_rule__Compartment__Group__63102);
            rule__Compartment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__7_in_rule__Compartment__Group__63105);
            rule__Compartment__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__6"


    // $ANTLR start "rule__Compartment__Group__6__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1422:1: rule__Compartment__Group__6__Impl : ( ( rule__Compartment__Group_6__0 )? ) ;
    public final void rule__Compartment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1426:1: ( ( ( rule__Compartment__Group_6__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1427:1: ( ( rule__Compartment__Group_6__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1427:1: ( ( rule__Compartment__Group_6__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1428:1: ( rule__Compartment__Group_6__0 )?
            {
             before(grammarAccess.getCompartmentAccess().getGroup_6()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1429:1: ( rule__Compartment__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==69) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1429:2: rule__Compartment__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Compartment__Group_6__0_in_rule__Compartment__Group__6__Impl3132);
                    rule__Compartment__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompartmentAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__6__Impl"


    // $ANTLR start "rule__Compartment__Group__7"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1439:1: rule__Compartment__Group__7 : rule__Compartment__Group__7__Impl rule__Compartment__Group__8 ;
    public final void rule__Compartment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1443:1: ( rule__Compartment__Group__7__Impl rule__Compartment__Group__8 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1444:2: rule__Compartment__Group__7__Impl rule__Compartment__Group__8
            {
            pushFollow(FOLLOW_rule__Compartment__Group__7__Impl_in_rule__Compartment__Group__73163);
            rule__Compartment__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__8_in_rule__Compartment__Group__73166);
            rule__Compartment__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__7"


    // $ANTLR start "rule__Compartment__Group__7__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1451:1: rule__Compartment__Group__7__Impl : ( ( ( rule__Compartment__RdcsAssignment_7 ) ) ( ( rule__Compartment__RdcsAssignment_7 )* ) ) ;
    public final void rule__Compartment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1455:1: ( ( ( ( rule__Compartment__RdcsAssignment_7 ) ) ( ( rule__Compartment__RdcsAssignment_7 )* ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1456:1: ( ( ( rule__Compartment__RdcsAssignment_7 ) ) ( ( rule__Compartment__RdcsAssignment_7 )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1456:1: ( ( ( rule__Compartment__RdcsAssignment_7 ) ) ( ( rule__Compartment__RdcsAssignment_7 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1457:1: ( ( rule__Compartment__RdcsAssignment_7 ) ) ( ( rule__Compartment__RdcsAssignment_7 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1457:1: ( ( rule__Compartment__RdcsAssignment_7 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1458:1: ( rule__Compartment__RdcsAssignment_7 )
            {
             before(grammarAccess.getCompartmentAccess().getRdcsAssignment_7()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1459:1: ( rule__Compartment__RdcsAssignment_7 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1459:2: rule__Compartment__RdcsAssignment_7
            {
            pushFollow(FOLLOW_rule__Compartment__RdcsAssignment_7_in_rule__Compartment__Group__7__Impl3195);
            rule__Compartment__RdcsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCompartmentAccess().getRdcsAssignment_7()); 

            }

            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1462:1: ( ( rule__Compartment__RdcsAssignment_7 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1463:1: ( rule__Compartment__RdcsAssignment_7 )*
            {
             before(grammarAccess.getCompartmentAccess().getRdcsAssignment_7()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1464:1: ( rule__Compartment__RdcsAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==71) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1464:2: rule__Compartment__RdcsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Compartment__RdcsAssignment_7_in_rule__Compartment__Group__7__Impl3207);
            	    rule__Compartment__RdcsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCompartmentAccess().getRdcsAssignment_7()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__7__Impl"


    // $ANTLR start "rule__Compartment__Group__8"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1475:1: rule__Compartment__Group__8 : rule__Compartment__Group__8__Impl rule__Compartment__Group__9 ;
    public final void rule__Compartment__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1479:1: ( rule__Compartment__Group__8__Impl rule__Compartment__Group__9 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1480:2: rule__Compartment__Group__8__Impl rule__Compartment__Group__9
            {
            pushFollow(FOLLOW_rule__Compartment__Group__8__Impl_in_rule__Compartment__Group__83240);
            rule__Compartment__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__9_in_rule__Compartment__Group__83243);
            rule__Compartment__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__8"


    // $ANTLR start "rule__Compartment__Group__8__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1487:1: rule__Compartment__Group__8__Impl : ( ( rule__Compartment__Group_8__0 )? ) ;
    public final void rule__Compartment__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1491:1: ( ( ( rule__Compartment__Group_8__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1492:1: ( ( rule__Compartment__Group_8__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1492:1: ( ( rule__Compartment__Group_8__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1493:1: ( rule__Compartment__Group_8__0 )?
            {
             before(grammarAccess.getCompartmentAccess().getGroup_8()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1494:1: ( rule__Compartment__Group_8__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==70) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1494:2: rule__Compartment__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Compartment__Group_8__0_in_rule__Compartment__Group__8__Impl3270);
                    rule__Compartment__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompartmentAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__8__Impl"


    // $ANTLR start "rule__Compartment__Group__9"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1504:1: rule__Compartment__Group__9 : rule__Compartment__Group__9__Impl ;
    public final void rule__Compartment__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1508:1: ( rule__Compartment__Group__9__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1509:2: rule__Compartment__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__Group__9__Impl_in_rule__Compartment__Group__93301);
            rule__Compartment__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__9"


    // $ANTLR start "rule__Compartment__Group__9__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1515:1: rule__Compartment__Group__9__Impl : ( '}' ) ;
    public final void rule__Compartment__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1519:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1520:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1520:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1521:1: '}'
            {
             before(grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_9()); 
            match(input,62,FOLLOW_62_in_rule__Compartment__Group__9__Impl3329); 
             after(grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group__9__Impl"


    // $ANTLR start "rule__Compartment__Group_3__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1554:1: rule__Compartment__Group_3__0 : rule__Compartment__Group_3__0__Impl rule__Compartment__Group_3__1 ;
    public final void rule__Compartment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1558:1: ( rule__Compartment__Group_3__0__Impl rule__Compartment__Group_3__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1559:2: rule__Compartment__Group_3__0__Impl rule__Compartment__Group_3__1
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3__0__Impl_in_rule__Compartment__Group_3__03380);
            rule__Compartment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_3__1_in_rule__Compartment__Group_3__03383);
            rule__Compartment__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3__0"


    // $ANTLR start "rule__Compartment__Group_3__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1566:1: rule__Compartment__Group_3__0__Impl : ( 'Manufacturer' ) ;
    public final void rule__Compartment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1570:1: ( ( 'Manufacturer' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1571:1: ( 'Manufacturer' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1571:1: ( 'Manufacturer' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1572:1: 'Manufacturer'
            {
             before(grammarAccess.getCompartmentAccess().getManufacturerKeyword_3_0()); 
            match(input,66,FOLLOW_66_in_rule__Compartment__Group_3__0__Impl3411); 
             after(grammarAccess.getCompartmentAccess().getManufacturerKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3__0__Impl"


    // $ANTLR start "rule__Compartment__Group_3__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1585:1: rule__Compartment__Group_3__1 : rule__Compartment__Group_3__1__Impl rule__Compartment__Group_3__2 ;
    public final void rule__Compartment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1589:1: ( rule__Compartment__Group_3__1__Impl rule__Compartment__Group_3__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1590:2: rule__Compartment__Group_3__1__Impl rule__Compartment__Group_3__2
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3__1__Impl_in_rule__Compartment__Group_3__13442);
            rule__Compartment__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_3__2_in_rule__Compartment__Group_3__13445);
            rule__Compartment__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3__1"


    // $ANTLR start "rule__Compartment__Group_3__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1597:1: rule__Compartment__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Compartment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1601:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1602:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1602:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1603:1: '='
            {
             before(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_1()); 
            match(input,60,FOLLOW_60_in_rule__Compartment__Group_3__1__Impl3473); 
             after(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3__1__Impl"


    // $ANTLR start "rule__Compartment__Group_3__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1616:1: rule__Compartment__Group_3__2 : rule__Compartment__Group_3__2__Impl rule__Compartment__Group_3__3 ;
    public final void rule__Compartment__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1620:1: ( rule__Compartment__Group_3__2__Impl rule__Compartment__Group_3__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1621:2: rule__Compartment__Group_3__2__Impl rule__Compartment__Group_3__3
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3__2__Impl_in_rule__Compartment__Group_3__23504);
            rule__Compartment__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_3__3_in_rule__Compartment__Group_3__23507);
            rule__Compartment__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3__2"


    // $ANTLR start "rule__Compartment__Group_3__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1628:1: rule__Compartment__Group_3__2__Impl : ( ( rule__Compartment__ManufacturerAssignment_3_2 ) ) ;
    public final void rule__Compartment__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1632:1: ( ( ( rule__Compartment__ManufacturerAssignment_3_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1633:1: ( ( rule__Compartment__ManufacturerAssignment_3_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1633:1: ( ( rule__Compartment__ManufacturerAssignment_3_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1634:1: ( rule__Compartment__ManufacturerAssignment_3_2 )
            {
             before(grammarAccess.getCompartmentAccess().getManufacturerAssignment_3_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1635:1: ( rule__Compartment__ManufacturerAssignment_3_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1635:2: rule__Compartment__ManufacturerAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Compartment__ManufacturerAssignment_3_2_in_rule__Compartment__Group_3__2__Impl3534);
            rule__Compartment__ManufacturerAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCompartmentAccess().getManufacturerAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3__2__Impl"


    // $ANTLR start "rule__Compartment__Group_3__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1645:1: rule__Compartment__Group_3__3 : rule__Compartment__Group_3__3__Impl ;
    public final void rule__Compartment__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1649:1: ( rule__Compartment__Group_3__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1650:2: rule__Compartment__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3__3__Impl_in_rule__Compartment__Group_3__33564);
            rule__Compartment__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3__3"


    // $ANTLR start "rule__Compartment__Group_3__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1656:1: rule__Compartment__Group_3__3__Impl : ( ';' ) ;
    public final void rule__Compartment__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1660:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1661:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1661:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1662:1: ';'
            {
             before(grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_3()); 
            match(input,61,FOLLOW_61_in_rule__Compartment__Group_3__3__Impl3592); 
             after(grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3__3__Impl"


    // $ANTLR start "rule__Compartment__Group_4__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1683:1: rule__Compartment__Group_4__0 : rule__Compartment__Group_4__0__Impl rule__Compartment__Group_4__1 ;
    public final void rule__Compartment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1687:1: ( rule__Compartment__Group_4__0__Impl rule__Compartment__Group_4__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1688:2: rule__Compartment__Group_4__0__Impl rule__Compartment__Group_4__1
            {
            pushFollow(FOLLOW_rule__Compartment__Group_4__0__Impl_in_rule__Compartment__Group_4__03631);
            rule__Compartment__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_4__1_in_rule__Compartment__Group_4__03634);
            rule__Compartment__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_4__0"


    // $ANTLR start "rule__Compartment__Group_4__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1695:1: rule__Compartment__Group_4__0__Impl : ( 'PowerSupply' ) ;
    public final void rule__Compartment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1699:1: ( ( 'PowerSupply' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1700:1: ( 'PowerSupply' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1700:1: ( 'PowerSupply' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1701:1: 'PowerSupply'
            {
             before(grammarAccess.getCompartmentAccess().getPowerSupplyKeyword_4_0()); 
            match(input,67,FOLLOW_67_in_rule__Compartment__Group_4__0__Impl3662); 
             after(grammarAccess.getCompartmentAccess().getPowerSupplyKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_4__0__Impl"


    // $ANTLR start "rule__Compartment__Group_4__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1714:1: rule__Compartment__Group_4__1 : rule__Compartment__Group_4__1__Impl rule__Compartment__Group_4__2 ;
    public final void rule__Compartment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1718:1: ( rule__Compartment__Group_4__1__Impl rule__Compartment__Group_4__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1719:2: rule__Compartment__Group_4__1__Impl rule__Compartment__Group_4__2
            {
            pushFollow(FOLLOW_rule__Compartment__Group_4__1__Impl_in_rule__Compartment__Group_4__13693);
            rule__Compartment__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_4__2_in_rule__Compartment__Group_4__13696);
            rule__Compartment__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_4__1"


    // $ANTLR start "rule__Compartment__Group_4__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1726:1: rule__Compartment__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Compartment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1730:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1731:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1731:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1732:1: '='
            {
             before(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_4_1()); 
            match(input,60,FOLLOW_60_in_rule__Compartment__Group_4__1__Impl3724); 
             after(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_4__1__Impl"


    // $ANTLR start "rule__Compartment__Group_4__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1745:1: rule__Compartment__Group_4__2 : rule__Compartment__Group_4__2__Impl rule__Compartment__Group_4__3 ;
    public final void rule__Compartment__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1749:1: ( rule__Compartment__Group_4__2__Impl rule__Compartment__Group_4__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1750:2: rule__Compartment__Group_4__2__Impl rule__Compartment__Group_4__3
            {
            pushFollow(FOLLOW_rule__Compartment__Group_4__2__Impl_in_rule__Compartment__Group_4__23755);
            rule__Compartment__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_4__3_in_rule__Compartment__Group_4__23758);
            rule__Compartment__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_4__2"


    // $ANTLR start "rule__Compartment__Group_4__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1757:1: rule__Compartment__Group_4__2__Impl : ( ( rule__Compartment__PowerSupplyAssignment_4_2 ) ) ;
    public final void rule__Compartment__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1761:1: ( ( ( rule__Compartment__PowerSupplyAssignment_4_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1762:1: ( ( rule__Compartment__PowerSupplyAssignment_4_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1762:1: ( ( rule__Compartment__PowerSupplyAssignment_4_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1763:1: ( rule__Compartment__PowerSupplyAssignment_4_2 )
            {
             before(grammarAccess.getCompartmentAccess().getPowerSupplyAssignment_4_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1764:1: ( rule__Compartment__PowerSupplyAssignment_4_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1764:2: rule__Compartment__PowerSupplyAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Compartment__PowerSupplyAssignment_4_2_in_rule__Compartment__Group_4__2__Impl3785);
            rule__Compartment__PowerSupplyAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getCompartmentAccess().getPowerSupplyAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_4__2__Impl"


    // $ANTLR start "rule__Compartment__Group_4__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1774:1: rule__Compartment__Group_4__3 : rule__Compartment__Group_4__3__Impl ;
    public final void rule__Compartment__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1778:1: ( rule__Compartment__Group_4__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1779:2: rule__Compartment__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__Group_4__3__Impl_in_rule__Compartment__Group_4__33815);
            rule__Compartment__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_4__3"


    // $ANTLR start "rule__Compartment__Group_4__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1785:1: rule__Compartment__Group_4__3__Impl : ( ';' ) ;
    public final void rule__Compartment__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1789:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1790:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1790:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1791:1: ';'
            {
             before(grammarAccess.getCompartmentAccess().getSemicolonKeyword_4_3()); 
            match(input,61,FOLLOW_61_in_rule__Compartment__Group_4__3__Impl3843); 
             after(grammarAccess.getCompartmentAccess().getSemicolonKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_4__3__Impl"


    // $ANTLR start "rule__Compartment__Group_5__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1812:1: rule__Compartment__Group_5__0 : rule__Compartment__Group_5__0__Impl rule__Compartment__Group_5__1 ;
    public final void rule__Compartment__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1816:1: ( rule__Compartment__Group_5__0__Impl rule__Compartment__Group_5__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1817:2: rule__Compartment__Group_5__0__Impl rule__Compartment__Group_5__1
            {
            pushFollow(FOLLOW_rule__Compartment__Group_5__0__Impl_in_rule__Compartment__Group_5__03882);
            rule__Compartment__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_5__1_in_rule__Compartment__Group_5__03885);
            rule__Compartment__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_5__0"


    // $ANTLR start "rule__Compartment__Group_5__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1824:1: rule__Compartment__Group_5__0__Impl : ( 'Side' ) ;
    public final void rule__Compartment__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1828:1: ( ( 'Side' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1829:1: ( 'Side' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1829:1: ( 'Side' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1830:1: 'Side'
            {
             before(grammarAccess.getCompartmentAccess().getSideKeyword_5_0()); 
            match(input,68,FOLLOW_68_in_rule__Compartment__Group_5__0__Impl3913); 
             after(grammarAccess.getCompartmentAccess().getSideKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_5__0__Impl"


    // $ANTLR start "rule__Compartment__Group_5__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1843:1: rule__Compartment__Group_5__1 : rule__Compartment__Group_5__1__Impl rule__Compartment__Group_5__2 ;
    public final void rule__Compartment__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1847:1: ( rule__Compartment__Group_5__1__Impl rule__Compartment__Group_5__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1848:2: rule__Compartment__Group_5__1__Impl rule__Compartment__Group_5__2
            {
            pushFollow(FOLLOW_rule__Compartment__Group_5__1__Impl_in_rule__Compartment__Group_5__13944);
            rule__Compartment__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_5__2_in_rule__Compartment__Group_5__13947);
            rule__Compartment__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_5__1"


    // $ANTLR start "rule__Compartment__Group_5__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1855:1: rule__Compartment__Group_5__1__Impl : ( '=' ) ;
    public final void rule__Compartment__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1859:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1860:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1860:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1861:1: '='
            {
             before(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_5_1()); 
            match(input,60,FOLLOW_60_in_rule__Compartment__Group_5__1__Impl3975); 
             after(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_5__1__Impl"


    // $ANTLR start "rule__Compartment__Group_5__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1874:1: rule__Compartment__Group_5__2 : rule__Compartment__Group_5__2__Impl rule__Compartment__Group_5__3 ;
    public final void rule__Compartment__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1878:1: ( rule__Compartment__Group_5__2__Impl rule__Compartment__Group_5__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1879:2: rule__Compartment__Group_5__2__Impl rule__Compartment__Group_5__3
            {
            pushFollow(FOLLOW_rule__Compartment__Group_5__2__Impl_in_rule__Compartment__Group_5__24006);
            rule__Compartment__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_5__3_in_rule__Compartment__Group_5__24009);
            rule__Compartment__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_5__2"


    // $ANTLR start "rule__Compartment__Group_5__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1886:1: rule__Compartment__Group_5__2__Impl : ( ( rule__Compartment__SideAssignment_5_2 ) ) ;
    public final void rule__Compartment__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1890:1: ( ( ( rule__Compartment__SideAssignment_5_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1891:1: ( ( rule__Compartment__SideAssignment_5_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1891:1: ( ( rule__Compartment__SideAssignment_5_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1892:1: ( rule__Compartment__SideAssignment_5_2 )
            {
             before(grammarAccess.getCompartmentAccess().getSideAssignment_5_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1893:1: ( rule__Compartment__SideAssignment_5_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1893:2: rule__Compartment__SideAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Compartment__SideAssignment_5_2_in_rule__Compartment__Group_5__2__Impl4036);
            rule__Compartment__SideAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getCompartmentAccess().getSideAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_5__2__Impl"


    // $ANTLR start "rule__Compartment__Group_5__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1903:1: rule__Compartment__Group_5__3 : rule__Compartment__Group_5__3__Impl ;
    public final void rule__Compartment__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1907:1: ( rule__Compartment__Group_5__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1908:2: rule__Compartment__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__Group_5__3__Impl_in_rule__Compartment__Group_5__34066);
            rule__Compartment__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_5__3"


    // $ANTLR start "rule__Compartment__Group_5__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1914:1: rule__Compartment__Group_5__3__Impl : ( ';' ) ;
    public final void rule__Compartment__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1918:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1919:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1919:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1920:1: ';'
            {
             before(grammarAccess.getCompartmentAccess().getSemicolonKeyword_5_3()); 
            match(input,61,FOLLOW_61_in_rule__Compartment__Group_5__3__Impl4094); 
             after(grammarAccess.getCompartmentAccess().getSemicolonKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_5__3__Impl"


    // $ANTLR start "rule__Compartment__Group_6__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1941:1: rule__Compartment__Group_6__0 : rule__Compartment__Group_6__0__Impl rule__Compartment__Group_6__1 ;
    public final void rule__Compartment__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1945:1: ( rule__Compartment__Group_6__0__Impl rule__Compartment__Group_6__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1946:2: rule__Compartment__Group_6__0__Impl rule__Compartment__Group_6__1
            {
            pushFollow(FOLLOW_rule__Compartment__Group_6__0__Impl_in_rule__Compartment__Group_6__04133);
            rule__Compartment__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_6__1_in_rule__Compartment__Group_6__04136);
            rule__Compartment__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_6__0"


    // $ANTLR start "rule__Compartment__Group_6__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1953:1: rule__Compartment__Group_6__0__Impl : ( 'Zone' ) ;
    public final void rule__Compartment__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1957:1: ( ( 'Zone' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1958:1: ( 'Zone' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1958:1: ( 'Zone' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1959:1: 'Zone'
            {
             before(grammarAccess.getCompartmentAccess().getZoneKeyword_6_0()); 
            match(input,69,FOLLOW_69_in_rule__Compartment__Group_6__0__Impl4164); 
             after(grammarAccess.getCompartmentAccess().getZoneKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_6__0__Impl"


    // $ANTLR start "rule__Compartment__Group_6__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1972:1: rule__Compartment__Group_6__1 : rule__Compartment__Group_6__1__Impl rule__Compartment__Group_6__2 ;
    public final void rule__Compartment__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1976:1: ( rule__Compartment__Group_6__1__Impl rule__Compartment__Group_6__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1977:2: rule__Compartment__Group_6__1__Impl rule__Compartment__Group_6__2
            {
            pushFollow(FOLLOW_rule__Compartment__Group_6__1__Impl_in_rule__Compartment__Group_6__14195);
            rule__Compartment__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_6__2_in_rule__Compartment__Group_6__14198);
            rule__Compartment__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_6__1"


    // $ANTLR start "rule__Compartment__Group_6__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1984:1: rule__Compartment__Group_6__1__Impl : ( '=' ) ;
    public final void rule__Compartment__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1988:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1989:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1989:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1990:1: '='
            {
             before(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_6_1()); 
            match(input,60,FOLLOW_60_in_rule__Compartment__Group_6__1__Impl4226); 
             after(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_6__1__Impl"


    // $ANTLR start "rule__Compartment__Group_6__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2003:1: rule__Compartment__Group_6__2 : rule__Compartment__Group_6__2__Impl rule__Compartment__Group_6__3 ;
    public final void rule__Compartment__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2007:1: ( rule__Compartment__Group_6__2__Impl rule__Compartment__Group_6__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2008:2: rule__Compartment__Group_6__2__Impl rule__Compartment__Group_6__3
            {
            pushFollow(FOLLOW_rule__Compartment__Group_6__2__Impl_in_rule__Compartment__Group_6__24257);
            rule__Compartment__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_6__3_in_rule__Compartment__Group_6__24260);
            rule__Compartment__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_6__2"


    // $ANTLR start "rule__Compartment__Group_6__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2015:1: rule__Compartment__Group_6__2__Impl : ( ( rule__Compartment__ZoneAssignment_6_2 ) ) ;
    public final void rule__Compartment__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2019:1: ( ( ( rule__Compartment__ZoneAssignment_6_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2020:1: ( ( rule__Compartment__ZoneAssignment_6_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2020:1: ( ( rule__Compartment__ZoneAssignment_6_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2021:1: ( rule__Compartment__ZoneAssignment_6_2 )
            {
             before(grammarAccess.getCompartmentAccess().getZoneAssignment_6_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2022:1: ( rule__Compartment__ZoneAssignment_6_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2022:2: rule__Compartment__ZoneAssignment_6_2
            {
            pushFollow(FOLLOW_rule__Compartment__ZoneAssignment_6_2_in_rule__Compartment__Group_6__2__Impl4287);
            rule__Compartment__ZoneAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getCompartmentAccess().getZoneAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_6__2__Impl"


    // $ANTLR start "rule__Compartment__Group_6__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2032:1: rule__Compartment__Group_6__3 : rule__Compartment__Group_6__3__Impl ;
    public final void rule__Compartment__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2036:1: ( rule__Compartment__Group_6__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2037:2: rule__Compartment__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__Group_6__3__Impl_in_rule__Compartment__Group_6__34317);
            rule__Compartment__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_6__3"


    // $ANTLR start "rule__Compartment__Group_6__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2043:1: rule__Compartment__Group_6__3__Impl : ( ';' ) ;
    public final void rule__Compartment__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2047:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2048:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2048:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2049:1: ';'
            {
             before(grammarAccess.getCompartmentAccess().getSemicolonKeyword_6_3()); 
            match(input,61,FOLLOW_61_in_rule__Compartment__Group_6__3__Impl4345); 
             after(grammarAccess.getCompartmentAccess().getSemicolonKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_6__3__Impl"


    // $ANTLR start "rule__Compartment__Group_8__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2070:1: rule__Compartment__Group_8__0 : rule__Compartment__Group_8__0__Impl rule__Compartment__Group_8__1 ;
    public final void rule__Compartment__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2074:1: ( rule__Compartment__Group_8__0__Impl rule__Compartment__Group_8__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2075:2: rule__Compartment__Group_8__0__Impl rule__Compartment__Group_8__1
            {
            pushFollow(FOLLOW_rule__Compartment__Group_8__0__Impl_in_rule__Compartment__Group_8__04384);
            rule__Compartment__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_8__1_in_rule__Compartment__Group_8__04387);
            rule__Compartment__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_8__0"


    // $ANTLR start "rule__Compartment__Group_8__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2082:1: rule__Compartment__Group_8__0__Impl : ( 'Generic properties' ) ;
    public final void rule__Compartment__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2086:1: ( ( 'Generic properties' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2087:1: ( 'Generic properties' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2087:1: ( 'Generic properties' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2088:1: 'Generic properties'
            {
             before(grammarAccess.getCompartmentAccess().getGenericPropertiesKeyword_8_0()); 
            match(input,70,FOLLOW_70_in_rule__Compartment__Group_8__0__Impl4415); 
             after(grammarAccess.getCompartmentAccess().getGenericPropertiesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_8__0__Impl"


    // $ANTLR start "rule__Compartment__Group_8__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2101:1: rule__Compartment__Group_8__1 : rule__Compartment__Group_8__1__Impl rule__Compartment__Group_8__2 ;
    public final void rule__Compartment__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2105:1: ( rule__Compartment__Group_8__1__Impl rule__Compartment__Group_8__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2106:2: rule__Compartment__Group_8__1__Impl rule__Compartment__Group_8__2
            {
            pushFollow(FOLLOW_rule__Compartment__Group_8__1__Impl_in_rule__Compartment__Group_8__14446);
            rule__Compartment__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_8__2_in_rule__Compartment__Group_8__14449);
            rule__Compartment__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_8__1"


    // $ANTLR start "rule__Compartment__Group_8__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2113:1: rule__Compartment__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Compartment__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2117:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2118:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2118:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2119:1: '{'
            {
             before(grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,58,FOLLOW_58_in_rule__Compartment__Group_8__1__Impl4477); 
             after(grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_8__1__Impl"


    // $ANTLR start "rule__Compartment__Group_8__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2132:1: rule__Compartment__Group_8__2 : rule__Compartment__Group_8__2__Impl rule__Compartment__Group_8__3 ;
    public final void rule__Compartment__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2136:1: ( rule__Compartment__Group_8__2__Impl rule__Compartment__Group_8__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2137:2: rule__Compartment__Group_8__2__Impl rule__Compartment__Group_8__3
            {
            pushFollow(FOLLOW_rule__Compartment__Group_8__2__Impl_in_rule__Compartment__Group_8__24508);
            rule__Compartment__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_8__3_in_rule__Compartment__Group_8__24511);
            rule__Compartment__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_8__2"


    // $ANTLR start "rule__Compartment__Group_8__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2144:1: rule__Compartment__Group_8__2__Impl : ( ( rule__Compartment__MetricParametersAssignment_8_2 )* ) ;
    public final void rule__Compartment__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2148:1: ( ( ( rule__Compartment__MetricParametersAssignment_8_2 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2149:1: ( ( rule__Compartment__MetricParametersAssignment_8_2 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2149:1: ( ( rule__Compartment__MetricParametersAssignment_8_2 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2150:1: ( rule__Compartment__MetricParametersAssignment_8_2 )*
            {
             before(grammarAccess.getCompartmentAccess().getMetricParametersAssignment_8_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2151:1: ( rule__Compartment__MetricParametersAssignment_8_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2151:2: rule__Compartment__MetricParametersAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__Compartment__MetricParametersAssignment_8_2_in_rule__Compartment__Group_8__2__Impl4538);
            	    rule__Compartment__MetricParametersAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getCompartmentAccess().getMetricParametersAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_8__2__Impl"


    // $ANTLR start "rule__Compartment__Group_8__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2161:1: rule__Compartment__Group_8__3 : rule__Compartment__Group_8__3__Impl ;
    public final void rule__Compartment__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2165:1: ( rule__Compartment__Group_8__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2166:2: rule__Compartment__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__Group_8__3__Impl_in_rule__Compartment__Group_8__34569);
            rule__Compartment__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_8__3"


    // $ANTLR start "rule__Compartment__Group_8__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2172:1: rule__Compartment__Group_8__3__Impl : ( '}' ) ;
    public final void rule__Compartment__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2176:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2177:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2177:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2178:1: '}'
            {
             before(grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_8_3()); 
            match(input,62,FOLLOW_62_in_rule__Compartment__Group_8__3__Impl4597); 
             after(grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_8__3__Impl"


    // $ANTLR start "rule__RDC__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2199:1: rule__RDC__Group__0 : rule__RDC__Group__0__Impl rule__RDC__Group__1 ;
    public final void rule__RDC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2203:1: ( rule__RDC__Group__0__Impl rule__RDC__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2204:2: rule__RDC__Group__0__Impl rule__RDC__Group__1
            {
            pushFollow(FOLLOW_rule__RDC__Group__0__Impl_in_rule__RDC__Group__04636);
            rule__RDC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__1_in_rule__RDC__Group__04639);
            rule__RDC__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__0"


    // $ANTLR start "rule__RDC__Group__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2211:1: rule__RDC__Group__0__Impl : ( 'RDC' ) ;
    public final void rule__RDC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2215:1: ( ( 'RDC' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2216:1: ( 'RDC' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2216:1: ( 'RDC' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2217:1: 'RDC'
            {
             before(grammarAccess.getRDCAccess().getRDCKeyword_0()); 
            match(input,71,FOLLOW_71_in_rule__RDC__Group__0__Impl4667); 
             after(grammarAccess.getRDCAccess().getRDCKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__0__Impl"


    // $ANTLR start "rule__RDC__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2230:1: rule__RDC__Group__1 : rule__RDC__Group__1__Impl rule__RDC__Group__2 ;
    public final void rule__RDC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2234:1: ( rule__RDC__Group__1__Impl rule__RDC__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2235:2: rule__RDC__Group__1__Impl rule__RDC__Group__2
            {
            pushFollow(FOLLOW_rule__RDC__Group__1__Impl_in_rule__RDC__Group__14698);
            rule__RDC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__2_in_rule__RDC__Group__14701);
            rule__RDC__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__1"


    // $ANTLR start "rule__RDC__Group__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2242:1: rule__RDC__Group__1__Impl : ( ( rule__RDC__NameAssignment_1 ) ) ;
    public final void rule__RDC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2246:1: ( ( ( rule__RDC__NameAssignment_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2247:1: ( ( rule__RDC__NameAssignment_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2247:1: ( ( rule__RDC__NameAssignment_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2248:1: ( rule__RDC__NameAssignment_1 )
            {
             before(grammarAccess.getRDCAccess().getNameAssignment_1()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2249:1: ( rule__RDC__NameAssignment_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2249:2: rule__RDC__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RDC__NameAssignment_1_in_rule__RDC__Group__1__Impl4728);
            rule__RDC__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRDCAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__1__Impl"


    // $ANTLR start "rule__RDC__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2259:1: rule__RDC__Group__2 : rule__RDC__Group__2__Impl rule__RDC__Group__3 ;
    public final void rule__RDC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2263:1: ( rule__RDC__Group__2__Impl rule__RDC__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2264:2: rule__RDC__Group__2__Impl rule__RDC__Group__3
            {
            pushFollow(FOLLOW_rule__RDC__Group__2__Impl_in_rule__RDC__Group__24758);
            rule__RDC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__3_in_rule__RDC__Group__24761);
            rule__RDC__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__2"


    // $ANTLR start "rule__RDC__Group__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2271:1: rule__RDC__Group__2__Impl : ( '{' ) ;
    public final void rule__RDC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2275:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2276:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2276:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2277:1: '{'
            {
             before(grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_58_in_rule__RDC__Group__2__Impl4789); 
             after(grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__2__Impl"


    // $ANTLR start "rule__RDC__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2290:1: rule__RDC__Group__3 : rule__RDC__Group__3__Impl rule__RDC__Group__4 ;
    public final void rule__RDC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2294:1: ( rule__RDC__Group__3__Impl rule__RDC__Group__4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2295:2: rule__RDC__Group__3__Impl rule__RDC__Group__4
            {
            pushFollow(FOLLOW_rule__RDC__Group__3__Impl_in_rule__RDC__Group__34820);
            rule__RDC__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__4_in_rule__RDC__Group__34823);
            rule__RDC__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__3"


    // $ANTLR start "rule__RDC__Group__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2302:1: rule__RDC__Group__3__Impl : ( ( rule__RDC__Group_3__0 )? ) ;
    public final void rule__RDC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2306:1: ( ( ( rule__RDC__Group_3__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2307:1: ( ( rule__RDC__Group_3__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2307:1: ( ( rule__RDC__Group_3__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2308:1: ( rule__RDC__Group_3__0 )?
            {
             before(grammarAccess.getRDCAccess().getGroup_3()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2309:1: ( rule__RDC__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==66) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2309:2: rule__RDC__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__RDC__Group_3__0_in_rule__RDC__Group__3__Impl4850);
                    rule__RDC__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRDCAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__3__Impl"


    // $ANTLR start "rule__RDC__Group__4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2319:1: rule__RDC__Group__4 : rule__RDC__Group__4__Impl rule__RDC__Group__5 ;
    public final void rule__RDC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2323:1: ( rule__RDC__Group__4__Impl rule__RDC__Group__5 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2324:2: rule__RDC__Group__4__Impl rule__RDC__Group__5
            {
            pushFollow(FOLLOW_rule__RDC__Group__4__Impl_in_rule__RDC__Group__44881);
            rule__RDC__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__5_in_rule__RDC__Group__44884);
            rule__RDC__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__4"


    // $ANTLR start "rule__RDC__Group__4__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2331:1: rule__RDC__Group__4__Impl : ( ( rule__RDC__Group_4__0 )? ) ;
    public final void rule__RDC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2335:1: ( ( ( rule__RDC__Group_4__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2336:1: ( ( rule__RDC__Group_4__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2336:1: ( ( rule__RDC__Group_4__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2337:1: ( rule__RDC__Group_4__0 )?
            {
             before(grammarAccess.getRDCAccess().getGroup_4()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2338:1: ( rule__RDC__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==67) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2338:2: rule__RDC__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RDC__Group_4__0_in_rule__RDC__Group__4__Impl4911);
                    rule__RDC__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRDCAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__4__Impl"


    // $ANTLR start "rule__RDC__Group__5"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2348:1: rule__RDC__Group__5 : rule__RDC__Group__5__Impl rule__RDC__Group__6 ;
    public final void rule__RDC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2352:1: ( rule__RDC__Group__5__Impl rule__RDC__Group__6 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2353:2: rule__RDC__Group__5__Impl rule__RDC__Group__6
            {
            pushFollow(FOLLOW_rule__RDC__Group__5__Impl_in_rule__RDC__Group__54942);
            rule__RDC__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__6_in_rule__RDC__Group__54945);
            rule__RDC__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__5"


    // $ANTLR start "rule__RDC__Group__5__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2360:1: rule__RDC__Group__5__Impl : ( ( rule__RDC__Group_5__0 )? ) ;
    public final void rule__RDC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2364:1: ( ( ( rule__RDC__Group_5__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2365:1: ( ( rule__RDC__Group_5__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2365:1: ( ( rule__RDC__Group_5__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2366:1: ( rule__RDC__Group_5__0 )?
            {
             before(grammarAccess.getRDCAccess().getGroup_5()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2367:1: ( rule__RDC__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==72) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2367:2: rule__RDC__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__RDC__Group_5__0_in_rule__RDC__Group__5__Impl4972);
                    rule__RDC__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRDCAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__5__Impl"


    // $ANTLR start "rule__RDC__Group__6"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2377:1: rule__RDC__Group__6 : rule__RDC__Group__6__Impl rule__RDC__Group__7 ;
    public final void rule__RDC__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2381:1: ( rule__RDC__Group__6__Impl rule__RDC__Group__7 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2382:2: rule__RDC__Group__6__Impl rule__RDC__Group__7
            {
            pushFollow(FOLLOW_rule__RDC__Group__6__Impl_in_rule__RDC__Group__65003);
            rule__RDC__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__7_in_rule__RDC__Group__65006);
            rule__RDC__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__6"


    // $ANTLR start "rule__RDC__Group__6__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2389:1: rule__RDC__Group__6__Impl : ( ( rule__RDC__Group_6__0 )? ) ;
    public final void rule__RDC__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2393:1: ( ( ( rule__RDC__Group_6__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2394:1: ( ( rule__RDC__Group_6__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2394:1: ( ( rule__RDC__Group_6__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2395:1: ( rule__RDC__Group_6__0 )?
            {
             before(grammarAccess.getRDCAccess().getGroup_6()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2396:1: ( rule__RDC__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==73) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2396:2: rule__RDC__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__RDC__Group_6__0_in_rule__RDC__Group__6__Impl5033);
                    rule__RDC__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRDCAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__6__Impl"


    // $ANTLR start "rule__RDC__Group__7"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2406:1: rule__RDC__Group__7 : rule__RDC__Group__7__Impl rule__RDC__Group__8 ;
    public final void rule__RDC__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2410:1: ( rule__RDC__Group__7__Impl rule__RDC__Group__8 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2411:2: rule__RDC__Group__7__Impl rule__RDC__Group__8
            {
            pushFollow(FOLLOW_rule__RDC__Group__7__Impl_in_rule__RDC__Group__75064);
            rule__RDC__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__8_in_rule__RDC__Group__75067);
            rule__RDC__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__7"


    // $ANTLR start "rule__RDC__Group__7__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2418:1: rule__RDC__Group__7__Impl : ( ( ( rule__RDC__ConnectorsAssignment_7 ) ) ( ( rule__RDC__ConnectorsAssignment_7 )* ) ) ;
    public final void rule__RDC__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2422:1: ( ( ( ( rule__RDC__ConnectorsAssignment_7 ) ) ( ( rule__RDC__ConnectorsAssignment_7 )* ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2423:1: ( ( ( rule__RDC__ConnectorsAssignment_7 ) ) ( ( rule__RDC__ConnectorsAssignment_7 )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2423:1: ( ( ( rule__RDC__ConnectorsAssignment_7 ) ) ( ( rule__RDC__ConnectorsAssignment_7 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2424:1: ( ( rule__RDC__ConnectorsAssignment_7 ) ) ( ( rule__RDC__ConnectorsAssignment_7 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2424:1: ( ( rule__RDC__ConnectorsAssignment_7 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2425:1: ( rule__RDC__ConnectorsAssignment_7 )
            {
             before(grammarAccess.getRDCAccess().getConnectorsAssignment_7()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2426:1: ( rule__RDC__ConnectorsAssignment_7 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2426:2: rule__RDC__ConnectorsAssignment_7
            {
            pushFollow(FOLLOW_rule__RDC__ConnectorsAssignment_7_in_rule__RDC__Group__7__Impl5096);
            rule__RDC__ConnectorsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRDCAccess().getConnectorsAssignment_7()); 

            }

            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2429:1: ( ( rule__RDC__ConnectorsAssignment_7 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2430:1: ( rule__RDC__ConnectorsAssignment_7 )*
            {
             before(grammarAccess.getRDCAccess().getConnectorsAssignment_7()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2431:1: ( rule__RDC__ConnectorsAssignment_7 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==74) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2431:2: rule__RDC__ConnectorsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__RDC__ConnectorsAssignment_7_in_rule__RDC__Group__7__Impl5108);
            	    rule__RDC__ConnectorsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getRDCAccess().getConnectorsAssignment_7()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__7__Impl"


    // $ANTLR start "rule__RDC__Group__8"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2442:1: rule__RDC__Group__8 : rule__RDC__Group__8__Impl rule__RDC__Group__9 ;
    public final void rule__RDC__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2446:1: ( rule__RDC__Group__8__Impl rule__RDC__Group__9 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2447:2: rule__RDC__Group__8__Impl rule__RDC__Group__9
            {
            pushFollow(FOLLOW_rule__RDC__Group__8__Impl_in_rule__RDC__Group__85141);
            rule__RDC__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__9_in_rule__RDC__Group__85144);
            rule__RDC__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__8"


    // $ANTLR start "rule__RDC__Group__8__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2454:1: rule__RDC__Group__8__Impl : ( ( rule__RDC__Group_8__0 )? ) ;
    public final void rule__RDC__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2458:1: ( ( ( rule__RDC__Group_8__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2459:1: ( ( rule__RDC__Group_8__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2459:1: ( ( rule__RDC__Group_8__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2460:1: ( rule__RDC__Group_8__0 )?
            {
             before(grammarAccess.getRDCAccess().getGroup_8()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2461:1: ( rule__RDC__Group_8__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==70) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2461:2: rule__RDC__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__RDC__Group_8__0_in_rule__RDC__Group__8__Impl5171);
                    rule__RDC__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRDCAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__8__Impl"


    // $ANTLR start "rule__RDC__Group__9"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2471:1: rule__RDC__Group__9 : rule__RDC__Group__9__Impl ;
    public final void rule__RDC__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2475:1: ( rule__RDC__Group__9__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2476:2: rule__RDC__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group__9__Impl_in_rule__RDC__Group__95202);
            rule__RDC__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__9"


    // $ANTLR start "rule__RDC__Group__9__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2482:1: rule__RDC__Group__9__Impl : ( '}' ) ;
    public final void rule__RDC__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2486:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2487:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2487:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2488:1: '}'
            {
             before(grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_9()); 
            match(input,62,FOLLOW_62_in_rule__RDC__Group__9__Impl5230); 
             after(grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group__9__Impl"


    // $ANTLR start "rule__RDC__Group_3__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2521:1: rule__RDC__Group_3__0 : rule__RDC__Group_3__0__Impl rule__RDC__Group_3__1 ;
    public final void rule__RDC__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2525:1: ( rule__RDC__Group_3__0__Impl rule__RDC__Group_3__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2526:2: rule__RDC__Group_3__0__Impl rule__RDC__Group_3__1
            {
            pushFollow(FOLLOW_rule__RDC__Group_3__0__Impl_in_rule__RDC__Group_3__05281);
            rule__RDC__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_3__1_in_rule__RDC__Group_3__05284);
            rule__RDC__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_3__0"


    // $ANTLR start "rule__RDC__Group_3__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2533:1: rule__RDC__Group_3__0__Impl : ( 'Manufacturer' ) ;
    public final void rule__RDC__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2537:1: ( ( 'Manufacturer' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2538:1: ( 'Manufacturer' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2538:1: ( 'Manufacturer' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2539:1: 'Manufacturer'
            {
             before(grammarAccess.getRDCAccess().getManufacturerKeyword_3_0()); 
            match(input,66,FOLLOW_66_in_rule__RDC__Group_3__0__Impl5312); 
             after(grammarAccess.getRDCAccess().getManufacturerKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_3__0__Impl"


    // $ANTLR start "rule__RDC__Group_3__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2552:1: rule__RDC__Group_3__1 : rule__RDC__Group_3__1__Impl rule__RDC__Group_3__2 ;
    public final void rule__RDC__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2556:1: ( rule__RDC__Group_3__1__Impl rule__RDC__Group_3__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2557:2: rule__RDC__Group_3__1__Impl rule__RDC__Group_3__2
            {
            pushFollow(FOLLOW_rule__RDC__Group_3__1__Impl_in_rule__RDC__Group_3__15343);
            rule__RDC__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_3__2_in_rule__RDC__Group_3__15346);
            rule__RDC__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_3__1"


    // $ANTLR start "rule__RDC__Group_3__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2564:1: rule__RDC__Group_3__1__Impl : ( '=' ) ;
    public final void rule__RDC__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2568:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2569:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2569:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2570:1: '='
            {
             before(grammarAccess.getRDCAccess().getEqualsSignKeyword_3_1()); 
            match(input,60,FOLLOW_60_in_rule__RDC__Group_3__1__Impl5374); 
             after(grammarAccess.getRDCAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_3__1__Impl"


    // $ANTLR start "rule__RDC__Group_3__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2583:1: rule__RDC__Group_3__2 : rule__RDC__Group_3__2__Impl rule__RDC__Group_3__3 ;
    public final void rule__RDC__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2587:1: ( rule__RDC__Group_3__2__Impl rule__RDC__Group_3__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2588:2: rule__RDC__Group_3__2__Impl rule__RDC__Group_3__3
            {
            pushFollow(FOLLOW_rule__RDC__Group_3__2__Impl_in_rule__RDC__Group_3__25405);
            rule__RDC__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_3__3_in_rule__RDC__Group_3__25408);
            rule__RDC__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_3__2"


    // $ANTLR start "rule__RDC__Group_3__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2595:1: rule__RDC__Group_3__2__Impl : ( ( rule__RDC__ManufacturerAssignment_3_2 ) ) ;
    public final void rule__RDC__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2599:1: ( ( ( rule__RDC__ManufacturerAssignment_3_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2600:1: ( ( rule__RDC__ManufacturerAssignment_3_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2600:1: ( ( rule__RDC__ManufacturerAssignment_3_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2601:1: ( rule__RDC__ManufacturerAssignment_3_2 )
            {
             before(grammarAccess.getRDCAccess().getManufacturerAssignment_3_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2602:1: ( rule__RDC__ManufacturerAssignment_3_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2602:2: rule__RDC__ManufacturerAssignment_3_2
            {
            pushFollow(FOLLOW_rule__RDC__ManufacturerAssignment_3_2_in_rule__RDC__Group_3__2__Impl5435);
            rule__RDC__ManufacturerAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRDCAccess().getManufacturerAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_3__2__Impl"


    // $ANTLR start "rule__RDC__Group_3__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2612:1: rule__RDC__Group_3__3 : rule__RDC__Group_3__3__Impl ;
    public final void rule__RDC__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2616:1: ( rule__RDC__Group_3__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2617:2: rule__RDC__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group_3__3__Impl_in_rule__RDC__Group_3__35465);
            rule__RDC__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_3__3"


    // $ANTLR start "rule__RDC__Group_3__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2623:1: rule__RDC__Group_3__3__Impl : ( ';' ) ;
    public final void rule__RDC__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2627:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2628:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2628:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2629:1: ';'
            {
             before(grammarAccess.getRDCAccess().getSemicolonKeyword_3_3()); 
            match(input,61,FOLLOW_61_in_rule__RDC__Group_3__3__Impl5493); 
             after(grammarAccess.getRDCAccess().getSemicolonKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_3__3__Impl"


    // $ANTLR start "rule__RDC__Group_4__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2650:1: rule__RDC__Group_4__0 : rule__RDC__Group_4__0__Impl rule__RDC__Group_4__1 ;
    public final void rule__RDC__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2654:1: ( rule__RDC__Group_4__0__Impl rule__RDC__Group_4__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2655:2: rule__RDC__Group_4__0__Impl rule__RDC__Group_4__1
            {
            pushFollow(FOLLOW_rule__RDC__Group_4__0__Impl_in_rule__RDC__Group_4__05532);
            rule__RDC__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_4__1_in_rule__RDC__Group_4__05535);
            rule__RDC__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_4__0"


    // $ANTLR start "rule__RDC__Group_4__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2662:1: rule__RDC__Group_4__0__Impl : ( 'PowerSupply' ) ;
    public final void rule__RDC__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2666:1: ( ( 'PowerSupply' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2667:1: ( 'PowerSupply' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2667:1: ( 'PowerSupply' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2668:1: 'PowerSupply'
            {
             before(grammarAccess.getRDCAccess().getPowerSupplyKeyword_4_0()); 
            match(input,67,FOLLOW_67_in_rule__RDC__Group_4__0__Impl5563); 
             after(grammarAccess.getRDCAccess().getPowerSupplyKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_4__0__Impl"


    // $ANTLR start "rule__RDC__Group_4__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2681:1: rule__RDC__Group_4__1 : rule__RDC__Group_4__1__Impl rule__RDC__Group_4__2 ;
    public final void rule__RDC__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2685:1: ( rule__RDC__Group_4__1__Impl rule__RDC__Group_4__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2686:2: rule__RDC__Group_4__1__Impl rule__RDC__Group_4__2
            {
            pushFollow(FOLLOW_rule__RDC__Group_4__1__Impl_in_rule__RDC__Group_4__15594);
            rule__RDC__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_4__2_in_rule__RDC__Group_4__15597);
            rule__RDC__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_4__1"


    // $ANTLR start "rule__RDC__Group_4__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2693:1: rule__RDC__Group_4__1__Impl : ( '=' ) ;
    public final void rule__RDC__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2697:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2698:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2698:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2699:1: '='
            {
             before(grammarAccess.getRDCAccess().getEqualsSignKeyword_4_1()); 
            match(input,60,FOLLOW_60_in_rule__RDC__Group_4__1__Impl5625); 
             after(grammarAccess.getRDCAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_4__1__Impl"


    // $ANTLR start "rule__RDC__Group_4__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2712:1: rule__RDC__Group_4__2 : rule__RDC__Group_4__2__Impl rule__RDC__Group_4__3 ;
    public final void rule__RDC__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2716:1: ( rule__RDC__Group_4__2__Impl rule__RDC__Group_4__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2717:2: rule__RDC__Group_4__2__Impl rule__RDC__Group_4__3
            {
            pushFollow(FOLLOW_rule__RDC__Group_4__2__Impl_in_rule__RDC__Group_4__25656);
            rule__RDC__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_4__3_in_rule__RDC__Group_4__25659);
            rule__RDC__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_4__2"


    // $ANTLR start "rule__RDC__Group_4__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2724:1: rule__RDC__Group_4__2__Impl : ( ( rule__RDC__PowerSupplyAssignment_4_2 ) ) ;
    public final void rule__RDC__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2728:1: ( ( ( rule__RDC__PowerSupplyAssignment_4_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2729:1: ( ( rule__RDC__PowerSupplyAssignment_4_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2729:1: ( ( rule__RDC__PowerSupplyAssignment_4_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2730:1: ( rule__RDC__PowerSupplyAssignment_4_2 )
            {
             before(grammarAccess.getRDCAccess().getPowerSupplyAssignment_4_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2731:1: ( rule__RDC__PowerSupplyAssignment_4_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2731:2: rule__RDC__PowerSupplyAssignment_4_2
            {
            pushFollow(FOLLOW_rule__RDC__PowerSupplyAssignment_4_2_in_rule__RDC__Group_4__2__Impl5686);
            rule__RDC__PowerSupplyAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRDCAccess().getPowerSupplyAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_4__2__Impl"


    // $ANTLR start "rule__RDC__Group_4__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2741:1: rule__RDC__Group_4__3 : rule__RDC__Group_4__3__Impl ;
    public final void rule__RDC__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2745:1: ( rule__RDC__Group_4__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2746:2: rule__RDC__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group_4__3__Impl_in_rule__RDC__Group_4__35716);
            rule__RDC__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_4__3"


    // $ANTLR start "rule__RDC__Group_4__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2752:1: rule__RDC__Group_4__3__Impl : ( ';' ) ;
    public final void rule__RDC__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2756:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2757:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2757:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2758:1: ';'
            {
             before(grammarAccess.getRDCAccess().getSemicolonKeyword_4_3()); 
            match(input,61,FOLLOW_61_in_rule__RDC__Group_4__3__Impl5744); 
             after(grammarAccess.getRDCAccess().getSemicolonKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_4__3__Impl"


    // $ANTLR start "rule__RDC__Group_5__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2779:1: rule__RDC__Group_5__0 : rule__RDC__Group_5__0__Impl rule__RDC__Group_5__1 ;
    public final void rule__RDC__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2783:1: ( rule__RDC__Group_5__0__Impl rule__RDC__Group_5__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2784:2: rule__RDC__Group_5__0__Impl rule__RDC__Group_5__1
            {
            pushFollow(FOLLOW_rule__RDC__Group_5__0__Impl_in_rule__RDC__Group_5__05783);
            rule__RDC__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_5__1_in_rule__RDC__Group_5__05786);
            rule__RDC__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_5__0"


    // $ANTLR start "rule__RDC__Group_5__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2791:1: rule__RDC__Group_5__0__Impl : ( 'Type' ) ;
    public final void rule__RDC__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2795:1: ( ( 'Type' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2796:1: ( 'Type' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2796:1: ( 'Type' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2797:1: 'Type'
            {
             before(grammarAccess.getRDCAccess().getTypeKeyword_5_0()); 
            match(input,72,FOLLOW_72_in_rule__RDC__Group_5__0__Impl5814); 
             after(grammarAccess.getRDCAccess().getTypeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_5__0__Impl"


    // $ANTLR start "rule__RDC__Group_5__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2810:1: rule__RDC__Group_5__1 : rule__RDC__Group_5__1__Impl rule__RDC__Group_5__2 ;
    public final void rule__RDC__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2814:1: ( rule__RDC__Group_5__1__Impl rule__RDC__Group_5__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2815:2: rule__RDC__Group_5__1__Impl rule__RDC__Group_5__2
            {
            pushFollow(FOLLOW_rule__RDC__Group_5__1__Impl_in_rule__RDC__Group_5__15845);
            rule__RDC__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_5__2_in_rule__RDC__Group_5__15848);
            rule__RDC__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_5__1"


    // $ANTLR start "rule__RDC__Group_5__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2822:1: rule__RDC__Group_5__1__Impl : ( '=' ) ;
    public final void rule__RDC__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2826:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2827:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2827:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2828:1: '='
            {
             before(grammarAccess.getRDCAccess().getEqualsSignKeyword_5_1()); 
            match(input,60,FOLLOW_60_in_rule__RDC__Group_5__1__Impl5876); 
             after(grammarAccess.getRDCAccess().getEqualsSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_5__1__Impl"


    // $ANTLR start "rule__RDC__Group_5__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2841:1: rule__RDC__Group_5__2 : rule__RDC__Group_5__2__Impl rule__RDC__Group_5__3 ;
    public final void rule__RDC__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2845:1: ( rule__RDC__Group_5__2__Impl rule__RDC__Group_5__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2846:2: rule__RDC__Group_5__2__Impl rule__RDC__Group_5__3
            {
            pushFollow(FOLLOW_rule__RDC__Group_5__2__Impl_in_rule__RDC__Group_5__25907);
            rule__RDC__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_5__3_in_rule__RDC__Group_5__25910);
            rule__RDC__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_5__2"


    // $ANTLR start "rule__RDC__Group_5__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2853:1: rule__RDC__Group_5__2__Impl : ( ( rule__RDC__RdcTypeAssignment_5_2 ) ) ;
    public final void rule__RDC__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2857:1: ( ( ( rule__RDC__RdcTypeAssignment_5_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2858:1: ( ( rule__RDC__RdcTypeAssignment_5_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2858:1: ( ( rule__RDC__RdcTypeAssignment_5_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2859:1: ( rule__RDC__RdcTypeAssignment_5_2 )
            {
             before(grammarAccess.getRDCAccess().getRdcTypeAssignment_5_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2860:1: ( rule__RDC__RdcTypeAssignment_5_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2860:2: rule__RDC__RdcTypeAssignment_5_2
            {
            pushFollow(FOLLOW_rule__RDC__RdcTypeAssignment_5_2_in_rule__RDC__Group_5__2__Impl5937);
            rule__RDC__RdcTypeAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRDCAccess().getRdcTypeAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_5__2__Impl"


    // $ANTLR start "rule__RDC__Group_5__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2870:1: rule__RDC__Group_5__3 : rule__RDC__Group_5__3__Impl ;
    public final void rule__RDC__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2874:1: ( rule__RDC__Group_5__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2875:2: rule__RDC__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group_5__3__Impl_in_rule__RDC__Group_5__35967);
            rule__RDC__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_5__3"


    // $ANTLR start "rule__RDC__Group_5__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2881:1: rule__RDC__Group_5__3__Impl : ( ';' ) ;
    public final void rule__RDC__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2885:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2886:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2886:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2887:1: ';'
            {
             before(grammarAccess.getRDCAccess().getSemicolonKeyword_5_3()); 
            match(input,61,FOLLOW_61_in_rule__RDC__Group_5__3__Impl5995); 
             after(grammarAccess.getRDCAccess().getSemicolonKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_5__3__Impl"


    // $ANTLR start "rule__RDC__Group_6__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2908:1: rule__RDC__Group_6__0 : rule__RDC__Group_6__0__Impl rule__RDC__Group_6__1 ;
    public final void rule__RDC__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2912:1: ( rule__RDC__Group_6__0__Impl rule__RDC__Group_6__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2913:2: rule__RDC__Group_6__0__Impl rule__RDC__Group_6__1
            {
            pushFollow(FOLLOW_rule__RDC__Group_6__0__Impl_in_rule__RDC__Group_6__06034);
            rule__RDC__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_6__1_in_rule__RDC__Group_6__06037);
            rule__RDC__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_6__0"


    // $ANTLR start "rule__RDC__Group_6__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2920:1: rule__RDC__Group_6__0__Impl : ( 'ESS' ) ;
    public final void rule__RDC__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2924:1: ( ( 'ESS' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2925:1: ( 'ESS' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2925:1: ( 'ESS' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2926:1: 'ESS'
            {
             before(grammarAccess.getRDCAccess().getESSKeyword_6_0()); 
            match(input,73,FOLLOW_73_in_rule__RDC__Group_6__0__Impl6065); 
             after(grammarAccess.getRDCAccess().getESSKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_6__0__Impl"


    // $ANTLR start "rule__RDC__Group_6__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2939:1: rule__RDC__Group_6__1 : rule__RDC__Group_6__1__Impl rule__RDC__Group_6__2 ;
    public final void rule__RDC__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2943:1: ( rule__RDC__Group_6__1__Impl rule__RDC__Group_6__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2944:2: rule__RDC__Group_6__1__Impl rule__RDC__Group_6__2
            {
            pushFollow(FOLLOW_rule__RDC__Group_6__1__Impl_in_rule__RDC__Group_6__16096);
            rule__RDC__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_6__2_in_rule__RDC__Group_6__16099);
            rule__RDC__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_6__1"


    // $ANTLR start "rule__RDC__Group_6__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2951:1: rule__RDC__Group_6__1__Impl : ( '=' ) ;
    public final void rule__RDC__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2955:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2956:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2956:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2957:1: '='
            {
             before(grammarAccess.getRDCAccess().getEqualsSignKeyword_6_1()); 
            match(input,60,FOLLOW_60_in_rule__RDC__Group_6__1__Impl6127); 
             after(grammarAccess.getRDCAccess().getEqualsSignKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_6__1__Impl"


    // $ANTLR start "rule__RDC__Group_6__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2970:1: rule__RDC__Group_6__2 : rule__RDC__Group_6__2__Impl rule__RDC__Group_6__3 ;
    public final void rule__RDC__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2974:1: ( rule__RDC__Group_6__2__Impl rule__RDC__Group_6__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2975:2: rule__RDC__Group_6__2__Impl rule__RDC__Group_6__3
            {
            pushFollow(FOLLOW_rule__RDC__Group_6__2__Impl_in_rule__RDC__Group_6__26158);
            rule__RDC__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_6__3_in_rule__RDC__Group_6__26161);
            rule__RDC__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_6__2"


    // $ANTLR start "rule__RDC__Group_6__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2982:1: rule__RDC__Group_6__2__Impl : ( ( rule__RDC__EssAssignment_6_2 ) ) ;
    public final void rule__RDC__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2986:1: ( ( ( rule__RDC__EssAssignment_6_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2987:1: ( ( rule__RDC__EssAssignment_6_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2987:1: ( ( rule__RDC__EssAssignment_6_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2988:1: ( rule__RDC__EssAssignment_6_2 )
            {
             before(grammarAccess.getRDCAccess().getEssAssignment_6_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2989:1: ( rule__RDC__EssAssignment_6_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2989:2: rule__RDC__EssAssignment_6_2
            {
            pushFollow(FOLLOW_rule__RDC__EssAssignment_6_2_in_rule__RDC__Group_6__2__Impl6188);
            rule__RDC__EssAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getRDCAccess().getEssAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_6__2__Impl"


    // $ANTLR start "rule__RDC__Group_6__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2999:1: rule__RDC__Group_6__3 : rule__RDC__Group_6__3__Impl ;
    public final void rule__RDC__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3003:1: ( rule__RDC__Group_6__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3004:2: rule__RDC__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group_6__3__Impl_in_rule__RDC__Group_6__36218);
            rule__RDC__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_6__3"


    // $ANTLR start "rule__RDC__Group_6__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3010:1: rule__RDC__Group_6__3__Impl : ( ';' ) ;
    public final void rule__RDC__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3014:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3015:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3015:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3016:1: ';'
            {
             before(grammarAccess.getRDCAccess().getSemicolonKeyword_6_3()); 
            match(input,61,FOLLOW_61_in_rule__RDC__Group_6__3__Impl6246); 
             after(grammarAccess.getRDCAccess().getSemicolonKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_6__3__Impl"


    // $ANTLR start "rule__RDC__Group_8__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3037:1: rule__RDC__Group_8__0 : rule__RDC__Group_8__0__Impl rule__RDC__Group_8__1 ;
    public final void rule__RDC__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3041:1: ( rule__RDC__Group_8__0__Impl rule__RDC__Group_8__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3042:2: rule__RDC__Group_8__0__Impl rule__RDC__Group_8__1
            {
            pushFollow(FOLLOW_rule__RDC__Group_8__0__Impl_in_rule__RDC__Group_8__06285);
            rule__RDC__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_8__1_in_rule__RDC__Group_8__06288);
            rule__RDC__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_8__0"


    // $ANTLR start "rule__RDC__Group_8__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3049:1: rule__RDC__Group_8__0__Impl : ( 'Generic properties' ) ;
    public final void rule__RDC__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3053:1: ( ( 'Generic properties' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3054:1: ( 'Generic properties' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3054:1: ( 'Generic properties' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3055:1: 'Generic properties'
            {
             before(grammarAccess.getRDCAccess().getGenericPropertiesKeyword_8_0()); 
            match(input,70,FOLLOW_70_in_rule__RDC__Group_8__0__Impl6316); 
             after(grammarAccess.getRDCAccess().getGenericPropertiesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_8__0__Impl"


    // $ANTLR start "rule__RDC__Group_8__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3068:1: rule__RDC__Group_8__1 : rule__RDC__Group_8__1__Impl rule__RDC__Group_8__2 ;
    public final void rule__RDC__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3072:1: ( rule__RDC__Group_8__1__Impl rule__RDC__Group_8__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3073:2: rule__RDC__Group_8__1__Impl rule__RDC__Group_8__2
            {
            pushFollow(FOLLOW_rule__RDC__Group_8__1__Impl_in_rule__RDC__Group_8__16347);
            rule__RDC__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_8__2_in_rule__RDC__Group_8__16350);
            rule__RDC__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_8__1"


    // $ANTLR start "rule__RDC__Group_8__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3080:1: rule__RDC__Group_8__1__Impl : ( '{' ) ;
    public final void rule__RDC__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3084:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3085:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3085:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3086:1: '{'
            {
             before(grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,58,FOLLOW_58_in_rule__RDC__Group_8__1__Impl6378); 
             after(grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_8__1__Impl"


    // $ANTLR start "rule__RDC__Group_8__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3099:1: rule__RDC__Group_8__2 : rule__RDC__Group_8__2__Impl rule__RDC__Group_8__3 ;
    public final void rule__RDC__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3103:1: ( rule__RDC__Group_8__2__Impl rule__RDC__Group_8__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3104:2: rule__RDC__Group_8__2__Impl rule__RDC__Group_8__3
            {
            pushFollow(FOLLOW_rule__RDC__Group_8__2__Impl_in_rule__RDC__Group_8__26409);
            rule__RDC__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_8__3_in_rule__RDC__Group_8__26412);
            rule__RDC__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_8__2"


    // $ANTLR start "rule__RDC__Group_8__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3111:1: rule__RDC__Group_8__2__Impl : ( ( rule__RDC__MetricParametersAssignment_8_2 )* ) ;
    public final void rule__RDC__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3115:1: ( ( ( rule__RDC__MetricParametersAssignment_8_2 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3116:1: ( ( rule__RDC__MetricParametersAssignment_8_2 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3116:1: ( ( rule__RDC__MetricParametersAssignment_8_2 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3117:1: ( rule__RDC__MetricParametersAssignment_8_2 )*
            {
             before(grammarAccess.getRDCAccess().getMetricParametersAssignment_8_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3118:1: ( rule__RDC__MetricParametersAssignment_8_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3118:2: rule__RDC__MetricParametersAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__RDC__MetricParametersAssignment_8_2_in_rule__RDC__Group_8__2__Impl6439);
            	    rule__RDC__MetricParametersAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getRDCAccess().getMetricParametersAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_8__2__Impl"


    // $ANTLR start "rule__RDC__Group_8__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3128:1: rule__RDC__Group_8__3 : rule__RDC__Group_8__3__Impl ;
    public final void rule__RDC__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3132:1: ( rule__RDC__Group_8__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3133:2: rule__RDC__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group_8__3__Impl_in_rule__RDC__Group_8__36470);
            rule__RDC__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_8__3"


    // $ANTLR start "rule__RDC__Group_8__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3139:1: rule__RDC__Group_8__3__Impl : ( '}' ) ;
    public final void rule__RDC__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3143:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3144:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3144:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3145:1: '}'
            {
             before(grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_8_3()); 
            match(input,62,FOLLOW_62_in_rule__RDC__Group_8__3__Impl6498); 
             after(grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__Group_8__3__Impl"


    // $ANTLR start "rule__Connector__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3166:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3170:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3171:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_rule__Connector__Group__0__Impl_in_rule__Connector__Group__06537);
            rule__Connector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__1_in_rule__Connector__Group__06540);
            rule__Connector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__0"


    // $ANTLR start "rule__Connector__Group__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3178:1: rule__Connector__Group__0__Impl : ( 'Connector' ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3182:1: ( ( 'Connector' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3183:1: ( 'Connector' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3183:1: ( 'Connector' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3184:1: 'Connector'
            {
             before(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 
            match(input,74,FOLLOW_74_in_rule__Connector__Group__0__Impl6568); 
             after(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__0__Impl"


    // $ANTLR start "rule__Connector__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3197:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3201:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3202:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_rule__Connector__Group__1__Impl_in_rule__Connector__Group__16599);
            rule__Connector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__2_in_rule__Connector__Group__16602);
            rule__Connector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__1"


    // $ANTLR start "rule__Connector__Group__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3209:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__NameAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3213:1: ( ( ( rule__Connector__NameAssignment_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3214:1: ( ( rule__Connector__NameAssignment_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3214:1: ( ( rule__Connector__NameAssignment_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3215:1: ( rule__Connector__NameAssignment_1 )
            {
             before(grammarAccess.getConnectorAccess().getNameAssignment_1()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3216:1: ( rule__Connector__NameAssignment_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3216:2: rule__Connector__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Connector__NameAssignment_1_in_rule__Connector__Group__1__Impl6629);
            rule__Connector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__1__Impl"


    // $ANTLR start "rule__Connector__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3226:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3230:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3231:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_rule__Connector__Group__2__Impl_in_rule__Connector__Group__26659);
            rule__Connector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__3_in_rule__Connector__Group__26662);
            rule__Connector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__2"


    // $ANTLR start "rule__Connector__Group__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3238:1: rule__Connector__Group__2__Impl : ( '{' ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3242:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3243:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3243:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3244:1: '{'
            {
             before(grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_58_in_rule__Connector__Group__2__Impl6690); 
             after(grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__2__Impl"


    // $ANTLR start "rule__Connector__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3257:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3261:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3262:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
            {
            pushFollow(FOLLOW_rule__Connector__Group__3__Impl_in_rule__Connector__Group__36721);
            rule__Connector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__4_in_rule__Connector__Group__36724);
            rule__Connector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__3"


    // $ANTLR start "rule__Connector__Group__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3269:1: rule__Connector__Group__3__Impl : ( ( rule__Connector__AvailableEqInterfacesAssignment_3 )* ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3273:1: ( ( ( rule__Connector__AvailableEqInterfacesAssignment_3 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3274:1: ( ( rule__Connector__AvailableEqInterfacesAssignment_3 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3274:1: ( ( rule__Connector__AvailableEqInterfacesAssignment_3 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3275:1: ( rule__Connector__AvailableEqInterfacesAssignment_3 )*
            {
             before(grammarAccess.getConnectorAccess().getAvailableEqInterfacesAssignment_3()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3276:1: ( rule__Connector__AvailableEqInterfacesAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_INT) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3276:2: rule__Connector__AvailableEqInterfacesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Connector__AvailableEqInterfacesAssignment_3_in_rule__Connector__Group__3__Impl6751);
            	    rule__Connector__AvailableEqInterfacesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getConnectorAccess().getAvailableEqInterfacesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__3__Impl"


    // $ANTLR start "rule__Connector__Group__4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3286:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3290:1: ( rule__Connector__Group__4__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3291:2: rule__Connector__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Connector__Group__4__Impl_in_rule__Connector__Group__46782);
            rule__Connector__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__4"


    // $ANTLR start "rule__Connector__Group__4__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3297:1: rule__Connector__Group__4__Impl : ( '}' ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3301:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3302:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3302:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3303:1: '}'
            {
             before(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_4()); 
            match(input,62,FOLLOW_62_in_rule__Connector__Group__4__Impl6810); 
             after(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__4__Impl"


    // $ANTLR start "rule__AvailableEqInterface__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3326:1: rule__AvailableEqInterface__Group__0 : rule__AvailableEqInterface__Group__0__Impl rule__AvailableEqInterface__Group__1 ;
    public final void rule__AvailableEqInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3330:1: ( rule__AvailableEqInterface__Group__0__Impl rule__AvailableEqInterface__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3331:2: rule__AvailableEqInterface__Group__0__Impl rule__AvailableEqInterface__Group__1
            {
            pushFollow(FOLLOW_rule__AvailableEqInterface__Group__0__Impl_in_rule__AvailableEqInterface__Group__06851);
            rule__AvailableEqInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AvailableEqInterface__Group__1_in_rule__AvailableEqInterface__Group__06854);
            rule__AvailableEqInterface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvailableEqInterface__Group__0"


    // $ANTLR start "rule__AvailableEqInterface__Group__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3338:1: rule__AvailableEqInterface__Group__0__Impl : ( ( rule__AvailableEqInterface__CountAssignment_0 ) ) ;
    public final void rule__AvailableEqInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3342:1: ( ( ( rule__AvailableEqInterface__CountAssignment_0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3343:1: ( ( rule__AvailableEqInterface__CountAssignment_0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3343:1: ( ( rule__AvailableEqInterface__CountAssignment_0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3344:1: ( rule__AvailableEqInterface__CountAssignment_0 )
            {
             before(grammarAccess.getAvailableEqInterfaceAccess().getCountAssignment_0()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3345:1: ( rule__AvailableEqInterface__CountAssignment_0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3345:2: rule__AvailableEqInterface__CountAssignment_0
            {
            pushFollow(FOLLOW_rule__AvailableEqInterface__CountAssignment_0_in_rule__AvailableEqInterface__Group__0__Impl6881);
            rule__AvailableEqInterface__CountAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAvailableEqInterfaceAccess().getCountAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvailableEqInterface__Group__0__Impl"


    // $ANTLR start "rule__AvailableEqInterface__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3355:1: rule__AvailableEqInterface__Group__1 : rule__AvailableEqInterface__Group__1__Impl rule__AvailableEqInterface__Group__2 ;
    public final void rule__AvailableEqInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3359:1: ( rule__AvailableEqInterface__Group__1__Impl rule__AvailableEqInterface__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3360:2: rule__AvailableEqInterface__Group__1__Impl rule__AvailableEqInterface__Group__2
            {
            pushFollow(FOLLOW_rule__AvailableEqInterface__Group__1__Impl_in_rule__AvailableEqInterface__Group__16911);
            rule__AvailableEqInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AvailableEqInterface__Group__2_in_rule__AvailableEqInterface__Group__16914);
            rule__AvailableEqInterface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvailableEqInterface__Group__1"


    // $ANTLR start "rule__AvailableEqInterface__Group__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3367:1: rule__AvailableEqInterface__Group__1__Impl : ( 'interface with type' ) ;
    public final void rule__AvailableEqInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3371:1: ( ( 'interface with type' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3372:1: ( 'interface with type' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3372:1: ( 'interface with type' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3373:1: 'interface with type'
            {
             before(grammarAccess.getAvailableEqInterfaceAccess().getInterfaceWithTypeKeyword_1()); 
            match(input,75,FOLLOW_75_in_rule__AvailableEqInterface__Group__1__Impl6942); 
             after(grammarAccess.getAvailableEqInterfaceAccess().getInterfaceWithTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvailableEqInterface__Group__1__Impl"


    // $ANTLR start "rule__AvailableEqInterface__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3386:1: rule__AvailableEqInterface__Group__2 : rule__AvailableEqInterface__Group__2__Impl rule__AvailableEqInterface__Group__3 ;
    public final void rule__AvailableEqInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3390:1: ( rule__AvailableEqInterface__Group__2__Impl rule__AvailableEqInterface__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3391:2: rule__AvailableEqInterface__Group__2__Impl rule__AvailableEqInterface__Group__3
            {
            pushFollow(FOLLOW_rule__AvailableEqInterface__Group__2__Impl_in_rule__AvailableEqInterface__Group__26973);
            rule__AvailableEqInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AvailableEqInterface__Group__3_in_rule__AvailableEqInterface__Group__26976);
            rule__AvailableEqInterface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvailableEqInterface__Group__2"


    // $ANTLR start "rule__AvailableEqInterface__Group__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3398:1: rule__AvailableEqInterface__Group__2__Impl : ( ( rule__AvailableEqInterface__EqInterfaceTypeAssignment_2 ) ) ;
    public final void rule__AvailableEqInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3402:1: ( ( ( rule__AvailableEqInterface__EqInterfaceTypeAssignment_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3403:1: ( ( rule__AvailableEqInterface__EqInterfaceTypeAssignment_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3403:1: ( ( rule__AvailableEqInterface__EqInterfaceTypeAssignment_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3404:1: ( rule__AvailableEqInterface__EqInterfaceTypeAssignment_2 )
            {
             before(grammarAccess.getAvailableEqInterfaceAccess().getEqInterfaceTypeAssignment_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3405:1: ( rule__AvailableEqInterface__EqInterfaceTypeAssignment_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3405:2: rule__AvailableEqInterface__EqInterfaceTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__AvailableEqInterface__EqInterfaceTypeAssignment_2_in_rule__AvailableEqInterface__Group__2__Impl7003);
            rule__AvailableEqInterface__EqInterfaceTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAvailableEqInterfaceAccess().getEqInterfaceTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvailableEqInterface__Group__2__Impl"


    // $ANTLR start "rule__AvailableEqInterface__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3415:1: rule__AvailableEqInterface__Group__3 : rule__AvailableEqInterface__Group__3__Impl ;
    public final void rule__AvailableEqInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3419:1: ( rule__AvailableEqInterface__Group__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3420:2: rule__AvailableEqInterface__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AvailableEqInterface__Group__3__Impl_in_rule__AvailableEqInterface__Group__37033);
            rule__AvailableEqInterface__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvailableEqInterface__Group__3"


    // $ANTLR start "rule__AvailableEqInterface__Group__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3426:1: rule__AvailableEqInterface__Group__3__Impl : ( ';' ) ;
    public final void rule__AvailableEqInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3430:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3431:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3431:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3432:1: ';'
            {
             before(grammarAccess.getAvailableEqInterfaceAccess().getSemicolonKeyword_3()); 
            match(input,61,FOLLOW_61_in_rule__AvailableEqInterface__Group__3__Impl7061); 
             after(grammarAccess.getAvailableEqInterfaceAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvailableEqInterface__Group__3__Impl"


    // $ANTLR start "rule__EqInterfaceGroup__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3453:1: rule__EqInterfaceGroup__Group__0 : rule__EqInterfaceGroup__Group__0__Impl rule__EqInterfaceGroup__Group__1 ;
    public final void rule__EqInterfaceGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3457:1: ( rule__EqInterfaceGroup__Group__0__Impl rule__EqInterfaceGroup__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3458:2: rule__EqInterfaceGroup__Group__0__Impl rule__EqInterfaceGroup__Group__1
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__0__Impl_in_rule__EqInterfaceGroup__Group__07100);
            rule__EqInterfaceGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__1_in_rule__EqInterfaceGroup__Group__07103);
            rule__EqInterfaceGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__Group__0"


    // $ANTLR start "rule__EqInterfaceGroup__Group__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3465:1: rule__EqInterfaceGroup__Group__0__Impl : ( 'Group' ) ;
    public final void rule__EqInterfaceGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3469:1: ( ( 'Group' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3470:1: ( 'Group' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3470:1: ( 'Group' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3471:1: 'Group'
            {
             before(grammarAccess.getEqInterfaceGroupAccess().getGroupKeyword_0()); 
            match(input,76,FOLLOW_76_in_rule__EqInterfaceGroup__Group__0__Impl7131); 
             after(grammarAccess.getEqInterfaceGroupAccess().getGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__Group__0__Impl"


    // $ANTLR start "rule__EqInterfaceGroup__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3484:1: rule__EqInterfaceGroup__Group__1 : rule__EqInterfaceGroup__Group__1__Impl rule__EqInterfaceGroup__Group__2 ;
    public final void rule__EqInterfaceGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3488:1: ( rule__EqInterfaceGroup__Group__1__Impl rule__EqInterfaceGroup__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3489:2: rule__EqInterfaceGroup__Group__1__Impl rule__EqInterfaceGroup__Group__2
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__1__Impl_in_rule__EqInterfaceGroup__Group__17162);
            rule__EqInterfaceGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__2_in_rule__EqInterfaceGroup__Group__17165);
            rule__EqInterfaceGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__Group__1"


    // $ANTLR start "rule__EqInterfaceGroup__Group__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3496:1: rule__EqInterfaceGroup__Group__1__Impl : ( ( rule__EqInterfaceGroup__NameAssignment_1 ) ) ;
    public final void rule__EqInterfaceGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3500:1: ( ( ( rule__EqInterfaceGroup__NameAssignment_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3501:1: ( ( rule__EqInterfaceGroup__NameAssignment_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3501:1: ( ( rule__EqInterfaceGroup__NameAssignment_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3502:1: ( rule__EqInterfaceGroup__NameAssignment_1 )
            {
             before(grammarAccess.getEqInterfaceGroupAccess().getNameAssignment_1()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3503:1: ( rule__EqInterfaceGroup__NameAssignment_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3503:2: rule__EqInterfaceGroup__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__NameAssignment_1_in_rule__EqInterfaceGroup__Group__1__Impl7192);
            rule__EqInterfaceGroup__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__Group__1__Impl"


    // $ANTLR start "rule__EqInterfaceGroup__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3513:1: rule__EqInterfaceGroup__Group__2 : rule__EqInterfaceGroup__Group__2__Impl rule__EqInterfaceGroup__Group__3 ;
    public final void rule__EqInterfaceGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3517:1: ( rule__EqInterfaceGroup__Group__2__Impl rule__EqInterfaceGroup__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3518:2: rule__EqInterfaceGroup__Group__2__Impl rule__EqInterfaceGroup__Group__3
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__2__Impl_in_rule__EqInterfaceGroup__Group__27222);
            rule__EqInterfaceGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__3_in_rule__EqInterfaceGroup__Group__27225);
            rule__EqInterfaceGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__Group__2"


    // $ANTLR start "rule__EqInterfaceGroup__Group__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3525:1: rule__EqInterfaceGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__EqInterfaceGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3529:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3530:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3530:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3531:1: '{'
            {
             before(grammarAccess.getEqInterfaceGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_58_in_rule__EqInterfaceGroup__Group__2__Impl7253); 
             after(grammarAccess.getEqInterfaceGroupAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__Group__2__Impl"


    // $ANTLR start "rule__EqInterfaceGroup__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3544:1: rule__EqInterfaceGroup__Group__3 : rule__EqInterfaceGroup__Group__3__Impl rule__EqInterfaceGroup__Group__4 ;
    public final void rule__EqInterfaceGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3548:1: ( rule__EqInterfaceGroup__Group__3__Impl rule__EqInterfaceGroup__Group__4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3549:2: rule__EqInterfaceGroup__Group__3__Impl rule__EqInterfaceGroup__Group__4
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__3__Impl_in_rule__EqInterfaceGroup__Group__37284);
            rule__EqInterfaceGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__4_in_rule__EqInterfaceGroup__Group__37287);
            rule__EqInterfaceGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__Group__3"


    // $ANTLR start "rule__EqInterfaceGroup__Group__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3556:1: rule__EqInterfaceGroup__Group__3__Impl : ( ( rule__EqInterfaceGroup__EqInterfacesAssignment_3 ) ) ;
    public final void rule__EqInterfaceGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3560:1: ( ( ( rule__EqInterfaceGroup__EqInterfacesAssignment_3 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3561:1: ( ( rule__EqInterfaceGroup__EqInterfacesAssignment_3 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3561:1: ( ( rule__EqInterfaceGroup__EqInterfacesAssignment_3 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3562:1: ( rule__EqInterfaceGroup__EqInterfacesAssignment_3 )
            {
             before(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesAssignment_3()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3563:1: ( rule__EqInterfaceGroup__EqInterfacesAssignment_3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3563:2: rule__EqInterfaceGroup__EqInterfacesAssignment_3
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__EqInterfacesAssignment_3_in_rule__EqInterfaceGroup__Group__3__Impl7314);
            rule__EqInterfaceGroup__EqInterfacesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__Group__3__Impl"


    // $ANTLR start "rule__EqInterfaceGroup__Group__4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3573:1: rule__EqInterfaceGroup__Group__4 : rule__EqInterfaceGroup__Group__4__Impl rule__EqInterfaceGroup__Group__5 ;
    public final void rule__EqInterfaceGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3577:1: ( rule__EqInterfaceGroup__Group__4__Impl rule__EqInterfaceGroup__Group__5 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3578:2: rule__EqInterfaceGroup__Group__4__Impl rule__EqInterfaceGroup__Group__5
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__4__Impl_in_rule__EqInterfaceGroup__Group__47344);
            rule__EqInterfaceGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__5_in_rule__EqInterfaceGroup__Group__47347);
            rule__EqInterfaceGroup__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__Group__4"


    // $ANTLR start "rule__EqInterfaceGroup__Group__4__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3585:1: rule__EqInterfaceGroup__Group__4__Impl : ( ( ( rule__EqInterfaceGroup__Group_4__0 ) ) ( ( rule__EqInterfaceGroup__Group_4__0 )* ) ) ;
    public final void rule__EqInterfaceGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3589:1: ( ( ( ( rule__EqInterfaceGroup__Group_4__0 ) ) ( ( rule__EqInterfaceGroup__Group_4__0 )* ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3590:1: ( ( ( rule__EqInterfaceGroup__Group_4__0 ) ) ( ( rule__EqInterfaceGroup__Group_4__0 )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3590:1: ( ( ( rule__EqInterfaceGroup__Group_4__0 ) ) ( ( rule__EqInterfaceGroup__Group_4__0 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3591:1: ( ( rule__EqInterfaceGroup__Group_4__0 ) ) ( ( rule__EqInterfaceGroup__Group_4__0 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3591:1: ( ( rule__EqInterfaceGroup__Group_4__0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3592:1: ( rule__EqInterfaceGroup__Group_4__0 )
            {
             before(grammarAccess.getEqInterfaceGroupAccess().getGroup_4()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3593:1: ( rule__EqInterfaceGroup__Group_4__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3593:2: rule__EqInterfaceGroup__Group_4__0
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group_4__0_in_rule__EqInterfaceGroup__Group__4__Impl7376);
            rule__EqInterfaceGroup__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceGroupAccess().getGroup_4()); 

            }

            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3596:1: ( ( rule__EqInterfaceGroup__Group_4__0 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3597:1: ( rule__EqInterfaceGroup__Group_4__0 )*
            {
             before(grammarAccess.getEqInterfaceGroupAccess().getGroup_4()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3598:1: ( rule__EqInterfaceGroup__Group_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==77) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3598:2: rule__EqInterfaceGroup__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EqInterfaceGroup__Group_4__0_in_rule__EqInterfaceGroup__Group__4__Impl7388);
            	    rule__EqInterfaceGroup__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getEqInterfaceGroupAccess().getGroup_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__Group__4__Impl"


    // $ANTLR start "rule__EqInterfaceGroup__Group__5"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3609:1: rule__EqInterfaceGroup__Group__5 : rule__EqInterfaceGroup__Group__5__Impl ;
    public final void rule__EqInterfaceGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3613:1: ( rule__EqInterfaceGroup__Group__5__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3614:2: rule__EqInterfaceGroup__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__5__Impl_in_rule__EqInterfaceGroup__Group__57421);
            rule__EqInterfaceGroup__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__Group__5"


    // $ANTLR start "rule__EqInterfaceGroup__Group__5__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3620:1: rule__EqInterfaceGroup__Group__5__Impl : ( '}' ) ;
    public final void rule__EqInterfaceGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3624:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3625:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3625:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3626:1: '}'
            {
             before(grammarAccess.getEqInterfaceGroupAccess().getRightCurlyBracketKeyword_5()); 
            match(input,62,FOLLOW_62_in_rule__EqInterfaceGroup__Group__5__Impl7449); 
             after(grammarAccess.getEqInterfaceGroupAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__Group__5__Impl"


    // $ANTLR start "rule__EqInterfaceGroup__Group_4__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3651:1: rule__EqInterfaceGroup__Group_4__0 : rule__EqInterfaceGroup__Group_4__0__Impl rule__EqInterfaceGroup__Group_4__1 ;
    public final void rule__EqInterfaceGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3655:1: ( rule__EqInterfaceGroup__Group_4__0__Impl rule__EqInterfaceGroup__Group_4__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3656:2: rule__EqInterfaceGroup__Group_4__0__Impl rule__EqInterfaceGroup__Group_4__1
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group_4__0__Impl_in_rule__EqInterfaceGroup__Group_4__07492);
            rule__EqInterfaceGroup__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group_4__1_in_rule__EqInterfaceGroup__Group_4__07495);
            rule__EqInterfaceGroup__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__Group_4__0"


    // $ANTLR start "rule__EqInterfaceGroup__Group_4__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3663:1: rule__EqInterfaceGroup__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EqInterfaceGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3667:1: ( ( ',' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3668:1: ( ',' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3668:1: ( ',' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3669:1: ','
            {
             before(grammarAccess.getEqInterfaceGroupAccess().getCommaKeyword_4_0()); 
            match(input,77,FOLLOW_77_in_rule__EqInterfaceGroup__Group_4__0__Impl7523); 
             after(grammarAccess.getEqInterfaceGroupAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__Group_4__0__Impl"


    // $ANTLR start "rule__EqInterfaceGroup__Group_4__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3682:1: rule__EqInterfaceGroup__Group_4__1 : rule__EqInterfaceGroup__Group_4__1__Impl ;
    public final void rule__EqInterfaceGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3686:1: ( rule__EqInterfaceGroup__Group_4__1__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3687:2: rule__EqInterfaceGroup__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group_4__1__Impl_in_rule__EqInterfaceGroup__Group_4__17554);
            rule__EqInterfaceGroup__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__Group_4__1"


    // $ANTLR start "rule__EqInterfaceGroup__Group_4__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3693:1: rule__EqInterfaceGroup__Group_4__1__Impl : ( ( rule__EqInterfaceGroup__EqInterfacesAssignment_4_1 ) ) ;
    public final void rule__EqInterfaceGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3697:1: ( ( ( rule__EqInterfaceGroup__EqInterfacesAssignment_4_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3698:1: ( ( rule__EqInterfaceGroup__EqInterfacesAssignment_4_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3698:1: ( ( rule__EqInterfaceGroup__EqInterfacesAssignment_4_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3699:1: ( rule__EqInterfaceGroup__EqInterfacesAssignment_4_1 )
            {
             before(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesAssignment_4_1()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3700:1: ( rule__EqInterfaceGroup__EqInterfacesAssignment_4_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3700:2: rule__EqInterfaceGroup__EqInterfacesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__EqInterfacesAssignment_4_1_in_rule__EqInterfaceGroup__Group_4__1__Impl7581);
            rule__EqInterfaceGroup__EqInterfacesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__Group_4__1__Impl"


    // $ANTLR start "rule__EqInterface__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3714:1: rule__EqInterface__Group__0 : rule__EqInterface__Group__0__Impl rule__EqInterface__Group__1 ;
    public final void rule__EqInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3718:1: ( rule__EqInterface__Group__0__Impl rule__EqInterface__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3719:2: rule__EqInterface__Group__0__Impl rule__EqInterface__Group__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__0__Impl_in_rule__EqInterface__Group__07615);
            rule__EqInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group__1_in_rule__EqInterface__Group__07618);
            rule__EqInterface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__0"


    // $ANTLR start "rule__EqInterface__Group__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3726:1: rule__EqInterface__Group__0__Impl : ( 'Interface' ) ;
    public final void rule__EqInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3730:1: ( ( 'Interface' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3731:1: ( 'Interface' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3731:1: ( 'Interface' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3732:1: 'Interface'
            {
             before(grammarAccess.getEqInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,78,FOLLOW_78_in_rule__EqInterface__Group__0__Impl7646); 
             after(grammarAccess.getEqInterfaceAccess().getInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__0__Impl"


    // $ANTLR start "rule__EqInterface__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3745:1: rule__EqInterface__Group__1 : rule__EqInterface__Group__1__Impl rule__EqInterface__Group__2 ;
    public final void rule__EqInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3749:1: ( rule__EqInterface__Group__1__Impl rule__EqInterface__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3750:2: rule__EqInterface__Group__1__Impl rule__EqInterface__Group__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__1__Impl_in_rule__EqInterface__Group__17677);
            rule__EqInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group__2_in_rule__EqInterface__Group__17680);
            rule__EqInterface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__1"


    // $ANTLR start "rule__EqInterface__Group__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3757:1: rule__EqInterface__Group__1__Impl : ( ( rule__EqInterface__NameAssignment_1 ) ) ;
    public final void rule__EqInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3761:1: ( ( ( rule__EqInterface__NameAssignment_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3762:1: ( ( rule__EqInterface__NameAssignment_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3762:1: ( ( rule__EqInterface__NameAssignment_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3763:1: ( rule__EqInterface__NameAssignment_1 )
            {
             before(grammarAccess.getEqInterfaceAccess().getNameAssignment_1()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3764:1: ( rule__EqInterface__NameAssignment_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3764:2: rule__EqInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EqInterface__NameAssignment_1_in_rule__EqInterface__Group__1__Impl7707);
            rule__EqInterface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__1__Impl"


    // $ANTLR start "rule__EqInterface__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3774:1: rule__EqInterface__Group__2 : rule__EqInterface__Group__2__Impl rule__EqInterface__Group__3 ;
    public final void rule__EqInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3778:1: ( rule__EqInterface__Group__2__Impl rule__EqInterface__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3779:2: rule__EqInterface__Group__2__Impl rule__EqInterface__Group__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__2__Impl_in_rule__EqInterface__Group__27737);
            rule__EqInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group__3_in_rule__EqInterface__Group__27740);
            rule__EqInterface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__2"


    // $ANTLR start "rule__EqInterface__Group__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3786:1: rule__EqInterface__Group__2__Impl : ( '{' ) ;
    public final void rule__EqInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3790:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3791:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3791:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3792:1: '{'
            {
             before(grammarAccess.getEqInterfaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_58_in_rule__EqInterface__Group__2__Impl7768); 
             after(grammarAccess.getEqInterfaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__2__Impl"


    // $ANTLR start "rule__EqInterface__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3805:1: rule__EqInterface__Group__3 : rule__EqInterface__Group__3__Impl rule__EqInterface__Group__4 ;
    public final void rule__EqInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3809:1: ( rule__EqInterface__Group__3__Impl rule__EqInterface__Group__4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3810:2: rule__EqInterface__Group__3__Impl rule__EqInterface__Group__4
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__3__Impl_in_rule__EqInterface__Group__37799);
            rule__EqInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group__4_in_rule__EqInterface__Group__37802);
            rule__EqInterface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__3"


    // $ANTLR start "rule__EqInterface__Group__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3817:1: rule__EqInterface__Group__3__Impl : ( ( rule__EqInterface__Group_3__0 )? ) ;
    public final void rule__EqInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3821:1: ( ( ( rule__EqInterface__Group_3__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3822:1: ( ( rule__EqInterface__Group_3__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3822:1: ( ( rule__EqInterface__Group_3__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3823:1: ( rule__EqInterface__Group_3__0 )?
            {
             before(grammarAccess.getEqInterfaceAccess().getGroup_3()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3824:1: ( rule__EqInterface__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==79) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3824:2: rule__EqInterface__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_3__0_in_rule__EqInterface__Group__3__Impl7829);
                    rule__EqInterface__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEqInterfaceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__3__Impl"


    // $ANTLR start "rule__EqInterface__Group__4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3834:1: rule__EqInterface__Group__4 : rule__EqInterface__Group__4__Impl rule__EqInterface__Group__5 ;
    public final void rule__EqInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3838:1: ( rule__EqInterface__Group__4__Impl rule__EqInterface__Group__5 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3839:2: rule__EqInterface__Group__4__Impl rule__EqInterface__Group__5
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__4__Impl_in_rule__EqInterface__Group__47860);
            rule__EqInterface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group__5_in_rule__EqInterface__Group__47863);
            rule__EqInterface__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__4"


    // $ANTLR start "rule__EqInterface__Group__4__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3846:1: rule__EqInterface__Group__4__Impl : ( ( rule__EqInterface__Group_4__0 )? ) ;
    public final void rule__EqInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3850:1: ( ( ( rule__EqInterface__Group_4__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3851:1: ( ( rule__EqInterface__Group_4__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3851:1: ( ( rule__EqInterface__Group_4__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3852:1: ( rule__EqInterface__Group_4__0 )?
            {
             before(grammarAccess.getEqInterfaceAccess().getGroup_4()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3853:1: ( rule__EqInterface__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==80) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3853:2: rule__EqInterface__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_4__0_in_rule__EqInterface__Group__4__Impl7890);
                    rule__EqInterface__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEqInterfaceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__4__Impl"


    // $ANTLR start "rule__EqInterface__Group__5"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3863:1: rule__EqInterface__Group__5 : rule__EqInterface__Group__5__Impl rule__EqInterface__Group__6 ;
    public final void rule__EqInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3867:1: ( rule__EqInterface__Group__5__Impl rule__EqInterface__Group__6 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3868:2: rule__EqInterface__Group__5__Impl rule__EqInterface__Group__6
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__5__Impl_in_rule__EqInterface__Group__57921);
            rule__EqInterface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group__6_in_rule__EqInterface__Group__57924);
            rule__EqInterface__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__5"


    // $ANTLR start "rule__EqInterface__Group__5__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3875:1: rule__EqInterface__Group__5__Impl : ( ( rule__EqInterface__Group_5__0 )? ) ;
    public final void rule__EqInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3879:1: ( ( ( rule__EqInterface__Group_5__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3880:1: ( ( rule__EqInterface__Group_5__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3880:1: ( ( rule__EqInterface__Group_5__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3881:1: ( rule__EqInterface__Group_5__0 )?
            {
             before(grammarAccess.getEqInterfaceAccess().getGroup_5()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3882:1: ( rule__EqInterface__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==81) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3882:2: rule__EqInterface__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_5__0_in_rule__EqInterface__Group__5__Impl7951);
                    rule__EqInterface__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEqInterfaceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__5__Impl"


    // $ANTLR start "rule__EqInterface__Group__6"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3892:1: rule__EqInterface__Group__6 : rule__EqInterface__Group__6__Impl rule__EqInterface__Group__7 ;
    public final void rule__EqInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3896:1: ( rule__EqInterface__Group__6__Impl rule__EqInterface__Group__7 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3897:2: rule__EqInterface__Group__6__Impl rule__EqInterface__Group__7
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__6__Impl_in_rule__EqInterface__Group__67982);
            rule__EqInterface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group__7_in_rule__EqInterface__Group__67985);
            rule__EqInterface__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__6"


    // $ANTLR start "rule__EqInterface__Group__6__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3904:1: rule__EqInterface__Group__6__Impl : ( ( rule__EqInterface__Group_6__0 )? ) ;
    public final void rule__EqInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3908:1: ( ( ( rule__EqInterface__Group_6__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3909:1: ( ( rule__EqInterface__Group_6__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3909:1: ( ( rule__EqInterface__Group_6__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3910:1: ( rule__EqInterface__Group_6__0 )?
            {
             before(grammarAccess.getEqInterfaceAccess().getGroup_6()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3911:1: ( rule__EqInterface__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==82) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3911:2: rule__EqInterface__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_6__0_in_rule__EqInterface__Group__6__Impl8012);
                    rule__EqInterface__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEqInterfaceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__6__Impl"


    // $ANTLR start "rule__EqInterface__Group__7"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3921:1: rule__EqInterface__Group__7 : rule__EqInterface__Group__7__Impl rule__EqInterface__Group__8 ;
    public final void rule__EqInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3925:1: ( rule__EqInterface__Group__7__Impl rule__EqInterface__Group__8 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3926:2: rule__EqInterface__Group__7__Impl rule__EqInterface__Group__8
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__7__Impl_in_rule__EqInterface__Group__78043);
            rule__EqInterface__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group__8_in_rule__EqInterface__Group__78046);
            rule__EqInterface__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__7"


    // $ANTLR start "rule__EqInterface__Group__7__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3933:1: rule__EqInterface__Group__7__Impl : ( ( rule__EqInterface__Group_7__0 )? ) ;
    public final void rule__EqInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3937:1: ( ( ( rule__EqInterface__Group_7__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3938:1: ( ( rule__EqInterface__Group_7__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3938:1: ( ( rule__EqInterface__Group_7__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3939:1: ( rule__EqInterface__Group_7__0 )?
            {
             before(grammarAccess.getEqInterfaceAccess().getGroup_7()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3940:1: ( rule__EqInterface__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==83) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3940:2: rule__EqInterface__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_7__0_in_rule__EqInterface__Group__7__Impl8073);
                    rule__EqInterface__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEqInterfaceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__7__Impl"


    // $ANTLR start "rule__EqInterface__Group__8"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3950:1: rule__EqInterface__Group__8 : rule__EqInterface__Group__8__Impl rule__EqInterface__Group__9 ;
    public final void rule__EqInterface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3954:1: ( rule__EqInterface__Group__8__Impl rule__EqInterface__Group__9 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3955:2: rule__EqInterface__Group__8__Impl rule__EqInterface__Group__9
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__8__Impl_in_rule__EqInterface__Group__88104);
            rule__EqInterface__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group__9_in_rule__EqInterface__Group__88107);
            rule__EqInterface__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__8"


    // $ANTLR start "rule__EqInterface__Group__8__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3962:1: rule__EqInterface__Group__8__Impl : ( ( rule__EqInterface__Group_8__0 )? ) ;
    public final void rule__EqInterface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3966:1: ( ( ( rule__EqInterface__Group_8__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3967:1: ( ( rule__EqInterface__Group_8__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3967:1: ( ( rule__EqInterface__Group_8__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3968:1: ( rule__EqInterface__Group_8__0 )?
            {
             before(grammarAccess.getEqInterfaceAccess().getGroup_8()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3969:1: ( rule__EqInterface__Group_8__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==84) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3969:2: rule__EqInterface__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_8__0_in_rule__EqInterface__Group__8__Impl8134);
                    rule__EqInterface__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEqInterfaceAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__8__Impl"


    // $ANTLR start "rule__EqInterface__Group__9"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3979:1: rule__EqInterface__Group__9 : rule__EqInterface__Group__9__Impl rule__EqInterface__Group__10 ;
    public final void rule__EqInterface__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3983:1: ( rule__EqInterface__Group__9__Impl rule__EqInterface__Group__10 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3984:2: rule__EqInterface__Group__9__Impl rule__EqInterface__Group__10
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__9__Impl_in_rule__EqInterface__Group__98165);
            rule__EqInterface__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group__10_in_rule__EqInterface__Group__98168);
            rule__EqInterface__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__9"


    // $ANTLR start "rule__EqInterface__Group__9__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3991:1: rule__EqInterface__Group__9__Impl : ( ( rule__EqInterface__Group_9__0 )? ) ;
    public final void rule__EqInterface__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3995:1: ( ( ( rule__EqInterface__Group_9__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3996:1: ( ( rule__EqInterface__Group_9__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3996:1: ( ( rule__EqInterface__Group_9__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3997:1: ( rule__EqInterface__Group_9__0 )?
            {
             before(grammarAccess.getEqInterfaceAccess().getGroup_9()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3998:1: ( rule__EqInterface__Group_9__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==85) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3998:2: rule__EqInterface__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_9__0_in_rule__EqInterface__Group__9__Impl8195);
                    rule__EqInterface__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEqInterfaceAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__9__Impl"


    // $ANTLR start "rule__EqInterface__Group__10"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4008:1: rule__EqInterface__Group__10 : rule__EqInterface__Group__10__Impl rule__EqInterface__Group__11 ;
    public final void rule__EqInterface__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4012:1: ( rule__EqInterface__Group__10__Impl rule__EqInterface__Group__11 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4013:2: rule__EqInterface__Group__10__Impl rule__EqInterface__Group__11
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__10__Impl_in_rule__EqInterface__Group__108226);
            rule__EqInterface__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group__11_in_rule__EqInterface__Group__108229);
            rule__EqInterface__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__10"


    // $ANTLR start "rule__EqInterface__Group__10__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4020:1: rule__EqInterface__Group__10__Impl : ( ( rule__EqInterface__Group_10__0 )? ) ;
    public final void rule__EqInterface__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4024:1: ( ( ( rule__EqInterface__Group_10__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4025:1: ( ( rule__EqInterface__Group_10__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4025:1: ( ( rule__EqInterface__Group_10__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4026:1: ( rule__EqInterface__Group_10__0 )?
            {
             before(grammarAccess.getEqInterfaceAccess().getGroup_10()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4027:1: ( rule__EqInterface__Group_10__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==86) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4027:2: rule__EqInterface__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_10__0_in_rule__EqInterface__Group__10__Impl8256);
                    rule__EqInterface__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEqInterfaceAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__10__Impl"


    // $ANTLR start "rule__EqInterface__Group__11"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4037:1: rule__EqInterface__Group__11 : rule__EqInterface__Group__11__Impl rule__EqInterface__Group__12 ;
    public final void rule__EqInterface__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4041:1: ( rule__EqInterface__Group__11__Impl rule__EqInterface__Group__12 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4042:2: rule__EqInterface__Group__11__Impl rule__EqInterface__Group__12
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__11__Impl_in_rule__EqInterface__Group__118287);
            rule__EqInterface__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group__12_in_rule__EqInterface__Group__118290);
            rule__EqInterface__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__11"


    // $ANTLR start "rule__EqInterface__Group__11__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4049:1: rule__EqInterface__Group__11__Impl : ( ( rule__EqInterface__Group_11__0 )? ) ;
    public final void rule__EqInterface__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4053:1: ( ( ( rule__EqInterface__Group_11__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4054:1: ( ( rule__EqInterface__Group_11__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4054:1: ( ( rule__EqInterface__Group_11__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4055:1: ( rule__EqInterface__Group_11__0 )?
            {
             before(grammarAccess.getEqInterfaceAccess().getGroup_11()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4056:1: ( rule__EqInterface__Group_11__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==87) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4056:2: rule__EqInterface__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_11__0_in_rule__EqInterface__Group__11__Impl8317);
                    rule__EqInterface__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEqInterfaceAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__11__Impl"


    // $ANTLR start "rule__EqInterface__Group__12"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4066:1: rule__EqInterface__Group__12 : rule__EqInterface__Group__12__Impl rule__EqInterface__Group__13 ;
    public final void rule__EqInterface__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4070:1: ( rule__EqInterface__Group__12__Impl rule__EqInterface__Group__13 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4071:2: rule__EqInterface__Group__12__Impl rule__EqInterface__Group__13
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__12__Impl_in_rule__EqInterface__Group__128348);
            rule__EqInterface__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group__13_in_rule__EqInterface__Group__128351);
            rule__EqInterface__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__12"


    // $ANTLR start "rule__EqInterface__Group__12__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4078:1: rule__EqInterface__Group__12__Impl : ( ( rule__EqInterface__Group_12__0 )? ) ;
    public final void rule__EqInterface__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4082:1: ( ( ( rule__EqInterface__Group_12__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4083:1: ( ( rule__EqInterface__Group_12__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4083:1: ( ( rule__EqInterface__Group_12__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4084:1: ( rule__EqInterface__Group_12__0 )?
            {
             before(grammarAccess.getEqInterfaceAccess().getGroup_12()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4085:1: ( rule__EqInterface__Group_12__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==72) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4085:2: rule__EqInterface__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_12__0_in_rule__EqInterface__Group__12__Impl8378);
                    rule__EqInterface__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEqInterfaceAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__12__Impl"


    // $ANTLR start "rule__EqInterface__Group__13"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4095:1: rule__EqInterface__Group__13 : rule__EqInterface__Group__13__Impl rule__EqInterface__Group__14 ;
    public final void rule__EqInterface__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4099:1: ( rule__EqInterface__Group__13__Impl rule__EqInterface__Group__14 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4100:2: rule__EqInterface__Group__13__Impl rule__EqInterface__Group__14
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__13__Impl_in_rule__EqInterface__Group__138409);
            rule__EqInterface__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group__14_in_rule__EqInterface__Group__138412);
            rule__EqInterface__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__13"


    // $ANTLR start "rule__EqInterface__Group__13__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4107:1: rule__EqInterface__Group__13__Impl : ( ( rule__EqInterface__Group_13__0 )? ) ;
    public final void rule__EqInterface__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4111:1: ( ( ( rule__EqInterface__Group_13__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4112:1: ( ( rule__EqInterface__Group_13__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4112:1: ( ( rule__EqInterface__Group_13__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4113:1: ( rule__EqInterface__Group_13__0 )?
            {
             before(grammarAccess.getEqInterfaceAccess().getGroup_13()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4114:1: ( rule__EqInterface__Group_13__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==70) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4114:2: rule__EqInterface__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_13__0_in_rule__EqInterface__Group__13__Impl8439);
                    rule__EqInterface__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEqInterfaceAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__13__Impl"


    // $ANTLR start "rule__EqInterface__Group__14"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4124:1: rule__EqInterface__Group__14 : rule__EqInterface__Group__14__Impl ;
    public final void rule__EqInterface__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4128:1: ( rule__EqInterface__Group__14__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4129:2: rule__EqInterface__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__14__Impl_in_rule__EqInterface__Group__148470);
            rule__EqInterface__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__14"


    // $ANTLR start "rule__EqInterface__Group__14__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4135:1: rule__EqInterface__Group__14__Impl : ( '}' ) ;
    public final void rule__EqInterface__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4139:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4140:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4140:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4141:1: '}'
            {
             before(grammarAccess.getEqInterfaceAccess().getRightCurlyBracketKeyword_14()); 
            match(input,62,FOLLOW_62_in_rule__EqInterface__Group__14__Impl8498); 
             after(grammarAccess.getEqInterfaceAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group__14__Impl"


    // $ANTLR start "rule__EqInterface__Group_3__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4184:1: rule__EqInterface__Group_3__0 : rule__EqInterface__Group_3__0__Impl rule__EqInterface__Group_3__1 ;
    public final void rule__EqInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4188:1: ( rule__EqInterface__Group_3__0__Impl rule__EqInterface__Group_3__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4189:2: rule__EqInterface__Group_3__0__Impl rule__EqInterface__Group_3__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_3__0__Impl_in_rule__EqInterface__Group_3__08559);
            rule__EqInterface__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_3__1_in_rule__EqInterface__Group_3__08562);
            rule__EqInterface__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_3__0"


    // $ANTLR start "rule__EqInterface__Group_3__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4196:1: rule__EqInterface__Group_3__0__Impl : ( 'InterfaceSystem' ) ;
    public final void rule__EqInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4200:1: ( ( 'InterfaceSystem' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4201:1: ( 'InterfaceSystem' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4201:1: ( 'InterfaceSystem' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4202:1: 'InterfaceSystem'
            {
             before(grammarAccess.getEqInterfaceAccess().getInterfaceSystemKeyword_3_0()); 
            match(input,79,FOLLOW_79_in_rule__EqInterface__Group_3__0__Impl8590); 
             after(grammarAccess.getEqInterfaceAccess().getInterfaceSystemKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_3__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_3__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4215:1: rule__EqInterface__Group_3__1 : rule__EqInterface__Group_3__1__Impl rule__EqInterface__Group_3__2 ;
    public final void rule__EqInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4219:1: ( rule__EqInterface__Group_3__1__Impl rule__EqInterface__Group_3__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4220:2: rule__EqInterface__Group_3__1__Impl rule__EqInterface__Group_3__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_3__1__Impl_in_rule__EqInterface__Group_3__18621);
            rule__EqInterface__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_3__2_in_rule__EqInterface__Group_3__18624);
            rule__EqInterface__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_3__1"


    // $ANTLR start "rule__EqInterface__Group_3__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4227:1: rule__EqInterface__Group_3__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4231:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4232:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4232:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4233:1: '='
            {
             before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_1()); 
            match(input,60,FOLLOW_60_in_rule__EqInterface__Group_3__1__Impl8652); 
             after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_3__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_3__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4246:1: rule__EqInterface__Group_3__2 : rule__EqInterface__Group_3__2__Impl rule__EqInterface__Group_3__3 ;
    public final void rule__EqInterface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4250:1: ( rule__EqInterface__Group_3__2__Impl rule__EqInterface__Group_3__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4251:2: rule__EqInterface__Group_3__2__Impl rule__EqInterface__Group_3__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_3__2__Impl_in_rule__EqInterface__Group_3__28683);
            rule__EqInterface__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_3__3_in_rule__EqInterface__Group_3__28686);
            rule__EqInterface__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_3__2"


    // $ANTLR start "rule__EqInterface__Group_3__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4258:1: rule__EqInterface__Group_3__2__Impl : ( ( rule__EqInterface__SystemAssignment_3_2 ) ) ;
    public final void rule__EqInterface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4262:1: ( ( ( rule__EqInterface__SystemAssignment_3_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4263:1: ( ( rule__EqInterface__SystemAssignment_3_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4263:1: ( ( rule__EqInterface__SystemAssignment_3_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4264:1: ( rule__EqInterface__SystemAssignment_3_2 )
            {
             before(grammarAccess.getEqInterfaceAccess().getSystemAssignment_3_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4265:1: ( rule__EqInterface__SystemAssignment_3_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4265:2: rule__EqInterface__SystemAssignment_3_2
            {
            pushFollow(FOLLOW_rule__EqInterface__SystemAssignment_3_2_in_rule__EqInterface__Group_3__2__Impl8713);
            rule__EqInterface__SystemAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceAccess().getSystemAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_3__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_3__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4275:1: rule__EqInterface__Group_3__3 : rule__EqInterface__Group_3__3__Impl ;
    public final void rule__EqInterface__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4279:1: ( rule__EqInterface__Group_3__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4280:2: rule__EqInterface__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_3__3__Impl_in_rule__EqInterface__Group_3__38743);
            rule__EqInterface__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_3__3"


    // $ANTLR start "rule__EqInterface__Group_3__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4286:1: rule__EqInterface__Group_3__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4290:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4291:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4291:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4292:1: ';'
            {
             before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_3()); 
            match(input,61,FOLLOW_61_in_rule__EqInterface__Group_3__3__Impl8771); 
             after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_3__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_4__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4313:1: rule__EqInterface__Group_4__0 : rule__EqInterface__Group_4__0__Impl rule__EqInterface__Group_4__1 ;
    public final void rule__EqInterface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4317:1: ( rule__EqInterface__Group_4__0__Impl rule__EqInterface__Group_4__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4318:2: rule__EqInterface__Group_4__0__Impl rule__EqInterface__Group_4__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_4__0__Impl_in_rule__EqInterface__Group_4__08810);
            rule__EqInterface__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_4__1_in_rule__EqInterface__Group_4__08813);
            rule__EqInterface__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_4__0"


    // $ANTLR start "rule__EqInterface__Group_4__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4325:1: rule__EqInterface__Group_4__0__Impl : ( 'SubAta' ) ;
    public final void rule__EqInterface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4329:1: ( ( 'SubAta' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4330:1: ( 'SubAta' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4330:1: ( 'SubAta' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4331:1: 'SubAta'
            {
             before(grammarAccess.getEqInterfaceAccess().getSubAtaKeyword_4_0()); 
            match(input,80,FOLLOW_80_in_rule__EqInterface__Group_4__0__Impl8841); 
             after(grammarAccess.getEqInterfaceAccess().getSubAtaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_4__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_4__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4344:1: rule__EqInterface__Group_4__1 : rule__EqInterface__Group_4__1__Impl rule__EqInterface__Group_4__2 ;
    public final void rule__EqInterface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4348:1: ( rule__EqInterface__Group_4__1__Impl rule__EqInterface__Group_4__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4349:2: rule__EqInterface__Group_4__1__Impl rule__EqInterface__Group_4__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_4__1__Impl_in_rule__EqInterface__Group_4__18872);
            rule__EqInterface__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_4__2_in_rule__EqInterface__Group_4__18875);
            rule__EqInterface__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_4__1"


    // $ANTLR start "rule__EqInterface__Group_4__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4356:1: rule__EqInterface__Group_4__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4360:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4361:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4361:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4362:1: '='
            {
             before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_4_1()); 
            match(input,60,FOLLOW_60_in_rule__EqInterface__Group_4__1__Impl8903); 
             after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_4__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_4__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4375:1: rule__EqInterface__Group_4__2 : rule__EqInterface__Group_4__2__Impl rule__EqInterface__Group_4__3 ;
    public final void rule__EqInterface__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4379:1: ( rule__EqInterface__Group_4__2__Impl rule__EqInterface__Group_4__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4380:2: rule__EqInterface__Group_4__2__Impl rule__EqInterface__Group_4__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_4__2__Impl_in_rule__EqInterface__Group_4__28934);
            rule__EqInterface__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_4__3_in_rule__EqInterface__Group_4__28937);
            rule__EqInterface__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_4__2"


    // $ANTLR start "rule__EqInterface__Group_4__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4387:1: rule__EqInterface__Group_4__2__Impl : ( ( rule__EqInterface__SubAtaAssignment_4_2 ) ) ;
    public final void rule__EqInterface__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4391:1: ( ( ( rule__EqInterface__SubAtaAssignment_4_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4392:1: ( ( rule__EqInterface__SubAtaAssignment_4_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4392:1: ( ( rule__EqInterface__SubAtaAssignment_4_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4393:1: ( rule__EqInterface__SubAtaAssignment_4_2 )
            {
             before(grammarAccess.getEqInterfaceAccess().getSubAtaAssignment_4_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4394:1: ( rule__EqInterface__SubAtaAssignment_4_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4394:2: rule__EqInterface__SubAtaAssignment_4_2
            {
            pushFollow(FOLLOW_rule__EqInterface__SubAtaAssignment_4_2_in_rule__EqInterface__Group_4__2__Impl8964);
            rule__EqInterface__SubAtaAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceAccess().getSubAtaAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_4__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_4__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4404:1: rule__EqInterface__Group_4__3 : rule__EqInterface__Group_4__3__Impl ;
    public final void rule__EqInterface__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4408:1: ( rule__EqInterface__Group_4__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4409:2: rule__EqInterface__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_4__3__Impl_in_rule__EqInterface__Group_4__38994);
            rule__EqInterface__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_4__3"


    // $ANTLR start "rule__EqInterface__Group_4__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4415:1: rule__EqInterface__Group_4__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4419:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4420:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4420:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4421:1: ';'
            {
             before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_4_3()); 
            match(input,61,FOLLOW_61_in_rule__EqInterface__Group_4__3__Impl9022); 
             after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_4__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_5__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4442:1: rule__EqInterface__Group_5__0 : rule__EqInterface__Group_5__0__Impl rule__EqInterface__Group_5__1 ;
    public final void rule__EqInterface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4446:1: ( rule__EqInterface__Group_5__0__Impl rule__EqInterface__Group_5__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4447:2: rule__EqInterface__Group_5__0__Impl rule__EqInterface__Group_5__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_5__0__Impl_in_rule__EqInterface__Group_5__09061);
            rule__EqInterface__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_5__1_in_rule__EqInterface__Group_5__09064);
            rule__EqInterface__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_5__0"


    // $ANTLR start "rule__EqInterface__Group_5__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4454:1: rule__EqInterface__Group_5__0__Impl : ( 'Resource' ) ;
    public final void rule__EqInterface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4458:1: ( ( 'Resource' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4459:1: ( 'Resource' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4459:1: ( 'Resource' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4460:1: 'Resource'
            {
             before(grammarAccess.getEqInterfaceAccess().getResourceKeyword_5_0()); 
            match(input,81,FOLLOW_81_in_rule__EqInterface__Group_5__0__Impl9092); 
             after(grammarAccess.getEqInterfaceAccess().getResourceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_5__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_5__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4473:1: rule__EqInterface__Group_5__1 : rule__EqInterface__Group_5__1__Impl rule__EqInterface__Group_5__2 ;
    public final void rule__EqInterface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4477:1: ( rule__EqInterface__Group_5__1__Impl rule__EqInterface__Group_5__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4478:2: rule__EqInterface__Group_5__1__Impl rule__EqInterface__Group_5__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_5__1__Impl_in_rule__EqInterface__Group_5__19123);
            rule__EqInterface__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_5__2_in_rule__EqInterface__Group_5__19126);
            rule__EqInterface__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_5__1"


    // $ANTLR start "rule__EqInterface__Group_5__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4485:1: rule__EqInterface__Group_5__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4489:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4490:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4490:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4491:1: '='
            {
             before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_5_1()); 
            match(input,60,FOLLOW_60_in_rule__EqInterface__Group_5__1__Impl9154); 
             after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_5__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_5__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4504:1: rule__EqInterface__Group_5__2 : rule__EqInterface__Group_5__2__Impl rule__EqInterface__Group_5__3 ;
    public final void rule__EqInterface__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4508:1: ( rule__EqInterface__Group_5__2__Impl rule__EqInterface__Group_5__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4509:2: rule__EqInterface__Group_5__2__Impl rule__EqInterface__Group_5__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_5__2__Impl_in_rule__EqInterface__Group_5__29185);
            rule__EqInterface__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_5__3_in_rule__EqInterface__Group_5__29188);
            rule__EqInterface__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_5__2"


    // $ANTLR start "rule__EqInterface__Group_5__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4516:1: rule__EqInterface__Group_5__2__Impl : ( ( rule__EqInterface__ResourceAssignment_5_2 ) ) ;
    public final void rule__EqInterface__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4520:1: ( ( ( rule__EqInterface__ResourceAssignment_5_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4521:1: ( ( rule__EqInterface__ResourceAssignment_5_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4521:1: ( ( rule__EqInterface__ResourceAssignment_5_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4522:1: ( rule__EqInterface__ResourceAssignment_5_2 )
            {
             before(grammarAccess.getEqInterfaceAccess().getResourceAssignment_5_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4523:1: ( rule__EqInterface__ResourceAssignment_5_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4523:2: rule__EqInterface__ResourceAssignment_5_2
            {
            pushFollow(FOLLOW_rule__EqInterface__ResourceAssignment_5_2_in_rule__EqInterface__Group_5__2__Impl9215);
            rule__EqInterface__ResourceAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceAccess().getResourceAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_5__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_5__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4533:1: rule__EqInterface__Group_5__3 : rule__EqInterface__Group_5__3__Impl ;
    public final void rule__EqInterface__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4537:1: ( rule__EqInterface__Group_5__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4538:2: rule__EqInterface__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_5__3__Impl_in_rule__EqInterface__Group_5__39245);
            rule__EqInterface__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_5__3"


    // $ANTLR start "rule__EqInterface__Group_5__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4544:1: rule__EqInterface__Group_5__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4548:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4549:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4549:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4550:1: ';'
            {
             before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_5_3()); 
            match(input,61,FOLLOW_61_in_rule__EqInterface__Group_5__3__Impl9273); 
             after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_5__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_6__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4571:1: rule__EqInterface__Group_6__0 : rule__EqInterface__Group_6__0__Impl rule__EqInterface__Group_6__1 ;
    public final void rule__EqInterface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4575:1: ( rule__EqInterface__Group_6__0__Impl rule__EqInterface__Group_6__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4576:2: rule__EqInterface__Group_6__0__Impl rule__EqInterface__Group_6__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_6__0__Impl_in_rule__EqInterface__Group_6__09312);
            rule__EqInterface__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_6__1_in_rule__EqInterface__Group_6__09315);
            rule__EqInterface__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_6__0"


    // $ANTLR start "rule__EqInterface__Group_6__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4583:1: rule__EqInterface__Group_6__0__Impl : ( 'LineName' ) ;
    public final void rule__EqInterface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4587:1: ( ( 'LineName' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4588:1: ( 'LineName' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4588:1: ( 'LineName' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4589:1: 'LineName'
            {
             before(grammarAccess.getEqInterfaceAccess().getLineNameKeyword_6_0()); 
            match(input,82,FOLLOW_82_in_rule__EqInterface__Group_6__0__Impl9343); 
             after(grammarAccess.getEqInterfaceAccess().getLineNameKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_6__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_6__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4602:1: rule__EqInterface__Group_6__1 : rule__EqInterface__Group_6__1__Impl rule__EqInterface__Group_6__2 ;
    public final void rule__EqInterface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4606:1: ( rule__EqInterface__Group_6__1__Impl rule__EqInterface__Group_6__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4607:2: rule__EqInterface__Group_6__1__Impl rule__EqInterface__Group_6__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_6__1__Impl_in_rule__EqInterface__Group_6__19374);
            rule__EqInterface__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_6__2_in_rule__EqInterface__Group_6__19377);
            rule__EqInterface__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_6__1"


    // $ANTLR start "rule__EqInterface__Group_6__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4614:1: rule__EqInterface__Group_6__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4618:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4619:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4619:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4620:1: '='
            {
             before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_6_1()); 
            match(input,60,FOLLOW_60_in_rule__EqInterface__Group_6__1__Impl9405); 
             after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_6__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_6__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4633:1: rule__EqInterface__Group_6__2 : rule__EqInterface__Group_6__2__Impl rule__EqInterface__Group_6__3 ;
    public final void rule__EqInterface__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4637:1: ( rule__EqInterface__Group_6__2__Impl rule__EqInterface__Group_6__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4638:2: rule__EqInterface__Group_6__2__Impl rule__EqInterface__Group_6__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_6__2__Impl_in_rule__EqInterface__Group_6__29436);
            rule__EqInterface__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_6__3_in_rule__EqInterface__Group_6__29439);
            rule__EqInterface__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_6__2"


    // $ANTLR start "rule__EqInterface__Group_6__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4645:1: rule__EqInterface__Group_6__2__Impl : ( ( rule__EqInterface__LineNameAssignment_6_2 ) ) ;
    public final void rule__EqInterface__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4649:1: ( ( ( rule__EqInterface__LineNameAssignment_6_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4650:1: ( ( rule__EqInterface__LineNameAssignment_6_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4650:1: ( ( rule__EqInterface__LineNameAssignment_6_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4651:1: ( rule__EqInterface__LineNameAssignment_6_2 )
            {
             before(grammarAccess.getEqInterfaceAccess().getLineNameAssignment_6_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4652:1: ( rule__EqInterface__LineNameAssignment_6_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4652:2: rule__EqInterface__LineNameAssignment_6_2
            {
            pushFollow(FOLLOW_rule__EqInterface__LineNameAssignment_6_2_in_rule__EqInterface__Group_6__2__Impl9466);
            rule__EqInterface__LineNameAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceAccess().getLineNameAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_6__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_6__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4662:1: rule__EqInterface__Group_6__3 : rule__EqInterface__Group_6__3__Impl ;
    public final void rule__EqInterface__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4666:1: ( rule__EqInterface__Group_6__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4667:2: rule__EqInterface__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_6__3__Impl_in_rule__EqInterface__Group_6__39496);
            rule__EqInterface__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_6__3"


    // $ANTLR start "rule__EqInterface__Group_6__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4673:1: rule__EqInterface__Group_6__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4677:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4678:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4678:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4679:1: ';'
            {
             before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_6_3()); 
            match(input,61,FOLLOW_61_in_rule__EqInterface__Group_6__3__Impl9524); 
             after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_6__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_7__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4700:1: rule__EqInterface__Group_7__0 : rule__EqInterface__Group_7__0__Impl rule__EqInterface__Group_7__1 ;
    public final void rule__EqInterface__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4704:1: ( rule__EqInterface__Group_7__0__Impl rule__EqInterface__Group_7__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4705:2: rule__EqInterface__Group_7__0__Impl rule__EqInterface__Group_7__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_7__0__Impl_in_rule__EqInterface__Group_7__09563);
            rule__EqInterface__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_7__1_in_rule__EqInterface__Group_7__09566);
            rule__EqInterface__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_7__0"


    // $ANTLR start "rule__EqInterface__Group_7__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4712:1: rule__EqInterface__Group_7__0__Impl : ( 'WiringLane' ) ;
    public final void rule__EqInterface__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4716:1: ( ( 'WiringLane' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4717:1: ( 'WiringLane' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4717:1: ( 'WiringLane' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4718:1: 'WiringLane'
            {
             before(grammarAccess.getEqInterfaceAccess().getWiringLaneKeyword_7_0()); 
            match(input,83,FOLLOW_83_in_rule__EqInterface__Group_7__0__Impl9594); 
             after(grammarAccess.getEqInterfaceAccess().getWiringLaneKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_7__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_7__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4731:1: rule__EqInterface__Group_7__1 : rule__EqInterface__Group_7__1__Impl rule__EqInterface__Group_7__2 ;
    public final void rule__EqInterface__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4735:1: ( rule__EqInterface__Group_7__1__Impl rule__EqInterface__Group_7__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4736:2: rule__EqInterface__Group_7__1__Impl rule__EqInterface__Group_7__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_7__1__Impl_in_rule__EqInterface__Group_7__19625);
            rule__EqInterface__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_7__2_in_rule__EqInterface__Group_7__19628);
            rule__EqInterface__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_7__1"


    // $ANTLR start "rule__EqInterface__Group_7__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4743:1: rule__EqInterface__Group_7__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4747:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4748:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4748:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4749:1: '='
            {
             before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_7_1()); 
            match(input,60,FOLLOW_60_in_rule__EqInterface__Group_7__1__Impl9656); 
             after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_7__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_7__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4762:1: rule__EqInterface__Group_7__2 : rule__EqInterface__Group_7__2__Impl rule__EqInterface__Group_7__3 ;
    public final void rule__EqInterface__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4766:1: ( rule__EqInterface__Group_7__2__Impl rule__EqInterface__Group_7__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4767:2: rule__EqInterface__Group_7__2__Impl rule__EqInterface__Group_7__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_7__2__Impl_in_rule__EqInterface__Group_7__29687);
            rule__EqInterface__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_7__3_in_rule__EqInterface__Group_7__29690);
            rule__EqInterface__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_7__2"


    // $ANTLR start "rule__EqInterface__Group_7__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4774:1: rule__EqInterface__Group_7__2__Impl : ( ( rule__EqInterface__WiringLaneAssignment_7_2 ) ) ;
    public final void rule__EqInterface__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4778:1: ( ( ( rule__EqInterface__WiringLaneAssignment_7_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4779:1: ( ( rule__EqInterface__WiringLaneAssignment_7_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4779:1: ( ( rule__EqInterface__WiringLaneAssignment_7_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4780:1: ( rule__EqInterface__WiringLaneAssignment_7_2 )
            {
             before(grammarAccess.getEqInterfaceAccess().getWiringLaneAssignment_7_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4781:1: ( rule__EqInterface__WiringLaneAssignment_7_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4781:2: rule__EqInterface__WiringLaneAssignment_7_2
            {
            pushFollow(FOLLOW_rule__EqInterface__WiringLaneAssignment_7_2_in_rule__EqInterface__Group_7__2__Impl9717);
            rule__EqInterface__WiringLaneAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceAccess().getWiringLaneAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_7__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_7__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4791:1: rule__EqInterface__Group_7__3 : rule__EqInterface__Group_7__3__Impl ;
    public final void rule__EqInterface__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4795:1: ( rule__EqInterface__Group_7__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4796:2: rule__EqInterface__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_7__3__Impl_in_rule__EqInterface__Group_7__39747);
            rule__EqInterface__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_7__3"


    // $ANTLR start "rule__EqInterface__Group_7__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4802:1: rule__EqInterface__Group_7__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4806:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4807:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4807:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4808:1: ';'
            {
             before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_7_3()); 
            match(input,61,FOLLOW_61_in_rule__EqInterface__Group_7__3__Impl9775); 
             after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_7__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_8__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4829:1: rule__EqInterface__Group_8__0 : rule__EqInterface__Group_8__0__Impl rule__EqInterface__Group_8__1 ;
    public final void rule__EqInterface__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4833:1: ( rule__EqInterface__Group_8__0__Impl rule__EqInterface__Group_8__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4834:2: rule__EqInterface__Group_8__0__Impl rule__EqInterface__Group_8__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_8__0__Impl_in_rule__EqInterface__Group_8__09814);
            rule__EqInterface__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_8__1_in_rule__EqInterface__Group_8__09817);
            rule__EqInterface__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_8__0"


    // $ANTLR start "rule__EqInterface__Group_8__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4841:1: rule__EqInterface__Group_8__0__Impl : ( 'GrpInfo' ) ;
    public final void rule__EqInterface__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4845:1: ( ( 'GrpInfo' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4846:1: ( 'GrpInfo' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4846:1: ( 'GrpInfo' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4847:1: 'GrpInfo'
            {
             before(grammarAccess.getEqInterfaceAccess().getGrpInfoKeyword_8_0()); 
            match(input,84,FOLLOW_84_in_rule__EqInterface__Group_8__0__Impl9845); 
             after(grammarAccess.getEqInterfaceAccess().getGrpInfoKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_8__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_8__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4860:1: rule__EqInterface__Group_8__1 : rule__EqInterface__Group_8__1__Impl rule__EqInterface__Group_8__2 ;
    public final void rule__EqInterface__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4864:1: ( rule__EqInterface__Group_8__1__Impl rule__EqInterface__Group_8__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4865:2: rule__EqInterface__Group_8__1__Impl rule__EqInterface__Group_8__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_8__1__Impl_in_rule__EqInterface__Group_8__19876);
            rule__EqInterface__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_8__2_in_rule__EqInterface__Group_8__19879);
            rule__EqInterface__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_8__1"


    // $ANTLR start "rule__EqInterface__Group_8__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4872:1: rule__EqInterface__Group_8__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4876:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4877:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4877:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4878:1: '='
            {
             before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_8_1()); 
            match(input,60,FOLLOW_60_in_rule__EqInterface__Group_8__1__Impl9907); 
             after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_8__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_8__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4891:1: rule__EqInterface__Group_8__2 : rule__EqInterface__Group_8__2__Impl rule__EqInterface__Group_8__3 ;
    public final void rule__EqInterface__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4895:1: ( rule__EqInterface__Group_8__2__Impl rule__EqInterface__Group_8__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4896:2: rule__EqInterface__Group_8__2__Impl rule__EqInterface__Group_8__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_8__2__Impl_in_rule__EqInterface__Group_8__29938);
            rule__EqInterface__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_8__3_in_rule__EqInterface__Group_8__29941);
            rule__EqInterface__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_8__2"


    // $ANTLR start "rule__EqInterface__Group_8__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4903:1: rule__EqInterface__Group_8__2__Impl : ( ( rule__EqInterface__GrpInfoAssignment_8_2 ) ) ;
    public final void rule__EqInterface__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4907:1: ( ( ( rule__EqInterface__GrpInfoAssignment_8_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4908:1: ( ( rule__EqInterface__GrpInfoAssignment_8_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4908:1: ( ( rule__EqInterface__GrpInfoAssignment_8_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4909:1: ( rule__EqInterface__GrpInfoAssignment_8_2 )
            {
             before(grammarAccess.getEqInterfaceAccess().getGrpInfoAssignment_8_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4910:1: ( rule__EqInterface__GrpInfoAssignment_8_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4910:2: rule__EqInterface__GrpInfoAssignment_8_2
            {
            pushFollow(FOLLOW_rule__EqInterface__GrpInfoAssignment_8_2_in_rule__EqInterface__Group_8__2__Impl9968);
            rule__EqInterface__GrpInfoAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceAccess().getGrpInfoAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_8__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_8__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4920:1: rule__EqInterface__Group_8__3 : rule__EqInterface__Group_8__3__Impl ;
    public final void rule__EqInterface__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4924:1: ( rule__EqInterface__Group_8__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4925:2: rule__EqInterface__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_8__3__Impl_in_rule__EqInterface__Group_8__39998);
            rule__EqInterface__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_8__3"


    // $ANTLR start "rule__EqInterface__Group_8__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4931:1: rule__EqInterface__Group_8__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4935:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4936:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4936:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4937:1: ';'
            {
             before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_8_3()); 
            match(input,61,FOLLOW_61_in_rule__EqInterface__Group_8__3__Impl10026); 
             after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_8__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_9__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4958:1: rule__EqInterface__Group_9__0 : rule__EqInterface__Group_9__0__Impl rule__EqInterface__Group_9__1 ;
    public final void rule__EqInterface__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4962:1: ( rule__EqInterface__Group_9__0__Impl rule__EqInterface__Group_9__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4963:2: rule__EqInterface__Group_9__0__Impl rule__EqInterface__Group_9__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_9__0__Impl_in_rule__EqInterface__Group_9__010065);
            rule__EqInterface__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_9__1_in_rule__EqInterface__Group_9__010068);
            rule__EqInterface__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_9__0"


    // $ANTLR start "rule__EqInterface__Group_9__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4970:1: rule__EqInterface__Group_9__0__Impl : ( 'Route' ) ;
    public final void rule__EqInterface__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4974:1: ( ( 'Route' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4975:1: ( 'Route' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4975:1: ( 'Route' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4976:1: 'Route'
            {
             before(grammarAccess.getEqInterfaceAccess().getRouteKeyword_9_0()); 
            match(input,85,FOLLOW_85_in_rule__EqInterface__Group_9__0__Impl10096); 
             after(grammarAccess.getEqInterfaceAccess().getRouteKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_9__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_9__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4989:1: rule__EqInterface__Group_9__1 : rule__EqInterface__Group_9__1__Impl rule__EqInterface__Group_9__2 ;
    public final void rule__EqInterface__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4993:1: ( rule__EqInterface__Group_9__1__Impl rule__EqInterface__Group_9__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4994:2: rule__EqInterface__Group_9__1__Impl rule__EqInterface__Group_9__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_9__1__Impl_in_rule__EqInterface__Group_9__110127);
            rule__EqInterface__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_9__2_in_rule__EqInterface__Group_9__110130);
            rule__EqInterface__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_9__1"


    // $ANTLR start "rule__EqInterface__Group_9__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5001:1: rule__EqInterface__Group_9__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5005:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5006:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5006:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5007:1: '='
            {
             before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_9_1()); 
            match(input,60,FOLLOW_60_in_rule__EqInterface__Group_9__1__Impl10158); 
             after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_9__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_9__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5020:1: rule__EqInterface__Group_9__2 : rule__EqInterface__Group_9__2__Impl rule__EqInterface__Group_9__3 ;
    public final void rule__EqInterface__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5024:1: ( rule__EqInterface__Group_9__2__Impl rule__EqInterface__Group_9__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5025:2: rule__EqInterface__Group_9__2__Impl rule__EqInterface__Group_9__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_9__2__Impl_in_rule__EqInterface__Group_9__210189);
            rule__EqInterface__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_9__3_in_rule__EqInterface__Group_9__210192);
            rule__EqInterface__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_9__2"


    // $ANTLR start "rule__EqInterface__Group_9__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5032:1: rule__EqInterface__Group_9__2__Impl : ( ( rule__EqInterface__RouteAssignment_9_2 ) ) ;
    public final void rule__EqInterface__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5036:1: ( ( ( rule__EqInterface__RouteAssignment_9_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5037:1: ( ( rule__EqInterface__RouteAssignment_9_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5037:1: ( ( rule__EqInterface__RouteAssignment_9_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5038:1: ( rule__EqInterface__RouteAssignment_9_2 )
            {
             before(grammarAccess.getEqInterfaceAccess().getRouteAssignment_9_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5039:1: ( rule__EqInterface__RouteAssignment_9_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5039:2: rule__EqInterface__RouteAssignment_9_2
            {
            pushFollow(FOLLOW_rule__EqInterface__RouteAssignment_9_2_in_rule__EqInterface__Group_9__2__Impl10219);
            rule__EqInterface__RouteAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceAccess().getRouteAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_9__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_9__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5049:1: rule__EqInterface__Group_9__3 : rule__EqInterface__Group_9__3__Impl ;
    public final void rule__EqInterface__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5053:1: ( rule__EqInterface__Group_9__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5054:2: rule__EqInterface__Group_9__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_9__3__Impl_in_rule__EqInterface__Group_9__310249);
            rule__EqInterface__Group_9__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_9__3"


    // $ANTLR start "rule__EqInterface__Group_9__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5060:1: rule__EqInterface__Group_9__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5064:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5065:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5065:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5066:1: ';'
            {
             before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_9_3()); 
            match(input,61,FOLLOW_61_in_rule__EqInterface__Group_9__3__Impl10277); 
             after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_9__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_10__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5087:1: rule__EqInterface__Group_10__0 : rule__EqInterface__Group_10__0__Impl rule__EqInterface__Group_10__1 ;
    public final void rule__EqInterface__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5091:1: ( rule__EqInterface__Group_10__0__Impl rule__EqInterface__Group_10__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5092:2: rule__EqInterface__Group_10__0__Impl rule__EqInterface__Group_10__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_10__0__Impl_in_rule__EqInterface__Group_10__010316);
            rule__EqInterface__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_10__1_in_rule__EqInterface__Group_10__010319);
            rule__EqInterface__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_10__0"


    // $ANTLR start "rule__EqInterface__Group_10__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5099:1: rule__EqInterface__Group_10__0__Impl : ( 'PwSup1' ) ;
    public final void rule__EqInterface__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5103:1: ( ( 'PwSup1' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5104:1: ( 'PwSup1' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5104:1: ( 'PwSup1' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5105:1: 'PwSup1'
            {
             before(grammarAccess.getEqInterfaceAccess().getPwSup1Keyword_10_0()); 
            match(input,86,FOLLOW_86_in_rule__EqInterface__Group_10__0__Impl10347); 
             after(grammarAccess.getEqInterfaceAccess().getPwSup1Keyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_10__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_10__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5118:1: rule__EqInterface__Group_10__1 : rule__EqInterface__Group_10__1__Impl rule__EqInterface__Group_10__2 ;
    public final void rule__EqInterface__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5122:1: ( rule__EqInterface__Group_10__1__Impl rule__EqInterface__Group_10__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5123:2: rule__EqInterface__Group_10__1__Impl rule__EqInterface__Group_10__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_10__1__Impl_in_rule__EqInterface__Group_10__110378);
            rule__EqInterface__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_10__2_in_rule__EqInterface__Group_10__110381);
            rule__EqInterface__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_10__1"


    // $ANTLR start "rule__EqInterface__Group_10__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5130:1: rule__EqInterface__Group_10__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5134:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5135:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5135:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5136:1: '='
            {
             before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_10_1()); 
            match(input,60,FOLLOW_60_in_rule__EqInterface__Group_10__1__Impl10409); 
             after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_10__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_10__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5149:1: rule__EqInterface__Group_10__2 : rule__EqInterface__Group_10__2__Impl rule__EqInterface__Group_10__3 ;
    public final void rule__EqInterface__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5153:1: ( rule__EqInterface__Group_10__2__Impl rule__EqInterface__Group_10__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5154:2: rule__EqInterface__Group_10__2__Impl rule__EqInterface__Group_10__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_10__2__Impl_in_rule__EqInterface__Group_10__210440);
            rule__EqInterface__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_10__3_in_rule__EqInterface__Group_10__210443);
            rule__EqInterface__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_10__2"


    // $ANTLR start "rule__EqInterface__Group_10__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5161:1: rule__EqInterface__Group_10__2__Impl : ( ( rule__EqInterface__PwSup1Assignment_10_2 ) ) ;
    public final void rule__EqInterface__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5165:1: ( ( ( rule__EqInterface__PwSup1Assignment_10_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5166:1: ( ( rule__EqInterface__PwSup1Assignment_10_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5166:1: ( ( rule__EqInterface__PwSup1Assignment_10_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5167:1: ( rule__EqInterface__PwSup1Assignment_10_2 )
            {
             before(grammarAccess.getEqInterfaceAccess().getPwSup1Assignment_10_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5168:1: ( rule__EqInterface__PwSup1Assignment_10_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5168:2: rule__EqInterface__PwSup1Assignment_10_2
            {
            pushFollow(FOLLOW_rule__EqInterface__PwSup1Assignment_10_2_in_rule__EqInterface__Group_10__2__Impl10470);
            rule__EqInterface__PwSup1Assignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceAccess().getPwSup1Assignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_10__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_10__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5178:1: rule__EqInterface__Group_10__3 : rule__EqInterface__Group_10__3__Impl ;
    public final void rule__EqInterface__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5182:1: ( rule__EqInterface__Group_10__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5183:2: rule__EqInterface__Group_10__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_10__3__Impl_in_rule__EqInterface__Group_10__310500);
            rule__EqInterface__Group_10__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_10__3"


    // $ANTLR start "rule__EqInterface__Group_10__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5189:1: rule__EqInterface__Group_10__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5193:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5194:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5194:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5195:1: ';'
            {
             before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_10_3()); 
            match(input,61,FOLLOW_61_in_rule__EqInterface__Group_10__3__Impl10528); 
             after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_10__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_11__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5216:1: rule__EqInterface__Group_11__0 : rule__EqInterface__Group_11__0__Impl rule__EqInterface__Group_11__1 ;
    public final void rule__EqInterface__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5220:1: ( rule__EqInterface__Group_11__0__Impl rule__EqInterface__Group_11__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5221:2: rule__EqInterface__Group_11__0__Impl rule__EqInterface__Group_11__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_11__0__Impl_in_rule__EqInterface__Group_11__010567);
            rule__EqInterface__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_11__1_in_rule__EqInterface__Group_11__010570);
            rule__EqInterface__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_11__0"


    // $ANTLR start "rule__EqInterface__Group_11__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5228:1: rule__EqInterface__Group_11__0__Impl : ( 'EmhZone1' ) ;
    public final void rule__EqInterface__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5232:1: ( ( 'EmhZone1' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5233:1: ( 'EmhZone1' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5233:1: ( 'EmhZone1' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5234:1: 'EmhZone1'
            {
             before(grammarAccess.getEqInterfaceAccess().getEmhZone1Keyword_11_0()); 
            match(input,87,FOLLOW_87_in_rule__EqInterface__Group_11__0__Impl10598); 
             after(grammarAccess.getEqInterfaceAccess().getEmhZone1Keyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_11__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_11__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5247:1: rule__EqInterface__Group_11__1 : rule__EqInterface__Group_11__1__Impl rule__EqInterface__Group_11__2 ;
    public final void rule__EqInterface__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5251:1: ( rule__EqInterface__Group_11__1__Impl rule__EqInterface__Group_11__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5252:2: rule__EqInterface__Group_11__1__Impl rule__EqInterface__Group_11__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_11__1__Impl_in_rule__EqInterface__Group_11__110629);
            rule__EqInterface__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_11__2_in_rule__EqInterface__Group_11__110632);
            rule__EqInterface__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_11__1"


    // $ANTLR start "rule__EqInterface__Group_11__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5259:1: rule__EqInterface__Group_11__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5263:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5264:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5264:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5265:1: '='
            {
             before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_11_1()); 
            match(input,60,FOLLOW_60_in_rule__EqInterface__Group_11__1__Impl10660); 
             after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_11__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_11__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5278:1: rule__EqInterface__Group_11__2 : rule__EqInterface__Group_11__2__Impl rule__EqInterface__Group_11__3 ;
    public final void rule__EqInterface__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5282:1: ( rule__EqInterface__Group_11__2__Impl rule__EqInterface__Group_11__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5283:2: rule__EqInterface__Group_11__2__Impl rule__EqInterface__Group_11__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_11__2__Impl_in_rule__EqInterface__Group_11__210691);
            rule__EqInterface__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_11__3_in_rule__EqInterface__Group_11__210694);
            rule__EqInterface__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_11__2"


    // $ANTLR start "rule__EqInterface__Group_11__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5290:1: rule__EqInterface__Group_11__2__Impl : ( ( rule__EqInterface__EmhZone1Assignment_11_2 ) ) ;
    public final void rule__EqInterface__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5294:1: ( ( ( rule__EqInterface__EmhZone1Assignment_11_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5295:1: ( ( rule__EqInterface__EmhZone1Assignment_11_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5295:1: ( ( rule__EqInterface__EmhZone1Assignment_11_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5296:1: ( rule__EqInterface__EmhZone1Assignment_11_2 )
            {
             before(grammarAccess.getEqInterfaceAccess().getEmhZone1Assignment_11_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5297:1: ( rule__EqInterface__EmhZone1Assignment_11_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5297:2: rule__EqInterface__EmhZone1Assignment_11_2
            {
            pushFollow(FOLLOW_rule__EqInterface__EmhZone1Assignment_11_2_in_rule__EqInterface__Group_11__2__Impl10721);
            rule__EqInterface__EmhZone1Assignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceAccess().getEmhZone1Assignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_11__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_11__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5307:1: rule__EqInterface__Group_11__3 : rule__EqInterface__Group_11__3__Impl ;
    public final void rule__EqInterface__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5311:1: ( rule__EqInterface__Group_11__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5312:2: rule__EqInterface__Group_11__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_11__3__Impl_in_rule__EqInterface__Group_11__310751);
            rule__EqInterface__Group_11__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_11__3"


    // $ANTLR start "rule__EqInterface__Group_11__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5318:1: rule__EqInterface__Group_11__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5322:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5323:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5323:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5324:1: ';'
            {
             before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_11_3()); 
            match(input,61,FOLLOW_61_in_rule__EqInterface__Group_11__3__Impl10779); 
             after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_11__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_12__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5345:1: rule__EqInterface__Group_12__0 : rule__EqInterface__Group_12__0__Impl rule__EqInterface__Group_12__1 ;
    public final void rule__EqInterface__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5349:1: ( rule__EqInterface__Group_12__0__Impl rule__EqInterface__Group_12__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5350:2: rule__EqInterface__Group_12__0__Impl rule__EqInterface__Group_12__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_12__0__Impl_in_rule__EqInterface__Group_12__010818);
            rule__EqInterface__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_12__1_in_rule__EqInterface__Group_12__010821);
            rule__EqInterface__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_12__0"


    // $ANTLR start "rule__EqInterface__Group_12__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5357:1: rule__EqInterface__Group_12__0__Impl : ( 'Type' ) ;
    public final void rule__EqInterface__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5361:1: ( ( 'Type' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5362:1: ( 'Type' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5362:1: ( 'Type' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5363:1: 'Type'
            {
             before(grammarAccess.getEqInterfaceAccess().getTypeKeyword_12_0()); 
            match(input,72,FOLLOW_72_in_rule__EqInterface__Group_12__0__Impl10849); 
             after(grammarAccess.getEqInterfaceAccess().getTypeKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_12__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_12__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5376:1: rule__EqInterface__Group_12__1 : rule__EqInterface__Group_12__1__Impl rule__EqInterface__Group_12__2 ;
    public final void rule__EqInterface__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5380:1: ( rule__EqInterface__Group_12__1__Impl rule__EqInterface__Group_12__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5381:2: rule__EqInterface__Group_12__1__Impl rule__EqInterface__Group_12__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_12__1__Impl_in_rule__EqInterface__Group_12__110880);
            rule__EqInterface__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_12__2_in_rule__EqInterface__Group_12__110883);
            rule__EqInterface__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_12__1"


    // $ANTLR start "rule__EqInterface__Group_12__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5388:1: rule__EqInterface__Group_12__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5392:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5393:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5393:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5394:1: '='
            {
             before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_12_1()); 
            match(input,60,FOLLOW_60_in_rule__EqInterface__Group_12__1__Impl10911); 
             after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_12__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_12__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5407:1: rule__EqInterface__Group_12__2 : rule__EqInterface__Group_12__2__Impl rule__EqInterface__Group_12__3 ;
    public final void rule__EqInterface__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5411:1: ( rule__EqInterface__Group_12__2__Impl rule__EqInterface__Group_12__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5412:2: rule__EqInterface__Group_12__2__Impl rule__EqInterface__Group_12__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_12__2__Impl_in_rule__EqInterface__Group_12__210942);
            rule__EqInterface__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_12__3_in_rule__EqInterface__Group_12__210945);
            rule__EqInterface__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_12__2"


    // $ANTLR start "rule__EqInterface__Group_12__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5419:1: rule__EqInterface__Group_12__2__Impl : ( ( rule__EqInterface__IoTypeAssignment_12_2 ) ) ;
    public final void rule__EqInterface__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5423:1: ( ( ( rule__EqInterface__IoTypeAssignment_12_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5424:1: ( ( rule__EqInterface__IoTypeAssignment_12_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5424:1: ( ( rule__EqInterface__IoTypeAssignment_12_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5425:1: ( rule__EqInterface__IoTypeAssignment_12_2 )
            {
             before(grammarAccess.getEqInterfaceAccess().getIoTypeAssignment_12_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5426:1: ( rule__EqInterface__IoTypeAssignment_12_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5426:2: rule__EqInterface__IoTypeAssignment_12_2
            {
            pushFollow(FOLLOW_rule__EqInterface__IoTypeAssignment_12_2_in_rule__EqInterface__Group_12__2__Impl10972);
            rule__EqInterface__IoTypeAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getEqInterfaceAccess().getIoTypeAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_12__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_12__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5436:1: rule__EqInterface__Group_12__3 : rule__EqInterface__Group_12__3__Impl ;
    public final void rule__EqInterface__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5440:1: ( rule__EqInterface__Group_12__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5441:2: rule__EqInterface__Group_12__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_12__3__Impl_in_rule__EqInterface__Group_12__311002);
            rule__EqInterface__Group_12__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_12__3"


    // $ANTLR start "rule__EqInterface__Group_12__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5447:1: rule__EqInterface__Group_12__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5451:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5452:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5452:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5453:1: ';'
            {
             before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_12_3()); 
            match(input,61,FOLLOW_61_in_rule__EqInterface__Group_12__3__Impl11030); 
             after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_12__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_13__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5474:1: rule__EqInterface__Group_13__0 : rule__EqInterface__Group_13__0__Impl rule__EqInterface__Group_13__1 ;
    public final void rule__EqInterface__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5478:1: ( rule__EqInterface__Group_13__0__Impl rule__EqInterface__Group_13__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5479:2: rule__EqInterface__Group_13__0__Impl rule__EqInterface__Group_13__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_13__0__Impl_in_rule__EqInterface__Group_13__011069);
            rule__EqInterface__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_13__1_in_rule__EqInterface__Group_13__011072);
            rule__EqInterface__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_13__0"


    // $ANTLR start "rule__EqInterface__Group_13__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5486:1: rule__EqInterface__Group_13__0__Impl : ( 'Generic properties' ) ;
    public final void rule__EqInterface__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5490:1: ( ( 'Generic properties' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5491:1: ( 'Generic properties' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5491:1: ( 'Generic properties' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5492:1: 'Generic properties'
            {
             before(grammarAccess.getEqInterfaceAccess().getGenericPropertiesKeyword_13_0()); 
            match(input,70,FOLLOW_70_in_rule__EqInterface__Group_13__0__Impl11100); 
             after(grammarAccess.getEqInterfaceAccess().getGenericPropertiesKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_13__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_13__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5505:1: rule__EqInterface__Group_13__1 : rule__EqInterface__Group_13__1__Impl rule__EqInterface__Group_13__2 ;
    public final void rule__EqInterface__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5509:1: ( rule__EqInterface__Group_13__1__Impl rule__EqInterface__Group_13__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5510:2: rule__EqInterface__Group_13__1__Impl rule__EqInterface__Group_13__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_13__1__Impl_in_rule__EqInterface__Group_13__111131);
            rule__EqInterface__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_13__2_in_rule__EqInterface__Group_13__111134);
            rule__EqInterface__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_13__1"


    // $ANTLR start "rule__EqInterface__Group_13__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5517:1: rule__EqInterface__Group_13__1__Impl : ( '{' ) ;
    public final void rule__EqInterface__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5521:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5522:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5522:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5523:1: '{'
            {
             before(grammarAccess.getEqInterfaceAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,58,FOLLOW_58_in_rule__EqInterface__Group_13__1__Impl11162); 
             after(grammarAccess.getEqInterfaceAccess().getLeftCurlyBracketKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_13__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_13__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5536:1: rule__EqInterface__Group_13__2 : rule__EqInterface__Group_13__2__Impl rule__EqInterface__Group_13__3 ;
    public final void rule__EqInterface__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5540:1: ( rule__EqInterface__Group_13__2__Impl rule__EqInterface__Group_13__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5541:2: rule__EqInterface__Group_13__2__Impl rule__EqInterface__Group_13__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_13__2__Impl_in_rule__EqInterface__Group_13__211193);
            rule__EqInterface__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqInterface__Group_13__3_in_rule__EqInterface__Group_13__211196);
            rule__EqInterface__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_13__2"


    // $ANTLR start "rule__EqInterface__Group_13__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5548:1: rule__EqInterface__Group_13__2__Impl : ( ( rule__EqInterface__MetricParametersAssignment_13_2 )* ) ;
    public final void rule__EqInterface__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5552:1: ( ( ( rule__EqInterface__MetricParametersAssignment_13_2 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5553:1: ( ( rule__EqInterface__MetricParametersAssignment_13_2 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5553:1: ( ( rule__EqInterface__MetricParametersAssignment_13_2 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5554:1: ( rule__EqInterface__MetricParametersAssignment_13_2 )*
            {
             before(grammarAccess.getEqInterfaceAccess().getMetricParametersAssignment_13_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5555:1: ( rule__EqInterface__MetricParametersAssignment_13_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_STRING) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5555:2: rule__EqInterface__MetricParametersAssignment_13_2
            	    {
            	    pushFollow(FOLLOW_rule__EqInterface__MetricParametersAssignment_13_2_in_rule__EqInterface__Group_13__2__Impl11223);
            	    rule__EqInterface__MetricParametersAssignment_13_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getEqInterfaceAccess().getMetricParametersAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_13__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_13__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5565:1: rule__EqInterface__Group_13__3 : rule__EqInterface__Group_13__3__Impl ;
    public final void rule__EqInterface__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5569:1: ( rule__EqInterface__Group_13__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5570:2: rule__EqInterface__Group_13__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_13__3__Impl_in_rule__EqInterface__Group_13__311254);
            rule__EqInterface__Group_13__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_13__3"


    // $ANTLR start "rule__EqInterface__Group_13__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5576:1: rule__EqInterface__Group_13__3__Impl : ( '}' ) ;
    public final void rule__EqInterface__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5580:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5581:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5581:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5582:1: '}'
            {
             before(grammarAccess.getEqInterfaceAccess().getRightCurlyBracketKeyword_13_3()); 
            match(input,62,FOLLOW_62_in_rule__EqInterface__Group_13__3__Impl11282); 
             after(grammarAccess.getEqInterfaceAccess().getRightCurlyBracketKeyword_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__Group_13__3__Impl"


    // $ANTLR start "rule__MetricParameter__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5603:1: rule__MetricParameter__Group__0 : rule__MetricParameter__Group__0__Impl rule__MetricParameter__Group__1 ;
    public final void rule__MetricParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5607:1: ( rule__MetricParameter__Group__0__Impl rule__MetricParameter__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5608:2: rule__MetricParameter__Group__0__Impl rule__MetricParameter__Group__1
            {
            pushFollow(FOLLOW_rule__MetricParameter__Group__0__Impl_in_rule__MetricParameter__Group__011321);
            rule__MetricParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricParameter__Group__1_in_rule__MetricParameter__Group__011324);
            rule__MetricParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricParameter__Group__0"


    // $ANTLR start "rule__MetricParameter__Group__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5615:1: rule__MetricParameter__Group__0__Impl : ( ( rule__MetricParameter__NameAssignment_0 ) ) ;
    public final void rule__MetricParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5619:1: ( ( ( rule__MetricParameter__NameAssignment_0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5620:1: ( ( rule__MetricParameter__NameAssignment_0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5620:1: ( ( rule__MetricParameter__NameAssignment_0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5621:1: ( rule__MetricParameter__NameAssignment_0 )
            {
             before(grammarAccess.getMetricParameterAccess().getNameAssignment_0()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5622:1: ( rule__MetricParameter__NameAssignment_0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5622:2: rule__MetricParameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MetricParameter__NameAssignment_0_in_rule__MetricParameter__Group__0__Impl11351);
            rule__MetricParameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMetricParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricParameter__Group__0__Impl"


    // $ANTLR start "rule__MetricParameter__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5632:1: rule__MetricParameter__Group__1 : rule__MetricParameter__Group__1__Impl rule__MetricParameter__Group__2 ;
    public final void rule__MetricParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5636:1: ( rule__MetricParameter__Group__1__Impl rule__MetricParameter__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5637:2: rule__MetricParameter__Group__1__Impl rule__MetricParameter__Group__2
            {
            pushFollow(FOLLOW_rule__MetricParameter__Group__1__Impl_in_rule__MetricParameter__Group__111381);
            rule__MetricParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricParameter__Group__2_in_rule__MetricParameter__Group__111384);
            rule__MetricParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricParameter__Group__1"


    // $ANTLR start "rule__MetricParameter__Group__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5644:1: rule__MetricParameter__Group__1__Impl : ( '=' ) ;
    public final void rule__MetricParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5648:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5649:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5649:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5650:1: '='
            {
             before(grammarAccess.getMetricParameterAccess().getEqualsSignKeyword_1()); 
            match(input,60,FOLLOW_60_in_rule__MetricParameter__Group__1__Impl11412); 
             after(grammarAccess.getMetricParameterAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricParameter__Group__1__Impl"


    // $ANTLR start "rule__MetricParameter__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5663:1: rule__MetricParameter__Group__2 : rule__MetricParameter__Group__2__Impl rule__MetricParameter__Group__3 ;
    public final void rule__MetricParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5667:1: ( rule__MetricParameter__Group__2__Impl rule__MetricParameter__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5668:2: rule__MetricParameter__Group__2__Impl rule__MetricParameter__Group__3
            {
            pushFollow(FOLLOW_rule__MetricParameter__Group__2__Impl_in_rule__MetricParameter__Group__211443);
            rule__MetricParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricParameter__Group__3_in_rule__MetricParameter__Group__211446);
            rule__MetricParameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricParameter__Group__2"


    // $ANTLR start "rule__MetricParameter__Group__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5675:1: rule__MetricParameter__Group__2__Impl : ( ( rule__MetricParameter__ValueAssignment_2 ) ) ;
    public final void rule__MetricParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5679:1: ( ( ( rule__MetricParameter__ValueAssignment_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5680:1: ( ( rule__MetricParameter__ValueAssignment_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5680:1: ( ( rule__MetricParameter__ValueAssignment_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5681:1: ( rule__MetricParameter__ValueAssignment_2 )
            {
             before(grammarAccess.getMetricParameterAccess().getValueAssignment_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5682:1: ( rule__MetricParameter__ValueAssignment_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5682:2: rule__MetricParameter__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__MetricParameter__ValueAssignment_2_in_rule__MetricParameter__Group__2__Impl11473);
            rule__MetricParameter__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMetricParameterAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricParameter__Group__2__Impl"


    // $ANTLR start "rule__MetricParameter__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5692:1: rule__MetricParameter__Group__3 : rule__MetricParameter__Group__3__Impl ;
    public final void rule__MetricParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5696:1: ( rule__MetricParameter__Group__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5697:2: rule__MetricParameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MetricParameter__Group__3__Impl_in_rule__MetricParameter__Group__311503);
            rule__MetricParameter__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricParameter__Group__3"


    // $ANTLR start "rule__MetricParameter__Group__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5703:1: rule__MetricParameter__Group__3__Impl : ( ';' ) ;
    public final void rule__MetricParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5707:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5708:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5708:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5709:1: ';'
            {
             before(grammarAccess.getMetricParameterAccess().getSemicolonKeyword_3()); 
            match(input,61,FOLLOW_61_in_rule__MetricParameter__Group__3__Impl11531); 
             after(grammarAccess.getMetricParameterAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricParameter__Group__3__Impl"


    // $ANTLR start "rule__AssistModel__SystemNameAssignment_4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5733:1: rule__AssistModel__SystemNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__AssistModel__SystemNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5737:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5738:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5738:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5739:1: RULE_STRING
            {
             before(grammarAccess.getAssistModelAccess().getSystemNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AssistModel__SystemNameAssignment_411577); 
             after(grammarAccess.getAssistModelAccess().getSystemNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__SystemNameAssignment_4"


    // $ANTLR start "rule__AssistModel__CompartmentsAssignment_7"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5748:1: rule__AssistModel__CompartmentsAssignment_7 : ( ruleCompartment ) ;
    public final void rule__AssistModel__CompartmentsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5752:1: ( ( ruleCompartment ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5753:1: ( ruleCompartment )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5753:1: ( ruleCompartment )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5754:1: ruleCompartment
            {
             before(grammarAccess.getAssistModelAccess().getCompartmentsCompartmentParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleCompartment_in_rule__AssistModel__CompartmentsAssignment_711608);
            ruleCompartment();

            state._fsp--;

             after(grammarAccess.getAssistModelAccess().getCompartmentsCompartmentParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__CompartmentsAssignment_7"


    // $ANTLR start "rule__AssistModel__EqInterfacesAssignment_8_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5763:1: rule__AssistModel__EqInterfacesAssignment_8_2 : ( ruleEqInterface ) ;
    public final void rule__AssistModel__EqInterfacesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5767:1: ( ( ruleEqInterface ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5768:1: ( ruleEqInterface )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5768:1: ( ruleEqInterface )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5769:1: ruleEqInterface
            {
             before(grammarAccess.getAssistModelAccess().getEqInterfacesEqInterfaceParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleEqInterface_in_rule__AssistModel__EqInterfacesAssignment_8_211639);
            ruleEqInterface();

            state._fsp--;

             after(grammarAccess.getAssistModelAccess().getEqInterfacesEqInterfaceParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__EqInterfacesAssignment_8_2"


    // $ANTLR start "rule__AssistModel__EqInterfaceGroupsAssignment_9_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5778:1: rule__AssistModel__EqInterfaceGroupsAssignment_9_2 : ( ruleEqInterfaceGroup ) ;
    public final void rule__AssistModel__EqInterfaceGroupsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5782:1: ( ( ruleEqInterfaceGroup ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5783:1: ( ruleEqInterfaceGroup )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5783:1: ( ruleEqInterfaceGroup )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5784:1: ruleEqInterfaceGroup
            {
             before(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsEqInterfaceGroupParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_ruleEqInterfaceGroup_in_rule__AssistModel__EqInterfaceGroupsAssignment_9_211670);
            ruleEqInterfaceGroup();

            state._fsp--;

             after(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsEqInterfaceGroupParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__EqInterfaceGroupsAssignment_9_2"


    // $ANTLR start "rule__Compartment__NameAssignment_1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5793:1: rule__Compartment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Compartment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5797:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5798:1: ( RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5798:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5799:1: RULE_ID
            {
             before(grammarAccess.getCompartmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Compartment__NameAssignment_111701); 
             after(grammarAccess.getCompartmentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__NameAssignment_1"


    // $ANTLR start "rule__Compartment__ManufacturerAssignment_3_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5808:1: rule__Compartment__ManufacturerAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__Compartment__ManufacturerAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5812:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5813:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5813:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5814:1: RULE_STRING
            {
             before(grammarAccess.getCompartmentAccess().getManufacturerSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Compartment__ManufacturerAssignment_3_211732); 
             after(grammarAccess.getCompartmentAccess().getManufacturerSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__ManufacturerAssignment_3_2"


    // $ANTLR start "rule__Compartment__PowerSupplyAssignment_4_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5823:1: rule__Compartment__PowerSupplyAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Compartment__PowerSupplyAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5827:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5828:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5828:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5829:1: RULE_STRING
            {
             before(grammarAccess.getCompartmentAccess().getPowerSupplySTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Compartment__PowerSupplyAssignment_4_211763); 
             after(grammarAccess.getCompartmentAccess().getPowerSupplySTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__PowerSupplyAssignment_4_2"


    // $ANTLR start "rule__Compartment__SideAssignment_5_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5838:1: rule__Compartment__SideAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Compartment__SideAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5842:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5843:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5843:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5844:1: RULE_STRING
            {
             before(grammarAccess.getCompartmentAccess().getSideSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Compartment__SideAssignment_5_211794); 
             after(grammarAccess.getCompartmentAccess().getSideSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__SideAssignment_5_2"


    // $ANTLR start "rule__Compartment__ZoneAssignment_6_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5853:1: rule__Compartment__ZoneAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__Compartment__ZoneAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5857:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5858:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5858:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5859:1: RULE_STRING
            {
             before(grammarAccess.getCompartmentAccess().getZoneSTRINGTerminalRuleCall_6_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Compartment__ZoneAssignment_6_211825); 
             after(grammarAccess.getCompartmentAccess().getZoneSTRINGTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__ZoneAssignment_6_2"


    // $ANTLR start "rule__Compartment__RdcsAssignment_7"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5868:1: rule__Compartment__RdcsAssignment_7 : ( ruleRDC ) ;
    public final void rule__Compartment__RdcsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5872:1: ( ( ruleRDC ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5873:1: ( ruleRDC )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5873:1: ( ruleRDC )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5874:1: ruleRDC
            {
             before(grammarAccess.getCompartmentAccess().getRdcsRDCParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleRDC_in_rule__Compartment__RdcsAssignment_711856);
            ruleRDC();

            state._fsp--;

             after(grammarAccess.getCompartmentAccess().getRdcsRDCParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__RdcsAssignment_7"


    // $ANTLR start "rule__Compartment__MetricParametersAssignment_8_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5883:1: rule__Compartment__MetricParametersAssignment_8_2 : ( ruleMetricParameter ) ;
    public final void rule__Compartment__MetricParametersAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5887:1: ( ( ruleMetricParameter ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5888:1: ( ruleMetricParameter )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5888:1: ( ruleMetricParameter )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5889:1: ruleMetricParameter
            {
             before(grammarAccess.getCompartmentAccess().getMetricParametersMetricParameterParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleMetricParameter_in_rule__Compartment__MetricParametersAssignment_8_211887);
            ruleMetricParameter();

            state._fsp--;

             after(grammarAccess.getCompartmentAccess().getMetricParametersMetricParameterParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__MetricParametersAssignment_8_2"


    // $ANTLR start "rule__RDC__NameAssignment_1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5898:1: rule__RDC__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RDC__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5902:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5903:1: ( RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5903:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5904:1: RULE_ID
            {
             before(grammarAccess.getRDCAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RDC__NameAssignment_111918); 
             after(grammarAccess.getRDCAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__NameAssignment_1"


    // $ANTLR start "rule__RDC__ManufacturerAssignment_3_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5913:1: rule__RDC__ManufacturerAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__RDC__ManufacturerAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5917:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5918:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5918:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5919:1: RULE_STRING
            {
             before(grammarAccess.getRDCAccess().getManufacturerSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RDC__ManufacturerAssignment_3_211949); 
             after(grammarAccess.getRDCAccess().getManufacturerSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__ManufacturerAssignment_3_2"


    // $ANTLR start "rule__RDC__PowerSupplyAssignment_4_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5928:1: rule__RDC__PowerSupplyAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__RDC__PowerSupplyAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5932:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5933:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5933:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5934:1: RULE_STRING
            {
             before(grammarAccess.getRDCAccess().getPowerSupplySTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RDC__PowerSupplyAssignment_4_211980); 
             after(grammarAccess.getRDCAccess().getPowerSupplySTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__PowerSupplyAssignment_4_2"


    // $ANTLR start "rule__RDC__RdcTypeAssignment_5_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5943:1: rule__RDC__RdcTypeAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__RDC__RdcTypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5947:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5948:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5948:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5949:1: RULE_STRING
            {
             before(grammarAccess.getRDCAccess().getRdcTypeSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RDC__RdcTypeAssignment_5_212011); 
             after(grammarAccess.getRDCAccess().getRdcTypeSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__RdcTypeAssignment_5_2"


    // $ANTLR start "rule__RDC__EssAssignment_6_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5958:1: rule__RDC__EssAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__RDC__EssAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5962:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5963:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5963:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5964:1: RULE_STRING
            {
             before(grammarAccess.getRDCAccess().getEssSTRINGTerminalRuleCall_6_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RDC__EssAssignment_6_212042); 
             after(grammarAccess.getRDCAccess().getEssSTRINGTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__EssAssignment_6_2"


    // $ANTLR start "rule__RDC__ConnectorsAssignment_7"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5973:1: rule__RDC__ConnectorsAssignment_7 : ( ruleConnector ) ;
    public final void rule__RDC__ConnectorsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5977:1: ( ( ruleConnector ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5978:1: ( ruleConnector )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5978:1: ( ruleConnector )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5979:1: ruleConnector
            {
             before(grammarAccess.getRDCAccess().getConnectorsConnectorParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleConnector_in_rule__RDC__ConnectorsAssignment_712073);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getRDCAccess().getConnectorsConnectorParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__ConnectorsAssignment_7"


    // $ANTLR start "rule__RDC__MetricParametersAssignment_8_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5988:1: rule__RDC__MetricParametersAssignment_8_2 : ( ruleMetricParameter ) ;
    public final void rule__RDC__MetricParametersAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5992:1: ( ( ruleMetricParameter ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5993:1: ( ruleMetricParameter )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5993:1: ( ruleMetricParameter )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5994:1: ruleMetricParameter
            {
             before(grammarAccess.getRDCAccess().getMetricParametersMetricParameterParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleMetricParameter_in_rule__RDC__MetricParametersAssignment_8_212104);
            ruleMetricParameter();

            state._fsp--;

             after(grammarAccess.getRDCAccess().getMetricParametersMetricParameterParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDC__MetricParametersAssignment_8_2"


    // $ANTLR start "rule__Connector__NameAssignment_1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6003:1: rule__Connector__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6007:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6008:1: ( RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6008:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6009:1: RULE_ID
            {
             before(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Connector__NameAssignment_112135); 
             after(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__NameAssignment_1"


    // $ANTLR start "rule__Connector__AvailableEqInterfacesAssignment_3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6018:1: rule__Connector__AvailableEqInterfacesAssignment_3 : ( ruleAvailableEqInterface ) ;
    public final void rule__Connector__AvailableEqInterfacesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6022:1: ( ( ruleAvailableEqInterface ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6023:1: ( ruleAvailableEqInterface )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6023:1: ( ruleAvailableEqInterface )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6024:1: ruleAvailableEqInterface
            {
             before(grammarAccess.getConnectorAccess().getAvailableEqInterfacesAvailableEqInterfaceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAvailableEqInterface_in_rule__Connector__AvailableEqInterfacesAssignment_312166);
            ruleAvailableEqInterface();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getAvailableEqInterfacesAvailableEqInterfaceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__AvailableEqInterfacesAssignment_3"


    // $ANTLR start "rule__AvailableEqInterface__CountAssignment_0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6033:1: rule__AvailableEqInterface__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__AvailableEqInterface__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6037:1: ( ( RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6038:1: ( RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6038:1: ( RULE_INT )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6039:1: RULE_INT
            {
             before(grammarAccess.getAvailableEqInterfaceAccess().getCountINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AvailableEqInterface__CountAssignment_012197); 
             after(grammarAccess.getAvailableEqInterfaceAccess().getCountINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvailableEqInterface__CountAssignment_0"


    // $ANTLR start "rule__AvailableEqInterface__EqInterfaceTypeAssignment_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6048:1: rule__AvailableEqInterface__EqInterfaceTypeAssignment_2 : ( ruleEqInterfaceType ) ;
    public final void rule__AvailableEqInterface__EqInterfaceTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6052:1: ( ( ruleEqInterfaceType ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6053:1: ( ruleEqInterfaceType )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6053:1: ( ruleEqInterfaceType )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6054:1: ruleEqInterfaceType
            {
             before(grammarAccess.getAvailableEqInterfaceAccess().getEqInterfaceTypeEqInterfaceTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEqInterfaceType_in_rule__AvailableEqInterface__EqInterfaceTypeAssignment_212228);
            ruleEqInterfaceType();

            state._fsp--;

             after(grammarAccess.getAvailableEqInterfaceAccess().getEqInterfaceTypeEqInterfaceTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvailableEqInterface__EqInterfaceTypeAssignment_2"


    // $ANTLR start "rule__EqInterfaceGroup__NameAssignment_1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6063:1: rule__EqInterfaceGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EqInterfaceGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6067:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6068:1: ( RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6068:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6069:1: RULE_ID
            {
             before(grammarAccess.getEqInterfaceGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EqInterfaceGroup__NameAssignment_112259); 
             after(grammarAccess.getEqInterfaceGroupAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__NameAssignment_1"


    // $ANTLR start "rule__EqInterfaceGroup__EqInterfacesAssignment_3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6078:1: rule__EqInterfaceGroup__EqInterfacesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__EqInterfaceGroup__EqInterfacesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6082:1: ( ( ( RULE_ID ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6083:1: ( ( RULE_ID ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6083:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6084:1: ( RULE_ID )
            {
             before(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_3_0()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6085:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6086:1: RULE_ID
            {
             before(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EqInterfaceGroup__EqInterfacesAssignment_312294); 
             after(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__EqInterfacesAssignment_3"


    // $ANTLR start "rule__EqInterfaceGroup__EqInterfacesAssignment_4_1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6097:1: rule__EqInterfaceGroup__EqInterfacesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__EqInterfaceGroup__EqInterfacesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6101:1: ( ( ( RULE_ID ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6102:1: ( ( RULE_ID ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6102:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6103:1: ( RULE_ID )
            {
             before(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_4_1_0()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6104:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6105:1: RULE_ID
            {
             before(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EqInterfaceGroup__EqInterfacesAssignment_4_112333); 
             after(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterfaceGroup__EqInterfacesAssignment_4_1"


    // $ANTLR start "rule__EqInterface__NameAssignment_1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6116:1: rule__EqInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EqInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6120:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6121:1: ( RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6121:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6122:1: RULE_ID
            {
             before(grammarAccess.getEqInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EqInterface__NameAssignment_112368); 
             after(grammarAccess.getEqInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__NameAssignment_1"


    // $ANTLR start "rule__EqInterface__SystemAssignment_3_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6131:1: rule__EqInterface__SystemAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__SystemAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6135:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6136:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6136:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6137:1: RULE_STRING
            {
             before(grammarAccess.getEqInterfaceAccess().getSystemSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__SystemAssignment_3_212399); 
             after(grammarAccess.getEqInterfaceAccess().getSystemSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__SystemAssignment_3_2"


    // $ANTLR start "rule__EqInterface__SubAtaAssignment_4_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6146:1: rule__EqInterface__SubAtaAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__SubAtaAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6150:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6151:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6151:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6152:1: RULE_STRING
            {
             before(grammarAccess.getEqInterfaceAccess().getSubAtaSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__SubAtaAssignment_4_212430); 
             after(grammarAccess.getEqInterfaceAccess().getSubAtaSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__SubAtaAssignment_4_2"


    // $ANTLR start "rule__EqInterface__ResourceAssignment_5_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6161:1: rule__EqInterface__ResourceAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__ResourceAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6165:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6166:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6166:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6167:1: RULE_STRING
            {
             before(grammarAccess.getEqInterfaceAccess().getResourceSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__ResourceAssignment_5_212461); 
             after(grammarAccess.getEqInterfaceAccess().getResourceSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__ResourceAssignment_5_2"


    // $ANTLR start "rule__EqInterface__LineNameAssignment_6_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6176:1: rule__EqInterface__LineNameAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__LineNameAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6180:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6181:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6181:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6182:1: RULE_STRING
            {
             before(grammarAccess.getEqInterfaceAccess().getLineNameSTRINGTerminalRuleCall_6_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__LineNameAssignment_6_212492); 
             after(grammarAccess.getEqInterfaceAccess().getLineNameSTRINGTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__LineNameAssignment_6_2"


    // $ANTLR start "rule__EqInterface__WiringLaneAssignment_7_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6191:1: rule__EqInterface__WiringLaneAssignment_7_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__WiringLaneAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6195:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6196:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6196:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6197:1: RULE_STRING
            {
             before(grammarAccess.getEqInterfaceAccess().getWiringLaneSTRINGTerminalRuleCall_7_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__WiringLaneAssignment_7_212523); 
             after(grammarAccess.getEqInterfaceAccess().getWiringLaneSTRINGTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__WiringLaneAssignment_7_2"


    // $ANTLR start "rule__EqInterface__GrpInfoAssignment_8_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6206:1: rule__EqInterface__GrpInfoAssignment_8_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__GrpInfoAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6210:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6211:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6211:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6212:1: RULE_STRING
            {
             before(grammarAccess.getEqInterfaceAccess().getGrpInfoSTRINGTerminalRuleCall_8_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__GrpInfoAssignment_8_212554); 
             after(grammarAccess.getEqInterfaceAccess().getGrpInfoSTRINGTerminalRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__GrpInfoAssignment_8_2"


    // $ANTLR start "rule__EqInterface__RouteAssignment_9_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6221:1: rule__EqInterface__RouteAssignment_9_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__RouteAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6225:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6226:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6226:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6227:1: RULE_STRING
            {
             before(grammarAccess.getEqInterfaceAccess().getRouteSTRINGTerminalRuleCall_9_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__RouteAssignment_9_212585); 
             after(grammarAccess.getEqInterfaceAccess().getRouteSTRINGTerminalRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__RouteAssignment_9_2"


    // $ANTLR start "rule__EqInterface__PwSup1Assignment_10_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6236:1: rule__EqInterface__PwSup1Assignment_10_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__PwSup1Assignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6240:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6241:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6241:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6242:1: RULE_STRING
            {
             before(grammarAccess.getEqInterfaceAccess().getPwSup1STRINGTerminalRuleCall_10_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__PwSup1Assignment_10_212616); 
             after(grammarAccess.getEqInterfaceAccess().getPwSup1STRINGTerminalRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__PwSup1Assignment_10_2"


    // $ANTLR start "rule__EqInterface__EmhZone1Assignment_11_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6251:1: rule__EqInterface__EmhZone1Assignment_11_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__EmhZone1Assignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6255:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6256:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6256:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6257:1: RULE_STRING
            {
             before(grammarAccess.getEqInterfaceAccess().getEmhZone1STRINGTerminalRuleCall_11_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__EmhZone1Assignment_11_212647); 
             after(grammarAccess.getEqInterfaceAccess().getEmhZone1STRINGTerminalRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__EmhZone1Assignment_11_2"


    // $ANTLR start "rule__EqInterface__IoTypeAssignment_12_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6266:1: rule__EqInterface__IoTypeAssignment_12_2 : ( ruleEqInterfaceType ) ;
    public final void rule__EqInterface__IoTypeAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6270:1: ( ( ruleEqInterfaceType ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6271:1: ( ruleEqInterfaceType )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6271:1: ( ruleEqInterfaceType )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6272:1: ruleEqInterfaceType
            {
             before(grammarAccess.getEqInterfaceAccess().getIoTypeEqInterfaceTypeEnumRuleCall_12_2_0()); 
            pushFollow(FOLLOW_ruleEqInterfaceType_in_rule__EqInterface__IoTypeAssignment_12_212678);
            ruleEqInterfaceType();

            state._fsp--;

             after(grammarAccess.getEqInterfaceAccess().getIoTypeEqInterfaceTypeEnumRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__IoTypeAssignment_12_2"


    // $ANTLR start "rule__EqInterface__MetricParametersAssignment_13_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6281:1: rule__EqInterface__MetricParametersAssignment_13_2 : ( ruleMetricParameter ) ;
    public final void rule__EqInterface__MetricParametersAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6285:1: ( ( ruleMetricParameter ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6286:1: ( ruleMetricParameter )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6286:1: ( ruleMetricParameter )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6287:1: ruleMetricParameter
            {
             before(grammarAccess.getEqInterfaceAccess().getMetricParametersMetricParameterParserRuleCall_13_2_0()); 
            pushFollow(FOLLOW_ruleMetricParameter_in_rule__EqInterface__MetricParametersAssignment_13_212709);
            ruleMetricParameter();

            state._fsp--;

             after(grammarAccess.getEqInterfaceAccess().getMetricParametersMetricParameterParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqInterface__MetricParametersAssignment_13_2"


    // $ANTLR start "rule__MetricParameter__NameAssignment_0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6296:1: rule__MetricParameter__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MetricParameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6300:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6301:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6301:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6302:1: RULE_STRING
            {
             before(grammarAccess.getMetricParameterAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MetricParameter__NameAssignment_012740); 
             after(grammarAccess.getMetricParameterAccess().getNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricParameter__NameAssignment_0"


    // $ANTLR start "rule__MetricParameter__ValueAssignment_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6311:1: rule__MetricParameter__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__MetricParameter__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6315:1: ( ( RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6316:1: ( RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6316:1: ( RULE_INT )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6317:1: RULE_INT
            {
             before(grammarAccess.getMetricParameterAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__MetricParameter__ValueAssignment_212771); 
             after(grammarAccess.getMetricParameterAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricParameter__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAssistModel_in_entryRuleAssistModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssistModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__0_in_ruleAssistModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartment_in_entryRuleCompartment121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartment128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__0_in_ruleCompartment154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDC_in_entryRuleRDC181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRDC188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__0_in_ruleRDC214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__0_in_ruleConnector274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvailableEqInterface_in_entryRuleAvailableEqInterface301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvailableEqInterface308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__Group__0_in_ruleAvailableEqInterface334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroup_in_entryRuleEqInterfaceGroup361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterfaceGroup368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__0_in_ruleEqInterfaceGroup394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterface_in_entryRuleEqInterface421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqInterface428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__0_in_ruleEqInterface454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricParameter488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__0_in_ruleMetricParameter514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceType__Alternatives_in_ruleEqInterfaceType553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EqInterfaceType__Alternatives589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EqInterfaceType__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EqInterfaceType__Alternatives631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EqInterfaceType__Alternatives652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EqInterfaceType__Alternatives673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EqInterfaceType__Alternatives694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EqInterfaceType__Alternatives715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EqInterfaceType__Alternatives736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EqInterfaceType__Alternatives757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EqInterfaceType__Alternatives778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EqInterfaceType__Alternatives799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EqInterfaceType__Alternatives820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EqInterfaceType__Alternatives841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EqInterfaceType__Alternatives862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EqInterfaceType__Alternatives883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EqInterfaceType__Alternatives904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EqInterfaceType__Alternatives925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EqInterfaceType__Alternatives946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EqInterfaceType__Alternatives967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EqInterfaceType__Alternatives988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EqInterfaceType__Alternatives1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EqInterfaceType__Alternatives1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EqInterfaceType__Alternatives1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EqInterfaceType__Alternatives1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EqInterfaceType__Alternatives1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EqInterfaceType__Alternatives1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EqInterfaceType__Alternatives1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EqInterfaceType__Alternatives1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EqInterfaceType__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EqInterfaceType__Alternatives1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EqInterfaceType__Alternatives1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EqInterfaceType__Alternatives1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EqInterfaceType__Alternatives1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EqInterfaceType__Alternatives1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EqInterfaceType__Alternatives1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__EqInterfaceType__Alternatives1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EqInterfaceType__Alternatives1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__EqInterfaceType__Alternatives1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__EqInterfaceType__Alternatives1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__EqInterfaceType__Alternatives1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__EqInterfaceType__Alternatives1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__EqInterfaceType__Alternatives1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__EqInterfaceType__Alternatives1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__EqInterfaceType__Alternatives1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__EqInterfaceType__Alternatives1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__EqInterfaceType__Alternatives1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__0__Impl_in_rule__AssistModel__Group__01567 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__1_in_rule__AssistModel__Group__01570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__AssistModel__Group__0__Impl1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__1__Impl_in_rule__AssistModel__Group__11629 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__2_in_rule__AssistModel__Group__11632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__AssistModel__Group__1__Impl1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__2__Impl_in_rule__AssistModel__Group__21691 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__3_in_rule__AssistModel__Group__21694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__AssistModel__Group__2__Impl1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__3__Impl_in_rule__AssistModel__Group__31753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__4_in_rule__AssistModel__Group__31756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__AssistModel__Group__3__Impl1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__4__Impl_in_rule__AssistModel__Group__41815 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__5_in_rule__AssistModel__Group__41818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__SystemNameAssignment_4_in_rule__AssistModel__Group__4__Impl1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__5__Impl_in_rule__AssistModel__Group__51875 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__6_in_rule__AssistModel__Group__51878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__AssistModel__Group__5__Impl1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__6__Impl_in_rule__AssistModel__Group__61937 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__7_in_rule__AssistModel__Group__61940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__AssistModel__Group__6__Impl1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__7__Impl_in_rule__AssistModel__Group__71999 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__8_in_rule__AssistModel__Group__72002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__CompartmentsAssignment_7_in_rule__AssistModel__Group__7__Impl2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__8__Impl_in_rule__AssistModel__Group__82060 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__9_in_rule__AssistModel__Group__82063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_8__0_in_rule__AssistModel__Group__8__Impl2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__9__Impl_in_rule__AssistModel__Group__92121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_9__0_in_rule__AssistModel__Group__9__Impl2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_8__0__Impl_in_rule__AssistModel__Group_8__02199 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_8__1_in_rule__AssistModel__Group_8__02202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__AssistModel__Group_8__0__Impl2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_8__1__Impl_in_rule__AssistModel__Group_8__12261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_8__2_in_rule__AssistModel__Group_8__12264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__AssistModel__Group_8__1__Impl2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_8__2__Impl_in_rule__AssistModel__Group_8__22323 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_8__3_in_rule__AssistModel__Group_8__22326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__EqInterfacesAssignment_8_2_in_rule__AssistModel__Group_8__2__Impl2355 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_rule__AssistModel__EqInterfacesAssignment_8_2_in_rule__AssistModel__Group_8__2__Impl2367 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_8__3__Impl_in_rule__AssistModel__Group_8__32400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__AssistModel__Group_8__3__Impl2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_9__0__Impl_in_rule__AssistModel__Group_9__02467 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_9__1_in_rule__AssistModel__Group_9__02470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__AssistModel__Group_9__0__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_9__1__Impl_in_rule__AssistModel__Group_9__12529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_9__2_in_rule__AssistModel__Group_9__12532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__AssistModel__Group_9__1__Impl2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_9__2__Impl_in_rule__AssistModel__Group_9__22591 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_9__3_in_rule__AssistModel__Group_9__22594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__EqInterfaceGroupsAssignment_9_2_in_rule__AssistModel__Group_9__2__Impl2623 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__AssistModel__EqInterfaceGroupsAssignment_9_2_in_rule__AssistModel__Group_9__2__Impl2635 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_9__3__Impl_in_rule__AssistModel__Group_9__32668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__AssistModel__Group_9__3__Impl2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__0__Impl_in_rule__Compartment__Group__02735 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Compartment__Group__1_in_rule__Compartment__Group__02738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__Compartment__Group__0__Impl2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__1__Impl_in_rule__Compartment__Group__12797 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group__2_in_rule__Compartment__Group__12800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__NameAssignment_1_in_rule__Compartment__Group__1__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__2__Impl_in_rule__Compartment__Group__22857 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000BCL});
    public static final BitSet FOLLOW_rule__Compartment__Group__3_in_rule__Compartment__Group__22860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Compartment__Group__2__Impl2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__3__Impl_in_rule__Compartment__Group__32919 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000BCL});
    public static final BitSet FOLLOW_rule__Compartment__Group__4_in_rule__Compartment__Group__32922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3__0_in_rule__Compartment__Group__3__Impl2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__4__Impl_in_rule__Compartment__Group__42980 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000BCL});
    public static final BitSet FOLLOW_rule__Compartment__Group__5_in_rule__Compartment__Group__42983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_4__0_in_rule__Compartment__Group__4__Impl3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__5__Impl_in_rule__Compartment__Group__53041 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000BCL});
    public static final BitSet FOLLOW_rule__Compartment__Group__6_in_rule__Compartment__Group__53044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_5__0_in_rule__Compartment__Group__5__Impl3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__6__Impl_in_rule__Compartment__Group__63102 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000BCL});
    public static final BitSet FOLLOW_rule__Compartment__Group__7_in_rule__Compartment__Group__63105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_6__0_in_rule__Compartment__Group__6__Impl3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__7__Impl_in_rule__Compartment__Group__73163 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Compartment__Group__8_in_rule__Compartment__Group__73166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__RdcsAssignment_7_in_rule__Compartment__Group__7__Impl3195 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000BCL});
    public static final BitSet FOLLOW_rule__Compartment__RdcsAssignment_7_in_rule__Compartment__Group__7__Impl3207 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000BCL});
    public static final BitSet FOLLOW_rule__Compartment__Group__8__Impl_in_rule__Compartment__Group__83240 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Compartment__Group__9_in_rule__Compartment__Group__83243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_8__0_in_rule__Compartment__Group__8__Impl3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__9__Impl_in_rule__Compartment__Group__93301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Compartment__Group__9__Impl3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3__0__Impl_in_rule__Compartment__Group_3__03380 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3__1_in_rule__Compartment__Group_3__03383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__Compartment__Group_3__0__Impl3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3__1__Impl_in_rule__Compartment__Group_3__13442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3__2_in_rule__Compartment__Group_3__13445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Compartment__Group_3__1__Impl3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3__2__Impl_in_rule__Compartment__Group_3__23504 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3__3_in_rule__Compartment__Group_3__23507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__ManufacturerAssignment_3_2_in_rule__Compartment__Group_3__2__Impl3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3__3__Impl_in_rule__Compartment__Group_3__33564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Compartment__Group_3__3__Impl3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_4__0__Impl_in_rule__Compartment__Group_4__03631 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_4__1_in_rule__Compartment__Group_4__03634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__Compartment__Group_4__0__Impl3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_4__1__Impl_in_rule__Compartment__Group_4__13693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Compartment__Group_4__2_in_rule__Compartment__Group_4__13696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Compartment__Group_4__1__Impl3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_4__2__Impl_in_rule__Compartment__Group_4__23755 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_4__3_in_rule__Compartment__Group_4__23758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__PowerSupplyAssignment_4_2_in_rule__Compartment__Group_4__2__Impl3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_4__3__Impl_in_rule__Compartment__Group_4__33815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Compartment__Group_4__3__Impl3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_5__0__Impl_in_rule__Compartment__Group_5__03882 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_5__1_in_rule__Compartment__Group_5__03885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__Compartment__Group_5__0__Impl3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_5__1__Impl_in_rule__Compartment__Group_5__13944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Compartment__Group_5__2_in_rule__Compartment__Group_5__13947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Compartment__Group_5__1__Impl3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_5__2__Impl_in_rule__Compartment__Group_5__24006 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_5__3_in_rule__Compartment__Group_5__24009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__SideAssignment_5_2_in_rule__Compartment__Group_5__2__Impl4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_5__3__Impl_in_rule__Compartment__Group_5__34066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Compartment__Group_5__3__Impl4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_6__0__Impl_in_rule__Compartment__Group_6__04133 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_6__1_in_rule__Compartment__Group_6__04136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__Compartment__Group_6__0__Impl4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_6__1__Impl_in_rule__Compartment__Group_6__14195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Compartment__Group_6__2_in_rule__Compartment__Group_6__14198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Compartment__Group_6__1__Impl4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_6__2__Impl_in_rule__Compartment__Group_6__24257 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_6__3_in_rule__Compartment__Group_6__24260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__ZoneAssignment_6_2_in_rule__Compartment__Group_6__2__Impl4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_6__3__Impl_in_rule__Compartment__Group_6__34317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Compartment__Group_6__3__Impl4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_8__0__Impl_in_rule__Compartment__Group_8__04384 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_8__1_in_rule__Compartment__Group_8__04387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__Compartment__Group_8__0__Impl4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_8__1__Impl_in_rule__Compartment__Group_8__14446 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_rule__Compartment__Group_8__2_in_rule__Compartment__Group_8__14449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Compartment__Group_8__1__Impl4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_8__2__Impl_in_rule__Compartment__Group_8__24508 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_rule__Compartment__Group_8__3_in_rule__Compartment__Group_8__24511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__MetricParametersAssignment_8_2_in_rule__Compartment__Group_8__2__Impl4538 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Compartment__Group_8__3__Impl_in_rule__Compartment__Group_8__34569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Compartment__Group_8__3__Impl4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__0__Impl_in_rule__RDC__Group__04636 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RDC__Group__1_in_rule__RDC__Group__04639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__RDC__Group__0__Impl4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__1__Impl_in_rule__RDC__Group__14698 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group__2_in_rule__RDC__Group__14701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__NameAssignment_1_in_rule__RDC__Group__1__Impl4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__2__Impl_in_rule__RDC__Group__24758 = new BitSet(new long[]{0x0000000000000000L,0x000000000000070CL});
    public static final BitSet FOLLOW_rule__RDC__Group__3_in_rule__RDC__Group__24761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__RDC__Group__2__Impl4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__3__Impl_in_rule__RDC__Group__34820 = new BitSet(new long[]{0x0000000000000000L,0x000000000000070CL});
    public static final BitSet FOLLOW_rule__RDC__Group__4_in_rule__RDC__Group__34823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__0_in_rule__RDC__Group__3__Impl4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__4__Impl_in_rule__RDC__Group__44881 = new BitSet(new long[]{0x0000000000000000L,0x000000000000070CL});
    public static final BitSet FOLLOW_rule__RDC__Group__5_in_rule__RDC__Group__44884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__0_in_rule__RDC__Group__4__Impl4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__5__Impl_in_rule__RDC__Group__54942 = new BitSet(new long[]{0x0000000000000000L,0x000000000000070CL});
    public static final BitSet FOLLOW_rule__RDC__Group__6_in_rule__RDC__Group__54945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__0_in_rule__RDC__Group__5__Impl4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__6__Impl_in_rule__RDC__Group__65003 = new BitSet(new long[]{0x0000000000000000L,0x000000000000070CL});
    public static final BitSet FOLLOW_rule__RDC__Group__7_in_rule__RDC__Group__65006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__0_in_rule__RDC__Group__6__Impl5033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__7__Impl_in_rule__RDC__Group__75064 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RDC__Group__8_in_rule__RDC__Group__75067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__ConnectorsAssignment_7_in_rule__RDC__Group__7__Impl5096 = new BitSet(new long[]{0x0000000000000002L,0x000000000000070CL});
    public static final BitSet FOLLOW_rule__RDC__ConnectorsAssignment_7_in_rule__RDC__Group__7__Impl5108 = new BitSet(new long[]{0x0000000000000002L,0x000000000000070CL});
    public static final BitSet FOLLOW_rule__RDC__Group__8__Impl_in_rule__RDC__Group__85141 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RDC__Group__9_in_rule__RDC__Group__85144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__0_in_rule__RDC__Group__8__Impl5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__9__Impl_in_rule__RDC__Group__95202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__RDC__Group__9__Impl5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__0__Impl_in_rule__RDC__Group_3__05281 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__1_in_rule__RDC__Group_3__05284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__RDC__Group_3__0__Impl5312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__1__Impl_in_rule__RDC__Group_3__15343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__2_in_rule__RDC__Group_3__15346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__RDC__Group_3__1__Impl5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__2__Impl_in_rule__RDC__Group_3__25405 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__3_in_rule__RDC__Group_3__25408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__ManufacturerAssignment_3_2_in_rule__RDC__Group_3__2__Impl5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__3__Impl_in_rule__RDC__Group_3__35465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__RDC__Group_3__3__Impl5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__0__Impl_in_rule__RDC__Group_4__05532 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__1_in_rule__RDC__Group_4__05535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__RDC__Group_4__0__Impl5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__1__Impl_in_rule__RDC__Group_4__15594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__2_in_rule__RDC__Group_4__15597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__RDC__Group_4__1__Impl5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__2__Impl_in_rule__RDC__Group_4__25656 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__3_in_rule__RDC__Group_4__25659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__PowerSupplyAssignment_4_2_in_rule__RDC__Group_4__2__Impl5686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__3__Impl_in_rule__RDC__Group_4__35716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__RDC__Group_4__3__Impl5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__0__Impl_in_rule__RDC__Group_5__05783 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__1_in_rule__RDC__Group_5__05786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__RDC__Group_5__0__Impl5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__1__Impl_in_rule__RDC__Group_5__15845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__2_in_rule__RDC__Group_5__15848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__RDC__Group_5__1__Impl5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__2__Impl_in_rule__RDC__Group_5__25907 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__3_in_rule__RDC__Group_5__25910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__RdcTypeAssignment_5_2_in_rule__RDC__Group_5__2__Impl5937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__3__Impl_in_rule__RDC__Group_5__35967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__RDC__Group_5__3__Impl5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__0__Impl_in_rule__RDC__Group_6__06034 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__1_in_rule__RDC__Group_6__06037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__RDC__Group_6__0__Impl6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__1__Impl_in_rule__RDC__Group_6__16096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__2_in_rule__RDC__Group_6__16099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__RDC__Group_6__1__Impl6127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__2__Impl_in_rule__RDC__Group_6__26158 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__3_in_rule__RDC__Group_6__26161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__EssAssignment_6_2_in_rule__RDC__Group_6__2__Impl6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__3__Impl_in_rule__RDC__Group_6__36218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__RDC__Group_6__3__Impl6246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__0__Impl_in_rule__RDC__Group_8__06285 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__1_in_rule__RDC__Group_8__06288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__RDC__Group_8__0__Impl6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__1__Impl_in_rule__RDC__Group_8__16347 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__2_in_rule__RDC__Group_8__16350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__RDC__Group_8__1__Impl6378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__2__Impl_in_rule__RDC__Group_8__26409 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__3_in_rule__RDC__Group_8__26412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__MetricParametersAssignment_8_2_in_rule__RDC__Group_8__2__Impl6439 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__3__Impl_in_rule__RDC__Group_8__36470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__RDC__Group_8__3__Impl6498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__0__Impl_in_rule__Connector__Group__06537 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Connector__Group__1_in_rule__Connector__Group__06540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__Connector__Group__0__Impl6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__1__Impl_in_rule__Connector__Group__16599 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Connector__Group__2_in_rule__Connector__Group__16602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__NameAssignment_1_in_rule__Connector__Group__1__Impl6629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__2__Impl_in_rule__Connector__Group__26659 = new BitSet(new long[]{0x4000000000000040L});
    public static final BitSet FOLLOW_rule__Connector__Group__3_in_rule__Connector__Group__26662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Connector__Group__2__Impl6690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__3__Impl_in_rule__Connector__Group__36721 = new BitSet(new long[]{0x4000000000000040L});
    public static final BitSet FOLLOW_rule__Connector__Group__4_in_rule__Connector__Group__36724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__AvailableEqInterfacesAssignment_3_in_rule__Connector__Group__3__Impl6751 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Connector__Group__4__Impl_in_rule__Connector__Group__46782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Connector__Group__4__Impl6810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__Group__0__Impl_in_rule__AvailableEqInterface__Group__06851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__Group__1_in_rule__AvailableEqInterface__Group__06854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__CountAssignment_0_in_rule__AvailableEqInterface__Group__0__Impl6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__Group__1__Impl_in_rule__AvailableEqInterface__Group__16911 = new BitSet(new long[]{0x01FFFFFFFFFFF800L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__Group__2_in_rule__AvailableEqInterface__Group__16914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__AvailableEqInterface__Group__1__Impl6942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__Group__2__Impl_in_rule__AvailableEqInterface__Group__26973 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__Group__3_in_rule__AvailableEqInterface__Group__26976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__EqInterfaceTypeAssignment_2_in_rule__AvailableEqInterface__Group__2__Impl7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__Group__3__Impl_in_rule__AvailableEqInterface__Group__37033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__AvailableEqInterface__Group__3__Impl7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__0__Impl_in_rule__EqInterfaceGroup__Group__07100 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__1_in_rule__EqInterfaceGroup__Group__07103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__EqInterfaceGroup__Group__0__Impl7131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__1__Impl_in_rule__EqInterfaceGroup__Group__17162 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__2_in_rule__EqInterfaceGroup__Group__17165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__NameAssignment_1_in_rule__EqInterfaceGroup__Group__1__Impl7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__2__Impl_in_rule__EqInterfaceGroup__Group__27222 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__3_in_rule__EqInterfaceGroup__Group__27225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__EqInterfaceGroup__Group__2__Impl7253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__3__Impl_in_rule__EqInterfaceGroup__Group__37284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__4_in_rule__EqInterfaceGroup__Group__37287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__EqInterfacesAssignment_3_in_rule__EqInterfaceGroup__Group__3__Impl7314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__4__Impl_in_rule__EqInterfaceGroup__Group__47344 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__5_in_rule__EqInterfaceGroup__Group__47347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group_4__0_in_rule__EqInterfaceGroup__Group__4__Impl7376 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group_4__0_in_rule__EqInterfaceGroup__Group__4__Impl7388 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__5__Impl_in_rule__EqInterfaceGroup__Group__57421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__EqInterfaceGroup__Group__5__Impl7449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group_4__0__Impl_in_rule__EqInterfaceGroup__Group_4__07492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group_4__1_in_rule__EqInterfaceGroup__Group_4__07495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__EqInterfaceGroup__Group_4__0__Impl7523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group_4__1__Impl_in_rule__EqInterfaceGroup__Group_4__17554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__EqInterfacesAssignment_4_1_in_rule__EqInterfaceGroup__Group_4__1__Impl7581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__0__Impl_in_rule__EqInterface__Group__07615 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__1_in_rule__EqInterface__Group__07618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__EqInterface__Group__0__Impl7646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__1__Impl_in_rule__EqInterface__Group__17677 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__2_in_rule__EqInterface__Group__17680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__NameAssignment_1_in_rule__EqInterface__Group__1__Impl7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__2__Impl_in_rule__EqInterface__Group__27737 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__3_in_rule__EqInterface__Group__27740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__EqInterface__Group__2__Impl7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__3__Impl_in_rule__EqInterface__Group__37799 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__4_in_rule__EqInterface__Group__37802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_3__0_in_rule__EqInterface__Group__3__Impl7829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__4__Impl_in_rule__EqInterface__Group__47860 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__5_in_rule__EqInterface__Group__47863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_4__0_in_rule__EqInterface__Group__4__Impl7890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__5__Impl_in_rule__EqInterface__Group__57921 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__6_in_rule__EqInterface__Group__57924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_5__0_in_rule__EqInterface__Group__5__Impl7951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__6__Impl_in_rule__EqInterface__Group__67982 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__7_in_rule__EqInterface__Group__67985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_6__0_in_rule__EqInterface__Group__6__Impl8012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__7__Impl_in_rule__EqInterface__Group__78043 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__8_in_rule__EqInterface__Group__78046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_7__0_in_rule__EqInterface__Group__7__Impl8073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__8__Impl_in_rule__EqInterface__Group__88104 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__9_in_rule__EqInterface__Group__88107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_8__0_in_rule__EqInterface__Group__8__Impl8134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__9__Impl_in_rule__EqInterface__Group__98165 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__10_in_rule__EqInterface__Group__98168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_9__0_in_rule__EqInterface__Group__9__Impl8195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__10__Impl_in_rule__EqInterface__Group__108226 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__11_in_rule__EqInterface__Group__108229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_10__0_in_rule__EqInterface__Group__10__Impl8256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__11__Impl_in_rule__EqInterface__Group__118287 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__12_in_rule__EqInterface__Group__118290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_11__0_in_rule__EqInterface__Group__11__Impl8317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__12__Impl_in_rule__EqInterface__Group__128348 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__13_in_rule__EqInterface__Group__128351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_12__0_in_rule__EqInterface__Group__12__Impl8378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__13__Impl_in_rule__EqInterface__Group__138409 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__14_in_rule__EqInterface__Group__138412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_13__0_in_rule__EqInterface__Group__13__Impl8439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__14__Impl_in_rule__EqInterface__Group__148470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__EqInterface__Group__14__Impl8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_3__0__Impl_in_rule__EqInterface__Group_3__08559 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_3__1_in_rule__EqInterface__Group_3__08562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rule__EqInterface__Group_3__0__Impl8590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_3__1__Impl_in_rule__EqInterface__Group_3__18621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_3__2_in_rule__EqInterface__Group_3__18624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__EqInterface__Group_3__1__Impl8652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_3__2__Impl_in_rule__EqInterface__Group_3__28683 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_3__3_in_rule__EqInterface__Group_3__28686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__SystemAssignment_3_2_in_rule__EqInterface__Group_3__2__Impl8713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_3__3__Impl_in_rule__EqInterface__Group_3__38743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__EqInterface__Group_3__3__Impl8771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_4__0__Impl_in_rule__EqInterface__Group_4__08810 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_4__1_in_rule__EqInterface__Group_4__08813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rule__EqInterface__Group_4__0__Impl8841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_4__1__Impl_in_rule__EqInterface__Group_4__18872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_4__2_in_rule__EqInterface__Group_4__18875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__EqInterface__Group_4__1__Impl8903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_4__2__Impl_in_rule__EqInterface__Group_4__28934 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_4__3_in_rule__EqInterface__Group_4__28937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__SubAtaAssignment_4_2_in_rule__EqInterface__Group_4__2__Impl8964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_4__3__Impl_in_rule__EqInterface__Group_4__38994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__EqInterface__Group_4__3__Impl9022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_5__0__Impl_in_rule__EqInterface__Group_5__09061 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_5__1_in_rule__EqInterface__Group_5__09064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rule__EqInterface__Group_5__0__Impl9092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_5__1__Impl_in_rule__EqInterface__Group_5__19123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_5__2_in_rule__EqInterface__Group_5__19126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__EqInterface__Group_5__1__Impl9154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_5__2__Impl_in_rule__EqInterface__Group_5__29185 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_5__3_in_rule__EqInterface__Group_5__29188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__ResourceAssignment_5_2_in_rule__EqInterface__Group_5__2__Impl9215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_5__3__Impl_in_rule__EqInterface__Group_5__39245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__EqInterface__Group_5__3__Impl9273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_6__0__Impl_in_rule__EqInterface__Group_6__09312 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_6__1_in_rule__EqInterface__Group_6__09315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rule__EqInterface__Group_6__0__Impl9343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_6__1__Impl_in_rule__EqInterface__Group_6__19374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_6__2_in_rule__EqInterface__Group_6__19377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__EqInterface__Group_6__1__Impl9405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_6__2__Impl_in_rule__EqInterface__Group_6__29436 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_6__3_in_rule__EqInterface__Group_6__29439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__LineNameAssignment_6_2_in_rule__EqInterface__Group_6__2__Impl9466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_6__3__Impl_in_rule__EqInterface__Group_6__39496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__EqInterface__Group_6__3__Impl9524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_7__0__Impl_in_rule__EqInterface__Group_7__09563 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_7__1_in_rule__EqInterface__Group_7__09566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rule__EqInterface__Group_7__0__Impl9594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_7__1__Impl_in_rule__EqInterface__Group_7__19625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_7__2_in_rule__EqInterface__Group_7__19628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__EqInterface__Group_7__1__Impl9656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_7__2__Impl_in_rule__EqInterface__Group_7__29687 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_7__3_in_rule__EqInterface__Group_7__29690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__WiringLaneAssignment_7_2_in_rule__EqInterface__Group_7__2__Impl9717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_7__3__Impl_in_rule__EqInterface__Group_7__39747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__EqInterface__Group_7__3__Impl9775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_8__0__Impl_in_rule__EqInterface__Group_8__09814 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_8__1_in_rule__EqInterface__Group_8__09817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_rule__EqInterface__Group_8__0__Impl9845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_8__1__Impl_in_rule__EqInterface__Group_8__19876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_8__2_in_rule__EqInterface__Group_8__19879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__EqInterface__Group_8__1__Impl9907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_8__2__Impl_in_rule__EqInterface__Group_8__29938 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_8__3_in_rule__EqInterface__Group_8__29941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__GrpInfoAssignment_8_2_in_rule__EqInterface__Group_8__2__Impl9968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_8__3__Impl_in_rule__EqInterface__Group_8__39998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__EqInterface__Group_8__3__Impl10026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_9__0__Impl_in_rule__EqInterface__Group_9__010065 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_9__1_in_rule__EqInterface__Group_9__010068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rule__EqInterface__Group_9__0__Impl10096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_9__1__Impl_in_rule__EqInterface__Group_9__110127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_9__2_in_rule__EqInterface__Group_9__110130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__EqInterface__Group_9__1__Impl10158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_9__2__Impl_in_rule__EqInterface__Group_9__210189 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_9__3_in_rule__EqInterface__Group_9__210192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__RouteAssignment_9_2_in_rule__EqInterface__Group_9__2__Impl10219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_9__3__Impl_in_rule__EqInterface__Group_9__310249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__EqInterface__Group_9__3__Impl10277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_10__0__Impl_in_rule__EqInterface__Group_10__010316 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_10__1_in_rule__EqInterface__Group_10__010319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_rule__EqInterface__Group_10__0__Impl10347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_10__1__Impl_in_rule__EqInterface__Group_10__110378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_10__2_in_rule__EqInterface__Group_10__110381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__EqInterface__Group_10__1__Impl10409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_10__2__Impl_in_rule__EqInterface__Group_10__210440 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_10__3_in_rule__EqInterface__Group_10__210443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__PwSup1Assignment_10_2_in_rule__EqInterface__Group_10__2__Impl10470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_10__3__Impl_in_rule__EqInterface__Group_10__310500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__EqInterface__Group_10__3__Impl10528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_11__0__Impl_in_rule__EqInterface__Group_11__010567 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_11__1_in_rule__EqInterface__Group_11__010570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_rule__EqInterface__Group_11__0__Impl10598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_11__1__Impl_in_rule__EqInterface__Group_11__110629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_11__2_in_rule__EqInterface__Group_11__110632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__EqInterface__Group_11__1__Impl10660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_11__2__Impl_in_rule__EqInterface__Group_11__210691 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_11__3_in_rule__EqInterface__Group_11__210694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__EmhZone1Assignment_11_2_in_rule__EqInterface__Group_11__2__Impl10721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_11__3__Impl_in_rule__EqInterface__Group_11__310751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__EqInterface__Group_11__3__Impl10779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_12__0__Impl_in_rule__EqInterface__Group_12__010818 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_12__1_in_rule__EqInterface__Group_12__010821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__EqInterface__Group_12__0__Impl10849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_12__1__Impl_in_rule__EqInterface__Group_12__110880 = new BitSet(new long[]{0x01FFFFFFFFFFF800L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_12__2_in_rule__EqInterface__Group_12__110883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__EqInterface__Group_12__1__Impl10911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_12__2__Impl_in_rule__EqInterface__Group_12__210942 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_12__3_in_rule__EqInterface__Group_12__210945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__IoTypeAssignment_12_2_in_rule__EqInterface__Group_12__2__Impl10972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_12__3__Impl_in_rule__EqInterface__Group_12__311002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__EqInterface__Group_12__3__Impl11030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_13__0__Impl_in_rule__EqInterface__Group_13__011069 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_13__1_in_rule__EqInterface__Group_13__011072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__EqInterface__Group_13__0__Impl11100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_13__1__Impl_in_rule__EqInterface__Group_13__111131 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_13__2_in_rule__EqInterface__Group_13__111134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__EqInterface__Group_13__1__Impl11162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_13__2__Impl_in_rule__EqInterface__Group_13__211193 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_13__3_in_rule__EqInterface__Group_13__211196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__MetricParametersAssignment_13_2_in_rule__EqInterface__Group_13__2__Impl11223 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_13__3__Impl_in_rule__EqInterface__Group_13__311254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__EqInterface__Group_13__3__Impl11282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__0__Impl_in_rule__MetricParameter__Group__011321 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__1_in_rule__MetricParameter__Group__011324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__NameAssignment_0_in_rule__MetricParameter__Group__0__Impl11351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__1__Impl_in_rule__MetricParameter__Group__111381 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__2_in_rule__MetricParameter__Group__111384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__MetricParameter__Group__1__Impl11412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__2__Impl_in_rule__MetricParameter__Group__211443 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__3_in_rule__MetricParameter__Group__211446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__ValueAssignment_2_in_rule__MetricParameter__Group__2__Impl11473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__3__Impl_in_rule__MetricParameter__Group__311503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__MetricParameter__Group__3__Impl11531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AssistModel__SystemNameAssignment_411577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartment_in_rule__AssistModel__CompartmentsAssignment_711608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterface_in_rule__AssistModel__EqInterfacesAssignment_8_211639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroup_in_rule__AssistModel__EqInterfaceGroupsAssignment_9_211670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Compartment__NameAssignment_111701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Compartment__ManufacturerAssignment_3_211732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Compartment__PowerSupplyAssignment_4_211763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Compartment__SideAssignment_5_211794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Compartment__ZoneAssignment_6_211825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDC_in_rule__Compartment__RdcsAssignment_711856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_rule__Compartment__MetricParametersAssignment_8_211887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RDC__NameAssignment_111918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RDC__ManufacturerAssignment_3_211949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RDC__PowerSupplyAssignment_4_211980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RDC__RdcTypeAssignment_5_212011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RDC__EssAssignment_6_212042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_rule__RDC__ConnectorsAssignment_712073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_rule__RDC__MetricParametersAssignment_8_212104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Connector__NameAssignment_112135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvailableEqInterface_in_rule__Connector__AvailableEqInterfacesAssignment_312166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AvailableEqInterface__CountAssignment_012197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceType_in_rule__AvailableEqInterface__EqInterfaceTypeAssignment_212228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EqInterfaceGroup__NameAssignment_112259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EqInterfaceGroup__EqInterfacesAssignment_312294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EqInterfaceGroup__EqInterfacesAssignment_4_112333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EqInterface__NameAssignment_112368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__SystemAssignment_3_212399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__SubAtaAssignment_4_212430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__ResourceAssignment_5_212461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__LineNameAssignment_6_212492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__WiringLaneAssignment_7_212523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__GrpInfoAssignment_8_212554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__RouteAssignment_9_212585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__PwSup1Assignment_10_212616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__EmhZone1Assignment_11_212647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceType_in_rule__EqInterface__IoTypeAssignment_12_212678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_rule__EqInterface__MetricParametersAssignment_13_212709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MetricParameter__NameAssignment_012740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__MetricParameter__ValueAssignment_212771 = new BitSet(new long[]{0x0000000000000002L});

}