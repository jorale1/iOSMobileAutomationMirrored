package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPasswordConfirmationScreen extends BasePage {

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

    public ResetPasswordConfirmationScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ResetPasswordScreen clickOnDismissButton() {
        dismiss.click();
        return new ResetPasswordScreen(driver);
    }

    public ExternalMessageScreen navigateToExternalMessageScreen() {
        contactPhone.click();
        return new ExternalMessageScreen(driver);
    }

    public ResetPasswordScreen navigateBackToResetPassword() {
        clickOnDismissButton();
        return new ResetPasswordScreen(driver);
    }

    public TermsofUse navigateToTermsofUseScreen() {
        confirmationTermsOfUseLink.click();
        return new TermsofUse(driver);
    }

    public PrivacyPolicy navigateToPrivacyPolicyScreen() {
        confirmationPrivacyPolicyLink.click();
        return new PrivacyPolicy(driver);
    }
}
