package POM_Selenium_project.POM_project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon_profile_source 
{
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	@FindBy(linkText = "Your Account")
	WebElement your_account;
	
	@FindBy(xpath = "((//div[@data-card-identifier='AddressesAnd1Click']))")
	WebElement your_adrs_link;
	
	@FindBy(xpath = "(//div[@class='a-box-inner a-padding-extra-large'])")
	WebElement new_address;
	
	@FindBy(xpath= "((//span[text()='India'])[1])")
	WebElement c_country;
	
	@FindBy(xpath= "((//li[@class='a-dropdown-item'])[103])")
	WebElement reupdate_country;
	
	@FindBy(xpath = "(//input[@id='address-ui-widgets-enterAddressFullName'])")
	WebElement f_name;
	
	@FindBy(xpath = "(//input[@id='address-ui-widgets-enterAddressPhoneNumber'])")
	WebElement m_mobile;
	
	@FindBy(xpath = "(//input[@id='address-ui-widgets-enterAddressPostalCode'])")
	WebElement p_postal;
	
	@FindBy(xpath = "(//input[@id='address-ui-widgets-enterAddressLine1'])")
	WebElement f_flat;
	
	@FindBy(xpath = "(//input[@id='address-ui-widgets-enterAddressLine2'])")
	WebElement a_area;
	
	@FindBy(xpath = "(//input[@id='address-ui-widgets-landmark'])")
	WebElement l_landmark;
	
	@FindBy(xpath = "(//div//div//input[@name='address-ui-widgets-enterAddressCity'])")
	WebElement t_town;
	
	@FindBy(xpath = "(//span[text()='Choose a state'])")
	WebElement s_state;
	
	@FindBy(xpath = "((//li[@class='a-dropdown-item'])[256])")
	WebElement updated_state;
	
	@FindBy(xpath = "(//input[@type='checkbox'])")
	WebElement m_markthis;
	
	public void your_ac(WebDriver driver)
	{
		your_account.click();
	}

	public void address_link()
	{
		your_adrs_link.click();
	}
	
	public void name()
	{
		f_name.sendKeys("Senthil raja");
	}
	public void mobile()
	{
		m_mobile.sendKeys("8508071722");
	}
	public void postal()
	{
		p_postal.sendKeys("987654");
	}
	public void area()
	{
		a_area.sendKeys("Edappadi");
	}
	public void flat()
	{
		f_flat.sendKeys("85 G");
	}
	public void landmark()
	{
		l_landmark.sendKeys("Near Post Office");
	}
	public void town()
	{
		t_town.clear();
		t_town.sendKeys("salem");
		t_town.clear();
		t_town.sendKeys("Salem");
	}
	public void mark_this()
	{
		m_markthis.click();
	}
	
	public void country(WebDriver driver) throws InterruptedException
	{
		Actions a = new Actions(driver);
		a.moveToElement(c_country).click().perform(); 
		a.moveToElement(reupdate_country).click().perform();
	}
	
	public void address_new()
	{
		new_address.click();
	}
	
	public void state(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(s_state));
		Actions a1 = new Actions(driver);
		a1.moveToElement(s_state).click().perform();
		a1.moveToElement(updated_state).click().perform();	
	}
	
	public amazon_profile_source(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
