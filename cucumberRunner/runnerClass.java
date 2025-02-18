package cucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/cucumberFeatures/Login.feature",glue="stepsCucumber",monochrome = true, publish = true)
public class runnerClass extends AbstractTestNGCucumberTests{

}