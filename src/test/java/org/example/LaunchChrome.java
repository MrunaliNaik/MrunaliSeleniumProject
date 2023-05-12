package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchChrome {

    @Test
    public void chrome() {

        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Mrunali Naik\\Downloads\\chromedriver_win32");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

    }

}


/*public static void main(String[] args) {


        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Mrunali Naik\\Downloads\\chromedriver_win32");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

    }*/