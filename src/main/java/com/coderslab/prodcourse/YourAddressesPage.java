package com.coderslab.prodcourse;

import org.openqa.selenium.By;

public class YourAddressesPage extends BasePage {

    private By createNewAddressButton =
            By.xpath("//*[@id=\'content\']/div[2]/a");


    public void clickNewAddressButton(){
        click(createNewAddressButton);
    }
}
