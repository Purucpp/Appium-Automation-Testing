
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
//        cap.setCapability("appActivity", ".ui.home.KtMainActivity");
        driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);


        testCaseOne(driver);

        importExport(driver);




    }

    public static void importExport(AppiumDriver driver) throws InterruptedException {

        TimeUnit.SECONDS.sleep(8);

        var el1 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/menuIcon"));
        el1.click();
        var el2 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Soil Sample Collection\"]"));
        el2.click();
        var el3 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/exp_"));
        el3.click();
        var el4 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/farmer_delete"));
        el4.click();
        var el5 = driver.findElement(AppiumBy.id("android:id/button1"));
        el5.click();
        var el6 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/imp_"));
        el6.click();
        var el7 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/farmer_edit"));
        el7.click();

        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start = new Point(1018, 1516);
        var end = new Point (1030, 802);
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));


//        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var tapPoint = new Point(432, 1535);
        var tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint.x, tapPoint.y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(finger, Duration.ofMillis(50)));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap));

        var el8 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/et_address"));
        el8.sendKeys("Delhi");
        var el9 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/submit"));
        el9.click();
        var el10 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/menuIcon"));
        el10.click();
        var el11 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Services\"]"));
        el11.click();

//        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
         start = new Point(964, 1855);
         end = new Point (980, 1142);
         swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));

        var el12 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/plot_edit"));
        el12.click();

//        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
         start = new Point(1026, 1624);
         end = new Point (1018, 795);
         swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));

        var el13 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageButton[@content-desc=\"Show drop-down menu\"])[3]"));
        el13.click();
        var el14 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/tv_soilType"));
        el14.click();
        var el15 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/et_areaSize1"));
        el15.sendKeys("55");

//        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
         start = new Point(1003, 1612);
         end = new Point (1022, 791);
         swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));

        var el16 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/btn_collectSoilSample"));
        el16.click();
        var el17 = driver.findElement(AppiumBy.id("android:id/button1"));
        el17.click();
    }

    public static void testCaseOne(AppiumDriver driver) throws InterruptedException {
        TimeUnit.SECONDS.sleep(8);
        splashScreen(driver);

        TimeUnit.SECONDS.sleep(5);
        login(driver);

        TimeUnit.SECONDS.sleep(10);
        downloadVillage(driver);

        TimeUnit.SECONDS.sleep(10);
        registerFarmer(driver);
        TimeUnit.SECONDS.sleep(10);
        registerPlot(driver);
    }


    public static void login(AppiumDriver driver)
    {
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
    }

    public static void downloadVillage(AppiumDriver driver) throws InterruptedException {
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
    }

    public static void registerPlot(AppiumDriver driver) throws InterruptedException {
        var el22 = driver.findElement(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.kt_goi_shc:id/rl_sampleCollection\"]/android.widget.LinearLayout"));
        el22.click();
        var el33 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/mtv_userName"));
        el33.sendKeys("8130461500");
        var el44 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/btn_submit"));
        el44.click();
        TimeUnit.SECONDS.sleep(2);
        var el55 = driver.findElement(AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.kt_goi_shc:id/farmersRecyclerView\"]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]"));
        el55.click();

        TimeUnit.SECONDS.sleep(3);

        var el3 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageButton[@content-desc=\"Show drop-down menu\"])[2]"));
        el3.click();
        var el4 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/tv_address1"));
        el4.click();
        var el5 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/myCheckbox"));
        el5.click();
        var el6 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/et_surveyNumber1"));
        el6.sendKeys("445566");
        var el7 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageButton[@content-desc=\"Show drop-down menu\"])[3]"));
        el7.click();
        var el8 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/et_mandal"));
        el8.click();

        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start = new Point(999, 1890);
        var end = new Point (1018, 509);
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));

        var el9 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageButton[@content-desc=\"Show drop-down menu\"])[2]"));
        el9.click();
        var el10 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/et_areaSize1"));
        el10.click();
        el10.sendKeys("44");
        var el11 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/img_upload"));
        el11.click();

        TimeUnit.SECONDS.sleep(15);

       swipeOne(driver);

        var el12 = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/btn_collectSoilSample"));
        el12.click();

        TimeUnit.SECONDS.sleep(3);
        var el13 = driver.findElement(AppiumBy.id("android:id/button1"));
        el13.click();

    }

    public static void splashScreen(AppiumDriver driver) throws InterruptedException {
        var eper = driver.findElement(AppiumBy.id("com.android.packageinstaller:id/permission_allow_button"));

        if(eper.isDisplayed())
        {
            eper.click();
        }

        if(eper.isDisplayed())
        {
            eper.click();
        }

        if(eper.isDisplayed())
        {
            eper.click();
        }

        if(eper.isDisplayed())
        {
            eper.click();
        }

        TimeUnit.SECONDS.sleep(5);
        // skip
        var elskip = driver.findElement(AppiumBy.id("com.kt_goi_shc:id/skip"));
        if(elskip.isDisplayed())
        {
            elskip.click();
        }else{
            TimeUnit.SECONDS.sleep(4);
            elskip.click();
        }

    }

    public static void swipeOne(AppiumDriver driver)
    {
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start = new Point(1014, 1686);
        var end = new Point (1026, 1419);
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
    }

    public static void registerFarmer(AppiumDriver driver) throws InterruptedException {

        try{
            var el13 = driver.findElement(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.kt_goi_shc:id/rl_farmerRegistration\"]/android.widget.LinearLayout"));
            el13.click();
        }catch (Exception e)
        {
            TimeUnit.SECONDS.sleep(15);

            var el13 = driver.findElement(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.kt_goi_shc:id/rl_farmerRegistration\"]/android.widget.LinearLayout"));
            el13.click();
        }



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
}