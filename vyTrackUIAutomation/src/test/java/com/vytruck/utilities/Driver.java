package com.vytruck.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private static WebDriver obj ;

    private Driver(){ }

    public static WebDriver getDriver(){


        String browserName = ConfigReader.read("browser");
        if(obj == null){

            switch (browserName.toLowerCase().trim()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    obj = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    obj = new FirefoxDriver();
                    break;

                default:
                    obj = null;
                    System.out.println("Unknown browser type!" + browserName);
            }

            return obj ;
        }else{

            return obj ;
        }
    }


    /**
     * Quitting the browser and setting the value of
     * WebDriver instance to null because you can re-use already quited driver
     */

    public static void closeBrowser(){

        // check if we have WebDriver instance or not because we have to quit our browser after each test
        // basically checking if obj is null or not
        // if, it is not null, quit the browser and make it null , because once quit it can not be used anymore
        //so if it is null it is fine, if it is not null, we will still quit and make it null

        if(obj != null ){
            obj.quit();
            // so when ask for it again , it gives us not quited fresh driver
            obj = null ;
        }
    }

}
