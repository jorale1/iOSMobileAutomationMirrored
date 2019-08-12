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

public class OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "What structures do you want to measure?")
    public WebElement pageTitle;

    @FindBy(name = "Primary + Detached Garage")
    public WebElement primaryandDetachedGarage;

    @FindBy(name = "Primary Structure Only")
    public WebElement primaryStructureOnly;

    @FindBy(name = "All Structures on Parcel")
    public WebElement allStructureOnParcel;

    @FindBy(name = "Other (please provide instructions)")
    public WebElement otherStructures;

    @FindBy(name = "Special Instructions")
    public WebElement specialInstructions;

    @FindBy(name = "Add additional measurement instructions for our technicians")
    public WebElement specialInstructionsTextBox;

    @FindBy(name = "Discard Order")
    public WebElement discardOrderButton;

    @FindBy(name = "Continue Placing Order")
    public WebElement continuePlacingOrderButton;

    @FindBy(name = "Done")
    public WebElement keyboardDone;

    public OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnNextbutton() throws InterruptedException {
        sleep(2000);
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(295, 743)).perform();
    }

    public OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen navigateFromDeliveryProducToMeasurementstScreen() throws AWTException, InterruptedException {
        OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen = new OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen(driver);
        orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.navigateToWallsMeasurementsPickerScreen(orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.regularDeliveryOption);
        return new OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen(driver);
    }

    public DashBoardScreen cancelDiscardOrder() throws AWTException, InterruptedException {
        navigateFromDeliveryProducToMeasurementstScreen();
        sleep(2000);
        cancelButton.click();
        discardOrderButton.click();
        sleep(2000);
        return new DashBoardScreen(driver);
    }

    public void cancelContinueWithOrder() throws AWTException, InterruptedException {
        navigateFromDeliveryProducToMeasurementstScreen();
        sleep(2000);
        cancelButton.click();
        continuePlacingOrderButton.click();
        sleep(2000);
    }

    public OrderReportFlowOrderDetailsViewScreen navigateToOrderDetailsScreen(WebElement structureMeasure) throws AWTException, InterruptedException {
        navigateFromDeliveryProducToMeasurementstScreen();
        sleep(2000);
        structureMeasure.click();
        clickOnNextbutton();
        sleep(2000);
        return new OrderReportFlowOrderDetailsViewScreen(driver);
    }

    public void specialInstructionisEnabled() throws AWTException, InterruptedException {
        navigateFromDeliveryProducToMeasurementstScreen();
        sleep(2000);
        specialInstructionsTextBox.sendKeys("test");
        keyboardDone.click();
        sleep(2000);
    }

    public OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen navigateBackToDeliveryProductPickerScreen() throws AWTException, InterruptedException {
        navigateFromDeliveryProducToMeasurementstScreen();
        sleep(2000);
        backButton.click();
        sleep(2000);
        return new OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen(driver);
    }
}