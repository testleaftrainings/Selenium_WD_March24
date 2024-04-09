package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		//Load the application url
		driver.get("https://jqueryui.com/selectable/");
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Handle the frame
		driver.switchTo().frame(0);
		
		
		WebElement ele1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement ele2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement ele3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement ele4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement ele5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		
		Actions builder =new Actions(driver);
		
		builder.clickAndHold(ele1).clickAndHold(ele2).clickAndHold(ele3).clickAndHold(ele4).release().perform();
		
		
		
	}
}
