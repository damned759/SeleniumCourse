package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KonfiguracjeZadanie2 {

    /*
    Przygotuj skrypt, który będzie przechodził pomiędzy
    kolejnymi stronami (nie klikamy żadnych elementów na tych stronach):
        https://coderslab.pl/pl
        https://mystore-testlab.coderslab.pl/index.php
        https://hotel-testlab.coderslab.pl/en/
     */


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://coderslab.pl/pl");
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.quit();
    }

}
