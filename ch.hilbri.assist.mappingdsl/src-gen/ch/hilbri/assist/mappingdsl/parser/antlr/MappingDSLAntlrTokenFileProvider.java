/*
* generated by Xtext
*/
package ch.hilbri.assist.mappingdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MappingDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("ch/hilbri/assist/mappingdsl/parser/antlr/internal/InternalMappingDSL.tokens");
	}
}
