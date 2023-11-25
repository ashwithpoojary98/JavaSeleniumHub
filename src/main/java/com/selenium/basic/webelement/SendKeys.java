package com.selenium.basic.webelement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SendKeys {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        /**
         * Identify the element
         */
        WebElement element = driver.findElement(By.id("txtUsername"));
        /**
         * sendKeys() method help to enter the text in text field
         * It work only for input tags other than input tag it throws exception
         */
        element.sendKeys("admin");


    }
}
