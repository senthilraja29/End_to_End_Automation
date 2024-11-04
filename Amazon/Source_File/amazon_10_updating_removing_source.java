package POM_Selenium_project.POM_project;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon_10_updating_removing_source
{
	WebDriver driver;
	WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	@FindBy(id="twotabsearchtextbox")
	WebElement s_search;
	
	@FindBy(xpath = "((//div[@class='a-section a-spacing-base a-text-center'])[1])")
	WebElement c_chooseproduct;
	
	@FindBy(xpath="(//span[@class='a-button-text a-declarative']/span[@class='a-dropdown-label'])")
	WebElement q_quantity;
	
	@FindBy(xpath="(//li[@aria-labelledby='quantity_1'])")
	WebElement s_selectquantity;
	
	@FindBy(xpath="(//input[@id='add-to-cart-button'])")
	WebElement add_cart;
	
	@FindBy(partialLinkText = "Go to Cart")
	WebElement g_gocart;
    
	@FindBy(xpath="(//input[@value='Delete'])")
	WebElement d_delete;
	
	public void search(String input_01)
	{
		wait.until(ExpectedConditions.elementToBeClickable(s_search));
		s_search.sendKeys(input_01 + Keys.ENTER);
	}
	
	public void chooseproduct()
	{
		wait.until(ExpectedConditions.elementToBeClickable(s_search));
		c_chooseproduct.click();
	}
		
	public void move_control(WebDriver driver)
	{
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> no_window = windows.iterator();
		String window1  = no_window.next();
		String window2 = no_window.next();
		
		System.out.println(window1);
		System.out.println(window2);
		
		driver.close();
		driver.switchTo().window(window2);
	}
	
	public void click_quantity(WebDriver driver)
	{	
		wait.until(ExpectedConditions.elementToBeClickable(q_quantity));
		q_quantity.click();
	}
	
	public void select_quantity()
	{
		s_selectquantity.click();
	}
	
	
	public void addcart()
	{
		add_cart.click();
	}
	
	public void gocart()
	{
		g_gocart.click();
	}
	
	public void delete()
	{
		d_delete.click();
	}
	
	public amazon_10_updating_removing_source(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}