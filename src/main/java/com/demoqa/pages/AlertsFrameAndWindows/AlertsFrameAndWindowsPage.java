package com.demoqa.pages.AlertsFrameAndWindows;

import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsFrameAndWindowsPage extends com.demoqa.pages.Home.HomePage {

    /////Find submenus for each page in Alerts,Frame & Windows page
    private By browserWindowsMenuItem = By.xpath("//li[@id='item-0']/span[text()='Browser Windows']");
    private By alertsMenuItem = By.xpath("//li[@id='item-1']/span[text()='Alerts']");
    private By framesMenuItem = By.xpath("//li[@id='item-2']/span[text()='Frames']");
    private By nestedFramesMenuItem = By.xpath("//li[@id='item-3']/span[text()='Nested Frames']");
    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");

    //Go to Browser Windows submenu
    public BrowserWindowsPage clickBrowserWindows(){
        scrollToElementJS(browserWindowsMenuItem);
        click(browserWindowsMenuItem);
        return new BrowserWindowsPage();
    }

    //Go to Alerts submenu
    public AlertsFrameAndWindowsPage clickAlerts(){
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsFrameAndWindowsPage();
    }

    //Go to Frames submenu
    public FramesPage clickFrames(){
        scrollToElementJS(framesMenuItem);
        click(framesMenuItem);
        return new FramesPage();
    }

    //Go to Nested Frames submenu
    public NestedFramesPage clickNestedFrames(){
        scrollToElementJS(nestedFramesMenuItem);
        click(nestedFramesMenuItem);
        return new NestedFramesPage();
    }
    //Go to Modal Dialogs submenu
    public ModalDialogsPage clickModalDialogs(){
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }
}
