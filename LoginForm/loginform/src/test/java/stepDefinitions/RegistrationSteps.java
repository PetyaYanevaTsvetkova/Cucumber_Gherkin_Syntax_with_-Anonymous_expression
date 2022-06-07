package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
    @Given("print home {string}")
    public void printRegistrationWelcomeMessage(String arg) {
        System.out.println(arg);
    }

    @When("I fill the all mandatory fields for creating the registration")
    public void iFillTheAllMandatoryFieldsForCreatingTheRegistration() {
        System.out.println("All mandatory fields are filled");
    }

    @Then("a message appears {string}")
    public void aMessageAppears(String message) {
        System.out.println(message);
    }

    @When("I fill the all mandatory and optional fields for creating the registration")
    public void iFillTheAllMandatoryAndOptionalFieldsForCreatingTheRegistration() {
        System.out.println("All mandatory and optional fields are filled");
    }

    @When("I don't fill the all mandatory and optional fields for creating the registration")
    public void iDonTFillTheAllMandatoryAndOptionalFieldsForCreatingTheRegistration() {
        System.out.println("Mandatory and optional fields are not filled");
    }

}
