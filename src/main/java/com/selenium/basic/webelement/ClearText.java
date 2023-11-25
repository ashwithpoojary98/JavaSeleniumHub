package com.selenium.basic.webelement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClearText {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement element = driver.findElement(By.id("txtUsername"));
        /**
         * clear() help the clear the text
         * always do clear the text before entering text, it helps clear the value in the element
         * clear() work only for "input" tag
         */
        element.clear();
        element.sendKeys("admin");
    }
}
