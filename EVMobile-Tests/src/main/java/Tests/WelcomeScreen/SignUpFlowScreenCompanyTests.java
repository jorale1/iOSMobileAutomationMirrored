package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.DashBoardScreen;
import EVMobile.PageObjects.skywalkerios.SignUpFlowScreenCompany;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

import static java.lang.Thread.sleep;

public class SignUpFlowScreenCompanyTests extends BaseMobileTest {

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
        SignUpFlowScreenCompany signUpFlowScreenCompany = new SignUpFlowScreenCompany(getDriver());
        signUpFlowScreenCompany.navigateToStartTest();
        String stateSelected = "District of Columbia";
        signUpFlowScreenCompany.selectStateFromStatePicker(stateSelected);
        sleep(2000);
        signUpFlowScreenCompany.companyDone.click();
        Assert.assertTrue(signUpFlowScreenCompany.state.getAttribute("value").equals(pickerWheelValues(stateSelected)));
    }

    @Test(priority = 2)
    public void testSelectProvinceCanada() throws InterruptedException {
        SignUpFlowScreenCompany signUpFlowScreenCompany = new SignUpFlowScreenCompany(getDriver());
        signUpFlowScreenCompany.navigateToStartTest();
        String stateSelected = "Newfoundland and Labrador";
        signUpFlowScreenCompany.selectStateFromStatePicker(stateSelected);
        sleep(2000);
        signUpFlowScreenCompany.companyDone.click();
        Assert.assertTrue(signUpFlowScreenCompany.state.getAttribute("value").equals(pickerWheelValues(stateSelected)));
    }

    @Test(priority = 3)
    public void testSelectNoState() throws InterruptedException {
        SignUpFlowScreenCompany signUpFlowScreenCompany = new SignUpFlowScreenCompany(getDriver());
        signUpFlowScreenCompany.navigateToStartTest();
        String stateSelected = "Choose One";
        signUpFlowScreenCompany.selectStateFromStatePicker(stateSelected);
        sleep(2000);
        signUpFlowScreenCompany.companyDone.click();
        Assert.assertTrue(signUpFlowScreenCompany.state.getAttribute("value").equals(pickerWheelValues(stateSelected)));
    }

    @Test(priority = 4)
    public void testNameAndStateDefaultValues() throws InterruptedException {
        SignUpFlowScreenCompany signUpFlowScreenCompany = new SignUpFlowScreenCompany(getDriver());
        signUpFlowScreenCompany.navigateToStartTest();
        Assert.assertTrue(signUpFlowScreenCompany.statePicker.getAttribute("value").equalsIgnoreCase("Choose One"));
        Assert.assertTrue(signUpFlowScreenCompany.state.getAttribute("value").equalsIgnoreCase("State/Province"));
    }

    @Test(priority = 5)
    public void testDatePickerDefault() throws InterruptedException {
        SignUpFlowScreenCompany signUpFlowScreenCompany = new SignUpFlowScreenCompany(getDriver());
        signUpFlowScreenCompany.navigateToStartTest();
        signUpFlowScreenCompany.state.click();
        Assert.assertTrue(signUpFlowScreenCompany.statePickerwheel.getAttribute("value").equalsIgnoreCase("Choose One"));
    }

    @Test(priority = 6)
    public void testCreateAccountWithoutEnteringData() throws InterruptedException {
        SignUpFlowScreenCompany signUpFlowScreenCompany = new SignUpFlowScreenCompany(getDriver());
        signUpFlowScreenCompany.navigateToStartTest();
        signUpFlowScreenCompany.createAccount.click();
        Assert.assertTrue(signUpFlowScreenCompany.companyName.isDisplayed());
    }

    @Test(priority = 7)
    public void testCreateAccountWithoutEnteringName() throws InterruptedException {
        SignUpFlowScreenCompany signUpFlowScreenCompany = new SignUpFlowScreenCompany(getDriver());
        signUpFlowScreenCompany.navigateToStartTest();
        signUpFlowScreenCompany.selectState("Colorado");
        signUpFlowScreenCompany.createAccount.click();
        Assert.assertTrue(signUpFlowScreenCompany.companyName.isDisplayed());
    }

    @Test(priority = 8)
    public void testCreateAccountWithoutSelectingState() throws InterruptedException {
        SignUpFlowScreenCompany signUpFlowScreenCompany = new SignUpFlowScreenCompany(getDriver());
        signUpFlowScreenCompany.navigateToStartTest();
        signUpFlowScreenCompany.companyName.sendKeys("CompanyTest1");
        signUpFlowScreenCompany.keyboarddone.click();
        signUpFlowScreenCompany.companyDone.click();
        signUpFlowScreenCompany.createAccount.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenCompany.companyName.isDisplayed());
    }

    @Test(priority = 9)
    public void testCreateAccountEnteringSpaceforName() throws InterruptedException {
        SignUpFlowScreenCompany signUpFlowScreenCompany = new SignUpFlowScreenCompany(getDriver());
        signUpFlowScreenCompany.navigateToStartTest();
        signUpFlowScreenCompany.companyName.sendKeys(" ");
        signUpFlowScreenCompany.keyboarddone.click();
        signUpFlowScreenCompany.selectState("Colorado");
        signUpFlowScreenCompany.createAccount.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenCompany.companyName.isDisplayed());
    }

    @Test(priority = 10)
    public void testCompanyNameMoreThan83CharsInvalid() throws InterruptedException {
        SignUpFlowScreenCompany signUpFlowScreenCompany = new SignUpFlowScreenCompany(getDriver());
        signUpFlowScreenCompany.navigateToStartTest();
        signUpFlowScreenCompany.companyName.sendKeys("123456789012345678901234567890123456789012345678901234567890123456789012345678901234");
        signUpFlowScreenCompany.selectState("Colorado");
        signUpFlowScreenCompany.createAccount.click();
        Assert.assertTrue(signUpFlowScreenCompany.companyName.isDisplayed());
    }

    @Test(priority = 11)
    public void testCompanyNameUpTo83CharsValid() throws InterruptedException {
        SignUpFlowScreenCompany signUpFlowScreenCompany = new SignUpFlowScreenCompany(getDriver());
        signUpFlowScreenCompany.navigateToStartTest();
        signUpFlowScreenCompany.companyName.sendKeys("12345678901234567890123456789012345678901234567890123456789012345678901234567890123");
        signUpFlowScreenCompany.keyboarddone.click();
        signUpFlowScreenCompany.companyDone.click();
        signUpFlowScreenCompany.createAccount.click();
        Assert.assertTrue(signUpFlowScreenCompany.companyName.isDisplayed());
    }

    @Test(priority = 12)
    public void testCreateAccountwithPreexistingEmail() throws InterruptedException {
        SignUpFlowScreenCompany signUpFlowScreenCompany = new SignUpFlowScreenCompany(getDriver());
        signUpFlowScreenCompany.signUpWithPreexistingEmail();
        signUpFlowScreenCompany.companyName.sendKeys("CompanyTest");
        signUpFlowScreenCompany.keyboarddone.click();
        signUpFlowScreenCompany.selectState("Colorado");
        signUpFlowScreenCompany.createAccount.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenCompany.errorAlert.isEnabled());
        Assert.assertTrue(signUpFlowScreenCompany.errorMessage.isDisplayed());
    }

    @Test(priority = 13)
    public void testDismissErrorMessageBringsBackSignUpScreen() throws InterruptedException {
        SignUpFlowScreenCompany signUpFlowScreenCompany = new SignUpFlowScreenCompany(getDriver());
        signUpFlowScreenCompany.signUpWithPreexistingEmail();
        signUpFlowScreenCompany.companyName.sendKeys("CompanyTest");
        signUpFlowScreenCompany.keyboarddone.click();
        signUpFlowScreenCompany.selectState("Colorado");
        signUpFlowScreenCompany.createAccount.click();
        sleep(2000);
        signUpFlowScreenCompany.errorDismiss.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenCompany.companyName.isDisplayed());
    }

    @Test(priority = 14)
    public void testUserSignUpWithValidData() throws InterruptedException {
        SignUpFlowScreenCompany signUpFlowScreenCompany = new SignUpFlowScreenCompany(getDriver());
        signUpFlowScreenCompany.signUpWithValidData();
        signUpFlowScreenCompany.companyName.sendKeys("CompanyTest");
        signUpFlowScreenCompany.keyboarddone.click();
        signUpFlowScreenCompany.selectState("Colorado");
        signUpFlowScreenCompany.createAccount.click();
        sleep(2000);
        DashBoardScreen dashBoard = new DashBoardScreen(getDriver());
        sleep(5000);
        Assert.assertTrue(dashBoard.dashboardForm.isDisplayed());
    }
}
