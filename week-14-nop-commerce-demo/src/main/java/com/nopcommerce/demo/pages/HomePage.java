package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * - All Menu (Seven menu), LoginLink, registerLink, nopcommerce logo, My
 * account link and LogOut link locatores
 * and create appropriate methods for it.
 */
public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    // computer

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computersTab;
    public void clickOnComputersTab() {
        Reporter.log("Clicking on ComputersTab"+ computersTab.toString()+ "<br>");
        clickOnElement(computersTab);
    }
        //Electronics

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement elctronicsTab;
    public void clickOnElectronics() {
        Reporter.log("Clicking on Electronics"+ elctronicsTab.toString()+ "<br>");
        clickOnElement(elctronicsTab);
    }

    //Apparel

     @FindBy(xpath ="//body/div[6]/div[2]/ul[1]/li[3]/a[1]" )
     WebElement apparelTab;
     public void clickOnappral() {
         Reporter.log("Clicking on appral"+ apparelTab.toString()+ "<br>");
         clickOnElement(apparelTab);
     }

    //Digital Downloads

    @FindBy(linkText ="Digital downloads")
    WebElement digitaldownloadTab;
    public void clickOndigitaldownload() {
        Reporter.log("Clicking on digitaldownload Tab"+ digitaldownloadTab.toString()+ "<br>");
        clickOnElement(digitaldownloadTab);
    }

    //Books
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[5]/a[1]")
    WebElement books;
    public void clickOnBooks() {
        Reporter.log("Clicking on books "+ books.toString()+ "<br>");
        clickOnElement(books);
    }

    //Jewelry
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[6]/a[1]")
      WebElement jewelry;
    public void clickOnjewelry() {
        Reporter.log("Clicking on jewelry "+ jewelry.toString()+ "<br>");
        clickOnElement(jewelry);
    }
    //Giftcards

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[7]/a[1]")
    WebElement giftcards;
    public void clickOngiftcards() {
        Reporter.log("Clicking on giftcards "+ giftcards.toString()+ "<br>");
        clickOnElement(giftcards);
    }
     // loginlink

    @FindBy(linkText = "Log in")
     WebElement getLoginLink;
    public void clickOnLoginLink() {
        Reporter.log("Clicking on Login Link"+ getLoginLink.toString()+ "<br>");
        clickOnElement(getLoginLink);

    }

     // Registerlink

     @FindBy(linkText = "Register")
     WebElement getRegisterLink;
    public void clickOnRegisterLink() {
        Reporter.log("Clicking on Register Link"+ getRegisterLink.toString()+ "<br>");
     clickOnElement(getRegisterLink);
    }

     //nopcommerce logo

     @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
     WebElement nopCommerceLogo;
    public void clickonNopCommerce(){
        Reporter.log("Clicking on nop Commerce Logo"+ nopCommerceLogo.toString()+ "<br>");
        clickOnElement(nopCommerceLogo);
    }
     //my account link
       @FindBy(xpath = "//a[contains(text(),'My account')]")
       WebElement myaccountlink;
    public void clickonMyAccount(){
        Reporter.log("Clicking on my accountlink"+ myaccountlink.toString()+ "<br>");
        clickOnElement(myaccountlink);
    }

     //logoutlink click and varify
     @FindBy(xpath = "//a[contains(text(),'Log out')]")
     WebElement logoutLink;
     @FindBy(xpath ="//a[contains(text(),'Log out')]")// needs to find out cropath
             WebElement logout;
    public void clicklogout(){
        Reporter.log("Clicking on logout Link"+ logoutLink.toString()+ "<br>");
        clickOnElement(logoutLink);
    }
    public String varifyLogout(){
        Reporter.log("getting logout text from "+logout.toString()+"<br>");
       return getTextFromElement(logout);
    }
























}
