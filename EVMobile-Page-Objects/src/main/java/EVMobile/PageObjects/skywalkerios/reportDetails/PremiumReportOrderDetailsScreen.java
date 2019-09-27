package EVMobile.PageObjects.skywalkerios.reportDetails;

import EVMobile.Framework.core.BasePage;
import EVMobile.Framework.core.OrderReports;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

import static java.lang.Thread.sleep;

public class PremiumReportOrderDetailsScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backToSettingsButton;

    @FindBy(name = "Order Details")
    public WebElement screenTitle;

    @FindBy(name = "Report #")
    public WebElement reportNumberLabel;

    @FindBy(name = "30481101")
    public WebElement reportNumber;

    @FindBy(name = "Property Type")
    public WebElement propertyTypeLabel;

    @FindBy(name = "Residential")
    public WebElement propertyType;

    @FindBy(name = "Structures")
    public WebElement structuresLabel;

    @FindBy(name = "Primary + Detached Garage")
    public WebElement structures;

    @FindBy(name = "Delivery")
    public WebElement deliveryLabel;

    @FindBy(name = "Regular Delivery")
    public WebElement deliveryType;

    @FindBy(name = "Placed")
    public WebElement placedLabel;

    @FindBy(name = "Sep 25, 2019 at 5:58 PM")
    public WebElement placedDate;

    @FindBy(name = "Completed")
    public WebElement completedLabel;

    @FindBy(name = "Sep 25, 2019 at 6:24 PM")
    public WebElement completedDate;

    public PremiumReportOrderDetailsScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public PremiumReportOrderDetailsScreen navigateFromPremiumReportDetailSToOrderDetailsScreen() throws AWTException, InterruptedException {
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = new CompletedPremiumOrderReportDetailScreen(driver);
        completedPremiumOrderReportDetailScreen.navigateToPremiumOrderDetailsScreen();
        sleep(2000);
        return new PremiumReportOrderDetailsScreen(driver);
    }

    public CompletedPremiumOrderReportDetailScreen navigateBackToCompletedPremiumOrderReportDetailScreen() throws AWTException, InterruptedException {
        navigateFromPremiumReportDetailSToOrderDetailsScreen();
        sleep(2000);
        backToSettingsButton.click();
        sleep(5000);
        return new CompletedPremiumOrderReportDetailScreen(driver);
    }

    public boolean orderDetailsPrepopulated() throws AWTException, InterruptedException {
        navigateFromPremiumReportDetailSToOrderDetailsScreen();
        boolean areEquals = false;
        sleep(2000);
        if (reportNumber.getAttribute("value").equalsIgnoreCase(OrderReports.SALESTEAM_PREMIUM_REPORT_NUMBER)
                && propertyType.getAttribute("value").equalsIgnoreCase(OrderReports.SALESTEAM_PREMIUM_REPORT_PROPERTY_TYPE)
                && structures.getAttribute("value").equalsIgnoreCase(OrderReports.SALESTEAM_PREMIUM_REPORT_STRUCTURES)
                && deliveryType.getAttribute("value").equalsIgnoreCase(OrderReports.SALESTEAM_PREMIUM_REPORT_DELIVERY)
                && placedDate.getAttribute("value").equalsIgnoreCase(OrderReports.SALESTEAM_PREMIUM_REPORT_PLACED)
                && completedDate.getAttribute("value").equalsIgnoreCase(OrderReports.SALESTEAM_PREMIUM_REPORT_COMPLETED)) {
            areEquals = true;
        }
        return areEquals;
    }
}
