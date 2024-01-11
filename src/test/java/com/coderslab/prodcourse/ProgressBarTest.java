package com.coderslab.prodcourse;

//import org.junit.jupiter.api.Test;
import org.testng.annotations.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgressBarTest extends BaseTest {
    CreateAccountPage createAccountPage = new CreateAccountPage();
    SignInPage signInPage = new SignInPage();


    //ZADANIEDOMOWE6
    @Test(invocationCount = 2)
    public void testCreateNewAccountZadanie6(){
        homePage.clickSignInPageButton();
        signInPage.clickCreateAccountButton();
        createAccountPage.clickGender();
        createAccountPage.fillName();
        createAccountPage.fillSurname();
        createAccountPage.fillEmail();
        createAccountPage.fillPassword();
        createAccountPage.checkedConsentFields();
        createAccountPage.clickSaveCreateAccountForm();
        homePage.clickSignOutPageButton();
    }

}
