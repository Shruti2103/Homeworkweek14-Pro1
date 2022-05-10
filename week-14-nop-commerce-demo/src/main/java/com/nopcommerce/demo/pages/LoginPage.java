package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {

    public LoginPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement varifyerrormessage;

    @FindBy(linkText = "Log in")
    WebElement loginLink;



    public void setEmail(String text){
        Reporter.log("Enter email"+text+ " to email field "+emailField.toString() + "<br>");
        sendTextToElement(emailField,text);
    }
    public void setPassword(String text) {
        Reporter.log("Enter email"+text+ " to email field "+passwordField.toString() + "<br>");
        sendTextToElement(passwordField,text);
    }
    public void clickOnLogin() {
        Reporter.log("Clicking on login Button"+ loginButton.toString()+ "<br>");
        clickOnElement(loginButton);
    }
    public String verifyWelcomeTextMessage() {
        Reporter.log("getting welcome text from "+welcomeText.toString()+"<br>");
        return getTextFromElement(welcomeText);
    }
    public String errorMessagevarify(){
        Reporter.log("getting varify errormessage text from "+varifyerrormessage.toString()+"<br>");
        return getTextFromElement(varifyerrormessage);
    }

    public String loginText(){
        Reporter.log("getting loginLink text from "+loginLink.toString()+"<br>");
        return getTextFromElement(loginLink);
    }



}
