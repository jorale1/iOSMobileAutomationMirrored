package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(name = "Phone")
    public WebElement phoneSection;

    @FindBy(name = "Company")
    public WebElement companySection;

    @FindBy(name = "Discard Changes")
    public WebElement discardChangesButton;

    @FindBy(name = "Continue Editing")
    public WebElement continueEditingButton;

    public OrderReportFlowBillingInformationScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
