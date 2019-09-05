package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.*;
import EVMobile.PageObjects.skywalkerios.dashboard.DashBoardScreen;
import EVMobile.PageObjects.skywalkerios.reportDetails.*;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

public class CompletePremiumOrderDetailScreenTests extends BaseMobileTest {

    @Test(priority = 1) @Ignore
    public void testNavigateToCompletePremiumOrderDetailsScreen() throws InterruptedException, AWTException {
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = new CompletedPremiumOrderReportDetailScreen(getDriver());
        completedPremiumOrderReportDetailScreen.navigateFromDashboardToReportDetailScreen();
        Assert.assertTrue(completedPremiumOrderReportDetailScreen.measurementDetailsLink.isEnabled());
    }

    @Test(priority = 2) @Ignore
    public void testNavigateBackToDashboardScreen() throws InterruptedException, AWTException {
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = new CompletedPremiumOrderReportDetailScreen(getDriver());
        DashBoardScreen dashBoardScreen = completedPremiumOrderReportDetailScreen.navigateBackToDashboard();
        Assert.assertTrue(dashBoardScreen.settingsButton.isEnabled());
    }

    @Test(priority = 3) @Ignore
    public void testNavigateToVisualizerScreen() throws InterruptedException, AWTException {
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = new CompletedPremiumOrderReportDetailScreen(getDriver());
        VisualizerScreen visualizerScreen = completedPremiumOrderReportDetailScreen.navigateToVisualizerScreen();
        Assert.assertTrue(visualizerScreen.arkitLink.isEnabled());
    }

    @Test(priority = 4) @Ignore
    public void testNavigateToQuoteTemplateLandingScreen() throws InterruptedException, AWTException {
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = new CompletedPremiumOrderReportDetailScreen(getDriver());
        MaterialsWasteCalculationScreen materialsWasteCalculationScreen = completedPremiumOrderReportDetailScreen.navigateToMaterialsWasteCalculationScreen();
        Assert.assertTrue(materialsWasteCalculationScreen.pageSubtitle.isEnabled());
    }

    @Test(priority = 5) @Ignore
    public void testNavigateToExploreProductsScreen() throws InterruptedException, AWTException {
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = new CompletedPremiumOrderReportDetailScreen(getDriver());
        PremiumReportQuotesScreen premiumReportQuotesScreen = completedPremiumOrderReportDetailScreen.navigateToPremiumReportQuotesScreen();
        Assert.assertTrue(premiumReportQuotesScreen.screenTitle.isEnabled());
    }

    @Test(priority = 6) @Ignore
    public void testNavigateToUserSubmittedPhotosScreen() throws InterruptedException, AWTException {
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = new CompletedPremiumOrderReportDetailScreen(getDriver());
        PremiumReportUserSubmittedPhotosScreen premiumReportUserSubmittedPhotosScreen = completedPremiumOrderReportDetailScreen.navigateToUserSubmittedPhotosScreen();
        Assert.assertTrue(premiumReportUserSubmittedPhotosScreen.screenTitle.isEnabled());
    }

    @Test(priority = 7) @Ignore
    public void testNavigateToCAdditionalInformationScreen() throws InterruptedException, AWTException {
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = new CompletedPremiumOrderReportDetailScreen(getDriver());
        PremiumReportAdditionalInformationScreen premiumReportAdditionalInformationScreen = completedPremiumOrderReportDetailScreen.navigateToAdditionalInformationScreen();
        Assert.assertTrue(premiumReportAdditionalInformationScreen.screenTitle.isEnabled());
    }

    @Test(priority = 8) @Ignore
    public void testnavigateToOrderDetailsScreen() throws InterruptedException, AWTException {
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = new CompletedPremiumOrderReportDetailScreen(getDriver());
        PremiumReportOrderDetailsScreen premiumReportOrderDetailsScreen = completedPremiumOrderReportDetailScreen.navigateToPremiumOrderDetailsScreen();
        Assert.assertTrue(premiumReportOrderDetailsScreen.screenTitle.isEnabled());
    }

    @Test(priority = 9) @Ignore
    public void testnavigateToViewReportPDFScreen() throws InterruptedException, AWTException {
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = new CompletedPremiumOrderReportDetailScreen(getDriver());
        PremiumViewReportPDFScreen premiumViewReportPDFScreen = completedPremiumOrderReportDetailScreen.navigateToViewReportPDFScreen();
        Assert.assertTrue(premiumViewReportPDFScreen.screenTitle.isEnabled());
    }

    @Test(priority = 10) @Ignore
    public void testnavigateToReportPDFRegeneratingScreen() throws InterruptedException, AWTException {
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = new CompletedPremiumOrderReportDetailScreen(getDriver());
        PremiumViewReportPDFRegeneratingScreen premiumViewReportPDFRegeneratingScreen = completedPremiumOrderReportDetailScreen.navigateToPremiumReportPDFRegeneratingScreen();
        Assert.assertTrue(premiumViewReportPDFRegeneratingScreen.screenTitle.isEnabled());
    }

    @Test(priority = 11) @Ignore
    public void testnavigateToExternaliOSActivityShareScreen() throws InterruptedException, AWTException {
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = new CompletedPremiumOrderReportDetailScreen(getDriver());
        ExternaliOSActivityListScreen externaliOSActivityListScreenn = completedPremiumOrderReportDetailScreen.navigateToExternaliOSActivitylistShareScreen();
        Assert.assertTrue(externaliOSActivityListScreenn.createPDFButton.isEnabled());
    }

    @Test(priority = 12) @Ignore
    public void testnavigateToExternaliOSMapsRouteSearchScreen() throws InterruptedException, AWTException {
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = new CompletedPremiumOrderReportDetailScreen(getDriver());
        ExternaliOSMapsRoutesearchScreen externaliOSMapsRoutesearchScreen = completedPremiumOrderReportDetailScreen.navigateToExternaliOSMapsRouteSearchScreen();
        Assert.assertTrue(externaliOSMapsRoutesearchScreen.screenTitle.isEnabled());
    }

    @Test(priority = 13)
    public void testShowContactCustomerServiceControls() throws InterruptedException, AWTException {
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = new CompletedPremiumOrderReportDetailScreen(getDriver());
        completedPremiumOrderReportDetailScreen.showContactCustomerServiceControls();
        Assert.assertTrue(completedPremiumOrderReportDetailScreen.emailButton.isEnabled());
    }
}
