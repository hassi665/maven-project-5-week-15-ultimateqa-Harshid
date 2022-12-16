package com.courses.ultimateqa.login.pages;


import com.aventstack.extentreports.Status;
import com.courses.ultimateqa.login.customlisteners.CustomListeners;
import com.courses.ultimateqa.login.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement signInLink;

    public void clickOnLoginLink(){
        Reporter.log("Clicking on Signin Button " + signInLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Login Button");
        clickOnElement(signInLink);
    }

}
