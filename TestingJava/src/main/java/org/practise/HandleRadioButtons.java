package org.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleRadioButtons  {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        //By Xpath
        Thread.sleep(5000);
        driver.findElement(By.xpath("//fieldset/legend/following-sibling::label/child::input[@value='radio1']")).click();
        //By css
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[value='radio2']")).click();
        //By forloop
        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(By.xpath("//fieldset/legend/following-sibling::label/input[@name='radioButton']"));
        Thread.sleep(5000);
        System.out.println(elements.size());
        for(int i = 0; i < elements.size(); i++) {
            if (i == 2) {
                Thread.sleep(2000);
                elements.get(i).click();
                if (elements.get(i).isSelected()) {
                    System.out.println(" Radio " +i+ " is selected");
                }
            }
        }
        driver.quit();
    }
}
