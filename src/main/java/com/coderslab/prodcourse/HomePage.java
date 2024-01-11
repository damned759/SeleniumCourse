package com.coderslab.prodcourse;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By signInPageButton =
            By.xpath("//span[text()='Sign in']");

    private By signOutPageButton =
            By.xpath("//*[@id=\'_desktop_user_info\']/div/a[1]");

    public SignInPage clickSignInPageButton(){
        click(signInPageButton);
        return new SignInPage();
    }

    public void clickSignOutPageButton(){
        click(signOutPageButton);
    }



}
