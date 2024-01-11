import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestTest {

    private WebDriver driver;

    @Test
    public void testTest(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.findElement(By.xpath("//span[text()='Sign in']")).click();
        driver.findElement(By.id("field-email")).sendKeys("damned759@gmail.com");
        driver.findElement(By.id("field-password")).sendKeys("damned759");
        driver.findElement(By.id("submit-login")).click();
        driver.findElement(By.xpath("//*[@id=\'footer_account_list\']/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id='content']/div[3]/a")).click();


    }
}
