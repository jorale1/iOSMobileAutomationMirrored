package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.DashBoardScreen;
import EVMobile.PageObjects.skywalkerios.LoginScreen;
import EVMobile.PageObjects.skywalkerios.OrderReportFlowScreenPropertyLocation;
import EVMobile.PageObjects.skywalkerios.WelcomeScreen;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

import static java.lang.Thread.sleep;

public class OrderReportFlowScreenPropertyLocationTests extends BaseMobileTest {

    @Test(priority = 1)
    public void navigateToStartTest() throws InterruptedException, AWTException {
        WelcomeScreen welcomeScreen = new WelcomeScreen(getDriver());
        LoginScreen loginScreen = welcomeScreen.navigateToLoginScreen();
        DashBoardScreen dashBoardScreen = loginScreen.navigateToDashboard();
        sleep(2000);
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = dashBoardScreen.navigateToOrderReportPropertyLocationScreen();
        sleep(9000);;
        Assert.assertTrue(orderReportFlowScreenPropertyLocation.cityField.isEnabled());
    }

    @Test(priority = 2) @Ignore
    public void testNavigateBackToDashboardScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(getDriver());
        DashBoardScreen dashBoardScreen = orderReportFlowScreenPropertyLocation.navigateBackToDashboardScreen();
        Assert.assertTrue(dashBoardScreen.settingsButton.isEnabled());
    }
}
