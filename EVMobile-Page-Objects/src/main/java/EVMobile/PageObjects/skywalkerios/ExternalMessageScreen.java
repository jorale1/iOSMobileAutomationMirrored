package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExternalMessageScreen extends BasePage {

    @FindBy(name = "What’s New in Messages")
    public WebElement screenTitle;

    public ExternalMessageScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
