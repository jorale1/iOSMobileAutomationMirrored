package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

import static java.lang.Thread.sleep;

public class OrderReportFlowOrderDetailsViewScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Any additional information you’d like to add?")
    public WebElement pageTitle;

    @FindBy(name = "Photos")
    public WebElement photosLink;

    @FindBy(name = "Claim Information")
    public WebElement claimInformationLink;

    @FindBy(name = "Email Recipients")
    public WebElement emailRecipientsLink;

    @FindBy(name = "Project Name")
    public WebElement projectNameLink;

    @FindBy(name = "Building ID")
    public WebElement buildingIDLink;

    @FindBy(name = "Discard Order")
    public WebElement discardOrderButton;

    @FindBy(name = "Continue Placing Order")
    public WebElement continuePlacingOrderButton;

    public OrderReportFlowOrderDetailsViewScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnNextbutton() throws InterruptedException {
        sleep(2000);
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(295, 743)).perform();
    }

    public OrderReportFlowOrderDetailsViewScreen navigateFromMeasurementPickerToOrderDetailsScreen() throws AWTException, InterruptedException {
        OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen orderReportFlowProductResidentialWallsMeasurementScopePickerScreen = new OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen(driver);
        orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.navigateToOrderDetailsScreen(orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.primaryandDetachedGarage);
        return new OrderReportFlowOrderDetailsViewScreen(driver);
    }

    public DashBoardScreen cancelDiscardOrder() throws AWTException, InterruptedException {
        navigateFromMeasurementPickerToOrderDetailsScreen();
        sleep(2000);
        cancelButton.click();
        discardOrderButton.click();
        sleep(2000);
        return new DashBoardScreen(driver);
    }

    public void cancelContinueWithOrder() throws AWTException, InterruptedException {
        navigateFromMeasurementPickerToOrderDetailsScreen();
        sleep(2000);
        cancelButton.click();
        continuePlacingOrderButton.click();
        sleep(2000);
    }

    public OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen navigateBackToMeasurementScopePickerScreen() throws AWTException, InterruptedException {
        navigateFromMeasurementPickerToOrderDetailsScreen();
        sleep(2000);
        backButton.click();
        sleep(2000);
        return new OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen(driver);
    }

    public OrderReportFlowProductResidentialCheckOutScreen navigateToCheckOutScreen() throws AWTException, InterruptedException {
        navigateFromMeasurementPickerToOrderDetailsScreen();
        sleep(2000);
        clickOnNextbutton();
        sleep(2000);
        return new OrderReportFlowProductResidentialCheckOutScreen(driver);
    }

    public OrderReportFlowOrderDetailsPhotosScreen navigateToPhotosScreen() throws AWTException, InterruptedException {
        navigateFromMeasurementPickerToOrderDetailsScreen();
        sleep(2000);
        photosLink.click();
        sleep(2000);
        return new OrderReportFlowOrderDetailsPhotosScreen(driver);
    }

    public OrderReportFlowOrderDetailsClaimInfoScreen navigateToClaimInformationScreen() throws AWTException, InterruptedException {
        navigateFromMeasurementPickerToOrderDetailsScreen();
        sleep(2000);
        claimInformationLink.click();
        sleep(2000);
        return new OrderReportFlowOrderDetailsClaimInfoScreen(driver);
    }

    public OrderReportFlowOrderDetailsEmailRecipientsScreen navigateToEmailRecipientsScreen() throws AWTException, InterruptedException {
        navigateFromMeasurementPickerToOrderDetailsScreen();
        sleep(2000);
        emailRecipientsLink.click();
        sleep(2000);
        return new OrderReportFlowOrderDetailsEmailRecipientsScreen(driver);
    }

    public OrderReportFlowOrderDetailsProjectNameScreen navigateToProjectNameScreen() throws AWTException, InterruptedException {
        navigateFromMeasurementPickerToOrderDetailsScreen();
        sleep(2000);
        projectNameLink.click();
        sleep(2000);
        return new OrderReportFlowOrderDetailsProjectNameScreen(driver);
    }

    public OrderReportFlowOrderDetailsBuildingIDScreen navigateToBuildingIDScreen() throws AWTException, InterruptedException {
        navigateFromMeasurementPickerToOrderDetailsScreen();
        sleep(2000);
        buildingIDLink.click();
        sleep(2000);
        return new OrderReportFlowOrderDetailsBuildingIDScreen(driver);
    }
}