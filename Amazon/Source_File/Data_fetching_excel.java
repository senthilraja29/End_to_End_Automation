package POM_Selenium_project.POM_project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.Test;

public class Data_fetching_excel 
{
	String input_01;
	String input_02;
	String username;
	String password;
	String f_name;	
	double m_obile;
	String p_ostal; 	
	String f_lat;		
	String a_rea;		
	String l_andmark;	
	String t_own;
	String p_product;
	
	@Test
	public void data_fetch() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream("D:\\JAva\\POM_project\\DataFetching\\numbertotextconvert.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("Sheet3");
		input_01 = s1.getRow(0).getCell(0).toString();
		System.out.println(input_01);
		
		Sheet s2 = w1.getSheet("Sheet1");
		username = s2.getRow(1).getCell(0).toString();
	//	System.out.println(username);
		password = s2.getRow(1).getCell(1).toString();
	//	System.out.println(password);
		
		
		Sheet s3 = w1.getSheet("Add");
		f_name		= s3.getRow(1).getCell(1).toString();
		m_obile		= s3.getRow(2).getCell(1).getNumericCellValue();
		p_ostal 	= s3.getRow(3).getCell(1).toString();
		f_lat		= s3.getRow(4).getCell(1).toString();
		a_rea		= s3.getRow(5).getCell(1).toString();
		l_andmark	= s3.getRow(6).getCell(1).toString();
		t_own		= s3.getRow(7).getCell(1).toString();
	}
	
	
	
	@Test
	public void search() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream("D:\\JAva\\POM_project\\DataFetching\\DDT.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("search");
		
		input_02 = s1.getRow(0).getCell(0).toString();
		System.out.println("search inputs");
		System.out.println(input_02);
	}
}
