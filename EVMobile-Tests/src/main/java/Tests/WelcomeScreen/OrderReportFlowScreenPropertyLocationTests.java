package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.DashBoardScreen;
import EVMobile.PageObjects.skywalkerios.OrderReportFlowScreenAddressVerifier;
import EVMobile.PageObjects.skywalkerios.OrderReportFlowScreenPropertyLocation;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

import static java.lang.Thread.sleep;

public class OrderReportFlowScreenPropertyLocationTests extends BaseMobileTest {

    @Test(priority = 1) @Ignore
    public void testAllowDeviceLocationModalshown() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(getDriver());
        orderReportFlowScreenPropertyLocation.allowLocationAccesModal();
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenPropertyLocation.systemAllowLocationAccess.isEnabled());
    }

    @Test(priority = 2) @Ignore
    public void testDoesNotAllowDeviceLocation() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(getDriver());
        orderReportFlowScreenPropertyLocation.allowLocationAccesModal();
        sleep(2000);
        orderReportFlowScreenPropertyLocation.systemLocationDontAllow.click();
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenPropertyLocation.cityField.getText().equals("City"));
    }

    @Test(priority = 3) @Ignore
    public void testAllowDeviceLocation() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(getDriver());
        orderReportFlowScreenPropertyLocation.allowLocationAccesModal();
        sleep(2000);
        orderReportFlowScreenPropertyLocation.systemLocationAllow.click();
        sleep(2000);
        Assert.assertTrue(!orderReportFlowScreenPropertyLocation.cityField.getText().equals("City"));
    }

    @Test(priority = 4) @Ignore
    public void testClickNextwithEmptyFields() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(getDriver());
        orderReportFlowScreenPropertyLocation.enterLocation("", "", "", "");
        orderReportFlowScreenPropertyLocation.clickOnNextbutton();
        Assert.assertTrue(orderReportFlowScreenPropertyLocation.cityField.isEnabled());
    }

    @Test(priority = 5) @Ignore
    public void testEnteringOnlyZipCodeOnlyStreetIsMandatory() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(getDriver());
        orderReportFlowScreenPropertyLocation.enterLocation("", "", "", "95014");
        orderReportFlowScreenPropertyLocation.clickOnNextbutton();
        Assert.assertTrue(orderReportFlowScreenPropertyLocation.cityField.isEnabled());
    }

    @Test(priority = 6) @Ignore
    public void testEnteringCityAndStateStreetIsMandatory() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(getDriver());
        orderReportFlowScreenPropertyLocation.enterLocation("", "Cupertino", "California", "");
        orderReportFlowScreenPropertyLocation.clickOnNextbutton();
        Assert.assertTrue(orderReportFlowScreenPropertyLocation.cityField.isEnabled());
    }

    @Test(priority = 7) @Ignore
    public void testInvalidZipCodeEntered() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(getDriver());
        orderReportFlowScreenPropertyLocation.enterLocation("2 Infinity Loop", "", "California", "11111");
        orderReportFlowScreenPropertyLocation.keyboardDone.click();
        orderReportFlowScreenPropertyLocation.clickOnNextbutton();
        sleep(9000);
        Assert.assertTrue(orderReportFlowScreenPropertyLocation.cityField.isEnabled());
    }

    @Test(priority = 8) @Ignore
    public void testEnteringZipandStreetThenStateCityNotRequired() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(getDriver());
        orderReportFlowScreenPropertyLocation.enterLocation("2 Infinity Loop", "", "", "95014");
        orderReportFlowScreenPropertyLocation.keyboardDone.click();
        orderReportFlowScreenPropertyLocation.clickOnNextbutton();
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(getDriver());
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenAddressVerifier.legalLink.isEnabled());
    }

    @Test(priority = 9) @Ignore
    public void testEnteringStreetCityStateThenZipNotRequired() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(getDriver());
        orderReportFlowScreenPropertyLocation.enterLocation("2 Infinity Loop", "Cupertino", "California", "");
        orderReportFlowScreenPropertyLocation.keyboardDone.click();
        orderReportFlowScreenPropertyLocation.clickOnNextbutton();
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(getDriver());
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenAddressVerifier.legalLink.isEnabled());
    }

    @Test(priority = 10) @Ignore
    public void testValidLocationEntered() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(getDriver());
        orderReportFlowScreenPropertyLocation.enterLocation("2 Infinity Loop", "Cupertino", "California", "95014");
        orderReportFlowScreenPropertyLocation.keyboardDone.click();
        orderReportFlowScreenPropertyLocation.clickOnNextbutton();
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(getDriver());
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenAddressVerifier.legalLink.isEnabled());
    }

    @Test(priority = 11) @Ignore
    public void testNavigateBackToDashboardScreen() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(getDriver());
        DashBoardScreen dashBoardScreen = orderReportFlowScreenPropertyLocation.navigateBackToDashboardScreen();
        sleep(2000);
        Assert.assertTrue(dashBoardScreen.settingsButton.isEnabled());
    }

    @Test(priority = 12)
    public void testEnteringZipandStreetThenStateIsNotRequiredCanada() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(getDriver());
        orderReportFlowScreenPropertyLocation.enterLocation("1950 Meadowvale Blvd", "", "", "L5N8L9");
        orderReportFlowScreenPropertyLocation.keyboardDone.click();
        orderReportFlowScreenPropertyLocation.keyboardDone.click();
        orderReportFlowScreenPropertyLocation.clickOnNextbutton();
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(getDriver());
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenAddressVerifier.legalLink.isEnabled());
    }
    @Test(priority = 13)
    public void testEnteringStreetCityStateThenZIPISNotRequiredCanada() throws InterruptedException, AWTException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(getDriver());
        orderReportFlowScreenPropertyLocation.enterLocation("1950 Meadowvale Blvd", "Mississagua", "Ontario", "");
        orderReportFlowScreenPropertyLocation.keyboardDone.click();
        orderReportFlowScreenPropertyLocation.clickOnNextbutton();
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(getDriver());
        sleep(2000);
        Assert.assertTrue(orderReportFlowScreenAddressVerifier.legalLink.isEnabled());
    }
}
