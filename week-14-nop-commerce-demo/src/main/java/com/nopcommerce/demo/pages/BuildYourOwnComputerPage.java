package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

//- Build your own computer Text, Processor Drop Down, Ram
//drop down,
//HDD radios, os radio, software check boxes, Add To Card button, "The product has been
//added to your shopping cart"
//message locators and it's actions
public class BuildYourOwnComputerPage extends Utility {
    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }


//- Build your own computer Text

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputerText;

    public String builtyourowncomputertextvarify() {
        Reporter.log("getting  built yourown computer textvarify from "+buildYourOwnComputerText.toString()+"<br>");
        return getTextFromElement(buildYourOwnComputerText);
    }


    //Processor Drop Down
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropdown;

    public void selectprocessorrfromdroppdown(String text) {
        Reporter.log("Selecting processorr from droppdown"+text+" from dropdown "+processorDropdown.toString() + "<br>");
        selectByVisibleTextFromDropDown(processorDropdown, text);
    }

    // Ram droppdown

    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;

    public void selectRAMfromdroppdown(String text) {
        Reporter.log("Selecting RAM fromdroppdown"+text+" from dropdown "+selectRam.toString() + "<br>");
        selectByVisibleTextFromDropDown(selectRam, text);
    }


    //HDD radios
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement HDDradios320;

    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement HDDradios400;

    public void getHdd(String Hddtext) {
        if (Hddtext == "320GB") {
            Reporter.log("Clicking on HDD radios 320"+ HDDradios320.toString()+ "<br>");
            clickOnElement(HDDradios320);
        } else {
            Reporter.log("Clicking on HDD radios 400"+ HDDradios400.toString()+ "<br>");
            clickOnElement(HDDradios400);
        }
    }


    //os radio,
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement VistaPremium;

    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement VistaHome1;

    public void getOsRadio(String radio) {
        if (radio == "VistaHome") {
            Reporter.log("Clicking on newsletterbox"+ VistaHome1.toString()+ "<br>");
            clickOnElement(VistaHome1);
        } else {
            Reporter.log("Clicking on newsletterbox"+ VistaPremium.toString()+ "<br>");
            clickOnElement(VistaPremium);

        }
    }
        //software check boxes
        @FindBy(xpath = "//input[@id='product_attribute_5_12']")
        WebElement TotalCommander1;

        @FindBy(xpath = "//input[@id='product_attribute_5_10']")
        WebElement MicrosoftOffice1;

        @FindBy(xpath = "//input[@id='product_attribute_5_11']")
        WebElement AcrobatReader1;

        public void clickOnSoftwareCheckBox (String software) {
            if (software == "MicrosoftOffice") {
                Reporter.log("Clicking on MicrosoftOffice"+ MicrosoftOffice1.toString()+ "<br>");
                clickOnElement(MicrosoftOffice1);
            }
            if (software == "TotalCommander") {
                Reporter.log("Clicking on TotalCommander"+ TotalCommander1.toString()+ "<br>");
                clickOnElement(TotalCommander1);
            }
            if (software == "AcrobatReader") {
                Reporter.log("Clicking on AcrobatReader"+ AcrobatReader1.toString()+ "<br>");
                clickOnElement(AcrobatReader1);
            }
        }
            //Add To Card button
            @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
            WebElement addCartButton;

            public void clickOnAddToCart () {
                Reporter.log("Clicking on AddToCart"+ addCartButton.toString()+ "<br>");
                clickOnElement(addCartButton);
            }

            // varify text product has been added to your cart
            @FindBy(xpath = "//p[text()='The product has been added to your ']")
            WebElement addedToCartMessage;

            public String varifytextproductaddedtocart () {
                Reporter.log("getting varify text product added tocart "+addedToCartMessage.toString()+"<br>");
                return getTextFromElement(addedToCartMessage);
            }



    }

