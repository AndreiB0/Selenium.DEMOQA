package com.demoqa.pages.Elements;

import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.clickJS;
import static Utilities.JavaScriptUtility.scrollToElementJS;

public class CheckBoxPage extends ElementsPage{
    //Check box field
    private By homeCheckBox = By.id("tree-node-home");

    //Result message
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
