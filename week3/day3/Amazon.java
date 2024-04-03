package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import week3.day1.Chrome;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles",Keys.ENTER);
	
	Thread.sleep(3000);
	List<WebElement> mobilePrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	
	//Create an empty list
	List<Integer> price=new ArrayList<Integer>();
	
	for (int i = 0; i < mobilePrice.size(); i++) {
		String text = mobilePrice.get(i).getText();
		//System.out.println(text);
		
		String replaceAll = text.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		//Type casting
		int parseInt = Integer.parseInt(replaceAll);
		price.add(parseInt);
	}
	
	System.out.println(price);
	
	//to get min values
	Integer min = Collections.min(price);
	System.out.println("Min value is  "+min);
	
	//To get maximum value from  list
	Integer max = Collections.max(price);
	System.out.println(max);
}
}
