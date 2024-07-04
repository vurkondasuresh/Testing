package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class WindowsAndTabs {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();

        //WebDriverManager.edgedriver().setup();

        WebDriver driver= new ChromeDriver();

        //driver.get();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize(); // TO Maximize the window or webPage

        System.out.println(driver.getTitle());// To get title of the page

        System.out.println(driver.getCurrentUrl()); // To get link(url) of current page

        driver.findElement(By.linkText("Open Tab")).click(); // i.e b/w html tags will call it as  text . To get that text  we are using linkText() method.

        String parentTab = driver.getWindowHandle();

        System.out.println(parentTab);

        Set<String> tabs = driver.getWindowHandles();

        System.out.println(tabs);

  //     for(dataType variable_Name : arrayOrCollection(object of collection or Arrays) int [] array = {1,2,3,4,5};
        for (String tab : tabs) {
            if (!tab.equals(parentTab)) {

                driver.switchTo().window(tab);

                System.out.println(driver.getTitle());

                driver.close();

            } else {
                //driver.switchTo().window(parentTab);

                System.out.println(driver.getTitle());
            }
        }

        driver.switchTo().window(parentTab);

        System.out.println(driver.getTitle());

        driver.quit();

    }
}
