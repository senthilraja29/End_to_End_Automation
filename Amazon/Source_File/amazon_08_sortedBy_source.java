package POM_Selenium_project.POM_project;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon_08_sortedBy_source 
{
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	@FindBy(id="twotabsearchtextbox")
	WebElement s_search;

	@FindBy(xpath="(//input[@id='p_36/range-slider_slider-item_lower-bound-slider'])")
	WebElement L_lowerslider;
	
	@FindBy(xpath = "(//input[@aria-label='Go - Submit price range'])")
	WebElement g_goclick;
	
	@FindBy(xpath= "((//i[@class='a-icon a-icon-star-medium a-star-medium-4']))")
	WebElement c_customerreview;
	
	public void search()
	{	
		s_search.sendKeys("Watch" + Keys.ENTER);	
	}
	
	public void lower_slider() {
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		int target_price = 2000;
	    int max_price = 50000;
	    int max_slider_value = 1000;

	    int modify_slider = (int) ((double) (target_price * max_slider_value) / max_price);

	    // Correct JavaScript syntax and typo
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value = " + modify_slider + "; arguments[0].dispatchEvent(new Event('input'));", L_lowerslider);

	    // Retrieve updated values
	    String updatedValue = L_lowerslider.getAttribute("value");
	    String updatedAriaValue = L_lowerslider.getAttribute("aria-valuetext");

	    System.out.println("New slider value: " + updatedValue);    
	    System.out.println("New aria-valuetext: " + updatedAriaValue);
	}

	
	public void goclick()
	{
		g_goclick.click();
	}
	
	public void customerreview()
	{
		wait.until(ExpectedConditions.elementToBeClickable(c_customerreview));
		c_customerreview.click();
	}

	public amazon_08_sortedBy_source(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
