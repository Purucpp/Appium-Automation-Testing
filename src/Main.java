
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws MalformedURLException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
         AppiumDriver driver = null;

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "J6AAGF009778SX4");
        cap.setCapability("platformName", "android");
        cap.setCapability("appPackage", "com.kt_goi_shc");
        cap.setCapability("appActivity", ".ui.login.KtLoginActivity");
        driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);





        var el1 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/radioShc"));
        el1.click();
        var el2 = driver.findElement(AppiumBy.accessibilityId("Show drop-down menu"));
        el2.click();
        var el3 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/et_email"));
        el3.click();
        var el4 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/et_email"));
        el4.click();
        el4.sendKeys("meghstl");
        driver.executeScript("mobile: pressKey", Map.ofEntries(Map.entry("keycode", 4)));
        var el5 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/et_password"));
        el5.click();
        el5.sendKeys("Test@1234");
        driver.executeScript("mobile: pressKey", Map.ofEntries(Map.entry("keycode", 4)));
        var el6 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/btnLogin"));
        el6.click();
        var el7 = driver.findElement(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.kt_goi_shc:id/rl_farmerRegistration\"]/android.widget.LinearLayout"));
        el7.click();
        var el8 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageButton[@content-desc=\"Show drop-down menu\"])[1]"));
        el8.click();
        var el9 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/tv_blockName"));
        el9.click();
        var el10 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageButton[@content-desc=\"Show drop-down menu\"])[2]"));
        el10.click();
        var el11 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/btn_submit"));
        el11.click();
        var el12 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/btn_submit"));
        el12.click();
        var el13 = driver.findElement(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.kt_goi_shc:id/rl_farmerRegistration\"]/android.widget.LinearLayout"));
        el13.click();
        var el14 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/edit_txtName"));
        el14.sendKeys("Purushottam Kumar");
        var el15 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageButton[@content-desc=\"Show drop-down menu\"])[1]"));
        el15.click();
        var el16 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/edit_txtPhone"));
        el16.click();
        var el17 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/edit_txtPhone"));
        el17.sendKeys("8130461500");
        var el18 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/tv_villageName"));
        el18.click();
        var el19 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/textinput_placeholder"));
        el19.click();
        var el20 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/et_address"));
        el20.sendKeys("Mangalore");
        var el21 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/submit"));
        el21.click();
        var el22 = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Sample Collection\"])[2]"));
        el22.click();
        el22.click();
        var el23 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/mtv_userName"));
        el23.click();
        el23.sendKeys("8130461500");
        var el24 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/btn_submit"));
        el24.click();
        var el25 = driver.findElement(AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.kt_goi_shc:id/farmersRecyclerView\"]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]"));
        el25.click();
        var el26 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/img_location1"));
        el26.click();
        var el27 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageButton[@content-desc=\"Show drop-down menu\"])[2]"));
        el27.click();
        var el28 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/tv_address1"));
        el28.click();
        var el29 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/et_surveyNumber1"));
        el29.sendKeys("223344");
        var el30 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageButton[@content-desc=\"Show drop-down menu\"])[3]"));
        el30.click();
        var el31 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/et_mandal"));
        el31.click();
        var el32 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageButton[@content-desc=\"Show drop-down menu\"])[3]"));
        el32.click();
        var el33 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/et_areaSize1"));
        el33.click();
        var el34 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/et_areaSize1"));
        el34.click();
        el34.sendKeys("222");
        var el35 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/img_upload"));
        el35.click();
        var el36 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/btn_collectSoilSample"));
        el36.click();
        var el37 = driver.findElement(AppiumBy.id("android:id/button2"));
        el37.click();


    }
}