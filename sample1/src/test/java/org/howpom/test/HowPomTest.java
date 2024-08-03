package org.howpom.test;

import howpom.HowPom;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HowPomTest {

WebDriver driver;

HowPom howPom;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void validateLogin() throws Exception {
        howPom = new HowPom(driver);
         howPom.getuserName.sendKeys("rahulshettyacademy");
         howPom.getPassword.sendKeys("learning");
         howPom.getUserTypeRadioBtn.click();
         howPom.getPopUpBtn.click();
         new Select(howPom.getDropDown).selectByVisibleText("Student");
         howPom.getTermsAndConditions.click();
         howPom.getSingInBtn.click();
         Thread.sleep(5000);
        //Assert.assertEquals(driver.getCurrentUrl(),"https://rahulshettyacademy.com/angularpractice/shop");
    }
    @Test(priority = 1)
    public void shopName() throws Exception{
        howPom = new HowPom(driver);
        Thread.sleep(2000);
        int shopesSize  = howPom.getShopesNames.size();
        System.out.println(shopesSize);
        for (int i = 0; i < shopesSize; i++) {
            String shopName = howPom.getShopesNames.get(i).getText();
            System.out.println(shopName);
            if (shopName.equalsIgnoreCase("Category 2")) {
                howPom.getShopesNames.get(i).click();
                break;
            }
        }
    }

    @AfterClass
    public void afterClass() {
        System.out.println("successfully done ");
    }
}
