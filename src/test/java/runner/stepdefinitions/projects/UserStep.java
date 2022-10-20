package runner.stepdefinitions.projects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.projects.LoginProject;

public class UserStep {
    @Steps
    LoginProject userStep;

    @Given("Aku mengatur url untuk mengambil data user")
    public void aku_mengatur_url_untuk_mengambil_data_user() {
        userStep.setUrl();
    }
    @When("Aku meminta dengan username dan password yang valid")
    public void aku_meminta_dengan_username_dan_password_yang_valid() {
        userStep.requestWithUsernameAndPassword();
    }
    @Then("Aku akan mendapatkan code {int}")
    public void aku_akan_mendapatkan_code(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Aku bisa memakai data respon tersebut")
    public void aku_bisa_memakai_data_respon_tersebut() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Aku meminta dengan username dan password yang invalid")
    public void akuMemintaDenganUsernameDanPasswordYangInvalid() {
    }
}
