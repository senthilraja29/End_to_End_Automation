package POM_Selenium_project.POM_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class amazon_registration_source 
{
	WebDriver driver;
	// Locate and name the elements
	@FindBy(linkText="Start here.")		WebElement reg_link; 
	
	@FindBy(id="ap_customer_name")		WebElement user_name;
	
	@FindBy(id="ap_phone_number")		WebElement Mobile;
	
	@FindBy(id="ap_password")			WebElement password;		
	
	@FindBy(xpath="(//span[@data-action='a-dropdown-button'])") WebElement country;
	
	@FindBy(xpath="((//li[@class='a-dropdown-item'])[94])") WebElement code;
	
	// Perform Actions
	public void registr_link()
		{
			reg_link.click();
		}
	
	public void customer_name()
		{
			user_name.sendKeys("Senthil Raja ");
		}
	
	public void mobile()
		{
			Mobile.sendKeys("9876543210");
		}
	
	public void pass()
		{
			password.sendKeys("Amazon@123");
		}
	
	public void country_option()
		{
			country.click();
		}
	
	public void country_code()
		{
				code.click();
		}
	
	//Constructor to invoke the non static elements
	public amazon_registration_source(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
