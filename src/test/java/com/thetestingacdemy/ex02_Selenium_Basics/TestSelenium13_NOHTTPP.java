package com.thetestingacdemy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium13_NOHTTPP {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        //driver.get("app.vwo.com"); ///HTTP is importANT, IT WONT WORK
        driver.get("https://app.vwo.com");
        driver.quit();
    }
}
