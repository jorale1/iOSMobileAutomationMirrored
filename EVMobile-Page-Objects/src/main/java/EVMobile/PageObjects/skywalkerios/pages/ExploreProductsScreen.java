package EVMobile.PageObjects.skywalkerios.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExploreProductsScreen extends BaseScreen {

    @FindBy(name = "Done")
    public WebElement doneButton;

    @FindBy(name = "EAGLEVIEW APP")
    public WebElement eagleViewApp;

    @FindBy(name = "URL")
    public WebElement url;

    @FindBy(name = "ReloadButton")
    public WebElement reloadButton;

    @FindBy(name = "SITE MENU")
    public WebElement siteMenu;

    ExploreProductsScreen(IOSDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        // TODO This method has to be implemented
        return null;
    }
}
