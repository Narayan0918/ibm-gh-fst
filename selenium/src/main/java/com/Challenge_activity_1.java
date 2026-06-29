package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Challenge_activity_1 {

    public static void main(String[] args) {

        // Create a new instance of the Firefo x driver
        WebDriver driver = new FirefoxDriver();
        // Open the browser
        driver.get("https://google.com");

        WebElement element = driver.findElement(By.id("APjFqb"));

        System.out.println("ID attribute => "+element.getAttribute("id"));
        System.out.println("Name attribute => "+element.getAttribute("name"));
        // Perform testing and assertions
        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();

    }
}
