package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class TabsParctise {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a.btn-style")).click();
        String parentTab =  driver.getWindowHandle();
        System.out.println(parentTab);
        Set<String> tabs = driver.getWindowHandles();
        for (String suresh : tabs){
            if(!suresh.equals(parentTab)){
                Thread.sleep(5000);
                driver.switchTo().window(suresh);
                Thread.sleep(5000);
                driver.close();
            }
        }
        driver.switchTo().window(parentTab);
        Thread.sleep(5000);
        driver.quit();



    }
}
