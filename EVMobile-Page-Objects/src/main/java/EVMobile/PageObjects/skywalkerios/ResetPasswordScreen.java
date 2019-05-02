package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class ResetPasswordScreen extends BasePage {

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


    public ResetPasswordScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        emailAddress.sendKeys(email);
    }

    public WelcomeScreen clickOnDismissButton() {
        dismiss.click();
        return new WelcomeScreen(driver);
    }

    public ResetPasswordConfirmationScreen navigateToResetPasswordConfirmationScreen() throws AWTException, InterruptedException {
        enterEmail(email);
        done.click();
        submitButton.click();
        return new ResetPasswordConfirmationScreen(driver);
    }

    public TermsofUse navigateToTermsofUseScreen() {
        termsOfUseLink.click();
        return new TermsofUse(driver);
    }

    public PrivacyPolicy navigateToPrivacyPolicyScreen() {
        privacyPolicyLink.click();
        return new PrivacyPolicy(driver);
    }
}
