package stepdefnition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{
//	ChromeDriver driver;
//	@Given("Launch the chrome browser")
//	public void launchBrowser() {
//		driver=new ChromeDriver();
//	}
//	@Given("Load the application url")
//	public void loadUrl() {
//		driver.get("http://leaftaps.com/opentaps/control/main");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	}
	
	@And("Enter the username as (.*)$")
	public void enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@And("Enter the password as (.*)$")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}
	@When("Click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("HomePage should be displayed")
	public void verifyHomePage() {
		String actualTitle="Leaftaps - TestLeaf Automation Platform";
		String expectedTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Home page verified successfully");
		}else {
			System.out.println("Home page not verified successfully");
		}
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
	}
    @But("error message should be displayed")
    public void verifyErrorMsg() {
    	String text = driver.findElement(By.id("errorDiv")).getText();
    	System.out.println(text);
    }
    
}
