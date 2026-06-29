package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity_16 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/selects");

        System.out.println();
        System.out.println("Title => "+driver.getTitle());

        WebElement dropdown = driver.findElement(By.xpath("//div[@class='mt-10 flex flex-1 flex-col items-center justify-around lg:mt-0'][1]/select"));
        Select select = new Select(dropdown);

        select.selectByVisibleText("Two");
        select.selectByIndex(2);
        select.selectByValue("three");


        List<WebElement> allOptionsSelected = select.getOptions();

        System.out.print("All options are => ");
        for (WebElement webElement : allOptionsSelected) {
            System.out.print(webElement.getText()+", ");
        }

        driver.quit();

    }
}
