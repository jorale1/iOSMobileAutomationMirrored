package tests.signup;

import EVMobile.PageObjects.skywalkerios.pages.signup.SignUpFlowEmailScreen;
import EVMobile.PageObjects.skywalkerios.pages.signup.SignUpFlowIndustryScreen;
import EVMobile.PageObjects.skywalkerios.pages.signup.SignUpFlowPasswordScreen;
import EVMobile.PageObjects.skywalkerios.pages.signup.SignUpFlowStartScreen;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseMobileTest;

import java.awt.*;

import static java.lang.Thread.sleep;

public class SignUpFlowPasswordScreenTests extends BaseMobileTest {
/*
    @Test(priority = 1)
    public void testTextFieldsNotPopulated() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        signUpFlowEmailScreen.enterEmail("test@mail.com");
        signUpFlowEmailScreen.termsCheck.click();
        SignUpFlowPasswordScreen signUpFlowPasswordScreen = signUpFlowEmailScreen.navigateToSignUpPasswordScreen();
        signUpFlowPasswordScreen.passwordScreenNext.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowPasswordScreen.signUpPassword.isDisplayed());
    }

    @Test(priority = 2)
    public void testBackToEmailScreen() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        signUpFlowEmailScreen.enterEmail("test@mail.com");
        signUpFlowEmailScreen.termsCheck.click();
        SignUpFlowPasswordScreen signUpFlowPasswordScreen = signUpFlowEmailScreen.navigateToSignUpPasswordScreen();
        signUpFlowPasswordScreen.enterPasswordandConfirmPassword("123456789", "123456789");
        signUpFlowPasswordScreen.navigateBackToEmailScreen();
        sleep(2000);
        Assert.assertTrue(signUpFlowEmailScreen.emailField.isDisplayed());
    }

    @Test(priority = 3)
    public void testTooShortValues() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        signUpFlowEmailScreen.enterEmail("test@mail.com");
        signUpFlowEmailScreen.termsCheck.click();
        SignUpFlowPasswordScreen signUpFlowPasswordScreen = signUpFlowEmailScreen.navigateToSignUpPasswordScreen();
        signUpFlowPasswordScreen.enterPasswordandConfirmPassword("a", "b");
        signUpFlowPasswordScreen.keyboardDone.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowPasswordScreen.signUpPassword.isDisplayed());
    }

    @Test(priority = 4)
    public void testSpaceNotAllowedValue() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        signUpFlowEmailScreen.enterEmail("test@mail.com");
        signUpFlowEmailScreen.termsCheck.click();
        SignUpFlowPasswordScreen signUpFlowPasswordScreen = signUpFlowEmailScreen.navigateToSignUpPasswordScreen();
        signUpFlowPasswordScreen.enterPasswordandConfirmPassword(" ", " ");
        signUpFlowPasswordScreen.keyboardDone.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowPasswordScreen.signUpPassword.isDisplayed());
    }

    @Test(priority = 5)
    public void testLessThan8CharsNotValid() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        signUpFlowEmailScreen.enterEmail("test@mail.com");
        signUpFlowEmailScreen.termsCheck.click();
        SignUpFlowPasswordScreen signUpFlowPasswordScreen = signUpFlowEmailScreen.navigateToSignUpPasswordScreen();
        signUpFlowPasswordScreen.enterPasswordandConfirmPassword("1234567", "1234567");
        signUpFlowPasswordScreen.keyboardDone.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowPasswordScreen.signUpPassword.isDisplayed());
    }

    @Test(priority = 6)
    public void testPassowrdandConfirmationNotEqual() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        signUpFlowEmailScreen.enterEmail("test@mail.com");
        signUpFlowEmailScreen.termsCheck.click();
        SignUpFlowPasswordScreen signUpFlowPasswordScreen = signUpFlowEmailScreen.navigateToSignUpPasswordScreen();
        signUpFlowPasswordScreen.enterPasswordandConfirmPassword("12345678", "12345679");
        signUpFlowPasswordScreen.keyboardDone.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowPasswordScreen.signUpPassword.isDisplayed());
    }

    @Test(priority = 7)
    public void testPasswordandConfirmationEqual() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        signUpFlowEmailScreen.enterEmail("test@mail.com");
        signUpFlowEmailScreen.termsCheck.click();
        SignUpFlowPasswordScreen signUpFlowPasswordScreen = signUpFlowEmailScreen.navigateToSignUpPasswordScreen();
        signUpFlowPasswordScreen.enterPasswordandConfirmPassword("abcdefgh", "abcdefgh");
        signUpFlowPasswordScreen.keyboardDone.click();
        SignUpFlowIndustryScreen signUpFlowIndustryScreen = new SignUpFlowIndustryScreen(getDriver());
        sleep(2000);
        Assert.assertTrue(signUpFlowIndustryScreen.industryScreenNext.isDisplayed());
    }

    @Test(priority = 8)
    public void testMoreThan8CharsValid() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        signUpFlowEmailScreen.enterEmail("test@mail.com");
        signUpFlowEmailScreen.termsCheck.click();
        SignUpFlowPasswordScreen signUpFlowPasswordScreen = signUpFlowEmailScreen.navigateToSignUpPasswordScreen();
        signUpFlowPasswordScreen.enterPasswordandConfirmPassword("1234567890123456", "1234567890123456");
        signUpFlowPasswordScreen.keyboardDone.click();
        SignUpFlowIndustryScreen signUpFlowIndustryScreen = new SignUpFlowIndustryScreen(getDriver());
        sleep(2000);
        Assert.assertTrue(signUpFlowIndustryScreen.industryScreenNext.isDisplayed());
    }

    @Test(priority = 9)
    public void testSpecialCharsAreAllowed() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        signUpFlowEmailScreen.enterEmail("test@mail.com");
        signUpFlowEmailScreen.termsCheck.click();
        SignUpFlowPasswordScreen signUpFlowPasswordScreen = signUpFlowEmailScreen.navigateToSignUpPasswordScreen();
        signUpFlowPasswordScreen.enterPasswordandConfirmPassword("@\"\\|!#$%&/()=?»«@£§€{}.-;'<>_,", "@\"\\|!#$%&/()=?»«@£§€{}.-;'<>_,");
        signUpFlowPasswordScreen.keyboardDone.click();
        SignUpFlowIndustryScreen signUpFlowIndustryScreen = new SignUpFlowIndustryScreen(getDriver());
        sleep(2000);
        Assert.assertTrue(signUpFlowIndustryScreen.industryScreenNext.isDisplayed());
    }

    @Test(priority = 10)
    public void testValuesRemainWhenBackFromIndustryScreen() throws InterruptedException, AWTException {
        SignUpFlowStartScreen signUpFlowStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowStartScreen.enterNames("John", "Doe");
        SignUpFlowEmailScreen signUpFlowEmailScreen = signUpFlowStartScreen.navigateToSignupEmailScreen();
        signUpFlowEmailScreen.enterEmail("test@mail.com");
        signUpFlowEmailScreen.termsCheck.click();
        SignUpFlowPasswordScreen signUpFlowPasswordScreen = signUpFlowEmailScreen.navigateToSignUpPasswordScreen();
        signUpFlowPasswordScreen.enterPasswordandConfirmPassword("abcdefgh", "abcdefgh");
        signUpFlowPasswordScreen.keyboardDone.click();
        SignUpFlowIndustryScreen signUpFlowIndustryScreen = new SignUpFlowIndustryScreen(getDriver());
        signUpFlowIndustryScreen.backToPasswordScreen.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowPasswordScreen.signUpPassword.isDisplayed());
        Assert.assertFalse(signUpFlowPasswordScreen.signUpPassword.getText().isEmpty());
        Assert.assertFalse(signUpFlowPasswordScreen.signUpPasswordConfirm.getText().isEmpty());
    }

    */
}
