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

    public Categories(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='CATEGORIES']")
    private WebElement categoiresBox;  //have to ask
    @FindBy(xpath = "//ul[@id='category_li']//a")
    private List<WebElement> categoiresBoxCount;

    public Categories clickCBox() {
        categoiresBox.click();
        return this;
    }

    public Categories setCategoiresBoxCount() {
        System.out.println("Total Elements : " + categoiresBoxCount.size());
        categoiresBoxCount.forEach(e -> System.out.println(e.getText()));
        return this;
    }
}