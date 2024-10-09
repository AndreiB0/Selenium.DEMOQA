package com.demoqa.tests.WidgetsPageTests;

import com.demoqa.tests.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectDateTest extends BaseTest {
    @Test
    public void testSelectDate(){
        String month = "March";
        String monthNumber = "03";
        String day = "11";
        String year = "1989";

        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.selectDay(day);


        String actualDate = datePickerPage.getDate();
        String expectedDate =  monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(actualDate, expectedDate);
    }
}
