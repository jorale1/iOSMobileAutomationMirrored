package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.*;

public class PrivacyPolicy extends BasePage {

    @FindBy(name = "URL")
    public WebElement url;

    @FindBy(name = "Done")
    public WebElement privacyPolicyDone;

    public PrivacyPolicy(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public SignUpFlowScreenEmail navigateBackToEmailScreen() throws AWTException {
        privacyPolicyDone.click();
        return new SignUpFlowScreenEmail(driver);
    }
}