package com.vytruck.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import com.github.javafaker.DateAndTime;
import com.github.javafaker.Faker;
import com.vytruck.utilities.BrowserUtility;
import com.vytruck.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateContractPage {


    @FindBy(xpath = "//div/a[normalize-space(.)='Create Vehicle Contract']")
    public WebElement createContractBtn;


    @FindBy(xpath = "(//a/span[@class='select2-arrow'])[1]")
    public WebElement chooseValue;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[1]/div")
    public WebElement leasing;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[2]/div")
    public WebElement personalLoan;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[3]/div")
    public WebElement creditCard;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[4]/div")
    public WebElement cash;

    @FindBy(xpath = "//*[@id=\"s2id_custom_entity_type_Type-uid-615cb3b2a4b02\"]/a/abbr")
    public WebElement XBtn;


    @FindBy(xpath = "//input[@name='custom_entity_type[Responsible]']")
    public WebElement responsibleBtn;

    @FindBy(xpath = "//input[@name='custom_entity_type[ActivationCost]']")
    public WebElement activationCost;

    @FindBy(xpath = "//input[@name='custom_entity_type[RecurringCostAmount]']")
    public WebElement runningCost;


    @FindBy(xpath = "(//a/span[@class='select2-arrow'])[2]")
    public WebElement runnigCostOptions;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[1]/div")
    public WebElement no;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[2]/div")
    public WebElement daily;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[3]/div")
    public WebElement  weekly;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[4]/div")
    public WebElement monthly ;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[5]/div")
    public WebElement yearly;


    @FindBy(xpath = "//input[@name='custom_entity_type[OdometerDetails]']")
    public WebElement odometer;


    @FindBy(xpath = "//input[@name='custom_entity_type[Vendor]']")
    public WebElement vendor;


    @FindBy(xpath = "//input[@name='custom_entity_type[Driver]']")
    public WebElement driver;



    @FindBy(xpath = "//input[@name='custom_entity_type[ContractReference]']")
    public WebElement contractReference;


    @FindBy(xpath = "//textarea")
    public WebElement termsAndConditions;




    @FindBy(xpath = "(//a/span[@class='select2-arrow'])[3]")
    public WebElement activitySelcetion;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[1]/div")
    public WebElement active;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[2]/div")
    public WebElement Archived;




    @FindBy(xpath = " (//i[@class='fa-plus'])[1]")
    public WebElement addVehicleModel;


    @FindBy(xpath = " //tr[@class='grid-row']")
    public WebElement carByName;

    @FindBy(xpath = "  (//td/input[@type='checkbox'])[1]")
    public WebElement selectXF2021;

    @FindBy(xpath = "  (//td/input[@type='checkbox'])[2]")
    public WebElement 	selectCorolla;

    @FindBy(xpath = "  (//td/input[@type='checkbox'])[3]")
    public WebElement selectModelX;

    @FindBy(xpath = "  (//td/input[@type='checkbox'])[4]")
    public WebElement selectm3;


    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement selectBtn;



    @FindBy(xpath = "//input[@type='radio']")
    public WebElement radioBtn;




    @FindBy(xpath = " (//i[@class='fa-plus'])[2]")
    public WebElement addCarMake;

    @FindBy(xpath = " //tr[@class='grid-row']")
    public WebElement carMake;

    @FindBy(xpath = "  (//td/input[@type='checkbox'])[1]")
    public WebElement selectDAF;

    @FindBy(xpath = "  (//td/input[@type='checkbox'])[2]")
    public WebElement 	selectToyota;

    @FindBy(xpath = "  (//td/input[@type='checkbox'])[3]")
    public WebElement selectTesla;

    @FindBy(xpath = "  (//td/input[@type='checkbox'])[4]")
    public WebElement selectMazda;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement selectBtn2;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement radioBtn2;



    @FindBy(xpath = "//button[@class='btn btn-success action-button']")
    public WebElement saveChanges;


    @FindBy(xpath = "    //div[@class='flash-messages-holder']")
    public WebElement confirmationMsg;




    @FindBy(xpath = " (//input[@placeholder='Choose a date'])[1]")
    public WebElement invoiceDate;


    @FindBy(xpath = " (//input[@placeholder='Choose a date'])[2]")
    public WebElement  contractStartDate;


    @FindBy(xpath = " (//input[@placeholder='Choose a date'])[3]")
    public WebElement  contractExpirationDate;



    @FindBy(xpath = " (//select[@class='ui-datepicker-year'])")
    public WebElement yearSelect;


    @FindBy(xpath = " //select[@class='ui-datepicker-month']")
    public WebElement monthSelect;


    @FindBy(xpath = " //table//tbody/tr/td")
    public WebElement daysSelect;





    //Constructor
    public CreateContractPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }





    public  void StartContract(){
        createContractBtn.click();
        chooseValue.click();
        BrowserUtility.waitFor(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(personalLoan).pause(1000).moveToElement(creditCard).pause(1000)
                .moveToElement(cash).pause(1000).moveToElement(leasing).click().perform();

        BrowserUtility.waitFor(2);
    }


    public void InsertData(){
        Faker faker = new Faker();
        responsibleBtn.click();
        responsibleBtn.sendKeys(faker.name().fullName());
        BrowserUtility.waitFor(1);
        activationCost.click();
        activationCost.sendKeys(faker.number().digits(3));
        BrowserUtility.waitFor(1);
        runningCost.click();
        runningCost.sendKeys(faker.numerify("##"));
        BrowserUtility.waitFor(1);
        runnigCostOptions.click();
        BrowserUtility.waitFor(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(weekly).pause(1000).moveToElement(daily).pause(1000)
                .moveToElement(monthly).pause(1000).moveToElement(yearly).pause(1000)
                .moveToElement(no).click().perform();
        BrowserUtility.waitFor(1);
        odometer.click();
        odometer.sendKeys(faker.number().digits(5));
        BrowserUtility.waitFor(1);
        vendor.click();
        vendor.sendKeys(faker.company().name());
        BrowserUtility.waitFor(1);
        driver.click();
        driver.sendKeys(faker.name().fullName());
        BrowserUtility.waitFor(1);
        contractReference.click();
        contractReference.sendKeys(faker.number().digits(5));
        BrowserUtility.waitFor(1);
        termsAndConditions.click();
        termsAndConditions.sendKeys(faker.shakespeare().kingRichardIIIQuote());
        BrowserUtility.waitFor(1);

        activitySelcetion.click();
        actions.moveToElement(Archived).pause(1000).moveToElement(active).pause(1000).click().perform();
    }


    public void addingCar(String name){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement( addVehicleModel).click().perform();
        BrowserUtility.waitFor(2);
        if (carByName.getText().equalsIgnoreCase(name)) {
            if (name.equalsIgnoreCase("XF 2021"))
                selectXF2021.click();

            selectBtn.click();
            radioBtn.click();
            BrowserUtility.waitFor(2);
        } else if (name.equalsIgnoreCase("corolla")) {
            selectCorolla.click();

            selectBtn.click();
            radioBtn.click();
            BrowserUtility.waitFor(2);
        } else if (name.equalsIgnoreCase("Model-X")) {
            selectModelX.click();

            selectBtn.click();
            radioBtn.click();
            BrowserUtility.waitFor(2);
        } else if (name.equalsIgnoreCase("m3")) {
            selectm3.click();

            selectBtn.click();
            radioBtn.click();
            BrowserUtility.waitFor(2);
        } else {
            System.out.println("We do not have such vehicle");

            selectBtn.click();
            radioBtn.click();
            BrowserUtility.waitFor(2);
        }
    }



    public void choosingCarMake(String name){

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement( addCarMake).click().perform();
        BrowserUtility.waitFor(2);
        if (carByName.getText().equalsIgnoreCase(name)) {
            if (name.equalsIgnoreCase("DAF"))
                selectDAF.click();
                selectBtn2.click();
                radioBtn2.click();
            BrowserUtility.waitFor(2);
        } else if (name.equalsIgnoreCase("Toyota")) {
            selectToyota.click();
            selectBtn2.click();
            radioBtn2.click();
            BrowserUtility.waitFor(2);
            } else if (name.equalsIgnoreCase("Tesla")) {
                selectTesla.click();
                selectBtn2.click();
                radioBtn2.click();
            BrowserUtility.waitFor(2);
        } else if (name.equalsIgnoreCase("mazda")) {
            selectMazda.click();
            selectBtn2.click();
            radioBtn2.click();
            BrowserUtility.waitFor(2);
        } else {
            System.out.println("We do not have this Model try some other location");
            selectBtn2.click();
            radioBtn2.click();
            BrowserUtility.waitFor(2);
            }


    }



    public boolean saveAndConfirm(){
        saveChanges.click();
        boolean res = false;

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),2);
      try {
          wait.until(visibilityOf(confirmationMsg));
          res = true;
          System.out.print("confirming with you that the following " + confirmationMsg.getText());
      }catch (TimeoutException e){
          System.out.println("e.getMessage(): " + e.getMessage());

      }
        return res;
    }



    public void invoiceSignDate(int month, int date, String year) {
        invoiceDate.click();

        yearSelect.click();
        Select select2 = new Select(yearSelect);
        select2.selectByValue(year);

        monthSelect.click();
        Select select = new Select(monthSelect);
        Faker faker = new Faker();
        try {
            select.selectByIndex(month);//from 1~12
            month = faker.number().numberBetween(1, 12);
        } catch (NoSuchElementException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }


        try {
            if (date>0 || date<=31) {
                Driver.getDriver().findElement(By.xpath("//table//td[.='" + date + "']")).click();
            }
        }catch (NoSuchElementException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }



    public void startFrom(int month, int date, String year) {
        contractStartDate.click();

        yearSelect.click();
        Select select2 = new Select(yearSelect);
        select2.selectByValue(year);


        monthSelect.click();
        Select select = new Select(monthSelect);
        Faker faker = new Faker();
        try {
            select.selectByIndex(month);//from 1~12
            month = faker.number().numberBetween(1, 12);

        } catch (TimeoutException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }


        try {
            if (date>0 || date<=31) {
                Driver.getDriver().findElement(By.xpath("//table//td[.='" + date + "']")).click();
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }



    public void endsOnDate(int month, int date, String year) {
        contractExpirationDate.click();

        yearSelect.click();
        Select select2 = new Select(yearSelect);
        select2.selectByValue(year);



        monthSelect.click();
        Select select = new Select(monthSelect);
        Faker faker = new Faker();
        try {
            select.selectByIndex(month);//from 1~12
            month = faker.number().numberBetween(1, 12);

        } catch (TimeoutException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }


        try {
            if (date>0 || date<=31) {
                Driver.getDriver().findElement(By.xpath("//table//td[.='" + date + "']")).click();
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }




}

