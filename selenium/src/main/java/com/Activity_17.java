package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity_17 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/selects");
        WebElement dropdown = driver.findElement(By.xpath("//div[@class='mt-10 flex flex-1 flex-col items-center justify-around lg:mt-0'][2]/select"));
        Select select = new Select(dropdown);

        System.out.println();
        System.out.println("Title => "+driver.getTitle());

        select.selectByVisibleText("HTML");
        select.selectByIndex(3);
        select.selectByIndex(4);
        select.selectByIndex(5);
        select.selectByValue("Node");
        select.deselectByIndex(4);

        Thread.sleep(5000);
        driver.quit();





    }
}
