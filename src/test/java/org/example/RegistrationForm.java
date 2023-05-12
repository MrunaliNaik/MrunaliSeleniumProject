package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm {

    public static void main(String[] args) {

        System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Mrunali Naik\\Downloads\\geckodriver-v0.33.0-win32");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        // maximize the window
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        firstName.sendKeys("Mrunali");

        WebElement LastName = driver.findElement(By.xpath("//input[@name='lastName']"));
        LastName.sendKeys("Naik");

        WebElement Phone = driver.findElement(By.xpath("//input[@name='phone']"));
        Phone.sendKeys("9090909090");

        WebElement Email = driver.findElement(By.xpath("//input[@id='userName']"));
        Email.sendKeys("mrunalimnaik@gmail.com");

        WebElement Address = driver.findElement(By.xpath("//input[@name='address1']"));
        Address.sendKeys("XYZ Colony");

        WebElement City = driver.findElement(By.xpath("//input[@name='city']"));
        City.sendKeys("Pune");

        WebElement State = driver.findElement(By.xpath("//input[@name='state']"));
        State.sendKeys("Maharashtra");

        WebElement PostalCode = driver.findElement(By.xpath("//input[@name='postalCode']"));
        PostalCode.sendKeys("422009");

        /*WebElement Country = driver.findElement(By.xpath("//input[@name='country']"));
        Select dropdown = new Select(Country);
        dropdown.selectByVisibleText("INDIA");*/

        WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
        UserName.sendKeys("mrunalinaik");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("mrunali123");

        WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
        ConfirmPassword.sendKeys("mrunali123");

        WebElement Submit = driver.findElement(By.name("submit"));
        Submit.click();

        String expectedTitle = "Register: Mercury Tours";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Registration failed.");
        } else {
            System.out.println("Registration successful.");
        }

        // Close the browser
        driver.quit();

    }
}




/*//First name
        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));

        Actions fname = new Actions(driver);

        Action fn = fname.moveToElement(firstname).click().keyDown(firstname , Keys.SHIFT).sendKeys(firstname, "Mrunali").build();

        fn.perform();

        //LastName

        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));

        Actions lname = new Actions(driver);

        Action ln = lname.moveToElement(lastname).click().keyDown(lastname , Keys.SHIFT).sendKeys(lastname, "Naik").build();

        ln.perform();*/
