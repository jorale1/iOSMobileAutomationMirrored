package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.DashBoard;
import EVMobile.PageObjects.skywalkerios.LoginScreen;
import EVMobile.PageObjects.skywalkerios.SettingsScreen;
import EVMobile.PageObjects.skywalkerios.WelcomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static java.lang.Thread.sleep;

public class SettingsScreenTestsiPhone6 extends BaseMobileTest {

    @Test(priority = 1)
    public void testLogOutConfirmiphone6() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        sleep(2000);
        DashBoard dashboard = loginscreen.navigateToDashboard();
        sleep(2000);
        SettingsScreen settingsScreen = dashboard.navigatetoSettingsScreen();
        sleep(2000);
        settingsScreen.swapToLogOutLink("S-Iphone 6");
        sleep(1000);
        WelcomeScreen welcomeScreen = settingsScreen.logOutFromApplication();
        sleep(2000);
        Assert.assertTrue(welcomeScreen.loginlink.isEnabled());
    }

    @Test(priority = 2)
    public void testLogOutCanceliPhone6() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        sleep(2000);
        DashBoard dashboard = loginscreen.navigateToDashboard();
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
}
