package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.SignUpFlowScreenEmail;
import EVMobile.PageObjects.skywalkerios.SignUpFlowScreenIndustry;
import EVMobile.PageObjects.skywalkerios.SignUpFlowScreenPassword;
import EVMobile.PageObjects.skywalkerios.SignUpFlowScreenStart;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static java.lang.Thread.sleep;

public class SignUpFlowScreenPasswordTests extends BaseMobileTest {

    @Test(priority = 1)
    public void testTextFieldsNotPopulated() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        signUpFlowScreenEmail.enterEmail("test@mail.com");
        signUpFlowScreenEmail.termsCheck.click();
        SignUpFlowScreenPassword signUpFlowScreenPassword = signUpFlowScreenEmail.navigateToSignUpPasswordScreen();
        signUpFlowScreenPassword.passwordScreenNext.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenPassword.signUpPassword.isDisplayed());
    }

    @Test(priority = 2)
    public void testBackToEmailScreen() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        signUpFlowScreenEmail.enterEmail("test@mail.com");
        signUpFlowScreenEmail.termsCheck.click();
        SignUpFlowScreenPassword signUpFlowScreenPassword = signUpFlowScreenEmail.navigateToSignUpPasswordScreen();
        signUpFlowScreenPassword.enterPasswordandConfirmPassword("123456789", "123456789");
        signUpFlowScreenPassword.navigateBackToEmailScreen();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenEmail.emailField.isDisplayed());
    }

    @Test(priority = 3)
    public void testTooShortValues() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        signUpFlowScreenEmail.enterEmail("test@mail.com");
        signUpFlowScreenEmail.termsCheck.click();
        SignUpFlowScreenPassword signUpFlowScreenPassword = signUpFlowScreenEmail.navigateToSignUpPasswordScreen();
        signUpFlowScreenPassword.enterPasswordandConfirmPassword("a", "b");
        signUpFlowScreenPassword.keyboardDone.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenPassword.signUpPassword.isDisplayed());
    }

    @Test(priority = 4)
    public void testSpaceNotAllowedValue() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        signUpFlowScreenEmail.enterEmail("test@mail.com");
        signUpFlowScreenEmail.termsCheck.click();
        SignUpFlowScreenPassword signUpFlowScreenPassword = signUpFlowScreenEmail.navigateToSignUpPasswordScreen();
        signUpFlowScreenPassword.enterPasswordandConfirmPassword(" ", " ");
        signUpFlowScreenPassword.keyboardDone.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenPassword.signUpPassword.isDisplayed());
    }

    @Test(priority = 5)
    public void testLessThan8CharsNotValid() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        signUpFlowScreenEmail.enterEmail("test@mail.com");
        signUpFlowScreenEmail.termsCheck.click();
        SignUpFlowScreenPassword signUpFlowScreenPassword = signUpFlowScreenEmail.navigateToSignUpPasswordScreen();
        signUpFlowScreenPassword.enterPasswordandConfirmPassword("1234567", "1234567");
        signUpFlowScreenPassword.keyboardDone.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenPassword.signUpPassword.isDisplayed());
    }

    @Test(priority = 6)
    public void testPassowrdandConfirmationNotEqual() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        signUpFlowScreenEmail.enterEmail("test@mail.com");
        signUpFlowScreenEmail.termsCheck.click();
        SignUpFlowScreenPassword signUpFlowScreenPassword = signUpFlowScreenEmail.navigateToSignUpPasswordScreen();
        signUpFlowScreenPassword.enterPasswordandConfirmPassword("12345678", "12345679");
        signUpFlowScreenPassword.keyboardDone.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenPassword.signUpPassword.isDisplayed());
    }

    @Test(priority = 7)
    public void testPasswordandConfirmationEqual() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        signUpFlowScreenEmail.enterEmail("test@mail.com");
        signUpFlowScreenEmail.termsCheck.click();
        SignUpFlowScreenPassword signUpFlowScreenPassword = signUpFlowScreenEmail.navigateToSignUpPasswordScreen();
        signUpFlowScreenPassword.enterPasswordandConfirmPassword("abcdefgh", "abcdefgh");
        signUpFlowScreenPassword.keyboardDone.click();
        SignUpFlowScreenIndustry signUpFlowScreenIndustry = new SignUpFlowScreenIndustry(getDriver());
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenIndustry.industryScreenNext.isDisplayed());
    }

    @Test(priority = 8)
    public void testMoreThan8CharsValid() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        signUpFlowScreenEmail.enterEmail("test@mail.com");
        signUpFlowScreenEmail.termsCheck.click();
        SignUpFlowScreenPassword signUpFlowScreenPassword = signUpFlowScreenEmail.navigateToSignUpPasswordScreen();
        signUpFlowScreenPassword.enterPasswordandConfirmPassword("1234567890123456", "1234567890123456");
        signUpFlowScreenPassword.keyboardDone.click();
        SignUpFlowScreenIndustry signUpFlowScreenIndustry = new SignUpFlowScreenIndustry(getDriver());
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenIndustry.industryScreenNext.isDisplayed());
    }

    @Test(priority = 9)
    public void testSpecialCharsAreAllowed() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        signUpFlowScreenEmail.enterEmail("test@mail.com");
        signUpFlowScreenEmail.termsCheck.click();
        SignUpFlowScreenPassword signUpFlowScreenPassword = signUpFlowScreenEmail.navigateToSignUpPasswordScreen();
        signUpFlowScreenPassword.enterPasswordandConfirmPassword("@\"\\|!#$%&/()=?»«@£§€{}.-;'<>_,", "@\"\\|!#$%&/()=?»«@£§€{}.-;'<>_,");
        signUpFlowScreenPassword.keyboardDone.click();
        SignUpFlowScreenIndustry signUpFlowScreenIndustry = new SignUpFlowScreenIndustry(getDriver());
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenIndustry.industryScreenNext.isDisplayed());
    }

    @Test(priority = 10)
    public void testValuesRemainWhenBackFromIndustryScreen() throws InterruptedException, AWTException {
        SignUpFlowScreenStart signUpFlowScreenStart = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStart.enterNames("John", "Doe");
        SignUpFlowScreenEmail signUpFlowScreenEmail = signUpFlowScreenStart.navigateToSignupEmailScreen();
        signUpFlowScreenEmail.enterEmail("test@mail.com");
        signUpFlowScreenEmail.termsCheck.click();
        SignUpFlowScreenPassword signUpFlowScreenPassword = signUpFlowScreenEmail.navigateToSignUpPasswordScreen();
        signUpFlowScreenPassword.enterPasswordandConfirmPassword("abcdefgh", "abcdefgh");
        signUpFlowScreenPassword.keyboardDone.click();
        SignUpFlowScreenIndustry signUpFlowScreenIndustry = new SignUpFlowScreenIndustry(getDriver());
        signUpFlowScreenIndustry.backToPasswordScreen.click();
        sleep(2000);
        Assert.assertTrue(signUpFlowScreenPassword.signUpPassword.isDisplayed());
        Assert.assertFalse(signUpFlowScreenPassword.signUpPassword.getText().isEmpty());
        Assert.assertFalse(signUpFlowScreenPassword.signUpPasswordConfirm.getText().isEmpty());
    }
}
