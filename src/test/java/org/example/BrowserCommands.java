package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Mrunali Naik\\Downloads\\chromedriver_win32");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //Maximize window
        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println(title);

        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        driver.close();

    }
}
