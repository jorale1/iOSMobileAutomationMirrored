package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.*;
import EVMobile.PageObjects.skywalkerios.dashboard.DashBoardScreen;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

import static java.lang.Thread.sleep;

public class OrderReportFlowScreenStructureClassificationPickerTests extends BaseMobileTest {

    @Test(priority = 1) @Ignore
    public void testEnterResidentialDefaultCheckedOption() throws InterruptedException, AWTException {
        OrderReportFlowScreenStructureClassificationPickerView orderReportFlowScreenStructureClassificationPickerView = new OrderReportFlowScreenStructureClassificationPickerView(getDriver());
        orderReportFlowScreenStructureClassificationPickerView.navigateToSelectStructureScreen();
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenStructureClassificationPickerView.residentialPropertyType.getAttribute("value").equals("0"));
    }

    @Test(priority = 2) @Ignore
    public void testNavigateToCommercialStructureScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenStructureClassificationPickerView orderReportFlowScreenStructureClassificationPickerView = new OrderReportFlowScreenStructureClassificationPickerView(getDriver());
        OrderReportFlowScreenProductPickerViewCommercial orderReportFlowScreenProductPickerViewCommercial = orderReportFlowScreenStructureClassificationPickerView.navigateToCommercialScreen();
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenProductPickerViewCommercial.pageTitle.isEnabled());
    }

    @Test(priority = 3) @Ignore
    public void testNavigateToResidentialStructureScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenStructureClassificationPickerView orderReportFlowScreenStructureClassificationPickerView = new OrderReportFlowScreenStructureClassificationPickerView(getDriver());
        OrderReportFlowScreenProductPickerViewResidential orderReportFlowScreenProductPickerViewResidential = orderReportFlowScreenStructureClassificationPickerView.navigateToResidentialScreen();
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenProductPickerViewResidential.pageTitle.isEnabled());
    }

    @Test(priority = 4) @Ignore
    public void testNavigateToMultiFamilyStructureScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenStructureClassificationPickerView orderReportFlowScreenStructureClassificationPickerView = new OrderReportFlowScreenStructureClassificationPickerView(getDriver());
        OrderReportFlowScreenProductPickerViewMultiFamily orderReportFlowScreenProductPickerViewMultiFamily = orderReportFlowScreenStructureClassificationPickerView.navigateToMultiFamilyScreen();
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenProductPickerViewMultiFamily.pageTitle.isEnabled());
    }

    @Test(priority = 5)
    public void testCancelDiscardOrderGoesToDashboardScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenStructureClassificationPickerView orderReportFlowScreenStructureClassificationPickerView = new OrderReportFlowScreenStructureClassificationPickerView(getDriver());
        DashBoardScreen dashBoardScreen = orderReportFlowScreenStructureClassificationPickerView.cancelDiscardOrder();
        Assert.assertTrue(dashBoardScreen.dashboardForm.isEnabled());
    }

    @Test(priority = 6)
    public void testCancelContinueWithOrderRemainsinClassificationPickerScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenStructureClassificationPickerView orderReportFlowScreenStructureClassificationPickerView = new OrderReportFlowScreenStructureClassificationPickerView(getDriver());
        orderReportFlowScreenStructureClassificationPickerView.cancelContinueWithOrder();
        Assert.assertTrue(orderReportFlowScreenStructureClassificationPickerView.residentialPropertyType.isEnabled());
    }

    @Test(priority = 7)
    public void testNavigateBackToAddressVerifierScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenStructureClassificationPickerView orderReportFlowScreenStructureClassificationPickerView = new OrderReportFlowScreenStructureClassificationPickerView(getDriver());
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = orderReportFlowScreenStructureClassificationPickerView.navigateBackToAddressVerifierScreen();
        Assert.assertTrue(orderReportFlowScreenAddressVerifier.pageTitle.isEnabled());
    }
}
