package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelMethods {

    @Test
    public void chrome() {

        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Mrunali Naik\\Downloads\\chromedriver_win32");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void edge() {

        System.setProperty("Webdriver.edge.driver", "C:\\Users\\Mrunali Naik\\Downloads\\edgedriver_win32");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void firefox() {


        System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Mrunali Naik\\Downloads\\geckodriver-v0.33.0-win32");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
    }



}
