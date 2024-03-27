package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChrome {
public static void main(String[] args) {
	//Launch Chrome browser
//	ChromeDriver driver=new ChromeDriver();
	//EdgeDriver driver=new EdgeDriver();
	FirefoxDriver driver=new FirefoxDriver();
	//To maximize browser
	driver.manage().window().maximize();
	//Load application url
	driver.get("http://leaftaps.com/opentaps/control/login");
}
}
