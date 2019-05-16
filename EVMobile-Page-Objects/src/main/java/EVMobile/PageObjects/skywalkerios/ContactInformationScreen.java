package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationScreen extends BasePage {

    @FindBy(name = "Settings")
    public WebElement backToSettingsButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Save")
    public WebElement saveButton;

    @FindBy(name = "Contact Information")
    public WebElement screenTitle;

    @FindBy(name = "Clear text")
    public WebElement clearTextButton;

    @FindBy(name = "Phone")
    public WebElement phoneSection;

    @FindBy(name = "Company")
    public WebElement companySection;

    public ContactInformationScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
