package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Mrunali Naik\\Downloads\\chromedriver_win32");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //Navigate to URL

        driver.navigate().to("https://www.facebook.com/");

        //Navigate backward in browser history
        driver.navigate().back();
        //Refresh page
        driver.navigate().refresh();
        //Navigate forwards in browser history
        driver.navigate().forward();

    }
}
