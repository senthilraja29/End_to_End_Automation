package POM_Selenium_project.POM_project;

import java.text.DecimalFormat;
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

public class amazon_couponcode_13_source 
{
	WebDriver driver;
	WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	@FindBy(id="twotabsearchtextbox")
	WebElement s_search;
	
	@FindBy(xpath="(((//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]))")
	WebElement c_chooseproduct;

	@FindBy(xpath="(//span[@class='a-button-text a-declarative']/span[@class='a-dropdown-label'])")
	WebElement q_quantity;
	
	@FindBy(xpath="(//li[@aria-labelledby='quantity_1'])")
	WebElement s_selectquantity;
	
	@FindBy(xpath="(//input[@id='add-to-cart-button'])")
	WebElement add_cart;
	
	@FindBy(partialLinkText = "Go to Cart")
	WebElement g_gocart;
    
	@FindBy(xpath="(//input[@name='proceedToRetailCheckout'])")
	WebElement proceed_buy;
	
	@FindBy(id="ap_email")
	WebElement u_username;
	
	@FindBy(id="continue")
	WebElement c_continue;
	
	@FindBy(id="ap_password")
	WebElement p_password;
	
	@FindBy(id="signInSubmit")
	WebElement s_signin;
	
	@FindBy(partialLinkText = "Add a new address")
	WebElement new_address;
	
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement first_name;
	
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement m_mobile;
	
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement p_postal;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement f_flat;
	
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	WebElement a_area;
	
	@FindBy(id="address-ui-widgets-landmark")
	WebElement l_landmark;
	
	@FindBy(id="address-ui-widgets-enterAddressCity")
	WebElement t_town;
	
	@FindBy(xpath="(((//span[@data-action='a-dropdown-button'])[2]))")
	WebElement s_state;
	
	@FindBy(partialLinkText ="TAMIL NADU")
	WebElement click_state;
	
	@FindBy(xpath="(((//input[@type='submit'])[6]))")
	WebElement u_usingthis;
	
	@FindBy(xpath="(((//input[@name='ppw-instrumentRowSelection'])[2]))")
	WebElement p_payment;
	
	@FindBy(partialLinkText = "Enter card details")
	WebElement e_entercarddetails;
	
	@FindBy(xpath="(//iframe[@name='ApxSecureIframe'])")
	WebElement iframe_location;
	
	@FindBy(xpath="(//input[@name='addCreditCardNumber'])")
	WebElement c_crednumber;
	
	@FindBy(xpath="((//input[@name='ppw-widgetEvent:AddCreditCardEvent']))")
	WebElement e_enter;
	
	@FindBy(xpath="(//button[@name='ppw-widgetEvent:CancelAddCreditCardEvent'])")
	WebElement c_cancel;
	
	@FindBy(xpath="//*[text()='Cash on Delivery/Pay on Delivery']")
	WebElement payment_frame;
	
	@FindBy(xpath="(((//input[@name='ppw-instrumentRowSelection'])[6]))")
	WebElement p_cashonpayment;
	
	@FindBy(xpath="((//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent'])[1])")
	WebElement pre_final_payment;
	
	@FindBy(xpath="((//input[@id='spc-gcpromoinput']))")
	WebElement c_couponcode;
	
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
	
	public void proceed()
	{
		proceed_buy.click();
	}
	
	public void user_name(String user)
	{
		wait.until(ExpectedConditions.elementToBeClickable(u_username));
		u_username.sendKeys(user);
		c_continue.click();
	}
	
	public void pass_word(String pass)
	{
		wait.until(ExpectedConditions.elementToBeClickable(p_password));
		p_password.sendKeys(pass);
	}
	
	public void sign_in()
	{
		s_signin.click();
	}
	
	public void add_ress()
	{
		new_address.click();
	}
	
	public void create_address01(String f_name)
	{
		first_name.sendKeys(f_name);
	}
	public void create_address02(double m_obile)
	{
		DecimalFormat d = new DecimalFormat("#.##");
		String mobile =  d.format(m_obile);
		m_mobile.sendKeys(mobile);
	}
	public void create_address03(String p_ostal)
	{
		p_postal.sendKeys(p_ostal);
	}
	public void create_address04(String f_lat)
	{
		f_flat.sendKeys(f_lat);
	}
	public void create_address05(String a_rea)
	{
		a_area.sendKeys(a_rea);
	}
	public void create_address06(String l_andmark)
	{
		l_landmark.sendKeys(l_andmark);
	}
	public void create_address07(String t_own)
	{
		t_town.sendKeys(t_own);
		s_state.click();
	}
	public void create_address08()
	{
		u_usingthis.click();
	}
	public void payment_method()
	{
		wait.until(ExpectedConditions.elementToBeClickable(p_payment));
		p_payment.click();
	}
	public void enter_card()
	{
		wait.until(ExpectedConditions.elementToBeClickable(e_entercarddetails));
		e_entercarddetails.click();
	}
	public void frame(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(iframe_location));
		driver.switchTo().frame(iframe_location);
	}
	public void card_num()
	{
		c_crednumber.sendKeys("9876543210123456");
	}
	
	public void enter() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(e_enter));
		e_enter.click();
		Thread.sleep(5000);
		c_cancel.click();
		
	}
	
	public void cash_pay(WebDriver driver)
	{
		driver.switchTo().parentFrame();
		//	driver.switchTo().frame(payment_frame);
		wait.until(ExpectedConditions.elementToBeClickable(p_cashonpayment));
		p_cashonpayment.click();
	}
	public void p_final_payment()
	{
		pre_final_payment.click();
	}
	public void c_coupon()
	{
		wait.until(ExpectedConditions.elementToBeClickable(c_couponcode));
		c_couponcode.sendKeys("bws8gb5aqw");
	}
	
	
	public amazon_couponcode_13_source(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
