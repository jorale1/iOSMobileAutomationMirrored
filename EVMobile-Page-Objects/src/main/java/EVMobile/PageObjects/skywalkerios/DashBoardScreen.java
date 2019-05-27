package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class DashBoardScreen extends BasePage {

    @FindBy(name = "EagleView.DashboardView")
    public WebElement dashboardForm;

    @FindBy(name = "Settings")
    public WebElement settingsButton;

    public DashBoardScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public SettingsScreen navigatetoSettingsScreen() {
        settingsButton.click();
        return new SettingsScreen(driver);
    }

    public OrderReportFlowScreenPropertyLocation navigateToOrderReportPropertyLocationScreen() throws InterruptedException {
        sleep(2000);
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(170, 740)).perform();
        return new OrderReportFlowScreenPropertyLocation(driver);
    }
}

