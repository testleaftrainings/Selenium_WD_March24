package week3.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNavigationComments {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01m3ph44ynl56v3zj3k6byfzv7522381.node0");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//pooling time 500 ms
	driver.manage().window().maximize();//25
	
	Thread.sleep(3000);
	//load facebook url
	driver.navigate().to("https://www.facebook.com/");//29
	
	
	//back to existing url
	Thread.sleep(3000);
	driver.navigate().back();
	
	//move to again forward -->face book url
	Thread.sleep(3000);
	driver.navigate().forward();
	
	//refersh current url
	Thread.sleep(3000);
	driver.navigate().refresh();
}
}
