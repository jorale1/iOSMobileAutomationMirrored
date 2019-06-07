package EVMobile.PageObjects.skywalkerios.pages.login;

import EVMobile.PageObjects.skywalkerios.pages.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResetPasswordConfirmationScreen extends BaseScreen {

    @FindBy(name = "resetPasswordViewController.dismiss")
    public WebElement dismiss;

    @FindBy(name = "Logo")
    public WebElement confirmationEVLogo;

    @FindBy(name = "Success")
    public WebElement screenTitle;

    @FindBy(name = "resetPasswordConfirmationViewController.footerText")
    public WebElement successMessage;

    @FindBy(name = "1-866-659-8439")
    public WebElement contactPhone;

    @FindBy(name = "termsOfUse")
    public WebElement confirmationTermsOfUseLink;

    @FindBy(name = "privacyPolicy")
    public WebElement confirmationPrivacyPolicyLink;

    public ResetPasswordConfirmationScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return null;
    }
}
