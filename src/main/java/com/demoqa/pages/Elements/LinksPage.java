package com.demoqa.pages.Elements;

import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJS;

public class LinksPage extends ElementsPage{
    /////Get links from page/////
    private By createdLink = By.id("created");
    private By noContentLink = By.id("no-content");
    private By movedLink = By.id("moved");
    private By badRequestLink = By.id("bad-request");

    /////Get Response after clicking a link/////
    private By repsonse = By.id("linkResponse");

    //Click Created link
    public void clickCreatedLink(){
        scrollToElementJS(createdLink);
        click(createdLink);
    }

    //Click No Content link
    public void clickNoContentLink(){
        scrollToElementJS(noContentLink);
        click(noContentLink);
    }

    //Click No Content link
    public void clickMovedLink(){
        scrollToElementJS(movedLink);
        click(movedLink);
    }

    //Click Bad request link
    public void clickBadRequestLink(){
        scrollToElementJS(badRequestLink);
        click(badRequestLink);
    }

    //Get Links responses after clicking
    public String getLinkResponse(){
        delay(1000);
        return find(repsonse).getText();
    }

}
