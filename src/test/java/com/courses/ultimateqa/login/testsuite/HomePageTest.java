package com.courses.ultimateqa.login.testsuite;

import com.courses.ultimateqa.login.customlisteners.CustomListeners;
import com.courses.ultimateqa.login.pages.HomePage;
import com.courses.ultimateqa.login.pages.LoginPage;
import com.courses.ultimateqa.login.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class HomePageTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;


    @BeforeMethod(alwaysRun = true)
    public void pageObjects() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        Thread.sleep(1500);
        homePage.clickOnLoginLink();
        Assert.assertEquals(loginPage.getWelcomeText(), "Welcome Back!", "Sign In Page is not displayed");
    }
}
