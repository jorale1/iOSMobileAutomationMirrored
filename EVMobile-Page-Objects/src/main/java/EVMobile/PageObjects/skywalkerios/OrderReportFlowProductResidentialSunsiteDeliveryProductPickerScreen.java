package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import EVMobile.PageObjects.skywalkerios.dashboard.DashBoardScreen;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

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

    public OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen navigateFromNoAddOnToDeliveryProductScreen() throws AWTException, InterruptedException {
        OrderReportFlowProductResidentialAddOnProductPickerScreen orderReportFlowProductResidentialAddOnProductPickerScreen = new OrderReportFlowProductResidentialAddOnProductPickerScreen(driver);
        orderReportFlowProductResidentialAddOnProductPickerScreen.navigateToDeliveryProductPickerScreen();
        return new OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen(driver);
    }

    public DashBoardScreen cancelDiscardOrder() throws AWTException, InterruptedException {
        navigateFromNoAddOnToDeliveryProductScreen();
        sleep(2000);
        cancelButton.click();
        discardOrderButton.click();
        sleep(2000);
        return new DashBoardScreen(driver);
    }

    public void cancelContinueWithOrder() throws AWTException, InterruptedException {
        navigateFromNoAddOnToDeliveryProductScreen();
        sleep(2000);
        cancelButton.click();
        continuePlacingOrderButton.click();
        sleep(2000);
    }

    public OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen navigateToWallsMeasurementsPickerScreen(WebElement deliveryOption) throws AWTException, InterruptedException {
        navigateFromNoAddOnToDeliveryProductScreen();
        sleep(2000);
        deliveryOption.click();
        clickOnNextbutton();
        sleep(2000);
        return new OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen(driver);
    }

    public OrderReportFlowProductResidentialAddOnProductPickerScreen navigateBackToProductResidentialAddOnScreen() throws AWTException, InterruptedException {
        navigateFromNoAddOnToDeliveryProductScreen();
        sleep(2000);
        backButton.click();
        sleep(2000);
        return new OrderReportFlowProductResidentialAddOnProductPickerScreen(driver);
    }
}