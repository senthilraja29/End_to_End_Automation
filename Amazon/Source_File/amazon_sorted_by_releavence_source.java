package POM_Selenium_project.POM_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon_sorted_by_releavence_source 
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement s_searchbox;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-star-medium a-star-medium-4'])")
	WebElement c_customerreview;
	
	public void searchbox()
	{
		s_searchbox.sendKeys("Shoe" + Keys.ENTER);
	}
	
	public void customerreview()
	{	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(c_customerreview));
		Boolean customerreview = c_customerreview.isDisplayed();
		System.out.println(customerreview);
		if (c_customerreview.isDisplayed())
		{
			c_customerreview.click();
			System.out.println("Customer review is visible");
		} else {
			System.out.println("Customer review is not visible");
		}
	}
	
	public amazon_sorted_by_releavence_source(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
}
