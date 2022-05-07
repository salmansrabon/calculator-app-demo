import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestRunner extends Setup {
    @Test
    public void runTest() throws IOException, InterruptedException {
        PageCalculation testCase=new PageCalculation(driver);
        String result= testCase.doSum();
        Assert.assertEquals(result,"13");

    }
}
