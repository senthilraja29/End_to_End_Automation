package POM_Selenium_project.POM_project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(i_retry_analyzer.class)
public class amazon_09_addingtocart_testcase 
{
	WebDriver driver;
	@BeforeTest
	public void activate_browser()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test(retryAnalyzer = POM_Selenium_project.POM_project.i_retry_analyzer.class)
	public void ensure_product_test()
	{
		amazon_added_to_shopingcart_source shopping_product = new amazon_added_to_shopingcart_source(driver);
		shopping_product.search();
		shopping_product.choose_product();	
	}
	
	@Test (priority=1, retryAnalyzer = POM_Selenium_project.POM_project.i_retry_analyzer.class)
	public void add_cart() throws InterruptedException
	{
		amazon_15_till_cart_source window = new amazon_15_till_cart_source(driver);
		window.move_element();
		
		amazon_added_to_shopingcart_source shopping_product = new amazon_added_to_shopingcart_source(driver);
			shopping_product.Add_cart();
			Thread.sleep(5000);
		//	shopping_product.add_protection();
	}
	
	
	@AfterTest
	public void end_browser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
