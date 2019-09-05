package EVMobile.PageObjects.skywalkerios.reportDetails;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    public WebElement structureForm1;

    public MaterialsWasteCalculationScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
