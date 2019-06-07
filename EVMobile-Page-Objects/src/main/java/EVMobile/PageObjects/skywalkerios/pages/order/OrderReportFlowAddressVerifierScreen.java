package EVMobile.PageObjects.skywalkerios.pages.order;

import EVMobile.PageObjects.skywalkerios.pages.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderReportFlowAddressVerifierScreen extends BaseScreen {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Is the pin in the right place?")
    public WebElement pageTitle;

    @FindBy(name = "If not, drag the map to center the pin on the structure.")
    public WebElement pageInstructions;

    @FindBy(name = "Legal")
    public WebElement legalLink;

    @FindBy(name = "Confirm")
    public WebElement confirmButton;

    public OrderReportFlowAddressVerifierScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return null;
    }
}