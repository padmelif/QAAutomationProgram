package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.GlobalVariables;

public class Login_PO extends Base_PO {
    private @FindBy(id = "txtUserName") WebElement username_TextField;

    private @FindBy(id = "txtPassword") WebElement password_TextField;

    private @FindBy(id = "btnLogin") WebElement login_Button;

    private @FindBy(css = "data-test-id=\"account\"") WebElement my_account;

    private @FindBy(xpath = "//div[@type=\"ERROR\"]") WebElement error_message;

    public Login_PO() {
        super();
    }

    public void navigateTo_Hepsiburada_Login_Page() {
        navigateTo_URL(GlobalVariables.HEPSIBURADA_HOMEPAGE_URL );
    }

    public void setUsername(String username) {
        sendKeys(username_TextField, username);
    }

    public void setPassword(String password) {
        sendKeys(password_TextField, password);
    }

    public void clickOn_Login_Button() {
        waitForWebElementAndClick(login_Button);
    }

    public void validate_LoggedInSuccessfully() {
        Assert.assertEquals(true, isDisplayedElement(my_account));
    }

    public void validate_invalid_user() {
        Assert.assertEquals(true, isDisplayedElement(error_message));
    }


}
