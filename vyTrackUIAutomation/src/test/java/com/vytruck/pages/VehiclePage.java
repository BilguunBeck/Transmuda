package com.vytruck.pages;

import com.vytruck.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclePage {

    /**
     * Fleet module
     */
    @FindBy(xpath = "//span[normalize-space(.)='Fleet']")
    public WebElement fleetModule;


    /**
     * Vehicles from FleetDropdown
     */


    @FindBy(xpath = "(//li[@class='dropdown-menu-single-item first'])[2]")
    public WebElement vehiclesForManagers;

    @FindBy(xpath = "(//li[@class='dropdown-menu-single-item first'])[1]")
    public WebElement vehiclesForDrivers;


    /**
     * 'Create Car' Button at Vehicles Page
     */
    @FindBy(partialLinkText = "Create Car")
    public WebElement createCarBtn;



    public VehiclePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
