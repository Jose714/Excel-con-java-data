package pom.excel.mongodb1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class WriteDataFullRow {
 
 public static void main(String[] args) throws IOException, InterruptedException {
 
 String path = "C:\\Users\\semillero\\eclipse-workspace\\TestExcel\\src\\data\\TestDataSheet.xlsx";
 System.setProperty("webdriver.chrome.driver","C:\\Users\\semillero\\eclipse-workspace\\TestSelenium\\src\\drivers\\chromedriver.exe");
 //static By agregarAlCarrito = By.xpath("//a[@id='isCartBtn_btn']");
	
	WebDriver Jose = new ChromeDriver();
	
 FileInputStream fis = new FileInputStream(path);
 
 Workbook workbook = new XSSFWorkbook(fis);
 
 Sheet sheet = workbook.getSheetAt(0);
 
 int lastRow = sheet.getLastRowNum();
 
 for(int i=0; i<=lastRow; i++){
 
 Row row = sheet.getRow(i);
 
 Cell cell = row.getCell(0);
 String cellString = cell.getStringCellValue();
 Jose.manage().window().maximize();
 
 //ll.setCellValue("Writing Done");
 Jose.get("https://www.ebay.com/");
	WebDriverWait myDynamicElement = new WebDriverWait(Jose,30);
	myDynamicElement.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='gh-ug']/a")));
 


 Thread.sleep(2000);
 


 }

 Jose.close();
 Jose.quit();
 FileOutputStream fos = new FileOutputStream(path);


	workbook.write(fos);
	
 
 
 fos.close();
 
 
 }

 
}