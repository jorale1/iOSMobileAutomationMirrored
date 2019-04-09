package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.LoginScreen;
import EVMobile.PageObjects.skywalkerios.SignUpFlowScreenStart;
import EVMobile.PageObjects.skywalkerios.SignUpFlowScreenEmail;
import EVMobile.PageObjects.skywalkerios.WelcomeScreen;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

import static java.lang.Thread.sleep;

public class SignUpFlowScreenStartTests extends BaseMobileTest {

    @Test(priority = 1) @Ignore
    public void testLoginLink() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        LoginScreen loginScreen = signUpFlowScreenStart.navigateToLoginScreen();
        sleep(2000);
        Assert.assertTrue(loginScreen.loginEmailAddress.isDisplayed());
    }

    @Test(priority = 2) @Ignore
    public void testBlankFieldsNoProgress() throws AWTException, InterruptedException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.nextButton.click();
        sleep(3000);
        Assert.assertTrue(signUpFlowScreenStart.firstName.isDisplayed());
    }

    @Test(priority = 3)
    public void testSpaceEnteredinTextFieldsNoProgress() throws AWTException, InterruptedException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames(" ", " ");
        signUpFlowScreenStart.keyboardDone.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenStart.firstName.isDisplayed());
    }

    @Test(priority = 4) @Ignore
    public void testInvalidNamesLengthNoProgress() throws AWTException, InterruptedException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("123456789012345678901234567890123", "123456789012345678901234567890123");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenStart.firstName.isDisplayed());
    }

    @Test(priority = 5) @Ignore
    public void testTextFieldsReset() throws AWTException, InterruptedException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        WelcomeScreen welcomeScreen = signUpFlowScreenStart.navigateBackToWelcomePage();
        sleep(2000);
        this.welcomeScreen.navigateToSignUpStartScreen();
        Assert.assertTrue(signUpFlowScreenStart.firstName.getText().equalsIgnoreCase("First Name"));
        Assert.assertTrue(signUpFlowScreenStart.lastName.getText().equalsIgnoreCase("Last Name"));
    }

    @Test(priority = 6) @Ignore
    public void testFirstLastNamesKeepValue() throws AWTException, InterruptedException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        sleep(2000);
        signUpFlowScreenEmail.backButton.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenStart.firstName.getText().equalsIgnoreCase("John"));
        Assert.assertTrue(signUpFlowScreenStart.lastName.getText().equalsIgnoreCase("Doe"));

    }

    @Test(priority = 7) @Ignore
    public void testValidNamesLength() throws AWTException, InterruptedException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("12345678901234567890123456789012", "12345678901234567890123456789012");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenEmail.emailField.isDisplayed());
    }
}
