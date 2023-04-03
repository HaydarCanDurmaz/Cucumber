package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav ln = new LeftNav();

    DialogContent dc= new DialogContent();

        @And("Navigate to country page")
        public void navigateToCountry() {
            ln.clickFunction(ln.setup);
            ln.clickFunction(ln.parameters);
            ln.clickFunction(ln.countries);


        }

        @When("create a country")
        public void createACountry() {

            String ulkeAdi= RandomStringUtils.randomAlphanumeric(8);// 8 harf
            String ulkeKodu =RandomStringUtils.randomNumeric(4);// 4 rakam

            dc.clickFunction(dc.addButton);
            dc.sendKeysFunction(dc.nameInput,ulkeAdi);
            dc.sendKeysFunction(dc.codeInput,ulkeKodu);
            dc.clickFunction(dc.saveButton);

        }

        @Then("Success message should be displayed")
        public void successMessageShouldBeDisplayed() {
dc.verifyContainsTextFunction(dc.successMessage, "success");
        }

    @When("create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String code) {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.codeInput,code);
        dc.clickFunction(dc.saveButton);
    }
}



