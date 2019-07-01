package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.*;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

public class OrderReportFlowOrderDetailsTests extends BaseMobileTest {

    @Test(priority = 1)
    public void testPrimaryWithDetachedGarageSelectedByDefault() throws InterruptedException, AWTException {
        OrderReportFlowOrderDetailsViewScreen orderReportFlowOrderDetailsViewScreen = new OrderReportFlowOrderDetailsViewScreen(getDriver());
        orderReportFlowOrderDetailsViewScreen.navigateFromMeasurementPickerToOrderDetailsScreen();
        Assert.assertTrue(orderReportFlowOrderDetailsViewScreen.pageTitle.isEnabled());
    }

    @Test(priority = 2)
    public void testNavigateToPhotosScreen() throws InterruptedException, AWTException {
        OrderReportFlowOrderDetailsViewScreen orderReportFlowOrderDetailsViewScreen = new OrderReportFlowOrderDetailsViewScreen(getDriver());
        OrderReportFlowOrderDetailsPhotosScreen orderReportFlowOrderDetailsPhotosScreen = orderReportFlowOrderDetailsViewScreen.navigateToPhotosScreen();
        Assert.assertTrue(orderReportFlowOrderDetailsPhotosScreen.pageTitle.isEnabled());
    }

    @Test(priority = 3)
    public void testNavigateToClaimInformationScreen() throws InterruptedException, AWTException {
        OrderReportFlowOrderDetailsViewScreen orderReportFlowOrderDetailsViewScreen = new OrderReportFlowOrderDetailsViewScreen(getDriver());
        OrderReportFlowOrderDetailsClaimInfoScreen orderReportFlowOrderDetailsClaimInfoScreen = orderReportFlowOrderDetailsViewScreen.navigateToClaimInformationScreen();
        Assert.assertTrue(orderReportFlowOrderDetailsClaimInfoScreen.pageTitle.isEnabled());
    }

    @Test(priority = 4)
    public void testNavigateToEmailRecipientsScreen() throws InterruptedException, AWTException {
        OrderReportFlowOrderDetailsViewScreen orderReportFlowOrderDetailsViewScreen = new OrderReportFlowOrderDetailsViewScreen(getDriver());
        OrderReportFlowOrderDetailsEmailRecipientsScreen orderReportFlowOrderDetailsEmailRecipientsScreen = orderReportFlowOrderDetailsViewScreen.navigateToEmailRecipientsScreen();
        Assert.assertTrue(orderReportFlowOrderDetailsEmailRecipientsScreen.pageTitle.isEnabled());
    }

    @Test(priority = 5)
    public void testNavigateToProjectNameScreen() throws InterruptedException, AWTException {
        OrderReportFlowOrderDetailsViewScreen orderReportFlowOrderDetailsViewScreen = new OrderReportFlowOrderDetailsViewScreen(getDriver());
        OrderReportFlowOrderDetailsProjectNameScreen orderReportFlowOrderDetailsProjectNameScreen = orderReportFlowOrderDetailsViewScreen.navigateToProjectNameScreen();
        Assert.assertTrue(orderReportFlowOrderDetailsProjectNameScreen.pageTitle.isEnabled());
    }

    @Test(priority = 6)
    public void testNavigateToBuildingIDScreen() throws InterruptedException, AWTException {
        OrderReportFlowOrderDetailsViewScreen orderReportFlowOrderDetailsViewScreen = new OrderReportFlowOrderDetailsViewScreen(getDriver());
        OrderReportFlowOrderDetailsBuildingIDScreen orderReportFlowOrderDetailsBuildingIDScreen = orderReportFlowOrderDetailsViewScreen.navigateToBuildingIDScreen();
        Assert.assertTrue(orderReportFlowOrderDetailsBuildingIDScreen.pageTitle.isEnabled());
    }

    @Test(priority = 7)
    public void testCancelDiscardOrderGoesToDashboardScreen() throws InterruptedException, AWTException {
        OrderReportFlowOrderDetailsViewScreen orderReportFlowOrderDetailsViewScreen = new OrderReportFlowOrderDetailsViewScreen(getDriver());
        DashBoardScreen dashBoardScreen = orderReportFlowOrderDetailsViewScreen.cancelDiscardOrder();
        Assert.assertTrue(dashBoardScreen.dashboardForm.isEnabled());
    }

    @Test(priority = 8)
    public void testCancelContinueWithOrderRemainsInMeasurementPickerScreen() throws InterruptedException, AWTException {
        OrderReportFlowOrderDetailsViewScreen orderReportFlowOrderDetailsViewScreen = new OrderReportFlowOrderDetailsViewScreen(getDriver());
        orderReportFlowOrderDetailsViewScreen.cancelContinueWithOrder();
        Assert.assertTrue(orderReportFlowOrderDetailsViewScreen.pageTitle.isEnabled());
    }

    @Test(priority = 9)
    public void testNavigateBackToDeliveryPickerScreen() throws InterruptedException, AWTException {
        OrderReportFlowOrderDetailsViewScreen orderReportFlowOrderDetailsViewScreen = new OrderReportFlowOrderDetailsViewScreen(getDriver());
        OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen orderReportFlowProductResidentialWallsMeasurementScopePickerScreen = orderReportFlowOrderDetailsViewScreen.navigateBackToMeasurementScopePickerScreen();
        Assert.assertTrue(orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 10)
    public void testNavigateToCheckOutScreen() throws InterruptedException, AWTException {
        OrderReportFlowOrderDetailsViewScreen orderReportFlowOrderDetailsViewScreen = new OrderReportFlowOrderDetailsViewScreen(getDriver());
        OrderReportFlowProductResidentialCheckOutScreen orderReportFlowProductResidentialCheckOutScreen= orderReportFlowOrderDetailsViewScreen.navigateToCheckOutScreen();
        Assert.assertTrue(orderReportFlowProductResidentialCheckOutScreen.pageTitle.isEnabled());
    }
}
