package com.demoqa.pages.Elements;

import org.openqa.selenium.By;

public class WebTablesPage extends ElementsPage{
    /////Find Regisration fields in Web Tables page
    private By registrationFirstNameField = By.id("firstName");
    private By registrationLastNameField  = By.id("lastName");
    private By registrationAgeField       = By.id("age");
    //Submit button in the registration form
    private By submitButton               = By.id("submit");

    //Find element in Web Table by Email and click edit
    public void clickEdit(String email){
        By editButton = By.xpath("//div[text()='"+ email +"']//following::span[@title='Edit']");
        click(editButton);
    }

    /////Change Registration form fields////////
    //Change registration First Name field
    public void setFirstName(String firstName){
        set(registrationFirstNameField, firstName);
    }
    //Verify registration First name field change
    public String getTableFirstName(String email){
        By tableFirstName = By.xpath("//div[text()='"+ email +"']//preceding::div[3]");
        return  find(tableFirstName).getText();

    }

    //Change registration Last Name field
    public void setLastName(String lastName){
        set(registrationLastNameField, lastName);
    }
    //Verify registration Last name field change
    public String getTableLastName(String email){
        By tableLastName = By.xpath("//div[text()='"+ email +"']//preceding::div[2]");
        return find(tableLastName).getText();
    }


    //Change registration Age field
    public void setAge(String age){
        set(registrationAgeField, age);
    }
    //Verify registration Age field change
    public String getTableAge(String email){
        By tableAge = By.xpath("//div[text()='"+ email +"']//preceding::div[1]");
        return find(tableAge).getText();
    }

    //Click Submit button
    public void clickSubmitButton(){
        click(submitButton);
    }


}
