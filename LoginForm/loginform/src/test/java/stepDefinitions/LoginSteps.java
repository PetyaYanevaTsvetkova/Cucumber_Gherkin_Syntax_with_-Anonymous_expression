package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("print {string}")
    public void printWelcomeMessage(String welcomeMessage) {
        System.out.println(welcomeMessage);
    }

    @When("I fill the account username textBox with value {string}")
    public void iFillTheAccountUsernameTextBoxWithValueIncorrectUsername(String username) {
        System.out.println(String.format("the username %s has been entered", username));
    }

    @And("I fill the password textBox with value {string}")
    public void iFillThePasswordTextBoxWithValueIncorrectPassword(String password) {
        System.out.println("the password has been entered");
    }

    @And("click the login button")
    public void clickTheLoginButton() {
        System.out.println("Submit");
    }

    @Then("output message appears {string}")
    public void outputMessageAppears(String message) {
        System.out.println(message);
    }
}
