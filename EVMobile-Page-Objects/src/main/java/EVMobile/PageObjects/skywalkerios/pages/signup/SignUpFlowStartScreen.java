package EVMobile.PageObjects.skywalkerios.pages.signup;

import EVMobile.PageObjects.skywalkerios.pages.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpFlowStartScreen extends BaseScreen {

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

    public SignUpFlowStartScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    public void enterNames(String fname, String lname) {
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return null;
    }
}