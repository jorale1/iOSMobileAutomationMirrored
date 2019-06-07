package tests.signup;

import EVMobile.PageObjects.skywalkerios.pages.login.LoginScreen;
import EVMobile.PageObjects.skywalkerios.pages.signup.SignUpFlowEmailScreen;
import EVMobile.PageObjects.skywalkerios.pages.signup.SignUpFlowStartScreen;
import EVMobile.PageObjects.skywalkerios.pages.WelcomeScreen;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import tests.BaseMobileTest;

import java.awt.*;

import static java.lang.Thread.sleep;

public class SignUpFlowStartScreenTests extends BaseMobileTest {

    /*

    @Test(priority = 1) @Ignore
    public void testLoginLink() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        LoginScreen loginScreen = signUpFlowStartScreen.navigateToLoginScreen();
        sleep(2000);
        Assert.assertTrue(loginScreen.loginEmailAddress.isDisplayed());
    }

    @Test(priority = 2) @Ignore
    public void testBlankFieldsNoProgress() throws AWTException, InterruptedException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.nextButton.click();
        sleep(3000);
        Assert.assertTrue(signUpFlowStartScreen.firstName.isDisplayed());
    }

    @Test(priority = 3)
    public void testSpaceEnteredinTextFieldsNoProgress() throws AWTException, InterruptedException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames(" ", " ");
        signUpFlowStartScreen.keyboardDone.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowStartScreen.firstName.isDisplayed());
    }

    @Test(priority = 4) @Ignore
    public void testInvalidNamesLengthNoProgress() throws AWTException, InterruptedException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("123456789012345678901234567890123", "123456789012345678901234567890123");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        sleep(2000);
        Assert.assertTrue(signUpFlowStartScreen.firstName.isDisplayed());
    }

    @Test(priority = 5) @Ignore
    public void testTextFieldsReset() throws AWTException, InterruptedException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        WelcomeScreen welcomeScreen = signUpFlowStartScreen.navigateBackToWelcomePage();
        sleep(2000);
        this.welcomeScreen.navigateToSignUpStartScreen();
        Assert.assertTrue(signUpFlowStartScreen.firstName.getText().equalsIgnoreCase("First Name"));
        Assert.assertTrue(signUpFlowStartScreen.lastName.getText().equalsIgnoreCase("Last Name"));
    }

    @Test(priority = 6) @Ignore
    public void testFirstLastNamesKeepValue() throws AWTException, InterruptedException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        sleep(2000);
        signUpFlowEmailScreen.backButton.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowStartScreen.firstName.getText().equalsIgnoreCase("John"));
        Assert.assertTrue(signUpFlowStartScreen.lastName.getText().equalsIgnoreCase("Doe"));

    }

    @Test(priority = 7) @Ignore
    public void testValidNamesLength() throws AWTException, InterruptedException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("12345678901234567890123456789012", "12345678901234567890123456789012");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        sleep(2000);
        Assert.assertTrue(signUpFlowEmailScreen.emailField.isDisplayed());
    }

    */
}
