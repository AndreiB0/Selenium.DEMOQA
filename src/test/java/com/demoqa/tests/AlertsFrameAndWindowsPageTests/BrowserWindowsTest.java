package com.demoqa.tests.AlertsFrameAndWindowsPageTests;

import com.demoqa.tests.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.Utilities.GetUtility.getURL;

public class BrowserWindowsTest extends BaseTest {

    @Test
    public void testNewWindowURL() {
        var windowsPage = homePage.goToAlertsFrameAndWindows().clickBrowserWindows();
        windowsPage.clickNewWindowButton();
        windowsPage.switchToNewWindow();
        String actualURL = getURL();
        String expectedURL = "https://demoqa.com/sample";
        Assert.assertEquals(actualURL, expectedURL,
                "\n Actual & Expected URL's Do Not Match \n");
    }
}
