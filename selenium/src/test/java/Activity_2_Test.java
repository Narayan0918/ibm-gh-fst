
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity_2_Test {
    WebDriver driver;

    @BeforeClass
    public void SetUp() {
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice/");
    }

    @Test
    public void checkTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Selenium: Target Practice");
    }

    @Test
    public void blackButtonFinding() {
        WebElement blackButton = driver.findElement(By.linkText("Black Button"));
        Assert.assertTrue(blackButton.isDisplayed());
    }

    @Test(enabled = false)
    public void skippedMethod() {
        Assert.assertEquals("hello", "hello");
    }

    @Test
    public void aSkipTest() throws SkipException {
        String condition = "Skip Test";

        if (condition.equals("Skip Test")) {
            throw new SkipException("Skipping - This is not ready for testing ");
        } else {
            // Execute test case when conditions are satisfied
        }
    }

    @AfterClass
    public void Termination() {
        driver.close();
    }

}
