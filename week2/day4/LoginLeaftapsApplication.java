package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginLeaftapsApplication {
public static void main(String[] args) {
	//Launch Chrome browser
	ChromeDriver driver=new ChromeDriver();
	//To Maximize the browser
	driver.manage().window().maximize();
	//load the application url
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	//enter the username as demosalesmanager
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	//Enter the password as crmsfa
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	//Click on Login Button
	driver.findElement(By.className("decorativeSubmit")).click();
	
	//print text
	String text = driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	
	//Click on crmsfa hyper link
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	//Click on leads tap
	driver.findElement(By.linkText("Leads")).click();
	
	//Click create lead button
	driver.findElement(By.partialLinkText("Create")).click();
	
	//Enter the CompanyName
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Qeagle");

	//Enter the firstname
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aravind");
	//Enter the lastName
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RK");
	
	//Select value from Drop_Down
	WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
	
	 //Create a object for Select class
	//ClassName objectName=new ClassName()
	 Select sourceDropDown=new Select(dd);
	 //select by index
	// sourceDropDown.selectByIndex(1);
	 //select by visible text
	// sourceDropDown.selectByVisibleText("Conference");
	 
	 //Select by value
	 sourceDropDown.selectByValue("LEAD_EMPLOYEE");
	 
	 //Select Marketing campigian
	 WebElement marketingCampian = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	
     Select marketingDD=new Select(marketingCampian);
     marketingDD.selectByVisibleText("Automobile");
     
     
     //Select the value from industry dropdown
     WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
     
	 Select industryDD=new Select(industry);
	 
	 industryDD.selectByIndex(16);
	
	
	//click create lead button
	 driver.findElement(By.className("smallSubmit")).click();
	 
	 //Title verification
	 String actualTitle="View Lead | opentaps CRM";
	 //To get the current page title
	 String expectedTitle = driver.getTitle();
	 
	 if(expectedTitle.equals(actualTitle)) {
		 System.out.println("Create lead created successfully");
	 }else {
		 System.out.println("Create lead not created successfully");
	 }
	 
	 
	 
	 
	
	
	
	
}
}
