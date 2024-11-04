package POM_Selenium_project.POM_project;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon_added_to_shopingcart_source 
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement s_search;
	
	@FindBy(xpath="(((//div[@class='a-section aok-relative s-image-tall-aspect'])[2]))")
	WebElement s_select_product;
	
	@FindBy(xpath="((//input[@id='add-to-cart-button']))")
	WebElement a_Add_cart;
	
	@FindBy(xpath="(//span[contains(text(),'Add Protection')])")
	WebElement a_add_protection;
	
	public void search()
	{
		s_search.sendKeys("Shoes" + Keys.ENTER);
	}
	
	public void choose_product()
	{
		s_select_product.click();
	}
	
	public void Add_cart()
	{
		a_Add_cart.click();
	}
	
	public void add_protection()
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(a_add_protection));
		a_add_protection.click();
	}
	
	public amazon_added_to_shopingcart_source(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
