package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderReportFlowScreenAddressVerifier extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Is the pin in the right place?")
    public WebElement pageTitle;

    @FindBy(name = "If not, drag the map to center the pin on the structure.")
    public WebElement pageInstructions;

    @FindBy(name = "Legal")
    public WebElement legalLink;

    @FindBy(name = "Confirm")
    public WebElement confirmButton;



    public OrderReportFlowScreenAddressVerifier(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}