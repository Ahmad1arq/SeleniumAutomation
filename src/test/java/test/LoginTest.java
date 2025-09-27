package test;

import org.testng.annotations.Test;

import base.Basetest;
import pages.LoginPage;

public class LoginTest extends Basetest{
@Test
	public void testLoginPage() {
		LoginPage login = new LoginPage(driver);
		login.enterUsername("admin@yourstore.com");
		login.enterPassword("admin");
		login.clickLogin();
		System.out.println("Title of the page is :"+driver.getTitle());
		
	}
}
