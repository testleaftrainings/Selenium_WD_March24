package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LearnActionsClass {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications","--start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://www.myntra.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.xpath("//a[text()='Kids']"));
	WebElement clickShirts = driver.findElement(By.xpath("//a[text()='Shirts']"));
	Actions builder=new Actions(driver);
	builder.moveToElement(ele).pause(10).click(clickShirts).perform();
	
	
	
	
	
	
	
	
	//builder.moveToElement(ele).perform();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//a[text()='Shirts']")).click();
}
}
