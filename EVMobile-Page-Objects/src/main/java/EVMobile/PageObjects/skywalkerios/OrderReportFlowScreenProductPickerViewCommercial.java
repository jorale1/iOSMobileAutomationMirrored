package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderReportFlowScreenProductPickerViewCommercial extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Select a report type")
    public WebElement pageTitle;

    @FindBy(name = "Premium")
    public WebElement premiumReportType;

    @FindBy(name = "$85")
    public WebElement premiumReportPricing;

    @FindBy(name = "• 3D diagram of the roof • 5 aerial images of the structure • All critical measurements • Waste calculation table")
    public WebElement premiumReportDetails;

    @FindBy(name = "SunSite™")
    public WebElement sunSiteReportType;

    @FindBy(name = "$90")
    public WebElement sunSiteReportPricing;

    @FindBy(name = "• Roof obstructions measured • Azimuth diagram • Rafter lengths included • + Premium Roof Report features")
    public WebElement sunSiteReportDetails;

    @FindBy(name = "Gutter")
    public WebElement gutterReportType;

    @FindBy(name = "$20")
    public WebElement gutterReportPricing;

    @FindBy(name = "• Roof diagram with gutters highlighted • 5 aerial images of the structure • Total eave measurements • Estimated number of downspouts")
    public WebElement gutterReportDetails;

    public OrderReportFlowScreenProductPickerViewCommercial(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}