package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderReportFlowOrderDetailsBuildingIDScreen extends BasePage {

    @FindBy(name = "Cross")
    public WebElement exitButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Done")
    public WebElement doneLink;

    @FindBy(name = "Building ID")
    public WebElement pageTitle;

    public OrderReportFlowOrderDetailsBuildingIDScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}