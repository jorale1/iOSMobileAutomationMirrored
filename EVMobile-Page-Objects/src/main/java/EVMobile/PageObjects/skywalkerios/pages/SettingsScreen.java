package EVMobile.PageObjects.skywalkerios.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsScreen extends BaseScreen {

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
    public WebElement emailUnavailableSimulatorTitle;

    public SettingsScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    @Override
    protected MobileElement getVisibilityElement() {
        return null;
    }
}
