import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertButtons {
    public static void main(String[] args) throws Exception {

            WebDriverManager.chromedriver().setup();
            WebDriver driver= new ChromeDriver();
            //driver.get();
            driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

            driver.manage().window().maximize();

            driver.findElement(By.xpath("//legend[text()='Switch To Alert Example']/following-sibling::input[@id='name']")).sendKeys("venkat");

            driver.findElement(By.cssSelector("input#alertbtn")).click();

            Thread.sleep(5000);

            Alert alert = driver.switchTo().alert();

            String alertText = alert.getText();

            System.out.println(alertText);

            alert.accept();

            //alert.dismiss();

            Thread.sleep(5000);
            driver.findElement(By.xpath("//legend[text()='Switch To Alert Example']/following-sibling::input[@id='name']")).sendKeys("Automation");
            driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
            Alert confirmAlert = driver.switchTo().alert();
            String confirmAlertText = confirmAlert.getText();
            System.out.println(confirmAlertText);
            //confirmAlert.sendKeys("test123");
            confirmAlert.dismiss();
            driver.quit();
        }

    }
