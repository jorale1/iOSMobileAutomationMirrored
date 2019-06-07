package EVMobile.Framework.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.support.PageFactory.initElements;

public abstract class Screen {

    private static final int LOADING_TIMEOUT_SECONDS = 5;
    protected final AppiumDriver driver;
    protected final MobilePlatform platform;

    public Screen(AppiumDriver driver, MobilePlatform platform) {
        this.driver = driver;
        this.platform = platform;

        initElements(new AppiumFieldDecorator(driver), this);
        waitForScreenIsReady();
    }

    protected abstract MobileElement getVisibilityElement();

    public abstract MobileElement getBackButtonElement();

    public abstract WebElement getLoadingElement();

    /**
     * Verify visibility of the screen.
     *
     * @return true if screen is being displayed.
     */
    public boolean isDisplayed() {
        return isElementDisplayed(getVisibilityElement());
    }

    /**
     * Return if the requested Mobile Element is displayed
     *
     * @param element Element on the Screen
     * @return true if the element is displayed
     */
    protected boolean isElementDisplayed(MobileElement element) {
        try {
            if (MobilePlatform.ANDROID.equals(platform)) {
                return element.isDisplayed();
            } else {
                return element.getId() != null;
            }
        } catch (NoSuchElementException | IndexOutOfBoundsException e) {
            return false;
        }
    }

    /**
     * Waits for screen visibility element to be displayed. If the screen is not
     * ready after a certain amount of time it will throw a runtime exception.
     */
    public void waitForScreenIsReady() {
        WebDriverWait wait = new WebDriverWait(driver, LOADING_TIMEOUT_SECONDS);
        try {
            List<WebElement> elements = new ArrayList<WebElement>();
            elements.add(getLoadingElement());
            wait.until(ExpectedConditions.invisibilityOfAllElements(elements));
        } catch (NoSuchElementException e) {
            // Do nothing.
        }
    }

    protected void waitForElementToAppear(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, LOADING_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForElementToDisappear(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, LOADING_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void waitForTextToDisappear(By locator, String text) {
        WebDriverWait wait = new WebDriverWait(driver, LOADING_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
    }
}
