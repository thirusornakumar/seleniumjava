package testlistenerexample;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class testlistenerexample implements ITestListener {
	

	@Override  
	public void onTestStart(ITestResult result) {  
     System.out.println("Inside - Test start method");
	}  
	  
  
	  
	@Override  
	public void onTestFailure(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("Failure of test cases and its details are : "+result.getName());  
	} 
	
	  
	@Override  
	public void onTestSuccess(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("Pass of test cases and its details are : "+result.getName());  
	}  
	  
	@Override  
	public void onTestSkipped(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("Skip of test cases and its details are : "+result.getName());  
	}  
	  

	  

	

}
