package com.selenium.basic.locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathByParent {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin122");
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        /**
         * Xpath by parent one type of locator to identify the specific element
         *
         *       //tagName[child locator]/parent::tagName
         *
         *       Child locator is required to identify the parent
         *
         *
         */
        driver.findElement(By.xpath("//span[text()='Admin']/parent::a")).click();
        driver.quit();
    }
}
