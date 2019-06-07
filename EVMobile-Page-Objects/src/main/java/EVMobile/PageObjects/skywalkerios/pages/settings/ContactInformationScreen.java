package EVMobile.PageObjects.skywalkerios.pages.settings;

import EVMobile.PageObjects.skywalkerios.pages.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInformationScreen extends BaseScreen {

    @FindBy(name = "Settings")
    public WebElement backToSettingsButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Save")
    public WebElement saveButton;

    @FindBy(name = "Contact Information")
    public WebElement screenTitle;

    @FindBy(name = "Clear text")
    public WebElement clearTextButton;

    @FindBy(name = "Phone")
    public WebElement phoneSection;

    @FindBy(name = "Company")
    public WebElement companySection;

    ContactInformationScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return (MobileElement) screenTitle;
    }
}
