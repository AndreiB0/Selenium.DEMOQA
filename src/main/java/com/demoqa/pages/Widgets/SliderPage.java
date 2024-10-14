package com.demoqa.pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static com.Utilities.ActionsUtility.dragAndDropBy;
import static com.Utilities.GetUtility.getAttribute;

public class SliderPage extends WidgetsPage{
    //div[@id='sliderContainer']/input[@type='range']
    private By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
    private By sliderValue = By.id("sliderValue");


    public void moveSlider(int x, int y){
        //Actions act = new Actions(driver);
        //act.dragAndDropBy(find(slider), x, y).perform();
        dragAndDropBy(find(slider), x, y);
    }

    public String getSliderValue(){
        return getAttribute(sliderValue, "value");
    }
}
