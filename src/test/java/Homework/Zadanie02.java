package Homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Zadanie02 {

        @Test
        public void openMozillaFirefox() throws InterruptedException {
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.google.com");
            Thread.sleep(1000);
            driver.quit();
        }


        @Test
        public void openEdge() throws InterruptedException {
            WebDriver driver = new EdgeDriver();
            driver.get("https://www.google.com");
            Thread.sleep(1000);
            driver.quit();
        }


        @Test
        public void openChrome() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
            Thread.sleep(1000);
            driver.quit();
        }
}
