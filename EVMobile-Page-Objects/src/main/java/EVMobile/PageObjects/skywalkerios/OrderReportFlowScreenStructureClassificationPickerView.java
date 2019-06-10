package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

import static java.lang.Thread.sleep;

public class OrderReportFlowScreenStructureClassificationPickerView extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Residential")
    public WebElement residentialPropertyType;

    @FindBy(name = "Commercial")
    public WebElement commercialPropertyType;

    @FindBy(name = "Multi-Family")
    public WebElement multiFamilyPropertyType;

    @FindBy(name = "Discard Order")
    public WebElement discardOrderButton;

    @FindBy(name = "Continue Placing Order")
    public WebElement continuePlacingOrderButton;

    public OrderReportFlowScreenStructureClassificationPickerView(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnNextbutton() throws InterruptedException {
        sleep(2000);
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(295, 743)).perform();
    }

    public OrderReportFlowScreenStructureClassificationPickerView navigateToSelectStructureScreen() throws AWTException, InterruptedException {
        OrderReportFlowScreenAddressVerifier orderReportFlowScreenAddressVerifier = new OrderReportFlowScreenAddressVerifier(driver);
        orderReportFlowScreenAddressVerifier.enterOrderAccountWithNoPreexistingOrders();
        return new OrderReportFlowScreenStructureClassificationPickerView(driver);
    }

    public OrderReportFlowScreenProductPickerViewCommercial navigateToCommercialScreen() throws AWTException, InterruptedException {
        navigateToSelectStructureScreen();
        sleep(2000);
        commercialPropertyType.click();
        clickOnNextbutton();
        sleep(2000);
        return new OrderReportFlowScreenProductPickerViewCommercial(driver);
    }

    public OrderReportFlowScreenProductPickerViewResidential navigateToResidentialScreen() throws AWTException, InterruptedException {
        navigateToSelectStructureScreen();
        sleep(2000);
        residentialPropertyType.click();
        clickOnNextbutton();
        sleep(2000);
        return new OrderReportFlowScreenProductPickerViewResidential(driver);
    }

    public OrderReportFlowScreenProductPickerViewMultiFamily navigateToMultiFamilyScreen() throws AWTException, InterruptedException {
        navigateToSelectStructureScreen();
        sleep(2000);
        multiFamilyPropertyType.click();
        clickOnNextbutton();
        sleep(2000);
        return new OrderReportFlowScreenProductPickerViewMultiFamily(driver);
    }

    public DashBoardScreen cancelDiscardOrder() throws AWTException, InterruptedException {
        navigateToSelectStructureScreen();
        sleep(2000);
        cancelButton.click();
        discardOrderButton.click();
        sleep(2000);
        return new DashBoardScreen(driver);
    }

    public void cancelContinueWithOrder() throws AWTException, InterruptedException {
        navigateToSelectStructureScreen();
        sleep(2000);
        cancelButton.click();
        continuePlacingOrderButton.click();
        sleep(2000);
    }

    public OrderReportFlowScreenAddressVerifier navigateBackToAddressVerifierScreen() throws AWTException, InterruptedException {
        navigateToSelectStructureScreen();
        sleep(2000);
        backButton.click();
        sleep(2000);
        return new OrderReportFlowScreenAddressVerifier(driver);
    }
}