package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Iframes {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //driver.get();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();

        // 3 ways we can switch frames

        //index  - 0,1, 2,3 etc..

        //name or id  - attribute value
        //webelement - driver.findElement(By.xpath(""));
        //index
        //driver.switchTo().frame(0);

        // idorname
        //driver.switchTo().frame("courses-iframe");

        //webelement
        driver.switchTo().frame(driver.findElement(By.xpath("//legend[text()='iFrame Example']/following-sibling::iframe")));

        Thread.sleep(5000);

        List<WebElement> element = driver.findElements(By.xpath("(//ul[@class='navigation clearfix'])[1]/li"));

        for (int i = 0; i < element.size(); i++) {
            String menus = element.get(i).getText();
            System.out.println(menus);
        }

        driver.findElement(By.xpath("//a[text()='JOIN NOW' and contains(@class,'btn-sm')]")).click();

        Thread.sleep(5000);

        driver.switchTo().defaultContent();

        driver.quit();
    }
}
