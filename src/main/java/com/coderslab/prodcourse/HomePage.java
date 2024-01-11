package com.coderslab.prodcourse;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BasePage {

    private By signInPageButton = By.xpath("//span[text()='Sign in']");
    private By signOutPageButton = By.xpath("//*[@id=\'_desktop_user_info\']/div/a[1]");
    private By addressesButton = By.xpath("//*[@id=\'footer_account_list\']/li[4]/a");
    private By loggedUsername = By.xpath("//a[@class='account']");


    public SignInPage clickSignInPageButton(){
        click(signInPageButton);
        return new SignInPage();
    }

    public void clickSignOutPageButton(){
        click(signOutPageButton);
    }

    public void clickAddressesButton(){
        click(addressesButton);
    }

    public void checkLoggedUsername(){
        getText(loggedUsername);
    }

    public void isUserLoggedOut(){
        Assert.assertEquals(getText(signInPageButton), "\uE7FF Sign in",
                "USER LOGGED IN!");
    }

    public void isUserLoggedIn(){
        Assert.assertEquals(getText(signOutPageButton), "\uE7FF Sign out",
                "USER NOT LOGGED IN!");
    }



}
