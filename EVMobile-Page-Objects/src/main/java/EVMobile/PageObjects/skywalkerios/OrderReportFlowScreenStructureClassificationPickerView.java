package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderReportFlowScreenStructureClassificationPickerView extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Residential")
    public WebElement residentialPropertyType;

    @FindBy(name = "Commercial")
    public WebElement commercialPropertyType;

    @FindBy(name = "Multi-Family")
    public WebElement multiFamilyPropertyType;

    public OrderReportFlowScreenStructureClassificationPickerView(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}