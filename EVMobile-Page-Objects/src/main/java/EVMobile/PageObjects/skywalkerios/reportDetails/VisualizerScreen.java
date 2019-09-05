package EVMobile.PageObjects.skywalkerios.reportDetails;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VisualizerScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "ARKit")
    public WebElement arkitLink;

    @FindBy(name = "VisualizerWatermarkLogo")
    public WebElement visualizerLogo;

    @FindBy(name = "Materials")
    public WebElement materialsLink;

    @FindBy(name = "Measurements")
    public WebElement measurementsLink;

    public VisualizerScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
