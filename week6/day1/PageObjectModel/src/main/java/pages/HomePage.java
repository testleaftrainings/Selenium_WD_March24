package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class HomePage extends BaseClass {

	public void clickCrmsfaHyperLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	public void verifyLogin() {
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
	}
}
