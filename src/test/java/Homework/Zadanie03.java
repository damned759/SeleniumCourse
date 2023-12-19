package Homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie03 {

    @Test
    public void zadanie03() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");

       //FILLING IN THE FORM
        driver.findElement(By.id("first-name")).sendKeys("Karol");
        driver.findElement(By.id("last-name")).sendKeys("Kowalski");
        driver.findElement(By.name("gender")).click();
        driver.findElement(By.id("dob")).sendKeys("05/22/2010");
        driver.findElement(By.id("address")).sendKeys("05/22/2010");
        driver.findElement(By.id("email")).sendKeys("karol.kowalski@mailinator.com");
        driver.findElement(By.id("password")).sendKeys("Pass123");
        driver.findElement(By.id("company")).sendKeys("Coders Lab");
        driver.findElement(By.id("comment")).sendKeys("To jest mój pierwszy automat testowy");

        //SUBMIT THE FORM
        driver.findElement(By.id("submit")).click();

        driver.quit();
    }
}
