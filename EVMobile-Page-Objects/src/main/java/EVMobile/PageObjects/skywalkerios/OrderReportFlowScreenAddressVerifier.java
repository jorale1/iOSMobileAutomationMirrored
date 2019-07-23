package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

import static java.lang.Thread.sleep;

public class OrderReportFlowScreenAddressVerifier extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Is the pin in the right place?")
    public WebElement pageTitle;

    @FindBy(name = "If not, drag the map to center the pin on the structure.")
    public WebElement pageInstructions;

    @FindBy(name = "Legal")
    public WebElement legalLink;

    @FindBy(name = "Confirm")
    public WebElement confirmButton;

    @FindBy(name = "Discard Order")
    public WebElement discardOrderButton;

    @FindBy(name = "Continue Placing Order")
    public WebElement continuePlacingOrderButton;

    public String accountWithNoPreexistingOrders = "jq32772+construction2@gmail.com";
    public String password = "EagleView1";

    public OrderReportFlowScreenAddressVerifier(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public OrderReportFlowScreenDuplicateReportsView enterOrderDuplicateAddress() throws AWTException, InterruptedException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(driver);
        orderReportFlowScreenPropertyLocation.enterLocation("2 Infinity Loop", "Cupertino", "California", "95014");
        orderReportFlowScreenPropertyLocation.keyboardDone.click();
        orderReportFlowScreenPropertyLocation.clickOnNextbutton();
        sleep(2000);
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(driver);
        orderReportFlowScreenAddressVerifier.confirmButton.click();
        sleep(2000);
        return new OrderReportFlowScreenDuplicateReportsView(driver);
    }

    public OrderReportFlowScreenPreferredOrderView enterOrderAccountWithPreexistingOrdersOthersAddresses() throws AWTException, InterruptedException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(driver);
        orderReportFlowScreenPropertyLocation.enterLocation("1034 Destiny USA", "Syracuse", "New York", "13204");
        orderReportFlowScreenPropertyLocation.keyboardDone.click();
        orderReportFlowScreenPropertyLocation.clickOnNextbutton();
        sleep(2000);
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(driver);
        orderReportFlowScreenAddressVerifier.confirmButton.click();
        sleep(2000);
        return new OrderReportFlowScreenPreferredOrderView(driver);
    }

    public OrderReportFlowScreenStructureClassificationPickerView enterOrderAccountWithNoPreexistingOrders() throws AWTException, InterruptedException {
        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        sleep(2000);
        loginscreen.enterCredentials(accountWithNoPreexistingOrders, password);
        loginscreen.loginDone.click();
        loginscreen.login.click();
        DashBoardScreen dashBoardScreen = new DashBoardScreen(driver);
        sleep(2000);
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = dashBoardScreen.navigateToOrderReportPropertyLocationScreen();
        sleep(2000);
        orderReportFlowScreenPropertyLocation.streetField.sendKeys("2 Infinity Loop");
        orderReportFlowScreenPropertyLocation.cityField.sendKeys("Cupertino");
        orderReportFlowScreenPropertyLocation.selectStateFromStatePicker("California");
        orderReportFlowScreenPropertyLocation.zipCodeField.sendKeys("95014");
        orderReportFlowScreenPropertyLocation.keyboardDone.click();
        orderReportFlowScreenPropertyLocation.clickOnNextbutton();
        sleep(2000);
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(driver);
        orderReportFlowScreenAddressVerifier.confirmButton.click();
        sleep(2000);
        return new OrderReportFlowScreenStructureClassificationPickerView(driver);
    }

    public MapLegalPage navigateToMapLegalPage() throws AWTException, InterruptedException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(driver);
        orderReportFlowScreenPropertyLocation.enterLocation("2 Infinity Loop", "Cupertino", "California", "95014");
        orderReportFlowScreenPropertyLocation.keyboardDone.click();
        orderReportFlowScreenPropertyLocation.clickOnNextbutton();
        sleep(2000);
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(driver);
        orderReportFlowScreenAddressVerifier.legalLink.click();
        sleep(2000);
        return new MapLegalPage(driver);
    }

    public DashBoardScreen cancelDiscardOrder() throws AWTException, InterruptedException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(driver);
        orderReportFlowScreenPropertyLocation.enterLocation("2 Infinity Loop", "Cupertino", "California", "95014");
        orderReportFlowScreenPropertyLocation.keyboardDone.click();
        orderReportFlowScreenPropertyLocation.clickOnNextbutton();
        sleep(2000);
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(driver);
        orderReportFlowScreenAddressVerifier.cancelButton.click();
        orderReportFlowScreenAddressVerifier.discardOrderButton.click();
        sleep(2000);
        return new DashBoardScreen(driver);
    }

    public void cancelContinueWithOrder() throws AWTException, InterruptedException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(driver);
        orderReportFlowScreenPropertyLocation.enterLocation("2 Infinity Loop", "Cupertino", "California", "95014");
        orderReportFlowScreenPropertyLocation.keyboardDone.click();
        orderReportFlowScreenPropertyLocation.clickOnNextbutton();
        sleep(2000);
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(driver);
        orderReportFlowScreenAddressVerifier.cancelButton.click();
        orderReportFlowScreenAddressVerifier.continuePlacingOrderButton.click();
        sleep(2000);
    }

    public OrderReportFlowScreenPropertyLocation navigateBackToPropertyLocationScreen() throws AWTException, InterruptedException {
        OrderReportFlowScreenPropertyLocation orderReportFlowScreenPropertyLocation = new OrderReportFlowScreenPropertyLocation(driver);
        orderReportFlowScreenPropertyLocation.enterLocation("2 Infinity Loop", "Cupertino", "California", "95014");
        orderReportFlowScreenPropertyLocation.keyboardDone.click();
        orderReportFlowScreenPropertyLocation.clickOnNextbutton();
        sleep(2000);
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(driver);
        orderReportFlowScreenAddressVerifier.backButton.click();
        sleep(2000);
        return new OrderReportFlowScreenPropertyLocation(driver);
    }
}