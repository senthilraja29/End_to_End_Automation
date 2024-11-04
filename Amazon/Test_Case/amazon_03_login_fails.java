package POM_Selenium_project.POM_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(i_retry_analyzer.class)
public class amazon_03_login_fails 
{
	WebDriver driver;
	@Test(retryAnalyzer = POM_Selenium_project.POM_project.i_retry_analyzer.class)
	public void login_fails() throws EncryptedDocumentException, IOException, InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		amazon_login_source login = new amazon_login_source(driver);
		login.hover(driver);
		login.user();
		login.cont_nue();
		login.incorrect_pass();
		login.signin();
	}
	@AfterTest
	public void browser_quit() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
