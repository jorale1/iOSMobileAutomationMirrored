package EVMobile.PageObjects.skywalkerios.dashboard;

import EVMobile.Framework.core.BasePage;
import EVMobile.Framework.core.LoginAccounts;
import EVMobile.PageObjects.skywalkerios.*;
import EVMobile.PageObjects.skywalkerios.reportDetails.CompletedPremiumOrderReportDetailScreen;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.time.Duration;

import static java.lang.Thread.sleep;

public class DashBoardScreen extends BasePage {

    @FindBy(name = "EagleView.DashboardView")
    public WebElement dashboardForm;

    @FindBy(name = "Settings")
    public WebElement settingsButton;

    @FindBy(name = "Search")
    public WebElement searchButton;

    @FindBy(xpath = "//XCUIElementTypeCell[1]")
    public WebElement getQuotesSetup;

    @FindBy(name = "Get Automatic Quotes")
    public WebElement getAutomaticQuotesTitle;

    @FindBy(name = "Receive automatic quotes with every report.")
    public WebElement getAutomaticQuotesSubTitle;

    @FindBy(name = "Set Up Now")
    public WebElement getAutomaticQuotesSetUpNowButton;

    @FindBy(name = "Cross")
    public WebElement getAutomaticQuotesClosebutton;

    @FindBy(name = "0 Completed")
    public WebElement noCompleteOrdersLink;

    @FindBy(name = "0 In Progress")
    public WebElement noInProgressOrdersLink;

    @FindBy(name = "0 Closed")
    public WebElement noClosedOrdersLink;

    @FindBy(xpath = "//XCUIElementTypeCell[2]")
    public WebElement welcomeFormCompletedList;

    @FindBy(name = "Welcome!")
    public WebElement welcomeFormTitle;

    @FindBy(name = "This is where you’ll see a list of your completed reports.")
    public WebElement welcomeFormSubTitle;

    @FindBy(name = "Discover Report Types")
    public WebElement welcomeFormViewReportTypesButton;

    @FindBy(name = "No In Progress Reports")
    public WebElement noInProgressReportFormTitle;

    @FindBy(name = "This is where you’ll see a list of your in progress reports.")
    public WebElement noInProgressReportFormSubTitle;

    @FindBy(name = "No Closed Reports")
    public WebElement noClosedReportFormTitle;

    @FindBy(name = "Closed reports will be shown here.")
    public WebElement noClosedReportFormSubTitle;

    @FindBy(xpath = "//XCUIElementTypeCell[5]")
    public WebElement premiumReportCard;

    @FindBy(name = "Done")
    public WebElement loginDone;

    public DashBoardScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public SettingsScreen navigatetoSettingsScreen() throws InterruptedException, AWTException {
        navigateFromLoginToDashboardScreen();
        sleep(2000);
        settingsButton.click();
        sleep(2000);
        return new SettingsScreen(driver);
    }

    public SearchScreen navigateToSearchScreen() throws InterruptedException, AWTException {
        navigateFromLoginToDashboardScreen();
        sleep(2000);
        searchButton.click();
        sleep(2000);
        return new SearchScreen(driver);
    }

    public DashBoardScreen navigateFromLoginToDashboardScreen() throws AWTException, InterruptedException {
        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.navigateToDashboard();
        sleep(2000);
        return new DashBoardScreen(driver);
    }

    public void closeSetUpNowAutomaticQuotes() throws AWTException, InterruptedException {
        navigateFromLoginToDashboardScreen();
        sleep(2000);
        getAutomaticQuotesClosebutton.click();
        sleep(2000);
    }

    public ExploreProductsScreen navigateToExploreProductsScreen() throws InterruptedException, AWTException {
        navigateFromLoginToDashboardScreen();
        sleep(2000);
        welcomeFormViewReportTypesButton.click();
        sleep(2000);
        return new ExploreProductsScreen(driver);
    }

    public QuoteSetupFlowTemplateLandingScreen navigateToQuoteTemplateLandingScreen() throws InterruptedException, AWTException {
        navigateFromLoginToDashboardScreen();
        sleep(2000);
        getAutomaticQuotesSetUpNowButton.click();
        sleep(2000);
        return new QuoteSetupFlowTemplateLandingScreen(driver);
    }

    public void navigateToInProgressListNoOrders() throws InterruptedException, AWTException {
        navigateFromLoginToDashboardScreen();
        sleep(2000);
        noInProgressOrdersLink.click();
        sleep(2000);
    }

    public void navigateToClosedListNoOrders() throws InterruptedException, AWTException {
        navigateFromLoginToDashboardScreen();
        sleep(2000);
        noClosedOrdersLink.click();
        sleep(2000);
    }

    public OrderReportFlowScreenPropertyLocation navigateToOrderReportPropertyLocationScreen() throws InterruptedException, AWTException {
        navigateFromLoginToDashboardScreen();
        sleep(2000);
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(170, 740)).perform();
        return new OrderReportFlowScreenPropertyLocation(driver);
    }

    public CompletedPremiumOrderReportDetailScreen navigateToPremiumOrderDetailScreen() throws InterruptedException, AWTException {
        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        LoginScreen loginScreen = welcomeScreen.navigateToLoginScreen();
        loginScreen.enterCredentials(LoginAccounts.ACCOUNT_WITH_COMPLETED_REPORTS, LoginAccounts.ACCOUNT_WITH_COMPLETED_REPORTS_PASSWORD);
        loginDone.click();
        loginScreen.login.click();
        sleep(9000);
        DashBoardScreen dashBoardScreen = new DashBoardScreen(driver);
        swapToOrderReportCard();
        premiumReportCard.click();
        sleep(9000);
        return new CompletedPremiumOrderReportDetailScreen(driver);
    }

    public void swapToOrderReportCard() {
            TouchAction ta = new TouchAction(driver);
            ta.press(PointOption.point(181, 450)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(181, 200)).release().perform();
    }
}

