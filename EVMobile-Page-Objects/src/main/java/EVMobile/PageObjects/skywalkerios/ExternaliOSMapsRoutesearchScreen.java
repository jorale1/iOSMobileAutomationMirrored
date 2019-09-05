package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExternaliOSMapsRoutesearchScreen extends BasePage {

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Route")
    public WebElement routeButton;

    @FindBy(name = "Change Route")
    public WebElement screenTitle;

    @FindBy(name = "Reverse start and end locations")
    public WebElement reverseButton;

    public ExternaliOSMapsRoutesearchScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
