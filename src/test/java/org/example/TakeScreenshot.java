package org.example;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {

    public static void main(String[] args) throws IOException {

        System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Mrunali Naik\\Downloads\\geckodriver-v0.33.0-win32");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://automationexercise.com/");

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        //Files.copy(screenshot , new File("C:\\Users\\Harsha Patil\\Desktop\\manu\\image1.jpg"));
    }
}
