package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchZadanie4 {

    /*
    Będąc na stronie rejestracji nowego użytkownika (patrz zadanie 3),
    wyszukaj za pomocą lokalizatorów xpath wszystkie wymagane pola tekstowe
    oraz wypełnij je dowolnymi danymi:

        First Name
        Last Name
        Email
        Password

    Kliknij przycisk Register, który również wyszukaj przy pomocy lokalizatora By.xpath.
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInButton = driver.findElement(By.className("hide_xs"));
        signInButton.click();
        WebElement emailCreateAccount = driver.findElement(By.className("validate"));
        emailCreateAccount.sendKeys("abcd12345@gmail.com");
        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();

        Thread.sleep(3000);

        //fill in the form:
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Joe");
        driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Doe");
        //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd1234@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Doejoe4321");

        WebElement registerButton = driver.findElement(By.xpath("//button[@id='submitAccount']"));
        registerButton.click();

    }



}
