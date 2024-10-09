package com.demoqa.tests.ElementsPageTests;

import com.demoqa.tests.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {
    @Test
    public void testFullName(){
        String fullName = "Andrei Bonci";
        String email = "andrei.bonci@kek.com";
        String currentAddress = "San Francisco";
        String permanentAddress = "New York";

        var textFields = homePage.goToElements().clickTextBox();
        textFields.setFullName(fullName);
        textFields.setEmail(email);
        textFields.setCurrentAddress(currentAddress);
        textFields.setPermanentAddress(permanentAddress);
        textFields.clickSubmit();

        //Assertion for Full Name
        String expectedFullName = textFields.getFullName();
        Assert.assertEquals("Name:" + fullName, expectedFullName);

        //Assertion for Email
        String expectedEmail = textFields.getEmail();
        Assert.assertEquals("Email:"+email, expectedEmail);

        //Assertion for Current Address
        String expectedCurrentAddress = textFields.getCurrentAddress();
        Assert.assertNotEquals("Permananet Address : "+ currentAddress, expectedCurrentAddress);


        //Assertion for Permanent Address
        String expectedPermanentAddress = textFields.getPermanentAddress();
        Assert.assertNotEquals("Permananet Address : "+ permanentAddress, expectedPermanentAddress);


    }
}

