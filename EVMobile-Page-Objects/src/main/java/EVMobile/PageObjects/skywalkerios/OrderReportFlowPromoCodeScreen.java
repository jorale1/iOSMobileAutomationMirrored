package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderReportFlowPromoCodeScreen extends BasePage {

    @FindBy(name = "Cross")
    public WebElement closeButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Done")
    public WebElement doneButton;

    @FindBy(name = "Promo Code")
    public WebElement pageTitle;

    @FindBy(name = "Discard Changes")
    public WebElement discardChangesButton;

    @FindBy(name = "Continue Editing")
    public WebElement continueEditingButton;

    public OrderReportFlowPromoCodeScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
