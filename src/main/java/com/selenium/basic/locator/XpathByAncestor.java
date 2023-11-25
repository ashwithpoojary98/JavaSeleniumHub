package com.selenium.basic.locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathByAncestor {

    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        /**
         * Xpath By ancestor help to identify the root element
         *
         *  //tagName[child locator]/ancestor::tagName[ancestor identifier locator]
         *
         *  ancestor always travels with root node
         *  We can provide ancestor identifier locator to identify the specific root
         */
        String labelName = driver.findElement(By.xpath("//input[@placeholder='Username']/ancestor::div[@class='oxd-form-row']")).getText();
        System.out.println(labelName);
        driver.quit();

    }
}
