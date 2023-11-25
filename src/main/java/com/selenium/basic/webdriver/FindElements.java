package com.selenium.basic.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class FindElements {

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
         * Find elements help to find the list of elements in the DOM
         *Find elements will not throw any exception it just returns empty list
         */
        List<WebElement> allMenuTabs = driver.findElements(By.xpath("//a[@class='oxd-main-menu-item']"));
        for (WebElement menuTab : allMenuTabs) {
            System.out.println(menuTab.getText());
        }
        driver.quit();
    }
}
