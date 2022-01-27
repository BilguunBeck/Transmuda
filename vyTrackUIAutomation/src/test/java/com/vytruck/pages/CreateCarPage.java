package com.vytruck.pages;

import com.github.javafaker.Faker;
import com.vytruck.utilities.BrowserUtility;
import com.vytruck.utilities.ConfigReader;
import com.vytruck.utilities.Driver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CreateCarPage {

    public CreateCarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //'GENERAL' INFO FROM CREATE CAR PAGE


    // License Plate

    @FindBy(css = "input[id^='custom_entity_type_LicensePlate-uid']")
    public WebElement licensePlate;


    /*
     * Tags:
     * Located 7 tags (checkboxes)
     * index 1 - Junior
     * index 2 - Senior
     * index 3 - Employee Car
     * index 4 - Purchased
     * index 5 - Compact
     * index 6 - Sedan
     * index 7 - Convertible
     */

    @FindBy(xpath = "//input[@name='custom_entity_type[Tags][]']")
    List<WebElement> tags;

    /**
     * selectTag()
     *
     * @param index
     */
    public void selectTag(int index) {
        tags.get(index).click();
    }


    // Input Driver's full name
    @FindBy(css = "input[id^=custom_entity_type_Driver-uid]")
    public WebElement driverInputBox;


    // Input current location of the car
    @FindBy(css = "input[id^=custom_entity_type_Location-uid]")
    public WebElement locationOfTheCar;


    /*
     * Input Chassis number
     * (A chassis number is an encoded identification
     * number developed to recognize motor vehicles manufactured since 1989. )
     */
    @FindBy(css = "input[id^=custom_entity_type_ChassisNumber-uid]")
    public WebElement chassisNumber;


    // Input Model Year of the vehicle
    @FindBy(css = "input[id^=custom_entity_type_ModelYear-uid]")
    public WebElement modelYear;


    // Input information from last Odometer checked last time
    @FindBy(css = "input[id^=custom_entity_type_LastOdometer-uid]")
    public WebElement lastOdometer;


    //Immatriculation Date is a date when vehicle was officially registered
    @FindBy(css = "input[id^=date_selector_custom_entity_type_ImmatriculationDate-uid]")
    public WebElement immatriculationDateInputBox;

    //Locators for the table & Dropdown of Calendar
    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    public WebElement monthCalendar;

    @FindBy(css = "select[class='ui-datepicker-year']")
    public WebElement yearCalendar;

    @FindBy(xpath = "//button[.='Today']")
    public WebElement todayBtnInCalendar;

    /**
     * selectImmatriculationDate()
     *
     * @param month (int)
     * @param date  (int)
     * @param year  (int)
     */
    public void selectImmatriculationDate(int month, int date, String year) {
        //Step1: click on Input field  : ' Immatriculation Date'
        immatriculationDateInputBox.click();
        monthCalendar.click();
        BrowserUtility.waitFor(2);

        //Step2: Select a month from dropdown
        Select select = new Select(monthCalendar);
        select.selectByIndex(month);//from 1~12

      //Step3:Select a year from dropdown
        yearCalendar.click();
        BrowserUtility.waitFor(2);
        Select select2 = new Select(yearCalendar);
        select2.selectByValue(year);

        //Step4: Select a date from table
        Driver.getDriver().findElement(By.xpath("//table//td[.='" + date + "']")).click();


    }

    // input field for first Contract date
    @FindBy(css = "input[id^=date_selector_custom_entity_type_FirstContractDate-uid]")
    public WebElement firstContractDateInputBox;


    /**
     * selectFirstContractDate ()
     *
     * @param month (int)
     * @param date  (int)
     * @param year  (int)
     */
    public void selectFirstContractDate(int month, int date, String year) {
        //Step1: click on Input field  :
        firstContractDateInputBox.click();

        //Step2: Select a month from dropdown
        monthCalendar.click();
        Select select = new Select(monthCalendar);
        select.selectByIndex(month);//from 1~12

        //Step3:Select a year from dropdown
        yearCalendar.click();
        Select select2 = new Select(yearCalendar);
        select2.selectByValue(year);

       //Step4: Select a date from table
        Driver.getDriver().findElement(By.xpath("//table//td[.='" + date + "']")).click();

    }


    // Catalog value of the car
    @FindBy(css = "input[id^=custom_entity_type_CatalogValue-uid]")
    public WebElement catalogValue;

    @FindBy(css = "input[id^=custom_entity_type_SeatsNumber-uid]")
    public WebElement seatsNumber;

    @FindBy(css = "input[id^=custom_entity_type_DoorsNumber-uid]")
    public WebElement doorsNumber;

    @FindBy(css = "input[id^=custom_entity_type_Color-uid]")
    public WebElement color;


    // Transmission Input Box
    @FindBy(xpath = "(//span[@class='select2-chosen'])[1]")
    public WebElement transmission;

    @FindBy(xpath = "(//div[@class='select2-result-label'])")
    public List<WebElement> manualOrAutomaticTransmission;


    /**
     * selectTransmission() : Manual or Automatic
     *
     * @param transmissionType
     */
    public void selectTransmission(String transmissionType) {
        transmission.click();
        for (WebElement webElement : manualOrAutomaticTransmission) {
            if (webElement.getText().equalsIgnoreCase(transmissionType)) {
                webElement.click();
            }
        }
    }


    @FindBy(css = "select[id^=custom_entity_type_FuelType-uid]")
    public WebElement fuelTypeInputBox;

    /**
     * selectFuelType()  :Gasoline ,Diesel, Electric,Hybrid
     *
     * @param value
     */
    public void selectFuelType(String value) {
        Select select = new Select(fuelTypeInputBox);
        select.selectByValue(value);
    }

    @FindBy(css = "input[id^=custom_entity_type_CO2Emissions-uid]")
    public WebElement cO2Emmissions;

    @FindBy(css = "input[id^=custom_entity_type_Horsepower-uid]")
    public WebElement horsepower;

    @FindBy(css = "input[id^=custom_entity_type_HorsepowerTaxation-uid]")
    public WebElement horsepowerTaxation;

    @FindBy(css = "input[id^=custom_entity_type_Power-uid]")
    public WebElement powerKW;

    @FindBy(css = "input[id^=custom_entity_type_Logo_file-uid]")
    public WebElement LogoUploadBox;

    @FindBy(xpath = "//span[.='Choose File']")
    public WebElement chooseFileBtn;


    /**
     * UploadLogo()
     * FilePath is saved in config.properties  (we don't use it  because file path is different for each computer
     */

    public void uploadLogo() {

        String filePath = "/Users/yevheniialuchynyn/Desktop/Lexus-Logo.jpeg";
        LogoUploadBox.sendKeys(filePath);

    }

    @FindBy(xpath = "//button[@type='submit'][@class='btn btn-success action-button']")
    public WebElement saveAndSubmitBtn;

    @FindBy(partialLinkText = "Cancel")
    public WebElement cancelBtn;


    @FindBy(xpath = "//div[normalize-space(.)='Entity saved'] ")
    public WebElement confirmMassage;

    /**
     * Method helps us to verify that confirmMSG is Displayed
     */
    public void verificationMessageIsDisplayed() {
        String actualConfirmMessage = confirmMassage.getText();
        String expectedConfirmMessage = "Entity saved";
       assertEquals(expectedConfirmMessage, actualConfirmMessage);
    }

    /**
     * Method to fill up car info
     */
    public void fillUpCreateCarForm() {

        Faker faker = new Faker();
        WebDriver driver = Driver.getDriver();
        licensePlate.sendKeys(faker.bothify("???####"));
        selectTag(2);
        driverInputBox.sendKeys(faker.name().firstName());
        locationOfTheCar.sendKeys(faker.address().cityName());
        chassisNumber.sendKeys(faker.numerify("#########"));
        modelYear.sendKeys(faker.numerify("201#"));
        lastOdometer.sendKeys(faker.numerify("1###"));
        selectImmatriculationDate(1, 1, "1996");
       JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1500)");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        selectFirstContractDate(7, 3, "2002");
        catalogValue.sendKeys(faker.numerify("###"));
        seatsNumber.sendKeys("5");
        doorsNumber.sendKeys("4");
        color.sendKeys(faker.color().name());
        selectTransmission("Automatic");
        selectFuelType("hybrid");
        cO2Emmissions.sendKeys(faker.numerify("###"));
        horsepower.sendKeys(faker.numerify("###"));
        horsepowerTaxation.sendKeys(faker.numerify("#"));
        powerKW.sendKeys(faker.numerify("###"));
        //  createCarPage.uploadLogo();
        saveAndSubmitBtn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        verificationMessageIsDisplayed();


    }

    /**
     * Method for verifying that 'Create Car' Btn is not Displayed
     */

    public boolean verifyCreateCarBtnIsNotDisplayed(){
        VehiclePage vehiclePage = new VehiclePage();
        boolean res = false;

        try{
        if(vehiclePage.createCarBtn.isDisplayed()){
            res = true;
        }}catch (NoSuchElementException e){
        }

        return  res;
    }


}
