package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {
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
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        homePage.clickOnComputersTab();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(computerPage.varifycomputerText(), "Computers", "Not navigate to page");


    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnComputersTab();
        computerPage.clickOnDesktopLink();
        softAssert.assertEquals(desktopsPage.verifyDesktopText(), "Desktops", "Not navigate to page");

    }

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class, groups = {"regression"})
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String
                                                                                            processor, String ram, String hdd, String os, String software) {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnComputersTab();
        computerPage.clickOnDesktopLink();
        desktopsPage.setClickonBuildyourowncomputer();
        buildYourOwnComputerPage.selectprocessorrfromdroppdown(processor);
        buildYourOwnComputerPage.selectRAMfromdroppdown(ram);
        buildYourOwnComputerPage.getHdd(hdd);
        buildYourOwnComputerPage.getOsRadio(os);
        buildYourOwnComputerPage.clickOnSoftwareCheckBox(software);
        buildYourOwnComputerPage.clickOnAddToCart();
        softAssert.assertEquals(buildYourOwnComputerPage.varifytextproductaddedtocart(), "The product has been added to your shopping cart\"", "Not navigate to page");


    }








}
