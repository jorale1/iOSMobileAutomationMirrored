package EVMobile.PageObjects.skywalkerios.reportDetails;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PremiumReportQuotesScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Quotes")
    public WebElement screenTitle;

    @FindBy(name = "Edit")
    public WebElement editLink;

    public PremiumReportQuotesScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
