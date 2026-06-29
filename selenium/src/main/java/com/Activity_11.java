package com;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_11 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        driver.get("https://training-support.net/webelements/keyboard-events");
        System.out.println("Title => "+driver.getTitle());

        WebElement textarea = driver.findElement(By.xpath("//p[@id='result']//parent::div//child::h1"));

        Action sendTexAction = builder.sendKeys(textarea, "Narayan").build();
        sendTexAction.perform();

        System.out.println("Text entered => "+ wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='result']//parent::div//child::h1"))).getText());
        driver.quit();
    }
    
}
