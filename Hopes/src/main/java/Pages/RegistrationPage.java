package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class RegistrationPage {
    private By permission = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]");

    AppiumDriver driver;
    public RegistrationPage(AppiumDriver driver) {
        this.driver = driver;
    }
    public void clickOnPermission() {
        driver.findElement(permission).click();
    }
}
