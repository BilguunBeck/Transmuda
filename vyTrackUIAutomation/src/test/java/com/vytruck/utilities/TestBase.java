package com.vytruck.utilities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    protected WebDriver driver ;




    // setting up all driver stuff here directly in @BeforeEach method
    @BeforeEach
    public void setupWebDriver(){
        driver =  Driver.getDriver() ;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.manage().window().maximize();
    }

    @AfterEach
    public void closeAndDestroyBrowser(){
        // quit the browser + make it null, so we can get new one when ask for it again
        Driver.closeBrowser();
    }

}
