package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.time.Duration;

import static java.lang.Thread.sleep;

public class OrderReportFlowScreenProductPickerViewResidential extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    @FindBy(name = "Select a report type")
    public WebElement pageTitle;

    @FindBy(name = "Premium")
    public WebElement premiumReportType;

    @FindBy(name = "$30 – $75")
    public WebElement premiumReportPricing;

    @FindBy(name = "• 3D diagram of the roof • 5 aerial images of the structure • All critical measurements • Waste calculation table")
    public WebElement premiumReportDetails;

    @FindBy(name = "QuickSquares™")
    public WebElement quickSquaresReportType;

    @FindBy(name = "$18")
    public WebElement quickSquareReportPricing;

    @FindBy(name = "• Square footage of the roof • Predominant pitch • Outline of the roof area • Completed in about an hour")
    public WebElement quickSquareReportDetails;

    @FindBy(name = "SunSite™ Plus")
    public WebElement sunSitePlusReportType;

    @FindBy(name = "$50 – $95")
    public WebElement sunSitePlusReportPricing;

    @FindBy(name = "• Shade-causing objects & measurements • Object height above eave line • DXF and JSON file formats included • + SunSite Report features")
    public WebElement sunSitePlusReportDetails;

    @FindBy(name = "SunSite™")
    public WebElement sunSiteReportType;

    @FindBy(name = "$35 – $80")
    public WebElement sunSiteReportPricing;

    @FindBy(name = "• Roof obstructions measured • Azimuth diagram • Rafter lengths included • + Premium Roof Report features")
    public WebElement sunSiteReportDetails;

    @FindBy(name = "Walls")
    public WebElement wallsReportType;

    @FindBy(name = "$70")
    public WebElement wallsReportPricing;

    @FindBy(name = "• 3D wall area diagram • Window and door diagram • Elevation by cardinal direction • 5 aerial images of the structure")
    public WebElement wallsReportDetails;

    @FindBy(name = "WallsLite™")
    public WebElement wallsLiteReportType;

    @FindBy(name = "$36")
    public WebElement wallsLiteReportPricing;

    @FindBy(name = "• 3D wall area diagram • Elevation by cardinal direction • 5 aerial images of the structure • No window or door cutouts")
    public WebElement wallsLiteReportDetails;

    @FindBy(name = "Gutter")
    public WebElement gutterReportType;

    @FindBy(name = "$12")
    public WebElement gutterReportPricing;

    @FindBy(name = "• Roof diagram with gutters highlighted • 5 aerial images of the structure • Total eave measurements • Estimated number of downspouts")
    public WebElement gutterReportDetails;

    @FindBy(name = "Discard Order")
    public WebElement discardOrderButton;

    @FindBy(name = "Continue Placing Order")
    public WebElement continuePlacingOrderButton;

    public OrderReportFlowScreenProductPickerViewResidential(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnNextbutton() throws InterruptedException {
        sleep(2000);
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(295, 743)).perform();
    }

    public OrderReportFlowScreenProductPickerViewResidential navigateToProductPickerResidentialScreen() throws AWTException, InterruptedException {
        OrderReportFlowScreenStructureClassificationPickerView orderReportFlowScreenStructureClassificationPickerView = new OrderReportFlowScreenStructureClassificationPickerView(driver);
        orderReportFlowScreenStructureClassificationPickerView.navigateToResidentialScreen();
        return new OrderReportFlowScreenProductPickerViewResidential(driver);
    }

    public DashBoardScreen cancelDiscardOrder() throws AWTException, InterruptedException {
        navigateToProductPickerResidentialScreen();
        sleep(2000);
        cancelButton.click();
        discardOrderButton.click();
        sleep(2000);
        return new DashBoardScreen(driver);
    }

    public void cancelContinueWithOrder() throws AWTException, InterruptedException {
        navigateToProductPickerResidentialScreen();
        sleep(2000);
        cancelButton.click();
        continuePlacingOrderButton.click();
        sleep(2000);
    }

    public OrderReportFlowScreenStructureClassificationPickerView navigateBackToStructureClassificationScreen() throws AWTException, InterruptedException {
        navigateToProductPickerResidentialScreen();
        sleep(2000);
        backButton.click();
        sleep(2000);
        return new OrderReportFlowScreenStructureClassificationPickerView(driver);
    }

    public OrderReportFlowProductResidentialAddOnProductPickerScreen navigateToAddOnProductPickerScreen() throws AWTException, InterruptedException {
        navigateToProductPickerResidentialScreen();
        sleep(2000);
        clickOnNextbutton();
        sleep(2000);
        return new OrderReportFlowProductResidentialAddOnProductPickerScreen(driver);
    }

    public OrderReportFlowProductResidentialMeasurementScopePickerScreen navigateToMeasurementScopePickerScreen() throws AWTException, InterruptedException {
        navigateToProductPickerResidentialScreen();
        sleep(2000);
        quickSquaresReportType.click();
        clickOnNextbutton();
        sleep(2000);
        return new OrderReportFlowProductResidentialMeasurementScopePickerScreen(driver);
    }

    public OrderReportFlowProductResidentialDeliveryProductPickerScreen navigateToDeliveryProductPickerScreen() throws AWTException, InterruptedException {
        navigateToProductPickerResidentialScreen();
        sleep(2000);
        swapToSunsitePlusReportType("S-iPhone X");
        sunSitePlusReportType.click();
        clickOnNextbutton();
        sleep(2000);
        return new OrderReportFlowProductResidentialDeliveryProductPickerScreen(driver);
    }

    public OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen navigateToSunsiteDeliveryProductPickerScreen() throws AWTException, InterruptedException {
        navigateToProductPickerResidentialScreen();
        sleep(2000);
        swapToSunsiteReportType("S-iPhone X");
        sunSiteReportType.click();
        clickOnNextbutton();
        sleep(2000);
        return new OrderReportFlowProductResidentialSunsiteDeliveryProductPickerScreen(driver);
    }

    public OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen navigateToWallsMeasurementScopePickerScreen() throws AWTException, InterruptedException {
        navigateToProductPickerResidentialScreen();
        sleep(2000);
        swapToWallsReportType("S-iPhone X");
        wallsReportType.click();
        clickOnNextbutton();
        sleep(2000);
        return new OrderReportFlowProductResidentialWallsMeasurementScopePickerScreen(driver);
    }

    public OrderReportFlowProductResidentialWallsLiteMeasurementScopePickerScreen navigateToWallsLiteMeasurementScopePickerScreen() throws AWTException, InterruptedException {
        navigateToProductPickerResidentialScreen();
        sleep(2000);
        swapToWallsLiteReportType("S-iPhone X");
        wallsLiteReportType.click();
        clickOnNextbutton();
        sleep(2000);
        return new OrderReportFlowProductResidentialWallsLiteMeasurementScopePickerScreen(driver);
    }

    public OrderReportFlowProductResidentialGutterDeliveryProductPickerScreen navigateToGutterDeliveryProductPickerScreen() throws AWTException, InterruptedException {
        navigateToProductPickerResidentialScreen();
        sleep(2000);
        swapToGutterReportType("S-iPhone X");
        gutterReportType.click();
        clickOnNextbutton();
        sleep(2000);
        return new OrderReportFlowProductResidentialGutterDeliveryProductPickerScreen(driver);
    }

    public void swapToSunsitePlusReportType(String device) {
        if (device.equalsIgnoreCase("S-Iphone X")) {
            TouchAction ta = new TouchAction(driver);
            ta.press(PointOption.point(168, 483)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(168, 150)).release().perform();
        } else if (device.equalsIgnoreCase("S-Iphone 6")) {
            TouchAction ta = new TouchAction(driver);
            ta.press(PointOption.point(181, 546)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(181, 208)).release().perform();
        }
    }

    public void swapToSunsiteReportType(String device) {
        if (device.equalsIgnoreCase("S-Iphone X")) {
            TouchAction ta = new TouchAction(driver);
            ta.press(PointOption.point(168, 483)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(168, 150)).release().perform();
            ta.press(PointOption.point(168, 483)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(168, 150)).release().perform();
        } else if (device.equalsIgnoreCase("S-Iphone 6")) {
            TouchAction ta = new TouchAction(driver);
            ta.press(PointOption.point(181, 546)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(181, 208)).release().perform();
        }
    }

    public void swapToWallsReportType(String device) {
        if (device.equalsIgnoreCase("S-Iphone X")) {
            TouchAction ta = new TouchAction(driver);
            ta.press(PointOption.point(168, 483)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(168, 150)).release().perform();
            ta.press(PointOption.point(168, 483)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(168, 150)).release().perform();
            ta.press(PointOption.point(168, 483)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(168, 150)).release().perform();
        } else if (device.equalsIgnoreCase("S-Iphone 6")) {
            TouchAction ta = new TouchAction(driver);
            ta.press(PointOption.point(181, 546)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(181, 208)).release().perform();
        }
    }

    public void swapToWallsLiteReportType(String device) {
        if (device.equalsIgnoreCase("S-Iphone X")) {
            TouchAction ta = new TouchAction(driver);
            ta.press(PointOption.point(168, 483)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(168, 150)).release().perform();
            ta.press(PointOption.point(168, 483)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(168, 150)).release().perform();
            ta.press(PointOption.point(168, 483)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(168, 150)).release().perform();
            ta.press(PointOption.point(168, 483)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(168, 150)).release().perform();
        } else if (device.equalsIgnoreCase("S-Iphone 6")) {
            TouchAction ta = new TouchAction(driver);
            ta.press(PointOption.point(181, 546)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(181, 208)).release().perform();
        }
    }

    public void swapToGutterReportType(String device) {
        if (device.equalsIgnoreCase("S-Iphone X")) {
            TouchAction ta = new TouchAction(driver);
            ta.press(PointOption.point(168, 483)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(168, 150)).release().perform();
            ta.press(PointOption.point(168, 483)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(168, 150)).release().perform();
            ta.press(PointOption.point(168, 483)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(168, 150)).release().perform();
            ta.press(PointOption.point(168, 483)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(168, 150)).release().perform();
            ta.press(PointOption.point(168, 483)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(168, 150)).release().perform();
        } else if (device.equalsIgnoreCase("S-Iphone 6")) {
            TouchAction ta = new TouchAction(driver);
            ta.press(PointOption.point(181, 546)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(181, 208)).release().perform();
        }
    }
}