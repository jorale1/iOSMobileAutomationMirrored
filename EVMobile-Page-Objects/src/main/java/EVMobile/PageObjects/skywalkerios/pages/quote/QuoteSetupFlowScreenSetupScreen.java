package EVMobile.PageObjects.skywalkerios.pages.quote;

import EVMobile.PageObjects.skywalkerios.pages.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuoteSetupFlowScreenSetupScreen extends BaseScreen {

    @FindBy(name = "Cross")
    public WebElement dismiss;

    @FindBy(name = "QuoteTemplateMachine")
    public WebElement quoteMachineImage;

    @FindBy(name = "Set up your base prices once, and create accurate quotes in seconds. Make changes anytime or " +
            "customize individual quotes to match the requirements of your job.")
    public WebElement guideMessage;

    @FindBy(name = "Set Up Now")
    public WebElement setUpNowButton;

    public QuoteSetupFlowScreenSetupScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return null;
    }
}
