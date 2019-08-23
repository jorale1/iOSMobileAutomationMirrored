package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import EVMobile.Framework.core.LoginAccounts;
import EVMobile.PageObjects.skywalkerios.dashboard.SettingsScreen;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

import static java.lang.Thread.sleep;

public class ContactInformationScreen extends BasePage {

    @FindBy(name = "Settings")
    public WebElement backToSettingsButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Save")
    public WebElement saveButton;

    @FindBy(name = "Contact Information")
    public WebElement screenTitle;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Clear text\"])[3]")
    public WebElement clearTextButton;

    @FindBy(name = "Phone")
    public WebElement phoneSection;

    @FindBy(name = "Company")
    public WebElement companySection;

    @FindBy(name = "Discard Changes")
    public WebElement discardChangesButton;

    @FindBy(name = "Continue Editing")
    public WebElement continueEditingButton;

    @FindBy(xpath = "//XCUIElementTypeCell[1]")
    public WebElement firstNameField;

    @FindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeTextField")
    public WebElement firstNametextField;

    @FindBy(xpath = "//XCUIElementTypeCell[2]")
    public WebElement lastNameField;

    @FindBy(xpath = "//XCUIElementTypeCell[2]/XCUIElementTypeTextField")
    public WebElement lastNametextField;

    @FindBy(xpath = "//XCUIElementTypeCell[3]")
    public WebElement streetField;

    @FindBy(xpath = "//XCUIElementTypeCell[4]")
    public WebElement cityField;

    @FindBy(xpath = "//XCUIElementTypeCell[5]")
    public WebElement stateProvinceField;

    @FindBy(xpath = "//XCUIElementTypeCell[5]/XCUIElementTypeTextField")
    public WebElement stateProvinceTextField;

    @FindBy(xpath = "//XCUIElementTypeCell[6]")
    public WebElement zipCodeField;

    @FindBy(xpath = "//XCUIElementTypeCell[7]")
    public WebElement primaryPhoneField;

    @FindBy(xpath = "//XCUIElementTypeCell[11]")
    public WebElement companyNameField;

    @FindBy(xpath = "//XCUIElementTypeCell[11]/XCUIElementTypeTextField")
    public WebElement companyNameTextField;

    @FindBy(xpath = "//XCUIElementTypeCell[12]")
    public WebElement departmentField;

    @FindBy(name = "Next:")
    public WebElement keyboardNextButton;

    @FindBy(name = "Done")
    public WebElement keyboardDonetButton;

    @FindBy(name = "Next")
    public WebElement nextButton;

    public ContactInformationScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public  ContactInformationScreen navigateFromSettingsToContactInfoScreen() throws AWTException, InterruptedException {
        SettingsScreen settingsScreen = new SettingsScreen(driver);
        settingsScreen.navigateToContactInformationScreen();
        sleep(2000);
        return new ContactInformationScreen(driver);
    }

    public SettingsScreen cancelChanges() throws AWTException, InterruptedException {
        navigateFromSettingsToContactInfoScreen();
        sleep(2000);
        firstNameField.sendKeys("asf");
        cancelButton.click();
        discardChangesButton.click();
        sleep(2000);
        return new SettingsScreen(driver);
    }

    public void cancelContinueEditing() throws AWTException, InterruptedException {
        navigateFromSettingsToContactInfoScreen();
        sleep(2000);
        firstNameField.sendKeys("asf");
        cancelButton.click();
        continueEditingButton.click();
        sleep(2000);
    }

    public void newAccountsaveWithoutFillingMandatoryFields() throws AWTException, InterruptedException {
        cleanUpMandatoryFields();
        sleep(2000);
        phoneSection.click();
        saveButton.click();
        sleep(2000);
    }

    public SettingsScreen newAccountsaveFillingAllMandatoryFields() throws AWTException, InterruptedException {
        cleanUpMandatoryFields();
        sleep(2000);
        streetField.sendKeys(LoginAccounts.NEW_CONSTRUCTION_ACCOUNT_STREET);
        cityField.sendKeys(LoginAccounts.NEW_CONSTRUCTION_ACCOUNT_CITY);
        keyboardNextButton.click();
        nextButton.click();
        zipCodeField.sendKeys(LoginAccounts.NEW_CONSTRUCTION_ACCOUNT_ZIP);
        keyboardNextButton.click();
        primaryPhoneField.sendKeys(LoginAccounts.NEW_CONSTRUCTION_ACCOUNT_PRIMARY_PHONE);
        phoneSection.click();
        saveButton.click();
        sleep(2000);
        return new SettingsScreen(driver);
    }

    public void cleanUpMandatoryFields() throws AWTException, InterruptedException {
        navigateFromSettingsToContactInfoScreen();
        sleep(2000);
        streetField.click();
        sleep(1000);
        clearTextButton.click();
        keyboardNextButton.click();
        cityField.click();
        clearTextButton.click();
        keyboardNextButton.click();
        nextButton.click();
        zipCodeField.click();
        clearTextButton.click();
        keyboardNextButton.click();
        primaryPhoneField.click();
        clearTextButton.click();
        sleep(2000);
    }

    public boolean accountRelatedFieldsArePrepopulated() throws AWTException, InterruptedException {
        navigateFromSettingsToContactInfoScreen();
        boolean areEquals = false;
        sleep(2000);
        if (firstNametextField.getAttribute("value").equalsIgnoreCase(LoginAccounts.NEW_CONSTRUCTION_ACCOUNT_FIRST_NAME)
        && lastNametextField.getAttribute("value").equalsIgnoreCase(LoginAccounts.NEW_CONSTRUCTION_ACCOUNT_LAST_NAME)
        && stateProvinceTextField.getAttribute("value").equalsIgnoreCase(LoginAccounts.NEW_CONSTRUCTION_ACCOUNT_STATE_PROVINCE)
        && companyNameTextField.getAttribute("value").equalsIgnoreCase(LoginAccounts.NEW_CONSTRUCTION_ACCOUNT_COMPANY_NAME)){
            areEquals = true;
        }
        return areEquals;
    }


}
