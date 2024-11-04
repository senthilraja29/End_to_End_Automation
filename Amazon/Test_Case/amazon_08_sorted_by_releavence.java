package POM_Selenium_project.POM_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(i_retry_analyzer.class)
public class amazon_08_sorted_by_releavence 
{
	WebDriver driver;
	@BeforeTest
	public void init_browser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	
	@Test(retryAnalyzer = POM_Selenium_project.POM_project.i_retry_analyzer.class)
	public void sorted_by_releavence()
	{
		amazon_08_sortedBy_source sortedBy = new amazon_08_sortedBy_source(driver);
			sortedBy.search();
			sortedBy.customerreview();
			sortedBy.lower_slider();
			sortedBy.goclick();
			
	}
	
	@AfterTest
	public void quit_browser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
