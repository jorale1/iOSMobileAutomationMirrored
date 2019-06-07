package tests.signup;

import EVMobile.PageObjects.skywalkerios.pages.signup.SignUpFlowScreenCompanyScreen;
import EVMobile.PageObjects.skywalkerios.pages.signup.SignUpFlowIndustryScreen;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseMobileTest;

import java.awt.*;

public class SignUpFlowIndustryScreenTests extends BaseMobileTest {

    /*

    @Test(priority = 1)
    public void navigateToStartTest() throws InterruptedException, AWTException {
        SignUpFlowIndustryScreen signUpFlowIndustryScreen = new SignUpFlowIndustryScreen(getDriver());
        signUpFlowIndustryScreen.navigateToIndustryScreen();
        Assert.assertTrue(signUpFlowIndustryScreen.industry4.isEnabled());
    }

    @Test(priority = 2)
    public void testNavigateToCompanyScreen() throws InterruptedException, AWTException {
        SignUpFlowIndustryScreen signUpFlowIndustryScreen = new SignUpFlowIndustryScreen(getDriver());
        signUpFlowIndustryScreen.navigateToIndustryScreen();
        SignUpFlowScreenCompanyScreen signUpFlowScreenCompanyScreen = signUpFlowIndustryScreen.navigateToCompanyScreen();
        Assert.assertTrue(signUpFlowScreenCompanyScreen.companyName.isDisplayed());
    }

    */
}
