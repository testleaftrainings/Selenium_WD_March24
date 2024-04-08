package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling2 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	
	//Load the application url
	driver.get("https://www.leafground.com/window.xhtml");
	//Maximize the browser
	driver.manage().window().maximize();
	
	
	String currentTitle = driver.getTitle();
	System.out.println(currentTitle);
	
	String parentWindow = driver.getWindowHandle();
	
	//click  open button
	driver.findElement(By.xpath("//span[text()='Open']")).click();
//	Set<String> openedWindow = driver.getWindowHandles();
//	System.out.println(openedWindow.size());
//	//Create a empty list,converted the set into list
//	List<String> childWindow=new ArrayList<String>(openedWindow);
//	
//	driver.switchTo().window(childWindow.get(1));
	
	
	String title = driver.getTitle();
	System.out.println(title);
	Thread.sleep(5000);
	//driver.quit();
	driver.close();
}
}
