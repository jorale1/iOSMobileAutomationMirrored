package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard extends BasePage {


    @FindBy(name = "EagleView.DashboardView")
    public WebElement dashboardForm;

    public DashBoard(IOSDriver driver) {
            super(driver);
        PageFactory.initElements(driver, this);
    }
}
