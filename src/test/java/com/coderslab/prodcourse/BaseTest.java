package com.coderslab.prodcourse;

import org.junit.jupiter.api.TestInstance;
import org.testng.annotations.*;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS) //to make BeforeEach non-static

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private final String AUT_URL = "https://mystore-testlab.coderslab.pl/index.php";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown(){
        //driver.quit();
    }

    @BeforeMethod
    public void loadAplication(){
        driver.get(AUT_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        homePage = new HomePage();
    }

    //@AfterEach
    //takeSchreenshots

}
