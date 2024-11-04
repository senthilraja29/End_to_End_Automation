package POM_Selenium_project.POM_project;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class i_retry_analyzer implements IRetryAnalyzer, ITestListener
{
	int start = 0;
	@Override
	
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test Case Failed");
	}
	
	int end = 2;
	@Override
	public boolean retry(ITestResult result) 
	{
		if (start < end) 
		{
			start++;
			return true;
			
		}
		return false;
	}
	
}
