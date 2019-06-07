package EVMobile.PageObjects.skywalkerios.pages.order;

import EVMobile.PageObjects.skywalkerios.pages.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderReportFlowScreenPropertyLocationScreen extends BaseScreen {

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

    public OrderReportFlowScreenPropertyLocationScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    public void selectStateFromStatePicker(String optState) {
        stateField.click();
        statePickerWheel.sendKeys(optState);
    }

    public void clickOnNextButton() throws InterruptedException {
        statePickerNext.click();
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return null;
    }
}