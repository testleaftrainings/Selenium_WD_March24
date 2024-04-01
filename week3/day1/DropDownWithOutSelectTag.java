package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithOutSelectTag {
public static void main(String[] args)  {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01m3ph44ynl56v3zj3k6byfzv7522381.node0");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'])[1]")).click();
	
	driver.findElement(By.xpath("//li[text()='India']")).click();
	
	
	
	
			
}
}
