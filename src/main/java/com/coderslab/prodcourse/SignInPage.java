package com.coderslab.prodcourse;

import org.openqa.selenium.By;

public class SignInPage extends BasePage {

    private By createAccountButton = By.linkText("No account? Create one here");
    private By emailField = By.xpath("//*[@id=\'field-email\']");
    private By passwordField = By.xpath("//*[@id=\'field-password\']");
    private By signInButton = By.id("submit-login");


    public CreateAccountPage clickCreateAccountButton(){
        click(createAccountButton);
        return new CreateAccountPage();
    }
    public void fillEmailField(){
        type(emailField, "kjOCFs6wZD@gmail.com");
    }
    public void fillPasswordField(){
        type(passwordField, "vrA8g3SIpEa6lAw");
    }
    public void clickSignIn(){
        click(signInButton);
    }

}
