package com.selenium.basic.webelement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetText {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Duration duration = Duration.ofSeconds(30);
        driver.manage().timeouts().implicitlyWait(duration);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin122");
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        WebElement errorMessageElement = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
        /**
         * This method is used to get the visible text of element and sub element
         */
        String errorMessage = errorMessageElement.getText();
        System.out.println("Error message is= " + errorMessage);
        driver.quit();
    }
}
