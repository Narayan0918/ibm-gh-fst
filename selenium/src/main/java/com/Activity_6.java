package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_6 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/dynamic-controls");

        System.out.println("Title => "+ driver.getTitle());
        
        WebElement checkBoxElement = driver.findElement(By.id("checkbox"));

        System.out.println("Is selected => "+checkBoxElement.isSelected());
        
        checkBoxElement.click();
        System.out.println("Checked the checkbox");

        System.out.println();
        
        System.out.println("Is selected => "+checkBoxElement.isSelected());


        driver.close();



    }
}
