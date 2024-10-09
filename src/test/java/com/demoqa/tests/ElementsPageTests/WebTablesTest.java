package com.demoqa.tests.ElementsPageTests;

import com.demoqa.tests.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest {
    @Test
    public void testWebTable() {
        String email = "alden@example.com";
        String firstName = "Andrei";
        String lastName = "Bonci";
        String age = "35";

        var webTablesPage = homePage.goToElements().clickWebTables();
        webTablesPage.clickEdit(email);
        webTablesPage.setFirstName(firstName);
        webTablesPage.setLastName(lastName);
        webTablesPage.setAge(age);
        webTablesPage.clickSubmitButton();

        //Verify First name change
        String actualFirstName = webTablesPage.getTableFirstName(email);
        String expectedFirstName = firstName;
        Assert.assertEquals(actualFirstName, expectedFirstName);

        //Verify Last name change
        String actualLastName = webTablesPage.getTableLastName(email);
        String expectedLastName = lastName;
        Assert.assertEquals(actualLastName, expectedLastName);

        //Verify Age change
        String actualAge = webTablesPage.getTableAge(email);
        String expectedAge = age;
        Assert.assertEquals(actualAge, expectedAge);

    }
}

