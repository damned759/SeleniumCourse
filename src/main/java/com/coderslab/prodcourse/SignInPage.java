package com.coderslab.prodcourse;

import org.openqa.selenium.By;

public class SignInPage extends BasePage {

    private By createAccountButton =
            By.linkText("No account? Create one here");

    public CreateAccountPage clickCreateAccountButton(){
        click(createAccountButton);
        return new CreateAccountPage();
    }


}
