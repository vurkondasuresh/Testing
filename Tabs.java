package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Tabs {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a.btn-style")).click();
        System.out.println(driver.getTitle());//It Will get the current page Title(name).
        System.out.println(driver.getCurrentUrl());//It Will get the current page URL of the page.
        String parentTab = driver.getWindowHandle();//It Will get the Id of the Page.eg:-C28DEF50FAD0990110C4A039AB84813D
        System.out.println(parentTab);
        Set<String> tabs = driver.getWindowHandles();
        System.out.println(tabs);
        for(String tab : tabs) {
           // System.out.println(tab);
            if(!tab.equals(parentTab)){
                driver.switchTo().window(tab);// Switchto() is used to Switch the page , window ,Tab and popup Box.
                //System.out.println(tab);
                System.out.println(driver.getTitle());
                Thread.sleep(5000);
                driver.close();
            }
        }
        driver.switchTo().window(parentTab);
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.quit();



    }
}
