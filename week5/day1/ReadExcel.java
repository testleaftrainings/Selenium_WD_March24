package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public static String[][] getExcelData() throws IOException {
	
	//Set the file path  ./ --> represent my root folder
	XSSFWorkbook book=new XSSFWorkbook("./ExcelData/CreateLead.xlsx");
	
	//To get sheet name
	XSSFSheet sheet = book.getSheet("Sheet1");
	
	//To get row count
	int rowCount = sheet.getLastRowNum();
	System.out.println("Row count"+rowCount);
	
	//To get cell count
	int columnCount = sheet.getRow(0).getLastCellNum();
	System.out.println("Column count "+columnCount);
	
	String[][] data=new String[rowCount][columnCount];
	for (int i = 1; i <= rowCount; i++) {
		for (int j = 0; j <columnCount; j++) {
			String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(stringCellValue);
			//i=1-> 1-1 =0
			data[i-1][j]=stringCellValue;
			
		
		}
	}
//	//to physical count
//		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//		System.out.println("physicalNumberOfRows  "+physicalNumberOfRows);
	
	
//	XSSFRow row = sheet.getRow(0);
//	
//	XSSFCell cell = row.getCell(0);
//	
//	String stringCellValue = cell.getStringCellValue();
//	System.out.println(stringCellValue);
	
	
	
	
	
	//close work book
	book.close();
	return data;
	
	
}
}
