package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Drobbable {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		//Load the application url
		driver.get("https://jqueryui.com/droppable/");
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Handle the frame
		driver.switchTo().frame(0);
		
		//Locate the element drag me around
		WebElement from = driver.findElement(By.id("draggable"));
		
		WebElement to = driver.findElement(By.id("droppable"));
		Actions builder=new Actions(driver);
		
		builder.dragAndDrop(from, to).perform();
		
		String cssValue = to.getCssValue("background");
		System.out.println(cssValue);
	}
}
