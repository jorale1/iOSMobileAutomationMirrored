package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.reportDetails.CompletedPremiumOrderReportDetailScreen;
import EVMobile.PageObjects.skywalkerios.reportDetails.PremiumReportAdditionalInformationScreen;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

public class ReportAdditionalInformationScreenTests extends BaseMobileTest {

    @Test(priority = 1) @Ignore
    public void testStructure1TableIsExpandedScreen() throws InterruptedException, AWTException {
        PremiumReportAdditionalInformationScreen premiumReportAdditionalInformationScreen = new PremiumReportAdditionalInformationScreen(getDriver());
        premiumReportAdditionalInformationScreen.navigateFromPremiumReportDetailSToAdditionalInfoScreen();
        Assert.assertTrue(premiumReportAdditionalInformationScreen.screenTitle.isEnabled());
    }

    @Test(priority = 2) @Ignore
    public void testNavigateBackToCompletedPremiumOrderDetailsScreen() throws InterruptedException, AWTException {
        PremiumReportAdditionalInformationScreen premiumReportAdditionalInformationScreen = new PremiumReportAdditionalInformationScreen(getDriver());
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = premiumReportAdditionalInformationScreen.navigateBackToCompletedPremiumOrderReportDetailScreen();
         Assert.assertTrue(completedPremiumOrderReportDetailScreen.measurementDetailsLink.isEnabled());
    }

    @Test(priority = 2)
    public void testVerifyAccountAdditionalEmail() throws InterruptedException, AWTException {
        PremiumReportAdditionalInformationScreen premiumReportAdditionalInformationScreen = new PremiumReportAdditionalInformationScreen(getDriver());
        Assert.assertTrue(premiumReportAdditionalInformationScreen.verifyAccountAdditionalEmail());
    }
}
