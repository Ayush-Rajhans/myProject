package com.pages;

import com.base.TestBase;
import com.util.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends TestBase {
    Util util = new Util();

    @FindBy(xpath = "//*[contains (text() , \"Login\")]")
    WebElement Login;

    @FindBy(xpath = "//*[contains (text() , \"Sign up\")]")
    WebElement SignUp;

    @FindBy(xpath = "//*[contains (text() , \"Pricing\")]")
    WebElement Pricing ;
    @FindBy(xpath = "//input[@id = \"address\"]")
    WebElement Email ;

    @FindBy(xpath = "//button[contains (text () , \"SUBSCRIBE\")]")
    WebElement Subscribe ;

    // PageFactory Initialization
    public void initializePageFactor() {
       PageFactory.initElements(driver , this);
    }

    public String ValidateLandingPageTitle() {
        System.out.println("Beforetitle");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String title = driver.getTitle();
        System.out.println(title);
        return title;
    }

    public void ClickOnLogin() {
        Login.click();

    }
    public void ClickOnPricing(){
        Pricing.click();
    }
    public void PricingIsDisplayed(){
        Pricing.isDisplayed();
    }
    public void SubscribeNewsLetter()
    {
        Email.sendKeys("ayushrajhans@gmail.com");
        Subscribe.click();
        util.AlertHandling();

    }
}
