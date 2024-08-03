package com.Test;


import com.page.LoginpageBy;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPageTEst {
    WebDriver driver;
    LoginpageBy loginpageBy ;
    //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
        Thread.sleep(5000);
    }

    @Test
    public void validateLoginPage() {
    loginpageBy = new LoginpageBy(driver);
    loginpageBy.enterUserName();
    }
}
