package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", 
				glue="step_definat8082ions",
				tags="@tag1",
				monochrome= true,
				plugin={"html:target/cucumber-reports"}
				)
public class RunnerClass extends AbstractTestNGCucumberTests {
	
}
