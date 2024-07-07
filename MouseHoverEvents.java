package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHoverEvents {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();


        //https://demoqa.com/automation-practice-form
        //https://rahulshettyacademy.com/angularpractice/
        //https://rahulshettyacademy.com/angularpractice/shop
        //https://rahulshettyacademy.com/seleniumPractise/#/
        //https://rahulshettyacademy.com/seleniumPractise/#/
        //driver.get();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.cssSelector("#mousehover"));

        JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;


        //specific webelemt
        javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", element);

        // scroll down

        //<JavaScriptexecutor js = (JavascriptExecutor) driver;
        //javaScriptExecutor.executeScript("window.scrollTo(0, 450)");
        Thread.sleep(5000);


        //scroll up
        javaScriptExecutor.executeScript("window.scrollTo(450, 0)");



        //Actions action = new Actions(driver);


        //mouse hover to webelement


        //action.moveToElement(element).build().perform();

        // right click on web element

        //action.contextClick(element).build().perform();

        // double click on button

        //action.doubleClick(element).build().perform();

        // Drag and Drop

        //action.dragAndDrop(element1, element2).build().perform();

        Thread.sleep(3000);

        //driver.findElement(By.xpath("//a[text()='Reload']")).click();

        Thread.sleep(5000);

        //Thread.sleep(5000);

        //Thread.sleep(5000);

        driver.quit();
    }

}