package com.vytruck.pages;

import com.vytruck.utilities.BrowserUtility;
import com.vytruck.utilities.ConfigReader;
import com.vytruck.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class VehicleContractPage {


    //Go to Contracts page

    @FindBy(xpath = "//*[@id=\"user-menu\"]/a")
    public WebElement displayedUser;


    @FindBy(xpath = "//span[normalize-space(.)='Fleet']")
    public WebElement fleet;


    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[6]/a")
    public WebElement contractsBtn;


    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement allVehicleContract;


    @FindBy(xpath = "//button/input[@type='checkbox']")
    public WebElement checkAll;




    @FindBy(xpath = "//div[text()='You do not have permission to perform this action.']")
    public WebElement permissionMsgForDriver;


    @FindBy(xpath = "(//span[normalize-space(.)='Fleet'])[1]")
    public WebElement driverFleet;


    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[6]/a")
    public WebElement driverContract;

    //Constructor
    public VehicleContractPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



   /**
    *  ConfigReader.read("storeManagerUsername1"), ConfigReader.read("storeManagerUsername2"),
    *  ConfigReader.read("storeManagerUsername3"), ConfigReader.read("salesManagerUsername1"),
    *  ConfigReader.read("salesManagerUsername2"), ConfigReader.read("salesManagerUsername3")
    */
    public void getToDestination(String name) {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigReader.read(name), ConfigReader.read("password"));
    }


    public void printUserName(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),2);
        wait.until(visibilityOf(displayedUser));
        String name = displayedUser.getText();
        System.out.println("name = " + name);
        BrowserUtility.waitFor(5);
    }

    public void goToContractPage(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleet).pause(1000).moveToElement(contractsBtn).click().perform();
    }

    public boolean atAllContractPage(){
        boolean res = false;
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),2);
        try {
            wait.until(visibilityOf(allVehicleContract));
            res= true;
            System.out.println("You are at the All Contract Page");
        }catch (TimeoutException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        return res;
    }

    public void checkUncheckAll(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),2);
        wait.until(elementToBeClickable(checkAll));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(checkAll).click().pause(1000).click().pause(1000).perform();

        BrowserUtility.waitFor(3);

    }




    public boolean driverToContractPage(){
        boolean res = false;
        Actions actions = new Actions(Driver.getDriver());
        try {
            actions.moveToElement(driverFleet).pause(2000).moveToElement(driverContract).pause(2000).click().perform();
            if (permissionMsgForDriver.isDisplayed()){
                System.out.println("permissionMsgForDriver.getText() = " + permissionMsgForDriver.getText());
                res=true;
            }
        }catch (NoSuchElementException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            res=false;
        }
        return res;
    }





}
