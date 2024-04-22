package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;


public class TC001Login extends BaseClass{
	
	@Test
	public void runLoginVerify() {
		
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.verifyLogin();
		
//		LoginPage lp=new LoginPage();
//		lp.enterUserName();
//		lp.enterPassword();
//		lp.clickLoginButton();
//		HomePage hp=new HomePage();
//		hp.verifyLogin();
		
	}

}
