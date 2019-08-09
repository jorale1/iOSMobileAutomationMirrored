package Tests.WelcomeScreen;

import EVMobile.Framework.core.SearchData;
import EVMobile.PageObjects.skywalkerios.dashboard.DashBoardScreen;
import EVMobile.PageObjects.skywalkerios.dashboard.SearchScreen;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

public class SearchScreenTests extends BaseMobileTest {


    @Test(priority = 1) @Ignore
    public void testSearchScreen() throws InterruptedException, AWTException {
        DashBoardScreen dashBoardScreen = new DashBoardScreen(getDriver());
        SearchScreen searchScreen = dashBoardScreen.navigateToSearchScreen();
        Assert.assertTrue(searchScreen.pageName.isEnabled());
    }

    @Test(priority = 2) @Ignore
    public void testSearchByInvalidAddressNoResults() throws InterruptedException, AWTException {
        SearchScreen searchScreen = new SearchScreen(getDriver());
        searchScreen.searchByAddress(SearchData.INVALID_ADDRESS);
        Assert.assertTrue(searchScreen.reportsNotFoundFormTitle.isEnabled());
    }

    @Test(priority = 3) @Ignore
    public void testSearchByAddressEnterSpaceNoResults() throws InterruptedException, AWTException {
        SearchScreen searchScreen = new SearchScreen(getDriver());
        searchScreen.searchByAddress(SearchData.INVALID_ADDRESS_SPACES);
        Assert.assertTrue(searchScreen.reportsNotFoundFormTitle.isEnabled());
    }

    @Test(priority = 4) @Ignore
    public void testSearchByValidAddressButNoOrder() throws InterruptedException, AWTException {
        SearchScreen searchScreen = new SearchScreen(getDriver());
        searchScreen.searchByAddress(SearchData.VALID_ADDRESS_CITY);
        Assert.assertTrue(searchScreen.reportsNotFoundFormTitle.isEnabled());
    }

    @Test(priority = 5) @Ignore
    public void testSearchByInvalidReportNumberNoResults() throws InterruptedException, AWTException {
        SearchScreen searchScreen = new SearchScreen(getDriver());
        searchScreen.searchByReportNumber(SearchData.INVALID_REPORT_NO_DOESNOT_EXIST);
        Assert.assertTrue(searchScreen.reportsNotFoundFormTitle.isEnabled());
    }

    @Test(priority = 6) @Ignore
    public void testSearchByInvalidReportNumberEnterCharsNoResults() throws InterruptedException, AWTException {
        SearchScreen searchScreen = new SearchScreen(getDriver());
        searchScreen.searchByReportNumber(SearchData.INVALID_REPORT_NO_CHAR_VALUE);
        Assert.assertTrue(searchScreen.reportsNotFoundFormTitle.isEnabled());
    }

    @Test(priority = 7) @Ignore
    public void testSearchByValidReportNumberFromOtherAccount() throws InterruptedException, AWTException {
        SearchScreen searchScreen = new SearchScreen(getDriver());
        searchScreen.searchByReportNumber(SearchData.VALID_REPORT_NO_OTHER_ACCOUNT);
        Assert.assertTrue(searchScreen.reportsNotFoundFormTitle.isEnabled());
    }

    @Test(priority = 8) @Ignore
    public void testSearchByInvalidClaimNumberNoResults() throws InterruptedException, AWTException {
        SearchScreen searchScreen = new SearchScreen(getDriver());
        searchScreen.searchByClaimNumber(SearchData.INVALID_CLAIM_NO_DOESNOT_EXIST);
        Assert.assertTrue(searchScreen.reportsNotFoundFormTitle.isEnabled());
    }

    @Test(priority = 9) @Ignore
    public void testSearchByInvalidClaimNumberEnterCharsNoResults() throws InterruptedException, AWTException {
        SearchScreen searchScreen = new SearchScreen(getDriver());
        searchScreen.searchByClaimNumber(SearchData.INVALID_CLAIM_NO_CHAR_VALUE);
        Assert.assertTrue(searchScreen.reportsNotFoundFormTitle.isEnabled());
    }

