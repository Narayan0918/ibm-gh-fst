package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Challenge_Activity_flipkart {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);

        driver.get("https://flipkart.com");

        WebElement searchbar = driver.findElement(By.xpath("//div[@class='Afujtw']//child::input"));
        WebElement searchbutton = driver.findElement(By.xpath("//div[@class='VCplLH mIK8ju']/child::button"));

        Action searchAction = builder.pause(Duration.ofSeconds(5)).sendKeys(Keys.ESCAPE).click(searchbar).sendKeys(searchbar, "canon d1200").click(searchbutton).pause(Duration.ofSeconds(5)).sendKeys(Keys.ESCAPE).build();
        searchAction.perform();

        String productName = driver.findElement(By.xpath("(//div[@class='RG5Slk'])[4]")).getText();
        System.out.println("Product => "+productName);

        String price = driver.findElement(By.xpath("(//div[@class='hZ3P6w DeU9vF'])[4]")).getText();
        System.out.println("Price => "+price);


        driver.close();


    }
}
