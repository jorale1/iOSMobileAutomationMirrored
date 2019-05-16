package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuoteSetupFlowScreenQuoteSettings extends BasePage {

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

    public QuoteSetupFlowScreenQuoteSettings(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
