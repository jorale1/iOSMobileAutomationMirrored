package tests.settings;

import EVMobile.PageObjects.skywalkerios.pages.PrivacyPolicyScreen;
import EVMobile.PageObjects.skywalkerios.pages.SettingsScreen;
import EVMobile.PageObjects.skywalkerios.pages.TermsOfUseScreen;
import EVMobile.PageObjects.skywalkerios.pages.WelcomeScreen;
import EVMobile.PageObjects.skywalkerios.pages.dashboard.DashBoardScreen;
import EVMobile.PageObjects.skywalkerios.pages.login.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseMobileTest;

import java.awt.*;

import static java.lang.Thread.sleep;

public class SettingsScreenTestsiPhone6 extends BaseMobileTest {

    /*

    @Test(priority = 1)
    public void testNavigateToTermsOfUseScreeniphone6() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        sleep(2000);
        DashBoardScreen dashboard = loginscreen.navigateToDashboard();
        sleep(2000);
        SettingsScreen settingsScreen = dashboard.navigatetoSettingsScreen();
        sleep(2000);
        settingsScreen.swapToLogOutLink("S-Iphone 6");
        TermsOfUseScreen termsofUseScreen = settingsScreen.navigateToTermsofUseScreen();
        sleep(1000);
        Assert.assertTrue(termsofUseScreen.termsDone.isEnabled());
    }

    @Test(priority = 2)
    public void testNavigateToPrivacyPolicyScreeniphone6() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        sleep(2000);
        DashBoardScreen dashboard = loginscreen.navigateToDashboard();
        sleep(2000);
        SettingsScreen settingsScreen = dashboard.navigatetoSettingsScreen();
        sleep(2000);
        settingsScreen.swapToLogOutLink("S-Iphone 6");
        PrivacyPolicyScreen privacyPolicyScreen = settingsScreen.navigateToPrivacyPolicyScreen();
        sleep(1000);
        Assert.assertTrue(privacyPolicyScreen.privacyPolicyDone.isEnabled());
    }

    @Test(priority = 3)
    public void testLogOutConfirmiphone6() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        sleep(2000);
        DashBoardScreen dashboard = loginscreen.navigateToDashboard();
        sleep(2000);
        SettingsScreen settingsScreen = dashboard.navigatetoSettingsScreen();
        sleep(2000);
        settingsScreen.swapToLogOutLink("S-Iphone 6");
        sleep(1000);
        WelcomeScreen welcomeScreen = settingsScreen.logOutFromApplication();
        sleep(2000);
        Assert.assertTrue(welcomeScreen.loginlink.isEnabled());
    }

    @Test(priority = 4)
    public void testLogOutCanceliPhone6() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        sleep(2000);
        DashBoardScreen dashboard = loginscreen.navigateToDashboard();
        sleep(2000);
        SettingsScreen settingsScreen = dashboard.navigatetoSettingsScreen();
        sleep(1000);
        settingsScreen.swapToLogOutLink("S-Iphone 6");
        sleep(1000);
        settingsScreen.logOutLink.click();
        settingsScreen.cancelButton.click();
        sleep(1000);
        Assert.assertTrue(settingsScreen.exploreProductsLink.isEnabled());
    }

    */
}
