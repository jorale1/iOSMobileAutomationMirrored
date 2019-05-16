package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuoteSetupFlowScreenSetup extends BasePage {

    @FindBy(name = "Cross")
    public WebElement dismiss;

    @FindBy(name = "QuoteTemplateMachine")
    public WebElement quoteMachineImage;

    @FindBy(name = "Set up your base prices once, and create accurate quotes in seconds. Make changes anytime or customize individual quotes to match the requirements of your job.")
    public WebElement guideMessage;

    @FindBy(name = "Set Up Now")
    public WebElement setUpNowButton;

    public QuoteSetupFlowScreenSetup(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
