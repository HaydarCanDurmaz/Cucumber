package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
            dc.clickFunction(dc.addButton);
            dc.sendKeysFunction(dc.nameInput,"Almanyaa");
            dc.sendKeysFunction(dc.codeInput,"3436");
            dc.clickFunction(dc.saveButton);

        }

        @Then("Success message should be displayed")
        public void successMessageShouldBeDisplayed() {

        }
    }



