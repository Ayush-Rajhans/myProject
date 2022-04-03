package com.qa.test;

import com.base.TestBase;
import com.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LandingPageTest extends TestBase {

    LandingPage landingPage;

    public LandingPageTest() {
        super();
    }

    @BeforeMethod
    public void SetUp() {
        initialization();
        landingPage = new LandingPage();
    }

    @Test
    public void LandingPageTitle() {
        System.out.println("Test Method");
        String title = landingPage.ValidateLandingPageTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Demo Script Test drive - PHPTRAVELS");
    }

    @Test
    public void ClickLogin() {
        landingPage.initializePageFactor();
        landingPage.ClickOnLogin();
        System.out.println("Clicked");
    }
    @Test
    public void ClickPricing()
    {
        landingPage.initializePageFactor();
        landingPage.ClickOnPricing();
    }
    @Test
    public void PricingDisplayed()
    {
        landingPage.initializePageFactor();
        landingPage.PricingIsDisplayed();
    }
    @AfterMethod
    public void QuitDriver()
    {
        CloseBrowser();
    }
}
