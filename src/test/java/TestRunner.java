import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
//
@Test
public class TestRunner extends Setup {
    @Test
    public void runTest() throws IOException, InterruptedException {
        PageCalculation testCase=new PageCalculation(driver);
        //testCase.doSum();
        String result= testCase.doSum();
        Assert.assertEquals(result,"13");

    }
}
