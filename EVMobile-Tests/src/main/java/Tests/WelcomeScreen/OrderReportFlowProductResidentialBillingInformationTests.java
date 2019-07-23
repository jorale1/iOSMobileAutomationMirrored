package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.OrderReportFlowBillingInformationScreen;
import EVMobile.PageObjects.skywalkerios.OrderReportFlowCheckOutViewScreen;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

public class OrderReportFlowProductResidentialBillingInformationTests extends BaseMobileTest {

    @Test(priority = 1) @Ignore
    public void testCloseButtonEnabledWhenNoChangesMade() throws InterruptedException, AWTException {
        OrderReportFlowBillingInformationScreen orderReportFlowBillingInformationScreen = new OrderReportFlowBillingInformationScreen(getDriver());
        orderReportFlowBillingInformationScreen.navigateFromCheckOutToBillingInoformationScreen();
        Assert.assertTrue(orderReportFlowBillingInformationScreen.closeButton.isEnabled());
    }

    @Test(priority = 2) @Ignore
    public void testClosePageWithoutMakingChanges() throws InterruptedException, AWTException {
        OrderReportFlowBillingInformationScreen orderReportFlowBillingInformationScreen = new OrderReportFlowBillingInformationScreen(getDriver());
        OrderReportFlowCheckOutViewScreen orderReportFlowCheckOutViewScreen = orderReportFlowBillingInformationScreen.closePageWithoutChanges();
        Assert.assertTrue(orderReportFlowCheckOutViewScreen.pageTitle.isEnabled());
    }

    @Test(priority = 3) @Ignore
    public void testCancelDiscardChangesGoesToDashboardScreen() throws InterruptedException, AWTException {
        OrderReportFlowBillingInformationScreen orderReportFlowBillingInformationScreen = new OrderReportFlowBillingInformationScreen(getDriver());
        OrderReportFlowCheckOutViewScreen orderReportFlowCheckOutViewScreen = orderReportFlowBillingInformationScreen.cancelDiscardChanges();
        Assert.assertTrue(orderReportFlowCheckOutViewScreen.pageTitle.isEnabled());
    }

    @Test(priority = 4) @Ignore
    public void testCancelContinueWithChangesRemainsInBillingInfoScreen() throws InterruptedException, AWTException {
        OrderReportFlowBillingInformationScreen orderReportFlowBillingInformationScreen = new OrderReportFlowBillingInformationScreen(getDriver());
        orderReportFlowBillingInformationScreen.cancelThenContinueEditing();
        Assert.assertTrue(orderReportFlowBillingInformationScreen.pageTitle.isEnabled());
    }

    @Test(priority = 5) @Ignore
    public void testAllFieldsMandatoryWhenEnterOneChange() throws InterruptedException, AWTException {
        OrderReportFlowBillingInformationScreen orderReportFlowBillingInformationScreen = new OrderReportFlowBillingInformationScreen(getDriver());
        orderReportFlowBillingInformationScreen.allFieldsTurnMandatoryWhenMaking1ChangeAndSave();
        Assert.assertTrue(orderReportFlowBillingInformationScreen.pageTitle.isEnabled());
    }

    @Test(priority = 6) @Ignore
    public void testInvalidPastExpirationDate() throws InterruptedException, AWTException {
        OrderReportFlowBillingInformationScreen orderReportFlowBillingInformationScreen = new OrderReportFlowBillingInformationScreen(getDriver());
        orderReportFlowBillingInformationScreen.expirationDateValidation("6", "2019");
        Assert.assertTrue(orderReportFlowBillingInformationScreen.pageTitle.isEnabled());
    }

    @Test(priority = 7) @Ignore
    public void testInvalidPhoneNumber() throws InterruptedException, AWTException {
        OrderReportFlowBillingInformationScreen orderReportFlowBillingInformationScreen = new OrderReportFlowBillingInformationScreen(getDriver());
        orderReportFlowBillingInformationScreen.phoneNumberValidation("3435q");
        Assert.assertTrue(orderReportFlowBillingInformationScreen.invalidCardMessage.isEnabled());
    }

    @Test(priority = 8) @Ignore
    public void testInvalidPhoneNumberMinLength() throws InterruptedException, AWTException {
        OrderReportFlowBillingInformationScreen orderReportFlowBillingInformationScreen = new OrderReportFlowBillingInformationScreen(getDriver());
        orderReportFlowBillingInformationScreen.phoneNumberValidation("123456789");
        Assert.assertTrue(orderReportFlowBillingInformationScreen.invalidCardMessage.isEnabled());
    }

    @Test(priority = 9) @Ignore
    public void testInvalidPhoneNumberMaxLength() throws InterruptedException, AWTException {
        OrderReportFlowBillingInformationScreen orderReportFlowBillingInformationScreen = new OrderReportFlowBillingInformationScreen(getDriver());
        orderReportFlowBillingInformationScreen.phoneNumberValidation("123456789123");
        Assert.assertTrue(orderReportFlowBillingInformationScreen.invalidCardMessage.isEnabled()); //FAILING CREATE TICKET, NO MAX VALIDATED, ALSO WHEN ENTERING TO EDIT USER NEEDS TO RE-ENTER CC NUMBER
    }

    @Test(priority = 10) @Ignore
    public void testInvalidcardNumber() throws InterruptedException, AWTException {
        OrderReportFlowBillingInformationScreen orderReportFlowBillingInformationScreen = new OrderReportFlowBillingInformationScreen(getDriver());
        orderReportFlowBillingInformationScreen.cardNumberValidation("455oo23456");
        Assert.assertTrue(orderReportFlowBillingInformationScreen.pageTitle.isEnabled());
    }

    @Test(priority = 11) @Ignore
    public void testInvalidcardNumberMinLength() throws InterruptedException, AWTException {
        OrderReportFlowBillingInformationScreen orderReportFlowBillingInformationScreen = new OrderReportFlowBillingInformationScreen(getDriver());
        orderReportFlowBillingInformationScreen.cardNumberValidation("441998697034890");
        Assert.assertTrue(orderReportFlowBillingInformationScreen.invalidCardMessage.isEnabled());
    }

    @Test(priority = 12)
    public void testInvalidcardNumberMaxLength() throws InterruptedException, AWTException {
        OrderReportFlowBillingInformationScreen orderReportFlowBillingInformationScreen = new OrderReportFlowBillingInformationScreen(getDriver());
        orderReportFlowBillingInformationScreen.cardNumberValidation("44199869703489071");
        Assert.assertTrue(orderReportFlowBillingInformationScreen.pageTitle.isEnabled());
    }

    @Test(priority = 13) @Ignore
    public void testFillInAllFieldsAndSave() throws InterruptedException, AWTException {
        OrderReportFlowBillingInformationScreen orderReportFlowBillingInformationScreen = new OrderReportFlowBillingInformationScreen(getDriver());
        OrderReportFlowCheckOutViewScreen orderReportFlowCheckOutViewScreen = orderReportFlowBillingInformationScreen.fillInAllFieldsValidData();
        Assert.assertTrue(orderReportFlowCheckOutViewScreen.pageTitle.isEnabled());
    }
}
