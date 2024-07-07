package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Mallikarjun {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        List<WebElement>tablerows=driver.findElements(By.xpath("//table[@name='courses']/descendant::tr"));
        System.out.println(tablerows.size());
        for (int i=0;i<=tablerows.size();i++)
        {
            List<WebElement> tablecolums =driver.findElements(By.xpath("//table[@name='courses']/tbody/tr["+(i+1)+"]/td"));
            //System.out.println(tablecolums.size());
            for (int j=1;j<=tablecolums.size();j++)
            {
                String columntext=driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+(i+1)+"]/td["+(j)+"]")).getText();
                System.out.println(columntext);
                if (columntext.equalsIgnoreCase("35"))
                {
                    String columncourse=driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+(i+1)+"]/td["+(j)+"]/preceding-sibling::td[1]")).getText();
                    System.out.println(columncourse);
                    break;
                }
            }
        }


    }
}
