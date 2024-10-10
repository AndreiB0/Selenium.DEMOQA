package com.demoqa.pages.AlertsFrameAndWindows;

import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsPage extends AlertsFrameAndWindowsPage{
    /////Find Buttons in Alerts page
    private By informationAlertButton = By.id("alertButton");
    private By timerAlertButton = By.id("timerAlertButton");
    private By confirmationAlertButton = By.id("confirmButton");
    private By confirmationResult = By.id("confirmResult");
    private By promptAlertButton = By.id("promtButton");
    private By promptResult = By.id("promptResult");

    //Click Alert Button
    public void clickInformationAlertButton() {
        click(informationAlertButton);
    }

    //Click Timer Button
    public void clickTimerAlertButton(){
        click(timerAlertButton);
        delay(5000);
    }

}
