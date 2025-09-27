package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
private WebDriver driver ; 
private By usernameTextBox = By.id("Email");
private By PasswordTextBox = By.id("Password");
private By LoginButton = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button");

public LoginPage(WebDriver driver2) {
	this.driver=driver2;
	// TODO Auto-generated constructor stub
}
public void enterUsername(String username) {
	driver.findElement(usernameTextBox).clear();
driver.findElement(usernameTextBox).sendKeys(username);
	
}
public void enterPassword(String password) {
	driver.findElement(usernameTextBox).clear();
driver.findElement(PasswordTextBox).sendKeys(password);
	
}public void clickLogin() {
 driver.findElement(LoginButton).click();
	
}
}
