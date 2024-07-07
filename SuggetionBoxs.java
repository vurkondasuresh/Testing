package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SuggetionBoxs {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
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
}
