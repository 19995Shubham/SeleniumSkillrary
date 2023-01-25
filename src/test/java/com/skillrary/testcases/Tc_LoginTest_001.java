package com.skillrary.testcases;

import com.skillrary.pageobject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc_LoginTest_001 extends BaseClass
{
    LoginPage lp;
   @Test
    public void loginTest()
   {
       driver.get(baseUrl);
       lp = new LoginPage(driver);
       lp.setUserName(userName);
       lp.setPassword(password);
       lp.clickSubmit();
   }
}