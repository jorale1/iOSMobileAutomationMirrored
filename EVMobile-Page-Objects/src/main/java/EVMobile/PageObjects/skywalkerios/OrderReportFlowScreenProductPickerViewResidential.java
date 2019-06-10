package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderReportFlowScreenProductPickerViewResidential extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Select a report type")
    public WebElement pageTitle;

    @FindBy(name = "Premium")
    public WebElement premiumReportType;

    @FindBy(name = "$30 – $75")
    public WebElement premiumReportPricing;

    @FindBy(name = "• 3D diagram of the roof • 5 aerial images of the structure • All critical measurements • Waste calculation table")
    public WebElement premiumReportDetails;

    @FindBy(name = "QuickSquares™")
    public WebElement quickSquaresReportType;

    @FindBy(name = "$18")
    public WebElement quickSquareReportPricing;

    @FindBy(name = "• Square footage of the roof • Predominant pitch • Outline of the roof area • Completed in about an hour")
    public WebElement quickSquareReportDetails;

    @FindBy(name = "SunSite™ Plus")
    public WebElement sunSitePlusReportType;

    @FindBy(name = "$50 – $95")
    public WebElement sunSitePlusReportPricing;

    @FindBy(name = "• Shade-causing objects & measurements • Object height above eave line • DXF and JSON file formats included • + SunSite Report features")
    public WebElement sunSitePlusReportDetails;

    @FindBy(name = "SunSite™")
    public WebElement sunSiteReportType;

    @FindBy(name = "$35 – $80")
    public WebElement sunSiteReportPricing;

    @FindBy(name = "• Roof obstructions measured • Azimuth diagram • Rafter lengths included • + Premium Roof Report features")
    public WebElement sunSiteReportDetails;

    @FindBy(name = "Walls")
    public WebElement wallsReportType;

    @FindBy(name = "$70")
    public WebElement wallsReportPricing;

    @FindBy(name = "• 3D wall area diagram • Window and door diagram • Elevation by cardinal direction • 5 aerial images of the structure")
    public WebElement wallsReportDetails;

    @FindBy(name = "WallsLite™")
    public WebElement wallsLiteReportType;

    @FindBy(name = "$36")
    public WebElement wallsLiteReportPricing;

    @FindBy(name = "• 3D wall area diagram • Elevation by cardinal direction • 5 aerial images of the structure • No window or door cutouts")
    public WebElement wallsLiteReportDetails;

    @FindBy(name = "Gutter")
    public WebElement gutterReportType;

    @FindBy(name = "$12")
    public WebElement gutterReportPricing;

    @FindBy(name = "• Roof diagram with gutters highlighted • 5 aerial images of the structure • Total eave measurements • Estimated number of downspouts")
    public WebElement gutterReportDetails;

    public OrderReportFlowScreenProductPickerViewResidential(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}