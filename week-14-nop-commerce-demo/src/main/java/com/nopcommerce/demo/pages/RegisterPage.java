package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

//- Register Text, male female radio, Firstname, lastname, Date of Birth drop
//downs, email,
//Password, Confirm Password, Register Button, "First name is required.","Last name is
//required.",
//"Email is required.","Password is required.", "Password is required." error message,
//"Your registration completed" message, "CONTINUE" button
//Locators and it's actions
public class RegisterPage extends Utility {
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    // register text varify

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyRegisterText;

    public String registerTextvarify() {
        Reporter.log("getting verify Register Text  from "+verifyRegisterText.toString()+"<br>");
        return getTextFromElement(verifyRegisterText);
    }
    // male female radio button

    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement clickmaleradiobutton;

    public void maleradiobuttonclick() {
        Reporter.log("Clicking on male radio button"+ clickmaleradiobutton.toString()+ "<br>");
        clickOnElement(clickmaleradiobutton);
    }

    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement clickfemaleradiobutton;

    public void femaleradiobuttonclick() {
        Reporter.log("Clicking on female radio button"+ clickfemaleradiobutton.toString()+ "<br>");
        clickOnElement(clickfemaleradiobutton);
    }

    // Firstname
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    public void enterFirstName(String firstname) {
        Reporter.log("Enter email "+firstname+ " to email field "+firstNameField.toString() + "<br>");
        sendTextToElement(firstNameField, firstname);

    }


    //Lastname
    @FindBy(id = "LastName")
    WebElement lastNameField;

    public void enterLastName(String lastname) {
        Reporter.log("Enter email"+lastname+ " to email field "+lastNameField.toString() + "<br>");
        sendTextToElement(lastNameField, lastname);

    }

    // Date of Birth date
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dayDropdown;

    public void setdate(String date) {
        Reporter.log("Selecting day"+date+" from dropdown "+dayDropdown.toString() + "<br>");
        selectByValueFromDropDown(dayDropdown, date);
    }


    //Date of Birthdate Month
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthDropdown;

    public void setmonth(String month) {
        Reporter.log("Selecting month"+month+" from dropdown "+monthDropdown.toString() + "<br>");
        selectByValueFromDropDown(monthDropdown, month);
    }


    // Date of Birthdate Year
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearDropdown;

    public void setyear(String year) {
        Reporter.log("Selecting year"+year+" from dropdown "+yearDropdown.toString() + "<br>");
        selectByValueFromDropDown(yearDropdown, year);
    }


    // Email
    @FindBy(id = "Email")
    WebElement emailIdField;

    public void setemailid(String email) {
        Reporter.log("Enter email"+email+ " to email field "+emailIdField.toString() + "<br>");
        sendTextToElement(emailIdField, email);
    }

    // password
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;

    public void setPassword(String password) {
        Reporter.log("Enter email"+password+ " to email field "+passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);

    }

    //confirmpassword
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    public void setConfirmPassword(String confirmPassword) {
        Reporter.log("Enter email"+confirmPassword+ " to email field "+confirmPasswordField.toString() + "<br>");
        sendTextToElement(confirmPasswordField, confirmPassword);

    }


    // click on Registerbutton
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement clickOnRegisterButton;

    public void clickonRegistrationbutton() {
        Reporter.log("Clicking on Register Button"+ clickOnRegisterButton.toString()+ "<br>");
        clickOnElement(clickOnRegisterButton);
    }

    // errormessage firstname require
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameError;

    public String verifyFirstnameError() {
        Reporter.log("getting first Name Error text from "+firstNameError.toString()+"<br>");
        return getTextFromElement(firstNameError);
    }


    // errormessage lastname require
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameError;

    public String verifyLastnameError() {
        Reporter.log("getting last Name Error text from "+lastNameError.toString()+"<br>");
        return getTextFromElement(lastNameError);
    }

    //    errormessage email require
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailError;

    public String verifyemailaddress() {
        Reporter.log("getting email Error text from "+emailError.toString()+"<br>");
        return getTextFromElement(emailError);
    }

    //    errormessage password  require
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordError;

    public String verifypasswordError() {
        Reporter.log("getting password Error text from "+passwordError.toString()+"<br>");
        return getTextFromElement(passwordError);
    }

    // error message confirm password
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPwError;

    public String verifyconfirmpassword() {
        Reporter.log("getting confirm Pw Error text from "+confirmPwError.toString()+"<br>");
        return getTextFromElement(confirmPwError);
    }

    // Your registration completed" message,text varify
    @FindBy(xpath = "//div[@class='result' and contains(normalize-space(),'Your registration completed')]")
    WebElement regCompleted;

    public String verifyregistrationcomplete() {
        Reporter.log("getting reg Completed  text from "+regCompleted.toString()+"<br>");
        return getTextFromElement(regCompleted);
    }

    // click on continue button
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;

    public void clickOncontiueButton() {
        Reporter.log("Clicking on continue Btn"+ continueBtn.toString()+ "<br>");
        clickOnElement(continueBtn);
    }
}
