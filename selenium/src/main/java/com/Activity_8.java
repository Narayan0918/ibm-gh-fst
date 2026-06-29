package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_8 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/webelements/dynamic-controls");

        System.out.println("Title => "+driver.getTitle());

        System.out.println("Is checkbox visible => "+driver.findElement(By.id("checkbox")).isDisplayed());
        
        WebElement checkBox = driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
        checkBox.click();
        
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("checkbox")));
        System.out.println("Is checkbox visible => "+driver.findElement(By.id("checkbox")).isDisplayed());

        checkBox.click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox")));
        System.out.println("Is checkbox visible => "+driver.findElement(By.id("checkbox")).isDisplayed());

        driver.quit();

    }
}
