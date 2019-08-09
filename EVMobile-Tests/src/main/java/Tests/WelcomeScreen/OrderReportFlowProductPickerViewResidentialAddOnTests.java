package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.*;
import EVMobile.PageObjects.skywalkerios.dashboard.DashBoardScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class OrderReportFlowProductPickerViewResidentialAddOnTests extends BaseMobileTest {

    @Test(priority = 1)
    public void testnoAddOnReportCheckedOption() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialAddOnProductPickerScreen orderReportFlowProductResidentialAddOnProductPickerScreen = new OrderReportFlowProductResidentialAddOnProductPickerScreen(getDriver());
        orderReportFlowProductResidentialAddOnProductPickerScreen.navigateToSelectAddOnScreen();
        Assert.assertTrue(orderReportFlowProductResidentialAddOnProductPickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 2)
    public void testNavigateToDeliveryProductPickerScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialAddOnProductPickerScreen orderReportFlowProductResidentialAddOnProductPickerScreen = new OrderReportFlowProductResidentialAddOnProductPickerScreen(getDriver());
        OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen = orderReportFlowProductResidentialAddOnProductPickerScreen.navigateToDeliveryProductPickerScreen();
        Assert.assertTrue(orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 3)
    public void testNavigateToMeasurementScopePickerScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialAddOnProductPickerScreen orderReportFlowProductResidentialAddOnProductPickerScreen = new OrderReportFlowProductResidentialAddOnProductPickerScreen(getDriver());
        OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen orderReportFlowProductResidentialWallsMeasurementScopePickerScreen = orderReportFlowProductResidentialAddOnProductPickerScreen.navigateToMeasurementScopePickerScreen();
        Assert.assertTrue(orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 4)
    public void testCancelDiscardOrderGoesToDashboardScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialAddOnProductPickerScreen orderReportFlowProductResidentialAddOnProductPickerScreen = new OrderReportFlowProductResidentialAddOnProductPickerScreen(getDriver());
        DashBoardScreen dashBoardScreen = orderReportFlowProductResidentialAddOnProductPickerScreen.cancelDiscardOrder();
        Assert.assertTrue(dashBoardScreen.dashboardForm.isEnabled());
    }

    @Test(priority = 5)
    public void testCancelContinueWithOrderRemainsinAdOnProductPickerScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialAddOnProductPickerScreen orderReportFlowProductResidentialAddOnProductPickerScreen = new OrderReportFlowProductResidentialAddOnProductPickerScreen(getDriver());
        orderReportFlowProductResidentialAddOnProductPickerScreen.cancelContinueWithOrder();
        Assert.assertTrue(orderReportFlowProductResidentialAddOnProductPickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 6)
    public void testNavigateBackToProductPickerResidentialScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialAddOnProductPickerScreen orderReportFlowProductResidentialAddOnProductPickerScreen = new OrderReportFlowProductResidentialAddOnProductPickerScreen(getDriver());
        OrderReportFlowScreenProductPickerViewResidential orderReportFlowScreenProductPickerViewResidential = orderReportFlowProductResidentialAddOnProductPickerScreen.navigateBackToProductPickerResidentialScreen();
        Assert.assertTrue(orderReportFlowScreenProductPickerViewResidential.pageTitle.isEnabled());
    }
}
