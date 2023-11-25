package com.selenium.basic.locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathByContainsText {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin122");
        /**
         *Xpath by contains text help to determine the locator in DOM
         *
         * Contains help to find the dynamic locator value
         *        //tagName[contains(text(),'visibleText')]
         *
         *    Eg: //p[contains(text(),'OrangeHRM OS')]
         */
        String getVersion=driver.findElement(By.xpath("//p[contains(text(),'OrangeHRM OS')]")).getText();
        System.out.println("Version is= "+getVersion);
        driver.close();
    }
}
