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

public class OrderReportFlowScreenPropertyLocation extends BasePage {

    @FindBy(name = "addressPicker.button.cancel")
    public WebElement cancelButton;

    @FindBy(name = "Where is the property located?")
    public WebElement pageTitle;

    @FindBy(name = "addressPicker.button.location")
    public WebElement currentLocationButton;

    @FindBy(name = "addressPicker.textField.street")
    public WebElement streetField;

    @FindBy(name = "addressPicker.textField.city")
    public WebElement cityField;

    @FindBy(name = "addressPicker.textField.state")
    public WebElement stateField;

    @FindBy(name = "addressPicker.textField.zip")
    public WebElement zipCodeField;

    @FindBy(className = "XCUIElementTypePickerWheel")
    public WebElement statePickerWheel;

    @FindBy(name = "Next")
    public WebElement statePickerNext;

    @FindBy(name = "Discard Order")
    public WebElement discardOrderButton;

    @FindBy(name = "Continue Placing Order")
    public WebElement continuePlacingOrderButton;

    @FindBy(name = "signUpNameViewController.next")
    public WebElement nextButton;

    @FindBy(name = "Done")
    public WebElement keyboardDone;

    @FindBy(name = "Allow “EagleView” to access your location while you are using the app?")
    public WebElement systemAllowLocationAccess;

    @FindBy(name = "Don’t Allow")
    public WebElement systemLocationDontAllow;

    @FindBy(name = "Allow")
    public WebElement systemLocationAllow;

    public String validStreetUS;
    public String cityUS;
    public String validZipUS;
    public String validStateUS;

    public OrderReportFlowScreenPropertyLocation(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public OrderReportFlowScreenPropertyLocation navigateToStartOrderReport() throws AWTException, InterruptedException {
        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        sleep(2000);
        DashBoardScreen dashBoardScreen = loginscreen.navigateToDashboard();
        sleep(2000);
        dashBoardScreen.navigateToOrderReportPropertyLocationScreen();
        sleep(2000);
        return new OrderReportFlowScreenPropertyLocation(driver);
    }

    public DashBoardScreen navigateBackToDashboardScreen() throws AWTException, InterruptedException {
        navigateToStartOrderReport();
        sleep(2000);
        cancelButton.click();
        discardOrderButton.click();
        return new DashBoardScreen(driver);
    }

    public void allowLocationAccesModal() throws InterruptedException, AWTException {
        navigateToStartOrderReport();
        sleep(2000);
        currentLocationButton.click();
    }

    public void enterLocation(String validStreetUS, String cityUS, String validStateUS, String validZipUS) throws AWTException, InterruptedException {
        navigateToStartOrderReport();
        sleep(2000);
        streetField.sendKeys(validStreetUS);
        cityField.sendKeys(cityUS);
        selectStateFromStatePicker(validStateUS);
        zipCodeField.sendKeys(validZipUS);
    }

    public void selectStateFromStatePicker(String optState) {
        stateField.click();
        statePickerWheel.sendKeys(optState);
    }

    public void clickOnNextbutton() throws InterruptedException {
        sleep(2000);
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(295, 743)).perform();
    }
}