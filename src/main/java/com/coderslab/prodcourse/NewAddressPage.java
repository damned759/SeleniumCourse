package com.coderslab.prodcourse;

import org.openqa.selenium.By;

import java.util.Random;

public class NewAddressPage extends BasePage{

    private By streetField = By.id("field-address1");
    private By cityField = By.id("field-city");
    private By zipCodeField = By.id("field-postcode");
    private By saveButton = By.className("form-control-submit");


    public void fillStreetField(){
        type(streetField, generateRandomStreet());
    }
    public void fillCityField(){
        type(cityField, generateRandomCity());
    }
    public void fillZipCodeField(){
        type(zipCodeField, generateRandomZipCode());
    }
    public void clickSaveButton(){
        click(saveButton);
    }



    private String generateRandomStreet(){
        return streets[new Random().nextInt(streets.length)];
    }

    private String generateRandomCity(){
        return cities[new Random().nextInt(cities.length)];
    }

    private String generateRandomZipCode(){
        return zipcodes[new Random().nextInt(zipcodes.length)];
    }

    String streets[] = {"High Street", "Station Road", "Main Street", "Park Road", "Church Road",
                        "London Road", "Victoria Road", "Green Lane", "Park Avenue"};
    String cities[] = {"Lichfield", "Lincoln", "Liverpool", "London", "Oxford",
                        "Norwich", "Newcastle", "Milton", "Manchester", "Nottingham"};
    String zipcodes[] = {"A31", "A32", "A33", "A34", "A35", "A36", "A37", "A38"};
}
