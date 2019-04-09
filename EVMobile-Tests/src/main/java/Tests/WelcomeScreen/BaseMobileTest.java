package Tests.WelcomeScreen;

import EVMobile.Framework.core.BaseTest;
import EVMobile.PageObjects.skywalkerios.WelcomeScreen;
import org.testng.annotations.BeforeMethod;

public class BaseMobileTest extends BaseTest {

    public WelcomeScreen welcomeScreen;

    @BeforeMethod

    public void welcome() {
        welcomeScreen = new WelcomeScreen(getDriver());
    }
}
