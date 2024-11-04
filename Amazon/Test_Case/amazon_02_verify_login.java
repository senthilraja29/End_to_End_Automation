package POM_Selenium_project.POM_project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(i_retry_analyzer.class)
public class amazon_02_verify_login  
{

	WebDriver driver;
	
	@Test(retryAnalyzer = POM_Selenium_project.POM_project.i_retry_analyzer.class)
	public void verify_login_testcase() throws EncryptedDocumentException, IOException, InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		amazon_login_source login = new amazon_login_source(driver);
		login.hover(driver);
		login.user();
		login.cont_nue();
		login.pass();
		login.signin();
	}

	@AfterTest
	public void browser_quit() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
