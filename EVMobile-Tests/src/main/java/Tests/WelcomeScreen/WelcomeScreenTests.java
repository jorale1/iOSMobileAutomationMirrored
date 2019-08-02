package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.SignUpFlowScreenStart;
import EVMobile.PageObjects.skywalkerios.WelcomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class WelcomeScreenTests extends BaseMobileTest {

    @Test
    public void welcomeScreenTests() {
        WelcomeScreen welcomescreen = new WelcomeScreen(getDriver());
        Assert.assertTrue(welcomescreen.loginlink.isDisplayed());
    }

    @Test
    public void page0HeaderTest() {
        WelcomeScreen welcomescreen = new WelcomeScreen(getDriver());
        Assert.assertTrue(welcomescreen.page0header.isDisplayed());
    }

    @Test
    public void page0BodyTest() {
        WelcomeScreen welcomescreen = new WelcomeScreen(getDriver());
        Assert.assertTrue(welcomescreen.page0body.isDisplayed());
    }

    @Test
    public void page0ImageTest() throws InterruptedException {
        WelcomeScreen welcomescreen = new WelcomeScreen(getDriver());
        sleep(4000);
        Assert.assertTrue(welcomescreen.page0image.isEnabled());
    }

    @Test
    public void page1HeaderTest() throws InterruptedException {
        WelcomeScreen welcomescreen = new WelcomeScreen(getDriver());
        welcomescreen.swapPage("S-Iphone X");
        Assert.assertTrue(welcomescreen.page1header.isDisplayed());
    }

    @Test
    public void page1BodyTest() throws InterruptedException {
        WelcomeScreen welcomescreen = new WelcomeScreen(getDriver());
        welcomescreen.swapPage("S-Iphone X");
        Assert.assertTrue(welcomescreen.page1body.isDisplayed());
    }

    @Test
    public void page1ImageTest() throws InterruptedException {
        WelcomeScreen welcomescreen = new WelcomeScreen(getDriver());
        welcomescreen.swapPage("S-Iphone X");
        Assert.assertTrue(welcomescreen.page1image.isEnabled());
    }

    @Test
    public void page2HeaderTest() throws InterruptedException {
        WelcomeScreen welcomescreen = new WelcomeScreen(getDriver());
        welcomescreen.swapPage2("S-Iphone X");
        Assert.assertTrue(welcomescreen.page2header.isDisplayed());
    }

    @Test
    public void page2BodyTest() throws InterruptedException {
        WelcomeScreen welcomescreen = new WelcomeScreen(getDriver());
        welcomescreen.swapPage2("S-Iphone X");
        Assert.assertTrue(welcomescreen.page2body.isDisplayed());
    }

    @Test
    public void page2ImageTest() throws InterruptedException {
        WelcomeScreen welcomescreen = new WelcomeScreen(getDriver());
        welcomescreen.swapPage2("S-Iphone X");
        Assert.assertTrue(welcomescreen.page2body.isEnabled());
    }

    @Test
    public void signupScreenTest() throws InterruptedException {
        WelcomeScreen welcomescreen = new WelcomeScreen(getDriver());
        SignUpFlowScreenStart signupscreen = welcomescreen.navigateToSignUpStartScreen();
        Assert.assertTrue(signupscreen.firstName.isDisplayed());
    }
}
