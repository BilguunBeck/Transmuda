package com.vytruck.tests;

import com.vytruck.pages.*;
import com.vytruck.utilities.BrowserUtility;
import com.vytruck.utilities.ConfigReader;
import com.vytruck.utilities.Driver;
import com.vytruck.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class Test_US7_CreateVehicleCosts extends TestBase {

    /**
     * 7. Story: As a user, I should be able to create vehicle costs.
     * --
     * AC #1: users are able to create vehicle costs.
     * -
     * * Given user is on the homePage,
     * * When user select “Vehicle Costs” under Fleet module,
     * * And user click “Create Vehicle Costs” button,
     * * When user fill out general information and click “Save and Close” button,
     * * Then verify “Entity saved” confirm message.
     */


    @Test
    public void createVehicleCostsForAll() {
        for (String eachUsername : LoginPage.allUsernames) {

            //Login for all users
            LoginPage loginPage = new LoginPage();
            loginPage.goTo();
            loginPage.login(eachUsername, ConfigReader.read("password"));
            BrowserUtility.waitFor(2);

            HomePage homePage = new HomePage();
            BrowserUtility.waitFor(2);

            //Navigate to 'Fleet' module
            VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();
            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(vehicleCostsPage.fleetHoverButton).perform();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //Select 'Vehicle Costs' from the list
            vehicleCostsPage.vehicleCostsButton.click();
            BrowserUtility.waitFor(2);

            vehicleCostsPage.fillGeneralInfoTab();
            vehicleCostsPage.fillCarReservationTab();

            homePage.logout();
        }
    }
}