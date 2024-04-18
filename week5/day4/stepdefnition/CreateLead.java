package stepdefnition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{

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
