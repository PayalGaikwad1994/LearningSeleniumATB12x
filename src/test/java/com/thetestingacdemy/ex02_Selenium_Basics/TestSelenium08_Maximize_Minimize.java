package com.thetestingacdemy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium08_Maximize_Minimize {

    @Test
    public void test_01(){
        WebDriver driver=new FirefoxDriver();
        driver.get("https://app.vwo.com/");
        driver.manage().window().maximize();
        driver.quit();

    }
}
