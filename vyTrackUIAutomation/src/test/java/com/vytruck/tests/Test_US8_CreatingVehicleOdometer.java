package com.vytruck.tests;

import com.vytruck.pages.CreateVehicleOdometerPage;
import com.vytruck.pages.LoginPage;
import com.vytruck.pages.VehicleOdometerPage;
import com.vytruck.utilities.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class Test_US8_CreatingVehicleOdometer extends TestBase {

    // 8. Story: As a user, I should be create Vehicle Odometer.

    /*
      AC #1: drivers are able to create Vehicle Odometer.
      step 1: Given driver is on the homePage
      step 2: When user select “Vehicle Odometer” under Fleet module
      step 3: And user click “Create Vehicle Odometer” button
      step 4: When user fill out general information and click “Save and Close” button
      step 5: Then verify “Entity saved” confirm message
   */

    // custom method ==>>   public boolean testManagerCreateVehOd();
    // boolean managerNotAbleTOCreateVehOd = testManagerCreateVehOd();
    // assertEquals(true, managerNotAbleTOCreateVehOd);
    LoginPage loginPage = new LoginPage();
    CreateVehicleOdometerPage createOdoPage = new CreateVehicleOdometerPage();
    VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();


    @Test
    public void ac1_Driver1_CreateVehicleOdometerTest() {
        // step 1: Given driver is on the homePage
        loginPage.goTo(); //navigateToLoginPage();
        loginPage.login(ConfigReader.read("truckDriversUsername1"), ConfigReader.read("password"));

        // step 5: Then verify “Entity saved” confirm message
        boolean successCreateVehOdo = testDriverCreateVehicleOdometer();
        assertTrue(successCreateVehOdo);
    }

    @Test
    public void ac1_Driver2_CreateVehicleOdometerTest() {
        // step 1: Given driver is on the homePage
        loginPage.goTo(); //navigateToLoginPage();
        loginPage.login(ConfigReader.read("truckDriversUsername2"), ConfigReader.read("password"));

        // step 5: Then verify “Entity saved” confirm message
        boolean successCreateVehOdo = testDriverCreateVehicleOdometer();
        assertTrue(successCreateVehOdo);
    }

    @Test
    public void ac1_Driver3_CreateVehicleOdometerTest() {
        // step 1: Given driver is on the homePage
        loginPage.goTo(); //navigateToLoginPage();
        loginPage.login(ConfigReader.read("truckDriversUsername3"), ConfigReader.read("password"));

        // step 5: Then verify “Entity saved” confirm message
        boolean successCreateVehOdo = testDriverCreateVehicleOdometer();
        assertTrue(successCreateVehOdo);
    }

    // AC #1: drivers are able to create Vehicle Odometer
    //contains all steps to create odometer page
    //contains assert test (or if statement) to return boolean
    // Boolean successCreateVehicleOdometer = test;
    public boolean testDriverCreateVehicleOdometer(){
        BrowserUtility.waitFor(3);

        // step 2: When user select “Vehicle Odometer” under Fleet module
        vehicleOdometerPage.selectVehiclesOdometer();
        BrowserUtility.waitFor(3);

        // confirm that user is at "Vehicle Odometer" page
        // assertTrue( VehicleOdometerPage.isAt());
        assertTrue(vehicleOdometerPage.titleDisplay());

        // step 3: And user click “Create Vehicle Odometer” button
        vehicleOdometerPage.createVehicleOdo();
        BrowserUtility.waitFor(3);

        // step 4: When user fill out general information and click “Save and Close” button
        createOdoPage.enterOdoValue();
        createOdoPage.enterDate();
        createOdoPage.enterDriver();

//        createOdoPage.enterUnit(); // already pre select mile
        createOdoPage.selectFirstLicencePlate();

        createOdoPage.saveAndCloseButton();
        // return confirm message isDisplayed() status
        return createOdoPage.savedMessage.isDisplayed();
    }

    /*
      AC #2: managers should not to create Vehicle Odometer.
      step 1: Given store/sales manager is on the homePage
      step 2: When user select “Vehicle Odometer” under Fleet module
      step 3: Then verify “You do not have permission to perform this action.” message
     */

    @Test
    public void ac2_StoreMgr1_CreateVehicleOdometerTest() {
        // step 1: Given manager is on the homePage
        loginPage.goTo(); //navigateToLoginPage();
        loginPage.login(ConfigReader.read("storeManagerUsername1"), ConfigReader.read("password"));

        // step 3: Then verify “You do not have permission to perform this action.” message
        boolean correctMessageDisplayed = testManagerVehicleOdometerMessage();
        assertTrue(correctMessageDisplayed);
    }

    @Test
    public void ac2_StoreMgr2_CreateVehicleOdometerTest() {
        // step 1: Given manager is on the homePage
        loginPage.goTo(); //navigateToLoginPage();
        loginPage.login(ConfigReader.read("storeManagerUsername2"), ConfigReader.read("password"));

        // step 3: Then verify “You do not have permission to perform this action.” message
        boolean correctMessageDisplayed = testManagerVehicleOdometerMessage();
        assertTrue(correctMessageDisplayed);
    }

    @Test
    public void ac2_StoreMgr3_CreateVehicleOdometerTest() {
        // step 1: Given manager is on the homePage
        loginPage.goTo(); //navigateToLoginPage();
        loginPage.login(ConfigReader.read("storeManagerUsername3"), ConfigReader.read("password"));

        // step 3: Then verify “You do not have permission to perform this action.” message
        boolean correctMessageDisplayed = testManagerVehicleOdometerMessage();
        assertTrue(correctMessageDisplayed);
    }

    @Test
    public void ac2_SalesMgr1_CreateVehicleOdometerTest() {
        // step 1: Given manager is on the homePage
        loginPage.goTo(); //navigateToLoginPage();
        loginPage.login(ConfigReader.read("salesManagerUsername1"), ConfigReader.read("password"));

        // step 3: Then verify “You do not have permission to perform this action.” message
        boolean correctMessageDisplayed = testManagerVehicleOdometerMessage();
        assertTrue(correctMessageDisplayed);
    }

    @Test
    public void ac2_SalesMgr2_CreateVehicleOdometerTest() {
        // step 1: Given manager is on the homePage
        loginPage.goTo(); //navigateToLoginPage();
        loginPage.login(ConfigReader.read("salesManagerUsername2"), ConfigReader.read("password"));

        // step 3: Then verify “You do not have permission to perform this action.” message
        boolean correctMessageDisplayed = testManagerVehicleOdometerMessage();
        assertTrue(correctMessageDisplayed);
    }

    @Test
    public void ac2_SalesMgr3_CreateVehicleOdometerTest() {
        // step 1: Given manager is on the homePage
        loginPage.goTo(); //navigateToLoginPage();
        loginPage.login(ConfigReader.read("salesManagerUsername3"), ConfigReader.read("password"));

        // step 3: Then verify “You do not have permission to perform this action.” message
        boolean correctMessageDisplayed = testManagerVehicleOdometerMessage();
        assertTrue(correctMessageDisplayed);
    }

    public boolean testManagerVehicleOdometerMessage(){
        // step 2: When user select “Vehicle Odometer” under Fleet module
        BrowserUtility.waitFor(3);
        vehicleOdometerPage.selectVehiclesOdometer();

        // return confirm message isDisplayed() status
        BrowserUtility.waitFor(2);
        return vehicleOdometerPage.noPermissionMessage.isDisplayed();
    }



}
