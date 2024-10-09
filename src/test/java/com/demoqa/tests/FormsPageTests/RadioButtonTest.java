package com.demoqa.tests.FormsPageTests;

import com.demoqa.tests.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {
    //Click Male radio button test
    @Test
    public void testRadioButtonMale(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickMaleRadioButton();
        boolean isMaleSelected = formsPage.isMaleSelected();
        Assert.assertTrue(isMaleSelected, "\n Female radio button is not selected \n");
    }


    //Click Female radio button test
    @Test
    public void testRadioButtonFemale(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleSelected = formsPage.isFemaleSelected();
        Assert.assertTrue(isFemaleSelected, "\n Female radio button is not selected \n");
    }

    //Click Other radio button test
    @Test
    public void testRadioButtonOther(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickOtherRadioButton();
        boolean isOtherSelected = formsPage.isOtherSelected();
        Assert.assertTrue(isOtherSelected, "\n Other radio button is not selected \n");
    }

}
