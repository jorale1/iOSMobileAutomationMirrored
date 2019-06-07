package EVMobile.Framework.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobilePlatform;

import java.util.Stack;

/**
 * EagleView Navigator, used to navigate between different screens of the app.
 */
public abstract class Navigator {

    protected final AppiumDriver driver;
    protected final MobilePlatform platform;

    private Stack<Screen> navigationStack = new Stack<>(); // TODO Use this Vector for Screen management

    protected Navigator(AppiumDriver driver, MobilePlatform platform) {
        this.driver = driver;
        this.platform = platform;
    }

    /**
     * Navigates to DashBoard Screen from whichever screen is situated and returns it.
     *
     * @return DashBoardScreen
     */
    public abstract Screen goToDashBoardScreen();

    /**
     * Navigates to LoginScreen
     *
     * @return LoginScreen
     */
    public abstract Screen goToLoginScreen();

    /**
     * Navigates to SettingsScreen
     *
     * @return SettingsScreen
     */
    public abstract Screen goToSettingsScreen();

    /**
     * Navigate to the previous screen and returns current screen.
     *
     * @return The new visible screen.
     */
    public abstract Screen goBack();

    /**
     * Returns current screen from de navigation stack.
     *
     * @return Current screen.
     */
    public Screen getCurrentScreen() {
        // TODO Has to be implemented
        return null;
    }

    /**
     * Adds a new Screen to the Navigation Stack.
     *
     * @return Screen that was added to the Navigation Stack.
     */
    public Screen push(Screen screen) {
        // TODO Has to be implemented
        return null;
    }

    /**
     * Removes the latest Screen from the Navigation Stack.
     *
     * @return Screen that was removed from Navigation Stack.
     */
    public Screen pop() {
        // TODO Has to be implemented
        return null;
    }
}
