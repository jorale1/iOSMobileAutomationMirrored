package EVMobile.PageObjects.skywalkerios.reportDetails;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PremiumViewReportPDFRegeneratingScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backToSettingsButton;

    @FindBy(name = "REGENERATING REPORT")
    public WebElement screenTitle;

    @FindBy(name = "Share")
    public WebElement shareLink;

    @FindBy(name = "In Progress")
    public WebElement inProgressIcon;

    public PremiumViewReportPDFRegeneratingScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
