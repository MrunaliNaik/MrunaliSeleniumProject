package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SingleRadio {

    //public static void main(String[] args) {

    @Test
    public void singleradio() {

        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Mrunali Naik\\Downloads\\chromedriver_win32");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/checkboxradio/");

        //maximize window
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));
        driver.switchTo().frame(frame);

        //click on radio button newyork

        WebElement radio = driver.findElement(By.xpath("(//span[@class = 'ui-checkboxradio-icon-space']) [1]"));

        if(radio.isEnabled()){
            radio.click();
        }
        driver.close();

    }
}
