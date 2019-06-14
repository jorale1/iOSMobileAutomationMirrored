package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class OrderReportFlowProductResidentialMeasurementScopePickerScreen extends BasePage {

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

    @FindBy(name = "Special Instructions")
    public WebElement specialInstructions;

    @FindBy(name = "Add additional measurement instructions for our technicians")
    public WebElement specialInstructionsTextBox;

    @FindBy(name = "Discard Order")
    public WebElement discardOrderButton;

    @FindBy(name = "Continue Placing Order")
    public WebElement continuePlacingOrderButton;

    public OrderReportFlowProductResidentialMeasurementScopePickerScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnNextbutton() throws InterruptedException {
        sleep(2000);
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(295, 743)).perform();
    }
}