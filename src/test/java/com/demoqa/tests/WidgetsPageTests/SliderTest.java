package com.demoqa.tests.WidgetsPageTests;

import com.demoqa.tests.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {
    @Test
    public void testSlider(){
        int x = 180;
        int y = 0;
        var sliderPage = homePage.goToWidgets().clickSlider();
        sliderPage.moveSlider(x, y);
        String actualValue = sliderPage.getSliderValue();
        String expectedValue = "65";

        Assert.assertEquals(actualValue, expectedValue);


    }
}
