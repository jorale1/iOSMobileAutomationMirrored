package EVMobile.PageObjects.skywalkerios.reportDetails;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PremiumReportAdditionalInformationScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backToSettingsButton;

    @FindBy(name = "Additional Information")
    public WebElement screenTitle;

    @FindBy(name = "Email Recipients")
    public WebElement emailRecipientsSubtitle;

    public PremiumReportAdditionalInformationScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
