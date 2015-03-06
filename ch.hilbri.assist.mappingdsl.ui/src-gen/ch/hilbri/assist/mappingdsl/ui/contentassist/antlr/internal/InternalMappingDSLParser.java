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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMappingDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Compartment'", "'RDC'", "'Connector'", "'Can'", "'Enhanced Local Bus'", "'Ethernet'", "'Analog'", "'Digital'", "'Serial'", "'CustomType0'", "'CustomType1'", "'CustomType2'", "'CustomType3'", "'CustomType4'", "'CustomType5'", "'CustomType6'", "'CustomType7'", "'CustomType8'", "'CustomType9'", "'CustomType10'", "'CustomType11'", "'CustomType12'", "'CustomType13'", "'CustomType14'", "'CustomType15'", "'CustomType16'", "'CustomType17'", "'CustomType18'", "'CustomType19'", "'CustomType20'", "'CustomType21'", "'CustomType22'", "'CustomType23'", "'CustomType24'", "'CustomType25'", "'CustomType26'", "'CustomType27'", "'CustomType28'", "'CustomType29'", "'CustomType30'", "'CustomType31'", "'CustomType32'", "'CustomType33'", "'CustomType34'", "'CustomType35'", "'CustomType36'", "'CustomType37'", "'CustomType38'", "'CustomType39'", "'Global'", "'{'", "'System name'", "'='", "';'", "'}'", "'Interfaces'", "'InterfaceGroups'", "'Restrictions'", "'Manufacturer'", "'PowerSupply'", "'Side'", "'Zone'", "'Type'", "'ESS'", "'Generic properties'", "'interface with type'", "'Group'", "','", "'Interface'", "'InterfaceSystem'", "'SubAta'", "'Resource'", "'LineName'", "'WiringLane'", "'GrpInfo'", "'Route'", "'PwSup1'", "'EmhZone1'", "'dislocal up to'"
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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelRule()); 
            }
            pushFollow(FOLLOW_ruleAssistModel_in_entryRuleAssistModel61);
            ruleAssistModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssistModel68); if (state.failed) return ;

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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getGroup()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:76:1: ( rule__AssistModel__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:76:2: rule__AssistModel__Group__0
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__0_in_ruleAssistModel94);
            rule__AssistModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getGroup()); 
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
    // $ANTLR end "ruleAssistModel"


    // $ANTLR start "entryRuleCompartment"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:88:1: entryRuleCompartment : ruleCompartment EOF ;
    public final void entryRuleCompartment() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:89:1: ( ruleCompartment EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:90:1: ruleCompartment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentRule()); 
            }
            pushFollow(FOLLOW_ruleCompartment_in_entryRuleCompartment121);
            ruleCompartment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartment128); if (state.failed) return ;

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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getGroup()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:104:1: ( rule__Compartment__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:104:2: rule__Compartment__Group__0
            {
            pushFollow(FOLLOW_rule__Compartment__Group__0_in_ruleCompartment154);
            rule__Compartment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getGroup()); 
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
    // $ANTLR end "ruleCompartment"


    // $ANTLR start "entryRuleRDC"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:116:1: entryRuleRDC : ruleRDC EOF ;
    public final void entryRuleRDC() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:117:1: ( ruleRDC EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:118:1: ruleRDC EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCRule()); 
            }
            pushFollow(FOLLOW_ruleRDC_in_entryRuleRDC181);
            ruleRDC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDC188); if (state.failed) return ;

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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getGroup()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:132:1: ( rule__RDC__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:132:2: rule__RDC__Group__0
            {
            pushFollow(FOLLOW_rule__RDC__Group__0_in_ruleRDC214);
            rule__RDC__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getGroup()); 
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
    // $ANTLR end "ruleRDC"


    // $ANTLR start "entryRuleConnector"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:144:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:145:1: ( ruleConnector EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:146:1: ruleConnector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorRule()); 
            }
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector241);
            ruleConnector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector248); if (state.failed) return ;

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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getGroup()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:160:1: ( rule__Connector__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:160:2: rule__Connector__Group__0
            {
            pushFollow(FOLLOW_rule__Connector__Group__0_in_ruleConnector274);
            rule__Connector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getGroup()); 
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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleAvailableEqInterface"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:172:1: entryRuleAvailableEqInterface : ruleAvailableEqInterface EOF ;
    public final void entryRuleAvailableEqInterface() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:173:1: ( ruleAvailableEqInterface EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:174:1: ruleAvailableEqInterface EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvailableEqInterfaceRule()); 
            }
            pushFollow(FOLLOW_ruleAvailableEqInterface_in_entryRuleAvailableEqInterface301);
            ruleAvailableEqInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvailableEqInterfaceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvailableEqInterface308); if (state.failed) return ;

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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvailableEqInterfaceAccess().getGroup()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:188:1: ( rule__AvailableEqInterface__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:188:2: rule__AvailableEqInterface__Group__0
            {
            pushFollow(FOLLOW_rule__AvailableEqInterface__Group__0_in_ruleAvailableEqInterface334);
            rule__AvailableEqInterface__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvailableEqInterfaceAccess().getGroup()); 
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
    // $ANTLR end "ruleAvailableEqInterface"


    // $ANTLR start "entryRuleEqInterfaceGroup"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:200:1: entryRuleEqInterfaceGroup : ruleEqInterfaceGroup EOF ;
    public final void entryRuleEqInterfaceGroup() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:201:1: ( ruleEqInterfaceGroup EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:202:1: ruleEqInterfaceGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceGroupRule()); 
            }
            pushFollow(FOLLOW_ruleEqInterfaceGroup_in_entryRuleEqInterfaceGroup361);
            ruleEqInterfaceGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceGroupRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterfaceGroup368); if (state.failed) return ;

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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceGroupAccess().getGroup()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:216:1: ( rule__EqInterfaceGroup__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:216:2: rule__EqInterfaceGroup__Group__0
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__0_in_ruleEqInterfaceGroup394);
            rule__EqInterfaceGroup__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceGroupAccess().getGroup()); 
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
    // $ANTLR end "ruleEqInterfaceGroup"


    // $ANTLR start "entryRuleEqInterface"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:228:1: entryRuleEqInterface : ruleEqInterface EOF ;
    public final void entryRuleEqInterface() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:229:1: ( ruleEqInterface EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:230:1: ruleEqInterface EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceRule()); 
            }
            pushFollow(FOLLOW_ruleEqInterface_in_entryRuleEqInterface421);
            ruleEqInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqInterface428); if (state.failed) return ;

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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getGroup()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:244:1: ( rule__EqInterface__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:244:2: rule__EqInterface__Group__0
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__0_in_ruleEqInterface454);
            rule__EqInterface__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getGroup()); 
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
    // $ANTLR end "ruleEqInterface"


    // $ANTLR start "entryRuleDislocalityRelation"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:256:1: entryRuleDislocalityRelation : ruleDislocalityRelation EOF ;
    public final void entryRuleDislocalityRelation() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:257:1: ( ruleDislocalityRelation EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:258:1: ruleDislocalityRelation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDislocalityRelationRule()); 
            }
            pushFollow(FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation481);
            ruleDislocalityRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDislocalityRelationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDislocalityRelation488); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDislocalityRelation"


    // $ANTLR start "ruleDislocalityRelation"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:265:1: ruleDislocalityRelation : ( ( rule__DislocalityRelation__Group__0 ) ) ;
    public final void ruleDislocalityRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:269:2: ( ( ( rule__DislocalityRelation__Group__0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:270:1: ( ( rule__DislocalityRelation__Group__0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:270:1: ( ( rule__DislocalityRelation__Group__0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:271:1: ( rule__DislocalityRelation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDislocalityRelationAccess().getGroup()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:272:1: ( rule__DislocalityRelation__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:272:2: rule__DislocalityRelation__Group__0
            {
            pushFollow(FOLLOW_rule__DislocalityRelation__Group__0_in_ruleDislocalityRelation514);
            rule__DislocalityRelation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDislocalityRelationAccess().getGroup()); 
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
    // $ANTLR end "ruleDislocalityRelation"


    // $ANTLR start "entryRuleMetricParameter"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:284:1: entryRuleMetricParameter : ruleMetricParameter EOF ;
    public final void entryRuleMetricParameter() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:285:1: ( ruleMetricParameter EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:286:1: ruleMetricParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricParameterRule()); 
            }
            pushFollow(FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter541);
            ruleMetricParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricParameter548); if (state.failed) return ;

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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:293:1: ruleMetricParameter : ( ( rule__MetricParameter__Group__0 ) ) ;
    public final void ruleMetricParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:297:2: ( ( ( rule__MetricParameter__Group__0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:298:1: ( ( rule__MetricParameter__Group__0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:298:1: ( ( rule__MetricParameter__Group__0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:299:1: ( rule__MetricParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricParameterAccess().getGroup()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:300:1: ( rule__MetricParameter__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:300:2: rule__MetricParameter__Group__0
            {
            pushFollow(FOLLOW_rule__MetricParameter__Group__0_in_ruleMetricParameter574);
            rule__MetricParameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricParameterAccess().getGroup()); 
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
    // $ANTLR end "ruleMetricParameter"


    // $ANTLR start "ruleHardwareArchitectureLevelType"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:315:1: ruleHardwareArchitectureLevelType : ( ( rule__HardwareArchitectureLevelType__Alternatives ) ) ;
    public final void ruleHardwareArchitectureLevelType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:319:1: ( ( ( rule__HardwareArchitectureLevelType__Alternatives ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:320:1: ( ( rule__HardwareArchitectureLevelType__Alternatives ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:320:1: ( ( rule__HardwareArchitectureLevelType__Alternatives ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:321:1: ( rule__HardwareArchitectureLevelType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHardwareArchitectureLevelTypeAccess().getAlternatives()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:322:1: ( rule__HardwareArchitectureLevelType__Alternatives )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:322:2: rule__HardwareArchitectureLevelType__Alternatives
            {
            pushFollow(FOLLOW_rule__HardwareArchitectureLevelType__Alternatives_in_ruleHardwareArchitectureLevelType613);
            rule__HardwareArchitectureLevelType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHardwareArchitectureLevelTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleHardwareArchitectureLevelType"


    // $ANTLR start "ruleEqInterfaceType"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:334:1: ruleEqInterfaceType : ( ( rule__EqInterfaceType__Alternatives ) ) ;
    public final void ruleEqInterfaceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:338:1: ( ( ( rule__EqInterfaceType__Alternatives ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:339:1: ( ( rule__EqInterfaceType__Alternatives ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:339:1: ( ( rule__EqInterfaceType__Alternatives ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:340:1: ( rule__EqInterfaceType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceTypeAccess().getAlternatives()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:341:1: ( rule__EqInterfaceType__Alternatives )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:341:2: rule__EqInterfaceType__Alternatives
            {
            pushFollow(FOLLOW_rule__EqInterfaceType__Alternatives_in_ruleEqInterfaceType649);
            rule__EqInterfaceType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleEqInterfaceType"


    // $ANTLR start "rule__HardwareArchitectureLevelType__Alternatives"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:352:1: rule__HardwareArchitectureLevelType__Alternatives : ( ( ( 'Compartment' ) ) | ( ( 'RDC' ) ) | ( ( 'Connector' ) ) );
    public final void rule__HardwareArchitectureLevelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:356:1: ( ( ( 'Compartment' ) ) | ( ( 'RDC' ) ) | ( ( 'Connector' ) ) )
            int alt1=3;
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
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:357:1: ( ( 'Compartment' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:357:1: ( ( 'Compartment' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:358:1: ( 'Compartment' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOMPARTMENTEnumLiteralDeclaration_0()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:359:1: ( 'Compartment' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:359:3: 'Compartment'
                    {
                    match(input,11,FOLLOW_11_in_rule__HardwareArchitectureLevelType__Alternatives685); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHardwareArchitectureLevelTypeAccess().getCOMPARTMENTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:364:6: ( ( 'RDC' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:364:6: ( ( 'RDC' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:365:1: ( 'RDC' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHardwareArchitectureLevelTypeAccess().getRDCEnumLiteralDeclaration_1()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:366:1: ( 'RDC' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:366:3: 'RDC'
                    {
                    match(input,12,FOLLOW_12_in_rule__HardwareArchitectureLevelType__Alternatives706); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHardwareArchitectureLevelTypeAccess().getRDCEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:371:6: ( ( 'Connector' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:371:6: ( ( 'Connector' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:372:1: ( 'Connector' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHardwareArchitectureLevelTypeAccess().getCONNECTOREnumLiteralDeclaration_2()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:373:1: ( 'Connector' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:373:3: 'Connector'
                    {
                    match(input,13,FOLLOW_13_in_rule__HardwareArchitectureLevelType__Alternatives727); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHardwareArchitectureLevelTypeAccess().getCONNECTOREnumLiteralDeclaration_2()); 
                    }

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
    // $ANTLR end "rule__HardwareArchitectureLevelType__Alternatives"


    // $ANTLR start "rule__EqInterfaceType__Alternatives"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:383:1: rule__EqInterfaceType__Alternatives : ( ( ( 'Can' ) ) | ( ( 'Enhanced Local Bus' ) ) | ( ( 'Ethernet' ) ) | ( ( 'Analog' ) ) | ( ( 'Digital' ) ) | ( ( 'Serial' ) ) | ( ( 'CustomType0' ) ) | ( ( 'CustomType1' ) ) | ( ( 'CustomType2' ) ) | ( ( 'CustomType3' ) ) | ( ( 'CustomType4' ) ) | ( ( 'CustomType5' ) ) | ( ( 'CustomType6' ) ) | ( ( 'CustomType7' ) ) | ( ( 'CustomType8' ) ) | ( ( 'CustomType9' ) ) | ( ( 'CustomType10' ) ) | ( ( 'CustomType11' ) ) | ( ( 'CustomType12' ) ) | ( ( 'CustomType13' ) ) | ( ( 'CustomType14' ) ) | ( ( 'CustomType15' ) ) | ( ( 'CustomType16' ) ) | ( ( 'CustomType17' ) ) | ( ( 'CustomType18' ) ) | ( ( 'CustomType19' ) ) | ( ( 'CustomType20' ) ) | ( ( 'CustomType21' ) ) | ( ( 'CustomType22' ) ) | ( ( 'CustomType23' ) ) | ( ( 'CustomType24' ) ) | ( ( 'CustomType25' ) ) | ( ( 'CustomType26' ) ) | ( ( 'CustomType27' ) ) | ( ( 'CustomType28' ) ) | ( ( 'CustomType29' ) ) | ( ( 'CustomType30' ) ) | ( ( 'CustomType31' ) ) | ( ( 'CustomType32' ) ) | ( ( 'CustomType33' ) ) | ( ( 'CustomType34' ) ) | ( ( 'CustomType35' ) ) | ( ( 'CustomType36' ) ) | ( ( 'CustomType37' ) ) | ( ( 'CustomType38' ) ) | ( ( 'CustomType39' ) ) );
    public final void rule__EqInterfaceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:387:1: ( ( ( 'Can' ) ) | ( ( 'Enhanced Local Bus' ) ) | ( ( 'Ethernet' ) ) | ( ( 'Analog' ) ) | ( ( 'Digital' ) ) | ( ( 'Serial' ) ) | ( ( 'CustomType0' ) ) | ( ( 'CustomType1' ) ) | ( ( 'CustomType2' ) ) | ( ( 'CustomType3' ) ) | ( ( 'CustomType4' ) ) | ( ( 'CustomType5' ) ) | ( ( 'CustomType6' ) ) | ( ( 'CustomType7' ) ) | ( ( 'CustomType8' ) ) | ( ( 'CustomType9' ) ) | ( ( 'CustomType10' ) ) | ( ( 'CustomType11' ) ) | ( ( 'CustomType12' ) ) | ( ( 'CustomType13' ) ) | ( ( 'CustomType14' ) ) | ( ( 'CustomType15' ) ) | ( ( 'CustomType16' ) ) | ( ( 'CustomType17' ) ) | ( ( 'CustomType18' ) ) | ( ( 'CustomType19' ) ) | ( ( 'CustomType20' ) ) | ( ( 'CustomType21' ) ) | ( ( 'CustomType22' ) ) | ( ( 'CustomType23' ) ) | ( ( 'CustomType24' ) ) | ( ( 'CustomType25' ) ) | ( ( 'CustomType26' ) ) | ( ( 'CustomType27' ) ) | ( ( 'CustomType28' ) ) | ( ( 'CustomType29' ) ) | ( ( 'CustomType30' ) ) | ( ( 'CustomType31' ) ) | ( ( 'CustomType32' ) ) | ( ( 'CustomType33' ) ) | ( ( 'CustomType34' ) ) | ( ( 'CustomType35' ) ) | ( ( 'CustomType36' ) ) | ( ( 'CustomType37' ) ) | ( ( 'CustomType38' ) ) | ( ( 'CustomType39' ) ) )
            int alt2=46;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            case 19:
                {
                alt2=6;
                }
                break;
            case 20:
                {
                alt2=7;
                }
                break;
            case 21:
                {
                alt2=8;
                }
                break;
            case 22:
                {
                alt2=9;
                }
                break;
            case 23:
                {
                alt2=10;
                }
                break;
            case 24:
                {
                alt2=11;
                }
                break;
            case 25:
                {
                alt2=12;
                }
                break;
            case 26:
                {
                alt2=13;
                }
                break;
            case 27:
                {
                alt2=14;
                }
                break;
            case 28:
                {
                alt2=15;
                }
                break;
            case 29:
                {
                alt2=16;
                }
                break;
            case 30:
                {
                alt2=17;
                }
                break;
            case 31:
                {
                alt2=18;
                }
                break;
            case 32:
                {
                alt2=19;
                }
                break;
            case 33:
                {
                alt2=20;
                }
                break;
            case 34:
                {
                alt2=21;
                }
                break;
            case 35:
                {
                alt2=22;
                }
                break;
            case 36:
                {
                alt2=23;
                }
                break;
            case 37:
                {
                alt2=24;
                }
                break;
            case 38:
                {
                alt2=25;
                }
                break;
            case 39:
                {
                alt2=26;
                }
                break;
            case 40:
                {
                alt2=27;
                }
                break;
            case 41:
                {
                alt2=28;
                }
                break;
            case 42:
                {
                alt2=29;
                }
                break;
            case 43:
                {
                alt2=30;
                }
                break;
            case 44:
                {
                alt2=31;
                }
                break;
            case 45:
                {
                alt2=32;
                }
                break;
            case 46:
                {
                alt2=33;
                }
                break;
            case 47:
                {
                alt2=34;
                }
                break;
            case 48:
                {
                alt2=35;
                }
                break;
            case 49:
                {
                alt2=36;
                }
                break;
            case 50:
                {
                alt2=37;
                }
                break;
            case 51:
                {
                alt2=38;
                }
                break;
            case 52:
                {
                alt2=39;
                }
                break;
            case 53:
                {
                alt2=40;
                }
                break;
            case 54:
                {
                alt2=41;
                }
                break;
            case 55:
                {
                alt2=42;
                }
                break;
            case 56:
                {
                alt2=43;
                }
                break;
            case 57:
                {
                alt2=44;
                }
                break;
            case 58:
                {
                alt2=45;
                }
                break;
            case 59:
                {
                alt2=46;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:388:1: ( ( 'Can' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:388:1: ( ( 'Can' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:389:1: ( 'Can' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCANEnumLiteralDeclaration_0()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:390:1: ( 'Can' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:390:3: 'Can'
                    {
                    match(input,14,FOLLOW_14_in_rule__EqInterfaceType__Alternatives763); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCANEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:395:6: ( ( 'Enhanced Local Bus' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:395:6: ( ( 'Enhanced Local Bus' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:396:1: ( 'Enhanced Local Bus' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getELBEnumLiteralDeclaration_1()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:397:1: ( 'Enhanced Local Bus' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:397:3: 'Enhanced Local Bus'
                    {
                    match(input,15,FOLLOW_15_in_rule__EqInterfaceType__Alternatives784); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getELBEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:402:6: ( ( 'Ethernet' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:402:6: ( ( 'Ethernet' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:403:1: ( 'Ethernet' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getETHEnumLiteralDeclaration_2()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:404:1: ( 'Ethernet' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:404:3: 'Ethernet'
                    {
                    match(input,16,FOLLOW_16_in_rule__EqInterfaceType__Alternatives805); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getETHEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:409:6: ( ( 'Analog' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:409:6: ( ( 'Analog' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:410:1: ( 'Analog' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getANALOGEnumLiteralDeclaration_3()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:411:1: ( 'Analog' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:411:3: 'Analog'
                    {
                    match(input,17,FOLLOW_17_in_rule__EqInterfaceType__Alternatives826); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getANALOGEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:416:6: ( ( 'Digital' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:416:6: ( ( 'Digital' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:417:1: ( 'Digital' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getDIGITALEnumLiteralDeclaration_4()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:418:1: ( 'Digital' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:418:3: 'Digital'
                    {
                    match(input,18,FOLLOW_18_in_rule__EqInterfaceType__Alternatives847); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getDIGITALEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:423:6: ( ( 'Serial' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:423:6: ( ( 'Serial' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:424:1: ( 'Serial' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getSERIALEnumLiteralDeclaration_5()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:425:1: ( 'Serial' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:425:3: 'Serial'
                    {
                    match(input,19,FOLLOW_19_in_rule__EqInterfaceType__Alternatives868); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getSERIALEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:430:6: ( ( 'CustomType0' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:430:6: ( ( 'CustomType0' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:431:1: ( 'CustomType0' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM0EnumLiteralDeclaration_6()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:432:1: ( 'CustomType0' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:432:3: 'CustomType0'
                    {
                    match(input,20,FOLLOW_20_in_rule__EqInterfaceType__Alternatives889); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM0EnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:437:6: ( ( 'CustomType1' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:437:6: ( ( 'CustomType1' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:438:1: ( 'CustomType1' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM1EnumLiteralDeclaration_7()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:439:1: ( 'CustomType1' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:439:3: 'CustomType1'
                    {
                    match(input,21,FOLLOW_21_in_rule__EqInterfaceType__Alternatives910); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM1EnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:444:6: ( ( 'CustomType2' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:444:6: ( ( 'CustomType2' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:445:1: ( 'CustomType2' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM2EnumLiteralDeclaration_8()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:446:1: ( 'CustomType2' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:446:3: 'CustomType2'
                    {
                    match(input,22,FOLLOW_22_in_rule__EqInterfaceType__Alternatives931); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM2EnumLiteralDeclaration_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:451:6: ( ( 'CustomType3' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:451:6: ( ( 'CustomType3' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:452:1: ( 'CustomType3' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM3EnumLiteralDeclaration_9()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:453:1: ( 'CustomType3' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:453:3: 'CustomType3'
                    {
                    match(input,23,FOLLOW_23_in_rule__EqInterfaceType__Alternatives952); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM3EnumLiteralDeclaration_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:458:6: ( ( 'CustomType4' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:458:6: ( ( 'CustomType4' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:459:1: ( 'CustomType4' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM4EnumLiteralDeclaration_10()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:460:1: ( 'CustomType4' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:460:3: 'CustomType4'
                    {
                    match(input,24,FOLLOW_24_in_rule__EqInterfaceType__Alternatives973); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM4EnumLiteralDeclaration_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:465:6: ( ( 'CustomType5' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:465:6: ( ( 'CustomType5' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:466:1: ( 'CustomType5' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM5EnumLiteralDeclaration_11()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:467:1: ( 'CustomType5' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:467:3: 'CustomType5'
                    {
                    match(input,25,FOLLOW_25_in_rule__EqInterfaceType__Alternatives994); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM5EnumLiteralDeclaration_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:472:6: ( ( 'CustomType6' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:472:6: ( ( 'CustomType6' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:473:1: ( 'CustomType6' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM6EnumLiteralDeclaration_12()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:474:1: ( 'CustomType6' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:474:3: 'CustomType6'
                    {
                    match(input,26,FOLLOW_26_in_rule__EqInterfaceType__Alternatives1015); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM6EnumLiteralDeclaration_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:479:6: ( ( 'CustomType7' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:479:6: ( ( 'CustomType7' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:480:1: ( 'CustomType7' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM7EnumLiteralDeclaration_13()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:481:1: ( 'CustomType7' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:481:3: 'CustomType7'
                    {
                    match(input,27,FOLLOW_27_in_rule__EqInterfaceType__Alternatives1036); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM7EnumLiteralDeclaration_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:486:6: ( ( 'CustomType8' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:486:6: ( ( 'CustomType8' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:487:1: ( 'CustomType8' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM8EnumLiteralDeclaration_14()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:488:1: ( 'CustomType8' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:488:3: 'CustomType8'
                    {
                    match(input,28,FOLLOW_28_in_rule__EqInterfaceType__Alternatives1057); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM8EnumLiteralDeclaration_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:493:6: ( ( 'CustomType9' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:493:6: ( ( 'CustomType9' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:494:1: ( 'CustomType9' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM9EnumLiteralDeclaration_15()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:495:1: ( 'CustomType9' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:495:3: 'CustomType9'
                    {
                    match(input,29,FOLLOW_29_in_rule__EqInterfaceType__Alternatives1078); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM9EnumLiteralDeclaration_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:500:6: ( ( 'CustomType10' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:500:6: ( ( 'CustomType10' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:501:1: ( 'CustomType10' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM10EnumLiteralDeclaration_16()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:502:1: ( 'CustomType10' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:502:3: 'CustomType10'
                    {
                    match(input,30,FOLLOW_30_in_rule__EqInterfaceType__Alternatives1099); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM10EnumLiteralDeclaration_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:507:6: ( ( 'CustomType11' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:507:6: ( ( 'CustomType11' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:508:1: ( 'CustomType11' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM11EnumLiteralDeclaration_17()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:509:1: ( 'CustomType11' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:509:3: 'CustomType11'
                    {
                    match(input,31,FOLLOW_31_in_rule__EqInterfaceType__Alternatives1120); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM11EnumLiteralDeclaration_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:514:6: ( ( 'CustomType12' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:514:6: ( ( 'CustomType12' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:515:1: ( 'CustomType12' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM12EnumLiteralDeclaration_18()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:516:1: ( 'CustomType12' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:516:3: 'CustomType12'
                    {
                    match(input,32,FOLLOW_32_in_rule__EqInterfaceType__Alternatives1141); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM12EnumLiteralDeclaration_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:521:6: ( ( 'CustomType13' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:521:6: ( ( 'CustomType13' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:522:1: ( 'CustomType13' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM13EnumLiteralDeclaration_19()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:523:1: ( 'CustomType13' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:523:3: 'CustomType13'
                    {
                    match(input,33,FOLLOW_33_in_rule__EqInterfaceType__Alternatives1162); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM13EnumLiteralDeclaration_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:528:6: ( ( 'CustomType14' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:528:6: ( ( 'CustomType14' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:529:1: ( 'CustomType14' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM14EnumLiteralDeclaration_20()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:530:1: ( 'CustomType14' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:530:3: 'CustomType14'
                    {
                    match(input,34,FOLLOW_34_in_rule__EqInterfaceType__Alternatives1183); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM14EnumLiteralDeclaration_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:535:6: ( ( 'CustomType15' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:535:6: ( ( 'CustomType15' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:536:1: ( 'CustomType15' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM15EnumLiteralDeclaration_21()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:537:1: ( 'CustomType15' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:537:3: 'CustomType15'
                    {
                    match(input,35,FOLLOW_35_in_rule__EqInterfaceType__Alternatives1204); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM15EnumLiteralDeclaration_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:542:6: ( ( 'CustomType16' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:542:6: ( ( 'CustomType16' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:543:1: ( 'CustomType16' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM16EnumLiteralDeclaration_22()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:544:1: ( 'CustomType16' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:544:3: 'CustomType16'
                    {
                    match(input,36,FOLLOW_36_in_rule__EqInterfaceType__Alternatives1225); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM16EnumLiteralDeclaration_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:549:6: ( ( 'CustomType17' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:549:6: ( ( 'CustomType17' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:550:1: ( 'CustomType17' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM17EnumLiteralDeclaration_23()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:551:1: ( 'CustomType17' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:551:3: 'CustomType17'
                    {
                    match(input,37,FOLLOW_37_in_rule__EqInterfaceType__Alternatives1246); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM17EnumLiteralDeclaration_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:556:6: ( ( 'CustomType18' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:556:6: ( ( 'CustomType18' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:557:1: ( 'CustomType18' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM18EnumLiteralDeclaration_24()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:558:1: ( 'CustomType18' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:558:3: 'CustomType18'
                    {
                    match(input,38,FOLLOW_38_in_rule__EqInterfaceType__Alternatives1267); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM18EnumLiteralDeclaration_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:563:6: ( ( 'CustomType19' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:563:6: ( ( 'CustomType19' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:564:1: ( 'CustomType19' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM19EnumLiteralDeclaration_25()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:565:1: ( 'CustomType19' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:565:3: 'CustomType19'
                    {
                    match(input,39,FOLLOW_39_in_rule__EqInterfaceType__Alternatives1288); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM19EnumLiteralDeclaration_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:570:6: ( ( 'CustomType20' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:570:6: ( ( 'CustomType20' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:571:1: ( 'CustomType20' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM20EnumLiteralDeclaration_26()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:572:1: ( 'CustomType20' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:572:3: 'CustomType20'
                    {
                    match(input,40,FOLLOW_40_in_rule__EqInterfaceType__Alternatives1309); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM20EnumLiteralDeclaration_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:577:6: ( ( 'CustomType21' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:577:6: ( ( 'CustomType21' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:578:1: ( 'CustomType21' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM21EnumLiteralDeclaration_27()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:579:1: ( 'CustomType21' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:579:3: 'CustomType21'
                    {
                    match(input,41,FOLLOW_41_in_rule__EqInterfaceType__Alternatives1330); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM21EnumLiteralDeclaration_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:584:6: ( ( 'CustomType22' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:584:6: ( ( 'CustomType22' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:585:1: ( 'CustomType22' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM22EnumLiteralDeclaration_28()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:586:1: ( 'CustomType22' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:586:3: 'CustomType22'
                    {
                    match(input,42,FOLLOW_42_in_rule__EqInterfaceType__Alternatives1351); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM22EnumLiteralDeclaration_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:591:6: ( ( 'CustomType23' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:591:6: ( ( 'CustomType23' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:592:1: ( 'CustomType23' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM23EnumLiteralDeclaration_29()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:593:1: ( 'CustomType23' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:593:3: 'CustomType23'
                    {
                    match(input,43,FOLLOW_43_in_rule__EqInterfaceType__Alternatives1372); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM23EnumLiteralDeclaration_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:598:6: ( ( 'CustomType24' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:598:6: ( ( 'CustomType24' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:599:1: ( 'CustomType24' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM24EnumLiteralDeclaration_30()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:600:1: ( 'CustomType24' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:600:3: 'CustomType24'
                    {
                    match(input,44,FOLLOW_44_in_rule__EqInterfaceType__Alternatives1393); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM24EnumLiteralDeclaration_30()); 
                    }

                    }


                    }
                    break;
                case 32 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:605:6: ( ( 'CustomType25' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:605:6: ( ( 'CustomType25' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:606:1: ( 'CustomType25' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM25EnumLiteralDeclaration_31()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:607:1: ( 'CustomType25' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:607:3: 'CustomType25'
                    {
                    match(input,45,FOLLOW_45_in_rule__EqInterfaceType__Alternatives1414); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM25EnumLiteralDeclaration_31()); 
                    }

                    }


                    }
                    break;
                case 33 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:612:6: ( ( 'CustomType26' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:612:6: ( ( 'CustomType26' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:613:1: ( 'CustomType26' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM26EnumLiteralDeclaration_32()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:614:1: ( 'CustomType26' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:614:3: 'CustomType26'
                    {
                    match(input,46,FOLLOW_46_in_rule__EqInterfaceType__Alternatives1435); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM26EnumLiteralDeclaration_32()); 
                    }

                    }


                    }
                    break;
                case 34 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:619:6: ( ( 'CustomType27' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:619:6: ( ( 'CustomType27' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:620:1: ( 'CustomType27' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM27EnumLiteralDeclaration_33()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:621:1: ( 'CustomType27' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:621:3: 'CustomType27'
                    {
                    match(input,47,FOLLOW_47_in_rule__EqInterfaceType__Alternatives1456); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM27EnumLiteralDeclaration_33()); 
                    }

                    }


                    }
                    break;
                case 35 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:626:6: ( ( 'CustomType28' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:626:6: ( ( 'CustomType28' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:627:1: ( 'CustomType28' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM28EnumLiteralDeclaration_34()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:628:1: ( 'CustomType28' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:628:3: 'CustomType28'
                    {
                    match(input,48,FOLLOW_48_in_rule__EqInterfaceType__Alternatives1477); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM28EnumLiteralDeclaration_34()); 
                    }

                    }


                    }
                    break;
                case 36 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:633:6: ( ( 'CustomType29' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:633:6: ( ( 'CustomType29' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:634:1: ( 'CustomType29' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM29EnumLiteralDeclaration_35()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:635:1: ( 'CustomType29' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:635:3: 'CustomType29'
                    {
                    match(input,49,FOLLOW_49_in_rule__EqInterfaceType__Alternatives1498); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM29EnumLiteralDeclaration_35()); 
                    }

                    }


                    }
                    break;
                case 37 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:640:6: ( ( 'CustomType30' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:640:6: ( ( 'CustomType30' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:641:1: ( 'CustomType30' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM30EnumLiteralDeclaration_36()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:642:1: ( 'CustomType30' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:642:3: 'CustomType30'
                    {
                    match(input,50,FOLLOW_50_in_rule__EqInterfaceType__Alternatives1519); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM30EnumLiteralDeclaration_36()); 
                    }

                    }


                    }
                    break;
                case 38 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:647:6: ( ( 'CustomType31' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:647:6: ( ( 'CustomType31' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:648:1: ( 'CustomType31' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM31EnumLiteralDeclaration_37()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:649:1: ( 'CustomType31' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:649:3: 'CustomType31'
                    {
                    match(input,51,FOLLOW_51_in_rule__EqInterfaceType__Alternatives1540); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM31EnumLiteralDeclaration_37()); 
                    }

                    }


                    }
                    break;
                case 39 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:654:6: ( ( 'CustomType32' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:654:6: ( ( 'CustomType32' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:655:1: ( 'CustomType32' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM32EnumLiteralDeclaration_38()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:656:1: ( 'CustomType32' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:656:3: 'CustomType32'
                    {
                    match(input,52,FOLLOW_52_in_rule__EqInterfaceType__Alternatives1561); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM32EnumLiteralDeclaration_38()); 
                    }

                    }


                    }
                    break;
                case 40 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:661:6: ( ( 'CustomType33' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:661:6: ( ( 'CustomType33' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:662:1: ( 'CustomType33' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM33EnumLiteralDeclaration_39()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:663:1: ( 'CustomType33' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:663:3: 'CustomType33'
                    {
                    match(input,53,FOLLOW_53_in_rule__EqInterfaceType__Alternatives1582); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM33EnumLiteralDeclaration_39()); 
                    }

                    }


                    }
                    break;
                case 41 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:668:6: ( ( 'CustomType34' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:668:6: ( ( 'CustomType34' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:669:1: ( 'CustomType34' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM34EnumLiteralDeclaration_40()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:670:1: ( 'CustomType34' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:670:3: 'CustomType34'
                    {
                    match(input,54,FOLLOW_54_in_rule__EqInterfaceType__Alternatives1603); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM34EnumLiteralDeclaration_40()); 
                    }

                    }


                    }
                    break;
                case 42 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:675:6: ( ( 'CustomType35' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:675:6: ( ( 'CustomType35' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:676:1: ( 'CustomType35' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM35EnumLiteralDeclaration_41()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:677:1: ( 'CustomType35' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:677:3: 'CustomType35'
                    {
                    match(input,55,FOLLOW_55_in_rule__EqInterfaceType__Alternatives1624); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM35EnumLiteralDeclaration_41()); 
                    }

                    }


                    }
                    break;
                case 43 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:682:6: ( ( 'CustomType36' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:682:6: ( ( 'CustomType36' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:683:1: ( 'CustomType36' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM36EnumLiteralDeclaration_42()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:684:1: ( 'CustomType36' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:684:3: 'CustomType36'
                    {
                    match(input,56,FOLLOW_56_in_rule__EqInterfaceType__Alternatives1645); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM36EnumLiteralDeclaration_42()); 
                    }

                    }


                    }
                    break;
                case 44 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:689:6: ( ( 'CustomType37' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:689:6: ( ( 'CustomType37' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:690:1: ( 'CustomType37' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM37EnumLiteralDeclaration_43()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:691:1: ( 'CustomType37' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:691:3: 'CustomType37'
                    {
                    match(input,57,FOLLOW_57_in_rule__EqInterfaceType__Alternatives1666); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM37EnumLiteralDeclaration_43()); 
                    }

                    }


                    }
                    break;
                case 45 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:696:6: ( ( 'CustomType38' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:696:6: ( ( 'CustomType38' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:697:1: ( 'CustomType38' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM38EnumLiteralDeclaration_44()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:698:1: ( 'CustomType38' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:698:3: 'CustomType38'
                    {
                    match(input,58,FOLLOW_58_in_rule__EqInterfaceType__Alternatives1687); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM38EnumLiteralDeclaration_44()); 
                    }

                    }


                    }
                    break;
                case 46 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:703:6: ( ( 'CustomType39' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:703:6: ( ( 'CustomType39' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:704:1: ( 'CustomType39' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM39EnumLiteralDeclaration_45()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:705:1: ( 'CustomType39' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:705:3: 'CustomType39'
                    {
                    match(input,59,FOLLOW_59_in_rule__EqInterfaceType__Alternatives1708); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqInterfaceTypeAccess().getCUSTOM39EnumLiteralDeclaration_45()); 
                    }

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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:717:1: rule__AssistModel__Group__0 : rule__AssistModel__Group__0__Impl rule__AssistModel__Group__1 ;
    public final void rule__AssistModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:721:1: ( rule__AssistModel__Group__0__Impl rule__AssistModel__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:722:2: rule__AssistModel__Group__0__Impl rule__AssistModel__Group__1
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__0__Impl_in_rule__AssistModel__Group__01741);
            rule__AssistModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group__1_in_rule__AssistModel__Group__01744);
            rule__AssistModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:729:1: rule__AssistModel__Group__0__Impl : ( 'Global' ) ;
    public final void rule__AssistModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:733:1: ( ( 'Global' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:734:1: ( 'Global' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:734:1: ( 'Global' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:735:1: 'Global'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getGlobalKeyword_0()); 
            }
            match(input,60,FOLLOW_60_in_rule__AssistModel__Group__0__Impl1772); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getGlobalKeyword_0()); 
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
    // $ANTLR end "rule__AssistModel__Group__0__Impl"


    // $ANTLR start "rule__AssistModel__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:748:1: rule__AssistModel__Group__1 : rule__AssistModel__Group__1__Impl rule__AssistModel__Group__2 ;
    public final void rule__AssistModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:752:1: ( rule__AssistModel__Group__1__Impl rule__AssistModel__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:753:2: rule__AssistModel__Group__1__Impl rule__AssistModel__Group__2
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__1__Impl_in_rule__AssistModel__Group__11803);
            rule__AssistModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group__2_in_rule__AssistModel__Group__11806);
            rule__AssistModel__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:760:1: rule__AssistModel__Group__1__Impl : ( '{' ) ;
    public final void rule__AssistModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:764:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:765:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:765:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:766:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,61,FOLLOW_61_in_rule__AssistModel__Group__1__Impl1834); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__AssistModel__Group__1__Impl"


    // $ANTLR start "rule__AssistModel__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:779:1: rule__AssistModel__Group__2 : rule__AssistModel__Group__2__Impl rule__AssistModel__Group__3 ;
    public final void rule__AssistModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:783:1: ( rule__AssistModel__Group__2__Impl rule__AssistModel__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:784:2: rule__AssistModel__Group__2__Impl rule__AssistModel__Group__3
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__2__Impl_in_rule__AssistModel__Group__21865);
            rule__AssistModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group__3_in_rule__AssistModel__Group__21868);
            rule__AssistModel__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:791:1: rule__AssistModel__Group__2__Impl : ( 'System name' ) ;
    public final void rule__AssistModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:795:1: ( ( 'System name' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:796:1: ( 'System name' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:796:1: ( 'System name' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:797:1: 'System name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getSystemNameKeyword_2()); 
            }
            match(input,62,FOLLOW_62_in_rule__AssistModel__Group__2__Impl1896); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getSystemNameKeyword_2()); 
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
    // $ANTLR end "rule__AssistModel__Group__2__Impl"


    // $ANTLR start "rule__AssistModel__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:810:1: rule__AssistModel__Group__3 : rule__AssistModel__Group__3__Impl rule__AssistModel__Group__4 ;
    public final void rule__AssistModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:814:1: ( rule__AssistModel__Group__3__Impl rule__AssistModel__Group__4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:815:2: rule__AssistModel__Group__3__Impl rule__AssistModel__Group__4
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__3__Impl_in_rule__AssistModel__Group__31927);
            rule__AssistModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group__4_in_rule__AssistModel__Group__31930);
            rule__AssistModel__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:822:1: rule__AssistModel__Group__3__Impl : ( '=' ) ;
    public final void rule__AssistModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:826:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:827:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:827:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:828:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getEqualsSignKeyword_3()); 
            }
            match(input,63,FOLLOW_63_in_rule__AssistModel__Group__3__Impl1958); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__AssistModel__Group__3__Impl"


    // $ANTLR start "rule__AssistModel__Group__4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:841:1: rule__AssistModel__Group__4 : rule__AssistModel__Group__4__Impl rule__AssistModel__Group__5 ;
    public final void rule__AssistModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:845:1: ( rule__AssistModel__Group__4__Impl rule__AssistModel__Group__5 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:846:2: rule__AssistModel__Group__4__Impl rule__AssistModel__Group__5
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__4__Impl_in_rule__AssistModel__Group__41989);
            rule__AssistModel__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group__5_in_rule__AssistModel__Group__41992);
            rule__AssistModel__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:853:1: rule__AssistModel__Group__4__Impl : ( ( rule__AssistModel__SystemNameAssignment_4 ) ) ;
    public final void rule__AssistModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:857:1: ( ( ( rule__AssistModel__SystemNameAssignment_4 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:858:1: ( ( rule__AssistModel__SystemNameAssignment_4 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:858:1: ( ( rule__AssistModel__SystemNameAssignment_4 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:859:1: ( rule__AssistModel__SystemNameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getSystemNameAssignment_4()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:860:1: ( rule__AssistModel__SystemNameAssignment_4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:860:2: rule__AssistModel__SystemNameAssignment_4
            {
            pushFollow(FOLLOW_rule__AssistModel__SystemNameAssignment_4_in_rule__AssistModel__Group__4__Impl2019);
            rule__AssistModel__SystemNameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getSystemNameAssignment_4()); 
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
    // $ANTLR end "rule__AssistModel__Group__4__Impl"


    // $ANTLR start "rule__AssistModel__Group__5"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:870:1: rule__AssistModel__Group__5 : rule__AssistModel__Group__5__Impl rule__AssistModel__Group__6 ;
    public final void rule__AssistModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:874:1: ( rule__AssistModel__Group__5__Impl rule__AssistModel__Group__6 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:875:2: rule__AssistModel__Group__5__Impl rule__AssistModel__Group__6
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__5__Impl_in_rule__AssistModel__Group__52049);
            rule__AssistModel__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group__6_in_rule__AssistModel__Group__52052);
            rule__AssistModel__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:882:1: rule__AssistModel__Group__5__Impl : ( ';' ) ;
    public final void rule__AssistModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:886:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:887:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:887:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:888:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getSemicolonKeyword_5()); 
            }
            match(input,64,FOLLOW_64_in_rule__AssistModel__Group__5__Impl2080); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__AssistModel__Group__5__Impl"


    // $ANTLR start "rule__AssistModel__Group__6"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:901:1: rule__AssistModel__Group__6 : rule__AssistModel__Group__6__Impl rule__AssistModel__Group__7 ;
    public final void rule__AssistModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:905:1: ( rule__AssistModel__Group__6__Impl rule__AssistModel__Group__7 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:906:2: rule__AssistModel__Group__6__Impl rule__AssistModel__Group__7
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__6__Impl_in_rule__AssistModel__Group__62111);
            rule__AssistModel__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group__7_in_rule__AssistModel__Group__62114);
            rule__AssistModel__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:913:1: rule__AssistModel__Group__6__Impl : ( '}' ) ;
    public final void rule__AssistModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:917:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:918:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:918:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:919:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,65,FOLLOW_65_in_rule__AssistModel__Group__6__Impl2142); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__AssistModel__Group__6__Impl"


    // $ANTLR start "rule__AssistModel__Group__7"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:932:1: rule__AssistModel__Group__7 : rule__AssistModel__Group__7__Impl rule__AssistModel__Group__8 ;
    public final void rule__AssistModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:936:1: ( rule__AssistModel__Group__7__Impl rule__AssistModel__Group__8 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:937:2: rule__AssistModel__Group__7__Impl rule__AssistModel__Group__8
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__7__Impl_in_rule__AssistModel__Group__72173);
            rule__AssistModel__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group__8_in_rule__AssistModel__Group__72176);
            rule__AssistModel__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:944:1: rule__AssistModel__Group__7__Impl : ( ( rule__AssistModel__CompartmentsAssignment_7 )? ) ;
    public final void rule__AssistModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:948:1: ( ( ( rule__AssistModel__CompartmentsAssignment_7 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:949:1: ( ( rule__AssistModel__CompartmentsAssignment_7 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:949:1: ( ( rule__AssistModel__CompartmentsAssignment_7 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:950:1: ( rule__AssistModel__CompartmentsAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getCompartmentsAssignment_7()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:951:1: ( rule__AssistModel__CompartmentsAssignment_7 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:951:2: rule__AssistModel__CompartmentsAssignment_7
                    {
                    pushFollow(FOLLOW_rule__AssistModel__CompartmentsAssignment_7_in_rule__AssistModel__Group__7__Impl2203);
                    rule__AssistModel__CompartmentsAssignment_7();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getCompartmentsAssignment_7()); 
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
    // $ANTLR end "rule__AssistModel__Group__7__Impl"


    // $ANTLR start "rule__AssistModel__Group__8"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:961:1: rule__AssistModel__Group__8 : rule__AssistModel__Group__8__Impl rule__AssistModel__Group__9 ;
    public final void rule__AssistModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:965:1: ( rule__AssistModel__Group__8__Impl rule__AssistModel__Group__9 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:966:2: rule__AssistModel__Group__8__Impl rule__AssistModel__Group__9
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__8__Impl_in_rule__AssistModel__Group__82234);
            rule__AssistModel__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group__9_in_rule__AssistModel__Group__82237);
            rule__AssistModel__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:973:1: rule__AssistModel__Group__8__Impl : ( ( rule__AssistModel__Group_8__0 )? ) ;
    public final void rule__AssistModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:977:1: ( ( ( rule__AssistModel__Group_8__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:978:1: ( ( rule__AssistModel__Group_8__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:978:1: ( ( rule__AssistModel__Group_8__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:979:1: ( rule__AssistModel__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getGroup_8()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:980:1: ( rule__AssistModel__Group_8__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==66) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:980:2: rule__AssistModel__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__AssistModel__Group_8__0_in_rule__AssistModel__Group__8__Impl2264);
                    rule__AssistModel__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getGroup_8()); 
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
    // $ANTLR end "rule__AssistModel__Group__8__Impl"


    // $ANTLR start "rule__AssistModel__Group__9"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:990:1: rule__AssistModel__Group__9 : rule__AssistModel__Group__9__Impl rule__AssistModel__Group__10 ;
    public final void rule__AssistModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:994:1: ( rule__AssistModel__Group__9__Impl rule__AssistModel__Group__10 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:995:2: rule__AssistModel__Group__9__Impl rule__AssistModel__Group__10
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__9__Impl_in_rule__AssistModel__Group__92295);
            rule__AssistModel__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group__10_in_rule__AssistModel__Group__92298);
            rule__AssistModel__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1002:1: rule__AssistModel__Group__9__Impl : ( ( rule__AssistModel__Group_9__0 )? ) ;
    public final void rule__AssistModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1006:1: ( ( ( rule__AssistModel__Group_9__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1007:1: ( ( rule__AssistModel__Group_9__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1007:1: ( ( rule__AssistModel__Group_9__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1008:1: ( rule__AssistModel__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getGroup_9()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1009:1: ( rule__AssistModel__Group_9__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==67) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1009:2: rule__AssistModel__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__AssistModel__Group_9__0_in_rule__AssistModel__Group__9__Impl2325);
                    rule__AssistModel__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getGroup_9()); 
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
    // $ANTLR end "rule__AssistModel__Group__9__Impl"


    // $ANTLR start "rule__AssistModel__Group__10"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1019:1: rule__AssistModel__Group__10 : rule__AssistModel__Group__10__Impl ;
    public final void rule__AssistModel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1023:1: ( rule__AssistModel__Group__10__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1024:2: rule__AssistModel__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__10__Impl_in_rule__AssistModel__Group__102356);
            rule__AssistModel__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__10"


    // $ANTLR start "rule__AssistModel__Group__10__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1030:1: rule__AssistModel__Group__10__Impl : ( ( rule__AssistModel__Group_10__0 )? ) ;
    public final void rule__AssistModel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1034:1: ( ( ( rule__AssistModel__Group_10__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1035:1: ( ( rule__AssistModel__Group_10__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1035:1: ( ( rule__AssistModel__Group_10__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1036:1: ( rule__AssistModel__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getGroup_10()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1037:1: ( rule__AssistModel__Group_10__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==68) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1037:2: rule__AssistModel__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__AssistModel__Group_10__0_in_rule__AssistModel__Group__10__Impl2383);
                    rule__AssistModel__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getGroup_10()); 
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
    // $ANTLR end "rule__AssistModel__Group__10__Impl"


    // $ANTLR start "rule__AssistModel__Group_8__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1069:1: rule__AssistModel__Group_8__0 : rule__AssistModel__Group_8__0__Impl rule__AssistModel__Group_8__1 ;
    public final void rule__AssistModel__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1073:1: ( rule__AssistModel__Group_8__0__Impl rule__AssistModel__Group_8__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1074:2: rule__AssistModel__Group_8__0__Impl rule__AssistModel__Group_8__1
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_8__0__Impl_in_rule__AssistModel__Group_8__02436);
            rule__AssistModel__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group_8__1_in_rule__AssistModel__Group_8__02439);
            rule__AssistModel__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1081:1: rule__AssistModel__Group_8__0__Impl : ( 'Interfaces' ) ;
    public final void rule__AssistModel__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1085:1: ( ( 'Interfaces' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1086:1: ( 'Interfaces' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1086:1: ( 'Interfaces' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1087:1: 'Interfaces'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getInterfacesKeyword_8_0()); 
            }
            match(input,66,FOLLOW_66_in_rule__AssistModel__Group_8__0__Impl2467); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getInterfacesKeyword_8_0()); 
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
    // $ANTLR end "rule__AssistModel__Group_8__0__Impl"


    // $ANTLR start "rule__AssistModel__Group_8__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1100:1: rule__AssistModel__Group_8__1 : rule__AssistModel__Group_8__1__Impl rule__AssistModel__Group_8__2 ;
    public final void rule__AssistModel__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1104:1: ( rule__AssistModel__Group_8__1__Impl rule__AssistModel__Group_8__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1105:2: rule__AssistModel__Group_8__1__Impl rule__AssistModel__Group_8__2
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_8__1__Impl_in_rule__AssistModel__Group_8__12498);
            rule__AssistModel__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group_8__2_in_rule__AssistModel__Group_8__12501);
            rule__AssistModel__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1112:1: rule__AssistModel__Group_8__1__Impl : ( '{' ) ;
    public final void rule__AssistModel__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1116:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1117:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1117:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1118:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_8_1()); 
            }
            match(input,61,FOLLOW_61_in_rule__AssistModel__Group_8__1__Impl2529); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_8_1()); 
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
    // $ANTLR end "rule__AssistModel__Group_8__1__Impl"


    // $ANTLR start "rule__AssistModel__Group_8__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1131:1: rule__AssistModel__Group_8__2 : rule__AssistModel__Group_8__2__Impl rule__AssistModel__Group_8__3 ;
    public final void rule__AssistModel__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1135:1: ( rule__AssistModel__Group_8__2__Impl rule__AssistModel__Group_8__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1136:2: rule__AssistModel__Group_8__2__Impl rule__AssistModel__Group_8__3
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_8__2__Impl_in_rule__AssistModel__Group_8__22560);
            rule__AssistModel__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group_8__3_in_rule__AssistModel__Group_8__22563);
            rule__AssistModel__Group_8__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1143:1: rule__AssistModel__Group_8__2__Impl : ( ( ( rule__AssistModel__EqInterfacesAssignment_8_2 ) ) ( ( rule__AssistModel__EqInterfacesAssignment_8_2 )* ) ) ;
    public final void rule__AssistModel__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1147:1: ( ( ( ( rule__AssistModel__EqInterfacesAssignment_8_2 ) ) ( ( rule__AssistModel__EqInterfacesAssignment_8_2 )* ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1148:1: ( ( ( rule__AssistModel__EqInterfacesAssignment_8_2 ) ) ( ( rule__AssistModel__EqInterfacesAssignment_8_2 )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1148:1: ( ( ( rule__AssistModel__EqInterfacesAssignment_8_2 ) ) ( ( rule__AssistModel__EqInterfacesAssignment_8_2 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1149:1: ( ( rule__AssistModel__EqInterfacesAssignment_8_2 ) ) ( ( rule__AssistModel__EqInterfacesAssignment_8_2 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1149:1: ( ( rule__AssistModel__EqInterfacesAssignment_8_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1150:1: ( rule__AssistModel__EqInterfacesAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getEqInterfacesAssignment_8_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1151:1: ( rule__AssistModel__EqInterfacesAssignment_8_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1151:2: rule__AssistModel__EqInterfacesAssignment_8_2
            {
            pushFollow(FOLLOW_rule__AssistModel__EqInterfacesAssignment_8_2_in_rule__AssistModel__Group_8__2__Impl2592);
            rule__AssistModel__EqInterfacesAssignment_8_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getEqInterfacesAssignment_8_2()); 
            }

            }

            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1154:1: ( ( rule__AssistModel__EqInterfacesAssignment_8_2 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1155:1: ( rule__AssistModel__EqInterfacesAssignment_8_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getEqInterfacesAssignment_8_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1156:1: ( rule__AssistModel__EqInterfacesAssignment_8_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==79) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1156:2: rule__AssistModel__EqInterfacesAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__AssistModel__EqInterfacesAssignment_8_2_in_rule__AssistModel__Group_8__2__Impl2604);
            	    rule__AssistModel__EqInterfacesAssignment_8_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getEqInterfacesAssignment_8_2()); 
            }

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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1167:1: rule__AssistModel__Group_8__3 : rule__AssistModel__Group_8__3__Impl ;
    public final void rule__AssistModel__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1171:1: ( rule__AssistModel__Group_8__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1172:2: rule__AssistModel__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_8__3__Impl_in_rule__AssistModel__Group_8__32637);
            rule__AssistModel__Group_8__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1178:1: rule__AssistModel__Group_8__3__Impl : ( '}' ) ;
    public final void rule__AssistModel__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1182:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1183:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1183:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1184:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_8_3()); 
            }
            match(input,65,FOLLOW_65_in_rule__AssistModel__Group_8__3__Impl2665); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_8_3()); 
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
    // $ANTLR end "rule__AssistModel__Group_8__3__Impl"


    // $ANTLR start "rule__AssistModel__Group_9__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1205:1: rule__AssistModel__Group_9__0 : rule__AssistModel__Group_9__0__Impl rule__AssistModel__Group_9__1 ;
    public final void rule__AssistModel__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1209:1: ( rule__AssistModel__Group_9__0__Impl rule__AssistModel__Group_9__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1210:2: rule__AssistModel__Group_9__0__Impl rule__AssistModel__Group_9__1
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_9__0__Impl_in_rule__AssistModel__Group_9__02704);
            rule__AssistModel__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group_9__1_in_rule__AssistModel__Group_9__02707);
            rule__AssistModel__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1217:1: rule__AssistModel__Group_9__0__Impl : ( 'InterfaceGroups' ) ;
    public final void rule__AssistModel__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1221:1: ( ( 'InterfaceGroups' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1222:1: ( 'InterfaceGroups' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1222:1: ( 'InterfaceGroups' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1223:1: 'InterfaceGroups'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getInterfaceGroupsKeyword_9_0()); 
            }
            match(input,67,FOLLOW_67_in_rule__AssistModel__Group_9__0__Impl2735); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getInterfaceGroupsKeyword_9_0()); 
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
    // $ANTLR end "rule__AssistModel__Group_9__0__Impl"


    // $ANTLR start "rule__AssistModel__Group_9__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1236:1: rule__AssistModel__Group_9__1 : rule__AssistModel__Group_9__1__Impl rule__AssistModel__Group_9__2 ;
    public final void rule__AssistModel__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1240:1: ( rule__AssistModel__Group_9__1__Impl rule__AssistModel__Group_9__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1241:2: rule__AssistModel__Group_9__1__Impl rule__AssistModel__Group_9__2
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_9__1__Impl_in_rule__AssistModel__Group_9__12766);
            rule__AssistModel__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group_9__2_in_rule__AssistModel__Group_9__12769);
            rule__AssistModel__Group_9__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1248:1: rule__AssistModel__Group_9__1__Impl : ( '{' ) ;
    public final void rule__AssistModel__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1252:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1253:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1253:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1254:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_9_1()); 
            }
            match(input,61,FOLLOW_61_in_rule__AssistModel__Group_9__1__Impl2797); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_9_1()); 
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
    // $ANTLR end "rule__AssistModel__Group_9__1__Impl"


    // $ANTLR start "rule__AssistModel__Group_9__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1267:1: rule__AssistModel__Group_9__2 : rule__AssistModel__Group_9__2__Impl rule__AssistModel__Group_9__3 ;
    public final void rule__AssistModel__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1271:1: ( rule__AssistModel__Group_9__2__Impl rule__AssistModel__Group_9__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1272:2: rule__AssistModel__Group_9__2__Impl rule__AssistModel__Group_9__3
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_9__2__Impl_in_rule__AssistModel__Group_9__22828);
            rule__AssistModel__Group_9__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group_9__3_in_rule__AssistModel__Group_9__22831);
            rule__AssistModel__Group_9__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1279:1: rule__AssistModel__Group_9__2__Impl : ( ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 ) ) ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )* ) ) ;
    public final void rule__AssistModel__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1283:1: ( ( ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 ) ) ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )* ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1284:1: ( ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 ) ) ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1284:1: ( ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 ) ) ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1285:1: ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 ) ) ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1285:1: ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1286:1: ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsAssignment_9_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1287:1: ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1287:2: rule__AssistModel__EqInterfaceGroupsAssignment_9_2
            {
            pushFollow(FOLLOW_rule__AssistModel__EqInterfaceGroupsAssignment_9_2_in_rule__AssistModel__Group_9__2__Impl2860);
            rule__AssistModel__EqInterfaceGroupsAssignment_9_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsAssignment_9_2()); 
            }

            }

            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1290:1: ( ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1291:1: ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsAssignment_9_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1292:1: ( rule__AssistModel__EqInterfaceGroupsAssignment_9_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==77) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1292:2: rule__AssistModel__EqInterfaceGroupsAssignment_9_2
            	    {
            	    pushFollow(FOLLOW_rule__AssistModel__EqInterfaceGroupsAssignment_9_2_in_rule__AssistModel__Group_9__2__Impl2872);
            	    rule__AssistModel__EqInterfaceGroupsAssignment_9_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsAssignment_9_2()); 
            }

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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1303:1: rule__AssistModel__Group_9__3 : rule__AssistModel__Group_9__3__Impl ;
    public final void rule__AssistModel__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1307:1: ( rule__AssistModel__Group_9__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1308:2: rule__AssistModel__Group_9__3__Impl
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_9__3__Impl_in_rule__AssistModel__Group_9__32905);
            rule__AssistModel__Group_9__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1314:1: rule__AssistModel__Group_9__3__Impl : ( '}' ) ;
    public final void rule__AssistModel__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1318:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1319:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1319:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1320:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_9_3()); 
            }
            match(input,65,FOLLOW_65_in_rule__AssistModel__Group_9__3__Impl2933); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_9_3()); 
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
    // $ANTLR end "rule__AssistModel__Group_9__3__Impl"


    // $ANTLR start "rule__AssistModel__Group_10__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1341:1: rule__AssistModel__Group_10__0 : rule__AssistModel__Group_10__0__Impl rule__AssistModel__Group_10__1 ;
    public final void rule__AssistModel__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1345:1: ( rule__AssistModel__Group_10__0__Impl rule__AssistModel__Group_10__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1346:2: rule__AssistModel__Group_10__0__Impl rule__AssistModel__Group_10__1
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_10__0__Impl_in_rule__AssistModel__Group_10__02972);
            rule__AssistModel__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group_10__1_in_rule__AssistModel__Group_10__02975);
            rule__AssistModel__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_10__0"


    // $ANTLR start "rule__AssistModel__Group_10__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1353:1: rule__AssistModel__Group_10__0__Impl : ( 'Restrictions' ) ;
    public final void rule__AssistModel__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1357:1: ( ( 'Restrictions' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1358:1: ( 'Restrictions' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1358:1: ( 'Restrictions' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1359:1: 'Restrictions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getRestrictionsKeyword_10_0()); 
            }
            match(input,68,FOLLOW_68_in_rule__AssistModel__Group_10__0__Impl3003); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getRestrictionsKeyword_10_0()); 
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
    // $ANTLR end "rule__AssistModel__Group_10__0__Impl"


    // $ANTLR start "rule__AssistModel__Group_10__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1372:1: rule__AssistModel__Group_10__1 : rule__AssistModel__Group_10__1__Impl rule__AssistModel__Group_10__2 ;
    public final void rule__AssistModel__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1376:1: ( rule__AssistModel__Group_10__1__Impl rule__AssistModel__Group_10__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1377:2: rule__AssistModel__Group_10__1__Impl rule__AssistModel__Group_10__2
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_10__1__Impl_in_rule__AssistModel__Group_10__13034);
            rule__AssistModel__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group_10__2_in_rule__AssistModel__Group_10__13037);
            rule__AssistModel__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_10__1"


    // $ANTLR start "rule__AssistModel__Group_10__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1384:1: rule__AssistModel__Group_10__1__Impl : ( '{' ) ;
    public final void rule__AssistModel__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1388:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1389:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1389:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1390:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_10_1()); 
            }
            match(input,61,FOLLOW_61_in_rule__AssistModel__Group_10__1__Impl3065); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_10_1()); 
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
    // $ANTLR end "rule__AssistModel__Group_10__1__Impl"


    // $ANTLR start "rule__AssistModel__Group_10__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1403:1: rule__AssistModel__Group_10__2 : rule__AssistModel__Group_10__2__Impl rule__AssistModel__Group_10__3 ;
    public final void rule__AssistModel__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1407:1: ( rule__AssistModel__Group_10__2__Impl rule__AssistModel__Group_10__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1408:2: rule__AssistModel__Group_10__2__Impl rule__AssistModel__Group_10__3
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_10__2__Impl_in_rule__AssistModel__Group_10__23096);
            rule__AssistModel__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssistModel__Group_10__3_in_rule__AssistModel__Group_10__23099);
            rule__AssistModel__Group_10__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_10__2"


    // $ANTLR start "rule__AssistModel__Group_10__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1415:1: rule__AssistModel__Group_10__2__Impl : ( ( rule__AssistModel__DislocalityRelationsAssignment_10_2 )* ) ;
    public final void rule__AssistModel__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1419:1: ( ( ( rule__AssistModel__DislocalityRelationsAssignment_10_2 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1420:1: ( ( rule__AssistModel__DislocalityRelationsAssignment_10_2 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1420:1: ( ( rule__AssistModel__DislocalityRelationsAssignment_10_2 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1421:1: ( rule__AssistModel__DislocalityRelationsAssignment_10_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getDislocalityRelationsAssignment_10_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1422:1: ( rule__AssistModel__DislocalityRelationsAssignment_10_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1422:2: rule__AssistModel__DislocalityRelationsAssignment_10_2
            	    {
            	    pushFollow(FOLLOW_rule__AssistModel__DislocalityRelationsAssignment_10_2_in_rule__AssistModel__Group_10__2__Impl3126);
            	    rule__AssistModel__DislocalityRelationsAssignment_10_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getDislocalityRelationsAssignment_10_2()); 
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
    // $ANTLR end "rule__AssistModel__Group_10__2__Impl"


    // $ANTLR start "rule__AssistModel__Group_10__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1432:1: rule__AssistModel__Group_10__3 : rule__AssistModel__Group_10__3__Impl ;
    public final void rule__AssistModel__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1436:1: ( rule__AssistModel__Group_10__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1437:2: rule__AssistModel__Group_10__3__Impl
            {
            pushFollow(FOLLOW_rule__AssistModel__Group_10__3__Impl_in_rule__AssistModel__Group_10__33157);
            rule__AssistModel__Group_10__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group_10__3"


    // $ANTLR start "rule__AssistModel__Group_10__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1443:1: rule__AssistModel__Group_10__3__Impl : ( '}' ) ;
    public final void rule__AssistModel__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1447:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1448:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1448:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1449:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_10_3()); 
            }
            match(input,65,FOLLOW_65_in_rule__AssistModel__Group_10__3__Impl3185); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_10_3()); 
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
    // $ANTLR end "rule__AssistModel__Group_10__3__Impl"


    // $ANTLR start "rule__Compartment__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1470:1: rule__Compartment__Group__0 : rule__Compartment__Group__0__Impl rule__Compartment__Group__1 ;
    public final void rule__Compartment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1474:1: ( rule__Compartment__Group__0__Impl rule__Compartment__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1475:2: rule__Compartment__Group__0__Impl rule__Compartment__Group__1
            {
            pushFollow(FOLLOW_rule__Compartment__Group__0__Impl_in_rule__Compartment__Group__03224);
            rule__Compartment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compartment__Group__1_in_rule__Compartment__Group__03227);
            rule__Compartment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1482:1: rule__Compartment__Group__0__Impl : ( 'Compartment' ) ;
    public final void rule__Compartment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1486:1: ( ( 'Compartment' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1487:1: ( 'Compartment' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1487:1: ( 'Compartment' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1488:1: 'Compartment'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getCompartmentKeyword_0()); 
            }
            match(input,11,FOLLOW_11_in_rule__Compartment__Group__0__Impl3255); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getCompartmentKeyword_0()); 
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
    // $ANTLR end "rule__Compartment__Group__0__Impl"


    // $ANTLR start "rule__Compartment__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1501:1: rule__Compartment__Group__1 : rule__Compartment__Group__1__Impl rule__Compartment__Group__2 ;
    public final void rule__Compartment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1505:1: ( rule__Compartment__Group__1__Impl rule__Compartment__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1506:2: rule__Compartment__Group__1__Impl rule__Compartment__Group__2
            {
            pushFollow(FOLLOW_rule__Compartment__Group__1__Impl_in_rule__Compartment__Group__13286);
            rule__Compartment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compartment__Group__2_in_rule__Compartment__Group__13289);
            rule__Compartment__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1513:1: rule__Compartment__Group__1__Impl : ( ( rule__Compartment__NameAssignment_1 ) ) ;
    public final void rule__Compartment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1517:1: ( ( ( rule__Compartment__NameAssignment_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1518:1: ( ( rule__Compartment__NameAssignment_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1518:1: ( ( rule__Compartment__NameAssignment_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1519:1: ( rule__Compartment__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getNameAssignment_1()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1520:1: ( rule__Compartment__NameAssignment_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1520:2: rule__Compartment__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Compartment__NameAssignment_1_in_rule__Compartment__Group__1__Impl3316);
            rule__Compartment__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Compartment__Group__1__Impl"


    // $ANTLR start "rule__Compartment__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1530:1: rule__Compartment__Group__2 : rule__Compartment__Group__2__Impl rule__Compartment__Group__3 ;
    public final void rule__Compartment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1534:1: ( rule__Compartment__Group__2__Impl rule__Compartment__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1535:2: rule__Compartment__Group__2__Impl rule__Compartment__Group__3
            {
            pushFollow(FOLLOW_rule__Compartment__Group__2__Impl_in_rule__Compartment__Group__23346);
            rule__Compartment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compartment__Group__3_in_rule__Compartment__Group__23349);
            rule__Compartment__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1542:1: rule__Compartment__Group__2__Impl : ( '{' ) ;
    public final void rule__Compartment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1546:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1547:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1547:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1548:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,61,FOLLOW_61_in_rule__Compartment__Group__2__Impl3377); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Compartment__Group__2__Impl"


    // $ANTLR start "rule__Compartment__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1561:1: rule__Compartment__Group__3 : rule__Compartment__Group__3__Impl rule__Compartment__Group__4 ;
    public final void rule__Compartment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1565:1: ( rule__Compartment__Group__3__Impl rule__Compartment__Group__4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1566:2: rule__Compartment__Group__3__Impl rule__Compartment__Group__4
            {
            pushFollow(FOLLOW_rule__Compartment__Group__3__Impl_in_rule__Compartment__Group__33408);
            rule__Compartment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compartment__Group__4_in_rule__Compartment__Group__33411);
            rule__Compartment__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1573:1: rule__Compartment__Group__3__Impl : ( ( rule__Compartment__UnorderedGroup_3 ) ) ;
    public final void rule__Compartment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1577:1: ( ( ( rule__Compartment__UnorderedGroup_3 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1578:1: ( ( rule__Compartment__UnorderedGroup_3 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1578:1: ( ( rule__Compartment__UnorderedGroup_3 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1579:1: ( rule__Compartment__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getUnorderedGroup_3()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1580:1: ( rule__Compartment__UnorderedGroup_3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1580:2: rule__Compartment__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__Compartment__UnorderedGroup_3_in_rule__Compartment__Group__3__Impl3438);
            rule__Compartment__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getUnorderedGroup_3()); 
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
    // $ANTLR end "rule__Compartment__Group__3__Impl"


    // $ANTLR start "rule__Compartment__Group__4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1590:1: rule__Compartment__Group__4 : rule__Compartment__Group__4__Impl ;
    public final void rule__Compartment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1594:1: ( rule__Compartment__Group__4__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1595:2: rule__Compartment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__Group__4__Impl_in_rule__Compartment__Group__43468);
            rule__Compartment__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1601:1: rule__Compartment__Group__4__Impl : ( '}' ) ;
    public final void rule__Compartment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1605:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1606:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1606:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1607:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,65,FOLLOW_65_in_rule__Compartment__Group__4__Impl3496); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__Compartment__Group__4__Impl"


    // $ANTLR start "rule__Compartment__Group_3_0__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1630:1: rule__Compartment__Group_3_0__0 : rule__Compartment__Group_3_0__0__Impl rule__Compartment__Group_3_0__1 ;
    public final void rule__Compartment__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1634:1: ( rule__Compartment__Group_3_0__0__Impl rule__Compartment__Group_3_0__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1635:2: rule__Compartment__Group_3_0__0__Impl rule__Compartment__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3_0__0__Impl_in_rule__Compartment__Group_3_0__03537);
            rule__Compartment__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compartment__Group_3_0__1_in_rule__Compartment__Group_3_0__03540);
            rule__Compartment__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3_0__0"


    // $ANTLR start "rule__Compartment__Group_3_0__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1642:1: rule__Compartment__Group_3_0__0__Impl : ( 'Manufacturer' ) ;
    public final void rule__Compartment__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1646:1: ( ( 'Manufacturer' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1647:1: ( 'Manufacturer' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1647:1: ( 'Manufacturer' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1648:1: 'Manufacturer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getManufacturerKeyword_3_0_0()); 
            }
            match(input,69,FOLLOW_69_in_rule__Compartment__Group_3_0__0__Impl3568); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getManufacturerKeyword_3_0_0()); 
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
    // $ANTLR end "rule__Compartment__Group_3_0__0__Impl"


    // $ANTLR start "rule__Compartment__Group_3_0__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1661:1: rule__Compartment__Group_3_0__1 : rule__Compartment__Group_3_0__1__Impl rule__Compartment__Group_3_0__2 ;
    public final void rule__Compartment__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1665:1: ( rule__Compartment__Group_3_0__1__Impl rule__Compartment__Group_3_0__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1666:2: rule__Compartment__Group_3_0__1__Impl rule__Compartment__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3_0__1__Impl_in_rule__Compartment__Group_3_0__13599);
            rule__Compartment__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compartment__Group_3_0__2_in_rule__Compartment__Group_3_0__13602);
            rule__Compartment__Group_3_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3_0__1"


    // $ANTLR start "rule__Compartment__Group_3_0__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1673:1: rule__Compartment__Group_3_0__1__Impl : ( '=' ) ;
    public final void rule__Compartment__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1677:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1678:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1678:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1679:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_0_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__Compartment__Group_3_0__1__Impl3630); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_0_1()); 
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
    // $ANTLR end "rule__Compartment__Group_3_0__1__Impl"


    // $ANTLR start "rule__Compartment__Group_3_0__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1692:1: rule__Compartment__Group_3_0__2 : rule__Compartment__Group_3_0__2__Impl rule__Compartment__Group_3_0__3 ;
    public final void rule__Compartment__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1696:1: ( rule__Compartment__Group_3_0__2__Impl rule__Compartment__Group_3_0__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1697:2: rule__Compartment__Group_3_0__2__Impl rule__Compartment__Group_3_0__3
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3_0__2__Impl_in_rule__Compartment__Group_3_0__23661);
            rule__Compartment__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compartment__Group_3_0__3_in_rule__Compartment__Group_3_0__23664);
            rule__Compartment__Group_3_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3_0__2"


    // $ANTLR start "rule__Compartment__Group_3_0__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1704:1: rule__Compartment__Group_3_0__2__Impl : ( ( rule__Compartment__ManufacturerAssignment_3_0_2 ) ) ;
    public final void rule__Compartment__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1708:1: ( ( ( rule__Compartment__ManufacturerAssignment_3_0_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1709:1: ( ( rule__Compartment__ManufacturerAssignment_3_0_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1709:1: ( ( rule__Compartment__ManufacturerAssignment_3_0_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1710:1: ( rule__Compartment__ManufacturerAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getManufacturerAssignment_3_0_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1711:1: ( rule__Compartment__ManufacturerAssignment_3_0_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1711:2: rule__Compartment__ManufacturerAssignment_3_0_2
            {
            pushFollow(FOLLOW_rule__Compartment__ManufacturerAssignment_3_0_2_in_rule__Compartment__Group_3_0__2__Impl3691);
            rule__Compartment__ManufacturerAssignment_3_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getManufacturerAssignment_3_0_2()); 
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
    // $ANTLR end "rule__Compartment__Group_3_0__2__Impl"


    // $ANTLR start "rule__Compartment__Group_3_0__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1721:1: rule__Compartment__Group_3_0__3 : rule__Compartment__Group_3_0__3__Impl ;
    public final void rule__Compartment__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1725:1: ( rule__Compartment__Group_3_0__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1726:2: rule__Compartment__Group_3_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3_0__3__Impl_in_rule__Compartment__Group_3_0__33721);
            rule__Compartment__Group_3_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3_0__3"


    // $ANTLR start "rule__Compartment__Group_3_0__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1732:1: rule__Compartment__Group_3_0__3__Impl : ( ';' ) ;
    public final void rule__Compartment__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1736:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1737:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1737:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1738:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_0_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__Compartment__Group_3_0__3__Impl3749); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_0_3()); 
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
    // $ANTLR end "rule__Compartment__Group_3_0__3__Impl"


    // $ANTLR start "rule__Compartment__Group_3_1__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1759:1: rule__Compartment__Group_3_1__0 : rule__Compartment__Group_3_1__0__Impl rule__Compartment__Group_3_1__1 ;
    public final void rule__Compartment__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1763:1: ( rule__Compartment__Group_3_1__0__Impl rule__Compartment__Group_3_1__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1764:2: rule__Compartment__Group_3_1__0__Impl rule__Compartment__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3_1__0__Impl_in_rule__Compartment__Group_3_1__03788);
            rule__Compartment__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compartment__Group_3_1__1_in_rule__Compartment__Group_3_1__03791);
            rule__Compartment__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3_1__0"


    // $ANTLR start "rule__Compartment__Group_3_1__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1771:1: rule__Compartment__Group_3_1__0__Impl : ( 'PowerSupply' ) ;
    public final void rule__Compartment__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1775:1: ( ( 'PowerSupply' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1776:1: ( 'PowerSupply' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1776:1: ( 'PowerSupply' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1777:1: 'PowerSupply'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getPowerSupplyKeyword_3_1_0()); 
            }
            match(input,70,FOLLOW_70_in_rule__Compartment__Group_3_1__0__Impl3819); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getPowerSupplyKeyword_3_1_0()); 
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
    // $ANTLR end "rule__Compartment__Group_3_1__0__Impl"


    // $ANTLR start "rule__Compartment__Group_3_1__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1790:1: rule__Compartment__Group_3_1__1 : rule__Compartment__Group_3_1__1__Impl rule__Compartment__Group_3_1__2 ;
    public final void rule__Compartment__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1794:1: ( rule__Compartment__Group_3_1__1__Impl rule__Compartment__Group_3_1__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1795:2: rule__Compartment__Group_3_1__1__Impl rule__Compartment__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3_1__1__Impl_in_rule__Compartment__Group_3_1__13850);
            rule__Compartment__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compartment__Group_3_1__2_in_rule__Compartment__Group_3_1__13853);
            rule__Compartment__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3_1__1"


    // $ANTLR start "rule__Compartment__Group_3_1__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1802:1: rule__Compartment__Group_3_1__1__Impl : ( '=' ) ;
    public final void rule__Compartment__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1806:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1807:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1807:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1808:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_1_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__Compartment__Group_3_1__1__Impl3881); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_1_1()); 
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
    // $ANTLR end "rule__Compartment__Group_3_1__1__Impl"


    // $ANTLR start "rule__Compartment__Group_3_1__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1821:1: rule__Compartment__Group_3_1__2 : rule__Compartment__Group_3_1__2__Impl rule__Compartment__Group_3_1__3 ;
    public final void rule__Compartment__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1825:1: ( rule__Compartment__Group_3_1__2__Impl rule__Compartment__Group_3_1__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1826:2: rule__Compartment__Group_3_1__2__Impl rule__Compartment__Group_3_1__3
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3_1__2__Impl_in_rule__Compartment__Group_3_1__23912);
            rule__Compartment__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compartment__Group_3_1__3_in_rule__Compartment__Group_3_1__23915);
            rule__Compartment__Group_3_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3_1__2"


    // $ANTLR start "rule__Compartment__Group_3_1__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1833:1: rule__Compartment__Group_3_1__2__Impl : ( ( rule__Compartment__PowerSupplyAssignment_3_1_2 ) ) ;
    public final void rule__Compartment__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1837:1: ( ( ( rule__Compartment__PowerSupplyAssignment_3_1_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1838:1: ( ( rule__Compartment__PowerSupplyAssignment_3_1_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1838:1: ( ( rule__Compartment__PowerSupplyAssignment_3_1_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1839:1: ( rule__Compartment__PowerSupplyAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getPowerSupplyAssignment_3_1_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1840:1: ( rule__Compartment__PowerSupplyAssignment_3_1_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1840:2: rule__Compartment__PowerSupplyAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__Compartment__PowerSupplyAssignment_3_1_2_in_rule__Compartment__Group_3_1__2__Impl3942);
            rule__Compartment__PowerSupplyAssignment_3_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getPowerSupplyAssignment_3_1_2()); 
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
    // $ANTLR end "rule__Compartment__Group_3_1__2__Impl"


    // $ANTLR start "rule__Compartment__Group_3_1__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1850:1: rule__Compartment__Group_3_1__3 : rule__Compartment__Group_3_1__3__Impl ;
    public final void rule__Compartment__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1854:1: ( rule__Compartment__Group_3_1__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1855:2: rule__Compartment__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3_1__3__Impl_in_rule__Compartment__Group_3_1__33972);
            rule__Compartment__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3_1__3"


    // $ANTLR start "rule__Compartment__Group_3_1__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1861:1: rule__Compartment__Group_3_1__3__Impl : ( ';' ) ;
    public final void rule__Compartment__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1865:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1866:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1866:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1867:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_1_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__Compartment__Group_3_1__3__Impl4000); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_1_3()); 
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
    // $ANTLR end "rule__Compartment__Group_3_1__3__Impl"


    // $ANTLR start "rule__Compartment__Group_3_2__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1888:1: rule__Compartment__Group_3_2__0 : rule__Compartment__Group_3_2__0__Impl rule__Compartment__Group_3_2__1 ;
    public final void rule__Compartment__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1892:1: ( rule__Compartment__Group_3_2__0__Impl rule__Compartment__Group_3_2__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1893:2: rule__Compartment__Group_3_2__0__Impl rule__Compartment__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3_2__0__Impl_in_rule__Compartment__Group_3_2__04039);
            rule__Compartment__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compartment__Group_3_2__1_in_rule__Compartment__Group_3_2__04042);
            rule__Compartment__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3_2__0"


    // $ANTLR start "rule__Compartment__Group_3_2__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1900:1: rule__Compartment__Group_3_2__0__Impl : ( 'Side' ) ;
    public final void rule__Compartment__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1904:1: ( ( 'Side' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1905:1: ( 'Side' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1905:1: ( 'Side' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1906:1: 'Side'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getSideKeyword_3_2_0()); 
            }
            match(input,71,FOLLOW_71_in_rule__Compartment__Group_3_2__0__Impl4070); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getSideKeyword_3_2_0()); 
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
    // $ANTLR end "rule__Compartment__Group_3_2__0__Impl"


    // $ANTLR start "rule__Compartment__Group_3_2__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1919:1: rule__Compartment__Group_3_2__1 : rule__Compartment__Group_3_2__1__Impl rule__Compartment__Group_3_2__2 ;
    public final void rule__Compartment__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1923:1: ( rule__Compartment__Group_3_2__1__Impl rule__Compartment__Group_3_2__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1924:2: rule__Compartment__Group_3_2__1__Impl rule__Compartment__Group_3_2__2
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3_2__1__Impl_in_rule__Compartment__Group_3_2__14101);
            rule__Compartment__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compartment__Group_3_2__2_in_rule__Compartment__Group_3_2__14104);
            rule__Compartment__Group_3_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3_2__1"


    // $ANTLR start "rule__Compartment__Group_3_2__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1931:1: rule__Compartment__Group_3_2__1__Impl : ( '=' ) ;
    public final void rule__Compartment__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1935:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1936:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1936:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1937:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_2_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__Compartment__Group_3_2__1__Impl4132); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_2_1()); 
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
    // $ANTLR end "rule__Compartment__Group_3_2__1__Impl"


    // $ANTLR start "rule__Compartment__Group_3_2__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1950:1: rule__Compartment__Group_3_2__2 : rule__Compartment__Group_3_2__2__Impl rule__Compartment__Group_3_2__3 ;
    public final void rule__Compartment__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1954:1: ( rule__Compartment__Group_3_2__2__Impl rule__Compartment__Group_3_2__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1955:2: rule__Compartment__Group_3_2__2__Impl rule__Compartment__Group_3_2__3
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3_2__2__Impl_in_rule__Compartment__Group_3_2__24163);
            rule__Compartment__Group_3_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compartment__Group_3_2__3_in_rule__Compartment__Group_3_2__24166);
            rule__Compartment__Group_3_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3_2__2"


    // $ANTLR start "rule__Compartment__Group_3_2__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1962:1: rule__Compartment__Group_3_2__2__Impl : ( ( rule__Compartment__SideAssignment_3_2_2 ) ) ;
    public final void rule__Compartment__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1966:1: ( ( ( rule__Compartment__SideAssignment_3_2_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1967:1: ( ( rule__Compartment__SideAssignment_3_2_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1967:1: ( ( rule__Compartment__SideAssignment_3_2_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1968:1: ( rule__Compartment__SideAssignment_3_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getSideAssignment_3_2_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1969:1: ( rule__Compartment__SideAssignment_3_2_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1969:2: rule__Compartment__SideAssignment_3_2_2
            {
            pushFollow(FOLLOW_rule__Compartment__SideAssignment_3_2_2_in_rule__Compartment__Group_3_2__2__Impl4193);
            rule__Compartment__SideAssignment_3_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getSideAssignment_3_2_2()); 
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
    // $ANTLR end "rule__Compartment__Group_3_2__2__Impl"


    // $ANTLR start "rule__Compartment__Group_3_2__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1979:1: rule__Compartment__Group_3_2__3 : rule__Compartment__Group_3_2__3__Impl ;
    public final void rule__Compartment__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1983:1: ( rule__Compartment__Group_3_2__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1984:2: rule__Compartment__Group_3_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3_2__3__Impl_in_rule__Compartment__Group_3_2__34223);
            rule__Compartment__Group_3_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3_2__3"


    // $ANTLR start "rule__Compartment__Group_3_2__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1990:1: rule__Compartment__Group_3_2__3__Impl : ( ';' ) ;
    public final void rule__Compartment__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1994:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1995:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1995:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1996:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_2_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__Compartment__Group_3_2__3__Impl4251); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_2_3()); 
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
    // $ANTLR end "rule__Compartment__Group_3_2__3__Impl"


    // $ANTLR start "rule__Compartment__Group_3_3__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2017:1: rule__Compartment__Group_3_3__0 : rule__Compartment__Group_3_3__0__Impl rule__Compartment__Group_3_3__1 ;
    public final void rule__Compartment__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2021:1: ( rule__Compartment__Group_3_3__0__Impl rule__Compartment__Group_3_3__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2022:2: rule__Compartment__Group_3_3__0__Impl rule__Compartment__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3_3__0__Impl_in_rule__Compartment__Group_3_3__04290);
            rule__Compartment__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compartment__Group_3_3__1_in_rule__Compartment__Group_3_3__04293);
            rule__Compartment__Group_3_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3_3__0"


    // $ANTLR start "rule__Compartment__Group_3_3__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2029:1: rule__Compartment__Group_3_3__0__Impl : ( 'Zone' ) ;
    public final void rule__Compartment__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2033:1: ( ( 'Zone' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2034:1: ( 'Zone' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2034:1: ( 'Zone' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2035:1: 'Zone'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getZoneKeyword_3_3_0()); 
            }
            match(input,72,FOLLOW_72_in_rule__Compartment__Group_3_3__0__Impl4321); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getZoneKeyword_3_3_0()); 
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
    // $ANTLR end "rule__Compartment__Group_3_3__0__Impl"


    // $ANTLR start "rule__Compartment__Group_3_3__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2048:1: rule__Compartment__Group_3_3__1 : rule__Compartment__Group_3_3__1__Impl rule__Compartment__Group_3_3__2 ;
    public final void rule__Compartment__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2052:1: ( rule__Compartment__Group_3_3__1__Impl rule__Compartment__Group_3_3__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2053:2: rule__Compartment__Group_3_3__1__Impl rule__Compartment__Group_3_3__2
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3_3__1__Impl_in_rule__Compartment__Group_3_3__14352);
            rule__Compartment__Group_3_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compartment__Group_3_3__2_in_rule__Compartment__Group_3_3__14355);
            rule__Compartment__Group_3_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3_3__1"


    // $ANTLR start "rule__Compartment__Group_3_3__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2060:1: rule__Compartment__Group_3_3__1__Impl : ( '=' ) ;
    public final void rule__Compartment__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2064:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2065:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2065:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2066:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_3_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__Compartment__Group_3_3__1__Impl4383); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_3_1()); 
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
    // $ANTLR end "rule__Compartment__Group_3_3__1__Impl"


    // $ANTLR start "rule__Compartment__Group_3_3__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2079:1: rule__Compartment__Group_3_3__2 : rule__Compartment__Group_3_3__2__Impl rule__Compartment__Group_3_3__3 ;
    public final void rule__Compartment__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2083:1: ( rule__Compartment__Group_3_3__2__Impl rule__Compartment__Group_3_3__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2084:2: rule__Compartment__Group_3_3__2__Impl rule__Compartment__Group_3_3__3
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3_3__2__Impl_in_rule__Compartment__Group_3_3__24414);
            rule__Compartment__Group_3_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compartment__Group_3_3__3_in_rule__Compartment__Group_3_3__24417);
            rule__Compartment__Group_3_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3_3__2"


    // $ANTLR start "rule__Compartment__Group_3_3__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2091:1: rule__Compartment__Group_3_3__2__Impl : ( ( rule__Compartment__ZoneAssignment_3_3_2 ) ) ;
    public final void rule__Compartment__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2095:1: ( ( ( rule__Compartment__ZoneAssignment_3_3_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2096:1: ( ( rule__Compartment__ZoneAssignment_3_3_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2096:1: ( ( rule__Compartment__ZoneAssignment_3_3_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2097:1: ( rule__Compartment__ZoneAssignment_3_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getZoneAssignment_3_3_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2098:1: ( rule__Compartment__ZoneAssignment_3_3_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2098:2: rule__Compartment__ZoneAssignment_3_3_2
            {
            pushFollow(FOLLOW_rule__Compartment__ZoneAssignment_3_3_2_in_rule__Compartment__Group_3_3__2__Impl4444);
            rule__Compartment__ZoneAssignment_3_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getZoneAssignment_3_3_2()); 
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
    // $ANTLR end "rule__Compartment__Group_3_3__2__Impl"


    // $ANTLR start "rule__Compartment__Group_3_3__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2108:1: rule__Compartment__Group_3_3__3 : rule__Compartment__Group_3_3__3__Impl ;
    public final void rule__Compartment__Group_3_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2112:1: ( rule__Compartment__Group_3_3__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2113:2: rule__Compartment__Group_3_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3_3__3__Impl_in_rule__Compartment__Group_3_3__34474);
            rule__Compartment__Group_3_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__Group_3_3__3"


    // $ANTLR start "rule__Compartment__Group_3_3__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2119:1: rule__Compartment__Group_3_3__3__Impl : ( ';' ) ;
    public final void rule__Compartment__Group_3_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2123:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2124:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2124:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2125:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_3_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__Compartment__Group_3_3__3__Impl4502); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_3_3()); 
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
    // $ANTLR end "rule__Compartment__Group_3_3__3__Impl"


    // $ANTLR start "rule__RDC__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2146:1: rule__RDC__Group__0 : rule__RDC__Group__0__Impl rule__RDC__Group__1 ;
    public final void rule__RDC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2150:1: ( rule__RDC__Group__0__Impl rule__RDC__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2151:2: rule__RDC__Group__0__Impl rule__RDC__Group__1
            {
            pushFollow(FOLLOW_rule__RDC__Group__0__Impl_in_rule__RDC__Group__04541);
            rule__RDC__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group__1_in_rule__RDC__Group__04544);
            rule__RDC__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2158:1: rule__RDC__Group__0__Impl : ( 'RDC' ) ;
    public final void rule__RDC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2162:1: ( ( 'RDC' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2163:1: ( 'RDC' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2163:1: ( 'RDC' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2164:1: 'RDC'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getRDCKeyword_0()); 
            }
            match(input,12,FOLLOW_12_in_rule__RDC__Group__0__Impl4572); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getRDCKeyword_0()); 
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
    // $ANTLR end "rule__RDC__Group__0__Impl"


    // $ANTLR start "rule__RDC__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2177:1: rule__RDC__Group__1 : rule__RDC__Group__1__Impl rule__RDC__Group__2 ;
    public final void rule__RDC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2181:1: ( rule__RDC__Group__1__Impl rule__RDC__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2182:2: rule__RDC__Group__1__Impl rule__RDC__Group__2
            {
            pushFollow(FOLLOW_rule__RDC__Group__1__Impl_in_rule__RDC__Group__14603);
            rule__RDC__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group__2_in_rule__RDC__Group__14606);
            rule__RDC__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2189:1: rule__RDC__Group__1__Impl : ( ( rule__RDC__NameAssignment_1 ) ) ;
    public final void rule__RDC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2193:1: ( ( ( rule__RDC__NameAssignment_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2194:1: ( ( rule__RDC__NameAssignment_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2194:1: ( ( rule__RDC__NameAssignment_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2195:1: ( rule__RDC__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getNameAssignment_1()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2196:1: ( rule__RDC__NameAssignment_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2196:2: rule__RDC__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RDC__NameAssignment_1_in_rule__RDC__Group__1__Impl4633);
            rule__RDC__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__RDC__Group__1__Impl"


    // $ANTLR start "rule__RDC__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2206:1: rule__RDC__Group__2 : rule__RDC__Group__2__Impl rule__RDC__Group__3 ;
    public final void rule__RDC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2210:1: ( rule__RDC__Group__2__Impl rule__RDC__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2211:2: rule__RDC__Group__2__Impl rule__RDC__Group__3
            {
            pushFollow(FOLLOW_rule__RDC__Group__2__Impl_in_rule__RDC__Group__24663);
            rule__RDC__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group__3_in_rule__RDC__Group__24666);
            rule__RDC__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2218:1: rule__RDC__Group__2__Impl : ( '{' ) ;
    public final void rule__RDC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2222:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2223:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2223:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2224:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,61,FOLLOW_61_in_rule__RDC__Group__2__Impl4694); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__RDC__Group__2__Impl"


    // $ANTLR start "rule__RDC__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2237:1: rule__RDC__Group__3 : rule__RDC__Group__3__Impl rule__RDC__Group__4 ;
    public final void rule__RDC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2241:1: ( rule__RDC__Group__3__Impl rule__RDC__Group__4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2242:2: rule__RDC__Group__3__Impl rule__RDC__Group__4
            {
            pushFollow(FOLLOW_rule__RDC__Group__3__Impl_in_rule__RDC__Group__34725);
            rule__RDC__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group__4_in_rule__RDC__Group__34728);
            rule__RDC__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2249:1: rule__RDC__Group__3__Impl : ( ( rule__RDC__Group_3__0 )? ) ;
    public final void rule__RDC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2253:1: ( ( ( rule__RDC__Group_3__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2254:1: ( ( rule__RDC__Group_3__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2254:1: ( ( rule__RDC__Group_3__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2255:1: ( rule__RDC__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getGroup_3()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2256:1: ( rule__RDC__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==69) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2256:2: rule__RDC__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__RDC__Group_3__0_in_rule__RDC__Group__3__Impl4755);
                    rule__RDC__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getGroup_3()); 
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
    // $ANTLR end "rule__RDC__Group__3__Impl"


    // $ANTLR start "rule__RDC__Group__4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2266:1: rule__RDC__Group__4 : rule__RDC__Group__4__Impl rule__RDC__Group__5 ;
    public final void rule__RDC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2270:1: ( rule__RDC__Group__4__Impl rule__RDC__Group__5 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2271:2: rule__RDC__Group__4__Impl rule__RDC__Group__5
            {
            pushFollow(FOLLOW_rule__RDC__Group__4__Impl_in_rule__RDC__Group__44786);
            rule__RDC__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group__5_in_rule__RDC__Group__44789);
            rule__RDC__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2278:1: rule__RDC__Group__4__Impl : ( ( rule__RDC__Group_4__0 )? ) ;
    public final void rule__RDC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2282:1: ( ( ( rule__RDC__Group_4__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2283:1: ( ( rule__RDC__Group_4__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2283:1: ( ( rule__RDC__Group_4__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2284:1: ( rule__RDC__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getGroup_4()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2285:1: ( rule__RDC__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==70) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2285:2: rule__RDC__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RDC__Group_4__0_in_rule__RDC__Group__4__Impl4816);
                    rule__RDC__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getGroup_4()); 
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
    // $ANTLR end "rule__RDC__Group__4__Impl"


    // $ANTLR start "rule__RDC__Group__5"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2295:1: rule__RDC__Group__5 : rule__RDC__Group__5__Impl rule__RDC__Group__6 ;
    public final void rule__RDC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2299:1: ( rule__RDC__Group__5__Impl rule__RDC__Group__6 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2300:2: rule__RDC__Group__5__Impl rule__RDC__Group__6
            {
            pushFollow(FOLLOW_rule__RDC__Group__5__Impl_in_rule__RDC__Group__54847);
            rule__RDC__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group__6_in_rule__RDC__Group__54850);
            rule__RDC__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2307:1: rule__RDC__Group__5__Impl : ( ( rule__RDC__Group_5__0 )? ) ;
    public final void rule__RDC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2311:1: ( ( ( rule__RDC__Group_5__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2312:1: ( ( rule__RDC__Group_5__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2312:1: ( ( rule__RDC__Group_5__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2313:1: ( rule__RDC__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getGroup_5()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2314:1: ( rule__RDC__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==73) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2314:2: rule__RDC__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__RDC__Group_5__0_in_rule__RDC__Group__5__Impl4877);
                    rule__RDC__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getGroup_5()); 
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
    // $ANTLR end "rule__RDC__Group__5__Impl"


    // $ANTLR start "rule__RDC__Group__6"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2324:1: rule__RDC__Group__6 : rule__RDC__Group__6__Impl rule__RDC__Group__7 ;
    public final void rule__RDC__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2328:1: ( rule__RDC__Group__6__Impl rule__RDC__Group__7 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2329:2: rule__RDC__Group__6__Impl rule__RDC__Group__7
            {
            pushFollow(FOLLOW_rule__RDC__Group__6__Impl_in_rule__RDC__Group__64908);
            rule__RDC__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group__7_in_rule__RDC__Group__64911);
            rule__RDC__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2336:1: rule__RDC__Group__6__Impl : ( ( rule__RDC__Group_6__0 )? ) ;
    public final void rule__RDC__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2340:1: ( ( ( rule__RDC__Group_6__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2341:1: ( ( rule__RDC__Group_6__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2341:1: ( ( rule__RDC__Group_6__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2342:1: ( rule__RDC__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getGroup_6()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2343:1: ( rule__RDC__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==74) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2343:2: rule__RDC__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__RDC__Group_6__0_in_rule__RDC__Group__6__Impl4938);
                    rule__RDC__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getGroup_6()); 
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
    // $ANTLR end "rule__RDC__Group__6__Impl"


    // $ANTLR start "rule__RDC__Group__7"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2353:1: rule__RDC__Group__7 : rule__RDC__Group__7__Impl rule__RDC__Group__8 ;
    public final void rule__RDC__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2357:1: ( rule__RDC__Group__7__Impl rule__RDC__Group__8 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2358:2: rule__RDC__Group__7__Impl rule__RDC__Group__8
            {
            pushFollow(FOLLOW_rule__RDC__Group__7__Impl_in_rule__RDC__Group__74969);
            rule__RDC__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group__8_in_rule__RDC__Group__74972);
            rule__RDC__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2365:1: rule__RDC__Group__7__Impl : ( ( ( rule__RDC__ConnectorsAssignment_7 ) ) ( ( rule__RDC__ConnectorsAssignment_7 )* ) ) ;
    public final void rule__RDC__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2369:1: ( ( ( ( rule__RDC__ConnectorsAssignment_7 ) ) ( ( rule__RDC__ConnectorsAssignment_7 )* ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2370:1: ( ( ( rule__RDC__ConnectorsAssignment_7 ) ) ( ( rule__RDC__ConnectorsAssignment_7 )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2370:1: ( ( ( rule__RDC__ConnectorsAssignment_7 ) ) ( ( rule__RDC__ConnectorsAssignment_7 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2371:1: ( ( rule__RDC__ConnectorsAssignment_7 ) ) ( ( rule__RDC__ConnectorsAssignment_7 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2371:1: ( ( rule__RDC__ConnectorsAssignment_7 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2372:1: ( rule__RDC__ConnectorsAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getConnectorsAssignment_7()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2373:1: ( rule__RDC__ConnectorsAssignment_7 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2373:2: rule__RDC__ConnectorsAssignment_7
            {
            pushFollow(FOLLOW_rule__RDC__ConnectorsAssignment_7_in_rule__RDC__Group__7__Impl5001);
            rule__RDC__ConnectorsAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getConnectorsAssignment_7()); 
            }

            }

            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2376:1: ( ( rule__RDC__ConnectorsAssignment_7 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2377:1: ( rule__RDC__ConnectorsAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getConnectorsAssignment_7()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2378:1: ( rule__RDC__ConnectorsAssignment_7 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2378:2: rule__RDC__ConnectorsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__RDC__ConnectorsAssignment_7_in_rule__RDC__Group__7__Impl5013);
            	    rule__RDC__ConnectorsAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getConnectorsAssignment_7()); 
            }

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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2389:1: rule__RDC__Group__8 : rule__RDC__Group__8__Impl rule__RDC__Group__9 ;
    public final void rule__RDC__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2393:1: ( rule__RDC__Group__8__Impl rule__RDC__Group__9 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2394:2: rule__RDC__Group__8__Impl rule__RDC__Group__9
            {
            pushFollow(FOLLOW_rule__RDC__Group__8__Impl_in_rule__RDC__Group__85046);
            rule__RDC__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group__9_in_rule__RDC__Group__85049);
            rule__RDC__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2401:1: rule__RDC__Group__8__Impl : ( ( rule__RDC__Group_8__0 )? ) ;
    public final void rule__RDC__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2405:1: ( ( ( rule__RDC__Group_8__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2406:1: ( ( rule__RDC__Group_8__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2406:1: ( ( rule__RDC__Group_8__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2407:1: ( rule__RDC__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getGroup_8()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2408:1: ( rule__RDC__Group_8__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==75) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2408:2: rule__RDC__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__RDC__Group_8__0_in_rule__RDC__Group__8__Impl5076);
                    rule__RDC__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getGroup_8()); 
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
    // $ANTLR end "rule__RDC__Group__8__Impl"


    // $ANTLR start "rule__RDC__Group__9"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2418:1: rule__RDC__Group__9 : rule__RDC__Group__9__Impl ;
    public final void rule__RDC__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2422:1: ( rule__RDC__Group__9__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2423:2: rule__RDC__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group__9__Impl_in_rule__RDC__Group__95107);
            rule__RDC__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2429:1: rule__RDC__Group__9__Impl : ( '}' ) ;
    public final void rule__RDC__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2433:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2434:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2434:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2435:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_9()); 
            }
            match(input,65,FOLLOW_65_in_rule__RDC__Group__9__Impl5135); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_9()); 
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
    // $ANTLR end "rule__RDC__Group__9__Impl"


    // $ANTLR start "rule__RDC__Group_3__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2468:1: rule__RDC__Group_3__0 : rule__RDC__Group_3__0__Impl rule__RDC__Group_3__1 ;
    public final void rule__RDC__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2472:1: ( rule__RDC__Group_3__0__Impl rule__RDC__Group_3__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2473:2: rule__RDC__Group_3__0__Impl rule__RDC__Group_3__1
            {
            pushFollow(FOLLOW_rule__RDC__Group_3__0__Impl_in_rule__RDC__Group_3__05186);
            rule__RDC__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group_3__1_in_rule__RDC__Group_3__05189);
            rule__RDC__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2480:1: rule__RDC__Group_3__0__Impl : ( 'Manufacturer' ) ;
    public final void rule__RDC__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2484:1: ( ( 'Manufacturer' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2485:1: ( 'Manufacturer' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2485:1: ( 'Manufacturer' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2486:1: 'Manufacturer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getManufacturerKeyword_3_0()); 
            }
            match(input,69,FOLLOW_69_in_rule__RDC__Group_3__0__Impl5217); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getManufacturerKeyword_3_0()); 
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
    // $ANTLR end "rule__RDC__Group_3__0__Impl"


    // $ANTLR start "rule__RDC__Group_3__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2499:1: rule__RDC__Group_3__1 : rule__RDC__Group_3__1__Impl rule__RDC__Group_3__2 ;
    public final void rule__RDC__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2503:1: ( rule__RDC__Group_3__1__Impl rule__RDC__Group_3__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2504:2: rule__RDC__Group_3__1__Impl rule__RDC__Group_3__2
            {
            pushFollow(FOLLOW_rule__RDC__Group_3__1__Impl_in_rule__RDC__Group_3__15248);
            rule__RDC__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group_3__2_in_rule__RDC__Group_3__15251);
            rule__RDC__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2511:1: rule__RDC__Group_3__1__Impl : ( '=' ) ;
    public final void rule__RDC__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2515:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2516:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2516:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2517:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getEqualsSignKeyword_3_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__RDC__Group_3__1__Impl5279); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getEqualsSignKeyword_3_1()); 
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
    // $ANTLR end "rule__RDC__Group_3__1__Impl"


    // $ANTLR start "rule__RDC__Group_3__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2530:1: rule__RDC__Group_3__2 : rule__RDC__Group_3__2__Impl rule__RDC__Group_3__3 ;
    public final void rule__RDC__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2534:1: ( rule__RDC__Group_3__2__Impl rule__RDC__Group_3__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2535:2: rule__RDC__Group_3__2__Impl rule__RDC__Group_3__3
            {
            pushFollow(FOLLOW_rule__RDC__Group_3__2__Impl_in_rule__RDC__Group_3__25310);
            rule__RDC__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group_3__3_in_rule__RDC__Group_3__25313);
            rule__RDC__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2542:1: rule__RDC__Group_3__2__Impl : ( ( rule__RDC__ManufacturerAssignment_3_2 ) ) ;
    public final void rule__RDC__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2546:1: ( ( ( rule__RDC__ManufacturerAssignment_3_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2547:1: ( ( rule__RDC__ManufacturerAssignment_3_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2547:1: ( ( rule__RDC__ManufacturerAssignment_3_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2548:1: ( rule__RDC__ManufacturerAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getManufacturerAssignment_3_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2549:1: ( rule__RDC__ManufacturerAssignment_3_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2549:2: rule__RDC__ManufacturerAssignment_3_2
            {
            pushFollow(FOLLOW_rule__RDC__ManufacturerAssignment_3_2_in_rule__RDC__Group_3__2__Impl5340);
            rule__RDC__ManufacturerAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getManufacturerAssignment_3_2()); 
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
    // $ANTLR end "rule__RDC__Group_3__2__Impl"


    // $ANTLR start "rule__RDC__Group_3__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2559:1: rule__RDC__Group_3__3 : rule__RDC__Group_3__3__Impl ;
    public final void rule__RDC__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2563:1: ( rule__RDC__Group_3__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2564:2: rule__RDC__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group_3__3__Impl_in_rule__RDC__Group_3__35370);
            rule__RDC__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2570:1: rule__RDC__Group_3__3__Impl : ( ';' ) ;
    public final void rule__RDC__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2574:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2575:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2575:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2576:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getSemicolonKeyword_3_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__RDC__Group_3__3__Impl5398); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getSemicolonKeyword_3_3()); 
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
    // $ANTLR end "rule__RDC__Group_3__3__Impl"


    // $ANTLR start "rule__RDC__Group_4__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2597:1: rule__RDC__Group_4__0 : rule__RDC__Group_4__0__Impl rule__RDC__Group_4__1 ;
    public final void rule__RDC__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2601:1: ( rule__RDC__Group_4__0__Impl rule__RDC__Group_4__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2602:2: rule__RDC__Group_4__0__Impl rule__RDC__Group_4__1
            {
            pushFollow(FOLLOW_rule__RDC__Group_4__0__Impl_in_rule__RDC__Group_4__05437);
            rule__RDC__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group_4__1_in_rule__RDC__Group_4__05440);
            rule__RDC__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2609:1: rule__RDC__Group_4__0__Impl : ( 'PowerSupply' ) ;
    public final void rule__RDC__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2613:1: ( ( 'PowerSupply' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2614:1: ( 'PowerSupply' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2614:1: ( 'PowerSupply' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2615:1: 'PowerSupply'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getPowerSupplyKeyword_4_0()); 
            }
            match(input,70,FOLLOW_70_in_rule__RDC__Group_4__0__Impl5468); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getPowerSupplyKeyword_4_0()); 
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
    // $ANTLR end "rule__RDC__Group_4__0__Impl"


    // $ANTLR start "rule__RDC__Group_4__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2628:1: rule__RDC__Group_4__1 : rule__RDC__Group_4__1__Impl rule__RDC__Group_4__2 ;
    public final void rule__RDC__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2632:1: ( rule__RDC__Group_4__1__Impl rule__RDC__Group_4__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2633:2: rule__RDC__Group_4__1__Impl rule__RDC__Group_4__2
            {
            pushFollow(FOLLOW_rule__RDC__Group_4__1__Impl_in_rule__RDC__Group_4__15499);
            rule__RDC__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group_4__2_in_rule__RDC__Group_4__15502);
            rule__RDC__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2640:1: rule__RDC__Group_4__1__Impl : ( '=' ) ;
    public final void rule__RDC__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2644:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2645:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2645:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2646:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getEqualsSignKeyword_4_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__RDC__Group_4__1__Impl5530); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getEqualsSignKeyword_4_1()); 
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
    // $ANTLR end "rule__RDC__Group_4__1__Impl"


    // $ANTLR start "rule__RDC__Group_4__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2659:1: rule__RDC__Group_4__2 : rule__RDC__Group_4__2__Impl rule__RDC__Group_4__3 ;
    public final void rule__RDC__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2663:1: ( rule__RDC__Group_4__2__Impl rule__RDC__Group_4__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2664:2: rule__RDC__Group_4__2__Impl rule__RDC__Group_4__3
            {
            pushFollow(FOLLOW_rule__RDC__Group_4__2__Impl_in_rule__RDC__Group_4__25561);
            rule__RDC__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group_4__3_in_rule__RDC__Group_4__25564);
            rule__RDC__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2671:1: rule__RDC__Group_4__2__Impl : ( ( rule__RDC__PowerSupplyAssignment_4_2 ) ) ;
    public final void rule__RDC__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2675:1: ( ( ( rule__RDC__PowerSupplyAssignment_4_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2676:1: ( ( rule__RDC__PowerSupplyAssignment_4_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2676:1: ( ( rule__RDC__PowerSupplyAssignment_4_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2677:1: ( rule__RDC__PowerSupplyAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getPowerSupplyAssignment_4_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2678:1: ( rule__RDC__PowerSupplyAssignment_4_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2678:2: rule__RDC__PowerSupplyAssignment_4_2
            {
            pushFollow(FOLLOW_rule__RDC__PowerSupplyAssignment_4_2_in_rule__RDC__Group_4__2__Impl5591);
            rule__RDC__PowerSupplyAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getPowerSupplyAssignment_4_2()); 
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
    // $ANTLR end "rule__RDC__Group_4__2__Impl"


    // $ANTLR start "rule__RDC__Group_4__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2688:1: rule__RDC__Group_4__3 : rule__RDC__Group_4__3__Impl ;
    public final void rule__RDC__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2692:1: ( rule__RDC__Group_4__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2693:2: rule__RDC__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group_4__3__Impl_in_rule__RDC__Group_4__35621);
            rule__RDC__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2699:1: rule__RDC__Group_4__3__Impl : ( ';' ) ;
    public final void rule__RDC__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2703:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2704:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2704:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2705:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getSemicolonKeyword_4_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__RDC__Group_4__3__Impl5649); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getSemicolonKeyword_4_3()); 
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
    // $ANTLR end "rule__RDC__Group_4__3__Impl"


    // $ANTLR start "rule__RDC__Group_5__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2726:1: rule__RDC__Group_5__0 : rule__RDC__Group_5__0__Impl rule__RDC__Group_5__1 ;
    public final void rule__RDC__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2730:1: ( rule__RDC__Group_5__0__Impl rule__RDC__Group_5__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2731:2: rule__RDC__Group_5__0__Impl rule__RDC__Group_5__1
            {
            pushFollow(FOLLOW_rule__RDC__Group_5__0__Impl_in_rule__RDC__Group_5__05688);
            rule__RDC__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group_5__1_in_rule__RDC__Group_5__05691);
            rule__RDC__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2738:1: rule__RDC__Group_5__0__Impl : ( 'Type' ) ;
    public final void rule__RDC__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2742:1: ( ( 'Type' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2743:1: ( 'Type' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2743:1: ( 'Type' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2744:1: 'Type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getTypeKeyword_5_0()); 
            }
            match(input,73,FOLLOW_73_in_rule__RDC__Group_5__0__Impl5719); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getTypeKeyword_5_0()); 
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
    // $ANTLR end "rule__RDC__Group_5__0__Impl"


    // $ANTLR start "rule__RDC__Group_5__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2757:1: rule__RDC__Group_5__1 : rule__RDC__Group_5__1__Impl rule__RDC__Group_5__2 ;
    public final void rule__RDC__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2761:1: ( rule__RDC__Group_5__1__Impl rule__RDC__Group_5__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2762:2: rule__RDC__Group_5__1__Impl rule__RDC__Group_5__2
            {
            pushFollow(FOLLOW_rule__RDC__Group_5__1__Impl_in_rule__RDC__Group_5__15750);
            rule__RDC__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group_5__2_in_rule__RDC__Group_5__15753);
            rule__RDC__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2769:1: rule__RDC__Group_5__1__Impl : ( '=' ) ;
    public final void rule__RDC__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2773:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2774:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2774:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2775:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getEqualsSignKeyword_5_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__RDC__Group_5__1__Impl5781); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getEqualsSignKeyword_5_1()); 
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
    // $ANTLR end "rule__RDC__Group_5__1__Impl"


    // $ANTLR start "rule__RDC__Group_5__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2788:1: rule__RDC__Group_5__2 : rule__RDC__Group_5__2__Impl rule__RDC__Group_5__3 ;
    public final void rule__RDC__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2792:1: ( rule__RDC__Group_5__2__Impl rule__RDC__Group_5__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2793:2: rule__RDC__Group_5__2__Impl rule__RDC__Group_5__3
            {
            pushFollow(FOLLOW_rule__RDC__Group_5__2__Impl_in_rule__RDC__Group_5__25812);
            rule__RDC__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group_5__3_in_rule__RDC__Group_5__25815);
            rule__RDC__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2800:1: rule__RDC__Group_5__2__Impl : ( ( rule__RDC__RdcTypeAssignment_5_2 ) ) ;
    public final void rule__RDC__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2804:1: ( ( ( rule__RDC__RdcTypeAssignment_5_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2805:1: ( ( rule__RDC__RdcTypeAssignment_5_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2805:1: ( ( rule__RDC__RdcTypeAssignment_5_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2806:1: ( rule__RDC__RdcTypeAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getRdcTypeAssignment_5_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2807:1: ( rule__RDC__RdcTypeAssignment_5_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2807:2: rule__RDC__RdcTypeAssignment_5_2
            {
            pushFollow(FOLLOW_rule__RDC__RdcTypeAssignment_5_2_in_rule__RDC__Group_5__2__Impl5842);
            rule__RDC__RdcTypeAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getRdcTypeAssignment_5_2()); 
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
    // $ANTLR end "rule__RDC__Group_5__2__Impl"


    // $ANTLR start "rule__RDC__Group_5__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2817:1: rule__RDC__Group_5__3 : rule__RDC__Group_5__3__Impl ;
    public final void rule__RDC__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2821:1: ( rule__RDC__Group_5__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2822:2: rule__RDC__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group_5__3__Impl_in_rule__RDC__Group_5__35872);
            rule__RDC__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2828:1: rule__RDC__Group_5__3__Impl : ( ';' ) ;
    public final void rule__RDC__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2832:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2833:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2833:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2834:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getSemicolonKeyword_5_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__RDC__Group_5__3__Impl5900); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getSemicolonKeyword_5_3()); 
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
    // $ANTLR end "rule__RDC__Group_5__3__Impl"


    // $ANTLR start "rule__RDC__Group_6__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2855:1: rule__RDC__Group_6__0 : rule__RDC__Group_6__0__Impl rule__RDC__Group_6__1 ;
    public final void rule__RDC__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2859:1: ( rule__RDC__Group_6__0__Impl rule__RDC__Group_6__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2860:2: rule__RDC__Group_6__0__Impl rule__RDC__Group_6__1
            {
            pushFollow(FOLLOW_rule__RDC__Group_6__0__Impl_in_rule__RDC__Group_6__05939);
            rule__RDC__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group_6__1_in_rule__RDC__Group_6__05942);
            rule__RDC__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2867:1: rule__RDC__Group_6__0__Impl : ( 'ESS' ) ;
    public final void rule__RDC__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2871:1: ( ( 'ESS' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2872:1: ( 'ESS' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2872:1: ( 'ESS' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2873:1: 'ESS'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getESSKeyword_6_0()); 
            }
            match(input,74,FOLLOW_74_in_rule__RDC__Group_6__0__Impl5970); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getESSKeyword_6_0()); 
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
    // $ANTLR end "rule__RDC__Group_6__0__Impl"


    // $ANTLR start "rule__RDC__Group_6__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2886:1: rule__RDC__Group_6__1 : rule__RDC__Group_6__1__Impl rule__RDC__Group_6__2 ;
    public final void rule__RDC__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2890:1: ( rule__RDC__Group_6__1__Impl rule__RDC__Group_6__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2891:2: rule__RDC__Group_6__1__Impl rule__RDC__Group_6__2
            {
            pushFollow(FOLLOW_rule__RDC__Group_6__1__Impl_in_rule__RDC__Group_6__16001);
            rule__RDC__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group_6__2_in_rule__RDC__Group_6__16004);
            rule__RDC__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2898:1: rule__RDC__Group_6__1__Impl : ( '=' ) ;
    public final void rule__RDC__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2902:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2903:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2903:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2904:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getEqualsSignKeyword_6_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__RDC__Group_6__1__Impl6032); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getEqualsSignKeyword_6_1()); 
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
    // $ANTLR end "rule__RDC__Group_6__1__Impl"


    // $ANTLR start "rule__RDC__Group_6__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2917:1: rule__RDC__Group_6__2 : rule__RDC__Group_6__2__Impl rule__RDC__Group_6__3 ;
    public final void rule__RDC__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2921:1: ( rule__RDC__Group_6__2__Impl rule__RDC__Group_6__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2922:2: rule__RDC__Group_6__2__Impl rule__RDC__Group_6__3
            {
            pushFollow(FOLLOW_rule__RDC__Group_6__2__Impl_in_rule__RDC__Group_6__26063);
            rule__RDC__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group_6__3_in_rule__RDC__Group_6__26066);
            rule__RDC__Group_6__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2929:1: rule__RDC__Group_6__2__Impl : ( ( rule__RDC__EssAssignment_6_2 ) ) ;
    public final void rule__RDC__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2933:1: ( ( ( rule__RDC__EssAssignment_6_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2934:1: ( ( rule__RDC__EssAssignment_6_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2934:1: ( ( rule__RDC__EssAssignment_6_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2935:1: ( rule__RDC__EssAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getEssAssignment_6_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2936:1: ( rule__RDC__EssAssignment_6_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2936:2: rule__RDC__EssAssignment_6_2
            {
            pushFollow(FOLLOW_rule__RDC__EssAssignment_6_2_in_rule__RDC__Group_6__2__Impl6093);
            rule__RDC__EssAssignment_6_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getEssAssignment_6_2()); 
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
    // $ANTLR end "rule__RDC__Group_6__2__Impl"


    // $ANTLR start "rule__RDC__Group_6__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2946:1: rule__RDC__Group_6__3 : rule__RDC__Group_6__3__Impl ;
    public final void rule__RDC__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2950:1: ( rule__RDC__Group_6__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2951:2: rule__RDC__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group_6__3__Impl_in_rule__RDC__Group_6__36123);
            rule__RDC__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2957:1: rule__RDC__Group_6__3__Impl : ( ';' ) ;
    public final void rule__RDC__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2961:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2962:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2962:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2963:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getSemicolonKeyword_6_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__RDC__Group_6__3__Impl6151); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getSemicolonKeyword_6_3()); 
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
    // $ANTLR end "rule__RDC__Group_6__3__Impl"


    // $ANTLR start "rule__RDC__Group_8__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2984:1: rule__RDC__Group_8__0 : rule__RDC__Group_8__0__Impl rule__RDC__Group_8__1 ;
    public final void rule__RDC__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2988:1: ( rule__RDC__Group_8__0__Impl rule__RDC__Group_8__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2989:2: rule__RDC__Group_8__0__Impl rule__RDC__Group_8__1
            {
            pushFollow(FOLLOW_rule__RDC__Group_8__0__Impl_in_rule__RDC__Group_8__06190);
            rule__RDC__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group_8__1_in_rule__RDC__Group_8__06193);
            rule__RDC__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2996:1: rule__RDC__Group_8__0__Impl : ( 'Generic properties' ) ;
    public final void rule__RDC__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3000:1: ( ( 'Generic properties' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3001:1: ( 'Generic properties' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3001:1: ( 'Generic properties' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3002:1: 'Generic properties'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getGenericPropertiesKeyword_8_0()); 
            }
            match(input,75,FOLLOW_75_in_rule__RDC__Group_8__0__Impl6221); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getGenericPropertiesKeyword_8_0()); 
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
    // $ANTLR end "rule__RDC__Group_8__0__Impl"


    // $ANTLR start "rule__RDC__Group_8__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3015:1: rule__RDC__Group_8__1 : rule__RDC__Group_8__1__Impl rule__RDC__Group_8__2 ;
    public final void rule__RDC__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3019:1: ( rule__RDC__Group_8__1__Impl rule__RDC__Group_8__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3020:2: rule__RDC__Group_8__1__Impl rule__RDC__Group_8__2
            {
            pushFollow(FOLLOW_rule__RDC__Group_8__1__Impl_in_rule__RDC__Group_8__16252);
            rule__RDC__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group_8__2_in_rule__RDC__Group_8__16255);
            rule__RDC__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3027:1: rule__RDC__Group_8__1__Impl : ( '{' ) ;
    public final void rule__RDC__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3031:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3032:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3032:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3033:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_8_1()); 
            }
            match(input,61,FOLLOW_61_in_rule__RDC__Group_8__1__Impl6283); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_8_1()); 
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
    // $ANTLR end "rule__RDC__Group_8__1__Impl"


    // $ANTLR start "rule__RDC__Group_8__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3046:1: rule__RDC__Group_8__2 : rule__RDC__Group_8__2__Impl rule__RDC__Group_8__3 ;
    public final void rule__RDC__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3050:1: ( rule__RDC__Group_8__2__Impl rule__RDC__Group_8__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3051:2: rule__RDC__Group_8__2__Impl rule__RDC__Group_8__3
            {
            pushFollow(FOLLOW_rule__RDC__Group_8__2__Impl_in_rule__RDC__Group_8__26314);
            rule__RDC__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RDC__Group_8__3_in_rule__RDC__Group_8__26317);
            rule__RDC__Group_8__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3058:1: rule__RDC__Group_8__2__Impl : ( ( rule__RDC__MetricParametersAssignment_8_2 )* ) ;
    public final void rule__RDC__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3062:1: ( ( ( rule__RDC__MetricParametersAssignment_8_2 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3063:1: ( ( rule__RDC__MetricParametersAssignment_8_2 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3063:1: ( ( rule__RDC__MetricParametersAssignment_8_2 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3064:1: ( rule__RDC__MetricParametersAssignment_8_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getMetricParametersAssignment_8_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3065:1: ( rule__RDC__MetricParametersAssignment_8_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STRING) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3065:2: rule__RDC__MetricParametersAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__RDC__MetricParametersAssignment_8_2_in_rule__RDC__Group_8__2__Impl6344);
            	    rule__RDC__MetricParametersAssignment_8_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getMetricParametersAssignment_8_2()); 
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
    // $ANTLR end "rule__RDC__Group_8__2__Impl"


    // $ANTLR start "rule__RDC__Group_8__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3075:1: rule__RDC__Group_8__3 : rule__RDC__Group_8__3__Impl ;
    public final void rule__RDC__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3079:1: ( rule__RDC__Group_8__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3080:2: rule__RDC__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group_8__3__Impl_in_rule__RDC__Group_8__36375);
            rule__RDC__Group_8__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3086:1: rule__RDC__Group_8__3__Impl : ( '}' ) ;
    public final void rule__RDC__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3090:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3091:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3091:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3092:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_8_3()); 
            }
            match(input,65,FOLLOW_65_in_rule__RDC__Group_8__3__Impl6403); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_8_3()); 
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
    // $ANTLR end "rule__RDC__Group_8__3__Impl"


    // $ANTLR start "rule__Connector__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3113:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3117:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3118:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_rule__Connector__Group__0__Impl_in_rule__Connector__Group__06442);
            rule__Connector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Connector__Group__1_in_rule__Connector__Group__06445);
            rule__Connector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3125:1: rule__Connector__Group__0__Impl : ( 'Connector' ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3129:1: ( ( 'Connector' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3130:1: ( 'Connector' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3130:1: ( 'Connector' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3131:1: 'Connector'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__Connector__Group__0__Impl6473); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 
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
    // $ANTLR end "rule__Connector__Group__0__Impl"


    // $ANTLR start "rule__Connector__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3144:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3148:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3149:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_rule__Connector__Group__1__Impl_in_rule__Connector__Group__16504);
            rule__Connector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Connector__Group__2_in_rule__Connector__Group__16507);
            rule__Connector__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3156:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__NameAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3160:1: ( ( ( rule__Connector__NameAssignment_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3161:1: ( ( rule__Connector__NameAssignment_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3161:1: ( ( rule__Connector__NameAssignment_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3162:1: ( rule__Connector__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getNameAssignment_1()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3163:1: ( rule__Connector__NameAssignment_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3163:2: rule__Connector__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Connector__NameAssignment_1_in_rule__Connector__Group__1__Impl6534);
            rule__Connector__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Connector__Group__1__Impl"


    // $ANTLR start "rule__Connector__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3173:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3177:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3178:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_rule__Connector__Group__2__Impl_in_rule__Connector__Group__26564);
            rule__Connector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Connector__Group__3_in_rule__Connector__Group__26567);
            rule__Connector__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3185:1: rule__Connector__Group__2__Impl : ( '{' ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3189:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3190:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3190:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3191:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,61,FOLLOW_61_in_rule__Connector__Group__2__Impl6595); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Connector__Group__2__Impl"


    // $ANTLR start "rule__Connector__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3204:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3208:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3209:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
            {
            pushFollow(FOLLOW_rule__Connector__Group__3__Impl_in_rule__Connector__Group__36626);
            rule__Connector__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Connector__Group__4_in_rule__Connector__Group__36629);
            rule__Connector__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3216:1: rule__Connector__Group__3__Impl : ( ( rule__Connector__AvailableEqInterfacesAssignment_3 )* ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3220:1: ( ( ( rule__Connector__AvailableEqInterfacesAssignment_3 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3221:1: ( ( rule__Connector__AvailableEqInterfacesAssignment_3 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3221:1: ( ( rule__Connector__AvailableEqInterfacesAssignment_3 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3222:1: ( rule__Connector__AvailableEqInterfacesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getAvailableEqInterfacesAssignment_3()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3223:1: ( rule__Connector__AvailableEqInterfacesAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_INT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3223:2: rule__Connector__AvailableEqInterfacesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Connector__AvailableEqInterfacesAssignment_3_in_rule__Connector__Group__3__Impl6656);
            	    rule__Connector__AvailableEqInterfacesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getAvailableEqInterfacesAssignment_3()); 
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
    // $ANTLR end "rule__Connector__Group__3__Impl"


    // $ANTLR start "rule__Connector__Group__4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3233:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3237:1: ( rule__Connector__Group__4__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3238:2: rule__Connector__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Connector__Group__4__Impl_in_rule__Connector__Group__46687);
            rule__Connector__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3244:1: rule__Connector__Group__4__Impl : ( '}' ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3248:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3249:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3249:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3250:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,65,FOLLOW_65_in_rule__Connector__Group__4__Impl6715); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__Connector__Group__4__Impl"


    // $ANTLR start "rule__AvailableEqInterface__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3273:1: rule__AvailableEqInterface__Group__0 : rule__AvailableEqInterface__Group__0__Impl rule__AvailableEqInterface__Group__1 ;
    public final void rule__AvailableEqInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3277:1: ( rule__AvailableEqInterface__Group__0__Impl rule__AvailableEqInterface__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3278:2: rule__AvailableEqInterface__Group__0__Impl rule__AvailableEqInterface__Group__1
            {
            pushFollow(FOLLOW_rule__AvailableEqInterface__Group__0__Impl_in_rule__AvailableEqInterface__Group__06756);
            rule__AvailableEqInterface__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AvailableEqInterface__Group__1_in_rule__AvailableEqInterface__Group__06759);
            rule__AvailableEqInterface__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3285:1: rule__AvailableEqInterface__Group__0__Impl : ( ( rule__AvailableEqInterface__CountAssignment_0 ) ) ;
    public final void rule__AvailableEqInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3289:1: ( ( ( rule__AvailableEqInterface__CountAssignment_0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3290:1: ( ( rule__AvailableEqInterface__CountAssignment_0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3290:1: ( ( rule__AvailableEqInterface__CountAssignment_0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3291:1: ( rule__AvailableEqInterface__CountAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvailableEqInterfaceAccess().getCountAssignment_0()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3292:1: ( rule__AvailableEqInterface__CountAssignment_0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3292:2: rule__AvailableEqInterface__CountAssignment_0
            {
            pushFollow(FOLLOW_rule__AvailableEqInterface__CountAssignment_0_in_rule__AvailableEqInterface__Group__0__Impl6786);
            rule__AvailableEqInterface__CountAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvailableEqInterfaceAccess().getCountAssignment_0()); 
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
    // $ANTLR end "rule__AvailableEqInterface__Group__0__Impl"


    // $ANTLR start "rule__AvailableEqInterface__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3302:1: rule__AvailableEqInterface__Group__1 : rule__AvailableEqInterface__Group__1__Impl rule__AvailableEqInterface__Group__2 ;
    public final void rule__AvailableEqInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3306:1: ( rule__AvailableEqInterface__Group__1__Impl rule__AvailableEqInterface__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3307:2: rule__AvailableEqInterface__Group__1__Impl rule__AvailableEqInterface__Group__2
            {
            pushFollow(FOLLOW_rule__AvailableEqInterface__Group__1__Impl_in_rule__AvailableEqInterface__Group__16816);
            rule__AvailableEqInterface__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AvailableEqInterface__Group__2_in_rule__AvailableEqInterface__Group__16819);
            rule__AvailableEqInterface__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3314:1: rule__AvailableEqInterface__Group__1__Impl : ( 'interface with type' ) ;
    public final void rule__AvailableEqInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3318:1: ( ( 'interface with type' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3319:1: ( 'interface with type' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3319:1: ( 'interface with type' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3320:1: 'interface with type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvailableEqInterfaceAccess().getInterfaceWithTypeKeyword_1()); 
            }
            match(input,76,FOLLOW_76_in_rule__AvailableEqInterface__Group__1__Impl6847); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvailableEqInterfaceAccess().getInterfaceWithTypeKeyword_1()); 
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
    // $ANTLR end "rule__AvailableEqInterface__Group__1__Impl"


    // $ANTLR start "rule__AvailableEqInterface__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3333:1: rule__AvailableEqInterface__Group__2 : rule__AvailableEqInterface__Group__2__Impl rule__AvailableEqInterface__Group__3 ;
    public final void rule__AvailableEqInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3337:1: ( rule__AvailableEqInterface__Group__2__Impl rule__AvailableEqInterface__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3338:2: rule__AvailableEqInterface__Group__2__Impl rule__AvailableEqInterface__Group__3
            {
            pushFollow(FOLLOW_rule__AvailableEqInterface__Group__2__Impl_in_rule__AvailableEqInterface__Group__26878);
            rule__AvailableEqInterface__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AvailableEqInterface__Group__3_in_rule__AvailableEqInterface__Group__26881);
            rule__AvailableEqInterface__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3345:1: rule__AvailableEqInterface__Group__2__Impl : ( ( rule__AvailableEqInterface__EqInterfaceTypeAssignment_2 ) ) ;
    public final void rule__AvailableEqInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3349:1: ( ( ( rule__AvailableEqInterface__EqInterfaceTypeAssignment_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3350:1: ( ( rule__AvailableEqInterface__EqInterfaceTypeAssignment_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3350:1: ( ( rule__AvailableEqInterface__EqInterfaceTypeAssignment_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3351:1: ( rule__AvailableEqInterface__EqInterfaceTypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvailableEqInterfaceAccess().getEqInterfaceTypeAssignment_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3352:1: ( rule__AvailableEqInterface__EqInterfaceTypeAssignment_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3352:2: rule__AvailableEqInterface__EqInterfaceTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__AvailableEqInterface__EqInterfaceTypeAssignment_2_in_rule__AvailableEqInterface__Group__2__Impl6908);
            rule__AvailableEqInterface__EqInterfaceTypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvailableEqInterfaceAccess().getEqInterfaceTypeAssignment_2()); 
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
    // $ANTLR end "rule__AvailableEqInterface__Group__2__Impl"


    // $ANTLR start "rule__AvailableEqInterface__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3362:1: rule__AvailableEqInterface__Group__3 : rule__AvailableEqInterface__Group__3__Impl ;
    public final void rule__AvailableEqInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3366:1: ( rule__AvailableEqInterface__Group__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3367:2: rule__AvailableEqInterface__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AvailableEqInterface__Group__3__Impl_in_rule__AvailableEqInterface__Group__36938);
            rule__AvailableEqInterface__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3373:1: rule__AvailableEqInterface__Group__3__Impl : ( ';' ) ;
    public final void rule__AvailableEqInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3377:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3378:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3378:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3379:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvailableEqInterfaceAccess().getSemicolonKeyword_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__AvailableEqInterface__Group__3__Impl6966); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvailableEqInterfaceAccess().getSemicolonKeyword_3()); 
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
    // $ANTLR end "rule__AvailableEqInterface__Group__3__Impl"


    // $ANTLR start "rule__EqInterfaceGroup__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3400:1: rule__EqInterfaceGroup__Group__0 : rule__EqInterfaceGroup__Group__0__Impl rule__EqInterfaceGroup__Group__1 ;
    public final void rule__EqInterfaceGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3404:1: ( rule__EqInterfaceGroup__Group__0__Impl rule__EqInterfaceGroup__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3405:2: rule__EqInterfaceGroup__Group__0__Impl rule__EqInterfaceGroup__Group__1
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__0__Impl_in_rule__EqInterfaceGroup__Group__07005);
            rule__EqInterfaceGroup__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__1_in_rule__EqInterfaceGroup__Group__07008);
            rule__EqInterfaceGroup__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3412:1: rule__EqInterfaceGroup__Group__0__Impl : ( 'Group' ) ;
    public final void rule__EqInterfaceGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3416:1: ( ( 'Group' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3417:1: ( 'Group' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3417:1: ( 'Group' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3418:1: 'Group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceGroupAccess().getGroupKeyword_0()); 
            }
            match(input,77,FOLLOW_77_in_rule__EqInterfaceGroup__Group__0__Impl7036); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceGroupAccess().getGroupKeyword_0()); 
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
    // $ANTLR end "rule__EqInterfaceGroup__Group__0__Impl"


    // $ANTLR start "rule__EqInterfaceGroup__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3431:1: rule__EqInterfaceGroup__Group__1 : rule__EqInterfaceGroup__Group__1__Impl rule__EqInterfaceGroup__Group__2 ;
    public final void rule__EqInterfaceGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3435:1: ( rule__EqInterfaceGroup__Group__1__Impl rule__EqInterfaceGroup__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3436:2: rule__EqInterfaceGroup__Group__1__Impl rule__EqInterfaceGroup__Group__2
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__1__Impl_in_rule__EqInterfaceGroup__Group__17067);
            rule__EqInterfaceGroup__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__2_in_rule__EqInterfaceGroup__Group__17070);
            rule__EqInterfaceGroup__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3443:1: rule__EqInterfaceGroup__Group__1__Impl : ( ( rule__EqInterfaceGroup__NameAssignment_1 ) ) ;
    public final void rule__EqInterfaceGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3447:1: ( ( ( rule__EqInterfaceGroup__NameAssignment_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3448:1: ( ( rule__EqInterfaceGroup__NameAssignment_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3448:1: ( ( rule__EqInterfaceGroup__NameAssignment_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3449:1: ( rule__EqInterfaceGroup__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceGroupAccess().getNameAssignment_1()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3450:1: ( rule__EqInterfaceGroup__NameAssignment_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3450:2: rule__EqInterfaceGroup__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__NameAssignment_1_in_rule__EqInterfaceGroup__Group__1__Impl7097);
            rule__EqInterfaceGroup__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceGroupAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__EqInterfaceGroup__Group__1__Impl"


    // $ANTLR start "rule__EqInterfaceGroup__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3460:1: rule__EqInterfaceGroup__Group__2 : rule__EqInterfaceGroup__Group__2__Impl rule__EqInterfaceGroup__Group__3 ;
    public final void rule__EqInterfaceGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3464:1: ( rule__EqInterfaceGroup__Group__2__Impl rule__EqInterfaceGroup__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3465:2: rule__EqInterfaceGroup__Group__2__Impl rule__EqInterfaceGroup__Group__3
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__2__Impl_in_rule__EqInterfaceGroup__Group__27127);
            rule__EqInterfaceGroup__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__3_in_rule__EqInterfaceGroup__Group__27130);
            rule__EqInterfaceGroup__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3472:1: rule__EqInterfaceGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__EqInterfaceGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3476:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3477:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3477:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3478:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceGroupAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,61,FOLLOW_61_in_rule__EqInterfaceGroup__Group__2__Impl7158); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceGroupAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__EqInterfaceGroup__Group__2__Impl"


    // $ANTLR start "rule__EqInterfaceGroup__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3491:1: rule__EqInterfaceGroup__Group__3 : rule__EqInterfaceGroup__Group__3__Impl rule__EqInterfaceGroup__Group__4 ;
    public final void rule__EqInterfaceGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3495:1: ( rule__EqInterfaceGroup__Group__3__Impl rule__EqInterfaceGroup__Group__4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3496:2: rule__EqInterfaceGroup__Group__3__Impl rule__EqInterfaceGroup__Group__4
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__3__Impl_in_rule__EqInterfaceGroup__Group__37189);
            rule__EqInterfaceGroup__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__4_in_rule__EqInterfaceGroup__Group__37192);
            rule__EqInterfaceGroup__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3503:1: rule__EqInterfaceGroup__Group__3__Impl : ( ( rule__EqInterfaceGroup__EqInterfacesAssignment_3 ) ) ;
    public final void rule__EqInterfaceGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3507:1: ( ( ( rule__EqInterfaceGroup__EqInterfacesAssignment_3 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3508:1: ( ( rule__EqInterfaceGroup__EqInterfacesAssignment_3 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3508:1: ( ( rule__EqInterfaceGroup__EqInterfacesAssignment_3 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3509:1: ( rule__EqInterfaceGroup__EqInterfacesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesAssignment_3()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3510:1: ( rule__EqInterfaceGroup__EqInterfacesAssignment_3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3510:2: rule__EqInterfaceGroup__EqInterfacesAssignment_3
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__EqInterfacesAssignment_3_in_rule__EqInterfaceGroup__Group__3__Impl7219);
            rule__EqInterfaceGroup__EqInterfacesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesAssignment_3()); 
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
    // $ANTLR end "rule__EqInterfaceGroup__Group__3__Impl"


    // $ANTLR start "rule__EqInterfaceGroup__Group__4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3520:1: rule__EqInterfaceGroup__Group__4 : rule__EqInterfaceGroup__Group__4__Impl rule__EqInterfaceGroup__Group__5 ;
    public final void rule__EqInterfaceGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3524:1: ( rule__EqInterfaceGroup__Group__4__Impl rule__EqInterfaceGroup__Group__5 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3525:2: rule__EqInterfaceGroup__Group__4__Impl rule__EqInterfaceGroup__Group__5
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__4__Impl_in_rule__EqInterfaceGroup__Group__47249);
            rule__EqInterfaceGroup__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__5_in_rule__EqInterfaceGroup__Group__47252);
            rule__EqInterfaceGroup__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3532:1: rule__EqInterfaceGroup__Group__4__Impl : ( ( ( rule__EqInterfaceGroup__Group_4__0 ) ) ( ( rule__EqInterfaceGroup__Group_4__0 )* ) ) ;
    public final void rule__EqInterfaceGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3536:1: ( ( ( ( rule__EqInterfaceGroup__Group_4__0 ) ) ( ( rule__EqInterfaceGroup__Group_4__0 )* ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3537:1: ( ( ( rule__EqInterfaceGroup__Group_4__0 ) ) ( ( rule__EqInterfaceGroup__Group_4__0 )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3537:1: ( ( ( rule__EqInterfaceGroup__Group_4__0 ) ) ( ( rule__EqInterfaceGroup__Group_4__0 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3538:1: ( ( rule__EqInterfaceGroup__Group_4__0 ) ) ( ( rule__EqInterfaceGroup__Group_4__0 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3538:1: ( ( rule__EqInterfaceGroup__Group_4__0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3539:1: ( rule__EqInterfaceGroup__Group_4__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceGroupAccess().getGroup_4()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3540:1: ( rule__EqInterfaceGroup__Group_4__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3540:2: rule__EqInterfaceGroup__Group_4__0
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group_4__0_in_rule__EqInterfaceGroup__Group__4__Impl7281);
            rule__EqInterfaceGroup__Group_4__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceGroupAccess().getGroup_4()); 
            }

            }

            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3543:1: ( ( rule__EqInterfaceGroup__Group_4__0 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3544:1: ( rule__EqInterfaceGroup__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceGroupAccess().getGroup_4()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3545:1: ( rule__EqInterfaceGroup__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==78) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3545:2: rule__EqInterfaceGroup__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EqInterfaceGroup__Group_4__0_in_rule__EqInterfaceGroup__Group__4__Impl7293);
            	    rule__EqInterfaceGroup__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceGroupAccess().getGroup_4()); 
            }

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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3556:1: rule__EqInterfaceGroup__Group__5 : rule__EqInterfaceGroup__Group__5__Impl ;
    public final void rule__EqInterfaceGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3560:1: ( rule__EqInterfaceGroup__Group__5__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3561:2: rule__EqInterfaceGroup__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group__5__Impl_in_rule__EqInterfaceGroup__Group__57326);
            rule__EqInterfaceGroup__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3567:1: rule__EqInterfaceGroup__Group__5__Impl : ( '}' ) ;
    public final void rule__EqInterfaceGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3571:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3572:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3572:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3573:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceGroupAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,65,FOLLOW_65_in_rule__EqInterfaceGroup__Group__5__Impl7354); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceGroupAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__EqInterfaceGroup__Group__5__Impl"


    // $ANTLR start "rule__EqInterfaceGroup__Group_4__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3598:1: rule__EqInterfaceGroup__Group_4__0 : rule__EqInterfaceGroup__Group_4__0__Impl rule__EqInterfaceGroup__Group_4__1 ;
    public final void rule__EqInterfaceGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3602:1: ( rule__EqInterfaceGroup__Group_4__0__Impl rule__EqInterfaceGroup__Group_4__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3603:2: rule__EqInterfaceGroup__Group_4__0__Impl rule__EqInterfaceGroup__Group_4__1
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group_4__0__Impl_in_rule__EqInterfaceGroup__Group_4__07397);
            rule__EqInterfaceGroup__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group_4__1_in_rule__EqInterfaceGroup__Group_4__07400);
            rule__EqInterfaceGroup__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3610:1: rule__EqInterfaceGroup__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EqInterfaceGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3614:1: ( ( ',' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3615:1: ( ',' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3615:1: ( ',' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3616:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceGroupAccess().getCommaKeyword_4_0()); 
            }
            match(input,78,FOLLOW_78_in_rule__EqInterfaceGroup__Group_4__0__Impl7428); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceGroupAccess().getCommaKeyword_4_0()); 
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
    // $ANTLR end "rule__EqInterfaceGroup__Group_4__0__Impl"


    // $ANTLR start "rule__EqInterfaceGroup__Group_4__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3629:1: rule__EqInterfaceGroup__Group_4__1 : rule__EqInterfaceGroup__Group_4__1__Impl ;
    public final void rule__EqInterfaceGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3633:1: ( rule__EqInterfaceGroup__Group_4__1__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3634:2: rule__EqInterfaceGroup__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__Group_4__1__Impl_in_rule__EqInterfaceGroup__Group_4__17459);
            rule__EqInterfaceGroup__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3640:1: rule__EqInterfaceGroup__Group_4__1__Impl : ( ( rule__EqInterfaceGroup__EqInterfacesAssignment_4_1 ) ) ;
    public final void rule__EqInterfaceGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3644:1: ( ( ( rule__EqInterfaceGroup__EqInterfacesAssignment_4_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3645:1: ( ( rule__EqInterfaceGroup__EqInterfacesAssignment_4_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3645:1: ( ( rule__EqInterfaceGroup__EqInterfacesAssignment_4_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3646:1: ( rule__EqInterfaceGroup__EqInterfacesAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesAssignment_4_1()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3647:1: ( rule__EqInterfaceGroup__EqInterfacesAssignment_4_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3647:2: rule__EqInterfaceGroup__EqInterfacesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__EqInterfaceGroup__EqInterfacesAssignment_4_1_in_rule__EqInterfaceGroup__Group_4__1__Impl7486);
            rule__EqInterfaceGroup__EqInterfacesAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesAssignment_4_1()); 
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
    // $ANTLR end "rule__EqInterfaceGroup__Group_4__1__Impl"


    // $ANTLR start "rule__EqInterface__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3661:1: rule__EqInterface__Group__0 : rule__EqInterface__Group__0__Impl rule__EqInterface__Group__1 ;
    public final void rule__EqInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3665:1: ( rule__EqInterface__Group__0__Impl rule__EqInterface__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3666:2: rule__EqInterface__Group__0__Impl rule__EqInterface__Group__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__0__Impl_in_rule__EqInterface__Group__07520);
            rule__EqInterface__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group__1_in_rule__EqInterface__Group__07523);
            rule__EqInterface__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3673:1: rule__EqInterface__Group__0__Impl : ( 'Interface' ) ;
    public final void rule__EqInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3677:1: ( ( 'Interface' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3678:1: ( 'Interface' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3678:1: ( 'Interface' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3679:1: 'Interface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getInterfaceKeyword_0()); 
            }
            match(input,79,FOLLOW_79_in_rule__EqInterface__Group__0__Impl7551); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getInterfaceKeyword_0()); 
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
    // $ANTLR end "rule__EqInterface__Group__0__Impl"


    // $ANTLR start "rule__EqInterface__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3692:1: rule__EqInterface__Group__1 : rule__EqInterface__Group__1__Impl rule__EqInterface__Group__2 ;
    public final void rule__EqInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3696:1: ( rule__EqInterface__Group__1__Impl rule__EqInterface__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3697:2: rule__EqInterface__Group__1__Impl rule__EqInterface__Group__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__1__Impl_in_rule__EqInterface__Group__17582);
            rule__EqInterface__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group__2_in_rule__EqInterface__Group__17585);
            rule__EqInterface__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3704:1: rule__EqInterface__Group__1__Impl : ( ( rule__EqInterface__NameAssignment_1 ) ) ;
    public final void rule__EqInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3708:1: ( ( ( rule__EqInterface__NameAssignment_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3709:1: ( ( rule__EqInterface__NameAssignment_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3709:1: ( ( rule__EqInterface__NameAssignment_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3710:1: ( rule__EqInterface__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getNameAssignment_1()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3711:1: ( rule__EqInterface__NameAssignment_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3711:2: rule__EqInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EqInterface__NameAssignment_1_in_rule__EqInterface__Group__1__Impl7612);
            rule__EqInterface__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__EqInterface__Group__1__Impl"


    // $ANTLR start "rule__EqInterface__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3721:1: rule__EqInterface__Group__2 : rule__EqInterface__Group__2__Impl rule__EqInterface__Group__3 ;
    public final void rule__EqInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3725:1: ( rule__EqInterface__Group__2__Impl rule__EqInterface__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3726:2: rule__EqInterface__Group__2__Impl rule__EqInterface__Group__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__2__Impl_in_rule__EqInterface__Group__27642);
            rule__EqInterface__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group__3_in_rule__EqInterface__Group__27645);
            rule__EqInterface__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3733:1: rule__EqInterface__Group__2__Impl : ( '{' ) ;
    public final void rule__EqInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3737:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3738:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3738:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3739:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,61,FOLLOW_61_in_rule__EqInterface__Group__2__Impl7673); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__EqInterface__Group__2__Impl"


    // $ANTLR start "rule__EqInterface__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3752:1: rule__EqInterface__Group__3 : rule__EqInterface__Group__3__Impl rule__EqInterface__Group__4 ;
    public final void rule__EqInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3756:1: ( rule__EqInterface__Group__3__Impl rule__EqInterface__Group__4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3757:2: rule__EqInterface__Group__3__Impl rule__EqInterface__Group__4
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__3__Impl_in_rule__EqInterface__Group__37704);
            rule__EqInterface__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group__4_in_rule__EqInterface__Group__37707);
            rule__EqInterface__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3764:1: rule__EqInterface__Group__3__Impl : ( ( rule__EqInterface__Group_3__0 )? ) ;
    public final void rule__EqInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3768:1: ( ( ( rule__EqInterface__Group_3__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3769:1: ( ( rule__EqInterface__Group_3__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3769:1: ( ( rule__EqInterface__Group_3__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3770:1: ( rule__EqInterface__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getGroup_3()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3771:1: ( rule__EqInterface__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==80) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3771:2: rule__EqInterface__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_3__0_in_rule__EqInterface__Group__3__Impl7734);
                    rule__EqInterface__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getGroup_3()); 
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
    // $ANTLR end "rule__EqInterface__Group__3__Impl"


    // $ANTLR start "rule__EqInterface__Group__4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3781:1: rule__EqInterface__Group__4 : rule__EqInterface__Group__4__Impl rule__EqInterface__Group__5 ;
    public final void rule__EqInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3785:1: ( rule__EqInterface__Group__4__Impl rule__EqInterface__Group__5 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3786:2: rule__EqInterface__Group__4__Impl rule__EqInterface__Group__5
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__4__Impl_in_rule__EqInterface__Group__47765);
            rule__EqInterface__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group__5_in_rule__EqInterface__Group__47768);
            rule__EqInterface__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3793:1: rule__EqInterface__Group__4__Impl : ( ( rule__EqInterface__Group_4__0 )? ) ;
    public final void rule__EqInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3797:1: ( ( ( rule__EqInterface__Group_4__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3798:1: ( ( rule__EqInterface__Group_4__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3798:1: ( ( rule__EqInterface__Group_4__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3799:1: ( rule__EqInterface__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getGroup_4()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3800:1: ( rule__EqInterface__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==81) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3800:2: rule__EqInterface__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_4__0_in_rule__EqInterface__Group__4__Impl7795);
                    rule__EqInterface__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getGroup_4()); 
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
    // $ANTLR end "rule__EqInterface__Group__4__Impl"


    // $ANTLR start "rule__EqInterface__Group__5"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3810:1: rule__EqInterface__Group__5 : rule__EqInterface__Group__5__Impl rule__EqInterface__Group__6 ;
    public final void rule__EqInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3814:1: ( rule__EqInterface__Group__5__Impl rule__EqInterface__Group__6 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3815:2: rule__EqInterface__Group__5__Impl rule__EqInterface__Group__6
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__5__Impl_in_rule__EqInterface__Group__57826);
            rule__EqInterface__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group__6_in_rule__EqInterface__Group__57829);
            rule__EqInterface__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3822:1: rule__EqInterface__Group__5__Impl : ( ( rule__EqInterface__Group_5__0 )? ) ;
    public final void rule__EqInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3826:1: ( ( ( rule__EqInterface__Group_5__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3827:1: ( ( rule__EqInterface__Group_5__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3827:1: ( ( rule__EqInterface__Group_5__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3828:1: ( rule__EqInterface__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getGroup_5()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3829:1: ( rule__EqInterface__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==82) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3829:2: rule__EqInterface__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_5__0_in_rule__EqInterface__Group__5__Impl7856);
                    rule__EqInterface__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getGroup_5()); 
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
    // $ANTLR end "rule__EqInterface__Group__5__Impl"


    // $ANTLR start "rule__EqInterface__Group__6"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3839:1: rule__EqInterface__Group__6 : rule__EqInterface__Group__6__Impl rule__EqInterface__Group__7 ;
    public final void rule__EqInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3843:1: ( rule__EqInterface__Group__6__Impl rule__EqInterface__Group__7 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3844:2: rule__EqInterface__Group__6__Impl rule__EqInterface__Group__7
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__6__Impl_in_rule__EqInterface__Group__67887);
            rule__EqInterface__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group__7_in_rule__EqInterface__Group__67890);
            rule__EqInterface__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3851:1: rule__EqInterface__Group__6__Impl : ( ( rule__EqInterface__Group_6__0 )? ) ;
    public final void rule__EqInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3855:1: ( ( ( rule__EqInterface__Group_6__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3856:1: ( ( rule__EqInterface__Group_6__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3856:1: ( ( rule__EqInterface__Group_6__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3857:1: ( rule__EqInterface__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getGroup_6()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3858:1: ( rule__EqInterface__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==83) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3858:2: rule__EqInterface__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_6__0_in_rule__EqInterface__Group__6__Impl7917);
                    rule__EqInterface__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getGroup_6()); 
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
    // $ANTLR end "rule__EqInterface__Group__6__Impl"


    // $ANTLR start "rule__EqInterface__Group__7"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3868:1: rule__EqInterface__Group__7 : rule__EqInterface__Group__7__Impl rule__EqInterface__Group__8 ;
    public final void rule__EqInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3872:1: ( rule__EqInterface__Group__7__Impl rule__EqInterface__Group__8 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3873:2: rule__EqInterface__Group__7__Impl rule__EqInterface__Group__8
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__7__Impl_in_rule__EqInterface__Group__77948);
            rule__EqInterface__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group__8_in_rule__EqInterface__Group__77951);
            rule__EqInterface__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3880:1: rule__EqInterface__Group__7__Impl : ( ( rule__EqInterface__Group_7__0 )? ) ;
    public final void rule__EqInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3884:1: ( ( ( rule__EqInterface__Group_7__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3885:1: ( ( rule__EqInterface__Group_7__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3885:1: ( ( rule__EqInterface__Group_7__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3886:1: ( rule__EqInterface__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getGroup_7()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3887:1: ( rule__EqInterface__Group_7__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==84) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3887:2: rule__EqInterface__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_7__0_in_rule__EqInterface__Group__7__Impl7978);
                    rule__EqInterface__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getGroup_7()); 
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
    // $ANTLR end "rule__EqInterface__Group__7__Impl"


    // $ANTLR start "rule__EqInterface__Group__8"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3897:1: rule__EqInterface__Group__8 : rule__EqInterface__Group__8__Impl rule__EqInterface__Group__9 ;
    public final void rule__EqInterface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3901:1: ( rule__EqInterface__Group__8__Impl rule__EqInterface__Group__9 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3902:2: rule__EqInterface__Group__8__Impl rule__EqInterface__Group__9
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__8__Impl_in_rule__EqInterface__Group__88009);
            rule__EqInterface__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group__9_in_rule__EqInterface__Group__88012);
            rule__EqInterface__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3909:1: rule__EqInterface__Group__8__Impl : ( ( rule__EqInterface__Group_8__0 )? ) ;
    public final void rule__EqInterface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3913:1: ( ( ( rule__EqInterface__Group_8__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3914:1: ( ( rule__EqInterface__Group_8__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3914:1: ( ( rule__EqInterface__Group_8__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3915:1: ( rule__EqInterface__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getGroup_8()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3916:1: ( rule__EqInterface__Group_8__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==85) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3916:2: rule__EqInterface__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_8__0_in_rule__EqInterface__Group__8__Impl8039);
                    rule__EqInterface__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getGroup_8()); 
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
    // $ANTLR end "rule__EqInterface__Group__8__Impl"


    // $ANTLR start "rule__EqInterface__Group__9"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3926:1: rule__EqInterface__Group__9 : rule__EqInterface__Group__9__Impl rule__EqInterface__Group__10 ;
    public final void rule__EqInterface__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3930:1: ( rule__EqInterface__Group__9__Impl rule__EqInterface__Group__10 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3931:2: rule__EqInterface__Group__9__Impl rule__EqInterface__Group__10
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__9__Impl_in_rule__EqInterface__Group__98070);
            rule__EqInterface__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group__10_in_rule__EqInterface__Group__98073);
            rule__EqInterface__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3938:1: rule__EqInterface__Group__9__Impl : ( ( rule__EqInterface__Group_9__0 )? ) ;
    public final void rule__EqInterface__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3942:1: ( ( ( rule__EqInterface__Group_9__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3943:1: ( ( rule__EqInterface__Group_9__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3943:1: ( ( rule__EqInterface__Group_9__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3944:1: ( rule__EqInterface__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getGroup_9()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3945:1: ( rule__EqInterface__Group_9__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==86) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3945:2: rule__EqInterface__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_9__0_in_rule__EqInterface__Group__9__Impl8100);
                    rule__EqInterface__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getGroup_9()); 
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
    // $ANTLR end "rule__EqInterface__Group__9__Impl"


    // $ANTLR start "rule__EqInterface__Group__10"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3955:1: rule__EqInterface__Group__10 : rule__EqInterface__Group__10__Impl rule__EqInterface__Group__11 ;
    public final void rule__EqInterface__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3959:1: ( rule__EqInterface__Group__10__Impl rule__EqInterface__Group__11 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3960:2: rule__EqInterface__Group__10__Impl rule__EqInterface__Group__11
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__10__Impl_in_rule__EqInterface__Group__108131);
            rule__EqInterface__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group__11_in_rule__EqInterface__Group__108134);
            rule__EqInterface__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3967:1: rule__EqInterface__Group__10__Impl : ( ( rule__EqInterface__Group_10__0 )? ) ;
    public final void rule__EqInterface__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3971:1: ( ( ( rule__EqInterface__Group_10__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3972:1: ( ( rule__EqInterface__Group_10__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3972:1: ( ( rule__EqInterface__Group_10__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3973:1: ( rule__EqInterface__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getGroup_10()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3974:1: ( rule__EqInterface__Group_10__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==87) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3974:2: rule__EqInterface__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_10__0_in_rule__EqInterface__Group__10__Impl8161);
                    rule__EqInterface__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getGroup_10()); 
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
    // $ANTLR end "rule__EqInterface__Group__10__Impl"


    // $ANTLR start "rule__EqInterface__Group__11"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3984:1: rule__EqInterface__Group__11 : rule__EqInterface__Group__11__Impl rule__EqInterface__Group__12 ;
    public final void rule__EqInterface__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3988:1: ( rule__EqInterface__Group__11__Impl rule__EqInterface__Group__12 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3989:2: rule__EqInterface__Group__11__Impl rule__EqInterface__Group__12
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__11__Impl_in_rule__EqInterface__Group__118192);
            rule__EqInterface__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group__12_in_rule__EqInterface__Group__118195);
            rule__EqInterface__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3996:1: rule__EqInterface__Group__11__Impl : ( ( rule__EqInterface__Group_11__0 )? ) ;
    public final void rule__EqInterface__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4000:1: ( ( ( rule__EqInterface__Group_11__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4001:1: ( ( rule__EqInterface__Group_11__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4001:1: ( ( rule__EqInterface__Group_11__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4002:1: ( rule__EqInterface__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getGroup_11()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4003:1: ( rule__EqInterface__Group_11__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==88) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4003:2: rule__EqInterface__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_11__0_in_rule__EqInterface__Group__11__Impl8222);
                    rule__EqInterface__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getGroup_11()); 
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
    // $ANTLR end "rule__EqInterface__Group__11__Impl"


    // $ANTLR start "rule__EqInterface__Group__12"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4013:1: rule__EqInterface__Group__12 : rule__EqInterface__Group__12__Impl rule__EqInterface__Group__13 ;
    public final void rule__EqInterface__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4017:1: ( rule__EqInterface__Group__12__Impl rule__EqInterface__Group__13 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4018:2: rule__EqInterface__Group__12__Impl rule__EqInterface__Group__13
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__12__Impl_in_rule__EqInterface__Group__128253);
            rule__EqInterface__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group__13_in_rule__EqInterface__Group__128256);
            rule__EqInterface__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4025:1: rule__EqInterface__Group__12__Impl : ( ( rule__EqInterface__Group_12__0 )? ) ;
    public final void rule__EqInterface__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4029:1: ( ( ( rule__EqInterface__Group_12__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4030:1: ( ( rule__EqInterface__Group_12__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4030:1: ( ( rule__EqInterface__Group_12__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4031:1: ( rule__EqInterface__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getGroup_12()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4032:1: ( rule__EqInterface__Group_12__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==73) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4032:2: rule__EqInterface__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_12__0_in_rule__EqInterface__Group__12__Impl8283);
                    rule__EqInterface__Group_12__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getGroup_12()); 
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
    // $ANTLR end "rule__EqInterface__Group__12__Impl"


    // $ANTLR start "rule__EqInterface__Group__13"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4042:1: rule__EqInterface__Group__13 : rule__EqInterface__Group__13__Impl rule__EqInterface__Group__14 ;
    public final void rule__EqInterface__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4046:1: ( rule__EqInterface__Group__13__Impl rule__EqInterface__Group__14 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4047:2: rule__EqInterface__Group__13__Impl rule__EqInterface__Group__14
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__13__Impl_in_rule__EqInterface__Group__138314);
            rule__EqInterface__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group__14_in_rule__EqInterface__Group__138317);
            rule__EqInterface__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4054:1: rule__EqInterface__Group__13__Impl : ( ( rule__EqInterface__Group_13__0 )? ) ;
    public final void rule__EqInterface__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4058:1: ( ( ( rule__EqInterface__Group_13__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4059:1: ( ( rule__EqInterface__Group_13__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4059:1: ( ( rule__EqInterface__Group_13__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4060:1: ( rule__EqInterface__Group_13__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getGroup_13()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4061:1: ( rule__EqInterface__Group_13__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==75) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4061:2: rule__EqInterface__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__EqInterface__Group_13__0_in_rule__EqInterface__Group__13__Impl8344);
                    rule__EqInterface__Group_13__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getGroup_13()); 
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
    // $ANTLR end "rule__EqInterface__Group__13__Impl"


    // $ANTLR start "rule__EqInterface__Group__14"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4071:1: rule__EqInterface__Group__14 : rule__EqInterface__Group__14__Impl ;
    public final void rule__EqInterface__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4075:1: ( rule__EqInterface__Group__14__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4076:2: rule__EqInterface__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group__14__Impl_in_rule__EqInterface__Group__148375);
            rule__EqInterface__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4082:1: rule__EqInterface__Group__14__Impl : ( '}' ) ;
    public final void rule__EqInterface__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4086:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4087:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4087:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4088:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getRightCurlyBracketKeyword_14()); 
            }
            match(input,65,FOLLOW_65_in_rule__EqInterface__Group__14__Impl8403); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getRightCurlyBracketKeyword_14()); 
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
    // $ANTLR end "rule__EqInterface__Group__14__Impl"


    // $ANTLR start "rule__EqInterface__Group_3__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4131:1: rule__EqInterface__Group_3__0 : rule__EqInterface__Group_3__0__Impl rule__EqInterface__Group_3__1 ;
    public final void rule__EqInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4135:1: ( rule__EqInterface__Group_3__0__Impl rule__EqInterface__Group_3__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4136:2: rule__EqInterface__Group_3__0__Impl rule__EqInterface__Group_3__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_3__0__Impl_in_rule__EqInterface__Group_3__08464);
            rule__EqInterface__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_3__1_in_rule__EqInterface__Group_3__08467);
            rule__EqInterface__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4143:1: rule__EqInterface__Group_3__0__Impl : ( 'InterfaceSystem' ) ;
    public final void rule__EqInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4147:1: ( ( 'InterfaceSystem' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4148:1: ( 'InterfaceSystem' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4148:1: ( 'InterfaceSystem' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4149:1: 'InterfaceSystem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getInterfaceSystemKeyword_3_0()); 
            }
            match(input,80,FOLLOW_80_in_rule__EqInterface__Group_3__0__Impl8495); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getInterfaceSystemKeyword_3_0()); 
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
    // $ANTLR end "rule__EqInterface__Group_3__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_3__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4162:1: rule__EqInterface__Group_3__1 : rule__EqInterface__Group_3__1__Impl rule__EqInterface__Group_3__2 ;
    public final void rule__EqInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4166:1: ( rule__EqInterface__Group_3__1__Impl rule__EqInterface__Group_3__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4167:2: rule__EqInterface__Group_3__1__Impl rule__EqInterface__Group_3__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_3__1__Impl_in_rule__EqInterface__Group_3__18526);
            rule__EqInterface__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_3__2_in_rule__EqInterface__Group_3__18529);
            rule__EqInterface__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4174:1: rule__EqInterface__Group_3__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4178:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4179:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4179:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4180:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__EqInterface__Group_3__1__Impl8557); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_3_1()); 
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
    // $ANTLR end "rule__EqInterface__Group_3__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_3__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4193:1: rule__EqInterface__Group_3__2 : rule__EqInterface__Group_3__2__Impl rule__EqInterface__Group_3__3 ;
    public final void rule__EqInterface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4197:1: ( rule__EqInterface__Group_3__2__Impl rule__EqInterface__Group_3__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4198:2: rule__EqInterface__Group_3__2__Impl rule__EqInterface__Group_3__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_3__2__Impl_in_rule__EqInterface__Group_3__28588);
            rule__EqInterface__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_3__3_in_rule__EqInterface__Group_3__28591);
            rule__EqInterface__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4205:1: rule__EqInterface__Group_3__2__Impl : ( ( rule__EqInterface__SystemAssignment_3_2 ) ) ;
    public final void rule__EqInterface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4209:1: ( ( ( rule__EqInterface__SystemAssignment_3_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4210:1: ( ( rule__EqInterface__SystemAssignment_3_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4210:1: ( ( rule__EqInterface__SystemAssignment_3_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4211:1: ( rule__EqInterface__SystemAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getSystemAssignment_3_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4212:1: ( rule__EqInterface__SystemAssignment_3_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4212:2: rule__EqInterface__SystemAssignment_3_2
            {
            pushFollow(FOLLOW_rule__EqInterface__SystemAssignment_3_2_in_rule__EqInterface__Group_3__2__Impl8618);
            rule__EqInterface__SystemAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getSystemAssignment_3_2()); 
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
    // $ANTLR end "rule__EqInterface__Group_3__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_3__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4222:1: rule__EqInterface__Group_3__3 : rule__EqInterface__Group_3__3__Impl ;
    public final void rule__EqInterface__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4226:1: ( rule__EqInterface__Group_3__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4227:2: rule__EqInterface__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_3__3__Impl_in_rule__EqInterface__Group_3__38648);
            rule__EqInterface__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4233:1: rule__EqInterface__Group_3__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4237:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4238:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4238:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4239:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__EqInterface__Group_3__3__Impl8676); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_3_3()); 
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
    // $ANTLR end "rule__EqInterface__Group_3__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_4__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4260:1: rule__EqInterface__Group_4__0 : rule__EqInterface__Group_4__0__Impl rule__EqInterface__Group_4__1 ;
    public final void rule__EqInterface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4264:1: ( rule__EqInterface__Group_4__0__Impl rule__EqInterface__Group_4__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4265:2: rule__EqInterface__Group_4__0__Impl rule__EqInterface__Group_4__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_4__0__Impl_in_rule__EqInterface__Group_4__08715);
            rule__EqInterface__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_4__1_in_rule__EqInterface__Group_4__08718);
            rule__EqInterface__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4272:1: rule__EqInterface__Group_4__0__Impl : ( 'SubAta' ) ;
    public final void rule__EqInterface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4276:1: ( ( 'SubAta' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4277:1: ( 'SubAta' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4277:1: ( 'SubAta' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4278:1: 'SubAta'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getSubAtaKeyword_4_0()); 
            }
            match(input,81,FOLLOW_81_in_rule__EqInterface__Group_4__0__Impl8746); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getSubAtaKeyword_4_0()); 
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
    // $ANTLR end "rule__EqInterface__Group_4__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_4__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4291:1: rule__EqInterface__Group_4__1 : rule__EqInterface__Group_4__1__Impl rule__EqInterface__Group_4__2 ;
    public final void rule__EqInterface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4295:1: ( rule__EqInterface__Group_4__1__Impl rule__EqInterface__Group_4__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4296:2: rule__EqInterface__Group_4__1__Impl rule__EqInterface__Group_4__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_4__1__Impl_in_rule__EqInterface__Group_4__18777);
            rule__EqInterface__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_4__2_in_rule__EqInterface__Group_4__18780);
            rule__EqInterface__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4303:1: rule__EqInterface__Group_4__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4307:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4308:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4308:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4309:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_4_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__EqInterface__Group_4__1__Impl8808); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_4_1()); 
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
    // $ANTLR end "rule__EqInterface__Group_4__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_4__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4322:1: rule__EqInterface__Group_4__2 : rule__EqInterface__Group_4__2__Impl rule__EqInterface__Group_4__3 ;
    public final void rule__EqInterface__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4326:1: ( rule__EqInterface__Group_4__2__Impl rule__EqInterface__Group_4__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4327:2: rule__EqInterface__Group_4__2__Impl rule__EqInterface__Group_4__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_4__2__Impl_in_rule__EqInterface__Group_4__28839);
            rule__EqInterface__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_4__3_in_rule__EqInterface__Group_4__28842);
            rule__EqInterface__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4334:1: rule__EqInterface__Group_4__2__Impl : ( ( rule__EqInterface__SubAtaAssignment_4_2 ) ) ;
    public final void rule__EqInterface__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4338:1: ( ( ( rule__EqInterface__SubAtaAssignment_4_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4339:1: ( ( rule__EqInterface__SubAtaAssignment_4_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4339:1: ( ( rule__EqInterface__SubAtaAssignment_4_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4340:1: ( rule__EqInterface__SubAtaAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getSubAtaAssignment_4_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4341:1: ( rule__EqInterface__SubAtaAssignment_4_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4341:2: rule__EqInterface__SubAtaAssignment_4_2
            {
            pushFollow(FOLLOW_rule__EqInterface__SubAtaAssignment_4_2_in_rule__EqInterface__Group_4__2__Impl8869);
            rule__EqInterface__SubAtaAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getSubAtaAssignment_4_2()); 
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
    // $ANTLR end "rule__EqInterface__Group_4__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_4__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4351:1: rule__EqInterface__Group_4__3 : rule__EqInterface__Group_4__3__Impl ;
    public final void rule__EqInterface__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4355:1: ( rule__EqInterface__Group_4__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4356:2: rule__EqInterface__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_4__3__Impl_in_rule__EqInterface__Group_4__38899);
            rule__EqInterface__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4362:1: rule__EqInterface__Group_4__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4366:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4367:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4367:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4368:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_4_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__EqInterface__Group_4__3__Impl8927); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_4_3()); 
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
    // $ANTLR end "rule__EqInterface__Group_4__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_5__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4389:1: rule__EqInterface__Group_5__0 : rule__EqInterface__Group_5__0__Impl rule__EqInterface__Group_5__1 ;
    public final void rule__EqInterface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4393:1: ( rule__EqInterface__Group_5__0__Impl rule__EqInterface__Group_5__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4394:2: rule__EqInterface__Group_5__0__Impl rule__EqInterface__Group_5__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_5__0__Impl_in_rule__EqInterface__Group_5__08966);
            rule__EqInterface__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_5__1_in_rule__EqInterface__Group_5__08969);
            rule__EqInterface__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4401:1: rule__EqInterface__Group_5__0__Impl : ( 'Resource' ) ;
    public final void rule__EqInterface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4405:1: ( ( 'Resource' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4406:1: ( 'Resource' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4406:1: ( 'Resource' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4407:1: 'Resource'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getResourceKeyword_5_0()); 
            }
            match(input,82,FOLLOW_82_in_rule__EqInterface__Group_5__0__Impl8997); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getResourceKeyword_5_0()); 
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
    // $ANTLR end "rule__EqInterface__Group_5__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_5__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4420:1: rule__EqInterface__Group_5__1 : rule__EqInterface__Group_5__1__Impl rule__EqInterface__Group_5__2 ;
    public final void rule__EqInterface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4424:1: ( rule__EqInterface__Group_5__1__Impl rule__EqInterface__Group_5__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4425:2: rule__EqInterface__Group_5__1__Impl rule__EqInterface__Group_5__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_5__1__Impl_in_rule__EqInterface__Group_5__19028);
            rule__EqInterface__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_5__2_in_rule__EqInterface__Group_5__19031);
            rule__EqInterface__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4432:1: rule__EqInterface__Group_5__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4436:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4437:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4437:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4438:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_5_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__EqInterface__Group_5__1__Impl9059); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_5_1()); 
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
    // $ANTLR end "rule__EqInterface__Group_5__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_5__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4451:1: rule__EqInterface__Group_5__2 : rule__EqInterface__Group_5__2__Impl rule__EqInterface__Group_5__3 ;
    public final void rule__EqInterface__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4455:1: ( rule__EqInterface__Group_5__2__Impl rule__EqInterface__Group_5__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4456:2: rule__EqInterface__Group_5__2__Impl rule__EqInterface__Group_5__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_5__2__Impl_in_rule__EqInterface__Group_5__29090);
            rule__EqInterface__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_5__3_in_rule__EqInterface__Group_5__29093);
            rule__EqInterface__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4463:1: rule__EqInterface__Group_5__2__Impl : ( ( rule__EqInterface__ResourceAssignment_5_2 ) ) ;
    public final void rule__EqInterface__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4467:1: ( ( ( rule__EqInterface__ResourceAssignment_5_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4468:1: ( ( rule__EqInterface__ResourceAssignment_5_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4468:1: ( ( rule__EqInterface__ResourceAssignment_5_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4469:1: ( rule__EqInterface__ResourceAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getResourceAssignment_5_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4470:1: ( rule__EqInterface__ResourceAssignment_5_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4470:2: rule__EqInterface__ResourceAssignment_5_2
            {
            pushFollow(FOLLOW_rule__EqInterface__ResourceAssignment_5_2_in_rule__EqInterface__Group_5__2__Impl9120);
            rule__EqInterface__ResourceAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getResourceAssignment_5_2()); 
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
    // $ANTLR end "rule__EqInterface__Group_5__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_5__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4480:1: rule__EqInterface__Group_5__3 : rule__EqInterface__Group_5__3__Impl ;
    public final void rule__EqInterface__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4484:1: ( rule__EqInterface__Group_5__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4485:2: rule__EqInterface__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_5__3__Impl_in_rule__EqInterface__Group_5__39150);
            rule__EqInterface__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4491:1: rule__EqInterface__Group_5__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4495:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4496:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4496:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4497:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_5_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__EqInterface__Group_5__3__Impl9178); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_5_3()); 
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
    // $ANTLR end "rule__EqInterface__Group_5__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_6__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4518:1: rule__EqInterface__Group_6__0 : rule__EqInterface__Group_6__0__Impl rule__EqInterface__Group_6__1 ;
    public final void rule__EqInterface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4522:1: ( rule__EqInterface__Group_6__0__Impl rule__EqInterface__Group_6__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4523:2: rule__EqInterface__Group_6__0__Impl rule__EqInterface__Group_6__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_6__0__Impl_in_rule__EqInterface__Group_6__09217);
            rule__EqInterface__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_6__1_in_rule__EqInterface__Group_6__09220);
            rule__EqInterface__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4530:1: rule__EqInterface__Group_6__0__Impl : ( 'LineName' ) ;
    public final void rule__EqInterface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4534:1: ( ( 'LineName' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4535:1: ( 'LineName' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4535:1: ( 'LineName' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4536:1: 'LineName'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getLineNameKeyword_6_0()); 
            }
            match(input,83,FOLLOW_83_in_rule__EqInterface__Group_6__0__Impl9248); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getLineNameKeyword_6_0()); 
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
    // $ANTLR end "rule__EqInterface__Group_6__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_6__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4549:1: rule__EqInterface__Group_6__1 : rule__EqInterface__Group_6__1__Impl rule__EqInterface__Group_6__2 ;
    public final void rule__EqInterface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4553:1: ( rule__EqInterface__Group_6__1__Impl rule__EqInterface__Group_6__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4554:2: rule__EqInterface__Group_6__1__Impl rule__EqInterface__Group_6__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_6__1__Impl_in_rule__EqInterface__Group_6__19279);
            rule__EqInterface__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_6__2_in_rule__EqInterface__Group_6__19282);
            rule__EqInterface__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4561:1: rule__EqInterface__Group_6__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4565:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4566:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4566:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4567:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_6_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__EqInterface__Group_6__1__Impl9310); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_6_1()); 
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
    // $ANTLR end "rule__EqInterface__Group_6__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_6__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4580:1: rule__EqInterface__Group_6__2 : rule__EqInterface__Group_6__2__Impl rule__EqInterface__Group_6__3 ;
    public final void rule__EqInterface__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4584:1: ( rule__EqInterface__Group_6__2__Impl rule__EqInterface__Group_6__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4585:2: rule__EqInterface__Group_6__2__Impl rule__EqInterface__Group_6__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_6__2__Impl_in_rule__EqInterface__Group_6__29341);
            rule__EqInterface__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_6__3_in_rule__EqInterface__Group_6__29344);
            rule__EqInterface__Group_6__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4592:1: rule__EqInterface__Group_6__2__Impl : ( ( rule__EqInterface__LineNameAssignment_6_2 ) ) ;
    public final void rule__EqInterface__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4596:1: ( ( ( rule__EqInterface__LineNameAssignment_6_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4597:1: ( ( rule__EqInterface__LineNameAssignment_6_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4597:1: ( ( rule__EqInterface__LineNameAssignment_6_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4598:1: ( rule__EqInterface__LineNameAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getLineNameAssignment_6_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4599:1: ( rule__EqInterface__LineNameAssignment_6_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4599:2: rule__EqInterface__LineNameAssignment_6_2
            {
            pushFollow(FOLLOW_rule__EqInterface__LineNameAssignment_6_2_in_rule__EqInterface__Group_6__2__Impl9371);
            rule__EqInterface__LineNameAssignment_6_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getLineNameAssignment_6_2()); 
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
    // $ANTLR end "rule__EqInterface__Group_6__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_6__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4609:1: rule__EqInterface__Group_6__3 : rule__EqInterface__Group_6__3__Impl ;
    public final void rule__EqInterface__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4613:1: ( rule__EqInterface__Group_6__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4614:2: rule__EqInterface__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_6__3__Impl_in_rule__EqInterface__Group_6__39401);
            rule__EqInterface__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4620:1: rule__EqInterface__Group_6__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4624:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4625:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4625:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4626:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_6_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__EqInterface__Group_6__3__Impl9429); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_6_3()); 
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
    // $ANTLR end "rule__EqInterface__Group_6__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_7__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4647:1: rule__EqInterface__Group_7__0 : rule__EqInterface__Group_7__0__Impl rule__EqInterface__Group_7__1 ;
    public final void rule__EqInterface__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4651:1: ( rule__EqInterface__Group_7__0__Impl rule__EqInterface__Group_7__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4652:2: rule__EqInterface__Group_7__0__Impl rule__EqInterface__Group_7__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_7__0__Impl_in_rule__EqInterface__Group_7__09468);
            rule__EqInterface__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_7__1_in_rule__EqInterface__Group_7__09471);
            rule__EqInterface__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4659:1: rule__EqInterface__Group_7__0__Impl : ( 'WiringLane' ) ;
    public final void rule__EqInterface__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4663:1: ( ( 'WiringLane' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4664:1: ( 'WiringLane' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4664:1: ( 'WiringLane' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4665:1: 'WiringLane'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getWiringLaneKeyword_7_0()); 
            }
            match(input,84,FOLLOW_84_in_rule__EqInterface__Group_7__0__Impl9499); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getWiringLaneKeyword_7_0()); 
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
    // $ANTLR end "rule__EqInterface__Group_7__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_7__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4678:1: rule__EqInterface__Group_7__1 : rule__EqInterface__Group_7__1__Impl rule__EqInterface__Group_7__2 ;
    public final void rule__EqInterface__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4682:1: ( rule__EqInterface__Group_7__1__Impl rule__EqInterface__Group_7__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4683:2: rule__EqInterface__Group_7__1__Impl rule__EqInterface__Group_7__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_7__1__Impl_in_rule__EqInterface__Group_7__19530);
            rule__EqInterface__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_7__2_in_rule__EqInterface__Group_7__19533);
            rule__EqInterface__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4690:1: rule__EqInterface__Group_7__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4694:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4695:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4695:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4696:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_7_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__EqInterface__Group_7__1__Impl9561); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_7_1()); 
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
    // $ANTLR end "rule__EqInterface__Group_7__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_7__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4709:1: rule__EqInterface__Group_7__2 : rule__EqInterface__Group_7__2__Impl rule__EqInterface__Group_7__3 ;
    public final void rule__EqInterface__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4713:1: ( rule__EqInterface__Group_7__2__Impl rule__EqInterface__Group_7__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4714:2: rule__EqInterface__Group_7__2__Impl rule__EqInterface__Group_7__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_7__2__Impl_in_rule__EqInterface__Group_7__29592);
            rule__EqInterface__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_7__3_in_rule__EqInterface__Group_7__29595);
            rule__EqInterface__Group_7__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4721:1: rule__EqInterface__Group_7__2__Impl : ( ( rule__EqInterface__WiringLaneAssignment_7_2 ) ) ;
    public final void rule__EqInterface__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4725:1: ( ( ( rule__EqInterface__WiringLaneAssignment_7_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4726:1: ( ( rule__EqInterface__WiringLaneAssignment_7_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4726:1: ( ( rule__EqInterface__WiringLaneAssignment_7_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4727:1: ( rule__EqInterface__WiringLaneAssignment_7_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getWiringLaneAssignment_7_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4728:1: ( rule__EqInterface__WiringLaneAssignment_7_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4728:2: rule__EqInterface__WiringLaneAssignment_7_2
            {
            pushFollow(FOLLOW_rule__EqInterface__WiringLaneAssignment_7_2_in_rule__EqInterface__Group_7__2__Impl9622);
            rule__EqInterface__WiringLaneAssignment_7_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getWiringLaneAssignment_7_2()); 
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
    // $ANTLR end "rule__EqInterface__Group_7__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_7__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4738:1: rule__EqInterface__Group_7__3 : rule__EqInterface__Group_7__3__Impl ;
    public final void rule__EqInterface__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4742:1: ( rule__EqInterface__Group_7__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4743:2: rule__EqInterface__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_7__3__Impl_in_rule__EqInterface__Group_7__39652);
            rule__EqInterface__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4749:1: rule__EqInterface__Group_7__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4753:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4754:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4754:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4755:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_7_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__EqInterface__Group_7__3__Impl9680); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_7_3()); 
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
    // $ANTLR end "rule__EqInterface__Group_7__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_8__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4776:1: rule__EqInterface__Group_8__0 : rule__EqInterface__Group_8__0__Impl rule__EqInterface__Group_8__1 ;
    public final void rule__EqInterface__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4780:1: ( rule__EqInterface__Group_8__0__Impl rule__EqInterface__Group_8__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4781:2: rule__EqInterface__Group_8__0__Impl rule__EqInterface__Group_8__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_8__0__Impl_in_rule__EqInterface__Group_8__09719);
            rule__EqInterface__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_8__1_in_rule__EqInterface__Group_8__09722);
            rule__EqInterface__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4788:1: rule__EqInterface__Group_8__0__Impl : ( 'GrpInfo' ) ;
    public final void rule__EqInterface__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4792:1: ( ( 'GrpInfo' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4793:1: ( 'GrpInfo' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4793:1: ( 'GrpInfo' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4794:1: 'GrpInfo'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getGrpInfoKeyword_8_0()); 
            }
            match(input,85,FOLLOW_85_in_rule__EqInterface__Group_8__0__Impl9750); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getGrpInfoKeyword_8_0()); 
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
    // $ANTLR end "rule__EqInterface__Group_8__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_8__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4807:1: rule__EqInterface__Group_8__1 : rule__EqInterface__Group_8__1__Impl rule__EqInterface__Group_8__2 ;
    public final void rule__EqInterface__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4811:1: ( rule__EqInterface__Group_8__1__Impl rule__EqInterface__Group_8__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4812:2: rule__EqInterface__Group_8__1__Impl rule__EqInterface__Group_8__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_8__1__Impl_in_rule__EqInterface__Group_8__19781);
            rule__EqInterface__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_8__2_in_rule__EqInterface__Group_8__19784);
            rule__EqInterface__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4819:1: rule__EqInterface__Group_8__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4823:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4824:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4824:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4825:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_8_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__EqInterface__Group_8__1__Impl9812); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_8_1()); 
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
    // $ANTLR end "rule__EqInterface__Group_8__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_8__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4838:1: rule__EqInterface__Group_8__2 : rule__EqInterface__Group_8__2__Impl rule__EqInterface__Group_8__3 ;
    public final void rule__EqInterface__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4842:1: ( rule__EqInterface__Group_8__2__Impl rule__EqInterface__Group_8__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4843:2: rule__EqInterface__Group_8__2__Impl rule__EqInterface__Group_8__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_8__2__Impl_in_rule__EqInterface__Group_8__29843);
            rule__EqInterface__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_8__3_in_rule__EqInterface__Group_8__29846);
            rule__EqInterface__Group_8__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4850:1: rule__EqInterface__Group_8__2__Impl : ( ( rule__EqInterface__GrpInfoAssignment_8_2 ) ) ;
    public final void rule__EqInterface__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4854:1: ( ( ( rule__EqInterface__GrpInfoAssignment_8_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4855:1: ( ( rule__EqInterface__GrpInfoAssignment_8_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4855:1: ( ( rule__EqInterface__GrpInfoAssignment_8_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4856:1: ( rule__EqInterface__GrpInfoAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getGrpInfoAssignment_8_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4857:1: ( rule__EqInterface__GrpInfoAssignment_8_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4857:2: rule__EqInterface__GrpInfoAssignment_8_2
            {
            pushFollow(FOLLOW_rule__EqInterface__GrpInfoAssignment_8_2_in_rule__EqInterface__Group_8__2__Impl9873);
            rule__EqInterface__GrpInfoAssignment_8_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getGrpInfoAssignment_8_2()); 
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
    // $ANTLR end "rule__EqInterface__Group_8__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_8__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4867:1: rule__EqInterface__Group_8__3 : rule__EqInterface__Group_8__3__Impl ;
    public final void rule__EqInterface__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4871:1: ( rule__EqInterface__Group_8__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4872:2: rule__EqInterface__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_8__3__Impl_in_rule__EqInterface__Group_8__39903);
            rule__EqInterface__Group_8__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4878:1: rule__EqInterface__Group_8__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4882:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4883:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4883:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4884:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_8_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__EqInterface__Group_8__3__Impl9931); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_8_3()); 
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
    // $ANTLR end "rule__EqInterface__Group_8__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_9__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4905:1: rule__EqInterface__Group_9__0 : rule__EqInterface__Group_9__0__Impl rule__EqInterface__Group_9__1 ;
    public final void rule__EqInterface__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4909:1: ( rule__EqInterface__Group_9__0__Impl rule__EqInterface__Group_9__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4910:2: rule__EqInterface__Group_9__0__Impl rule__EqInterface__Group_9__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_9__0__Impl_in_rule__EqInterface__Group_9__09970);
            rule__EqInterface__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_9__1_in_rule__EqInterface__Group_9__09973);
            rule__EqInterface__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4917:1: rule__EqInterface__Group_9__0__Impl : ( 'Route' ) ;
    public final void rule__EqInterface__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4921:1: ( ( 'Route' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4922:1: ( 'Route' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4922:1: ( 'Route' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4923:1: 'Route'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getRouteKeyword_9_0()); 
            }
            match(input,86,FOLLOW_86_in_rule__EqInterface__Group_9__0__Impl10001); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getRouteKeyword_9_0()); 
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
    // $ANTLR end "rule__EqInterface__Group_9__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_9__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4936:1: rule__EqInterface__Group_9__1 : rule__EqInterface__Group_9__1__Impl rule__EqInterface__Group_9__2 ;
    public final void rule__EqInterface__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4940:1: ( rule__EqInterface__Group_9__1__Impl rule__EqInterface__Group_9__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4941:2: rule__EqInterface__Group_9__1__Impl rule__EqInterface__Group_9__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_9__1__Impl_in_rule__EqInterface__Group_9__110032);
            rule__EqInterface__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_9__2_in_rule__EqInterface__Group_9__110035);
            rule__EqInterface__Group_9__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4948:1: rule__EqInterface__Group_9__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4952:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4953:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4953:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4954:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_9_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__EqInterface__Group_9__1__Impl10063); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_9_1()); 
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
    // $ANTLR end "rule__EqInterface__Group_9__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_9__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4967:1: rule__EqInterface__Group_9__2 : rule__EqInterface__Group_9__2__Impl rule__EqInterface__Group_9__3 ;
    public final void rule__EqInterface__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4971:1: ( rule__EqInterface__Group_9__2__Impl rule__EqInterface__Group_9__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4972:2: rule__EqInterface__Group_9__2__Impl rule__EqInterface__Group_9__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_9__2__Impl_in_rule__EqInterface__Group_9__210094);
            rule__EqInterface__Group_9__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_9__3_in_rule__EqInterface__Group_9__210097);
            rule__EqInterface__Group_9__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4979:1: rule__EqInterface__Group_9__2__Impl : ( ( rule__EqInterface__RouteAssignment_9_2 ) ) ;
    public final void rule__EqInterface__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4983:1: ( ( ( rule__EqInterface__RouteAssignment_9_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4984:1: ( ( rule__EqInterface__RouteAssignment_9_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4984:1: ( ( rule__EqInterface__RouteAssignment_9_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4985:1: ( rule__EqInterface__RouteAssignment_9_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getRouteAssignment_9_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4986:1: ( rule__EqInterface__RouteAssignment_9_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4986:2: rule__EqInterface__RouteAssignment_9_2
            {
            pushFollow(FOLLOW_rule__EqInterface__RouteAssignment_9_2_in_rule__EqInterface__Group_9__2__Impl10124);
            rule__EqInterface__RouteAssignment_9_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getRouteAssignment_9_2()); 
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
    // $ANTLR end "rule__EqInterface__Group_9__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_9__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4996:1: rule__EqInterface__Group_9__3 : rule__EqInterface__Group_9__3__Impl ;
    public final void rule__EqInterface__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5000:1: ( rule__EqInterface__Group_9__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5001:2: rule__EqInterface__Group_9__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_9__3__Impl_in_rule__EqInterface__Group_9__310154);
            rule__EqInterface__Group_9__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5007:1: rule__EqInterface__Group_9__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5011:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5012:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5012:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5013:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_9_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__EqInterface__Group_9__3__Impl10182); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_9_3()); 
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
    // $ANTLR end "rule__EqInterface__Group_9__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_10__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5034:1: rule__EqInterface__Group_10__0 : rule__EqInterface__Group_10__0__Impl rule__EqInterface__Group_10__1 ;
    public final void rule__EqInterface__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5038:1: ( rule__EqInterface__Group_10__0__Impl rule__EqInterface__Group_10__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5039:2: rule__EqInterface__Group_10__0__Impl rule__EqInterface__Group_10__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_10__0__Impl_in_rule__EqInterface__Group_10__010221);
            rule__EqInterface__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_10__1_in_rule__EqInterface__Group_10__010224);
            rule__EqInterface__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5046:1: rule__EqInterface__Group_10__0__Impl : ( 'PwSup1' ) ;
    public final void rule__EqInterface__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5050:1: ( ( 'PwSup1' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5051:1: ( 'PwSup1' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5051:1: ( 'PwSup1' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5052:1: 'PwSup1'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getPwSup1Keyword_10_0()); 
            }
            match(input,87,FOLLOW_87_in_rule__EqInterface__Group_10__0__Impl10252); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getPwSup1Keyword_10_0()); 
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
    // $ANTLR end "rule__EqInterface__Group_10__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_10__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5065:1: rule__EqInterface__Group_10__1 : rule__EqInterface__Group_10__1__Impl rule__EqInterface__Group_10__2 ;
    public final void rule__EqInterface__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5069:1: ( rule__EqInterface__Group_10__1__Impl rule__EqInterface__Group_10__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5070:2: rule__EqInterface__Group_10__1__Impl rule__EqInterface__Group_10__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_10__1__Impl_in_rule__EqInterface__Group_10__110283);
            rule__EqInterface__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_10__2_in_rule__EqInterface__Group_10__110286);
            rule__EqInterface__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5077:1: rule__EqInterface__Group_10__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5081:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5082:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5082:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5083:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_10_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__EqInterface__Group_10__1__Impl10314); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_10_1()); 
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
    // $ANTLR end "rule__EqInterface__Group_10__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_10__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5096:1: rule__EqInterface__Group_10__2 : rule__EqInterface__Group_10__2__Impl rule__EqInterface__Group_10__3 ;
    public final void rule__EqInterface__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5100:1: ( rule__EqInterface__Group_10__2__Impl rule__EqInterface__Group_10__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5101:2: rule__EqInterface__Group_10__2__Impl rule__EqInterface__Group_10__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_10__2__Impl_in_rule__EqInterface__Group_10__210345);
            rule__EqInterface__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_10__3_in_rule__EqInterface__Group_10__210348);
            rule__EqInterface__Group_10__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5108:1: rule__EqInterface__Group_10__2__Impl : ( ( rule__EqInterface__PwSup1Assignment_10_2 ) ) ;
    public final void rule__EqInterface__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5112:1: ( ( ( rule__EqInterface__PwSup1Assignment_10_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5113:1: ( ( rule__EqInterface__PwSup1Assignment_10_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5113:1: ( ( rule__EqInterface__PwSup1Assignment_10_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5114:1: ( rule__EqInterface__PwSup1Assignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getPwSup1Assignment_10_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5115:1: ( rule__EqInterface__PwSup1Assignment_10_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5115:2: rule__EqInterface__PwSup1Assignment_10_2
            {
            pushFollow(FOLLOW_rule__EqInterface__PwSup1Assignment_10_2_in_rule__EqInterface__Group_10__2__Impl10375);
            rule__EqInterface__PwSup1Assignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getPwSup1Assignment_10_2()); 
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
    // $ANTLR end "rule__EqInterface__Group_10__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_10__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5125:1: rule__EqInterface__Group_10__3 : rule__EqInterface__Group_10__3__Impl ;
    public final void rule__EqInterface__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5129:1: ( rule__EqInterface__Group_10__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5130:2: rule__EqInterface__Group_10__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_10__3__Impl_in_rule__EqInterface__Group_10__310405);
            rule__EqInterface__Group_10__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5136:1: rule__EqInterface__Group_10__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5140:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5141:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5141:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5142:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_10_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__EqInterface__Group_10__3__Impl10433); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_10_3()); 
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
    // $ANTLR end "rule__EqInterface__Group_10__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_11__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5163:1: rule__EqInterface__Group_11__0 : rule__EqInterface__Group_11__0__Impl rule__EqInterface__Group_11__1 ;
    public final void rule__EqInterface__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5167:1: ( rule__EqInterface__Group_11__0__Impl rule__EqInterface__Group_11__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5168:2: rule__EqInterface__Group_11__0__Impl rule__EqInterface__Group_11__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_11__0__Impl_in_rule__EqInterface__Group_11__010472);
            rule__EqInterface__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_11__1_in_rule__EqInterface__Group_11__010475);
            rule__EqInterface__Group_11__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5175:1: rule__EqInterface__Group_11__0__Impl : ( 'EmhZone1' ) ;
    public final void rule__EqInterface__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5179:1: ( ( 'EmhZone1' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5180:1: ( 'EmhZone1' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5180:1: ( 'EmhZone1' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5181:1: 'EmhZone1'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getEmhZone1Keyword_11_0()); 
            }
            match(input,88,FOLLOW_88_in_rule__EqInterface__Group_11__0__Impl10503); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getEmhZone1Keyword_11_0()); 
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
    // $ANTLR end "rule__EqInterface__Group_11__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_11__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5194:1: rule__EqInterface__Group_11__1 : rule__EqInterface__Group_11__1__Impl rule__EqInterface__Group_11__2 ;
    public final void rule__EqInterface__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5198:1: ( rule__EqInterface__Group_11__1__Impl rule__EqInterface__Group_11__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5199:2: rule__EqInterface__Group_11__1__Impl rule__EqInterface__Group_11__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_11__1__Impl_in_rule__EqInterface__Group_11__110534);
            rule__EqInterface__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_11__2_in_rule__EqInterface__Group_11__110537);
            rule__EqInterface__Group_11__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5206:1: rule__EqInterface__Group_11__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5210:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5211:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5211:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5212:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_11_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__EqInterface__Group_11__1__Impl10565); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_11_1()); 
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
    // $ANTLR end "rule__EqInterface__Group_11__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_11__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5225:1: rule__EqInterface__Group_11__2 : rule__EqInterface__Group_11__2__Impl rule__EqInterface__Group_11__3 ;
    public final void rule__EqInterface__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5229:1: ( rule__EqInterface__Group_11__2__Impl rule__EqInterface__Group_11__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5230:2: rule__EqInterface__Group_11__2__Impl rule__EqInterface__Group_11__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_11__2__Impl_in_rule__EqInterface__Group_11__210596);
            rule__EqInterface__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_11__3_in_rule__EqInterface__Group_11__210599);
            rule__EqInterface__Group_11__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5237:1: rule__EqInterface__Group_11__2__Impl : ( ( rule__EqInterface__EmhZone1Assignment_11_2 ) ) ;
    public final void rule__EqInterface__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5241:1: ( ( ( rule__EqInterface__EmhZone1Assignment_11_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5242:1: ( ( rule__EqInterface__EmhZone1Assignment_11_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5242:1: ( ( rule__EqInterface__EmhZone1Assignment_11_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5243:1: ( rule__EqInterface__EmhZone1Assignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getEmhZone1Assignment_11_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5244:1: ( rule__EqInterface__EmhZone1Assignment_11_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5244:2: rule__EqInterface__EmhZone1Assignment_11_2
            {
            pushFollow(FOLLOW_rule__EqInterface__EmhZone1Assignment_11_2_in_rule__EqInterface__Group_11__2__Impl10626);
            rule__EqInterface__EmhZone1Assignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getEmhZone1Assignment_11_2()); 
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
    // $ANTLR end "rule__EqInterface__Group_11__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_11__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5254:1: rule__EqInterface__Group_11__3 : rule__EqInterface__Group_11__3__Impl ;
    public final void rule__EqInterface__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5258:1: ( rule__EqInterface__Group_11__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5259:2: rule__EqInterface__Group_11__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_11__3__Impl_in_rule__EqInterface__Group_11__310656);
            rule__EqInterface__Group_11__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5265:1: rule__EqInterface__Group_11__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5269:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5270:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5270:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5271:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_11_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__EqInterface__Group_11__3__Impl10684); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_11_3()); 
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
    // $ANTLR end "rule__EqInterface__Group_11__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_12__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5292:1: rule__EqInterface__Group_12__0 : rule__EqInterface__Group_12__0__Impl rule__EqInterface__Group_12__1 ;
    public final void rule__EqInterface__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5296:1: ( rule__EqInterface__Group_12__0__Impl rule__EqInterface__Group_12__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5297:2: rule__EqInterface__Group_12__0__Impl rule__EqInterface__Group_12__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_12__0__Impl_in_rule__EqInterface__Group_12__010723);
            rule__EqInterface__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_12__1_in_rule__EqInterface__Group_12__010726);
            rule__EqInterface__Group_12__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5304:1: rule__EqInterface__Group_12__0__Impl : ( 'Type' ) ;
    public final void rule__EqInterface__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5308:1: ( ( 'Type' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5309:1: ( 'Type' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5309:1: ( 'Type' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5310:1: 'Type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getTypeKeyword_12_0()); 
            }
            match(input,73,FOLLOW_73_in_rule__EqInterface__Group_12__0__Impl10754); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getTypeKeyword_12_0()); 
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
    // $ANTLR end "rule__EqInterface__Group_12__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_12__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5323:1: rule__EqInterface__Group_12__1 : rule__EqInterface__Group_12__1__Impl rule__EqInterface__Group_12__2 ;
    public final void rule__EqInterface__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5327:1: ( rule__EqInterface__Group_12__1__Impl rule__EqInterface__Group_12__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5328:2: rule__EqInterface__Group_12__1__Impl rule__EqInterface__Group_12__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_12__1__Impl_in_rule__EqInterface__Group_12__110785);
            rule__EqInterface__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_12__2_in_rule__EqInterface__Group_12__110788);
            rule__EqInterface__Group_12__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5335:1: rule__EqInterface__Group_12__1__Impl : ( '=' ) ;
    public final void rule__EqInterface__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5339:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5340:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5340:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5341:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_12_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__EqInterface__Group_12__1__Impl10816); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getEqualsSignKeyword_12_1()); 
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
    // $ANTLR end "rule__EqInterface__Group_12__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_12__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5354:1: rule__EqInterface__Group_12__2 : rule__EqInterface__Group_12__2__Impl rule__EqInterface__Group_12__3 ;
    public final void rule__EqInterface__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5358:1: ( rule__EqInterface__Group_12__2__Impl rule__EqInterface__Group_12__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5359:2: rule__EqInterface__Group_12__2__Impl rule__EqInterface__Group_12__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_12__2__Impl_in_rule__EqInterface__Group_12__210847);
            rule__EqInterface__Group_12__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_12__3_in_rule__EqInterface__Group_12__210850);
            rule__EqInterface__Group_12__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5366:1: rule__EqInterface__Group_12__2__Impl : ( ( rule__EqInterface__IoTypeAssignment_12_2 ) ) ;
    public final void rule__EqInterface__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5370:1: ( ( ( rule__EqInterface__IoTypeAssignment_12_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5371:1: ( ( rule__EqInterface__IoTypeAssignment_12_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5371:1: ( ( rule__EqInterface__IoTypeAssignment_12_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5372:1: ( rule__EqInterface__IoTypeAssignment_12_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getIoTypeAssignment_12_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5373:1: ( rule__EqInterface__IoTypeAssignment_12_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5373:2: rule__EqInterface__IoTypeAssignment_12_2
            {
            pushFollow(FOLLOW_rule__EqInterface__IoTypeAssignment_12_2_in_rule__EqInterface__Group_12__2__Impl10877);
            rule__EqInterface__IoTypeAssignment_12_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getIoTypeAssignment_12_2()); 
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
    // $ANTLR end "rule__EqInterface__Group_12__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_12__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5383:1: rule__EqInterface__Group_12__3 : rule__EqInterface__Group_12__3__Impl ;
    public final void rule__EqInterface__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5387:1: ( rule__EqInterface__Group_12__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5388:2: rule__EqInterface__Group_12__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_12__3__Impl_in_rule__EqInterface__Group_12__310907);
            rule__EqInterface__Group_12__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5394:1: rule__EqInterface__Group_12__3__Impl : ( ';' ) ;
    public final void rule__EqInterface__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5398:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5399:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5399:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5400:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_12_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__EqInterface__Group_12__3__Impl10935); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getSemicolonKeyword_12_3()); 
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
    // $ANTLR end "rule__EqInterface__Group_12__3__Impl"


    // $ANTLR start "rule__EqInterface__Group_13__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5421:1: rule__EqInterface__Group_13__0 : rule__EqInterface__Group_13__0__Impl rule__EqInterface__Group_13__1 ;
    public final void rule__EqInterface__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5425:1: ( rule__EqInterface__Group_13__0__Impl rule__EqInterface__Group_13__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5426:2: rule__EqInterface__Group_13__0__Impl rule__EqInterface__Group_13__1
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_13__0__Impl_in_rule__EqInterface__Group_13__010974);
            rule__EqInterface__Group_13__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_13__1_in_rule__EqInterface__Group_13__010977);
            rule__EqInterface__Group_13__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5433:1: rule__EqInterface__Group_13__0__Impl : ( 'Generic properties' ) ;
    public final void rule__EqInterface__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5437:1: ( ( 'Generic properties' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5438:1: ( 'Generic properties' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5438:1: ( 'Generic properties' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5439:1: 'Generic properties'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getGenericPropertiesKeyword_13_0()); 
            }
            match(input,75,FOLLOW_75_in_rule__EqInterface__Group_13__0__Impl11005); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getGenericPropertiesKeyword_13_0()); 
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
    // $ANTLR end "rule__EqInterface__Group_13__0__Impl"


    // $ANTLR start "rule__EqInterface__Group_13__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5452:1: rule__EqInterface__Group_13__1 : rule__EqInterface__Group_13__1__Impl rule__EqInterface__Group_13__2 ;
    public final void rule__EqInterface__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5456:1: ( rule__EqInterface__Group_13__1__Impl rule__EqInterface__Group_13__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5457:2: rule__EqInterface__Group_13__1__Impl rule__EqInterface__Group_13__2
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_13__1__Impl_in_rule__EqInterface__Group_13__111036);
            rule__EqInterface__Group_13__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_13__2_in_rule__EqInterface__Group_13__111039);
            rule__EqInterface__Group_13__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5464:1: rule__EqInterface__Group_13__1__Impl : ( '{' ) ;
    public final void rule__EqInterface__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5468:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5469:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5469:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5470:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getLeftCurlyBracketKeyword_13_1()); 
            }
            match(input,61,FOLLOW_61_in_rule__EqInterface__Group_13__1__Impl11067); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getLeftCurlyBracketKeyword_13_1()); 
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
    // $ANTLR end "rule__EqInterface__Group_13__1__Impl"


    // $ANTLR start "rule__EqInterface__Group_13__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5483:1: rule__EqInterface__Group_13__2 : rule__EqInterface__Group_13__2__Impl rule__EqInterface__Group_13__3 ;
    public final void rule__EqInterface__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5487:1: ( rule__EqInterface__Group_13__2__Impl rule__EqInterface__Group_13__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5488:2: rule__EqInterface__Group_13__2__Impl rule__EqInterface__Group_13__3
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_13__2__Impl_in_rule__EqInterface__Group_13__211098);
            rule__EqInterface__Group_13__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqInterface__Group_13__3_in_rule__EqInterface__Group_13__211101);
            rule__EqInterface__Group_13__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5495:1: rule__EqInterface__Group_13__2__Impl : ( ( rule__EqInterface__MetricParametersAssignment_13_2 )* ) ;
    public final void rule__EqInterface__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5499:1: ( ( ( rule__EqInterface__MetricParametersAssignment_13_2 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5500:1: ( ( rule__EqInterface__MetricParametersAssignment_13_2 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5500:1: ( ( rule__EqInterface__MetricParametersAssignment_13_2 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5501:1: ( rule__EqInterface__MetricParametersAssignment_13_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getMetricParametersAssignment_13_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5502:1: ( rule__EqInterface__MetricParametersAssignment_13_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_STRING) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5502:2: rule__EqInterface__MetricParametersAssignment_13_2
            	    {
            	    pushFollow(FOLLOW_rule__EqInterface__MetricParametersAssignment_13_2_in_rule__EqInterface__Group_13__2__Impl11128);
            	    rule__EqInterface__MetricParametersAssignment_13_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getMetricParametersAssignment_13_2()); 
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
    // $ANTLR end "rule__EqInterface__Group_13__2__Impl"


    // $ANTLR start "rule__EqInterface__Group_13__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5512:1: rule__EqInterface__Group_13__3 : rule__EqInterface__Group_13__3__Impl ;
    public final void rule__EqInterface__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5516:1: ( rule__EqInterface__Group_13__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5517:2: rule__EqInterface__Group_13__3__Impl
            {
            pushFollow(FOLLOW_rule__EqInterface__Group_13__3__Impl_in_rule__EqInterface__Group_13__311159);
            rule__EqInterface__Group_13__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5523:1: rule__EqInterface__Group_13__3__Impl : ( '}' ) ;
    public final void rule__EqInterface__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5527:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5528:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5528:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5529:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getRightCurlyBracketKeyword_13_3()); 
            }
            match(input,65,FOLLOW_65_in_rule__EqInterface__Group_13__3__Impl11187); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getRightCurlyBracketKeyword_13_3()); 
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
    // $ANTLR end "rule__EqInterface__Group_13__3__Impl"


    // $ANTLR start "rule__DislocalityRelation__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5550:1: rule__DislocalityRelation__Group__0 : rule__DislocalityRelation__Group__0__Impl rule__DislocalityRelation__Group__1 ;
    public final void rule__DislocalityRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5554:1: ( rule__DislocalityRelation__Group__0__Impl rule__DislocalityRelation__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5555:2: rule__DislocalityRelation__Group__0__Impl rule__DislocalityRelation__Group__1
            {
            pushFollow(FOLLOW_rule__DislocalityRelation__Group__0__Impl_in_rule__DislocalityRelation__Group__011226);
            rule__DislocalityRelation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DislocalityRelation__Group__1_in_rule__DislocalityRelation__Group__011229);
            rule__DislocalityRelation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DislocalityRelation__Group__0"


    // $ANTLR start "rule__DislocalityRelation__Group__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5562:1: rule__DislocalityRelation__Group__0__Impl : ( ( rule__DislocalityRelation__EqInterfaceGroupAssignment_0 ) ) ;
    public final void rule__DislocalityRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5566:1: ( ( ( rule__DislocalityRelation__EqInterfaceGroupAssignment_0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5567:1: ( ( rule__DislocalityRelation__EqInterfaceGroupAssignment_0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5567:1: ( ( rule__DislocalityRelation__EqInterfaceGroupAssignment_0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5568:1: ( rule__DislocalityRelation__EqInterfaceGroupAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDislocalityRelationAccess().getEqInterfaceGroupAssignment_0()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5569:1: ( rule__DislocalityRelation__EqInterfaceGroupAssignment_0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5569:2: rule__DislocalityRelation__EqInterfaceGroupAssignment_0
            {
            pushFollow(FOLLOW_rule__DislocalityRelation__EqInterfaceGroupAssignment_0_in_rule__DislocalityRelation__Group__0__Impl11256);
            rule__DislocalityRelation__EqInterfaceGroupAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDislocalityRelationAccess().getEqInterfaceGroupAssignment_0()); 
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
    // $ANTLR end "rule__DislocalityRelation__Group__0__Impl"


    // $ANTLR start "rule__DislocalityRelation__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5579:1: rule__DislocalityRelation__Group__1 : rule__DislocalityRelation__Group__1__Impl rule__DislocalityRelation__Group__2 ;
    public final void rule__DislocalityRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5583:1: ( rule__DislocalityRelation__Group__1__Impl rule__DislocalityRelation__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5584:2: rule__DislocalityRelation__Group__1__Impl rule__DislocalityRelation__Group__2
            {
            pushFollow(FOLLOW_rule__DislocalityRelation__Group__1__Impl_in_rule__DislocalityRelation__Group__111286);
            rule__DislocalityRelation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DislocalityRelation__Group__2_in_rule__DislocalityRelation__Group__111289);
            rule__DislocalityRelation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DislocalityRelation__Group__1"


    // $ANTLR start "rule__DislocalityRelation__Group__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5591:1: rule__DislocalityRelation__Group__1__Impl : ( 'dislocal up to' ) ;
    public final void rule__DislocalityRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5595:1: ( ( 'dislocal up to' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5596:1: ( 'dislocal up to' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5596:1: ( 'dislocal up to' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5597:1: 'dislocal up to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDislocalityRelationAccess().getDislocalUpToKeyword_1()); 
            }
            match(input,89,FOLLOW_89_in_rule__DislocalityRelation__Group__1__Impl11317); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDislocalityRelationAccess().getDislocalUpToKeyword_1()); 
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
    // $ANTLR end "rule__DislocalityRelation__Group__1__Impl"


    // $ANTLR start "rule__DislocalityRelation__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5610:1: rule__DislocalityRelation__Group__2 : rule__DislocalityRelation__Group__2__Impl rule__DislocalityRelation__Group__3 ;
    public final void rule__DislocalityRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5614:1: ( rule__DislocalityRelation__Group__2__Impl rule__DislocalityRelation__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5615:2: rule__DislocalityRelation__Group__2__Impl rule__DislocalityRelation__Group__3
            {
            pushFollow(FOLLOW_rule__DislocalityRelation__Group__2__Impl_in_rule__DislocalityRelation__Group__211348);
            rule__DislocalityRelation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DislocalityRelation__Group__3_in_rule__DislocalityRelation__Group__211351);
            rule__DislocalityRelation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DislocalityRelation__Group__2"


    // $ANTLR start "rule__DislocalityRelation__Group__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5622:1: rule__DislocalityRelation__Group__2__Impl : ( ( rule__DislocalityRelation__HardwareLevelAssignment_2 ) ) ;
    public final void rule__DislocalityRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5626:1: ( ( ( rule__DislocalityRelation__HardwareLevelAssignment_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5627:1: ( ( rule__DislocalityRelation__HardwareLevelAssignment_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5627:1: ( ( rule__DislocalityRelation__HardwareLevelAssignment_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5628:1: ( rule__DislocalityRelation__HardwareLevelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDislocalityRelationAccess().getHardwareLevelAssignment_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5629:1: ( rule__DislocalityRelation__HardwareLevelAssignment_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5629:2: rule__DislocalityRelation__HardwareLevelAssignment_2
            {
            pushFollow(FOLLOW_rule__DislocalityRelation__HardwareLevelAssignment_2_in_rule__DislocalityRelation__Group__2__Impl11378);
            rule__DislocalityRelation__HardwareLevelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDislocalityRelationAccess().getHardwareLevelAssignment_2()); 
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
    // $ANTLR end "rule__DislocalityRelation__Group__2__Impl"


    // $ANTLR start "rule__DislocalityRelation__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5639:1: rule__DislocalityRelation__Group__3 : rule__DislocalityRelation__Group__3__Impl ;
    public final void rule__DislocalityRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5643:1: ( rule__DislocalityRelation__Group__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5644:2: rule__DislocalityRelation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DislocalityRelation__Group__3__Impl_in_rule__DislocalityRelation__Group__311408);
            rule__DislocalityRelation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DislocalityRelation__Group__3"


    // $ANTLR start "rule__DislocalityRelation__Group__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5650:1: rule__DislocalityRelation__Group__3__Impl : ( ';' ) ;
    public final void rule__DislocalityRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5654:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5655:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5655:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5656:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDislocalityRelationAccess().getSemicolonKeyword_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__DislocalityRelation__Group__3__Impl11436); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDislocalityRelationAccess().getSemicolonKeyword_3()); 
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
    // $ANTLR end "rule__DislocalityRelation__Group__3__Impl"


    // $ANTLR start "rule__MetricParameter__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5677:1: rule__MetricParameter__Group__0 : rule__MetricParameter__Group__0__Impl rule__MetricParameter__Group__1 ;
    public final void rule__MetricParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5681:1: ( rule__MetricParameter__Group__0__Impl rule__MetricParameter__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5682:2: rule__MetricParameter__Group__0__Impl rule__MetricParameter__Group__1
            {
            pushFollow(FOLLOW_rule__MetricParameter__Group__0__Impl_in_rule__MetricParameter__Group__011475);
            rule__MetricParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetricParameter__Group__1_in_rule__MetricParameter__Group__011478);
            rule__MetricParameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5689:1: rule__MetricParameter__Group__0__Impl : ( ( rule__MetricParameter__NameAssignment_0 ) ) ;
    public final void rule__MetricParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5693:1: ( ( ( rule__MetricParameter__NameAssignment_0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5694:1: ( ( rule__MetricParameter__NameAssignment_0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5694:1: ( ( rule__MetricParameter__NameAssignment_0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5695:1: ( rule__MetricParameter__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricParameterAccess().getNameAssignment_0()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5696:1: ( rule__MetricParameter__NameAssignment_0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5696:2: rule__MetricParameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MetricParameter__NameAssignment_0_in_rule__MetricParameter__Group__0__Impl11505);
            rule__MetricParameter__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricParameterAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__MetricParameter__Group__0__Impl"


    // $ANTLR start "rule__MetricParameter__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5706:1: rule__MetricParameter__Group__1 : rule__MetricParameter__Group__1__Impl rule__MetricParameter__Group__2 ;
    public final void rule__MetricParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5710:1: ( rule__MetricParameter__Group__1__Impl rule__MetricParameter__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5711:2: rule__MetricParameter__Group__1__Impl rule__MetricParameter__Group__2
            {
            pushFollow(FOLLOW_rule__MetricParameter__Group__1__Impl_in_rule__MetricParameter__Group__111535);
            rule__MetricParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetricParameter__Group__2_in_rule__MetricParameter__Group__111538);
            rule__MetricParameter__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5718:1: rule__MetricParameter__Group__1__Impl : ( '=' ) ;
    public final void rule__MetricParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5722:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5723:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5723:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5724:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricParameterAccess().getEqualsSignKeyword_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__MetricParameter__Group__1__Impl11566); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricParameterAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__MetricParameter__Group__1__Impl"


    // $ANTLR start "rule__MetricParameter__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5737:1: rule__MetricParameter__Group__2 : rule__MetricParameter__Group__2__Impl rule__MetricParameter__Group__3 ;
    public final void rule__MetricParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5741:1: ( rule__MetricParameter__Group__2__Impl rule__MetricParameter__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5742:2: rule__MetricParameter__Group__2__Impl rule__MetricParameter__Group__3
            {
            pushFollow(FOLLOW_rule__MetricParameter__Group__2__Impl_in_rule__MetricParameter__Group__211597);
            rule__MetricParameter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetricParameter__Group__3_in_rule__MetricParameter__Group__211600);
            rule__MetricParameter__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5749:1: rule__MetricParameter__Group__2__Impl : ( ( rule__MetricParameter__ValueAssignment_2 ) ) ;
    public final void rule__MetricParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5753:1: ( ( ( rule__MetricParameter__ValueAssignment_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5754:1: ( ( rule__MetricParameter__ValueAssignment_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5754:1: ( ( rule__MetricParameter__ValueAssignment_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5755:1: ( rule__MetricParameter__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricParameterAccess().getValueAssignment_2()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5756:1: ( rule__MetricParameter__ValueAssignment_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5756:2: rule__MetricParameter__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__MetricParameter__ValueAssignment_2_in_rule__MetricParameter__Group__2__Impl11627);
            rule__MetricParameter__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricParameterAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__MetricParameter__Group__2__Impl"


    // $ANTLR start "rule__MetricParameter__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5766:1: rule__MetricParameter__Group__3 : rule__MetricParameter__Group__3__Impl ;
    public final void rule__MetricParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5770:1: ( rule__MetricParameter__Group__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5771:2: rule__MetricParameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MetricParameter__Group__3__Impl_in_rule__MetricParameter__Group__311657);
            rule__MetricParameter__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5777:1: rule__MetricParameter__Group__3__Impl : ( ';' ) ;
    public final void rule__MetricParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5781:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5782:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5782:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5783:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricParameterAccess().getSemicolonKeyword_3()); 
            }
            match(input,64,FOLLOW_64_in_rule__MetricParameter__Group__3__Impl11685); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricParameterAccess().getSemicolonKeyword_3()); 
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
    // $ANTLR end "rule__MetricParameter__Group__3__Impl"


    // $ANTLR start "rule__Compartment__UnorderedGroup_3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5807:1: rule__Compartment__UnorderedGroup_3 : ( rule__Compartment__UnorderedGroup_3__0 )? ;
    public final void rule__Compartment__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5812:1: ( ( rule__Compartment__UnorderedGroup_3__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5813:2: ( rule__Compartment__UnorderedGroup_3__0 )?
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5813:2: ( rule__Compartment__UnorderedGroup_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 ==70 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1) ) {
                alt31=1;
            }
            else if ( LA31_0 ==71 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2) ) {
                alt31=1;
            }
            else if ( LA31_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3) ) {
                alt31=1;
            }
            else if ( LA31_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5813:2: rule__Compartment__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_rule__Compartment__UnorderedGroup_3__0_in_rule__Compartment__UnorderedGroup_311727);
                    rule__Compartment__UnorderedGroup_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__UnorderedGroup_3"


    // $ANTLR start "rule__Compartment__UnorderedGroup_3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5823:1: rule__Compartment__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Compartment__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Compartment__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Compartment__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Compartment__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Compartment__RdcsAssignment_3_4 ) ) ( ( ( rule__Compartment__RdcsAssignment_3_4 )=> rule__Compartment__RdcsAssignment_3_4 )* ) ) ) ) ) ;
    public final void rule__Compartment__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5828:1: ( ( ({...}? => ( ( ( rule__Compartment__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Compartment__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Compartment__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Compartment__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Compartment__RdcsAssignment_3_4 ) ) ( ( ( rule__Compartment__RdcsAssignment_3_4 )=> rule__Compartment__RdcsAssignment_3_4 )* ) ) ) ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5829:3: ( ({...}? => ( ( ( rule__Compartment__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Compartment__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Compartment__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Compartment__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Compartment__RdcsAssignment_3_4 ) ) ( ( ( rule__Compartment__RdcsAssignment_3_4 )=> rule__Compartment__RdcsAssignment_3_4 )* ) ) ) ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5829:3: ( ({...}? => ( ( ( rule__Compartment__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Compartment__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Compartment__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Compartment__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Compartment__RdcsAssignment_3_4 ) ) ( ( ( rule__Compartment__RdcsAssignment_3_4 )=> rule__Compartment__RdcsAssignment_3_4 )* ) ) ) ) )
            int alt33=5;
            int LA33_0 = input.LA(1);

            if ( LA33_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 ==70 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1) ) {
                alt33=2;
            }
            else if ( LA33_0 ==71 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2) ) {
                alt33=3;
            }
            else if ( LA33_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3) ) {
                alt33=4;
            }
            else if ( LA33_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4) ) {
                alt33=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5831:4: ({...}? => ( ( ( rule__Compartment__Group_3_0__0 ) ) ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5831:4: ({...}? => ( ( ( rule__Compartment__Group_3_0__0 ) ) ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5832:5: {...}? => ( ( ( rule__Compartment__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Compartment__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5832:108: ( ( ( rule__Compartment__Group_3_0__0 ) ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5833:6: ( ( rule__Compartment__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5839:6: ( ( rule__Compartment__Group_3_0__0 ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5841:7: ( rule__Compartment__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompartmentAccess().getGroup_3_0()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5842:7: ( rule__Compartment__Group_3_0__0 )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5842:8: rule__Compartment__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Compartment__Group_3_0__0_in_rule__Compartment__UnorderedGroup_3__Impl11814);
                    rule__Compartment__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompartmentAccess().getGroup_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5848:4: ({...}? => ( ( ( rule__Compartment__Group_3_1__0 ) ) ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5848:4: ({...}? => ( ( ( rule__Compartment__Group_3_1__0 ) ) ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5849:5: {...}? => ( ( ( rule__Compartment__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Compartment__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5849:108: ( ( ( rule__Compartment__Group_3_1__0 ) ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5850:6: ( ( rule__Compartment__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5856:6: ( ( rule__Compartment__Group_3_1__0 ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5858:7: ( rule__Compartment__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompartmentAccess().getGroup_3_1()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5859:7: ( rule__Compartment__Group_3_1__0 )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5859:8: rule__Compartment__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Compartment__Group_3_1__0_in_rule__Compartment__UnorderedGroup_3__Impl11905);
                    rule__Compartment__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompartmentAccess().getGroup_3_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5865:4: ({...}? => ( ( ( rule__Compartment__Group_3_2__0 ) ) ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5865:4: ({...}? => ( ( ( rule__Compartment__Group_3_2__0 ) ) ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5866:5: {...}? => ( ( ( rule__Compartment__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Compartment__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5866:108: ( ( ( rule__Compartment__Group_3_2__0 ) ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5867:6: ( ( rule__Compartment__Group_3_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5873:6: ( ( rule__Compartment__Group_3_2__0 ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5875:7: ( rule__Compartment__Group_3_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompartmentAccess().getGroup_3_2()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5876:7: ( rule__Compartment__Group_3_2__0 )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5876:8: rule__Compartment__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Compartment__Group_3_2__0_in_rule__Compartment__UnorderedGroup_3__Impl11996);
                    rule__Compartment__Group_3_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompartmentAccess().getGroup_3_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5882:4: ({...}? => ( ( ( rule__Compartment__Group_3_3__0 ) ) ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5882:4: ({...}? => ( ( ( rule__Compartment__Group_3_3__0 ) ) ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5883:5: {...}? => ( ( ( rule__Compartment__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Compartment__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3)");
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5883:108: ( ( ( rule__Compartment__Group_3_3__0 ) ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5884:6: ( ( rule__Compartment__Group_3_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3);
                    selected = true;
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5890:6: ( ( rule__Compartment__Group_3_3__0 ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5892:7: ( rule__Compartment__Group_3_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompartmentAccess().getGroup_3_3()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5893:7: ( rule__Compartment__Group_3_3__0 )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5893:8: rule__Compartment__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__Compartment__Group_3_3__0_in_rule__Compartment__UnorderedGroup_3__Impl12087);
                    rule__Compartment__Group_3_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompartmentAccess().getGroup_3_3()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5899:4: ({...}? => ( ( ( ( rule__Compartment__RdcsAssignment_3_4 ) ) ( ( ( rule__Compartment__RdcsAssignment_3_4 )=> rule__Compartment__RdcsAssignment_3_4 )* ) ) ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5899:4: ({...}? => ( ( ( ( rule__Compartment__RdcsAssignment_3_4 ) ) ( ( ( rule__Compartment__RdcsAssignment_3_4 )=> rule__Compartment__RdcsAssignment_3_4 )* ) ) ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5900:5: {...}? => ( ( ( ( rule__Compartment__RdcsAssignment_3_4 ) ) ( ( ( rule__Compartment__RdcsAssignment_3_4 )=> rule__Compartment__RdcsAssignment_3_4 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Compartment__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4)");
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5900:108: ( ( ( ( rule__Compartment__RdcsAssignment_3_4 ) ) ( ( ( rule__Compartment__RdcsAssignment_3_4 )=> rule__Compartment__RdcsAssignment_3_4 )* ) ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5901:6: ( ( ( rule__Compartment__RdcsAssignment_3_4 ) ) ( ( ( rule__Compartment__RdcsAssignment_3_4 )=> rule__Compartment__RdcsAssignment_3_4 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4);
                    selected = true;
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5907:6: ( ( ( rule__Compartment__RdcsAssignment_3_4 ) ) ( ( ( rule__Compartment__RdcsAssignment_3_4 )=> rule__Compartment__RdcsAssignment_3_4 )* ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5908:6: ( ( rule__Compartment__RdcsAssignment_3_4 ) ) ( ( ( rule__Compartment__RdcsAssignment_3_4 )=> rule__Compartment__RdcsAssignment_3_4 )* )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5908:6: ( ( rule__Compartment__RdcsAssignment_3_4 ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5909:7: ( rule__Compartment__RdcsAssignment_3_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompartmentAccess().getRdcsAssignment_3_4()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5910:7: ( rule__Compartment__RdcsAssignment_3_4 )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5910:8: rule__Compartment__RdcsAssignment_3_4
                    {
                    pushFollow(FOLLOW_rule__Compartment__RdcsAssignment_3_4_in_rule__Compartment__UnorderedGroup_3__Impl12179);
                    rule__Compartment__RdcsAssignment_3_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompartmentAccess().getRdcsAssignment_3_4()); 
                    }

                    }

                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5913:6: ( ( ( rule__Compartment__RdcsAssignment_3_4 )=> rule__Compartment__RdcsAssignment_3_4 )* )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5914:7: ( ( rule__Compartment__RdcsAssignment_3_4 )=> rule__Compartment__RdcsAssignment_3_4 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompartmentAccess().getRdcsAssignment_3_4()); 
                    }
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5915:7: ( ( rule__Compartment__RdcsAssignment_3_4 )=> rule__Compartment__RdcsAssignment_3_4 )*
                    loop32:
                    do {
                        int alt32=2;
                        alt32 = dfa32.predict(input);
                        switch (alt32) {
                    	case 1 :
                    	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5915:8: ( rule__Compartment__RdcsAssignment_3_4 )=> rule__Compartment__RdcsAssignment_3_4
                    	    {
                    	    pushFollow(FOLLOW_rule__Compartment__RdcsAssignment_3_4_in_rule__Compartment__UnorderedGroup_3__Impl12223);
                    	    rule__Compartment__RdcsAssignment_3_4();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompartmentAccess().getRdcsAssignment_3_4()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompartmentAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__Compartment__UnorderedGroup_3__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5930:1: rule__Compartment__UnorderedGroup_3__0 : rule__Compartment__UnorderedGroup_3__Impl ( rule__Compartment__UnorderedGroup_3__1 )? ;
    public final void rule__Compartment__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5934:1: ( rule__Compartment__UnorderedGroup_3__Impl ( rule__Compartment__UnorderedGroup_3__1 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5935:2: rule__Compartment__UnorderedGroup_3__Impl ( rule__Compartment__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__Compartment__UnorderedGroup_3__Impl_in_rule__Compartment__UnorderedGroup_3__012289);
            rule__Compartment__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5936:2: ( rule__Compartment__UnorderedGroup_3__1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( LA34_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0) ) {
                alt34=1;
            }
            else if ( LA34_0 ==70 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1) ) {
                alt34=1;
            }
            else if ( LA34_0 ==71 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2) ) {
                alt34=1;
            }
            else if ( LA34_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3) ) {
                alt34=1;
            }
            else if ( LA34_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5936:2: rule__Compartment__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__Compartment__UnorderedGroup_3__1_in_rule__Compartment__UnorderedGroup_3__012292);
                    rule__Compartment__UnorderedGroup_3__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__Compartment__UnorderedGroup_3__0"


    // $ANTLR start "rule__Compartment__UnorderedGroup_3__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5943:1: rule__Compartment__UnorderedGroup_3__1 : rule__Compartment__UnorderedGroup_3__Impl ( rule__Compartment__UnorderedGroup_3__2 )? ;
    public final void rule__Compartment__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5947:1: ( rule__Compartment__UnorderedGroup_3__Impl ( rule__Compartment__UnorderedGroup_3__2 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5948:2: rule__Compartment__UnorderedGroup_3__Impl ( rule__Compartment__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__Compartment__UnorderedGroup_3__Impl_in_rule__Compartment__UnorderedGroup_3__112317);
            rule__Compartment__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5949:2: ( rule__Compartment__UnorderedGroup_3__2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( LA35_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0) ) {
                alt35=1;
            }
            else if ( LA35_0 ==70 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1) ) {
                alt35=1;
            }
            else if ( LA35_0 ==71 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2) ) {
                alt35=1;
            }
            else if ( LA35_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3) ) {
                alt35=1;
            }
            else if ( LA35_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5949:2: rule__Compartment__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__Compartment__UnorderedGroup_3__2_in_rule__Compartment__UnorderedGroup_3__112320);
                    rule__Compartment__UnorderedGroup_3__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__Compartment__UnorderedGroup_3__1"


    // $ANTLR start "rule__Compartment__UnorderedGroup_3__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5956:1: rule__Compartment__UnorderedGroup_3__2 : rule__Compartment__UnorderedGroup_3__Impl ( rule__Compartment__UnorderedGroup_3__3 )? ;
    public final void rule__Compartment__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5960:1: ( rule__Compartment__UnorderedGroup_3__Impl ( rule__Compartment__UnorderedGroup_3__3 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5961:2: rule__Compartment__UnorderedGroup_3__Impl ( rule__Compartment__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_rule__Compartment__UnorderedGroup_3__Impl_in_rule__Compartment__UnorderedGroup_3__212345);
            rule__Compartment__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5962:2: ( rule__Compartment__UnorderedGroup_3__3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( LA36_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0) ) {
                alt36=1;
            }
            else if ( LA36_0 ==70 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1) ) {
                alt36=1;
            }
            else if ( LA36_0 ==71 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2) ) {
                alt36=1;
            }
            else if ( LA36_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3) ) {
                alt36=1;
            }
            else if ( LA36_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5962:2: rule__Compartment__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_rule__Compartment__UnorderedGroup_3__3_in_rule__Compartment__UnorderedGroup_3__212348);
                    rule__Compartment__UnorderedGroup_3__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__Compartment__UnorderedGroup_3__2"


    // $ANTLR start "rule__Compartment__UnorderedGroup_3__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5969:1: rule__Compartment__UnorderedGroup_3__3 : rule__Compartment__UnorderedGroup_3__Impl ( rule__Compartment__UnorderedGroup_3__4 )? ;
    public final void rule__Compartment__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5973:1: ( rule__Compartment__UnorderedGroup_3__Impl ( rule__Compartment__UnorderedGroup_3__4 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5974:2: rule__Compartment__UnorderedGroup_3__Impl ( rule__Compartment__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_rule__Compartment__UnorderedGroup_3__Impl_in_rule__Compartment__UnorderedGroup_3__312373);
            rule__Compartment__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5975:2: ( rule__Compartment__UnorderedGroup_3__4 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( LA37_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 0) ) {
                alt37=1;
            }
            else if ( LA37_0 ==70 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 1) ) {
                alt37=1;
            }
            else if ( LA37_0 ==71 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 2) ) {
                alt37=1;
            }
            else if ( LA37_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 3) ) {
                alt37=1;
            }
            else if ( LA37_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), 4) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5975:2: rule__Compartment__UnorderedGroup_3__4
                    {
                    pushFollow(FOLLOW_rule__Compartment__UnorderedGroup_3__4_in_rule__Compartment__UnorderedGroup_3__312376);
                    rule__Compartment__UnorderedGroup_3__4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__Compartment__UnorderedGroup_3__3"


    // $ANTLR start "rule__Compartment__UnorderedGroup_3__4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5982:1: rule__Compartment__UnorderedGroup_3__4 : rule__Compartment__UnorderedGroup_3__Impl ;
    public final void rule__Compartment__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5986:1: ( rule__Compartment__UnorderedGroup_3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5987:2: rule__Compartment__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__UnorderedGroup_3__Impl_in_rule__Compartment__UnorderedGroup_3__412401);
            rule__Compartment__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compartment__UnorderedGroup_3__4"


    // $ANTLR start "rule__AssistModel__SystemNameAssignment_4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6004:1: rule__AssistModel__SystemNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__AssistModel__SystemNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6008:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6009:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6009:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6010:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getSystemNameSTRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AssistModel__SystemNameAssignment_412439); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getSystemNameSTRINGTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__AssistModel__SystemNameAssignment_4"


    // $ANTLR start "rule__AssistModel__CompartmentsAssignment_7"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6019:1: rule__AssistModel__CompartmentsAssignment_7 : ( ruleCompartment ) ;
    public final void rule__AssistModel__CompartmentsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6023:1: ( ( ruleCompartment ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6024:1: ( ruleCompartment )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6024:1: ( ruleCompartment )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6025:1: ruleCompartment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getCompartmentsCompartmentParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleCompartment_in_rule__AssistModel__CompartmentsAssignment_712470);
            ruleCompartment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getCompartmentsCompartmentParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__AssistModel__CompartmentsAssignment_7"


    // $ANTLR start "rule__AssistModel__EqInterfacesAssignment_8_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6034:1: rule__AssistModel__EqInterfacesAssignment_8_2 : ( ruleEqInterface ) ;
    public final void rule__AssistModel__EqInterfacesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6038:1: ( ( ruleEqInterface ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6039:1: ( ruleEqInterface )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6039:1: ( ruleEqInterface )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6040:1: ruleEqInterface
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getEqInterfacesEqInterfaceParserRuleCall_8_2_0()); 
            }
            pushFollow(FOLLOW_ruleEqInterface_in_rule__AssistModel__EqInterfacesAssignment_8_212501);
            ruleEqInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getEqInterfacesEqInterfaceParserRuleCall_8_2_0()); 
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
    // $ANTLR end "rule__AssistModel__EqInterfacesAssignment_8_2"


    // $ANTLR start "rule__AssistModel__EqInterfaceGroupsAssignment_9_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6049:1: rule__AssistModel__EqInterfaceGroupsAssignment_9_2 : ( ruleEqInterfaceGroup ) ;
    public final void rule__AssistModel__EqInterfaceGroupsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6053:1: ( ( ruleEqInterfaceGroup ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6054:1: ( ruleEqInterfaceGroup )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6054:1: ( ruleEqInterfaceGroup )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6055:1: ruleEqInterfaceGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsEqInterfaceGroupParserRuleCall_9_2_0()); 
            }
            pushFollow(FOLLOW_ruleEqInterfaceGroup_in_rule__AssistModel__EqInterfaceGroupsAssignment_9_212532);
            ruleEqInterfaceGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getEqInterfaceGroupsEqInterfaceGroupParserRuleCall_9_2_0()); 
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
    // $ANTLR end "rule__AssistModel__EqInterfaceGroupsAssignment_9_2"


    // $ANTLR start "rule__AssistModel__DislocalityRelationsAssignment_10_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6064:1: rule__AssistModel__DislocalityRelationsAssignment_10_2 : ( ruleDislocalityRelation ) ;
    public final void rule__AssistModel__DislocalityRelationsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6068:1: ( ( ruleDislocalityRelation ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6069:1: ( ruleDislocalityRelation )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6069:1: ( ruleDislocalityRelation )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6070:1: ruleDislocalityRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssistModelAccess().getDislocalityRelationsDislocalityRelationParserRuleCall_10_2_0()); 
            }
            pushFollow(FOLLOW_ruleDislocalityRelation_in_rule__AssistModel__DislocalityRelationsAssignment_10_212563);
            ruleDislocalityRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssistModelAccess().getDislocalityRelationsDislocalityRelationParserRuleCall_10_2_0()); 
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
    // $ANTLR end "rule__AssistModel__DislocalityRelationsAssignment_10_2"


    // $ANTLR start "rule__Compartment__NameAssignment_1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6079:1: rule__Compartment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Compartment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6083:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6084:1: ( RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6084:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6085:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Compartment__NameAssignment_112594); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Compartment__NameAssignment_1"


    // $ANTLR start "rule__Compartment__ManufacturerAssignment_3_0_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6094:1: rule__Compartment__ManufacturerAssignment_3_0_2 : ( RULE_STRING ) ;
    public final void rule__Compartment__ManufacturerAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6098:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6099:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6099:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6100:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getManufacturerSTRINGTerminalRuleCall_3_0_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Compartment__ManufacturerAssignment_3_0_212625); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getManufacturerSTRINGTerminalRuleCall_3_0_2_0()); 
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
    // $ANTLR end "rule__Compartment__ManufacturerAssignment_3_0_2"


    // $ANTLR start "rule__Compartment__PowerSupplyAssignment_3_1_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6109:1: rule__Compartment__PowerSupplyAssignment_3_1_2 : ( RULE_STRING ) ;
    public final void rule__Compartment__PowerSupplyAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6113:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6114:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6114:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6115:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getPowerSupplySTRINGTerminalRuleCall_3_1_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Compartment__PowerSupplyAssignment_3_1_212656); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getPowerSupplySTRINGTerminalRuleCall_3_1_2_0()); 
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
    // $ANTLR end "rule__Compartment__PowerSupplyAssignment_3_1_2"


    // $ANTLR start "rule__Compartment__SideAssignment_3_2_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6124:1: rule__Compartment__SideAssignment_3_2_2 : ( RULE_STRING ) ;
    public final void rule__Compartment__SideAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6128:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6129:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6129:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6130:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getSideSTRINGTerminalRuleCall_3_2_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Compartment__SideAssignment_3_2_212687); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getSideSTRINGTerminalRuleCall_3_2_2_0()); 
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
    // $ANTLR end "rule__Compartment__SideAssignment_3_2_2"


    // $ANTLR start "rule__Compartment__ZoneAssignment_3_3_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6139:1: rule__Compartment__ZoneAssignment_3_3_2 : ( RULE_STRING ) ;
    public final void rule__Compartment__ZoneAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6143:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6144:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6144:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6145:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getZoneSTRINGTerminalRuleCall_3_3_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Compartment__ZoneAssignment_3_3_212718); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getZoneSTRINGTerminalRuleCall_3_3_2_0()); 
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
    // $ANTLR end "rule__Compartment__ZoneAssignment_3_3_2"


    // $ANTLR start "rule__Compartment__RdcsAssignment_3_4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6154:1: rule__Compartment__RdcsAssignment_3_4 : ( ruleRDC ) ;
    public final void rule__Compartment__RdcsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6158:1: ( ( ruleRDC ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6159:1: ( ruleRDC )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6159:1: ( ruleRDC )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6160:1: ruleRDC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompartmentAccess().getRdcsRDCParserRuleCall_3_4_0()); 
            }
            pushFollow(FOLLOW_ruleRDC_in_rule__Compartment__RdcsAssignment_3_412749);
            ruleRDC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompartmentAccess().getRdcsRDCParserRuleCall_3_4_0()); 
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
    // $ANTLR end "rule__Compartment__RdcsAssignment_3_4"


    // $ANTLR start "rule__RDC__NameAssignment_1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6169:1: rule__RDC__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RDC__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6173:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6174:1: ( RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6174:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6175:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RDC__NameAssignment_112780); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__RDC__NameAssignment_1"


    // $ANTLR start "rule__RDC__ManufacturerAssignment_3_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6184:1: rule__RDC__ManufacturerAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__RDC__ManufacturerAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6188:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6189:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6189:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6190:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getManufacturerSTRINGTerminalRuleCall_3_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RDC__ManufacturerAssignment_3_212811); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getManufacturerSTRINGTerminalRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__RDC__ManufacturerAssignment_3_2"


    // $ANTLR start "rule__RDC__PowerSupplyAssignment_4_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6199:1: rule__RDC__PowerSupplyAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__RDC__PowerSupplyAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6203:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6204:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6204:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6205:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getPowerSupplySTRINGTerminalRuleCall_4_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RDC__PowerSupplyAssignment_4_212842); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getPowerSupplySTRINGTerminalRuleCall_4_2_0()); 
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
    // $ANTLR end "rule__RDC__PowerSupplyAssignment_4_2"


    // $ANTLR start "rule__RDC__RdcTypeAssignment_5_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6214:1: rule__RDC__RdcTypeAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__RDC__RdcTypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6218:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6219:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6219:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6220:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getRdcTypeSTRINGTerminalRuleCall_5_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RDC__RdcTypeAssignment_5_212873); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getRdcTypeSTRINGTerminalRuleCall_5_2_0()); 
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
    // $ANTLR end "rule__RDC__RdcTypeAssignment_5_2"


    // $ANTLR start "rule__RDC__EssAssignment_6_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6229:1: rule__RDC__EssAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__RDC__EssAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6233:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6234:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6234:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6235:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getEssSTRINGTerminalRuleCall_6_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RDC__EssAssignment_6_212904); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getEssSTRINGTerminalRuleCall_6_2_0()); 
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
    // $ANTLR end "rule__RDC__EssAssignment_6_2"


    // $ANTLR start "rule__RDC__ConnectorsAssignment_7"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6244:1: rule__RDC__ConnectorsAssignment_7 : ( ruleConnector ) ;
    public final void rule__RDC__ConnectorsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6248:1: ( ( ruleConnector ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6249:1: ( ruleConnector )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6249:1: ( ruleConnector )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6250:1: ruleConnector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getConnectorsConnectorParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleConnector_in_rule__RDC__ConnectorsAssignment_712935);
            ruleConnector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getConnectorsConnectorParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__RDC__ConnectorsAssignment_7"


    // $ANTLR start "rule__RDC__MetricParametersAssignment_8_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6259:1: rule__RDC__MetricParametersAssignment_8_2 : ( ruleMetricParameter ) ;
    public final void rule__RDC__MetricParametersAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6263:1: ( ( ruleMetricParameter ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6264:1: ( ruleMetricParameter )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6264:1: ( ruleMetricParameter )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6265:1: ruleMetricParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRDCAccess().getMetricParametersMetricParameterParserRuleCall_8_2_0()); 
            }
            pushFollow(FOLLOW_ruleMetricParameter_in_rule__RDC__MetricParametersAssignment_8_212966);
            ruleMetricParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRDCAccess().getMetricParametersMetricParameterParserRuleCall_8_2_0()); 
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
    // $ANTLR end "rule__RDC__MetricParametersAssignment_8_2"


    // $ANTLR start "rule__Connector__NameAssignment_1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6274:1: rule__Connector__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6278:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6279:1: ( RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6279:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6280:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Connector__NameAssignment_112997); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Connector__NameAssignment_1"


    // $ANTLR start "rule__Connector__AvailableEqInterfacesAssignment_3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6289:1: rule__Connector__AvailableEqInterfacesAssignment_3 : ( ruleAvailableEqInterface ) ;
    public final void rule__Connector__AvailableEqInterfacesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6293:1: ( ( ruleAvailableEqInterface ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6294:1: ( ruleAvailableEqInterface )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6294:1: ( ruleAvailableEqInterface )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6295:1: ruleAvailableEqInterface
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getAvailableEqInterfacesAvailableEqInterfaceParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAvailableEqInterface_in_rule__Connector__AvailableEqInterfacesAssignment_313028);
            ruleAvailableEqInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getAvailableEqInterfacesAvailableEqInterfaceParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Connector__AvailableEqInterfacesAssignment_3"


    // $ANTLR start "rule__AvailableEqInterface__CountAssignment_0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6304:1: rule__AvailableEqInterface__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__AvailableEqInterface__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6308:1: ( ( RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6309:1: ( RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6309:1: ( RULE_INT )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6310:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvailableEqInterfaceAccess().getCountINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AvailableEqInterface__CountAssignment_013059); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvailableEqInterfaceAccess().getCountINTTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__AvailableEqInterface__CountAssignment_0"


    // $ANTLR start "rule__AvailableEqInterface__EqInterfaceTypeAssignment_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6319:1: rule__AvailableEqInterface__EqInterfaceTypeAssignment_2 : ( ruleEqInterfaceType ) ;
    public final void rule__AvailableEqInterface__EqInterfaceTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6323:1: ( ( ruleEqInterfaceType ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6324:1: ( ruleEqInterfaceType )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6324:1: ( ruleEqInterfaceType )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6325:1: ruleEqInterfaceType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvailableEqInterfaceAccess().getEqInterfaceTypeEqInterfaceTypeEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEqInterfaceType_in_rule__AvailableEqInterface__EqInterfaceTypeAssignment_213090);
            ruleEqInterfaceType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvailableEqInterfaceAccess().getEqInterfaceTypeEqInterfaceTypeEnumRuleCall_2_0()); 
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
    // $ANTLR end "rule__AvailableEqInterface__EqInterfaceTypeAssignment_2"


    // $ANTLR start "rule__EqInterfaceGroup__NameAssignment_1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6334:1: rule__EqInterfaceGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EqInterfaceGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6338:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6339:1: ( RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6339:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6340:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EqInterfaceGroup__NameAssignment_113121); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceGroupAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__EqInterfaceGroup__NameAssignment_1"


    // $ANTLR start "rule__EqInterfaceGroup__EqInterfacesAssignment_3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6349:1: rule__EqInterfaceGroup__EqInterfacesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__EqInterfaceGroup__EqInterfacesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6353:1: ( ( ( RULE_ID ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6354:1: ( ( RULE_ID ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6354:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6355:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_3_0()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6356:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6357:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EqInterfaceGroup__EqInterfacesAssignment_313156); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_3_0()); 
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
    // $ANTLR end "rule__EqInterfaceGroup__EqInterfacesAssignment_3"


    // $ANTLR start "rule__EqInterfaceGroup__EqInterfacesAssignment_4_1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6368:1: rule__EqInterfaceGroup__EqInterfacesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__EqInterfaceGroup__EqInterfacesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6372:1: ( ( ( RULE_ID ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6373:1: ( ( RULE_ID ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6373:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6374:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_4_1_0()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6375:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6376:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EqInterfaceGroup__EqInterfacesAssignment_4_113195); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceIDTerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesEqInterfaceCrossReference_4_1_0()); 
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
    // $ANTLR end "rule__EqInterfaceGroup__EqInterfacesAssignment_4_1"


    // $ANTLR start "rule__EqInterface__NameAssignment_1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6387:1: rule__EqInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EqInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6391:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6392:1: ( RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6392:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6393:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EqInterface__NameAssignment_113230); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__EqInterface__NameAssignment_1"


    // $ANTLR start "rule__EqInterface__SystemAssignment_3_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6402:1: rule__EqInterface__SystemAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__SystemAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6406:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6407:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6407:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6408:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getSystemSTRINGTerminalRuleCall_3_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__SystemAssignment_3_213261); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getSystemSTRINGTerminalRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__EqInterface__SystemAssignment_3_2"


    // $ANTLR start "rule__EqInterface__SubAtaAssignment_4_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6417:1: rule__EqInterface__SubAtaAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__SubAtaAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6421:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6422:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6422:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6423:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getSubAtaSTRINGTerminalRuleCall_4_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__SubAtaAssignment_4_213292); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getSubAtaSTRINGTerminalRuleCall_4_2_0()); 
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
    // $ANTLR end "rule__EqInterface__SubAtaAssignment_4_2"


    // $ANTLR start "rule__EqInterface__ResourceAssignment_5_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6432:1: rule__EqInterface__ResourceAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__ResourceAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6436:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6437:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6437:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6438:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getResourceSTRINGTerminalRuleCall_5_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__ResourceAssignment_5_213323); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getResourceSTRINGTerminalRuleCall_5_2_0()); 
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
    // $ANTLR end "rule__EqInterface__ResourceAssignment_5_2"


    // $ANTLR start "rule__EqInterface__LineNameAssignment_6_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6447:1: rule__EqInterface__LineNameAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__LineNameAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6451:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6452:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6452:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6453:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getLineNameSTRINGTerminalRuleCall_6_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__LineNameAssignment_6_213354); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getLineNameSTRINGTerminalRuleCall_6_2_0()); 
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
    // $ANTLR end "rule__EqInterface__LineNameAssignment_6_2"


    // $ANTLR start "rule__EqInterface__WiringLaneAssignment_7_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6462:1: rule__EqInterface__WiringLaneAssignment_7_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__WiringLaneAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6466:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6467:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6467:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6468:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getWiringLaneSTRINGTerminalRuleCall_7_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__WiringLaneAssignment_7_213385); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getWiringLaneSTRINGTerminalRuleCall_7_2_0()); 
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
    // $ANTLR end "rule__EqInterface__WiringLaneAssignment_7_2"


    // $ANTLR start "rule__EqInterface__GrpInfoAssignment_8_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6477:1: rule__EqInterface__GrpInfoAssignment_8_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__GrpInfoAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6481:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6482:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6482:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6483:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getGrpInfoSTRINGTerminalRuleCall_8_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__GrpInfoAssignment_8_213416); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getGrpInfoSTRINGTerminalRuleCall_8_2_0()); 
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
    // $ANTLR end "rule__EqInterface__GrpInfoAssignment_8_2"


    // $ANTLR start "rule__EqInterface__RouteAssignment_9_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6492:1: rule__EqInterface__RouteAssignment_9_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__RouteAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6496:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6497:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6497:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6498:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getRouteSTRINGTerminalRuleCall_9_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__RouteAssignment_9_213447); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getRouteSTRINGTerminalRuleCall_9_2_0()); 
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
    // $ANTLR end "rule__EqInterface__RouteAssignment_9_2"


    // $ANTLR start "rule__EqInterface__PwSup1Assignment_10_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6507:1: rule__EqInterface__PwSup1Assignment_10_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__PwSup1Assignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6511:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6512:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6512:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6513:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getPwSup1STRINGTerminalRuleCall_10_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__PwSup1Assignment_10_213478); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getPwSup1STRINGTerminalRuleCall_10_2_0()); 
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
    // $ANTLR end "rule__EqInterface__PwSup1Assignment_10_2"


    // $ANTLR start "rule__EqInterface__EmhZone1Assignment_11_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6522:1: rule__EqInterface__EmhZone1Assignment_11_2 : ( RULE_STRING ) ;
    public final void rule__EqInterface__EmhZone1Assignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6526:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6527:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6527:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6528:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getEmhZone1STRINGTerminalRuleCall_11_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqInterface__EmhZone1Assignment_11_213509); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getEmhZone1STRINGTerminalRuleCall_11_2_0()); 
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
    // $ANTLR end "rule__EqInterface__EmhZone1Assignment_11_2"


    // $ANTLR start "rule__EqInterface__IoTypeAssignment_12_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6537:1: rule__EqInterface__IoTypeAssignment_12_2 : ( ruleEqInterfaceType ) ;
    public final void rule__EqInterface__IoTypeAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6541:1: ( ( ruleEqInterfaceType ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6542:1: ( ruleEqInterfaceType )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6542:1: ( ruleEqInterfaceType )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6543:1: ruleEqInterfaceType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getIoTypeEqInterfaceTypeEnumRuleCall_12_2_0()); 
            }
            pushFollow(FOLLOW_ruleEqInterfaceType_in_rule__EqInterface__IoTypeAssignment_12_213540);
            ruleEqInterfaceType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getIoTypeEqInterfaceTypeEnumRuleCall_12_2_0()); 
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
    // $ANTLR end "rule__EqInterface__IoTypeAssignment_12_2"


    // $ANTLR start "rule__EqInterface__MetricParametersAssignment_13_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6552:1: rule__EqInterface__MetricParametersAssignment_13_2 : ( ruleMetricParameter ) ;
    public final void rule__EqInterface__MetricParametersAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6556:1: ( ( ruleMetricParameter ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6557:1: ( ruleMetricParameter )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6557:1: ( ruleMetricParameter )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6558:1: ruleMetricParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqInterfaceAccess().getMetricParametersMetricParameterParserRuleCall_13_2_0()); 
            }
            pushFollow(FOLLOW_ruleMetricParameter_in_rule__EqInterface__MetricParametersAssignment_13_213571);
            ruleMetricParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqInterfaceAccess().getMetricParametersMetricParameterParserRuleCall_13_2_0()); 
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
    // $ANTLR end "rule__EqInterface__MetricParametersAssignment_13_2"


    // $ANTLR start "rule__DislocalityRelation__EqInterfaceGroupAssignment_0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6567:1: rule__DislocalityRelation__EqInterfaceGroupAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DislocalityRelation__EqInterfaceGroupAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6571:1: ( ( ( RULE_ID ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6572:1: ( ( RULE_ID ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6572:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6573:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDislocalityRelationAccess().getEqInterfaceGroupEqInterfaceGroupCrossReference_0_0()); 
            }
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6574:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6575:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDislocalityRelationAccess().getEqInterfaceGroupEqInterfaceGroupIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DislocalityRelation__EqInterfaceGroupAssignment_013606); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDislocalityRelationAccess().getEqInterfaceGroupEqInterfaceGroupIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDislocalityRelationAccess().getEqInterfaceGroupEqInterfaceGroupCrossReference_0_0()); 
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
    // $ANTLR end "rule__DislocalityRelation__EqInterfaceGroupAssignment_0"


    // $ANTLR start "rule__DislocalityRelation__HardwareLevelAssignment_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6586:1: rule__DislocalityRelation__HardwareLevelAssignment_2 : ( ruleHardwareArchitectureLevelType ) ;
    public final void rule__DislocalityRelation__HardwareLevelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6590:1: ( ( ruleHardwareArchitectureLevelType ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6591:1: ( ruleHardwareArchitectureLevelType )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6591:1: ( ruleHardwareArchitectureLevelType )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6592:1: ruleHardwareArchitectureLevelType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDislocalityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleHardwareArchitectureLevelType_in_rule__DislocalityRelation__HardwareLevelAssignment_213641);
            ruleHardwareArchitectureLevelType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDislocalityRelationAccess().getHardwareLevelHardwareArchitectureLevelTypeEnumRuleCall_2_0()); 
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
    // $ANTLR end "rule__DislocalityRelation__HardwareLevelAssignment_2"


    // $ANTLR start "rule__MetricParameter__NameAssignment_0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6601:1: rule__MetricParameter__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MetricParameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6605:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6606:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6606:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6607:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricParameterAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MetricParameter__NameAssignment_013672); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricParameterAccess().getNameSTRINGTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__MetricParameter__NameAssignment_0"


    // $ANTLR start "rule__MetricParameter__ValueAssignment_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6616:1: rule__MetricParameter__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__MetricParameter__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6620:1: ( ( RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6621:1: ( RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6621:1: ( RULE_INT )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6622:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricParameterAccess().getValueINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__MetricParameter__ValueAssignment_213703); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricParameterAccess().getValueINTTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__MetricParameter__ValueAssignment_2"

    // $ANTLR start synpred1_InternalMappingDSL
    public final void synpred1_InternalMappingDSL_fragment() throws RecognitionException {   
        // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5915:8: ( rule__Compartment__RdcsAssignment_3_4 )
        // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5915:9: rule__Compartment__RdcsAssignment_3_4
        {
        pushFollow(FOLLOW_rule__Compartment__RdcsAssignment_3_4_in_synpred1_InternalMappingDSL12220);
        rule__Compartment__RdcsAssignment_3_4();

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


    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA32_eotS =
        "\u0088\uffff";
    static final String DFA32_eofS =
        "\u0088\uffff";
    static final String DFA32_minS =
        "\1\14\1\uffff\1\5\1\75\1\15\4\77\1\5\4\4\1\75\4\100\1\6\4\15\1"+
        "\114\1\15\1\16\1\5\1\75\1\0\56\100\1\75\1\4\1\uffff\2\6\1\77\1\101"+
        "\1\114\1\15\1\6\1\16\57\100\1\4\1\6";
    static final String DFA32_maxS =
        "\1\110\1\uffff\1\5\1\75\1\112\4\77\1\5\4\4\1\75\4\100\1\101\3\112"+
        "\1\15\1\114\1\113\1\73\1\5\1\75\1\0\56\100\1\75\1\101\1\uffff\2"+
        "\101\1\77\1\101\1\114\1\113\1\6\1\73\57\100\2\101";
    static final String DFA32_acceptS =
        "\1\uffff\1\2\114\uffff\1\1\71\uffff";
    static final String DFA32_specialS =
        "\35\uffff\1\0\152\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\2\64\uffff\1\1\3\uffff\4\1",
            "",
            "\1\3",
            "\1\4",
            "\1\11\67\uffff\1\5\1\6\2\uffff\1\7\1\10",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30\72\uffff\1\31",
            "\1\11\70\uffff\1\6\2\uffff\1\7\1\10",
            "\1\11\73\uffff\1\7\1\10",
            "\1\11\74\uffff\1\10",
            "\1\11",
            "\1\32",
            "\1\33\63\uffff\1\35\11\uffff\1\34",
            "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1"+
            "\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1"+
            "\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100"+
            "\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112"+
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\uffff",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\120",
            "\1\121\74\uffff\1\122",
            "",
            "\1\30\72\uffff\1\31",
            "\1\123\72\uffff\1\124",
            "\1\125",
            "\1\35",
            "\1\126",
            "\1\33\63\uffff\1\35\11\uffff\1\34",
            "\1\127",
            "\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141"+
            "\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153"+
            "\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165"+
            "\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177"+
            "\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\u0087",
            "\1\121\74\uffff\1\122",
            "\1\123\72\uffff\1\124"
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "()* loopback of 5915:7: ( ( rule__Compartment__RdcsAssignment_3_4 )=> rule__Compartment__RdcsAssignment_3_4 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_29 = input.LA(1);

                         
                        int index32_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMappingDSL()) ) {s = 78;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_29);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

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
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_entryRuleDislocalityRelation481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDislocalityRelation488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DislocalityRelation__Group__0_in_ruleDislocalityRelation514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricParameter548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__0_in_ruleMetricParameter574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HardwareArchitectureLevelType__Alternatives_in_ruleHardwareArchitectureLevelType613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceType__Alternatives_in_ruleEqInterfaceType649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__HardwareArchitectureLevelType__Alternatives685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__HardwareArchitectureLevelType__Alternatives706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HardwareArchitectureLevelType__Alternatives727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EqInterfaceType__Alternatives763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EqInterfaceType__Alternatives784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EqInterfaceType__Alternatives805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EqInterfaceType__Alternatives826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EqInterfaceType__Alternatives847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EqInterfaceType__Alternatives868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EqInterfaceType__Alternatives889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EqInterfaceType__Alternatives910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EqInterfaceType__Alternatives931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EqInterfaceType__Alternatives952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EqInterfaceType__Alternatives973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EqInterfaceType__Alternatives994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EqInterfaceType__Alternatives1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EqInterfaceType__Alternatives1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EqInterfaceType__Alternatives1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EqInterfaceType__Alternatives1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EqInterfaceType__Alternatives1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EqInterfaceType__Alternatives1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EqInterfaceType__Alternatives1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EqInterfaceType__Alternatives1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EqInterfaceType__Alternatives1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EqInterfaceType__Alternatives1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EqInterfaceType__Alternatives1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EqInterfaceType__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EqInterfaceType__Alternatives1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EqInterfaceType__Alternatives1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EqInterfaceType__Alternatives1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EqInterfaceType__Alternatives1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EqInterfaceType__Alternatives1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EqInterfaceType__Alternatives1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EqInterfaceType__Alternatives1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EqInterfaceType__Alternatives1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__EqInterfaceType__Alternatives1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EqInterfaceType__Alternatives1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__EqInterfaceType__Alternatives1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__EqInterfaceType__Alternatives1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__EqInterfaceType__Alternatives1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__EqInterfaceType__Alternatives1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__EqInterfaceType__Alternatives1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__EqInterfaceType__Alternatives1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__EqInterfaceType__Alternatives1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__EqInterfaceType__Alternatives1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__EqInterfaceType__Alternatives1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__EqInterfaceType__Alternatives1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__EqInterfaceType__Alternatives1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__EqInterfaceType__Alternatives1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__0__Impl_in_rule__AssistModel__Group__01741 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__1_in_rule__AssistModel__Group__01744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__AssistModel__Group__0__Impl1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__1__Impl_in_rule__AssistModel__Group__11803 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__2_in_rule__AssistModel__Group__11806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__AssistModel__Group__1__Impl1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__2__Impl_in_rule__AssistModel__Group__21865 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__3_in_rule__AssistModel__Group__21868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__AssistModel__Group__2__Impl1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__3__Impl_in_rule__AssistModel__Group__31927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__4_in_rule__AssistModel__Group__31930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__AssistModel__Group__3__Impl1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__4__Impl_in_rule__AssistModel__Group__41989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__5_in_rule__AssistModel__Group__41992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__SystemNameAssignment_4_in_rule__AssistModel__Group__4__Impl2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__5__Impl_in_rule__AssistModel__Group__52049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__6_in_rule__AssistModel__Group__52052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__AssistModel__Group__5__Impl2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__6__Impl_in_rule__AssistModel__Group__62111 = new BitSet(new long[]{0x0000000000000800L,0x000000000000001CL});
    public static final BitSet FOLLOW_rule__AssistModel__Group__7_in_rule__AssistModel__Group__62114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__AssistModel__Group__6__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__7__Impl_in_rule__AssistModel__Group__72173 = new BitSet(new long[]{0x0000000000000800L,0x000000000000001CL});
    public static final BitSet FOLLOW_rule__AssistModel__Group__8_in_rule__AssistModel__Group__72176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__CompartmentsAssignment_7_in_rule__AssistModel__Group__7__Impl2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__8__Impl_in_rule__AssistModel__Group__82234 = new BitSet(new long[]{0x0000000000000800L,0x000000000000001CL});
    public static final BitSet FOLLOW_rule__AssistModel__Group__9_in_rule__AssistModel__Group__82237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_8__0_in_rule__AssistModel__Group__8__Impl2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__9__Impl_in_rule__AssistModel__Group__92295 = new BitSet(new long[]{0x0000000000000800L,0x000000000000001CL});
    public static final BitSet FOLLOW_rule__AssistModel__Group__10_in_rule__AssistModel__Group__92298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_9__0_in_rule__AssistModel__Group__9__Impl2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__10__Impl_in_rule__AssistModel__Group__102356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_10__0_in_rule__AssistModel__Group__10__Impl2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_8__0__Impl_in_rule__AssistModel__Group_8__02436 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_8__1_in_rule__AssistModel__Group_8__02439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__AssistModel__Group_8__0__Impl2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_8__1__Impl_in_rule__AssistModel__Group_8__12498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_8__2_in_rule__AssistModel__Group_8__12501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__AssistModel__Group_8__1__Impl2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_8__2__Impl_in_rule__AssistModel__Group_8__22560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_8__3_in_rule__AssistModel__Group_8__22563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__EqInterfacesAssignment_8_2_in_rule__AssistModel__Group_8__2__Impl2592 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_rule__AssistModel__EqInterfacesAssignment_8_2_in_rule__AssistModel__Group_8__2__Impl2604 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_8__3__Impl_in_rule__AssistModel__Group_8__32637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__AssistModel__Group_8__3__Impl2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_9__0__Impl_in_rule__AssistModel__Group_9__02704 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_9__1_in_rule__AssistModel__Group_9__02707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__AssistModel__Group_9__0__Impl2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_9__1__Impl_in_rule__AssistModel__Group_9__12766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_9__2_in_rule__AssistModel__Group_9__12769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__AssistModel__Group_9__1__Impl2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_9__2__Impl_in_rule__AssistModel__Group_9__22828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_9__3_in_rule__AssistModel__Group_9__22831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__EqInterfaceGroupsAssignment_9_2_in_rule__AssistModel__Group_9__2__Impl2860 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AssistModel__EqInterfaceGroupsAssignment_9_2_in_rule__AssistModel__Group_9__2__Impl2872 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_9__3__Impl_in_rule__AssistModel__Group_9__32905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__AssistModel__Group_9__3__Impl2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_10__0__Impl_in_rule__AssistModel__Group_10__02972 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_10__1_in_rule__AssistModel__Group_10__02975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__AssistModel__Group_10__0__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_10__1__Impl_in_rule__AssistModel__Group_10__13034 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_10__2_in_rule__AssistModel__Group_10__13037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__AssistModel__Group_10__1__Impl3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_10__2__Impl_in_rule__AssistModel__Group_10__23096 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_10__3_in_rule__AssistModel__Group_10__23099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__DislocalityRelationsAssignment_10_2_in_rule__AssistModel__Group_10__2__Impl3126 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__AssistModel__Group_10__3__Impl_in_rule__AssistModel__Group_10__33157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__AssistModel__Group_10__3__Impl3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__0__Impl_in_rule__Compartment__Group__03224 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Compartment__Group__1_in_rule__Compartment__Group__03227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Compartment__Group__0__Impl3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__1__Impl_in_rule__Compartment__Group__13286 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group__2_in_rule__Compartment__Group__13289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__NameAssignment_1_in_rule__Compartment__Group__1__Impl3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__2__Impl_in_rule__Compartment__Group__23346 = new BitSet(new long[]{0x0000000000001000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_rule__Compartment__Group__3_in_rule__Compartment__Group__23349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Compartment__Group__2__Impl3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__3__Impl_in_rule__Compartment__Group__33408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__4_in_rule__Compartment__Group__33411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__UnorderedGroup_3_in_rule__Compartment__Group__3__Impl3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__4__Impl_in_rule__Compartment__Group__43468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__Compartment__Group__4__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_0__0__Impl_in_rule__Compartment__Group_3_0__03537 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_0__1_in_rule__Compartment__Group_3_0__03540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__Compartment__Group_3_0__0__Impl3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_0__1__Impl_in_rule__Compartment__Group_3_0__13599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_0__2_in_rule__Compartment__Group_3_0__13602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__Compartment__Group_3_0__1__Impl3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_0__2__Impl_in_rule__Compartment__Group_3_0__23661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_0__3_in_rule__Compartment__Group_3_0__23664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__ManufacturerAssignment_3_0_2_in_rule__Compartment__Group_3_0__2__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_0__3__Impl_in_rule__Compartment__Group_3_0__33721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__Compartment__Group_3_0__3__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_1__0__Impl_in_rule__Compartment__Group_3_1__03788 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_1__1_in_rule__Compartment__Group_3_1__03791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__Compartment__Group_3_1__0__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_1__1__Impl_in_rule__Compartment__Group_3_1__13850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_1__2_in_rule__Compartment__Group_3_1__13853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__Compartment__Group_3_1__1__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_1__2__Impl_in_rule__Compartment__Group_3_1__23912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_1__3_in_rule__Compartment__Group_3_1__23915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__PowerSupplyAssignment_3_1_2_in_rule__Compartment__Group_3_1__2__Impl3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_1__3__Impl_in_rule__Compartment__Group_3_1__33972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__Compartment__Group_3_1__3__Impl4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_2__0__Impl_in_rule__Compartment__Group_3_2__04039 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_2__1_in_rule__Compartment__Group_3_2__04042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__Compartment__Group_3_2__0__Impl4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_2__1__Impl_in_rule__Compartment__Group_3_2__14101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_2__2_in_rule__Compartment__Group_3_2__14104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__Compartment__Group_3_2__1__Impl4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_2__2__Impl_in_rule__Compartment__Group_3_2__24163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_2__3_in_rule__Compartment__Group_3_2__24166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__SideAssignment_3_2_2_in_rule__Compartment__Group_3_2__2__Impl4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_2__3__Impl_in_rule__Compartment__Group_3_2__34223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__Compartment__Group_3_2__3__Impl4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_3__0__Impl_in_rule__Compartment__Group_3_3__04290 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_3__1_in_rule__Compartment__Group_3_3__04293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__Compartment__Group_3_3__0__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_3__1__Impl_in_rule__Compartment__Group_3_3__14352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_3__2_in_rule__Compartment__Group_3_3__14355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__Compartment__Group_3_3__1__Impl4383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_3__2__Impl_in_rule__Compartment__Group_3_3__24414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_3__3_in_rule__Compartment__Group_3_3__24417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__ZoneAssignment_3_3_2_in_rule__Compartment__Group_3_3__2__Impl4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_3__3__Impl_in_rule__Compartment__Group_3_3__34474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__Compartment__Group_3_3__3__Impl4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__0__Impl_in_rule__RDC__Group__04541 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RDC__Group__1_in_rule__RDC__Group__04544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RDC__Group__0__Impl4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__1__Impl_in_rule__RDC__Group__14603 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group__2_in_rule__RDC__Group__14606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__NameAssignment_1_in_rule__RDC__Group__1__Impl4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__2__Impl_in_rule__RDC__Group__24663 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000660L});
    public static final BitSet FOLLOW_rule__RDC__Group__3_in_rule__RDC__Group__24666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__RDC__Group__2__Impl4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__3__Impl_in_rule__RDC__Group__34725 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000660L});
    public static final BitSet FOLLOW_rule__RDC__Group__4_in_rule__RDC__Group__34728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__0_in_rule__RDC__Group__3__Impl4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__4__Impl_in_rule__RDC__Group__44786 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000660L});
    public static final BitSet FOLLOW_rule__RDC__Group__5_in_rule__RDC__Group__44789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__0_in_rule__RDC__Group__4__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__5__Impl_in_rule__RDC__Group__54847 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000660L});
    public static final BitSet FOLLOW_rule__RDC__Group__6_in_rule__RDC__Group__54850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__0_in_rule__RDC__Group__5__Impl4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__6__Impl_in_rule__RDC__Group__64908 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000660L});
    public static final BitSet FOLLOW_rule__RDC__Group__7_in_rule__RDC__Group__64911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__0_in_rule__RDC__Group__6__Impl4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__7__Impl_in_rule__RDC__Group__74969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_rule__RDC__Group__8_in_rule__RDC__Group__74972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__ConnectorsAssignment_7_in_rule__RDC__Group__7__Impl5001 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000660L});
    public static final BitSet FOLLOW_rule__RDC__ConnectorsAssignment_7_in_rule__RDC__Group__7__Impl5013 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000660L});
    public static final BitSet FOLLOW_rule__RDC__Group__8__Impl_in_rule__RDC__Group__85046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_rule__RDC__Group__9_in_rule__RDC__Group__85049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__0_in_rule__RDC__Group__8__Impl5076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__9__Impl_in_rule__RDC__Group__95107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__RDC__Group__9__Impl5135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__0__Impl_in_rule__RDC__Group_3__05186 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__1_in_rule__RDC__Group_3__05189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__RDC__Group_3__0__Impl5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__1__Impl_in_rule__RDC__Group_3__15248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__2_in_rule__RDC__Group_3__15251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__RDC__Group_3__1__Impl5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__2__Impl_in_rule__RDC__Group_3__25310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__3_in_rule__RDC__Group_3__25313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__ManufacturerAssignment_3_2_in_rule__RDC__Group_3__2__Impl5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__3__Impl_in_rule__RDC__Group_3__35370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__RDC__Group_3__3__Impl5398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__0__Impl_in_rule__RDC__Group_4__05437 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__1_in_rule__RDC__Group_4__05440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__RDC__Group_4__0__Impl5468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__1__Impl_in_rule__RDC__Group_4__15499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__2_in_rule__RDC__Group_4__15502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__RDC__Group_4__1__Impl5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__2__Impl_in_rule__RDC__Group_4__25561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__3_in_rule__RDC__Group_4__25564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__PowerSupplyAssignment_4_2_in_rule__RDC__Group_4__2__Impl5591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__3__Impl_in_rule__RDC__Group_4__35621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__RDC__Group_4__3__Impl5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__0__Impl_in_rule__RDC__Group_5__05688 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__1_in_rule__RDC__Group_5__05691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__RDC__Group_5__0__Impl5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__1__Impl_in_rule__RDC__Group_5__15750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__2_in_rule__RDC__Group_5__15753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__RDC__Group_5__1__Impl5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__2__Impl_in_rule__RDC__Group_5__25812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__3_in_rule__RDC__Group_5__25815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__RdcTypeAssignment_5_2_in_rule__RDC__Group_5__2__Impl5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__3__Impl_in_rule__RDC__Group_5__35872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__RDC__Group_5__3__Impl5900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__0__Impl_in_rule__RDC__Group_6__05939 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__1_in_rule__RDC__Group_6__05942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__RDC__Group_6__0__Impl5970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__1__Impl_in_rule__RDC__Group_6__16001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__2_in_rule__RDC__Group_6__16004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__RDC__Group_6__1__Impl6032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__2__Impl_in_rule__RDC__Group_6__26063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__3_in_rule__RDC__Group_6__26066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__EssAssignment_6_2_in_rule__RDC__Group_6__2__Impl6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__3__Impl_in_rule__RDC__Group_6__36123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__RDC__Group_6__3__Impl6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__0__Impl_in_rule__RDC__Group_8__06190 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__1_in_rule__RDC__Group_8__06193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__RDC__Group_8__0__Impl6221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__1__Impl_in_rule__RDC__Group_8__16252 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__2_in_rule__RDC__Group_8__16255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__RDC__Group_8__1__Impl6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__2__Impl_in_rule__RDC__Group_8__26314 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__3_in_rule__RDC__Group_8__26317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__MetricParametersAssignment_8_2_in_rule__RDC__Group_8__2__Impl6344 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__3__Impl_in_rule__RDC__Group_8__36375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__RDC__Group_8__3__Impl6403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__0__Impl_in_rule__Connector__Group__06442 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Connector__Group__1_in_rule__Connector__Group__06445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Connector__Group__0__Impl6473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__1__Impl_in_rule__Connector__Group__16504 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Connector__Group__2_in_rule__Connector__Group__16507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__NameAssignment_1_in_rule__Connector__Group__1__Impl6534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__2__Impl_in_rule__Connector__Group__26564 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__3_in_rule__Connector__Group__26567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Connector__Group__2__Impl6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__3__Impl_in_rule__Connector__Group__36626 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__4_in_rule__Connector__Group__36629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__AvailableEqInterfacesAssignment_3_in_rule__Connector__Group__3__Impl6656 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Connector__Group__4__Impl_in_rule__Connector__Group__46687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__Connector__Group__4__Impl6715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__Group__0__Impl_in_rule__AvailableEqInterface__Group__06756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__Group__1_in_rule__AvailableEqInterface__Group__06759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__CountAssignment_0_in_rule__AvailableEqInterface__Group__0__Impl6786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__Group__1__Impl_in_rule__AvailableEqInterface__Group__16816 = new BitSet(new long[]{0x0FFFFFFFFFFFC000L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__Group__2_in_rule__AvailableEqInterface__Group__16819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__AvailableEqInterface__Group__1__Impl6847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__Group__2__Impl_in_rule__AvailableEqInterface__Group__26878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__Group__3_in_rule__AvailableEqInterface__Group__26881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__EqInterfaceTypeAssignment_2_in_rule__AvailableEqInterface__Group__2__Impl6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableEqInterface__Group__3__Impl_in_rule__AvailableEqInterface__Group__36938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__AvailableEqInterface__Group__3__Impl6966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__0__Impl_in_rule__EqInterfaceGroup__Group__07005 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__1_in_rule__EqInterfaceGroup__Group__07008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__EqInterfaceGroup__Group__0__Impl7036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__1__Impl_in_rule__EqInterfaceGroup__Group__17067 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__2_in_rule__EqInterfaceGroup__Group__17070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__NameAssignment_1_in_rule__EqInterfaceGroup__Group__1__Impl7097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__2__Impl_in_rule__EqInterfaceGroup__Group__27127 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__3_in_rule__EqInterfaceGroup__Group__27130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__EqInterfaceGroup__Group__2__Impl7158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__3__Impl_in_rule__EqInterfaceGroup__Group__37189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__4_in_rule__EqInterfaceGroup__Group__37192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__EqInterfacesAssignment_3_in_rule__EqInterfaceGroup__Group__3__Impl7219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__4__Impl_in_rule__EqInterfaceGroup__Group__47249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__5_in_rule__EqInterfaceGroup__Group__47252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group_4__0_in_rule__EqInterfaceGroup__Group__4__Impl7281 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group_4__0_in_rule__EqInterfaceGroup__Group__4__Impl7293 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group__5__Impl_in_rule__EqInterfaceGroup__Group__57326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__EqInterfaceGroup__Group__5__Impl7354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group_4__0__Impl_in_rule__EqInterfaceGroup__Group_4__07397 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group_4__1_in_rule__EqInterfaceGroup__Group_4__07400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__EqInterfaceGroup__Group_4__0__Impl7428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__Group_4__1__Impl_in_rule__EqInterfaceGroup__Group_4__17459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterfaceGroup__EqInterfacesAssignment_4_1_in_rule__EqInterfaceGroup__Group_4__1__Impl7486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__0__Impl_in_rule__EqInterface__Group__07520 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__1_in_rule__EqInterface__Group__07523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rule__EqInterface__Group__0__Impl7551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__1__Impl_in_rule__EqInterface__Group__17582 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__2_in_rule__EqInterface__Group__17585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__NameAssignment_1_in_rule__EqInterface__Group__1__Impl7612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__2__Impl_in_rule__EqInterface__Group__27642 = new BitSet(new long[]{0x0000000000000000L,0x0000000001FF0A02L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__3_in_rule__EqInterface__Group__27645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__EqInterface__Group__2__Impl7673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__3__Impl_in_rule__EqInterface__Group__37704 = new BitSet(new long[]{0x0000000000000000L,0x0000000001FF0A02L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__4_in_rule__EqInterface__Group__37707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_3__0_in_rule__EqInterface__Group__3__Impl7734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__4__Impl_in_rule__EqInterface__Group__47765 = new BitSet(new long[]{0x0000000000000000L,0x0000000001FF0A02L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__5_in_rule__EqInterface__Group__47768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_4__0_in_rule__EqInterface__Group__4__Impl7795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__5__Impl_in_rule__EqInterface__Group__57826 = new BitSet(new long[]{0x0000000000000000L,0x0000000001FF0A02L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__6_in_rule__EqInterface__Group__57829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_5__0_in_rule__EqInterface__Group__5__Impl7856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__6__Impl_in_rule__EqInterface__Group__67887 = new BitSet(new long[]{0x0000000000000000L,0x0000000001FF0A02L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__7_in_rule__EqInterface__Group__67890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_6__0_in_rule__EqInterface__Group__6__Impl7917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__7__Impl_in_rule__EqInterface__Group__77948 = new BitSet(new long[]{0x0000000000000000L,0x0000000001FF0A02L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__8_in_rule__EqInterface__Group__77951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_7__0_in_rule__EqInterface__Group__7__Impl7978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__8__Impl_in_rule__EqInterface__Group__88009 = new BitSet(new long[]{0x0000000000000000L,0x0000000001FF0A02L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__9_in_rule__EqInterface__Group__88012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_8__0_in_rule__EqInterface__Group__8__Impl8039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__9__Impl_in_rule__EqInterface__Group__98070 = new BitSet(new long[]{0x0000000000000000L,0x0000000001FF0A02L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__10_in_rule__EqInterface__Group__98073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_9__0_in_rule__EqInterface__Group__9__Impl8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__10__Impl_in_rule__EqInterface__Group__108131 = new BitSet(new long[]{0x0000000000000000L,0x0000000001FF0A02L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__11_in_rule__EqInterface__Group__108134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_10__0_in_rule__EqInterface__Group__10__Impl8161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__11__Impl_in_rule__EqInterface__Group__118192 = new BitSet(new long[]{0x0000000000000000L,0x0000000001FF0A02L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__12_in_rule__EqInterface__Group__118195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_11__0_in_rule__EqInterface__Group__11__Impl8222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__12__Impl_in_rule__EqInterface__Group__128253 = new BitSet(new long[]{0x0000000000000000L,0x0000000001FF0A02L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__13_in_rule__EqInterface__Group__128256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_12__0_in_rule__EqInterface__Group__12__Impl8283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__13__Impl_in_rule__EqInterface__Group__138314 = new BitSet(new long[]{0x0000000000000000L,0x0000000001FF0A02L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__14_in_rule__EqInterface__Group__138317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_13__0_in_rule__EqInterface__Group__13__Impl8344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group__14__Impl_in_rule__EqInterface__Group__148375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__EqInterface__Group__14__Impl8403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_3__0__Impl_in_rule__EqInterface__Group_3__08464 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_3__1_in_rule__EqInterface__Group_3__08467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rule__EqInterface__Group_3__0__Impl8495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_3__1__Impl_in_rule__EqInterface__Group_3__18526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_3__2_in_rule__EqInterface__Group_3__18529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__EqInterface__Group_3__1__Impl8557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_3__2__Impl_in_rule__EqInterface__Group_3__28588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_3__3_in_rule__EqInterface__Group_3__28591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__SystemAssignment_3_2_in_rule__EqInterface__Group_3__2__Impl8618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_3__3__Impl_in_rule__EqInterface__Group_3__38648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__EqInterface__Group_3__3__Impl8676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_4__0__Impl_in_rule__EqInterface__Group_4__08715 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_4__1_in_rule__EqInterface__Group_4__08718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rule__EqInterface__Group_4__0__Impl8746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_4__1__Impl_in_rule__EqInterface__Group_4__18777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_4__2_in_rule__EqInterface__Group_4__18780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__EqInterface__Group_4__1__Impl8808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_4__2__Impl_in_rule__EqInterface__Group_4__28839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_4__3_in_rule__EqInterface__Group_4__28842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__SubAtaAssignment_4_2_in_rule__EqInterface__Group_4__2__Impl8869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_4__3__Impl_in_rule__EqInterface__Group_4__38899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__EqInterface__Group_4__3__Impl8927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_5__0__Impl_in_rule__EqInterface__Group_5__08966 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_5__1_in_rule__EqInterface__Group_5__08969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rule__EqInterface__Group_5__0__Impl8997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_5__1__Impl_in_rule__EqInterface__Group_5__19028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_5__2_in_rule__EqInterface__Group_5__19031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__EqInterface__Group_5__1__Impl9059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_5__2__Impl_in_rule__EqInterface__Group_5__29090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_5__3_in_rule__EqInterface__Group_5__29093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__ResourceAssignment_5_2_in_rule__EqInterface__Group_5__2__Impl9120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_5__3__Impl_in_rule__EqInterface__Group_5__39150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__EqInterface__Group_5__3__Impl9178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_6__0__Impl_in_rule__EqInterface__Group_6__09217 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_6__1_in_rule__EqInterface__Group_6__09220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rule__EqInterface__Group_6__0__Impl9248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_6__1__Impl_in_rule__EqInterface__Group_6__19279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_6__2_in_rule__EqInterface__Group_6__19282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__EqInterface__Group_6__1__Impl9310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_6__2__Impl_in_rule__EqInterface__Group_6__29341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_6__3_in_rule__EqInterface__Group_6__29344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__LineNameAssignment_6_2_in_rule__EqInterface__Group_6__2__Impl9371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_6__3__Impl_in_rule__EqInterface__Group_6__39401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__EqInterface__Group_6__3__Impl9429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_7__0__Impl_in_rule__EqInterface__Group_7__09468 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_7__1_in_rule__EqInterface__Group_7__09471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_rule__EqInterface__Group_7__0__Impl9499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_7__1__Impl_in_rule__EqInterface__Group_7__19530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_7__2_in_rule__EqInterface__Group_7__19533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__EqInterface__Group_7__1__Impl9561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_7__2__Impl_in_rule__EqInterface__Group_7__29592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_7__3_in_rule__EqInterface__Group_7__29595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__WiringLaneAssignment_7_2_in_rule__EqInterface__Group_7__2__Impl9622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_7__3__Impl_in_rule__EqInterface__Group_7__39652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__EqInterface__Group_7__3__Impl9680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_8__0__Impl_in_rule__EqInterface__Group_8__09719 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_8__1_in_rule__EqInterface__Group_8__09722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rule__EqInterface__Group_8__0__Impl9750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_8__1__Impl_in_rule__EqInterface__Group_8__19781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_8__2_in_rule__EqInterface__Group_8__19784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__EqInterface__Group_8__1__Impl9812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_8__2__Impl_in_rule__EqInterface__Group_8__29843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_8__3_in_rule__EqInterface__Group_8__29846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__GrpInfoAssignment_8_2_in_rule__EqInterface__Group_8__2__Impl9873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_8__3__Impl_in_rule__EqInterface__Group_8__39903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__EqInterface__Group_8__3__Impl9931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_9__0__Impl_in_rule__EqInterface__Group_9__09970 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_9__1_in_rule__EqInterface__Group_9__09973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_rule__EqInterface__Group_9__0__Impl10001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_9__1__Impl_in_rule__EqInterface__Group_9__110032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_9__2_in_rule__EqInterface__Group_9__110035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__EqInterface__Group_9__1__Impl10063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_9__2__Impl_in_rule__EqInterface__Group_9__210094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_9__3_in_rule__EqInterface__Group_9__210097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__RouteAssignment_9_2_in_rule__EqInterface__Group_9__2__Impl10124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_9__3__Impl_in_rule__EqInterface__Group_9__310154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__EqInterface__Group_9__3__Impl10182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_10__0__Impl_in_rule__EqInterface__Group_10__010221 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_10__1_in_rule__EqInterface__Group_10__010224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_rule__EqInterface__Group_10__0__Impl10252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_10__1__Impl_in_rule__EqInterface__Group_10__110283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_10__2_in_rule__EqInterface__Group_10__110286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__EqInterface__Group_10__1__Impl10314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_10__2__Impl_in_rule__EqInterface__Group_10__210345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_10__3_in_rule__EqInterface__Group_10__210348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__PwSup1Assignment_10_2_in_rule__EqInterface__Group_10__2__Impl10375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_10__3__Impl_in_rule__EqInterface__Group_10__310405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__EqInterface__Group_10__3__Impl10433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_11__0__Impl_in_rule__EqInterface__Group_11__010472 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_11__1_in_rule__EqInterface__Group_11__010475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rule__EqInterface__Group_11__0__Impl10503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_11__1__Impl_in_rule__EqInterface__Group_11__110534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_11__2_in_rule__EqInterface__Group_11__110537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__EqInterface__Group_11__1__Impl10565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_11__2__Impl_in_rule__EqInterface__Group_11__210596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_11__3_in_rule__EqInterface__Group_11__210599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__EmhZone1Assignment_11_2_in_rule__EqInterface__Group_11__2__Impl10626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_11__3__Impl_in_rule__EqInterface__Group_11__310656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__EqInterface__Group_11__3__Impl10684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_12__0__Impl_in_rule__EqInterface__Group_12__010723 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_12__1_in_rule__EqInterface__Group_12__010726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__EqInterface__Group_12__0__Impl10754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_12__1__Impl_in_rule__EqInterface__Group_12__110785 = new BitSet(new long[]{0x0FFFFFFFFFFFC000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_12__2_in_rule__EqInterface__Group_12__110788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__EqInterface__Group_12__1__Impl10816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_12__2__Impl_in_rule__EqInterface__Group_12__210847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_12__3_in_rule__EqInterface__Group_12__210850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__IoTypeAssignment_12_2_in_rule__EqInterface__Group_12__2__Impl10877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_12__3__Impl_in_rule__EqInterface__Group_12__310907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__EqInterface__Group_12__3__Impl10935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_13__0__Impl_in_rule__EqInterface__Group_13__010974 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_13__1_in_rule__EqInterface__Group_13__010977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__EqInterface__Group_13__0__Impl11005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_13__1__Impl_in_rule__EqInterface__Group_13__111036 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_13__2_in_rule__EqInterface__Group_13__111039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__EqInterface__Group_13__1__Impl11067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_13__2__Impl_in_rule__EqInterface__Group_13__211098 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_13__3_in_rule__EqInterface__Group_13__211101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqInterface__MetricParametersAssignment_13_2_in_rule__EqInterface__Group_13__2__Impl11128 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__EqInterface__Group_13__3__Impl_in_rule__EqInterface__Group_13__311159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__EqInterface__Group_13__3__Impl11187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DislocalityRelation__Group__0__Impl_in_rule__DislocalityRelation__Group__011226 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_rule__DislocalityRelation__Group__1_in_rule__DislocalityRelation__Group__011229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DislocalityRelation__EqInterfaceGroupAssignment_0_in_rule__DislocalityRelation__Group__0__Impl11256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DislocalityRelation__Group__1__Impl_in_rule__DislocalityRelation__Group__111286 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__DislocalityRelation__Group__2_in_rule__DislocalityRelation__Group__111289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rule__DislocalityRelation__Group__1__Impl11317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DislocalityRelation__Group__2__Impl_in_rule__DislocalityRelation__Group__211348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__DislocalityRelation__Group__3_in_rule__DislocalityRelation__Group__211351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DislocalityRelation__HardwareLevelAssignment_2_in_rule__DislocalityRelation__Group__2__Impl11378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DislocalityRelation__Group__3__Impl_in_rule__DislocalityRelation__Group__311408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__DislocalityRelation__Group__3__Impl11436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__0__Impl_in_rule__MetricParameter__Group__011475 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__1_in_rule__MetricParameter__Group__011478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__NameAssignment_0_in_rule__MetricParameter__Group__0__Impl11505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__1__Impl_in_rule__MetricParameter__Group__111535 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__2_in_rule__MetricParameter__Group__111538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__MetricParameter__Group__1__Impl11566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__2__Impl_in_rule__MetricParameter__Group__211597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__3_in_rule__MetricParameter__Group__211600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__ValueAssignment_2_in_rule__MetricParameter__Group__2__Impl11627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__3__Impl_in_rule__MetricParameter__Group__311657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__MetricParameter__Group__3__Impl11685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__UnorderedGroup_3__0_in_rule__Compartment__UnorderedGroup_311727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_0__0_in_rule__Compartment__UnorderedGroup_3__Impl11814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_1__0_in_rule__Compartment__UnorderedGroup_3__Impl11905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_2__0_in_rule__Compartment__UnorderedGroup_3__Impl11996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3_3__0_in_rule__Compartment__UnorderedGroup_3__Impl12087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__RdcsAssignment_3_4_in_rule__Compartment__UnorderedGroup_3__Impl12179 = new BitSet(new long[]{0x0000000000001002L,0x00000000000001E0L});
    public static final BitSet FOLLOW_rule__Compartment__RdcsAssignment_3_4_in_rule__Compartment__UnorderedGroup_3__Impl12223 = new BitSet(new long[]{0x0000000000001002L,0x00000000000001E0L});
    public static final BitSet FOLLOW_rule__Compartment__UnorderedGroup_3__Impl_in_rule__Compartment__UnorderedGroup_3__012289 = new BitSet(new long[]{0x0000000000001002L,0x00000000000001E0L});
    public static final BitSet FOLLOW_rule__Compartment__UnorderedGroup_3__1_in_rule__Compartment__UnorderedGroup_3__012292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__UnorderedGroup_3__Impl_in_rule__Compartment__UnorderedGroup_3__112317 = new BitSet(new long[]{0x0000000000001002L,0x00000000000001E0L});
    public static final BitSet FOLLOW_rule__Compartment__UnorderedGroup_3__2_in_rule__Compartment__UnorderedGroup_3__112320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__UnorderedGroup_3__Impl_in_rule__Compartment__UnorderedGroup_3__212345 = new BitSet(new long[]{0x0000000000001002L,0x00000000000001E0L});
    public static final BitSet FOLLOW_rule__Compartment__UnorderedGroup_3__3_in_rule__Compartment__UnorderedGroup_3__212348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__UnorderedGroup_3__Impl_in_rule__Compartment__UnorderedGroup_3__312373 = new BitSet(new long[]{0x0000000000001002L,0x00000000000001E0L});
    public static final BitSet FOLLOW_rule__Compartment__UnorderedGroup_3__4_in_rule__Compartment__UnorderedGroup_3__312376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__UnorderedGroup_3__Impl_in_rule__Compartment__UnorderedGroup_3__412401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AssistModel__SystemNameAssignment_412439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartment_in_rule__AssistModel__CompartmentsAssignment_712470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterface_in_rule__AssistModel__EqInterfacesAssignment_8_212501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceGroup_in_rule__AssistModel__EqInterfaceGroupsAssignment_9_212532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDislocalityRelation_in_rule__AssistModel__DislocalityRelationsAssignment_10_212563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Compartment__NameAssignment_112594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Compartment__ManufacturerAssignment_3_0_212625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Compartment__PowerSupplyAssignment_3_1_212656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Compartment__SideAssignment_3_2_212687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Compartment__ZoneAssignment_3_3_212718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDC_in_rule__Compartment__RdcsAssignment_3_412749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RDC__NameAssignment_112780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RDC__ManufacturerAssignment_3_212811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RDC__PowerSupplyAssignment_4_212842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RDC__RdcTypeAssignment_5_212873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RDC__EssAssignment_6_212904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_rule__RDC__ConnectorsAssignment_712935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_rule__RDC__MetricParametersAssignment_8_212966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Connector__NameAssignment_112997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvailableEqInterface_in_rule__Connector__AvailableEqInterfacesAssignment_313028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AvailableEqInterface__CountAssignment_013059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceType_in_rule__AvailableEqInterface__EqInterfaceTypeAssignment_213090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EqInterfaceGroup__NameAssignment_113121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EqInterfaceGroup__EqInterfacesAssignment_313156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EqInterfaceGroup__EqInterfacesAssignment_4_113195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EqInterface__NameAssignment_113230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__SystemAssignment_3_213261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__SubAtaAssignment_4_213292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__ResourceAssignment_5_213323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__LineNameAssignment_6_213354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__WiringLaneAssignment_7_213385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__GrpInfoAssignment_8_213416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__RouteAssignment_9_213447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__PwSup1Assignment_10_213478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqInterface__EmhZone1Assignment_11_213509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqInterfaceType_in_rule__EqInterface__IoTypeAssignment_12_213540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_rule__EqInterface__MetricParametersAssignment_13_213571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DislocalityRelation__EqInterfaceGroupAssignment_013606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHardwareArchitectureLevelType_in_rule__DislocalityRelation__HardwareLevelAssignment_213641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MetricParameter__NameAssignment_013672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__MetricParameter__ValueAssignment_213703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__RdcsAssignment_3_4_in_synpred1_InternalMappingDSL12220 = new BitSet(new long[]{0x0000000000000002L});

}
