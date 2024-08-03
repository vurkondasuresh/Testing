import org.junit.*;
import org.junit.jupiter.api.DisplayName;



public class Sample {

    @Before
    public  void setUp(){
        System.out.println("Before Method........");
    }

    @Test
    public void Start(){
        System.out.println("Start Method As Started........");
    }

    @Test
    @DisplayName("suresh")
    public void Close(){
        System.out.println("Close method as Started............");
    }
    
    @After
    public  void quit(){
        System.out.println("After Method.........");
    }
}
