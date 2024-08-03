package com.Tests;

import com.Pages.LoginPage_Str;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends LoginPage_Str {

    WebDriver driver;
    public LoginTest() {
    }


    public LoginTest(WebDriver driver) {
        super(driver);
    }
    @BeforeClass
    public void browserLunch(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
    }
    @AfterClass
    public void quitBrowser() throws Exception{
        Thread.sleep(5000);
        driver.quit();
    }
    /*
    @Test
    public void test1(){
        System.out.println("suresh");
    }*/

    @Test
    public void loginCredentialsValidate()  throws  Exception{


        LoginPage_Str loginPage_str = new LoginPage_Str(driver);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(loginPage_str.userName)).sendKeys("rahulshettyacademy");
        Thread.sleep(3000);
        driver.findElement(By.id(loginPage_str.passWord)).sendKeys("learning");
        Thread.sleep(3000);
        driver.findElement(By.xpath(loginPage_str.userTypeRadioButton)).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(loginPage_str.UserTypeStudent)).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(loginPage_str.termsCheckBox)).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(loginPage_str.signinButton)).click();
        Thread.sleep(3000);
    }
}
