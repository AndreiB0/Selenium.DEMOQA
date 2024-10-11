package com.demoqa.pages.AlertsFrameAndWindows;

import org.openqa.selenium.By;

import static com.Utilities.SwitchToUtility.*;

public class FramesPage extends AlertsFrameAndWindowsPage{

    private By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private String iFrameBigBox = "frame1";
    private By iFrameSmallBox   = By.xpath("//div[@id='frame2Wrapper']/iframe");
    private By textInFrame      = By.id("sampleHeading");

    public String getHeaderFramesText(){
        return find(headerFramesText).getText();
    }

    //Switch to iFrame
    private void switchToBigBox(){
        switchToFrameString(iFrameBigBox);
    }

    private void switchToSmallBox(){
        switchToFrameElement(find(iFrameSmallBox));
    }

    public String getTextInBigFrame(){
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        switchtToDefaultContent();
        return bigFrameText;
    }

    public String getTextInSmallFrame(){
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        switchtToDefaultContent();
        return smallFrameText;
    }

}
