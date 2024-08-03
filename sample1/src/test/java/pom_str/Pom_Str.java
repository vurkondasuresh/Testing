package pom_str;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Pom_Str {


    public final String userName = "input[name='username']";
    public final String password = "#password";
    public final String UserTypeRadioBtn = "(//label/span[@class='checkmark'])[2]";
    public final String PopUpBtn = "#okayBtn";
    public final String userTypeDropDown = ".form-group select";
    public final String termsAndConditionsCheckBox = "#terms";
    public final String SingInBtn = "#signInBtn";


  // public  List<WebElement> shopName = driver.findElements(By.cssSelector(".list-group a"));


    public final String shopNames = ".list-group a";






   /* public void LoginTest(){
        driver.findElement(By.cssSelector(userName)).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector(password)).sendKeys("learning");
        driver.findElement(By.xpath(UserTypeRadioBtn)).click();
        driver.findElement(By.cssSelector(PopUpBtn)).click();
        new Select(driver.findElement(By.cssSelector(userTypeDropDown))).selectByIndex(1);
        driver.findElement(By.cssSelector(termsAndConditionsCheckBox)).click();
        driver.findElement(By.cssSelector(SingInBtn)).click();
       // driver.findElement(By.cssSelector(shopNames)).click();

    }*/


}
