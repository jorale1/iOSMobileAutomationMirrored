package EVMobile.PageObjects.skywalkerios.pages.login;

import EVMobile.PageObjects.skywalkerios.pages.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResetPasswordScreen extends BaseScreen {

    @FindBy(name = "resetPasswordViewController.dismiss")
    public WebElement dismiss;

    @FindBy(name = "Logo")
    public WebElement eagelviewLogo;

    @FindBy(name = "Reset Password")
    public WebElement pageName;

    @FindBy(name = "CustomerService@EagleView.com")
    public WebElement customerServiceEmail;

    @FindBy(name = "resetPasswordViewController.email")
    public WebElement emailAddress;

    @FindBy(name = "resetPasswordViewController.submit")
    public WebElement submitButton;

    @FindBy(name = "Next:")
    public WebElement done;

    @FindBy(name = "Email unavailable")
    public WebElement emailUnavailableSimulator;

    @FindBy(name = "termsOfUse")
    public WebElement termsOfUseLink;

    @FindBy(name = "privacyPolicy")
    public WebElement privacyPolicyLink;

    public String email = "jorge.acosta@eagleview.com";

    public ResetPasswordScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return null;
    }

    public void enterEmail(String email) {
        emailAddress.sendKeys(email);
    }
}
