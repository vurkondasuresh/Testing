package com.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginpageBy {


    public WebDriver driver;

    public LoginpageBy(WebDriver driver) {
        this.driver = driver;
    }

    By userName = By.cssSelector("#username");
    By Password = By.cssSelector("#password");
    By userTyperadioButton =By.xpath("(//span[@class='checkmark'])[2]");
    By UserStudent = By.cssSelector("div select");
    By termsCheckBox = By.cssSelector("input[type='checkbox']");
    By signButton = By.cssSelector("#signInBtn");

    public void enterUserName(){
        try {
            Thread.sleep(5000);
            driver.findElement(userName).sendKeys("rahulshettyacademy");
            Thread.sleep(5000);
            driver.findElement(Password).sendKeys("learning");
            Thread.sleep(5000);
            driver.findElement(userTyperadioButton).click();
            Thread.sleep(5000);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            new Select(driver.findElement(UserStudent)).selectByVisibleText("student");
            Thread.sleep(5000);
            driver.findElement(termsCheckBox).click();
            Thread.sleep(5000);
            driver.findElement(signButton).click();
            Thread.sleep(5000);

        }
        catch (Exception e){
            System.out.println("Show the Exception"+e.getMessage());
        }
    }



    /*@FindBy(css ="#username" )
    public  WebElement userName;

    @FindBy(css ="#password" )
    public  WebElement Password;

    @FindBy(xpath ="(//span[@class='checkmark'])[2]" )
    public WebElement userTyperedioButton;


    @FindBy(css= "div select")
    public WebElement UserStudent;*/

}
