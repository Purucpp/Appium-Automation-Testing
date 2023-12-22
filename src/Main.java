
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
         AppiumDriver driver = null;

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "J6AAGF009778SX4");
        cap.setCapability("platformName", "android");
        cap.setCapability("appPackage", "com.kt_goi_shc");
        cap.setCapability("appActivity", ".ui.splash.KtSplashScreen");
        driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);


        TimeUnit.SECONDS.sleep(5);

        var eper = driver.findElement(AppiumBy.id("com.android.packageinstaller:id/permission_allow_button"));
        eper.click();
        eper.click();
        eper.click();
        eper.click();

        TimeUnit.SECONDS.sleep(5);
        // skip
        var elskip = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/skip"));
        elskip.click();

        TimeUnit.SECONDS.sleep(5);

        /// login done
        var el1 = driver.findElement(AppiumBy.accessibilityId("Show drop-down menu"));
        el1.click();
        var el2 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/et_email"));
        el2.click();
        var el3 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/et_email"));
        el3.sendKeys("meghstl");
        var el4 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/et_password"));
        el4.sendKeys("Test@1234");
        var el5 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/btnLogin"));
        el5.click();


        TimeUnit.SECONDS.sleep(10);

        // register farmer
        var el7 = driver.findElement(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.kt_goi_shc:id/rl_farmerRegistration\"]/android.widget.LinearLayout"));
        el7.click();
        var el8 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageButton[@content-desc=\"Show drop-down menu\"])[1]"));
        el8.click();
        var el9 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/tv_blockName"));
        el9.click();
        TimeUnit.SECONDS.sleep(10);
        var el10 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageButton[@content-desc=\"Show drop-down menu\"])[2]"));
        el10.click();
        var el11 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/btn_submit"));
        el11.click();
        var el12 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/btn_submit"));
        el12.click();

        TimeUnit.SECONDS.sleep(10);


        // register farmer click
        var el13 = driver.findElement(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.kt_goi_shc:id/rl_farmerRegistration\"]/android.widget.LinearLayout"));
        el13.click();



        var el22 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/edit_txtName"));
        el22.sendKeys("Purushottam Kumar");

        var el23 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageButton[@content-desc=\"Show drop-down menu\"])[1]"));
        el23.click();
        var el24 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/rlClickConsumer"));
        el24.click();

        var el25= driver.findElement(AppiumBy.id("com.kt_goi_shc:id/edit_txtPhone"));
        el25.sendKeys("8130461500");

        //swipe
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start = new Point(1034, 1805);
        var end = new Point (1030, 822);
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));



        var el26 = driver.findElement(AppiumBy.accessibilityId("Show drop-down menu"));
        el26.click();

        var el27 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Farmer Registration\"]"));
        el27.click();
        var el28 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/et_address"));
        el28.sendKeys("Mangalore");

        var el29 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/submit"));
        el29.click();


    }

    public void registerFarmer()
    {

    }
}