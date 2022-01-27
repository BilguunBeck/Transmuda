package com.vytruck.tests;

import com.vytruck.pages.HomePage;
import com.vytruck.pages.LoginPage;
import com.vytruck.pages.VehiclePage;
import com.vytruck.utilities.BrowserUtility;
import com.vytruck.utilities.ConfigReader;
import com.vytruck.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;


public class Test_US11_AllVehiclesModelsAreDisplayed extends TestBase {

    /**
     UserStory 11: As a user, I should be view all the vehicle models

     AC #1: user should view all the vehicles model

     Given user is on the homePage
     When user select “Vehicle Model” under Fleet module
     Then verify user can view all the vehicles
     */


    @Test
    public void allVehiclesDisplayedForManagersTest()  {

        //1. Use ForLoop to run the US.11 with different Manager Login credentials(username, password)
        for (String username : LoginPage.usernamesManagers) {

            //2. Login inside the ForLoop
            LoginPage loginPage = new LoginPage();
            loginPage.goTo();
            loginPage.login( username , ConfigReader.read("password") );

            //home page://-------------------------------------------------

            //3. Add implicit wait and explicit wait
            driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

            //4. Create action for the "Hover Over" functionality
            Actions action = new Actions(driver); //Instantiating moveCursor class

            //5. Create object "vehiclePage" of the Pages> class VehiclePage
            VehiclePage vehiclePage = new VehiclePage();

            //6. HoverOver to the "Fleet" module
            BrowserUtility.waitFor(7);
            action.moveToElement(vehiclePage.fleetModule).perform();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            BrowserUtility.waitFor(10);

            //7. HoverOver to "Vehicle Model" module and click on it
            WebElement vehicleModels = driver.findElement(By.xpath("//span[text()='Vehicles Model']"));
            vehicleModels.click();


            //next page: All Vehicles Model//-------------------------------------------------

            //8. actualAllVehMod GetTitle()
            BrowserUtility.waitFor(10);
            String actualAllVehMod = driver.getTitle();

            //9. assert Equal to the expected page:
            String expectAllVehMod = "All - Vehicles Model - Entities - System - Car - Entities - System";
            assertEquals(expectAllVehMod, actualAllVehMod);

            //10. logout from the ForLoop
            HomePage homePage = new HomePage();
            homePage.logout();
        }

    }



    @Test
    public void allVehiclesDisplayedForDriversTest()  {

        //1. Use ForLoop to run the US.11 with different User Login credentials(username, password)
        for (String username : LoginPage.usernamesDrivers) {

            //2. Login inside the ForLoop
            LoginPage loginPage = new LoginPage();
            loginPage.goTo();
            loginPage.login( username , ConfigReader.read("password") );

            //home page://-------------------------------------------------

            //3. Add implicit wait and explicit wait
            driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

            //4. Create action for the "Hover Over" functionality
            Actions action = new Actions(driver); //Instantiating moveCursor class

            //5. Create object "vehiclePage" of the Pages> class VehiclePage
            VehiclePage vehiclePage = new VehiclePage();

            //6. HoverOver over the "Fleet" module
            BrowserUtility.waitFor(7);
            action.moveToElement(vehiclePage.fleetModule).perform();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            BrowserUtility.waitFor(10);

            //7. HoverOver to "Vehicle Model" module and click on it
            WebElement vehicleModels = driver.findElement(By.xpath("//span[text()='Vehicles Model']"));
            vehicleModels.click();


            //next page: All Vehicles Model//-------------------------------------------------

            //8. actualAllVehMod GetTitle()
            BrowserUtility.waitFor(10);
            String actualVehMod = driver.getTitle();

            //9. assert Equal to the expected page:
            String expectAllVehMod = "Vehicles Model - Entities - System - Car - Entities - System";
            assertEquals(expectAllVehMod, actualVehMod);

            //10. logout from the ForLoop
            HomePage homePage = new HomePage();
            homePage.logout();
        }



    }
}

/*
UserStory 11 has been updated to version 4:
     * unnecessary elements and info has been erased
     * added correct description of the steps
     * changed design
 */