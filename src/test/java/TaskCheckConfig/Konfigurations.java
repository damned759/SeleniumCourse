package TaskCheckConfig;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Konfigurations {

    WebDriver driver;

    @BeforeEach
    public void driverSetup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void driverQuit(){
        driver.quit();
    }

    @Test
    public void konfigurationsZad1() {

        //Wykorzystując kod z zajęć,
        // przygotuj test, który wyszuka inną frazę w wyszukiwarce Google.


        driver.get("http://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("kittens");
        element.submit();

    }

    @Test
    public void konfigurationsZad2() {

        /*
        Przygotuj skrypt, który będzie przechodził pomiędzy
        kolejnymi stronami (nie klikamy żadnych elementów na tych stronach):
        https://coderslab.pl/pl
        https://mystore-testlab.coderslab.pl/index.php
        https://hotel-testlab.coderslab.pl/en/
        */

        driver.get("https://coderslab.pl/pl");
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.get("https://hotel-testlab.coderslab.pl/en/");
    }

    @Test
    public void konfigurationsZad3() {

        /*
        W tym zadaniu nauczymy się poruszać po stronach.
        Wykorzystamy do tego metody nawigacyjne:
           ⬅️ navigate.back()
           ➡️ navigate.forward()
           🔄 navigate.refresh()
        Pełna lista metod dostępna jest pod linkiem
        (https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.Navigation.html)
        Przykład kod do użycia w zadaniu:
           driver.get("https://www.google.com");
           driver.get("https://coderslab.pl/pl");
           driver.navigate().back();
           driver.navigate().forward();

        Przygotuj następującą sekwencję poruszania się
        po stronach z wykorzystaniem powyższych metod:

        Wejdź na stronę: https://www.google.com
        Wejdź na stronę: https://coderslab.pl/pl
        Cofnij się do strony: https://www.google.com
        Wejdź na stronę: https://mystore-testlab.coderslab.pl/index.php
        Cofnij się do strony: https://www.google.com
        Powróć do strony: https://mystore-testlab.coderslab.pl/index.php
        Odśwież stronę: https://mystore-testlab.coderslab.pl/index.php
        */

        driver.get("http://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();
        driver.get("https://coderslab.pl/pl");
        driver.navigate().back(); //to google
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.navigate().back(); //to google
        driver.navigate().forward(); //to mystore
        driver.navigate().refresh();

    }

}
