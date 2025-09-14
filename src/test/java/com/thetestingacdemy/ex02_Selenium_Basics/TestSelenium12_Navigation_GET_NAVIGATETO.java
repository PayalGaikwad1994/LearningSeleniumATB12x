package com.thetestingacdemy.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium12_Navigation_GET_NAVIGATETO {
    @Description("Verify User able to navigate to other URL")
    @Test
    public void test_Navigation(){
        WebDriver driver=new FirefoxDriver();
        driver.get("https://app.vwo.com/");

        //Navigation
        driver.navigate().to("https://bing.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        driver.quit();
    }
}
