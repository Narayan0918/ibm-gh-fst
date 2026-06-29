package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_15 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://training-support.net/webelements/dynamic-attributes");

        System.out.println();
        System.out.println("Title => "+driver.getTitle());

        WebElement username = driver.findElement(By.xpath("//input[starts-with(@id,'full-name')]"));
        username.sendKeys("Narayan");
        
        WebElement email = driver.findElement(By.xpath("//input[contains(@id,'email')]"));
        email.sendKeys("Narayanrajdubey9889@gmail.com");

        WebElement date = driver.findElement(By.xpath("//input[@type='date']"));
        date.sendKeys("2026-07-13");

        WebElement additional = driver.findElement(By.xpath("//textarea[contains(@id,'additional-details')]"));
        additional.sendKeys("My name is Narayan");

        WebElement submitButton = driver.findElement(By.xpath("//button[@class = 'font-bold svelte-7bqce9']"));
        submitButton.click();

        System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@id='action-confirmation']"))).getText());

        driver.quit();

    }
}
