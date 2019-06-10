package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderReportFlowScreenProductPickerViewMultiFamily extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Select a report type")
    public WebElement pageTitle;

    @FindBy(name = "QuickSquares™")
    public WebElement quickSquaresReportType;

    @FindBy(name = "$18")
    public WebElement quickSquareReportPricing;

    @FindBy(name = "• Square footage of the roof • Predominant pitch • Outline of the roof area • Completed in about an hour")
    public WebElement quickSquareReportDetails;

    public OrderReportFlowScreenProductPickerViewMultiFamily(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}