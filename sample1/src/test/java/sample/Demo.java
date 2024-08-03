package sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo {
    @Test(dataProvider = "dp1")
    public void sample(Object[] s)throws Exception {
        System.out.println(s[0]);
    }
    @DataProvider()
    public Object[] dp1(){
        Object[] data = new Object[]{
                1,
                2,
                3,
                "Suresh"
        };
        return data;
    }
}
