package EVMobile.PageObjects.skywalkerios.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExternalMessageScreen extends BaseScreen {

    @FindBy(name = "What’s New in Messages")
    public WebElement screenTitle;

    ExternalMessageScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return (MobileElement) screenTitle;
    }
}
