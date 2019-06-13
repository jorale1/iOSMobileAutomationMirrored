package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class OrderReportFlowProductResidentialAddOnProductPickerScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Would you like to add another report?")
    public WebElement pageTitle;

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
}