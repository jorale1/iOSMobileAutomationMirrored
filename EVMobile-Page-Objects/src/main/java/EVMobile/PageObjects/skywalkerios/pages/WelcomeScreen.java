package EVMobile.PageObjects.skywalkerios.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeScreen extends BaseScreen {

    @FindBy(name = "welcomeView.signIn")
    public WebElement loginlink;

    @FindBy(name = "welcomeView.signUp")
    public WebElement signuplink;

    @FindBy(name = "welcomeView.indicator")
    public WebElement pageindicator;

    @FindBy(name = "welcomePageViewController.page0.image")
    public WebElement page0image;

    @FindBy(name = "welcomePageViewController.page0.headline")
    public WebElement page0header;

    @FindBy(name = "welcomePageViewController.page0.body")
    public WebElement page0body;

    @FindBy(name = "welcomePageViewController.page1.image")
    public WebElement page1image;

    @FindBy(name = "welcomePageViewController.page1.headline")
    public WebElement page1header;

    @FindBy(name = "welcomePageViewController.page1.body")
    public WebElement page1body;

    @FindBy(name = "welcomePageViewController.page2.image")
    public WebElement page2image;

    @FindBy(name = "welcomePageViewController.page2.headline")
    public WebElement page2header;

    @FindBy(name = "welcomePageViewController.page2.body")
    public WebElement page2body;

    public WelcomeScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return null;
    }
}