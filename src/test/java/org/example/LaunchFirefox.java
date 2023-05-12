package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchFirefox {

    @Test
    public void firefox() {


        System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Mrunali Naik\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
    }
}


/*public static void main(String[] args) {


        System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Mrunali Naik\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/"); */