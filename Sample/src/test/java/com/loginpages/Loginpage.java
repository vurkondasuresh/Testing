package com.loginpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

    WebDriver driver;

    public Loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.CSS,using = "input[name='username']")
    public WebElement getuserName;
    @FindBy(how = How.CSS, using="#password")
    public WebElement getPassword;
    @FindBy(how=How.XPATH,using = "(//label/span[@class='checkmark'])[2]")
    public WebElement getUsetTypeRadioBtn;
    @FindBy(how=How.CSS,using="#okayBtn")
    public WebElement getPopUpBtn;
    @FindBy(how=How.CSS,using = ".form-group select  option")
    public WebElement getDropDown;
    @FindBy(how=How.CSS,using = "#terms")
    public WebElement getTermsAndConditions;
    @FindBy(how = How.CSS,using = "#signInBtn")
    public WebElement getSingInBtn;

}
