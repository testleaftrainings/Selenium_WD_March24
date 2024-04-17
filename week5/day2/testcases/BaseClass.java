package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	RemoteWebDriver driver ;
	
	@Parameters({"browser","url","UserName","password"})
	@BeforeMethod
	public void preCondition(String browser,String url,String userName,String password) {
		if(browser.equals("Chrome")) {
		driver = new ChromeDriver();
		}
		else if (browser.equals("Edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}
