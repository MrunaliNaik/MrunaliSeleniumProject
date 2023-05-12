package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LaunchEdge {

    @Test
    public void edge() {

        System.setProperty("Webdriver.edge.driver", "C:\\Users\\Mrunali Naik\\Downloads\\edgedriver_win32");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");
    }
}

/*public static void main(String[] args) {

        System.setProperty("Webdriver.edge.driver", "C:\\Users\\Mrunali Naik\\Downloads\\edgedriver_win32");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");*/
