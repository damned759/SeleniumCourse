package com.coderslab.prodcourse;



import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

import java.util.Random;

public class CreateAccountPage extends BasePage {

    //private By getEmailField = By.id("field-email");
    private By saveCreateAccountForm = By.cssSelector("button[class*='form-control-submit']");
    private By emailField = By.id("field-email");
    private By passwordField = By.id("field-password");
    private By mrOption = By.id("field-id_gender-1");
    private By mrsOption = By.id("field-id_gender-2");
    private By firstName = By.id("field-firstname");
    private By surname = By.id("field-lastname");
    private By customerDataPrivacy = By.name("customer_privacy");
    private By iAgreeTo = By.name("psgdpr");


    public void clickSaveCreateAccountForm(){
        click(saveCreateAccountForm);
    }

    public void fillEmail(){
        type(emailField, generateRandomEmail());
    }

    public void fillPassword(){
        type(passwordField, generateRandomPassword());
    }

    public void fillName(){
        type(firstName, generateRandomName());
    }

    public void fillSurname(){
        type(surname, generateRandomSurname());
    }

    private String generateRandomName(){
        return firstnames[new Random().nextInt(firstnames.length)];
    }

    private String generateRandomSurname(){
        return surnames[new Random().nextInt(surnames.length)];
    }

    private String generateRandomEmail(){
        return RandomStringUtils.random(10, true, true) + "@gmail.com";
    }

    private String generateRandomPassword(){
        return RandomStringUtils.random(15, true, true);
    }

    private String generateRandomGender(){
        return genders[new Random().nextInt(genders.length)];
    }

    public void clickGender(){
        String gender = generateRandomGender();
        if (gender.equals("Male")){
            click(mrOption);
        } else {
            click(mrsOption);
        }
    }

    public void checkedConsentFields(){
        click(customerDataPrivacy);
        click(iAgreeTo);
    }

    String genders[] = {"Male", "Female"};

    String firstnames[] = {"Kai", "Noah", "Luca", "Aria", "Evelyn","Max", "Alex", "Asher", "Jayden", "Remi",
            "Riley", "Theo", "Avery", "Aiden", "Ari","Cameron", "Brooklyn", "Kelcey", "Mackenzie", "Nova"};

    String surnames[] = {"Smith", "Jones", "Williams", "Taylor", "Davies","Brown", "Wilson", "Evans", "Thomas", "Johnson"};


}
