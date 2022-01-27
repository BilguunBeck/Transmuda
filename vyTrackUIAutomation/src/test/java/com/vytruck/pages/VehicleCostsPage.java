package com.vytruck.pages;

import com.vytruck.utilities.BrowserUtility;
import com.vytruck.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehicleCostsPage {

    @FindBy(xpath = "//span[normalize-space(.)='Fleet']")
    public WebElement fleetHoverButton;

    @FindBy(xpath = "//span[normalize-space()='Vehicle Costs']")
    public WebElement vehicleCostsButton;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement allVehicleCostsText;

    @FindBy(xpath = "//a[@title='Create Vehicle Costs']")
    public WebElement createVehicleCostsButton;

    @FindBy(xpath = "(//button[normalize-space()='Save and Close'])[1]")
    public WebElement saveAndCloseButton;

    //-------------------

    @FindBy(xpath = "//span[@class='select2-chosen']")
    public WebElement clickDropdown;

    @FindBy(xpath = "//div[normalize-space()='Summer tires']")
    public WebElement selectTypeFromDropdown;

    @FindBy(xpath = "//input[@name='custom_entity_type[TotalPrice]']")
    public WebElement totalPriceBox;

    @FindBy(xpath = "//input[@placeholder='Choose a date']")
    public WebElement clickDate;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    public WebElement clickToday;

    @FindBy(xpath = "//textarea[@name='custom_entity_type[CostDescriptions]']")
    public WebElement enterCostDescription;

    //-------------------

    @FindBy(xpath = "(//button[@class='btn btn-medium add-btn'])[1]")
    public WebElement chassisNumberAddButton;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr[9]/td[1]/input")
    public WebElement chassisNumberCheckBox;

    @FindBy(xpath = "//button[normalize-space()='Select']")
    public WebElement chassisNumberSelectButton;

    //-------------------

    @FindBy(xpath = "(//button[@class='btn btn-medium add-btn'])[2]")
    public WebElement licensePlateAddButton;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr[9]/td[1]/input")
    public WebElement licensePLateCheckBox;

    @FindBy(xpath = "//button[normalize-space()='Select']")
    public WebElement licensePlateSelectButton;

    //-------------------

    public VehicleCostsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void fillGeneralInfoTab() {

        VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();
        assertTrue(allVehicleCostsText.isDisplayed());
        vehicleCostsPage.createVehicleCostsButton.click();
        BrowserUtility.waitFor(2);

        clickDropdown.click();
        selectTypeFromDropdown.click();
        totalPriceBox.click();
        totalPriceBox.sendKeys("500");
        clickDate.click();
        clickToday.click();
        enterCostDescription.click();
        enterCostDescription.sendKeys("Replaced tires with new ones");
        BrowserUtility.waitFor(2);
        System.out.println("General info tab filling completed");

    }

    public void fillCarReservationTab() {

        chassisNumberAddButton.click();
        chassisNumberCheckBox.click();
        chassisNumberSelectButton.click();

        licensePlateAddButton.click();
        licensePLateCheckBox.click();
        licensePlateSelectButton.click();
        System.out.println("Car Reservation tab filling completed");

        //submit
        saveAndCloseButton.submit();
    }


}