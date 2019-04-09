package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.*;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

import static java.lang.Thread.sleep;

public class SignUpFlowScreenEmailTests extends BaseMobileTest {

    @Test(priority = 1)
    public void testTermsofUseLink() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        TermsofUse termsofUse = signUpFlowScreenEmail.navigateToTermsofUsescreen();
        sleep(9000);
        Assert.assertTrue(termsofUse.termsDone.isDisplayed());
        Assert.assertTrue(termsofUse.TermsUrl.getAttribute("value").contains("my.eagleview.com"));
    }

    @Test(priority = 2) @Ignore
    public void testPrivacyPolicyLink() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        sleep(3000);
        PrivacyPolicy privacyPolicy = signUpFlowScreenEmail.navigateToPrivacyPolicyScreen();
        sleep(9000);
        Assert.assertTrue(privacyPolicy.privacyPolicyDone.isDisplayed());
        Assert.assertTrue(privacyPolicy.url.getAttribute("value").contains("eagleview.com"));
    }

    @Test(priority = 3)
    public void testTermscheckboxnotchecked() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        signUpFlowScreenEmail.enterEmail("termscheckboxtest@mail.com");
        signUpFlowScreenEmail.done.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenEmail.emailField.isDisplayed());
    }

    @Test(priority = 4)
    public void testTermsCheckedNoEmail() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        signUpFlowScreenEmail.termsCheck.click();
        signUpFlowScreenEmail.page2next.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenEmail.emailField.isDisplayed());
    }

    @Test(priority = 5)
    public void testTermsCheckedInvalidEmail() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        signUpFlowScreenEmail.enterEmail("@mail.com");
        signUpFlowScreenEmail.termsCheck.click();
        signUpFlowScreenEmail.page2next.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenEmail.emailField.isDisplayed());
    }

    @Test(priority = 6)
    public void testDataPersisting() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        signUpFlowScreenEmail.enterEmail("test@mail.com");
        signUpFlowScreenEmail.termsCheck.click();
        SignUpFlowScreenPassword signUpFlowScreenPassword = signUpFlowScreenEmail.navigateToSignUpPasswordScreen();
        sleep(2000);
        signUpFlowScreenPassword.backToEmailScreen.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenEmail.emailField.getAttribute("value").contains("test@mail.com"));
        Assert.assertTrue(signUpFlowScreenEmail.termsCheck.getAttribute("value").equals("1"));
    }

    @Test(priority = 7)
    public void testInvalidEmailFormat() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        sleep(2000);
        signUpFlowScreenEmail.enterEmail("A@b@c@example.com");
        signUpFlowScreenEmail.termsCheck.click();
        signUpFlowScreenEmail.page2next.click();
        Assert.assertTrue(signUpFlowScreenEmail.emailField.isDisplayed());
    }

    @Test(priority = 8)
    public void testInvalidEmailFormat2() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        sleep(2000);
        signUpFlowScreenEmail.enterEmail("asdfasdf");
        signUpFlowScreenEmail.termsCheck.click();
        signUpFlowScreenEmail.page2next.click();
        Assert.assertTrue(signUpFlowScreenEmail.emailField.isDisplayed());
    }

    @Test(priority = 9)
    public void testTermsCheckedVvalidEmail() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        signUpFlowScreenEmail.enterEmail("test@mail.com");
        signUpFlowScreenEmail.termsCheck.click();
        SignUpFlowScreenPassword signUpFlowScreenPassword = signUpFlowScreenEmail.navigateToSignUpPasswordScreen();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenPassword.signUpPassword.isDisplayed());
    }
}
