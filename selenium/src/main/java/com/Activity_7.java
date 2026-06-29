package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/dynamic-controls");

        System.out.println("Title => "+driver.getTitle());

        WebElement textfield = driver.findElement(By.xpath("//input[contains(@id,'textInput')]"));

        System.out.println("Is textField enabled => "+textfield.isEnabled());
        
        driver.findElement(By.xpath("//button[text()='Enable Input']")).click();
        System.out.println("Input field enabled");
        
        System.out.println("Is textField enabled => "+textfield.isEnabled());

        textfield.sendKeys("Narayan");

        driver.quit();



    }
}