    @Test(priority = 10) @Ignore
    public void testSearchByValidClaimNumberFromOtherAccount() throws InterruptedException, AWTException {
        SearchScreen searchScreen = new SearchScreen(getDriver());
        searchScreen.searchByClaimNumber(SearchData.VALID_CLAIM_NO_OTHER_ACCOUNT);
        Assert.assertTrue(searchScreen.reportsNotFoundFormTitle.isEnabled());
    }

    @Test(priority = 11) @Ignore
    public void testSearchByInvalidCatIDNoResults() throws InterruptedException, AWTException {
        SearchScreen searchScreen = new SearchScreen(getDriver());
        searchScreen.searchByCatID(SearchData.INVALID_CATID_NO_DOESNOT_EXIST);
        Assert.assertTrue(searchScreen.reportsNotFoundFormTitle.isEnabled());
    }

    @Test(priority = 12) @Ignore
    public void testSearchByInvalidCatIDEnterCharsNoResults() throws InterruptedException, AWTException {
        SearchScreen searchScreen = new SearchScreen(getDriver());
        searchScreen.searchByCatID(SearchData.INVALID_CATID_NO_CHAR_VALUE);
        Assert.assertTrue(searchScreen.reportsNotFoundFormTitle.isEnabled());
    }

    @Test(priority = 13) @Ignore
    public void testSearchByValidCatIDFromOtherAccount() throws InterruptedException, AWTException {
        SearchScreen searchScreen = new SearchScreen(getDriver());
        searchScreen.searchByCatID(SearchData.VALID_CATID_NO_OTHER_ACCOUNT);
        Assert.assertTrue(searchScreen.reportsNotFoundFormTitle.isEnabled());
    }

    @Test(priority = 14) @Ignore
    public void testSearchByInvalidProjectNameNoResults() throws InterruptedException, AWTException {
        SearchScreen searchScreen = new SearchScreen(getDriver());
        searchScreen.searchByProjectName(SearchData.INVALID_PROJECT_NAME_DOESNOT_EXIST);
        Assert.assertTrue(searchScreen.reportsNotFoundFormTitle.isEnabled());
    }

    @Test(priority = 15) @Ignore
    public void testSearchByInvalidProjectNameSpecialCharsNoResults() throws InterruptedException, AWTException {
        SearchScreen searchScreen = new SearchScreen(getDriver());
        searchScreen.searchByProjectName(SearchData.INVALID_PROJECT_NAME_SPECIAL_CHARS);
        Assert.assertTrue(searchScreen.reportsNotFoundFormTitle.isEnabled());
    }

    @Test(priority = 16) @Ignore
    public void testSearchByValidProjectNameFromOtherAccount() throws InterruptedException, AWTException {
        SearchScreen searchScreen = new SearchScreen(getDriver());
        searchScreen.searchByProjectName(SearchData.VALID_PROJECT_NAME_OTHER_ACCOUNT);
        Assert.assertTrue(searchScreen.reportsNotFoundFormTitle.isEnabled());
    }

    @Test(priority = 17) @Ignore
    public void testRecentSearchsAreStoredWhenCancel() throws InterruptedException, AWTException {
        SearchScreen searchScreen = new SearchScreen(getDriver());
        searchScreen.storeRecentSearches();
        Assert.assertTrue(searchScreen.recentLabel.isEnabled());
    }

    @Test(priority = 18)
    public void testClearRecentSearchs() throws InterruptedException, AWTException {
        SearchScreen searchScreen = new SearchScreen(getDriver());
        DashBoardScreen dashBoardScreen = searchScreen.clearRecentSearches();
        dashBoardScreen.searchButton.click();
        searchScreen.searchFieldAddress.click();
        searchScreen.recentClearButton.click();
        Assert.assertTrue(searchScreen.pageSbutitle.isEnabled());
    }
}
