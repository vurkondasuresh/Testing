package com.Pages;

import org.openqa.selenium.WebDriver;

public class LoginPage_Str {

  public final String userName ="input[name='username']";
  public final String passWord = "password";
  public final String userTypeRadioButton = "//input[@value='user']/following-sibling::span";
  public final String UserTypeStudent = "div select";
  public final String termsCheckBox = "div label span input";
  public final String signinButton = "input#signInBtn";


  WebDriver driver;

  public LoginPage_Str() {
  }

  public LoginPage_Str(WebDriver driver) {
    this.driver=driver;
  }
}
