package com.vytruck.tests;

import com.vytruck.pages.HomePage;
import com.vytruck.pages.LoginPage;
import com.vytruck.pages.VehiclePage;
import com.vytruck.utilities.BrowserUtility;
import com.vytruck.utilities.ConfigReader;
import com.vytruck.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.ws.WebEndpoint;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Test_US1_MainModulesDisplayed extends TestBase {

    /*
    AC #1:
    Given store/sales manager is on the homePage
    Then verify user view 8 models names [verify the names]
     */
    @Test
    public void driverDashverify() {
        HomePage homePage = new HomePage();
        homePage.driverDashboardItems();
        homePage.logout();
    }





/*
AC #2:
Given driver is on the homePage
Then verify user view 4 models names [verify the names]
 */


    @Test
    public void managerDashverify() {
        HomePage homePage = new HomePage();
        homePage.managerDashboardItems();
        homePage.logout();
    }


// Hover over selected elements in the driver page

    @Test
    public void driverDashelements() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigReader.read("truckDriversUsername1"), ConfigReader.read("password"));
        // Type in the dashboard items you wish to see
        HomePage homePage = new HomePage();
        homePage.hoverOvertoModule("fleet");
        homePage.logout();
    }

    // Hover over selected elements in the manager page
    @Test
    public void managerDashelements() {

        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigReader.read("storeManagerUsername1"), ConfigReader.read("password"));
        //Type in the dashboard items you wish to see
        HomePage homePage = new HomePage();
        homePage.hoverOvertoModule("dashboards");
        homePage.logout();
    }



    }




//@Test
//public void carsPage(){
//LoginPage loginPage = new LoginPage();
//loginPage.goTo();
//loginPage.login(ConfigReader.read("truckDriversUsername1"), ConfigReader.read("password"));
// if you want to click the fleet drop down hover over it
// since its a fake drop down
// HomePage homePage = new HomePage();
//homePage.vehiclesPage.click();
//driver.findElement(By.linkText("Vehicles")).click();
// homePage.inCarsPage();



//@Test
//  public void moduleVerify()  {
//   LoginPage loginPage = new LoginPage();
//   loginPage.goTo();
//    loginPage.login(ConfigReader.read("truckDriversUsername1"), ConfigReader.read("password"));

//    HomePage homePage = new HomePage();
//System.out.println("Dash Board Items = " + homePage.myDashBoardItems.size());

//if (homePage.myDashBoardItems.size() == 4) {
//for (WebElement eachItem : homePage.myDashBoardItems) {
//System.out.println(" Module Name" + eachItem.getText());
//}

//  } else {
//  System.out.println("Test Failed- Not the right Modules");

//}
//}

