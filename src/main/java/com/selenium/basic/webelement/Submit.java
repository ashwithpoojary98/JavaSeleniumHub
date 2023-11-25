package com.selenium.basic.webelement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Submit {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement userNameField = driver.findElement(By.id("txtUsername"));
        userNameField.clear();
        userNameField.sendKeys("Admin");
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        passwordField.clear();
        passwordField.sendKeys("admin123");
        By byClassName = By.className("button");
        WebElement submitButton = driver.findElement(byClassName);
        /**
         * submit() is similar to click() in functionality
         * But it works only type attribute is submit else throw error
         * type=submit
         */
        submitButton.submit();
    }
}
