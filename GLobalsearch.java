package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class GLobalsearch {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
        //driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input.search-keyword")).sendKeys("to");
        Thread.sleep(5000);
        //List<WebElement> options = driver.findElements(By.xpath("//h4[@class='product-name']/following-sibling::div[@class='product-action']/child::button[@type='button']"));
        List<WebElement> options = driver.findElements(By.cssSelector("h4.product-name"));
        System.out.println(options.size());
      /*  for (int i=0;i<2;i++)
        {
            driver.findElement(By.xpath("//div[@class='products-wrapper']/descendant::a[@class='increment']")).click();
        }*/

        for (int i = 0; i < options.size(); i++) {

            String product = options.get(i).getText();
            System.out.println(product);

            options.get(i).findElement(By.xpath("//button[text()='ADD TO CART']")).click();
            //if (product.equalsIgnoreCase("Tomato - 1 Kg")) {
                //driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
           // }
        }
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class='cart-icon']/child::img[@alt='Cart']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        Thread.sleep(5000);
        List<WebElement> price = driver.findElements(By.xpath("//div/div/b/following-sibling::span"));
        System.out.println(price.size());
        for (int i = 0; i < price.size(); i++) {

            String verify = price.get(i).getText();
            //System.out.println(verify);
            if (verify.equals("16")) {
                System.out.println("Success");
            }
            else {
                System.out.println("Not");
            }
        }
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        List<WebElement>option=driver.findElements(By.xpath("//div/select/option"));
        System.out.println(option.size());
        for (int i = 0; i < option.size(); i++) {
           String country = option.get(i).getText();
           // System.out.println(country);
            if (country.equalsIgnoreCase("India ")) {
                Thread.sleep(5000);
                new Select(driver.findElement(By.xpath("//div[@class='wrapperTwo']/descendant::select"))).selectByVisibleText("India");
                //Thread.sleep(5000);
                break;
            }
        }
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input.chkAgree")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
    }
}
