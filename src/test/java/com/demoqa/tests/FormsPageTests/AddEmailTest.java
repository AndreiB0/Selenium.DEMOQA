package com.demoqa.tests.FormsPageTests;

import com.demoqa.tests.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddEmailTest extends BaseTest {

    @Test
    public void testEmailField(){
        String email = "asd@asd.com";
        var goToPracticeForms = homePage.goToForms().clickPracticeForm();
        goToPracticeForms.addEmail(email);

        String enteredEmail = goToPracticeForms.getEmail();
        Assert.assertEquals(enteredEmail, email);
    }




}
