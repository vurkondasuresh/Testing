package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Iframe {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        //driver.manage().window().maximize();
        driver.switchTo().frame(0);
        List<WebElement> elements = driver.findElements(By.xpath("(//ul[@class='navigation clearfix'])[1]/li"));
        System.out.println(elements.size());
        for (int i = 0; i < elements.size(); i++) {
            String menus = elements.get(i).getText();
            System.out.println(menus);
        }
        driver.findElement(By.xpath("//a[text()='JOIN NOW' and contains(@class,'btn-theme')]")).click();
        ////header[contains(@class,'jumbotron')]
    }
}
