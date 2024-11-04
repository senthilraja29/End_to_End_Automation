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
public class amazon_15_till_cart 
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
	public void amazon_till_cart() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Data_fetching_excel ddt = new Data_fetching_excel();
		ddt.search();
		
		amazon_15_till_cart_source till_cart = new amazon_15_till_cart_source(driver);
		till_cart.search(ddt.input_02);
		till_cart.chooseproduct();
		till_cart.move_element();
		till_cart.quantity();
		till_cart.selectquantity();
		till_cart.add_cart();
		till_cart.gocart();
	}
	
	@AfterTest
	public void quit_browser() throws InterruptedException
	{
		Thread.sleep(5000);
	//	driver.quit();
	}
	

}
