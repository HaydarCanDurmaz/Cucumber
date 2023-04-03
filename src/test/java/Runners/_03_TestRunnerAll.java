package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = true // true oldugunda testi çalıştırmaz sadece feature lra
                      // ait steplerin varlıgını kontrol eder
                      // fase oldugunda ise testi ÇALIŞTIRIR
)
public class _03_TestRunnerAll extends AbstractTestNGCucumberTests {
}
