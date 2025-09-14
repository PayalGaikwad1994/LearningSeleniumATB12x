package com.thetestingacdemy.ex02_Selenium_Basics;


import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestSelenium09_Assertion_TestNG {
    @Description("Open the URL")
    @Test

    public void test_OpenURL(){
        WebDriver driver=new FirefoxDriver();
        driver.get("https://app.vwo.com");

        //Testng validation
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        //AssertJ Validation
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://app.vwo.com/#/login");

        driver.quit();

    }
}
