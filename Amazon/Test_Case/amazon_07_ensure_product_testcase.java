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
public class amazon_07_ensure_product_testcase 
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
		amazon_ensure_product_details_source ensure_product = new amazon_ensure_product_details_source(driver);
		ensure_product.search();
		ensure_product.choose_product();
	}

	@Test (priority=1)
	public void switch_window()
	{
		Set<String> no_of_windows	= driver.getWindowHandles();
		Iterator<String> windows	= no_of_windows.iterator();
		String link1 = windows.next();
		String link2 = windows.next();
		System.out.println(link1);
		System.out.println(link2);
		driver.close();
		driver.switchTo().window(link2);
		
		amazon_ensure_product_details_source ensure_product = new amazon_ensure_product_details_source(driver);
		ensure_product.addcart();
		ensure_product.p_prizeofproduct();
		ensure_product.reviews();
		ensure_product.product_description();
	}
	
	@AfterTest
	public void end_browser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
