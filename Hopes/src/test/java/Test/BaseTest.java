package Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.net.URL;

public class BaseTest {
    public static AppiumDriver driver;
    WebDriverWait wait;
    AndroidTouchAction actions;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app", "E:\\Testng\\Hopes\\resources\\apps\\noon shopping_3.66 (1412)_Apkpure.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        wait = new WebDriverWait(driver, 60);
        actions = new AndroidTouchAction(driver);
        Thread.sleep(3000);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}