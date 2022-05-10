package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterPageTest extends TestBase {
    HomePage homePage ;
    LoginPage loginPage ;
    RegisterPage registerPage;
    DesktopsPage desktopsPage;
    ComputerPage computerPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage=new RegisterPage();
        desktopsPage=new DesktopsPage();
        computerPage=new ComputerPage();
        buildYourOwnComputerPage=new BuildYourOwnComputerPage();

    }
   @Test(groups = {"sanity","smoke","regression"})
    public void  verifyUserShouldNavigateToRegisterPageSuccessfully(){
       homePage.clickOnRegisterLink();
       SoftAssert softAssert=new SoftAssert();
      softAssert.assertEquals(registerPage.registerTextvarify(),"Register","Not navigate to register page");


   }
    @Test(groups = {"smoke","regression"})
   public void  verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
       homePage.clickOnRegisterLink();
       registerPage.clickonRegistrationbutton();
       registerPage.verifyFirstnameError();
       registerPage.verifyLastnameError();
       registerPage.verifyemailaddress();
       registerPage.verifypasswordError();
       registerPage.verifyconfirmpassword();


    }
    @Test(groups = {"regression"})
    public void  verifyThatUserShouldCreateAccountSuccessfully(){
        SoftAssert softAssert=new SoftAssert();
        homePage.clickOnRegisterLink();
        registerPage.femaleradiobuttonclick();
         registerPage.enterFirstName("Zarmar");
         registerPage.enterLastName("Tripathi");
         registerPage.setdate("10");
         registerPage.setmonth("12");
         registerPage.setyear("1987");
         registerPage.setemailid("zarmartripathi1@gmail.com");
         registerPage.setPassword("prime123");
         registerPage.setConfirmPassword("prime123");
         registerPage.clickonRegistrationbutton();
         Assert.assertEquals(registerPage.verifyregistrationcomplete(),"Your registration completed","registration not complete");




    }







}
