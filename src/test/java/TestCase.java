import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

import java.io.IOException;

public class TestCase {
    @FindBy(id = "com.google.android.calculator:id/digit_8")
    MobileElement btn_8;
    @FindBy(id="com.google.android.calculator:id/digit_5")
    MobileElement btn_5;
    @FindBy(id="com.google.android.calculator:id/op_add")
    MobileElement btnPlus;
    @FindBy(id="com.google.android.calculator:id/result_preview")
    MobileElement result;
    public TestCase(AndroidDriver driver) throws IOException, InterruptedException
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public String openApp() throws InterruptedException, IOException {
        btn_8.click();
        btnPlus.click();
        btn_5.click();
        return result.getText();
    }

}
