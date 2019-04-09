package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpFlowScreenEmail extends BasePage {

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

    public SignUpFlowScreenEmail(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public TermsofUse navigateToTermsofUsescreen() {
        termsLink.click();
        return new TermsofUse(driver);
    }

    public PrivacyPolicy navigateToPrivacyPolicyScreen() {
        privacyPolicyLink.click();
        return new PrivacyPolicy(driver);
    }

    public SignUpFlowScreenPassword navigateToSignUpPasswordScreen() {
        page2next.click();
        return new SignUpFlowScreenPassword(driver);
    }
}