package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", 
				glue="step_definations",
				monochrome= true
				)
public class RunnerClass extends AbstractTestNGCucumberTests {
	
}
