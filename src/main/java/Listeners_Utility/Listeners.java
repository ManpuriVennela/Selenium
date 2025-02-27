package Listeners_Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//import org.testng.internal.annotations.IListeners;

public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("0n  test  start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on test success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on test finish");
	}
}


