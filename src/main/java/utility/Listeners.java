package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends Baseclass implements ITestListener{
	public void onTestStart(ITestResult result) {
		
	}

public void onTestSuccess(ITestResult result) {
		
	}
public void onTestFailure(ITestResult result) {
	try {
		ScreenShot.clickScreenshot(result.getName(), driver);
	} catch (IOException e) {
	
		e.printStackTrace();
	}
}
public void onTestSkipped(ITestResult result) {
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
