package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class  LoginPage {
/*
  WebDriver driver;

  public LoginPage(WebDriver driver) {
    this.driver = driver;
  }*/

  By userName = By.cssSelector("input[name='username']");
  By passWord = By.id("password");
  By userTypeRadioButton = By.xpath("//input[@value='user']/following-sibling::span");
  By UserTypeStudent = By.cssSelector("div select");
  By termsCheckBox = By.cssSelector("div label span input");
  By signinButton = By.cssSelector("input#signInBtn");
}
