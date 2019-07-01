package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderReportFlowOrderDetailsEmailRecipientsScreen extends BasePage {

    @FindBy(name = "Cross")
    public WebElement exitButton;

    @FindBy(name = "Edit")
    public WebElement editButton;

    @FindBy(name = "Who should receive a copy of your report?")
    public WebElement pageTitle;

    @FindBy(name = "Additional Recipients")
    public WebElement pageSubTitle;

    public OrderReportFlowOrderDetailsEmailRecipientsScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}