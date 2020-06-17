package InputOutPut;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.openxml4j.opc.Package;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFromExcelFile {

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream(new File("D:\\programs\\testData\\selenium test data\\RegistrationPageInput.xlsx"));
			// Create Workbook instance holding reference to .xlsx file 
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			// Get first/desired sheet from the workbook 
			XSSFSheet sheet = workbook.getSheetAt(0);
			// Iterate through each rows one by one 
			Iterator<Row> rowIterator = sheet.iterator();
			while(rowIterator.hasNext()) {
				Row row = rowIterator.next();
				// For each row, iterate through all the columns 
				Iterator<Cell> cellIterator = row.cellIterator();
				while(cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					// Check the cell type and format accordingly 
					//String format = "%-20s %5d\n"; //using for correct printing format of the columns
					//String format = "%-20s %5d\n";
					switch(cell.getCellType()) {
					 case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t");
						// System.out.format(format,cell.getNumericCellValue());
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + "\t");
						//System.out.format(format,cell.getStringCellValue());
						break;
					}
				}
				System.out.println("");
			}
			file.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
