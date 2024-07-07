package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.util.List;

public class suggestionBox {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("In");//SendKey is used to pass the text to text box or search box or inputBox.

        Thread.sleep(5000);
        /*
          ul[class*='ui-autocomplete'] li div -css
          //ul[contains(@class,'ui-autocomplete')]/descendant::div - xpath
         */

        List<WebElement> autoOptions = driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete')]/descendant::div"));
        System.out.println(autoOptions.size());

        for (int i=0; i<autoOptions.size(); i++) {
            String autoText = autoOptions.get(i).getText();
            System.out.println(autoText);
            if (autoText.equals("India")) {
                autoOptions.get(i).click();
               // System.out.println();
                //System.out.println(autoText);
                String autoAttributeValue = driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value");
                //System.out.println(autoAttributeValue);
                if (autoText.equalsIgnoreCase(autoAttributeValue)) {
                    System.out.println("Expected and Actual values are matched");
                } else {
                    System.out.println("Expected and Actual values are not matched");
                }
            }
        }
    }
}
