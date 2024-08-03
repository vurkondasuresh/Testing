import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class AllinOne {
    WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void BrowserSetUp(){
        WebDriverManager.chromedriver().setup();
        driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
    }
    @Test(priority = 2 , enabled = false)
    public void SelectDroupDown() throws Exception {
        Thread.sleep(5000);
        new Select(driver.findElement(By.cssSelector("#dropdown-class-example"))).selectByVisibleText("Select");
        Thread.sleep(5000);
        new Select(driver.findElement(By.cssSelector("#dropdown-class-example"))).selectByVisibleText("Option1");//it is take from  b/w  the HTML tag's.
        Thread.sleep(5000);
        new Select(driver.findElement(By.cssSelector("#dropdown-class-example"))).selectByIndex(2);//it's taken from Index values of xpath or cssselectors.
        Thread.sleep(5000);
        new Select(driver.findElement(By.cssSelector("#dropdown-class-example"))).selectByValue("option3");//it will take attribute values
        Thread.sleep(5000);
        List<WebElement> ddElements = driver.findElements(By.cssSelector("#dropdown-class-example option"));

        System.out.println(ddElements.size());

        for(int i=0; i<ddElements.size(); i++) {

            String option = ddElements.get(i).getText();

            System.out.println(option);
            if (option.equalsIgnoreCase("option2")) {
                new Select(driver.findElement(By.cssSelector("#dropdown-class-example"))).selectByVisibleText(option);
                break;
            }
        }
    }


    @Test(priority = 1 , enabled = true)
    public void SelectSuggessionWord() throws Exception{
        driver.findElement(By.xpath("//div[@class='cen-left-align']/descendant::input")).sendKeys("In");
        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete')]/descendant::div"));
        System.out.println(elements.size());
        for (int i = 0; i < elements.size(); i++) {
            String autotext = elements.get(i).getText();
            //Thread.sleep(5000);
            if (autotext.equalsIgnoreCase("India")) {
                elements.get(i).click();
                break;
              /*
                String attribute = driver.findElement(By.xpath("//div[@class='cen-left-align']/descendant::input")).getAttribute("value");

                if (autotext.equalsIgnoreCase(attribute)) {
                    System.out.println("sucesfull");
                }
                else
                    System.out.println("not sucessfull");
            }*/
            }
        }
    }

    @Test(priority = 3 , enabled = true)
    public void ClickTabsButton() throws Exception{
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a.btn-style")).click();
        System.out.println(driver.getTitle());//It Will get the current page Title(name).
        System.out.println(driver.getCurrentUrl());//It Will get the current page URL of the page.
        String parentTab = driver.getWindowHandle();//It Will get the Id of the Page.eg:-C28DEF50FAD0990110C4A039AB84813D
        System.out.println(parentTab);
        Set<String> tabs = driver.getWindowHandles();
        System.out.println(tabs);
        for(String tab : tabs) {
            // System.out.println(tab);
            if(!tab.equals(parentTab)){
                driver.switchTo().window(tab);// Switchto() is used to Switch the page , window ,Tab and popup Box.
                //System.out.println(tab);
                System.out.println(driver.getTitle());
                Thread.sleep(5000);
                driver.close();
            }
        }
        driver.switchTo().window(parentTab);
        System.out.println(driver.getTitle());
    }


    @AfterSuite
    public void BrowserQuit() throws Exception{
        Thread.sleep(5000);
        driver.quit();
    }
}