package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static java.lang.Thread.sleep;

public class ResetPasswordScreenTests extends BaseMobileTest {

    @Test(priority = 1)
    public void tesInvalidEmailSubmitNotEnable() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        resetPasswordScreen.emailAddress.sendKeys("asdfasdfs");
        sleep(2000);
        Assert.assertTrue(!resetPasswordScreen.submitButton.isEnabled());
    }

    @Test(priority = 2)
    public void tesInvalidEmailSubmitNotEnable2() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        resetPasswordScreen.emailAddress.sendKeys("@mail.com");
        sleep(2000);
        Assert.assertTrue(!resetPasswordScreen.submitButton.isEnabled());
    }

    @Test(priority = 3)
    public void tesValidEmailSubmitEnables() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        resetPasswordScreen.emailAddress.sendKeys("test@mail.com");
        resetPasswordScreen.done.click();
        sleep(2000);
        Assert.assertTrue(resetPasswordScreen.submitButton.isEnabled());
    }

    @Test(priority = 4)
    public void tesValidEmailNavigateToConfirmationScreen() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        ResetPasswordConfirmationScreen resetPasswordConfirmationScreen = resetPasswordScreen.navigateToResetPasswordConfirmationScreen();
        sleep(2000);
        Assert.assertTrue(resetPasswordConfirmationScreen.contactPhone.isEnabled());
    }

    @Test(priority = 5)
    public void testNavigateBackToLoginScreen() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        resetPasswordScreen.clickOnDismissButton();
        Assert.assertTrue(loginscreen.loginEmailAddress.isDisplayed());
    }

    @Test(priority = 6)
    public void testEmailFieldIsReset() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        resetPasswordScreen.enterEmail("test@mail.com");
        resetPasswordScreen.clickOnDismissButton();
        loginscreen.forgotPassword.click();
        sleep(1000);
        Assert.assertTrue(resetPasswordScreen.emailAddress.getText().equals("Enter Email Address"));
    }

    @Test(priority = 7)
    public void testCustomerServiceEmailLink() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        resetPasswordScreen.customerServiceEmail.click();
        sleep(1000);
        Assert.assertTrue(resetPasswordScreen.emailUnavailableSimulator.isDisplayed());
    }

    @Test(priority = 8)
    public void testTermsofUseLink() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        TermsofUse termsofUse = resetPasswordScreen.navigateToTermsofUseScreen();
        sleep(2000);
        Assert.assertTrue(termsofUse.termsDone.isDisplayed());
        Assert.assertTrue(termsofUse.TermsUrl.getAttribute("value").contains("my.eagleview.com"));
    }

    @Test(priority = 9)
    public void testPrivacyPolicyLink() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        PrivacyPolicy privacyPolicy = resetPasswordScreen.navigateToPrivacyPolicyScreen();
        sleep(1000);
        Assert.assertTrue(privacyPolicy.privacyPolicyDone.isDisplayed());
        Assert.assertTrue(privacyPolicy.url.getAttribute("value").contains("eagleview.com"));
    }

    @Test(priority = 10)
    public void testEVLogoIsPresent() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        Assert.assertTrue(resetPasswordScreen.eagelviewLogo.isEnabled());
    }
}
