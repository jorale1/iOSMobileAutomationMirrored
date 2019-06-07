package EVMobile.PageObjects.skywalkerios.pages.dashboard;

import EVMobile.PageObjects.skywalkerios.pages.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardScreen extends BaseScreen {

    @FindBy(name = "EagleView.DashboardView")
    public WebElement dashboardForm;

    @FindBy(name = "Settings")
    public WebElement settingsButton;

    public DashBoardScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return (MobileElement) settingsButton;
    }
}

