package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchZadanie1 {

    /*
    Na stronie https://hotel-testlab.coderslab.pl/en/
    zidentyfikuj następująca pola/przyciski za pomocą lokalizatora By.id:

        (pole tekstowe) Hotel Location
        (przycisk) Search Now
        (pole tekstowe) Enter your e-mail (pole na dole stron)

    Po zidentyfikowaniu elementów wpisz następujące wartości w pola tekstowe:

        Hotel Location - Warsaw
        Enter your e-mail - test@test.com
        Użyj metody sendKeys np. findElement(By.id("q")).sendKeys("Coderslab");
     */

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement hotelLocation = driver.findElement(By.id("hotel_location"));
        hotelLocation.sendKeys("Warsaw");

        WebElement searchSubmit = driver.findElement(By.id("search_room_submit"));
        //searchSubmit.click();

        WebElement emailNewslater = driver.findElement(By.id("newsletter-input"));
        emailNewslater.sendKeys("abcd1234@gmail.com");

    }


}
