package Homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie04 {

    @Test
    public void zadanie04() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&create_account=1");
        driver.findElement(By.xpath("//input[@value='1']"));//male
        driver.findElement(By.xpath("//input[@value='2']"));//female
        driver.findElement(By.xpath("//input[@id='field-firstname']"));
        driver.findElement(By.xpath("//input[@id='field-lastname']"));
        driver.findElement(By.xpath("//input[@id='field-email']"));
        driver.findElement(By.xpath("//input[@id='field-password']"));
        driver.findElement(By.xpath("//button[@class='btn']"));
        driver.findElement(By.xpath("//input[@id='field-birthday']"));

        driver.quit();
    }
}
