package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static java.lang.Thread.sleep;

public class ResetPasswordConfirmationScreenTests extends BaseMobileTest {

    @Test(priority = 1)
    public void testNavigateBackToResetPasswordScreen() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        ResetPasswordConfirmationScreen resetPasswordConfirmationScreen = resetPasswordScreen.navigateToResetPasswordConfirmationScreen();
        sleep(1000);
        resetPasswordConfirmationScreen.navigateBackToResetPassword();
        sleep(1000);
        Assert.assertTrue(resetPasswordScreen.emailAddress.isEnabled());
    }

    @Test(priority = 2)
    public void testEmailFieldIsKept() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        ResetPasswordConfirmationScreen resetPasswordConfirmationScreen = resetPasswordScreen.navigateToResetPasswordConfirmationScreen();
        sleep(1000);
        resetPasswordConfirmationScreen.navigateBackToResetPassword();
        sleep(1000);
        Assert.assertTrue(resetPasswordScreen.emailAddress.getText().equals("jorge.acosta@eagleview.com"));
    }

    @Test(priority = 3)
    public void testContactPhoneLink() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        ResetPasswordConfirmationScreen resetPasswordConfirmationScreen = resetPasswordScreen.navigateToResetPasswordConfirmationScreen();
        sleep(1000);
        ExternalMessageScreen externalMessageScreen = resetPasswordConfirmationScreen.navigateToExternalMessageScreen();
        sleep(2000);
        Assert.assertTrue(externalMessageScreen.screenTitle.isEnabled());
    }

    @Test(priority = 4)
    public void testTermsofUseLink() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        ResetPasswordConfirmationScreen resetPasswordConfirmationScreen = resetPasswordScreen.navigateToResetPasswordConfirmationScreen();
        sleep(1000);
        TermsofUse termsofUse = resetPasswordConfirmationScreen.navigateToTermsofUseScreen();
        sleep(2000);
        Assert.assertTrue(termsofUse.termsDone.isDisplayed());
        Assert.assertTrue(termsofUse.TermsUrl.getAttribute("value").contains("my.eagleview.com"));
    }

    @Test(priority = 5)
    public void testPrivacyPolicyLink() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        ResetPasswordConfirmationScreen resetPasswordConfirmationScreen = resetPasswordScreen.navigateToResetPasswordConfirmationScreen();
        sleep(1000);
        PrivacyPolicy privacyPolicy = resetPasswordConfirmationScreen.navigateToPrivacyPolicyScreen();
        sleep(2000);
        Assert.assertTrue(privacyPolicy.privacyPolicyDone.isDisplayed());
        Assert.assertTrue(privacyPolicy.url.getAttribute("value").contains("eagleview.com"));
    }

    @Test(priority = 6)
    public void testEVLogoIsPresent() throws InterruptedException, AWTException {
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        ResetPasswordScreen resetPasswordScreen = loginscreen.navigateToResetPassword();
        sleep(1000);
        ResetPasswordConfirmationScreen resetPasswordConfirmationScreen = resetPasswordScreen.navigateToResetPasswordConfirmationScreen();
        sleep(1000);
        Assert.assertTrue(resetPasswordConfirmationScreen.successMessage.isEnabled());
    }
}
