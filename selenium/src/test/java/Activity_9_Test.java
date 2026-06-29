import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_9_Test {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	
	
	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		Reporter.log("Starting Test");
		driver.get("https://training-support.net/webelements/alerts");
		Reporter.log("Browser opened");
		Reporter.log("Page title => "+driver.getTitle());
	}
	
	@BeforeMethod
	public void switchToHome() {
		Reporter.log("Test case setup is started");
		driver.switchTo().defaultContent();
	}
	
	@Test
	public void testSimpleAlert() {
		Reporter.log("simpleAlertTestCase() Started");
        driver.findElement(By.xpath("//button[@id='simple']")).click();
		Reporter.log("simpleAlert opened");
        wait.until(ExpectedConditions.alertIsPresent());
        Reporter.log("Simple alert test executed");
	}
	
	@Test(priority = 1)
	public void testConfirmationAlert() {
		driver.findElement(By.xpath("//button[@id='confirmation']")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Reporter.log("confirmation alert test executed");
	
	
	
	Alert simpleAlert = driver.switchTo().alert();
    Reporter.log("Switched foucs to alert |");

    // Get text in the alert box and print it
    String alertText = simpleAlert.getText();
    Reporter.log("Alert text is: " + alertText + " |");

    // Assertion
    Assert.assertEquals("You've just triggered a simple alert!", alertText);

    simpleAlert.accept();
    Reporter.log("Alert closed");

    Reporter.log("Test case ended |");
}

@Test(priority = 2)
public void confirmAlertTestCase() {
    Reporter.log("confirmAlertTestCase() started |");
    // Click the button to open a simple alert
    driver.findElement(By.id("confirmation")).click();
    Reporter.log("Confirm Alert opened |");

    // Switch to alert window
    Alert confirmAlert = driver.switchTo().alert();
    Reporter.log("Switched foucs to alert |");

    // Get text in the alert box and print it
    String alertText = confirmAlert.getText();
    Reporter.log("Alert text is: " + alertText + " |");

    // Assertion
    Assert.assertEquals("You've just triggered a confirmation alert!", alertText);

    confirmAlert.accept();
    Reporter.log("Alert closed |");

    Reporter.log("Test case ended |");
}

@Test(priority = 3)
public void promptAlertTestCase() {
    Reporter.log("promptAlertTestCase() started |");
    // Click the button to open a simple alert
    driver.findElement(By.id("prompt")).click();
    Reporter.log("Prompt Alert opened |");

    // Switch to alert window
    Alert promptAlert = driver.switchTo().alert();
    Reporter.log("Switched foucs to alert |");

    // Get text in the alert box and print it
    String alertText = promptAlert.getText();
    Reporter.log("Alert text is: " + alertText + " |");

    // Assertion
    Assert.assertEquals("I'm a Prompt! Type something into me!", alertText);
    // Type some text into the prompt
    promptAlert.sendKeys("Awesome!");
    Reporter.log("Text entered in prompt alert |");
    // Close the prompt
    promptAlert.accept();
    Reporter.log("Alert closed |");

    Reporter.log("Test case ended |");
}
	
	
	@AfterClass
	public void exit() {
		driver.close();
	}
	
	
}
