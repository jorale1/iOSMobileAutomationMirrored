package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderReportFlowScreenPreferredOrderView extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Do you want to order the usual?")
    public WebElement pageTitle;

    public OrderReportFlowScreenPreferredOrderView(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}