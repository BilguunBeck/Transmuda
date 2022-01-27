package com.vytruck.pages;

import com.github.javafaker.Faker;
import com.vytruck.utilities.BrowserUtility;
import com.vytruck.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateVehicleOdometerPage {
    Faker faker = new Faker();

    // locate "Odometer Value" input box
    @FindBy(xpath = "//input[@data-name='field__odometer-value']")
    public WebElement odoInputBox;

    // locate "Date" input box
    @FindBy(xpath = "//input[@class='datepicker-input hasDatepicker']")
    public WebElement dateInputBox;

    // locate "Driver" input box
    @FindBy(xpath = "//input[@data-name='field__driver']")
    public WebElement driverInputBox;

    // locate "Unit" input box
    @FindBy(xpath = "//span[@class='select2-chosen']")
    public WebElement unitInputBox;

//    // locate "Model" input box
//    @FindBy(xpath = "//div[@id='s2id_custom_entity_type_Model-uid-615a906e90910']")
//    public WebElement modelInputBox;

    // locate "License Plate" - add button
    @FindBy(xpath = "//fieldset//button[@type='button']")
    public WebElement addLicensePlateButton;

    // locate "License Plate" - first checkbox
    @FindBy(xpath = "(//tbody//input[@type='checkbox'])[1]")
    public WebElement firstCheckboxLicensePlate;

    // locate "License Plate" - select button
    @FindBy(xpath = "//button[text()='Select']")
    public WebElement selectLicensePlateButton;


    // locate "Cancel" button
    @FindBy(linkText = "Cancel")
    public WebElement cancelButton;

    // locate save and closed button
    @FindBy(xpath = "//button[normalize-space(text())='Save and Close']")
    public WebElement saveAndCloseButton;

    // locate confirmation message
    @FindBy(xpath = "//div[@class='message' and text()='Entity saved']")
    public WebElement savedMessage;


    // constructor
    public CreateVehicleOdometerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public void enterOdoValue() {
        odoInputBox.sendKeys("12345");
    }

    public void enterDate() {
        dateInputBox.sendKeys("Dec 14, 2021", Keys.ESCAPE);
        BrowserUtility.waitFor(2); // wait for close calendar animation


    }

    public void enterDriver(){
        driverInputBox.sendKeys(faker.name().fullName());
    }

//    public void enterUnit() {
//        unitInputBox.sendKeys("miles");
//    }

    // public void enteredModel => button doesn't work

    public void selectFirstLicencePlate() {
        addLicensePlateButton.click();
        BrowserUtility.waitFor(3); // wait for plate selection popup
        firstCheckboxLicensePlate.click();
        selectLicensePlateButton.click();
    }

    public void saveAndCloseButton() {
        saveAndCloseButton.click();
    }

//    public boolean savedMessageConfirmation() {
//        System.out.println("Entity save message isDisplayed(): " + savedMessage.isDisplayed());
//        return savedMessage.isDisplayed();
//    }


}
