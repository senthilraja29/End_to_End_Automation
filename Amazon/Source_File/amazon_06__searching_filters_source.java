package POM_Selenium_project.POM_project;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon_06__searching_filters_source 
{
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;

	@FindBy(linkText = "Today's Deals")
	WebElement D_Deals;
	
	@FindBy(linkText = "10% Off or more")
	WebElement d_discount;
	
	@FindBy(linkText = "Last 30 days")
	WebElement n_newarrivals;
	
	public void search_box()
	{
		searchbox.sendKeys("Watch for mens" + Keys.ENTER);
	}

	public void Deals()
	{
		wait.until(ExpectedConditions.elementToBeClickable(D_Deals));
		D_Deals.click();
	}
	
	public void discount()
	{
		wait.until(ExpectedConditions.elementToBeClickable(d_discount));
		d_discount.click();
	}
	
	public void newarrivals()
	{
		wait.until(ExpectedConditions.elementToBeClickable(n_newarrivals));
		n_newarrivals.click();
	}
	
	public amazon_06__searching_filters_source(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
