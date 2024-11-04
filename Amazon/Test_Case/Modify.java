package POM_Selenium_project.POM_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Modify {

	    WebDriver driver;
	    @Test
	    public void changeAriaValueText()
	    {
    		driver = new ChromeDriver();
    		driver.get("https://www.amazon.in/s?k=watch+for+mens&i=watches&crid=6HOLD6R9SYFB&sprefix=%2Cwatches%2C354&ref=nb_sb_ss_recent_2_0_recent");
    		driver.manage().window().maximize();
	  
    		WebElement lowerSlider = driver.findElement(By.xpath("(//div//input[@id='p_36/range-slider_slider-item_lower-bound-slider'])"));
	 	   	WebElement upperSlider = driver.findElement(By.xpath("(//div//input[@id='p_36/range-slider_slider-item_upper-bound-slider'])"));
	 	     
	 	    int maxPrice = 50000;      
	 	    int maxSliderValue = 1000;  
	 	      
	 	    //lower slider value
	 	    int lower_targetPrice = 2500; // near target price
	 	    int lower_sliderValue = (int) ((double) (lower_targetPrice) / (maxPrice) * maxSliderValue);
	 	      
	 	    System.out.println(lower_sliderValue);
	 	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	 	    js1.executeScript("arguments[0].value = " + lower_sliderValue + "; arguments[0].dispatchEvent(new Event('input'));", lowerSlider);
 
	 	//	upper slider value
	 	    int higher_targetprize = 30000;
	 	//  int higher_slidervalue = (int) ( (double) (maxPrice)/(higher_targetprize) * maxSliderValue);
	 	    int higher_slidervalue =  (int) ((double) (higher_targetprize) / (maxPrice) * maxSliderValue);
	 	    System.out.println(higher_slidervalue);
	 	      
	 	    js1.executeScript("arguments[0].value = " + (-1) + "; arguments[0].dispatchEvent(new Event('input'));" , upperSlider);
	 	     
	 	    WebElement go = driver.findElement(By.cssSelector("[aria-label='Go - Submit price range']"));
	 	    go.click();
	 	      
	 	    //verify the new values
	 	    String updatedValue = lowerSlider.getAttribute("value");
	 	    String updatedAriaValue = lowerSlider.getAttribute("aria-valuetext");
    
	 	    System.out.println("New slider value: " + updatedValue);    
	 	    System.out.println("New aria-valuetext: " + updatedAriaValue); 
	    }
}

