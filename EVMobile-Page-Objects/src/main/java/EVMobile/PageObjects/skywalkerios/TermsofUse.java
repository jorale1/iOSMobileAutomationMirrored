package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.*;

public class TermsofUse extends BasePage {

    @FindBy(name = "URL")
    public WebElement TermsUrl;

    @FindBy(name = "Done")
    public WebElement termsDone;

    public TermsofUse(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public SignUpFlowScreenEmail navigateBackToEmailScreen() throws AWTException {
        termsDone.click();
        return new SignUpFlowScreenEmail(driver);
    }
}