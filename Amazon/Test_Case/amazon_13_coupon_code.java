package POM_Selenium_project.POM_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(i_retry_analyzer.class)
public class amazon_13_coupon_code extends Data_fetching_excel
{
	WebDriver driver;
	
	@BeforeTest
	public void enter_browser()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@Test (retryAnalyzer = POM_Selenium_project.POM_project.i_retry_analyzer.class)
	public void select_checkout() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Data_fetching_excel ddt = new Data_fetching_excel();
		ddt.data_fetch();
		
		amazon_couponcode_13_source go_cart = new amazon_couponcode_13_source(driver);
		go_cart.search(input_01);
		go_cart.chooseproduct();
		
		go_cart.move_control(driver);
	//	go_cart.click_quantity(driver);
	//	go_cart.select_quantity();
		go_cart.addcart();
		go_cart.gocart();
		go_cart.proceed();
		go_cart.user_name(username);
		go_cart.pass_word(password);
		go_cart.sign_in();
		go_cart.add_ress();
		Thread.sleep(1000);
		go_cart.create_address01(f_name);
		Thread.sleep(1000);
		go_cart.create_address02(m_obile);
		Thread.sleep(1000);
		go_cart.create_address03(p_ostal);
		Thread.sleep(1000);
		go_cart.create_address04(f_lat);
		Thread.sleep(1000);
		go_cart.create_address05(a_rea);
		Thread.sleep(1000);
		go_cart.create_address05(l_andmark);
		Thread.sleep(1000);
		go_cart.create_address06(t_own);
		Thread.sleep(1000);
		go_cart.create_address08();
		go_cart.payment_method();
	//	go_cart.enter_card();
	//	go_cart.frame(driver);
	//	go_cart.card_num();
	//	go_cart.enter();
		go_cart.cash_pay(driver);
		go_cart.p_final_payment();
		go_cart.c_coupon();
	}	
	

	@AfterTest
	public void quit_browser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
