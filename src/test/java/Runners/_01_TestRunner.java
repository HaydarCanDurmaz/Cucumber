package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature"}, // buraya feature files path i yazılıyor
        glue = {"StepDefinitions"} // buraya Stepdefinitions klosörü yazılıyor
)
public class _01_TestRunner extends AbstractTestNGCucumberTests {
}
