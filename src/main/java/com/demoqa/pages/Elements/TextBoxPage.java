package com.demoqa.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static com.Utilities.ActionsUtility.sendKeys;
import static com.Utilities.GetUtility.getText;
import static com.Utilities.JavaScriptUtility.scrollToElementJS;
import static com.Utilities.WaitUtility.explicitWaitUntilVisible;


public class TextBoxPage extends ElementsPage{
    /////Text Box fields in Text Box page
    private By fullNameField           = By.id("userName");
    private By emailField              = By.id("userEmail");
    private By currentAddressField     = By.xpath("//textarea[@id='currentAddress']");;
    private By permanentAddressField   = By.xpath("//textarea[@id='permanentAddress']");
    private By submitButton            = By.id("submit");

    /////Text Box values after pressing Submit
    private By enteredFullName         = By.id("name");
    private By enteredEmail            = By.id("email");
    private By enteredCurrentAddress   = By.xpath("//p[@id='currentAddress']");
    private By enteredPermanentAddress = By.xpath("//p[@id='permanentAddress']");


    ///Set values for Fields in Text Box
    //Set Full name
    public void setFullName(String name){
        delay(1000);
        scrollToElementJS(fullNameField);
        sendKeys(find(fullNameField), Keys.chord(name));
    }

    //Set Email
    public void setEmail(String email){
        setFullName(Keys.chord(Keys.TAB, email));

    }

    //Set Current Address
    public void setCurrentAddress(String currentAddress){
        find(currentAddressField).sendKeys(currentAddress + Keys.ENTER);

    }

    //Set Permanent Address
    public void setPermanentAddress(String permanentAddress){
        find(permanentAddressField).sendKeys(permanentAddress + Keys.ENTER);
    }

    public void clickSubmit(){
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    //Get values after submit
    //Get Full Name
    public String getFullName(){
        explicitWaitUntilVisible(5, enteredFullName);
        return getText(enteredFullName);
    }

    //Get Email
    public String getEmail(){
        explicitWaitUntilVisible(5, enteredEmail);
        return getText(enteredEmail);
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
