package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/java/features",
			glue = "stepDefinations",tags="@SeleniumTest",
					plugin= {"pretty","html:target/cucumber","json:target/cucumber.json", "junit:target/cukes.xml"})	
			
			//glue = "stepDefinations",tags="@SeleniumTest",dryRun = true, monochrome = true, strict = true,
			//plugin= {"pretty","html:target/cucumber","json:target/cucumber.json", "junit:target/cukes.xml"})
	
	public class TestRunner {
		
	 

}
