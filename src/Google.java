

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

import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	static WebDriver Jose;
	static By campoDeBusqueda = By.xpath(("//input[@name='q']"));
	static By botonBuscar = By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']");
	
	public static void escribirEnElCampoDeBusqueda(String cadenaBuscar) {
		Jose.findElement(campoDeBusqueda).sendKeys(cadenaBuscar);
	}
	
	public static void darClickEnElBotonBuscar() {
		Jose.findElement(botonBuscar).click();
	}
	
	public static void abrirPaginaInicialDeGoogle() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\semillero\\eclipse-workspace\\TestSelenium\\src\\drivers\\chromedriver.exe");
		
		Jose = new ChromeDriver();
		Jose.manage().window().maximize();
		Jose.get("https://www.google.com/");
	}
	
	public static String obtenerDatosDeExcel() throws IOException{
		 String path = "C:\\Users\\semillero\\eclipse-workspace\\TestExcel\\src\\data\\TestDataSheet.xlsx";
		
			
		 FileInputStream fis = new FileInputStream(path);
		 Workbook workbook = new XSSFWorkbook(fis);
		 Sheet sheet = workbook.getSheetAt(0);
	
		 Row row = sheet.getRow(1);
		 Cell cell = row.getCell(0);
	
		return cell.getStringCellValue();
		
		
	
		 
		 
		 }

	}
	


