package EVMobile.PageObjects.skywalkerios.pages.login;

import EVMobile.PageObjects.skywalkerios.pages.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.AWTException;

public class LoginScreen extends BaseScreen {

    @FindBy(name = "signInViewController.dismiss")
    public WebElement dismiss;

    @FindBy(name = "Welcome back")
    public WebElement welcomeBackGreeting;

    @FindBy(name = "signInViewController.emailAddress")
    public WebElement loginEmailAddress;

    @FindBy(name = "signInViewController.password")
    public WebElement loginPassword;

    @FindBy(name = "signInViewController.forgotPassword")
    public WebElement forgotPassword;

    @FindBy(name = "Done")
    public WebElement loginDone;

    @FindBy(name = "signInViewController.signIn")
    public WebElement login;

    // TODO The Login Screen should not know about accounts, we should create an Account Class with different scenarios
    // TODO e.g Invalid Account, Valid Account, Premium Account
    public String email = "jorge.acosta@eagleview.com";
    public String password = "EagleView1";

    public LoginScreen(IOSDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    public void enterCredentials(String email, String password) throws AWTException {
        loginEmailAddress.sendKeys(email);
        isKeyboardDisplayed();
        loginPassword.sendKeys(password);
    }



    @Override
    protected MobileElement getVisibilityElement() {
        return null;
    }
}
