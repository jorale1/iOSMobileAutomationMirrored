package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.*;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

public class OrderReportFlowProductResidentialPremiumRegularMeasurementsPickerTests extends BaseMobileTest {

    @Test(priority = 1)
    public void testPrimaryWithDetachedGarageSelectedByDefault() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen orderReportFlowProductResidentialWallsMeasurementScopePickerScreen = new OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen(getDriver());
        orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.navigateFromDeliveryProducToMeasurementstScreen();
        Assert.assertTrue(orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 2)
    public void testSelectPrimaryWithDetachedGarageShowsOrderDetailsScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen orderReportFlowProductResidentialWallsMeasurementScopePickerScreen = new OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen(getDriver());
        OrderReportFlowOrderDetailsViewScreen orderReportFlowOrderDetailsViewScreen = orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.navigateToOrderDetailsScreen(orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.primaryandDetachedGarage);
        Assert.assertTrue(orderReportFlowOrderDetailsViewScreen.pageTitle.isEnabled());
    }

    @Test(priority = 3)
    public void testSelectPrimaryStructureOnlyShowsOrderDetailsScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen orderReportFlowProductResidentialWallsMeasurementScopePickerScreen = new OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen(getDriver());
        OrderReportFlowOrderDetailsViewScreen orderReportFlowOrderDetailsViewScreen = orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.navigateToOrderDetailsScreen(orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.primaryStructureOnly);
        Assert.assertTrue(orderReportFlowOrderDetailsViewScreen.pageTitle.isEnabled());
    }

    @Test(priority = 4)
    public void testSelectAllStructuresOnParcelShowsOrderDetailsScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen orderReportFlowProductResidentialWallsMeasurementScopePickerScreen = new OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen(getDriver());
        OrderReportFlowOrderDetailsViewScreen orderReportFlowOrderDetailsViewScreen = orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.navigateToOrderDetailsScreen(orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.allStructureOnParcel);
        Assert.assertTrue(orderReportFlowOrderDetailsViewScreen.pageTitle.isEnabled());
    }

    @Test(priority = 5)
    public void testSelectOtherShowsOrderDetailsScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen orderReportFlowProductResidentialWallsMeasurementScopePickerScreen = new OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen(getDriver());
        OrderReportFlowOrderDetailsViewScreen orderReportFlowOrderDetailsViewScreen = orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.navigateToOrderDetailsScreen(orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.otherStructures);
        Assert.assertTrue(orderReportFlowOrderDetailsViewScreen.pageTitle.isEnabled());
    }

    @Test(priority = 6)
    public void testCancelDiscardOrderGoesToDashboardScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen orderReportFlowProductResidentialWallsMeasurementScopePickerScreen = new OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen(getDriver());
        DashBoardScreen dashBoardScreen = orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.cancelDiscardOrder();
        Assert.assertTrue(dashBoardScreen.dashboardForm.isEnabled());
    }

    @Test(priority = 7)
    public void testCancelContinueWithOrderRemainsInMeasurementPickerScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen orderReportFlowProductResidentialWallsMeasurementScopePickerScreen = new OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen(getDriver());
        orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.cancelContinueWithOrder();
        Assert.assertTrue(orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 8)
    public void testSpecialInstructionsFieldIsEnabled() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen orderReportFlowProductResidentialWallsMeasurementScopePickerScreen = new OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen(getDriver());
        orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.specialInstructionisEnabled();
        Assert.assertTrue(orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.specialInstructionsTextBox.getText().equals("test"));
    }

    @Test(priority = 9)
    public void testNavigateBackToDeliveryPickerScreen() throws InterruptedException, AWTException {
        OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen orderReportFlowProductResidentialWallsMeasurementScopePickerScreen = new OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen(getDriver());
        OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen = orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.navigateBackToDeliveryProductPickerScreen();
        Assert.assertTrue(orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.pageTitle.isEnabled());
    }
}
