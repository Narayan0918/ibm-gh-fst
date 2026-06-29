package com;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_21 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://training-support.net/webelements/tabs");

        String parentHandle = driver.getWindowHandle();

        driver.findElement(By.xpath("//button[contains(@class,'bg-purple-200 svelte-1bfwg86')]")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        
        Set<String> allTabHandles =  driver.getWindowHandles();
        
        System.out.println("Parent handle => "+parentHandle);
        
        for (String handle : allTabHandles) {
            if (!handle.equals(parentHandle)) {
                System.out.println("Handle => " + handle);
                driver.switchTo().window(handle);
            }
        }

        wait.until(ExpectedConditions.titleIs("New Tab!"));
        System.out.println("New Tab Text => "+ driver.findElement(By.xpath("//span[@class='font-bold']")).getText());

        driver.quit();

    }
}
