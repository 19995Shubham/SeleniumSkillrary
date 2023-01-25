package com.skillrary.testcases;

import com.skillrary.pageobject.Categories;
import org.testng.annotations.Test;

public class TC_Chceck_Working extends CheckBase {

    @Test
    public void categoriesTest() {
        driver.get(baseurl1);
        Categories cg = new Categories(driver);
        cg.clickCBox()
                .setCategoiresBoxCount();
    }
}