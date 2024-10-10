package com.demoqa.tests.AlertsFrameAndWindowsPageTests;

import com.demoqa.tests.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalDialogsTest extends BaseTest {
    @Test
    public void testSmallModal(){
        var smallModal = homePage.goToAlertsFrameAndWindows().clickModalDialogs();
        smallModal.clickSmallModalButton();
        String smallModalText = smallModal.getSmallModalText();
        Assert.assertTrue(smallModalText.contains("small modal"));
        smallModal.clickCloseSmallModalButton();
    }

    @Test
    public void testLargeModal(){
        var largeModal = homePage.goToAlertsFrameAndWindows().clickModalDialogs();
        largeModal.clickLargeModalButton();
        String largeModalText = largeModal.getLargeModalText();
        Assert.assertTrue(largeModalText.contains("Lorem Ipsum"));
        largeModal.clickCloseLargeModalButton();
    }
}
