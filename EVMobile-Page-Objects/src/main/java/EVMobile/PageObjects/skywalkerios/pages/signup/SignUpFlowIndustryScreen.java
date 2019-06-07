package EVMobile.PageObjects.skywalkerios.pages.signup;

import EVMobile.PageObjects.skywalkerios.pages.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpFlowIndustryScreen extends BaseScreen {

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

    public SignUpFlowIndustryScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return null;
    }
}