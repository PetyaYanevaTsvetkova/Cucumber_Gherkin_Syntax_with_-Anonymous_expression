package stepDefinishions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;

import java.util.Map;

public class CredentialsListSteps {
    Map<String, String> credentials;

    @Given("^I have the following table with the credentialsList$")
    public void inputDataTable(DataTable credentialsList) {
        credentials = credentialsList.asMap(String.class, String.class);
    }


    @When("I have collected credentials in a Map")
    public void iHaveCollectedCredentialsInAMap() {
        System.out.println("collected credentials in Map");
    }

    @Then("print all the input values from credentialsList")
    public void printAllTheInputValuesFromCredentialsList() {
        for (Map.Entry<String, String> entry : this.credentials.entrySet()) {
            System.out.println(String.format
                    ("User %s has %s for password", entry.getKey(), entry.getValue()));
        }
    }
}
