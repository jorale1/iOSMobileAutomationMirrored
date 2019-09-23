package EVMobile.PageObjects.skywalkerios.reportDetails;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

import static java.lang.Thread.sleep;

public class MaterialsWasteCalculationScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "PREMIUM")
    public WebElement productType;

    @FindBy(name = "Asphalt Shingle: Waste Calculation")
    public WebElement pageSubtitle;

    @FindBy(name = "DisclaimerInfo")
    public WebElement disclaimerLink;

    @FindBy(name = "Structure #1")
    public WebElement structureForm1CollapseExpandLink;

    @FindBy(name = "COMPLEXITY: Normal")
    public WebElement structureForm1Complexity;

    @FindBy(name = "Measured")
    public WebElement structureForm1MeasuredColumn;

    @FindBy(name = "Suggested")
    public WebElement structureForm1SuggestedColumn;

    @FindBy(name = "Waste %:")
    public WebElement structureForm1WastePercentageRow;

    @FindBy(name = "Area (sq ft):")
    public WebElement structureForm1reaRow;

    @FindBy(name = "Squares:")
    public WebElement structureForm1SquaresRow;

    @FindBy(name = "Disclaimer Information")
    public WebElement disclaimerInformationPopUp;

    @FindBy(name = "Disclaimer Information")
    public WebElement disclaimerInformationPopUpTitle;

    @FindBy(name = "Additional materials needed for ridge, hip, and starter lengths are not included in the table. The provided suggested waste factor is intended to serve as a guide—actual waste percentages may differ based upon several variables that EagleView does not control. These waste factor variables include, but are not limited to, individual installation techniques, crew experiences, asphalt shingle material subtleties, and potential salvage from the site. Individual results may vary from the suggested waste factor that EagleView has provided. The suggested waste is not to replace or substitute for experience or judgment as to any given replacement or repair work.")
    public WebElement disclaimerInformationPopUpText;

    @FindBy(name = "Close")
    public WebElement disclaimerInformationPopUpCloseButton;

    public MaterialsWasteCalculationScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public MaterialsWasteCalculationScreen navigateFromPremiumReportDetailSToWasteCalculationScreen() throws AWTException, InterruptedException {
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = new CompletedPremiumOrderReportDetailScreen(driver);
        completedPremiumOrderReportDetailScreen.navigateToMaterialsWasteCalculationScreen();
        sleep(2000);
        return new MaterialsWasteCalculationScreen(driver);
    }

    public CompletedPremiumOrderReportDetailScreen navigateBackToCompletedPremiumOrderReportDetailScreen() throws AWTException, InterruptedException {
        navigateFromPremiumReportDetailSToWasteCalculationScreen();
        sleep(2000);
        backButton.click();
        sleep(2000);
        return new CompletedPremiumOrderReportDetailScreen(driver);
    }

    public void displayDisclaimerPopUp() throws AWTException, InterruptedException {
        navigateFromPremiumReportDetailSToWasteCalculationScreen();
        sleep(2000);
        disclaimerLink.click();
        sleep(2000);
    }

    public void closeDisclaimerPopUp() throws AWTException, InterruptedException {
        navigateFromPremiumReportDetailSToWasteCalculationScreen();
        sleep(2000);
        disclaimerLink.click();
        sleep(2000);
        disclaimerInformationPopUpCloseButton.click();
        sleep(2000);
    }

    public void collapseStructure1() throws AWTException, InterruptedException {
        navigateFromPremiumReportDetailSToWasteCalculationScreen();
        sleep(2000);
        structureForm1CollapseExpandLink.click();
        sleep(2000);
    }

    public void expandStructure1() throws AWTException, InterruptedException {
        navigateFromPremiumReportDetailSToWasteCalculationScreen();
        sleep(2000);
        if (driver.findElements(By.name("Measured")).isEmpty()) {
            structureForm1CollapseExpandLink.click();
            sleep(2000);
        }
    }
}
