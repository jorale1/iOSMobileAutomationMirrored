package EVMobile.PageObjects.skywalkerios.reportDetails;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PremiumReportUserSubmittedPhotosScreen extends BasePage {

    @FindBy(name = "Back")
    public WebElement backButton;

    @FindBy(name = "Photos")
    public WebElement screenTitle;

    @FindBy(name = "Your Photos")
    public WebElement screenSubTitle;

    @FindBy(name = "Add your first photo")
    public WebElement addFirstPhotoTitle;

    @FindBy(name = "Aerial Photos")
    public WebElement aerialPhotos;

    public PremiumReportUserSubmittedPhotosScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
