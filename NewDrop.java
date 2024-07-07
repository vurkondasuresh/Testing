package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewDrop {
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/droppable");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement element1 = driver.findElement(By.cssSelector("#draggable"));
        Thread.sleep(5000);
        WebElement element2 = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
        Thread.sleep(5000);
        Actions actions = new Actions(driver);
        Thread.sleep(5000);
        actions.dragAndDrop(element1, element2).build().perform();
        Thread.sleep(5000);
        driver.quit();
    }
}
