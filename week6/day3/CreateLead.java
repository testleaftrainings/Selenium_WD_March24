package sample;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;
import utills.ReadExcel;


public class CreateLead extends BaseClass{
	
	@BeforeTest
	public void setDetails() {
		 excelFileName="CreateLead";
	}
	
	@Test(dataProvider = "sendData")
	public void runLoginVerify(String userName,String password,String companyName,String firstname,String lastName) {
		
		new LoginPage(driver)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmsfaHyperLink()
		.clickLeadsTap()
		.clickCreateLeadButton()
		.enterCompanyName(companyName)
		.enterFirstName(firstname)
		.enterLastName(lastName)
		.clickSubmitButton()
		.verifyViewLeadPage();
		
	}

}
