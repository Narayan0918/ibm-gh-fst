package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
// import org.openqa.selenium.chrome.ChromeOptions;
// import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Challege_Activity_NoOfResults {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

        driver.get("https://google.com");

        Actions builder = new Actions(driver);

        WebElement searchbar = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

        Action typeAction = builder.pause(2).click(searchbar).sendKeys("cheese").pause(2).sendKeys(Keys.ENTER).build();

        typeAction.perform();

        wait.until(ExpectedConditions.titleIs("cheese - Google Search"));

        builder.pause(Duration.ofSeconds(5)).build().perform();
        WebElement toolBotton = driver.findElement(By.xpath("//div[@id='hdtb-tls']//span[@class='R1QWuf']"));
        builder.click(toolBotton).build().perform();

        String result = driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
        System.out.println("Number of results => " + result);

        driver.quit();

    }

}
