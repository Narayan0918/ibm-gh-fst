package com;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_20 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://training-support.net/webelements/alerts");

        
        driver.findElement(By.xpath("//button[@id='prompt']")).click();
        Alert alert = driver.switchTo().alert();
        wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("Awesome!");
        alert.accept();



        driver.quit();

    }
}
