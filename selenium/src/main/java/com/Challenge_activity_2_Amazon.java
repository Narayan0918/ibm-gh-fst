package com;

import java.lang.Thread;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Challenge_activity_2_Amazon {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.amazon.in/");

        System.out.println("Title => " + driver.getTitle());
        Thread.sleep(2000);
        WebElement textfield = driver.findElement(By.id("twotabsearchtextbox"));
        textfield.sendKeys("i phone 17 pro");
        driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]")).click();

        WebElement fourthElementPrice = driver.findElement(By.xpath("(//span[contains(@class,'a-price')])[4]"));
        System.out.println("Price of fourth element => " + fourthElementPrice.getText());

        driver.quit();
    }
}
