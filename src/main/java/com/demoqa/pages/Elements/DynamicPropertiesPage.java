package com.demoqa.pages.Elements;

import org.openqa.selenium.By;

import static com.Utilities.GetUtility.*;
import static  com.Utilities.WaitUtility.*;


public class DynamicPropertiesPage extends ElementsPage{
    //Get elements in Dynamic Properties page
    private By visibleAfterButton = By.id("visibleAfter");


    //Check for Visible after 5 seconds button
    public String getVisibleAfterButtonText (){
        explicitWaitUntilVisible(5, visibleAfterButton);
        String visibleText =  getText(visibleAfterButton);
        System.out.println("Button text: " + visibleText);
        return visibleText;
    }
}
