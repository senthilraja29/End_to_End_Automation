package POM_Selenium_project.POM_project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazon_login_source 
{
	WebDriver driver;
	String u_user;
	String p_pass;
	@FindBy(xpath="(//span[@class='nav-line-2 '])")
	WebElement hover_over;

	@FindBy(id ="ap_email")
	WebElement username;
	
	@FindBy(id = "continue")
	WebElement c_continue;
	
	@FindBy(id = "ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement sign_in;
	
	public void datas(WebDriver driver) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1  = new FileInputStream("D:\\JAva\\POM_project\\DataFetching\\Assignment_134.xlsx");
		Workbook excel = WorkbookFactory.create(f1);
		Sheet locate = excel.getSheet("amazon_login");
		
		Row r1 = locate.getRow(1);
		Cell c1 = r1.getCell(0);
		u_user = c1.toString();
		
		Row r2 = locate.getRow(1);
		Cell c2 = r2.getCell(1);
		p_pass = c2.toString();
	}
	
	public void hover(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(hover_over).click().perform();
	}
	
	public void user() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1  = new FileInputStream("D:\\JAva\\POM_project\\DataFetching\\Assignment_134.xlsx");
		Workbook excel = WorkbookFactory.create(f1);
		Sheet locate = excel.getSheet("amazon_login");
		
		Row r1 = locate.getRow(1);
		Cell c1 = r1.getCell(0);
		u_user = c1.toString();
		username.sendKeys(u_user);
	}
	
	public void cont_nue()
	{
		c_continue.click();
		
	}
	
	public void pass() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1  = new FileInputStream("D:\\JAva\\POM_project\\DataFetching\\Assignment_134.xlsx");
		Workbook excel = WorkbookFactory.create(f1);
		Sheet locate = excel.getSheet("amazon_login");
		
		Row r2 = locate.getRow(1);
		Cell c2 = r2.getCell(1);
		p_pass = c2.toString();
		
		password.sendKeys(p_pass);
	}
	
	public void incorrect_pass() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1  = new FileInputStream("D:\\JAva\\POM_project\\DataFetching\\DDT.xlsx");
		Workbook excel = WorkbookFactory.create(f1);
		Sheet locate = excel.getSheet("amazon_invalid_pass");
		
		//incorrect password
		Row r2 = locate.getRow(1);
		Cell c2 = r2.getCell(1);
		p_pass = c2.toString();
		
		password.sendKeys(p_pass);
	}
	
	public void signin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		sign_in.click();
		Thread.sleep(30000);
	}

	public amazon_login_source(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	

}
