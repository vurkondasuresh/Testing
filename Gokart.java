package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Gokart {
    public static void main(String[] args) throws Exception {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ca");
        Thread.sleep(2000);
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        System.out.println(products.size());
        Thread.sleep(5000);
        //for(WebElement product : products)
        for (int i = 0; i < products.size(); i++) {
            String productText = products.get(i).getText();
            //Thread.sleep(5000);
            System.out.println(productText);

            if (productText.contains("Ca")) {
                driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
                System.out.println("As per criteria result matched.............");
            } else {
                System.out.println("As per criteria  Not result matched.............");
            }

        }
        List<WebElement> productPrices = driver.findElements(By.xpath("//h4[@class='product-name']/following-sibling::p"));
        System.out.println(productPrices.size());
        int pp1 = 0;
        Thread.sleep(2000);
        for (int i = 0; i < productPrices.size(); i++) {
            String pp = productPrices.get(i).getText();
            Thread.sleep(2000);
            //System.out.println(pp);
            pp1 += Integer.parseInt(pp);

        }
        /*System.out.println(pp1);
        Thread.sleep(2000);
        String totalPrice = driver.findElement(By.xpath("(//td/strong)[2]")).getText();
        System.out.println(totalPrice);*/

        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        Thread.sleep(2000);
        List<WebElement> total = driver.findElements(By.xpath("//tbody/tr/td[5]"));
        System.out.println("Prices total" + total.size());





        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
        Thread.sleep(5000);
        String totalPrice = driver.findElement(By.xpath("//span[@class='discountAmt']")).getText();
        double tottalPrice1 = Double.parseDouble(totalPrice);
        System.out.println(tottalPrice1);
        String finalPrice = driver.findElement(By.xpath("//span[@class='discountAmt']")).getText();
        double totalAfterDiscount = Double.parseDouble(finalPrice);

        if (tottalPrice1 == totalAfterDiscount) {
            System.out.println("Prices are Matched");
            driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        }
        Thread.sleep(5000);
        driver.quit();

    }
}
