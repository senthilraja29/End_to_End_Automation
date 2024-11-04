package POM_Selenium_project.POM_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebook_registration_testcase 
{
	WebDriver driver;
	@Test
	public void facebook_registration()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		facebook_login_source create = new facebook_login_source(driver);
		create.create_new_ac();
		create.f_name();
		create.l_name();
		create.d_day(driver);
		create.m_month(driver);
		create.y_year(driver);
		create.g_gender(driver);
		create.registration_email();
		create.registration_password();
	}
}
