package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import reports.ExtentManager;

public class TestListeners  implements ITestListener{
	
	
	private static ExtentReports extent = ExtentManager.getInstance();
	
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test suite started");
		
	}
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Started" + result.getName());
		
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test  successful" + result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test  successful" + result.getName());}
	
	
	public void onTestFinish(ITestContext context) {
		extent.flush();
		System.out.println("========== TEST SUITE FINISHED ==========");
		
	}
	

}
