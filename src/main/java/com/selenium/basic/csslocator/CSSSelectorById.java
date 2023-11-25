package com.selenium.basic.csslocator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CSSSelectorById {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.youtube.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Duration duration = Duration.ofSeconds(30);
        driver.manage().timeouts().implicitlyWait(duration);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@id='search']"))
                .sendKeys("Selenium Automation");

        /**
         * CSS selector is one of the locator is used to identify the locator.
         * We can write Css selector in different ways.
         * CSS selector by id
         * Syntax: #<id value>
         * Example: #search-icon-legacy
         */
        driver.findElement(By.cssSelector("#search-icon-legacy")).click();
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
