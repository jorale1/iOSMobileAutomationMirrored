package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchScreen extends BasePage {

    @FindBy(name = "Search")
    public WebElement pageName;

    @FindBy(name = "Cross")
    public WebElement closeButton;

    @FindBy(name = "Cancel")
    public WebElement cancelLink;

    @FindBy(name = "Address")
    public WebElement searchFieldAddress;

    @FindBy(name = "Clear text")
    public WebElement clearTextButton;

    @FindBy(name = "Clear")
    public WebElement recentClearButton;

    @FindBy(name = "No Reports Found")
    public WebElement reportsNotFoundFormTitle;

    public SearchScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
