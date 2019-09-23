package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.reportDetails.CompletedPremiumOrderReportDetailScreen;
import EVMobile.PageObjects.skywalkerios.reportDetails.MaterialsWasteCalculationScreen;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

public class WasteCalculationsTests extends BaseMobileTest {

    @Test(priority = 1) @Ignore
    public void testStructure1TableIsExpandedScreen() throws InterruptedException, AWTException {
        MaterialsWasteCalculationScreen materialsWasteCalculationScreen = new MaterialsWasteCalculationScreen(getDriver());
        materialsWasteCalculationScreen.navigateFromPremiumReportDetailSToWasteCalculationScreen();
        Assert.assertTrue(materialsWasteCalculationScreen.structureForm1MeasuredColumn.isDisplayed());
    }

    @Test(priority = 2) @Ignore
    public void testNavigateBackToCompletedPremiumOrderDetailsScreen() throws InterruptedException, AWTException {
        MaterialsWasteCalculationScreen materialsWasteCalculationScreen = new MaterialsWasteCalculationScreen(getDriver());
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = materialsWasteCalculationScreen.navigateBackToCompletedPremiumOrderReportDetailScreen();
         Assert.assertTrue(completedPremiumOrderReportDetailScreen.measurementDetailsLink.isEnabled());
    }

    @Test(priority = 3)
    public void testDisplayDisclaimerPopUp() throws InterruptedException, AWTException {
        MaterialsWasteCalculationScreen materialsWasteCalculationScreen = new MaterialsWasteCalculationScreen(getDriver());
        materialsWasteCalculationScreen.displayDisclaimerPopUp();
        Assert.assertTrue(materialsWasteCalculationScreen.disclaimerInformationPopUpTitle.isDisplayed());
    }

    @Test(priority = 4) @Ignore
    public void testCloseDisclaimerPopUp() throws InterruptedException, AWTException {
        MaterialsWasteCalculationScreen materialsWasteCalculationScreen = new MaterialsWasteCalculationScreen(getDriver());
        materialsWasteCalculationScreen.closeDisclaimerPopUp();
        Assert.assertTrue(materialsWasteCalculationScreen.structureForm1SuggestedColumn.isDisplayed());
    }

    @Test(priority = 5) @Ignore
    public void testCollapseStructure1Table() throws InterruptedException, AWTException {
        MaterialsWasteCalculationScreen materialsWasteCalculationScreen = new MaterialsWasteCalculationScreen(getDriver());
        materialsWasteCalculationScreen.collapseStructure1();
        Assert.assertEquals(0, getDriver().findElements(By.name("Measured")).size());
    }

    @Test(priority = 6) @Ignore
    public void testExpandStructure1Table() throws InterruptedException, AWTException {
        MaterialsWasteCalculationScreen materialsWasteCalculationScreen = new MaterialsWasteCalculationScreen(getDriver());
        materialsWasteCalculationScreen.expandStructure1();
        Assert.assertTrue(materialsWasteCalculationScreen.structureForm1SuggestedColumn.isDisplayed());
    }
}
