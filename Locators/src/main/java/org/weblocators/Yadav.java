package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Yadav {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        List<WebElement> tablerows = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr"));
        System.out.println(tablerows.size());
        for (int i = 1; i <= tablerows.size(); i++) {
            List<WebElement> tablecolumns = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr[" + (i) + "]/td"));
            // System.out.println(tablecolumns.size());
            for (int j = 1; j <= tablecolumns.size(); j++) {
                String columntext = driver.findElement(By.xpath("//div[@class='tableFixHead']/table/tbody/tr[" + (i) + "]/td[" + (j) + "]")).getText();
              //  System.out.print(columntext + " ");
                if (columntext.equals("33")) {
                    String columnpro = driver.findElement(By.xpath("//div[@class='tableFixHead']/table/tbody/tr[" + (i) + "]/td[" + (j) + "]/preceding-sibling::td[2]")).getText();
                    System.out.println(columnpro);
                }

            }
            System.out.println();

        }
    }

}

