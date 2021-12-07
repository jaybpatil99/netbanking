package MyMavenProject2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListenerImplementClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("Test "+result.getName()+" is started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test "+result.getName()+" is successfully executed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test "+result.getName()+" is failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test "+result.getName()+" is skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Testing is started");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Testing is finished successfully");
		
	}

}
