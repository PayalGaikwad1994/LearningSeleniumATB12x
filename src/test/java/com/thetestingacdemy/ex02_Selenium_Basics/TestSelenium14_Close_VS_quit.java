package com.thetestingacdemy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium14_Close_VS_quit {
    public static void main(String[] args) {

        WebDriver driver=new FirefoxDriver();
        driver.get("https://app.vwo.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }
}
