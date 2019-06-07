package EVMobile.PageObjects.skywalkerios.pages.quote;

import EVMobile.PageObjects.skywalkerios.pages.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuoteSetupFlowQuoteSettingsScreen extends BaseScreen {

    @FindBy(name = "Settings")
    public WebElement dismiss;

    @FindBy(name = "Quote Settings")
    public WebElement screenTitle;

    @FindBy(name = "Price per square")
    public WebElement pricePerSquareLink;

    @FindBy(name = "Labor Cost")
    public WebElement laborCostLink;

    @FindBy(name = "Waste Factor")
    public WebElement wasteFactorLink;

    @FindBy(name = "Items")
    public WebElement itemsLink;

    public QuoteSetupFlowQuoteSettingsScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return null;
    }
}
