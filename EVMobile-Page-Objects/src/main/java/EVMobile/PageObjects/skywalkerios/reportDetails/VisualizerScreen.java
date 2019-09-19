package EVMobile.PageObjects.skywalkerios.reportDetails;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

import static java.lang.Thread.sleep;

public class VisualizerScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Cross")
    public WebElement closeButton;

    @FindBy(name = "CrossWhite")
    public WebElement measurementsCloseButton;

    @FindBy(name = "ARKit")
    public WebElement arkitLink;

    @FindBy(name = "VisualizerWatermarkLogo")
    public WebElement visualizerLogo;

    @FindBy(name = "Materials")
    public WebElement materialsLink;

    @FindBy(name = "Materials")
    public WebElement materialsNavigationBarName;

    @FindBy(name = "Roof")
    public WebElement roofMaterialsLink;

    @FindBy(name = "Roof")
    public WebElement roofNavigationBarName;

    @FindBy(name = "Asphalt")
    public WebElement roofMaterialAsphaltLink;

    @FindBy(name = "Asphalt")
    public WebElement asphaltNavigationBarName;

    @FindBy(name = "3-Tab")
    public WebElement asphaltMaterial3TabLink;

    @FindBy(name = "3-Tab")
    public WebElement threeTabNavigationBarName;

    @FindBy(name = "Architectural")
    public WebElement asphaltMaterialArchitecturalLink;

    @FindBy(name = "Architectural")
    public WebElement asphaltMaterialArchitecturalNavigationBarName;

    @FindBy(name = "Designer")
    public WebElement asphaltMaterialDesignerLink;

    @FindBy(name = "Designer")
    public WebElement asphaltMaterialDesignerNavigationBarName;

    @FindBy(name = "Diamond")
    public WebElement asphaltMaterialDiamondLink;

    @FindBy(name = "Diamond")
    public WebElement asphaltMaterialDiamondNavigationBarName;

    @FindBy(name = "Shake")
    public WebElement asphaltMaterialShakeLink;

    @FindBy(name = "Shake")
    public WebElement asphaltMaterialShakeNavigationBarName;

    @FindBy(name = "Slate")
    public WebElement asphaltMaterialSlateLink;

    @FindBy(name = "Slate")
    public WebElement asphaltMaterialSlateNavigationBarName;

    //Roof-->Asphalt-->Materials-->Submaterials-->Options

    @FindBy(name = "Brownwood")
    public WebElement asphaltMaterialsSubMaterialBrownwoodLink;

    @FindBy(name = "Teak")
    public WebElement asphaltMaterialsSubMaterialTeakLink;

    @FindBy(name = "Desert Tan")
    public WebElement asphaltMaterialsSubMaterialDesertTanLink;

    @FindBy(name = "Driftwood")
    public WebElement asphaltMaterialsSubMaterialDriftwoodLink;

    @FindBy(name = "Amber")
    public WebElement asphaltMaterialsSubMaterialAmberLink;

    @FindBy(name = "Oyster Shell")
    public WebElement asphaltMaterialsSubMaterialOysterShellLink;

    @FindBy(name = "Onyx Black Shell")
    public WebElement asphaltMaterialsSubMaterialOnixBlackShellLink;

    @FindBy(name = "Estate Gray")
    public WebElement asphaltMaterialsSubMaterialEstateGrayLink;

    @FindBy(name = "Quarry Gray")
    public WebElement asphaltMaterialsSubMaterialQuarryGrayLink;

    @FindBy(name = "Sierra Gray")
    public WebElement asphaltMaterialsSubMaterialSierraGrayLink;

    @FindBy(name = "Shasta White")
    public WebElement asphaltMaterialsSubMaterialShastaWhiteLink;

    @FindBy(name = "Metal")
    public WebElement roofMaterialMetalLink;

    @FindBy(name = "Metal")
    public WebElement roofMaterialMetalNavigationBarName;

    @FindBy(name = "Rib")
    public WebElement roofMaterialRibLink;

    @FindBy(name = "Rib")
    public WebElement roofMaterialRibNavigationBarName;

    @FindBy(name = "Standing Seam")
    public WebElement roofMaterialStandingSeamLink;

    @FindBy(name = "Standing Seam")
    public WebElement roofMaterialStandingSeamNavigationBarBName;

    @FindBy(name = "Shasta White")
    public WebElement roofMaterialsSubMaterialShastaWhite;

    @FindBy(name = "Teak")
    public WebElement roofMaterialsSubMaterialTeak;

    @FindBy(name = "Onyx Black")
    public WebElement roofMaterialsSubMaterialOnyxBlack;

    @FindBy(name = "Estate Gray")
    public WebElement roofMaterialsSubMaterialEstateGray;

    @FindBy(name = "Harbor Blue")
    public WebElement roofMaterialsSubMaterialHarborBlue;

    @FindBy(name = "Chateau Green")
    public WebElement roofMaterialsSubMaterialChateauGreen;

    @FindBy(name = "Terra Cotta")
    public WebElement roofMaterialsSubMaterialTerraCotta;

    @FindBy(name = "Tile")
    public WebElement roofMaterialTileLink;

    @FindBy(name = "Tile")
    public WebElement roofMaterialTileNavigationBarName;

    @FindBy(name = "Curved")
    public WebElement roofMaterialsTileCurvedLink;

    @FindBy(name = "Curved")
    public WebElement roofMaterialsTileCurvedNavigationBarName;

    @FindBy(name = "Flat")
    public WebElement roofMaterialsTileFlatLink;

    @FindBy(name = "Flat")
    public WebElement roofMaterialsTileFlatNavigationBarName;

    @FindBy(name = "Shingle")
    public WebElement roofMaterialsTileShingleLink;

    @FindBy(name = "Shingle")
    public WebElement roofMaterialsTileShingleNavigationBarName;

    @FindBy(name = "Barrel")
    public WebElement roofMaterialsTileBarrelLink;

    @FindBy(name = "Barrel")
    public WebElement roofMaterialsTileBarreNavigationBarName;

    @FindBy(name = "Terra Cotta")
    public WebElement roofTileMaterialsSubMaterialTerraCotta;

    @FindBy(name = "Teak")
    public WebElement roofTileMaterialsSubMaterialTeak;

    @FindBy(name = "Amber")
    public WebElement roofTileMaterialsSubMaterialAmber;

    @FindBy(name = "Quarry Gray")
    public WebElement roofTileMaterialsSubMaterialQuarryGray;

    @FindBy(name = "Wood")
    public WebElement roofMaterialWoodLink;

    @FindBy(name = "Wood")
    public WebElement roofMaterialWoodNavigationBarName;

    @FindBy(name = "Mersault")
    public WebElement roofMaterialWoodMersaultLink;

    @FindBy(name = "Mersault")
    public WebElement roofMaterialWoodMersaultNavigationBarName;

    @FindBy(name = "Shake")
    public WebElement roofMaterialWoodShakeLink;

    @FindBy(name = "Shake")
    public WebElement roofMaterialWoodShakeNavigationBarName;

    @FindBy(name = "Shingle")
    public WebElement roofMaterialWoodShingleLink;

    @FindBy(name = "Shingle")
    public WebElement roofMaterialWoodShingleNavigationBarName;

    @FindBy(name = "Desert Tan")
    public WebElement roofWoodMaterialsSubmaterialDesertTan;

    @FindBy(name = "Driftwood")
    public WebElement roofWoodMaterialsSubmaterialDriftwood;

    @FindBy(name = "Quarry Gray")
    public WebElement roofWoodMaterialsSubmaterialQuarryGray;

    @FindBy(name = "Walls")
    public WebElement wallsMaterialsLink;

    @FindBy(name = "Walls")
    public WebElement wallsMaterialsNavigationBarName;

    @FindBy(name = "Linen White")
    public WebElement wallsMaterialsLinenWhite;

    @FindBy(name = "Marigold")
    public WebElement wallsMaterialsMarigold;

    @FindBy(name = "Suede")
    public WebElement wallsMaterialsSuede;

    @FindBy(name = "Sable Brown")
    public WebElement wallsMaterialsSableBrown;

    @FindBy(name = "Autumn Red")
    public WebElement wallsMaterialsAutumnRed;

    @FindBy(name = "Measurements")
    public WebElement measurementsLink;

    @FindBy(name = "Roof")
    public WebElement roofMeasurementsLink;

    @FindBy(name = "Building 1")
    public WebElement roofMeasurementsNavigationBarName;

    @FindBy(name = "Roof Area")
    public WebElement roofAreaLink;

    @FindBy(name = "Roof Area")
    public WebElement roofAreaNavigationBarName;

    @FindBy(name = "Back")
    public WebElement roofMeasurementsBackLink;

    @FindBy(name = "Predominant Pitch")
    public WebElement predominantPitchLink;

    @FindBy(name = "Pitch")
    public WebElement predominantPitchNavigationBarName;

    @FindBy(name = "Eave Length")
    public WebElement eaveLengthLink;

    @FindBy(name = "Eave Length")
    public WebElement eaveLengthNavigationBarName;

    @FindBy(name = "Rake Length")
    public WebElement rakeLengthLink;

    @FindBy(name = "Rake Length")
    public WebElement rakeLengthNavigationBarName;

    @FindBy(name = "Ridge Length")
    public WebElement ridgeLengthLink;

    @FindBy(name = "Ridge Length")
    public WebElement RidgeLengthNavigationBarName;

    @FindBy(name = "Walls")
    public WebElement wallsMeasurementsLink;

    @FindBy(name = "Not Available")
    public WebElement wallsMeasurementsNotAvailable;

    @FindBy(name = "Wall Data Not Available")
    public WebElement wallDataNotAvailablePopup;

    @FindBy(name = "Walls shown in the diagram are for visualization purposes only and may not accurately represent the structure(s). For an accurate representation and access to measurement details, please call us to purchase a Walls Add-On for this address. Report:29320445 73 Lambeth Loop, Fairport, NY")
    public WebElement wallsMeasurementsMessage;

    @FindBy(name = "Call: 1(866)659-8439")
    public WebElement wallDataNotAvailablePhoneLink;

    @FindBy(name = "Close")
    public WebElement wallDataNotAvailablePoupCloseLink;


    public VisualizerScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public VisualizerScreen navigateFromPremiumReportDetailSToVisualizerScreen() throws AWTException, InterruptedException {
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = new CompletedPremiumOrderReportDetailScreen(driver);
        completedPremiumOrderReportDetailScreen.navigateToVisualizerScreen();
        sleep(2000);
        return new VisualizerScreen(driver);
    }

    public CompletedPremiumOrderReportDetailScreen navigateBackToCompletedPremiumOrderReportDetailScreen() throws AWTException, InterruptedException {
        navigateFromPremiumReportDetailSToVisualizerScreen();
        sleep(2000);
        backButton.click();
        sleep(2000);
        return new CompletedPremiumOrderReportDetailScreen(driver);
    }

    public void exposeMaterialsMenu() throws AWTException, InterruptedException {
        navigateFromPremiumReportDetailSToVisualizerScreen();
        sleep(2000);
        materialsLink.click();
        sleep(2000);
    }

    public void closeMaterialsMenu() throws AWTException, InterruptedException {
        navigateFromPremiumReportDetailSToVisualizerScreen();
        sleep(2000);
        materialsLink.click();
        sleep(2000);
        closeButton.click();
    }

    public void exposeMeasurementsMenu() throws AWTException, InterruptedException {
        navigateFromPremiumReportDetailSToVisualizerScreen();
        sleep(2000);
        measurementsLink.click();
        sleep(2000);
    }

    public void closeMeasurementsMenu() throws AWTException, InterruptedException {
        navigateFromPremiumReportDetailSToVisualizerScreen();
        sleep(2000);
        measurementsLink.click();
        sleep(2000);
        measurementsCloseButton.click();
    }
}
