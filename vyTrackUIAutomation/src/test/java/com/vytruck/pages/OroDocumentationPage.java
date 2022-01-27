package com.vytruck.pages;

import com.vytruck.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class OroDocumentationPage {
    @FindBy(xpath = "//a[.='USERS']")
    public WebElement oroDocUsers;

    @FindBy(xpath="//a[.='DEVELOPERS']")
    public WebElement oroDocDevelopers;

    @FindBy(xpath="//a[.='CLOUD']")
    public WebElement oroDocCloud;

    @FindBy(xpath="//a[.='BLOG']")
    public WebElement oroDocBlog;

    @FindBy(xpath="//a[.='ACADEMY']")
    public WebElement oroDocAcademy;

    @FindBy(css="input[name='q']")
    public WebElement searchBox;

    @FindBy(xpath="//a[.='OroCommerce']")
    public WebElement oroCommerceDownload;

    @FindBy(xpath="//a[.='OroCRM']")
    public WebElement oroCRMDownload;

    @FindBy(xpath="//a[.='OroPlatform']")
    public WebElement oroPlatformDownload;

    @FindBy(xpath="//a[.='Tutorials']")
    public WebElement tutorials_knowledgeBase;

    @FindBy(xpath="//a[.='Technical Training']")
    public WebElement technicalTraining_knowledgeBase;

    @FindBy(xpath="//a[.='Whitepapers']")
    public WebElement whitePaper_knowledgeBase;

    @FindBy(xpath="//a[.='Fundamental OroCommerce']")
    public WebElement fundamentalOrpCommerce;

    @FindBy(xpath="//a[.='Product Management']")
    public WebElement ProductManagement;

    @FindBy(xpath="//a[.='Sales Management']")
    public WebElement salesManagement;

    @FindBy(xpath="//a[.='OroCommerce 1.6']")
    public WebElement oroCommerce_olderVersions;

    @FindBy(xpath="//a[.='OroCRM 2.6, 2.3, 2.0, 1.12']")
    public WebElement oroCRM_olderVersions;

public void windowHandles(){
    Set<String> allHandles=Driver.getDriver().getWindowHandles();

    for (String eachHandle : allHandles) {
        Driver.getDriver().switchTo().window(eachHandle);
    }
}
}
