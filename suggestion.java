package org.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class suggestion {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[contains(@class,'ui-autocomplete-input')]")).sendKeys("In");
        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(By.xpath("//ul/li[@class='ui-menu-item']"));
        Thread.sleep(3000);
        System.out.println(elements.size());
        for (int i = 0; i < elements.size(); i++) {
            Thread.sleep(5000);
            String options =  elements.get(i).getText();
            if (options.equalsIgnoreCase("india")) {
                Thread.sleep(2000);
                elements.get(i).click();
                System.out.println(options);
            }
        }
        driver.quit();
    }
}
