package com.demoqa.pages.AlertsFrameAndWindows;

import org.openqa.selenium.By;

public class AlertsPage extends AlertsFrameAndWindowsPage{
    /////Find Buttons in Alerts page
    private By alertButton             = By.id("alertButton");
    private By timerAlertButton        = By.id("timerAlertButton");
    private By confirmationAlertButton = By.id("confirmButton");
    private By confirmationResult      = By.id("confirmResult");
    private By promptAlertButton       = By.id("promtButton");
    private By promptResult            = By.id("promptResult");

    //Click Alert Button
    public void clickAlertButton() {
        click(alertButton);
    }

    //Click Timer Button
    public void clickTimerAlertButton(){
        click(timerAlertButton);
        delay(5000);
    }

    //Click Confirm Button
    public void clickConfirmationAlertButton(){
        click(confirmationAlertButton);
    }
    public String getConfirmationAlertResult(){
        return find(confirmationResult).getText();
    }

    //Click Prompt Button
    public void clickPromptAlertButton(){
        click(promptAlertButton);
    }
    public String getPromptAlertResult(){
        return find(promptResult).getText();
    }

}
