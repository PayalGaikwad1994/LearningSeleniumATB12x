package com.thetestingacdemy.ex02_Selenium_Basics;

import com.thetestingacdemy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_ProjectNo1 extends CommonToAll {
    @Description("TC#1 Verify particular text exists on Katalon website")
    @Test
    public void test_verify_text(){
        WebDriver driver = new FirefoxDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com");

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test case Passed");
            Assert.assertTrue(true);
        }
        else{
            System.out.println("Test Case Failed");
            Assert.assertTrue(false);
        }
        closeBrowser(driver);
    }

}
