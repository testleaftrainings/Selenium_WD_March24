package week4.day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnThreadPool {
  
  //  @Test()
//	public void editLead() {
//    	 ChromeDriver driver = new ChromeDriver();
// 		driver.manage().window().maximize();
// 		driver.get("http://leaftaps.com/opentaps/");
//		System.out.println("Edit Lead");
//	}
    @Test(invocationCount =4,threadPoolSize = 2)
	public void createLead() {
    	 ChromeDriver driver = new ChromeDriver();
  		driver.manage().window().maximize();
  		driver.get("http://leaftaps.com/opentaps/");
		System.out.println("Create Lead");
	}
}
//Addition
//Division
//Multiplication
//Subraction