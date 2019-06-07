package tests.settings;

import EVMobile.PageObjects.skywalkerios.pages.settings.ContactInformationScreen;
import EVMobile.PageObjects.skywalkerios.pages.ExploreProductsScreen;
import EVMobile.PageObjects.skywalkerios.pages.SettingsScreen;
import EVMobile.PageObjects.skywalkerios.pages.dashboard.DashBoardScreen;
import EVMobile.PageObjects.skywalkerios.pages.quote.QuoteSetupFlowQuoteSettingsScreen;
import EVMobile.PageObjects.skywalkerios.pages.quote.QuoteSetupFlowScreenSetupScreen;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseMobileTest;

import java.awt.*;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertTrue;

public class SettingsScreenTestsGeneral extends BaseMobileTest {

    /*

    @Test(priority = 1)
    public void testBackToDashboardScreen() throws InterruptedException, AWTException {


        DashBoardScreen dashBoardScreen = navigator.navigatesToDashBoardScreen();
        //DashBoardScreen dashBoardScreen = settingsScreen.navigateBackToDashboardScreen();

        assertTrue(dashBoardScreen.isDisplayed());
    }

    @Test(priority = 2)
    public void testNavigateToQuoteSettingsSetupNowScreen() throws InterruptedException, AWTException {
        SettingsScreen settingsScreen = new SettingsScreen(getDriver());
        QuoteSetupFlowScreenSetupScreen quoteSetupFlowScreenSetupScreen = settingsScreen.navigateToQuoteSetpFlowScreenSetup();
        assertTrue(quoteSetupFlowScreenSetupScreen.quoteMachineImage.isEnabled());

        QuoteSetupFlowScreenSetupScreen screen = navigator.goToQuotesSetupScreen();
        assertTrue(screen.isDisplayed());
    }

    @Test(priority = 3)
    public void testNavigateToQuoteSettingsScreen() throws InterruptedException, AWTException {
        SettingsScreen settingsScreen = new SettingsScreen(getDriver());
        QuoteSetupFlowQuoteSettingsScreen quoteSetupFlowQuoteSettingsScreen = settingsScreen.navigateToQuoteSetpFlowScreenQuoteSettings();
        sleep(1000);
        assertTrue(quoteSetupFlowQuoteSettingsScreen.laborCostLink.isEnabled());
    }

    @Test(priority = 4)
    public void testNavigateToExploreProductsScreen() throws InterruptedException, AWTException {
        SettingsScreen settingsScreen = new SettingsScreen(getDriver());
        ExploreProductsScreen exploreProductsScreen = settingsScreen.navigateToExploreProductsScreen();
        sleep(1000);
        assertTrue(exploreProductsScreen.reloadButton.isEnabled());
    }

    @Test(priority = 5)
    public void testNavigateToContactInformationScreen() throws InterruptedException, AWTException {
        SettingsScreen settingsScreen = new SettingsScreen(getDriver());
        ContactInformationScreen contactInformationScreen = settingsScreen.navigateToContactInformationScreen();
        sleep(1000);
        assertTrue(contactInformationScreen.backToSettingsButton.isEnabled());
    }

    @Test(priority = 6)
    public void testContactEmailLinkOnSimulator() throws InterruptedException, AWTException {
        SettingsScreen settingsScreen = new SettingsScreen(getDriver());
        settingsScreen.sendMailToCustomerService("S-Iphone X");
        sleep(1000);
        assertTrue(settingsScreen.emailUnavailableSimulatorTitle.isEnabled());
    }

    */
}
