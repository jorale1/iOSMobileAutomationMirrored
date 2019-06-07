package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class MapLegalPage extends BasePage {

    @FindBy(name = "URL")
    public WebElement legalURL;

    @FindBy(name = "Reader")
    public WebElement readerButton;

    @FindBy(name = "ReloadButton")
    public WebElement reloadButton;

    @FindBy(name = "Acknowledgements")
    public WebElement ackhowledgementsSection;

    @FindBy(name = "BottomBrowserToolbar")
    public WebElement bottomBrowserToolbar;

    @FindBy(name = "◀︎ EagleView")
    public WebElement backButton;

    public MapLegalPage(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public OrderReportFlowScreenAddressVerifier navigateBackToOrderRerportFlowScreenAddressVerifier() throws AWTException {
        backButton.click();
        return new OrderReportFlowScreenAddressVerifier(driver);
    }
}