package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

//- Comuters text, DesktopsLink, NotebooksLink, SoftwareLink Locators
//and create appropriate methods for it
public class ComputerPage extends Utility {
    public ComputerPage() {

        PageFactory.initElements(driver, this);
    }
    // computer text

    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersText;

    public String varifycomputerText() {
        Reporter.log("getting varify computerText "+computersText.toString()+"<br>");
        return getTextFromElement(computersText);
    }

    //DesktopsLink
    @FindBy(xpath = "//img[@title='Show products in category Desktops']")
    WebElement desktopLink;

    public void clickOnDesktopLink() {
        Reporter.log("Clicking on DesktopLink"+ desktopLink.toString()+ "<br>");
        clickOnElement(desktopLink);
    }
    //NotebooksLink

    @FindBy(xpath = "//img[@title='Show products in category Notebooks']")
    WebElement notebooksLink;

    public void clickOnNotebooksLink() {
        Reporter.log("Clicking on NotebooksLink"+ notebooksLink.toString()+ "<br>");
        clickOnElement(notebooksLink);
    }

    //SoftwareLink
    @FindBy(xpath = "//img[@title='Show products in category Software']")
    WebElement softwareLink;

    public void clickOnSoftwareLink() {
        Reporter.log("Clicking on SoftwareLink"+ softwareLink.toString()+ "<br>");
        clickOnElement(softwareLink);
    }


}
