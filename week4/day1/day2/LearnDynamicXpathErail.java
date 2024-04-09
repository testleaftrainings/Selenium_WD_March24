package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDynamicXpathErail {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		//Load the application url
		driver.get("https://erail.in/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Locate the from station
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MASS",Keys.ENTER);
		//Locate the to station
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU",Keys.ENTER);
		
		//Unselect sort on datde check box
		driver.findElement(By.id("chkSelectDateOnly")).click();
		Thread.sleep(3000);
		
		//To get all the train names
		List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
		
		for (int i = 0; i < trainNames.size(); i++) {
			String text = trainNames.get(i).getText();
			System.out.println(i+"    "+text);
		}
		
		
		
		
		
		
	}
}
