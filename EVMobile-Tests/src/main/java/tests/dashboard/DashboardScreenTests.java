package tests.dashboard;

import EVMobile.Framework.core.BaseTest;
import EVMobile.PageObjects.skywalkerios.model.Account;
import EVMobile.PageObjects.skywalkerios.model.AccountManager;
import EVMobile.PageObjects.skywalkerios.model.Report;
import EVMobile.PageObjects.skywalkerios.model.User;
import EVMobile.PageObjects.skywalkerios.pages.dashboard.DashBoardScreen;
import EVMobile.PageObjects.skywalkerios.pages.login.LoginScreen;
import EVMobile.PageObjects.skywalkerios.pages.order.OrderReportFlowScreenPropertyLocationScreen;
import EVMobile.PageObjects.skywalkerios.pages.WelcomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseMobileTest;

import java.awt.*;

import static java.lang.Thread.sleep;
import static org.testng.AssertJUnit.assertEquals;

public class DashboardScreenTests extends BaseMobileTest {

    /*

    private AccountManager manager;

    @Test(priority = 1)
    public void navigateToStartTest() throws InterruptedException, AWTException {
        WelcomeScreen welcomeScreen = new WelcomeScreen(getDriver());
        LoginScreen loginScreen = welcomeScreen.navigateToLoginScreen();
        DashBoardScreen dashBoardScreen = loginScreen.navigateToDashboard();
        sleep(2000);
        OrderReportFlowScreenPropertyLocationScreen orderReportFlowScreenPropertyLocationScreen = dashBoardScreen.navigateToOrderReportPropertyLocationScreen();
        Assert.assertTrue(orderReportFlowScreenPropertyLocationScreen.currentLocationButton.isEnabled());
    }

    public void showPremiumAccountTest() {
        User user = manager.getPremiumUser();
        navigator.loginWithAccount(user);

        DashBoardScreen dashBoardScreen = navigator.goToDashBoardScreen();

        Report report = user.getReport();
        navigator.goToReport(report);

        assertEquals("Premium & WallSite", report.getTitle());
    }

    */
}
