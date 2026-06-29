import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class Activity_6_Test {
    WebDriver driver;
    
    // Setup function
    @BeforeClass
    public void setUp() {
        // Initialize Firefox driver
        driver = new FirefoxDriver();
        // Open the page
        driver.get("https://training-support.net/webelements/login-form");
    }
    
    // Test function
    @Test(priority = 1)
    @Parameters({"username","password"})
    public void homePageTest(String username , String password) {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='password']/following::button")).click();
        String messageH1 = driver.findElement(By.xpath("//h1[@class='text-center font-display text-6xl font-bold text-emerald-500']")).getText();
        String messageH2 = driver.findElement(By.xpath("//h2[@class='mt-5 text-center text-4xl font-semibold text-gray-800']")).getText();

        Assert.assertEquals("Login Success! Welcome Back, Admin!", (messageH1+" "+messageH2));

    }
    
    
    
    // Teardown function
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}


