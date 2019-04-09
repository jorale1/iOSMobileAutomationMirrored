package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class SignUpFlowScreenIndustry extends BasePage {

    @FindBy(name = "signUpIndustryViewController.industry2")
    public WebElement industry2;

    @FindBy(name = "Select your industry")
    public WebElement screenName;

    @FindBy(name = "Construction")
    public WebElement constructionIndustry;

    @FindBy(name = "signUpIndustryViewController.industry4")
    public WebElement industry4;

    @FindBy(name = "Insurance")
    public WebElement insuranceIndustry;

    @FindBy(name = "Real Estate")
    public WebElement realStateIndustry;

    @FindBy(name = "Solar")
    public WebElement solarIndustry;

    @FindBy(name = "Architects & Engineering")
    public WebElement architectsAndEngineeringIndustry;

    @FindBy(name = "Other")
    public WebElement otherIndustry;

    @FindBy(name = "signUpIndustryViewController.next")
    public WebElement industryScreenNext;

    @FindBy(name = "signUpIndustryViewController.dismiss")
    public WebElement backToPasswordScreen;

    public String fname = "John";
    public String lname = "Doe";
    public String email = "test@mail.com";
    public String password = "asdfjklñ";
    public String confirmPassword = "asdfjklñ";

    public SignUpFlowScreenIndustry(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public SignUpFlowScreenIndustry navigateToIndustryScreen() throws InterruptedException {
        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames(fname, lname);
        signUpFlowScreenStart.keyboardDone.click();
        SignUpFlowScreenEmail signUpFlowScreenEmail = new SignUpFlowScreenEmail(driver);
        signUpFlowScreenEmail.enterEmail(email);
        signUpFlowScreenEmail.termsCheck.click();
        SignUpFlowScreenPassword signUpFlowScreenPassword = signUpFlowScreenEmail.navigateToSignUpPasswordScreen();
        signUpFlowScreenPassword.enterPasswordandConfirmPassword(password, confirmPassword);
        signUpFlowScreenPassword.keyboardDone.click();
        sleep(2000);
        return new SignUpFlowScreenIndustry(driver);
    }

    public SignUpFlowScreenCompany navigateToCompanyScreen() {
        industryScreenNext.click();
        return new SignUpFlowScreenCompany(driver);
    }
}