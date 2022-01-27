package com.vytruck.tests;

import com.vytruck.pages.ContactsPage;
import com.vytruck.pages.CreateContactPage;
import com.vytruck.pages.HomePage;
import com.vytruck.pages.LoginPage;
import com.vytruck.utilities.BrowserUtility;
import com.vytruck.utilities.ConfigReader;
import com.vytruck.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_US4_CreateContact extends TestBase {

    /**
     * User Story 4: As a user, I should be able to create contact information
     *
     * Acceptance criteria: Users are able to create contacts
     *
     * Given user is on the homePage
     * When user select “Contacts” under Customers module
     * And user click “Create Contact” button
     * When user fill out general information
     * And click “Save and Close” button
     * Then verify “contact saved” confirm message
     *
     */



    @Test
    public void testCreateContact() {
        for (String eachUsername : LoginPage.allUsernames) {

            LoginPage loginPage = new LoginPage();
            loginPage.goTo();
            loginPage.login(eachUsername, ConfigReader.read("password"));
            BrowserUtility.waitFor(2);
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;


            HomePage homePage = new HomePage();
            homePage.selectCustomersOptions("contacts");
            BrowserUtility.waitFor(2);
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
            ContactsPage contactsPage = new ContactsPage();
            contactsPage.createContactBtn.click();
            //BrowserUtility.waitFor(2);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
            CreateContactPage createContactPage = new CreateContactPage();
            createContactPage.fillGeneralInfo();
            createContactPage.chooseContactMethod("email");
            //BrowserUtility.waitFor(4);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
            createContactPage.chooseGender("male");
            //BrowserUtility.waitFor(5);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
            createContactPage.chooseSource("website");
            BrowserUtility.waitFor(5);
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
            createContactPage.selectBirthdayDate(2, 22, "1999");
            //BrowserUtility.waitFor(5);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
            //createContactPage.uploadPicture();

            createContactPage.fillAddressInfo();
            createContactPage.checkAddressTypesCheckBox("shipping");
            //BrowserUtility.waitFor(5);
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
            createContactPage.selectCountry("Afghanistan");

            createContactPage.groupInfoCheck("Mentoring Group");
            assertTrue(createContactPage.newContactIsSaved());
            homePage.logout();
        }
    }
}