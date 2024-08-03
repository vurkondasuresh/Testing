import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Explicit Wait Create Object
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        driver.navigate().to("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.manage().window().maximize();



         driver.findElement(By.cssSelector("#btn1")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#btn1")))).click();
        driver.findElement(By.cssSelector("#btn2")).click();
        //driver.findElement(By.xpath("(//div/descendant::input[@id='txt1'])[1]")).sendKeys("vgsdhjk");
        driver.findElement(By.xpath("(//div/descendant::input[@id='txt2'])[1]")).sendKeys("vgsdhjk");
        //driver.quit();
    }
}
