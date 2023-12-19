package TaskCheckConfig;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searches {

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
    public void searchZad1(){

        /*
        `Na stronie https://hotel-testlab.coderslab.pl/en/
        zidentyfikuj następująca pola/przyciski za pomocą lokalizatora By.id:

        (pole tekstowe) Hotel Location
        (przycisk) Search Now
        (pole tekstowe) Enter your e-mail (pole na dole stron)

        Po zidentyfikowaniu elementów wpisz następujące wartości w pola tekstowe:

        Hotel Location - Warsaw
        Enter your e-mail - test@test.com
        Użyj metody sendKeys np. findElement(By.id("q")).sendKeys("Coderslab");
        */

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocation = driver.findElement(By.id("hotel_location"));
        hotelLocation.sendKeys("Warsaw");
        WebElement searchSubmit = driver.findElement(By.id("search_room_submit"));
        //searchSubmit.click();
        WebElement emailNewslater = driver.findElement(By.id("newsletter-input"));
        emailNewslater.sendKeys("abcd1234@gmail.com");

    }

    @Test
    public void searchZad2(){

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

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocation = driver.findElement(By.name("hotel_location"));
        hotelLocation.sendKeys("Warsaw");
        WebElement submitNewsletter = driver.findElement(By.name("submitNewsletter"));
        //submitNewsletter.click();
        WebElement emailNewslater = driver.findElement(By.name("email"));
        emailNewslater.sendKeys("abcd1234@gmail.com");
        WebElement searchSubmit = driver.findElement(By.name("search_room_submit"));
        searchSubmit.click();
        //driver.findElement(By.name("search_room_submit")).submit();
        /*.submit: If this current element is a form, or an element within a form,
        then this will be submitted to the remote server. If this causes
        the current page to change, then this method will block until the new page is loaded.*/
    }

    @Test
    public void searchZad3(){

        /*
         Na stronie https://hotel-testlab.coderslab.pl//en/
         zidentyfikuj następująca pola/przyciski za pomocą lokalizatora By.className
                (przycisk) Sign In
                (pole tekstowe) Email address

        Po zidentyfikowaniu elementów kliknij przycisk Sign In i wpisz dowolny adres e-mail w pole Email address.

        Rozpocznij tworzenie nowego użytkownika za pomocą kliknięcia przycisku Create an account
        (nie musi być z wykorzystaniem lokalizatora By.className)
         */

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInButton = driver.findElement(By.className("hide_xs"));
        signInButton.click();
        WebElement emailCreateAccount = driver.findElement(By.className("validate"));
        emailCreateAccount.sendKeys("abcd1234@gmail.com");
        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();

    }

    @Test
    public void searchZad4(){

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInButton = driver.findElement(By.className("hide_xs"));
        signInButton.click();
        WebElement emailCreateAccount = driver.findElement(By.className("validate"));
        emailCreateAccount.sendKeys("abcde12345@gmail.com");
        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //fill in the form:
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Joe");
        driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Doe");
        //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd1234@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Doejoe4321");

        WebElement registerButton = driver.findElement(By.xpath("//button[@id='submitAccount']"));
        registerButton.click();

    }

    @Test
    public void searchZad5(){
        /*
        Po utworzeniu konta na stronie https://hotel-testlab.coderslab.pl/en
        zidentyfikuj następujące pola korzystając z lokalizatora By.cssSelector:
            MY PERSONAL INFORMATION
            MY ADDRESSES
         */

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInButton = driver.findElement(By.className("hide_xs"));
        signInButton.click();
        WebElement emailLogIn = driver.findElement(By.id("email"));
        emailLogIn.sendKeys("abcd1234@gmail.com");
        WebElement passwdLogIn = driver.findElement(By.id("passwd"));
        passwdLogIn.sendKeys("Doejoe4321");
        WebElement signIn = driver.findElement(By.id("SubmitLogin"));
        signIn.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.cssSelector("a[href$='addresses']"));
        WebElement info = driver.findElement(By.cssSelector("a[title$='Information']"));
        info.click();
    }


}
