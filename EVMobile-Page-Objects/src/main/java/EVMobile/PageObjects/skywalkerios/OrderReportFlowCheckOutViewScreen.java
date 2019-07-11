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

public class OrderReportFlowCheckOutViewScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Review your order and pay")
    public WebElement pageTitle;

    @FindBy(name = "Report")
    public WebElement reportLink;

    @FindBy(name = "Delivery")
    public WebElement deliveryLink;

    @FindBy(name = "Structures")
    public WebElement structuresLink;

    @FindBy(name = "Walls Report Available")
    public WebElement addOnwallsReportLink;

    @FindBy(name = "Billing Information")
    public WebElement billingInfoSection;

    @FindBy(name = "Add Payment")
    public WebElement addPaymentLink;

    @FindBy(name = "Add Promo Code")
    public WebElement addPromoCodeLink;

    @FindBy(name = "Total")
    public WebElement totalSection;

    @FindBy(name = "Discard Order")
    public WebElement discardOrderButton;

    @FindBy(name = "Continue Placing Order")
    public WebElement continuePlacingOrderButton;

    public OrderReportFlowCheckOutViewScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnOrderReportNowbutton() throws InterruptedException {
        sleep(2000);
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(180, 750)).perform();
    }

    public OrderReportFlowCheckOutViewScreen navigateFromOrderDetailsToCheckOutScreen() throws AWTException, InterruptedException {
        OrderReportFlowOrderDetailsViewScreen orderReportFlowOrderDetailsViewScreen = new OrderReportFlowOrderDetailsViewScreen(driver);
        orderReportFlowOrderDetailsViewScreen.navigateToCheckOutScreen();
        sleep(2000);
        return new OrderReportFlowCheckOutViewScreen(driver);
    }

    public DashBoardScreen cancelDiscardOrder() throws AWTException, InterruptedException {
        navigateFromOrderDetailsToCheckOutScreen();
        sleep(2000);
        cancelButton.click();
        discardOrderButton.click();
        sleep(2000);
        return new DashBoardScreen(driver);
    }

    public void cancelContinueWithOrder() throws AWTException, InterruptedException {
        navigateFromOrderDetailsToCheckOutScreen();
        sleep(2000);
        cancelButton.click();
        continuePlacingOrderButton.click();
        sleep(2000);
    }

    public OrderReportFlowOrderDetailsViewScreen navigateBackToOrderDetailsScreen() throws AWTException, InterruptedException {
        navigateFromOrderDetailsToCheckOutScreen();
        sleep(2000);
        backButton.click();
        sleep(2000);
        return new OrderReportFlowOrderDetailsViewScreen(driver);
    }

    public OrderReportFlowScreenProductPickerViewResidential navigateToEditProductType() throws AWTException, InterruptedException {
        navigateFromOrderDetailsToCheckOutScreen();
        sleep(2000);
        reportLink.click();
        sleep(2000);
        return new OrderReportFlowScreenProductPickerViewResidential(driver);
    }

    public OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen navigateToEditDeliveryType() throws AWTException, InterruptedException {
        navigateFromOrderDetailsToCheckOutScreen();
        sleep(2000);
        deliveryLink.click();
        sleep(2000);
        return new OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen(driver);
    }

    public OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen navigateToEditStructureMeasurementType() throws AWTException, InterruptedException {
        navigateFromOrderDetailsToCheckOutScreen();
        sleep(2000);
        structuresLink.click();
        sleep(2000);
        return new OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen(driver);
    }

    public OrderReportFlowProductResidentialAddOnProductPickerScreen navigateToEditAddOnWalls() throws AWTException, InterruptedException {
        navigateFromOrderDetailsToCheckOutScreen();
        sleep(2000);
        addOnwallsReportLink.click();
        sleep(2000);
        return new OrderReportFlowProductResidentialAddOnProductPickerScreen(driver);
    }

    public OrderReportFlowBillingInformationScreen navigatetoAddPaymentScreen () throws AWTException, InterruptedException {
        navigateFromOrderDetailsToCheckOutScreen();
        sleep(2000);
        addPaymentLink.click();
        sleep(2000);
        return new OrderReportFlowBillingInformationScreen(driver);
    }

    public OrderReportFlowPromoCodeScreen navigatetoAddPromoCodeScreen () throws AWTException, InterruptedException {
        navigateFromOrderDetailsToCheckOutScreen();
        sleep(2000);
        addPromoCodeLink.click();
        sleep(2000);
        return new OrderReportFlowPromoCodeScreen(driver);
    }

    public OrderReportFlowProductResidentialOrderSubmittedScreen navigatetoOrderSubmittedScreen () throws AWTException, InterruptedException {
        navigateFromOrderDetailsToCheckOutScreen();
        sleep(2000);
        clickOnOrderReportNowbutton();
        sleep(2000);
        return new OrderReportFlowProductResidentialOrderSubmittedScreen(driver);
    }
}