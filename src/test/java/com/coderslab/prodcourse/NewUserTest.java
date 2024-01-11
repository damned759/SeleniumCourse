package com.coderslab.prodcourse;

import org.testng.annotations.*;

public class NewUserTest extends BaseTest {
    CreateAccountPage createAccountPage = new CreateAccountPage();
    SignInPage signInPage = new SignInPage();
    YourAddressesPage yourAddressesPage = new YourAddressesPage();
    NewAddressPage newAddressPage = new NewAddressPage();


    //ZADANIEDOMOWE6
    @Test(invocationCount = 1)
    public void testCreateNewAccount(){
        homePage.clickSignInPageButton();
        signInPage.clickCreateAccountButton();
        createAccountPage.clickGender();
        createAccountPage.fillName();
        createAccountPage.fillSurname();
        createAccountPage.fillEmail();
        createAccountPage.fillPassword();
        createAccountPage.checkedConsentFields();
        createAccountPage.clickSaveCreateAccountForm();
        homePage.isUserLoggedIn();
        homePage.checkLoggedUsername();
        homePage.clickAddressesButton();
        yourAddressesPage.clickNewAddressButton();
        newAddressPage.fillStreetField();
        newAddressPage.fillCityField();
        newAddressPage.fillZipCodeField();
        newAddressPage.clickSaveButton();
        homePage.clickSignOutPageButton();
    }
}
