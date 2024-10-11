package com.demoqa.pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.Utilities.DropDownUtility.*;
import static com.Utilities.JavaScriptUtility.*;

import java.util.List;

public class SelectMenuPage extends WidgetsPage{

    //Standard multi select item
    private By standardMultiSelect = By.id("cars");

    //Method for multi select item
    public void selectStandardMulti(String text){
        scrollToElementJS(standardMultiSelect);
        selectByVisibleText(standardMultiSelect, text);
    }

    public void selectStandardMulti(int index){
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect, index);
    }

    public void deselectStandardMulti(String value){
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect, value);
    }

    public List<String> getAllSelectedStandardMultiOptions(){
        return getAllSelectedOptions(standardMultiSelect);
    }


}
