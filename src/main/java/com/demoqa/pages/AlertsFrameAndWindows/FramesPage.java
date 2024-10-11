package com.demoqa.pages.AlertsFrameAndWindows;

import org.openqa.selenium.By;

public class FramesPage extends AlertsFrameAndWindowsPage{

    private String iFrameBigBox = "frame1";
    private By textInFrame = By.id("sampleHeading");

    private void switchToBigBox(){
      driver.switchTo().frame(iFrameBigBox);
    }

    public String getTextInBigFrame(){
        switchToBigBox();
        String bigFrameText =  find(textInFrame).getText();
        return bigFrameText;
    }


}
