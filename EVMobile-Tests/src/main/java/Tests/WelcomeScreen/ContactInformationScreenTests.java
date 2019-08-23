package Tests.WelcomeScreen;

import EVMobile.PageObjects.skywalkerios.ContactInformationScreen;
import EVMobile.PageObjects.skywalkerios.dashboard.SettingsScreen;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;

public class ContactInformationScreenTests extends BaseMobileTest {

    @Test(priority = 1)
    @Ignore
    public void testBackToDashboardScreen() throws InterruptedException, AWTException {
        SettingsScreen settingsScreen = new SettingsScreen(getDriver());
        ContactInformationScreen contactInformationScreen = new ContactInformationScreen(getDriver());
        contactInformationScreen.navigateFromSettingsToContactInfoScreen();
        Assert.assertTrue(contactInformationScreen.phoneSection.isEnabled());
    }

    @Test(priority = 2)
    @Ignore
    public void testCancelDiscardChangesGoesToSettingsScreen() throws InterruptedException, AWTException {
        ContactInformationScreen contactInformationScreen = new ContactInformationScreen(getDriver());
        SettingsScreen settingsScreen = contactInformationScreen.cancelChanges();
        Assert.assertTrue(settingsScreen.screenTitle.isEnabled());
    }

    @Test(priority = 3)
    @Ignore
    public void testCancelContinueEditingRemainsinContactInfoScreen() throws InterruptedException, AWTException {
        ContactInformationScreen contactInformationScreen = new ContactInformationScreen(getDriver());
        contactInformationScreen.cancelContinueEditing();
        Assert.assertTrue(contactInformationScreen.screenTitle.isEnabled());
    }

    @Test(priority = 4)
    @Ignore
    public void testSaveWhenNoFillInMandatoryFieldsRemainsinContactInfoScreen() throws InterruptedException, AWTException {
        ContactInformationScreen contactInformationScreen = new ContactInformationScreen(getDriver());
        contactInformationScreen.newAccountsaveWithoutFillingMandatoryFields();
        Assert.assertTrue(contactInformationScreen.screenTitle.isEnabled());
    }

    @Test(priority = 5)
    @Ignore
    public void testSavingFillingAllMandatoryFieldsGoesToSettingsScreen() throws InterruptedException, AWTException {
        ContactInformationScreen contactInformationScreen = new ContactInformationScreen(getDriver());
        SettingsScreen settingsScreen = contactInformationScreen.newAccountsaveFillingAllMandatoryFields();
        Assert.assertTrue(settingsScreen.contactInformationLink.isEnabled());
    }

    @Test(priority = 6)
    public void testAccountRelatedDataIsPrepopulated() throws InterruptedException, AWTException {
        ContactInformationScreen contactInformationScreen = new ContactInformationScreen(getDriver());
        Assert.assertTrue(contactInformationScreen.accountRelatedFieldsArePrepopulated());
    }
}