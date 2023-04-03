package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.checkerframework.checker.units.qual.C;

@CucumberOptions(
        tags = "@SmokeTest", // hangi Senaryolarda bu etiket varsa çalışır
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)

public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
