package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleCheckbox {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Mrunali Naik\\Downloads\\chromedriver_win32");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/checkboxradio/");

        //maximize window
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));
        driver.switchTo().frame(frame);

        WebElement checkbox = driver.findElement(By.xpath("(//span[@class = 'ui-checkboxradio-icon-space']) [9]"));

        if(checkbox.isEnabled()){
            checkbox.click();
        }
        driver.close();


    }
}
