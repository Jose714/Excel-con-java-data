package pom.excel.mongodb1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class EbayPom {
	static WebDriver Jose;
	static By campoDeBusqueda = By.xpath(("//input[@id='gh-ac']"));
	static By botonBuscar = By.xpath("//input[@id='gh-btn']");
	static By agregarAlCarrito = By.xpath("//a[@id='isCartBtn_btn']");
	static By primerlink = By.xpath("//a[@class='s-item__link'][1]");
	
	public static void escribirEnElCampoDeBusqueda(String cadenaBuscar) {
		Jose.findElement(campoDeBusqueda).sendKeys(cadenaBuscar);
	}
	
	public static void darClickEnElBotonBuscar() throws IOException {
		
		Jose.findElement(botonBuscar).click();
	
	}
	
	public static void abrirPaginaInicialDeEbay() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\semillero\\eclipse-workspace\\TestSelenium\\src\\drivers\\chromedriver.exe");
		
		Jose = new ChromeDriver();
		Jose.manage().window().maximize();
		Jose.get("https://www.ebay.com/");
	}
	
	public static String obtenerDatosDeExcel() throws IOException{
		 String path = "C:\\Users\\semillero\\eclipse-workspace\\MiPrimerGradle\\src\\test\\java\\pom\\excel\\mongodb\\TestDataSheet.xlsx";
		
			
		 FileInputStream fis = new FileInputStream(path);
		 Workbook workbook = new XSSFWorkbook(fis);
		 Sheet sheet = workbook.getSheetAt(0);
	
		 Row row = sheet.getRow(0);
		 Cell cell = row.getCell(0);
	
		return cell.getStringCellValue();
		
		
		 }
	public static void seleccionarBusqueda() {
		Jose.findElement(primerlink).click();;
	}
	public static void agregarAlCarritoDeCompras() {
		Jose.findElement(agregarAlCarrito).click();
	}
	public static void cerrarNavegador() throws  InterruptedException {
		Jose.close();
		Thread.sleep(2000);
		Jose.quit();
		
	}
	public static void validacionDelCarrito() {
		//String modulo = Jose.findElement(By.xpath("//h1[contains(@id,'itemTitle")).getText();
		String carrito = Jose.findElement(By.xpath("//span[contains(text(),'Gratis')]")).getText();
		//System.out.println(modulo);
		Assert.assertEquals(carrito, "Gratis");
		 System.out.println(carrito);
		//Assert.assertEquals(Jose.findElement( deLaBusqueda).getText(), Jose.findElement(relojEnElCarrito).getText());
		
	}

	}
	


