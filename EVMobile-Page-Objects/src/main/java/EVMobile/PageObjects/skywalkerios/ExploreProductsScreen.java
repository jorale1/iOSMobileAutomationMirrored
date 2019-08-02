package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExploreProductsScreen extends BasePage {

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

    @FindBy(name = "SFSafariView")
    public WebElement navitationBar;

    public ExploreProductsScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
