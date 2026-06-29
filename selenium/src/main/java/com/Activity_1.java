package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_1 {

    public static void main(String[] args) {

        // Create a new instance of the Firefo x driver
        WebDriver driver = new FirefoxDriver();
        // Open the browser
        driver.get("https://training-support.net/");
        
        System.out.println("Home page title => " +driver.getTitle());
        
        
        driver.findElement(By.linkText("About Us")).click();
        
        // element.click();

        System.out.println("New page title => "+driver.getTitle());

        // Perform testing and assertions
        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();

    }
}
