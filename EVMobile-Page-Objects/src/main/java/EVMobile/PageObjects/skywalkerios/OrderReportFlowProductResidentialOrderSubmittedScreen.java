package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderReportFlowProductResidentialOrderSubmittedScreen extends BasePage {

    @FindBy(name = "Check40")
    public WebElement checkIcon;

    @FindBy(name = "Thank you for your order.")
    public WebElement pageTitle;

    @FindBy(name = "An order confirmation has been sent to your email")
    public WebElement pageSubtitle;

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

    public OrderReportFlowProductResidentialOrderSubmittedScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}