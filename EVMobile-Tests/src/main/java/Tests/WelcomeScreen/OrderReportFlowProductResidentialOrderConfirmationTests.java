package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.*;
import EVMobile.PageObjects.skywalkerios.dashboard.DashBoardScreen;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

public class OrderReportFlowProductResidentialOrderConfirmationTests extends BaseMobileTest {

    @Test(priority = 1)
    public void testPrimarynoCancelBackButtonsEnabledOnConfirnmationOrder() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialOrderSubmittedScreen orderReportFlowProductResidentialOrderSubmittedScreen = new OrderReportFlowProductResidentialOrderSubmittedScreen(getDriver());
        orderReportFlowProductResidentialOrderSubmittedScreen.navigateFromCheckOuttoOrderSubmittedScreen();
        Assert.assertTrue(orderReportFlowProductResidentialOrderSubmittedScreen.pageTitle.isEnabled());
    }

    @Test(priority = 2) @Ignore
    public void testConfirmOrderandBackToDashboardScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialOrderSubmittedScreen orderReportFlowProductResidentialOrderSubmittedScreen = new OrderReportFlowProductResidentialOrderSubmittedScreen(getDriver());
        DashBoardScreen dashBoardScreen = orderReportFlowProductResidentialOrderSubmittedScreen.confirmOrderAndBackToDashboard();
        Assert.assertTrue(dashBoardScreen.dashboardForm.isEnabled());
    }
}
