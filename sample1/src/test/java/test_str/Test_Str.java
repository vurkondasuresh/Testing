package test_str;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom_str.Pom_Str;

import java.util.List;

public class Test_Str {

     WebDriver driver;
     Pom_Str pomStr;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void validateLoginResults() throws Exception {
        pomStr = new Pom_Str();
        /*pomStr.LoginTest();*/
        driver.findElement(By.cssSelector(pomStr.userName)).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector(pomStr.password)).sendKeys("learning");
        driver.findElement(By.xpath(pomStr.UserTypeRadioBtn)).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(pomStr.PopUpBtn)).click();
        new Select(driver.findElement(By.cssSelector(pomStr.userTypeDropDown))).selectByIndex(1);
        driver.findElement(By.cssSelector(pomStr.termsAndConditionsCheckBox)).click();
        driver.findElement(By.cssSelector(pomStr.SingInBtn)).click();
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void category() throws Exception {
        pomStr = new Pom_Str();
        List<WebElement> shopNames = driver.findElements(By.cssSelector(pomStr.shopNames));
        int sizeofCategory = shopNames.size();
        System.out.println(sizeofCategory);
        Thread.sleep(5000);
        for (int i = 0; i < sizeofCategory; i++) {
            String shopName = shopNames.get(i).getText();
            System.out.println(shopName);
            if (shopName.equalsIgnoreCase("Category 2")) {
                Thread.sleep(2000);
                shopNames.get(i).click();
                break;
            }
        }
    }

    @AfterClass
    public void tearDown() throws Exception {
        Thread.sleep(2000);
         driver.quit();
    }

}
