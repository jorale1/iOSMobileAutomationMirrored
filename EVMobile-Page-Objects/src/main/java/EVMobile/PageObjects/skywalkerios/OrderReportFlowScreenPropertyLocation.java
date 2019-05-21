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
    public WebElement statePickerwheel;

    @FindBy(name = "Next")
    public WebElement statePickerNext;

    @FindBy(name = "Discard Order")
    public WebElement discardOrderButton;

    @FindBy(name = "Continue Placing Order")
    public WebElement continuePlacingOrderButton;

    @FindBy(name = "signUpNameViewController.next")
    public WebElement nextButton;

    @FindBy(name = "Next:")
    public WebElement keyboardDone;

    public OrderReportFlowScreenPropertyLocation(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public OrderReportFlowScreenPropertyLocation navigateToStartOrderReport() throws AWTException, InterruptedException {
        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        sleep(1000);
        DashBoardScreen dashBoardScreen = loginscreen.navigateToDashboard();
        sleep(2000);
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(170, 755)).perform();
        sleep(2000);
        return new OrderReportFlowScreenPropertyLocation(driver);
    }

    public DashBoardScreen navigateBackToDashboardScreen() throws AWTException, InterruptedException {
        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        sleep(1000);
        DashBoardScreen dashBoardScreen = loginscreen.navigateToDashboard();
        sleep(2000);
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = dashBoardScreen.navigateToOrderReportPropertyLocationScreen();
        sleep(2000);
        cancelButton.click();
        discardOrderButton.click();
        return new DashBoardScreen(driver);
    }
}