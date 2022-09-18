package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;


public class LoginPageTest {
	
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	
	
	@Test
	public void verifyUserIsAbleToLogin() {
		System.setProperty("webdriver.edge.driver", "D:\\Test\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		loginPage = new LoginPage(driver);
		
		homePage = loginPage.login();
	}

}
