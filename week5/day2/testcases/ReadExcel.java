package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public static String[][] readData() throws IOException {
	
	XSSFWorkbook book=new XSSFWorkbook("./data/CreateLead.xlsx");
	
	
	XSSFSheet sheet = book.getSheet("Sheet1");
	
	int rowCount = sheet.getLastRowNum();
	
	short columnCount = sheet.getRow(0).getLastCellNum();
	
	String[][] data=new String[rowCount][columnCount];
	for (int i = 1; i <=rowCount; i++) {
		for (int j = 0; j < columnCount; j++) {
			String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(stringCellValue);
			data[i-1][j]=stringCellValue;
		}
	}
	//close book
	book.close();
	return data;
	
}
}
