package com.courses.ultimateqa.login.pages;


import com.aventstack.extentreports.Status;
import com.courses.ultimateqa.login.customlisteners.CustomListeners;
import com.courses.ultimateqa.login.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement signInButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome Back!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "user[email]")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "user[password]")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//input[@class='button button-primary g-recaptcha']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//li[contains(text(),'Invalid email or password.')]")
    WebElement errorMessage;

    public String getWelcomeText(){
        Reporter.log("The welcome Text is " + welcomeText.toString());
        CustomListeners.test.log(Status.PASS, "The welcome Text is " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }
    public void enterEmail(String email) {
        Reporter.log("Enter user name " + email + " to username field " + emailField.toString());
        CustomListeners.test.log(Status.PASS, "Enter user name " + email);
        sendTextToElement(emailField, email);
    }
    public void enterPassword(String password) {
        Reporter.log("Enter user name " + password + " to username field " + passwordField.toString());
        CustomListeners.test.log(Status.PASS, "Enter user name " + password);
        sendTextToElement(passwordField, password);
    }
    public void clickOnLoginButton() {
        Reporter.log("Clicking on Login Button " + signInButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on Login Button");
        clickOnElement(signInButton);
    }
    public String getErrorMessage(){
        Reporter.log("The error message is" + errorMessage.toString());
        CustomListeners.test.log(Status.PASS, "The error message is " + errorMessage.getText());
        return getTextFromElement(errorMessage);
    }

}
