package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School {
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	
	//Load the application url
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	//Maximize the browser
	driver.manage().window().maximize();
	
	//Control has moved to frame
	driver.switchTo().frame("iframeResult");

	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	//alert press ok button
	
	driver.switchTo().alert().accept();
	String text = driver.findElement(By.id("demo")).getText();
	System.out.println(text);
}
}
