package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Demo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		try {
			WebElement userName = driver.findElement(By.id("username"));
			driver.navigate().refresh();
			userName.sendKeys("DemoSalesManager");
		} catch (StaleElementReferenceException e) {
			WebElement userName = driver.findElement(By.id("username"));
			userName.sendKeys("DemoSalesManager");
		} catch (Exception e) {
			System.out.println(e);
		}
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	}
}