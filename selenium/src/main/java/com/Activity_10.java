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

public class Activity_10 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        driver.get("https://training-support.net/webelements/mouse-events");

        System.out.println("Title => "+driver.getTitle());

        WebElement CargoLock = driver.findElement(By.xpath("//div[@class='file'][1]"));
        WebElement CargoToml = driver.findElement(By.xpath("//div[@class='file'][2]"));
        WebElement srcButton = driver.findElement(By.xpath("//div[@class='file'][3]"));
        WebElement targetButton = driver.findElement(By.xpath("//div[@class='file'][4]"));
        
        Action clickOnCargo = builder.moveToElement(CargoLock).click(CargoLock).moveToElement(CargoToml).click(CargoToml).build();
        clickOnCargo.perform();
        System.out.println("Result => " +wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result"))).getText());
        
        Action doubleClick = builder.moveToElement(srcButton).doubleClick(srcButton).moveToElement(targetButton).contextClick(targetButton).build();
        doubleClick.perform();
        System.out.println("Result => " +wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result"))).getText());
        
        
        WebElement openButton = driver.findElement(By.xpath("//div[@id='menu']/div/ul/li/button"));
        Action openClick = builder.moveToElement(openButton).click(openButton).build();
        openClick.perform();
        

        driver.quit();


    }
}
