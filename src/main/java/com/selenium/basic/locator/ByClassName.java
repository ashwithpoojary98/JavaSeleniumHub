package com.selenium.basic.locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ByClassName {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement userNameField = driver.findElement(By.id("txtUsername"));
        userNameField.clear();
        userNameField.sendKeys("admin");
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        passwordField.clear();
        passwordField.sendKeys("admin");
        /**
         * Find element using class name
         * But in the DOM multiple class having same name
         * Selenium always find first element in DOM
         * Hence it's not preferable for complex application
         */
        By byClassName = By.className("button");
        WebElement submitButton = driver.findElement(byClassName);

    }
}
