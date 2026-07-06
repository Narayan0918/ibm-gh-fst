package AppiumTesting;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy.ByAccessibilityId;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Appium_Activity_2 {
AndroidDriver driver;
WebDriverWait wait;

@BeforeClass
public void setUp() throws MalformedURLException, URISyntaxException {
    UiAutomator2Options options = new UiAutomator2Options();
    options.setPlatformName("android");
    options.setAutomationName("UiAutomator2");
    options.setAppPackage("com.android.chrome");
    options.setAppActivity("com.google.android.apps.chrome.Main");
    options.noReset();

    URL serverURL = new URI("http://localhost:4723").toURL();

    driver = new AndroidDriver(serverURL, options);
    wait = new WebDriverWait(driver, Duration.ofSeconds(25));

    driver.get("https://training-support.net");
}

@Test
public void chromeTest() {
	wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text='Training Support']")));
    String pageHeading = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Training Support']")).getText();

    System.out.println("Heading: " + pageHeading);

    driver.findElement(AppiumBy.accessibilityId("About Us")).click();

    String aboutPageHeading = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='About Us']")).getText();
    System.out.println(aboutPageHeading);
}


@AfterClass
public void tearDown() {
    driver.quit();
}
}