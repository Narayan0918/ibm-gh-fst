package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity_12 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);

        driver.get("https://training-support.net/webelements/drag-drop");

        System.out.println("Title => "+driver.getTitle());

        WebElement ball = driver.findElement(By.id("ball"));
        WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
        
        WebElement dropzoneSpan1 = driver.findElement(By.xpath("//div[@id='dropzone1']//child::span"));
        WebElement dropzoneSpan2 = driver.findElement(By.xpath("//div[@id='dropzone2']//child::span"));

        System.out.println("Ball dropped in dropzone1 => "+dropzoneSpan1.getText());
        System.out.println("Ball dropped in dropzone2 => "+dropzoneSpan2.getText());
        
        Action dragAndDropAction1 = builder.clickAndHold(ball).dragAndDrop(ball, dropzone1).build();
        
        dragAndDropAction1.perform();
        
        Action dragAndDropAction2 = builder.clickAndHold(ball).dragAndDrop(ball, dropzone2).build();
        
        dragAndDropAction2.perform();

        System.out.println("Ball dropped in dropzone1 => "+dropzoneSpan1.getText());
        System.out.println("Ball dropped in dropzone2 => "+dropzoneSpan2.getText());

        driver.quit();




    }
}
