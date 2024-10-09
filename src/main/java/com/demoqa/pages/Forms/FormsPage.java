package com.demoqa.pages.Forms;

import com.demoqa.pages.Home.HomePage;
import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends HomePage {
    /////Find web elements in the left pane in Forms module/////
    private By practiceFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

    //Go to Practice form page
    public PracticeFormPage clickPracticeForm(){
        scrollToElementJS(practiceFormMenuItem);
        click(practiceFormMenuItem);
        return new PracticeFormPage();
    }
}
