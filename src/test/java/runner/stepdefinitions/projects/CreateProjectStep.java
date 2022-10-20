package runner.stepdefinitions.projects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.projects.CreateProject;

public class CreateProjectStep {
    @Steps
    CreateProject createProject;

    @Given("I set url and valid token to create project")
    public void iSetUrlAndValidTokenToCreateProject() {
        createProject.setUrlAndValidToken();
    }

    @When("I request with valid name")
    public void iRequestWithValidName() {
        createProject.requestWithValidName();
    }

    @And("I can verify the detail response")
    public void iCanVerifyTheDetailResponse() {
        createProject.verifyDetailResponse();
    }

    @When("I request with valid name, color, favorite")
    public void iRequestWithValidNameColorFavorite() {
        createProject.requestWithValidNameColorFavorite();
    }

    @And("I verify the color and favorite")
    public void iVerifyTheColorAndFavorite() {
        createProject.verifyColorAndFavorite();
    }

    @Then("I will get {int}")
    public void iWillGet(int arg0) {

    }
}
