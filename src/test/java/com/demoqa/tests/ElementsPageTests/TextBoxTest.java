package com.demoqa.tests.ElementsPageTests;

import com.demoqa.tests.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {
    @Test
    public void testTextBox(){
        String fullName = "Andrei Bonci";
        String email = "andrei.bonci@kek.com";
        String currentAddressCity = "1234 San Francisco";
        String permanentAddress = "New York";

        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName(fullName);
        textBoxPage.setEmail(email);
        textBoxPage.setCurrentAddress(currentAddressCity);
        textBoxPage.setPermanentAddress(permanentAddress);
        textBoxPage.clickSubmit();

        //Assertion for Full Name
        String expectedFullName = textBoxPage.getFullName();
        Assert.assertEquals("Name:" + fullName, expectedFullName);

        //Assertion for email
        String expectedEmail = textBoxPage.getEmail();
        Assert.assertEquals("Email:" + email, expectedEmail);

        //Assertion for Current Address
        String expectedCurrentAddress = textBoxPage.getCurrentAddress();
        Assert.assertNotEquals("Permananet Address : "+ currentAddressCity, expectedCurrentAddress);

        //Assertion for Permanent Address
        String expectedPermanentAddress = textBoxPage.getPermanentAddress();
        Assert.assertNotEquals("Permananet Address : "+ permanentAddress, expectedPermanentAddress);
    }
}

