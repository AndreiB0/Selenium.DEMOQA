package com.demoqa.tests.WidgetsPageTests;

import com.demoqa.tests.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest {
    @Test
    public void testProgressBar(){
        var progressBar = homePage.goToWidgets().clickProgressBar();
        progressBar.clickStartButton();
        String actualPorgress = progressBar.getProgressValue();
        String expectedProgress = "100%";

        Assert.assertEquals(actualPorgress, expectedProgress);
    }
}
