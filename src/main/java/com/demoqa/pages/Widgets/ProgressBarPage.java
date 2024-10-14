package com.demoqa.pages.Widgets;

import org.openqa.selenium.By;

import static com.Utilities.GetUtility.*;
import static com.Utilities.WaitUtility.*;

public class ProgressBarPage extends WidgetsPage{
    //Find items in Progress Bar page
    private By startButton = By.id("startStopButton");
    private By progressValue = By.xpath("//div[@id='progressBar']/div[@aria-valuenow='100']");



    public void clickStartButton(){
        click(startButton);
    }

    public String getProgressValue(){
        fluentWaitUntilVisible(30, progressValue);
        return getText(progressValue);
    }


}
