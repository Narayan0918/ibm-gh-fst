package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_22 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://training-support.net/webelements/popups");

        System.out.println("Title => "+driver.getTitle());

        driver.findElement(By.xpath("//button[@id='launcher']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        username.sendKeys("admin");
        password.sendKeys("password");

        driver.findElement(By.xpath("//input[@id='password']/following::button")).click();

        System.out.println("message => "+driver.findElement(By.xpath("//h1[@class='text-center font-display text-6xl font-bold text-emerald-500']")).getText());
        System.out.println("message => "+driver.findElement(By.xpath("//h2[@class='mt-5 text-center text-4xl font-semibold text-gray-800']")).getText());


        
        driver.quit();




    }
}
