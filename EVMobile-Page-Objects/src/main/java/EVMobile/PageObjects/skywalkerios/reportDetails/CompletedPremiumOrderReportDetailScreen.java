package EVMobile.PageObjects.skywalkerios.reportDetails;

import EVMobile.Framework.core.BasePage;
import EVMobile.PageObjects.skywalkerios.*;
import EVMobile.PageObjects.skywalkerios.dashboard.DashBoardScreen;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.time.Duration;

import static java.lang.Thread.sleep;

public class CompletedPremiumOrderReportDetailScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Measurement Details")
    public WebElement measurementDetailsLink;

    @FindBy(name = "Waste Calculation")
    public WebElement wasteCalculationLink;

    @FindBy(name = "Quotes")
    public WebElement quoteLink;

    @FindBy(name = "Photos")
    public WebElement photoLink;

    @FindBy(name = "Additional Information")
    public WebElement additionlInformationLink;

    @FindBy(name = "Order Details")
    public WebElement orderDetailsLink;

    @FindBy(name = "View Report")
    public WebElement viewReportLink;

    @FindBy(name = "Regenerate Report")
    public WebElement regenerateReportLink;

    @FindBy(name = "Share Report")
    public WebElement shareReportLink;

    @FindBy(name = "Get Directions")
    public WebElement getDirectionsLink;

    @FindBy(name = "Contact Customer Service")
    public WebElement contactCustomerServiceLink;

    @FindBy(name = "Email")
    public WebElement emailButton;

    @FindBy(name = "Call")
    public WebElement callButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    public CompletedPremiumOrderReportDetailScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public CompletedPremiumOrderReportDetailScreen navigateFromDashboardToReportDetailScreen() throws AWTException, InterruptedException {
        DashBoardScreen dashBoardScreen = new DashBoardScreen(driver);
        dashBoardScreen.navigateToPremiumOrderDetailScreen();
        sleep(2000);
        return new CompletedPremiumOrderReportDetailScreen(driver);
    }

    public DashBoardScreen navigateBackToDashboard() throws AWTException, InterruptedException {
        navigateFromDashboardToReportDetailScreen();
        sleep(2000);
        backButton.click();
        sleep(2000);
        return new DashBoardScreen(driver);
    }

    public VisualizerScreen navigateToVisualizerScreen() throws AWTException, InterruptedException {
        navigateFromDashboardToReportDetailScreen();
        sleep(2000);
        measurementDetailsLink.click();
        sleep(2000);
        return new VisualizerScreen(driver);
    }

    public MaterialsWasteCalculationScreen navigateToMaterialsWasteCalculationScreen() throws AWTException, InterruptedException {
        navigateFromDashboardToReportDetailScreen();
        sleep(2000);
        wasteCalculationLink.click();
        return new MaterialsWasteCalculationScreen(driver);
    }

    public PremiumReportQuotesScreen navigateToPremiumReportQuotesScreen() throws AWTException, InterruptedException {
        navigateFromDashboardToReportDetailScreen();
        sleep(2000);
        quoteLink.click();
        sleep(2000);
        return new PremiumReportQuotesScreen(driver);
    }

    public PremiumReportUserSubmittedPhotosScreen navigateToUserSubmittedPhotosScreen() throws AWTException, InterruptedException {
        navigateFromDashboardToReportDetailScreen();
        sleep(2000);
        photoLink.click();
        sleep(2000);
        return new PremiumReportUserSubmittedPhotosScreen(driver);
    }

    public PremiumReportAdditionalInformationScreen navigateToAdditionalInformationScreen() throws AWTException, InterruptedException {
        navigateFromDashboardToReportDetailScreen();
        sleep(2000);
        additionlInformationLink.click();
        sleep(2000);
        return new PremiumReportAdditionalInformationScreen(driver);
    }

    public PremiumReportOrderDetailsScreen navigateToPremiumOrderDetailsScreen() throws AWTException, InterruptedException {
        navigateFromDashboardToReportDetailScreen();
        orderDetailsLink.click();
        return new PremiumReportOrderDetailsScreen(driver);
    }

    public PremiumViewReportPDFScreen navigateToViewReportPDFScreen() throws AWTException, InterruptedException {
        navigateFromDashboardToReportDetailScreen();
        viewReportLink.click();
        sleep(5000);
        return new PremiumViewReportPDFScreen(driver);
    }

    public PremiumViewReportPDFRegeneratingScreen navigateToPremiumReportPDFRegeneratingScreen() throws AWTException, InterruptedException {
        navigateFromDashboardToReportDetailScreen();
        sleep(2000);
        swapToMoreOptions();
        regenerateReportLink.click();
        sleep(5000);
        return new PremiumViewReportPDFRegeneratingScreen(driver);
    }

    public ExternaliOSActivityListScreen navigateToExternaliOSActivitylistShareScreen() throws AWTException, InterruptedException {
        navigateFromDashboardToReportDetailScreen();
        sleep(2000);
        swapToMoreOptions();
        shareReportLink.click();
        sleep(2000);
        return new ExternaliOSActivityListScreen(driver);
    }

    public ExternaliOSMapsRoutesearchScreen navigateToExternaliOSMapsRouteSearchScreen() throws AWTException, InterruptedException {
        navigateFromDashboardToReportDetailScreen();
        sleep(2000);
        swapToMoreOptions();
        getDirectionsLink.click();
        sleep(5000);
        return new ExternaliOSMapsRoutesearchScreen(driver);
    }

    public void showContactCustomerServiceControls() throws AWTException, InterruptedException {
        navigateFromDashboardToReportDetailScreen();
        sleep(2000);
        swapToMoreOptions();
        contactCustomerServiceLink.click();
        sleep(3000);
    }

    public void swapToMoreOptions() {
        TouchAction ta = new TouchAction(driver);
        ta.press(PointOption.point(160, 770)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(160, 500)).release().perform();
    }
}
