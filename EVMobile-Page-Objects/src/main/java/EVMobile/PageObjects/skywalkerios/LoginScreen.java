package EVMobile.PageObjects.skywalkerios;

import EVMobile.Framework.core.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.*;

public class LoginScreen extends BasePage {

    @FindBy(name = "signInViewController.dismiss")
    public WebElement dismiss;

    @FindBy(name = "Welcome back")
    public WebElement welcomeBackGreeting;

    @FindBy(name = "signInViewController.emailAddress")
    public WebElement loginEmailAddress;

    @FindBy(name = "signInViewController.password")
    public WebElement loginPassword;

    @FindBy(name = "Forgot your Password?")
    public WebElement forgotPassword;

    @FindBy(name = "Done")
    public WebElement loginDone;

    @FindBy(name = "signInViewController.signIn")
    public WebElement login;

    public String email = "jorge.acosta@eagleview.com";
    public String password = "EagleView1";

    public LoginScreen(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterCredentials(String email, String password) throws AWTException {
        loginEmailAddress.sendKeys(email);
        isKeyboardDisplayed();
        loginPassword.sendKeys(password);
    }

    public DashBoard navigateToDashboard() throws AWTException {

        enterCredentials(email, password);
        loginDone.click();
        login.click();
        return new DashBoard(driver);
    }

    public WelcomeScreen navigateBacktoWelcome() throws AWTException {

        enterCredentials(email, password);
        loginDone.click();
        dismiss.click();
        return new WelcomeScreen(driver);
    }

    public void isKeyboardDisplayed() throws AWTException {

        if (!driver.isKeyboardShown()) {
            String selectAll = Keys.chord(Keys.SHIFT, Keys.COMMAND, "k");
            driver.findElement(By.name("Welcome back")).sendKeys(selectAll);
            driver.findElement(By.name("Welcome back")).sendKeys(selectAll);
        }
    }
}
