package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	
	//Load the application url
	driver.get("https://www.leafground.com/frame.xhtml");
	//Maximize the browser
	driver.manage().window().maximize();
	
	//Control has moved to frame
	driver.switchTo().frame(0);
	//here we have to locate  click me 
	WebElement firstFrame = driver.findElement(By.id("Click"));
	firstFrame.click();
	
	String text = firstFrame.getText();
	System.out.println(text);
	
	//control move to main webpage
	driver.switchTo().defaultContent();
	
	//Move the controll in frame 1
	driver.switchTo().frame(2);
	//move to nested frame-->String Name Or Id
	//driver.switchTo().frame("frame2");
	//WebElement
	//WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
	//driver.switchTo().frame(frame);
	//If i have Nested Frame
	driver.switchTo().frame(0);
	//driver.switchTo().parentFrame();
	WebElement secondFrame = driver.findElement(By.id("Click"));
	secondFrame.click();
	
	String text2 = secondFrame.getText();
	System.out.println(text2);
	
	//control move to main webpage
	driver.switchTo().defaultContent();
	
}
}
