package com.selenium.basic.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        /**
         * Duration is java class Which have ofSeconds() static method
         */
        Duration duration = Duration.ofSeconds(30);
        /**
         * When searching for a single element, the driver should poll the page until the element has been found,
         * or this timeout expires before throwing a NoSuchElementException.
         * Here it will wait 30 sec, if element find before 30 sec it stops the poll and execute next step
         * else after 30 sec it throws NoSuchElementException
         */
        driver.manage().timeouts().implicitlyWait(duration);
    }
}
