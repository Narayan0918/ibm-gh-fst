package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity_3_StepDefinition extends BaseClass{
	@Given("User is on the page")
	public void openPage() throws Throwable {
		driver.get("https://training-support.net/webelements/alerts");
	}
	
	@When("User clicks the Simple Alert button")
	public void clickSimpleAlert() throws Throwable {
		driver.findElement(By.id("simple")).click();
	}
	
	@When("User clicks the Confirm Alert button")
	public void clickConfirmAlert() throws Throwable {
		driver.findElement(By.id("confirmation")).click();
	}
	
	@When("User clicks the Prompt Alert button")
	public void clickPromptAlert() throws Throwable {
		driver.findElement(By.id("prompt")).click();
	}
	
	@Then("Alert opens")
	public void alerOpens() throws Throwable {
		wait.until(ExpectedConditions.alertIsPresent());
		alert = driver.switchTo().alert();
	}
	
	@And("Read the text from it and print it")
	public void readText() throws Throwable {
		System.out.println("Message => "+ alert.getText());
	}
	
	@And("Write a custom message in it")
	public void writeToPrompt() throws Throwable {
		alert.sendKeys("Custom Message");
	}
 
	@And("Close the alert")
	public void closeAlert() throws Throwable {
		alert.accept();
	}
 
	@And("Close the alert with Cancel")
	public void closeAlertWithCAncel() throws Throwable {
		alert.dismiss();
	}
 
	@And("Read the result text")
	public void readResultText() throws Throwable {
		String message = driver.findElement(By.id("result")).getText();
		System.out.println("Action performed: " + message);
	}
}




