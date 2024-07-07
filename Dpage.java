package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Dpage {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr"));
        System.out.println(tableRows.size());
        for (int i = 1; i <= tableRows.size(); i++) {
            List<WebElement> tableColoums = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr["+(i+1)+"]/td"));
            //System.out.println(tableColoums.size());
            for (int j = 0; j < tableColoums.size(); j++) {
                String columnText = driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr["+(i+1)+"]/td["+(j+1)+"]")).getText();
                //System.out.println(columnText);
                if(columnText.equalsIgnoreCase("35")){
                    String course = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+(i+1)+"]/td["+(j+1)+"]/preceding-sibling::td[1]")).getText();
                    System.out.println(course);
                    break;
                }
            }
        }
    }
}
