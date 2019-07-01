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

public class OrderReportFlowProductResidentialCheckOutScreen extends BasePage {

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

    @FindBy(name = "Billing Information")
    public WebElement billingInfoSectionTitle;

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

    @FindBy(name = "Done")
    public WebElement keyboardDone;

    public OrderReportFlowProductResidentialCheckOutScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}