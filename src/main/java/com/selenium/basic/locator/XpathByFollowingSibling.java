package com.selenium.basic.locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathByFollowingSibling {

    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        /**
         * Xpath By Following sibling help to identify the sibling element
         *
         *  //tagName[child locator]/following-sibling::tagName[following sibling identifier locator]
         *
         *  ancestor always travels with root node
         *  We can provide ancestor identifier locator to identify the specific root
         */
        WebElement punchTime = driver.findElement(By.xpath
                ("//p[text()='Punched Out']/following-sibling::p[contains(@class,'card-details')]"));
        System.out.println(punchTime.getText());
        driver.quit();
    }
}
