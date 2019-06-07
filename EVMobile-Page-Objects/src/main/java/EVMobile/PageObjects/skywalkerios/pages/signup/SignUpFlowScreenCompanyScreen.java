package EVMobile.PageObjects.skywalkerios.pages.signup;

import EVMobile.PageObjects.skywalkerios.pages.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpFlowScreenCompanyScreen extends BaseScreen {

    @FindBy(name = "signUpCompanyViewController.dismiss")
    public WebElement backToIndustrycreen;

    @FindBy(name = "Where do you work?")
    public WebElement screenName;

    @FindBy(name = "signUpCompanyViewController.companyName")
    public WebElement companyName;

    @FindBy(name = "signUpCompanyViewController.state")
    public WebElement state;

    @FindBy(name = "signUpCompanyViewController.statePicker")
    public WebElement statePicker;

    @FindBy(className = "XCUIElementTypePickerWheel")
    public WebElement statePickerwheel;

    @FindBy(name = "signUpCompanyViewController.createAccount")
    public WebElement createAccount;

    @FindBy(name = "Done")
    public WebElement companyDone;

    @FindBy(name = "Next:")
    public WebElement keyboarddone;

    @FindBy(name = "UIAlert")
    public WebElement errorAlert;

    @FindBy(name = "A user already exists with the email address specified. Please register using a different email address.")
    public WebElement errorMessage;

    @FindBy(name = "Dismiss")
    public WebElement errorDismiss;

    public String firstName = "John";
    public String lastName = "Doe";
    public String email = "test@email.com";
    public String password = "asdfjklñ";
    public String confirmPassword = "asdfjklñ";

    public SignUpFlowScreenCompanyScreen(AppiumDriver driver, MobilePlatform platformr) {
        super(driver, platformr);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return null;
    }

    public void selectState(String enterState) {
        state.click();
        statePickerwheel.sendKeys(enterState);
        companyDone.click();
    }

    public void selectStateFromStatePicker(String optState) {
        state.click();
        statePickerwheel.sendKeys(optState);
    }

    public void signUpWithPreexistingEmail() throws InterruptedException {
        firstName = "John";
        lastName = "Q";
        email = "jorge.acosta@eagleview.com";
        password = "asdfjklñ";
        confirmPassword = "asdfjklñ";
    }

    public void signUpWithValidData() throws InterruptedException {
        firstName = "skywalker-ios-test";
        lastName = "skywalker-ios-test";
        email = "skywalker-ios-test4@mail.com";
        password = "EagleView1";
        confirmPassword = "EagleView1";
    }
}