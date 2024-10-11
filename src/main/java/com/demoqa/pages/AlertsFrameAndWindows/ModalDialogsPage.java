package com.demoqa.pages.AlertsFrameAndWindows;

import org.openqa.selenium.By;

public class ModalDialogsPage extends AlertsFrameAndWindowsPage{
    /////Find modal buttons in Modal Dialogs page
    //Small modal
    private By smallModalButton      = By.id("showSmallModal");
    private By smallModalText        = By.xpath("//div[contains(text(),'small modal')]");
    private By closeSmallModalButton = By.id("closeSmallModal");

    //Large modal
    private By largeModalButton = By.id("showLargeModal");
    private By largeModalText = By.xpath("//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]");
    private By closeLardeModalButton = By.id("closeLargeModal");

    //Click Small modal and get text
    public void clickSmallModalButton (){
        click(smallModalButton);
    }

    public String getSmallModalText(){
        return find(smallModalText).getText();
    }

    public void clickCloseSmallModalButton(){
        click(closeSmallModalButton);
    }

    //Click Large modal and get text
    public void clickLargeModalButton(){
        click(largeModalButton);
    }

    public String getLargeModalText(){
        return find(largeModalText).getText();
    }

    public void clickCloseLargeModalButton(){
        click(closeLardeModalButton);
    }




}
