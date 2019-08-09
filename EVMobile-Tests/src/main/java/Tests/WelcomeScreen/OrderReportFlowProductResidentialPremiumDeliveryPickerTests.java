package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.*;
import EVMobile.PageObjects.skywalkerios.dashboard.DashBoardScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class OrderReportFlowProductResidentialPremiumDeliveryPickerTests extends BaseMobileTest {

    @Test(priority = 1)
    public void testRegularOptionSelectedByDefault() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen = new OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen(getDriver());
        orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.navigateFromNoAddOnToDeliveryProductScreen();
        Assert.assertTrue(orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 2)
    public void testSelectRegularShowMeasurementScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen = new OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen(getDriver());
        OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen orderReportFlowProductResidentialWallsMeasurementScopePickerScreen = orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.navigateToWallsMeasurementsPickerScreen(orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.regularDeliveryOption);
        Assert.assertTrue(orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 3)
    public void testSelectExpressShowMeasurementScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen = new OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen(getDriver());
        OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen orderReportFlowProductResidentialWallsMeasurementScopePickerScreen = orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.navigateToWallsMeasurementsPickerScreen(orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.expressDelivery);
        Assert.assertTrue(orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 4)
    public void testSelect3hoursShowMeasurementScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen = new OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen(getDriver());
        OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen orderReportFlowProductResidentialWallsMeasurementScopePickerScreen = orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.navigateToWallsMeasurementsPickerScreen(orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.hour3Delivery);
        Assert.assertTrue(orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 5)
    public void testCancelDiscardOrderGoesToDashboardScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen = new OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen(getDriver());
        DashBoardScreen dashBoardScreen = orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.cancelDiscardOrder();
        Assert.assertTrue(dashBoardScreen.dashboardForm.isEnabled());
    }

    @Test(priority = 6)
    public void testCancelContinueWithOrderRemainsInDeliveryPickerScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen = new OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen(getDriver());
        orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.cancelContinueWithOrder();
        Assert.assertTrue(orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 7)
    public void testNavigateBackToProductPickerResidentialScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen = new OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen(getDriver());
        OrderReportFlowProductResidentialAddOnProductPickerScreen orderReportFlowProductResidentialAddOnProductPickerScreen = orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.navigateBackToProductResidentialAddOnScreen();
        Assert.assertTrue(orderReportFlowProductResidentialAddOnProductPickerScreen.pageTitle.isEnabled());
    }
}
