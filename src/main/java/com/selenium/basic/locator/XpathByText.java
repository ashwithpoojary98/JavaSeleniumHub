package com.selenium.basic.locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathByText {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        /**
         *Xpath by text help to determine the locator in DOM
         *
         *        //tagName[text()='visibleText']
         *
         *    Eg: //p[text()='Forgot your password? ']
         */
        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
        driver.close();
    }
}
