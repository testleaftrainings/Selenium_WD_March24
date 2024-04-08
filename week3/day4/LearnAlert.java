package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
public static void main(String[] args) throws InterruptedException {
	
	//Launch chrome browser
	ChromeDriver driver=new ChromeDriver();
	//Load application url
	driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0144urw2vuk1xk1tc5rd5adk4qx554867.node0");
	//Maximize the browser
	driver.manage().window().maximize();
	//simple Alert
	driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
	Thread.sleep(3000);
	
	Alert simpleAlert = driver.switchTo().alert();
	simpleAlert.accept();
	
	
	//Confirmation Alert
driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
Thread.sleep(3000);
	Alert confirmAlert = driver.switchTo().alert();
	//confirmAlert.accept();
	confirmAlert.dismiss();
	
	
	
	
	
}
}
