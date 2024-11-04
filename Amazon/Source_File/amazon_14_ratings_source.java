package POM_Selenium_project.POM_project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon_14_ratings_source 
{
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	public amazon_14_ratings_source(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "((//h2[@class='a-spacing-none ya-card__heading--rich a-text-normal'])[1])")
	WebElement y_yourorders;
			
	@FindBy(partialLinkText="Write a product review")
	WebElement o_orders;
	
	@FindBy(xpath = "((//button[@class='ryp__star__button'])[5])")
	WebElement r_review;
	
	public void yourorders()
	{
		y_yourorders.click();
	}
	
	public void orders()
	{
		o_orders.click();
	}
	
	public void review()
	{
		r_review.click();
	}
}
