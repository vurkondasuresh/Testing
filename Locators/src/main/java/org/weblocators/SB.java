package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class SB {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input.ui-autocomplete-input")).sendKeys("IND");
        List<WebElement> elements =driver.findElements(By.cssSelector("ul#ui-id-1 li div"));
        System.out.println(elements.size());
        for (int i=0;i< elements.size();i++){
            String autoOption = elements.get(i).getText();
            System.out.println(autoOption);
            if(autoOption.equals("India")){

            }
        }
    }
}
