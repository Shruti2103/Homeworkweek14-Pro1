package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Jay Vaghani
 */

public class LoginPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;
    DesktopsPage desktopsPage;
    ComputerPage computerPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        desktopsPage = new DesktopsPage();
        computerPage = new ComputerPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void userShouldNavigateToLoginPageSuccessFully() {
        SoftAssert softAssert = new SoftAssert();
        loginPage.clickOnLogin();
        softAssert.assertEquals(loginPage.verifyWelcomeTextMessage(), "Welcome, Please Sign In", "Not navigate to page");

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnLoginLink();
        loginPage.setEmail("zarmartripathi@gmail.com");
        loginPage.setPassword("prime");
        loginPage.clickOnLogin();
        softAssert.assertEquals(loginPage.errorMessagevarify(), "Login was unsuccessful. Please correct the errors and try again");

    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnLoginLink();
        loginPage.setEmail("zarmartripathi1@gmail.com");
        loginPage.setPassword("prime123");
        loginPage.clickOnLogin();
        softAssert.assertEquals(homePage.varifyLogout(), "Log Out", "Not navigate to page");


    }

    @Test(groups = {"regression"})
    public void VerifyThatUserShouldLogOutSuccessFully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnLoginLink();
        loginPage.setEmail("zarmartripathi1@gmail.com");
        loginPage.setPassword("prime123");
        loginPage.clickOnLogin();
        homePage.clicklogout();
        softAssert.assertEquals(loginPage.loginText(), "Log in", "Not navigate to login");


    }


}
