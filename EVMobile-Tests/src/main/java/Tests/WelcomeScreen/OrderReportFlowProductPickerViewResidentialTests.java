package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.*;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

import static java.lang.Thread.sleep;

public class OrderReportFlowProductPickerViewResidentialTests extends BaseMobileTest {

    @Test(priority = 1) @Ignore
    public void testEnterResidentialDefaultCheckedOption() throws InterruptedException, AWTException {
        OrderReportFlowScreenProductPickerViewResidential orderReportFlowScreenProductPickerViewResidential = new OrderReportFlowScreenProductPickerViewResidential(getDriver());
        orderReportFlowScreenProductPickerViewResidential.navigateToProductPickerResidentialScreen();
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenProductPickerViewResidential.pageTitle.isEnabled());
    }

    @Test(priority = 2) @Ignore
    public void testNavigateToAddOnProductPickerScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenProductPickerViewResidential orderReportFlowScreenProductPickerViewResidential = new OrderReportFlowScreenProductPickerViewResidential(getDriver());
        OrderReportFlowProductResidentialAddOnProductPickerScreen orderReportFlowProductResidentialAddOnProductPickerScreen = orderReportFlowScreenProductPickerViewResidential.navigateToAddOnProductPickerScreen();
        Assert.assertTrue(orderReportFlowProductResidentialAddOnProductPickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 3) @Ignore
    public void testNavigateToMeasurementScopePickerScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenProductPickerViewResidential orderReportFlowScreenProductPickerViewResidential = new OrderReportFlowScreenProductPickerViewResidential(getDriver());
        OrderReportFlowProductResidentialMeasurementScopePickerScreen orderReportFlowProductResidentialMeasurementScopePickerScreen = orderReportFlowScreenProductPickerViewResidential.navigateToMeasurementScopePickerScreen();
        Assert.assertTrue(orderReportFlowProductResidentialMeasurementScopePickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 4) @Ignore
    public void testNavigateToDeliveryProductPickerScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenProductPickerViewResidential orderReportFlowScreenProductPickerViewResidential = new OrderReportFlowScreenProductPickerViewResidential(getDriver());
        OrderReportFlowProductResidentialDeliveryProductPickerScreen orderReportFlowProductResidentialDeliveryProductPickerScreen = orderReportFlowScreenProductPickerViewResidential.navigateToDeliveryProductPickerScreen();
        Assert.assertTrue(orderReportFlowProductResidentialDeliveryProductPickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 5)
    public void testNavigateToSunsiteDeliveryProductPickerScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenProductPickerViewResidential orderReportFlowScreenProductPickerViewResidential = new OrderReportFlowScreenProductPickerViewResidential(getDriver());
        OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen = orderReportFlowScreenProductPickerViewResidential.navigateToSunsiteDeliveryProductPickerScreen();
        Assert.assertTrue(orderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 6) @Ignore
    public void testNavigateToWallsMeasurementScopePickerScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenProductPickerViewResidential orderReportFlowScreenProductPickerViewResidential = new OrderReportFlowScreenProductPickerViewResidential(getDriver());
        OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen orderReportFlowProductResidentialWallsMeasurementScopePickerScreen = orderReportFlowScreenProductPickerViewResidential.navigateToWallsMeasurementScopePickerScreen();
        Assert.assertTrue(orderReportFlowProductResidentialWallsMeasurementScopePickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 7) @Ignore
    public void testNavigateToWallsLiteMeasurementScopePickerScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenProductPickerViewResidential orderReportFlowScreenProductPickerViewResidential = new OrderReportFlowScreenProductPickerViewResidential(getDriver());
        OrderReportFlowProductResidentialWallsLiteMeasurementScopePickerScreen orderReportFlowProductResidentialWallsLiteMeasurementScopePickerScreen = orderReportFlowScreenProductPickerViewResidential.navigateToWallsLiteMeasurementScopePickerScreen();
        Assert.assertTrue(orderReportFlowProductResidentialWallsLiteMeasurementScopePickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 8) @Ignore
    public void testNavigateToGutterDeliveryProductPickerScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenProductPickerViewResidential orderReportFlowScreenProductPickerViewResidential = new OrderReportFlowScreenProductPickerViewResidential(getDriver());
        OrderReportFlowProductResidentialGutterDeliveryProductPickerScreen orderReportFlowProductResidentialGutterDeliveryProductPickerScreen = orderReportFlowScreenProductPickerViewResidential.navigateToGutterDeliveryProductPickerScreen();
        Assert.assertTrue(orderReportFlowProductResidentialGutterDeliveryProductPickerScreen.pageTitle.isEnabled());
    }

    @Test(priority = 9) @Ignore
    public void testCancelDiscardOrderGoesToDashboardScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenProductPickerViewResidential orderReportFlowScreenProductPickerViewResidential = new OrderReportFlowScreenProductPickerViewResidential(getDriver());
        DashBoardScreen dashBoardScreen = orderReportFlowScreenProductPickerViewResidential.cancelDiscardOrder();
        Assert.assertTrue(dashBoardScreen.dashboardForm.isEnabled());
    }

    @Test(priority = 10) @Ignore
    public void testCancelContinueWithOrderRemainsinClassificationPickerScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenProductPickerViewResidential orderReportFlowScreenProductPickerViewResidential = new OrderReportFlowScreenProductPickerViewResidential(getDriver());
        orderReportFlowScreenProductPickerViewResidential.cancelContinueWithOrder();
        Assert.assertTrue(orderReportFlowScreenProductPickerViewResidential.pageTitle.isEnabled());
    }

    @Test(priority = 11) @Ignore
    public void testNavigateBackToAddressVerifierScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenProductPickerViewResidential orderReportFlowScreenProductPickerViewResidential = new OrderReportFlowScreenProductPickerViewResidential(getDriver());
        OrderReportFlowScreenStructureClassificationPickerView orderReportFlowScreenStructureClassificationPickerView = orderReportFlowScreenProductPickerViewResidential.navigateBackToStructureClassificationScreen();
        Assert.assertTrue(orderReportFlowScreenStructureClassificationPickerView.residentialPropertyType.isEnabled());
    }
}
