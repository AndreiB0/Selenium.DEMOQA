package com.demoqa.pages.Widgets;

import org.openqa.selenium.By;

import static com.Utilities.DropDownUtility.selectByVisibleText;

public class DatePickerPage extends WidgetsPage{
    //Select date field
    private By selectDateField = By.id("datePickerMonthYearInput");
    private By monthDropDown = By.className("react-datepicker__month-select");
    private By yearDropDown = By.className("react-datepicker__year-select");
    private By dayValue(String day){
        return By.xpath("//div[contains(@class, 'react-datepicker__day react-datepicker__day--')][text()='"+ day +"']");
    }

    //Click on Select date field
    public void clickSelectDate(){
        click(selectDateField);
    }


    //Select a date from Date picker
    public void selectDay(String day){
        click(dayValue(day));
    }

    public void selectMonth(String month){
        selectByVisibleText(monthDropDown, month);
    }

    public void selectYear(String year){
        selectByVisibleText(yearDropDown, year);
    }

    public String getDate(){
        return find(selectDateField).getAttribute("value");
    }

    public boolean isDayInMonth(String day){
        return find(dayValue(day)).isDisplayed();
    }
}
