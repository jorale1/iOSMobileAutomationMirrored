package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.*;
import EVMobile.PageObjects.skywalkerios.dashboard.DashBoardScreen;
import EVMobile.PageObjects.skywalkerios.dashboard.SearchScreen;
import EVMobile.PageObjects.skywalkerios.dashboard.SettingsScreen;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

public class DashboardScreenTests extends BaseMobileTest {

    @Test(priority = 1)
    public void testNavigateToSearchScreen() throws InterruptedException, AWTException {
        DashBoardScreen dashBoardScreen = new DashBoardScreen(getDriver());
        SearchScreen searchScreen = dashBoardScreen.navigateToSearchScreen();
        Assert.assertTrue(searchScreen.pageName.isEnabled());
    }

    @Test(priority = 2) @Ignore
    public void testNavigateToSettingsScreen() throws InterruptedException, AWTException {
        DashBoardScreen dashBoardScreen = new DashBoardScreen(getDriver());
        SettingsScreen settingsScreen = dashBoardScreen.navigatetoSettingsScreen();
        Assert.assertTrue(settingsScreen.screenTitle.isEnabled());
    }

    @Test(priority = 3) @Ignore
    public void testCloseGetAutomaticQuotesForm() throws InterruptedException, AWTException {
        DashBoardScreen dashBoardScreen = new DashBoardScreen(getDriver());
        dashBoardScreen.closeSetUpNowAutomaticQuotes();
        Assert.assertTrue(dashBoardScreen.welcomeFormViewReportTypesButton.isEnabled());
    }

    @Test(priority = 4) @Ignore
    public void testNavigateToQuoteTemplateLandingScreen() throws InterruptedException, AWTException {
        DashBoardScreen dashBoardScreen = new DashBoardScreen(getDriver());
        QuoteSetupFlowTemplateLandingScreen quoteSetupFlowTemplateLandingScreen = dashBoardScreen.navigateToQuoteTemplateLandingScreen();
        Assert.assertTrue(quoteSetupFlowTemplateLandingScreen.quoteMachineImage.isEnabled());
    }

    @Test(priority = 5) @Ignore
    public void testNavigateToExploreProductsScreen() throws InterruptedException, AWTException {
        DashBoardScreen dashBoardScreen = new DashBoardScreen(getDriver());
        ExploreProductsScreen exploreProductsScreen = dashBoardScreen.navigateToExploreProductsScreen();
        Assert.assertTrue(exploreProductsScreen.navitationBar.isEnabled());
    }

    @Test(priority = 6) @Ignore
    public void testNavigateToInProgressListNoOrders() throws InterruptedException, AWTException {
        DashBoardScreen dashBoardScreen = new DashBoardScreen(getDriver());
        dashBoardScreen.navigateToInProgressListNoOrders();
        Assert.assertTrue(dashBoardScreen.noInProgressReportFormTitle.isEnabled());
    }

    @Test(priority = 7) @Ignore
    public void testNavigateToCloedListNoOrders() throws InterruptedException, AWTException {
        DashBoardScreen dashBoardScreen = new DashBoardScreen(getDriver());
        dashBoardScreen.navigateToClosedListNoOrders();
        Assert.assertTrue(dashBoardScreen.noClosedReportFormTitle.isEnabled());
    }

    @Test(priority = 8) @Ignore
    public void testnavigateToPropertyLocationScreen() throws InterruptedException, AWTException {
        DashBoardScreen dashBoardScreen = new DashBoardScreen(getDriver());
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = dashBoardScreen.navigateToOrderReportPropertyLocationScreen();
        Assert.assertTrue(orderReportFlowScreenPropertyLocation.currentLocationButton.isEnabled());
    }
}
