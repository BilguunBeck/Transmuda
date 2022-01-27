package com.vytruck.tests;
import com.vytruck.pages.HomePage;
import com.vytruck.pages.LoginPage;
import com.vytruck.utilities.BrowserUtility;
import com.vytruck.utilities.ConfigReader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_US6_3OptionsUnderAccountName {

// THIS CODE HAS A BUG, WRONG NAME ON THE WEBSITE

    /**
     * Story: As a user, I should be able to view 3 options under my account name.
     *
     * AC #1: users have 3 options under their usernames.
     * Given user is on the homePage
     * When user click username on the right top corner
     * Then verify there are “My Username” “My Configuration” “My Calendar” options
     */

    @Test

    public void underAccountName_3_OptionsTest () {
        for (String username : LoginPage.allUsernames) {

            LoginPage loginPage = new LoginPage();
            loginPage.goTo();
            loginPage.login(username, ConfigReader.read("password"));
            BrowserUtility.waitFor(3);
            HomePage homePage = new HomePage();
            homePage.myAccountName.click();
            assertEquals("My Username", homePage.myUsername.getText());
            assertEquals("My Configuration", homePage.myConfiguration.getText());
            assertEquals("My Calendar", homePage.myCalendar.getText());


            homePage.logoutBtn.click();


        }
    }
}