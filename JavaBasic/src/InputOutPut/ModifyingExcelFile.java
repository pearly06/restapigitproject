package InputOutPut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ModifyingExcelFile {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\programs\\testData\\excelfile\\RegistrationPageInput.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int num = sheet.getLastRowNum();
		Row row = sheet.createRow(++num);
		row.createCell(0).setCellValue("RoughUSE");
		// Now this Write the output to a file 
		FileOutputStream fileOut = new FileOutputStream(file); 
		workbook.write(fileOut);
		fileOut.close(); 
		

	}
	

}
