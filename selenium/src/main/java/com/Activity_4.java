package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");
        System.out.println("Title of the page => "+driver.getTitle());

        System.out.println("3rd header => "+driver.findElement(By.xpath("//h3[contains(text(),'Heading #3')]")).getText());
        
        System.out.println("5th header's colour => "+driver.findElement(By.xpath("//h5[contains(text(),'Heading #5')]")).getCssValue("color"));


        System.out.println("Classes of purple button => "+ driver.findElement(By.xpath("//button[text()='Purple']")).getAttribute("class"));


        System.out.println("Slate button's text => "+driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText());

        driver.quit();




    }
    
}
