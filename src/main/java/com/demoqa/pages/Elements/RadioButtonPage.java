package com.demoqa.pages.Elements;

import org.openqa.selenium.By;

import static com.Utilities.JavaScriptUtility.clickJS;
import static com.Utilities.JavaScriptUtility.scrollToElementJS;

public class RadioButtonPage extends ElementsPage{
    /////Find radio button elements in Radio Button page
    private By yesRadioButton        = By.id("yesRadio");
    private By impressiveRadioButton = By.id("impressiveRadio");
    private By noRadioButton         = By.id("noRadio");

    //Click and verify Yes radio button
    public void clickYesRadioButton(){
        scrollToElementJS(yesRadioButton);
        clickJS(yesRadioButton);
    }
    public boolean isYesSelected(){
        return find(yesRadioButton).isSelected();
    }

    //Click and verify Impressive radio button
    public void clickImpressiveRadioButton(){
        scrollToElementJS(impressiveRadioButton);
        clickJS(impressiveRadioButton);
    }
    public boolean isImpressiveSelected(){
        return find(impressiveRadioButton).isSelected();
    }

    //Click and verify No radio button
    public void clickNoRadioButton(){
        scrollToElementJS(noRadioButton);
        clickJS(noRadioButton);
    }
    public boolean isNoSelected(){
        return find(noRadioButton).isSelected();
    }
}
