package week4.day1;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LearnScreenShot {
public static void main(String[] args) throws IOException {
	ChromeDriver driver =new ChromeDriver();
	
	//Load the application url
	driver.get("https://www.leafground.com/window.xhtml");
	//Maximize the browser
	driver.manage().window().maximize();
	
	File source = driver.getScreenshotAs(OutputType.FILE);
	File detination=new File("./snap/001.png");
	FileUtils.copyFile(source, detination);
	
	//If i want take particular element snapshot
	WebElement ele = driver.findElement(By.xpath("//span[text()='Open']"));
	
	File source1 = ele.getScreenshotAs(OutputType.FILE);
	File detination1=new File("./snap/002.png");
    //FileUtils.copyFile(source1, detination1);
    
      FileHandler.copy(source1, detination1);


 

}


}
