package bypomtest;

import bypom.ByPom;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ByPomTest {

   WebDriver driver;
   ByPom byPom;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void validateDetails() throws  Exception{
         byPom = new ByPom(driver);
         byPom.getUseNameField().sendKeys("rahulshettyacademy");
         byPom.getPasswordField().sendKeys("learning");
         byPom.getRadioTypeBtn().click();
         Thread.sleep(2000);
         byPom.getPopupOkayBtn().click();
         new Select(byPom.getUserTypeDropDown()).selectByIndex(1);
         byPom.getTermsAndConditionsCheckBox().click();
         byPom.getSigInBtn().click();
         Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void shopNames() throws Exception {
        byPom = new ByPom(driver);
        int shopSizes = byPom.getShopNames().size();
        System.out.println(shopSizes);
        Thread.sleep(5000);
        for (int i = 0; i < shopSizes; i++) {
            String shopNamesCategory =  byPom.getShopNames().get(i).getText();
            System.out.println(shopNamesCategory);
            if (shopNamesCategory.equalsIgnoreCase("Category 2")) {
                byPom.getShopNames().get(i).click();
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
