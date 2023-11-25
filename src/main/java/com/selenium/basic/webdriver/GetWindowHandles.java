package com.selenium.basic.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;


public class GetWindowHandles {
    public static void main(String[] args) {
        String url = "https://www.naukri.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//span[text()='MNC']/parent::a")).click();
        /**
         * Get window handles help to get all open window address
         */
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            driver.switchTo().window(window);
            System.out.println("Current Page Title " + driver.getTitle());
        }
        driver.quit();
    }
}
