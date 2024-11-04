package POM_Selenium_project.POM_project;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazon_15_till_cart_source 
{
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="(//input[@id='twotabsearchtextbox'])")
	WebElement s_search;
	
	@FindBy(xpath = "((//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1])")
	WebElement c_chooseproduct;
	
	@FindBy(xpath="(//span[@class='a-button-text a-declarative']/span[@class='a-dropdown-label'])")
	WebElement q_quantity;
	
	@FindBy(xpath="(//select[@name='quantity'])")
	WebElement s_selectquantity;
	
	@FindBy(xpath="(//input[@id='add-to-cart-button'])")
	WebElement add_cart;
	
	@FindBy(partialLinkText = "Go to Cart")
	WebElement g_gocart;
	
	public void search(String input_02)
	{
		wait.until(ExpectedConditions.elementToBeClickable(s_search));
		s_search.sendKeys(input_02 + Keys.ENTER);
	}	
	
	public void chooseproduct()
	{
		c_chooseproduct.click();
	}
	
	public void move_element()
	{
		Set<String> elements = driver.getWindowHandles();
		Iterator<String> webs =	elements.iterator();
		String Web1 = webs.next();
		String Web2 = webs.next();
		
		driver.close();
		driver.switchTo().window(Web2);
	}

	public void quantity()
	{
		q_quantity.click();
	}
	
	public void selectquantity()
	{
		Actions a = new Actions(driver);
		a.moveToElement(s_selectquantity).click().perform();
		Select s1 = new Select(s_selectquantity);
		s1.selectByIndex(3);
		
	}
	public void add_cart()
	{
		wait.until(ExpectedConditions.elementToBeClickable(add_cart));
		add_cart.click();
	}
	public void gocart()
	{
		g_gocart.click();
	}
	
	public amazon_15_till_cart_source(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait =	new WebDriverWait(driver, Duration.ofSeconds(20));
	}
}
