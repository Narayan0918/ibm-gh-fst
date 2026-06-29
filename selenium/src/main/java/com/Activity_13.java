package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_13 {
    public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tables");

        System.out.println();
        System.out.println("Title => "+driver.getTitle());

        List<WebElement> rows= driver.findElements(By.xpath("//table/tbody/tr"));
        List<WebElement> cols= driver.findElements(By.xpath("//table/tbody/tr[1]/td"));

        System.out.println("Number of Rows => "+rows.size());
        System.out.println("Number of Cols => "+cols.size());

        List<WebElement> thirdRowElements = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
        
        System.out.print("3rd row Data => ");
        
        for (WebElement data : thirdRowElements) {
            System.out.print(data.getText()+", ");
        }
        
        WebElement secondRowSecondColElements = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
        System.out.println();
        System.out.println("Second column second row data => "+ secondRowSecondColElements.getText());

        driver.quit();

    }
}
