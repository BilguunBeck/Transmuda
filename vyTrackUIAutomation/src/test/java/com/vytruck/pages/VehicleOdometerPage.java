package com.vytruck.pages;

import com.github.javafaker.Faker;
import com.vytruck.utilities.BrowserUtility;
import com.vytruck.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VehicleOdometerPage {

    // locate "Fleet" module
    @FindBy(xpath = "//a/span[contains(text(), 'Fleet')]")
    public WebElement fleetModule;

    // locate "Vehicle Odometer" option
    @FindBy(xpath = "//span[@class='title title-level-2' and text()='Vehicle Odometer']")
    public WebElement selectVehicleOdo;

    // locate "Create Vehicle Odometer" button
    @FindBy(xpath="//div[@class='pull-right title-buttons-container']")
    public WebElement createOdoButton;

    // locate "Vehicles Odometers" title
    @FindBy(xpath = "//div//h1[.='Vehicles Odometers']")
    public WebElement titleVehicleOdometer;
    // //h1[@class='oro-subtitle' and text()='Vehicles Odometers']
    // div[class='oro-subtitle']>h1
    // [class='oro-subtitle']>h1[.='Vehicles Odometers']
    //div//h1[.='Vehicles Odometers']

    // locate "You do not have permission to perform this action." message
    @FindBy(xpath = "//*[text()='You do not have permission to perform this action.']")
    public WebElement noPermissionMessage;

    // constructor
    public VehicleOdometerPage(){
        PageFactory.initElements(Driver.getDriver() , this );
    }


    // hover on Fleet then click "Vehicles Odometer"
    public void selectVehiclesOdometer(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetModule).perform();
        BrowserUtility.waitFor(1);

        selectVehicleOdo.click();
    }


    // click "Create Vehicle Odometer"
    public void createVehicleOdo(){
        createOdoButton.click();
    }

    // clarify if user is on the "Vehicles Odometers" page
    /*
    public static boolean isAt(){
        return Driver.getDriver().getTitle().equals("Vehicles Odometers");
    }
     */
    public boolean titleDisplay(){
        return titleVehicleOdometer.isDisplayed();
    }










}
