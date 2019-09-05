package EVMobile.PageObjects.skywalkerios.reportDetails;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PremiumReportOrderDetailsScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backToSettingsButton;

    @FindBy(name = "Order Details")
    public WebElement screenTitle;

    @FindBy(name = "Report #")
    public WebElement reportNumber;

    @FindBy(name = "Property Type")
    public WebElement propertyType;

    @FindBy(name = "Structures")
    public WebElement structures;

    @FindBy(name = "Delivery")
    public WebElement delivery;

    @FindBy(name = "Placed")
    public WebElement placed;

    @FindBy(name = "Completed")
    public WebElement completed;

    public PremiumReportOrderDetailsScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
