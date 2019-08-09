package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import EVMobile.PageObjects.skywalkerios.dashboard.DashBoardScreen;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

import static java.lang.Thread.sleep;

public class OrderReportFlowProductResidentialOrderSubmittedScreen extends BasePage {

    @FindBy(name = "Check40")
    public WebElement checkIcon;

    @FindBy(name = "Thank you for your order.")
    public WebElement pageTitle;

    @FindBy(name = "An order confirmation has been sent to your email")
    public WebElement pageSubtitle;

    public OrderReportFlowProductResidentialOrderSubmittedScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnOKButton() throws InterruptedException {
        sleep(2000);
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(180, 750)).perform();
    }

    public OrderReportFlowProductResidentialOrderSubmittedScreen navigateFromCheckOuttoOrderSubmittedScreen() throws AWTException, InterruptedException {
        OrderReportFlowCheckOutViewScreen orderReportFlowCheckOutViewScreen = new OrderReportFlowCheckOutViewScreen(driver);
        orderReportFlowCheckOutViewScreen.navigatetoOrderSubmittedScreen();
        sleep(2000);
        return new OrderReportFlowProductResidentialOrderSubmittedScreen(driver);
    }

    public DashBoardScreen confirmOrderAndBackToDashboard () throws AWTException, InterruptedException {
        navigateFromCheckOuttoOrderSubmittedScreen();
        sleep(2000);
        clickOnOKButton();
        sleep(2000);
        return new DashBoardScreen(driver);
    }
}