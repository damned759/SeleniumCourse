package Homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie01 {

    @Test
    public void zadanie1() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String pageUrl = "https://mystore-testlab.coderslab.pl/index.php";

        driver.get(pageUrl);
        driver.findElement(By.id("_desktop_user_info")).click();
        driver.findElement(By.className("no-account")).click();
        driver.navigate().back();//to SignUp
        driver.navigate().back();//to Main

        Thread.sleep(1000);

        Assertions.assertEquals(pageUrl, driver.getCurrentUrl(), "URL not correct.");

        driver.quit();

    }

}
