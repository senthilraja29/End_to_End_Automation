package POM_Selenium_project.POM_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class facebook_login_testcase 
{
	WebDriver driver;
	@Test
	public void login_testcase()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		facebook_login_source source = new facebook_login_source(driver);
		source.un();
		source.pwd();
		source.login();
//		source.create_new_ac();
	}
}
