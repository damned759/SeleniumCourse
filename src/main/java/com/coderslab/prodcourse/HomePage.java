package com.coderslab.prodcourse;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By signInPageButton =
            By.xpath("//span[text()='Sign in']");

    public SignInPage clickSignInPageButton(){
        click(signInPageButton);
        return new SignInPage();
    }



}
