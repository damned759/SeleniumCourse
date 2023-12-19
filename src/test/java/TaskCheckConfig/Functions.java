package TaskCheckConfig;

import io.opentelemetry.sdk.common.CompletableResultCode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functions {

    WebDriver driver;
    private Assertions Assert;

    @BeforeEach
    public void driverSetup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void driverQuit(){
        driver.quit();
    }

    public void register() throws InterruptedException {
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInButton = driver.findElement(By.className("hide_xs"));
        signInButton.click();
        WebElement emailCreateAccount = driver.findElement(By.className("validate"));
        emailCreateAccount.sendKeys("cba111@gmail.com");
        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();
        Thread.sleep(3000);
    }


    @Test
    public void functionsGetText() {

        driver.get("https://pl.wikipedia.org/");
        WebElement element = driver.findElement(By.id("main-page-column1"));
        System.out.println(element.getText());
        //Funkcja getText() zwraca wartość atrybutu innerText elementu.

    }

    @Test
    public void functionsGetAttribute() {

        driver.get("https://pl.wikipedia.org/");
        String atrybut = driver.findElement(By.id("main-page-content")).getAttribute("class");
        System.out.println(atrybut);
        //Funkcja getAttribute() zwraca wartość podanego atrybutu elementu (here class)

    }

    @Test
    public void functionsGetTagName() {

        driver.get("https://pl.wikipedia.org/");
        String tag = driver.findElement(By.id("main-page-content")).getTagName();
        System.out.println(tag);
        //Funkcja getTagName() zwraca nazwę znacznika podanego elementu.

    }

    @Test
    public void functionsIsDisplayed() {

        driver.get("https://pl.wikipedia.org/");
        WebElement displayed = driver.findElement(By.name("search"));
        //is the element displayed/VISIBLE on the page?
        if(displayed.isDisplayed()) {
            displayed.sendKeys("Selenium");
            System.out.println("Element is displayed.");
            displayed.submit();
        }else {
            //Assert.fail();
            System.out.println("Element is not displayed.");
        }


    }

    @Test
    public void functionsIsEnabled() {

        driver.get("https://pl.wikipedia.org/");
        WebElement enabled = driver.findElement(By.name("search"));
        //is the element enabled/ on the page?
        if(enabled.isEnabled()) {
            System.out.println("Element is enabled.");
            enabled.sendKeys("Selenium");
            enabled.submit();
        }else 	{
            //Assert.fail();
            System.out.println("Element is not enabled.");
        }

    }


    @Test
    public void functionsIsSelected() throws InterruptedException {

        register();

        WebElement checkbox = driver.findElement(By.name("newsletter"));
        boolean terms = driver.findElement(By.name("newsletter")).isSelected();
        System.out.println("Checkbox is selected: " + terms);

        if (terms == false){
            System.out.println("Selecting the checkbox------------->");
            checkbox.click();

            Thread.sleep(1000);

            boolean termsrecheck = driver.findElement(By.name("newsletter")).isSelected();
            System.out.println("Checkbox is selected: " + termsrecheck);
        }



    }


    @Test
    public void functionsZad1() throws InterruptedException {


        register();

        WebElement firstName = driver.findElement(By.id("customer_firstname"));
        WebElement lastName = driver.findElement(By.id("customer_lastname"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        WebElement submit = driver.findElement(By.id("submitAccount"));

        if(firstName.isDisplayed()) {
            System.out.print("'First name' field: ");
            System.out.println("element is displayed.");
            System.out.print("Enter name---------> ");
            firstName.sendKeys("Joe");
            System.out.println("name entered.");
        }else {
            System.out.print("'First name' field: ");
            System.out.println("element is not displayed.");
        }

        if(lastName.isDisplayed()) {
            System.out.print("'Last name' field: ");
            System.out.println("element is displayed.");
            System.out.print("Enter last name---------> ");
            lastName.sendKeys("Doe");
            System.out.println("name entered.");
        }else {
            System.out.print("'Last name' field: ");
            System.out.println("element is not displayed.");
        }

        if(email.isDisplayed()) {
            System.out.print("'Email' field: ");
            System.out.println("element is displayed.");
        }else {
            System.out.print("'Email' field: ");
            System.out.println("element is not displayed.");
        }

        String value = email.getAttribute("value");
        if (value.length() > 0){
            System.out.println("'Email' field is already filled.");
        }else{
            System.out.print("'Email' field: ");
            System.out.println("element is displayed.");
            System.out.print("Enter email---------> ");
            email.sendKeys("cba111@gmail.com");
            System.out.println("email entered.");
        }

        if(password.isEnabled()) {
            System.out.print("'Password' field: ");
            System.out.println("element is enabled.");
            System.out.print("Enter password---------> ");
            password.sendKeys("Abcd1234%");
            System.out.println("password entered.");
        }else {
            System.out.print("'Password' field: ");
            System.out.println("element is not denabled.");
        }

        if(submit.isDisplayed()) {
            System.out.println("'Register' button: visible.");
            System.out.println("Register the user -----------> ");
            //submit.click();
        }else {
            System.out.println("'Register' button: not visible");
        }


        /*
        Będąc na stronie rejestracji nowego użytkownika https://hotel-testlab.coderslab.pl/en/,
        wyszukaj wszystkie pola oraz zweryfikuj za pomocą odpowiednich metod czy są one widoczne,
        aby wpisać tam wartości.
            First Name
            Last Name
            Email
            Password
        Potwierdź rejestrację nowego użytkownika
        (wcześniej sprawdzając, czy przycisk jest widoczny).
         */
    }
}
