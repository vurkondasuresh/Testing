package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class MousePractice {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.cssSelector("#mousehover"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        //Thread.sleep(5000);
        //For ScrollUp.
       //javascriptExecutor.executeScript("window.scrollTo(0, 450)");
        //For ScrollDown.
        Thread.sleep(5000);
        javascriptExecutor.executeScript("window.scrollTo(450,0)");
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
       // action.contextClick(element).build().perform();//Right Click
        action.doubleClick(element).build().perform();

    }
}
