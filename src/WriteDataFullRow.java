import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class WriteDataFullRow {
 
 public static void main(String[] args) throws IOException {
 
 String path = "C:\\Users\\semillero\\eclipse-workspace\\TestExcel\\src\\data\\TestDataSheet.xlsx";
 
 FileInputStream fis = new FileInputStream(path);
 
 Workbook workbook = new XSSFWorkbook(fis);
 
 Sheet sheet = workbook.getSheetAt(0);
 
 int lastRow = sheet.getLastRowNum();
 
 for(int i=1; i<=lastRow; i++){
 
 Row row = sheet.getRow(i);
 
 Cell cell = row.createCell(2);
 
 cell.setCellValue("Writing Done");
 
 }
 
 FileOutputStream fos = new FileOutputStream(path);
 
 workbook.write(fos);
 
 fos.close();
 
 
 }
 
}