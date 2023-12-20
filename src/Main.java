
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class Main {
    public static void main(String[] args) throws MalformedURLException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
         AppiumDriver driver = null;

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "J6AAGF009778SX4");
        cap.setCapability("platformName", "android");
        cap.setCapability("appPackage", "com.asus.calculator");
        cap.setCapability("appActivity", "com.asus.calculator.Calculator");
        driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);



        var el5 = driver.findElement(AppiumBy.id("com.asus.calculator:id/digit7"));
        el5.click();
        var el6 = driver.findElement(AppiumBy.accessibilityId("plus"));
        el6.click();
        var el7 = driver.findElement(AppiumBy.id("com.asus.calculator:id/digit5"));
        el7.click();
        var el8 = driver.findElement(AppiumBy.accessibilityId("equals"));
        el8.click();
    }
}