package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class ServiceNow {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications","--start-maximized");
		ChromeDriver driver = new ChromeDriver(options);

		//Set Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//Launch the URL
		driver.get("https://dev210045.service-now.com/");
		Thread.sleep(2000);
		//Enter Username
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		//Enter password
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("tdY0ES=5luW-");
		//Enter Login
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		//Create a shadow object
		Shadow object= new Shadow(driver);
		object.setImplicitWait(30);

		//Click ALL
		WebElement All = object.findElementByXPath("//div[text()='All']");
		All.click();
		object.setImplicitWait(30);

		//Click Service Catalog
		WebElement ServCat = object.findElementByXPath("//span[text()='Service Catalog']");
		ServCat.click();
		object.setImplicitWait(30);


	}

}
