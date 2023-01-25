package com.skillrary.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Categories {

    WebDriver ldriver;

    public  Categories(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }


    @FindBy(xpath = "//a[text() = \"CATEGORIES\"]")
    WebElement categoiresBox;  //have to ask

    @FindBy(xpath = "//ul[contains(@class, \"dropdown-menu mCustomScrollbar\")]//li")
    WebElement categoiresBoxCount;
    public void clickCBox()
    {
        categoiresBox.click();
    }

    public void setCategoiresBoxCount()
    {
        List<WebElement> countCB = new ArrayList<>((Collection) categoiresBoxCount);
        countCB.size();
    }



}
