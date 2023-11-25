package com.selenium.basic.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetCurrentUrl {

    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement userNameField = driver.findElement(By.name("username"));
        userNameField.clear();
        userNameField.sendKeys("Admin");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.clear();
        passwordField.sendKeys("admin123");
        By byClassName = By.tagName("button");
        driver.findElement(byClassName).submit();
        /**
         * Get Current URL help to retrieve the current tab URL
         */
        String currentPageURL = driver.getCurrentUrl();
        System.out.println(currentPageURL);
        driver.quit();
    }
}
