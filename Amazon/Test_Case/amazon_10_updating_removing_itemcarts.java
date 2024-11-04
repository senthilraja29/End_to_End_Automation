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
public class amazon_10_updating_removing_itemcarts extends Data_fetching_excel
{
	WebDriver driver;
	
	
	@BeforeTest
	public void enter_browser()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test(retryAnalyzer = POM_Selenium_project.POM_project.i_retry_analyzer.class)
	public void update_remove_carts() throws EncryptedDocumentException, IOException
	{
		Data_fetching_excel ddt = new Data_fetching_excel();
		ddt.data_fetch();
		
		amazon_10_updating_removing_source updating = new amazon_10_updating_removing_source(driver);
		updating.search(input_01);
		updating.chooseproduct();
		
		updating.move_control(driver);
		updating.click_quantity(driver);
		updating.select_quantity();
		updating.addcart();
		updating.gocart();
		updating.delete();
	}

	@AfterTest
	public void quit_browser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
