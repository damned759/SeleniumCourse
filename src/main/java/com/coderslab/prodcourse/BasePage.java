package com.coderslab.prodcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    //function:
    //to have common methods for all
    //of the page object classes

    public static WebDriver driver;
    public void setDriver(WebDriver driver){
        BasePage.driver = driver;
    }

    protected String currentURL (){
        String URL = driver.getCurrentUrl();
        return URL;
    }

    protected WebElement find(By locator){
        return driver.findElement(locator);
    }

    protected void click(By locator){
        find(locator).click();
    }

    protected void type(By locator, String text){
        find(locator).sendKeys(text);
    }

    protected String getText(By locator){
        String text = find(locator).getText();
        System.out.println("Text: " + text);
        return text;
    }

    /*
    protected void input(By locator){
        find(locator).sendKeys();
    }
     */










}











































































