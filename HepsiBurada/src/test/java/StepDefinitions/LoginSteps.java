package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    private PageObjects.Login_PO login_po;

    public LoginSteps(PageObjects.Login_PO login_po) {
        this.login_po = login_po;
    }

    @Given("I access the hepsiburada login page")
    public void iAccessTheHepsiburadaLoginPage() throws InterruptedException {
        login_po.navigateTo_Hepsiburada_Login_Page();
        Thread.sleep(2000);
    }

    @When("enter a username {}")
    public void enter_a_username(String username) throws InterruptedException {
        login_po.setUsername(username);
        Thread.sleep(2000);
    }

    @And("click on the login button")
    public void click_on_the_login_button() throws InterruptedException {
        login_po.clickOn_Login_Button();
        Thread.sleep(2000);
    }

    @And("enter a password {}")
    public void enter_a_password(String password) throws InterruptedException {
        login_po.setPassword(password);
        Thread.sleep(2000);
    }

    @Then("the my_account link button is shown")
    public void the_hesabim_link_button_is_shown() {
        login_po.validate_LoggedInSuccessfully();
    }

    @Then("the error message is shown")
    public void theErrorMessageIsShown() {
        login_po.validate_invalid_user();

    }


}
