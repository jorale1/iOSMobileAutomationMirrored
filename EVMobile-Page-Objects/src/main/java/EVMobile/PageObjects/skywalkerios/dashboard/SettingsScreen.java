package EVMobile.PageObjects.skywalkerios.dashboard;

import EVMobile.Framework.core.BasePage;
import EVMobile.PageObjects.skywalkerios.*;
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

public class SettingsScreen extends BasePage {

    @FindBy(name = "Cross")
    public WebElement dismiss;

    @FindBy(name = "Settings")
    public WebElement screenTitle;

    @FindBy(name = "\uD83D\uDEA7 Developer Zone \uD83D\uDEA7")
    public WebElement devZoneMessage;

    @FindBy(name = "Delete Quote Template")
    public WebElement deleteQuoteTemplate;

    @FindBy(name = "Account")
    public WebElement accountSection;

    @FindBy(name = "jorge.acosta@eagleview.com")
    public WebElement emailAccount;

    @FindBy(name = "Contact Information")
    public WebElement contactInformationLink;

    @FindBy(name = "Quote Settings")
    public WebElement quoteSettingsLink;

    @FindBy(name = "Guides")
    public WebElement guidesSection;

    @FindBy(name = "Explore Products")
    public WebElement exploreProductsLink;

    @FindBy(name = "Help")
    public WebElement helpSection;

    @FindBy(name = "customerservice@eagleview.com")
    public WebElement customerServiceLink;

    @FindBy(name = "1-866-659-8439")
    public WebElement customerServicePhoneLink;

    @FindBy(name = "Information")
    public WebElement informationSection;

    @FindBy(name = "9.1 (33)")
    public WebElement versionNumber;

    @FindBy(name = "Version")
    public WebElement versionLabel;

    @FindBy(name = "Privacy Policy")
    public WebElement privacyPolicyLink;

    @FindBy(name = "Terms of Use")
    public WebElement termsOfUseLink;

    @FindBy(name = "Log Out")
    public WebElement logOutLink;

    @FindBy(name = "settingsViewController.signOutConfirmation.accept")
    public WebElement logOutButton;

    @FindBy(name = "settingsViewController.signOutConfirmation.cancel")
    public WebElement cancelButton;

    @FindBy(name = "Email unavailable")
    public WebElement emailUnavailableSimulator;

    @FindBy(name = "OK")
    public WebElement emailUnavailableSimulatorOK;

    @FindBy(name = "Email unavailable")
    public WebElement emailUnavailableSimulatortitle;

    public String userNoQuoteSetup = "skywalker-ios-test4@mail.com";
    public String userNoQuoteSetupPassword = "EagleView1";
    public String userWithQuoteSetup = "jorge.acosta@eagleview.com";
    public String userWithQuoteSetupPassword = "EagleView1";

    public SettingsScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WelcomeScreen logOutFromApplication() throws InterruptedException {
        logOutLink.click();
        sleep(1000);
        logOutButton.click();
        sleep(1000);
        return new WelcomeScreen(driver);
    }

    public DashBoardScreen navigateBackToDashboardScreen() throws AWTException, InterruptedException {
        navigateToStartTesting();
        sleep(2000);
        dismiss.click();
        return new DashBoardScreen(driver);
    }

    public ContactInformationScreen navigateToContactInformationScreen() throws AWTException, InterruptedException {
        navigateToStartTesting();
        sleep(2000);
        contactInformationLink.click();
        return new ContactInformationScreen(driver);
    }

    public QuoteSetupFlowTemplateLandingScreen navigateToQuoteSetpFlowScreenSetup() throws AWTException, InterruptedException {
        navigateToStartTesting();
        sleep(2000);
        quoteSettingsLink.click();
        return new QuoteSetupFlowTemplateLandingScreen(driver);
    }

    public QuoteSetupFlowScreenQuoteSettings navigateToQuoteSetpFlowScreenQuoteSettings() throws AWTException, InterruptedException {
        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        loginscreen.enterCredentials(userWithQuoteSetup, userWithQuoteSetupPassword);
        loginscreen.loginDone.click();
        loginscreen.login.click();
        DashBoardScreen dashBoardScreen = new DashBoardScreen(driver);
        sleep(2000);
        SettingsScreen settingsScreen = dashBoardScreen.navigatetoSettingsScreen();
        sleep(2000);
        quoteSettingsLink.click();
        return new QuoteSetupFlowScreenQuoteSettings(driver);
    }

    public ExploreProductsScreen navigateToExploreProductsScreen() throws AWTException, InterruptedException {
        navigateToStartTesting();
        sleep(2000);
        exploreProductsLink.click();
        return new ExploreProductsScreen(driver);
    }

    public TermsofUse navigateToTermsofUseScreen() {
        termsOfUseLink.click();
        return new TermsofUse(driver);
    }

    public PrivacyPolicy navigateToPrivacyPolicyScreen() {
        privacyPolicyLink.click();
        return new PrivacyPolicy(driver);
    }

    public void sendMailToCustomerService(String device) throws AWTException, InterruptedException {
        navigateToStartTesting();
        sleep(2000);
        customerServiceLink.click();
        if (device.charAt(0)== 'S') {
            emailUnavailableSimulatorOK.isEnabled();
        }else {
            accountSection.isEnabled();
        }
    }

    public SettingsScreen navigateToStartTesting() throws AWTException, InterruptedException {
        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        loginscreen.enterCredentials(userNoQuoteSetup, userNoQuoteSetupPassword);
        loginscreen.loginDone.click();
        loginscreen.login.click();
        DashBoardScreen dashBoardScreen = new DashBoardScreen(driver);
        sleep(2000);
        dashBoardScreen.settingsButton.click();
        return new SettingsScreen(driver);
    }

    public void swapToLogOutLink(String device) {
        if (device.equalsIgnoreCase("S-Iphone X")) {
            TouchAction ta = new TouchAction(driver);
            ta.press(PointOption.point(181, 743)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(181, 232)).release().perform();
        } else if (device.equalsIgnoreCase("S-Iphone 6")) {
            TouchAction ta = new TouchAction(driver);
            ta.press(PointOption.point(181, 546)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(181, 208)).release().perform();
        }
    }
}
