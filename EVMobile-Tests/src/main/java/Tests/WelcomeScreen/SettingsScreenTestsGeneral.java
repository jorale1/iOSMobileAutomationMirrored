package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.*;
import EVMobile.PageObjects.skywalkerios.dashboard.DashBoardScreen;
import EVMobile.PageObjects.skywalkerios.dashboard.SettingsScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static java.lang.Thread.sleep;

public class SettingsScreenTestsGeneral extends BaseMobileTest {

    @Test(priority = 1)
    public void testBackToDashboardScreen() throws InterruptedException, AWTException {
        SettingsScreen settingsScreen = new SettingsScreen(getDriver());
        DashBoardScreen dashBoardScreen = settingsScreen.navigateBackToDashboardScreen();
        Assert.assertTrue(dashBoardScreen.settingsButton.isEnabled());
    }

    @Test(priority = 2)
    public void testNavigateToQuoteSettingsSetupNowScreen() throws InterruptedException, AWTException {
        SettingsScreen settingsScreen = new SettingsScreen(getDriver());
        QuoteSetupFlowTemplateLandingScreen quoteSetupFlowTemplateLandingScreen = settingsScreen.navigateToQuoteSetpFlowScreenSetup();
        Assert.assertTrue(quoteSetupFlowTemplateLandingScreen.quoteMachineImage.isEnabled());
    }

    @Test(priority = 3)
    public void testNavigateToQuoteSettingsScreen() throws InterruptedException, AWTException {
        SettingsScreen settingsScreen = new SettingsScreen(getDriver());
        QuoteSetupFlowScreenQuoteSettings quoteSetupFlowScreenQuoteSettings = settingsScreen.navigateToQuoteSetpFlowScreenQuoteSettings();
        sleep(1000);
        Assert.assertTrue(quoteSetupFlowScreenQuoteSettings.laborCostLink.isEnabled());
    }

    @Test(priority = 4)
    public void testNavigateToExploreProductsScreen() throws InterruptedException, AWTException {
        SettingsScreen settingsScreen = new SettingsScreen(getDriver());
        ExploreProductsScreen exploreProductsScreen = settingsScreen.navigateToExploreProductsScreen();
        sleep(1000);
        Assert.assertTrue(exploreProductsScreen.reloadButton.isEnabled());
    }

    @Test(priority = 5)
    public void testNavigateToContactInformationScreen() throws InterruptedException, AWTException {
        SettingsScreen settingsScreen = new SettingsScreen(getDriver());
        ContactInformationScreen contactInformationScreen = settingsScreen.navigateToContactInformationScreen();
        sleep(1000);
        Assert.assertTrue(contactInformationScreen.backToSettingsButton.isEnabled());
    }

    @Test(priority = 6)
    public void testContactEmailLinkOnSimulator() throws InterruptedException, AWTException {
        SettingsScreen settingsScreen = new SettingsScreen(getDriver());
        settingsScreen.sendMailToCustomerService("S-Iphone X");
        sleep(1000);
        Assert.assertTrue(settingsScreen.emailUnavailableSimulatortitle.isEnabled());
    }
}
