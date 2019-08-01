package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.DashBoardScreen;
import EVMobile.PageObjects.skywalkerios.ResetPasswordScreen;
import EVMobile.PageObjects.skywalkerios.WelcomeScreen;
import EVMobile.PageObjects.skywalkerios.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

import static java.lang.Thread.sleep;

public class LoginScreenTests extends BaseMobileTest {

    @Test(priority = 1) @Ignore

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

    @Test(priority = 3)

    public void testLoginvalidcredentials() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        DashBoardScreen dashboard = loginscreen.navigateToDashboard();
        sleep(8000);
        Assert.assertTrue(dashboard.dashboardForm.isDisplayed());
    }

    @Test(priority = 4) @Ignore

    public void testNavigateToResetPasswordScreen() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        Assert.assertTrue(resetPasswordScreen.pageName.isDisplayed());
    }
}
