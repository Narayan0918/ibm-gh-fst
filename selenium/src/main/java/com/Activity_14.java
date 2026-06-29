package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity_14 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);


        driver.get("https://training-support.net/webelements/tables");
        System.out.println();
        System.out.println("Title => "+driver.getTitle());

        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));

        System.out.println("Numberpf rows => "+rows.size());
        System.out.println("Numberpf cols => "+cols.size());


        WebElement fifthRowBook = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
        System.out.println("Bok name of 5th row => "+fifthRowBook.getText());
        
        WebElement priceHeader = driver.findElement(By.xpath("//table/thead/tr/th[5]"));
        Action clickPriceHeaderAction = builder.click(priceHeader).build();
        clickPriceHeaderAction.perform();
        
        WebElement fifthRowBookAfterClick = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));

        System.out.println("Book name of 5th row after sorting prices => "+fifthRowBookAfterClick.getText());


        driver.quit();

    }
}
