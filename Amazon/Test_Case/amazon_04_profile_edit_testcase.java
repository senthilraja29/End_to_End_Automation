package POM_Selenium_project.POM_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(i_retry_analyzer.class)
public class amazon_04_profile_edit_testcase 
{
	WebDriver driver;
	@Test(retryAnalyzer = POM_Selenium_project.POM_project.i_retry_analyzer.class)
	public void profile_edit() throws EncryptedDocumentException, IOException, InterruptedException
	{
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		amazon_login_source log_in = new amazon_login_source(driver);
			log_in.hover(driver);
			log_in.user();
			log_in.cont_nue();
			log_in.pass();
			log_in.signin();
		
		amazon_profile_source profile = new amazon_profile_source(driver);
			profile.your_ac(driver);
			profile.address_link();
			profile.address_new();
		
			Thread.sleep(5000);
		
			profile.country(driver);
			
			profile.name();
			profile.mobile();
			profile.flat();	
			profile.postal();
			profile.area();
			profile.landmark();
			
			profile.mark_this();
			Thread.sleep(3000);
			profile.town();
			profile.state(driver);
	}

	@AfterTest
	public void browser_quit() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
