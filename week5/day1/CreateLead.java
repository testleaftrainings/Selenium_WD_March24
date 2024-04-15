package week5.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass {

	@Test(dataProvider="sendData")
	public void runCreateLead(String companyName,String firstName,String lastName){

		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();
	
	}
	
	@DataProvider
	public String[][] sendData() throws IOException {
		//To pass mutiple set of data
		//first[] --> row
		//second[] -->column
//	ReadExcel data=new ReadExcel();
//	String[][] excelData = data.getExcelData();
//	System.out.println("@data provider");
//	return excelData;
	
	
	return ReadExcel.getExcelData();
	
//		data[0][0]="TestLeaf";
//		data[0][1]="Hari";
//		data[0][2]="R";
//		data[1][0]="Qeagle";
//		data[1][1]="Raghu";
//		data[1][2]="G";
		
		
		
		
	}
	
	
}






