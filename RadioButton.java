package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.common.initializedfields.qual.EnsuresInitializedFields;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        //driver.get();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();

        List<WebElement> elements = driver.findElements(By.cssSelector(".radioButton"));

        System.out.println(elements.size());

        for (int i=0; i<elements.size(); i++) {

            elements.get(i).click();

            Thread.sleep(5000);

            if (elements.get(i).isSelected()) {
                System.out.println("Radio button "+i+" is selected");
            }
        }
    }
}
