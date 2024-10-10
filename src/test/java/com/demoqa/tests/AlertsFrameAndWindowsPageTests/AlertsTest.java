package com.demoqa.tests.AlertsFrameAndWindowsPageTests;

import com.demoqa.tests.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.Utilities.SwitchToUtility.*;

public class AlertsTest extends BaseTest {

    //Test Information Alert button
    @Test
    public void testInformationAlert(){
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFrameAndWindows().clickAlerts();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertText);
        acceptAlert();

    }

    //Test Timer Alert button
    @Test
    public void testTimerAlertButton(){
        String expectedTimerAlertText = "This alert appeared after 5 seconds";
        var timerButton = homePage.goToAlertsFrameAndWindows().clickAlerts();
        timerButton.clickTimerAlertButton();
        Assert.assertEquals(getAlertText(), expectedTimerAlertText);
        acceptAlert();
    }

}
