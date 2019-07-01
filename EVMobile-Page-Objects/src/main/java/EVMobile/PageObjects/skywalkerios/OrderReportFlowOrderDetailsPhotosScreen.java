package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderReportFlowOrderDetailsPhotosScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Add your first photo")
    public WebElement pageTitle;

    @FindBy(name = "AddLarge")
    public WebElement addPhotoButton;

    public OrderReportFlowOrderDetailsPhotosScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}