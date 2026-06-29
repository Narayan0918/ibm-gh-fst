import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity_11_Test {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://training-support.net/webelements/simple-form");
		
	}
	
	public static List<List<String>> readExcel(String filepath){
		List<List<String>> data = new ArrayList<>();
		
		Workbook excelFile;
		 try {
			 excelFile = new XSSFWorkbook(new FileInputStream("src/test/resources/data.xlsx"));
			 
			 Sheet sheet1 = excelFile.getSheetAt(0);
			 
			 for(Row rows:sheet1) {
				 
				 if(rows.getRowNum() == 0) {
					 continue;
				 }
				 
				 List<String> rowData = new ArrayList<>();
				 
				 for (Cell cells:rows) {
					 switch(cells.getCellType()) {
					 case STRING:
						 rowData.add(cells.getStringCellValue().trim());
						 break;
						 
					 case NUMERIC:
						 if (DateUtil.isCellDateFormatted(cells)) {
							 rowData.add(cells.getLocalDateTimeCellValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
						 }else {
							 rowData.add(String.valueOf(cells.getNumericCellValue()));
						 }
						 break;
						 
						 default:
							 rowData.add("-");
					 }	 
				 }
				 data.add(rowData);
				 excelFile.close();
			 } 
			 
		 }catch (Exception e){
			 System.out.println(e.getMessage());
		 }
		
		return data;	
		
	}
	
	@DataProvider(name = "excelDataProvider")
	public static Object[][] inputData() throws FileNotFoundException, IOException {
		// Data from the Excel file
		List<List<String>> inputData = readExcel("src/test/resources/input.xlsx");
 
		// Convert the data into a 2D array dataset
		// This is the dataset that will be passed to the test functions
		Object[][] data = new Object[inputData.size()][];
		for (int i = 0; i < inputData.size(); i++) {
			data[i] = inputData.get(i).toArray();
		}
 
		// Return the dataset
		return data;
	}
 
	@Test(priority = 1)
	public void verifyPageTitle() {
		// Assert the page title
		assertEquals(driver.getTitle(), "Selenium: Simple Form");
	}
 
	@Test(priority = 2, dataProvider = "excelDataProvider")
	public void registerTest(String[] rows) throws InterruptedException {
		// Locate the full name field and add the full from the rows
		// Find the input fields and enter text
		driver.findElement(By.id("full-name")).sendKeys(rows[0]);
		// Enter the email
		driver.findElement(By.id("email")).sendKeys(rows[1]);
		// Enter the Date of the event
		driver.findElement(By.name("event-date")).sendKeys(rows[2]);
		// Enter additional details
		driver.findElement(By.id("additional-details")).sendKeys(rows[3]);
 
		// Click Submit
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
 
		// Confirm booking
		String message = driver.findElement(By.id("action-confirmation")).getText();
		assertEquals(message, "Your event has been scheduled!");
 
		// Refresh the page
		driver.navigate().refresh();
	}
 
	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}
}
