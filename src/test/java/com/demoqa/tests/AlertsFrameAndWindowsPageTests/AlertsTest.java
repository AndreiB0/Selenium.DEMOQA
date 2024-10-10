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
        alertsPage.clickAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertText);
        acceptAlert();

    }

    //Test Timer Alert button
    @Test
    public void testTimerAlert(){
        String expectedTimerAlertText = "This alert appeared after 5 seconds";
        var timerButton = homePage.goToAlertsFrameAndWindows().clickAlerts();
        timerButton.clickTimerAlertButton();
        Assert.assertEquals(getAlertText(), expectedTimerAlertText);
        acceptAlert();
    }

    //Test Confirmation button
    @Test
    public void testConfirmationAlertOk(){
        String expectedConfirmationResult = "You selected Ok";
        var confirmationOk = homePage.goToAlertsFrameAndWindows().clickAlerts();
        confirmationOk.clickConfirmationAlertButton();
        acceptAlert();
        String actualConfirmationText = confirmationOk.getConfirmationAlertResult();
        Assert.assertEquals(actualConfirmationText,expectedConfirmationResult);
    }

    @Test
    public void testConfirmationAlertCancel(){
        String expectedConfirmationResult = "You selected Cancel";
        var confirmationCancel = homePage.goToAlertsFrameAndWindows().clickAlerts();
        confirmationCancel.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationText = confirmationCancel.getConfirmationAlertResult();
        Assert.assertEquals(actualConfirmationText,expectedConfirmationResult);
    }

    //Test Prompt button
    @Test
    public void testPromptAlert(){
        String expectedAlertText = "Joe Doe";
        var promptButton = homePage.goToAlertsFrameAndWindows().clickAlerts();
        promptButton.clickPromptAlertButton();
        setAlertText(expectedAlertText);
        acceptAlert();
        String actualPromptText = promptButton.getPromptAlertResult();
        Assert.assertTrue(actualPromptText.contains(expectedAlertText));
    }



}
