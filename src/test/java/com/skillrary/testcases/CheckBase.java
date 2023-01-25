package com.skillrary.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CheckBase {

    String baseurl1 = "https://www.skillrary.com/";

    public static WebDriver driver;

    @BeforeClass
    public void setUP1()
    {
        driver = new ChromeDriver();
    }

    @AfterClass
    public void tearDown1()
    {
        driver.quit();
    }


}
