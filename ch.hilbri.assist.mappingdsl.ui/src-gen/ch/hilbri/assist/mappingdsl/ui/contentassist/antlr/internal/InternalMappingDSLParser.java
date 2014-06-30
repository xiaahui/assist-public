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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:69:1: ruleAssistModel : ( ( rule__AssistModel__SystemNameAssignment ) ) ;
    public final void ruleAssistModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:73:2: ( ( ( rule__AssistModel__SystemNameAssignment ) ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:74:1: ( ( rule__AssistModel__SystemNameAssignment ) )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:74:1: ( ( rule__AssistModel__SystemNameAssignment ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:75:1: ( rule__AssistModel__SystemNameAssignment )
            {
             before(grammarAccess.getAssistModelAccess().getSystemNameAssignment()); 
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:76:1: ( rule__AssistModel__SystemNameAssignment )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:76:2: rule__AssistModel__SystemNameAssignment
            {
            pushFollow(FOLLOW_rule__AssistModel__SystemNameAssignment_in_ruleAssistModel94);
            rule__AssistModel__SystemNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAssistModelAccess().getSystemNameAssignment()); 

            }


            }

        }
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


    // $ANTLR start "rule__AssistModel__SystemNameAssignment"
    // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:91:1: rule__AssistModel__SystemNameAssignment : ( RULE_STRING ) ;
    public final void rule__AssistModel__SystemNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:95:1: ( ( RULE_STRING ) )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:96:1: ( RULE_STRING )
            {
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:96:1: ( RULE_STRING )
            // ../ch.hilbri.assist.mappingdsl.ui/src-gen/ch/hilbri/assist/mappingdsl/ui/contentassist/antlr/internal/InternalMappingDSL.g:97:1: RULE_STRING
            {
             before(grammarAccess.getAssistModelAccess().getSystemNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AssistModel__SystemNameAssignment133); 
             after(grammarAccess.getAssistModelAccess().getSystemNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssistModel__SystemNameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAssistModel_in_entryRuleAssistModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssistModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssistModel__SystemNameAssignment_in_ruleAssistModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AssistModel__SystemNameAssignment133 = new BitSet(new long[]{0x0000000000000002L});

}