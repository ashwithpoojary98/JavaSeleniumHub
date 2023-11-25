package com.selenium.basic.webdriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Ashwith
 * @date 15-July-2023
 */
public class SetWindowSize {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        /**
         * Set Size method help to set a specified window height and width.
         */
        int height = 1000;
        int width = 700;
        driver.manage().window().setSize(new Dimension(width, height));
        driver.quit();
    }
}
