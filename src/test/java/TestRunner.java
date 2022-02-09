import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestRunner extends AppLaunch {
    @Test
    public void runTest() throws IOException, InterruptedException {
        TestCase testCase=new TestCase(driver);
        String result= testCase.openApp();
        Assert.assertEquals(result,"13");

    }
}
