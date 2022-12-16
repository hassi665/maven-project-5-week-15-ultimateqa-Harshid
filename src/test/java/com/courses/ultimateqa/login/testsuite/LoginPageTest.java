package com.courses.ultimateqa.login.testsuite;


import com.courses.ultimateqa.login.pages.HomePage;
import com.courses.ultimateqa.login.pages.LoginPage;
import com.courses.ultimateqa.login.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void pageObjects() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        Assert.assertEquals(loginPage.getWelcomeText(), "Welcome Back!", "Login page not displayed");
    }

    @Test(groups = "regression")
    public void verifyThePasswordErrorMessage() {
        homePage.clickOnLoginLink();
        loginPage.enterEmail("Harshid123@gmail.com");
        loginPage.enterPassword("Prime@123");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getErrorMessage(), "Invalid email or password.", "Error message not displayed");
    }

}
