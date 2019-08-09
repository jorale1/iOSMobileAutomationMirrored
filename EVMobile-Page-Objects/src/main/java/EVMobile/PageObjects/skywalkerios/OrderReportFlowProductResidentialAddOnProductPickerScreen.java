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

public class OrderReportFlowProductResidentialAddOnProductPickerScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Would you like to add another report?")
    public WebElement pageTitle;

    @FindBy(name = "Select add-on")
    public WebElement editPageTitle;

    @FindBy(name = "No Add-on Report")
    public WebElement noAddOnReport;

    @FindBy(name = "Walls")
    public WebElement wallsAddOn;

    @FindBy(name = "+ $70")
    public WebElement wallsAddOnPrice;
    @FindBy(name = "• 3D wall area diagram • Window and door diagram • Elevation by cardinal direction • 5 aerial images of the structure")
    public WebElement wallsAddOnDetails;

    @FindBy(name = "Discard Order")
    public WebElement discardOrderButton;

    @FindBy(name = "Continue Placing Order")
    public WebElement continuePlacingOrderButton;

    public OrderReportFlowProductResidentialAddOnProductPickerScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnNextbutton() throws InterruptedException {
        sleep(2000);
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(295, 743)).perform();
    }

    public OrderReportFlowProductResidentialAddOnProductPickerScreen navigateToSelectAddOnScreen() throws AWTException, InterruptedException {
        OrderReportFlowScreenProductPickerViewResidential orderReportFlowScreenProductPickerViewResidential = new OrderReportFlowScreenProductPickerViewResidential(driver);
        orderReportFlowScreenProductPickerViewResidential.navigateToAddOnProductPickerScreen();
        return new OrderReportFlowProductResidentialAddOnProductPickerScreen(driver);
    }

    public DashBoardScreen cancelDiscardOrder() throws AWTException, InterruptedException {
        navigateToSelectAddOnScreen();
        sleep(2000);
        cancelButton.click();
        discardOrderButton.click();
        sleep(2000);
        return new DashBoardScreen(driver);
    }

    public void cancelContinueWithOrder() throws AWTException, InterruptedException {
        navigateToSelectAddOnScreen();
        sleep(2000);
        cancelButton.click();
        continuePlacingOrderButton.click();
        sleep(2000);
    }

    public OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen navigateToDeliveryProductPickerScreen() throws AWTException, InterruptedException {
        navigateToSelectAddOnScreen();
        sleep(2000);
        clickOnNextbutton();
        sleep(2000);
        return new OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen(driver);
    }

    public OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen navigateToMeasurementScopePickerScreen() throws AWTException, InterruptedException {
        navigateToSelectAddOnScreen();
        sleep(2000);
        wallsAddOn.click();
        clickOnNextbutton();
        sleep(2000);
        return new OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen(driver);
    }

    public OrderReportFlowScreenProductPickerViewResidential navigateBackToProductPickerResidentialScreen() throws AWTException, InterruptedException {
        navigateToSelectAddOnScreen();
        sleep(2000);
        backButton.click();
        sleep(2000);
        return new OrderReportFlowScreenProductPickerViewResidential(driver);
    }
}