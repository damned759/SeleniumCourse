package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchZadanie2 {

    /*
    Na stronie https://hotel-testlab.coderslab.pl/en/
    zidentyfikuj następująca pola/przyciski za pomocą lokalizatora By.name:
        (pole tekstowe) Hotel Location
        (przycisk) Search Now
        (pole tekstowe) Enter your e-mail (pole na dole stron)
        (przycisk) Subscribe

    Po zidentyfikowaniu elementów wpisz następujące wartości w pola tekstowe:
        Hotel Location - Warsaw
        Enter your e-mail - test@test.com
        Dodatkowo kliknij przycisk Serach Now, używając metody Submit np. findElement(By.name("q")).submit();
     */

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement hotelLocation = driver.findElement(By.name("hotel_location"));
        hotelLocation.sendKeys("Warsaw");

        WebElement submitNewsletter = driver.findElement(By.name("submitNewsletter"));
        //submitNewsletter.click();

        WebElement emailNewslater = driver.findElement(By.name("email"));
        emailNewslater.sendKeys("abcd1234@gmail.com");

        //WebElement searchSubmit = driver.findElement(By.name("search_room_submit"));
        //searchSubmit.click();

        driver.findElement(By.name("search_room_submit")).submit();
        /*If this current element is a form, or an element within a form,
        then this will be submitted to the remote server. If this causes
        the current page to change, then this method will block until the new page is loaded.*/

    }


}
