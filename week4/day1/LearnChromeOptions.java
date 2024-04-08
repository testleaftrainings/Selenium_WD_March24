package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnChromeOptions {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("--disable-notifications","start-maximized","--Incognito");
		//If i want to execute in background then i should use --headless in chrome options
		options.addArguments("--headless");
		ChromeDriver driver =new ChromeDriver(options);

		//Load the application url
		driver.get("https://www.myntra.com/");
		//Maximize the browser
		//driver.manage().window().maximize();
		System.out.println("Program execute successful");
	}
}
