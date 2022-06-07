package stepDefinishions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;

public class StudentsNamePrintSteps {
  private List<String> studentNames;

  @Given("^I have the following table with the studentNames$")
    public void TableWithStudentNames(List<String> studentNames) {
      this.studentNames = studentNames;
  }

    @When("I have collected students names in List")
    public void iHaveCollectedStudentsNamesInList() {
        System.out.println("collected names in List");
    }

    @Then("print all studentNames")
    public void printAllStudentNames() {
        System.out.println(this.studentNames);
    }
}
