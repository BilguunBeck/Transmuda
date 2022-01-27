package com.vytruck.pages;

import com.vytruck.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

    //Create Contact button
    @FindBy(xpath = "//a[normalize-space(.)='Create Contact']")
    public WebElement createContactBtn;

    //No-Arg Constructor
    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
