package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class SignUpFlowScreenCompany extends BasePage {

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

    public SignUpFlowScreenCompany(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public SignUpFlowScreenCompany navigateToStartTest() throws InterruptedException {
        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames(firstName, lastName);
        signUpFlowScreenStart.keyboardDone.click();
        SignUpFlowScreenEmail signUpFlowScreenEmail = new SignUpFlowScreenEmail(driver);
        signUpFlowScreenEmail.enterEmail(email);
        signUpFlowScreenEmail.termsCheck.click();
        SignUpFlowScreenPassword signUpFlowScreenPassword = signUpFlowScreenEmail.navigateToSignUpPasswordScreen();
        signUpFlowScreenPassword.enterPasswordandConfirmPassword(password, confirmPassword);
        signUpFlowScreenPassword.keyboardDone.click();
        SignUpFlowScreenIndustry signUpFlowScreenIndustry = new SignUpFlowScreenIndustry(driver);
        sleep(2000);
        signUpFlowScreenIndustry.industryScreenNext.click();
        sleep(2000);
        return new SignUpFlowScreenCompany(driver);
    }

    public SignUpFlowScreenIndustry navigateBackToIndustryScreen() {
        backToIndustrycreen.click();
        return new SignUpFlowScreenIndustry(driver);
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
        navigateToStartTest();
    }

    public void signUpWithValidData() throws InterruptedException {
        firstName = "skywalker-ios-test";
        lastName = "skywalker-ios-test";
        email = "skywalker-ios-test4@mail.com";
        password = "EagleView1";
        confirmPassword = "EagleView1";
        navigateToStartTest();
    }
}