package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import EVMobile.Framework.core.LoginAccounts;
import EVMobile.PageObjects.skywalkerios.dashboard.DashBoardScreen;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

import static java.lang.Thread.sleep;

public class LoginScreen extends BasePage {

    @FindBy(name = "signInViewController.dismiss")
    public WebElement dismiss;

    @FindBy(name = "Welcome back")
    public WebElement welcomeBackGreeting;

    @FindBy(name = "signInViewController.emailAddress")
    public WebElement loginEmailAddress;

    @FindBy(name = "signInViewController.password")
    public WebElement loginPassword;

    @FindBy(name = "signInViewController.forgotPassword")
    public WebElement forgotPassword;

    @FindBy(name = "Done")
    public WebElement loginDone;

    @FindBy(name = "signInViewController.signIn")
    public WebElement login;

    public LoginScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginScreen navigateFromWelcomeToLoginScreen() throws AWTException, InterruptedException {
        WelcomeScreen welcomeScreen =  new WelcomeScreen(driver);
        welcomeScreen.navigateToLoginScreen();
        sleep(2000);
        return new LoginScreen(driver);
    }

    public void enterCredentials(String email, String password) throws AWTException {
        loginEmailAddress.sendKeys(email);
        isKeyboardDisplayed();
        loginPassword.sendKeys(password);
    }

    public DashBoardScreen navigateToDashboard() throws AWTException, InterruptedException {
        navigateFromWelcomeToLoginScreen();
        sleep(2000);
        enterCredentials(LoginAccounts.NEW_CONSTRUCTION_ACCOUNT, LoginAccounts.NEW_CONSTRUCTION_ACCOUNT_PASSWORD);
        loginDone.click();
        login.click();
        return new DashBoardScreen(driver);
    }

    public WelcomeScreen navigateBacktoWelcome() throws AWTException, InterruptedException {
        navigateFromWelcomeToLoginScreen();
        sleep(2000);
        enterCredentials(LoginAccounts.NEW_CONSTRUCTION_ACCOUNT, LoginAccounts.NEW_CONSTRUCTION_ACCOUNT_PASSWORD);
        loginDone.click();
        dismiss.click();
        return new WelcomeScreen(driver);
    }

    public ResetPasswordScreen navigateToResetPassword() throws InterruptedException, AWTException {
        navigateFromWelcomeToLoginScreen();
        sleep(2000);
        forgotPassword.click();
        return new ResetPasswordScreen(driver);
    }

    public void isKeyboardDisplayed() throws AWTException {
        if (!driver.isKeyboardShown()) {
            String selectAll = Keys.chord(Keys.SHIFT, Keys.COMMAND, "k");
            driver.findElement(By.name("Welcome back")).sendKeys(selectAll);
            driver.findElement(By.name("Welcome back")).sendKeys(selectAll);
        }
    }
}
