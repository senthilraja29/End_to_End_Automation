package POM_Selenium_project.POM_project;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class amazon_ensure_product_details_source 
{
	private static final Object True = null;
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement s_search;

	@FindBy(xpath="(((//div[@class='a-section aok-relative s-image-tall-aspect'])[2]))")
	WebElement s_select_product;
	
	@FindBy(xpath="((((//input[@id='add-to-cart-button']))))")
	WebElement a_addcart;
	
	
	@FindBy(xpath="((//span[@class='a-price-whole'])[1])")
	WebElement prize_amount;
	
	@FindBy(xpath="((//span[@id='acrCustomerReviewText'])[1])")
	WebElement r_reviews;
	
	@FindBy(xpath="(//*[@id='detailBulletsWrapper_feature_div']/h2)")
	WebElement p_productdescription;
	
	
	public void search()
	{
		s_search.sendKeys("Watch for men" + Keys.ENTER);
	}
	
	public void choose_product()
	{
		s_select_product.click();
	}
	
	public void addcart()
	{	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(a_addcart));
		Boolean B_review = a_addcart.isDisplayed();
		System.out.println(B_review);
		if (a_addcart.isDisplayed()) {
		    System.out.println("Element is visible.");
		} else {
		    System.out.println("Element is not visible.");
		}
	}
	
	public void p_prizeofproduct()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(prize_amount));
		Boolean prize_amt = prize_amount.isDisplayed();
		System.out.println(prize_amt);
		if (prize_amount.isDisplayed())
		{
			System.out.println("Prize is visible.");
		} else {
			System.out.println("Prize is not visible.");
		}	
	}
	
	public void reviews()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(r_reviews));
		Boolean re_view = r_reviews.isDisplayed();
		System.out.println(re_view);
		if (r_reviews.isDisplayed())
		{
			System.out.println("Review is visible.");
		} else {
			System.out.println("Review is not visible.");
		}
	}
	
	public void product_description()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(p_productdescription));
		Boolean description = p_productdescription.isDisplayed();
		System.out.println(description);
		if (p_productdescription.isDisplayed())
		{
			System.out.println("Description is Visible");
		}	else {
			System.out.println("Description is not Visible");
		}
	}
	
	
	public amazon_ensure_product_details_source(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
