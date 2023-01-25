package com.skillrary.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver ldriver;

  public LoginPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "( //input[contains(@class, \"oxd-input oxd-input--active\")])[1]")
    WebElement textUserName;

    @FindBy(name = "password")
    //@CacheLookup
    WebElement textPassword;

    @FindBy(xpath = "//button[@type = \"submit\"]")
    //@CacheLookup
    WebElement buttonLogin;


    public void setUserName(String uname)
    {
        textUserName.click();
        textUserName.sendKeys(uname);
    }
    public void setPassword(String pwd)
    {
        textPassword.sendKeys(pwd);
    }
    public void clickSubmit()
    {
        buttonLogin.click();
    }





}
