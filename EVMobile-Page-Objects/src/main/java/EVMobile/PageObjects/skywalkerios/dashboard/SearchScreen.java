package EVMobile.PageObjects.skywalkerios.dashboard;

import EVMobile.Framework.core.BasePage;
import EVMobile.Framework.core.SearchData;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.time.Duration;

import static java.lang.Thread.sleep;

public class SearchScreen extends BasePage {

    @FindBy(name = "Search")
    public WebElement pageName;

    @FindBy(name = "Search reports using, Address, Report No, CAT ID, Project Name, Claim No")
    public WebElement pageSbutitle;

    @FindBy(name = "Cross")
    public WebElement closeButton;

    @FindBy(name = "Cancel")
    public WebElement cancelLink;

    @FindBy(name = "Address")
    public WebElement searchFieldAddress;

    @FindBy(name = "Report #")
    public WebElement searchFieldReportNo;

    @FindBy(name = "Claim #")
    public WebElement searchFieldClaimNo;

    @FindBy(name = "Cat ID")
    public WebElement searchFieldCatID;

    @FindBy(name = "Project Name")
    public WebElement searchFieldProjectName;

    @FindBy(name = "Clear text")
    public WebElement clearTextButton;

    @FindBy(name = "Clear")
    public WebElement recentClearButton;

    @FindBy(name = "Recent")
    public WebElement recentLabel;

    @FindBy(name = "No Reports Found")
    public WebElement reportsNotFoundFormTitle;

    public SearchScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public SearchScreen navigateFromDashboardToSearchScreen() throws AWTException, InterruptedException {
        DashBoardScreen dashBoardScreen = new DashBoardScreen(driver);
        dashBoardScreen.navigateToSearchScreen();
        sleep(2000);
        return new SearchScreen(driver);
    }

    public void clickOnAddressLink() throws InterruptedException {
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(52, 121)).perform();
    }

    public void clickOnReportNoLink() throws InterruptedException {
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(168, 121)).perform();
    }

    public void clickOnClaimNoLink() throws InterruptedException {
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(280, 121)).perform();
    }

    public void clickOnCatIDLink() throws InterruptedException {
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(200, 121)).perform();
    }

    public void clickOnProjectNameLink() throws InterruptedException {
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(200, 121)).perform();
    }

    public void searchByAddress(String enteredAddress) throws AWTException, InterruptedException {
        navigateFromDashboardToSearchScreen();
        clickOnAddressLink();
        searchFieldAddress.sendKeys(enteredAddress);
        sleep(2000);
    }

    public void searchByReportNumber(String enteredReportNumber) throws AWTException, InterruptedException {
        navigateFromDashboardToSearchScreen();
        searchFieldAddress.click();
        sleep(2000);
        clickOnReportNoLink();
        searchFieldReportNo.sendKeys(enteredReportNumber);
        sleep(2000);
    }

    public void searchByClaimNumber(String enteredClaimNumber) throws AWTException, InterruptedException {
        navigateFromDashboardToSearchScreen();
        searchFieldAddress.click();
        sleep(2000);
        clickOnClaimNoLink();
        searchFieldClaimNo.sendKeys(enteredClaimNumber);
        sleep(2000);
    }

    public void searchByCatID(String enteredCatID) throws AWTException, InterruptedException {
        navigateFromDashboardToSearchScreen();
        searchFieldAddress.click();
        sleep(2000);
        clickOnClaimNoLink();
        swapPageToCatIDAndProjectName("S-Iphone X");
        sleep(2000);
        clickOnCatIDLink();
        searchFieldCatID.sendKeys(enteredCatID);
        sleep(2000);
    }

    public void searchByProjectName(String enteredProjectName) throws AWTException, InterruptedException {
        navigateFromDashboardToSearchScreen();
        searchFieldAddress.click();
        sleep(2000);
        clickOnClaimNoLink();
        swapPageToCatIDAndProjectName("S-Iphone X");
        sleep(2000);
        clickOnProjectNameLink();
        searchFieldProjectName.sendKeys(enteredProjectName);
        sleep(2000);
    }

    public void swapPageToCatIDAndProjectName(String device) throws InterruptedException {
        if (device.equalsIgnoreCase("S-Iphone X")) {
            TouchAction ta = new TouchAction(driver);
            ta.press(PointOption.point(351, 117)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(23, 117)).release().perform();
        } else if (device.equalsIgnoreCase("S-Iphone 6")) {
            TouchAction ta = new TouchAction(driver);
            ta.press(PointOption.point(181, 546)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(181, 208)).release().perform();
        }
    }

    public void storeRecentSearches() throws InterruptedException, AWTException {
        navigateFromDashboardToSearchScreen();
        searchFieldAddress.click();
        searchFieldAddress.sendKeys(SearchData.VALID_ADDRESS_CITY);
        cancelLink.click();
    }

    public DashBoardScreen navigateFromRecentSearchsBackToDashboard() throws AWTException, InterruptedException {
        searchFieldAddress.click();
        searchFieldAddress.sendKeys(SearchData.VALID_ADDRESS_CITY);
        cancelLink.click();
        closeButton.click();
        return new DashBoardScreen(driver);
    }

    public DashBoardScreen clearRecentSearches() throws AWTException, InterruptedException {
        storeRecentSearches();
        sleep(2000);
        closeButton.click();
        sleep(2000);
        return new DashBoardScreen(driver);
    }

}
