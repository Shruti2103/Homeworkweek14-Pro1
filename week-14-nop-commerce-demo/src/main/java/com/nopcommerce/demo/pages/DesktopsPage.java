package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

//- Desktops text, Sortby, Display, selectProductList Locators and it's actions
public class DesktopsPage extends Utility {
    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }


    //- Desktops text

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopText;

    public String verifyDesktopText() {
        Reporter.log("getting verify Desktop text from "+desktopText.toString()+"<br>");
        return getTextFromElement(desktopText);
    }


    // Sortby
    @FindBy(id = "products-orderby")
    WebElement sortBy;

    public void clickOnSortBy() {
        Reporter.log("Clicking on SortBy"+ sortBy.toString()+ "<br>");
        clickOnElement(sortBy);
    }

    //Display
    @FindBy(id = "products-pagesize")
    WebElement displayBy;

    public void clickOnProductList() {
        Reporter.log("Clicking on ProductList"+ displayBy.toString()+ "<br>");
        clickOnElement(displayBy);
    }


    //selectProductList
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement selectProductList;

    public void selectproductlistfromdroppdown(String text) {
        Reporter.log("Selecting productlist from droppdown"+text+" from dropdown "+selectProductList.toString() + "<br>");
        selectByValueFromDropDown(selectProductList, text);
    }

    // click on Build your own computer
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement clickonBuildyourowncomputer;

    public void setClickonBuildyourowncomputer(){
        Reporter.log("Clicking on Build your own computer"+ clickonBuildyourowncomputer.toString()+ "<br>");
        clickOnElement(clickonBuildyourowncomputer);
    }



}
