package com.Tests;

import com.Pages.LoginPage_POM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest_Pom {

    WebDriver driver=new ChromeDriver();
    LoginPage_POM loginPagePom = new LoginPage_POM(driver);
    /*public LoginTest_Pom(WebDriver driver) {
        super(driver);
    }*/

    @BeforeClass
    public void beforeClass() {
        WebDriverManager.chromedriver().setup();
        driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void afterClass() throws Exception{
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void loginCredintalsValidate()  {
        loginPagePom.getUserName.sendKeys("suresh");
    }
}
