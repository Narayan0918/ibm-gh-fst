package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_2 {

    public static void main(String[] args) {

        // Create a new instance of the Firefo x driver
        WebDriver driver = new FirefoxDriver();
       
        driver.get("https://training-support.net/webelements/login-form/");
        System.out.println();
        System.out.println(driver.getTitle());

        WebElement element1 = driver.findElement(By.name("username"));
        element1.sendKeys("admin");
        
        WebElement element2 = driver.findElement(By.name("password"));
        
        element2.sendKeys("password");
//  //*[@id="username"]
        driver.findElement(By.className("svelte-1pdjkmx")).click();

        System.out.println("Login Successful");
        
        driver.quit();

    }
}
