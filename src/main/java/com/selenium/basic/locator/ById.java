package com.selenium.basic.locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ById {
    public static void main(String[] args) {
        String url = "https://www.google.com";

        //Initialize the browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get(url);

        /**
         * Here By is the abstract class, and id is a static method
         */
        By byId=By.id("identifierId");

        /**
         * Try to find the element using ID
         */
        driver.findElement(byId);
    }
}
