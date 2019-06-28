package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderReportFlowOrderDetailsViewScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Any additional information you’d like to add?")
    public WebElement pageTitle;

    @FindBy(name = "Photos")
    public WebElement photosLink;

    @FindBy(name = "Claim Information")
    public WebElement claimInformationLink;

    @FindBy(name = "Email Recipients")
    public WebElement emailRecipientsLink;

    @FindBy(name = "Project Name")
    public WebElement projectNameLink;

    @FindBy(name = "Building ID")
    public WebElement buildingIDLink;

    public OrderReportFlowOrderDetailsViewScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}