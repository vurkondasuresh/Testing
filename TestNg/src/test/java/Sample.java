import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample {

    @BeforeClass
    public void setup(){
        System.out.println("setup a program.......");
    }

    @Test(priority = 1,enabled = false)
    public void start(){
        System.out.println("Started..........");
    }
    @Test
    public void close(){
        System.out.println("Close Method........");
    }
    @AfterClass
    public void quit(){
        System.out.println("Quit Method..........");
    }
}
