package tests.order;

import EVMobile.PageObjects.skywalkerios.pages.dashboard.DashBoardScreen;
import EVMobile.PageObjects.skywalkerios.pages.order.OrderReportFlowAddressVerifierScreen;
import EVMobile.PageObjects.skywalkerios.pages.order.OrderReportFlowScreenPropertyLocationScreen;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import tests.BaseMobileTest;

import java.awt.*;

import static java.lang.Thread.sleep;

public class OrderReportFlowScreenPropertyLocationScreenTests extends BaseMobileTest {

    /*

    @Test(priority = 1) @Ignore
    public void testAllowDeviceLocationModalshown() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocationScreen orderReportFlowScreenPropertyLocationScreen = new OrderReportFlowScreenPropertyLocationScreen(getDriver());
        orderReportFlowScreenPropertyLocationScreen.allowLocationAccesModal();
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenPropertyLocationScreen.systemAllowLocationAccess.isEnabled());
    }

    @Test(priority = 2) @Ignore
    public void testDoesNotAllowDeviceLocation() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocationScreen orderReportFlowScreenPropertyLocationScreen = new OrderReportFlowScreenPropertyLocationScreen(getDriver());
        orderReportFlowScreenPropertyLocationScreen.allowLocationAccesModal();
        sleep(2000);
        orderReportFlowScreenPropertyLocationScreen.systemLocationDontAllow.click();
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenPropertyLocationScreen.cityField.getText().equals("City"));
    }

    @Test(priority = 3) @Ignore
    public void testAllowDeviceLocation() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocationScreen orderReportFlowScreenPropertyLocationScreen = new OrderReportFlowScreenPropertyLocationScreen(getDriver());
        orderReportFlowScreenPropertyLocationScreen.allowLocationAccesModal();
        sleep(2000);
        orderReportFlowScreenPropertyLocationScreen.systemLocationAllow.click();
        sleep(2000);
        Assert.assertTrue(!orderReportFlowScreenPropertyLocationScreen.cityField.getText().equals("City"));
    }

    @Test(priority = 4) @Ignore
    public void testClickNextwithEmptyFields() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocationScreen orderReportFlowScreenPropertyLocationScreen = new OrderReportFlowScreenPropertyLocationScreen(getDriver());
        orderReportFlowScreenPropertyLocationScreen.enterLocation("", "", "", "");
        orderReportFlowScreenPropertyLocationScreen.clickOnNextButton();
        Assert.assertTrue(orderReportFlowScreenPropertyLocationScreen.cityField.isEnabled());
    }

    @Test(priority = 5) @Ignore
    public void testEnteringOnlyZipCodeOnlyStreetIsMandatory() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocationScreen orderReportFlowScreenPropertyLocationScreen = new OrderReportFlowScreenPropertyLocationScreen(getDriver());
        orderReportFlowScreenPropertyLocationScreen.enterLocation("", "", "", "95014");
        orderReportFlowScreenPropertyLocationScreen.clickOnNextButton();
        Assert.assertTrue(orderReportFlowScreenPropertyLocationScreen.cityField.isEnabled());
    }

    @Test(priority = 6) @Ignore
    public void testEnteringCityAndStateStreetIsMandatory() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocationScreen orderReportFlowScreenPropertyLocationScreen = new OrderReportFlowScreenPropertyLocationScreen(getDriver());
        orderReportFlowScreenPropertyLocationScreen.enterLocation("", "Cupertino", "California", "");
        orderReportFlowScreenPropertyLocationScreen.clickOnNextButton();
        Assert.assertTrue(orderReportFlowScreenPropertyLocationScreen.cityField.isEnabled());
    }

    @Test(priority = 7) @Ignore
    public void testInvalidZipCodeEntered() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocationScreen orderReportFlowScreenPropertyLocationScreen = new OrderReportFlowScreenPropertyLocationScreen(getDriver());
        orderReportFlowScreenPropertyLocationScreen.enterLocation("2 Infinity Loop", "", "California", "11111");
        orderReportFlowScreenPropertyLocationScreen.keyboardDone.click();
        orderReportFlowScreenPropertyLocationScreen.clickOnNextButton();
        sleep(9000);
        Assert.assertTrue(orderReportFlowScreenPropertyLocationScreen.cityField.isEnabled());
    }

    @Test(priority = 8) @Ignore
    public void testEnteringZipandStreetThenStateCityNotRequired() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocationScreen orderReportFlowScreenPropertyLocationScreen = new OrderReportFlowScreenPropertyLocationScreen(getDriver());
        orderReportFlowScreenPropertyLocationScreen.enterLocation("2 Infinity Loop", "", "", "95014");
        orderReportFlowScreenPropertyLocationScreen.keyboardDone.click();
        orderReportFlowScreenPropertyLocationScreen.clickOnNextButton();
        OrderReportFlowAddressVerifierScreen orderReportFlowAddressVerifierScreen = new OrderReportFlowAddressVerifierScreen(getDriver());
        sleep(2000);
        Assert.assertTrue(orderReportFlowAddressVerifierScreen.legalLink.isEnabled());
    }

    @Test(priority = 9) @Ignore
    public void testEnteringStreetCityStateThenZipNotRequired() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocationScreen orderReportFlowScreenPropertyLocationScreen = new OrderReportFlowScreenPropertyLocationScreen(getDriver());
        orderReportFlowScreenPropertyLocationScreen.enterLocation("2 Infinity Loop", "Cupertino", "California", "");
        orderReportFlowScreenPropertyLocationScreen.keyboardDone.click();
        orderReportFlowScreenPropertyLocationScreen.clickOnNextButton();
        OrderReportFlowAddressVerifierScreen orderReportFlowAddressVerifierScreen = new OrderReportFlowAddressVerifierScreen(getDriver());
        sleep(2000);
        Assert.assertTrue(orderReportFlowAddressVerifierScreen.legalLink.isEnabled());
    }

    @Test(priority = 10) @Ignore
    public void testValidLocationEntered() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocationScreen orderReportFlowScreenPropertyLocationScreen = new OrderReportFlowScreenPropertyLocationScreen(getDriver());
        orderReportFlowScreenPropertyLocationScreen.enterLocation("2 Infinity Loop", "Cupertino", "California", "95014");
        orderReportFlowScreenPropertyLocationScreen.keyboardDone.click();
        orderReportFlowScreenPropertyLocationScreen.clickOnNextButton();
        OrderReportFlowAddressVerifierScreen orderReportFlowAddressVerifierScreen = new OrderReportFlowAddressVerifierScreen(getDriver());
        sleep(2000);
        Assert.assertTrue(orderReportFlowAddressVerifierScreen.legalLink.isEnabled());
    }

    @Test(priority = 11) @Ignore
    public void testNavigateBackToDashboardScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocationScreen orderReportFlowScreenPropertyLocationScreen = new OrderReportFlowScreenPropertyLocationScreen(getDriver());
        DashBoardScreen dashBoardScreen = orderReportFlowScreenPropertyLocationScreen.navigateBackToDashboardScreen();
        sleep(2000);
        Assert.assertTrue(dashBoardScreen.settingsButton.isEnabled());
    }

    @Test(priority = 12)
    public void testEnteringZipandStreetThenStateIsNotRequiredCanada() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocationScreen orderReportFlowScreenPropertyLocationScreen = new OrderReportFlowScreenPropertyLocationScreen(getDriver());
        orderReportFlowScreenPropertyLocationScreen.enterLocation("1950 Meadowvale Blvd", "", "", "L5N8L9");
        orderReportFlowScreenPropertyLocationScreen.keyboardDone.click();
        orderReportFlowScreenPropertyLocationScreen.keyboardDone.click();
        orderReportFlowScreenPropertyLocationScreen.clickOnNextButton();
        OrderReportFlowAddressVerifierScreen orderReportFlowAddressVerifierScreen = new OrderReportFlowAddressVerifierScreen(getDriver());
        sleep(2000);
        Assert.assertTrue(orderReportFlowAddressVerifierScreen.legalLink.isEnabled());
    }
    @Test(priority = 13)
    public void testEnteringStreetCityStateThenZIPISNotRequiredCanada() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocationScreen orderReportFlowScreenPropertyLocationScreen = new OrderReportFlowScreenPropertyLocationScreen(getDriver());
        orderReportFlowScreenPropertyLocationScreen.enterLocation("1950 Meadowvale Blvd", "Mississagua", "Ontario", "");
        orderReportFlowScreenPropertyLocationScreen.keyboardDone.click();
        orderReportFlowScreenPropertyLocationScreen.clickOnNextButton();
        OrderReportFlowAddressVerifierScreen orderReportFlowAddressVerifierScreen = new OrderReportFlowAddressVerifierScreen(getDriver());
        sleep(2000);
        Assert.assertTrue(orderReportFlowAddressVerifierScreen.legalLink.isEnabled());
    }
    */
}
