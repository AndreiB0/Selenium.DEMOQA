package com.demoqa.pages.Forms;

import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.clickJS;
import static Utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage{
    ///Find First name and Last name in Practice Form
    private By firstNameField = By.id("firstName");
    private By lastNameField = By.id("lastName");

    //Find Email in Practice Form
    private By emailField = By.id("userEmail");

    //////Find Radio Buttons in Practice Form
    private By maleRadioButton = By.id("gender-radio-1");
    private By femaleRadioButton = By.id("gender-radio-2");
    private By otherRadioButton = By.id("gender-radio-3");

    /////Checkbox in Practice Form
    private By sportsCheckbox = By.id("hobbies-checkbox-1");
    private By readingCheckbox = By.id("hobbies-checkbox-2");
    private By musicCheckbox = By.id("hobbies-checkbox-3");

    /////Submit button in Practice Form
    private By submitButton = By.id("submit");

    //Add First name and Last name and verify
    public void addFirstName(String firstName){
        scrollToElementJS(firstNameField);
        click(firstNameField);
        set(firstNameField, firstName);
    }
    public String getFirstName(){
        return find(firstNameField).getText();
    }

    public void addLastName(String lastName){
        scrollToElementJS(lastNameField);
        click(lastNameField);
        set(lastNameField, lastName);
    }
    public String getLastName(){
        return find(lastNameField).getText();
    }

    //Add Email and verify
    public void addEmail(String email){
        scrollToElementJS(emailField);
        click(emailField);
        set(emailField, email);
    }

    public String getEmail(){
        return find(emailField).getText();
    }


    //////Methods for Radio buttons
    //Click and verify Male radio button
    public void clickMaleRadioButton(){
        scrollToElementJS(maleRadioButton);
        clickJS(maleRadioButton);
    }
    public boolean isMaleSelected(){
        return find(maleRadioButton).isSelected();
    }

    //Click and verify Female radio button
    public void clickFemaleRadioButton(){
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }
    public boolean isFemaleSelected(){
        return find(femaleRadioButton).isSelected();
    }

    //Click and verify Other radio button
    public void clickOtherRadioButton(){
        scrollToElementJS(otherRadioButton);
        clickJS(otherRadioButton);
    }
    public boolean isOtherSelected(){
        return find(otherRadioButton).isSelected();
    }

    //////Methods for Checkboxes
    //Click and verify Sports checkbox
    public void clickSportsCheckbox(){
        if(!find(sportsCheckbox).isSelected()){
            scrollToElementJS(sportsCheckbox);
            clickJS(sportsCheckbox);
        }
    }

    //Click and verify Reading checkbox
    public void clickReadingCheckbox(){
        if(!find(readingCheckbox).isSelected()){
            scrollToElementJS(readingCheckbox);
            clickJS(readingCheckbox);
        }
    }

    //Click and verify Music checkbox
    public void clickMusicCheckbox(){
        if(!find(musicCheckbox).isSelected()){
            scrollToElementJS(musicCheckbox);
            clickJS(musicCheckbox);
        }
    }

    //Unclick and verify Sports checkbox
    public void unclickSportsCheckbox(){
        if(find(sportsCheckbox).isSelected()){
            scrollToElementJS(sportsCheckbox);
            clickJS(sportsCheckbox);
        }
    }
    public boolean isSportsSelected(){
        return find(sportsCheckbox).isSelected();
    }

    //Unclick and verify Music checkbox
    public void unclickMusicCheckbox(){
        if(find(musicCheckbox).isSelected()){
            scrollToElementJS(musicCheckbox);
            clickJS(sportsCheckbox);
        }
    }
    public boolean isMusicSelected(){
        return find(musicCheckbox).isSelected();
    }

    //Unclick and verify Reading checkbox
    public void unclickReadingCheckbox(){
        if(find(readingCheckbox).isSelected()){
            scrollToElementJS(readingCheckbox);
            clickJS(readingCheckbox);
        }
    }
    public boolean isReadingSelected(){
        return find(readingCheckbox).isSelected();
    }

    //Click Submit button
    public void clickSubmitButton(){
        click(submitButton);
        delay(1000);
    }

}
