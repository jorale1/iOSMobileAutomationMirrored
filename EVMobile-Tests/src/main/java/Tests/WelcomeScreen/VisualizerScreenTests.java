package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.reportDetails.CompletedPremiumOrderReportDetailScreen;
import EVMobile.PageObjects.skywalkerios.reportDetails.VisualizerScreen;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

public class VisualizerScreenTests extends BaseMobileTest {

    @Test(priority = 1)
    @Ignore
    public void testNavigateToVisualizerScreen() throws InterruptedException, AWTException {
        VisualizerScreen visualizerScreen = new VisualizerScreen(getDriver());
        visualizerScreen.navigateFromPremiumReportDetailSToVisualizerScreen();
        Assert.assertTrue(visualizerScreen.arkitLink.isEnabled());
    }

    @Test(priority = 2)
    @Ignore
    public void testNavigateBackToCompletedPremiumOrderDetailsScreen() throws InterruptedException, AWTException {
        VisualizerScreen visualizerScreen = new VisualizerScreen(getDriver());
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = visualizerScreen.navigateBackToCompletedPremiumOrderReportDetailScreen();
        Assert.assertTrue(completedPremiumOrderReportDetailScreen.measurementDetailsLink.isEnabled());
    }

    @Test(priority = 3)
    public void testExposeMaterialsMenu() throws InterruptedException, AWTException {
        VisualizerScreen visualizerScreen = new VisualizerScreen(getDriver());
        visualizerScreen.exposeMaterialsMenu();
        Assert.assertTrue(visualizerScreen.materialsNavigationBarName.isEnabled());
        Assert.assertTrue(visualizerScreen.roofMaterialsLink.isDisplayed());
        Assert.assertTrue(visualizerScreen.wallsMaterialsLink.isDisplayed());
    }

    @Test(priority = 4)
    @Ignore
    public void testCloseMaterialsMenu() throws InterruptedException, AWTException {
        VisualizerScreen visualizerScreen = new VisualizerScreen(getDriver());
        visualizerScreen.closeMaterialsMenu();
        Assert.assertFalse(visualizerScreen.roofMaterialsLink.isDisplayed());
    }

    @Test(priority = 5)
    @Ignore
    public void testExposeMeasurementsMenu() throws InterruptedException, AWTException {
        VisualizerScreen visualizerScreen = new VisualizerScreen(getDriver());
        visualizerScreen.exposeMeasurementsMenu();
        Assert.assertTrue(visualizerScreen.roofMeasurementsNavigationBarName.isEnabled());
        Assert.assertTrue(visualizerScreen.roofMeasurementsLink.isDisplayed());
        Assert.assertTrue(visualizerScreen.roofMeasurementsNavigationBarName.isDisplayed());
        Assert.assertTrue(visualizerScreen.wallsMeasurementsLink.isDisplayed());
        Assert.assertTrue(visualizerScreen.wallsMeasurementsNotAvailable.isDisplayed());
    }

    @Test(priority = 6)
    @Ignore
    public void testCloseMeasurementsMenu() throws InterruptedException, AWTException {
        VisualizerScreen visualizerScreen = new VisualizerScreen(getDriver());
        visualizerScreen.closeMeasurementsMenu();
        Assert.assertFalse(visualizerScreen.roofMeasurementsLink.isDisplayed());
    }
}
