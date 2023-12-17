package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchZadanie3 {

    /*
    Na stronie https://hotel-testlab.coderslab.pl//en/
    zidentyfikuj następująca pola/przyciski za pomocą lokalizatora By.className
        (przycisk) Sign In
        (pole tekstowe) Email address

    Po zidentyfikowaniu elementów kliknij przycisk Sign In i wpisz dowolny adres e-mail w pole Email address.

    Rozpocznij tworzenie nowego użytkownika za pomocą kliknięcia przycisku Create an account
    (nie musi być z wykorzystaniem lokalizatora By.className)
     */

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement signInButton = driver.findElement(By.className("hide_xs"));
        signInButton.click();

        WebElement emailCreateAccount = driver.findElement(By.className("validate"));
        emailCreateAccount.sendKeys("abcd1234@gmail.com");

        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();


    }


}
