package com.vytruck.tests;

import com.vytruck.pages.HomePage;
import com.vytruck.pages.LoginPage;
import com.vytruck.utilities.ConfigReader;
import com.vytruck.utilities.TestBase;
import org.junit.jupiter.api.Test;

public class TestLogin_Logout extends TestBase {

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigReader.read("truckDriversUsername1"), ConfigReader.read("password"));
    }

    @Test
    public void logoutTest(){
        //I called the loginTest() method from upper test and it executed the login functionality
        loginTest();
        HomePage homePage = new HomePage();
        homePage.logout();
    }



}
