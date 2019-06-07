package EVMobile.PageObjects.skywalkerios.pages.signup;

import EVMobile.PageObjects.skywalkerios.pages.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpFlowPasswordScreen extends BaseScreen {

    @FindBy(name = "signUpPasswordViewController.dismiss")
    public WebElement backToEmailScreen;

    @FindBy(name = "signUpPasswordViewController.password")
    public WebElement signUpPassword;

    @FindBy(name = "signUpPasswordViewController.passwordConfirmation")
    public WebElement signUpPasswordConfirm;

    @FindBy(name = "signUpPasswordViewController.next")
    public WebElement passwordScreenNext;

    @FindBy(name = "Next:")
    public WebElement keyboardDone;

    public SignUpFlowPasswordScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    public void enterPasswordandConfirmPassword(String password, String confirmPassword) {
        signUpPassword.sendKeys(password);
        signUpPasswordConfirm.sendKeys(confirmPassword);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return null;
    }
}