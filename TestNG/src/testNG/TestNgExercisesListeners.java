package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestNgExercisesListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test is going to execute");
	}

	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testi is failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Actually test was skipped "+"False method");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Before everything");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("after everything");
		
	}
	

	}
	
	

