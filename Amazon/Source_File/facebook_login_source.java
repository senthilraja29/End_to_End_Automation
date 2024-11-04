package POM_Selenium_project.POM_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class facebook_login_source 
{
	WebDriver driver;
	// Step 1 - Find the location and assign the web element
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(xpath="(//button[@name='login'])")
	WebElement loginbutton;
	
	@FindBy(xpath="((//a[@role='button'])[2])")
	WebElement createnewac;
	
	@FindBy(xpath="(//input[@name='firstname'])")
	WebElement firstname;
	
	@FindBy(xpath="(//input[@name='lastname'])")
	WebElement lastname;
	
	@FindBy(xpath="(//select[@id='day'])")
	WebElement day;
	
	@FindBy(xpath="(//select[@id='month'])")
	WebElement month;
	
	@FindBy(xpath="(//select[@id='year'])")
	WebElement year;
	
	@FindBy(xpath="(//input[@value='2'])")
	WebElement gender;
	
	@FindBy(xpath="(//input[@name='reg_email__'])")
	WebElement req_email;
	
	@FindBy(xpath=("(//input[@type='password'])"))
	WebElement req_password;
	
	// Step 2 - Send-keys
	public void un()
		{
			username.sendKeys("abcdef@gmail.com");
		}
	public void pwd()
		{
			password.sendKeys("1234567890");
		}
	public void login()
		{
			loginbutton.click();
		}

	public void create_new_ac()
		{
			createnewac.click();
		}
	
	public void f_name()
		{
			firstname.sendKeys("Senthil");
		}
	
	public void l_name()
		{
			lastname.sendKeys("Raja");
		}
	
	public void d_day(WebDriver driver)
		{
			Select d1 =new Select(day);
	//		d1.selectByValue("9");
			d1.selectByVisibleText("9");
		}
	
	public void m_month(WebDriver driver)
		{
			Select m1 =new Select(month);
			m1.selectByVisibleText("Apr");
		}
	
	public void y_year(WebDriver driver)
		{
			Select y1 = new Select(year);
			y1.selectByVisibleText("1996");
		}
	
	public void g_gender(WebDriver driver)
		{
			gender.click();
		//	Actions a1 = new Actions(driver);
		//	a1.click(gender);
		}
	
	public void registration_email()
		{
			req_email.sendKeys("senthil.testingqa@gmail.com");
		}

	public void registration_password()
		{
			req_password.sendKeys("senthil@123");
		}
	
	
	
	// Step 3
	public facebook_login_source(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
