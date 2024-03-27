package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

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
	
	
	
	
	
	
	
	
	
	
}
}
