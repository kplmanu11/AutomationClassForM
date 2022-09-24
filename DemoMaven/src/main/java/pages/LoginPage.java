package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By username = By.name("username");
	By password = By.name("password");
	By loginBtn = By.xpath("//button[@type='submit']");  ////*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button
	
	//forgont webelement
	By forgotPassword = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public HomePage login() {
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
		driver.findElement(loginBtn).click();
		return new HomePage();
	}
	
	public ForgotPassword forgotLinkClick() {
		driver.findElement(forgotPassword).click();
		return new ForgotPassword();
	}
	
	
	


}
