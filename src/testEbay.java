import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testEbay {


		
		  private WebDriver driver;
		  private Map<String, Object> vars;
		  JavascriptExecutor js;
		  @Before
		  public void setUp() {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\semillero\\eclipse-workspace\\TestSelenium\\src\\drivers\\chromedriver.exe");
				
				driver = new ChromeDriver();
		    js = (JavascriptExecutor) driver;
		    vars = new HashMap<String, Object>();
		  }
		  @After
		  public void tearDown() {
		    driver.quit();
		  }
		  @Test
		  public void cxdfdfd() {
		    driver.get("https://www.ebay.com/");
		    driver.manage().window().setSize(new Dimension(1050, 708));
		    driver.findElement(By.linkText("Inicia sesión")).click();
		  }
		
	
}


