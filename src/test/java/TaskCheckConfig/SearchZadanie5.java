package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchZadanie5 {

    /*
    Po utworzeniu konta na stronie https://hotel-testlab.coderslab.pl/en
    zidentyfikuj następujące pola korzystając z lokalizatora By.cssSelector:
        MY PERSONAL INFORMATION
        MY ADDRESSES
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInButton = driver.findElement(By.className("hide_xs"));
        signInButton.click();
        WebElement emailLogIn = driver.findElement(By.id("email"));
        emailLogIn.sendKeys("abcd1234@gmail.com");
        WebElement passwdLogIn = driver.findElement(By.id("passwd"));
        passwdLogIn.sendKeys("Doejoe4321");
        WebElement signIn = driver.findElement(By.id("SubmitLogin"));
        signIn .click();

        Thread.sleep(3000);

        //exc.5
        driver.findElement(By.cssSelector("a[href$='addresses']"));
        driver.findElement(By.cssSelector("a[title$='Information'"));

    }



}
