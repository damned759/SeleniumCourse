package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KonfiguracjeZadanie1 {

    //Wykorzystując kod z zajęć,
    // przygotuj test, który wyszuka inną frazę w wyszukiwarce Google.


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("sweet kittens");
        element.submit();
        driver.quit();
    }

}
