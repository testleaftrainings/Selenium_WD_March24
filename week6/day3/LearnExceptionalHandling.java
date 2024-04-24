package sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnExceptionalHandling {
public static void main(String[] args) throws  IOException, InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	File dest=new File("./data/oo1.png");
	FileUtils.copyFile(screenshotAs, dest);
	int a=10;
	Thread.sleep(3000);
	try {
		System.out.println(a/0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		//System.out.println(e);
	}finally {
		System.out.println("Program execute successfully");
	}
	
	
}
}
