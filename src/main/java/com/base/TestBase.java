package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Ayush
 */

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;


    // Test Base class constructor

    public TestBase() {

        prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream("C:\\Users\\rajha\\Documents\\myProject\\src\\main\\java\\com\\config\\config.properties");
            try {
                prop.load(ip);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public void initialization() {
        String BrowserName = prop.getProperty("Browser");
        if (BrowserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajha\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(prop.getProperty("url"));
    }
    public void QuitBrowser()
    {
        driver.quit();
    }
    public void CloseBrowser(){
        driver.close();
    }
}
