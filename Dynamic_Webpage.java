package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Dynamic_Webpage {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        //driver.get();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();

        List<WebElement> tableRows= driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));

        System.out.println(tableRows.size());

        for (int i=1; i<=tableRows.size(); i++) {

            List<WebElement> tableColumns = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr["+(i+1)+"]/td"));

            for (int j=0; j<tableColumns.size(); j++) {

                String columnText = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+(i+1)+"]/td["+(j+1)+"]")).getText();

                //System.out.println(columnText);

                //if (columnText.equalsIgnoreCase("WebServices / REST API Testing with SoapUI")) {
                if (columnText.equalsIgnoreCase("35")) {

                    String course = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+(i+1)+"]/td["+(j+1)+"]/preceding-sibling::td[1]")).getText();

                    System.out.println(course);

                    break;
                }
            }
        }

        driver.quit();

    }
}
