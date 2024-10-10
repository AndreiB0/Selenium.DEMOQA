package com.demoqa.tests.FormsPageTests;

import com.demoqa.tests.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNamesTest extends BaseTest {

    @Test
    public void testNameFields(){
        String firstName = "Joe";
        String lastName = "Doe";

        var goToPracticeForms = homePage.goToForms().clickPracticeForm();
        goToPracticeForms.addFirstName(firstName);
        goToPracticeForms.addLastName(lastName);
        goToPracticeForms.clickSubmitButton();

        String enteredFirstName = goToPracticeForms.getFirstName();
        Assert.assertEquals(firstName,enteredFirstName);
        String enteredLastName = goToPracticeForms.getLastName();
        Assert.assertEquals(lastName,enteredLastName);



    }
}
