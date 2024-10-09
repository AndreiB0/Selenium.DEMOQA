package com.demoqa.pages.Elements;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;


import static dev.failsafe.internal.util.Assert.*;

public class TextBoxPage extends ElementsPage{
    /////Text Box fields in Text Box page
    private By fullNameField = By.id("userName");
    private By emailField = By.id("userEmail");
    private By currentAddressField = By.id("currentAddress");
    private By permanentAddressField = By.id("permanentAddress");
    private By submitButton = By.id("submit");

    /////Text Box values after pressing Submit
    private By enteredFullName = By.id("name");
    private By enteredEmail = By.id("email");
    private By enteredCurrentAddress = By.xpath("//p[@id='currentAddress' and @class='mb-1']");
    private By enteredPermanentAddress = By.xpath("//p[@id='permanentAddress' and @class='mb-1']");


    ///Set values for Fields in Text Box
    //Set Full name
    public void setFullName(String fullName){
        click(fullNameField);
        set(fullNameField, fullName);
    }

    //Set Email
    public void setEmail(String email){
        click(emailField);
        set(emailField, email);
    }

    //Set Current Address
    public void setCurrentAddress(String currentAddress){
        click(currentAddressField);
        set(currentAddressField, currentAddress);
    }

    //Set Permanent Address
    public void setPermanentAddress(String permanentAddress){
        click(permanentAddressField);
        set(permanentAddressField, permanentAddress);
    }

    public void clickSubmit(){
        click(submitButton);
    }

    //Get values after submit
    //Get Full Name
    public String getFullName(){
        return find(enteredFullName).getText();
    }

    //Get Email
    public String getEmail(){
        return find(enteredEmail).getText();
    }

    //Get Current Address
    public String getCurrentAddress(){
        return find(enteredCurrentAddress).getText();
    }

    //Get Permanent Address
    public String getPermanentAddress(){
        return find(enteredPermanentAddress).getText();
    }

}
