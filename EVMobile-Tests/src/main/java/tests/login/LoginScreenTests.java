package tests.login;

import EVMobile.PageObjects.skywalkerios.pages.dashboard.DashBoardScreen;
import EVMobile.PageObjects.skywalkerios.pages.login.ResetPasswordScreen;
import EVMobile.PageObjects.skywalkerios.pages.WelcomeScreen;
import EVMobile.PageObjects.skywalkerios.pages.login.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import tests.BaseMobileTest;

import java.awt.*;

import static java.lang.Thread.sleep;

public class LoginScreenTests extends BaseMobileTest {

    /*

    @Test(priority = 1)

    public void testLogin() {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        Assert.assertTrue(loginscreen.loginEmailAddress.isDisplayed());
    }


    @Test(priority = 2) @Ignore

    public void testBacktoWelcomeScreen() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        WelcomeScreen welcomescreen = loginscreen.navigateBacktoWelcome();
        sleep(8000);
        Assert.assertTrue(welcomescreen.loginlink.isDisplayed());
    }

    @Test(priority = 3) @Ignore

    public void testLoginvalidcredentials() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        DashBoardScreen dashboard = loginscreen.navigateToDashboard();
        sleep(8000);
        Assert.assertTrue(dashboard.dashboardForm.isDisplayed());

        loginscreen.enterCredentials("sas", "dsds");

    }

    @Test(priority = 4)

    public void testNavigateToResetPasswordScreen() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        Assert.assertTrue(resetPasswordScreen.pageName.isDisplayed());
    }

    */
}
