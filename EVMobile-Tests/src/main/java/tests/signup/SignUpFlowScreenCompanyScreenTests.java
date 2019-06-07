package tests.signup;

import EVMobile.PageObjects.skywalkerios.pages.dashboard.DashBoardScreen;
import EVMobile.PageObjects.skywalkerios.pages.signup.SignUpFlowScreenCompanyScreen;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseMobileTest;

import java.util.HashMap;

import static java.lang.Thread.sleep;

public class SignUpFlowScreenCompanyScreenTests extends BaseMobileTest {

        /*
    public String pickerWheelValues(String selectedState) {

        HashMap<String, String> stateAndCodeList = new HashMap<>();

        stateAndCodeList.put("Choose One", "State/Province");
        stateAndCodeList.put("Alabama", "AL");
        stateAndCodeList.put("Alaska", "AK");
        stateAndCodeList.put("Arizona", "AZ");
        stateAndCodeList.put("Arkansas", "AR");
        stateAndCodeList.put("California", "CA");
        stateAndCodeList.put("Colorado", "CO");
        stateAndCodeList.put("Connecticut", "CT");
        stateAndCodeList.put("Delaware", "DE");
        stateAndCodeList.put("District of Columbia", "DC");
        stateAndCodeList.put("Florida", "FL");
        stateAndCodeList.put("Georgia", "GA");
        stateAndCodeList.put("Hawaii", "HI");
        stateAndCodeList.put("Idaho", "ID");
        stateAndCodeList.put("Illinois", "IL");
        stateAndCodeList.put("Indiana", "IN");
        stateAndCodeList.put("Iowa", "IA");
        stateAndCodeList.put("Kansas", "KS");
        stateAndCodeList.put("Kentucky", "KY");
        stateAndCodeList.put("Louisiana", "LA");
        stateAndCodeList.put("Maine", "ME");
        stateAndCodeList.put("Maryland", "MD");
        stateAndCodeList.put("Massachusetts", "MA");
        stateAndCodeList.put("Michigan", "MI");
        stateAndCodeList.put("Minnesota", "MN");
        stateAndCodeList.put("Mississippi", "MS");
        stateAndCodeList.put("Missouri", "MO");
        stateAndCodeList.put("Montana", "MT");
        stateAndCodeList.put("Nebraska", "NE");
        stateAndCodeList.put("Nevada", "NV");
        stateAndCodeList.put("New Hampshire", "NH");
        stateAndCodeList.put("New Jersey", "NJ");
        stateAndCodeList.put("New Mexico", "NM");
        stateAndCodeList.put("New York", "NY");
        stateAndCodeList.put("North Carolina", "NC");
        stateAndCodeList.put("North Dakota", "ND");
        stateAndCodeList.put("Ohio", "OH");
        stateAndCodeList.put("Oklahoma", "OK");
        stateAndCodeList.put("Oregon", "OR");
        stateAndCodeList.put("Pennsylvania", "PA");
        stateAndCodeList.put("Puerto Rico", "PR");
        stateAndCodeList.put("Rhode Island", "RI");
        stateAndCodeList.put("South Carolina", "SC");
        stateAndCodeList.put("South Dakota", "SD");
        stateAndCodeList.put("Tennessee", "TN");
        stateAndCodeList.put("Texas", "TX");
        stateAndCodeList.put("Utah", "UT");
        stateAndCodeList.put("Vermont", "VT");
        stateAndCodeList.put("Virginia", "VI");
        stateAndCodeList.put("Washington", "WA");
        stateAndCodeList.put("West Virginia", "WV");
        stateAndCodeList.put("Winsconsin", "WI");
        stateAndCodeList.put("Wyoming", "WY");
        stateAndCodeList.put("British Columbia", "BC");
        stateAndCodeList.put("Manitoba", "MB");
        stateAndCodeList.put("New Burnswick", "NB");
        stateAndCodeList.put("Newfoundland and Labrador", "NL");
        stateAndCodeList.put("Northwest Territories", "NT");
        stateAndCodeList.put("Nova Scotia", "NS");
        stateAndCodeList.put("Nunavut", "NU");
        stateAndCodeList.put("Ontario", "ON");
        stateAndCodeList.put("Prince Edward Island", "PE");
        stateAndCodeList.put("Quebec", "QC");
        stateAndCodeList.put("Saskatchewan", "SK");
        stateAndCodeList.put("Yukon", "YK");
        return stateAndCodeList.get(selectedState);
    }

    @Test(priority = 1)
    public void testSelectStateUS() throws InterruptedException {
        SignUpFlowScreenCompanyScreen signUpFlowScreenCompanyScreen = new SignUpFlowScreenCompanyScreen(getDriver());
        signUpFlowScreenCompanyScreen.navigateToStartTest();
        String stateSelected = "District of Columbia";
        signUpFlowScreenCompanyScreen.selectStateFromStatePicker(stateSelected);
        sleep(2000);
        signUpFlowScreenCompanyScreen.companyDone.click();
        Assert.assertTrue(signUpFlowScreenCompanyScreen.state.getAttribute("value").equals(pickerWheelValues(stateSelected)));
    }

    @Test(priority = 2)
    public void testSelectProvinceCanada() throws InterruptedException {
        SignUpFlowScreenCompanyScreen signUpFlowScreenCompanyScreen = new SignUpFlowScreenCompanyScreen(getDriver());
        signUpFlowScreenCompanyScreen.navigateToStartTest();
        String stateSelected = "Newfoundland and Labrador";
        signUpFlowScreenCompanyScreen.selectStateFromStatePicker(stateSelected);
        sleep(2000);
        signUpFlowScreenCompanyScreen.companyDone.click();
        Assert.assertTrue(signUpFlowScreenCompanyScreen.state.getAttribute("value").equals(pickerWheelValues(stateSelected)));
    }

    @Test(priority = 3)
    public void testSelectNoState() throws InterruptedException {
        SignUpFlowScreenCompanyScreen signUpFlowScreenCompanyScreen = new SignUpFlowScreenCompanyScreen(getDriver());
        signUpFlowScreenCompanyScreen.navigateToStartTest();
        String stateSelected = "Choose One";
        signUpFlowScreenCompanyScreen.selectStateFromStatePicker(stateSelected);
        sleep(2000);
        signUpFlowScreenCompanyScreen.companyDone.click();
        Assert.assertTrue(signUpFlowScreenCompanyScreen.state.getAttribute("value").equals(pickerWheelValues(stateSelected)));
    }

    @Test(priority = 4)
    public void testNameAndStateDefaultValues() throws InterruptedException {
        SignUpFlowScreenCompanyScreen signUpFlowScreenCompanyScreen = new SignUpFlowScreenCompanyScreen(getDriver());
        signUpFlowScreenCompanyScreen.navigateToStartTest();
        Assert.assertTrue(signUpFlowScreenCompanyScreen.statePicker.getAttribute("value").equalsIgnoreCase("Choose One"));
        Assert.assertTrue(signUpFlowScreenCompanyScreen.state.getAttribute("value").equalsIgnoreCase("State/Province"));
    }

    @Test(priority = 5)
    public void testDatePickerDefault() throws InterruptedException {
        SignUpFlowScreenCompanyScreen signUpFlowScreenCompanyScreen = new SignUpFlowScreenCompanyScreen(getDriver());
        signUpFlowScreenCompanyScreen.navigateToStartTest();
        signUpFlowScreenCompanyScreen.state.click();
        Assert.assertTrue(signUpFlowScreenCompanyScreen.statePickerwheel.getAttribute("value").equalsIgnoreCase("Choose One"));
    }

    @Test(priority = 6)
    public void testCreateAccountWithoutEnteringData() throws InterruptedException {
        SignUpFlowScreenCompanyScreen signUpFlowScreenCompanyScreen = new SignUpFlowScreenCompanyScreen(getDriver());
        signUpFlowScreenCompanyScreen.navigateToStartTest();
        signUpFlowScreenCompanyScreen.createAccount.click();
        Assert.assertTrue(signUpFlowScreenCompanyScreen.companyName.isDisplayed());
    }

    @Test(priority = 7)
    public void testCreateAccountWithoutEnteringName() throws InterruptedException {
        SignUpFlowScreenCompanyScreen signUpFlowScreenCompanyScreen = new SignUpFlowScreenCompanyScreen(getDriver());
        signUpFlowScreenCompanyScreen.navigateToStartTest();
        signUpFlowScreenCompanyScreen.selectState("Colorado");
        signUpFlowScreenCompanyScreen.createAccount.click();
        Assert.assertTrue(signUpFlowScreenCompanyScreen.companyName.isDisplayed());
    }

    @Test(priority = 8)
    public void testCreateAccountWithoutSelectingState() throws InterruptedException {
        SignUpFlowScreenCompanyScreen signUpFlowScreenCompanyScreen = new SignUpFlowScreenCompanyScreen(getDriver());
        signUpFlowScreenCompanyScreen.navigateToStartTest();
        signUpFlowScreenCompanyScreen.companyName.sendKeys("CompanyTest1");
        signUpFlowScreenCompanyScreen.keyboarddone.click();
        signUpFlowScreenCompanyScreen.companyDone.click();
        signUpFlowScreenCompanyScreen.createAccount.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenCompanyScreen.companyName.isDisplayed());
    }

    @Test(priority = 9)
    public void testCreateAccountEnteringSpaceforName() throws InterruptedException {
        SignUpFlowScreenCompanyScreen signUpFlowScreenCompanyScreen = new SignUpFlowScreenCompanyScreen(getDriver());
        signUpFlowScreenCompanyScreen.navigateToStartTest();
        signUpFlowScreenCompanyScreen.companyName.sendKeys(" ");
        signUpFlowScreenCompanyScreen.keyboarddone.click();
        signUpFlowScreenCompanyScreen.selectState("Colorado");
        signUpFlowScreenCompanyScreen.createAccount.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenCompanyScreen.companyName.isDisplayed());
    }

    @Test(priority = 10)
    public void testCompanyNameMoreThan83CharsInvalid() throws InterruptedException {
        SignUpFlowScreenCompanyScreen signUpFlowScreenCompanyScreen = new SignUpFlowScreenCompanyScreen(getDriver());
        signUpFlowScreenCompanyScreen.navigateToStartTest();
        signUpFlowScreenCompanyScreen.companyName.sendKeys("123456789012345678901234567890123456789012345678901234567890123456789012345678901234");
        signUpFlowScreenCompanyScreen.selectState("Colorado");
        signUpFlowScreenCompanyScreen.createAccount.click();
        Assert.assertTrue(signUpFlowScreenCompanyScreen.companyName.isDisplayed());
    }

    @Test(priority = 11)
    public void testCompanyNameUpTo83CharsValid() throws InterruptedException {
        SignUpFlowScreenCompanyScreen signUpFlowScreenCompanyScreen = new SignUpFlowScreenCompanyScreen(getDriver());
        signUpFlowScreenCompanyScreen.navigateToStartTest();
        signUpFlowScreenCompanyScreen.companyName.sendKeys("12345678901234567890123456789012345678901234567890123456789012345678901234567890123");
        signUpFlowScreenCompanyScreen.keyboarddone.click();
        signUpFlowScreenCompanyScreen.companyDone.click();
        signUpFlowScreenCompanyScreen.createAccount.click();
        Assert.assertTrue(signUpFlowScreenCompanyScreen.companyName.isDisplayed());
    }

    @Test(priority = 12)
    public void testCreateAccountwithPreexistingEmail() throws InterruptedException {
        SignUpFlowScreenCompanyScreen signUpFlowScreenCompanyScreen = new SignUpFlowScreenCompanyScreen(getDriver());
        signUpFlowScreenCompanyScreen.signUpWithPreexistingEmail();
        signUpFlowScreenCompanyScreen.companyName.sendKeys("CompanyTest");
        signUpFlowScreenCompanyScreen.keyboarddone.click();
        signUpFlowScreenCompanyScreen.selectState("Colorado");
        signUpFlowScreenCompanyScreen.createAccount.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenCompanyScreen.errorAlert.isEnabled());
        Assert.assertTrue(signUpFlowScreenCompanyScreen.errorMessage.isDisplayed());
    }

    @Test(priority = 13)
    public void testDismissErrorMessageBringsBackSignUpScreen() throws InterruptedException {
        SignUpFlowScreenCompanyScreen signUpFlowScreenCompanyScreen = new SignUpFlowScreenCompanyScreen(getDriver());
        signUpFlowScreenCompanyScreen.signUpWithPreexistingEmail();
        signUpFlowScreenCompanyScreen.companyName.sendKeys("CompanyTest");
        signUpFlowScreenCompanyScreen.keyboarddone.click();
        signUpFlowScreenCompanyScreen.selectState("Colorado");
        signUpFlowScreenCompanyScreen.createAccount.click();
        sleep(2000);
        signUpFlowScreenCompanyScreen.errorDismiss.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenCompanyScreen.companyName.isDisplayed());
    }

    @Test(priority = 14)
    public void testUserSignUpWithValidData() throws InterruptedException {
        SignUpFlowScreenCompanyScreen signUpFlowScreenCompanyScreen = new SignUpFlowScreenCompanyScreen(getDriver());
        signUpFlowScreenCompanyScreen.signUpWithValidData();
        signUpFlowScreenCompanyScreen.companyName.sendKeys("CompanyTest");
        signUpFlowScreenCompanyScreen.keyboarddone.click();
        signUpFlowScreenCompanyScreen.selectState("Colorado");
        signUpFlowScreenCompanyScreen.createAccount.click();
        sleep(2000);
        DashBoardScreen dashBoard = new DashBoardScreen(getDriver());
        sleep(5000);
        Assert.assertTrue(dashBoard.dashboardForm.isDisplayed());
    }

    */
}
