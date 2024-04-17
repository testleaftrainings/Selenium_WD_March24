package week5.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrame {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications", "--start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node0movl0ax5if4w1lfxifmkmf3vh617369.node0");
	
	
	driver.switchTo().frame(0);
	WebElement ele = driver.findElement(By.id("Click"));
	
	ele.click();
	Thread.sleep(2000);
	String text = ele.getText();
	System.out.println(text);
	
	driver.switchTo().defaultContent();
	
	
}
}
