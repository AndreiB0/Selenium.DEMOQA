package com.demoqa.pages.Interactions;

import org.openqa.selenium.By;

import static com.Utilities.JavaScriptUtility.scrollToElementJS;

public class InteractionsPage extends com.demoqa.pages.Home.HomePage {
    /////Find submenus for each page in Interactions page
    private By sortableMenuItem = By.xpath("//li[@id='item-0']/span[text()='Sortable']");
    private By selectableMenuItem = By.xpath("//li[@id='item-1']/span[text()='Selectable']");
    private By resizableMenuItem = By.xpath("//li[@id='item-2']/span[text()='Resizable']");
    private By droppableMenuItem = By.xpath("//li[@id='item-3']/span[text()='Droppable']");
    private By dragabbleMenuItem = By.xpath("//li[@id='item-4']/span[text()='Dragabble']");

    //Go to Sortable submenu
    public SortablePage clickSortable(){
        scrollToElementJS(sortableMenuItem);
        click(sortableMenuItem);
        return new SortablePage();
    }

    //Go to Selectable submenu
    public SelectablePage clickSelectalbe(){
        scrollToElementJS(selectableMenuItem);
        click(selectableMenuItem);
        return new SelectablePage();
    }

    //Go to Resizable submenu
    public ResizablePage clickResizable(){
        scrollToElementJS(resizableMenuItem);
        click(resizableMenuItem);
        return new ResizablePage();
    }

    //Go to Droppable submenu
    public DroppablePage clickDroppable(){
        scrollToElementJS(droppableMenuItem);
        click(droppableMenuItem);
        return new DroppablePage();
    }

    //Go to Dragabble submenu
    public DragabblePage clickDragabble(){
        scrollToElementJS(dragabbleMenuItem);
        click(dragabbleMenuItem);
        return new DragabblePage();
    }
}
