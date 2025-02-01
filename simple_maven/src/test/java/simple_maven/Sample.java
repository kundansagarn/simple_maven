package simple_maven;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void launch() {
		Reporter.log("Sample class executed", true);
	}
}
