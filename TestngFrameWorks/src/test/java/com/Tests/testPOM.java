package com.Tests;

import com.Pages.LoginPage_POM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testPOM  {


    WebDriver driver;
    LoginPage_POM loginPagePom;


    /*public testPOM(WebDriver driver)
    {
        super(driver);
    }*/
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        loginPagePom = new LoginPage_POM(driver);
    }
    @AfterClass
    public void quit() {
        driver.quit();
    }

/*
@Test
public void test1(){
    System.out.println("Suresh");
}*/

    @Test
    public void validate(){
        loginPagePom.getUserName.sendKeys("suresh");
        loginPagePom.getpassword.sendKeys("suresvdjkl");
        loginPagePom.getUserTypeStudent.click();
        new Select(loginPagePom.getUserTypeStudent).selectByVisibleText("select");
        loginPagePom.gettermsCheckBox.click();
        loginPagePom.getSigninButton.click();

        Assert.assertEquals(driver.getTitle(), "Expected Title After Login");
    }
}
