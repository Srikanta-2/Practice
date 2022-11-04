package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", 
				glue="step_definations",
				plugin={"html:target/cucumber-reports"}
				)
public class RunnerClass extends AbstractTestNGCucumberTests {
	
}
