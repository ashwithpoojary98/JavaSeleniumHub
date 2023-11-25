package com.selenium.basic.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInitializations {
    public static void main(String[] args)  {

        String url = "https://www.google.com";

        //Initialize the browser
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = null;

        String browser = "chrome";

        if (browser.equalsIgnoreCase(browser)) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase(browser)) {
            driver = new FirefoxDriver();
        }
        driver.get(url);
        driver.quit();

    }
}
