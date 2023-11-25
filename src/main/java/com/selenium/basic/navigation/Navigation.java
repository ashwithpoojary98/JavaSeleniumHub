package com.selenium.basic.navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

    public static void main(String[] args) {

        /**
         * Navigation url
         */
        String url = "https://www.google.com";

        /**
         *  Initialize the browser using WebDriver manager
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        /**
         * Here "get(String url)" is method take string as an argument
         * Here String is URL
         */
        driver.get(url);
    }
}
