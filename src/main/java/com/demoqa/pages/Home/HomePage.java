package com.demoqa.pages.Home;

import com.demoqa.pages.AlertsFrameAndWindows.AlertsFrameAndWindowsPage;
import com.demoqa.pages.BookStoreApplication.BookStoreApplicationPage;
import com.demoqa.pages.Elements.ElementsPage;
import com.demoqa.pages.Forms.FormsPage;
import com.Base.BasePage;
import com.demoqa.pages.Interactions.InteractionsPage;
import com.demoqa.pages.Widgets.WidgetsPage;
import org.openqa.selenium.By;

import static com.Utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    /////Find cards for each page in Home page
    private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By alertsFrameAndWindowsCard = By.xpath("//div[@id='app']//h5[text()='Alerts, Frame & Windows']");
    private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
    private By interactionsCard = By.xpath("//div[@id='app']//h5[text()='Interactions']");
    private By bookStoreApplicationCard = By.xpath("//div[@id='app']//h5[text()='Book Store Application']");

    //Go to Elements page
    public ElementsPage goToElements(){
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    //Go to Forms page
    public FormsPage goToForms(){
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    //Go to Alerts,Frames & Windows page
    public AlertsFrameAndWindowsPage goToAlertsFrameAndWindows(){
        scrollToElementJS(alertsFrameAndWindowsCard);
        click(alertsFrameAndWindowsCard);
        return new AlertsFrameAndWindowsPage();
    }

    //Go to Widgets page
    public WidgetsPage goToWidgets(){
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }

    //Go to Interactions page
    public InteractionsPage goToInteractions(){
        scrollToElementJS(interactionsCard);
        click(interactionsCard);
        return new InteractionsPage();
    }

    //Go to Book Store Application page
    public BookStoreApplicationPage goToBookStoreApplication(){
        scrollToElementJS(bookStoreApplicationCard);
        click(bookStoreApplicationCard);
        return new BookStoreApplicationPage();
    }
}
