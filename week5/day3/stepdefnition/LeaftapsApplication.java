package stepdefnition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeaftapsApplication {
	ChromeDriver driver;
	@Given("Launch the chrome browser")
	public void launchBrowser() {
		driver=new ChromeDriver();
	}
	@And("Load the application url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@And("Enter the username as {string}")
	public void enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@And("Enter the password as {string}")
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
	}
    @But("error message should be displayed")
    public void verifyErrorMsg() {
    	String text = driver.findElement(By.id("errorDiv")).getText();
    	System.out.println(text);
    }
    @When("Click on crmsfa hyper link")
    public void clickOnCrmsfaHyperlink() {
    	driver.findElement(By.linkText("CRM/SFA")).click();
    }
    @Then("MyHomePage should be displayed")
	public void verifyMyHomePage() {
		String actualTitle="My Home | opentaps CRM";
		String expectedTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("MyHomePage verified successfully");
		}else {
			System.out.println("MyHomepage not verified successfully");
		}
	}
    @When("click on Leads tap")
    public void clickLeadsTap() {
    	driver.findElement(By.linkText("Leads")).click();
    }
    @Then("MyLeads Page should be displayed")
	public void verifyMyLeadsPage() {
		String actualTitle="My Leads | opentaps CRM";
		String expectedTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("MyLeadsPage verified successfully");
		}else {
			System.out.println("MyLeadsPage not verified successfully");
		}
	}
    @When("Click on create Lead tap")
    public void clickCreateLeadTap() {
    	driver.findElement(By.linkText("Create Lead")).click();
    }
    @Then("CreateLeadPage should be displayed")
	public void verifyCreateLeadPage() {
		String actualTitle="My Leads | opentaps CRM";
		String expectedTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("CreateLeadPage verified successfully");
		}else {
			System.out.println("CreateLeadpage not verified successfully");
		}
	}
    
    @And("Enter the comapny name as TestLeaf")
	public void enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

	}
    @And("Enter firstName as Raghu")
    public void enterFistName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raghu");

	}
    @And("Enter the lastname as G")
    public void enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");

	}
    @When("click on CreateLead button")
    public void clickCreateLeadButton() {
		driver.findElement(By.className("smallSubmit")).click();

	}
    @Then("ViewLead page should be displayed")
  	public void verifyViewLeadPage() {
  		String actualTitle="View Lead | opentaps CRM";
  		String expectedTitle = driver.getTitle();
  		if(expectedTitle.equals(actualTitle)) {
  			System.out.println("ViewLead verified successfully");
  		}else {
  			System.out.println("ViewLead not verified successfully");
  		}
  	}
}
