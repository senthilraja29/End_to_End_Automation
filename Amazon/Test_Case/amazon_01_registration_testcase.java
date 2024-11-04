package POM_Selenium_project.POM_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(i_retry_analyzer.class)
public class amazon_01_registration_testcase 
{
	WebDriver driver;
	@Test(retryAnalyzer = POM_Selenium_project.POM_project.i_retry_analyzer.class)
	public void amazon_registration()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		amazon_registration_source registration = new amazon_registration_source(driver);
		registration.registr_link();
		registration.customer_name();
		registration.mobile();
		registration.pass();
		registration.country_option();
		registration.country_code();
	}

	@AfterTest
	public void browser_exit() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

}
