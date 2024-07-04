package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public class urjent {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
        System.out.println(tableRows.size());
        for (int i = 0; i <= tableRows.size(); i++) {
            List<WebElement> tableColumns = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr["+(i+1)+"]/td"));
            //System.out.println(tableColumns.size());
            for (int j = 1; j <tableColumns.size(); j++) {
                String columnText = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+(i+1)+"]/td["+(j+1)+"]")).getText();
                //System.out.println(columnText);
                if (columnText.equalsIgnoreCase("Learn JMETER from Scratch - (Performance + Load) Testing Tool")) {
                    String course = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr/td[2]")).getText();
                    System.out.println(course);
                    break;
                }
            }
        }
    }
}
