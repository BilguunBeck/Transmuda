package com.vytruck.tests;

import com.vytruck.pages.CreateCarPage;
import com.vytruck.pages.HomePage;
import com.vytruck.pages.LoginPage;
import com.vytruck.pages.VehiclePage;
import com.vytruck.utilities.BrowserUtility;
import com.vytruck.utilities.ConfigReader;
import com.vytruck.utilities.Driver;
import com.vytruck.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;



public class Test_US2_CreatingCar extends TestBase {

/**
    User story: As a user, I should be able to create vehicles/cars.
    Positive scenario:

    AC #1: Only store/sales manager able to create car
    Given store/sales manager is on the homePage
    When user select “Vehicles” under Fleet module
    And user click “create car” button
    When user fill out general information
    And click “Save and Close” button
    Then verify “Entity saved” confirm message
 */
    @Test
    public void managerCreatesCarTest() {

        for (String username : LoginPage.usernamesManagers) {
            //Login to the app
            LoginPage loginPage = new LoginPage();
            loginPage.goTo();
            loginPage.login(username, ConfigReader.read("password"));

            //You are on home page. Hover over to 'Fleet' module
            VehiclePage vehiclePage = new VehiclePage();
            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(vehiclePage.fleetModule).perform();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //Select 'Vehicles' from the list
            vehiclePage.vehiclesForManagers.click();
            BrowserUtility.waitFor(4);
            vehiclePage.createCarBtn.click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //call fillUpCreateCarForm() to fill up car info
            CreateCarPage createCarPage = new CreateCarPage();
            createCarPage.fillUpCreateCarForm();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //logout
            HomePage homePage = new HomePage();
            homePage.logout();
        }
    }



/**
 * Negative scenario:

    AC #2: drivers should not be able to create a car
    Given driver is on the homePage
    When user select “Vehicles” under Fleet module
    Then “create car” button should not be visible

 */

    @Test
    public void driverCanNotCreateCarTest() {

        for (String username : LoginPage.usernamesDrivers) {
            //Login to the app
            LoginPage loginPage = new LoginPage();
            loginPage.goTo();
            loginPage.login(username, ConfigReader.read("password"));

            //You are on home page. Hover over to 'Fleet' module
            VehiclePage vehiclePage = new VehiclePage();
            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(vehiclePage.fleetModule).perform();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //Select 'Vehicles' from the list
            vehiclePage.vehiclesForDrivers.click();
            BrowserUtility.waitFor(2);

            CreateCarPage createCarPage = new CreateCarPage();
           assertFalse( createCarPage.verifyCreateCarBtnIsNotDisplayed());

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //logout
            HomePage homePage = new HomePage();
            homePage.logout();

        }

    }


}
