package bypom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ByPom {

    WebDriver driver;

    public ByPom(WebDriver driver) {
        this.driver = driver;
    }

    By userName   = By.cssSelector("input[name='username']");
    By password = By.cssSelector("#password");
    By UserTypeRadioBtn = By.xpath("(//label/span[@class='checkmark'])[2]");
    By PopUpBtn = By.cssSelector("#okayBtn");
    By userTypeDropDown = By.cssSelector(".form-group select");
    By termsAndConditionsCheckBox = By.cssSelector("#terms");
    By SingInBtn = By.cssSelector("#signInBtn");
    By shopNames = By.cssSelector(".list-group a");

    public WebElement  getUseNameField(){
       return driver.findElement(userName);
    }
    public WebElement  getPasswordField(){
       return driver.findElement(password);
    }
    public WebElement  getRadioTypeBtn(){
       return driver.findElement(UserTypeRadioBtn);
    }
    public WebElement  getPopupOkayBtn(){
        return driver.findElement(PopUpBtn);
    }
    public WebElement  getUserTypeDropDown(){
       return driver.findElement(userTypeDropDown);
    }

    public WebElement  getTermsAndConditionsCheckBox(){
       return driver.findElement(termsAndConditionsCheckBox);
    }
    public WebElement  getSigInBtn(){
       return driver.findElement(SingInBtn);
    }
    public List<WebElement> getShopNames(){
       return driver.findElements(shopNames);
    }

}
