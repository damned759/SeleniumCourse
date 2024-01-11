package com.coderslab.prodcourse;

import org.testng.annotations.*;

public class LogInTest extends BaseTest {
    SignInPage signInPage = new SignInPage();
    HomePage homePage = new HomePage();

    @Test
    public void logIn(){
        homePage.clickSignInPageButton();
        signInPage.fillEmailField();
        signInPage.fillPasswordField();
        signInPage.clickSignIn();
        homePage.isUserLoggedIn();
    }
}
