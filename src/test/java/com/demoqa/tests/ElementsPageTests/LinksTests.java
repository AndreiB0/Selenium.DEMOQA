package com.demoqa.tests.ElementsPageTests;

import com.demoqa.tests.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksTests extends BaseTest {
    //Test for Created link
    @Test
    public void testCreatedLink(){
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.clickCreatedLink();
        //Assert for Created
        String actualCreatedResult = linksPage.getLinkResponse();
        Assert.assertTrue(actualCreatedResult.contains("201") && actualCreatedResult.contains("Created"));
    }

    //Test for No Content link
    @Test
    public void testNoContentLink(){
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.clickNoContentLink();
        //Assert for Created
        String actualNoContentResult = linksPage.getLinkResponse();
        Assert.assertTrue(actualNoContentResult.contains("204") && actualNoContentResult.contains("No Content"));
    }

    //Test for Moved link
    @Test
    public void testMovedLink(){
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.clickMovedLink();
        //Assert for Created
        String actualMovedResult = linksPage.getLinkResponse();
        Assert.assertTrue(actualMovedResult.contains("301") && actualMovedResult.contains("Moved Permanently"));
    }

    //Test for Bad Request link
    @Test
    public void testBadRequestLink(){
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.clickBadRequestLink();
        //Assert for Bad Request
        String actualBadRequestResult = linksPage.getLinkResponse();
        Assert.assertTrue(actualBadRequestResult.contains("400") && actualBadRequestResult.contains("Bad Request"));
    }
}

