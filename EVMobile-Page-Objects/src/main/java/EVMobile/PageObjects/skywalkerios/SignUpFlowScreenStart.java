package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.*;

public class SignUpFlowScreenStart extends BasePage {

    @FindBy(name = "signUpNameViewController.dismiss")
    public WebElement dismissButton;

    @FindBy(name = "Let's get started")
    public WebElement startMessage;

    @FindBy(name = "signUpNameViewController.firstName")
    public WebElement firstName;

    @FindBy(name = "signUpNameViewController.lastName")
    public WebElement lastName;

    @FindBy(name = "Log In")
    public WebElement loginLink;

    @FindBy(name = "signUpNameViewController.next")
    public WebElement nextButton;

    @FindBy(name = "Next:")
    public WebElement keyboardDone;

    public SignUpFlowScreenStart(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterNames(String fname, String lname) {
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
    }

    public LoginScreen navigateToLoginScreen() throws AWTException {
        enterNames("jhon", "Doe");
        loginLink.click();
        return new LoginScreen(driver);
    }

    public SignUpFlowScreenEmail navigateToSignupEmailScreen() throws AWTException {
        keyboardDone.click();
        return new SignUpFlowScreenEmail(driver);
    }

    public WelcomeScreen navigateBackToWelcomePage() throws AWTException {
        dismissButton.click();
        return new WelcomeScreen(driver);
    }
}