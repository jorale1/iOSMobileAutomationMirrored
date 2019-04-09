package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.SignUpFlowScreenCompany;
import EVMobile.PageObjects.skywalkerios.SignUpFlowScreenIndustry;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class SignUpFlowScreenIndustryTests extends BaseMobileTest {

    @Test(priority = 1)
    public void navigateToStartTest() throws InterruptedException, AWTException {
        SignUpFlowScreenIndustry signUpFlowScreenIndustry = new SignUpFlowScreenIndustry(getDriver());
        signUpFlowScreenIndustry.navigateToIndustryScreen();
        Assert.assertTrue(signUpFlowScreenIndustry.industry4.isEnabled());
    }

    @Test(priority = 2)
    public void testNavigateToCompanyScreen() throws InterruptedException, AWTException {
        SignUpFlowScreenIndustry signUpFlowScreenIndustry = new SignUpFlowScreenIndustry(getDriver());
        signUpFlowScreenIndustry.navigateToIndustryScreen();
        SignUpFlowScreenCompany signUpFlowScreenCompany = signUpFlowScreenIndustry.navigateToCompanyScreen();
        Assert.assertTrue(signUpFlowScreenCompany.companyName.isDisplayed());
    }
}
