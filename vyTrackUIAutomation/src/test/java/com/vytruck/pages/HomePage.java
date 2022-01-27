package com.vytruck.pages;

import com.vytruck.utilities.BrowserUtility;
import com.vytruck.utilities.ConfigReader;
import com.vytruck.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePage  {

    //Web elements
    Actions actions ;
    //Find  my account name Element by Xpath
    @FindBy(xpath = "(//a[@class='dropdown-toggle' and @data-toggle='dropdown'])[1]")
    public WebElement myAccountName;

    //Find  logoutBtn Element by Xpath
    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logoutBtn;


    // Locate all dashBoard items for driver page
    @FindBy(id = "main-menu")
    public WebElement driverDashItems;


    // Locate drop-down menu for manager page
    @FindBy(id = "main-menu")
    public WebElement managerDashItems;


    // Driver page DashBoard Items

    @FindBy(css = "div.main-menu-top>ul>li")
    public static List<WebElement> allDriverDashItems;



    // @FindBy(css = "div.main-menu-top>ul>li")
    //public static List<WebElement> allManagerDashItems;


    //Hover over driverDash Items Fleet
    @FindBy(xpath = "(//span[@class = 'title title-level-1'])[1]")
    public static WebElement dashItemFleet;// firstItem(Fleet Module located)

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span")
    public static WebElement vehicleOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[4]/a/span")
    public static WebElement vehicleOdometerOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[5]/a/span")
    public static WebElement vehicleCostOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[6]/a/span")
    public static WebElement vehicleContractsOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[7]/a/span")
    public static WebElement vehicleFuelLogsOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[8]/a/span")
    public static WebElement vehicleServiceLogOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[4]/div/div/ul/li[9]/a/span")
    public static WebElement vehicleModelOp;


    //@FindBy(linkText = "Vehicles")
    //public  static WebElement fleetTitle;


    // Hover over driverDashItems Customers
    @FindBy(xpath = "(//span[@class = 'title title-level-1'])[2]")
    public static WebElement dashItemCustomers;


    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span")
    public static WebElement accountOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[4]/a/span")
    public static WebElement contactsOp;


    //@FindBy(linkText = "Contacts")
    //public  static  WebElement contactItemTitle; //


    // Hover over driverDashItems Activities
    @FindBy(xpath = "(//span[@class = 'title title-level-1'])[3]")
    public static WebElement dashItemsActivity;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a/span")
    public static WebElement calendarEventsOp;


    //  @FindBy(linkText = "Calendar Events")
    //public  static WebElement activityItemTitle;


    //Hover over driverDashItems Systems
    @FindBy(xpath = "(//span[@class = 'title title-level-1'])[4]")
    public static WebElement dashItemsSystem;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[4]/div/div/ul/li[3]/a/span")
    public static WebElement userManagementOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[4]/div/div/ul/li[3]/div/ul/li/a/span")
    public static WebElement userManagementUserOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[4]/div/div/ul/li[4]/a/span")
    public static WebElement jobsOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[4]/div/div/ul/li[5]/a/span")
    public static WebElement menusOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[4]/div/div/ul/li[6]/a/span")
    public static WebElement systemCalendarsOp;


    //@FindBy(linkText = "User Management")
    //public  static WebElement systemItemTitle;


    // Manager Page DashBoard Items

    @FindBy(css = "div.main-menu-top>ul>li")
    public static List<WebElement> allManagerDashItems;


    //Hover over ManagerDashItems DashBoard
    @FindBy(xpath = "//li[@class ='dropdown dropdown-level-1 first']")
    public static WebElement mdashItemsDashBoard;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span")
    public static WebElement dashBoardOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[5]/a/span")
    public static WebElement manageDashBoardOp;

    // @FindBy(linkText = "Dashboards")
    //public static WebElement MdashBoardItemTitle;


    //Hover over ManagerDashItems Fleet

    @FindBy(xpath = "(//li[@class ='dropdown dropdown-level-1'])[1]")
    public static WebElement mdashItemsFleet;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[4]/a/span")
    public static WebElement mfleetItmeTitle;


    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span")
    public static WebElement mvehicleop;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[4]/a/span")
    public static WebElement mvehicleOdometerOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[5]/a/span")
    public static WebElement mvehicleCostOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[6]/a/span")
    public static WebElement mvehicleContractsOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[7]/a/span")
    public static WebElement mvehicleFuelLogsOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[8]/a/span")
    public static WebElement mvehicleServiceLogOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[9]/a/span")
    public static WebElement mvehicleModelOp;




    // Hover over ManagerDashItems Customers
    @FindBy(xpath = "(//li[@class ='dropdown dropdown-level-1'])[2]")
    public static WebElement MdashItemsCustomers;


    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a/span")
    public static WebElement MAccountOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[4]/a/span")
    public static WebElement MContactsOp;

    //@FindBy(linkText = "Customers")
    //public static WebElement McustomerDashTitle;


    //Hover over ManagerDashItems Sales
    @FindBy(xpath = "(//li[@class ='dropdown dropdown-level-1'])[3]")
    public static WebElement mdashItemsSales;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[4]/div/div/ul/li[3]/a/span")
    public static WebElement mOpportunitiesOp;


    //@FindBy(linkText = "Sales")
    //public static WebElement MsalesItmeTitle;


    //Hover over ManagerDashItems Activities
    @FindBy(xpath = "(//li[@class ='dropdown dropdown-level-1'])[4]")
    public static WebElement mdashItemsActivities;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[5]/div/div/ul/li[3]/a/span")
    public static WebElement mCallsOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[5]/div/div/ul/li[3]/a/span")
    public static WebElement mCalendearEventsOp;


    // @FindBy(linkText = "Activities")
//    public static WebElement MactivitiesItmeTitle;


    //Hover over ManagerDashItems Marketing
    @FindBy(xpath = "(//li[@class ='dropdown dropdown-level-1'])[5]")
    public static WebElement mdashItemsMarketing;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[6]/div/div/ul/li[3]/a/span")
    public static WebElement campaignOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[6]/div/div/ul/li[4]/a/span")
    public static WebElement emailCampaignOp;

    // @FindBy(linkText = "Marketing")
    //public static WebElement MmarketingItmeTitle;


    //Hover over ManagerDashItems Reports & Segments
    @FindBy(xpath = "(//li[@class ='dropdown dropdown-level-1'])[6]")
    public static WebElement mdashItemsReportsSeg;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[7]/div/div/ul/li[3]/a/span")
    public static WebElement reportsOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[7]/div/div/ul/li[3]/div/ul/li[1]/a/span")
    public static WebElement reportsAccountOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[7]/div/div/ul/li[3]/div/ul/li[1]/ul/li[1]/a/span")
    public static WebElement reportsAccLifeTimeOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[7]/div/div/ul/li[3]/div/ul/li[1]/ul/li[2]/a/span")
    public static WebElement reportsAccByOpportunitiesOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[7]/div/div/ul/li[3]/div/ul/li[2]/a/span")
    public static WebElement reportsLeadsOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[7]/div/div/ul/li[3]/div/ul/li[2]/ul/li/a/span")
    public static WebElement reportsLeadByDateOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[7]/div/div/ul/li[3]/div/ul/li[3]/a/span")
    public static WebElement reportsOpportunitiesOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[7]/div/div/ul/li[3]/div/ul/li[3]/ul/li[1]/a/span")
    public static WebElement reportsOppByStatusOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[7]/div/div/ul/li[3]/div/ul/li[3]/ul/li[2]/a/span")
    public static WebElement reportsOppWonByPeriodOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[7]/div/div/ul/li[3]/div/ul/li[3]/ul/li[3]/a/span")
    public static WebElement reportsOppTotalForcastOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[7]/div/div/ul/li[4]/a/span")
    public static WebElement manageCutomerRepOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[7]/div/div/ul/li[6]/a/span")
    public static WebElement marketingCampaigns;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[7]/div/div/ul/li[6]/div/ul/li/a/span")
    public static WebElement camapginPerfomanceOp;

    //  @FindBy(linkText = "Reports & Segments")
    //public static WebElement MreportsSegItmeTitle;


    //Hover over ManagerDashItems System

    @FindBy(xpath = "(//span[@class ='title title-level-1'])[8]")
    public static WebElement mdashItemsSystem;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[8]/div/div/ul/li[3]/a/span")
    public static WebElement mUserManagmentOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[8]/div/div/ul/li[3]/div/ul/li[1]/a/span")
    public static WebElement userManagUsersOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[8]/div/div/ul/li[3]/div/ul/li[2]/a/span")
    public static WebElement userManageBuisnessUniOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[8]/div/div/ul/li[4]/a/span")
    public static WebElement contactGroupsOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[8]/div/div/ul/li[5]/a/span")
    public static WebElement mJobsOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[8]/div/div/ul/li[6]/a/span")
    public static WebElement mMenusOp;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[8]/div/div/ul/li[7]/a/span")
    public static WebElement mSystemCalendarsOp;
  
  
  //locating the question mark for US10
    @FindBy(xpath = "//i[@class='fa-question-circle']")
    public WebElement questionMark;


    //Customers - hover over actions!!!
    @FindBy(xpath = "(//span[normalize-space(.)='Customers'])[1]")
    public WebElement customers;

    //Accounts tab
    @FindBy(xpath = "(//span[text()='Accounts'])[1]")
    public WebElement accounts;

    //Contacts tab
    @FindBy(xpath = "//span[text()='Contacts']")
    public WebElement contacts;
  
   
    @FindBy(xpath = " //li/a[.='My User']")
    public WebElement myUsername;
 
    @FindBy(xpath = "//li/a[.='My Configuration']")
    public WebElement myConfiguration;

    @FindBy(xpath = "//li/a[.='My Calendar']")
    public WebElement myCalendar;
  
  
  
  //No-Arg Constructor
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Logout Method
    public void logout() {
        myAccountName.click();
        logoutBtn.click();
    }
  
  
   /**
     * select options under Customers tab!!!
     */
    public void selectCustomersOptions(String option) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(customers).pause(3000).perform();

        if (option.equalsIgnoreCase("accounts")) {
            accounts.click();
        } else if (option.equalsIgnoreCase("contacts")) {
            contacts.click();
        }
    }



    //Verification Method for Driver Dash Items
    public void driverDashboardItems() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigReader.read("truckDriversUsername1"), ConfigReader.read("password"));

        HomePage homePage = new HomePage();
        System.out.println("DashBoard Items = "  + "\n"+ homePage.driverDashItems.getText());
        System.out.println("The number of dash items present are - "+HomePage.allDriverDashItems.size());
        assertEquals(4, HomePage.allDriverDashItems.size());
        ArrayList<String> titles  = new ArrayList(Arrays.asList("Fleet","Customers", "Activities","System"));
        int index = 0;
        for (WebElement element : allDriverDashItems) {
            if(element.getText().equals(titles.get(index))){
                System.out.println("Title verification Passed: \nExpected result = " + element.getText());
            } else {
                System.out.println("Title verification Failed!!!");
                System.out.println("Expected title = "+element.getText());
            }
            index++;
        }



      // List< String> expected = {"Fleet", "Customers","Activities","System"};
      //  for (int i = 0; i < expected.length; i++) {
      //      String optionValue = allDriverDashItems.get(i).getText();
          //  if (optionValue.equalsIgnoreCase(expected[i])) {
            //    System.out.println("passed on: " + optionValue);
            //} else {
             //   System.out.println("failed on: " + optionValue);
            //}
         //   assertEquals(optionValue,expected[i]);
    }


    // Verification Methods for Manager Dash Items
    public void managerDashboardItems() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigReader.read("storeManagerUsername1"), ConfigReader.read("password"));

        HomePage homePage = new HomePage();
        homePage.managerDashItems.click();
        // homePage.managerDashItems.isDisplayed();
        System.out.println("DashBoard Items = " + "\n" + homePage.managerDashItems.getText());
        System.out.println(HomePage.allManagerDashItems.size());
        String [] expected = {"Dashboards","Fleet", "Customers","Sales","Activities","Marketing","Reports & Segments","System"};
        assertEquals(8, HomePage.allManagerDashItems.size());
        ArrayList<String> titles  = new ArrayList(Arrays.asList("Dashboards","Fleet", "Customers","Sales","Activities","Marketing","Reports & Segments","System"));
        int index = 0;
        for (WebElement element : allManagerDashItems) {
            if(element.getText().equals(titles.get(index))){
                System.out.println("Title verification Passed: \nExpected result = " + element.getText());
            } else {
                System.out.println("Title verification Failed!!!");
                System.out.println("Expected title = "+element.getText());
            }
            index++;

        //for (int i = 0; i < expected.length; i++) {
          //  String optionValue = allManagerDashItems.get(i).getText();
          //  if (optionValue.equalsIgnoreCase(expected[i])) {
             //   System.out.println("passed on: " + optionValue);
            //} else {
              //  System.out.println("failed on: " + optionValue);
            //}
          //  assertEquals(optionValue,expected[i]);
        }
        assertEquals(8, HomePage.allManagerDashItems.size());

    }



    // method to hover over tabs and tab sub items

    /*  public  void hoverOverAndClick(WebElement module,WebElement subModule){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(module).pause(3000).perform();
        BrowserUtility.waitFor(4);


            subModule.click();
    }*/


    public void hoverOvertoModule(String moduleName) {

        Actions actions = new Actions(Driver.getDriver());

        if (moduleName.equalsIgnoreCase("dashboards")) {
            actions.moveToElement(HomePage.mdashItemsDashBoard).pause(3000).perform();
            ;//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("fleet")) {
            actions.moveToElement(HomePage.dashItemFleet).pause(3000).perform();//Fleet
            //actions.moveToElement(HomePage.dashItemFleet).pause(3000).click();//Fleet
            BrowserUtility.waitFor(5);
            //  actions.click(HomePage.dashItemFleet);

        } else if (moduleName.equalsIgnoreCase("vehicles")) {
            actions.moveToElement(HomePage.vehicleOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);

        } else if (moduleName.equalsIgnoreCase("vehicle odometer")) {
            actions.moveToElement(HomePage.vehicleOdometerOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("vehicle costs")) {
            actions.moveToElement(HomePage.vehicleCostOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("vehicle contracts")) {
            actions.moveToElement(HomePage.vehicleContractsOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("fuel log")) {
            actions.moveToElement(HomePage.vehicleFuelLogsOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("service logs")) {
            actions.moveToElement(HomePage.vehicleServiceLogOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("car model")) {
            actions.moveToElement(HomePage.vehicleModelOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("customers")) {
            actions.moveToElement(HomePage.dashItemCustomers).pause(3000).perform();//Customers Tab
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("account")) {
            actions.moveToElement(HomePage.accountOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("contacts")) {
            actions.moveToElement(HomePage.contactsOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("activity")) {
            actions.moveToElement(HomePage.dashItemsActivity).pause(3000).perform();//Activity Tab
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("events")) {
            actions.moveToElement(HomePage.calendarEventsOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("system")) {
            actions.moveToElement(HomePage.dashItemsSystem).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("Manage User")) {
            actions.moveToElement(HomePage.userManagementOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("user")) {
            actions.moveToElement(HomePage.userManagementUserOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("jobs")) {
            actions.moveToElement(HomePage.jobsOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("menu")) {
            actions.moveToElement(HomePage.menusOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("calendar")) {
            actions.moveToElement(HomePage.systemCalendarsOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("dashboard")) {
            actions.moveToElement(HomePage.dashBoardOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("manage dashboard")) {
            actions.moveToElement(HomePage.manageDashBoardOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("sale")) {
            actions.moveToElement(HomePage.mdashItemsSales).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("opportunities")) {
            actions.moveToElement(HomePage.mOpportunitiesOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("Manager calls")) {
            actions.moveToElement(HomePage.mCallsOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("marketing")) {
            actions.moveToElement(HomePage.mdashItemsMarketing).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("campaign")) {
            actions.moveToElement(HomePage.campaignOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("Email campaign")) {
            actions.moveToElement(HomePage.emailCampaignOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("reports")) {
            actions.moveToElement(HomePage.reportsOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("report account")) {
            actions.moveToElement(HomePage.reportsAccountOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("life time")) {
            actions.moveToElement(HomePage.reportsAccLifeTimeOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("by opportunities")) {
            actions.moveToElement(HomePage.reportsAccByOpportunitiesOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("leads ")) {
            actions.moveToElement(HomePage.reportsLeadsOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("leads by date")) {
            actions.moveToElement(HomePage.reportsLeadByDateOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("opportunities  ")) {
            actions.moveToElement(HomePage.reportsOpportunitiesOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("opportunities by status")) {
            actions.moveToElement(HomePage.reportsOppByStatusOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("won opportunities by period")) {
            actions.moveToElement(HomePage.reportsOppWonByPeriodOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("total forcast")) {
            actions.moveToElement(HomePage.reportsOppTotalForcastOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("manage customer report")) {
            actions.moveToElement(HomePage.manageCutomerRepOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("marketing campaigns")) {
            actions.moveToElement(HomePage.marketingCampaigns).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("campaign performance")) {
            actions.moveToElement(HomePage.camapginPerfomanceOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("manager system")) {
            actions.moveToElement(HomePage.mdashItemsSystem).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase(" user management")) {
            actions.moveToElement(HomePage.mUserManagmentOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("business unit")) {
            actions.moveToElement(HomePage.userManageBuisnessUniOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("contacts groups")) {
            actions.moveToElement(HomePage.contactGroupsOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("manager jobs")) {
            actions.moveToElement(HomePage.mJobsOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("manager menu")) {
            actions.moveToElement(HomePage.mMenusOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("manager system calendars")) {
            actions.moveToElement(HomePage.dashItemFleet).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else if (moduleName.equalsIgnoreCase("manager user ")) {
            actions.moveToElement(HomePage.userManagUsersOp).pause(3000).perform();//Fleet
            BrowserUtility.waitFor(5);
        } else {
            System.out.println("Module does not exist");
        }
    }


   



}

