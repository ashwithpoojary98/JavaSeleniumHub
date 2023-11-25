package com.selenium.basic.navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NavigateForward {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.className("button")).submit();
        String anotherUrl = "https://www.amazon.in/";
        driver.navigate().to(anotherUrl);
        driver.navigate().back();
        /**
         *navigate().forward() is used to Move a single "item" forward in the browser's history
         */
        driver.navigate().forward();
        driver.close();
    }
}

