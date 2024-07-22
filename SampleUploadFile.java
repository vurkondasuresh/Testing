package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SampleUploadFile {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://uploadnow.io/upload");
        driver.manage().window().maximize();
        //Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Add files']")).click();
       // Thread.sleep(7000);
        Runtime.getRuntime().exec("C:\\Users\\sures\\OneDrive\\Desktop\\AutoFileUpload1.exe");
        //Thread.sleep(5000);
        driver.findElement(By.xpath("(//button[contains(@class,'buttons_btn__k25BR')])[9]")).click();
       // Thread.sleep(7000);
        driver.quit();

    }
}
