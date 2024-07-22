package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sycronization {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        /*
           They  are four ways.
            Thread Sleep();
            Implicit wait
            explicit wait
            fluent wait
         */
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));//1.
        Thread.sleep(3000);//2.
        //explict wait
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofMillis(5));


       // wait.until(ExpectedConditions.visibilityOf(element));




    }
}
