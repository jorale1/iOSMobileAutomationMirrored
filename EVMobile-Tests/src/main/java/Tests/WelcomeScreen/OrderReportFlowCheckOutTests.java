package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.*;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

public class OrderReportFlowCheckOutTests extends BaseMobileTest {

    @Test(priority = 1) @Ignore
    public void testPrimaryWithDetachedGarageSelectedByDefault() throws InterruptedException, AWTException {
        OrderReportFlowCheckOutViewScreen orderReportFlowCheckOutViewScreen = new OrderReportFlowCheckOutViewScreen(getDriver());
        orderReportFlowCheckOutViewScreen.navigateFromOrderDetailsToCheckOutScreen();
        Assert.assertTrue(orderReportFlowCheckOutViewScreen.pageTitle.isEnabled());
    }

    @Test(priority = 2) @Ignore
    public void testNavigateToEditProductType() throws InterruptedException, AWTException {
        OrderReportFlowCheckOutViewScreen orderReportFlowCheckOutViewScreen = new OrderReportFlowCheckOutViewScreen(getDriver());
        OrderReportFlowScreenProductPickerViewResidential orderReportFlowScreenProductPickerViewResidential = orderReportFlowCheckOutViewScreen.navigateToEditProductType();
        Assert.assertTrue(orderReportFlowScreenProductPickerViewResidential.pageTitle.isEnabled());
    }

    @Test(priority = 3) @Ignore
    public void testNavigateToEditDeliveryType() throws InterruptedException, AWTException {
        OrderReportFlowCheckOutViewScreen orderReportFlowCheckOutViewScreen = new OrderReportFlowCheckOutViewScreen(getDriver());
        OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen = orderReportFlowCheckOutViewScreen.navigateToEditDeliveryType();
        Assert.assertTrue(orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 4) @Ignore
    public void testNavigateToEditStructureMeasurementType() throws InterruptedException, AWTException {
        OrderReportFlowCheckOutViewScreen orderReportFlowCheckOutViewScreen = new OrderReportFlowCheckOutViewScreen(getDriver());
        OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen orderReportFlowProductResidentialWallsMeasurementScopePickerScreen = orderReportFlowCheckOutViewScreen.navigateToEditStructureMeasurementType();
        Assert.assertTrue(orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 5) @Ignore
    public void testNavigateToEditAddOnWalls() throws InterruptedException, AWTException {
        OrderReportFlowCheckOutViewScreen orderReportFlowCheckOutViewScreen = new OrderReportFlowCheckOutViewScreen(getDriver());
        OrderReportFlowProductResidentialAddOnProductPickerScreen orderReportFlowProductResidentialAddOnProductPickerScreen = orderReportFlowCheckOutViewScreen.navigateToEditAddOnWalls();
        Assert.assertTrue(orderReportFlowProductResidentialAddOnProductPickerScreen.editPageTitle.isEnabled());
    }

    @Test(priority = 6) @Ignore
    public void testNavigateToEditBillingInformation() throws InterruptedException, AWTException {
        OrderReportFlowCheckOutViewScreen orderReportFlowCheckOutViewScreen = new OrderReportFlowCheckOutViewScreen(getDriver());
        OrderReportFlowBillingInformationScreen orderReportFlowBillingInformationScreen = orderReportFlowCheckOutViewScreen.navigatetoAddPaymentScreen();
        Assert.assertTrue(orderReportFlowBillingInformationScreen.pageTitle.isEnabled());
    }

    @Test(priority = 7) @Ignore
    public void testNavigateToEditPromoCode() throws InterruptedException, AWTException {
        OrderReportFlowCheckOutViewScreen orderReportFlowCheckOutViewScreen = new OrderReportFlowCheckOutViewScreen(getDriver());
        OrderReportFlowPromoCodeScreen orderReportFlowPromoCodeScreen = orderReportFlowCheckOutViewScreen.navigatetoAddPromoCodeScreen();
        Assert.assertTrue(orderReportFlowPromoCodeScreen.pageTitle.isEnabled());
    }


    @Test(priority = 7)
    public void testCancelDiscardOrderGoesToDashboardScreen() throws InterruptedException, AWTException {
        OrderReportFlowCheckOutViewScreen orderReportFlowCheckOutViewScreen = new OrderReportFlowCheckOutViewScreen(getDriver());
        DashBoardScreen dashBoardScreen = orderReportFlowCheckOutViewScreen.cancelDiscardOrder();
        Assert.assertTrue(dashBoardScreen.dashboardForm.isEnabled());
    }

    @Test(priority = 8)
    public void testCancelContinueWithOrderRemainsInCheckOutScreen() throws InterruptedException, AWTException {
        OrderReportFlowCheckOutViewScreen orderReportFlowCheckOutViewScreen = new OrderReportFlowCheckOutViewScreen(getDriver());
        orderReportFlowCheckOutViewScreen.cancelContinueWithOrder();
        Assert.assertTrue(orderReportFlowCheckOutViewScreen.pageTitle.isEnabled());
    }

    @Test(priority = 9) @Ignore
    public void testNavigateBackToOrderDetailsScreen() throws InterruptedException, AWTException {
        OrderReportFlowCheckOutViewScreen orderReportFlowCheckOutViewScreen = new OrderReportFlowCheckOutViewScreen(getDriver());
        OrderReportFlowOrderDetailsViewScreen orderReportFlowOrderDetailsViewScreen = orderReportFlowCheckOutViewScreen.navigateBackToOrderDetailsScreen();
        Assert.assertTrue(orderReportFlowOrderDetailsViewScreen.pageTitle.isEnabled());
    }

    @Test(priority = 10) @Ignore
    public void testNavigateToOrderSubmittedScreen() throws InterruptedException, AWTException {
        OrderReportFlowCheckOutViewScreen orderReportFlowCheckOutViewScreen = new OrderReportFlowCheckOutViewScreen(getDriver());
        OrderReportFlowProductResidentialOrderSubmittedScreen orderReportFlowProductResidentialOrderSubmittedScreen = orderReportFlowCheckOutViewScreen.navigatetoOrderSubmittedScreen();
        Assert.assertTrue(orderReportFlowProductResidentialOrderSubmittedScreen.pageTitle.isEnabled());
    }
}
