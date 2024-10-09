package com.demoqa.pages.BookStoreApplication;

import com.demoqa.pages.Elements.CheckBoxPage;
import com.demoqa.pages.Elements.RadioButtonPage;
import com.demoqa.pages.Elements.TextBoxPage;
import com.demoqa.pages.Elements.WebTablesPage;
import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJS;

public class BookStoreApplicationPage extends com.demoqa.pages.Home.HomePage {
    /////Find submenus for each page in Book Store Application page
    private By loginMenuItem = By.xpath("//li[@id='item-0']/span[text()='Login']");
    private By bookStoreMenuItem = By.xpath("//li[@id='item-1']/span[text()='Book Store']");
    private By profileMenuItem = By.xpath("//li[@id='item-2']/span[text()='Profile']");
    private By bookStoreApiMenuItem = By.xpath("//li[@id='item-3']/span[text()='Book Store API']");

    //Go to Login submenu
    public LoginPage clickLogin(){
        scrollToElementJS(loginMenuItem);
        click(loginMenuItem);
        return new LoginPage();
    }

    //Go to Book Store submenu
    public BookStorePage clickBookStore(){
        scrollToElementJS(bookStoreMenuItem);
        click(bookStoreApiMenuItem);
        return new BookStorePage();
    }

    //Go to Profile submenu
    public ProfilePage clickProfile(){
        scrollToElementJS(profileMenuItem);
        click(profileMenuItem);
        return new ProfilePage();
    }

    //Go to Book Store API submenu
    public BookStoreApiPage clickBookStoreApi(){
        scrollToElementJS(bookStoreApiMenuItem);
        click(bookStoreApiMenuItem);
        return new BookStoreApiPage();
    }
}
