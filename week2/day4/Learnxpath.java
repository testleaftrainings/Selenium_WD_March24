package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learnxpath {
public static void main(String[] args) {
	//Launch Chrome browser
	ChromeDriver driver=new ChromeDriver();
	//To Maximize the browser
	driver.manage().window().maximize();
	//load the application url
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//enter the username as demosalesmanager
	driver.findElement(By.xpath("//input[@id='username")).sendKeys("Demosalesmanager");
	
	//Enter the password as crmsfa
	driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
	
	//Click on Login button
	 driver.findElement(By.xpath("//input@value='Login']")).click();
	//Click on crmsfa hyper link
	 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	 
	 System.out.println("Program execute successfully");
	
	
	driver.close();//socket exception
}
}
