package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Challenge_activity_7_ChromeWebstore {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        driver.findElement(By.xpath("//a[contains(@class,'gb_C')]")).click();;

        WebElement iframeElement = driver.findElement(By.xpath("//iframe[@role='presentation']"));
        driver.switchTo().frame(iframeElement);

        driver.findElement(By.xpath("//*[@class='ngVsM HgTpd L2gNYe']//child::li[16]//child::a")).click();

        driver.switchTo().defaultContent();

    }
}
