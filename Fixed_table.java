package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Fixed_table {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        //driver.manage().window().maximize();
        List<WebElement> tableRows = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr"));
        //System.out.println(tableRows.size());
        for (int i = 0; i <= tableRows.size(); i++) {
            List<WebElement> tableColumn=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr["+(i)+"]/td"));
            //System.out.println(tableColumn.size());
            for (int j = 1; j <= tableColumn.size() ; j++) {
                String tableContent = driver.findElement(By.xpath("//div[@class='tableFixHead']/table/tbody/tr["+(i)+"]/td["+(j)+"]")).getText();
                //System.out.println(tableContent);
                if (tableContent.equalsIgnoreCase("33")) {
                    String city = driver.findElement(By.xpath("//div[@class='tableFixHead']/table/tbody/tr["+(i)+"]/td["+(j)+"]/preceding-sibling::td[3]")).getText();
                    System.out.println(city);
                    break;
                }
            }

        }

    }
}
