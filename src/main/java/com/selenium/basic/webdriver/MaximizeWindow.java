package com.selenium.basic.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        /**
         * This help to maximize the browser window
         *
         *Web driver have manage() method it returns Options
         * Options is an interface which having window() method and returns Window
         * Window is an interface which having maximize() method
         * This is called has method chaining(driver.manage().window().maximize())
         */
        driver.manage().window().maximize();
    }
}
