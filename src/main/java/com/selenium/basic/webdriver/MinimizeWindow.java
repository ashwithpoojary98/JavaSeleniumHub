package com.selenium.basic.webdriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Ashwith
 * @date 15-July-2023
 */
public class MinimizeWindow {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        /**
         * Minimizes the current window if it is not already minimized
         */
        driver.manage().window().minimize();
        driver.quit();
    }
}
