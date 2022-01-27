package com.vytruck.tests;

import com.vytruck.pages.HomePage;
import com.vytruck.pages.LoginPage;
import com.vytruck.pages.OroDocumentationPage;
import com.vytruck.utilities.BrowserUtility;
import com.vytruck.utilities.ConfigReader;
import com.vytruck.utilities.TestBase;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Test_US10_AccessToOroPage extends TestBase {
//    Given user is on the homePage
//    When user click question icon on the right top of the homepage
//    Then verify user accessed to Oro Documentation page.
LoginPage loginPage = new LoginPage();
    HomePage homePage=new HomePage();
    @Test
    public void US10_accessToOroDocPage() {
        //log in
        //LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigReader.read("truckDriversUsername1"), ConfigReader.read("password"));
        BrowserUtility.waitFor(5);
     //current window
          //HomePage homePage=new HomePage();
          WebDriverWait wait=new WebDriverWait(driver,20);
          wait.until(ExpectedConditions.elementToBeClickable(homePage.questionMark));

homePage.questionMark.click();

        OroDocumentationPage oroDocumentationPage=new OroDocumentationPage();
        oroDocumentationPage.windowHandles();

        BrowserUtility.waitFor(5);
          assertEquals("Welcome to Oro Documentation",driver.getTitle());
    }


    @Test
    public void US10_accessToOroDocPage_Driver_SalesManager() {
        //log in
       // LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigReader.read("salesManagerUsername1"), ConfigReader.read("password"));
        BrowserUtility.waitFor(5);
        //current window
        //HomePage homePage=new HomePage();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(homePage.questionMark));

        homePage.questionMark.click();

        OroDocumentationPage oroDocumentationPage=new OroDocumentationPage();
        oroDocumentationPage.windowHandles();

        BrowserUtility.waitFor(5);
        assertEquals("Welcome to Oro Documentation",driver.getTitle());

    }


@Test
public void US10_accessToOroDocPage_StoreManager() {
    //log in
    //LoginPage loginPage = new LoginPage();
    loginPage.goTo();
    loginPage.login(ConfigReader.read("storeManagerUsername1"), ConfigReader.read("password"));
    BrowserUtility.waitFor(5);
    //current window
    //HomePage homePage=new HomePage();
    WebDriverWait wait=new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.elementToBeClickable(homePage.questionMark));

    homePage.questionMark.click();

    OroDocumentationPage oroDocumentationPage=new OroDocumentationPage();
    oroDocumentationPage.windowHandles();

    BrowserUtility.waitFor(5);
    assertEquals("Welcome to Oro Documentation",driver.getTitle());
}
        }