package com.demoqa.pages.Elements;

import com.demoqa.pages.Home.HomePage;
import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {
    /////Find submenus for each page in Elements page
    private By textBoxMenuItem = By.xpath("//li[@id='item-0']/span[text()='Text Box']");
    private By checkBoxMenuItem = By.xpath("//li[@id='item-1']/span[text()='Check Box']");
    private By radioButtonMenuItem = By.xpath("//li[@id='item-2']/span[text()='Radio Button']");
    private By webTablesMenuItem = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
    private By buttonsMenuItem = By.xpath("//li[@id='item-4']/span[text()='Buttons']");
    private By linksMenuItem = By.xpath("//li[@id='item-5']/span[text()='Links']");
    private By brokenLinksImagesMenuItem = By.xpath("//li[@id='item-5']/span[text()='Broken Links - Images']");
    private By uploadAndDownloadMenuItem = By.xpath("//li[@id='item-5']/span[text()='Upload and Download']");
    private By dynamicPropertiesMenuItem = By.xpath("//li[@id='item-5']/span[text()='Dynamic Properties']");

    //Go to Text Box submenu
    public TextBoxPage clickTextBox(){
        scrollToElementJS(textBoxMenuItem);
        click(textBoxMenuItem);
        return new TextBoxPage();
    }

    //Go to Check box submenu
    public CheckBoxPage clickCheckBox(){
        scrollToElementJS(checkBoxMenuItem);
        click(checkBoxMenuItem);
        return new CheckBoxPage();
    }

    //Go to Radio Button submenu
    public RadioButtonPage clickRadioButton(){
        scrollToElementJS(radioButtonMenuItem);
        click(radioButtonMenuItem);
        return new RadioButtonPage();
    }

    //Go to Web Tables submenu
    public WebTablesPage clickWebTables(){
        scrollToElementJS(webTablesMenuItem);
        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    //Go to Buttons submenu
    public ButtonsPage clickButtons(){
        scrollToElementJS(buttonsMenuItem);
        click(buttonsMenuItem);
        return new ButtonsPage();
    }

    //Go to Links submenu
    public LinksPage clickLinks(){
        scrollToElementJS(linksMenuItem);
        click(linksMenuItem);
        return new LinksPage();
    }

    //Go to Broken Links - Images submenu
    public BrokenLinksImagesPage clickBrokenLinksImages(){
        scrollToElementJS(brokenLinksImagesMenuItem);
        click(brokenLinksImagesMenuItem);
        return new BrokenLinksImagesPage();
    }

    //Go to Upload and Download submenu
    public UploadAndDownloadPage clickUploadAndDownload(){
        scrollToElementJS(uploadAndDownloadMenuItem);
        click(uploadAndDownloadMenuItem);
        return new UploadAndDownloadPage();
    }

    //Go to Dynamic Properties submenu
    public DynamicPropertiesPage clickDynamicProperties(){
        scrollToElementJS(dynamicPropertiesMenuItem);
        click(dynamicPropertiesMenuItem);
        return new DynamicPropertiesPage();
    }
}
