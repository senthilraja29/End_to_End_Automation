package POM_Selenium_project.POM_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(i_retry_analyzer.class)
public class amazon_14_ratings_ 
{
	WebDriver driver;
	@BeforeTest
	public void init_browser()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test(retryAnalyzer = POM_Selenium_project.POM_project.i_retry_analyzer.class)
	public void amazon_14_ratings_() throws EncryptedDocumentException, IOException, InterruptedException
	{
		amazon_login_source login = new amazon_login_source(driver);
			login.hover(driver);
			login.user();
			login.cont_nue();
			login.pass();
			login.signin();
			login.hover(driver);
			
		amazon_14_ratings_source source = new amazon_14_ratings_source(driver);
			source.yourorders();
			source.orders();
			source.review();
	}
	
	@AfterTest
	public void quit_browser() throws InterruptedException
	{
		Thread.sleep(5000);
	//	driver.quit();
	}
	
	
	
}
