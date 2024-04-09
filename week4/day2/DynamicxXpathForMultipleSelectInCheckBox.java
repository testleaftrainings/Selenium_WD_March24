package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicxXpathForMultipleSelectInCheckBox {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		//Load the application url
		driver.get("https://www.leafground.com/checkbox.xhtml");
		//Maximize the browser
		driver.manage().window().maximize();
	
		//Click on Arrow icon
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		
		List<WebElement> countryName = driver.findElements(By.xpath("//ul[contains(@class,' ui-corner-all ui-helper-reset')]//label"));
	   Thread.sleep(3000);
		for (int i = 0; i < countryName.size(); i++) {
			String text = countryName.get(i).getText();
			System.out.println(text);
			
			driver.findElement(By.xpath("((//label[text()='"+text+"'])[2]/preceding::div)[last()]")).click();
		}
		
	}
}
