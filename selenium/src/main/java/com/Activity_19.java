package com;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_19 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://training-support.net/webelements/alerts");

        
        driver.findElement(By.xpath("//button[@id='confirmation']")).click();
        Alert alert = driver.switchTo().alert();
        wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        alert.dismiss();

        driver.findElement(By.xpath("//button[@id='confirmation']")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        alert.accept();


        driver.quit();

    }
}
