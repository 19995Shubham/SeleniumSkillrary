package com.skillrary.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class CheckBase {

    String baseurl1 = "https://www.skillrary.com/";

    public static WebDriver driver;

    @BeforeClass
    public void setUP1() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown1() {
        driver.quit();
    }
}