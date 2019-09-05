package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExternaliOSActivityListScreen extends BasePage {

    @FindBy(name = "Copy")
    public WebElement copyButton;

    @FindBy(name = "Print")
    public WebElement printButton;

    @FindBy(name = "Save to Files")
    public WebElement saveToFilesButton;

    @FindBy(name = "Create PDF")
    public WebElement createPDFButton;

    @FindBy(name = "More")
    public WebElement moreButton;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    public ExternaliOSActivityListScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
