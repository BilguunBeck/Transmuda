package com.vytruck.pages;

import com.github.javafaker.Faker;
import com.vytruck.utilities.BrowserUtility;
import com.vytruck.utilities.ConfigReader;
import com.vytruck.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CreateContactPage {
   //General tag
    @FindBy(xpath = "//a[text()='General']")
    public WebElement generalTag;

    //Groups tag
    @FindBy(xpath = "//a[text()='Groups']")
    public WebElement groupsTag;

    //Accounts tag
    @FindBy(xpath = "//a[text()='Accounts']")
    public WebElement accountsTag;

    //Name Prefix field
    @FindBy(css = "input[id^='oro_contact_form_namePrefix']")
    public WebElement namePrefixField;

    //First Name field
    @FindBy(css = "input[id^='oro_contact_form_firstName']")
    public WebElement firstNameField;

    //Middle Name field
    @FindBy(css = "[id^='oro_contact_form_middleName']")
    public WebElement middleNameField;

    //Last Name field
    @FindBy(css = "input[id^='oro_contact_form_lastName']")
    public WebElement lastNameField;

    //Name Suffix field
    @FindBy(css = "input[id^='oro_contact_form_nameSuffix']")
    public WebElement nameSuffixField;

    //Description field is iframe with id = "tinymce"
    //Description field input xpath = "//body[@id='tinymce']/p"
     @FindBy(xpath = "//body[@id='tinymce']/p")
     public WebElement descriptionInputField;
    //Description Bold button is inside framework with xpath = "//i[@class='mce-ico.mce-i-bold']"


   //Assign To label
   @FindBy(xpath = "//label[text()='Assigned to']")
   public WebElement assignToLabel;

    //Assigned To DropDown box
    @FindBy(xpath = "//span[text()='Choose a user...']")
    public WebElement assignedToDropDown;

    //Assigned To List-Tom Smith
     @FindBy(xpath = "(//li/div[@class='select2-result-label'])[10]")
     public WebElement tomSmith;

    //Reports To DropDown box
    @FindBy(xpath = "//span[text()='Choose a contact...']")
    public WebElement reportsToDropDown;

    //Reported to Demo Omed
    @FindBy(xpath = "(//ul[@class='select2-results'])[5]")
    public WebElement demoOmed;

    //Emails field
    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailsField;

    //Emails Add button
    @FindBy(xpath = "(//i[@class='fa-plus'])[1]")
    public WebElement emailsAddBtn;

    //Emails Cancel (x) button
    @FindBy(xpath = "(//button[@class='removeRow btn btn-action btn-link'])[1]")
    public WebElement emailsCancelBtn;

    //Emails Primary radioButton
    @FindBy(xpath = "//input[@name='oro_contact_form[emails][0][primary]']")
    public WebElement emailsPrimaryRadioButton;

    //Phones field
    @FindBy(css = "[name^='oro_contact_form[phones]']")
    public WebElement phonesField;

    //Phones Add button
    @FindBy(xpath = "(//a[@class='btn add-list-item'])[2]")
    public WebElement phonesAddBtn;

    //Phones Cancel (x) button
    @FindBy(xpath = "(//button[@class='removeRow btn btn-action btn-link'])[2]")
    public WebElement phonesCancelBtn;

    //Phones Primary radioButton
    @FindBy(css = "[id^='oro_contact_form_phones_0_primary']")
    public WebElement phonesPrimaryRadioButton;

    //Fax field
    @FindBy(css = "[id^='oro_contact_form_fax']")
    public WebElement faxField;

    //Skype field
    @FindBy(css = "[id^='oro_contact_form_skype']")
    public WebElement skypeField;

    //Contact Method DropDown box
    @FindBy(css = "[id^='oro_contact_form_method']")
    public WebElement contactMethodDropDown;

    //Twitter field
    @FindBy(css = "[id^='oro_contact_form_twitter']")
    public WebElement twitterField;

    //Facebook field
    @FindBy(css = "[id^='oro_contact_form_facebook']")
    public WebElement facebookField;

    //Google+ field
    @FindBy(css = "[id^='oro_contact_form_googlePlus']")
    public WebElement googlePlusField;

    //LinkedIn field
    @FindBy(css = "[id^='oro_contact_form_linkedIn']")
    public WebElement linkedInField;

    //Job title field
    @FindBy(css = "[id^='oro_contact_form_jobTitle']")
    public WebElement jobTitleField;

    //Birthday input field
    @FindBy(css = "[id^='date_selector_oro_contact_form_birthday']")
    public WebElement birthdayInputField;

    //Birthday year dropdown
    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    public WebElement birthdayYearDropdown;

    //Birthday month dropdown
    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    public WebElement birthdayMonthDropdown;

    //Gender DropDown box
    @FindBy(css = "[id^='oro_contact_form_gender']")
    public WebElement genderDropDown;

    //Source DropDown box
    @FindBy(css = "[id^='oro_contact_form_source']")
    public WebElement sourceDropDown;

    //Picture upload file
    @FindBy(css = "[id^='oro_contact_form_picture_file']")
    public WebElement pictureUploadFile;

 //------------------------------------------------------------------------

    //Addresses Title
    @FindBy(xpath = "//span[text()='Addresses']")
    public WebElement addressesTitle;

    //Address Primary checkbox
    @FindBy(css = "[id^='oro_contact_form_addresses_0_primary']")
    public WebElement addressPrimaryCheckbox;

    //Address Label field
    @FindBy(css = "[id^='oro_contact_form_addresses_0_label']")
    public WebElement addressLabelField;

    //Address Name Prefix field
    @FindBy(css = "[id^='oro_contact_form_addresses_0_namePrefix']")
    public WebElement addressNamePrefixField;

    //Address First Name field
    @FindBy(css = "[id^='oro_contact_form_addresses_0_firstName']")
    public WebElement addressFirstNameField;

    //Address Middle Name field
    @FindBy(css = "[id^='oro_contact_form_addresses_0_middleName']")
    public WebElement addressMiddleNameField;

    //Address Last Name field
    @FindBy(css = "[id^='oro_contact_form_addresses_0_lastName']")
    public WebElement addressLastNameField;

    //Address Name Suffix field
    @FindBy(css = "[id^='oro_contact_form_addresses_0_nameSuffix']")
    public WebElement addressNameSuffixField;

    //Address Organization field
    @FindBy(css = "[id^='oro_contact_form_addresses_0_organization']")
    public WebElement addressOrganizationField;

    //Address Country DropDown box
    @FindBy(xpath = "//a/span[text()='Choose a country...']")
    public WebElement addressCountryDropDownBox;

    //Address Street field
    @FindBy(css = "[id^='oro_contact_form_addresses_0_street']")
    public WebElement addressStreetField;

    //Address Street2 field
    @FindBy(css = "[id^='oro_contact_form_addresses_0_street2']")
    public WebElement addressStreet2Field;

    //Address City field
    @FindBy(css = "[id^='oro_contact_form_addresses_0_city']")
    public WebElement addressCityField;

    //Address State field
    @FindBy(xpath = "(//*[@class='select2-search'])[5]/input")
    public WebElement addressStateField;

    //Address Zip Code field
    @FindBy(css = "[id^='oro_contact_form_addresses_0_postalCode']")
    public WebElement zipCodeField;

    //Address Types Billing checkbox
    @FindBy(css = "[id^='oro_contact_form_addresses_0_types_0']")
    public WebElement addressTypesBillingCheckbox;

    //Address Types Shipping checkbox
    @FindBy(css = "[id^='oro_contact_form_addresses_0_types_1']")
    public WebElement addressTypesShippingCheckbox;

    //Address Add new address option
    @FindBy(xpath = "(//a[@class='btn add-list-item'])[3]")
    public WebElement addNewAddressOption;

    //--------------------------------------------------------------

    //Groups Sales Group checkbox
    @FindBy(xpath = "//div/label[text()='Sales Group']")
    public WebElement salesGroupCheckbox;

    //Groups Marketing Group checkbox
    @FindBy(xpath = "//div/label[text()='Marketing Group']")
    public WebElement marketingGroupCheckbox;

    //Groups Fsfsafsaf checkbox
    @FindBy(xpath = "//div/label[text()='fsfsafsaf']")
    public WebElement fsfsafsafCheckbox;

    //Groups Dasdsadasd checkbox
    @FindBy(xpath = "//div/label[text()='dasdsadasd']")
    public WebElement dasdsadasdCheckbox;

    //Groups Wdaf Rfefe checkbox
    @FindBy(xpath = "//div/label[text()='wdaf rfefe']")
    public WebElement wdafRfefeCheckbox;

    //Groups Mentoring Group checkbox
    @FindBy(xpath = "//div/label[text()='Mentoring Group']")
    public WebElement mentoringGroupCheckbox;

    //----------------------------------------------------------------

    //Accounts Manage filters dropdown box
    @FindBy(xpath = "(//span[@class='caret'])[3]")
    public WebElement accountsManageFiltersDropdown;

    //Accounts Refresh button
    @FindBy(xpath = "//a[@class='action btn reset-action mode-text-only']")
    public WebElement accountsRefreshBtn;

    //Accounts all options
    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']/li")
    List<WebElement> allAccountsOptions;

    //-------------------------------------------------------------------------

    //Cancel button
    @FindBy(xpath = "//a[normalize-space(.)='Cancel']")
    public WebElement cancelBtn;

    //Save And Close button
    @FindBy(xpath = "//button[normalize-space(.)='Save and Close']")
    public WebElement saveAndCloseDropdown;

    //verification message
    @FindBy(xpath = "//div[text()='Contact saved']")
    public WebElement verificationMessage;


 /**
  * No-arg Constructor
  */
 public CreateContactPage(){
     PageFactory.initElements(Driver.getDriver(),this);
    }


 /**
  * Create a method that will choose contactMethod from GeneralInfo
  */
 public void chooseContactMethod(String contactMethod){
  Select selectObj = new Select(contactMethodDropDown);
  if(contactMethod.equalsIgnoreCase("email")){
   selectObj.selectByVisibleText("Email");
  }else if(contactMethod.equalsIgnoreCase("mail")){
   selectObj.selectByVisibleText("Mail");
  }else if(contactMethod.equalsIgnoreCase("phone")){
   selectObj.selectByVisibleText("Phone");
  }else {
   throw new RuntimeException("Invalid contact selected: " + contactMethod);
  }
 }

 /**
  * Create a method that will choose gender from GeneralInfo
  */
 public void chooseGender(String gender){
  Select selectObj = new Select(genderDropDown);
  if(gender.equalsIgnoreCase("male")){
   selectObj.selectByVisibleText("Male");
  }else if(gender.equalsIgnoreCase("female")){
   selectObj.selectByVisibleText("Female");
  }else {
   throw new RuntimeException("Invalid gender option selected: " + gender);
  }
 }

 /**
  * Create a method that will choose Source from  GeneralInfo
  */
 public void chooseSource(String source){
  Select selectObj = new Select(sourceDropDown);
  if(source.equalsIgnoreCase("phone call")){
   selectObj.selectByVisibleText("Phone Call");
  }else if(source.equalsIgnoreCase("tv")){
   selectObj.selectByVisibleText("TV");
  }else if (source.equalsIgnoreCase("website")){
   selectObj.selectByVisibleText("Website");
  }else {
   throw new RuntimeException("Invalid source selected: " + source);
  }
 }


 /**
  * Create a method that will fill General Information up
  */
   public void fillGeneralInfo()  {

    generalTag.click();
    Faker faker = new Faker();
    namePrefixField.sendKeys(faker.name().prefix());
    firstNameField.sendKeys(faker.name().firstName());
    middleNameField.sendKeys(faker.name().name());
    lastNameField.sendKeys(faker.name().lastName());
    nameSuffixField.sendKeys(faker.name().suffix());

    //Description field - iframe
    Driver.getDriver().switchTo().frame(0);
    descriptionInputField.sendKeys(faker.chuckNorris().fact());
    //BrowserUtility.waitFor(2);
    Driver.getDriver().switchTo().defaultContent();

    //used to scroll down
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    jse.executeScript("arguments[0].scrollIntoView(true)", assignToLabel);
    //BrowserUtility.waitFor(3);
    Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

    assignedToDropDown.click();
    //IT DOESN'T WORK AS REAL DROPDOWN AND CANNOT BE USED WITH SELECT OBJECT BECAUSE IT IS NOT SELECT TAG
    tomSmith.click();
    //BrowserUtility.waitFor(2);
    Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

    reportsToDropDown.click();
    BrowserUtility.waitFor(2);
   // Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    //IT IS NOT REAL DROPDOWN BOX SO SELECT CLASS CANNOT BE USED
     demoOmed.click();

     emailsField.sendKeys(faker.letterify("????????@gmail.com"));
     //IF WE USE THOSE TWO BUTTON IT SEND US FROM BEGINNING
     //emailsPrimaryRadioButton.click();
     //emailsAddBtn.click();

     phonesField.click();
     phonesField.sendKeys(faker.phoneNumber().cellPhone());
     phonesCancelBtn.click();
     phonesAddBtn.click();
     phonesField.click();
     phonesField.sendKeys(faker.phoneNumber().cellPhone());

     faxField.click();
     faxField.sendKeys(faker.phoneNumber().phoneNumber());

     skypeField.click();
     skypeField.sendKeys(faker.bothify("?????###@gmail.com"));

     twitterField.sendKeys(faker.bothify("??????"));
     facebookField.sendKeys(faker.name().fullName());
     googlePlusField.sendKeys(faker.name().fullName());
     linkedInField.sendKeys(faker.name().fullName());
     jobTitleField.sendKeys(faker.job().title());
   }


 /**
  * Create a method that will select BirthdayDate ()
  * @param month (int)
  * @param date  (int)
  * @param year  (String)
  */
 public void selectBirthdayDate(int month, int date, String year) {
  //Step1: click on Birthday Input field  :
  birthdayInputField.click();

  //Step2:Select a year from dropdown
  birthdayYearDropdown.click();
  Select select2 = new Select(birthdayYearDropdown);
  select2.selectByValue(year);


  //Step3: Select a month from dropdown
  birthdayMonthDropdown.click();
  Select select = new Select(birthdayMonthDropdown);
  select.selectByIndex(month);//from 1~12
  if (month > 12 || month < 1) {
   throw new RuntimeException("Number of the month is invalid");
  }

  //Step4: Select a date from table
  Driver.getDriver().findElement(By.xpath("//table//td[.='" + date + "']")).click();
 }

 /**
  * Create a method that will upload File to GeneralInfo
  */
// public void uploadPicture(){
//  String filePath = "C:\\Users\\ivana\\Desktop\\HTML\\unicorn-cake1.jpg";
//  pictureUploadFile.sendKeys(filePath);
//  //BrowserUtility.waitFor(2);
//  Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
// }


 /**
  * Create a method that will fill Address Info up
  */
 public void fillAddressInfo(){
  JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
  jse.executeScript("arguments[0].scrollIntoView(true)",addressesTitle );
  //BrowserUtility.waitFor(3);
  Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

  addressPrimaryCheckbox.click();

  Faker faker = new Faker();
  addressLabelField.sendKeys(faker.letterify("??????????"));
  addressNamePrefixField.sendKeys(faker.name().prefix());
  addressFirstNameField.sendKeys(faker.name().firstName());
  addressMiddleNameField.sendKeys(faker.name().nameWithMiddle());
  addressLastNameField.sendKeys(faker.name().lastName());
  addressNameSuffixField.sendKeys(faker.name().suffix());
  addressOrganizationField.sendKeys(faker.company().name());
  addressStreetField.sendKeys(faker.address().streetAddress());
  addressStreet2Field.sendKeys(faker.address().secondaryAddress());
  addressCityField.sendKeys(faker.address().city());
  zipCodeField.sendKeys(faker.address().zipCode());
 }

 /**
  * Create a method that will select a country from Country dropdown list
  * using input text, not select class
  */
 public void selectCountry(String country){
  addressCountryDropDownBox.click();
  BrowserUtility.waitFor(2);

  Driver.getDriver().findElement(By.xpath("//li[.='" + country + "']")).click();
  //Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
 }


 /**
  * Create a method that will check Address Type from Address Info
   * @param type
  */
 public void checkAddressTypesCheckBox(String type){
  if(type.equalsIgnoreCase("billing")){
   addressTypesBillingCheckbox.click();
  }else if(type.equalsIgnoreCase("shipping")) {
   addressTypesShippingCheckbox.click();
  }
  }


 /**
  * Create a method that will fill Groups Info
  */
 public void groupInfoCheck(String group){
  groupsTag.click();
  if(group.equalsIgnoreCase("sales group")){
   salesGroupCheckbox.click();
  }else if(group.equalsIgnoreCase("Marketing Group")){
   marketingGroupCheckbox.click();
  }else if(group.equalsIgnoreCase("Fsfsafsaf")){
   fsfsafsafCheckbox.click();
  }else if(group.equalsIgnoreCase("Dasdsadasd")){
   dasdsadasdCheckbox.click();
  }else if (group.equalsIgnoreCase("Wdaf Rfefe")){
   wdafRfefeCheckbox.click();
  }else if(group.equalsIgnoreCase("Mentoring Group")){
   mentoringGroupCheckbox.click();
  }else {
   throw new RuntimeException("Invalid group selected: " + group);
  }
 }

 /**
  * Create a method to verify that new contact is created
  */
public boolean newContactIsSaved(){
 saveAndCloseDropdown.click();
 System.out.println("verificationMessage.isDisplayed() = " + verificationMessage.isDisplayed());
 System.out.println(verificationMessage.getText());
 return verificationMessage.isDisplayed();
}






}
