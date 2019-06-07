package EVMobile.PageObjects.skywalkerios.pages.signup;

import EVMobile.PageObjects.skywalkerios.pages.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpFlowEmailScreen extends BaseScreen {

    @FindBy(name = "signUpNameViewController.dismiss")
    public WebElement backButton;

    @FindBy(name = "signUpEmailViewController.email")
    public WebElement emailField;

    @FindBy(name = "signUpEmailViewController.terms")
    public WebElement termsCheck;

    @FindBy(name = "Terms of Use")
    public WebElement termsLink;

    @FindBy(name = "Privacy Policy")
    public WebElement privacyPolicyLink;

    @FindBy(name = "signUpEmailViewController.next")
    public WebElement page2next;

    @FindBy(name = "Next:")
    public WebElement done;

    public SignUpFlowEmailScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return null;
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }
}