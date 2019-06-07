package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.*;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

import static java.lang.Thread.sleep;

public class OrderReportFlowScreenAddressVerifierTests extends BaseMobileTest {

    @Test(priority = 1) @Ignore
    public void testEnterOrderDuplicateAddress() throws InterruptedException, AWTException {
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(getDriver());
        OrderReportFlowScreenDuplicateReportsView orderReportFlowScreenDuplicateReportsView = orderReportFlowScreenAddressVerifier.enterOrderDuplicateAddress();
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenDuplicateReportsView.pageTitle.isEnabled());
    }

    @Test(priority = 2) @Ignore
    public void testEnterOrderAccountWithOrdersOtherAddresses() throws InterruptedException, AWTException {
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(getDriver());
        OrderReportFlowScreenPreferredOrderView orderReportFlowScreenPreferredOrderView = orderReportFlowScreenAddressVerifier.enterOrderAccountWithPreexistingOrdersOthersAddresses();
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenPreferredOrderView.pageTitle.isEnabled());
    }

    @Test(priority = 3) @Ignore
    public void testEnterOrderAccountWithNoPreexistingOrder() throws InterruptedException, AWTException {
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(getDriver());
        OrderReportFlowScreenStructureClassificationPickerView orderReportFlowScreenStructureClassificationPickerView = orderReportFlowScreenAddressVerifier.enterOrderAccountWithNoPreexistingOrders();
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenStructureClassificationPickerView.commercialPropertyType.isEnabled());
    }

    @Test(priority = 4) @Ignore
    public void testNavigateToMapLegalScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(getDriver());
        MapLegalPage mapLegalPage = orderReportFlowScreenAddressVerifier.navigateToMapLegalPage();
        sleep(2000);
        Assert.assertTrue(mapLegalPage.ackhowledgementsSection.isEnabled());
    }

    @Test(priority = 5) @Ignore
    public void testCancelDiscardOrder() throws InterruptedException, AWTException {
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(getDriver());
        DashBoardScreen dashBoardScreen = orderReportFlowScreenAddressVerifier.cancelDiscardOrder();
        sleep(2000);
        Assert.assertTrue(dashBoardScreen.dashboardForm.isEnabled());
    }

    @Test(priority = 6) @Ignore
    public void testCancelContinueWithOrder() throws InterruptedException, AWTException {
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(getDriver());
        orderReportFlowScreenAddressVerifier.cancelContinueWithOrder();
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenAddressVerifier.legalLink.isEnabled());
    }

    @Test(priority = 7)
    public void testNavigateBackToPropertyLocationScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(getDriver());
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = orderReportFlowScreenAddressVerifier.navigateBackToPropertyLocationScreen();
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenPropertyLocation.cityField.getText().equals("Cupertino"));
    }
}
