package sample2;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleSynchronization {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        //driver.get();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

        // Thread sleep
        //implicit wait
        //explict wait
        //fluent wait



        driver.manage().window().maximize();


        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

        new Select(driver.findElement(By.cssSelector("#dropdown-class-example"))).selectByVisibleText("Option2");


        //Thread.sleep(5000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // explict wat
        WebElement element = driver.findElement(By.cssSelector("#dropdown-class-example"));

        //wait.until(ExpectedConditions.visibilityOf(element));
// wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("")))).click();
        // Fluent Wait


        Wait<WebDriver>  fluentWait  = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

        fluentWait.until(ExpectedConditions.visibilityOf(element));


        new Select(element).selectByValue("option1");

        //Thread.sleep(5000);

        List<WebElement> ddElements = driver.findElements(By.cssSelector("#dropdown-class-example option"));

        System.out.println(ddElements.size());

        for (int i=0; i<ddElements.size(); i++) {

            String option = ddElements.get(i).getText();

            System.out.println(option);
            if (option.equalsIgnoreCase("option2")) {
                new Select(driver.findElement(By.cssSelector("#dropdown-class-example"))).selectByVisibleText(option);
                break;
            }
        }

        fluentWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='autocomplete']"))));
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Ind");

        Thread.sleep(5000);

        //ul[class*='ui-autocomplete'] li div
        ////ul[contains(@class,'ui-autocomplete')]/descendant::div

        List<WebElement> autoOptions = driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete')]/descendant::div"));

        for (int i=0; i<autoOptions.size(); i++) {
            String autoText = autoOptions.get(i).getText();

            System.out.println(autoText);

            if (autoText.equals("India")) {
                autoOptions.get(i).click();

                String autoAttributeValue = driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value");

                if (autoText.equalsIgnoreCase(autoAttributeValue)) {
                    System.out.println("Expected and Actual values are matched");
                } else {
                    System.out.println("Expected and Actual values are not matched");
                }
            }
        }

        List<WebElement> elements = driver.findElements(By.cssSelector(".radioButton"));

        System.out.println(elements.size());

        for (int i=0; i<elements.size(); i++) {

            elements.get(i).click();

            Thread.sleep(5000);

            if (elements.get(i).isSelected()) {
                System.out.println("Radio button "+i+" is selected");
            }
        }

        driver.quit();
    }

}
