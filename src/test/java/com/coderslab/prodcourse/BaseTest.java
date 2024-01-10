package com.coderslab.prodcourse;

import com.coderslab.prodcourse.BasePage;
import com.coderslab.prodcourse.HomePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS) //to make BeforeEach non-static

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private final String AUT_URL = "https://mystore-testlab.coderslab.pl/index.php";

    @BeforeAll
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterAll
    public void tearDown(){
        //driver.quit();
    }

    @BeforeEach
    public void loadAplication(){
        driver.get(AUT_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        homePage = new HomePage();
    }

    //@AfterEach
    //takeSchreenshots

}
