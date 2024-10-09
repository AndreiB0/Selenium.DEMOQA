package com.demoqa.tests.FormsPageTests;

import com.demoqa.tests.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {
    @Test
    public void testCheckbox(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsCheckbox();
        formsPage.clickReadingCheckbox();
        formsPage.clickMusicCheckbox();

        formsPage.unclickSportsCheckbox();

        boolean isSportSelected = formsPage.isSportsSelected();
        Assert.assertFalse(isSportSelected, "\n Sports checkbox is selected\n");

        formsPage.unclickMusicCheckbox();

        boolean isMusicSelected = formsPage.isMusicSelected();
        Assert.assertFalse(isMusicSelected, "\n Music checkbox is selected\n");

        formsPage.unclickReadingCheckbox();

        boolean isReadingSelected = formsPage.isReadingSelected();
        Assert.assertFalse(isReadingSelected, "\n Reading checkbox is selected\n");


    }

}
