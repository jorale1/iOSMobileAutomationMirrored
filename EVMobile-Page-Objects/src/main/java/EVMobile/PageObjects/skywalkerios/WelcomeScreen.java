package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeScreen extends BasePage {


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

    @FindBy(name = "Choose Environment")
    public WebElement chooseEnvironmentModal;

    @FindBy(name = "Choose Environment")
    public WebElement chooseEnvironmentPageTitle;

    @FindBy(name = "The currently selected environment is Production.")
    public WebElement chooseEnvironmentSubtitle;

    @FindBy(name = "Mocks (Internal)")
    public WebElement mockEnvironment;

    @FindBy(name = "Test (Internal)")
    public WebElement testInternalEnvironmebnt;

    @FindBy(name = "Stage (Internal)")
    public WebElement stageInternalEnvironment;

    @FindBy(name = "Stage")
    public WebElement stageEnvironment;

    @FindBy(name = "Production")
    public WebElement productionEnvironment;

    @FindBy(name = "Cancel")
    public WebElement cancelEnvSelector;


    public WelcomeScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        waitForElementToAppear(By.name("Log In"));
    }

    public LoginScreen navigateToLoginScreen() {
        loginlink.click();
        return new LoginScreen(driver);
    }

    public SignUpFlowScreenStart navigateToSignUpStartScreen() {
        signuplink.click();
        return new SignUpFlowScreenStart(driver);
    }

    public void swapPage(String device) throws InterruptedException {
        if (device.equalsIgnoreCase("S-Iphone X")) {
            TouchAction ta = new TouchAction(driver);
            ta.tap(new PointOption().withCoordinates(23, 693)).moveTo(new PointOption().withCoordinates(351, 691)).release().perform();
        } else if (device.equalsIgnoreCase("S-Iphone 6")) {
            TouchAction ta = new TouchAction(driver);
            ta.tap(new PointOption().withCoordinates(34, 570)).moveTo(new PointOption().withCoordinates(336, 567)).release().perform();
        }
    }

    public void swapPage2(String device) throws InterruptedException {
        if (device.equalsIgnoreCase("S-Iphone X")) {
            TouchAction ta = new TouchAction(driver);
            ta.tap(new PointOption().withCoordinates(23, 693)).moveTo(new PointOption().withCoordinates(351, 691)).release().perform();
            ta.tap(new PointOption().withCoordinates(23, 693)).moveTo(new PointOption().withCoordinates(351, 691)).release().perform();
        } else if (device.equalsIgnoreCase("S-Iphone 6")) {
            TouchAction ta = new TouchAction(driver);
            ta.tap(new PointOption().withCoordinates(34, 570)).moveTo(new PointOption().withCoordinates(336, 567)).release().perform();
            ta.tap(new PointOption().withCoordinates(34, 570)).moveTo(new PointOption().withCoordinates(336, 567)).release().perform();
        }
    }
}