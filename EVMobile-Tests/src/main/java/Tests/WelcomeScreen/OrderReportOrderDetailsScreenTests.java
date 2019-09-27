package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.reportDetails.CompletedPremiumOrderReportDetailScreen;
import EVMobile.PageObjects.skywalkerios.reportDetails.PremiumReportOrderDetailsScreen;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

public class OrderReportOrderDetailsScreenTests extends BaseMobileTest {

    @Test(priority = 1) @Ignore
    public void testStructure1TableIsExpandedScreen() throws InterruptedException, AWTException {
        PremiumReportOrderDetailsScreen premiumReportOrderDetailsScreen = new PremiumReportOrderDetailsScreen(getDriver());
        premiumReportOrderDetailsScreen.navigateFromPremiumReportDetailSToOrderDetailsScreen();
        Assert.assertTrue(premiumReportOrderDetailsScreen.screenTitle.isEnabled());
    }

    @Test(priority = 2) @Ignore
    public void testNavigateBackToCompletedPremiumOrderDetailsScreen() throws InterruptedException, AWTException {
        PremiumReportOrderDetailsScreen premiumReportOrderDetailsScreen = new PremiumReportOrderDetailsScreen(getDriver());
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = premiumReportOrderDetailsScreen.navigateBackToCompletedPremiumOrderReportDetailScreen();
         Assert.assertTrue(completedPremiumOrderReportDetailScreen.measurementDetailsLink.isEnabled());
    }

    @Test(priority = 3)
    public void testOrderReportDetailsArePrepopulated() throws InterruptedException, AWTException {
        PremiumReportOrderDetailsScreen premiumReportOrderDetailsScreen = new PremiumReportOrderDetailsScreen(getDriver());
        Assert.assertTrue(premiumReportOrderDetailsScreen.orderDetailsPrepopulated());
    }
}
