package POM_Selenium_project.POM_project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(i_retry_analyzer.class)
public class amazon_05_search_By_products 
{
	WebDriver driver;
	
	@BeforeTest
	public void init_browser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	
	@Test(dataProvider = "search_inputs", retryAnalyzer = POM_Selenium_project.POM_project.i_retry_analyzer.class)
	public void search_By(String search_inputs)
	{
		amazon_05_search_By_products_source page = new amazon_05_search_By_products_source(driver); 
		page.searchbox(search_inputs);
	}
	
	@AfterTest
	public void quit_browser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	@DataProvider(name = "search_inputs")
	public Object[][] data_01()
	{
		return new Object[][] {{"Pen"},{"Knife"},{"Shoe"},{"Apple"}};
	}
}
