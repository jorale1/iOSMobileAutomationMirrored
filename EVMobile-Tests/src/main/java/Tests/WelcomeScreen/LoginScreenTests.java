package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.DashBoard;
import EVMobile.PageObjects.skywalkerios.WelcomeScreen;
import EVMobile.PageObjects.skywalkerios.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static java.lang.Thread.sleep;

public class LoginScreenTests extends BaseMobileTest {

    @Test(priority = 1)

    public void testLogin() {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        Assert.assertTrue(loginscreen.loginEmailAddress.isDisplayed());
    }


    @Test(priority = 2)

    public void testBacktoWelcomeScreen() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        WelcomeScreen welcomescreen = loginscreen.navigateBacktoWelcome();
        sleep(8000);
        Assert.assertTrue(welcomescreen.loginlink.isDisplayed());
    }

    @Test(priority = 3)

    public void testLoginvalidcredentials() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        DashBoard dashboard = loginscreen.navigateToDashboard();
        sleep(8000);
        Assert.assertTrue(dashboard.dashboardForm.isDisplayed());
    }
}
