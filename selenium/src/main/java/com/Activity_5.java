package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5 {
    public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/dynamic-controls");

        System.out.println("Title => "+driver.getTitle());

        WebElement checkboxElement = driver.findElement(By.id("checkbox"));

        System.out.println("Is checkbox visible => "+checkboxElement.isDisplayed());
        
        WebElement checkboxButton = driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
        checkboxButton.click();
        System.out.println("Is checkbox visible => "+checkboxElement.isDisplayed());

        driver.close();

    }
}
