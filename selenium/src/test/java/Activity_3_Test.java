import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity_3_Test {
    
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form/");
    }

    @Test
    public void testLogin(){
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

        username.sendKeys("admin");
        password.sendKeys("password");

        driver.findElement(By.xpath("//form/button")).click();
        
        String messageH1 = driver.findElement(By.xpath("//h1[@class='text-center font-display text-6xl font-bold text-emerald-500']")).getText();
        String messageH2 = driver.findElement(By.xpath("//h2[@class='mt-5 text-center text-4xl font-semibold text-gray-800']")).getText();

        Assert.assertEquals("Login Success! Welcome Back, Admin!", (messageH1+" "+messageH2));

    }

    @AfterClass
    public void termination(){
        driver.close();
    }

}
