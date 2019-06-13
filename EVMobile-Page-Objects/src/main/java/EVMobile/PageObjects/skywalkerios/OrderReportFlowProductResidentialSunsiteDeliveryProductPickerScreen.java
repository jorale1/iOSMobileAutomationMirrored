package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Select your delivery option")
    public WebElement pageTitle;

    @FindBy(name = "Regular")
    public WebElement regularDeliveryOption;

    @FindBy(name = "Included")
    public WebElement regularDeliveryIncluded;

    @FindBy(name = "48 hours or less")
    public WebElement regularDeliveryTime;

    @FindBy(name = "Express")
    public WebElement expressDelivery;

    @FindBy(name = "+ $30")
    public WebElement expressDeliveryPrice;

    @FindBy(name = "12 hours or less")
    public WebElement expressDeliveryTime;

    @FindBy(name = "3 Hour")
    public WebElement hour3Delivery;

    @FindBy(name = "+ $40")
    public WebElement hour3DeliveryPrice;

    @FindBy(name = "The three hour delivery time (during business hours) starts once the structure has been identified")
    public WebElement hour3DeliveryTime;

    @FindBy(name = "Discard Order")
    public WebElement discardOrderButton;

    @FindBy(name = "Continue Placing Order")
    public WebElement continuePlacingOrderButton;

    public OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnNextbutton() throws InterruptedException {
        sleep(2000);
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(295, 743)).perform();
    }
}