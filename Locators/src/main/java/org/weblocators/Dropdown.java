package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        //driver.get();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();
        Thread.sleep(5000);
        new Select(driver.findElement(By.cssSelector("#dropdown-class-example"))).selectByVisibleText("Select");
        Thread.sleep(5000);
        new Select(driver.findElement(By.cssSelector("#dropdown-class-example"))).selectByVisibleText("Option1");
        Thread.sleep(5000);
        new Select(driver.findElement(By.cssSelector("#dropdown-class-example"))).selectByIndex(2);
        Thread.sleep(5000);
        new Select(driver.findElement(By.cssSelector("#dropdown-class-example"))).selectByValue("option3");
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
        //driver.quit();
    }
}
