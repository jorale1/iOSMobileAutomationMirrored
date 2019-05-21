package Tests.WelcomeScreen;

import EVMobile.Framework.core.BaseTest;
import EVMobile.PageObjects.skywalkerios.DashBoardScreen;
import EVMobile.PageObjects.skywalkerios.LoginScreen;
import EVMobile.PageObjects.skywalkerios.OrderReportFlowScreenPropertyLocation;
import EVMobile.PageObjects.skywalkerios.WelcomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static java.lang.Thread.sleep;

public class DashboardScreenTests extends BaseTest {

    @Test(priority = 1)
    public void navigateToStartTest() throws InterruptedException, AWTException {
        WelcomeScreen welcomeScreen = new WelcomeScreen(getDriver());
        LoginScreen loginScreen = welcomeScreen.navigateToLoginScreen();
        DashBoardScreen dashBoardScreen = loginScreen.navigateToDashboard();
        sleep(3000);
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = dashBoardScreen.navigateToOrderReportPropertyLocationScreen();
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenPropertyLocation.currentLocationButton.isEnabled());
    }

}
