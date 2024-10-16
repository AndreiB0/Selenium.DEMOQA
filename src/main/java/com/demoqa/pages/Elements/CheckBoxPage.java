package com.demoqa.pages.Elements;

import org.openqa.selenium.By;

import static com.Utilities.JavaScriptUtility.clickJS;
import static com.Utilities.JavaScriptUtility.scrollToElementJS;

public class CheckBoxPage extends ElementsPage{
    //Check box fields
    private By homeCheckBox  = By.id("tree-node-home");
    private By displayResult = By.id("result");

    //Click Check box and get message
    public void clickHomeCheckbox(){
        scrollToElementJS(homeCheckBox);
        clickJS(homeCheckBox);
    }

    public String getResultText(){
        delay(1000);
        return find(displayResult).getText();
    }
}
