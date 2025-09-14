package com.thetestingacdemy.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {
    @Description("TC#1 Open app.vwo.com and verify the title")
    @Test
    public void test_verify_url(){
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://app.vwo.com");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }

}
