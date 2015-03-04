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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Can'", "'Enhanced Local Bus'", "'Ethernet'", "'Analog'", "'Digital'", "'Serial'", "'CustomType0'", "'CustomType1'", "'CustomType2'", "'CustomType3'", "'CustomType4'", "'CustomType5'", "'CustomType6'", "'CustomType7'", "'CustomType8'", "'CustomType9'", "'CustomType10'", "'CustomType11'", "'CustomType12'", "'CustomType13'", "'CustomType14'", "'CustomType15'", "'CustomType16'", "'CustomType17'", "'CustomType18'", "'CustomType19'", "'CustomType20'", "'CustomType21'", "'CustomType22'", "'CustomType23'", "'CustomType24'", "'CustomType25'", "'CustomType26'", "'CustomType27'", "'CustomType28'", "'CustomType29'", "'CustomType30'", "'CustomType31'", "'CustomType32'", "'CustomType33'", "'CustomType34'", "'CustomType35'", "'CustomType36'", "'CustomType37'", "'CustomType38'", "'CustomType39'", "'Global'", "'{'", "'System name'", "'='", "';'", "'}'", "'Interfaces'", "'InterfaceGroups'", "'Compartment'", "'Manufacturer'", "'PowerSupply'", "'Side'", "'Zone'", "'Generic properties'", "'RDC'", "'Type'", "'ESS'", "'Connector'", "'interface with type'", "'Group'", "','", "'Interface'", "'System'", "'SubAta'", "'Resource'", "'LineName'", "'WiringLane'", "'GrpInfo'", "'Route'", "'PwSup1'", "'EmhZone1'"
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


    // $ANTLR start "entryRuleAvailableInterface"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:172:1: entryRuleAvailableInterface : ruleAvailableInterface EOF ;
    public final void entryRuleAvailableInterface() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:173:1: ( ruleAvailableInterface EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:174:1: ruleAvailableInterface EOF
            {
             before(grammarAccess.getAvailableInterfaceRule()); 
            pushFollow(FOLLOW_ruleAvailableInterface_in_entryRuleAvailableInterface301);
            ruleAvailableInterface();

            state._fsp--;

             after(grammarAccess.getAvailableInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvailableInterface308); 

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
    // $ANTLR end "entryRuleAvailableInterface"


    // $ANTLR start "ruleAvailableInterface"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:181:1: ruleAvailableInterface : ( ( rule__AvailableInterface__Group__0 ) ) ;
    public final void ruleAvailableInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:185:2: ( ( ( rule__AvailableInterface__Group__0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:186:1: ( ( rule__AvailableInterface__Group__0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:186:1: ( ( rule__AvailableInterface__Group__0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:187:1: ( rule__AvailableInterface__Group__0 )
            {
             before(grammarAccess.getAvailableInterfaceAccess().getGroup()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:188:1: ( rule__AvailableInterface__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:188:2: rule__AvailableInterface__Group__0
            {
            pushFollow(FOLLOW_rule__AvailableInterface__Group__0_in_ruleAvailableInterface334);
            rule__AvailableInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAvailableInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAvailableInterface"


    // $ANTLR start "entryRuleInterfaceGroup"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:200:1: entryRuleInterfaceGroup : ruleInterfaceGroup EOF ;
    public final void entryRuleInterfaceGroup() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:201:1: ( ruleInterfaceGroup EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:202:1: ruleInterfaceGroup EOF
            {
             before(grammarAccess.getInterfaceGroupRule()); 
            pushFollow(FOLLOW_ruleInterfaceGroup_in_entryRuleInterfaceGroup361);
            ruleInterfaceGroup();

            state._fsp--;

             after(grammarAccess.getInterfaceGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceGroup368); 

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
    // $ANTLR end "entryRuleInterfaceGroup"


    // $ANTLR start "ruleInterfaceGroup"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:209:1: ruleInterfaceGroup : ( ( rule__InterfaceGroup__Group__0 ) ) ;
    public final void ruleInterfaceGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:213:2: ( ( ( rule__InterfaceGroup__Group__0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:214:1: ( ( rule__InterfaceGroup__Group__0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:214:1: ( ( rule__InterfaceGroup__Group__0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:215:1: ( rule__InterfaceGroup__Group__0 )
            {
             before(grammarAccess.getInterfaceGroupAccess().getGroup()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:216:1: ( rule__InterfaceGroup__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:216:2: rule__InterfaceGroup__Group__0
            {
            pushFollow(FOLLOW_rule__InterfaceGroup__Group__0_in_ruleInterfaceGroup394);
            rule__InterfaceGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceGroup"


    // $ANTLR start "entryRuleInterface"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:228:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:229:1: ( ruleInterface EOF )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:230:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface421);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface428); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:237:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:241:2: ( ( ( rule__Interface__Group__0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:242:1: ( ( rule__Interface__Group__0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:242:1: ( ( rule__Interface__Group__0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:243:1: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:244:1: ( rule__Interface__Group__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:244:2: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_rule__Interface__Group__0_in_ruleInterface454);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface"


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


    // $ANTLR start "ruleInterfaceType"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:287:1: ruleInterfaceType : ( ( rule__InterfaceType__Alternatives ) ) ;
    public final void ruleInterfaceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:291:1: ( ( ( rule__InterfaceType__Alternatives ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:292:1: ( ( rule__InterfaceType__Alternatives ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:292:1: ( ( rule__InterfaceType__Alternatives ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:293:1: ( rule__InterfaceType__Alternatives )
            {
             before(grammarAccess.getInterfaceTypeAccess().getAlternatives()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:294:1: ( rule__InterfaceType__Alternatives )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:294:2: rule__InterfaceType__Alternatives
            {
            pushFollow(FOLLOW_rule__InterfaceType__Alternatives_in_ruleInterfaceType553);
            rule__InterfaceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceType"


    // $ANTLR start "rule__InterfaceType__Alternatives"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:305:1: rule__InterfaceType__Alternatives : ( ( ( 'Can' ) ) | ( ( 'Enhanced Local Bus' ) ) | ( ( 'Ethernet' ) ) | ( ( 'Analog' ) ) | ( ( 'Digital' ) ) | ( ( 'Serial' ) ) | ( ( 'CustomType0' ) ) | ( ( 'CustomType1' ) ) | ( ( 'CustomType2' ) ) | ( ( 'CustomType3' ) ) | ( ( 'CustomType4' ) ) | ( ( 'CustomType5' ) ) | ( ( 'CustomType6' ) ) | ( ( 'CustomType7' ) ) | ( ( 'CustomType8' ) ) | ( ( 'CustomType9' ) ) | ( ( 'CustomType10' ) ) | ( ( 'CustomType11' ) ) | ( ( 'CustomType12' ) ) | ( ( 'CustomType13' ) ) | ( ( 'CustomType14' ) ) | ( ( 'CustomType15' ) ) | ( ( 'CustomType16' ) ) | ( ( 'CustomType17' ) ) | ( ( 'CustomType18' ) ) | ( ( 'CustomType19' ) ) | ( ( 'CustomType20' ) ) | ( ( 'CustomType21' ) ) | ( ( 'CustomType22' ) ) | ( ( 'CustomType23' ) ) | ( ( 'CustomType24' ) ) | ( ( 'CustomType25' ) ) | ( ( 'CustomType26' ) ) | ( ( 'CustomType27' ) ) | ( ( 'CustomType28' ) ) | ( ( 'CustomType29' ) ) | ( ( 'CustomType30' ) ) | ( ( 'CustomType31' ) ) | ( ( 'CustomType32' ) ) | ( ( 'CustomType33' ) ) | ( ( 'CustomType34' ) ) | ( ( 'CustomType35' ) ) | ( ( 'CustomType36' ) ) | ( ( 'CustomType37' ) ) | ( ( 'CustomType38' ) ) | ( ( 'CustomType39' ) ) );
    public final void rule__InterfaceType__Alternatives() throws RecognitionException {

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
                     before(grammarAccess.getInterfaceTypeAccess().getCANEnumLiteralDeclaration_0()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:312:1: ( 'Can' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:312:3: 'Can'
                    {
                    match(input,11,FOLLOW_11_in_rule__InterfaceType__Alternatives589); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:317:6: ( ( 'Enhanced Local Bus' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:317:6: ( ( 'Enhanced Local Bus' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:318:1: ( 'Enhanced Local Bus' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getELBEnumLiteralDeclaration_1()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:319:1: ( 'Enhanced Local Bus' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:319:3: 'Enhanced Local Bus'
                    {
                    match(input,12,FOLLOW_12_in_rule__InterfaceType__Alternatives610); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getELBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:324:6: ( ( 'Ethernet' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:324:6: ( ( 'Ethernet' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:325:1: ( 'Ethernet' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getETHEnumLiteralDeclaration_2()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:326:1: ( 'Ethernet' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:326:3: 'Ethernet'
                    {
                    match(input,13,FOLLOW_13_in_rule__InterfaceType__Alternatives631); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getETHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:331:6: ( ( 'Analog' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:331:6: ( ( 'Analog' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:332:1: ( 'Analog' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getANALOGEnumLiteralDeclaration_3()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:333:1: ( 'Analog' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:333:3: 'Analog'
                    {
                    match(input,14,FOLLOW_14_in_rule__InterfaceType__Alternatives652); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getANALOGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:338:6: ( ( 'Digital' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:338:6: ( ( 'Digital' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:339:1: ( 'Digital' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getDIGITALEnumLiteralDeclaration_4()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:340:1: ( 'Digital' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:340:3: 'Digital'
                    {
                    match(input,15,FOLLOW_15_in_rule__InterfaceType__Alternatives673); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getDIGITALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:345:6: ( ( 'Serial' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:345:6: ( ( 'Serial' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:346:1: ( 'Serial' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getSERIALEnumLiteralDeclaration_5()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:347:1: ( 'Serial' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:347:3: 'Serial'
                    {
                    match(input,16,FOLLOW_16_in_rule__InterfaceType__Alternatives694); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getSERIALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:352:6: ( ( 'CustomType0' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:352:6: ( ( 'CustomType0' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:353:1: ( 'CustomType0' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM0EnumLiteralDeclaration_6()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:354:1: ( 'CustomType0' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:354:3: 'CustomType0'
                    {
                    match(input,17,FOLLOW_17_in_rule__InterfaceType__Alternatives715); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM0EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:359:6: ( ( 'CustomType1' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:359:6: ( ( 'CustomType1' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:360:1: ( 'CustomType1' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM1EnumLiteralDeclaration_7()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:361:1: ( 'CustomType1' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:361:3: 'CustomType1'
                    {
                    match(input,18,FOLLOW_18_in_rule__InterfaceType__Alternatives736); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM1EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:366:6: ( ( 'CustomType2' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:366:6: ( ( 'CustomType2' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:367:1: ( 'CustomType2' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM2EnumLiteralDeclaration_8()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:368:1: ( 'CustomType2' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:368:3: 'CustomType2'
                    {
                    match(input,19,FOLLOW_19_in_rule__InterfaceType__Alternatives757); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM2EnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:373:6: ( ( 'CustomType3' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:373:6: ( ( 'CustomType3' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:374:1: ( 'CustomType3' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM3EnumLiteralDeclaration_9()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:375:1: ( 'CustomType3' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:375:3: 'CustomType3'
                    {
                    match(input,20,FOLLOW_20_in_rule__InterfaceType__Alternatives778); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM3EnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:380:6: ( ( 'CustomType4' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:380:6: ( ( 'CustomType4' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:381:1: ( 'CustomType4' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM4EnumLiteralDeclaration_10()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:382:1: ( 'CustomType4' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:382:3: 'CustomType4'
                    {
                    match(input,21,FOLLOW_21_in_rule__InterfaceType__Alternatives799); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM4EnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:387:6: ( ( 'CustomType5' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:387:6: ( ( 'CustomType5' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:388:1: ( 'CustomType5' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM5EnumLiteralDeclaration_11()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:389:1: ( 'CustomType5' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:389:3: 'CustomType5'
                    {
                    match(input,22,FOLLOW_22_in_rule__InterfaceType__Alternatives820); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM5EnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:394:6: ( ( 'CustomType6' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:394:6: ( ( 'CustomType6' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:395:1: ( 'CustomType6' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM6EnumLiteralDeclaration_12()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:396:1: ( 'CustomType6' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:396:3: 'CustomType6'
                    {
                    match(input,23,FOLLOW_23_in_rule__InterfaceType__Alternatives841); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM6EnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:401:6: ( ( 'CustomType7' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:401:6: ( ( 'CustomType7' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:402:1: ( 'CustomType7' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM7EnumLiteralDeclaration_13()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:403:1: ( 'CustomType7' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:403:3: 'CustomType7'
                    {
                    match(input,24,FOLLOW_24_in_rule__InterfaceType__Alternatives862); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM7EnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:408:6: ( ( 'CustomType8' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:408:6: ( ( 'CustomType8' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:409:1: ( 'CustomType8' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM8EnumLiteralDeclaration_14()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:410:1: ( 'CustomType8' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:410:3: 'CustomType8'
                    {
                    match(input,25,FOLLOW_25_in_rule__InterfaceType__Alternatives883); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM8EnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:415:6: ( ( 'CustomType9' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:415:6: ( ( 'CustomType9' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:416:1: ( 'CustomType9' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM9EnumLiteralDeclaration_15()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:417:1: ( 'CustomType9' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:417:3: 'CustomType9'
                    {
                    match(input,26,FOLLOW_26_in_rule__InterfaceType__Alternatives904); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM9EnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:422:6: ( ( 'CustomType10' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:422:6: ( ( 'CustomType10' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:423:1: ( 'CustomType10' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM10EnumLiteralDeclaration_16()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:424:1: ( 'CustomType10' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:424:3: 'CustomType10'
                    {
                    match(input,27,FOLLOW_27_in_rule__InterfaceType__Alternatives925); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM10EnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:429:6: ( ( 'CustomType11' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:429:6: ( ( 'CustomType11' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:430:1: ( 'CustomType11' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM11EnumLiteralDeclaration_17()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:431:1: ( 'CustomType11' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:431:3: 'CustomType11'
                    {
                    match(input,28,FOLLOW_28_in_rule__InterfaceType__Alternatives946); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM11EnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:436:6: ( ( 'CustomType12' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:436:6: ( ( 'CustomType12' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:437:1: ( 'CustomType12' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM12EnumLiteralDeclaration_18()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:438:1: ( 'CustomType12' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:438:3: 'CustomType12'
                    {
                    match(input,29,FOLLOW_29_in_rule__InterfaceType__Alternatives967); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM12EnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:443:6: ( ( 'CustomType13' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:443:6: ( ( 'CustomType13' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:444:1: ( 'CustomType13' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM13EnumLiteralDeclaration_19()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:445:1: ( 'CustomType13' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:445:3: 'CustomType13'
                    {
                    match(input,30,FOLLOW_30_in_rule__InterfaceType__Alternatives988); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM13EnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:450:6: ( ( 'CustomType14' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:450:6: ( ( 'CustomType14' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:451:1: ( 'CustomType14' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM14EnumLiteralDeclaration_20()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:452:1: ( 'CustomType14' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:452:3: 'CustomType14'
                    {
                    match(input,31,FOLLOW_31_in_rule__InterfaceType__Alternatives1009); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM14EnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:457:6: ( ( 'CustomType15' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:457:6: ( ( 'CustomType15' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:458:1: ( 'CustomType15' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM15EnumLiteralDeclaration_21()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:459:1: ( 'CustomType15' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:459:3: 'CustomType15'
                    {
                    match(input,32,FOLLOW_32_in_rule__InterfaceType__Alternatives1030); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM15EnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:464:6: ( ( 'CustomType16' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:464:6: ( ( 'CustomType16' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:465:1: ( 'CustomType16' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM16EnumLiteralDeclaration_22()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:466:1: ( 'CustomType16' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:466:3: 'CustomType16'
                    {
                    match(input,33,FOLLOW_33_in_rule__InterfaceType__Alternatives1051); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM16EnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:471:6: ( ( 'CustomType17' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:471:6: ( ( 'CustomType17' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:472:1: ( 'CustomType17' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM17EnumLiteralDeclaration_23()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:473:1: ( 'CustomType17' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:473:3: 'CustomType17'
                    {
                    match(input,34,FOLLOW_34_in_rule__InterfaceType__Alternatives1072); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM17EnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:478:6: ( ( 'CustomType18' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:478:6: ( ( 'CustomType18' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:479:1: ( 'CustomType18' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM18EnumLiteralDeclaration_24()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:480:1: ( 'CustomType18' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:480:3: 'CustomType18'
                    {
                    match(input,35,FOLLOW_35_in_rule__InterfaceType__Alternatives1093); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM18EnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:485:6: ( ( 'CustomType19' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:485:6: ( ( 'CustomType19' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:486:1: ( 'CustomType19' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM19EnumLiteralDeclaration_25()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:487:1: ( 'CustomType19' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:487:3: 'CustomType19'
                    {
                    match(input,36,FOLLOW_36_in_rule__InterfaceType__Alternatives1114); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM19EnumLiteralDeclaration_25()); 

                    }


                    }
                    break;
                case 27 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:492:6: ( ( 'CustomType20' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:492:6: ( ( 'CustomType20' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:493:1: ( 'CustomType20' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM20EnumLiteralDeclaration_26()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:494:1: ( 'CustomType20' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:494:3: 'CustomType20'
                    {
                    match(input,37,FOLLOW_37_in_rule__InterfaceType__Alternatives1135); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM20EnumLiteralDeclaration_26()); 

                    }


                    }
                    break;
                case 28 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:499:6: ( ( 'CustomType21' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:499:6: ( ( 'CustomType21' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:500:1: ( 'CustomType21' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM21EnumLiteralDeclaration_27()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:501:1: ( 'CustomType21' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:501:3: 'CustomType21'
                    {
                    match(input,38,FOLLOW_38_in_rule__InterfaceType__Alternatives1156); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM21EnumLiteralDeclaration_27()); 

                    }


                    }
                    break;
                case 29 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:506:6: ( ( 'CustomType22' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:506:6: ( ( 'CustomType22' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:507:1: ( 'CustomType22' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM22EnumLiteralDeclaration_28()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:508:1: ( 'CustomType22' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:508:3: 'CustomType22'
                    {
                    match(input,39,FOLLOW_39_in_rule__InterfaceType__Alternatives1177); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM22EnumLiteralDeclaration_28()); 

                    }


                    }
                    break;
                case 30 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:513:6: ( ( 'CustomType23' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:513:6: ( ( 'CustomType23' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:514:1: ( 'CustomType23' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM23EnumLiteralDeclaration_29()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:515:1: ( 'CustomType23' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:515:3: 'CustomType23'
                    {
                    match(input,40,FOLLOW_40_in_rule__InterfaceType__Alternatives1198); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM23EnumLiteralDeclaration_29()); 

                    }


                    }
                    break;
                case 31 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:520:6: ( ( 'CustomType24' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:520:6: ( ( 'CustomType24' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:521:1: ( 'CustomType24' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM24EnumLiteralDeclaration_30()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:522:1: ( 'CustomType24' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:522:3: 'CustomType24'
                    {
                    match(input,41,FOLLOW_41_in_rule__InterfaceType__Alternatives1219); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM24EnumLiteralDeclaration_30()); 

                    }


                    }
                    break;
                case 32 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:527:6: ( ( 'CustomType25' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:527:6: ( ( 'CustomType25' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:528:1: ( 'CustomType25' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM25EnumLiteralDeclaration_31()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:529:1: ( 'CustomType25' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:529:3: 'CustomType25'
                    {
                    match(input,42,FOLLOW_42_in_rule__InterfaceType__Alternatives1240); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM25EnumLiteralDeclaration_31()); 

                    }


                    }
                    break;
                case 33 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:534:6: ( ( 'CustomType26' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:534:6: ( ( 'CustomType26' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:535:1: ( 'CustomType26' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM26EnumLiteralDeclaration_32()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:536:1: ( 'CustomType26' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:536:3: 'CustomType26'
                    {
                    match(input,43,FOLLOW_43_in_rule__InterfaceType__Alternatives1261); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM26EnumLiteralDeclaration_32()); 

                    }


                    }
                    break;
                case 34 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:541:6: ( ( 'CustomType27' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:541:6: ( ( 'CustomType27' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:542:1: ( 'CustomType27' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM27EnumLiteralDeclaration_33()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:543:1: ( 'CustomType27' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:543:3: 'CustomType27'
                    {
                    match(input,44,FOLLOW_44_in_rule__InterfaceType__Alternatives1282); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM27EnumLiteralDeclaration_33()); 

                    }


                    }
                    break;
                case 35 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:548:6: ( ( 'CustomType28' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:548:6: ( ( 'CustomType28' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:549:1: ( 'CustomType28' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM28EnumLiteralDeclaration_34()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:550:1: ( 'CustomType28' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:550:3: 'CustomType28'
                    {
                    match(input,45,FOLLOW_45_in_rule__InterfaceType__Alternatives1303); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM28EnumLiteralDeclaration_34()); 

                    }


                    }
                    break;
                case 36 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:555:6: ( ( 'CustomType29' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:555:6: ( ( 'CustomType29' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:556:1: ( 'CustomType29' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM29EnumLiteralDeclaration_35()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:557:1: ( 'CustomType29' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:557:3: 'CustomType29'
                    {
                    match(input,46,FOLLOW_46_in_rule__InterfaceType__Alternatives1324); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM29EnumLiteralDeclaration_35()); 

                    }


                    }
                    break;
                case 37 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:562:6: ( ( 'CustomType30' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:562:6: ( ( 'CustomType30' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:563:1: ( 'CustomType30' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM30EnumLiteralDeclaration_36()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:564:1: ( 'CustomType30' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:564:3: 'CustomType30'
                    {
                    match(input,47,FOLLOW_47_in_rule__InterfaceType__Alternatives1345); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM30EnumLiteralDeclaration_36()); 

                    }


                    }
                    break;
                case 38 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:569:6: ( ( 'CustomType31' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:569:6: ( ( 'CustomType31' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:570:1: ( 'CustomType31' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM31EnumLiteralDeclaration_37()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:571:1: ( 'CustomType31' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:571:3: 'CustomType31'
                    {
                    match(input,48,FOLLOW_48_in_rule__InterfaceType__Alternatives1366); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM31EnumLiteralDeclaration_37()); 

                    }


                    }
                    break;
                case 39 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:576:6: ( ( 'CustomType32' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:576:6: ( ( 'CustomType32' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:577:1: ( 'CustomType32' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM32EnumLiteralDeclaration_38()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:578:1: ( 'CustomType32' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:578:3: 'CustomType32'
                    {
                    match(input,49,FOLLOW_49_in_rule__InterfaceType__Alternatives1387); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM32EnumLiteralDeclaration_38()); 

                    }


                    }
                    break;
                case 40 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:583:6: ( ( 'CustomType33' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:583:6: ( ( 'CustomType33' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:584:1: ( 'CustomType33' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM33EnumLiteralDeclaration_39()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:585:1: ( 'CustomType33' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:585:3: 'CustomType33'
                    {
                    match(input,50,FOLLOW_50_in_rule__InterfaceType__Alternatives1408); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM33EnumLiteralDeclaration_39()); 

                    }


                    }
                    break;
                case 41 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:590:6: ( ( 'CustomType34' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:590:6: ( ( 'CustomType34' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:591:1: ( 'CustomType34' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM34EnumLiteralDeclaration_40()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:592:1: ( 'CustomType34' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:592:3: 'CustomType34'
                    {
                    match(input,51,FOLLOW_51_in_rule__InterfaceType__Alternatives1429); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM34EnumLiteralDeclaration_40()); 

                    }


                    }
                    break;
                case 42 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:597:6: ( ( 'CustomType35' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:597:6: ( ( 'CustomType35' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:598:1: ( 'CustomType35' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM35EnumLiteralDeclaration_41()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:599:1: ( 'CustomType35' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:599:3: 'CustomType35'
                    {
                    match(input,52,FOLLOW_52_in_rule__InterfaceType__Alternatives1450); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM35EnumLiteralDeclaration_41()); 

                    }


                    }
                    break;
                case 43 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:604:6: ( ( 'CustomType36' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:604:6: ( ( 'CustomType36' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:605:1: ( 'CustomType36' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM36EnumLiteralDeclaration_42()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:606:1: ( 'CustomType36' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:606:3: 'CustomType36'
                    {
                    match(input,53,FOLLOW_53_in_rule__InterfaceType__Alternatives1471); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM36EnumLiteralDeclaration_42()); 

                    }


                    }
                    break;
                case 44 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:611:6: ( ( 'CustomType37' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:611:6: ( ( 'CustomType37' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:612:1: ( 'CustomType37' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM37EnumLiteralDeclaration_43()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:613:1: ( 'CustomType37' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:613:3: 'CustomType37'
                    {
                    match(input,54,FOLLOW_54_in_rule__InterfaceType__Alternatives1492); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM37EnumLiteralDeclaration_43()); 

                    }


                    }
                    break;
                case 45 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:618:6: ( ( 'CustomType38' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:618:6: ( ( 'CustomType38' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:619:1: ( 'CustomType38' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM38EnumLiteralDeclaration_44()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:620:1: ( 'CustomType38' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:620:3: 'CustomType38'
                    {
                    match(input,55,FOLLOW_55_in_rule__InterfaceType__Alternatives1513); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM38EnumLiteralDeclaration_44()); 

                    }


                    }
                    break;
                case 46 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:625:6: ( ( 'CustomType39' ) )
                    {
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:625:6: ( ( 'CustomType39' ) )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:626:1: ( 'CustomType39' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getCUSTOM39EnumLiteralDeclaration_45()); 
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:627:1: ( 'CustomType39' )
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:627:3: 'CustomType39'
                    {
                    match(input,56,FOLLOW_56_in_rule__InterfaceType__Alternatives1534); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getCUSTOM39EnumLiteralDeclaration_45()); 

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
    // $ANTLR end "rule__InterfaceType__Alternatives"


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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:866:1: rule__AssistModel__Group__7__Impl : ( ( ( rule__AssistModel__CompartmentsAssignment_7 ) ) ( ( rule__AssistModel__CompartmentsAssignment_7 )* ) ) ;
    public final void rule__AssistModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:870:1: ( ( ( ( rule__AssistModel__CompartmentsAssignment_7 ) ) ( ( rule__AssistModel__CompartmentsAssignment_7 )* ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:871:1: ( ( ( rule__AssistModel__CompartmentsAssignment_7 ) ) ( ( rule__AssistModel__CompartmentsAssignment_7 )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:871:1: ( ( ( rule__AssistModel__CompartmentsAssignment_7 ) ) ( ( rule__AssistModel__CompartmentsAssignment_7 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:872:1: ( ( rule__AssistModel__CompartmentsAssignment_7 ) ) ( ( rule__AssistModel__CompartmentsAssignment_7 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:872:1: ( ( rule__AssistModel__CompartmentsAssignment_7 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:873:1: ( rule__AssistModel__CompartmentsAssignment_7 )
            {
             before(grammarAccess.getAssistModelAccess().getCompartmentsAssignment_7()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:874:1: ( rule__AssistModel__CompartmentsAssignment_7 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:874:2: rule__AssistModel__CompartmentsAssignment_7
            {
            pushFollow(FOLLOW_rule__AssistModel__CompartmentsAssignment_7_in_rule__AssistModel__Group__7__Impl2031);
            rule__AssistModel__CompartmentsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAssistModelAccess().getCompartmentsAssignment_7()); 

            }

            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:877:1: ( ( rule__AssistModel__CompartmentsAssignment_7 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:878:1: ( rule__AssistModel__CompartmentsAssignment_7 )*
            {
             before(grammarAccess.getAssistModelAccess().getCompartmentsAssignment_7()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:879:1: ( rule__AssistModel__CompartmentsAssignment_7 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==65) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:879:2: rule__AssistModel__CompartmentsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__AssistModel__CompartmentsAssignment_7_in_rule__AssistModel__Group__7__Impl2043);
            	    rule__AssistModel__CompartmentsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:890:1: rule__AssistModel__Group__8 : rule__AssistModel__Group__8__Impl rule__AssistModel__Group__9 ;
    public final void rule__AssistModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:894:1: ( rule__AssistModel__Group__8__Impl rule__AssistModel__Group__9 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:895:2: rule__AssistModel__Group__8__Impl rule__AssistModel__Group__9
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__8__Impl_in_rule__AssistModel__Group__82076);
            rule__AssistModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group__9_in_rule__AssistModel__Group__82079);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:902:1: rule__AssistModel__Group__8__Impl : ( 'Interfaces' ) ;
    public final void rule__AssistModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:906:1: ( ( 'Interfaces' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:907:1: ( 'Interfaces' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:907:1: ( 'Interfaces' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:908:1: 'Interfaces'
            {
             before(grammarAccess.getAssistModelAccess().getInterfacesKeyword_8()); 
            match(input,63,FOLLOW_63_in_rule__AssistModel__Group__8__Impl2107); 
             after(grammarAccess.getAssistModelAccess().getInterfacesKeyword_8()); 

            }


            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:921:1: rule__AssistModel__Group__9 : rule__AssistModel__Group__9__Impl rule__AssistModel__Group__10 ;
    public final void rule__AssistModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:925:1: ( rule__AssistModel__Group__9__Impl rule__AssistModel__Group__10 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:926:2: rule__AssistModel__Group__9__Impl rule__AssistModel__Group__10
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__9__Impl_in_rule__AssistModel__Group__92138);
            rule__AssistModel__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group__10_in_rule__AssistModel__Group__92141);
            rule__AssistModel__Group__10();

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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:933:1: rule__AssistModel__Group__9__Impl : ( '{' ) ;
    public final void rule__AssistModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:937:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:938:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:938:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:939:1: '{'
            {
             before(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,58,FOLLOW_58_in_rule__AssistModel__Group__9__Impl2169); 
             after(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:952:1: rule__AssistModel__Group__10 : rule__AssistModel__Group__10__Impl rule__AssistModel__Group__11 ;
    public final void rule__AssistModel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:956:1: ( rule__AssistModel__Group__10__Impl rule__AssistModel__Group__11 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:957:2: rule__AssistModel__Group__10__Impl rule__AssistModel__Group__11
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__10__Impl_in_rule__AssistModel__Group__102200);
            rule__AssistModel__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group__11_in_rule__AssistModel__Group__102203);
            rule__AssistModel__Group__11();

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
    // $ANTLR end "rule__AssistModel__Group__10"


    // $ANTLR start "rule__AssistModel__Group__10__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:964:1: rule__AssistModel__Group__10__Impl : ( ( ( rule__AssistModel__InterfacesAssignment_10 ) ) ( ( rule__AssistModel__InterfacesAssignment_10 )* ) ) ;
    public final void rule__AssistModel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:968:1: ( ( ( ( rule__AssistModel__InterfacesAssignment_10 ) ) ( ( rule__AssistModel__InterfacesAssignment_10 )* ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:969:1: ( ( ( rule__AssistModel__InterfacesAssignment_10 ) ) ( ( rule__AssistModel__InterfacesAssignment_10 )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:969:1: ( ( ( rule__AssistModel__InterfacesAssignment_10 ) ) ( ( rule__AssistModel__InterfacesAssignment_10 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:970:1: ( ( rule__AssistModel__InterfacesAssignment_10 ) ) ( ( rule__AssistModel__InterfacesAssignment_10 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:970:1: ( ( rule__AssistModel__InterfacesAssignment_10 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:971:1: ( rule__AssistModel__InterfacesAssignment_10 )
            {
             before(grammarAccess.getAssistModelAccess().getInterfacesAssignment_10()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:972:1: ( rule__AssistModel__InterfacesAssignment_10 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:972:2: rule__AssistModel__InterfacesAssignment_10
            {
            pushFollow(FOLLOW_rule__AssistModel__InterfacesAssignment_10_in_rule__AssistModel__Group__10__Impl2232);
            rule__AssistModel__InterfacesAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getAssistModelAccess().getInterfacesAssignment_10()); 

            }

            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:975:1: ( ( rule__AssistModel__InterfacesAssignment_10 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:976:1: ( rule__AssistModel__InterfacesAssignment_10 )*
            {
             before(grammarAccess.getAssistModelAccess().getInterfacesAssignment_10()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:977:1: ( rule__AssistModel__InterfacesAssignment_10 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==78) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:977:2: rule__AssistModel__InterfacesAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__AssistModel__InterfacesAssignment_10_in_rule__AssistModel__Group__10__Impl2244);
            	    rule__AssistModel__InterfacesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAssistModelAccess().getInterfacesAssignment_10()); 

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


    // $ANTLR start "rule__AssistModel__Group__11"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:988:1: rule__AssistModel__Group__11 : rule__AssistModel__Group__11__Impl rule__AssistModel__Group__12 ;
    public final void rule__AssistModel__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:992:1: ( rule__AssistModel__Group__11__Impl rule__AssistModel__Group__12 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:993:2: rule__AssistModel__Group__11__Impl rule__AssistModel__Group__12
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__11__Impl_in_rule__AssistModel__Group__112277);
            rule__AssistModel__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group__12_in_rule__AssistModel__Group__112280);
            rule__AssistModel__Group__12();

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
    // $ANTLR end "rule__AssistModel__Group__11"


    // $ANTLR start "rule__AssistModel__Group__11__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1000:1: rule__AssistModel__Group__11__Impl : ( '}' ) ;
    public final void rule__AssistModel__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1004:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1005:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1005:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1006:1: '}'
            {
             before(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_11()); 
            match(input,62,FOLLOW_62_in_rule__AssistModel__Group__11__Impl2308); 
             after(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__11__Impl"


    // $ANTLR start "rule__AssistModel__Group__12"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1019:1: rule__AssistModel__Group__12 : rule__AssistModel__Group__12__Impl rule__AssistModel__Group__13 ;
    public final void rule__AssistModel__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1023:1: ( rule__AssistModel__Group__12__Impl rule__AssistModel__Group__13 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1024:2: rule__AssistModel__Group__12__Impl rule__AssistModel__Group__13
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__12__Impl_in_rule__AssistModel__Group__122339);
            rule__AssistModel__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group__13_in_rule__AssistModel__Group__122342);
            rule__AssistModel__Group__13();

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
    // $ANTLR end "rule__AssistModel__Group__12"


    // $ANTLR start "rule__AssistModel__Group__12__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1031:1: rule__AssistModel__Group__12__Impl : ( 'InterfaceGroups' ) ;
    public final void rule__AssistModel__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1035:1: ( ( 'InterfaceGroups' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1036:1: ( 'InterfaceGroups' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1036:1: ( 'InterfaceGroups' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1037:1: 'InterfaceGroups'
            {
             before(grammarAccess.getAssistModelAccess().getInterfaceGroupsKeyword_12()); 
            match(input,64,FOLLOW_64_in_rule__AssistModel__Group__12__Impl2370); 
             after(grammarAccess.getAssistModelAccess().getInterfaceGroupsKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__12__Impl"


    // $ANTLR start "rule__AssistModel__Group__13"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1050:1: rule__AssistModel__Group__13 : rule__AssistModel__Group__13__Impl rule__AssistModel__Group__14 ;
    public final void rule__AssistModel__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1054:1: ( rule__AssistModel__Group__13__Impl rule__AssistModel__Group__14 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1055:2: rule__AssistModel__Group__13__Impl rule__AssistModel__Group__14
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__13__Impl_in_rule__AssistModel__Group__132401);
            rule__AssistModel__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group__14_in_rule__AssistModel__Group__132404);
            rule__AssistModel__Group__14();

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
    // $ANTLR end "rule__AssistModel__Group__13"


    // $ANTLR start "rule__AssistModel__Group__13__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1062:1: rule__AssistModel__Group__13__Impl : ( '{' ) ;
    public final void rule__AssistModel__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1066:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1067:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1067:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1068:1: '{'
            {
             before(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,58,FOLLOW_58_in_rule__AssistModel__Group__13__Impl2432); 
             after(grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__13__Impl"


    // $ANTLR start "rule__AssistModel__Group__14"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1081:1: rule__AssistModel__Group__14 : rule__AssistModel__Group__14__Impl rule__AssistModel__Group__15 ;
    public final void rule__AssistModel__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1085:1: ( rule__AssistModel__Group__14__Impl rule__AssistModel__Group__15 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1086:2: rule__AssistModel__Group__14__Impl rule__AssistModel__Group__15
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__14__Impl_in_rule__AssistModel__Group__142463);
            rule__AssistModel__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssistModel__Group__15_in_rule__AssistModel__Group__142466);
            rule__AssistModel__Group__15();

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
    // $ANTLR end "rule__AssistModel__Group__14"


    // $ANTLR start "rule__AssistModel__Group__14__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1093:1: rule__AssistModel__Group__14__Impl : ( ( rule__AssistModel__InterfaceGroupsAssignment_14 ) ) ;
    public final void rule__AssistModel__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1097:1: ( ( ( rule__AssistModel__InterfaceGroupsAssignment_14 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1098:1: ( ( rule__AssistModel__InterfaceGroupsAssignment_14 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1098:1: ( ( rule__AssistModel__InterfaceGroupsAssignment_14 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1099:1: ( rule__AssistModel__InterfaceGroupsAssignment_14 )
            {
             before(grammarAccess.getAssistModelAccess().getInterfaceGroupsAssignment_14()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1100:1: ( rule__AssistModel__InterfaceGroupsAssignment_14 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1100:2: rule__AssistModel__InterfaceGroupsAssignment_14
            {
            pushFollow(FOLLOW_rule__AssistModel__InterfaceGroupsAssignment_14_in_rule__AssistModel__Group__14__Impl2493);
            rule__AssistModel__InterfaceGroupsAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getAssistModelAccess().getInterfaceGroupsAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__14__Impl"


    // $ANTLR start "rule__AssistModel__Group__15"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1110:1: rule__AssistModel__Group__15 : rule__AssistModel__Group__15__Impl ;
    public final void rule__AssistModel__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1114:1: ( rule__AssistModel__Group__15__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1115:2: rule__AssistModel__Group__15__Impl
            {
            pushFollow(FOLLOW_rule__AssistModel__Group__15__Impl_in_rule__AssistModel__Group__152523);
            rule__AssistModel__Group__15__Impl();

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
    // $ANTLR end "rule__AssistModel__Group__15"


    // $ANTLR start "rule__AssistModel__Group__15__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1121:1: rule__AssistModel__Group__15__Impl : ( '}' ) ;
    public final void rule__AssistModel__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1125:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1126:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1126:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1127:1: '}'
            {
             before(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_15()); 
            match(input,62,FOLLOW_62_in_rule__AssistModel__Group__15__Impl2551); 
             after(grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__Group__15__Impl"


    // $ANTLR start "rule__Compartment__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1172:1: rule__Compartment__Group__0 : rule__Compartment__Group__0__Impl rule__Compartment__Group__1 ;
    public final void rule__Compartment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1176:1: ( rule__Compartment__Group__0__Impl rule__Compartment__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1177:2: rule__Compartment__Group__0__Impl rule__Compartment__Group__1
            {
            pushFollow(FOLLOW_rule__Compartment__Group__0__Impl_in_rule__Compartment__Group__02614);
            rule__Compartment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__1_in_rule__Compartment__Group__02617);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1184:1: rule__Compartment__Group__0__Impl : ( 'Compartment' ) ;
    public final void rule__Compartment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1188:1: ( ( 'Compartment' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1189:1: ( 'Compartment' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1189:1: ( 'Compartment' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1190:1: 'Compartment'
            {
             before(grammarAccess.getCompartmentAccess().getCompartmentKeyword_0()); 
            match(input,65,FOLLOW_65_in_rule__Compartment__Group__0__Impl2645); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1203:1: rule__Compartment__Group__1 : rule__Compartment__Group__1__Impl rule__Compartment__Group__2 ;
    public final void rule__Compartment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1207:1: ( rule__Compartment__Group__1__Impl rule__Compartment__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1208:2: rule__Compartment__Group__1__Impl rule__Compartment__Group__2
            {
            pushFollow(FOLLOW_rule__Compartment__Group__1__Impl_in_rule__Compartment__Group__12676);
            rule__Compartment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__2_in_rule__Compartment__Group__12679);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1215:1: rule__Compartment__Group__1__Impl : ( ( rule__Compartment__NameAssignment_1 ) ) ;
    public final void rule__Compartment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1219:1: ( ( ( rule__Compartment__NameAssignment_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1220:1: ( ( rule__Compartment__NameAssignment_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1220:1: ( ( rule__Compartment__NameAssignment_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1221:1: ( rule__Compartment__NameAssignment_1 )
            {
             before(grammarAccess.getCompartmentAccess().getNameAssignment_1()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1222:1: ( rule__Compartment__NameAssignment_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1222:2: rule__Compartment__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Compartment__NameAssignment_1_in_rule__Compartment__Group__1__Impl2706);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1232:1: rule__Compartment__Group__2 : rule__Compartment__Group__2__Impl rule__Compartment__Group__3 ;
    public final void rule__Compartment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1236:1: ( rule__Compartment__Group__2__Impl rule__Compartment__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1237:2: rule__Compartment__Group__2__Impl rule__Compartment__Group__3
            {
            pushFollow(FOLLOW_rule__Compartment__Group__2__Impl_in_rule__Compartment__Group__22736);
            rule__Compartment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__3_in_rule__Compartment__Group__22739);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1244:1: rule__Compartment__Group__2__Impl : ( '{' ) ;
    public final void rule__Compartment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1248:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1249:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1249:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1250:1: '{'
            {
             before(grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_58_in_rule__Compartment__Group__2__Impl2767); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1263:1: rule__Compartment__Group__3 : rule__Compartment__Group__3__Impl rule__Compartment__Group__4 ;
    public final void rule__Compartment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1267:1: ( rule__Compartment__Group__3__Impl rule__Compartment__Group__4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1268:2: rule__Compartment__Group__3__Impl rule__Compartment__Group__4
            {
            pushFollow(FOLLOW_rule__Compartment__Group__3__Impl_in_rule__Compartment__Group__32798);
            rule__Compartment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__4_in_rule__Compartment__Group__32801);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1275:1: rule__Compartment__Group__3__Impl : ( ( rule__Compartment__Group_3__0 )? ) ;
    public final void rule__Compartment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1279:1: ( ( ( rule__Compartment__Group_3__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1280:1: ( ( rule__Compartment__Group_3__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1280:1: ( ( rule__Compartment__Group_3__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1281:1: ( rule__Compartment__Group_3__0 )?
            {
             before(grammarAccess.getCompartmentAccess().getGroup_3()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1282:1: ( rule__Compartment__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==66) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1282:2: rule__Compartment__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Compartment__Group_3__0_in_rule__Compartment__Group__3__Impl2828);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1292:1: rule__Compartment__Group__4 : rule__Compartment__Group__4__Impl rule__Compartment__Group__5 ;
    public final void rule__Compartment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1296:1: ( rule__Compartment__Group__4__Impl rule__Compartment__Group__5 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1297:2: rule__Compartment__Group__4__Impl rule__Compartment__Group__5
            {
            pushFollow(FOLLOW_rule__Compartment__Group__4__Impl_in_rule__Compartment__Group__42859);
            rule__Compartment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__5_in_rule__Compartment__Group__42862);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1304:1: rule__Compartment__Group__4__Impl : ( ( rule__Compartment__Group_4__0 )? ) ;
    public final void rule__Compartment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1308:1: ( ( ( rule__Compartment__Group_4__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1309:1: ( ( rule__Compartment__Group_4__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1309:1: ( ( rule__Compartment__Group_4__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1310:1: ( rule__Compartment__Group_4__0 )?
            {
             before(grammarAccess.getCompartmentAccess().getGroup_4()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1311:1: ( rule__Compartment__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==67) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1311:2: rule__Compartment__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Compartment__Group_4__0_in_rule__Compartment__Group__4__Impl2889);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1321:1: rule__Compartment__Group__5 : rule__Compartment__Group__5__Impl rule__Compartment__Group__6 ;
    public final void rule__Compartment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1325:1: ( rule__Compartment__Group__5__Impl rule__Compartment__Group__6 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1326:2: rule__Compartment__Group__5__Impl rule__Compartment__Group__6
            {
            pushFollow(FOLLOW_rule__Compartment__Group__5__Impl_in_rule__Compartment__Group__52920);
            rule__Compartment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__6_in_rule__Compartment__Group__52923);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1333:1: rule__Compartment__Group__5__Impl : ( ( rule__Compartment__Group_5__0 )? ) ;
    public final void rule__Compartment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1337:1: ( ( ( rule__Compartment__Group_5__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1338:1: ( ( rule__Compartment__Group_5__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1338:1: ( ( rule__Compartment__Group_5__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1339:1: ( rule__Compartment__Group_5__0 )?
            {
             before(grammarAccess.getCompartmentAccess().getGroup_5()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1340:1: ( rule__Compartment__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==68) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1340:2: rule__Compartment__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Compartment__Group_5__0_in_rule__Compartment__Group__5__Impl2950);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1350:1: rule__Compartment__Group__6 : rule__Compartment__Group__6__Impl rule__Compartment__Group__7 ;
    public final void rule__Compartment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1354:1: ( rule__Compartment__Group__6__Impl rule__Compartment__Group__7 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1355:2: rule__Compartment__Group__6__Impl rule__Compartment__Group__7
            {
            pushFollow(FOLLOW_rule__Compartment__Group__6__Impl_in_rule__Compartment__Group__62981);
            rule__Compartment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__7_in_rule__Compartment__Group__62984);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1362:1: rule__Compartment__Group__6__Impl : ( ( rule__Compartment__Group_6__0 )? ) ;
    public final void rule__Compartment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1366:1: ( ( ( rule__Compartment__Group_6__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1367:1: ( ( rule__Compartment__Group_6__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1367:1: ( ( rule__Compartment__Group_6__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1368:1: ( rule__Compartment__Group_6__0 )?
            {
             before(grammarAccess.getCompartmentAccess().getGroup_6()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1369:1: ( rule__Compartment__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==69) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1369:2: rule__Compartment__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Compartment__Group_6__0_in_rule__Compartment__Group__6__Impl3011);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1379:1: rule__Compartment__Group__7 : rule__Compartment__Group__7__Impl rule__Compartment__Group__8 ;
    public final void rule__Compartment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1383:1: ( rule__Compartment__Group__7__Impl rule__Compartment__Group__8 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1384:2: rule__Compartment__Group__7__Impl rule__Compartment__Group__8
            {
            pushFollow(FOLLOW_rule__Compartment__Group__7__Impl_in_rule__Compartment__Group__73042);
            rule__Compartment__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__8_in_rule__Compartment__Group__73045);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1391:1: rule__Compartment__Group__7__Impl : ( ( ( rule__Compartment__RdcsAssignment_7 ) ) ( ( rule__Compartment__RdcsAssignment_7 )* ) ) ;
    public final void rule__Compartment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1395:1: ( ( ( ( rule__Compartment__RdcsAssignment_7 ) ) ( ( rule__Compartment__RdcsAssignment_7 )* ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1396:1: ( ( ( rule__Compartment__RdcsAssignment_7 ) ) ( ( rule__Compartment__RdcsAssignment_7 )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1396:1: ( ( ( rule__Compartment__RdcsAssignment_7 ) ) ( ( rule__Compartment__RdcsAssignment_7 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1397:1: ( ( rule__Compartment__RdcsAssignment_7 ) ) ( ( rule__Compartment__RdcsAssignment_7 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1397:1: ( ( rule__Compartment__RdcsAssignment_7 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1398:1: ( rule__Compartment__RdcsAssignment_7 )
            {
             before(grammarAccess.getCompartmentAccess().getRdcsAssignment_7()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1399:1: ( rule__Compartment__RdcsAssignment_7 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1399:2: rule__Compartment__RdcsAssignment_7
            {
            pushFollow(FOLLOW_rule__Compartment__RdcsAssignment_7_in_rule__Compartment__Group__7__Impl3074);
            rule__Compartment__RdcsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCompartmentAccess().getRdcsAssignment_7()); 

            }

            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1402:1: ( ( rule__Compartment__RdcsAssignment_7 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1403:1: ( rule__Compartment__RdcsAssignment_7 )*
            {
             before(grammarAccess.getCompartmentAccess().getRdcsAssignment_7()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1404:1: ( rule__Compartment__RdcsAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==71) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1404:2: rule__Compartment__RdcsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Compartment__RdcsAssignment_7_in_rule__Compartment__Group__7__Impl3086);
            	    rule__Compartment__RdcsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1415:1: rule__Compartment__Group__8 : rule__Compartment__Group__8__Impl rule__Compartment__Group__9 ;
    public final void rule__Compartment__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1419:1: ( rule__Compartment__Group__8__Impl rule__Compartment__Group__9 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1420:2: rule__Compartment__Group__8__Impl rule__Compartment__Group__9
            {
            pushFollow(FOLLOW_rule__Compartment__Group__8__Impl_in_rule__Compartment__Group__83119);
            rule__Compartment__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group__9_in_rule__Compartment__Group__83122);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1427:1: rule__Compartment__Group__8__Impl : ( ( rule__Compartment__Group_8__0 )? ) ;
    public final void rule__Compartment__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1431:1: ( ( ( rule__Compartment__Group_8__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1432:1: ( ( rule__Compartment__Group_8__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1432:1: ( ( rule__Compartment__Group_8__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1433:1: ( rule__Compartment__Group_8__0 )?
            {
             before(grammarAccess.getCompartmentAccess().getGroup_8()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1434:1: ( rule__Compartment__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==70) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1434:2: rule__Compartment__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Compartment__Group_8__0_in_rule__Compartment__Group__8__Impl3149);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1444:1: rule__Compartment__Group__9 : rule__Compartment__Group__9__Impl ;
    public final void rule__Compartment__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1448:1: ( rule__Compartment__Group__9__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1449:2: rule__Compartment__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__Group__9__Impl_in_rule__Compartment__Group__93180);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1455:1: rule__Compartment__Group__9__Impl : ( '}' ) ;
    public final void rule__Compartment__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1459:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1460:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1460:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1461:1: '}'
            {
             before(grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_9()); 
            match(input,62,FOLLOW_62_in_rule__Compartment__Group__9__Impl3208); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1494:1: rule__Compartment__Group_3__0 : rule__Compartment__Group_3__0__Impl rule__Compartment__Group_3__1 ;
    public final void rule__Compartment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1498:1: ( rule__Compartment__Group_3__0__Impl rule__Compartment__Group_3__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1499:2: rule__Compartment__Group_3__0__Impl rule__Compartment__Group_3__1
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3__0__Impl_in_rule__Compartment__Group_3__03259);
            rule__Compartment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_3__1_in_rule__Compartment__Group_3__03262);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1506:1: rule__Compartment__Group_3__0__Impl : ( 'Manufacturer' ) ;
    public final void rule__Compartment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1510:1: ( ( 'Manufacturer' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1511:1: ( 'Manufacturer' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1511:1: ( 'Manufacturer' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1512:1: 'Manufacturer'
            {
             before(grammarAccess.getCompartmentAccess().getManufacturerKeyword_3_0()); 
            match(input,66,FOLLOW_66_in_rule__Compartment__Group_3__0__Impl3290); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1525:1: rule__Compartment__Group_3__1 : rule__Compartment__Group_3__1__Impl rule__Compartment__Group_3__2 ;
    public final void rule__Compartment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1529:1: ( rule__Compartment__Group_3__1__Impl rule__Compartment__Group_3__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1530:2: rule__Compartment__Group_3__1__Impl rule__Compartment__Group_3__2
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3__1__Impl_in_rule__Compartment__Group_3__13321);
            rule__Compartment__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_3__2_in_rule__Compartment__Group_3__13324);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1537:1: rule__Compartment__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Compartment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1541:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1542:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1542:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1543:1: '='
            {
             before(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_3_1()); 
            match(input,60,FOLLOW_60_in_rule__Compartment__Group_3__1__Impl3352); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1556:1: rule__Compartment__Group_3__2 : rule__Compartment__Group_3__2__Impl rule__Compartment__Group_3__3 ;
    public final void rule__Compartment__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1560:1: ( rule__Compartment__Group_3__2__Impl rule__Compartment__Group_3__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1561:2: rule__Compartment__Group_3__2__Impl rule__Compartment__Group_3__3
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3__2__Impl_in_rule__Compartment__Group_3__23383);
            rule__Compartment__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_3__3_in_rule__Compartment__Group_3__23386);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1568:1: rule__Compartment__Group_3__2__Impl : ( ( rule__Compartment__ManufacturerAssignment_3_2 ) ) ;
    public final void rule__Compartment__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1572:1: ( ( ( rule__Compartment__ManufacturerAssignment_3_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1573:1: ( ( rule__Compartment__ManufacturerAssignment_3_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1573:1: ( ( rule__Compartment__ManufacturerAssignment_3_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1574:1: ( rule__Compartment__ManufacturerAssignment_3_2 )
            {
             before(grammarAccess.getCompartmentAccess().getManufacturerAssignment_3_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1575:1: ( rule__Compartment__ManufacturerAssignment_3_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1575:2: rule__Compartment__ManufacturerAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Compartment__ManufacturerAssignment_3_2_in_rule__Compartment__Group_3__2__Impl3413);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1585:1: rule__Compartment__Group_3__3 : rule__Compartment__Group_3__3__Impl ;
    public final void rule__Compartment__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1589:1: ( rule__Compartment__Group_3__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1590:2: rule__Compartment__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__Group_3__3__Impl_in_rule__Compartment__Group_3__33443);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1596:1: rule__Compartment__Group_3__3__Impl : ( ';' ) ;
    public final void rule__Compartment__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1600:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1601:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1601:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1602:1: ';'
            {
             before(grammarAccess.getCompartmentAccess().getSemicolonKeyword_3_3()); 
            match(input,61,FOLLOW_61_in_rule__Compartment__Group_3__3__Impl3471); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1623:1: rule__Compartment__Group_4__0 : rule__Compartment__Group_4__0__Impl rule__Compartment__Group_4__1 ;
    public final void rule__Compartment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1627:1: ( rule__Compartment__Group_4__0__Impl rule__Compartment__Group_4__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1628:2: rule__Compartment__Group_4__0__Impl rule__Compartment__Group_4__1
            {
            pushFollow(FOLLOW_rule__Compartment__Group_4__0__Impl_in_rule__Compartment__Group_4__03510);
            rule__Compartment__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_4__1_in_rule__Compartment__Group_4__03513);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1635:1: rule__Compartment__Group_4__0__Impl : ( 'PowerSupply' ) ;
    public final void rule__Compartment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1639:1: ( ( 'PowerSupply' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1640:1: ( 'PowerSupply' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1640:1: ( 'PowerSupply' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1641:1: 'PowerSupply'
            {
             before(grammarAccess.getCompartmentAccess().getPowerSupplyKeyword_4_0()); 
            match(input,67,FOLLOW_67_in_rule__Compartment__Group_4__0__Impl3541); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1654:1: rule__Compartment__Group_4__1 : rule__Compartment__Group_4__1__Impl rule__Compartment__Group_4__2 ;
    public final void rule__Compartment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1658:1: ( rule__Compartment__Group_4__1__Impl rule__Compartment__Group_4__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1659:2: rule__Compartment__Group_4__1__Impl rule__Compartment__Group_4__2
            {
            pushFollow(FOLLOW_rule__Compartment__Group_4__1__Impl_in_rule__Compartment__Group_4__13572);
            rule__Compartment__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_4__2_in_rule__Compartment__Group_4__13575);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1666:1: rule__Compartment__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Compartment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1670:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1671:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1671:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1672:1: '='
            {
             before(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_4_1()); 
            match(input,60,FOLLOW_60_in_rule__Compartment__Group_4__1__Impl3603); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1685:1: rule__Compartment__Group_4__2 : rule__Compartment__Group_4__2__Impl rule__Compartment__Group_4__3 ;
    public final void rule__Compartment__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1689:1: ( rule__Compartment__Group_4__2__Impl rule__Compartment__Group_4__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1690:2: rule__Compartment__Group_4__2__Impl rule__Compartment__Group_4__3
            {
            pushFollow(FOLLOW_rule__Compartment__Group_4__2__Impl_in_rule__Compartment__Group_4__23634);
            rule__Compartment__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_4__3_in_rule__Compartment__Group_4__23637);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1697:1: rule__Compartment__Group_4__2__Impl : ( ( rule__Compartment__PowerSupplyAssignment_4_2 ) ) ;
    public final void rule__Compartment__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1701:1: ( ( ( rule__Compartment__PowerSupplyAssignment_4_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1702:1: ( ( rule__Compartment__PowerSupplyAssignment_4_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1702:1: ( ( rule__Compartment__PowerSupplyAssignment_4_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1703:1: ( rule__Compartment__PowerSupplyAssignment_4_2 )
            {
             before(grammarAccess.getCompartmentAccess().getPowerSupplyAssignment_4_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1704:1: ( rule__Compartment__PowerSupplyAssignment_4_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1704:2: rule__Compartment__PowerSupplyAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Compartment__PowerSupplyAssignment_4_2_in_rule__Compartment__Group_4__2__Impl3664);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1714:1: rule__Compartment__Group_4__3 : rule__Compartment__Group_4__3__Impl ;
    public final void rule__Compartment__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1718:1: ( rule__Compartment__Group_4__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1719:2: rule__Compartment__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__Group_4__3__Impl_in_rule__Compartment__Group_4__33694);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1725:1: rule__Compartment__Group_4__3__Impl : ( ';' ) ;
    public final void rule__Compartment__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1729:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1730:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1730:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1731:1: ';'
            {
             before(grammarAccess.getCompartmentAccess().getSemicolonKeyword_4_3()); 
            match(input,61,FOLLOW_61_in_rule__Compartment__Group_4__3__Impl3722); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1752:1: rule__Compartment__Group_5__0 : rule__Compartment__Group_5__0__Impl rule__Compartment__Group_5__1 ;
    public final void rule__Compartment__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1756:1: ( rule__Compartment__Group_5__0__Impl rule__Compartment__Group_5__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1757:2: rule__Compartment__Group_5__0__Impl rule__Compartment__Group_5__1
            {
            pushFollow(FOLLOW_rule__Compartment__Group_5__0__Impl_in_rule__Compartment__Group_5__03761);
            rule__Compartment__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_5__1_in_rule__Compartment__Group_5__03764);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1764:1: rule__Compartment__Group_5__0__Impl : ( 'Side' ) ;
    public final void rule__Compartment__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1768:1: ( ( 'Side' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1769:1: ( 'Side' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1769:1: ( 'Side' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1770:1: 'Side'
            {
             before(grammarAccess.getCompartmentAccess().getSideKeyword_5_0()); 
            match(input,68,FOLLOW_68_in_rule__Compartment__Group_5__0__Impl3792); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1783:1: rule__Compartment__Group_5__1 : rule__Compartment__Group_5__1__Impl rule__Compartment__Group_5__2 ;
    public final void rule__Compartment__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1787:1: ( rule__Compartment__Group_5__1__Impl rule__Compartment__Group_5__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1788:2: rule__Compartment__Group_5__1__Impl rule__Compartment__Group_5__2
            {
            pushFollow(FOLLOW_rule__Compartment__Group_5__1__Impl_in_rule__Compartment__Group_5__13823);
            rule__Compartment__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_5__2_in_rule__Compartment__Group_5__13826);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1795:1: rule__Compartment__Group_5__1__Impl : ( '=' ) ;
    public final void rule__Compartment__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1799:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1800:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1800:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1801:1: '='
            {
             before(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_5_1()); 
            match(input,60,FOLLOW_60_in_rule__Compartment__Group_5__1__Impl3854); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1814:1: rule__Compartment__Group_5__2 : rule__Compartment__Group_5__2__Impl rule__Compartment__Group_5__3 ;
    public final void rule__Compartment__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1818:1: ( rule__Compartment__Group_5__2__Impl rule__Compartment__Group_5__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1819:2: rule__Compartment__Group_5__2__Impl rule__Compartment__Group_5__3
            {
            pushFollow(FOLLOW_rule__Compartment__Group_5__2__Impl_in_rule__Compartment__Group_5__23885);
            rule__Compartment__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_5__3_in_rule__Compartment__Group_5__23888);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1826:1: rule__Compartment__Group_5__2__Impl : ( ( rule__Compartment__SideAssignment_5_2 ) ) ;
    public final void rule__Compartment__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1830:1: ( ( ( rule__Compartment__SideAssignment_5_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1831:1: ( ( rule__Compartment__SideAssignment_5_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1831:1: ( ( rule__Compartment__SideAssignment_5_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1832:1: ( rule__Compartment__SideAssignment_5_2 )
            {
             before(grammarAccess.getCompartmentAccess().getSideAssignment_5_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1833:1: ( rule__Compartment__SideAssignment_5_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1833:2: rule__Compartment__SideAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Compartment__SideAssignment_5_2_in_rule__Compartment__Group_5__2__Impl3915);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1843:1: rule__Compartment__Group_5__3 : rule__Compartment__Group_5__3__Impl ;
    public final void rule__Compartment__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1847:1: ( rule__Compartment__Group_5__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1848:2: rule__Compartment__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__Group_5__3__Impl_in_rule__Compartment__Group_5__33945);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1854:1: rule__Compartment__Group_5__3__Impl : ( ';' ) ;
    public final void rule__Compartment__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1858:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1859:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1859:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1860:1: ';'
            {
             before(grammarAccess.getCompartmentAccess().getSemicolonKeyword_5_3()); 
            match(input,61,FOLLOW_61_in_rule__Compartment__Group_5__3__Impl3973); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1881:1: rule__Compartment__Group_6__0 : rule__Compartment__Group_6__0__Impl rule__Compartment__Group_6__1 ;
    public final void rule__Compartment__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1885:1: ( rule__Compartment__Group_6__0__Impl rule__Compartment__Group_6__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1886:2: rule__Compartment__Group_6__0__Impl rule__Compartment__Group_6__1
            {
            pushFollow(FOLLOW_rule__Compartment__Group_6__0__Impl_in_rule__Compartment__Group_6__04012);
            rule__Compartment__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_6__1_in_rule__Compartment__Group_6__04015);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1893:1: rule__Compartment__Group_6__0__Impl : ( 'Zone' ) ;
    public final void rule__Compartment__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1897:1: ( ( 'Zone' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1898:1: ( 'Zone' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1898:1: ( 'Zone' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1899:1: 'Zone'
            {
             before(grammarAccess.getCompartmentAccess().getZoneKeyword_6_0()); 
            match(input,69,FOLLOW_69_in_rule__Compartment__Group_6__0__Impl4043); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1912:1: rule__Compartment__Group_6__1 : rule__Compartment__Group_6__1__Impl rule__Compartment__Group_6__2 ;
    public final void rule__Compartment__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1916:1: ( rule__Compartment__Group_6__1__Impl rule__Compartment__Group_6__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1917:2: rule__Compartment__Group_6__1__Impl rule__Compartment__Group_6__2
            {
            pushFollow(FOLLOW_rule__Compartment__Group_6__1__Impl_in_rule__Compartment__Group_6__14074);
            rule__Compartment__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_6__2_in_rule__Compartment__Group_6__14077);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1924:1: rule__Compartment__Group_6__1__Impl : ( '=' ) ;
    public final void rule__Compartment__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1928:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1929:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1929:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1930:1: '='
            {
             before(grammarAccess.getCompartmentAccess().getEqualsSignKeyword_6_1()); 
            match(input,60,FOLLOW_60_in_rule__Compartment__Group_6__1__Impl4105); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1943:1: rule__Compartment__Group_6__2 : rule__Compartment__Group_6__2__Impl rule__Compartment__Group_6__3 ;
    public final void rule__Compartment__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1947:1: ( rule__Compartment__Group_6__2__Impl rule__Compartment__Group_6__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1948:2: rule__Compartment__Group_6__2__Impl rule__Compartment__Group_6__3
            {
            pushFollow(FOLLOW_rule__Compartment__Group_6__2__Impl_in_rule__Compartment__Group_6__24136);
            rule__Compartment__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_6__3_in_rule__Compartment__Group_6__24139);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1955:1: rule__Compartment__Group_6__2__Impl : ( ( rule__Compartment__ZoneAssignment_6_2 ) ) ;
    public final void rule__Compartment__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1959:1: ( ( ( rule__Compartment__ZoneAssignment_6_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1960:1: ( ( rule__Compartment__ZoneAssignment_6_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1960:1: ( ( rule__Compartment__ZoneAssignment_6_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1961:1: ( rule__Compartment__ZoneAssignment_6_2 )
            {
             before(grammarAccess.getCompartmentAccess().getZoneAssignment_6_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1962:1: ( rule__Compartment__ZoneAssignment_6_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1962:2: rule__Compartment__ZoneAssignment_6_2
            {
            pushFollow(FOLLOW_rule__Compartment__ZoneAssignment_6_2_in_rule__Compartment__Group_6__2__Impl4166);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1972:1: rule__Compartment__Group_6__3 : rule__Compartment__Group_6__3__Impl ;
    public final void rule__Compartment__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1976:1: ( rule__Compartment__Group_6__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1977:2: rule__Compartment__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__Group_6__3__Impl_in_rule__Compartment__Group_6__34196);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1983:1: rule__Compartment__Group_6__3__Impl : ( ';' ) ;
    public final void rule__Compartment__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1987:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1988:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1988:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:1989:1: ';'
            {
             before(grammarAccess.getCompartmentAccess().getSemicolonKeyword_6_3()); 
            match(input,61,FOLLOW_61_in_rule__Compartment__Group_6__3__Impl4224); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2010:1: rule__Compartment__Group_8__0 : rule__Compartment__Group_8__0__Impl rule__Compartment__Group_8__1 ;
    public final void rule__Compartment__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2014:1: ( rule__Compartment__Group_8__0__Impl rule__Compartment__Group_8__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2015:2: rule__Compartment__Group_8__0__Impl rule__Compartment__Group_8__1
            {
            pushFollow(FOLLOW_rule__Compartment__Group_8__0__Impl_in_rule__Compartment__Group_8__04263);
            rule__Compartment__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_8__1_in_rule__Compartment__Group_8__04266);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2022:1: rule__Compartment__Group_8__0__Impl : ( 'Generic properties' ) ;
    public final void rule__Compartment__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2026:1: ( ( 'Generic properties' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2027:1: ( 'Generic properties' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2027:1: ( 'Generic properties' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2028:1: 'Generic properties'
            {
             before(grammarAccess.getCompartmentAccess().getGenericPropertiesKeyword_8_0()); 
            match(input,70,FOLLOW_70_in_rule__Compartment__Group_8__0__Impl4294); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2041:1: rule__Compartment__Group_8__1 : rule__Compartment__Group_8__1__Impl rule__Compartment__Group_8__2 ;
    public final void rule__Compartment__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2045:1: ( rule__Compartment__Group_8__1__Impl rule__Compartment__Group_8__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2046:2: rule__Compartment__Group_8__1__Impl rule__Compartment__Group_8__2
            {
            pushFollow(FOLLOW_rule__Compartment__Group_8__1__Impl_in_rule__Compartment__Group_8__14325);
            rule__Compartment__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_8__2_in_rule__Compartment__Group_8__14328);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2053:1: rule__Compartment__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Compartment__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2057:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2058:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2058:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2059:1: '{'
            {
             before(grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,58,FOLLOW_58_in_rule__Compartment__Group_8__1__Impl4356); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2072:1: rule__Compartment__Group_8__2 : rule__Compartment__Group_8__2__Impl rule__Compartment__Group_8__3 ;
    public final void rule__Compartment__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2076:1: ( rule__Compartment__Group_8__2__Impl rule__Compartment__Group_8__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2077:2: rule__Compartment__Group_8__2__Impl rule__Compartment__Group_8__3
            {
            pushFollow(FOLLOW_rule__Compartment__Group_8__2__Impl_in_rule__Compartment__Group_8__24387);
            rule__Compartment__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compartment__Group_8__3_in_rule__Compartment__Group_8__24390);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2084:1: rule__Compartment__Group_8__2__Impl : ( ( rule__Compartment__MetricParametersAssignment_8_2 )* ) ;
    public final void rule__Compartment__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2088:1: ( ( ( rule__Compartment__MetricParametersAssignment_8_2 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2089:1: ( ( rule__Compartment__MetricParametersAssignment_8_2 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2089:1: ( ( rule__Compartment__MetricParametersAssignment_8_2 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2090:1: ( rule__Compartment__MetricParametersAssignment_8_2 )*
            {
             before(grammarAccess.getCompartmentAccess().getMetricParametersAssignment_8_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2091:1: ( rule__Compartment__MetricParametersAssignment_8_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2091:2: rule__Compartment__MetricParametersAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__Compartment__MetricParametersAssignment_8_2_in_rule__Compartment__Group_8__2__Impl4417);
            	    rule__Compartment__MetricParametersAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2101:1: rule__Compartment__Group_8__3 : rule__Compartment__Group_8__3__Impl ;
    public final void rule__Compartment__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2105:1: ( rule__Compartment__Group_8__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2106:2: rule__Compartment__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Compartment__Group_8__3__Impl_in_rule__Compartment__Group_8__34448);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2112:1: rule__Compartment__Group_8__3__Impl : ( '}' ) ;
    public final void rule__Compartment__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2116:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2117:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2117:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2118:1: '}'
            {
             before(grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_8_3()); 
            match(input,62,FOLLOW_62_in_rule__Compartment__Group_8__3__Impl4476); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2139:1: rule__RDC__Group__0 : rule__RDC__Group__0__Impl rule__RDC__Group__1 ;
    public final void rule__RDC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2143:1: ( rule__RDC__Group__0__Impl rule__RDC__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2144:2: rule__RDC__Group__0__Impl rule__RDC__Group__1
            {
            pushFollow(FOLLOW_rule__RDC__Group__0__Impl_in_rule__RDC__Group__04515);
            rule__RDC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__1_in_rule__RDC__Group__04518);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2151:1: rule__RDC__Group__0__Impl : ( 'RDC' ) ;
    public final void rule__RDC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2155:1: ( ( 'RDC' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2156:1: ( 'RDC' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2156:1: ( 'RDC' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2157:1: 'RDC'
            {
             before(grammarAccess.getRDCAccess().getRDCKeyword_0()); 
            match(input,71,FOLLOW_71_in_rule__RDC__Group__0__Impl4546); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2170:1: rule__RDC__Group__1 : rule__RDC__Group__1__Impl rule__RDC__Group__2 ;
    public final void rule__RDC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2174:1: ( rule__RDC__Group__1__Impl rule__RDC__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2175:2: rule__RDC__Group__1__Impl rule__RDC__Group__2
            {
            pushFollow(FOLLOW_rule__RDC__Group__1__Impl_in_rule__RDC__Group__14577);
            rule__RDC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__2_in_rule__RDC__Group__14580);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2182:1: rule__RDC__Group__1__Impl : ( ( rule__RDC__NameAssignment_1 ) ) ;
    public final void rule__RDC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2186:1: ( ( ( rule__RDC__NameAssignment_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2187:1: ( ( rule__RDC__NameAssignment_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2187:1: ( ( rule__RDC__NameAssignment_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2188:1: ( rule__RDC__NameAssignment_1 )
            {
             before(grammarAccess.getRDCAccess().getNameAssignment_1()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2189:1: ( rule__RDC__NameAssignment_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2189:2: rule__RDC__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RDC__NameAssignment_1_in_rule__RDC__Group__1__Impl4607);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2199:1: rule__RDC__Group__2 : rule__RDC__Group__2__Impl rule__RDC__Group__3 ;
    public final void rule__RDC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2203:1: ( rule__RDC__Group__2__Impl rule__RDC__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2204:2: rule__RDC__Group__2__Impl rule__RDC__Group__3
            {
            pushFollow(FOLLOW_rule__RDC__Group__2__Impl_in_rule__RDC__Group__24637);
            rule__RDC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__3_in_rule__RDC__Group__24640);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2211:1: rule__RDC__Group__2__Impl : ( '{' ) ;
    public final void rule__RDC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2215:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2216:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2216:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2217:1: '{'
            {
             before(grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_58_in_rule__RDC__Group__2__Impl4668); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2230:1: rule__RDC__Group__3 : rule__RDC__Group__3__Impl rule__RDC__Group__4 ;
    public final void rule__RDC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2234:1: ( rule__RDC__Group__3__Impl rule__RDC__Group__4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2235:2: rule__RDC__Group__3__Impl rule__RDC__Group__4
            {
            pushFollow(FOLLOW_rule__RDC__Group__3__Impl_in_rule__RDC__Group__34699);
            rule__RDC__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__4_in_rule__RDC__Group__34702);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2242:1: rule__RDC__Group__3__Impl : ( ( rule__RDC__Group_3__0 )? ) ;
    public final void rule__RDC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2246:1: ( ( ( rule__RDC__Group_3__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2247:1: ( ( rule__RDC__Group_3__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2247:1: ( ( rule__RDC__Group_3__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2248:1: ( rule__RDC__Group_3__0 )?
            {
             before(grammarAccess.getRDCAccess().getGroup_3()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2249:1: ( rule__RDC__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==66) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2249:2: rule__RDC__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__RDC__Group_3__0_in_rule__RDC__Group__3__Impl4729);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2259:1: rule__RDC__Group__4 : rule__RDC__Group__4__Impl rule__RDC__Group__5 ;
    public final void rule__RDC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2263:1: ( rule__RDC__Group__4__Impl rule__RDC__Group__5 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2264:2: rule__RDC__Group__4__Impl rule__RDC__Group__5
            {
            pushFollow(FOLLOW_rule__RDC__Group__4__Impl_in_rule__RDC__Group__44760);
            rule__RDC__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__5_in_rule__RDC__Group__44763);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2271:1: rule__RDC__Group__4__Impl : ( ( rule__RDC__Group_4__0 )? ) ;
    public final void rule__RDC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2275:1: ( ( ( rule__RDC__Group_4__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2276:1: ( ( rule__RDC__Group_4__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2276:1: ( ( rule__RDC__Group_4__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2277:1: ( rule__RDC__Group_4__0 )?
            {
             before(grammarAccess.getRDCAccess().getGroup_4()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2278:1: ( rule__RDC__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==67) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2278:2: rule__RDC__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RDC__Group_4__0_in_rule__RDC__Group__4__Impl4790);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2288:1: rule__RDC__Group__5 : rule__RDC__Group__5__Impl rule__RDC__Group__6 ;
    public final void rule__RDC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2292:1: ( rule__RDC__Group__5__Impl rule__RDC__Group__6 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2293:2: rule__RDC__Group__5__Impl rule__RDC__Group__6
            {
            pushFollow(FOLLOW_rule__RDC__Group__5__Impl_in_rule__RDC__Group__54821);
            rule__RDC__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__6_in_rule__RDC__Group__54824);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2300:1: rule__RDC__Group__5__Impl : ( ( rule__RDC__Group_5__0 )? ) ;
    public final void rule__RDC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2304:1: ( ( ( rule__RDC__Group_5__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2305:1: ( ( rule__RDC__Group_5__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2305:1: ( ( rule__RDC__Group_5__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2306:1: ( rule__RDC__Group_5__0 )?
            {
             before(grammarAccess.getRDCAccess().getGroup_5()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2307:1: ( rule__RDC__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==72) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2307:2: rule__RDC__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__RDC__Group_5__0_in_rule__RDC__Group__5__Impl4851);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2317:1: rule__RDC__Group__6 : rule__RDC__Group__6__Impl rule__RDC__Group__7 ;
    public final void rule__RDC__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2321:1: ( rule__RDC__Group__6__Impl rule__RDC__Group__7 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2322:2: rule__RDC__Group__6__Impl rule__RDC__Group__7
            {
            pushFollow(FOLLOW_rule__RDC__Group__6__Impl_in_rule__RDC__Group__64882);
            rule__RDC__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__7_in_rule__RDC__Group__64885);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2329:1: rule__RDC__Group__6__Impl : ( ( rule__RDC__Group_6__0 )? ) ;
    public final void rule__RDC__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2333:1: ( ( ( rule__RDC__Group_6__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2334:1: ( ( rule__RDC__Group_6__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2334:1: ( ( rule__RDC__Group_6__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2335:1: ( rule__RDC__Group_6__0 )?
            {
             before(grammarAccess.getRDCAccess().getGroup_6()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2336:1: ( rule__RDC__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==73) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2336:2: rule__RDC__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__RDC__Group_6__0_in_rule__RDC__Group__6__Impl4912);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2346:1: rule__RDC__Group__7 : rule__RDC__Group__7__Impl rule__RDC__Group__8 ;
    public final void rule__RDC__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2350:1: ( rule__RDC__Group__7__Impl rule__RDC__Group__8 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2351:2: rule__RDC__Group__7__Impl rule__RDC__Group__8
            {
            pushFollow(FOLLOW_rule__RDC__Group__7__Impl_in_rule__RDC__Group__74943);
            rule__RDC__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__8_in_rule__RDC__Group__74946);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2358:1: rule__RDC__Group__7__Impl : ( ( ( rule__RDC__ConnectorsAssignment_7 ) ) ( ( rule__RDC__ConnectorsAssignment_7 )* ) ) ;
    public final void rule__RDC__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2362:1: ( ( ( ( rule__RDC__ConnectorsAssignment_7 ) ) ( ( rule__RDC__ConnectorsAssignment_7 )* ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2363:1: ( ( ( rule__RDC__ConnectorsAssignment_7 ) ) ( ( rule__RDC__ConnectorsAssignment_7 )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2363:1: ( ( ( rule__RDC__ConnectorsAssignment_7 ) ) ( ( rule__RDC__ConnectorsAssignment_7 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2364:1: ( ( rule__RDC__ConnectorsAssignment_7 ) ) ( ( rule__RDC__ConnectorsAssignment_7 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2364:1: ( ( rule__RDC__ConnectorsAssignment_7 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2365:1: ( rule__RDC__ConnectorsAssignment_7 )
            {
             before(grammarAccess.getRDCAccess().getConnectorsAssignment_7()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2366:1: ( rule__RDC__ConnectorsAssignment_7 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2366:2: rule__RDC__ConnectorsAssignment_7
            {
            pushFollow(FOLLOW_rule__RDC__ConnectorsAssignment_7_in_rule__RDC__Group__7__Impl4975);
            rule__RDC__ConnectorsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRDCAccess().getConnectorsAssignment_7()); 

            }

            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2369:1: ( ( rule__RDC__ConnectorsAssignment_7 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2370:1: ( rule__RDC__ConnectorsAssignment_7 )*
            {
             before(grammarAccess.getRDCAccess().getConnectorsAssignment_7()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2371:1: ( rule__RDC__ConnectorsAssignment_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==74) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2371:2: rule__RDC__ConnectorsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__RDC__ConnectorsAssignment_7_in_rule__RDC__Group__7__Impl4987);
            	    rule__RDC__ConnectorsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2382:1: rule__RDC__Group__8 : rule__RDC__Group__8__Impl rule__RDC__Group__9 ;
    public final void rule__RDC__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2386:1: ( rule__RDC__Group__8__Impl rule__RDC__Group__9 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2387:2: rule__RDC__Group__8__Impl rule__RDC__Group__9
            {
            pushFollow(FOLLOW_rule__RDC__Group__8__Impl_in_rule__RDC__Group__85020);
            rule__RDC__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group__9_in_rule__RDC__Group__85023);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2394:1: rule__RDC__Group__8__Impl : ( ( rule__RDC__Group_8__0 )? ) ;
    public final void rule__RDC__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2398:1: ( ( ( rule__RDC__Group_8__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2399:1: ( ( rule__RDC__Group_8__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2399:1: ( ( rule__RDC__Group_8__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2400:1: ( rule__RDC__Group_8__0 )?
            {
             before(grammarAccess.getRDCAccess().getGroup_8()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2401:1: ( rule__RDC__Group_8__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==70) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2401:2: rule__RDC__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__RDC__Group_8__0_in_rule__RDC__Group__8__Impl5050);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2411:1: rule__RDC__Group__9 : rule__RDC__Group__9__Impl ;
    public final void rule__RDC__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2415:1: ( rule__RDC__Group__9__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2416:2: rule__RDC__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group__9__Impl_in_rule__RDC__Group__95081);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2422:1: rule__RDC__Group__9__Impl : ( '}' ) ;
    public final void rule__RDC__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2426:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2427:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2427:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2428:1: '}'
            {
             before(grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_9()); 
            match(input,62,FOLLOW_62_in_rule__RDC__Group__9__Impl5109); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2461:1: rule__RDC__Group_3__0 : rule__RDC__Group_3__0__Impl rule__RDC__Group_3__1 ;
    public final void rule__RDC__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2465:1: ( rule__RDC__Group_3__0__Impl rule__RDC__Group_3__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2466:2: rule__RDC__Group_3__0__Impl rule__RDC__Group_3__1
            {
            pushFollow(FOLLOW_rule__RDC__Group_3__0__Impl_in_rule__RDC__Group_3__05160);
            rule__RDC__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_3__1_in_rule__RDC__Group_3__05163);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2473:1: rule__RDC__Group_3__0__Impl : ( 'Manufacturer' ) ;
    public final void rule__RDC__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2477:1: ( ( 'Manufacturer' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2478:1: ( 'Manufacturer' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2478:1: ( 'Manufacturer' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2479:1: 'Manufacturer'
            {
             before(grammarAccess.getRDCAccess().getManufacturerKeyword_3_0()); 
            match(input,66,FOLLOW_66_in_rule__RDC__Group_3__0__Impl5191); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2492:1: rule__RDC__Group_3__1 : rule__RDC__Group_3__1__Impl rule__RDC__Group_3__2 ;
    public final void rule__RDC__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2496:1: ( rule__RDC__Group_3__1__Impl rule__RDC__Group_3__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2497:2: rule__RDC__Group_3__1__Impl rule__RDC__Group_3__2
            {
            pushFollow(FOLLOW_rule__RDC__Group_3__1__Impl_in_rule__RDC__Group_3__15222);
            rule__RDC__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_3__2_in_rule__RDC__Group_3__15225);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2504:1: rule__RDC__Group_3__1__Impl : ( '=' ) ;
    public final void rule__RDC__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2508:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2509:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2509:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2510:1: '='
            {
             before(grammarAccess.getRDCAccess().getEqualsSignKeyword_3_1()); 
            match(input,60,FOLLOW_60_in_rule__RDC__Group_3__1__Impl5253); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2523:1: rule__RDC__Group_3__2 : rule__RDC__Group_3__2__Impl rule__RDC__Group_3__3 ;
    public final void rule__RDC__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2527:1: ( rule__RDC__Group_3__2__Impl rule__RDC__Group_3__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2528:2: rule__RDC__Group_3__2__Impl rule__RDC__Group_3__3
            {
            pushFollow(FOLLOW_rule__RDC__Group_3__2__Impl_in_rule__RDC__Group_3__25284);
            rule__RDC__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_3__3_in_rule__RDC__Group_3__25287);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2535:1: rule__RDC__Group_3__2__Impl : ( ( rule__RDC__ManufacturerAssignment_3_2 ) ) ;
    public final void rule__RDC__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2539:1: ( ( ( rule__RDC__ManufacturerAssignment_3_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2540:1: ( ( rule__RDC__ManufacturerAssignment_3_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2540:1: ( ( rule__RDC__ManufacturerAssignment_3_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2541:1: ( rule__RDC__ManufacturerAssignment_3_2 )
            {
             before(grammarAccess.getRDCAccess().getManufacturerAssignment_3_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2542:1: ( rule__RDC__ManufacturerAssignment_3_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2542:2: rule__RDC__ManufacturerAssignment_3_2
            {
            pushFollow(FOLLOW_rule__RDC__ManufacturerAssignment_3_2_in_rule__RDC__Group_3__2__Impl5314);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2552:1: rule__RDC__Group_3__3 : rule__RDC__Group_3__3__Impl ;
    public final void rule__RDC__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2556:1: ( rule__RDC__Group_3__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2557:2: rule__RDC__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group_3__3__Impl_in_rule__RDC__Group_3__35344);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2563:1: rule__RDC__Group_3__3__Impl : ( ';' ) ;
    public final void rule__RDC__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2567:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2568:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2568:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2569:1: ';'
            {
             before(grammarAccess.getRDCAccess().getSemicolonKeyword_3_3()); 
            match(input,61,FOLLOW_61_in_rule__RDC__Group_3__3__Impl5372); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2590:1: rule__RDC__Group_4__0 : rule__RDC__Group_4__0__Impl rule__RDC__Group_4__1 ;
    public final void rule__RDC__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2594:1: ( rule__RDC__Group_4__0__Impl rule__RDC__Group_4__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2595:2: rule__RDC__Group_4__0__Impl rule__RDC__Group_4__1
            {
            pushFollow(FOLLOW_rule__RDC__Group_4__0__Impl_in_rule__RDC__Group_4__05411);
            rule__RDC__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_4__1_in_rule__RDC__Group_4__05414);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2602:1: rule__RDC__Group_4__0__Impl : ( 'PowerSupply' ) ;
    public final void rule__RDC__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2606:1: ( ( 'PowerSupply' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2607:1: ( 'PowerSupply' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2607:1: ( 'PowerSupply' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2608:1: 'PowerSupply'
            {
             before(grammarAccess.getRDCAccess().getPowerSupplyKeyword_4_0()); 
            match(input,67,FOLLOW_67_in_rule__RDC__Group_4__0__Impl5442); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2621:1: rule__RDC__Group_4__1 : rule__RDC__Group_4__1__Impl rule__RDC__Group_4__2 ;
    public final void rule__RDC__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2625:1: ( rule__RDC__Group_4__1__Impl rule__RDC__Group_4__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2626:2: rule__RDC__Group_4__1__Impl rule__RDC__Group_4__2
            {
            pushFollow(FOLLOW_rule__RDC__Group_4__1__Impl_in_rule__RDC__Group_4__15473);
            rule__RDC__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_4__2_in_rule__RDC__Group_4__15476);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2633:1: rule__RDC__Group_4__1__Impl : ( '=' ) ;
    public final void rule__RDC__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2637:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2638:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2638:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2639:1: '='
            {
             before(grammarAccess.getRDCAccess().getEqualsSignKeyword_4_1()); 
            match(input,60,FOLLOW_60_in_rule__RDC__Group_4__1__Impl5504); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2652:1: rule__RDC__Group_4__2 : rule__RDC__Group_4__2__Impl rule__RDC__Group_4__3 ;
    public final void rule__RDC__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2656:1: ( rule__RDC__Group_4__2__Impl rule__RDC__Group_4__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2657:2: rule__RDC__Group_4__2__Impl rule__RDC__Group_4__3
            {
            pushFollow(FOLLOW_rule__RDC__Group_4__2__Impl_in_rule__RDC__Group_4__25535);
            rule__RDC__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_4__3_in_rule__RDC__Group_4__25538);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2664:1: rule__RDC__Group_4__2__Impl : ( ( rule__RDC__PowerSupplyAssignment_4_2 ) ) ;
    public final void rule__RDC__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2668:1: ( ( ( rule__RDC__PowerSupplyAssignment_4_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2669:1: ( ( rule__RDC__PowerSupplyAssignment_4_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2669:1: ( ( rule__RDC__PowerSupplyAssignment_4_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2670:1: ( rule__RDC__PowerSupplyAssignment_4_2 )
            {
             before(grammarAccess.getRDCAccess().getPowerSupplyAssignment_4_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2671:1: ( rule__RDC__PowerSupplyAssignment_4_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2671:2: rule__RDC__PowerSupplyAssignment_4_2
            {
            pushFollow(FOLLOW_rule__RDC__PowerSupplyAssignment_4_2_in_rule__RDC__Group_4__2__Impl5565);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2681:1: rule__RDC__Group_4__3 : rule__RDC__Group_4__3__Impl ;
    public final void rule__RDC__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2685:1: ( rule__RDC__Group_4__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2686:2: rule__RDC__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group_4__3__Impl_in_rule__RDC__Group_4__35595);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2692:1: rule__RDC__Group_4__3__Impl : ( ';' ) ;
    public final void rule__RDC__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2696:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2697:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2697:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2698:1: ';'
            {
             before(grammarAccess.getRDCAccess().getSemicolonKeyword_4_3()); 
            match(input,61,FOLLOW_61_in_rule__RDC__Group_4__3__Impl5623); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2719:1: rule__RDC__Group_5__0 : rule__RDC__Group_5__0__Impl rule__RDC__Group_5__1 ;
    public final void rule__RDC__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2723:1: ( rule__RDC__Group_5__0__Impl rule__RDC__Group_5__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2724:2: rule__RDC__Group_5__0__Impl rule__RDC__Group_5__1
            {
            pushFollow(FOLLOW_rule__RDC__Group_5__0__Impl_in_rule__RDC__Group_5__05662);
            rule__RDC__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_5__1_in_rule__RDC__Group_5__05665);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2731:1: rule__RDC__Group_5__0__Impl : ( 'Type' ) ;
    public final void rule__RDC__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2735:1: ( ( 'Type' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2736:1: ( 'Type' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2736:1: ( 'Type' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2737:1: 'Type'
            {
             before(grammarAccess.getRDCAccess().getTypeKeyword_5_0()); 
            match(input,72,FOLLOW_72_in_rule__RDC__Group_5__0__Impl5693); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2750:1: rule__RDC__Group_5__1 : rule__RDC__Group_5__1__Impl rule__RDC__Group_5__2 ;
    public final void rule__RDC__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2754:1: ( rule__RDC__Group_5__1__Impl rule__RDC__Group_5__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2755:2: rule__RDC__Group_5__1__Impl rule__RDC__Group_5__2
            {
            pushFollow(FOLLOW_rule__RDC__Group_5__1__Impl_in_rule__RDC__Group_5__15724);
            rule__RDC__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_5__2_in_rule__RDC__Group_5__15727);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2762:1: rule__RDC__Group_5__1__Impl : ( '=' ) ;
    public final void rule__RDC__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2766:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2767:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2767:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2768:1: '='
            {
             before(grammarAccess.getRDCAccess().getEqualsSignKeyword_5_1()); 
            match(input,60,FOLLOW_60_in_rule__RDC__Group_5__1__Impl5755); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2781:1: rule__RDC__Group_5__2 : rule__RDC__Group_5__2__Impl rule__RDC__Group_5__3 ;
    public final void rule__RDC__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2785:1: ( rule__RDC__Group_5__2__Impl rule__RDC__Group_5__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2786:2: rule__RDC__Group_5__2__Impl rule__RDC__Group_5__3
            {
            pushFollow(FOLLOW_rule__RDC__Group_5__2__Impl_in_rule__RDC__Group_5__25786);
            rule__RDC__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_5__3_in_rule__RDC__Group_5__25789);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2793:1: rule__RDC__Group_5__2__Impl : ( ( rule__RDC__RdcTypeAssignment_5_2 ) ) ;
    public final void rule__RDC__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2797:1: ( ( ( rule__RDC__RdcTypeAssignment_5_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2798:1: ( ( rule__RDC__RdcTypeAssignment_5_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2798:1: ( ( rule__RDC__RdcTypeAssignment_5_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2799:1: ( rule__RDC__RdcTypeAssignment_5_2 )
            {
             before(grammarAccess.getRDCAccess().getRdcTypeAssignment_5_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2800:1: ( rule__RDC__RdcTypeAssignment_5_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2800:2: rule__RDC__RdcTypeAssignment_5_2
            {
            pushFollow(FOLLOW_rule__RDC__RdcTypeAssignment_5_2_in_rule__RDC__Group_5__2__Impl5816);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2810:1: rule__RDC__Group_5__3 : rule__RDC__Group_5__3__Impl ;
    public final void rule__RDC__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2814:1: ( rule__RDC__Group_5__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2815:2: rule__RDC__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group_5__3__Impl_in_rule__RDC__Group_5__35846);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2821:1: rule__RDC__Group_5__3__Impl : ( ';' ) ;
    public final void rule__RDC__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2825:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2826:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2826:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2827:1: ';'
            {
             before(grammarAccess.getRDCAccess().getSemicolonKeyword_5_3()); 
            match(input,61,FOLLOW_61_in_rule__RDC__Group_5__3__Impl5874); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2848:1: rule__RDC__Group_6__0 : rule__RDC__Group_6__0__Impl rule__RDC__Group_6__1 ;
    public final void rule__RDC__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2852:1: ( rule__RDC__Group_6__0__Impl rule__RDC__Group_6__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2853:2: rule__RDC__Group_6__0__Impl rule__RDC__Group_6__1
            {
            pushFollow(FOLLOW_rule__RDC__Group_6__0__Impl_in_rule__RDC__Group_6__05913);
            rule__RDC__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_6__1_in_rule__RDC__Group_6__05916);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2860:1: rule__RDC__Group_6__0__Impl : ( 'ESS' ) ;
    public final void rule__RDC__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2864:1: ( ( 'ESS' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2865:1: ( 'ESS' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2865:1: ( 'ESS' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2866:1: 'ESS'
            {
             before(grammarAccess.getRDCAccess().getESSKeyword_6_0()); 
            match(input,73,FOLLOW_73_in_rule__RDC__Group_6__0__Impl5944); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2879:1: rule__RDC__Group_6__1 : rule__RDC__Group_6__1__Impl rule__RDC__Group_6__2 ;
    public final void rule__RDC__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2883:1: ( rule__RDC__Group_6__1__Impl rule__RDC__Group_6__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2884:2: rule__RDC__Group_6__1__Impl rule__RDC__Group_6__2
            {
            pushFollow(FOLLOW_rule__RDC__Group_6__1__Impl_in_rule__RDC__Group_6__15975);
            rule__RDC__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_6__2_in_rule__RDC__Group_6__15978);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2891:1: rule__RDC__Group_6__1__Impl : ( '=' ) ;
    public final void rule__RDC__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2895:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2896:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2896:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2897:1: '='
            {
             before(grammarAccess.getRDCAccess().getEqualsSignKeyword_6_1()); 
            match(input,60,FOLLOW_60_in_rule__RDC__Group_6__1__Impl6006); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2910:1: rule__RDC__Group_6__2 : rule__RDC__Group_6__2__Impl rule__RDC__Group_6__3 ;
    public final void rule__RDC__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2914:1: ( rule__RDC__Group_6__2__Impl rule__RDC__Group_6__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2915:2: rule__RDC__Group_6__2__Impl rule__RDC__Group_6__3
            {
            pushFollow(FOLLOW_rule__RDC__Group_6__2__Impl_in_rule__RDC__Group_6__26037);
            rule__RDC__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_6__3_in_rule__RDC__Group_6__26040);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2922:1: rule__RDC__Group_6__2__Impl : ( ( rule__RDC__EssAssignment_6_2 ) ) ;
    public final void rule__RDC__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2926:1: ( ( ( rule__RDC__EssAssignment_6_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2927:1: ( ( rule__RDC__EssAssignment_6_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2927:1: ( ( rule__RDC__EssAssignment_6_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2928:1: ( rule__RDC__EssAssignment_6_2 )
            {
             before(grammarAccess.getRDCAccess().getEssAssignment_6_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2929:1: ( rule__RDC__EssAssignment_6_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2929:2: rule__RDC__EssAssignment_6_2
            {
            pushFollow(FOLLOW_rule__RDC__EssAssignment_6_2_in_rule__RDC__Group_6__2__Impl6067);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2939:1: rule__RDC__Group_6__3 : rule__RDC__Group_6__3__Impl ;
    public final void rule__RDC__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2943:1: ( rule__RDC__Group_6__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2944:2: rule__RDC__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group_6__3__Impl_in_rule__RDC__Group_6__36097);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2950:1: rule__RDC__Group_6__3__Impl : ( ';' ) ;
    public final void rule__RDC__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2954:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2955:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2955:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2956:1: ';'
            {
             before(grammarAccess.getRDCAccess().getSemicolonKeyword_6_3()); 
            match(input,61,FOLLOW_61_in_rule__RDC__Group_6__3__Impl6125); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2977:1: rule__RDC__Group_8__0 : rule__RDC__Group_8__0__Impl rule__RDC__Group_8__1 ;
    public final void rule__RDC__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2981:1: ( rule__RDC__Group_8__0__Impl rule__RDC__Group_8__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2982:2: rule__RDC__Group_8__0__Impl rule__RDC__Group_8__1
            {
            pushFollow(FOLLOW_rule__RDC__Group_8__0__Impl_in_rule__RDC__Group_8__06164);
            rule__RDC__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_8__1_in_rule__RDC__Group_8__06167);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2989:1: rule__RDC__Group_8__0__Impl : ( 'Generic properties' ) ;
    public final void rule__RDC__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2993:1: ( ( 'Generic properties' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2994:1: ( 'Generic properties' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2994:1: ( 'Generic properties' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:2995:1: 'Generic properties'
            {
             before(grammarAccess.getRDCAccess().getGenericPropertiesKeyword_8_0()); 
            match(input,70,FOLLOW_70_in_rule__RDC__Group_8__0__Impl6195); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3008:1: rule__RDC__Group_8__1 : rule__RDC__Group_8__1__Impl rule__RDC__Group_8__2 ;
    public final void rule__RDC__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3012:1: ( rule__RDC__Group_8__1__Impl rule__RDC__Group_8__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3013:2: rule__RDC__Group_8__1__Impl rule__RDC__Group_8__2
            {
            pushFollow(FOLLOW_rule__RDC__Group_8__1__Impl_in_rule__RDC__Group_8__16226);
            rule__RDC__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_8__2_in_rule__RDC__Group_8__16229);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3020:1: rule__RDC__Group_8__1__Impl : ( '{' ) ;
    public final void rule__RDC__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3024:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3025:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3025:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3026:1: '{'
            {
             before(grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,58,FOLLOW_58_in_rule__RDC__Group_8__1__Impl6257); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3039:1: rule__RDC__Group_8__2 : rule__RDC__Group_8__2__Impl rule__RDC__Group_8__3 ;
    public final void rule__RDC__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3043:1: ( rule__RDC__Group_8__2__Impl rule__RDC__Group_8__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3044:2: rule__RDC__Group_8__2__Impl rule__RDC__Group_8__3
            {
            pushFollow(FOLLOW_rule__RDC__Group_8__2__Impl_in_rule__RDC__Group_8__26288);
            rule__RDC__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RDC__Group_8__3_in_rule__RDC__Group_8__26291);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3051:1: rule__RDC__Group_8__2__Impl : ( ( rule__RDC__MetricParametersAssignment_8_2 )* ) ;
    public final void rule__RDC__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3055:1: ( ( ( rule__RDC__MetricParametersAssignment_8_2 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3056:1: ( ( rule__RDC__MetricParametersAssignment_8_2 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3056:1: ( ( rule__RDC__MetricParametersAssignment_8_2 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3057:1: ( rule__RDC__MetricParametersAssignment_8_2 )*
            {
             before(grammarAccess.getRDCAccess().getMetricParametersAssignment_8_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3058:1: ( rule__RDC__MetricParametersAssignment_8_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3058:2: rule__RDC__MetricParametersAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__RDC__MetricParametersAssignment_8_2_in_rule__RDC__Group_8__2__Impl6318);
            	    rule__RDC__MetricParametersAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3068:1: rule__RDC__Group_8__3 : rule__RDC__Group_8__3__Impl ;
    public final void rule__RDC__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3072:1: ( rule__RDC__Group_8__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3073:2: rule__RDC__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__RDC__Group_8__3__Impl_in_rule__RDC__Group_8__36349);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3079:1: rule__RDC__Group_8__3__Impl : ( '}' ) ;
    public final void rule__RDC__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3083:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3084:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3084:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3085:1: '}'
            {
             before(grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_8_3()); 
            match(input,62,FOLLOW_62_in_rule__RDC__Group_8__3__Impl6377); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3106:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3110:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3111:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_rule__Connector__Group__0__Impl_in_rule__Connector__Group__06416);
            rule__Connector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__1_in_rule__Connector__Group__06419);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3118:1: rule__Connector__Group__0__Impl : ( 'Connector' ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3122:1: ( ( 'Connector' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3123:1: ( 'Connector' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3123:1: ( 'Connector' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3124:1: 'Connector'
            {
             before(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 
            match(input,74,FOLLOW_74_in_rule__Connector__Group__0__Impl6447); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3137:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3141:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3142:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_rule__Connector__Group__1__Impl_in_rule__Connector__Group__16478);
            rule__Connector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__2_in_rule__Connector__Group__16481);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3149:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__NameAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3153:1: ( ( ( rule__Connector__NameAssignment_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3154:1: ( ( rule__Connector__NameAssignment_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3154:1: ( ( rule__Connector__NameAssignment_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3155:1: ( rule__Connector__NameAssignment_1 )
            {
             before(grammarAccess.getConnectorAccess().getNameAssignment_1()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3156:1: ( rule__Connector__NameAssignment_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3156:2: rule__Connector__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Connector__NameAssignment_1_in_rule__Connector__Group__1__Impl6508);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3166:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3170:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3171:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_rule__Connector__Group__2__Impl_in_rule__Connector__Group__26538);
            rule__Connector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__3_in_rule__Connector__Group__26541);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3178:1: rule__Connector__Group__2__Impl : ( '{' ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3182:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3183:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3183:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3184:1: '{'
            {
             before(grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_58_in_rule__Connector__Group__2__Impl6569); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3197:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3201:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3202:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
            {
            pushFollow(FOLLOW_rule__Connector__Group__3__Impl_in_rule__Connector__Group__36600);
            rule__Connector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__4_in_rule__Connector__Group__36603);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3209:1: rule__Connector__Group__3__Impl : ( ( rule__Connector__AvailableInterfacesAssignment_3 )* ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3213:1: ( ( ( rule__Connector__AvailableInterfacesAssignment_3 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3214:1: ( ( rule__Connector__AvailableInterfacesAssignment_3 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3214:1: ( ( rule__Connector__AvailableInterfacesAssignment_3 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3215:1: ( rule__Connector__AvailableInterfacesAssignment_3 )*
            {
             before(grammarAccess.getConnectorAccess().getAvailableInterfacesAssignment_3()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3216:1: ( rule__Connector__AvailableInterfacesAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_INT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3216:2: rule__Connector__AvailableInterfacesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Connector__AvailableInterfacesAssignment_3_in_rule__Connector__Group__3__Impl6630);
            	    rule__Connector__AvailableInterfacesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getConnectorAccess().getAvailableInterfacesAssignment_3()); 

            }


            }

        }
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3226:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3230:1: ( rule__Connector__Group__4__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3231:2: rule__Connector__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Connector__Group__4__Impl_in_rule__Connector__Group__46661);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3237:1: rule__Connector__Group__4__Impl : ( '}' ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3241:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3242:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3242:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3243:1: '}'
            {
             before(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_4()); 
            match(input,62,FOLLOW_62_in_rule__Connector__Group__4__Impl6689); 
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


    // $ANTLR start "rule__AvailableInterface__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3266:1: rule__AvailableInterface__Group__0 : rule__AvailableInterface__Group__0__Impl rule__AvailableInterface__Group__1 ;
    public final void rule__AvailableInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3270:1: ( rule__AvailableInterface__Group__0__Impl rule__AvailableInterface__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3271:2: rule__AvailableInterface__Group__0__Impl rule__AvailableInterface__Group__1
            {
            pushFollow(FOLLOW_rule__AvailableInterface__Group__0__Impl_in_rule__AvailableInterface__Group__06730);
            rule__AvailableInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AvailableInterface__Group__1_in_rule__AvailableInterface__Group__06733);
            rule__AvailableInterface__Group__1();

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
    // $ANTLR end "rule__AvailableInterface__Group__0"


    // $ANTLR start "rule__AvailableInterface__Group__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3278:1: rule__AvailableInterface__Group__0__Impl : ( ( rule__AvailableInterface__CountAssignment_0 ) ) ;
    public final void rule__AvailableInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3282:1: ( ( ( rule__AvailableInterface__CountAssignment_0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3283:1: ( ( rule__AvailableInterface__CountAssignment_0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3283:1: ( ( rule__AvailableInterface__CountAssignment_0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3284:1: ( rule__AvailableInterface__CountAssignment_0 )
            {
             before(grammarAccess.getAvailableInterfaceAccess().getCountAssignment_0()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3285:1: ( rule__AvailableInterface__CountAssignment_0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3285:2: rule__AvailableInterface__CountAssignment_0
            {
            pushFollow(FOLLOW_rule__AvailableInterface__CountAssignment_0_in_rule__AvailableInterface__Group__0__Impl6760);
            rule__AvailableInterface__CountAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAvailableInterfaceAccess().getCountAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvailableInterface__Group__0__Impl"


    // $ANTLR start "rule__AvailableInterface__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3295:1: rule__AvailableInterface__Group__1 : rule__AvailableInterface__Group__1__Impl rule__AvailableInterface__Group__2 ;
    public final void rule__AvailableInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3299:1: ( rule__AvailableInterface__Group__1__Impl rule__AvailableInterface__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3300:2: rule__AvailableInterface__Group__1__Impl rule__AvailableInterface__Group__2
            {
            pushFollow(FOLLOW_rule__AvailableInterface__Group__1__Impl_in_rule__AvailableInterface__Group__16790);
            rule__AvailableInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AvailableInterface__Group__2_in_rule__AvailableInterface__Group__16793);
            rule__AvailableInterface__Group__2();

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
    // $ANTLR end "rule__AvailableInterface__Group__1"


    // $ANTLR start "rule__AvailableInterface__Group__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3307:1: rule__AvailableInterface__Group__1__Impl : ( 'interface with type' ) ;
    public final void rule__AvailableInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3311:1: ( ( 'interface with type' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3312:1: ( 'interface with type' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3312:1: ( 'interface with type' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3313:1: 'interface with type'
            {
             before(grammarAccess.getAvailableInterfaceAccess().getInterfaceWithTypeKeyword_1()); 
            match(input,75,FOLLOW_75_in_rule__AvailableInterface__Group__1__Impl6821); 
             after(grammarAccess.getAvailableInterfaceAccess().getInterfaceWithTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvailableInterface__Group__1__Impl"


    // $ANTLR start "rule__AvailableInterface__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3326:1: rule__AvailableInterface__Group__2 : rule__AvailableInterface__Group__2__Impl rule__AvailableInterface__Group__3 ;
    public final void rule__AvailableInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3330:1: ( rule__AvailableInterface__Group__2__Impl rule__AvailableInterface__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3331:2: rule__AvailableInterface__Group__2__Impl rule__AvailableInterface__Group__3
            {
            pushFollow(FOLLOW_rule__AvailableInterface__Group__2__Impl_in_rule__AvailableInterface__Group__26852);
            rule__AvailableInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AvailableInterface__Group__3_in_rule__AvailableInterface__Group__26855);
            rule__AvailableInterface__Group__3();

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
    // $ANTLR end "rule__AvailableInterface__Group__2"


    // $ANTLR start "rule__AvailableInterface__Group__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3338:1: rule__AvailableInterface__Group__2__Impl : ( ( rule__AvailableInterface__InterfaceTypeAssignment_2 ) ) ;
    public final void rule__AvailableInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3342:1: ( ( ( rule__AvailableInterface__InterfaceTypeAssignment_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3343:1: ( ( rule__AvailableInterface__InterfaceTypeAssignment_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3343:1: ( ( rule__AvailableInterface__InterfaceTypeAssignment_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3344:1: ( rule__AvailableInterface__InterfaceTypeAssignment_2 )
            {
             before(grammarAccess.getAvailableInterfaceAccess().getInterfaceTypeAssignment_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3345:1: ( rule__AvailableInterface__InterfaceTypeAssignment_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3345:2: rule__AvailableInterface__InterfaceTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__AvailableInterface__InterfaceTypeAssignment_2_in_rule__AvailableInterface__Group__2__Impl6882);
            rule__AvailableInterface__InterfaceTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAvailableInterfaceAccess().getInterfaceTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvailableInterface__Group__2__Impl"


    // $ANTLR start "rule__AvailableInterface__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3355:1: rule__AvailableInterface__Group__3 : rule__AvailableInterface__Group__3__Impl ;
    public final void rule__AvailableInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3359:1: ( rule__AvailableInterface__Group__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3360:2: rule__AvailableInterface__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AvailableInterface__Group__3__Impl_in_rule__AvailableInterface__Group__36912);
            rule__AvailableInterface__Group__3__Impl();

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
    // $ANTLR end "rule__AvailableInterface__Group__3"


    // $ANTLR start "rule__AvailableInterface__Group__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3366:1: rule__AvailableInterface__Group__3__Impl : ( ';' ) ;
    public final void rule__AvailableInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3370:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3371:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3371:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3372:1: ';'
            {
             before(grammarAccess.getAvailableInterfaceAccess().getSemicolonKeyword_3()); 
            match(input,61,FOLLOW_61_in_rule__AvailableInterface__Group__3__Impl6940); 
             after(grammarAccess.getAvailableInterfaceAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvailableInterface__Group__3__Impl"


    // $ANTLR start "rule__InterfaceGroup__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3393:1: rule__InterfaceGroup__Group__0 : rule__InterfaceGroup__Group__0__Impl rule__InterfaceGroup__Group__1 ;
    public final void rule__InterfaceGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3397:1: ( rule__InterfaceGroup__Group__0__Impl rule__InterfaceGroup__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3398:2: rule__InterfaceGroup__Group__0__Impl rule__InterfaceGroup__Group__1
            {
            pushFollow(FOLLOW_rule__InterfaceGroup__Group__0__Impl_in_rule__InterfaceGroup__Group__06979);
            rule__InterfaceGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceGroup__Group__1_in_rule__InterfaceGroup__Group__06982);
            rule__InterfaceGroup__Group__1();

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
    // $ANTLR end "rule__InterfaceGroup__Group__0"


    // $ANTLR start "rule__InterfaceGroup__Group__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3405:1: rule__InterfaceGroup__Group__0__Impl : ( 'Group' ) ;
    public final void rule__InterfaceGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3409:1: ( ( 'Group' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3410:1: ( 'Group' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3410:1: ( 'Group' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3411:1: 'Group'
            {
             before(grammarAccess.getInterfaceGroupAccess().getGroupKeyword_0()); 
            match(input,76,FOLLOW_76_in_rule__InterfaceGroup__Group__0__Impl7010); 
             after(grammarAccess.getInterfaceGroupAccess().getGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceGroup__Group__0__Impl"


    // $ANTLR start "rule__InterfaceGroup__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3424:1: rule__InterfaceGroup__Group__1 : rule__InterfaceGroup__Group__1__Impl rule__InterfaceGroup__Group__2 ;
    public final void rule__InterfaceGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3428:1: ( rule__InterfaceGroup__Group__1__Impl rule__InterfaceGroup__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3429:2: rule__InterfaceGroup__Group__1__Impl rule__InterfaceGroup__Group__2
            {
            pushFollow(FOLLOW_rule__InterfaceGroup__Group__1__Impl_in_rule__InterfaceGroup__Group__17041);
            rule__InterfaceGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceGroup__Group__2_in_rule__InterfaceGroup__Group__17044);
            rule__InterfaceGroup__Group__2();

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
    // $ANTLR end "rule__InterfaceGroup__Group__1"


    // $ANTLR start "rule__InterfaceGroup__Group__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3436:1: rule__InterfaceGroup__Group__1__Impl : ( ( rule__InterfaceGroup__NameAssignment_1 ) ) ;
    public final void rule__InterfaceGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3440:1: ( ( ( rule__InterfaceGroup__NameAssignment_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3441:1: ( ( rule__InterfaceGroup__NameAssignment_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3441:1: ( ( rule__InterfaceGroup__NameAssignment_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3442:1: ( rule__InterfaceGroup__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceGroupAccess().getNameAssignment_1()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3443:1: ( rule__InterfaceGroup__NameAssignment_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3443:2: rule__InterfaceGroup__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__InterfaceGroup__NameAssignment_1_in_rule__InterfaceGroup__Group__1__Impl7071);
            rule__InterfaceGroup__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceGroup__Group__1__Impl"


    // $ANTLR start "rule__InterfaceGroup__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3453:1: rule__InterfaceGroup__Group__2 : rule__InterfaceGroup__Group__2__Impl rule__InterfaceGroup__Group__3 ;
    public final void rule__InterfaceGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3457:1: ( rule__InterfaceGroup__Group__2__Impl rule__InterfaceGroup__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3458:2: rule__InterfaceGroup__Group__2__Impl rule__InterfaceGroup__Group__3
            {
            pushFollow(FOLLOW_rule__InterfaceGroup__Group__2__Impl_in_rule__InterfaceGroup__Group__27101);
            rule__InterfaceGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceGroup__Group__3_in_rule__InterfaceGroup__Group__27104);
            rule__InterfaceGroup__Group__3();

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
    // $ANTLR end "rule__InterfaceGroup__Group__2"


    // $ANTLR start "rule__InterfaceGroup__Group__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3465:1: rule__InterfaceGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__InterfaceGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3469:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3470:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3470:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3471:1: '{'
            {
             before(grammarAccess.getInterfaceGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_58_in_rule__InterfaceGroup__Group__2__Impl7132); 
             after(grammarAccess.getInterfaceGroupAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceGroup__Group__2__Impl"


    // $ANTLR start "rule__InterfaceGroup__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3484:1: rule__InterfaceGroup__Group__3 : rule__InterfaceGroup__Group__3__Impl rule__InterfaceGroup__Group__4 ;
    public final void rule__InterfaceGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3488:1: ( rule__InterfaceGroup__Group__3__Impl rule__InterfaceGroup__Group__4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3489:2: rule__InterfaceGroup__Group__3__Impl rule__InterfaceGroup__Group__4
            {
            pushFollow(FOLLOW_rule__InterfaceGroup__Group__3__Impl_in_rule__InterfaceGroup__Group__37163);
            rule__InterfaceGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceGroup__Group__4_in_rule__InterfaceGroup__Group__37166);
            rule__InterfaceGroup__Group__4();

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
    // $ANTLR end "rule__InterfaceGroup__Group__3"


    // $ANTLR start "rule__InterfaceGroup__Group__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3496:1: rule__InterfaceGroup__Group__3__Impl : ( ( rule__InterfaceGroup__InterfacesAssignment_3 ) ) ;
    public final void rule__InterfaceGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3500:1: ( ( ( rule__InterfaceGroup__InterfacesAssignment_3 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3501:1: ( ( rule__InterfaceGroup__InterfacesAssignment_3 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3501:1: ( ( rule__InterfaceGroup__InterfacesAssignment_3 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3502:1: ( rule__InterfaceGroup__InterfacesAssignment_3 )
            {
             before(grammarAccess.getInterfaceGroupAccess().getInterfacesAssignment_3()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3503:1: ( rule__InterfaceGroup__InterfacesAssignment_3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3503:2: rule__InterfaceGroup__InterfacesAssignment_3
            {
            pushFollow(FOLLOW_rule__InterfaceGroup__InterfacesAssignment_3_in_rule__InterfaceGroup__Group__3__Impl7193);
            rule__InterfaceGroup__InterfacesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceGroupAccess().getInterfacesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceGroup__Group__3__Impl"


    // $ANTLR start "rule__InterfaceGroup__Group__4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3513:1: rule__InterfaceGroup__Group__4 : rule__InterfaceGroup__Group__4__Impl rule__InterfaceGroup__Group__5 ;
    public final void rule__InterfaceGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3517:1: ( rule__InterfaceGroup__Group__4__Impl rule__InterfaceGroup__Group__5 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3518:2: rule__InterfaceGroup__Group__4__Impl rule__InterfaceGroup__Group__5
            {
            pushFollow(FOLLOW_rule__InterfaceGroup__Group__4__Impl_in_rule__InterfaceGroup__Group__47223);
            rule__InterfaceGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceGroup__Group__5_in_rule__InterfaceGroup__Group__47226);
            rule__InterfaceGroup__Group__5();

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
    // $ANTLR end "rule__InterfaceGroup__Group__4"


    // $ANTLR start "rule__InterfaceGroup__Group__4__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3525:1: rule__InterfaceGroup__Group__4__Impl : ( ( ( rule__InterfaceGroup__Group_4__0 ) ) ( ( rule__InterfaceGroup__Group_4__0 )* ) ) ;
    public final void rule__InterfaceGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3529:1: ( ( ( ( rule__InterfaceGroup__Group_4__0 ) ) ( ( rule__InterfaceGroup__Group_4__0 )* ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3530:1: ( ( ( rule__InterfaceGroup__Group_4__0 ) ) ( ( rule__InterfaceGroup__Group_4__0 )* ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3530:1: ( ( ( rule__InterfaceGroup__Group_4__0 ) ) ( ( rule__InterfaceGroup__Group_4__0 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3531:1: ( ( rule__InterfaceGroup__Group_4__0 ) ) ( ( rule__InterfaceGroup__Group_4__0 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3531:1: ( ( rule__InterfaceGroup__Group_4__0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3532:1: ( rule__InterfaceGroup__Group_4__0 )
            {
             before(grammarAccess.getInterfaceGroupAccess().getGroup_4()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3533:1: ( rule__InterfaceGroup__Group_4__0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3533:2: rule__InterfaceGroup__Group_4__0
            {
            pushFollow(FOLLOW_rule__InterfaceGroup__Group_4__0_in_rule__InterfaceGroup__Group__4__Impl7255);
            rule__InterfaceGroup__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceGroupAccess().getGroup_4()); 

            }

            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3536:1: ( ( rule__InterfaceGroup__Group_4__0 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3537:1: ( rule__InterfaceGroup__Group_4__0 )*
            {
             before(grammarAccess.getInterfaceGroupAccess().getGroup_4()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3538:1: ( rule__InterfaceGroup__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==77) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3538:2: rule__InterfaceGroup__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__InterfaceGroup__Group_4__0_in_rule__InterfaceGroup__Group__4__Impl7267);
            	    rule__InterfaceGroup__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getInterfaceGroupAccess().getGroup_4()); 

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
    // $ANTLR end "rule__InterfaceGroup__Group__4__Impl"


    // $ANTLR start "rule__InterfaceGroup__Group__5"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3549:1: rule__InterfaceGroup__Group__5 : rule__InterfaceGroup__Group__5__Impl ;
    public final void rule__InterfaceGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3553:1: ( rule__InterfaceGroup__Group__5__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3554:2: rule__InterfaceGroup__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__InterfaceGroup__Group__5__Impl_in_rule__InterfaceGroup__Group__57300);
            rule__InterfaceGroup__Group__5__Impl();

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
    // $ANTLR end "rule__InterfaceGroup__Group__5"


    // $ANTLR start "rule__InterfaceGroup__Group__5__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3560:1: rule__InterfaceGroup__Group__5__Impl : ( '}' ) ;
    public final void rule__InterfaceGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3564:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3565:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3565:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3566:1: '}'
            {
             before(grammarAccess.getInterfaceGroupAccess().getRightCurlyBracketKeyword_5()); 
            match(input,62,FOLLOW_62_in_rule__InterfaceGroup__Group__5__Impl7328); 
             after(grammarAccess.getInterfaceGroupAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceGroup__Group__5__Impl"


    // $ANTLR start "rule__InterfaceGroup__Group_4__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3591:1: rule__InterfaceGroup__Group_4__0 : rule__InterfaceGroup__Group_4__0__Impl rule__InterfaceGroup__Group_4__1 ;
    public final void rule__InterfaceGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3595:1: ( rule__InterfaceGroup__Group_4__0__Impl rule__InterfaceGroup__Group_4__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3596:2: rule__InterfaceGroup__Group_4__0__Impl rule__InterfaceGroup__Group_4__1
            {
            pushFollow(FOLLOW_rule__InterfaceGroup__Group_4__0__Impl_in_rule__InterfaceGroup__Group_4__07371);
            rule__InterfaceGroup__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceGroup__Group_4__1_in_rule__InterfaceGroup__Group_4__07374);
            rule__InterfaceGroup__Group_4__1();

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
    // $ANTLR end "rule__InterfaceGroup__Group_4__0"


    // $ANTLR start "rule__InterfaceGroup__Group_4__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3603:1: rule__InterfaceGroup__Group_4__0__Impl : ( ',' ) ;
    public final void rule__InterfaceGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3607:1: ( ( ',' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3608:1: ( ',' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3608:1: ( ',' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3609:1: ','
            {
             before(grammarAccess.getInterfaceGroupAccess().getCommaKeyword_4_0()); 
            match(input,77,FOLLOW_77_in_rule__InterfaceGroup__Group_4__0__Impl7402); 
             after(grammarAccess.getInterfaceGroupAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceGroup__Group_4__0__Impl"


    // $ANTLR start "rule__InterfaceGroup__Group_4__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3622:1: rule__InterfaceGroup__Group_4__1 : rule__InterfaceGroup__Group_4__1__Impl ;
    public final void rule__InterfaceGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3626:1: ( rule__InterfaceGroup__Group_4__1__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3627:2: rule__InterfaceGroup__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfaceGroup__Group_4__1__Impl_in_rule__InterfaceGroup__Group_4__17433);
            rule__InterfaceGroup__Group_4__1__Impl();

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
    // $ANTLR end "rule__InterfaceGroup__Group_4__1"


    // $ANTLR start "rule__InterfaceGroup__Group_4__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3633:1: rule__InterfaceGroup__Group_4__1__Impl : ( ( rule__InterfaceGroup__InterfacesAssignment_4_1 ) ) ;
    public final void rule__InterfaceGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3637:1: ( ( ( rule__InterfaceGroup__InterfacesAssignment_4_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3638:1: ( ( rule__InterfaceGroup__InterfacesAssignment_4_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3638:1: ( ( rule__InterfaceGroup__InterfacesAssignment_4_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3639:1: ( rule__InterfaceGroup__InterfacesAssignment_4_1 )
            {
             before(grammarAccess.getInterfaceGroupAccess().getInterfacesAssignment_4_1()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3640:1: ( rule__InterfaceGroup__InterfacesAssignment_4_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3640:2: rule__InterfaceGroup__InterfacesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__InterfaceGroup__InterfacesAssignment_4_1_in_rule__InterfaceGroup__Group_4__1__Impl7460);
            rule__InterfaceGroup__InterfacesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceGroupAccess().getInterfacesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceGroup__Group_4__1__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3654:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3658:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3659:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__07494);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__07497);
            rule__Interface__Group__1();

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
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3666:1: rule__Interface__Group__0__Impl : ( 'Interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3670:1: ( ( 'Interface' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3671:1: ( 'Interface' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3671:1: ( 'Interface' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3672:1: 'Interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,78,FOLLOW_78_in_rule__Interface__Group__0__Impl7525); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3685:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3689:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3690:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__17556);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__17559);
            rule__Interface__Group__2();

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
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3697:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3701:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3702:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3702:1: ( ( rule__Interface__NameAssignment_1 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3703:1: ( rule__Interface__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3704:1: ( rule__Interface__NameAssignment_1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3704:2: rule__Interface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_1_in_rule__Interface__Group__1__Impl7586);
            rule__Interface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3714:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3718:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3719:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__27616);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__27619);
            rule__Interface__Group__3();

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
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3726:1: rule__Interface__Group__2__Impl : ( '{' ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3730:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3731:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3731:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3732:1: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_58_in_rule__Interface__Group__2__Impl7647); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3745:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3749:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3750:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__37678);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__37681);
            rule__Interface__Group__4();

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
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3757:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__Group_3__0 )? ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3761:1: ( ( ( rule__Interface__Group_3__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3762:1: ( ( rule__Interface__Group_3__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3762:1: ( ( rule__Interface__Group_3__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3763:1: ( rule__Interface__Group_3__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_3()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3764:1: ( rule__Interface__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==79) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3764:2: rule__Interface__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_3__0_in_rule__Interface__Group__3__Impl7708);
                    rule__Interface__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3774:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3778:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3779:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__47739);
            rule__Interface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__47742);
            rule__Interface__Group__5();

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
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3786:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__Group_4__0 )? ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3790:1: ( ( ( rule__Interface__Group_4__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3791:1: ( ( rule__Interface__Group_4__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3791:1: ( ( rule__Interface__Group_4__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3792:1: ( rule__Interface__Group_4__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_4()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3793:1: ( rule__Interface__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==80) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3793:2: rule__Interface__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_4__0_in_rule__Interface__Group__4__Impl7769);
                    rule__Interface__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Interface__Group__5"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3803:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl rule__Interface__Group__6 ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3807:1: ( rule__Interface__Group__5__Impl rule__Interface__Group__6 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3808:2: rule__Interface__Group__5__Impl rule__Interface__Group__6
            {
            pushFollow(FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__57800);
            rule__Interface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__6_in_rule__Interface__Group__57803);
            rule__Interface__Group__6();

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
    // $ANTLR end "rule__Interface__Group__5"


    // $ANTLR start "rule__Interface__Group__5__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3815:1: rule__Interface__Group__5__Impl : ( ( rule__Interface__Group_5__0 )? ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3819:1: ( ( ( rule__Interface__Group_5__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3820:1: ( ( rule__Interface__Group_5__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3820:1: ( ( rule__Interface__Group_5__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3821:1: ( rule__Interface__Group_5__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_5()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3822:1: ( rule__Interface__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==81) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3822:2: rule__Interface__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_5__0_in_rule__Interface__Group__5__Impl7830);
                    rule__Interface__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__5__Impl"


    // $ANTLR start "rule__Interface__Group__6"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3832:1: rule__Interface__Group__6 : rule__Interface__Group__6__Impl rule__Interface__Group__7 ;
    public final void rule__Interface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3836:1: ( rule__Interface__Group__6__Impl rule__Interface__Group__7 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3837:2: rule__Interface__Group__6__Impl rule__Interface__Group__7
            {
            pushFollow(FOLLOW_rule__Interface__Group__6__Impl_in_rule__Interface__Group__67861);
            rule__Interface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__7_in_rule__Interface__Group__67864);
            rule__Interface__Group__7();

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
    // $ANTLR end "rule__Interface__Group__6"


    // $ANTLR start "rule__Interface__Group__6__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3844:1: rule__Interface__Group__6__Impl : ( ( rule__Interface__Group_6__0 )? ) ;
    public final void rule__Interface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3848:1: ( ( ( rule__Interface__Group_6__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3849:1: ( ( rule__Interface__Group_6__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3849:1: ( ( rule__Interface__Group_6__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3850:1: ( rule__Interface__Group_6__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_6()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3851:1: ( rule__Interface__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==82) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3851:2: rule__Interface__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_6__0_in_rule__Interface__Group__6__Impl7891);
                    rule__Interface__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__6__Impl"


    // $ANTLR start "rule__Interface__Group__7"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3861:1: rule__Interface__Group__7 : rule__Interface__Group__7__Impl rule__Interface__Group__8 ;
    public final void rule__Interface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3865:1: ( rule__Interface__Group__7__Impl rule__Interface__Group__8 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3866:2: rule__Interface__Group__7__Impl rule__Interface__Group__8
            {
            pushFollow(FOLLOW_rule__Interface__Group__7__Impl_in_rule__Interface__Group__77922);
            rule__Interface__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__8_in_rule__Interface__Group__77925);
            rule__Interface__Group__8();

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
    // $ANTLR end "rule__Interface__Group__7"


    // $ANTLR start "rule__Interface__Group__7__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3873:1: rule__Interface__Group__7__Impl : ( ( rule__Interface__Group_7__0 )? ) ;
    public final void rule__Interface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3877:1: ( ( ( rule__Interface__Group_7__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3878:1: ( ( rule__Interface__Group_7__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3878:1: ( ( rule__Interface__Group_7__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3879:1: ( rule__Interface__Group_7__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_7()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3880:1: ( rule__Interface__Group_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==83) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3880:2: rule__Interface__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_7__0_in_rule__Interface__Group__7__Impl7952);
                    rule__Interface__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__7__Impl"


    // $ANTLR start "rule__Interface__Group__8"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3890:1: rule__Interface__Group__8 : rule__Interface__Group__8__Impl rule__Interface__Group__9 ;
    public final void rule__Interface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3894:1: ( rule__Interface__Group__8__Impl rule__Interface__Group__9 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3895:2: rule__Interface__Group__8__Impl rule__Interface__Group__9
            {
            pushFollow(FOLLOW_rule__Interface__Group__8__Impl_in_rule__Interface__Group__87983);
            rule__Interface__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__9_in_rule__Interface__Group__87986);
            rule__Interface__Group__9();

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
    // $ANTLR end "rule__Interface__Group__8"


    // $ANTLR start "rule__Interface__Group__8__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3902:1: rule__Interface__Group__8__Impl : ( ( rule__Interface__Group_8__0 )? ) ;
    public final void rule__Interface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3906:1: ( ( ( rule__Interface__Group_8__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3907:1: ( ( rule__Interface__Group_8__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3907:1: ( ( rule__Interface__Group_8__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3908:1: ( rule__Interface__Group_8__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_8()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3909:1: ( rule__Interface__Group_8__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==84) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3909:2: rule__Interface__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_8__0_in_rule__Interface__Group__8__Impl8013);
                    rule__Interface__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__8__Impl"


    // $ANTLR start "rule__Interface__Group__9"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3919:1: rule__Interface__Group__9 : rule__Interface__Group__9__Impl rule__Interface__Group__10 ;
    public final void rule__Interface__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3923:1: ( rule__Interface__Group__9__Impl rule__Interface__Group__10 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3924:2: rule__Interface__Group__9__Impl rule__Interface__Group__10
            {
            pushFollow(FOLLOW_rule__Interface__Group__9__Impl_in_rule__Interface__Group__98044);
            rule__Interface__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__10_in_rule__Interface__Group__98047);
            rule__Interface__Group__10();

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
    // $ANTLR end "rule__Interface__Group__9"


    // $ANTLR start "rule__Interface__Group__9__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3931:1: rule__Interface__Group__9__Impl : ( ( rule__Interface__Group_9__0 )? ) ;
    public final void rule__Interface__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3935:1: ( ( ( rule__Interface__Group_9__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3936:1: ( ( rule__Interface__Group_9__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3936:1: ( ( rule__Interface__Group_9__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3937:1: ( rule__Interface__Group_9__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_9()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3938:1: ( rule__Interface__Group_9__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==85) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3938:2: rule__Interface__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_9__0_in_rule__Interface__Group__9__Impl8074);
                    rule__Interface__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__9__Impl"


    // $ANTLR start "rule__Interface__Group__10"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3948:1: rule__Interface__Group__10 : rule__Interface__Group__10__Impl rule__Interface__Group__11 ;
    public final void rule__Interface__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3952:1: ( rule__Interface__Group__10__Impl rule__Interface__Group__11 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3953:2: rule__Interface__Group__10__Impl rule__Interface__Group__11
            {
            pushFollow(FOLLOW_rule__Interface__Group__10__Impl_in_rule__Interface__Group__108105);
            rule__Interface__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__11_in_rule__Interface__Group__108108);
            rule__Interface__Group__11();

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
    // $ANTLR end "rule__Interface__Group__10"


    // $ANTLR start "rule__Interface__Group__10__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3960:1: rule__Interface__Group__10__Impl : ( ( rule__Interface__Group_10__0 )? ) ;
    public final void rule__Interface__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3964:1: ( ( ( rule__Interface__Group_10__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3965:1: ( ( rule__Interface__Group_10__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3965:1: ( ( rule__Interface__Group_10__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3966:1: ( rule__Interface__Group_10__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_10()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3967:1: ( rule__Interface__Group_10__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==86) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3967:2: rule__Interface__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_10__0_in_rule__Interface__Group__10__Impl8135);
                    rule__Interface__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__10__Impl"


    // $ANTLR start "rule__Interface__Group__11"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3977:1: rule__Interface__Group__11 : rule__Interface__Group__11__Impl rule__Interface__Group__12 ;
    public final void rule__Interface__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3981:1: ( rule__Interface__Group__11__Impl rule__Interface__Group__12 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3982:2: rule__Interface__Group__11__Impl rule__Interface__Group__12
            {
            pushFollow(FOLLOW_rule__Interface__Group__11__Impl_in_rule__Interface__Group__118166);
            rule__Interface__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__12_in_rule__Interface__Group__118169);
            rule__Interface__Group__12();

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
    // $ANTLR end "rule__Interface__Group__11"


    // $ANTLR start "rule__Interface__Group__11__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3989:1: rule__Interface__Group__11__Impl : ( ( rule__Interface__Group_11__0 )? ) ;
    public final void rule__Interface__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3993:1: ( ( ( rule__Interface__Group_11__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3994:1: ( ( rule__Interface__Group_11__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3994:1: ( ( rule__Interface__Group_11__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3995:1: ( rule__Interface__Group_11__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_11()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3996:1: ( rule__Interface__Group_11__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==87) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:3996:2: rule__Interface__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_11__0_in_rule__Interface__Group__11__Impl8196);
                    rule__Interface__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__11__Impl"


    // $ANTLR start "rule__Interface__Group__12"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4006:1: rule__Interface__Group__12 : rule__Interface__Group__12__Impl rule__Interface__Group__13 ;
    public final void rule__Interface__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4010:1: ( rule__Interface__Group__12__Impl rule__Interface__Group__13 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4011:2: rule__Interface__Group__12__Impl rule__Interface__Group__13
            {
            pushFollow(FOLLOW_rule__Interface__Group__12__Impl_in_rule__Interface__Group__128227);
            rule__Interface__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__13_in_rule__Interface__Group__128230);
            rule__Interface__Group__13();

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
    // $ANTLR end "rule__Interface__Group__12"


    // $ANTLR start "rule__Interface__Group__12__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4018:1: rule__Interface__Group__12__Impl : ( ( rule__Interface__Group_12__0 )? ) ;
    public final void rule__Interface__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4022:1: ( ( ( rule__Interface__Group_12__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4023:1: ( ( rule__Interface__Group_12__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4023:1: ( ( rule__Interface__Group_12__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4024:1: ( rule__Interface__Group_12__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_12()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4025:1: ( rule__Interface__Group_12__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==72) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4025:2: rule__Interface__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_12__0_in_rule__Interface__Group__12__Impl8257);
                    rule__Interface__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__12__Impl"


    // $ANTLR start "rule__Interface__Group__13"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4035:1: rule__Interface__Group__13 : rule__Interface__Group__13__Impl rule__Interface__Group__14 ;
    public final void rule__Interface__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4039:1: ( rule__Interface__Group__13__Impl rule__Interface__Group__14 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4040:2: rule__Interface__Group__13__Impl rule__Interface__Group__14
            {
            pushFollow(FOLLOW_rule__Interface__Group__13__Impl_in_rule__Interface__Group__138288);
            rule__Interface__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__14_in_rule__Interface__Group__138291);
            rule__Interface__Group__14();

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
    // $ANTLR end "rule__Interface__Group__13"


    // $ANTLR start "rule__Interface__Group__13__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4047:1: rule__Interface__Group__13__Impl : ( ( rule__Interface__Group_13__0 )? ) ;
    public final void rule__Interface__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4051:1: ( ( ( rule__Interface__Group_13__0 )? ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4052:1: ( ( rule__Interface__Group_13__0 )? )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4052:1: ( ( rule__Interface__Group_13__0 )? )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4053:1: ( rule__Interface__Group_13__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_13()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4054:1: ( rule__Interface__Group_13__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==70) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4054:2: rule__Interface__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_13__0_in_rule__Interface__Group__13__Impl8318);
                    rule__Interface__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__13__Impl"


    // $ANTLR start "rule__Interface__Group__14"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4064:1: rule__Interface__Group__14 : rule__Interface__Group__14__Impl ;
    public final void rule__Interface__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4068:1: ( rule__Interface__Group__14__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4069:2: rule__Interface__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__14__Impl_in_rule__Interface__Group__148349);
            rule__Interface__Group__14__Impl();

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
    // $ANTLR end "rule__Interface__Group__14"


    // $ANTLR start "rule__Interface__Group__14__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4075:1: rule__Interface__Group__14__Impl : ( '}' ) ;
    public final void rule__Interface__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4079:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4080:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4080:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4081:1: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_14()); 
            match(input,62,FOLLOW_62_in_rule__Interface__Group__14__Impl8377); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__14__Impl"


    // $ANTLR start "rule__Interface__Group_3__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4124:1: rule__Interface__Group_3__0 : rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1 ;
    public final void rule__Interface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4128:1: ( rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4129:2: rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_3__0__Impl_in_rule__Interface__Group_3__08438);
            rule__Interface__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_3__1_in_rule__Interface__Group_3__08441);
            rule__Interface__Group_3__1();

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
    // $ANTLR end "rule__Interface__Group_3__0"


    // $ANTLR start "rule__Interface__Group_3__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4136:1: rule__Interface__Group_3__0__Impl : ( 'System' ) ;
    public final void rule__Interface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4140:1: ( ( 'System' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4141:1: ( 'System' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4141:1: ( 'System' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4142:1: 'System'
            {
             before(grammarAccess.getInterfaceAccess().getSystemKeyword_3_0()); 
            match(input,79,FOLLOW_79_in_rule__Interface__Group_3__0__Impl8469); 
             after(grammarAccess.getInterfaceAccess().getSystemKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__0__Impl"


    // $ANTLR start "rule__Interface__Group_3__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4155:1: rule__Interface__Group_3__1 : rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2 ;
    public final void rule__Interface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4159:1: ( rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4160:2: rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2
            {
            pushFollow(FOLLOW_rule__Interface__Group_3__1__Impl_in_rule__Interface__Group_3__18500);
            rule__Interface__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_3__2_in_rule__Interface__Group_3__18503);
            rule__Interface__Group_3__2();

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
    // $ANTLR end "rule__Interface__Group_3__1"


    // $ANTLR start "rule__Interface__Group_3__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4167:1: rule__Interface__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Interface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4171:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4172:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4172:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4173:1: '='
            {
             before(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_3_1()); 
            match(input,60,FOLLOW_60_in_rule__Interface__Group_3__1__Impl8531); 
             after(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__1__Impl"


    // $ANTLR start "rule__Interface__Group_3__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4186:1: rule__Interface__Group_3__2 : rule__Interface__Group_3__2__Impl rule__Interface__Group_3__3 ;
    public final void rule__Interface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4190:1: ( rule__Interface__Group_3__2__Impl rule__Interface__Group_3__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4191:2: rule__Interface__Group_3__2__Impl rule__Interface__Group_3__3
            {
            pushFollow(FOLLOW_rule__Interface__Group_3__2__Impl_in_rule__Interface__Group_3__28562);
            rule__Interface__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_3__3_in_rule__Interface__Group_3__28565);
            rule__Interface__Group_3__3();

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
    // $ANTLR end "rule__Interface__Group_3__2"


    // $ANTLR start "rule__Interface__Group_3__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4198:1: rule__Interface__Group_3__2__Impl : ( ( rule__Interface__SystemAssignment_3_2 ) ) ;
    public final void rule__Interface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4202:1: ( ( ( rule__Interface__SystemAssignment_3_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4203:1: ( ( rule__Interface__SystemAssignment_3_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4203:1: ( ( rule__Interface__SystemAssignment_3_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4204:1: ( rule__Interface__SystemAssignment_3_2 )
            {
             before(grammarAccess.getInterfaceAccess().getSystemAssignment_3_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4205:1: ( rule__Interface__SystemAssignment_3_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4205:2: rule__Interface__SystemAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Interface__SystemAssignment_3_2_in_rule__Interface__Group_3__2__Impl8592);
            rule__Interface__SystemAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getSystemAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__2__Impl"


    // $ANTLR start "rule__Interface__Group_3__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4215:1: rule__Interface__Group_3__3 : rule__Interface__Group_3__3__Impl ;
    public final void rule__Interface__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4219:1: ( rule__Interface__Group_3__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4220:2: rule__Interface__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_3__3__Impl_in_rule__Interface__Group_3__38622);
            rule__Interface__Group_3__3__Impl();

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
    // $ANTLR end "rule__Interface__Group_3__3"


    // $ANTLR start "rule__Interface__Group_3__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4226:1: rule__Interface__Group_3__3__Impl : ( ';' ) ;
    public final void rule__Interface__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4230:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4231:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4231:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4232:1: ';'
            {
             before(grammarAccess.getInterfaceAccess().getSemicolonKeyword_3_3()); 
            match(input,61,FOLLOW_61_in_rule__Interface__Group_3__3__Impl8650); 
             after(grammarAccess.getInterfaceAccess().getSemicolonKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__3__Impl"


    // $ANTLR start "rule__Interface__Group_4__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4253:1: rule__Interface__Group_4__0 : rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 ;
    public final void rule__Interface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4257:1: ( rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4258:2: rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_4__0__Impl_in_rule__Interface__Group_4__08689);
            rule__Interface__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_4__1_in_rule__Interface__Group_4__08692);
            rule__Interface__Group_4__1();

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
    // $ANTLR end "rule__Interface__Group_4__0"


    // $ANTLR start "rule__Interface__Group_4__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4265:1: rule__Interface__Group_4__0__Impl : ( 'SubAta' ) ;
    public final void rule__Interface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4269:1: ( ( 'SubAta' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4270:1: ( 'SubAta' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4270:1: ( 'SubAta' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4271:1: 'SubAta'
            {
             before(grammarAccess.getInterfaceAccess().getSubAtaKeyword_4_0()); 
            match(input,80,FOLLOW_80_in_rule__Interface__Group_4__0__Impl8720); 
             after(grammarAccess.getInterfaceAccess().getSubAtaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__0__Impl"


    // $ANTLR start "rule__Interface__Group_4__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4284:1: rule__Interface__Group_4__1 : rule__Interface__Group_4__1__Impl rule__Interface__Group_4__2 ;
    public final void rule__Interface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4288:1: ( rule__Interface__Group_4__1__Impl rule__Interface__Group_4__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4289:2: rule__Interface__Group_4__1__Impl rule__Interface__Group_4__2
            {
            pushFollow(FOLLOW_rule__Interface__Group_4__1__Impl_in_rule__Interface__Group_4__18751);
            rule__Interface__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_4__2_in_rule__Interface__Group_4__18754);
            rule__Interface__Group_4__2();

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
    // $ANTLR end "rule__Interface__Group_4__1"


    // $ANTLR start "rule__Interface__Group_4__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4296:1: rule__Interface__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Interface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4300:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4301:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4301:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4302:1: '='
            {
             before(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_4_1()); 
            match(input,60,FOLLOW_60_in_rule__Interface__Group_4__1__Impl8782); 
             after(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__1__Impl"


    // $ANTLR start "rule__Interface__Group_4__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4315:1: rule__Interface__Group_4__2 : rule__Interface__Group_4__2__Impl rule__Interface__Group_4__3 ;
    public final void rule__Interface__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4319:1: ( rule__Interface__Group_4__2__Impl rule__Interface__Group_4__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4320:2: rule__Interface__Group_4__2__Impl rule__Interface__Group_4__3
            {
            pushFollow(FOLLOW_rule__Interface__Group_4__2__Impl_in_rule__Interface__Group_4__28813);
            rule__Interface__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_4__3_in_rule__Interface__Group_4__28816);
            rule__Interface__Group_4__3();

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
    // $ANTLR end "rule__Interface__Group_4__2"


    // $ANTLR start "rule__Interface__Group_4__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4327:1: rule__Interface__Group_4__2__Impl : ( ( rule__Interface__SubAtaAssignment_4_2 ) ) ;
    public final void rule__Interface__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4331:1: ( ( ( rule__Interface__SubAtaAssignment_4_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4332:1: ( ( rule__Interface__SubAtaAssignment_4_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4332:1: ( ( rule__Interface__SubAtaAssignment_4_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4333:1: ( rule__Interface__SubAtaAssignment_4_2 )
            {
             before(grammarAccess.getInterfaceAccess().getSubAtaAssignment_4_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4334:1: ( rule__Interface__SubAtaAssignment_4_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4334:2: rule__Interface__SubAtaAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Interface__SubAtaAssignment_4_2_in_rule__Interface__Group_4__2__Impl8843);
            rule__Interface__SubAtaAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getSubAtaAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__2__Impl"


    // $ANTLR start "rule__Interface__Group_4__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4344:1: rule__Interface__Group_4__3 : rule__Interface__Group_4__3__Impl ;
    public final void rule__Interface__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4348:1: ( rule__Interface__Group_4__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4349:2: rule__Interface__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_4__3__Impl_in_rule__Interface__Group_4__38873);
            rule__Interface__Group_4__3__Impl();

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
    // $ANTLR end "rule__Interface__Group_4__3"


    // $ANTLR start "rule__Interface__Group_4__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4355:1: rule__Interface__Group_4__3__Impl : ( ';' ) ;
    public final void rule__Interface__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4359:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4360:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4360:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4361:1: ';'
            {
             before(grammarAccess.getInterfaceAccess().getSemicolonKeyword_4_3()); 
            match(input,61,FOLLOW_61_in_rule__Interface__Group_4__3__Impl8901); 
             after(grammarAccess.getInterfaceAccess().getSemicolonKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__3__Impl"


    // $ANTLR start "rule__Interface__Group_5__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4382:1: rule__Interface__Group_5__0 : rule__Interface__Group_5__0__Impl rule__Interface__Group_5__1 ;
    public final void rule__Interface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4386:1: ( rule__Interface__Group_5__0__Impl rule__Interface__Group_5__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4387:2: rule__Interface__Group_5__0__Impl rule__Interface__Group_5__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_5__0__Impl_in_rule__Interface__Group_5__08940);
            rule__Interface__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_5__1_in_rule__Interface__Group_5__08943);
            rule__Interface__Group_5__1();

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
    // $ANTLR end "rule__Interface__Group_5__0"


    // $ANTLR start "rule__Interface__Group_5__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4394:1: rule__Interface__Group_5__0__Impl : ( 'Resource' ) ;
    public final void rule__Interface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4398:1: ( ( 'Resource' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4399:1: ( 'Resource' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4399:1: ( 'Resource' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4400:1: 'Resource'
            {
             before(grammarAccess.getInterfaceAccess().getResourceKeyword_5_0()); 
            match(input,81,FOLLOW_81_in_rule__Interface__Group_5__0__Impl8971); 
             after(grammarAccess.getInterfaceAccess().getResourceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_5__0__Impl"


    // $ANTLR start "rule__Interface__Group_5__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4413:1: rule__Interface__Group_5__1 : rule__Interface__Group_5__1__Impl rule__Interface__Group_5__2 ;
    public final void rule__Interface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4417:1: ( rule__Interface__Group_5__1__Impl rule__Interface__Group_5__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4418:2: rule__Interface__Group_5__1__Impl rule__Interface__Group_5__2
            {
            pushFollow(FOLLOW_rule__Interface__Group_5__1__Impl_in_rule__Interface__Group_5__19002);
            rule__Interface__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_5__2_in_rule__Interface__Group_5__19005);
            rule__Interface__Group_5__2();

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
    // $ANTLR end "rule__Interface__Group_5__1"


    // $ANTLR start "rule__Interface__Group_5__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4425:1: rule__Interface__Group_5__1__Impl : ( '=' ) ;
    public final void rule__Interface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4429:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4430:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4430:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4431:1: '='
            {
             before(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_5_1()); 
            match(input,60,FOLLOW_60_in_rule__Interface__Group_5__1__Impl9033); 
             after(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_5__1__Impl"


    // $ANTLR start "rule__Interface__Group_5__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4444:1: rule__Interface__Group_5__2 : rule__Interface__Group_5__2__Impl rule__Interface__Group_5__3 ;
    public final void rule__Interface__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4448:1: ( rule__Interface__Group_5__2__Impl rule__Interface__Group_5__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4449:2: rule__Interface__Group_5__2__Impl rule__Interface__Group_5__3
            {
            pushFollow(FOLLOW_rule__Interface__Group_5__2__Impl_in_rule__Interface__Group_5__29064);
            rule__Interface__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_5__3_in_rule__Interface__Group_5__29067);
            rule__Interface__Group_5__3();

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
    // $ANTLR end "rule__Interface__Group_5__2"


    // $ANTLR start "rule__Interface__Group_5__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4456:1: rule__Interface__Group_5__2__Impl : ( ( rule__Interface__ResourceAssignment_5_2 ) ) ;
    public final void rule__Interface__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4460:1: ( ( ( rule__Interface__ResourceAssignment_5_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4461:1: ( ( rule__Interface__ResourceAssignment_5_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4461:1: ( ( rule__Interface__ResourceAssignment_5_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4462:1: ( rule__Interface__ResourceAssignment_5_2 )
            {
             before(grammarAccess.getInterfaceAccess().getResourceAssignment_5_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4463:1: ( rule__Interface__ResourceAssignment_5_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4463:2: rule__Interface__ResourceAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Interface__ResourceAssignment_5_2_in_rule__Interface__Group_5__2__Impl9094);
            rule__Interface__ResourceAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getResourceAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_5__2__Impl"


    // $ANTLR start "rule__Interface__Group_5__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4473:1: rule__Interface__Group_5__3 : rule__Interface__Group_5__3__Impl ;
    public final void rule__Interface__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4477:1: ( rule__Interface__Group_5__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4478:2: rule__Interface__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_5__3__Impl_in_rule__Interface__Group_5__39124);
            rule__Interface__Group_5__3__Impl();

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
    // $ANTLR end "rule__Interface__Group_5__3"


    // $ANTLR start "rule__Interface__Group_5__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4484:1: rule__Interface__Group_5__3__Impl : ( ';' ) ;
    public final void rule__Interface__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4488:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4489:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4489:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4490:1: ';'
            {
             before(grammarAccess.getInterfaceAccess().getSemicolonKeyword_5_3()); 
            match(input,61,FOLLOW_61_in_rule__Interface__Group_5__3__Impl9152); 
             after(grammarAccess.getInterfaceAccess().getSemicolonKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_5__3__Impl"


    // $ANTLR start "rule__Interface__Group_6__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4511:1: rule__Interface__Group_6__0 : rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1 ;
    public final void rule__Interface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4515:1: ( rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4516:2: rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_6__0__Impl_in_rule__Interface__Group_6__09191);
            rule__Interface__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_6__1_in_rule__Interface__Group_6__09194);
            rule__Interface__Group_6__1();

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
    // $ANTLR end "rule__Interface__Group_6__0"


    // $ANTLR start "rule__Interface__Group_6__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4523:1: rule__Interface__Group_6__0__Impl : ( 'LineName' ) ;
    public final void rule__Interface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4527:1: ( ( 'LineName' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4528:1: ( 'LineName' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4528:1: ( 'LineName' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4529:1: 'LineName'
            {
             before(grammarAccess.getInterfaceAccess().getLineNameKeyword_6_0()); 
            match(input,82,FOLLOW_82_in_rule__Interface__Group_6__0__Impl9222); 
             after(grammarAccess.getInterfaceAccess().getLineNameKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_6__0__Impl"


    // $ANTLR start "rule__Interface__Group_6__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4542:1: rule__Interface__Group_6__1 : rule__Interface__Group_6__1__Impl rule__Interface__Group_6__2 ;
    public final void rule__Interface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4546:1: ( rule__Interface__Group_6__1__Impl rule__Interface__Group_6__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4547:2: rule__Interface__Group_6__1__Impl rule__Interface__Group_6__2
            {
            pushFollow(FOLLOW_rule__Interface__Group_6__1__Impl_in_rule__Interface__Group_6__19253);
            rule__Interface__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_6__2_in_rule__Interface__Group_6__19256);
            rule__Interface__Group_6__2();

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
    // $ANTLR end "rule__Interface__Group_6__1"


    // $ANTLR start "rule__Interface__Group_6__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4554:1: rule__Interface__Group_6__1__Impl : ( '=' ) ;
    public final void rule__Interface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4558:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4559:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4559:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4560:1: '='
            {
             before(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_6_1()); 
            match(input,60,FOLLOW_60_in_rule__Interface__Group_6__1__Impl9284); 
             after(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_6__1__Impl"


    // $ANTLR start "rule__Interface__Group_6__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4573:1: rule__Interface__Group_6__2 : rule__Interface__Group_6__2__Impl rule__Interface__Group_6__3 ;
    public final void rule__Interface__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4577:1: ( rule__Interface__Group_6__2__Impl rule__Interface__Group_6__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4578:2: rule__Interface__Group_6__2__Impl rule__Interface__Group_6__3
            {
            pushFollow(FOLLOW_rule__Interface__Group_6__2__Impl_in_rule__Interface__Group_6__29315);
            rule__Interface__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_6__3_in_rule__Interface__Group_6__29318);
            rule__Interface__Group_6__3();

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
    // $ANTLR end "rule__Interface__Group_6__2"


    // $ANTLR start "rule__Interface__Group_6__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4585:1: rule__Interface__Group_6__2__Impl : ( ( rule__Interface__LineNameAssignment_6_2 ) ) ;
    public final void rule__Interface__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4589:1: ( ( ( rule__Interface__LineNameAssignment_6_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4590:1: ( ( rule__Interface__LineNameAssignment_6_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4590:1: ( ( rule__Interface__LineNameAssignment_6_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4591:1: ( rule__Interface__LineNameAssignment_6_2 )
            {
             before(grammarAccess.getInterfaceAccess().getLineNameAssignment_6_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4592:1: ( rule__Interface__LineNameAssignment_6_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4592:2: rule__Interface__LineNameAssignment_6_2
            {
            pushFollow(FOLLOW_rule__Interface__LineNameAssignment_6_2_in_rule__Interface__Group_6__2__Impl9345);
            rule__Interface__LineNameAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getLineNameAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_6__2__Impl"


    // $ANTLR start "rule__Interface__Group_6__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4602:1: rule__Interface__Group_6__3 : rule__Interface__Group_6__3__Impl ;
    public final void rule__Interface__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4606:1: ( rule__Interface__Group_6__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4607:2: rule__Interface__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_6__3__Impl_in_rule__Interface__Group_6__39375);
            rule__Interface__Group_6__3__Impl();

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
    // $ANTLR end "rule__Interface__Group_6__3"


    // $ANTLR start "rule__Interface__Group_6__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4613:1: rule__Interface__Group_6__3__Impl : ( ';' ) ;
    public final void rule__Interface__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4617:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4618:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4618:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4619:1: ';'
            {
             before(grammarAccess.getInterfaceAccess().getSemicolonKeyword_6_3()); 
            match(input,61,FOLLOW_61_in_rule__Interface__Group_6__3__Impl9403); 
             after(grammarAccess.getInterfaceAccess().getSemicolonKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_6__3__Impl"


    // $ANTLR start "rule__Interface__Group_7__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4640:1: rule__Interface__Group_7__0 : rule__Interface__Group_7__0__Impl rule__Interface__Group_7__1 ;
    public final void rule__Interface__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4644:1: ( rule__Interface__Group_7__0__Impl rule__Interface__Group_7__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4645:2: rule__Interface__Group_7__0__Impl rule__Interface__Group_7__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_7__0__Impl_in_rule__Interface__Group_7__09442);
            rule__Interface__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_7__1_in_rule__Interface__Group_7__09445);
            rule__Interface__Group_7__1();

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
    // $ANTLR end "rule__Interface__Group_7__0"


    // $ANTLR start "rule__Interface__Group_7__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4652:1: rule__Interface__Group_7__0__Impl : ( 'WiringLane' ) ;
    public final void rule__Interface__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4656:1: ( ( 'WiringLane' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4657:1: ( 'WiringLane' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4657:1: ( 'WiringLane' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4658:1: 'WiringLane'
            {
             before(grammarAccess.getInterfaceAccess().getWiringLaneKeyword_7_0()); 
            match(input,83,FOLLOW_83_in_rule__Interface__Group_7__0__Impl9473); 
             after(grammarAccess.getInterfaceAccess().getWiringLaneKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_7__0__Impl"


    // $ANTLR start "rule__Interface__Group_7__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4671:1: rule__Interface__Group_7__1 : rule__Interface__Group_7__1__Impl rule__Interface__Group_7__2 ;
    public final void rule__Interface__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4675:1: ( rule__Interface__Group_7__1__Impl rule__Interface__Group_7__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4676:2: rule__Interface__Group_7__1__Impl rule__Interface__Group_7__2
            {
            pushFollow(FOLLOW_rule__Interface__Group_7__1__Impl_in_rule__Interface__Group_7__19504);
            rule__Interface__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_7__2_in_rule__Interface__Group_7__19507);
            rule__Interface__Group_7__2();

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
    // $ANTLR end "rule__Interface__Group_7__1"


    // $ANTLR start "rule__Interface__Group_7__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4683:1: rule__Interface__Group_7__1__Impl : ( '=' ) ;
    public final void rule__Interface__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4687:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4688:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4688:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4689:1: '='
            {
             before(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_7_1()); 
            match(input,60,FOLLOW_60_in_rule__Interface__Group_7__1__Impl9535); 
             after(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_7__1__Impl"


    // $ANTLR start "rule__Interface__Group_7__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4702:1: rule__Interface__Group_7__2 : rule__Interface__Group_7__2__Impl rule__Interface__Group_7__3 ;
    public final void rule__Interface__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4706:1: ( rule__Interface__Group_7__2__Impl rule__Interface__Group_7__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4707:2: rule__Interface__Group_7__2__Impl rule__Interface__Group_7__3
            {
            pushFollow(FOLLOW_rule__Interface__Group_7__2__Impl_in_rule__Interface__Group_7__29566);
            rule__Interface__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_7__3_in_rule__Interface__Group_7__29569);
            rule__Interface__Group_7__3();

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
    // $ANTLR end "rule__Interface__Group_7__2"


    // $ANTLR start "rule__Interface__Group_7__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4714:1: rule__Interface__Group_7__2__Impl : ( ( rule__Interface__WiringLaneAssignment_7_2 ) ) ;
    public final void rule__Interface__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4718:1: ( ( ( rule__Interface__WiringLaneAssignment_7_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4719:1: ( ( rule__Interface__WiringLaneAssignment_7_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4719:1: ( ( rule__Interface__WiringLaneAssignment_7_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4720:1: ( rule__Interface__WiringLaneAssignment_7_2 )
            {
             before(grammarAccess.getInterfaceAccess().getWiringLaneAssignment_7_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4721:1: ( rule__Interface__WiringLaneAssignment_7_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4721:2: rule__Interface__WiringLaneAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Interface__WiringLaneAssignment_7_2_in_rule__Interface__Group_7__2__Impl9596);
            rule__Interface__WiringLaneAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getWiringLaneAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_7__2__Impl"


    // $ANTLR start "rule__Interface__Group_7__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4731:1: rule__Interface__Group_7__3 : rule__Interface__Group_7__3__Impl ;
    public final void rule__Interface__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4735:1: ( rule__Interface__Group_7__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4736:2: rule__Interface__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_7__3__Impl_in_rule__Interface__Group_7__39626);
            rule__Interface__Group_7__3__Impl();

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
    // $ANTLR end "rule__Interface__Group_7__3"


    // $ANTLR start "rule__Interface__Group_7__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4742:1: rule__Interface__Group_7__3__Impl : ( ';' ) ;
    public final void rule__Interface__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4746:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4747:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4747:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4748:1: ';'
            {
             before(grammarAccess.getInterfaceAccess().getSemicolonKeyword_7_3()); 
            match(input,61,FOLLOW_61_in_rule__Interface__Group_7__3__Impl9654); 
             after(grammarAccess.getInterfaceAccess().getSemicolonKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_7__3__Impl"


    // $ANTLR start "rule__Interface__Group_8__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4769:1: rule__Interface__Group_8__0 : rule__Interface__Group_8__0__Impl rule__Interface__Group_8__1 ;
    public final void rule__Interface__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4773:1: ( rule__Interface__Group_8__0__Impl rule__Interface__Group_8__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4774:2: rule__Interface__Group_8__0__Impl rule__Interface__Group_8__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_8__0__Impl_in_rule__Interface__Group_8__09693);
            rule__Interface__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_8__1_in_rule__Interface__Group_8__09696);
            rule__Interface__Group_8__1();

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
    // $ANTLR end "rule__Interface__Group_8__0"


    // $ANTLR start "rule__Interface__Group_8__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4781:1: rule__Interface__Group_8__0__Impl : ( 'GrpInfo' ) ;
    public final void rule__Interface__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4785:1: ( ( 'GrpInfo' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4786:1: ( 'GrpInfo' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4786:1: ( 'GrpInfo' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4787:1: 'GrpInfo'
            {
             before(grammarAccess.getInterfaceAccess().getGrpInfoKeyword_8_0()); 
            match(input,84,FOLLOW_84_in_rule__Interface__Group_8__0__Impl9724); 
             after(grammarAccess.getInterfaceAccess().getGrpInfoKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_8__0__Impl"


    // $ANTLR start "rule__Interface__Group_8__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4800:1: rule__Interface__Group_8__1 : rule__Interface__Group_8__1__Impl rule__Interface__Group_8__2 ;
    public final void rule__Interface__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4804:1: ( rule__Interface__Group_8__1__Impl rule__Interface__Group_8__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4805:2: rule__Interface__Group_8__1__Impl rule__Interface__Group_8__2
            {
            pushFollow(FOLLOW_rule__Interface__Group_8__1__Impl_in_rule__Interface__Group_8__19755);
            rule__Interface__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_8__2_in_rule__Interface__Group_8__19758);
            rule__Interface__Group_8__2();

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
    // $ANTLR end "rule__Interface__Group_8__1"


    // $ANTLR start "rule__Interface__Group_8__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4812:1: rule__Interface__Group_8__1__Impl : ( '=' ) ;
    public final void rule__Interface__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4816:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4817:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4817:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4818:1: '='
            {
             before(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_8_1()); 
            match(input,60,FOLLOW_60_in_rule__Interface__Group_8__1__Impl9786); 
             after(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_8__1__Impl"


    // $ANTLR start "rule__Interface__Group_8__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4831:1: rule__Interface__Group_8__2 : rule__Interface__Group_8__2__Impl rule__Interface__Group_8__3 ;
    public final void rule__Interface__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4835:1: ( rule__Interface__Group_8__2__Impl rule__Interface__Group_8__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4836:2: rule__Interface__Group_8__2__Impl rule__Interface__Group_8__3
            {
            pushFollow(FOLLOW_rule__Interface__Group_8__2__Impl_in_rule__Interface__Group_8__29817);
            rule__Interface__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_8__3_in_rule__Interface__Group_8__29820);
            rule__Interface__Group_8__3();

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
    // $ANTLR end "rule__Interface__Group_8__2"


    // $ANTLR start "rule__Interface__Group_8__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4843:1: rule__Interface__Group_8__2__Impl : ( ( rule__Interface__GrpInfoAssignment_8_2 ) ) ;
    public final void rule__Interface__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4847:1: ( ( ( rule__Interface__GrpInfoAssignment_8_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4848:1: ( ( rule__Interface__GrpInfoAssignment_8_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4848:1: ( ( rule__Interface__GrpInfoAssignment_8_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4849:1: ( rule__Interface__GrpInfoAssignment_8_2 )
            {
             before(grammarAccess.getInterfaceAccess().getGrpInfoAssignment_8_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4850:1: ( rule__Interface__GrpInfoAssignment_8_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4850:2: rule__Interface__GrpInfoAssignment_8_2
            {
            pushFollow(FOLLOW_rule__Interface__GrpInfoAssignment_8_2_in_rule__Interface__Group_8__2__Impl9847);
            rule__Interface__GrpInfoAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGrpInfoAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_8__2__Impl"


    // $ANTLR start "rule__Interface__Group_8__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4860:1: rule__Interface__Group_8__3 : rule__Interface__Group_8__3__Impl ;
    public final void rule__Interface__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4864:1: ( rule__Interface__Group_8__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4865:2: rule__Interface__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_8__3__Impl_in_rule__Interface__Group_8__39877);
            rule__Interface__Group_8__3__Impl();

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
    // $ANTLR end "rule__Interface__Group_8__3"


    // $ANTLR start "rule__Interface__Group_8__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4871:1: rule__Interface__Group_8__3__Impl : ( ';' ) ;
    public final void rule__Interface__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4875:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4876:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4876:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4877:1: ';'
            {
             before(grammarAccess.getInterfaceAccess().getSemicolonKeyword_8_3()); 
            match(input,61,FOLLOW_61_in_rule__Interface__Group_8__3__Impl9905); 
             after(grammarAccess.getInterfaceAccess().getSemicolonKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_8__3__Impl"


    // $ANTLR start "rule__Interface__Group_9__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4898:1: rule__Interface__Group_9__0 : rule__Interface__Group_9__0__Impl rule__Interface__Group_9__1 ;
    public final void rule__Interface__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4902:1: ( rule__Interface__Group_9__0__Impl rule__Interface__Group_9__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4903:2: rule__Interface__Group_9__0__Impl rule__Interface__Group_9__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_9__0__Impl_in_rule__Interface__Group_9__09944);
            rule__Interface__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_9__1_in_rule__Interface__Group_9__09947);
            rule__Interface__Group_9__1();

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
    // $ANTLR end "rule__Interface__Group_9__0"


    // $ANTLR start "rule__Interface__Group_9__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4910:1: rule__Interface__Group_9__0__Impl : ( 'Route' ) ;
    public final void rule__Interface__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4914:1: ( ( 'Route' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4915:1: ( 'Route' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4915:1: ( 'Route' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4916:1: 'Route'
            {
             before(grammarAccess.getInterfaceAccess().getRouteKeyword_9_0()); 
            match(input,85,FOLLOW_85_in_rule__Interface__Group_9__0__Impl9975); 
             after(grammarAccess.getInterfaceAccess().getRouteKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_9__0__Impl"


    // $ANTLR start "rule__Interface__Group_9__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4929:1: rule__Interface__Group_9__1 : rule__Interface__Group_9__1__Impl rule__Interface__Group_9__2 ;
    public final void rule__Interface__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4933:1: ( rule__Interface__Group_9__1__Impl rule__Interface__Group_9__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4934:2: rule__Interface__Group_9__1__Impl rule__Interface__Group_9__2
            {
            pushFollow(FOLLOW_rule__Interface__Group_9__1__Impl_in_rule__Interface__Group_9__110006);
            rule__Interface__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_9__2_in_rule__Interface__Group_9__110009);
            rule__Interface__Group_9__2();

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
    // $ANTLR end "rule__Interface__Group_9__1"


    // $ANTLR start "rule__Interface__Group_9__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4941:1: rule__Interface__Group_9__1__Impl : ( '=' ) ;
    public final void rule__Interface__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4945:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4946:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4946:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4947:1: '='
            {
             before(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_9_1()); 
            match(input,60,FOLLOW_60_in_rule__Interface__Group_9__1__Impl10037); 
             after(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_9__1__Impl"


    // $ANTLR start "rule__Interface__Group_9__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4960:1: rule__Interface__Group_9__2 : rule__Interface__Group_9__2__Impl rule__Interface__Group_9__3 ;
    public final void rule__Interface__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4964:1: ( rule__Interface__Group_9__2__Impl rule__Interface__Group_9__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4965:2: rule__Interface__Group_9__2__Impl rule__Interface__Group_9__3
            {
            pushFollow(FOLLOW_rule__Interface__Group_9__2__Impl_in_rule__Interface__Group_9__210068);
            rule__Interface__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_9__3_in_rule__Interface__Group_9__210071);
            rule__Interface__Group_9__3();

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
    // $ANTLR end "rule__Interface__Group_9__2"


    // $ANTLR start "rule__Interface__Group_9__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4972:1: rule__Interface__Group_9__2__Impl : ( ( rule__Interface__RouteAssignment_9_2 ) ) ;
    public final void rule__Interface__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4976:1: ( ( ( rule__Interface__RouteAssignment_9_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4977:1: ( ( rule__Interface__RouteAssignment_9_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4977:1: ( ( rule__Interface__RouteAssignment_9_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4978:1: ( rule__Interface__RouteAssignment_9_2 )
            {
             before(grammarAccess.getInterfaceAccess().getRouteAssignment_9_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4979:1: ( rule__Interface__RouteAssignment_9_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4979:2: rule__Interface__RouteAssignment_9_2
            {
            pushFollow(FOLLOW_rule__Interface__RouteAssignment_9_2_in_rule__Interface__Group_9__2__Impl10098);
            rule__Interface__RouteAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getRouteAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_9__2__Impl"


    // $ANTLR start "rule__Interface__Group_9__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4989:1: rule__Interface__Group_9__3 : rule__Interface__Group_9__3__Impl ;
    public final void rule__Interface__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4993:1: ( rule__Interface__Group_9__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:4994:2: rule__Interface__Group_9__3__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_9__3__Impl_in_rule__Interface__Group_9__310128);
            rule__Interface__Group_9__3__Impl();

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
    // $ANTLR end "rule__Interface__Group_9__3"


    // $ANTLR start "rule__Interface__Group_9__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5000:1: rule__Interface__Group_9__3__Impl : ( ';' ) ;
    public final void rule__Interface__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5004:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5005:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5005:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5006:1: ';'
            {
             before(grammarAccess.getInterfaceAccess().getSemicolonKeyword_9_3()); 
            match(input,61,FOLLOW_61_in_rule__Interface__Group_9__3__Impl10156); 
             after(grammarAccess.getInterfaceAccess().getSemicolonKeyword_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_9__3__Impl"


    // $ANTLR start "rule__Interface__Group_10__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5027:1: rule__Interface__Group_10__0 : rule__Interface__Group_10__0__Impl rule__Interface__Group_10__1 ;
    public final void rule__Interface__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5031:1: ( rule__Interface__Group_10__0__Impl rule__Interface__Group_10__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5032:2: rule__Interface__Group_10__0__Impl rule__Interface__Group_10__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_10__0__Impl_in_rule__Interface__Group_10__010195);
            rule__Interface__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_10__1_in_rule__Interface__Group_10__010198);
            rule__Interface__Group_10__1();

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
    // $ANTLR end "rule__Interface__Group_10__0"


    // $ANTLR start "rule__Interface__Group_10__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5039:1: rule__Interface__Group_10__0__Impl : ( 'PwSup1' ) ;
    public final void rule__Interface__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5043:1: ( ( 'PwSup1' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5044:1: ( 'PwSup1' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5044:1: ( 'PwSup1' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5045:1: 'PwSup1'
            {
             before(grammarAccess.getInterfaceAccess().getPwSup1Keyword_10_0()); 
            match(input,86,FOLLOW_86_in_rule__Interface__Group_10__0__Impl10226); 
             after(grammarAccess.getInterfaceAccess().getPwSup1Keyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_10__0__Impl"


    // $ANTLR start "rule__Interface__Group_10__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5058:1: rule__Interface__Group_10__1 : rule__Interface__Group_10__1__Impl rule__Interface__Group_10__2 ;
    public final void rule__Interface__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5062:1: ( rule__Interface__Group_10__1__Impl rule__Interface__Group_10__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5063:2: rule__Interface__Group_10__1__Impl rule__Interface__Group_10__2
            {
            pushFollow(FOLLOW_rule__Interface__Group_10__1__Impl_in_rule__Interface__Group_10__110257);
            rule__Interface__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_10__2_in_rule__Interface__Group_10__110260);
            rule__Interface__Group_10__2();

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
    // $ANTLR end "rule__Interface__Group_10__1"


    // $ANTLR start "rule__Interface__Group_10__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5070:1: rule__Interface__Group_10__1__Impl : ( '=' ) ;
    public final void rule__Interface__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5074:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5075:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5075:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5076:1: '='
            {
             before(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_10_1()); 
            match(input,60,FOLLOW_60_in_rule__Interface__Group_10__1__Impl10288); 
             after(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_10__1__Impl"


    // $ANTLR start "rule__Interface__Group_10__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5089:1: rule__Interface__Group_10__2 : rule__Interface__Group_10__2__Impl rule__Interface__Group_10__3 ;
    public final void rule__Interface__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5093:1: ( rule__Interface__Group_10__2__Impl rule__Interface__Group_10__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5094:2: rule__Interface__Group_10__2__Impl rule__Interface__Group_10__3
            {
            pushFollow(FOLLOW_rule__Interface__Group_10__2__Impl_in_rule__Interface__Group_10__210319);
            rule__Interface__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_10__3_in_rule__Interface__Group_10__210322);
            rule__Interface__Group_10__3();

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
    // $ANTLR end "rule__Interface__Group_10__2"


    // $ANTLR start "rule__Interface__Group_10__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5101:1: rule__Interface__Group_10__2__Impl : ( ( rule__Interface__PwSup1Assignment_10_2 ) ) ;
    public final void rule__Interface__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5105:1: ( ( ( rule__Interface__PwSup1Assignment_10_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5106:1: ( ( rule__Interface__PwSup1Assignment_10_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5106:1: ( ( rule__Interface__PwSup1Assignment_10_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5107:1: ( rule__Interface__PwSup1Assignment_10_2 )
            {
             before(grammarAccess.getInterfaceAccess().getPwSup1Assignment_10_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5108:1: ( rule__Interface__PwSup1Assignment_10_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5108:2: rule__Interface__PwSup1Assignment_10_2
            {
            pushFollow(FOLLOW_rule__Interface__PwSup1Assignment_10_2_in_rule__Interface__Group_10__2__Impl10349);
            rule__Interface__PwSup1Assignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getPwSup1Assignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_10__2__Impl"


    // $ANTLR start "rule__Interface__Group_10__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5118:1: rule__Interface__Group_10__3 : rule__Interface__Group_10__3__Impl ;
    public final void rule__Interface__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5122:1: ( rule__Interface__Group_10__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5123:2: rule__Interface__Group_10__3__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_10__3__Impl_in_rule__Interface__Group_10__310379);
            rule__Interface__Group_10__3__Impl();

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
    // $ANTLR end "rule__Interface__Group_10__3"


    // $ANTLR start "rule__Interface__Group_10__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5129:1: rule__Interface__Group_10__3__Impl : ( ';' ) ;
    public final void rule__Interface__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5133:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5134:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5134:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5135:1: ';'
            {
             before(grammarAccess.getInterfaceAccess().getSemicolonKeyword_10_3()); 
            match(input,61,FOLLOW_61_in_rule__Interface__Group_10__3__Impl10407); 
             after(grammarAccess.getInterfaceAccess().getSemicolonKeyword_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_10__3__Impl"


    // $ANTLR start "rule__Interface__Group_11__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5156:1: rule__Interface__Group_11__0 : rule__Interface__Group_11__0__Impl rule__Interface__Group_11__1 ;
    public final void rule__Interface__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5160:1: ( rule__Interface__Group_11__0__Impl rule__Interface__Group_11__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5161:2: rule__Interface__Group_11__0__Impl rule__Interface__Group_11__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_11__0__Impl_in_rule__Interface__Group_11__010446);
            rule__Interface__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_11__1_in_rule__Interface__Group_11__010449);
            rule__Interface__Group_11__1();

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
    // $ANTLR end "rule__Interface__Group_11__0"


    // $ANTLR start "rule__Interface__Group_11__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5168:1: rule__Interface__Group_11__0__Impl : ( 'EmhZone1' ) ;
    public final void rule__Interface__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5172:1: ( ( 'EmhZone1' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5173:1: ( 'EmhZone1' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5173:1: ( 'EmhZone1' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5174:1: 'EmhZone1'
            {
             before(grammarAccess.getInterfaceAccess().getEmhZone1Keyword_11_0()); 
            match(input,87,FOLLOW_87_in_rule__Interface__Group_11__0__Impl10477); 
             after(grammarAccess.getInterfaceAccess().getEmhZone1Keyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_11__0__Impl"


    // $ANTLR start "rule__Interface__Group_11__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5187:1: rule__Interface__Group_11__1 : rule__Interface__Group_11__1__Impl rule__Interface__Group_11__2 ;
    public final void rule__Interface__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5191:1: ( rule__Interface__Group_11__1__Impl rule__Interface__Group_11__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5192:2: rule__Interface__Group_11__1__Impl rule__Interface__Group_11__2
            {
            pushFollow(FOLLOW_rule__Interface__Group_11__1__Impl_in_rule__Interface__Group_11__110508);
            rule__Interface__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_11__2_in_rule__Interface__Group_11__110511);
            rule__Interface__Group_11__2();

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
    // $ANTLR end "rule__Interface__Group_11__1"


    // $ANTLR start "rule__Interface__Group_11__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5199:1: rule__Interface__Group_11__1__Impl : ( '=' ) ;
    public final void rule__Interface__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5203:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5204:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5204:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5205:1: '='
            {
             before(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_11_1()); 
            match(input,60,FOLLOW_60_in_rule__Interface__Group_11__1__Impl10539); 
             after(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_11__1__Impl"


    // $ANTLR start "rule__Interface__Group_11__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5218:1: rule__Interface__Group_11__2 : rule__Interface__Group_11__2__Impl rule__Interface__Group_11__3 ;
    public final void rule__Interface__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5222:1: ( rule__Interface__Group_11__2__Impl rule__Interface__Group_11__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5223:2: rule__Interface__Group_11__2__Impl rule__Interface__Group_11__3
            {
            pushFollow(FOLLOW_rule__Interface__Group_11__2__Impl_in_rule__Interface__Group_11__210570);
            rule__Interface__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_11__3_in_rule__Interface__Group_11__210573);
            rule__Interface__Group_11__3();

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
    // $ANTLR end "rule__Interface__Group_11__2"


    // $ANTLR start "rule__Interface__Group_11__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5230:1: rule__Interface__Group_11__2__Impl : ( ( rule__Interface__EmhZone1Assignment_11_2 ) ) ;
    public final void rule__Interface__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5234:1: ( ( ( rule__Interface__EmhZone1Assignment_11_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5235:1: ( ( rule__Interface__EmhZone1Assignment_11_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5235:1: ( ( rule__Interface__EmhZone1Assignment_11_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5236:1: ( rule__Interface__EmhZone1Assignment_11_2 )
            {
             before(grammarAccess.getInterfaceAccess().getEmhZone1Assignment_11_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5237:1: ( rule__Interface__EmhZone1Assignment_11_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5237:2: rule__Interface__EmhZone1Assignment_11_2
            {
            pushFollow(FOLLOW_rule__Interface__EmhZone1Assignment_11_2_in_rule__Interface__Group_11__2__Impl10600);
            rule__Interface__EmhZone1Assignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getEmhZone1Assignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_11__2__Impl"


    // $ANTLR start "rule__Interface__Group_11__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5247:1: rule__Interface__Group_11__3 : rule__Interface__Group_11__3__Impl ;
    public final void rule__Interface__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5251:1: ( rule__Interface__Group_11__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5252:2: rule__Interface__Group_11__3__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_11__3__Impl_in_rule__Interface__Group_11__310630);
            rule__Interface__Group_11__3__Impl();

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
    // $ANTLR end "rule__Interface__Group_11__3"


    // $ANTLR start "rule__Interface__Group_11__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5258:1: rule__Interface__Group_11__3__Impl : ( ';' ) ;
    public final void rule__Interface__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5262:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5263:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5263:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5264:1: ';'
            {
             before(grammarAccess.getInterfaceAccess().getSemicolonKeyword_11_3()); 
            match(input,61,FOLLOW_61_in_rule__Interface__Group_11__3__Impl10658); 
             after(grammarAccess.getInterfaceAccess().getSemicolonKeyword_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_11__3__Impl"


    // $ANTLR start "rule__Interface__Group_12__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5285:1: rule__Interface__Group_12__0 : rule__Interface__Group_12__0__Impl rule__Interface__Group_12__1 ;
    public final void rule__Interface__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5289:1: ( rule__Interface__Group_12__0__Impl rule__Interface__Group_12__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5290:2: rule__Interface__Group_12__0__Impl rule__Interface__Group_12__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_12__0__Impl_in_rule__Interface__Group_12__010697);
            rule__Interface__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_12__1_in_rule__Interface__Group_12__010700);
            rule__Interface__Group_12__1();

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
    // $ANTLR end "rule__Interface__Group_12__0"


    // $ANTLR start "rule__Interface__Group_12__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5297:1: rule__Interface__Group_12__0__Impl : ( 'Type' ) ;
    public final void rule__Interface__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5301:1: ( ( 'Type' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5302:1: ( 'Type' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5302:1: ( 'Type' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5303:1: 'Type'
            {
             before(grammarAccess.getInterfaceAccess().getTypeKeyword_12_0()); 
            match(input,72,FOLLOW_72_in_rule__Interface__Group_12__0__Impl10728); 
             after(grammarAccess.getInterfaceAccess().getTypeKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_12__0__Impl"


    // $ANTLR start "rule__Interface__Group_12__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5316:1: rule__Interface__Group_12__1 : rule__Interface__Group_12__1__Impl rule__Interface__Group_12__2 ;
    public final void rule__Interface__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5320:1: ( rule__Interface__Group_12__1__Impl rule__Interface__Group_12__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5321:2: rule__Interface__Group_12__1__Impl rule__Interface__Group_12__2
            {
            pushFollow(FOLLOW_rule__Interface__Group_12__1__Impl_in_rule__Interface__Group_12__110759);
            rule__Interface__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_12__2_in_rule__Interface__Group_12__110762);
            rule__Interface__Group_12__2();

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
    // $ANTLR end "rule__Interface__Group_12__1"


    // $ANTLR start "rule__Interface__Group_12__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5328:1: rule__Interface__Group_12__1__Impl : ( '=' ) ;
    public final void rule__Interface__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5332:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5333:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5333:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5334:1: '='
            {
             before(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_12_1()); 
            match(input,60,FOLLOW_60_in_rule__Interface__Group_12__1__Impl10790); 
             after(grammarAccess.getInterfaceAccess().getEqualsSignKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_12__1__Impl"


    // $ANTLR start "rule__Interface__Group_12__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5347:1: rule__Interface__Group_12__2 : rule__Interface__Group_12__2__Impl rule__Interface__Group_12__3 ;
    public final void rule__Interface__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5351:1: ( rule__Interface__Group_12__2__Impl rule__Interface__Group_12__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5352:2: rule__Interface__Group_12__2__Impl rule__Interface__Group_12__3
            {
            pushFollow(FOLLOW_rule__Interface__Group_12__2__Impl_in_rule__Interface__Group_12__210821);
            rule__Interface__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_12__3_in_rule__Interface__Group_12__210824);
            rule__Interface__Group_12__3();

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
    // $ANTLR end "rule__Interface__Group_12__2"


    // $ANTLR start "rule__Interface__Group_12__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5359:1: rule__Interface__Group_12__2__Impl : ( ( rule__Interface__IoTypeAssignment_12_2 ) ) ;
    public final void rule__Interface__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5363:1: ( ( ( rule__Interface__IoTypeAssignment_12_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5364:1: ( ( rule__Interface__IoTypeAssignment_12_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5364:1: ( ( rule__Interface__IoTypeAssignment_12_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5365:1: ( rule__Interface__IoTypeAssignment_12_2 )
            {
             before(grammarAccess.getInterfaceAccess().getIoTypeAssignment_12_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5366:1: ( rule__Interface__IoTypeAssignment_12_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5366:2: rule__Interface__IoTypeAssignment_12_2
            {
            pushFollow(FOLLOW_rule__Interface__IoTypeAssignment_12_2_in_rule__Interface__Group_12__2__Impl10851);
            rule__Interface__IoTypeAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getIoTypeAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_12__2__Impl"


    // $ANTLR start "rule__Interface__Group_12__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5376:1: rule__Interface__Group_12__3 : rule__Interface__Group_12__3__Impl ;
    public final void rule__Interface__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5380:1: ( rule__Interface__Group_12__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5381:2: rule__Interface__Group_12__3__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_12__3__Impl_in_rule__Interface__Group_12__310881);
            rule__Interface__Group_12__3__Impl();

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
    // $ANTLR end "rule__Interface__Group_12__3"


    // $ANTLR start "rule__Interface__Group_12__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5387:1: rule__Interface__Group_12__3__Impl : ( ';' ) ;
    public final void rule__Interface__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5391:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5392:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5392:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5393:1: ';'
            {
             before(grammarAccess.getInterfaceAccess().getSemicolonKeyword_12_3()); 
            match(input,61,FOLLOW_61_in_rule__Interface__Group_12__3__Impl10909); 
             after(grammarAccess.getInterfaceAccess().getSemicolonKeyword_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_12__3__Impl"


    // $ANTLR start "rule__Interface__Group_13__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5414:1: rule__Interface__Group_13__0 : rule__Interface__Group_13__0__Impl rule__Interface__Group_13__1 ;
    public final void rule__Interface__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5418:1: ( rule__Interface__Group_13__0__Impl rule__Interface__Group_13__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5419:2: rule__Interface__Group_13__0__Impl rule__Interface__Group_13__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_13__0__Impl_in_rule__Interface__Group_13__010948);
            rule__Interface__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_13__1_in_rule__Interface__Group_13__010951);
            rule__Interface__Group_13__1();

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
    // $ANTLR end "rule__Interface__Group_13__0"


    // $ANTLR start "rule__Interface__Group_13__0__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5426:1: rule__Interface__Group_13__0__Impl : ( 'Generic properties' ) ;
    public final void rule__Interface__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5430:1: ( ( 'Generic properties' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5431:1: ( 'Generic properties' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5431:1: ( 'Generic properties' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5432:1: 'Generic properties'
            {
             before(grammarAccess.getInterfaceAccess().getGenericPropertiesKeyword_13_0()); 
            match(input,70,FOLLOW_70_in_rule__Interface__Group_13__0__Impl10979); 
             after(grammarAccess.getInterfaceAccess().getGenericPropertiesKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_13__0__Impl"


    // $ANTLR start "rule__Interface__Group_13__1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5445:1: rule__Interface__Group_13__1 : rule__Interface__Group_13__1__Impl rule__Interface__Group_13__2 ;
    public final void rule__Interface__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5449:1: ( rule__Interface__Group_13__1__Impl rule__Interface__Group_13__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5450:2: rule__Interface__Group_13__1__Impl rule__Interface__Group_13__2
            {
            pushFollow(FOLLOW_rule__Interface__Group_13__1__Impl_in_rule__Interface__Group_13__111010);
            rule__Interface__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_13__2_in_rule__Interface__Group_13__111013);
            rule__Interface__Group_13__2();

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
    // $ANTLR end "rule__Interface__Group_13__1"


    // $ANTLR start "rule__Interface__Group_13__1__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5457:1: rule__Interface__Group_13__1__Impl : ( '{' ) ;
    public final void rule__Interface__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5461:1: ( ( '{' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5462:1: ( '{' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5462:1: ( '{' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5463:1: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,58,FOLLOW_58_in_rule__Interface__Group_13__1__Impl11041); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_13__1__Impl"


    // $ANTLR start "rule__Interface__Group_13__2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5476:1: rule__Interface__Group_13__2 : rule__Interface__Group_13__2__Impl rule__Interface__Group_13__3 ;
    public final void rule__Interface__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5480:1: ( rule__Interface__Group_13__2__Impl rule__Interface__Group_13__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5481:2: rule__Interface__Group_13__2__Impl rule__Interface__Group_13__3
            {
            pushFollow(FOLLOW_rule__Interface__Group_13__2__Impl_in_rule__Interface__Group_13__211072);
            rule__Interface__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_13__3_in_rule__Interface__Group_13__211075);
            rule__Interface__Group_13__3();

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
    // $ANTLR end "rule__Interface__Group_13__2"


    // $ANTLR start "rule__Interface__Group_13__2__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5488:1: rule__Interface__Group_13__2__Impl : ( ( rule__Interface__MetricParametersAssignment_13_2 )* ) ;
    public final void rule__Interface__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5492:1: ( ( ( rule__Interface__MetricParametersAssignment_13_2 )* ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5493:1: ( ( rule__Interface__MetricParametersAssignment_13_2 )* )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5493:1: ( ( rule__Interface__MetricParametersAssignment_13_2 )* )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5494:1: ( rule__Interface__MetricParametersAssignment_13_2 )*
            {
             before(grammarAccess.getInterfaceAccess().getMetricParametersAssignment_13_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5495:1: ( rule__Interface__MetricParametersAssignment_13_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_STRING) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5495:2: rule__Interface__MetricParametersAssignment_13_2
            	    {
            	    pushFollow(FOLLOW_rule__Interface__MetricParametersAssignment_13_2_in_rule__Interface__Group_13__2__Impl11102);
            	    rule__Interface__MetricParametersAssignment_13_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getMetricParametersAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_13__2__Impl"


    // $ANTLR start "rule__Interface__Group_13__3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5505:1: rule__Interface__Group_13__3 : rule__Interface__Group_13__3__Impl ;
    public final void rule__Interface__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5509:1: ( rule__Interface__Group_13__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5510:2: rule__Interface__Group_13__3__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_13__3__Impl_in_rule__Interface__Group_13__311133);
            rule__Interface__Group_13__3__Impl();

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
    // $ANTLR end "rule__Interface__Group_13__3"


    // $ANTLR start "rule__Interface__Group_13__3__Impl"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5516:1: rule__Interface__Group_13__3__Impl : ( '}' ) ;
    public final void rule__Interface__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5520:1: ( ( '}' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5521:1: ( '}' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5521:1: ( '}' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5522:1: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_13_3()); 
            match(input,62,FOLLOW_62_in_rule__Interface__Group_13__3__Impl11161); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_13__3__Impl"


    // $ANTLR start "rule__MetricParameter__Group__0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5543:1: rule__MetricParameter__Group__0 : rule__MetricParameter__Group__0__Impl rule__MetricParameter__Group__1 ;
    public final void rule__MetricParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5547:1: ( rule__MetricParameter__Group__0__Impl rule__MetricParameter__Group__1 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5548:2: rule__MetricParameter__Group__0__Impl rule__MetricParameter__Group__1
            {
            pushFollow(FOLLOW_rule__MetricParameter__Group__0__Impl_in_rule__MetricParameter__Group__011200);
            rule__MetricParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricParameter__Group__1_in_rule__MetricParameter__Group__011203);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5555:1: rule__MetricParameter__Group__0__Impl : ( ( rule__MetricParameter__NameAssignment_0 ) ) ;
    public final void rule__MetricParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5559:1: ( ( ( rule__MetricParameter__NameAssignment_0 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5560:1: ( ( rule__MetricParameter__NameAssignment_0 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5560:1: ( ( rule__MetricParameter__NameAssignment_0 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5561:1: ( rule__MetricParameter__NameAssignment_0 )
            {
             before(grammarAccess.getMetricParameterAccess().getNameAssignment_0()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5562:1: ( rule__MetricParameter__NameAssignment_0 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5562:2: rule__MetricParameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MetricParameter__NameAssignment_0_in_rule__MetricParameter__Group__0__Impl11230);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5572:1: rule__MetricParameter__Group__1 : rule__MetricParameter__Group__1__Impl rule__MetricParameter__Group__2 ;
    public final void rule__MetricParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5576:1: ( rule__MetricParameter__Group__1__Impl rule__MetricParameter__Group__2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5577:2: rule__MetricParameter__Group__1__Impl rule__MetricParameter__Group__2
            {
            pushFollow(FOLLOW_rule__MetricParameter__Group__1__Impl_in_rule__MetricParameter__Group__111260);
            rule__MetricParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricParameter__Group__2_in_rule__MetricParameter__Group__111263);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5584:1: rule__MetricParameter__Group__1__Impl : ( '=' ) ;
    public final void rule__MetricParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5588:1: ( ( '=' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5589:1: ( '=' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5589:1: ( '=' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5590:1: '='
            {
             before(grammarAccess.getMetricParameterAccess().getEqualsSignKeyword_1()); 
            match(input,60,FOLLOW_60_in_rule__MetricParameter__Group__1__Impl11291); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5603:1: rule__MetricParameter__Group__2 : rule__MetricParameter__Group__2__Impl rule__MetricParameter__Group__3 ;
    public final void rule__MetricParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5607:1: ( rule__MetricParameter__Group__2__Impl rule__MetricParameter__Group__3 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5608:2: rule__MetricParameter__Group__2__Impl rule__MetricParameter__Group__3
            {
            pushFollow(FOLLOW_rule__MetricParameter__Group__2__Impl_in_rule__MetricParameter__Group__211322);
            rule__MetricParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricParameter__Group__3_in_rule__MetricParameter__Group__211325);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5615:1: rule__MetricParameter__Group__2__Impl : ( ( rule__MetricParameter__ValueAssignment_2 ) ) ;
    public final void rule__MetricParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5619:1: ( ( ( rule__MetricParameter__ValueAssignment_2 ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5620:1: ( ( rule__MetricParameter__ValueAssignment_2 ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5620:1: ( ( rule__MetricParameter__ValueAssignment_2 ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5621:1: ( rule__MetricParameter__ValueAssignment_2 )
            {
             before(grammarAccess.getMetricParameterAccess().getValueAssignment_2()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5622:1: ( rule__MetricParameter__ValueAssignment_2 )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5622:2: rule__MetricParameter__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__MetricParameter__ValueAssignment_2_in_rule__MetricParameter__Group__2__Impl11352);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5632:1: rule__MetricParameter__Group__3 : rule__MetricParameter__Group__3__Impl ;
    public final void rule__MetricParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5636:1: ( rule__MetricParameter__Group__3__Impl )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5637:2: rule__MetricParameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MetricParameter__Group__3__Impl_in_rule__MetricParameter__Group__311382);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5643:1: rule__MetricParameter__Group__3__Impl : ( ';' ) ;
    public final void rule__MetricParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5647:1: ( ( ';' ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5648:1: ( ';' )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5648:1: ( ';' )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5649:1: ';'
            {
             before(grammarAccess.getMetricParameterAccess().getSemicolonKeyword_3()); 
            match(input,61,FOLLOW_61_in_rule__MetricParameter__Group__3__Impl11410); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5673:1: rule__AssistModel__SystemNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__AssistModel__SystemNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5677:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5678:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5678:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5679:1: RULE_STRING
            {
             before(grammarAccess.getAssistModelAccess().getSystemNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AssistModel__SystemNameAssignment_411456); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5688:1: rule__AssistModel__CompartmentsAssignment_7 : ( ruleCompartment ) ;
    public final void rule__AssistModel__CompartmentsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5692:1: ( ( ruleCompartment ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5693:1: ( ruleCompartment )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5693:1: ( ruleCompartment )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5694:1: ruleCompartment
            {
             before(grammarAccess.getAssistModelAccess().getCompartmentsCompartmentParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleCompartment_in_rule__AssistModel__CompartmentsAssignment_711487);
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


    // $ANTLR start "rule__AssistModel__InterfacesAssignment_10"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5703:1: rule__AssistModel__InterfacesAssignment_10 : ( ruleInterface ) ;
    public final void rule__AssistModel__InterfacesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5707:1: ( ( ruleInterface ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5708:1: ( ruleInterface )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5708:1: ( ruleInterface )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5709:1: ruleInterface
            {
             before(grammarAccess.getAssistModelAccess().getInterfacesInterfaceParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__AssistModel__InterfacesAssignment_1011518);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getAssistModelAccess().getInterfacesInterfaceParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__InterfacesAssignment_10"


    // $ANTLR start "rule__AssistModel__InterfaceGroupsAssignment_14"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5718:1: rule__AssistModel__InterfaceGroupsAssignment_14 : ( ruleInterfaceGroup ) ;
    public final void rule__AssistModel__InterfaceGroupsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5722:1: ( ( ruleInterfaceGroup ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5723:1: ( ruleInterfaceGroup )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5723:1: ( ruleInterfaceGroup )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5724:1: ruleInterfaceGroup
            {
             before(grammarAccess.getAssistModelAccess().getInterfaceGroupsInterfaceGroupParserRuleCall_14_0()); 
            pushFollow(FOLLOW_ruleInterfaceGroup_in_rule__AssistModel__InterfaceGroupsAssignment_1411549);
            ruleInterfaceGroup();

            state._fsp--;

             after(grammarAccess.getAssistModelAccess().getInterfaceGroupsInterfaceGroupParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__InterfaceGroupsAssignment_14"


    // $ANTLR start "rule__Compartment__NameAssignment_1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5733:1: rule__Compartment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Compartment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5737:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5738:1: ( RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5738:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5739:1: RULE_ID
            {
             before(grammarAccess.getCompartmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Compartment__NameAssignment_111580); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5748:1: rule__Compartment__ManufacturerAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__Compartment__ManufacturerAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5752:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5753:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5753:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5754:1: RULE_STRING
            {
             before(grammarAccess.getCompartmentAccess().getManufacturerSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Compartment__ManufacturerAssignment_3_211611); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5763:1: rule__Compartment__PowerSupplyAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Compartment__PowerSupplyAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5767:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5768:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5768:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5769:1: RULE_STRING
            {
             before(grammarAccess.getCompartmentAccess().getPowerSupplySTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Compartment__PowerSupplyAssignment_4_211642); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5778:1: rule__Compartment__SideAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Compartment__SideAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5782:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5783:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5783:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5784:1: RULE_STRING
            {
             before(grammarAccess.getCompartmentAccess().getSideSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Compartment__SideAssignment_5_211673); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5793:1: rule__Compartment__ZoneAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__Compartment__ZoneAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5797:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5798:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5798:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5799:1: RULE_STRING
            {
             before(grammarAccess.getCompartmentAccess().getZoneSTRINGTerminalRuleCall_6_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Compartment__ZoneAssignment_6_211704); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5808:1: rule__Compartment__RdcsAssignment_7 : ( ruleRDC ) ;
    public final void rule__Compartment__RdcsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5812:1: ( ( ruleRDC ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5813:1: ( ruleRDC )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5813:1: ( ruleRDC )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5814:1: ruleRDC
            {
             before(grammarAccess.getCompartmentAccess().getRdcsRDCParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleRDC_in_rule__Compartment__RdcsAssignment_711735);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5823:1: rule__Compartment__MetricParametersAssignment_8_2 : ( ruleMetricParameter ) ;
    public final void rule__Compartment__MetricParametersAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5827:1: ( ( ruleMetricParameter ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5828:1: ( ruleMetricParameter )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5828:1: ( ruleMetricParameter )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5829:1: ruleMetricParameter
            {
             before(grammarAccess.getCompartmentAccess().getMetricParametersMetricParameterParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleMetricParameter_in_rule__Compartment__MetricParametersAssignment_8_211766);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5838:1: rule__RDC__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RDC__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5842:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5843:1: ( RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5843:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5844:1: RULE_ID
            {
             before(grammarAccess.getRDCAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RDC__NameAssignment_111797); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5853:1: rule__RDC__ManufacturerAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__RDC__ManufacturerAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5857:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5858:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5858:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5859:1: RULE_STRING
            {
             before(grammarAccess.getRDCAccess().getManufacturerSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RDC__ManufacturerAssignment_3_211828); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5868:1: rule__RDC__PowerSupplyAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__RDC__PowerSupplyAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5872:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5873:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5873:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5874:1: RULE_STRING
            {
             before(grammarAccess.getRDCAccess().getPowerSupplySTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RDC__PowerSupplyAssignment_4_211859); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5883:1: rule__RDC__RdcTypeAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__RDC__RdcTypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5887:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5888:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5888:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5889:1: RULE_STRING
            {
             before(grammarAccess.getRDCAccess().getRdcTypeSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RDC__RdcTypeAssignment_5_211890); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5898:1: rule__RDC__EssAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__RDC__EssAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5902:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5903:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5903:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5904:1: RULE_STRING
            {
             before(grammarAccess.getRDCAccess().getEssSTRINGTerminalRuleCall_6_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RDC__EssAssignment_6_211921); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5913:1: rule__RDC__ConnectorsAssignment_7 : ( ruleConnector ) ;
    public final void rule__RDC__ConnectorsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5917:1: ( ( ruleConnector ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5918:1: ( ruleConnector )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5918:1: ( ruleConnector )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5919:1: ruleConnector
            {
             before(grammarAccess.getRDCAccess().getConnectorsConnectorParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleConnector_in_rule__RDC__ConnectorsAssignment_711952);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5928:1: rule__RDC__MetricParametersAssignment_8_2 : ( ruleMetricParameter ) ;
    public final void rule__RDC__MetricParametersAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5932:1: ( ( ruleMetricParameter ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5933:1: ( ruleMetricParameter )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5933:1: ( ruleMetricParameter )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5934:1: ruleMetricParameter
            {
             before(grammarAccess.getRDCAccess().getMetricParametersMetricParameterParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleMetricParameter_in_rule__RDC__MetricParametersAssignment_8_211983);
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5943:1: rule__Connector__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5947:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5948:1: ( RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5948:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5949:1: RULE_ID
            {
             before(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Connector__NameAssignment_112014); 
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


    // $ANTLR start "rule__Connector__AvailableInterfacesAssignment_3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5958:1: rule__Connector__AvailableInterfacesAssignment_3 : ( ruleAvailableInterface ) ;
    public final void rule__Connector__AvailableInterfacesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5962:1: ( ( ruleAvailableInterface ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5963:1: ( ruleAvailableInterface )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5963:1: ( ruleAvailableInterface )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5964:1: ruleAvailableInterface
            {
             before(grammarAccess.getConnectorAccess().getAvailableInterfacesAvailableInterfaceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAvailableInterface_in_rule__Connector__AvailableInterfacesAssignment_312045);
            ruleAvailableInterface();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getAvailableInterfacesAvailableInterfaceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__AvailableInterfacesAssignment_3"


    // $ANTLR start "rule__AvailableInterface__CountAssignment_0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5973:1: rule__AvailableInterface__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__AvailableInterface__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5977:1: ( ( RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5978:1: ( RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5978:1: ( RULE_INT )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5979:1: RULE_INT
            {
             before(grammarAccess.getAvailableInterfaceAccess().getCountINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AvailableInterface__CountAssignment_012076); 
             after(grammarAccess.getAvailableInterfaceAccess().getCountINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvailableInterface__CountAssignment_0"


    // $ANTLR start "rule__AvailableInterface__InterfaceTypeAssignment_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5988:1: rule__AvailableInterface__InterfaceTypeAssignment_2 : ( ruleInterfaceType ) ;
    public final void rule__AvailableInterface__InterfaceTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5992:1: ( ( ruleInterfaceType ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5993:1: ( ruleInterfaceType )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5993:1: ( ruleInterfaceType )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:5994:1: ruleInterfaceType
            {
             before(grammarAccess.getAvailableInterfaceAccess().getInterfaceTypeInterfaceTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleInterfaceType_in_rule__AvailableInterface__InterfaceTypeAssignment_212107);
            ruleInterfaceType();

            state._fsp--;

             after(grammarAccess.getAvailableInterfaceAccess().getInterfaceTypeInterfaceTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvailableInterface__InterfaceTypeAssignment_2"


    // $ANTLR start "rule__InterfaceGroup__NameAssignment_1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6003:1: rule__InterfaceGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InterfaceGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6007:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6008:1: ( RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6008:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6009:1: RULE_ID
            {
             before(grammarAccess.getInterfaceGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InterfaceGroup__NameAssignment_112138); 
             after(grammarAccess.getInterfaceGroupAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceGroup__NameAssignment_1"


    // $ANTLR start "rule__InterfaceGroup__InterfacesAssignment_3"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6018:1: rule__InterfaceGroup__InterfacesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__InterfaceGroup__InterfacesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6022:1: ( ( ( RULE_ID ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6023:1: ( ( RULE_ID ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6023:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6024:1: ( RULE_ID )
            {
             before(grammarAccess.getInterfaceGroupAccess().getInterfacesInterfaceCrossReference_3_0()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6025:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6026:1: RULE_ID
            {
             before(grammarAccess.getInterfaceGroupAccess().getInterfacesInterfaceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InterfaceGroup__InterfacesAssignment_312173); 
             after(grammarAccess.getInterfaceGroupAccess().getInterfacesInterfaceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getInterfaceGroupAccess().getInterfacesInterfaceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceGroup__InterfacesAssignment_3"


    // $ANTLR start "rule__InterfaceGroup__InterfacesAssignment_4_1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6037:1: rule__InterfaceGroup__InterfacesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__InterfaceGroup__InterfacesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6041:1: ( ( ( RULE_ID ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6042:1: ( ( RULE_ID ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6042:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6043:1: ( RULE_ID )
            {
             before(grammarAccess.getInterfaceGroupAccess().getInterfacesInterfaceCrossReference_4_1_0()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6044:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6045:1: RULE_ID
            {
             before(grammarAccess.getInterfaceGroupAccess().getInterfacesInterfaceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InterfaceGroup__InterfacesAssignment_4_112212); 
             after(grammarAccess.getInterfaceGroupAccess().getInterfacesInterfaceIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getInterfaceGroupAccess().getInterfacesInterfaceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceGroup__InterfacesAssignment_4_1"


    // $ANTLR start "rule__Interface__NameAssignment_1"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6056:1: rule__Interface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6060:1: ( ( RULE_ID ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6061:1: ( RULE_ID )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6061:1: ( RULE_ID )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6062:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_112247); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_1"


    // $ANTLR start "rule__Interface__SystemAssignment_3_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6071:1: rule__Interface__SystemAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__Interface__SystemAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6075:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6076:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6076:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6077:1: RULE_STRING
            {
             before(grammarAccess.getInterfaceAccess().getSystemSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Interface__SystemAssignment_3_212278); 
             after(grammarAccess.getInterfaceAccess().getSystemSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__SystemAssignment_3_2"


    // $ANTLR start "rule__Interface__SubAtaAssignment_4_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6086:1: rule__Interface__SubAtaAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Interface__SubAtaAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6090:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6091:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6091:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6092:1: RULE_STRING
            {
             before(grammarAccess.getInterfaceAccess().getSubAtaSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Interface__SubAtaAssignment_4_212309); 
             after(grammarAccess.getInterfaceAccess().getSubAtaSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__SubAtaAssignment_4_2"


    // $ANTLR start "rule__Interface__ResourceAssignment_5_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6101:1: rule__Interface__ResourceAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Interface__ResourceAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6105:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6106:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6106:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6107:1: RULE_STRING
            {
             before(grammarAccess.getInterfaceAccess().getResourceSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Interface__ResourceAssignment_5_212340); 
             after(grammarAccess.getInterfaceAccess().getResourceSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__ResourceAssignment_5_2"


    // $ANTLR start "rule__Interface__LineNameAssignment_6_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6116:1: rule__Interface__LineNameAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__Interface__LineNameAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6120:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6121:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6121:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6122:1: RULE_STRING
            {
             before(grammarAccess.getInterfaceAccess().getLineNameSTRINGTerminalRuleCall_6_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Interface__LineNameAssignment_6_212371); 
             after(grammarAccess.getInterfaceAccess().getLineNameSTRINGTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__LineNameAssignment_6_2"


    // $ANTLR start "rule__Interface__WiringLaneAssignment_7_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6131:1: rule__Interface__WiringLaneAssignment_7_2 : ( RULE_STRING ) ;
    public final void rule__Interface__WiringLaneAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6135:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6136:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6136:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6137:1: RULE_STRING
            {
             before(grammarAccess.getInterfaceAccess().getWiringLaneSTRINGTerminalRuleCall_7_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Interface__WiringLaneAssignment_7_212402); 
             after(grammarAccess.getInterfaceAccess().getWiringLaneSTRINGTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__WiringLaneAssignment_7_2"


    // $ANTLR start "rule__Interface__GrpInfoAssignment_8_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6146:1: rule__Interface__GrpInfoAssignment_8_2 : ( RULE_STRING ) ;
    public final void rule__Interface__GrpInfoAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6150:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6151:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6151:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6152:1: RULE_STRING
            {
             before(grammarAccess.getInterfaceAccess().getGrpInfoSTRINGTerminalRuleCall_8_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Interface__GrpInfoAssignment_8_212433); 
             after(grammarAccess.getInterfaceAccess().getGrpInfoSTRINGTerminalRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__GrpInfoAssignment_8_2"


    // $ANTLR start "rule__Interface__RouteAssignment_9_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6161:1: rule__Interface__RouteAssignment_9_2 : ( RULE_STRING ) ;
    public final void rule__Interface__RouteAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6165:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6166:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6166:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6167:1: RULE_STRING
            {
             before(grammarAccess.getInterfaceAccess().getRouteSTRINGTerminalRuleCall_9_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Interface__RouteAssignment_9_212464); 
             after(grammarAccess.getInterfaceAccess().getRouteSTRINGTerminalRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__RouteAssignment_9_2"


    // $ANTLR start "rule__Interface__PwSup1Assignment_10_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6176:1: rule__Interface__PwSup1Assignment_10_2 : ( RULE_STRING ) ;
    public final void rule__Interface__PwSup1Assignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6180:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6181:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6181:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6182:1: RULE_STRING
            {
             before(grammarAccess.getInterfaceAccess().getPwSup1STRINGTerminalRuleCall_10_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Interface__PwSup1Assignment_10_212495); 
             after(grammarAccess.getInterfaceAccess().getPwSup1STRINGTerminalRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__PwSup1Assignment_10_2"


    // $ANTLR start "rule__Interface__EmhZone1Assignment_11_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6191:1: rule__Interface__EmhZone1Assignment_11_2 : ( RULE_STRING ) ;
    public final void rule__Interface__EmhZone1Assignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6195:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6196:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6196:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6197:1: RULE_STRING
            {
             before(grammarAccess.getInterfaceAccess().getEmhZone1STRINGTerminalRuleCall_11_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Interface__EmhZone1Assignment_11_212526); 
             after(grammarAccess.getInterfaceAccess().getEmhZone1STRINGTerminalRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__EmhZone1Assignment_11_2"


    // $ANTLR start "rule__Interface__IoTypeAssignment_12_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6206:1: rule__Interface__IoTypeAssignment_12_2 : ( ruleInterfaceType ) ;
    public final void rule__Interface__IoTypeAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6210:1: ( ( ruleInterfaceType ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6211:1: ( ruleInterfaceType )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6211:1: ( ruleInterfaceType )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6212:1: ruleInterfaceType
            {
             before(grammarAccess.getInterfaceAccess().getIoTypeInterfaceTypeEnumRuleCall_12_2_0()); 
            pushFollow(FOLLOW_ruleInterfaceType_in_rule__Interface__IoTypeAssignment_12_212557);
            ruleInterfaceType();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getIoTypeInterfaceTypeEnumRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__IoTypeAssignment_12_2"


    // $ANTLR start "rule__Interface__MetricParametersAssignment_13_2"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6221:1: rule__Interface__MetricParametersAssignment_13_2 : ( ruleMetricParameter ) ;
    public final void rule__Interface__MetricParametersAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6225:1: ( ( ruleMetricParameter ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6226:1: ( ruleMetricParameter )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6226:1: ( ruleMetricParameter )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6227:1: ruleMetricParameter
            {
             before(grammarAccess.getInterfaceAccess().getMetricParametersMetricParameterParserRuleCall_13_2_0()); 
            pushFollow(FOLLOW_ruleMetricParameter_in_rule__Interface__MetricParametersAssignment_13_212588);
            ruleMetricParameter();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getMetricParametersMetricParameterParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__MetricParametersAssignment_13_2"


    // $ANTLR start "rule__MetricParameter__NameAssignment_0"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6236:1: rule__MetricParameter__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MetricParameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6240:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6241:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6241:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6242:1: RULE_STRING
            {
             before(grammarAccess.getMetricParameterAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MetricParameter__NameAssignment_012619); 
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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6251:1: rule__MetricParameter__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__MetricParameter__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6255:1: ( ( RULE_INT ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6256:1: ( RULE_INT )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6256:1: ( RULE_INT )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:6257:1: RULE_INT
            {
             before(grammarAccess.getMetricParameterAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__MetricParameter__ValueAssignment_212650); 
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
    public static final BitSet FOLLOW_ruleAvailableInterface_in_entryRuleAvailableInterface301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvailableInterface308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableInterface__Group__0_in_ruleAvailableInterface334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceGroup_in_entryRuleInterfaceGroup361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceGroup368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__Group__0_in_ruleInterfaceGroup394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0_in_ruleInterface454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_entryRuleMetricParameter481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricParameter488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__0_in_ruleMetricParameter514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceType__Alternatives_in_ruleInterfaceType553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__InterfaceType__Alternatives589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__InterfaceType__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__InterfaceType__Alternatives631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__InterfaceType__Alternatives652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__InterfaceType__Alternatives673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__InterfaceType__Alternatives694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__InterfaceType__Alternatives715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__InterfaceType__Alternatives736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__InterfaceType__Alternatives757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__InterfaceType__Alternatives778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__InterfaceType__Alternatives799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__InterfaceType__Alternatives820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__InterfaceType__Alternatives841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__InterfaceType__Alternatives862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__InterfaceType__Alternatives883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__InterfaceType__Alternatives904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__InterfaceType__Alternatives925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__InterfaceType__Alternatives946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__InterfaceType__Alternatives967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__InterfaceType__Alternatives988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__InterfaceType__Alternatives1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InterfaceType__Alternatives1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InterfaceType__Alternatives1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__InterfaceType__Alternatives1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__InterfaceType__Alternatives1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__InterfaceType__Alternatives1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__InterfaceType__Alternatives1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__InterfaceType__Alternatives1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__InterfaceType__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__InterfaceType__Alternatives1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__InterfaceType__Alternatives1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__InterfaceType__Alternatives1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__InterfaceType__Alternatives1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__InterfaceType__Alternatives1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__InterfaceType__Alternatives1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__InterfaceType__Alternatives1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__InterfaceType__Alternatives1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__InterfaceType__Alternatives1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__InterfaceType__Alternatives1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__InterfaceType__Alternatives1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__InterfaceType__Alternatives1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__InterfaceType__Alternatives1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__InterfaceType__Alternatives1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__InterfaceType__Alternatives1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__InterfaceType__Alternatives1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__InterfaceType__Alternatives1534 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__AssistModel__Group__6__Impl_in_rule__AssistModel__Group__61937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__7_in_rule__AssistModel__Group__61940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__AssistModel__Group__6__Impl1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__7__Impl_in_rule__AssistModel__Group__71999 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__8_in_rule__AssistModel__Group__72002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__CompartmentsAssignment_7_in_rule__AssistModel__Group__7__Impl2031 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__CompartmentsAssignment_7_in_rule__AssistModel__Group__7__Impl2043 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__8__Impl_in_rule__AssistModel__Group__82076 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__9_in_rule__AssistModel__Group__82079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__AssistModel__Group__8__Impl2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__9__Impl_in_rule__AssistModel__Group__92138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__10_in_rule__AssistModel__Group__92141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__AssistModel__Group__9__Impl2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__10__Impl_in_rule__AssistModel__Group__102200 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__11_in_rule__AssistModel__Group__102203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__InterfacesAssignment_10_in_rule__AssistModel__Group__10__Impl2232 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_rule__AssistModel__InterfacesAssignment_10_in_rule__AssistModel__Group__10__Impl2244 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__11__Impl_in_rule__AssistModel__Group__112277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__12_in_rule__AssistModel__Group__112280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__AssistModel__Group__11__Impl2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__12__Impl_in_rule__AssistModel__Group__122339 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__13_in_rule__AssistModel__Group__122342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__AssistModel__Group__12__Impl2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__13__Impl_in_rule__AssistModel__Group__132401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__14_in_rule__AssistModel__Group__132404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__AssistModel__Group__13__Impl2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__14__Impl_in_rule__AssistModel__Group__142463 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__15_in_rule__AssistModel__Group__142466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__InterfaceGroupsAssignment_14_in_rule__AssistModel__Group__14__Impl2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__Group__15__Impl_in_rule__AssistModel__Group__152523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__AssistModel__Group__15__Impl2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__0__Impl_in_rule__Compartment__Group__02614 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Compartment__Group__1_in_rule__Compartment__Group__02617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__Compartment__Group__0__Impl2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__1__Impl_in_rule__Compartment__Group__12676 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group__2_in_rule__Compartment__Group__12679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__NameAssignment_1_in_rule__Compartment__Group__1__Impl2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__2__Impl_in_rule__Compartment__Group__22736 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000BCL});
    public static final BitSet FOLLOW_rule__Compartment__Group__3_in_rule__Compartment__Group__22739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Compartment__Group__2__Impl2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__3__Impl_in_rule__Compartment__Group__32798 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000BCL});
    public static final BitSet FOLLOW_rule__Compartment__Group__4_in_rule__Compartment__Group__32801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3__0_in_rule__Compartment__Group__3__Impl2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__4__Impl_in_rule__Compartment__Group__42859 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000BCL});
    public static final BitSet FOLLOW_rule__Compartment__Group__5_in_rule__Compartment__Group__42862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_4__0_in_rule__Compartment__Group__4__Impl2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__5__Impl_in_rule__Compartment__Group__52920 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000BCL});
    public static final BitSet FOLLOW_rule__Compartment__Group__6_in_rule__Compartment__Group__52923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_5__0_in_rule__Compartment__Group__5__Impl2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__6__Impl_in_rule__Compartment__Group__62981 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000BCL});
    public static final BitSet FOLLOW_rule__Compartment__Group__7_in_rule__Compartment__Group__62984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_6__0_in_rule__Compartment__Group__6__Impl3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__7__Impl_in_rule__Compartment__Group__73042 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Compartment__Group__8_in_rule__Compartment__Group__73045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__RdcsAssignment_7_in_rule__Compartment__Group__7__Impl3074 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000BCL});
    public static final BitSet FOLLOW_rule__Compartment__RdcsAssignment_7_in_rule__Compartment__Group__7__Impl3086 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000BCL});
    public static final BitSet FOLLOW_rule__Compartment__Group__8__Impl_in_rule__Compartment__Group__83119 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Compartment__Group__9_in_rule__Compartment__Group__83122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_8__0_in_rule__Compartment__Group__8__Impl3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group__9__Impl_in_rule__Compartment__Group__93180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Compartment__Group__9__Impl3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3__0__Impl_in_rule__Compartment__Group_3__03259 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3__1_in_rule__Compartment__Group_3__03262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__Compartment__Group_3__0__Impl3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3__1__Impl_in_rule__Compartment__Group_3__13321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3__2_in_rule__Compartment__Group_3__13324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Compartment__Group_3__1__Impl3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3__2__Impl_in_rule__Compartment__Group_3__23383 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3__3_in_rule__Compartment__Group_3__23386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__ManufacturerAssignment_3_2_in_rule__Compartment__Group_3__2__Impl3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_3__3__Impl_in_rule__Compartment__Group_3__33443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Compartment__Group_3__3__Impl3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_4__0__Impl_in_rule__Compartment__Group_4__03510 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_4__1_in_rule__Compartment__Group_4__03513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__Compartment__Group_4__0__Impl3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_4__1__Impl_in_rule__Compartment__Group_4__13572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Compartment__Group_4__2_in_rule__Compartment__Group_4__13575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Compartment__Group_4__1__Impl3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_4__2__Impl_in_rule__Compartment__Group_4__23634 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_4__3_in_rule__Compartment__Group_4__23637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__PowerSupplyAssignment_4_2_in_rule__Compartment__Group_4__2__Impl3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_4__3__Impl_in_rule__Compartment__Group_4__33694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Compartment__Group_4__3__Impl3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_5__0__Impl_in_rule__Compartment__Group_5__03761 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_5__1_in_rule__Compartment__Group_5__03764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__Compartment__Group_5__0__Impl3792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_5__1__Impl_in_rule__Compartment__Group_5__13823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Compartment__Group_5__2_in_rule__Compartment__Group_5__13826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Compartment__Group_5__1__Impl3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_5__2__Impl_in_rule__Compartment__Group_5__23885 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_5__3_in_rule__Compartment__Group_5__23888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__SideAssignment_5_2_in_rule__Compartment__Group_5__2__Impl3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_5__3__Impl_in_rule__Compartment__Group_5__33945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Compartment__Group_5__3__Impl3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_6__0__Impl_in_rule__Compartment__Group_6__04012 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_6__1_in_rule__Compartment__Group_6__04015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__Compartment__Group_6__0__Impl4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_6__1__Impl_in_rule__Compartment__Group_6__14074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Compartment__Group_6__2_in_rule__Compartment__Group_6__14077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Compartment__Group_6__1__Impl4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_6__2__Impl_in_rule__Compartment__Group_6__24136 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_6__3_in_rule__Compartment__Group_6__24139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__ZoneAssignment_6_2_in_rule__Compartment__Group_6__2__Impl4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_6__3__Impl_in_rule__Compartment__Group_6__34196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Compartment__Group_6__3__Impl4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_8__0__Impl_in_rule__Compartment__Group_8__04263 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Compartment__Group_8__1_in_rule__Compartment__Group_8__04266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__Compartment__Group_8__0__Impl4294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_8__1__Impl_in_rule__Compartment__Group_8__14325 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_rule__Compartment__Group_8__2_in_rule__Compartment__Group_8__14328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Compartment__Group_8__1__Impl4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__Group_8__2__Impl_in_rule__Compartment__Group_8__24387 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_rule__Compartment__Group_8__3_in_rule__Compartment__Group_8__24390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compartment__MetricParametersAssignment_8_2_in_rule__Compartment__Group_8__2__Impl4417 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Compartment__Group_8__3__Impl_in_rule__Compartment__Group_8__34448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Compartment__Group_8__3__Impl4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__0__Impl_in_rule__RDC__Group__04515 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RDC__Group__1_in_rule__RDC__Group__04518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__RDC__Group__0__Impl4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__1__Impl_in_rule__RDC__Group__14577 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group__2_in_rule__RDC__Group__14580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__NameAssignment_1_in_rule__RDC__Group__1__Impl4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__2__Impl_in_rule__RDC__Group__24637 = new BitSet(new long[]{0x0000000000000000L,0x000000000000070CL});
    public static final BitSet FOLLOW_rule__RDC__Group__3_in_rule__RDC__Group__24640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__RDC__Group__2__Impl4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__3__Impl_in_rule__RDC__Group__34699 = new BitSet(new long[]{0x0000000000000000L,0x000000000000070CL});
    public static final BitSet FOLLOW_rule__RDC__Group__4_in_rule__RDC__Group__34702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__0_in_rule__RDC__Group__3__Impl4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__4__Impl_in_rule__RDC__Group__44760 = new BitSet(new long[]{0x0000000000000000L,0x000000000000070CL});
    public static final BitSet FOLLOW_rule__RDC__Group__5_in_rule__RDC__Group__44763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__0_in_rule__RDC__Group__4__Impl4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__5__Impl_in_rule__RDC__Group__54821 = new BitSet(new long[]{0x0000000000000000L,0x000000000000070CL});
    public static final BitSet FOLLOW_rule__RDC__Group__6_in_rule__RDC__Group__54824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__0_in_rule__RDC__Group__5__Impl4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__6__Impl_in_rule__RDC__Group__64882 = new BitSet(new long[]{0x0000000000000000L,0x000000000000070CL});
    public static final BitSet FOLLOW_rule__RDC__Group__7_in_rule__RDC__Group__64885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__0_in_rule__RDC__Group__6__Impl4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__7__Impl_in_rule__RDC__Group__74943 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RDC__Group__8_in_rule__RDC__Group__74946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__ConnectorsAssignment_7_in_rule__RDC__Group__7__Impl4975 = new BitSet(new long[]{0x0000000000000002L,0x000000000000070CL});
    public static final BitSet FOLLOW_rule__RDC__ConnectorsAssignment_7_in_rule__RDC__Group__7__Impl4987 = new BitSet(new long[]{0x0000000000000002L,0x000000000000070CL});
    public static final BitSet FOLLOW_rule__RDC__Group__8__Impl_in_rule__RDC__Group__85020 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RDC__Group__9_in_rule__RDC__Group__85023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__0_in_rule__RDC__Group__8__Impl5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group__9__Impl_in_rule__RDC__Group__95081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__RDC__Group__9__Impl5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__0__Impl_in_rule__RDC__Group_3__05160 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__1_in_rule__RDC__Group_3__05163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__RDC__Group_3__0__Impl5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__1__Impl_in_rule__RDC__Group_3__15222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__2_in_rule__RDC__Group_3__15225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__RDC__Group_3__1__Impl5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__2__Impl_in_rule__RDC__Group_3__25284 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__3_in_rule__RDC__Group_3__25287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__ManufacturerAssignment_3_2_in_rule__RDC__Group_3__2__Impl5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_3__3__Impl_in_rule__RDC__Group_3__35344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__RDC__Group_3__3__Impl5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__0__Impl_in_rule__RDC__Group_4__05411 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__1_in_rule__RDC__Group_4__05414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__RDC__Group_4__0__Impl5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__1__Impl_in_rule__RDC__Group_4__15473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__2_in_rule__RDC__Group_4__15476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__RDC__Group_4__1__Impl5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__2__Impl_in_rule__RDC__Group_4__25535 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__3_in_rule__RDC__Group_4__25538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__PowerSupplyAssignment_4_2_in_rule__RDC__Group_4__2__Impl5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_4__3__Impl_in_rule__RDC__Group_4__35595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__RDC__Group_4__3__Impl5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__0__Impl_in_rule__RDC__Group_5__05662 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__1_in_rule__RDC__Group_5__05665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__RDC__Group_5__0__Impl5693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__1__Impl_in_rule__RDC__Group_5__15724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__2_in_rule__RDC__Group_5__15727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__RDC__Group_5__1__Impl5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__2__Impl_in_rule__RDC__Group_5__25786 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__3_in_rule__RDC__Group_5__25789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__RdcTypeAssignment_5_2_in_rule__RDC__Group_5__2__Impl5816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_5__3__Impl_in_rule__RDC__Group_5__35846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__RDC__Group_5__3__Impl5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__0__Impl_in_rule__RDC__Group_6__05913 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__1_in_rule__RDC__Group_6__05916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__RDC__Group_6__0__Impl5944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__1__Impl_in_rule__RDC__Group_6__15975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__2_in_rule__RDC__Group_6__15978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__RDC__Group_6__1__Impl6006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__2__Impl_in_rule__RDC__Group_6__26037 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__3_in_rule__RDC__Group_6__26040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__EssAssignment_6_2_in_rule__RDC__Group_6__2__Impl6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_6__3__Impl_in_rule__RDC__Group_6__36097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__RDC__Group_6__3__Impl6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__0__Impl_in_rule__RDC__Group_8__06164 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__1_in_rule__RDC__Group_8__06167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__RDC__Group_8__0__Impl6195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__1__Impl_in_rule__RDC__Group_8__16226 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__2_in_rule__RDC__Group_8__16229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__RDC__Group_8__1__Impl6257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__2__Impl_in_rule__RDC__Group_8__26288 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__3_in_rule__RDC__Group_8__26291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDC__MetricParametersAssignment_8_2_in_rule__RDC__Group_8__2__Impl6318 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__RDC__Group_8__3__Impl_in_rule__RDC__Group_8__36349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__RDC__Group_8__3__Impl6377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__0__Impl_in_rule__Connector__Group__06416 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Connector__Group__1_in_rule__Connector__Group__06419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__Connector__Group__0__Impl6447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__1__Impl_in_rule__Connector__Group__16478 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Connector__Group__2_in_rule__Connector__Group__16481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__NameAssignment_1_in_rule__Connector__Group__1__Impl6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__2__Impl_in_rule__Connector__Group__26538 = new BitSet(new long[]{0x4000000000000040L});
    public static final BitSet FOLLOW_rule__Connector__Group__3_in_rule__Connector__Group__26541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Connector__Group__2__Impl6569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__3__Impl_in_rule__Connector__Group__36600 = new BitSet(new long[]{0x4000000000000040L});
    public static final BitSet FOLLOW_rule__Connector__Group__4_in_rule__Connector__Group__36603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__AvailableInterfacesAssignment_3_in_rule__Connector__Group__3__Impl6630 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Connector__Group__4__Impl_in_rule__Connector__Group__46661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Connector__Group__4__Impl6689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableInterface__Group__0__Impl_in_rule__AvailableInterface__Group__06730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__AvailableInterface__Group__1_in_rule__AvailableInterface__Group__06733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableInterface__CountAssignment_0_in_rule__AvailableInterface__Group__0__Impl6760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableInterface__Group__1__Impl_in_rule__AvailableInterface__Group__16790 = new BitSet(new long[]{0x01FFFFFFFFFFF800L});
    public static final BitSet FOLLOW_rule__AvailableInterface__Group__2_in_rule__AvailableInterface__Group__16793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__AvailableInterface__Group__1__Impl6821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableInterface__Group__2__Impl_in_rule__AvailableInterface__Group__26852 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__AvailableInterface__Group__3_in_rule__AvailableInterface__Group__26855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableInterface__InterfaceTypeAssignment_2_in_rule__AvailableInterface__Group__2__Impl6882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvailableInterface__Group__3__Impl_in_rule__AvailableInterface__Group__36912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__AvailableInterface__Group__3__Impl6940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__Group__0__Impl_in_rule__InterfaceGroup__Group__06979 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__Group__1_in_rule__InterfaceGroup__Group__06982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__InterfaceGroup__Group__0__Impl7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__Group__1__Impl_in_rule__InterfaceGroup__Group__17041 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__Group__2_in_rule__InterfaceGroup__Group__17044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__NameAssignment_1_in_rule__InterfaceGroup__Group__1__Impl7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__Group__2__Impl_in_rule__InterfaceGroup__Group__27101 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__Group__3_in_rule__InterfaceGroup__Group__27104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__InterfaceGroup__Group__2__Impl7132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__Group__3__Impl_in_rule__InterfaceGroup__Group__37163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__Group__4_in_rule__InterfaceGroup__Group__37166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__InterfacesAssignment_3_in_rule__InterfaceGroup__Group__3__Impl7193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__Group__4__Impl_in_rule__InterfaceGroup__Group__47223 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__Group__5_in_rule__InterfaceGroup__Group__47226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__Group_4__0_in_rule__InterfaceGroup__Group__4__Impl7255 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__Group_4__0_in_rule__InterfaceGroup__Group__4__Impl7267 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__Group__5__Impl_in_rule__InterfaceGroup__Group__57300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__InterfaceGroup__Group__5__Impl7328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__Group_4__0__Impl_in_rule__InterfaceGroup__Group_4__07371 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__Group_4__1_in_rule__InterfaceGroup__Group_4__07374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__InterfaceGroup__Group_4__0__Impl7402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__Group_4__1__Impl_in_rule__InterfaceGroup__Group_4__17433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceGroup__InterfacesAssignment_4_1_in_rule__InterfaceGroup__Group_4__1__Impl7460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__07494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__07497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__Interface__Group__0__Impl7525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__17556 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__17559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_1_in_rule__Interface__Group__1__Impl7586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__27616 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__27619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Interface__Group__2__Impl7647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__37678 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__37681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__0_in_rule__Interface__Group__3__Impl7708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__47739 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__47742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__0_in_rule__Interface__Group__4__Impl7769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__57800 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__Interface__Group__6_in_rule__Interface__Group__57803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__0_in_rule__Interface__Group__5__Impl7830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__6__Impl_in_rule__Interface__Group__67861 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__Interface__Group__7_in_rule__Interface__Group__67864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_6__0_in_rule__Interface__Group__6__Impl7891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__7__Impl_in_rule__Interface__Group__77922 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__Interface__Group__8_in_rule__Interface__Group__77925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_7__0_in_rule__Interface__Group__7__Impl7952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__8__Impl_in_rule__Interface__Group__87983 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__Interface__Group__9_in_rule__Interface__Group__87986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_8__0_in_rule__Interface__Group__8__Impl8013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__9__Impl_in_rule__Interface__Group__98044 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__Interface__Group__10_in_rule__Interface__Group__98047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_9__0_in_rule__Interface__Group__9__Impl8074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__10__Impl_in_rule__Interface__Group__108105 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__Interface__Group__11_in_rule__Interface__Group__108108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_10__0_in_rule__Interface__Group__10__Impl8135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__11__Impl_in_rule__Interface__Group__118166 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__Interface__Group__12_in_rule__Interface__Group__118169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_11__0_in_rule__Interface__Group__11__Impl8196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__12__Impl_in_rule__Interface__Group__128227 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__Interface__Group__13_in_rule__Interface__Group__128230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_12__0_in_rule__Interface__Group__12__Impl8257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__13__Impl_in_rule__Interface__Group__138288 = new BitSet(new long[]{0x4000000000000000L,0x0000000000FF8140L});
    public static final BitSet FOLLOW_rule__Interface__Group__14_in_rule__Interface__Group__138291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_13__0_in_rule__Interface__Group__13__Impl8318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__14__Impl_in_rule__Interface__Group__148349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Interface__Group__14__Impl8377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__0__Impl_in_rule__Interface__Group_3__08438 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__1_in_rule__Interface__Group_3__08441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rule__Interface__Group_3__0__Impl8469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__1__Impl_in_rule__Interface__Group_3__18500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__2_in_rule__Interface__Group_3__18503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Interface__Group_3__1__Impl8531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__2__Impl_in_rule__Interface__Group_3__28562 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__3_in_rule__Interface__Group_3__28565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__SystemAssignment_3_2_in_rule__Interface__Group_3__2__Impl8592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__3__Impl_in_rule__Interface__Group_3__38622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Interface__Group_3__3__Impl8650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__0__Impl_in_rule__Interface__Group_4__08689 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__1_in_rule__Interface__Group_4__08692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rule__Interface__Group_4__0__Impl8720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__1__Impl_in_rule__Interface__Group_4__18751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__2_in_rule__Interface__Group_4__18754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Interface__Group_4__1__Impl8782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__2__Impl_in_rule__Interface__Group_4__28813 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__3_in_rule__Interface__Group_4__28816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__SubAtaAssignment_4_2_in_rule__Interface__Group_4__2__Impl8843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__3__Impl_in_rule__Interface__Group_4__38873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Interface__Group_4__3__Impl8901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__0__Impl_in_rule__Interface__Group_5__08940 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__1_in_rule__Interface__Group_5__08943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rule__Interface__Group_5__0__Impl8971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__1__Impl_in_rule__Interface__Group_5__19002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__2_in_rule__Interface__Group_5__19005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Interface__Group_5__1__Impl9033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__2__Impl_in_rule__Interface__Group_5__29064 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__3_in_rule__Interface__Group_5__29067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__ResourceAssignment_5_2_in_rule__Interface__Group_5__2__Impl9094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_5__3__Impl_in_rule__Interface__Group_5__39124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Interface__Group_5__3__Impl9152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_6__0__Impl_in_rule__Interface__Group_6__09191 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_6__1_in_rule__Interface__Group_6__09194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rule__Interface__Group_6__0__Impl9222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_6__1__Impl_in_rule__Interface__Group_6__19253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group_6__2_in_rule__Interface__Group_6__19256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Interface__Group_6__1__Impl9284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_6__2__Impl_in_rule__Interface__Group_6__29315 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_6__3_in_rule__Interface__Group_6__29318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__LineNameAssignment_6_2_in_rule__Interface__Group_6__2__Impl9345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_6__3__Impl_in_rule__Interface__Group_6__39375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Interface__Group_6__3__Impl9403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_7__0__Impl_in_rule__Interface__Group_7__09442 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_7__1_in_rule__Interface__Group_7__09445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rule__Interface__Group_7__0__Impl9473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_7__1__Impl_in_rule__Interface__Group_7__19504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group_7__2_in_rule__Interface__Group_7__19507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Interface__Group_7__1__Impl9535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_7__2__Impl_in_rule__Interface__Group_7__29566 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_7__3_in_rule__Interface__Group_7__29569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__WiringLaneAssignment_7_2_in_rule__Interface__Group_7__2__Impl9596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_7__3__Impl_in_rule__Interface__Group_7__39626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Interface__Group_7__3__Impl9654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_8__0__Impl_in_rule__Interface__Group_8__09693 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_8__1_in_rule__Interface__Group_8__09696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_rule__Interface__Group_8__0__Impl9724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_8__1__Impl_in_rule__Interface__Group_8__19755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group_8__2_in_rule__Interface__Group_8__19758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Interface__Group_8__1__Impl9786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_8__2__Impl_in_rule__Interface__Group_8__29817 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_8__3_in_rule__Interface__Group_8__29820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__GrpInfoAssignment_8_2_in_rule__Interface__Group_8__2__Impl9847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_8__3__Impl_in_rule__Interface__Group_8__39877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Interface__Group_8__3__Impl9905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_9__0__Impl_in_rule__Interface__Group_9__09944 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_9__1_in_rule__Interface__Group_9__09947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rule__Interface__Group_9__0__Impl9975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_9__1__Impl_in_rule__Interface__Group_9__110006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group_9__2_in_rule__Interface__Group_9__110009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Interface__Group_9__1__Impl10037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_9__2__Impl_in_rule__Interface__Group_9__210068 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_9__3_in_rule__Interface__Group_9__210071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__RouteAssignment_9_2_in_rule__Interface__Group_9__2__Impl10098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_9__3__Impl_in_rule__Interface__Group_9__310128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Interface__Group_9__3__Impl10156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_10__0__Impl_in_rule__Interface__Group_10__010195 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_10__1_in_rule__Interface__Group_10__010198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_rule__Interface__Group_10__0__Impl10226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_10__1__Impl_in_rule__Interface__Group_10__110257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group_10__2_in_rule__Interface__Group_10__110260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Interface__Group_10__1__Impl10288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_10__2__Impl_in_rule__Interface__Group_10__210319 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_10__3_in_rule__Interface__Group_10__210322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__PwSup1Assignment_10_2_in_rule__Interface__Group_10__2__Impl10349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_10__3__Impl_in_rule__Interface__Group_10__310379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Interface__Group_10__3__Impl10407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_11__0__Impl_in_rule__Interface__Group_11__010446 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_11__1_in_rule__Interface__Group_11__010449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_rule__Interface__Group_11__0__Impl10477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_11__1__Impl_in_rule__Interface__Group_11__110508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group_11__2_in_rule__Interface__Group_11__110511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Interface__Group_11__1__Impl10539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_11__2__Impl_in_rule__Interface__Group_11__210570 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_11__3_in_rule__Interface__Group_11__210573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__EmhZone1Assignment_11_2_in_rule__Interface__Group_11__2__Impl10600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_11__3__Impl_in_rule__Interface__Group_11__310630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Interface__Group_11__3__Impl10658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_12__0__Impl_in_rule__Interface__Group_12__010697 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_12__1_in_rule__Interface__Group_12__010700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__Interface__Group_12__0__Impl10728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_12__1__Impl_in_rule__Interface__Group_12__110759 = new BitSet(new long[]{0x01FFFFFFFFFFF800L});
    public static final BitSet FOLLOW_rule__Interface__Group_12__2_in_rule__Interface__Group_12__110762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Interface__Group_12__1__Impl10790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_12__2__Impl_in_rule__Interface__Group_12__210821 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_12__3_in_rule__Interface__Group_12__210824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__IoTypeAssignment_12_2_in_rule__Interface__Group_12__2__Impl10851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_12__3__Impl_in_rule__Interface__Group_12__310881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Interface__Group_12__3__Impl10909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_13__0__Impl_in_rule__Interface__Group_13__010948 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Interface__Group_13__1_in_rule__Interface__Group_13__010951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__Interface__Group_13__0__Impl10979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_13__1__Impl_in_rule__Interface__Group_13__111010 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group_13__2_in_rule__Interface__Group_13__111013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Interface__Group_13__1__Impl11041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_13__2__Impl_in_rule__Interface__Group_13__211072 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group_13__3_in_rule__Interface__Group_13__211075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__MetricParametersAssignment_13_2_in_rule__Interface__Group_13__2__Impl11102 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Interface__Group_13__3__Impl_in_rule__Interface__Group_13__311133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Interface__Group_13__3__Impl11161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__0__Impl_in_rule__MetricParameter__Group__011200 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__1_in_rule__MetricParameter__Group__011203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__NameAssignment_0_in_rule__MetricParameter__Group__0__Impl11230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__1__Impl_in_rule__MetricParameter__Group__111260 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__2_in_rule__MetricParameter__Group__111263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__MetricParameter__Group__1__Impl11291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__2__Impl_in_rule__MetricParameter__Group__211322 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__3_in_rule__MetricParameter__Group__211325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__ValueAssignment_2_in_rule__MetricParameter__Group__2__Impl11352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricParameter__Group__3__Impl_in_rule__MetricParameter__Group__311382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__MetricParameter__Group__3__Impl11410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AssistModel__SystemNameAssignment_411456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartment_in_rule__AssistModel__CompartmentsAssignment_711487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__AssistModel__InterfacesAssignment_1011518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceGroup_in_rule__AssistModel__InterfaceGroupsAssignment_1411549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Compartment__NameAssignment_111580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Compartment__ManufacturerAssignment_3_211611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Compartment__PowerSupplyAssignment_4_211642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Compartment__SideAssignment_5_211673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Compartment__ZoneAssignment_6_211704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDC_in_rule__Compartment__RdcsAssignment_711735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_rule__Compartment__MetricParametersAssignment_8_211766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RDC__NameAssignment_111797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RDC__ManufacturerAssignment_3_211828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RDC__PowerSupplyAssignment_4_211859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RDC__RdcTypeAssignment_5_211890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RDC__EssAssignment_6_211921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_rule__RDC__ConnectorsAssignment_711952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_rule__RDC__MetricParametersAssignment_8_211983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Connector__NameAssignment_112014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvailableInterface_in_rule__Connector__AvailableInterfacesAssignment_312045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AvailableInterface__CountAssignment_012076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceType_in_rule__AvailableInterface__InterfaceTypeAssignment_212107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InterfaceGroup__NameAssignment_112138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InterfaceGroup__InterfacesAssignment_312173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InterfaceGroup__InterfacesAssignment_4_112212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_112247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Interface__SystemAssignment_3_212278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Interface__SubAtaAssignment_4_212309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Interface__ResourceAssignment_5_212340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Interface__LineNameAssignment_6_212371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Interface__WiringLaneAssignment_7_212402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Interface__GrpInfoAssignment_8_212433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Interface__RouteAssignment_9_212464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Interface__PwSup1Assignment_10_212495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Interface__EmhZone1Assignment_11_212526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceType_in_rule__Interface__IoTypeAssignment_12_212557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricParameter_in_rule__Interface__MetricParametersAssignment_13_212588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MetricParameter__NameAssignment_012619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__MetricParameter__ValueAssignment_212650 = new BitSet(new long[]{0x0000000000000002L});

}