package com.demoqa.tests.ElementsPageTests;

import com.demoqa.tests.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {
    @Test
    public void testCheckBox(){
        String resultMessage = "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";
        var checkBox = homePage.goToElements().clickCheckBox();
        checkBox.clickHomeCheckbox();
        checkBox.getResultText();

        String actualMessage = checkBox.getResultText();
        Assert.assertTrue(actualMessage.contains(resultMessage));

    }
}
