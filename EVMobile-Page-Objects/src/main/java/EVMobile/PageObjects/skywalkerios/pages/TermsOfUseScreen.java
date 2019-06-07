package EVMobile.PageObjects.skywalkerios.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TermsOfUseScreen extends BaseScreen {

    @FindBy(name = "URL")
    public WebElement TermsUrl;

    @FindBy(name = "Done")
    public WebElement termsDone;

    public TermsOfUseScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return null;
    }
}