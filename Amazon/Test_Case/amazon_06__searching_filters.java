package POM_Selenium_project.POM_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(i_retry_analyzer.class)
public class amazon_06__searching_filters 
{
	WebDriver driver;
	@BeforeTest
	public void enterwebsite()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}
	
	@Test(retryAnalyzer = POM_Selenium_project.POM_project.i_retry_analyzer.class)
	public void searching_filters()
	{
		amazon_06__searching_filters_source page = new amazon_06__searching_filters_source(driver);
		page.search_box();
		page.discount();
		page.newarrivals();
		page.Deals();
	}
	
	@AfterTest
	public void exitbrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

}
