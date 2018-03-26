package ch.hilbri.assist.scheduling.tests.basics;

import ch.hilbri.assist.scheduling.tests.AbstractSchedulingTest;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class ExampleTests extends AbstractSchedulingTest {
  @Test
  public void exampleSpecFileTest() {
    try {
      final URL pathURL = ExampleTests.class.getProtectionDomain().getCodeSource().getLocation();
      String _file = pathURL.getFile();
      final URI pathURI = new File(_file).toURI();
      final Path path = Paths.get(pathURI);
      int _nameCount = path.getNameCount();
      int _minus = (_nameCount - 3);
      final Path subPath = path.subpath(0, _minus);
      final Path finalPath = Paths.get(path.getRoot().toString(), subPath.toString(), 
        "ch.hilbri.assist.scheduling/resources/example.sdsl");
      this.logger.debug(("Example file loaded from: " + finalPath));
      byte[] _readAllBytes = Files.readAllBytes(finalPath);
      final String input = new String(_readAllBytes);
      final Resource r = this.resourceHelper.resource(input);
      Assert.assertEquals("There should be 0 errors in the mdsl file", 0, r.getErrors().size());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
