package POM_Selenium_project.POM_project;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class amazon_05_search_By_products_source 
{
	WebDriver driver;
	WebDriverWait wait;
	
	public amazon_05_search_By_products_source(WebDriver driver)
	{
		this.driver = driver;
		this.wait	= new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement s_searchbox;
	
	public void searchbox(String search_inputs)
	{
		s_searchbox.clear();
		s_searchbox.sendKeys(search_inputs + Keys.ENTER);
	}

	
}
