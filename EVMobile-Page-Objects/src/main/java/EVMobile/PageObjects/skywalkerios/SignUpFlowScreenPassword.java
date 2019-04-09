package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpFlowScreenPassword extends BasePage {

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

    public SignUpFlowScreenPassword(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterPasswordandConfirmPassword(String password, String confirmPassword) {
        signUpPassword.sendKeys(password);
        signUpPasswordConfirm.sendKeys(confirmPassword);
    }

    public SignUpFlowScreenEmail navigateBackToEmailScreen() {
        backToEmailScreen.click();
        return new SignUpFlowScreenEmail(driver);
    }

    public SignUpFlowScreenPassword navigateToSelectIndustryScreen() {
        passwordScreenNext.click();
        return new SignUpFlowScreenPassword(driver);
    }
}