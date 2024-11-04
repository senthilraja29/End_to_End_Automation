package POM_Selenium_project.POM_project;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class amazon_13_iretryanalyser implements IRetryAnalyzer
{
	int start = 0;
	int stop = 3;
	@Override
	public boolean retry(ITestResult result) 
	{
		if(start<stop)
		{
			start++;
			return true;
		}
		return false;
	}

}
