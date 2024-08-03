package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class LoginPage_POM {


    WebDriver driver;
    public LoginPage_POM(WebDriver driver) {
    this.driver =  driver;
    PageFactory.initElements(driver, this);
  }


 /* @FindBy(css = "input[name='username']")
  WebElement userName;*/

 /* @FindBy(id = "password")
  WebElement passWord;*/

 /* @FindBy(xpath ="//input[@value='user']/following-sibling::span")
  WebElement  userTypeRadioButton;*/


 /* @FindBy(css = "div select")
  WebElement UserTypeStudent;*/

  /*@FindBy(css =" div label span input")
  WebElement termsCheckBox;*/

    /*@FindBy(css = "input#signInBtn")
  WebElement signinButton;*/


 @FindBy(how= How.CSS, using = "input[name='username']")
 public WebElement getUserName;
 @FindBy(how= How.CSS, using = "password")
 public  WebElement getpassword;
 @FindBy(how=How.XPATH,using = "//input[@value='user']/following-sibling::span")
 public  WebElement userTypeRadioButton;
 @FindBy(how=How.CSS,using = "div label span input")
 public WebElement getUserTypeStudent;
 @FindBy(how=How.CSS,using = "div label span input")
 public WebElement gettermsCheckBox;

 @FindBy(how=How.CSS,using = "input#signInBtn")
 public WebElement getSigninButton;

}
