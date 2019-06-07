package tests.signup;

import EVMobile.PageObjects.skywalkerios.pages.PrivacyPolicyScreen;
import EVMobile.PageObjects.skywalkerios.pages.TermsOfUseScreen;
import EVMobile.PageObjects.skywalkerios.pages.signup.SignUpFlowEmailScreen;
import EVMobile.PageObjects.skywalkerios.pages.signup.SignUpFlowPasswordScreen;
import EVMobile.PageObjects.skywalkerios.pages.signup.SignUpFlowStartScreen;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import tests.BaseMobileTest;

import java.awt.*;

import static java.lang.Thread.sleep;

public class SignUpFlowEmailScreenTests extends BaseMobileTest {

    /*

    @Test(priority = 1)
    public void testTermsofUseLink() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        TermsOfUseScreen termsofUseScreen = signUpFlowEmailScreen.navigateToTermsofUsescreen();
        sleep(9000);
        Assert.assertTrue(termsofUseScreen.termsDone.isDisplayed());
        Assert.assertTrue(termsofUseScreen.TermsUrl.getAttribute("value").contains("my.eagleview.com"));
    }

    @Test(priority = 2) @Ignore
    public void testPrivacyPolicyLink() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        sleep(3000);
        PrivacyPolicyScreen privacyPolicyScreen = signUpFlowEmailScreen.navigateToPrivacyPolicyScreen();
        sleep(9000);
        Assert.assertTrue(privacyPolicyScreen.privacyPolicyDone.isDisplayed());
        Assert.assertTrue(privacyPolicyScreen.url.getAttribute("value").contains("eagleview.com"));
    }

    @Test(priority = 3)
    public void testTermscheckboxnotchecked() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        signUpFlowEmailScreen.enterEmail("termscheckboxtest@mail.com");
        signUpFlowEmailScreen.done.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowEmailScreen.emailField.isDisplayed());
    }

    @Test(priority = 4)
    public void testTermsCheckedNoEmail() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        signUpFlowEmailScreen.termsCheck.click();
        signUpFlowEmailScreen.page2next.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowEmailScreen.emailField.isDisplayed());
    }

    @Test(priority = 5)
    public void testTermsCheckedInvalidEmail() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        signUpFlowEmailScreen.enterEmail("@mail.com");
        signUpFlowEmailScreen.termsCheck.click();
        signUpFlowEmailScreen.page2next.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowEmailScreen.emailField.isDisplayed());
    }

    @Test(priority = 6)
    public void testDataPersisting() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        signUpFlowEmailScreen.enterEmail("test@mail.com");
        signUpFlowEmailScreen.termsCheck.click();
        SignUpFlowPasswordScreen signUpFlowPasswordScreen = signUpFlowEmailScreen.navigateToSignUpPasswordScreen();
        sleep(2000);
        signUpFlowPasswordScreen.backToEmailScreen.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowEmailScreen.emailField.getAttribute("value").contains("test@mail.com"));
        Assert.assertTrue(signUpFlowEmailScreen.termsCheck.getAttribute("value").equals("1"));
    }

    @Test(priority = 7)
    public void testInvalidEmailFormat() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        sleep(2000);
        signUpFlowEmailScreen.enterEmail("A@b@c@example.com");
        signUpFlowEmailScreen.termsCheck.click();
        signUpFlowEmailScreen.page2next.click();
        Assert.assertTrue(signUpFlowEmailScreen.emailField.isDisplayed());
    }

    @Test(priority = 8)
    public void testInvalidEmailFormat2() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        sleep(2000);
        signUpFlowEmailScreen.enterEmail("asdfasdf");
        signUpFlowEmailScreen.termsCheck.click();
        signUpFlowEmailScreen.page2next.click();
        Assert.assertTrue(signUpFlowEmailScreen.emailField.isDisplayed());
    }

    @Test(priority = 9)
    public void testTermsCheckedVvalidEmail() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        signUpFlowEmailScreen.enterEmail("test@mail.com");
        signUpFlowEmailScreen.termsCheck.click();
        SignUpFlowPasswordScreen signUpFlowPasswordScreen = signUpFlowEmailScreen.navigateToSignUpPasswordScreen();
        sleep(2000);
        Assert.assertTrue(signUpFlowPasswordScreen.signUpPassword.isDisplayed());
    }

    */
}
