package week5.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandling {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications", "--start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://www.irctc.co.in/nget/train-search");
	
	String parentWindow = driver.getWindowHandle();
	String title = driver.getTitle();
	System.out.println("ParentWindow title  "+title);
	driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
	
	Set<String> childWindow = driver.getWindowHandles();
	System.out.println(childWindow.size());
	List<String> newWindow=new ArrayList<String>(childWindow);
	
	driver.switchTo().window(newWindow.get(1));
	
	String title2 = driver.getTitle();
	System.out.println("Child Window title  "+title2);
	
	
	
}
}
