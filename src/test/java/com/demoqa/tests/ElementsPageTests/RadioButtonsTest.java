package com.demoqa.tests.ElementsPageTests;

import com.demoqa.tests.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonsTest extends BaseTest {//Click Yes radio button test
    @Test
    public void testRadioButtonYes(){
        var elementsPage = homePage.goToElements().clickRadioButton();
        elementsPage.clickYesRadioButton();
        boolean isYesButtonSelected = elementsPage.isYesSelected();
        Assert.assertTrue(isYesButtonSelected, "\\n Yes radio button is not selected \\n\"");
    }

    //Click Impressive radio button test
    @Test
    public void testRadioButtonImpressive(){
        var elementsPage = homePage.goToElements().clickRadioButton();
        elementsPage.clickImpressiveRadioButton();
        boolean isImpressiveSelected = elementsPage.isImpressiveSelected();
        Assert.assertTrue(isImpressiveSelected, "\\n Impressive radio button is not selected \\n\"");
    }

    //Click No radio button test
    @Test
    public void testRadioButtonNo(){
        var elementsPage = homePage.goToElements().clickRadioButton();
        elementsPage.clickNoRadioButton();
        boolean isNoSelected = elementsPage.isNoSelected();
        Assert.assertFalse(isNoSelected, "\\n No radio button is not selected \\n\"");
    }
}

