package com.vytruck.pages;

import com.vytruck.utilities.ConfigReader;
import com.vytruck.utilities.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginPage {

    public static List<String> allUsernames = new ArrayList<>(Arrays.asList(ConfigReader.read("storeManagerUsername1"),
            ConfigReader.read("storeManagerUsername2"), ConfigReader.read("storeManagerUsername3"),
            ConfigReader.read("salesManagerUsername1"),
            ConfigReader.read("salesManagerUsername2"), ConfigReader.read("salesManagerUsername3"),
            ConfigReader.read("truckDriversUsername1"),
            ConfigReader.read("truckDriversUsername2"), ConfigReader.read("truckDriversUsername3")));

    public static List<String> usernamesManagers = new ArrayList<>(Arrays.asList(ConfigReader.read("storeManagerUsername1"),
            ConfigReader.read("storeManagerUsername2"), ConfigReader.read("storeManagerUsername3"),
            ConfigReader.read("salesManagerUsername1"),
            ConfigReader.read("salesManagerUsername2"), ConfigReader.read("salesManagerUsername3")));


    public static List<String > usernamesDrivers = new ArrayList<>(Arrays.asList(ConfigReader.read("truckDriversUsername1"),
            ConfigReader.read("truckDriversUsername2"), ConfigReader.read("truckDriversUsername3")));


    public static List<String> usernamesStoreManagers = new ArrayList<>(Arrays.asList(ConfigReader.read("storeManagerUsername1"),
            ConfigReader.read("storeManagerUsername2"), ConfigReader.read("storeManagerUsername3")));

    public static List<String> usernamesSalesManagers = new ArrayList<>(Arrays.asList(ConfigReader.read("salesManagerUsername1"),
            ConfigReader.read("salesManagerUsername2"), ConfigReader.read("salesManagerUsername3")));



    @FindBy(id="prependedInput")
    public WebElement userNameInputBox;

    @FindBy(id="prependedInput2")
    public WebElement passwordInputBox;

    @FindBy(id="_submit")
    public WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /**
     * goTo() takes no param
     * navigates to login page
     * use config.properties for url
     */

    public void goTo() {
        Driver.getDriver().get(ConfigReader.read("url"));
    }

    /**
     * login() method
     * @param username
     * @param password
     */
    public void login(String username, String password) {

        userNameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginBtn.click();


    }




}
