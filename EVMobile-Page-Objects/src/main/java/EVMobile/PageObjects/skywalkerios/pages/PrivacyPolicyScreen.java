package EVMobile.PageObjects.skywalkerios.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivacyPolicyScreen extends BaseScreen {

    @FindBy(name = "URL")
    public WebElement url;

    @FindBy(name = "Done")
    public WebElement privacyPolicyDone;

    public PrivacyPolicyScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return null;
    }
}