package com.skillrary.testcases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.logging.Logger;

public class BaseClass {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    String userName = "Admin";
    String password = "admin123";


    public static WebDriver driver;
  // public static Logger logger;
    @BeforeClass
    public void setup()
    {
      //  System.setProperty("Webdriver.chrome.driver",System.getProperty("user dir") +"C:\\Users\\ShubhamT\\IdeaProjects\\SeleniumSkillrary\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        // logger = Logger.getLogger("SeleniumSkillrary");
      //  PropertyConfigurator.configure("Log4J.properties");


    }
    @AfterClass
    public void tearDown()
   {
    driver.quit();
   }



}
