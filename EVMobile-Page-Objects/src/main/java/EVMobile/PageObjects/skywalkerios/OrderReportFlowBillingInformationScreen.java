package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

import static java.lang.Thread.sleep;

public class OrderReportFlowBillingInformationScreen extends BasePage {

    @FindBy(name = "Cross")
    public WebElement closeButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Save")
    public WebElement saveButton;

    @FindBy(name = "Billing Information")
    public WebElement pageTitle;

    @FindBy(name = "Credit Card Details")
    public WebElement creditCardDetailsSectionTitle;

    @FindBy(name = "Clear text")
    public WebElement clearTextButton;

    @FindBy(name = "Next")
    public WebElement nextLink;

    @FindBy(name = "Next:")
    public WebElement keyboardNext;

    @FindBy(name = "Done")
    public WebElement keyboardAccept;

    @FindBy(name = "Phone")
    public WebElement phoneSection;

    @FindBy(name = "Company")
    public WebElement companySection;

    @FindBy(name = "Discard Changes")
    public WebElement discardChangesButton;

    @FindBy(name = "Continue Editing")
    public WebElement continueEditingButton;

    @FindBy(xpath = "//XCUIElementTypeCell[3]")
    public WebElement cardNumberField;

    @FindBy(xpath = "//XCUIElementTypeCell[4]")
    public WebElement expirationDateField;

    @FindBy(xpath = "//XCUIElementTypePickerWheel[1]")
    public WebElement monthPickerwheel;

    @FindBy(xpath = "//XCUIElementTypePickerWheel[2]")
    public WebElement yearPickerwheel;

    @FindBy(xpath = "//XCUIElementTypeCell[5]")
    public WebElement streetField;

    @FindBy(xpath = "//XCUIElementTypeCell[6]")
    public WebElement cityField;

    @FindBy(xpath = "//XCUIElementTypeCell[7]")
    public WebElement stateField;

    @FindBy(xpath = "//XCUIElementTypePickerWheel")
    public WebElement statepickerWheel;

    @FindBy(xpath = "//XCUIElementTypeCell[8]")
    public WebElement zipCodeField;

    @FindBy(xpath = "//XCUIElementTypeCell[9]")
    public WebElement phoneNumberField;

    @FindBy(xpath = "//XCUIElementTypeAlert")
    public WebElement invalidCardMessage;

    @FindBy(id = "B3000000-0000-0000-037C-000000000000")
    public WebElement dismissButtonCardNumberMessage;


    public String cardNumber = "4419986970348907";
    public String firstName;
    public String lastName;
    public String streetName = "2 Infinity Loop";
    public String cityName = "Cupertino";
    public String zipPostalCode = "95014";
    public String phoneNumber = "4419986970348907";


    public OrderReportFlowBillingInformationScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public OrderReportFlowBillingInformationScreen navigateFromCheckOutToBillingInoformationScreen() throws AWTException, InterruptedException {
        OrderReportFlowCheckOutViewScreen orderReportFlowCheckOutViewScreen = new OrderReportFlowCheckOutViewScreen(driver);
        orderReportFlowCheckOutViewScreen.navigatetoAddPaymentScreen();
        sleep(2000);
        return new OrderReportFlowBillingInformationScreen(driver);
    }

    public OrderReportFlowCheckOutViewScreen closePageWithoutChanges() throws AWTException, InterruptedException {
        navigateFromCheckOutToBillingInoformationScreen();
        sleep(2000);
        closeButton.click();
        sleep(2000);
        return new OrderReportFlowCheckOutViewScreen(driver);
    }

    public OrderReportFlowCheckOutViewScreen cancelDiscardChanges() throws AWTException, InterruptedException {
        navigateFromCheckOutToBillingInoformationScreen();
        sleep(2000);
        cardNumberField.sendKeys("455");
        sleep(2000);
        cancelButton.click();
        discardChangesButton.click();
        sleep(2000);
        return new OrderReportFlowCheckOutViewScreen(driver);
    }

    public void cancelThenContinueEditing() throws AWTException, InterruptedException {
        navigateFromCheckOutToBillingInoformationScreen();
        sleep(2000);
        cardNumberField.sendKeys("455");
        sleep(2000);
        cancelButton.click();
        continueEditingButton.click();
        sleep(2000);
    }

    public void allFieldsTurnMandatoryWhenMaking1ChangeAndSave() throws AWTException, InterruptedException {
        navigateFromCheckOutToBillingInoformationScreen();
        sleep(2000);
        cardNumberField.sendKeys("455");
        sleep(2000);
        saveButton.click();
        sleep(2000);
    }

    public OrderReportFlowCheckOutViewScreen fillInAllFieldsValidData() throws AWTException, InterruptedException {
        navigateFromCheckOutToBillingInoformationScreen();
        sleep(2000);
        cardNumberField.sendKeys(cardNumber);
        nextLink.click();
        selectExpirationDate("11", "2025");
        nextLink.click();
        streetField.sendKeys(streetName);
        keyboardNext.click();
        cityField.sendKeys(cityName);
        keyboardNext.click();
        selecState("California");
        nextLink.click();
        zipCodeField.sendKeys(zipPostalCode);
        keyboardNext.click();
        phoneNumberField.sendKeys(phoneNumber);
        keyboardAccept.click();
        saveButton.click();
        sleep(2000);
        return new OrderReportFlowCheckOutViewScreen(driver);
    }

    public void selectExpirationDate(String cardExpirationMonth, String cardExpirationYear) throws InterruptedException, AWTException {
        monthPickerwheel.sendKeys(cardExpirationMonth);
        yearPickerwheel.sendKeys(cardExpirationYear);
    }

    public void expirationDateValidation(String cardExpirationMonth, String cardExpirationYear) throws InterruptedException, AWTException {
        navigateFromCheckOutToBillingInoformationScreen();
        sleep(2000);
        expirationDateField.click();
        monthPickerwheel.sendKeys(cardExpirationMonth);
        yearPickerwheel.sendKeys(cardExpirationYear);
    }

    public void selecState(String selectedState) throws InterruptedException, AWTException {
        sleep(2000);
        stateField.click();
        statepickerWheel.sendKeys(selectedState);
    }

    public void phoneNumberValidation(String phoneNumber) throws InterruptedException, AWTException {
        navigateFromCheckOutToBillingInoformationScreen();
        sleep(2000);
        cardNumberField.sendKeys(cardNumber);
        nextLink.click();
        selectExpirationDate("11", "2025");
        nextLink.click();
        streetField.sendKeys(streetName);
        keyboardNext.click();
        cityField.sendKeys(cityName);
        keyboardNext.click();
        selecState("California");
        nextLink.click();
        zipCodeField.sendKeys(zipPostalCode);
        keyboardNext.click();
        phoneNumberField.sendKeys(phoneNumber);
        keyboardAccept.click();
        sleep(2000);
        saveButton.click();
        sleep(9000);
    }

    public void cardNumberValidation(String cardNumber) throws InterruptedException, AWTException {
        navigateFromCheckOutToBillingInoformationScreen();
        sleep(2000);
        cardNumberField.sendKeys(cardNumber);
        nextLink.click();
        selectExpirationDate("11", "2025");
        nextLink.click();
        streetField.sendKeys(streetName);
        keyboardNext.click();
        cityField.sendKeys(cityName);
        keyboardNext.click();
        selecState("California");
        nextLink.click();
        zipCodeField.sendKeys(zipPostalCode);
        keyboardNext.click();
        phoneNumberField.sendKeys(phoneNumber);
        keyboardAccept.click();
        sleep(2000);
        saveButton.click();
        sleep(2000);
    }

}
