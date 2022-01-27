package com.vytruck.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllVehicleModelsPage {

    // Find "Fleet" DropDown List
    @FindBy(xpath = "//span[contains(text(),'Fleet')][@class='title title-level-1']")
    public WebElement fleet;

    // Find "Vehicle Model" option  from the "Fleet" DropDown List
    @FindBy(xpath = "//span[text()='Vehicles Model']")
    public WebElement vehicleModels;

}
