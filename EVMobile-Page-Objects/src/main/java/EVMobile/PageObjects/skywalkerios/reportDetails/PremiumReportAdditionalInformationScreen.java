package EVMobile.PageObjects.skywalkerios.reportDetails;

import EVMobile.Framework.core.BasePage;
import EVMobile.Framework.core.LoginAccounts;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

import static java.lang.Thread.sleep;

public class PremiumReportAdditionalInformationScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backToSettingsButton;

    @FindBy(name = "Additional Information")
    public WebElement screenTitle;

    @FindBy(name = "Email Recipients")
    public WebElement emailRecipientsSubtitle;

    @FindBy(name = "claire.foster@eagleview.com")
    public WebElement emailAccount;

    public PremiumReportAdditionalInformationScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public PremiumReportAdditionalInformationScreen navigateFromPremiumReportDetailSToAdditionalInfoScreen() throws AWTException, InterruptedException {
        CompletedPremiumOrderReportDetailScreen completedPremiumOrderReportDetailScreen = new CompletedPremiumOrderReportDetailScreen(driver);
        completedPremiumOrderReportDetailScreen.navigateToAdditionalInformationScreen();
        sleep(2000);
        return new PremiumReportAdditionalInformationScreen(driver);
    }

    public CompletedPremiumOrderReportDetailScreen navigateBackToCompletedPremiumOrderReportDetailScreen() throws AWTException, InterruptedException {
        navigateFromPremiumReportDetailSToAdditionalInfoScreen();
        sleep(2000);
        backToSettingsButton.click();
        sleep(2000);
        return new CompletedPremiumOrderReportDetailScreen(driver);
    }

    public boolean verifyAccountAdditionalEmail() throws AWTException, InterruptedException {
        navigateFromPremiumReportDetailSToAdditionalInfoScreen();
        boolean accountIsEqual = false;
        sleep(2000);
        if (emailAccount.getText().equals(LoginAccounts.ACCOUNT_WITH_COMPLETED_REPORTS_EMAIL)) {
            accountIsEqual = true;
        }
        return accountIsEqual;
    }
}
