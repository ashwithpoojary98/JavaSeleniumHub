package com.selenium.basic.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Ashwith
 * @date 15-July-2023
 */
public class GetWindowSize {

    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        /**
         * getSize() method help to get the current window size.
         * It returns Dimension class which consist of height and width of the current window
         */
        Dimension windowSize = driver.manage().window().getSize();
        System.out.println("Window height:" + windowSize.height + " Window width:" + windowSize.width);
        driver.quit();
    }
}
