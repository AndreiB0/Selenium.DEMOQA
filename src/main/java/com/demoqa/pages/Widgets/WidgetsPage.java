package com.demoqa.pages.Widgets;

import com.demoqa.pages.Home.HomePage;
import org.openqa.selenium.By;

import static com.Utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {
    /////Find submenus for each page in Widgets page
    private By accordianMenuItem = By.xpath("//li[@id='item-0']/span[text()='Accordian']");
    private By autoCompleteMenuItem = By.xpath("//li[@id='item-1']/span[text()='Auto Complete']");
    private By datePickerMenuItem = By.xpath("//li[@id='item-2']/span[text()='Date Picker']");
    private By sliderMenuItem = By.xpath("//li[@id='item-3']/span[text()='Slider']");
    private By progressBarMenuItem = By.xpath("//li[@id='item-4']/span[text()='Progress Bar']");
    private By tabsMenuItem = By.xpath("//li[@id='item-5']/span[text()='Tabs']");
    private By toolTipsMenuItem = By.xpath("//li[@id='item-6']/span[text()='Tool Tips']");
    private By menuMenuItem = By.xpath("//li[@id='item-7']/span[text()='Menu']");
    private By selectMenuItem = By.xpath("//li[@id='item-8']/span[text()='Select Menu']");

    //Go to Accordian submenu
    public AccordianPage clickAccordian(){
        scrollToElementJS(accordianMenuItem);
        click(accordianMenuItem);
        return new AccordianPage();
    }

    //Go to Auto Complete submenu
    public AutoCompletePage clickAutoComplete(){
        scrollToElementJS(autoCompleteMenuItem);
        click(accordianMenuItem);
        return new AutoCompletePage();
    }

    //Go to Date Picker submenu
    public DatePickerPage clickDatePicker(){
        scrollToElementJS(datePickerMenuItem);
        click(datePickerMenuItem);
        return new DatePickerPage();
    }

    //Go to Slider submenu
    public SliderPage clickSlider(){
        scrollToElementJS(sliderMenuItem);
        click(sliderMenuItem);
        return new SliderPage();
    }

    //Go to Progress Bar submenu
    public ProgressBarPage clickProgressBar(){
        scrollToElementJS(progressBarMenuItem);
        click(progressBarMenuItem);
        return new ProgressBarPage();
    }

    //Go to Tabs submenu
    public TabsPage clickTabs(){
        scrollToElementJS(tabsMenuItem);
        click(tabsMenuItem);
        return new TabsPage();
    }

    //Go to Tool Tips submenu
    public ToolTipsPage clickToolTips(){
        scrollToElementJS(toolTipsMenuItem);
        click(toolTipsMenuItem);
        return new ToolTipsPage();
    }

    //Go to Menu submenu
    public MenuPage clickMenu(){
        scrollToElementJS(menuMenuItem);
        click(menuMenuItem);
        return new MenuPage();
    }

    //Go to Select Menu submenu
    public SelectMenuPage clickSelectMenu(){
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }
}
